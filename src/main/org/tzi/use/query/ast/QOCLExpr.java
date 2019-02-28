package org.tzi.use.query.ast;

import org.tzi.use.parser.ocl.*;
import java.util.List;
import java.util.ArrayList;

/* A Wrapper class for holding simple OCL expressions. */ 
public class QOCLExpr extends QAst{
    private List<ASTExpression> expressions;

    public QOCLExpr(){
        expressions = new ArrayList<ASTExpression>();
    }
    public QOCLExpr (ASTExpression expr){
        this();
        this.expressions.add(expr);
    }

    public List<ASTExpression> expression(){return this.expressions;}
    public void addOCLExpression(ASTExpression expr){
        this.expressions.add(expr);
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<expressions.size()-1;i++)
            sb.append(expressions.get(i).toString()+ " , ");
        
        sb.append(expressions.get(expressions.size()-1).toString());
        return sb.toString();
    }

}