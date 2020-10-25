package org.tzi.use.common;
import java.util.*;
import java.io.*;
import uran.formula.*;
import uran.formula.value.*;
import uran.formula.type.*;
import uran.formula.smt2.*;
import uran.formula.type.*;
import uran.solver.*;
import org.tzi.use.query.setup.*;
import org.tzi.use.uran.visitor.VisitorException;
import org.tzi.use.uml.mm.*;
import org.tzi.use.uml.mm.MMultiplicity.Range;
import org.tzi.use.uml.ocl.type.EnumType;
import org.tzi.use.query.io.*;
import org.tzi.use.uran.weight.Flag;

public class FOLTranslator extends Thread implements ITranslator {
    private FeatureSet features;
    private ColorPrint out;
    private MModel model;
	private FunctionFactory factory = new FunctionFactory(1024,0.75f);
    private List<AbstractFormula> formulas = new ArrayList<AbstractFormula>();
    private HashMap <EnumType, Integer> enum_size = new HashMap<EnumType, Integer>();
    private HashMap <String, Set<MAssociation>> assoc_table = new HashMap<String, Set<MAssociation>>();
    private final String OBJ="obj_";
	private final String TYPE="type_";
	private final String REL="rel_";
	private final String CON="container_";
	private final String excludes_str="oclExcludes";
	private final String includes_str="oclIncludes";
	private final String objat="ObjAt";
    private final String select_str="oclSelect";
    private String type_str=(TYPE+""+UUID.randomUUID()).replace('-','_');
    private String obj_str=(OBJ+""+UUID.randomUUID()).replace('-','_');
    private String con_str=CON;//(CON+""+UUID.randomUUID()).replace('-','_');
    private String car_str="Cardinality";//("cardinality"+UUID.randomUUID()).replace('-','_');
    private String rel_str=(REL+UUID.randomUUID()).replace('-','_');
	private Function conFun = factory.createFunction(con_str,new Int(),new Int());
	private Function cardFun = factory.createFunction(car_str,new Int(),new Int());	
	private Function excludesFun = factory.createFunction(excludes_str, new Int(), new Int(), new Bool()); 
	private Function includesFun = factory.createFunction(includes_str, new Int(), new Int(), new Bool());
    private Function selectFun = factory.createFunction(select_str, new Int(), new Bool(), new Int());
    private Function objatFun = factory.createFunction(objat,new Int(),new Int(), new Int());
    private String Z3="";
	private String Z3_STD_IN=" -in ";
	private String SMTSolver="";
    private static int pid=1;
    private String file="";
	private Settings settings;
	private static int cores=0;

    public FOLTranslator(FeatureSet features, MModel model, Settings settings){
        this.features = features;
		this.model = model;
		this.settings = settings;
        out = new ColorPrint();
        //Function f1 = factory.createFunction(obj_str,new Int(), new Int());
        //model.processWithVisitor(modelVisitor);
		extraFunctions();
    }

    public FOLTranslator(FeatureSet features, MModel model, String file,Settings settings){
        this(features,model,settings);
		this.file = file;
    }

	private void extraFunctions(){
		Function fun = factory.createFunction(obj_str,new Int(), new Int());
	}

	public void addExcludesAxiom(){
		Variable x = new Variable("x",new Int());
		Variable y = new Variable("y",new Int());
		Variable i = new Variable("i", new Int());
		AbstractFormula f1 = new EqFormula(objatFun.apply(conFun.apply(getObjFunction().apply(x)),i), getObjFunction().apply(y));
		AbstractFormula axiom = new QuantifiedFormula (Quantifier.FORALL, new Decls(x,y),
				new NegFormula(new QuantifiedFormula(Quantifier.EXISTS, new Decls(i),f1)));
		formulas.add(axiom);
	}

	public void addIncludesAxiom(){
		Variable x = new Variable("x",new Int());
		Variable y = new Variable("y",new Int());
		Variable i = new Variable("i", new Int());
		AbstractFormula f1 = new EqFormula(objatFun.apply(conFun.apply(getObjFunction().apply(x)),i), getObjFunction().apply(y));
		AbstractFormula axiom = new QuantifiedFormula (Quantifier.FORALL, new Decls(x,y),new QuantifiedFormula(Quantifier.EXISTS, new Decls(i),f1));

		formulas.add(axiom);
	}

    public void TranslateEnum(EnumType enumType) {
		Iterator<String> it = enumType.literals();
		int k=-1;
		
		while (it.hasNext()) { 
			it.next();
			k++;
		}
		// skip an empty enum type
		if (k==-1) return;
		Function f = factory.createFunction(enumType.name(), new Int(), new Int());
		enum_size.put(enumType, k+1);
	}

    public void TranslateClass(MClass cls){
        String full_type_name=type_str+"_"+cls.name();
        Function d = factory.createFunction(full_type_name, new Int(), new Bool());
        
    }

    /* create this function on the fly */ 
    public Function TranslateClass (String name){
        String full_type_name=type_str+"_"+name;
        Function d = factory.createFunction(full_type_name, new Int(), new Bool());
        return d;
    }

    public void TranslateAttribute(MAttribute attr){
        org.tzi.use.uml.ocl.type.Type t = attr.type();
        AbstractFormula f=null;
        if (t.isTypeOfBoolean())
                f = factory.createFunction(attr.owner().name().toLowerCase()+"_"+attr.name(),new Int(), new Bool());
			else if (attr.type().isTypeOfInteger())
                f = factory.createFunction(attr.owner().name().toLowerCase()+"_"+attr.name(),new Int(), new Int());
			else if (attr.type().isTypeOfEnum()){
                /*Function enumFun = factory.createFunction(attr.owner().name().toLowerCase()+"_"+
                    ((EnumType)attr.type()).name(), new Int(), new Int());*/
                Function enumFun = factory.funLookup( ((EnumType)attr.type()).name());
                if (enumFun==null){out.println(attr.name()+" cannot be found.",Color.RED);return;}
                Function typeFun = getType(attr.owner().name());
                if (typeFun==null) {out.println("Type "+attr.owner().name()+ " cannot be found.",Color.RED); return;}
                int enum_size = getEnumSize((EnumType)attr.type());
				Variable p = new Variable("p", new Int());
				formulas.add(new QuantifiedFormula(Quantifier.FORALL, new Decls(p), 
							new ImpliesFormula(typeFun.apply(p),  
							new AndFormula(
								new ComparisonFormula(Connective.GEQ, enumFun.apply(getObjFunction().apply(p)), new NumLiteral(0)),
								new ComparisonFormula(Connective.LEQ, enumFun.apply(getObjFunction().apply(p)), 
								new NumLiteral(enum_size)))
							)));
            }
    }

    private Function getType(String name){
        return factory.funLookup(type_str+"_"+name);
    }

    private int getEnumSize(EnumType enumType){
        Iterator<String> it = enumType.literals();
		int k=-1;
		
		while (it.hasNext()) { 
			it.next();
			k++;
        }

        return k;
    }    

    public void TranslateAssociation(MAssociation assoc){
        Function fun = factory.createFunction(rel_str+"_"+assoc.name(), new Int(), new Int(), new Bool());
        Variable a = new Variable("a", new Int());
		Variable b = new Variable("b", new Int());
		AbstractFormula t1 = fun.apply(getObjFunction().apply(a), getObjFunction().apply(b));
        AbstractFormula t2 = fun.apply(getObjFunction().apply(b), getObjFunction().apply(a));
    }

	public AbstractFormula TranslateInvariant (MClassInvariant inv){
        OclExprTranslator visitor = new OclExprTranslator(this,Flag.QUIET);
        AbstractFormula formula = inv.bodyExpression().accept(visitor);
        //out.println(formula.toSMT2(),Color.RED);
        return formula;
    }

    /* generate formulas here. */
    public void generate(){
        int l=0;
        for (EnumType e : this.model.enumTypes())
            TranslateEnum (e);

        for (MClass cls:this.features.classes())
            TranslateClass (cls);

        for (MAttribute attr:this.features.attributes())
            TranslateAttribute(attr);

        for (MAssociation assoc:this.features.associations()){
            TranslateAssociation(assoc);
            formulas.add(computeAEM(assoc));
        }

        for (MClassInvariant inv:this.features.invariants()){
            formulas.add(new LabeledFormula(TranslateInvariant(inv),"l"+(l++)));
        }

        /* add non empty class diagram axioms */ 
        addNonemptyAxioms();

        if (this.file.length()==0)
            toSMT2(this.file="FOL",formulas,factory);
        else
            toSMT2(this.file,formulas,factory);
    }

    private void toSMT2(String filename, List<AbstractFormula> formulas, FunctionFactory factory){
		
        long current = System.currentTimeMillis();
        String str = System.getProperty("os.name");
        out.println(filename+" ("+str+") solving start...",Color.YELLOW);

		SMT2Writer writer = new SMT2Writer("./"+filename+".smt2",factory,formulas);
		
		this.SMTSolver = this.settings.SolverPath();
		SolverLauncher solver;
		
		switch (this.settings.solver()){
			case Z3:
				solver = new SolverLauncher(this.SMTSolver+Z3_STD_IN,writer,SolverLauncher.PRODUCE_UNSAT_CORES);
				break;
			/*case CVC4:*/
				/* use CVC4 SMT solver 
				break;*/

			default:
				/* no suitable SMT solver available */
				return;
		}

        Result result = solver.launch();
		long timeUsed = System.currentTimeMillis()-current;
		
        if (result==Result.UNSAT){
			System.out.println("Solving Finished from "+this.file+".");
            System.out.println(result.toString());
            System.out.print("cores: {");
            for (AbstractFormula formula : solver.cores())
                System.out.print( ((LabeledFormula) formula).label()+" ");
            System.out.println("}");
			System.out.println("Time elapsed:"+timeUsed+" ms \n");
			this.cores++;
            /*out.println("Solving Finished from "+this.file+".",Color.BLUE);
            out.println(result.toString(),Color.RED);
            out.print("cores: {",Color.RED);
			for (AbstractFormula formula : solver.cores())
				out.print( ((LabeledFormula) formula).label()+" ",Color.RED);
            out.println("}",Color.RED);
            out.println("Time elapsed:"+timeUsed+" ms \n", Color.BLUE);*/
        }
        else{
			System.out.println("Solving Finished from "+this.file+".");
            System.out.println(result.toString());
            System.out.println("Time elapsed:"+timeUsed+" ms \n");
            /*out.println("Solving Finished from "+this.file+".",Color.GREEN);
            out.println(result.toString(),Color.GREEN);
            out.println("Time elapsed:"+timeUsed+" ms \n", Color.GREEN);*/
		}
    }
	
    private void addNonemptyAxioms(){
        List<AbstractFormula> tmp = new ArrayList<AbstractFormula>();

        for (MClass cls : features.classes()){
            Variable var = new Variable ("o", new Int());
				if (!cls.isAbstract()) tmp.add (getTypeFunction(cls.name()).apply(getObjFunction().apply(var)));
				for (MClass c : cls.allParents()) if (!c.isAbstract()) tmp.add (getTypeFunction(c.name()).apply(getObjFunction().apply(var)));
				if (tmp.size()>0){
					QuantifiedFormula quan_formula = (tmp.size() > 1) ? 
						new QuantifiedFormula (Quantifier.EXISTS, new Decls(var), 
								new AndFormula().merge(tmp.toArray(new AbstractFormula[tmp.size()])))
						:
						new QuantifiedFormula (Quantifier.EXISTS, new Decls(var), tmp.get(0));

					formulas.add(quan_formula);
				}
        }
    }

    public int getEnumValueIndex(EnumType e, String str){
		int k=-1;
		Iterator<String> it = e.literals();
		
		while (it.hasNext()){
			k++;
			String s = (String)it.next();
			if (s.equals(str)) return k;
		}

		return -1;
	}

    public void run(){
        //Thread t = Thread.currentThread();
		//out.println(t.getName(),Color.BLUE);
		//synchronized(this) {
			generate();
		//}
    }
	public static void reset(){cores=0;}
	public static int cores(){return cores;}
    public Function getObjFunction(){return factory.funLookup(obj_str);}
    public Function getTypeFunction(String name){
            Function f = factory.funLookup(type_str+"_"+name);
            return (f==null) ? TranslateClass(name) : f;
    }
    public Function getEnumFunction(EnumType e){return factory.funLookup(e.name());}
    public Function getConFun(){return conFun;}
    public Function getCardFun(){return cardFun;}
    public Function getExcludesFunction(){return excludesFun;}
    public Function getSelectFunction(){return selectFun;}
    public Function getRelFunction(String name){return factory.funLookup(rel_str+"_"+name);}
    public FunctionFactory getFactory(){return factory;}

    private void computeSet(MAssociation e, MClass enda, MClass endb){
		Set<MAssociation> set = assoc_table.get(enda.name()+endb.name());
		if (set.size()<=0) return;
		boolean flag = true;
		for (MAssociation a : set){
			flag=true;
			if (a!=e){
				List<MAssociationEnd> ends = a.associationEnds();
				if (ends.size()==2){
					List<Range> ranges = ends.get(0).multiplicity().getRanges();
					for (Range r : ranges) if (r.getLower()==0 || r.getLower()==-1) flag=false;
						if (flag){ 
							ranges = ends.get(1).multiplicity().getRanges();
							for (Range r: ranges) if (r.getLower()==0 || r.getLower()==-1) flag =false;
						}

					/* Very Important formula generation. */
					/* Now we DO generate additional formulas stating that if assoc_a exists, this means it also imples assoc_b */
					/* In this case, it is also possible to formulate an equality formula.*/
					if (flag){
						Function f1 = getRelFunction(e.name());
						Function f2 = getRelFunction(a.name());
						Variable vara = new Variable("a", new Int());
						Variable varb = new Variable("b", new Int());
						Function type1 = getTypeFunction(enda.name());
						Function type2 = getTypeFunction(endb.name());
						AbstractFormula rel1 = new AndFormula (f1.apply(getObjFunction().apply(vara),getObjFunction().apply(varb)),
								new AndFormula(type1.apply(getObjFunction().apply(vara)), type2.apply(getObjFunction().apply(varb))));
						AbstractFormula rel2 = new AndFormula (f2.apply(getObjFunction().apply(vara),getObjFunction().apply(varb)),
								new AndFormula(type1.apply(getObjFunction().apply(vara)), type2.apply(getObjFunction().apply(varb))));

						AbstractFormula enable_formula = f1.apply(getObjFunction().apply(vara),getObjFunction().apply(varb));
						AbstractFormula enable_type = new AndFormula(type1.apply(getObjFunction().apply(vara)), type2.apply(getObjFunction().apply(varb)));
						formulas.add (new QuantifiedFormula(Quantifier.FORALL, new Decls(vara,varb), new ImpliesFormula(rel1, rel2)));
						
					}
				}// end of binary association
			}// end of outter if
		}//end of for
		
	}

    private AbstractFormula computeAEM(MAssociation e){
		List<MAssociationEnd> ends = e.associationEnds();			
		List<Integer> lista = new ArrayList<Integer>();
		List<Integer> listb = new ArrayList<Integer>();
		List<AbstractFormula> assoc_formulas = new ArrayList<AbstractFormula>();
		QuantifiedFormula qformula1=null;
		QuantifiedFormula qformula2=null;
		AbstractFormula formula = null;
		boolean flaga=true;
		boolean flagb=true;
		Variable var_enda;
		Variable var_endb;
		
		if (ends.size()==2){
			

			var_enda = new Variable("x",new Int());
			var_endb = new Variable("y", new Int());
			//qformula2 = new QuantifiedFormula(Quantifier.FORALL, new Decls(var_endb),null);
			qformula1 = new QuantifiedFormula(Quantifier.FORALL, new Decls(var_enda, var_endb), qformula2);
			
			MAssociationEnd enda = ends.get(0);
			List<Range> ranges = enda.multiplicity().getRanges();

			/*if (factory.conLookup(enda.cls().name()) != null )
				var_enda = factory.conLookup(enda.cls().name());
			else
				var_enda = factory.createConstant(enda.cls().name(),new Int());*/
			
			//formulas.add(new EqFormula(var_enda, new NumLiteral(clsType.get(enda.cls()))));	
			for (Range r : ranges){
				lista.add(r.getLower());
				lista.add(r.getUpper());
			}

			MAssociationEnd endb = ends.get(1);
			ranges = endb.multiplicity().getRanges();
			/*if (factory.conLookup(endb.cls().name())!=null)
				var_endb = factory.conLookup(endb.cls().name());
			else
				var_endb = factory.createConstant(endb.cls().name(),new Int());*/

			//formulas.add(new EqFormula(var_endb, new NumLiteral(clsType.get(endb.cls()))));

			if (!assoc_table.containsKey(enda.cls().name()+endb.cls().name())){
				Set<MAssociation> set = new HashSet<MAssociation>();
				set.add(e);
				assoc_table.put(enda.cls().name()+endb.cls().name(),set);
			}else{
				Set<MAssociation> set = assoc_table.get(enda.cls().name()+endb.cls().name());
				set.add(e);
				assoc_table.put(enda.cls().name()+endb.cls().name(),set);
			}

			for (Range r : ranges){
				listb.add(r.getLower());
				listb.add(r.getUpper());
			}
			
			for (int i=0;i<lista.size();i++){
				int a = lista.get(i);
				for (int j=0;j<listb.size();j++){
					int b = listb.get(j);
					/*if (lista.get(i)==0 || listb.get(j)==0){
						assoc_formulas.add(
							new AndFormula(
								new EqFormula(cardFun.apply(conFun.apply(var_enda)), new NumLiteral(a)),
								new EqFormula(cardFun.apply(conFun.apply(var_endb)), new NumLiteral(b)))
						);
					}*/
					if (a==-1 || b==-1){
						AbstractFormula f;
						if (a==-1 && b!=-1){
							Constant var_k = factory.createConstant(uniqueName("k"),new Int());
							flaga=false;
							f = new AndFormula(
									new EqFormula (
										new ArithmeticFormula(Connective.MUL, cardFun.apply(conFun.apply(var_enda)), new NumLiteral(b)),
										new ArithmeticFormula(Connective.MUL, cardFun.apply(conFun.apply(var_endb)), var_k)
								),	new ComparisonFormula(Connective.GEQ, var_k, new NumLiteral(0)));
						}
						else if (a!=-1 && b==-1){
							Constant var_k = factory.createConstant(uniqueName("k"),new Int());
							flagb=false;
							f = new AndFormula(
									new EqFormula (
										new ArithmeticFormula(Connective.MUL, cardFun.apply(conFun.apply(var_endb)), new NumLiteral(a)),
										new ArithmeticFormula(Connective.MUL, cardFun.apply(conFun.apply(var_enda)), var_k)
								),	new ComparisonFormula(Connective.GEQ, var_k, new NumLiteral(0)));
						}
						else{
							Constant var_k1 = factory.createConstant(uniqueName("k1"),new Int());
							Constant var_k2 = factory.createConstant(uniqueName("k2"),new Int());
							f = new AndFormula(
									new EqFormula(
												new ArithmeticFormula(Connective.MUL, cardFun.apply(conFun.apply(var_enda)), var_k1),
												new ArithmeticFormula(Connective.MUL, cardFun.apply(conFun.apply(var_endb)), var_k2)),
									new AndFormula(
												new ComparisonFormula(Connective.GEQ,var_k1, new NumLiteral(0)), 
												new ComparisonFormula(Connective.GEQ,var_k2, new NumLiteral(0)))
								);
						}
						assoc_formulas.add(f);
					}
					else{
						if (a==0 || b==0) flaga=flagb=false;

						AbstractFormula f = new EqFormula(
								new ArithmeticFormula(Connective.MUL,cardFun.apply(conFun.apply(var_enda)), new NumLiteral(b)),
								new ArithmeticFormula(Connective.MUL,cardFun.apply(conFun.apply(var_endb)), new NumLiteral(a)));
						assoc_formulas.add(f);
					}
				}//end of inner for
			}// end of outter for

			AbstractFormula orFormula = new OrFormula().merge(assoc_formulas.toArray(new AbstractFormula[assoc_formulas.size()]));
			AbstractFormula typeFormula1 = getAllChildren(enda.cls(), var_enda);
			AbstractFormula typeFormula2 = getAllChildren(endb.cls(), var_endb);
			AbstractFormula final_typeFormula = new AndFormula( getRelFunction(e.name()).apply( getObjFunction().apply(var_enda), 
												getObjFunction().apply(var_endb)),new AndFormula(typeFormula1, typeFormula2));
			AbstractFormula cardFormula1 = new ComparisonFormula (Connective.GEQ, cardFun.apply(conFun.apply(var_enda)), new NumLiteral(1));
			AbstractFormula cardFormula2 = new ComparisonFormula (Connective.GEQ, cardFun.apply(conFun.apply(var_endb)), new NumLiteral(1));

			qformula1.setFormula(new ImpliesFormula(final_typeFormula,orFormula));

			if (flaga) 
				formulas.add(new QuantifiedFormula(Quantifier.EXISTS, new Decls(var_enda, var_endb), new AndFormula(final_typeFormula,cardFormula1)));
			if (flagb)
				formulas.add(new QuantifiedFormula(Quantifier.EXISTS, new Decls(var_enda, var_endb), new AndFormula(final_typeFormula,cardFormula2)));
			
			/* in case multiple associations defined */
			computeSet(e,enda.cls(),endb.cls());
			return qformula1;
		}
		else{
			throw new VisitorException("Error: Sorry, we don't support this type of association.");
		}
	}
    
    private String uniqueName(String name){
		return (name+UUID.randomUUID()).replace("-","_");
	}


	private AbstractFormula getAllChildren(MClass cls, Variable var){
		List<Function> typeFun = new ArrayList<Function>();
		
		typeFun.add(getTypeFunction(cls.name()).apply(var));
		for (MClass c : cls.allParents())
			typeFun.add(getTypeFunction(c.name()).apply(var));
		
		Function[] typeFunArray = typeFun.toArray(new Function[typeFun.size()]);
		
		return typeFun.size() > 1 ?
				(new AndFormula()).merge(typeFunArray)
			:
				typeFun.get(0).apply(var);
	}

}