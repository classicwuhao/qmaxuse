package org.tzi.use.query.ast;

public class QClassExpr extends QFeatureExpr{
    private String name;
    private boolean pure;

    public QClassExpr (String name, boolean pure){
        this.name = name;
        this.pure = pure;
    }
    public String name(){return this.name;}
    public boolean pure(){return this.pure;}

    @Override
    public boolean isClassExpr(){return true;}

    @Override
    public String toString(){
        return "<"+this.name+","+pure+">";
    }
}