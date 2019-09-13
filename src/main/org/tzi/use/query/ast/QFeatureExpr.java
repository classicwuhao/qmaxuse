package org.tzi.use.query.ast;

public abstract class QFeatureExpr extends QAst{
    private Modifier modifier=Modifier.DEFAULT; //default modifier.

    public boolean isClassExpr(){return false;}
    public boolean isAttrExpr(){return false;}
    public boolean isAssocExpr(){return false;}
    public boolean isInvExpr(){return false;}

    public String toString(){return "QFeatureExpr";}
    public void setModifier (Modifier modifier){this.modifier = modifier;}
    public Modifier getModifier (){return this.modifier;}

}