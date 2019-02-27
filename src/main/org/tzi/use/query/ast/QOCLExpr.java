package org.tzi.use.query.ast;

import org.tzi.use.parser.ocl.*;

/*A Wrapper class for holding simple OCL expressions. */ 
public class QOCLExpr extends QAst{
    private ASTExpression expr;

    public QOCLExpr(){}
    public QOCLExpr (ASTExpression expr){
        this.expr = expr;
    }

    public ASTExpression expression(){return this.expr;}
    public void setExpression(ASTExpression expr){
        this.expr = expr;
    }

    public String toString(){

        return this.expr.toString();
    }

}