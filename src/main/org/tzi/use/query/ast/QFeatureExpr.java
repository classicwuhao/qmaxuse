package org.tzi.use.query.ast;

public class QFeatureExpr extends QAst{

    public boolean isClassExpr(){return false;}
    public boolean isAttrExpr(){return false;}
    public boolean isAssocExpr(){return false;}

    public String toString(){return "QFeatureExpr";}
}