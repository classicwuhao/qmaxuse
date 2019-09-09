package org.tzi.use.query.util;
import org.tzi.use.uml.mm.*;
import org.tzi.use.uml.ocl.type.*;
import org.tzi.use.uml.ocl.expr.*;
import java.util.List;

public final class AttributeOclExprVisitor implements AbstractOclExprVisitor{
	private MAttribute attribute=null;
	public boolean used = false;
	
	public AttributeOclExprVisitor(MAttribute attribute){
		this.attribute = attribute;
	}

	public void visitAttrOp (ExpAttrOp exp){
		if (exp.attr()==this.attribute) this.used = true;
	}
	
	public void visitConstBoolean (ExpConstBoolean exp){
	
	}

	public void visitConstEnum (ExpConstEnum exp){

	}

	public void visitConstInteger (ExpConstInteger exp){

	}
	
	public void visitExists (ExpExists exp){

	}

	public void visitForAll (ExpForAll exp){

	}

	public void visitNavigation (ExpNavigation exp){

	}

	public void visitObjAsSet (ExpObjAsSet exp){

	}
	
	public void visitSelect (ExpSelect exp){
		
	}
	
	public void visitStdOp (ExpStdOp exp){

	}
	
	public void visitVariable (ExpVariable exp){

	}
	
	public void visitVarDeclList(VarDeclList varDeclList){

	}

	public void visitVarDecl(VarDecl varDecl){

	}
	
}

