package org.tzi.use.query.ast;
import org.tzi.use.query.visitor.AbstractVisitor;

public class QueryBinaryExpr extends QAst{
    private QAst expr1;
    private QAst expr2;
    private Connective operator;

    public QueryBinaryExpr(QAst expr1, QAst expr2,Connective operator){
        this.expr1=expr1;
        this.expr2=expr2;
        this.operator=operator;
    }

    public void setLeft(QAst expr1){
        this.expr1 = expr1;
    }

    public void setRight(QAst expr2){
        this.expr2 = expr2;
    }

    public void setOperator(Connective operator){
        this.operator = operator;
    }

    public String toString(){
        return this.expr1.toString() + " " + this.operator.toString() + " " + this.expr2.toString();
    }

    public QAst left(){return this.expr1;}
    public QAst right(){return this.expr2;}
    public Connective operator(){return this.operator;}
    
    @Override
    public boolean isBinaryQuery(){return true;}

    public void accept(AbstractVisitor visitor){
        visitor.visitBinaryExpr(this);
    }
}


