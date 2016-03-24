
package org.tzi.use.uran.visitor;

import org.tzi.use.uml.mm.*;
import org.tzi.use.uml.ocl.type.*;
import org.tzi.use.uml.ocl.expr.*;
import uran.formula.*;
import java.util.List;

public interface AbstractExprVisitor{

	//void visitAllInstances (ExpAllInstances exp);
	//void visitAny (ExpAny exp);
	//void visitAsType (ExpAsType exp);
	AbstractFormula visitAttrOp (ExpAttrOp exp);
	//void visitBagLiteral (ExpBagLiteral exp);
	//void visitCollect (ExpCollect exp);
	//void visitCollectNested (ExpCollectNested exp);
	AbstractFormula visitConstBoolean (ExpConstBoolean exp);
	AbstractFormula visitConstEnum (ExpConstEnum exp);
	AbstractFormula visitConstInteger (ExpConstInteger exp);
	//void visitConstReal (ExpConstReal exp);
	//void visitConstString (ExpConstString exp);
	//void visitEmptyCollection (ExpEmptyCollection exp);
	AbstractFormula visitExists (ExpExists exp);
	AbstractFormula visitForAll (ExpForAll exp);
	//void visitIf (ExpIf exp);
	//void visitIsKindOf (ExpIsKindOf exp);
	//void visitIsTypeOf (ExpIsTypeOf exp);
	//void visitIsUnique (ExpIsUnique exp);
	//void visitIterate (ExpIterate exp);
	//void visitLet (ExpLet exp);
	AbstractFormula visitNavigation (ExpNavigation exp);
	AbstractFormula visitObjAsSet (ExpObjAsSet exp);
	//void visitObjOp (ExpObjOp exp);
	//void visitObjRef (ExpObjRef exp);
	//void visitOne (ExpOne exp);
	//void visitOrderedSetLiteral (ExpOrderedSetLiteral exp);
	//void visitQuery (ExpQuery exp);
	//void visitReject (ExpReject exp);
	//void visitWithValue (ExpressionWithValue exp);
	AbstractFormula visitSelect (ExpSelect exp);
	//void visitSequenceLiteral (ExpSequenceLiteral exp);
	//void visitSetLiteral (ExpSetLiteral exp);
	//void visitSortedBy (ExpSortedBy exp);
	AbstractFormula visitStdOp (ExpStdOp exp);
	//void visitTupleLiteral (ExpTupleLiteral exp);
	//void visitTupleSelectOp (ExpTupleSelectOp exp);
	//void visitUndefined (ExpUndefined exp);
	AbstractFormula visitVariable (ExpVariable exp);
	//void visitClosure(ExpClosure exp);
	//void visitOclInState(ExpOclInState exp);
	List<AbstractFormula> visitVarDeclList(VarDeclList varDeclList);
	AbstractFormula visitVarDecl(VarDecl varDecl);
	//void visitObjectByUseId(ExpObjectByUseId exp);
	//void visitConstUnlimitedNatural(ExpConstUnlimitedNatural exp);
	//void visitSelectByKind(ExpSelectByKind exp);
	//void visitExpSelectByType(ExpSelectByType exp);
	//void visitRange(ExpRange exp);
	//void visitNavigationClassifierSource(ExpNavigationClassifierSource exp);
}

