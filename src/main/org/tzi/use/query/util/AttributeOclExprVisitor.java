package org.tzi.use.query.util;
import org.tzi.use.uml.mm.*;
import org.tzi.use.uml.ocl.type.*;
import org.tzi.use.uml.ocl.expr.*;
import java.util.List;

public final class AttributeOclExprVisitor implements AbstractOclExprVisitor{
	private MAttribute attribute=null;
	private boolean used = false;
	
	public AttributeOclExprVisitor(){}
	
	public AttributeOclExprVisitor(MAttribute attribute){
		this.attribute = attribute;
	}

	public void visitAttrOp (ExpAttrOp exp){
		if (exp.attr()==this.attribute) this.used = true;
		exp.objExp().accept(this);
	}
	
	public void initialise(MAttribute attribute){
		this.attribute = attribute;
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

