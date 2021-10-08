package org.tzi.use.query.util;
import org.tzi.use.uml.mm.*;
import org.tzi.use.uml.ocl.type.*;
import org.tzi.use.uml.ocl.expr.*;
import java.util.List;
import java.util.ArrayList;

public final class AttributeOclExprVisitor implements AbstractOclExprVisitor{
	private MAttribute attribute=null;
	private boolean used = false;
	private List<MAttribute> attributes = new ArrayList<MAttribute>();
	private List<MAssociation> associations = new ArrayList<MAssociation>();

	public AttributeOclExprVisitor(){}
	
	public AttributeOclExprVisitor(MAttribute attribute){
		this.attribute = attribute;
	}

	public void visitAttrOp (ExpAttrOp exp){
		if (exp.attr()==this.attribute) this.used = true;
		attributes.add(exp.attr());
		exp.objExp().accept(this);
	}
	
	public List<MAttribute> attributes(){return this.attributes;}

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
		associations.add(exp.getSource().association());
		associations.add(exp.getDestination().association());
	}

	public List<MAssociation> associations(){return this.associations;}
	
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

