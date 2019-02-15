package org.tzi.use.query.ast;

public class QueryBinaryExpr extends QAst{
    private QueryExpr expr1;
    private QueryExpr expr2;
    private Connective operator;

    public QueryBinaryExpr(QueryExpr expr1, QueryExpr expr2,Connective operator){
        this.expr1=expr1;
        this.expr2=expr2;
        this.operator=operator;
    }

    public void setLeft(QueryExpr expr1){
        this.expr1 = expr1;
    }

    public void setRight(QueryExpr expr2){
        this.expr2 = expr2;
    }

    public void setOperator(Connective operator){
        this.operator = operator;
    }

    public String toString(){
        return this.expr1.toString() + this.operator.toString()+ this.expr2.toString();
    }


}


