package org.tzi.use.uran.visitor;
import org.tzi.use.uml.ocl.expr.*;
import org.tzi.use.uml.mm.*;
import uran.formula.*;
import uran.formula.value.*;
import uran.formula.type.*;
import uran.formula.smt2.*;
import uran.formula.type.*;
import uran.solver.*;

public class ExprPrintVisitor implements ExpressionVisitor {
	
	private FunctionFactory factory;
	
	public ExprPrintVisitor(FunctionFactory fun_factory){
		this.factory = fun_factory;		
	}
	
	public void visitAllInstances (ExpAllInstances expr){
		System.out.println("visiting allInstances...");
		
		System.out.println("leaving allInstances...");
		System.out.println();
	}
	public void visitAny (ExpAny exp){}
	public void visitAsType (ExpAsType exp){}
	
	@Override
	public void visitAttrOp (ExpAttrOp exp){
		System.out.println("visit attrop...");
		exp.objExp().processWithVisitor(this);
		MAttribute attr = exp.attr();
		System.out.println(attr.name());
		System.out.println ("leave attrop...");
	}
	
	public void visitBagLiteral (ExpBagLiteral exp){}
	public void visitCollect (ExpCollect exp){}
	public void visitCollectNested (ExpCollectNested exp){}
	public void visitConstBoolean (ExpConstBoolean exp){}
	public void visitConstEnum (ExpConstEnum exp){}

	@Override	
	public void visitConstInteger (ExpConstInteger exp){
		System.out.println("visit constant integer...");
		System.out.println("value:"+exp.value());
		System.out.println("leave constant integer...");
	}

	public void visitConstReal (ExpConstReal exp){}
	public void visitConstString (ExpConstString exp){}
	public void visitEmptyCollection (ExpEmptyCollection exp){}

	public void visitExists (ExpExists expr){
		System.out.println("visiting exist...");
		visitQuery(expr);
		System.out.println("leaving exist...");
	}

	public void visitForAll (ExpForAll expr){
		System.out.println("visiting forall...");
		visitQuery(expr);
		System.out.println("leaving forall...");
	}

	public void visitIf (ExpIf exp){}
	public void visitIsKindOf (ExpIsKindOf exp){}
	public void visitIsTypeOf (ExpIsTypeOf exp){}
	public void visitIsUnique (ExpIsUnique exp){}
	public void visitIterate (ExpIterate exp){}
	public void visitLet (ExpLet exp){}
	public void visitNavigation (ExpNavigation exp){}
	public void visitObjAsSet (ExpObjAsSet exp){}
	public void visitObjOp (ExpObjOp exp){}
	public void visitObjRef (ExpObjRef exp){}
	public void visitOne (ExpOne exp){}
	public void visitOrderedSetLiteral (ExpOrderedSetLiteral exp){}
	
	public void visitQuery (ExpQuery expr){
		System.out.println("visiting query...");
		visitQuery(expr,null);
		System.out.println("leaving query...");
	}

	private void visitQuery(ExpQuery expr, VarInitializer accuInitializer){
		System.out.println("visiting query...2 arguments.");
		expr.getRangeExpression().processWithVisitor(this);
		System.out.println("name:"+expr.name());
	
		if (accuInitializer != null) {
			accuInitializer.getVarDecl().processWithVisitor(this);
			accuInitializer.initExpr().processWithVisitor(this);
		}		
		
		expr.getVariableDeclarations().processWithVisitor(this);
		System.out.println("leaving query...2 arguments.");
		expr.getQueryExpression().processWithVisitor(this);
	}

	public void visitReject (ExpReject exp){}
	public void visitWithValue (ExpressionWithValue exp){}
	public void visitSelect (ExpSelect exp){}
	public void visitSequenceLiteral (ExpSequenceLiteral exp){}
	public void visitSetLiteral (ExpSetLiteral exp){}
	public void visitSortedBy (ExpSortedBy exp){}

	@Override
	public void visitStdOp (ExpStdOp exp){
		System.out.println("visit stdop...");
		Expression[] args = exp.args();
		
		if(exp.getOperation().isInfixOrPrefix()){
			System.out.println("infixprefix:");
			if(args.length == 1){
				System.out.println("opname:"+exp.opname());
				args[0].processWithVisitor(this);
			}else{
				System.out.println("("+exp);
				args[0].processWithVisitor(this);
				System.out.println("exp:"+exp.opname());
				args[1].processWithVisitor(this);
				System.out.println(")");
			}
		}
		else{
			if (args.length==0){
				System.out.println("operation:"+exp.opname());
			}
			else{
				System.out.println("op:"+exp.opname());
				args[0].processWithVisitor(this);
			}
			System.out.println("none:");
		}
		System.out.println("leave stdop...");
	}

	public void visitTupleLiteral (ExpTupleLiteral exp){}
	public void visitTupleSelectOp (ExpTupleSelectOp exp){}
	public void visitUndefined (ExpUndefined exp){}

	@Override
	public void visitVariable (ExpVariable exp){
		System.out.println("visit variable...");
		System.err.println(exp.getVarname());
		System.out.println(exp.type());
		System.out.println("leave variable...");
	}

	public void visitClosure(ExpClosure exp){}
	public void visitOclInState(ExpOclInState exp){}
	public void visitVarDeclList(VarDeclList varDeclList){
		System.out.println("visiting VarDecl...");
		for (int i = 0; i < varDeclList.size(); ++i)
			varDeclList.varDecl(i).processWithVisitor(this);
		
		System.out.println("leaving VarDecl...");
	}

	public void visitVarDecl(VarDecl varDecl){
		System.out.println("visiting vardecl...");
		System.out.println("var name:"+varDecl.name());
		System.out.println("var type:"+varDecl.type());
		System.out.println("leaving vardecl...");
	}
	
	public void visitObjectByUseId(ExpObjectByUseId exp){}
	public void visitConstUnlimitedNatural(ExpConstUnlimitedNatural exp){}
	public void visitSelectByKind(ExpSelectByKind exp){}
	public void visitExpSelectByType(ExpSelectByType exp){}
	
	public void visitRange(ExpRange expr){
		System.out.println("visiting range...");
		expr.getEnd().processWithVisitor(this);
		expr.getEnd().processWithVisitor(this);
		System.out.println("leaving range...");
	}
	
	public void visitNavigationClassifierSource(ExpNavigationClassifierSource exp){}
		
}
