package org.tzi.use.query.ast;

public abstract class QFeatureExpr extends QAst{

    public boolean isClassExpr(){return false;}
    public boolean isAttrExpr(){return false;}
    public boolean isAssocExpr(){return false;}
    public boolean isInvExpr(){return false;}

    public String toString(){return "QFeatureExpr";}

}