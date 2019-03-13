package org.tzi.use.query.visitor;
import org.tzi.use.query.ast.*;

public abstract class AbstractVisitor{
    public abstract void visitQueryExpr(QueryExpr e);
    public abstract void visitClassExpr (QClassExpr e);
    public abstract void visitAttrExpr (QAttrExpr e);
    public abstract void visitAssocExpr (QAssocExpr e);
    public abstract void visitInvExpr (QInvExpr e);
    public abstract void visitCheckExpr (CheckExpr e);
    public abstract void visitWithExpr (QWithExpr e);
    public abstract void visitButExpr (QButExpr e);
    public abstract void visitModuleAliasExpr(ModuleAliasExpr e);
}