package org.tzi.use.query.ast;

import java.util.List;
import java.util.ArrayList;

public class QueryExpr extends QAst{
    private List<QFeatureExpr> features;
    private QWithExpr withExpr;
    private QButExpr withoutExpr;
    private String alias ="";

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

    public void setAlias(String alias){
        this.alias = alias;
    }

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
        return (this.alias.length()!=0) ? sb.toString()+ " As " + this.alias : sb.toString();
    }
}