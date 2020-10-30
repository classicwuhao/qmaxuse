package org.tzi.use.query.util;
import org.tzi.use.uml.mm.*;
import org.tzi.use.uml.ocl.type.*;
import org.tzi.use.uml.ocl.expr.*;
import java.util.*;

public final class InvOclExprVisitor implements AbstractOclExprVisitor{
	private HashSet<MAttribute> attrs = new HashSet<MAttribute>();
	private HashSet<MAssociation> navgs = new HashSet<MAssociation>();
	private HashSet<MClass> cls = new HashSet<MClass>();
	private MModel model;

	public InvOclExprVisitor(MModel model){
		this.model = model;
	}
	
	public void visitAttrOp (ExpAttrOp exp){
		attrs.add(exp.attr());
		exp.objExp().accept(this);
	}
	
	public HashSet<MClass> classes(){return this.cls;}
	public HashSet<MAttribute> attributes(){return this.attrs;}
	public HashSet<MAssociation> associations(){return this.navgs;}
	
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
		query.getVariableDeclarations().accept(this);
		query.getRangeExpression().accept(this);
		query.getQueryExpression().accept(this);
		
	}
	
	public void visitNavigation (ExpNavigation exp){
		//if (exp.getDestination()) ;
		navgs.add(exp.getSource().association());
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
		for (int i=0;i<varDeclList.size();i++){
			VarDecl var = varDeclList.varDecl(i);
			if (var.type().isTypeOfClass()){
				cls.add(this.model.getClass(var.type().shortName()));
			}
		}
	}

	public void visitVarDecl(VarDecl varDecl){

	}
	
}

