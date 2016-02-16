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
	private List<AbstractFormula> inv_formulas = new ArrayList<AbstractFormula>();
	
	private HashMap <String, Function> uid_table = new HashMap<String, Function>();
	private HashMap <String, String> type_table = new HashMap<String, String>();
	private final String OBJ="obj_";
	private final String TYPE="type_";
	private final String REL="rel_";
	private String obj_str=(OBJ+UUID.randomUUID()).replace('-','_');
	private String type_str=(TYPE+UUID.randomUUID()).replace('-','_');
	private String rel_str=(REL+UUID.randomUUID()).replace('-','_');
	
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
		type_str = (TYPE+UUID.randomUUID()).replace('-','_');
		Constant c = factory.createConstant(e.name(),new Int());
		Function d = factory.createFunction(type_str+"_"+e.name(), new Int(), new Bool());
		full_type_name = type_str+"_"+e.name();
		
		type_table.put(e.name(),full_type_name);
		uid_table.put(full_type_name,d);
		
		Iterator it = e.attributes().iterator();
		Function f;
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
		ColorPrint.println(formula.toSMT2(),Color.RED);
		ColorPrint.println("==================END====================",Color.GREEN);
		inv_formulas.add(formula);
        fOut.flush();
	}

	@Override
	public void visitModel (MModel e){
		formulas.clear();inv_formulas.clear();		
		MClassInvariant[] classInvariants = e.classInvariants().toArray(new MClassInvariant[0]);
		
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
		
		List<Pair<AbstractFormula, Integer>> pairs = new ArrayList<Pair<AbstractFormula, Integer>>();
		
		for (i=0;i<inv_formulas.size();i++){
			Constant aux = factory.createConstant("aux"+ i, new Int());
			formulas.add (FormulaBuilder.range(0,1,aux,true));
			AbstractFormula formula1 = new AndFormula(new EqFormula(aux,new NumLiteral(1)), new BoolLiteral(true));
			AbstractFormula formula2 = new AndFormula(new EqFormula(aux,new NumLiteral(0)), new BoolLiteral(false));			
			/* form formulas for the weight defined */
			pairs.add(new Pair<AbstractFormula, Integer>(inv_formulas.get(i),i+1));
			Constant weight = factory.createConstant("weight"+i, new Int());
			Pair<AbstractFormula, Integer> pair = pairs.get(i);
			int w = (int)pair.second();
			ImpliesFormula imp_formula0 = new ImpliesFormula(inv_formulas.get(i), new EqFormula(weight,new NumLiteral(w)));
			ImpliesFormula imp_formula1 = new ImpliesFormula(new NegFormula(inv_formulas.get(i)), new EqFormula(weight,new NumLiteral(0)));
			formulas.add (new OrFormula().merge(inv_formulas.get(i), formula1, formula2));
			formulas.add(new AndFormula().merge(imp_formula0, imp_formula1));
		}
		
		toSMT2File(e.name(),formulas, factory);
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
	
	private void toSMT2File(String filename, List<AbstractFormula> formulas, FunctionFactory factory){
		SMT2Writer writer = new SMT2Writer("./"+filename+".smt2",factory,formulas);		
	}
	
}

