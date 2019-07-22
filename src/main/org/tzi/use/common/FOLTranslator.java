
package org.tzi.use.common;
import java.util.*;
import java.io.*;
import uran.formula.*;
import uran.formula.value.*;
import uran.formula.type.*;
import uran.formula.smt2.*;
import uran.formula.type.*;
import uran.solver.*;
import org.tzi.use.uml.mm.*;
import org.tzi.use.uml.ocl.type.EnumType;
import org.tzi.use.query.io.*;
import org.tzi.use.uran.weight.Flag;


public class FOLTranslator extends Thread implements ITranslator {
    private FeatureSet features;
    private ColorPrint out;
	private FunctionFactory factory = new FunctionFactory(1024,0.75f);
    private List<AbstractFormula> formulas = new ArrayList<AbstractFormula>();
    private HashMap <EnumType, Integer> enum_size = new HashMap<EnumType, Integer>();
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
    private String rel_str=(REL+""+UUID.randomUUID()).replace('-','_');
	private Function conFun = factory.createFunction(con_str,new Int(),new Int());
	private Function cardFun = factory.createFunction(car_str,new Int(),new Int());	
	private Function excludesFun = factory.createFunction(excludes_str, new Int(), new Int(), new Bool()); 
	private Function includesFun = factory.createFunction(includes_str, new Int(), new Int(), new Bool());
    private Function selectFun = factory.createFunction(select_str, new Int(), new Bool(), new Int());
    private Function objatFun = factory.createFunction(objat,new Int(),new Int(), new Int());
    private String Z3="/home/haowu/z3/build/z3";
    private String Z3_STD_IN=" -in ";
    private static int pid=1;
    
    public FOLTranslator(FeatureSet features, MModel model){
        this.features = features;
        out = new ColorPrint();
        //Function f1 = factory.createFunction(obj_str,new Int(), new Int());
        //model.processWithVisitor(modelVisitor);
        extraFunctions();
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

    public void TranslateAttribute(MAttribute attr){
        org.tzi.use.uml.ocl.type.Type t = attr.type();
        AbstractFormula f=null;
        if (t.isTypeOfBoolean())
				f = factory.createFunction(attr.owner().name().toLowerCase()+"_"+attr.name(),new Int(), new Bool());
			else if (attr.type().isTypeOfInteger())
				f = factory.createFunction(attr.owner().name().toLowerCase()+"_"+attr.name(),new Int(), new Int());
			else if (attr.type().isTypeOfEnum()){
                Function enumFun = factory.createFunction(attr.owner().name().toLowerCase()+"_"+
                    ((EnumType)attr.type()).name(), new Int(), new Int());
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
        
    }

	public void TranslateInvariant (MClassInvariant inv){
        OclExprTranslator visitor = new OclExprTranslator(this,Flag.QUIET);
        AbstractFormula formula = inv.bodyExpression().accept(visitor);
        out.println(formula.toSMT2(),Color.RED);
    }

    /* generate formulas here. */
    public void generate(){

        for (MClass cls:this.features.classes())
            TranslateClass (cls);

        for (MAttribute attr:this.features.attributes())
            TranslateAttribute(attr);

        for (MClassInvariant inv:this.features.invariants())
            TranslateInvariant(inv);

        toSMT2("FOL",formulas,factory);
    }

    private void toSMT2(String filename, List<AbstractFormula> formulas, FunctionFactory factory){
        SMT2Writer writer = new SMT2Writer("./"+filename+".smt2",factory,formulas);
        //Z3SMT2Solver solver = new Z3SMT2Solver(writer);
        SolverLauncher z3 = new SolverLauncher(Z3+Z3_STD_IN,writer,SolverLauncher.PRODUCE_UNSAT_CORES);
        
        long current = System.currentTimeMillis();
		/*if (solver.solve()==Result.UNSAT){
            out.println("unsat",Color.RED);
        }
        else{
            out.println("sat",Color.GREEN);
        }*/
        Result result = z3.launch();
        long timeUsed = System.currentTimeMillis()-current;
        String str = System.getProperty("os.name");
        out.println("OS:"+str,Color.BLUE);
        out.println(result.toString(),Color.BLUE);
        out.println("Solving Finished.",Color.BLUE);
        out.println("Time elapsed:"+timeUsed+" ms ", Color.BLUE);
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

    private void setZ3Path(){
        String str = System.getProperty("os.name");
        out.println("OS:"+str,Color.BLUE);
    }

    public void run(){
        Thread t = Thread.currentThread();
        out.println(t.getName(),Color.BLUE);
        generate();
        
    }

    public Function getObjFunction(){return factory.funLookup(obj_str);}
    public Function getTypeFunction(String name){return factory.funLookup(type_str+"_"+name);}
    public Function getEnumFunction(EnumType e){return factory.funLookup(e.name());}
    public Function getConFun(){return conFun;}
    public Function getCardFun(){return cardFun;}
    public Function getExcludesFunction(){return excludesFun;}
    public Function getSelectFunction(){return selectFun;}
    public Function getRelFunction(String name){return factory.funLookup(rel_str+"_"+name);}
    public FunctionFactory getFactory(){return factory;}

}