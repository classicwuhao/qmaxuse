package org.tzi.use.uran.visitor;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.UUID;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import org.tzi.use.uml.mm.*;
import org.tzi.use.uml.mm.MMultiplicity.Range;
import org.tzi.use.uml.ocl.type.*;
import org.tzi.use.uml.ocl.expr.*;
import org.tzi.use.uml.mm.commonbehavior.communications.*;
import uran.test.util.*;
import uran.solver.*;
import uran.formula.*;
import uran.formula.value.*;
import uran.formula.type.*;
import uran.formula.smt2.*;
import uran.formula.type.*;
import org.tzi.use.uran.msc.*;
import org.tzi.use.uran.location.*;
import org.tzi.use.uran.weight.*;
import uran.solver.*;

public final class InvPrintVisitor extends Thread implements MMVisitor{
	private PrintWriter fOut;	
	private FunctionFactory factory = new FunctionFactory(512,0.75f);
	private List<AbstractFormula> formulas = new ArrayList<AbstractFormula>();
	//private List<AbstractFormula> choices = new ArrayList<AbstractFormula>();
	private List<AbstractFormula> exist_formulas = new ArrayList<AbstractFormula>();
	private List<Constant> auxs = new ArrayList<Constant>();
	private List<Constant> weights = new ArrayList<Constant>();
	private List<Pair<AbstractFormula, MClassInvariant>> pairs = new ArrayList<Pair<AbstractFormula, MClassInvariant>>();
	private List<Location> locations = new ArrayList<Location>();
	private List<Solution> solutions = new ArrayList<Solution>();
	private HashMap <MClass, Integer> clsRank = new HashMap<MClass, Integer>();
	private HashMap <String, Function> uid_table = new HashMap<String, Function>();
	private HashMap <String, String> type_table = new HashMap<String, String>();
	private HashMap <EnumType, Function> enum_table = new HashMap<EnumType, Function>();
	private HashMap <EnumType, Integer> enum_size = new HashMap<EnumType, Integer>();
	private HashMap <MClass, Integer> clsType = new HashMap<MClass, Integer>();
	private HashMap <String, Set<MAssociation>> assoc_table = new HashMap<String, Set<MAssociation>>();
	private int typeid=0;
	private int auxCounter=0;
	private int weightCounter=0;
	private int totalWeight = 0;
	private String model_name="";
	private final String OBJ="obj_";
	private final String TYPE="type_";
	private final String REL="rel_";
	private final String CON="container_";
	private final String excludes_str="oclExcludes";
	private final String includes_str="oclIncludes";
	private final String objat="ObjAt";
	private final String select_str="oclSelect";
	private String obj_str=(OBJ+""+UUID.randomUUID()).replace('-','_');
	private String type_str=(TYPE+""+UUID.randomUUID()).replace('-','_');
	private String rel_str=(REL+""+UUID.randomUUID()).replace('-','_');
	private String con_str=CON;//(CON+""+UUID.randomUUID()).replace('-','_');
	private String car_str="Cardinality";//("cardinality"+UUID.randomUUID()).replace('-','_');
	private Function conFun = factory.createFunction(con_str,new Int(),new Int());
	private Function cardFun = factory.createFunction(car_str,new Int(),new Int());	
	private Function excludesFun = factory.createFunction(excludes_str, new Int(), new Int(), new Bool()); 
	private Function includesFun = factory.createFunction(includes_str, new Int(), new Int(), new Bool());
	private Function selectFun = factory.createFunction(select_str, new Int(), new Bool(), new Int());
	private Function objatFun = factory.createFunction(objat,new Int(),new Int(), new Int());

	public InvPrintVisitor (PrintWriter out){
		fOut = out;
		extraFunctions();
	}

	private void extraFunctions(){
		Function f1 = factory.createFunction(obj_str,new Int(), new Int());		
		uid_table.put(obj_str,f1);
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


	@Override
	public void visitEnum(EnumType enumType) {
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
		enum_table.put(enumType, f);
	}
	
	@Override 
	public void visitAssociation (MAssociation e){
		rel_str = (REL+UUID.randomUUID()).replace('-','_');
		rel_str = rel_str + "_" + e.name();
		Function f2 = factory.createFunction(rel_str, new Int(), new Int(), new Bool());
		uid_table.put(e.name(),f2);
		//int sum=1;

		//for (MAssociationEnd a : e.associationEnds()) sum += clsRank.get(a.cls());
		
		/* we need to add an extra axiom stating that (f a b) is the same as (f b a) */
		Variable a = new Variable("a", new Int());
		Variable b = new Variable("b", new Int());
		AbstractFormula t1 = f2.apply(getObjFunction().apply(a), getObjFunction().apply(b));
		AbstractFormula t2 = f2.apply(getObjFunction().apply(b), getObjFunction().apply(a));

		List<MAssociationEnd> ends = e.associationEnds();
		/*if (ends.size()==2){
			MAssociationEnd enda = ends.get(0);
			MAssociationEnd endb = ends.get(1);
			Function type1 = getTypeFunction(enda.cls().name());
			Function type2 = getTypeFunction(endb.cls().name());
			AbstractFormula t = new AndFormula(type1.apply(getObjFunction().apply(a)), type2.apply(getObjFunction().apply(b)));
			formulas.add (new QuantifiedFormula(Quantifier.FORALL, new Decls(a,b), new AndFormula(new EqFormula(t1, t2),t)));
		}
		else
		{
			formulas.add (new QuantifiedFormula(Quantifier.FORALL, new Decls(a,b), new EqFormula(t1, t2)));
		}*/

		System.out.println("Association Annotation Tag:"+e.getAnnotationTag());		

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
						Function f1 = uid_table.get(e.name());
						Function f2 = uid_table.get(a.name());
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


	private int getClassRank(Set<MClass> set ){
		int sum=0;
		for (MClass cls : set) sum+=clsRank.get(cls);
		return sum;
	}

	@Override
	public void visitAssociationClass (MAssociationClass e){}

	@Override
	public void visitAssociationEnd(MAssociationEnd e){}

	@Override
	public void visitAttribute (MAttribute e){}

	private String uniqueName(String name){
		return (name+UUID.randomUUID()).replace("-","_");
	}

	@Override
	public void visitClass (MClass e){
		String full_type_name="";
		type_str =(TYPE+UUID.randomUUID()).replace('-','_');
		//Constant c = factory.createConstant(e.name(),new Int());
		Function d = factory.createFunction(type_str+"_"+e.name(), new Int(), new Bool());
		full_type_name = type_str+"_"+e.name();
		
		type_table.put(e.name(),full_type_name);
		uid_table.put(full_type_name,d);
		
		Iterator it = e.attributes().iterator();
		Function f;
		
		if (!clsRank.containsKey(e)) {
			if (e.allAttributes().size()<=0)
				clsRank.put(e, 1);
			else
				clsRank.put(e, e.allAttributes().size());
		}
		//if (!clsType.containsKey(e)) clsType.put(e, typeid++);
		
			/* check if this is a default weight */
		if (e.getAnnotationTag()!=null){
				AbstractWeight weight = e.getAnnotationTag().getWeight();
				if (weight.isIntWeight()) {
					IntWeight iweight = (IntWeight) weight;
					if (iweight.getWeight()==IntWeight.DEFAULT) iweight.setWeight(clsRank.get(e));
				}
		}

		while (it.hasNext()){
			MAttribute attr = (MAttribute) it.next();
			org.tzi.use.uml.ocl.type.Type t = attr.type();

			if (t.isTypeOfBoolean())
				f = factory.createFunction(e.name().toLowerCase()+"_"+attr.name(),new Int(), new Bool());
			else if (attr.type().isTypeOfInteger())
				f = factory.createFunction(e.name().toLowerCase()+"_"+attr.name(),new Int(), new Int());
			else if (attr.type().isTypeOfEnum()){
				Function enumFun =  enum_table.get((EnumType)attr.type());
				if (enumFun==null) throw new VisitorException("Error: enum function cannot be found.");
				Function typeFun = uid_table.get(type_str+"_"+attr.owner().name());
				Variable p = new Variable("p", new Int());
				formulas.add(new QuantifiedFormula(Quantifier.FORALL, new Decls(p), 
							new ImpliesFormula(typeFun.apply(p),  
							new AndFormula(
								new ComparisonFormula(Connective.GEQ, enumFun.apply(getObjFunction().apply(p)), new NumLiteral(0)),
								new ComparisonFormula(Connective.LEQ, enumFun.apply(getObjFunction().apply(p)), 
								new NumLiteral(enum_size.get((EnumType)attr.type())-1)))
							)));
			}
			else{
				//throw new VisitorException("Error: type "+t+" is not supported in current version.");
				ColorPrint.println("Warnning:"+attr.name()+" is a type of "+t+
							" that is not supported.  So this attribute is ignored.", Color.YELLOW);
			}
		}

	}

	@Override
	public void visitClassInvariant (MClassInvariant e){
		StringBuilder line = new StringBuilder();
        line.append("context");
		line.append(" ");
		if (e.hasVar()) {
			line.append(e.var());
			line.append(" ");
			line.append(":");
			line.append(" ");
		}

		line.append(e.cls().name());
        line.append(" ");

        if (e.isExistential()) {
			line.append("existential");
            line.append(" ");
        }
           
        line.append("inv");
        line.append(" ");
        line.append(e.name());
        line.append(":");
           
        fOut.println(line.toString());
		
        //ExpressionVisitor visitor = new ExprPrintVisitor(factory); //ExpressionPrintVisitor(fOut);
        //e.bodyExpression().processWithVisitor(visitor);
		
		ColorPrint.println("==============Final Formula==============",Color.GREEN);
		AbstractExprVisitor visitor = new OclExprVisitor(this);
		AbstractFormula formula = e.bodyExpression().accept(visitor);
		
		AnnotationTag tag = e.getAnnotationTag();
		if (tag!=null){
			AbstractWeight weight = tag.getWeight();
			if (weight!=null){
				IntWeight iweight = (IntWeight) e.getAnnotationTag().getWeight();
				if (iweight.getWeight()==IntWeight.DEFAULT) {
					AbstractRankVisitor rvisitor = new OclRankVisitor();
					iweight.setWeight(e.bodyExpression().accept(rvisitor));
				}
			}
		}
		ColorPrint.println(formula.toSMT2(),Color.RED);
		//ColorPrint.println(e.getAnnotationTag().toString(),Color.YELLOW);
		ColorPrint.println("==================END====================",Color.GREEN);
		pairs.add(new Pair<AbstractFormula, MClassInvariant>(formula, e));
        fOut.flush();
	}

	@Override
	public void visitModel (MModel e){
		weights.clear();auxs.clear();
		pairs.clear();formulas.clear();exist_formulas.clear();locations.clear();
		MClassInvariant[] classInvariants = e.classInvariants().toArray(new MClassInvariant[0]);
		List<AbstractFormula> tmp = new ArrayList<AbstractFormula>();
		totalWeight = 0;
		int i=0;
		
		EnumType[] enumTypes = e.enumTypes().toArray(new EnumType[0]);
		for (EnumType t : enumTypes){
        	visitEnum(t);
        }
		
		System.out.println("visiting class...");
		/* translate class */
		Iterator it = e.classes().iterator();

		while (it.hasNext()){
			MClass cls = (MClass) it.next();
			ColorPrint.println("Annotation Tag:"+cls.getAnnotationTag(),Color.YELLOW);
			cls.processWithVisitor(this);			
		}

		it = e.associations().iterator();
		while (it.hasNext()){
			MAssociation assoc = (MAssociation) it.next();
			assoc.processWithVisitor(this);
			AnnotationTag tag = assoc.getAnnotationTag();
			Constant aux = CreateAux();
			int sum=0;

			AbstractFormula formula = computeAEM(assoc);
			formulas.add (FormulaBuilder.range(0,1,aux,true));
			AbstractFormula formula1 = new AndFormula(new EqFormula(aux,new NumLiteral(1)), new BoolLiteral(true));
			AbstractFormula formula2 = new AndFormula(new EqFormula(aux,new NumLiteral(0)), new BoolLiteral(false));
			formulas.add(new OrFormula(new OrFormula(formula,formula1),formula2));
			formulas.add(formula);

			weight:
			if (tag!=null){
				AbstractWeight weight = tag.getWeight();
				if (weight!=null){
					if (weight.isIntWeight()){
						IntWeight iweight = (IntWeight) weight;
						if (iweight.getWeight()==IntWeight.DEFAULT){
							sum = getSum(assoc);
							if (sum==0) break weight;
							iweight.setWeight(sum); // assign a new weight based on two associationends.
						}
						else{
							sum = iweight.getWeight();
						}

						Constant cweight = CreateWeight();
						totalWeight+=sum;
						ImpliesFormula imp_formula0 = new ImpliesFormula(new EqFormula(aux, new NumLiteral(0)), 
																new EqFormula(cweight,new NumLiteral(sum)));
						ImpliesFormula imp_formula1 = new ImpliesFormula(new EqFormula(aux, new NumLiteral(1)), 
														new EqFormula(cweight,new NumLiteral(0)));

						formulas.add(new AndFormula().merge(imp_formula0, imp_formula1));
						locations.add(new AssocLocation(factory,assoc,aux,cweight));
					}
				}
			}

		}
		
		//System.out.println(factory);

		for (MClassInvariant inv : classInvariants){
			//ColorPrint.println("visitng invariant "+ ++i,Color.BLUE);
			inv.processWithVisitor(this);
			ColorPrint.println("Annotation Tag:"+inv.getAnnotationTag(),Color.YELLOW);
			ColorPrint.println("leaving invariant "+ i++,Color.BLUE);
			System.out.println();
		}

		for (i=0;i<pairs.size();i++){
			Constant aux = CreateAux();
			formulas.add (FormulaBuilder.range(0,1,aux,true));
			AbstractFormula formula1 = new AndFormula(new EqFormula(aux,new NumLiteral(1)), new BoolLiteral(true));
			AbstractFormula formula2 = new AndFormula(new EqFormula(aux,new NumLiteral(0)), new BoolLiteral(false));
			formulas.add(new OrFormula(new OrFormula(pairs.get(i).first(),formula1),formula2));
			/*form formulas for the weight defined */
			if (!pairs.get(i).second().isTagNull()){
				AbstractWeight aw = pairs.get(i).second().getAnnotationTag().getWeight();
				if (aw !=null ){
					Constant weight = CreateWeight();
					locations.add(new InvariantLocation(factory,pairs.get(i).second(),aux,weight)); // add invariant location
					if (aw.isIntWeight()){
						IntWeight iw = (IntWeight)aw;
						int w = iw.getWeight();
						totalWeight+=w;
						ImpliesFormula imp_formula0 = new ImpliesFormula(new EqFormula(aux, new NumLiteral(0)), 
															new EqFormula(weight,new NumLiteral(w)));
						ImpliesFormula imp_formula1 = new ImpliesFormula(new EqFormula(aux, new NumLiteral(1)), 
														new EqFormula(weight,new NumLiteral(0)));

					
						formulas.add(new AndFormula().merge(imp_formula0, imp_formula1));
					}
				}
			}
			else
			{
				formulas.add (pairs.get(i).first());
			}
			
		}

		//System.out.println("add additional formulas...");
		/* add additional formulas for each class */
		it = e.classes().iterator();

		while (it.hasNext()){
			MClass cls = (MClass) it.next();
			tmp.clear();
			if (cls.getAnnotationTag()!=null){
				AbstractWeight weight = cls.getAnnotationTag().getWeight();
				if (weight.isIntWeight()) {
					IntWeight iweight = (IntWeight) weight;
					int w = iweight.getWeight();
					totalWeight+=w;
					Constant aux = CreateAux();
					Constant cweight = CreateWeight();
					locations.add(new ClassLocation(factory,cls,aux,cweight)); // remember the location
					formulas.add (FormulaBuilder.range(0,1,aux,true));
					AbstractFormula formula1 = new AndFormula(new EqFormula(aux,new NumLiteral(1)), new BoolLiteral(true));
					AbstractFormula formula2 = new AndFormula(new EqFormula(aux,new NumLiteral(0)), new BoolLiteral(false));
					Variable var = new Variable ("p", new Int());
					if (!cls.isAbstract()) tmp.add (getTypeFunction(cls.name()).apply(getObjFunction().apply(var)));
					for (MClass c : cls.allParents()) if (!c.isAbstract()) tmp.add (getTypeFunction(c.name()).apply(getObjFunction().apply(var)));
					if (tmp.size()>0){
						QuantifiedFormula quan_formula = (tmp.size() > 1) ? 

							/*new QuantifiedFormula (Quantifier.EXISTS, new Decls(var), 
									new AndFormula(new AndFormula().merge(tmp.toArray(new AbstractFormula[tmp.size()])), 
										new ComparisonFormula (Connective.GEQ, cardFun.apply(conFun.apply(getObjFunction().apply(var))), new NumLiteral(1))))*/
							new QuantifiedFormula (Quantifier.EXISTS, new Decls(var), new AndFormula().merge(tmp.toArray(new AbstractFormula[tmp.size()])))
						:
							/*new QuantifiedFormula (Quantifier.EXISTS, new Decls(var), new AndFormula (tmp.get(0),
								new ComparisonFormula (Connective.GEQ, cardFun.apply(conFun.apply(getObjFunction().apply(var))), new NumLiteral(1))));*/
							new QuantifiedFormula (Quantifier.EXISTS, new Decls(var), (tmp.get(0)));

						exist_formulas.add (new OrFormula(new OrFormula(quan_formula,formula1),formula2));

						ImpliesFormula imp_formula0 = new ImpliesFormula(new EqFormula(aux, new NumLiteral(0)), 
															new EqFormula(cweight,new NumLiteral(w)));
						ImpliesFormula imp_formula1 = new ImpliesFormula(new EqFormula(aux, new NumLiteral(1)), 
														new EqFormula(cweight,new NumLiteral(0)));
						exist_formulas.add (new AndFormula().merge(imp_formula0, imp_formula1));
						
					}
				}
			}
			else{
				/* hard constraints */
				Variable var = new Variable ("o", new Int());
				if (!cls.isAbstract()) tmp.add (getTypeFunction(cls.name()).apply(getObjFunction().apply(var)));
				for (MClass c : cls.allParents()) if (!c.isAbstract()) tmp.add (getTypeFunction(c.name()).apply(getObjFunction().apply(var)));
				if (tmp.size()>0){
					QuantifiedFormula quan_formula = (tmp.size() > 1) ? 
						new QuantifiedFormula (Quantifier.EXISTS, new Decls(var), 
								new AndFormula().merge(tmp.toArray(new AbstractFormula[tmp.size()])))
						:
						new QuantifiedFormula (Quantifier.EXISTS, new Decls(var), tmp.get(0));

					exist_formulas.add(quan_formula);
				}
			}
		} // end of while

		System.out.println("Ready to Solve...");
		for (i=0;i<exist_formulas.size();i++) formulas.add (exist_formulas.get(i));
		if (auxs.size()>0) formulas.add (FormulaBuilder.sum(0,auxs.toArray(new Constant[auxs.size()])));
		this.model_name = e.name();
		toSMT2File(e.name(),formulas, factory, totalWeight);
	}

	private int getSum(MAssociation assoc){
		int sum=0;
	
		for (MAssociationEnd a : assoc.associationEnds()){ 
			if (a.cls().getAnnotationTag()==null){
				ColorPrint.println("Warning: The weight for class "+a.cls().name()+" does not exist, so it is ignored.",Color.YELLOW);
				continue;
			}
			sum += ((IntWeight)a.cls().getAnnotationTag().getWeight()).getWeight(); // may cause an error
		}
		return sum;
	}

	@Override
	public void visitOperation (MOperation e){}
	
	@Override
	public void visitPrePostCondition (MPrePostCondition e){}

	@Override
	public void visitAnnotation (MElementAnnotation a){}

	@Override
	public void visitSignal (MSignal a){}
	
	@Override
	public void visitGeneralization (MGeneralization e){}

	private Constant CreateAux(){
		Constant aux = factory.createConstant("aux"+ auxCounter++, new Int());
		auxs.add (aux);		
		return aux;
	}

	private Constant CreateWeight(){
		Constant weight = factory.createConstant("weight"+weightCounter++, new Int());
		weights.add(weight);
		return weight;
	}

	public Constant getTypeID(MClass cls){return factory.conLookup(cls.name());}
	public Function getEnumFunction(EnumType e){return enum_table.get(e);}
	public FunctionFactory getFactory(){return factory;}
	public Function getConFun(){return conFun;}
	public Function getCardFun(){return cardFun;}
	public Function getObjFunction(){return uid_table.get(obj_str);}
	public Function getTypeFunction(String name){return uid_table.get(type_table.get(name));}
	public Function getExcludesFunction(){return excludesFun;}
	public Function getRelFunction(String name){return uid_table.get(name);}
	public Function getSelectFunction(){return selectFun;}
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
		toSMT2File(this.model_name,formulas, factory, totalWeight);
		System.out.println("Finished.");
	}
	
	private void toSMT2File(String filename, List<AbstractFormula> formulas, FunctionFactory factory, int weight){
		SMT2Writer writer = new SMT2Writer("./"+filename+".smt2",factory,formulas);
		Z3SMT2Solver solver = new Z3SMT2Solver(writer);
		ColorPrint.println("Number of formulas generated:"+writer.size(), Color.BLUE);
		ColorPrint.println("Total Weight:"+weight,Color.BLUE);
		ColorPrint.println("Solving Weighted MaxSMT...",Color.BLUE);
		long current = System.currentTimeMillis();
		if (solver.solve()==Result.UNSAT){
			if (weights.size()>0)
				maxsmt (solver,weight);
			else
				ColorPrint.println("At least one constraint cannot be satisfied,"+
					 "but this model does not have any soft constraints to be removed.", Color.RED);				
		}
		else{
			ColorPrint.println("All constraints of this model can be satisfied.", Color.BLUE);
			return;
		}
		long timeUsed = System.currentTimeMillis()-current;
		ColorPrint.println("Solving Finished.",Color.BLUE);
		ColorPrint.println("Time elapsed:"+timeUsed+" ms ", Color.BLUE);
		ColorPrint.println("-----------------------------------------------------",Color.YELLOW);
		if (solutions.size()==0) {
			ColorPrint.println(" No solutions found. :-(",Color.RED);
			return;
		}

		/*for (Solution sol : solutions){
			for (int i=0;i<sol.size();i++){
				ColorPrint.print(sol.get(i).name()+",",Color.WHITE);
			}
		}*/
		
		System.out.println("size:"+solutions.size());
		
		BoolMatrix bmatrix = new BoolMatrix(solutions);
		this.solutions = bmatrix.getSolutions();
		Report report = new HTMLReport("./html/"+filename+".html",solutions);
		
		/*System.out.println();
		System.out.println("after processing solutions set...");
		System.out.println();
		
		for (Solution sol : solutions){
			for (int i=0;i<sol.size();i++){
				ColorPrint.print(sol.get(i).name()+",",Color.WHITE);
			}
		}
		System.out.println("size:"+solutions.size());*/
		
		System.out.println();
		/* compute all conflicts */
		ColorPrint.println("Now processing matrix...",Color.WHITE);
		
		ColorPrint.println(bmatrix.toString(),Color.WHITE);
		MscSolver mscsolver = new MscSolver(bmatrix.matrix());
		current = System.currentTimeMillis();
		mscsolver.solve(mscsolver.formalise());
		ColorPrint.println("Solving Finished.",Color.BLUE);
		ColorPrint.println("Time elapsed:"+(System.currentTimeMillis()-current)+" ms",Color.BLUE);
		
		/* collect conflicts */
		report.addConflicts(conflicts(mscsolver.getSubsets()));
		report.addSingleConflicts(bmatrix.getSingleConflicts());
		report.generate();
		report.finalise();
		ColorPrint.println("Report is generated ( "+this.model_name+" )",Color.BLUE);
	}

	private List<List<Status>> conflicts(List<List<Integer>> sets){
		List<List<Status>> conflicts = new ArrayList<List<Status>>();
		Solution solution = this.solutions.get(0);
		
		for (int i=0;i<sets.size();i++){
			List<Integer> subsets = sets.get(i);
			List<Status> conflict = new ArrayList<Status>();
			for (int j=0;j<subsets.size();j++){
				conflict.add(solution.get(subsets.get(j)));
			}
			conflicts.add(conflict);
		}
		
		return conflicts;
		/*for (int i=0;i<conflicts.size();i++){
			List<Status> conflict = conflicts.get(i);
			ColorPrint.print("(",Color.WHITE);
			for (int j=0;j<conflict.size()-1;j++){
				ColorPrint.print(conflict.get(j).name()+",",Color.WHITE);
			}
			ColorPrint.print(conflict.get(conflict.size()-1).name(),Color.WHITE);
			ColorPrint.print(")",Color.WHITE);
		}
		System.out.println();*/
	}

	private void maxsmt (Z3SMT2Solver solver, int weight){
		int max = weight, min = 0, mid = (max+min)/2;
		List<AbstractFormula> formulas = new ArrayList<AbstractFormula>();
		long current = System.currentTimeMillis();
		SMT2Writer writer = solver.getWriter();
		formulas.add (FormulaBuilder.above(FormulaBuilder.plus(weights),mid,true));
		writer.overwrite(formulas,3);
		int totalSolutions=0;
		while (min<=max){
			mid = (max+min)/2;
			formulas.clear();
			formulas.add (FormulaBuilder.above(FormulaBuilder.plus(weights),mid,true));
			writer.overwrite(formulas,1);
			if (solver.solve() == Result.SAT){
				ColorPrint.println("Approaching Solution"+" @ "+ mid +" uses "+(System.currentTimeMillis()-current)+" ms.",Color.BLUE);
				min = mid+1;
				formulas.clear();
				formulas.add(FormulaBuilder.above(FormulaBuilder.plus(weights),mid,false));
				writer.overwrite(formulas,1);
				if (solver.solve()==Result.UNSAT){
					ColorPrint.println("Max Weight found:"+mid, Color.RED);
					formulas.clear();
					formulas.add(FormulaBuilder.sum(mid, weights));
					writer.overwrite(formulas,1);
					// Use this model as a guidence for enumerating all other solutions. 
					while (solver.solve()==Result.SAT){
						//ColorPrint.println("model: \n"+writer.getFactory().toString(),Color.WHITE);
						writer.append(blockFormula(weights,writer.getFactory()));
						totalSolutions++;
						PrintReport();
					}
					ColorPrint.println("Total Solutions: "+totalSolutions, Color.WHITE);
					return;
				}
			}
			else if (solver.solve()==Result.UNSAT){
				max = mid-1;
			}
			else{
				ColorPrint.println("Error: Solver cannot handle formulas.", Color.RED);
				break;
			}
		}
		
		ColorPrint.println("Max Weight cannot be found @ "+mid,Color.RED);
	}

	private AbstractFormula blockFormula (List<Constant> weights, FunctionFactory factory){
		List<AbstractFormula> formulas = new ArrayList<AbstractFormula>();

		for (Constant c : weights){
			Value value = factory.getValue(c.name());
			if (value==null) throw new VisitorException("Error: cannot retrieve values from solver.");
			if (value.IsInt()) formulas.add (new EqFormula(c, new NumLiteral( ((IntValue)value).getValue())));
		}
		
		return FormulaBuilder.neg(new AndFormula().merge(formulas.toArray(new EqFormula[formulas.size()])));
	}
	
	private void PrintReport(){
		if (locations.size()<=0){
			ColorPrint.println("No specified weights found.",Color.GREEN);
			return;
		}
		
		//ColorPrint.println("===============Summary=================",Color.GREEN);
		Solution solution = new Solution();
		for (Location loc : locations){
			/*ColorPrint.print(loc.name()+" is ",Color.WHITE);
			if (loc.isEnabled()){
				ColorPrint.print("ON ",Color.GREEN);
				ColorPrint.print("weight:("+loc.getWeight()+")",Color.YELLOW);
			}
			else{
				ColorPrint.print("OFF ",Color.RED);
				ColorPrint.print("weight:("+loc.getWeight()+")",Color.YELLOW);
			}
			ColorPrint.println("",Color.WHITE);*/
			if (loc.isClassLocation())
				solution.addStatus(new Status(loc.isEnabled(),loc.name(),loc.getWeight(),Status.CLASS));
			else if (loc.isInvaraintLocation())
				solution.addStatus(new Status(loc.isEnabled(),loc.name(),loc.getWeight(),Status.INVAR));
			else if (loc.isAssocLocation())
				solution.addStatus(new Status(loc.isEnabled(),loc.name(),loc.getWeight(),Status.ASSOC));
			else
				solution.addStatus(new Status(loc.isEnabled(),loc.name(),loc.getWeight(),Status.UNKNOWN));
		}
		solutions.add(solution);
		//ColorPrint.println("=================END===================",Color.GREEN);
	}

}

