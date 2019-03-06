package org.tzi.use.query.ast;
import org.tzi.use.query.visitor.AbstractVisitor;

public class QAssocExpr extends QFeatureExpr{
    private String name;
    private String endA;
    private String endB;

    public QAssocExpr(String endA, String name, String endB){
        this.endA = endA;
        this.endB = endB;
        this.name = name;
    }
    public QAssocExpr(String endA, String name, String endB, int k){
        this(endA, name, endB);
        this.setRank(k);
    }

    public String name(){return this.name;}
    public String endA(){return this.endA;}
    public String endB(){return this.endB;}

    @Override
    public boolean isAttrExpr(){return true;}

    @Override
    public String toString(){
        
        return  (this.rank()>0) ? 
                this.endA+":"+this.name+":"+this.endB +'@'+this.rank() 
                :
                this.endA+":"+this.name+":"+this.endB;
    }

    public void accept(AbstractVisitor visitor){
        visitor.visitAssocExpr(this);
    }
}