package org.tzi.use.query.ast;
import org.tzi.use.query.visitor.AbstractVisitor;

public class QInvExpr extends QFeatureExpr{
    private String name;
    private String context;

    public QInvExpr(String context, String name){
        this.context = context;
        this.name = name;
    }

    public QInvExpr(String context, String name, int k){
        this (context, name);
        this.setRank(k);
    }

    public String name(){return this.name;}
    public String context(){return this.context;}

    public String toString(){
        return  (this.rank()>0) ? 
                this.context+"::"+this.name+'@'+this.rank() 
                : 
                this.context+"::"+this.name
                ;
    }

    public boolean isInvExpr(){return true;}

    public void accept(AbstractVisitor visitor){
        visitor.visitInvExpr(this);
    }
}