package org.tzi.use.uran.visitor;

import org.tzi.use.uml.ocl.expr.*;
import org.tzi.use.uml.ocl.type.*;
import org.tzi.use.uml.mm.*;
import uran.formula.*;
import uran.formula.value.*;
import uran.formula.type.*;
import uran.formula.smt2.*;
import uran.formula.type.*;
import uran.solver.*;
import java.util.*;

public final class OclExprVisitor implements AbstractExprVisitor{
	private FunctionFactory factory;
	private InvPrintVisitor modelVisitor;	
	private Variable boundedVar = new Variable ("v", new Int()); //default variable for self keyword.
	private Scope _scope=null;
	private String navname="";

	public OclExprVisitor(InvPrintVisitor v){
		this.factory = v.getFactory();
		modelVisitor=v;
	}
	
	public AbstractFormula visitForAll (ExpForAll expr){
		System.out.println("visiting forall...");
		AbstractFormula formula=null;
		Scope s;
					
		if (_scope==null){
			_scope=s=new Scope();
		}else{
			s=_scope.tail();
			Scope newScope = new Scope();
			s.next = newScope;
			newScope.prev = s;
			s = newScope;
		}
		
		formula=visitQuery(expr,s);
		
		/* setup bounded variables */
		Constant[] cons = new Constant[_scope.size()];
		Variable[] vars = _scope.tail().allCurrentContents();

		for (int i=0;i<vars.length;i++) cons[i]=vars[i];

		if (s==_scope)
			s=_scope=null;
		else
			s.shrink();
		
		System.out.println("leaving forall...");
		System.out.println("scope:"+s);
		return new QuantifiedFormula(Quantifier.FORALL,new Decls(cons),formula);
	}

	public AbstractFormula visitExists (ExpExists expr){
		System.out.println("visiting exists...");
		AbstractFormula formula=null;
		Scope s;
					
		if (_scope==null){
			_scope=s=new Scope();
		}else{
			s=_scope.tail();
			Scope newScope = new Scope();
			s.next = newScope;
			newScope.prev = s;
			s = newScope;
		}
		
		formula=visitQuery(expr,s);
		
		/* setup bounded variables */
		Constant[] cons = new Constant[_scope.size()];
		Variable[] vars = _scope.tail().allCurrentContents();

		for (int i=0;i<vars.length;i++) cons[i]=vars[i];

		if (s==_scope)
			s=_scope=null;
		else
			s.shrink();
		
		System.out.println("leaving exists...");
		System.out.println("scope:"+s);
		
		return formula.isImpliesFormula() ? 
			new QuantifiedFormula(Quantifier.EXISTS, new Decls(cons), 
				new AndFormula(((ImpliesFormula)formula).left(),((ImpliesFormula)formula).right()))
			:
			new QuantifiedFormula(Quantifier.EXISTS,new Decls(cons),formula);
	}
	
	private AbstractFormula visitQuery(ExpQuery expr, Scope s){
		System.out.println("visiting query...");
		List<AbstractFormula> tmp = new ArrayList<AbstractFormula>();
		AbstractFormula formula_range=null;
		AbstractFormula formula_nav=null;
		ImpliesFormula imp_formula=null;
		Scope ns=s;

		System.out.println(" visiting range...");
		System.out.println("range expr:"+expr.getRangeExpression());
		formula_range = expr.getRangeExpression().accept(this);
		System.out.println("range formula:"+formula_range);
		System.out.println(" leaving range...");
		
		/* add all variables into the scope */
		List<AbstractFormula> variables = expr.getVariableDeclarations().accept(this);
		
		for (AbstractFormula v : variables){
			if (v.isVariable()){
				Variable var = (Variable) v;
				ns.add(var.name(),var);
			}
		}
		
		System.out.println("s(query)"+s);
		VarDeclList varlist = expr.getVariableDeclarations();
		tmp.clear();
		
		for (int i=0;i<varlist.size();i++){
			VarDecl v = varlist.varDecl(i);
			Variable var = ns.lookupB(v.name());
			if (v.type().isTypeOfClass() && var!=null){
				MClass c = (MClass) (v.type());
				tmp.add(getAllChildren(c,var));
			}
		}
		
		
		AbstractFormula[] tmpformula_array = tmp.toArray(new AbstractFormula[tmp.size()]);
		AbstractFormula type_formula = (tmp.size() > 1) ? (new AndFormula()).merge(tmpformula_array) : tmp.get(0);

		/* create an implication formula here... */
		AbstractFormula expr_formula = expr.getQueryExpression().accept(this);
			
		/* in case this is a navigation */
		if (formula_range!=null) {
			System.out.println("formula_range:"+formula_range);
			if (formula_range.isFunction()){
				formula_nav=makeRelations(navname,(Function)formula_range, variables.toArray(new Variable[variables.size()]));
				imp_formula = new ImpliesFormula(new AndFormula(type_formula, formula_nav),expr_formula);
			}
			if (formula_range.isQuantifiedFormula()){
				formula_nav=makeRelations(navname,((QuantifiedFormula)formula_range).getVariables() ,variables.toArray(new Variable[variables.size()]));
				if (expr_formula.isQuantifiedFormula()){
					AbstractFormula imp = ((QuantifiedFormula) expr_formula).getFormula();
					if (imp.isBinaryFormula()){
						AbstractFormula left = ((BinaryFormula)imp).left();
						((BinaryFormula)imp).setLeft(new AndFormula(left,formula_nav));
						imp_formula = new ImpliesFormula(type_formula,expr_formula);
					}
				}
				else{
					imp_formula = new ImpliesFormula(new AndFormula(type_formula, formula_nav),expr_formula);
				}
			}
			navname="";
		}else{
			imp_formula = new ImpliesFormula(type_formula,expr_formula);
		}

		System.out.println("nav formula:"+formula_nav);
		System.out.println("imp_formula:"+imp_formula.toSMT2());
		System.out.println("leaving query...");
		return imp_formula;
	}
	
	private AbstractFormula makeRelations (String name, Function f1, Variable[] vars){
		if (f1==null || vars == null) 
			throw new VisitorException("Exception: Relational function applied failed, because parameter(s) is (are) null.");
		if (name.equals(""))
			throw new VisitorException("Exception: Association name is empty.");

		Function[] f = new Function[vars.length];

		for (int i=0;i<vars.length;i++)
			f[i]=modelVisitor.getRelFunction(name).apply(f1,f1.apply(vars[i]));

		return f.length==1 ? f[0] : new AndFormula().merge(f);
	}

	private AbstractFormula makeRelations (String name, Constant[] vars1, Variable[] vars2){
		if (vars1==null || vars2==null)
			throw new VisitorException("Exception: Relational function applied failed, because parameter(s) is (are) null.");

		if (name.equals(""))
			throw new VisitorException("Exception: Association name is empty.");
		Function[] f = new Function[vars1.length*vars2.length];
		Function objfun = modelVisitor.getObjFunction();
		Function relfun = modelVisitor.getRelFunction(name);
		
		for (int i=0,c=0;i<vars1.length;i++)
			for (int j=0;j<vars2.length;j++)
				f[c++] = relfun.apply (objfun.apply(vars1[i]),objfun.apply(vars2[j]));
		
		return f.length==1 ? f[0] : new AndFormula().merge(f);
	}

	@Override
	public AbstractFormula visitNavigation (ExpNavigation expr){
		System.out.println("visiting navigation...");
		System.out.println("obj expr:"+expr.getObjectExpression());
		AbstractFormula formula = expr.getObjectExpression().accept(this);
		navname=expr.getSource().association().name();
		if (formula.isQuantifiedFormula()){
			QuantifiedFormula f = (QuantifiedFormula)formula;
			f.setVariables(new Decls(new Constant("p", new Int())));
			System.out.println("Dst:"+expr.getDestination().cls());
			System.out.println("Src:"+expr.getSource().cls());
		}
		System.out.println("nav formula:"+formula.toSMT2());
		System.out.println("leaving navigation...");
		return formula;
	}

	@Override
	public List<AbstractFormula> visitVarDeclList(VarDeclList varDeclList){
		List<AbstractFormula> formulas = new ArrayList<AbstractFormula>();
		
		for (int i = 0; i < varDeclList.size(); ++i)
			formulas.add(varDeclList.varDecl(i).accept(this));
				
		return formulas;
	}
	
	@Override
	public AbstractFormula visitVarDecl(VarDecl var){
		System.out.println("visiting varDecl...");
		if (var.type().isTypeOfInteger())
			return new Variable (var.name(), new Int());
		else if (var.type().isTypeOfBoolean())
			return new Variable (var.name(), new Bool());
		else if (var.type().isTypeOfClass())
			return new Variable (var.name(), new Int());

		System.out.println("leaving varDecl...");
		/* default: just return an integer type */
		return new Variable (var.name(), new Int());

	}

	@Override
	public AbstractFormula visitConstInteger (ExpConstInteger expr){
		return new NumLiteral(new IntValue(expr.value()));
	}

	@Override
	public AbstractFormula visitConstBoolean (ExpConstBoolean expr){
		System.out.println("visiting const boolean...");
		return new BoolLiteral(new BoolValue(expr.value()));
	}

	@Override
	public AbstractFormula visitConstEnum (ExpConstEnum expr){
		System.out.println("visiting const enum...");
		return new NumLiteral(new IntValue(modelVisitor.getEnumValueIndex((EnumType)expr.type(),expr.value())));
	}

	@Override
	public AbstractFormula visitAttrOp(ExpAttrOp expr){
		System.out.println("visiting attrop...");
		MAttribute attr = expr.attr();
		Function fun;
		if (!attr.type().isTypeOfEnum())
			fun = this.factory.funLookup(attr.owner().name().toLowerCase()+"_"+attr.name());
		else
			fun = modelVisitor.getEnumFunction((EnumType)attr.type());
				
		AbstractFormula formula = expr.objExp().accept(this);
		List<Function> typeFun = new ArrayList<Function>();
		MClass context;
		
		if (formula.isQuantifiedFormula()){
			QuantifiedFormula f = (QuantifiedFormula) formula;
			Function objFun = modelVisitor.getObjFunction();
			org.tzi.use.uml.ocl.type.Type objType = expr.objExp().type();
			if (objType.isTypeOfClass())
				context = ((MClass)objType);
			else
				context = attr.owner();	
				
			typeFun.add(modelVisitor.getTypeFunction(context.name()).apply(boundedVar));
				
			for (MClass cls : context.allParents())
				typeFun.add(modelVisitor.getTypeFunction(cls.name()).apply(boundedVar));
			
			Function[] typeFunArray = typeFun.toArray(new Function[typeFun.size()]);
			f.setVariables(new Decls(boundedVar));

			ImpliesFormula	impFor = (typeFun.size()>1) ? 
						new ImpliesFormula((new AndFormula()).merge(typeFunArray),fun.apply(objFun.apply(boundedVar)))
					:
						new ImpliesFormula(typeFun.get(0).apply(boundedVar),fun.apply(objFun.apply(boundedVar)));
			
			f.setFormula(impFor);
		}

		if (formula.isFunction()){
			Function f = (Function) formula;
			return fun.apply(f);
		}
		
		System.out.println("leaving attrop...");
		return formula;
	}

	private AbstractFormula getAllChildren(MClass cls, Variable var){
		List<Function> typeFun = new ArrayList<Function>();
		
		typeFun.add(modelVisitor.getTypeFunction(cls.name()).apply(var));
		for (MClass c : cls.allParents())
			typeFun.add(modelVisitor.getTypeFunction(c.name()).apply(var));
		
		Function[] typeFunArray = typeFun.toArray(new Function[typeFun.size()]);
		
		return typeFun.size() > 1 ?
				(new AndFormula()).merge(typeFunArray)
			:
				typeFun.get(0).apply(var);
	}

	@Override
	public AbstractFormula visitStdOp(ExpStdOp expr){
		Expression[] args = expr.args();
		AbstractFormula expr_formula=null;
		System.out.println("visit StdOp...");
		if(expr.getOperation().isInfixOrPrefix()){
			if (args.length==1){
				AbstractFormula formula = args[0].accept(this);
				expr_formula = TranslateOperation(formula,expr.opname());
			}
			else{
				AbstractFormula formula1 = args[0].accept(this);
				System.out.println("expr operator name:"+expr.opname());
				AbstractFormula formula2 = args[1].accept(this);	
				expr_formula = AssembleFormula(formula1,formula2,expr.opname());
			}
		}else{
			System.out.println("operation:"+expr.opname());
			if(expr.isPre()){}
			if(args.length == 0){
				System.out.println("arg is one...");
			} else {
				System.out.println("visiting args[0]...");
				AbstractFormula arg_formula=args[0].accept(this);
				System.out.println("arg_formula:"+arg_formula);
				System.out.println("args[0]:"+args[0]);
				System.out.println("leaving args[0]...");
				expr_formula = TranslateOperation(arg_formula,expr.opname(),args[0]);
				for (int i=0;i<args.length;i++) System.out.println("arg :"+args[i]);
			}
		}
		System.out.println("leave StdOp...");
		return expr_formula;
	}

	@Override
	public AbstractFormula visitObjAsSet (ExpObjAsSet exp){
		System.out.println("visit obj as set...");
		if (exp.getObjectExpression() instanceof ExpNavigation){
			System.out.println("leave obj as set...");
			return visitNavigation((ExpNavigation)exp.getObjectExpression());
		}
		else{
			System.out.println("leave obj as set...");
			throw new VisitorException("Error: "+exp.getObjectExpression()+" cannot be supported.");
		}

	}
	
	private AbstractFormula TranslateOperation(AbstractFormula formula, String operation){

		if (operation.equals("not")){
			if (formula.isQuantifiedFormula()){
				/* For a quantified formula, this is absolutely nonsense !!! 
				 * Negation has to be applied onto formula itself. Not the quantifiers.
				 * That's why we need to modify this tree again !!!
				 */
				//((QuantifiedFormula)formula).setFormula(new NegFormula( ((QuantifiedFormula)formula).getFormula())); 
				AbstractFormula bformula = ((QuantifiedFormula) formula).getFormula();
				if (bformula.isBinaryFormula())
					((BinaryFormula) bformula).setRight(new NegFormula (((BinaryFormula) bformula).right()));
			}
			return formula;
		}
		else
			return new NegFormula(formula);
			//throw new VisitorException("Exception: operator ["+ operation +"] is not supported in the translation.");
	}

	private AbstractFormula TranslateOperation(AbstractFormula formula, String operation, Expression expr){
		switch (operation){
			case "notEmpty":
				if (expr instanceof ExpNavigation)
					return CollectionOperationNotEmpty(formula, (ExpNavigation) expr);
				else
					return CollectionOperationNotEmpty(formula, null);

			case "isEmpty":
				if (expr instanceof ExpNavigation){
					return new NegFormula(CollectionOperationNotEmpty(formula, (ExpNavigation) expr));
				}
				else if (expr instanceof ExpObjAsSet){
					ExpObjAsSet oas_expr = (ExpObjAsSet) expr;
					if (oas_expr.getObjectExpression() instanceof ExpNavigation){
						ExpNavigation nav_expr = (ExpNavigation)oas_expr.getObjectExpression();
						return new NegFormula(CollectionOperationNotEmpty(formula, nav_expr));
					}
					else{
						return new NegFormula(CollectionOperationNotEmpty(formula, null));
					}
				}
				else{
					return new NegFormula(CollectionOperationNotEmpty(formula, null));
				}
			default: ;
		}
		return null;
	}
		
	private AbstractFormula CollectionOperationNotEmpty(AbstractFormula formula, ExpNavigation expr){
		/* change the original variable to a new bounded variable. */
		if (formula.isFunction())
			formula = ((Function)formula).apply(boundedVar);
		
		if (expr==null){
			return new QuantifiedFormula(Quantifier.EXISTS,
				new Decls(boundedVar),formula);
		}
		else{
			if (_scope!=null){
				Variable v = _scope.lookupF(expr.getObjectExpression().toString());
				Variable[] v1 = new Variable[1];v1[0]=v;
				Constant[] v2 = new Constant[1];v2[0]=boundedVar;
				AbstractFormula relFormula = makeRelations(navname, v2,v1);
				AbstractFormula typeFormula = getAllChildren(expr.getDestination().cls(),boundedVar);
				navname="";
				return new QuantifiedFormula(Quantifier.EXISTS,
					new Decls(boundedVar),new AndFormula(typeFormula, relFormula));
			}
			else{
				return new QuantifiedFormula(Quantifier.EXISTS,
					new Decls(boundedVar),formula);			}
		}
	}

	
	private AbstractFormula AssembleFormula(AbstractFormula f1, AbstractFormula f2, String operator){
		BinaryFormula formula = DecideFormula (operator);
		
		System.out.println("f1:"+f1.toSMT2());
		System.out.println("f2:"+f2.toSMT2());
		
		if (f1.isQuantifiedFormula() && !f2.isQuantifiedFormula()){
			QuantifiedFormula f = makeQuantifiedFormula((QuantifiedFormula)f1,f2,formula);
			if (operator.equals("<>") && f.getFormula().isBinaryFormula()){
				BinaryFormula bformula = (BinaryFormula) f.getFormula();
				bformula.setRight(new NegFormula(bformula.right()));
			}
			return f;
		}

		if (!f1.isQuantifiedFormula() && f2.isQuantifiedFormula()){
			QuantifiedFormula f = makeQuantifiedFormula((QuantifiedFormula)f2,f1,formula);
			if (operator.equals("<>") && f.getFormula().isBinaryFormula()){
				BinaryFormula bformula = (BinaryFormula) f.getFormula();
				bformula.setRight(new NegFormula(bformula.right()));		
			}
			return f;
		}
		
		formula.setLeft(f1);formula.setRight(f2);
		System.out.println("AssembleFormula:"+formula.toSMT2());
		
		return (operator.equals("<>")) ? new NegFormula(formula) : formula;
		
	}

	private BinaryFormula DecideFormula(String operator){
		Connective con=null;
		BinaryFormula formula=null;
		
		switch (operator.toLowerCase()){
			case "and": con = Connective.AND;formula = new AndFormula();break;
			case "or":	con = Connective.OR;formula = new OrFormula();break;
			case "xor": con = Connective.XOR;formula = new OneFormula();break;
			case "implies":	con = Connective.IMPLIES;formula = new ImpliesFormula();break;
			//case "not":	con = Connective.NOT;formula = new NegFormula();break;
			case "<>":;
			case "=":	con = Connective.EQUAL;formula= new EqFormula();break;
			case "+":	con = Connective.MUL;formula=new ArithmeticFormula(con);break;
			case "-": 	con = Connective.MINUS;formula = new ArithmeticFormula(con);break;		
			case "*":	con = Connective.MUL;formula = new ArithmeticFormula(con);break;
			case "/":	con = Connective.DIV;formula = new ArithmeticFormula(con);break;
			case ">":	con = Connective.GREATER;formula = new ComparisonFormula(con);break;
			case "<":	con = Connective.LESS;formula = new ComparisonFormula(con);break;
			case ">=":	con = Connective.GEQ;formula = new ComparisonFormula(con);break;
			case "<=":	con = Connective.LEQ;formula = new ComparisonFormula(con);break;		
			default: throw new VisitorException("Exception: operator ["+ operator +"] is not supported in the translation.");
		}

		return formula;
	}

	private QuantifiedFormula makeQuantifiedFormula(QuantifiedFormula f1, AbstractFormula f2, BinaryFormula f3){
		AbstractFormula formula = f1.getFormula();
		
		if (formula.isBinaryFormula()){
			f3.setLeft(((BinaryFormula)formula).right());
			f3.setRight(f2);
			((BinaryFormula)formula).setRight(f3);
		}
		else{
			throw new VisitorException("Exception: A binary formula is expected.");
		}
		
		System.out.println("quantified:"+f1.toSMT2());
		return f1;
	}

	@Override
	public AbstractFormula visitVariable(ExpVariable expr){
		System.out.println("visiting variable...");
		if (expr.getVarname().equals("self"))
			return new QuantifiedFormula (Quantifier.FORALL,null,null);
		
		if (_scope!=null){
			Variable v = _scope.lookupF(expr.getVarname());
			//System.out.println("var name:"+v.name());
			if (v==null) throw new VisitorException("Exception: "+expr.getVarname()+" is expected to be found within the scope.");
			return modelVisitor.getObjFunction().apply(v);
		}
	
		System.out.println("leaving variable...");
		return null;
	}
}
