package org.tzi.use.query.ast;

import org.tzi.use.query.visitor.AbstractVisitor;

public class CheckExpr extends QAst{
    private QueryExpr expr;
    private QueryBinaryExpr bexpr;

    public CheckExpr(){}


    public void setQueryBinaryExpr(QueryBinaryExpr bexpr){
        this.bexpr = bexpr;
    }

    public void setQueryExpr(QueryExpr qexpr){
        this.expr = qexpr;
    }

    public String toString(){
        return "CheckExpr";
    }

    public void accept (AbstractVisitor visitor){
        visitor.visitCheckExpr(this);
    }

}