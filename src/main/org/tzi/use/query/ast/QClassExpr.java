package org.tzi.use.query.ast;

import org.tzi.use.query.visitor.AbstractVisitor;

public class QClassExpr extends QFeatureExpr{
    private String name;
    
    public QClassExpr (String name, Modifier modifier){
        this.name = name;
        super.setModifier(modifier);
    }

    public QClassExpr (String name, Modifier modifier, int k){
        this(name,modifier);
        this.setRank(k);
    }

    public String name(){return this.name;}
    //public Modifier modifier(){return this.modifier;}

    @Override
    public boolean isClassExpr(){return true;}
    
    @Override
    public String toString(){
        String str = (super.getModifier()==null) ? this.name+" " : " "+super.getModifier()+" "+this.name+" ";
        str = (this.rank()>0) ? str+'@'+this.rank() : str;

        return str;
    }

    public void accept(AbstractVisitor visitor){
        visitor.visitClassExpr(this);
    }
}