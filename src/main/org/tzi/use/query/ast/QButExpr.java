package org.tzi.use.query.ast;

import java.util.List;

import javax.lang.model.util.ElementScanner6;

import java.util.ArrayList;
import org.tzi.use.query.visitor.AbstractVisitor;

public class QButExpr extends QAst{
    private List<QFeatureExpr> features = new ArrayList<QFeatureExpr>();
    private List<QClassExpr> classes = new ArrayList<QClassExpr>();
    private List<QAttrExpr> attributes = new ArrayList<QAttrExpr>();
    private List<QAssocExpr> assocs = new ArrayList<QAssocExpr>();
    private List<QInvExpr> invs = new ArrayList<QInvExpr>();

    public QButExpr(){}

    public QButExpr (QInvExpr inv){
        invs.add (inv);
    }

    /*private void addInvExpr (QInvExpr inv){
        invs.add (inv);
    }*/

    public void addFeatureExpr (QFeatureExpr feature){

        if (feature.isClassExpr()) 
            classes.add((QClassExpr) feature);
        else if (feature.isAssocExpr()) 
            assocs.add((QAssocExpr) feature);
        else if (feature.isAttrExpr())
            attributes.add((QAttrExpr) feature);
        else if (feature.isInvExpr())
            invs.add( (QInvExpr) feature);
        else ;
        
        this.features.add(feature);
    }

    public List<QClassExpr> classes(){
        return this.classes;
    }

    public List<QAttrExpr> attributes(){
        return this.attributes;
    }

    public List<QAssocExpr> associations(){
        return this.assocs;
    }

    public List<QFeatureExpr> features(){
        return this.features;
    }

    public List<QInvExpr> invariants(){
        return this.invs;
    }

    public String toString(){   
        StringBuffer sb = new StringBuffer();
        
        sb.append(" but ");
        for (int i=0;i<features.size();i++)
            sb.append(features.get(i).toString()+" ");
    
        return sb.toString();
    }

    public void accept(AbstractVisitor visitor){
        visitor.visitButExpr(this);
    }

}