package org.tzi.use.uran.visitor;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.UUID;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.tzi.use.uml.mm.*;
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
import org.tzi.use.uran.weight.*;
import uran.solver.*;

public final class InvPrintVisitor implements MMVisitor{
	private PrintWriter fOut;	
	private FunctionFactory factory = new FunctionFactory(512,0.75f);
	private List<AbstractFormula> formulas = new ArrayList<AbstractFormula>();
	//private List<AbstractFormula> choices = new ArrayList<AbstractFormula>();
	private List<AbstractFormula> exist_formulas = new ArrayList<AbstractFormula>();
	private List<Constant> auxs = new ArrayList<Constant>();
	private List<Constant> weights = new ArrayList<Constant>();
	private List<Pair<AbstractFormula, MClassInvariant>> pairs = new ArrayList<Pair<AbstractFormula, MClassInvariant>>();
	private HashMap <MClass, Integer> clsRank = new HashMap<MClass, Integer>();
	private HashMap <String, Function> uid_table = new HashMap<String, Function>();
	private HashMap <String, String> type_table = new HashMap<String, String>();
	private final String OBJ="obj_";
	private final String TYPE="type_";
	private final String REL="rel_";
	private String obj_str=(OBJ+""+UUID.randomUUID()).replace('-','_');
	private String type_str=(TYPE+""+UUID.randomUUID()).replace('-','_');
	private String rel_str=(REL+""+UUID.randomUUID()).replace('-','_');
	
	public InvPrintVisitor (PrintWriter out){
		fOut = out;
		extraFunctions();
	}

	private void extraFunctions(){
		Function f1 = factory.createFunction(obj_str,new Int(), new Int());		
		uid_table.put(obj_str,f1);
	}
		
	@Override 
	public void visitAssociation (MAssociation e){
		rel_str = (REL+UUID.randomUUID()).replace('-','_');
		rel_str = rel_str + "_" + e.name();
		Function f2 = factory.createFunction(rel_str, new Int(), new Int(), new Bool());
		uid_table.put(e.name(),f2);

		for (MAssociationEnd a : e.associationEnds()){
			if (clsRank.containsKey(a.cls()))
				clsRank.put(a.cls(),clsRank.get(a.cls())+1);
		}

		/* we need to add extra axiom to state that (f a b) is the same as (f b a) */
		Variable a = new Variable("a", new Int());
		Variable b = new Variable("b", new Int());
		formulas.add (new QuantifiedFormula(Quantifier.FORALL, new Decls(a,b), new EqFormula(f2.apply(a,b), f2.apply(b,a))));
		
	}
	
	@Override
	public void visitAssociationClass (MAssociationClass e){}

	@Override
	public void visitAssociationEnd(MAssociationEnd e){}

	@Override
	public void visitAttribute (MAttribute e){}

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
		
		if (!clsRank.containsKey(e)) clsRank.put(e, e.allAttributes().size());
		
		while (it.hasNext()){
			MAttribute attr = (MAttribute) it.next();
			org.tzi.use.uml.ocl.type.Type t = attr.type();

			if (t.isTypeOfBoolean())
				f = factory.createFunction(e.name().toLowerCase()+"_"+attr.name(),new Int(), new Bool());
			else if (attr.type().isTypeOfInteger())
				f = factory.createFunction(e.name().toLowerCase()+"_"+attr.name(),new Int(), new Int());
			else;
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
		weights.clear();auxs.clear();pairs.clear();formulas.clear();exist_formulas.clear();
		MClassInvariant[] classInvariants = e.classInvariants().toArray(new MClassInvariant[0]);
		List<AbstractFormula> tmp = new ArrayList<AbstractFormula>();
		int totalWeight = 0;		

		/* translate class */
		Iterator it = e.classes().iterator();

		while (it.hasNext()){
			MClass cls = (MClass) it.next();
			ColorPrint.println("Annotation Tag:"+cls.getAnnotationTag(),Color.YELLOW);
			cls.processWithVisitor(this);			
		}
		
		it = e.associations().iterator();
		while (it.hasNext()){
			MAssociation a = (MAssociation) it.next();
			a.processWithVisitor(this);
		}
		
		System.out.println(factory);
		int i=0;
		for (MClassInvariant inv : classInvariants){
			//ColorPrint.println("visitng invariant "+ ++i,Color.BLUE);
			inv.processWithVisitor(this);
			ColorPrint.println("Annotation Tag:"+inv.getAnnotationTag(),Color.YELLOW);
			ColorPrint.println("leaving invariant "+ i++,Color.BLUE);
			System.out.println();
		}
		
		it = e.classes().iterator();
		while (it.hasNext()){
			MClass cls = (MClass) it.next();
			/* check if this is a default weight */
			if (cls.getAnnotationTag()!=null){
				AbstractWeight weight = cls.getAnnotationTag().getWeight();
				if (weight.isIntWeight()) {
					IntWeight iweight = (IntWeight) weight;
					if (iweight.getWeight()==-1) iweight.setWeight(clsRank.get(cls));
				}
			}
			ColorPrint.println("Annotation Tag:"+cls.getAnnotationTag(),Color.YELLOW);
		}

		for (i=0;i<pairs.size();i++){
			Constant aux = factory.createConstant("aux"+ i, new Int());
			auxs.add(aux);
			formulas.add (FormulaBuilder.range(0,1,aux,true));
			AbstractFormula formula1 = new AndFormula(new EqFormula(aux,new NumLiteral(1)), new BoolLiteral(true));
			AbstractFormula formula2 = new AndFormula(new EqFormula(aux,new NumLiteral(0)), new BoolLiteral(false));
			formulas.add(new OrFormula(new OrFormula(pairs.get(i).first(),formula1),formula2));
			
			/*form formulas for the weight defined */
			if (!pairs.get(i).second().isTagNull()){
				AbstractWeight aw = pairs.get(i).second().getAnnotationTag().getWeight();
				if (aw !=null ){
					Constant weight = factory.createConstant("weight"+i, new Int());
					weights.add(weight);
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
			}else
			{
				formulas.add (pairs.get(i).first());
			}
			
		}

		System.out.println("additional constraints...");
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
					Constant aux = factory.createConstant("aux"+ i, new Int());
					Constant cweight = factory.createConstant("weight"+ i++, new Int());
					auxs.add(aux);weights.add(cweight);
					formulas.add (FormulaBuilder.range(0,1,aux,true));
					AbstractFormula formula1 = new AndFormula(new EqFormula(aux,new NumLiteral(1)), new BoolLiteral(true));
					AbstractFormula formula2 = new AndFormula(new EqFormula(aux,new NumLiteral(0)), new BoolLiteral(false));
					Variable var = new Variable ("p", new Int());
					if (!cls.isAbstract()) tmp.add (getTypeFunction(cls.name()).apply(var));
					for (MClass c : cls.allParents()) if (!c.isAbstract()) tmp.add (getTypeFunction(c.name()).apply(var));
					if (tmp.size()>0){
						QuantifiedFormula quan_formula = (tmp.size() > 1) ? 
							new QuantifiedFormula (Quantifier.EXISTS, new Decls(var), 
									new AndFormula().merge(tmp.toArray(new AbstractFormula[tmp.size()])))
						:
							new QuantifiedFormula (Quantifier.EXISTS, new Decls(var), tmp.get(0));
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
				if (!cls.isAbstract()) tmp.add (getTypeFunction(cls.name()).apply(var));
				for (MClass c : cls.allParents()) if (!c.isAbstract()) tmp.add (getTypeFunction(c.name()).apply(var));
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

		for (i=0;i<exist_formulas.size();i++) formulas.add (exist_formulas.get(i));
		formulas.add (FormulaBuilder.sum(0,auxs.toArray(new Constant[auxs.size()])));
		toSMT2File(e.name(),formulas, factory, totalWeight);
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
	public void visitEnum (EnumType enumType){}

	@Override
	public void visitGeneralization (MGeneralization e){}

	public FunctionFactory getFactory(){return factory;}
	public Function getObjFunction(){return uid_table.get(obj_str);}
	public Function getTypeFunction(String name){return uid_table.get(type_table.get(name));}
	public Function getRelFunction(String name){return uid_table.get(name);}
	
	private void toSMT2File(String filename, List<AbstractFormula> formulas, FunctionFactory factory, int weight){
		SMT2Writer writer = new SMT2Writer("./"+filename+".smt2",factory,formulas);
		Z3SMT2Solver solver = new Z3SMT2Solver(writer);
		if (solver.solve()==Result.UNSAT){
			if (weights.size()>0)
				maxsmt (solver,weight);
			else
				ColorPrint.println("This model doesnot have any soft constraints to be removed.", Color.BLUE);				
		}
	}

	private void maxsmt (Z3SMT2Solver solver, int weight){
		int max = weight, min = 0, mid = (max+min)/2;
		List<AbstractFormula> formulas = new ArrayList<AbstractFormula>();
		
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
						ColorPrint.println("model: \n"+writer.getFactory().toString(),Color.WHITE);
						writer.append(blockFormula(weights,writer.getFactory()));
						totalSolutions++;
					}
					ColorPrint.println("Total Solutions: \n"+totalSolutions, Color.WHITE);
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
		
		ColorPrint.println("Max Weight cannot be found."+mid,Color.RED);
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
	
}

