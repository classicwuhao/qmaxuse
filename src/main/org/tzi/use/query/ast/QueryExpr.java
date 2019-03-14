package org.tzi.use.query.ast;

import java.util.List;
import java.util.ArrayList;
import org.tzi.use.query.visitor.AbstractVisitor;

public class QueryExpr extends QAst{
    private List<QFeatureExpr> features;
    private QWithExpr withExpr;
    private QButExpr withoutExpr;
    private QOCLExpr oclExpr;
    private String alias ="";
    private boolean pure_aliased=false;

    public QueryExpr(){
        features = new ArrayList<QFeatureExpr>();
    }

    public void addFeature(QFeatureExpr expr){
        features.add (expr);
    }

    public void addWithExpr(QWithExpr expr){
        this.withExpr = expr;
    }

    public void addWithoutExpr(QButExpr expr){
        this.withoutExpr = expr;
    }

    public void setOCLExpression(QOCLExpr expr){
        this.oclExpr = expr;
    }

    public void setAlias(String alias){
        this.alias = alias;
    }

    public boolean isPureAliased(){return this.pure_aliased;}
    public void setPureAliased(){this.pure_aliased=true;}
    public boolean isAliased(){return !this.alias.equals("");}
    
    public boolean containInjection(){
        if (oclExpr!=null)
            return oclExpr.expression().size()>0;
        return false;
    }
    public List<QFeatureExpr> features(){return this.features;}
    public QWithExpr withExpr(){return this.withExpr;}
    public QButExpr butExpr(){return this.withoutExpr;}
    public QOCLExpr oclExpr(){return this.oclExpr;}
    public String alias(){return this.alias;}
    public void accept(AbstractVisitor visitor){
        visitor.visitQueryExpr(this);
    }

    public boolean isModuleAlised(){return false;}

    @Override
    public boolean isQuery(){return true;}

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("select ");
        if (features.size()>0){
            for (int i=0;i<features.size()-1;i++ )
                sb.append(features.get(i).toString()+", ");

            sb.append(features.get(features.size()-1));
        }
        
        if (withExpr!=null){
           if (withExpr.expressions().size()!=0){
                List<QInvExpr> withInvExprs = withExpr.expressions();
                sb.append(" with ");
                for (int i=0;i<withInvExprs.size()-1;i++ )
                sb.append(withInvExprs.get(i).toString()+", ");

                sb.append(withInvExprs.get(withInvExprs.size()-1));
            }
        }

        if (withoutExpr!=null){
            if (withoutExpr.expressions().size()!=0){
                List<QInvExpr> withoutInvExprs = withoutExpr.expressions();
                sb.append(" but ");
                for (int i=0;i<withoutInvExprs.size()-1;i++ )
                sb.append(withoutInvExprs.get(i).toString()+", ");

                sb.append(withoutInvExprs.get(withoutInvExprs.size()-1));
            }
        }

        if (oclExpr!=null){
            sb.append(" inject {");
            sb.append(oclExpr.toString());
            sb.append("}");
        }

        return (this.alias.length()!=0) ? sb.toString()+ " as " + this.alias : sb.toString();
    }
}