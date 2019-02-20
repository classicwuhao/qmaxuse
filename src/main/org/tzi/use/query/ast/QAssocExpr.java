package org.tzi.use.query.ast;

public class QAssocExpr extends QFeatureExpr{
    private String name;
    private String endA;
    private String endB;

    public QAssocExpr(String endA, String name, String endB){
        this.endA = endA;
        this.endB = endB;
        this.name = name;
    }

    public String name(){return this.name;}
    public String endA(){return this.endA;}
    public String endB(){return this.endB;}

    @Override
    public boolean isAttrExpr(){return true;}

    @Override
    public String toString(){
        return this.endA+":"+this.name+":"+this.endB;
    }
}