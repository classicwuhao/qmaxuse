package org.tzi.use.query.visitor;
import org.tzi.use.query.ast.*;

public abstract class AbstractVisitor{
    public abstract void visitQueryExpr(QueryExpr e);
    public abstract void visitClassExpr (QClassExpr e);
    public abstract void visitAttrExpr (QAttrExpr e);
    public abstract void visitAssocExpr (QAssocExpr e);
    public abstract void visitInvExpr (QInvExpr e);
    
}