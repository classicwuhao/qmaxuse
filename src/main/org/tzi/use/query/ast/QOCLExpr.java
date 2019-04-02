package org.tzi.use.query.ast;

import org.tzi.use.parser.ocl.*;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import org.tzi.use.query.visitor.AbstractVisitor;

/* A Wrapper class for holding simple OCL expressions. */ 
public class QOCLExpr extends QAst{
    private List<ASTExpression> expressions;
    private HashMap<ASTExpression, Integer> rankMap;

    public QOCLExpr(){
        expressions = new ArrayList<ASTExpression>();
        rankMap = new HashMap<ASTExpression, Integer>();
    }
    public QOCLExpr (ASTExpression expr){
        this();
        this.expressions.add(expr);
    }

    public List<ASTExpression> expression(){return this.expressions;}
    public void addOCLExpression(ASTExpression expr){
        this.expressions.add(expr);
    }

    public void addOCLExpression(ASTExpression expr, int k){
        if (!rankMap.containsKey(expr)) {
            this.expressions.add(expr);
            rankMap.put(expr,k);
        }
    }

    public int getRank(ASTExpression expr){
        if (rankMap.containsKey(expr))
            return rankMap.get(expr);
        else    
            return 0;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        ASTExpression expr =null;
        
        for (int i=0;i<expressions.size()-1;i++){
            expr = expressions.get(i);
            if (this.rankMap.containsKey(expr))
                sb.append(expr.toString()+"@"+this.rankMap.get(expr)+" , ");
            else    
                sb.append(expr.toString()+" , ");
        }
        
        expr = expressions.get(expressions.size()-1);
        if (this.rankMap.containsKey(expr))
            sb.append(expr.toString()+"@"+this.rankMap.get(expr)+" , ");
        else
            sb.append(expr.toString()+" , ");

        return sb.toString();
    }

    public void accept (AbstractVisitor visitor){
        visitor.visitOCLExpr(this);
    }

}