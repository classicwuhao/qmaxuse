package org.tzi.use.query.visitor;

import org.tzi.use.query.ast.*;
import org.tzi.use.uml.mm.*;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import org.tzi.use.query.io.ColorPrint;
import org.tzi.use.query.io.Color;

public class QueryVisitor extends AbstractVisitor {
    private MModel model;
    private List<MClass> classes;
    private List<MAttribute> attributes;
    private List<MAssociation> associations;
    private List<MClassInvariant> invariants;
    ColorPrint out;

    public QueryVisitor(MModel model, PrintStream out) {
        this.model = model;
        this.classes = new ArrayList<MClass>();
        this.attributes = new ArrayList<MAttribute>();
        this.associations = new ArrayList<MAssociation>();
        this.invariants = new ArrayList<MClassInvariant>();
        this.out = new ColorPrint(out);
    }

    public void visitQueryExpr(QueryExpr e) {
        List<QFeatureExpr> exprs = e.features();
        
    }

    public void visitClassExpr(QClassExpr e) {
        MClass cls =null;
        cls = model.getClass(e.name());
        if (cls==null) out.print("Class <" +e.name()+"> cannot be found in the current model.",Color.RED);

    }

    public void visitAttrExpr(QAttrExpr e) {

    }

    public void visitAssocExpr(QAssocExpr e){

    }

    public void visitInvExpr (QInvExpr e){

    }
}