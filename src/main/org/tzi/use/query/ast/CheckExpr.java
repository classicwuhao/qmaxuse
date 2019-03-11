package org.tzi.use.query.ast;

import org.tzi.use.query.visitor.AbstractVisitor;

public class CheckExpr extends QAst{
    private QueryExpr expr;
    private QueryBinaryExpr bexpr;
    private ModuleListExpr mexpr;

    public CheckExpr(){}


    public void setQueryBinaryExpr(QueryBinaryExpr bexpr){
        this.bexpr = bexpr;
    }

    public void setQueryExpr(QueryExpr qexpr){
        this.expr = qexpr;
    }

    public void setModuleListExpr(ModuleListExpr mexpr){
        this.mexpr=mexpr;
    }

    public QueryExpr query(){return this.expr;}
    public QueryBinaryExpr biquery(){return this.bexpr;}
    public ModuleListExpr modules(){return this.mexpr;}

    public String toString(){
        return "CheckExpr";
    }

    public void accept (AbstractVisitor visitor){
        visitor.visitCheckExpr(this);
    }

}