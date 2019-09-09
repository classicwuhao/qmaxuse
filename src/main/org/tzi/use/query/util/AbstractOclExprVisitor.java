
package org.tzi.use.query.util;
import org.tzi.use.uml.mm.*;
import org.tzi.use.uml.ocl.type.*;
import org.tzi.use.uml.ocl.expr.*;
import java.util.List;

public interface AbstractOclExprVisitor{
	//void visitAllInstances (ExpAllInstances exp);
	//void visitAny (ExpAny exp);
	//void visitAsType (ExpAsType exp);
	void visitAttrOp (ExpAttrOp exp);
	//void visitBagLiteral (ExpBagLiteral exp);
	//void visitCollect (ExpCollect exp);
	//void visitCollectNested (ExpCollectNested exp);
	void visitConstBoolean (ExpConstBoolean exp);
	void visitConstEnum (ExpConstEnum exp);
	void visitConstInteger (ExpConstInteger exp);
	//void visitConstReal (ExpConstReal exp);
	//void visitConstString (ExpConstString exp);
	//void visitEmptyCollection (ExpEmptyCollection exp);
	void visitExists (ExpExists exp);
	void visitForAll (ExpForAll exp);
	//void visitIf (ExpIf exp);
	//void visitIsKindOf (ExpIsKindOf exp);
	//void visitIsTypeOf (ExpIsTypeOf exp);
	//void visitIsUnique (ExpIsUnique exp);
	//void visitIterate (ExpIterate exp);
	//void visitLet (ExpLet exp);
	void visitNavigation (ExpNavigation exp);
	void visitObjAsSet (ExpObjAsSet exp);
	//void visitObjOp (ExpObjOp exp);
	//void visitObjRef (ExpObjRef exp);
	//void visitOne (ExpOne exp);
	//void visitOrderedSetLiteral (ExpOrderedSetLiteral exp);
	//void visitQuery (ExpQuery exp);
	//void visitReject (ExpReject exp);
	//void visitWithValue (ExpressionWithValue exp);
	void visitSelect (ExpSelect exp);
	//void visitSequenceLiteral (ExpSequenceLiteral exp);
	//void visitSetLiteral (ExpSetLiteral exp);
	//void visitSortedBy (ExpSortedBy exp);
	void visitStdOp (ExpStdOp exp);
	//void visitTupleLiteral (ExpTupleLiteral exp);
	//void visitTupleSelectOp (ExpTupleSelectOp exp);
	//void visitUndefined (ExpUndefined exp);
	void visitVariable (ExpVariable exp);
	//void visitClosure(ExpClosure exp);
	//void visitOclInState(ExpOclInState exp);
	void visitVarDeclList(VarDeclList varDeclList);
	void visitVarDecl(VarDecl varDecl);
	//void visitObjectByUseId(ExpObjectByUseId exp);
	//void visitConstUnlimitedNatural(ExpConstUnlimitedNatural exp);
	//void visitSelectByKind(ExpSelectByKind exp);
	//void visitExpSelectByType(ExpSelectByType exp);
	//void visitRange(ExpRange exp);
	//void visitNavigationClassifierSource(ExpNavigationClassifierSource exp);
}

