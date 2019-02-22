package org.tzi.use.query.ast;

public class QClassExpr extends QFeatureExpr{
    private String name;
    private Modifier modifier;
    
    public QClassExpr (String name, Modifier modifier){
        this.name = name;
        this.modifier = modifier;
    }
    public String name(){return this.name;}
    public Modifier modifier(){return this.modifier;}

    @Override
    public boolean isClassExpr(){return true;}

    @Override
    public String toString(){
        return 
                (this.modifier==null) 
                ? 
                this.name+" " 
                : " "+this.modifier+" "+this.name+" ";
    }
}