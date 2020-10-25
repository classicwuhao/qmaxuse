package org.tzi.use.query.util;
import org.tzi.use.uml.mm.*;
import org.tzi.use.uml.ocl.type.*;
import org.tzi.use.uml.ocl.expr.*;
import java.util.List;

public final class ClassOclExprVisitor implements AbstractOclExprVisitor{
	private MClass cls;
	private boolean used = false;
	
	public ClassOclExprVisitor(){}
	
	public ClassOclExprVisitor(MClass cls){
		this.cls = cls;
	}

	public void visitAttrOp (ExpAttrOp exp){
		exp.objExp().accept(this);
	}
	
	public void initialise(MClass cls){
		this.cls = cls;
		this.used = false;
	}

	public boolean isUsed(){return this.used;}

	public void visitConstBoolean (ExpConstBoolean exp){
		
	}

	public void visitConstEnum (ExpConstEnum exp){

	}

	public void visitConstInteger (ExpConstInteger exp){

	}
	
	public void visitExists (ExpExists exp){
		visitQuery(exp);
	}

	public void visitForAll (ExpForAll exp){
		visitQuery(exp); 
	}

	private void visitQuery (ExpQuery query){
		query.getRangeExpression().accept(this);
		query.getQueryExpression().accept(this);
	}
	
	public void visitNavigation (ExpNavigation exp){
		if (exp.getDestination().cls()==this.cls) this.used=true;
		exp.getObjectExpression().accept(this);
	}

	public void visitObjAsSet (ExpObjAsSet exp){
		exp.getObjectExpression().accept(this);
	}
	
	public void visitSelect (ExpSelect exp){
		visitQuery(exp);
	}
	
	public void visitStdOp (ExpStdOp exp){
		for (Expression expr: exp.args()) expr.accept(this);
	}
	
	public void visitVariable (ExpVariable exp){
		
	}
	
	public void visitVarDeclList(VarDeclList varDeclList){

	}

	public void visitVarDecl(VarDecl varDecl){

	}
	
}

