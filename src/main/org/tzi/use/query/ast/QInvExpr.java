package org.tzi.use.query.ast;

public class QInvExpr extends QFeatureExpr{

    private String name;
    private String context;

    public QInvExpr(String context, String name){
        this.context = context;
        this.name = name;
    }

    public String name(){return this.name;}
    public String context(){return this.context;}

    public String toString(){
        return this.context+"::"+this.name;
    }

    public boolean isInvExpr(){return true;}

}