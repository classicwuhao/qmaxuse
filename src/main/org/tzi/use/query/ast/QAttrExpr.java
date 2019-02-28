package org.tzi.use.query.ast;

public class QAttrExpr extends QFeatureExpr{
    private String container;
    private String name;

    public QAttrExpr(String container, String name){
        this.container = container;
        this.name = name;
    }

    public QAttrExpr(String container, String name, int k){
        this (container, name);
        this.setRank(k);
    }

    public String name(){return this.name;}
    public String container(){return this.container;}

    @Override
    public boolean isAttrExpr(){return true;}

    @Override
    public String toString(){
        return  (this.rank()>0) ? 
                this.container+"."+this.name+"@"+this.rank()
                :
                this.container+"."+this.name;
    }
}