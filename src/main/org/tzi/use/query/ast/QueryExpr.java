package org.tzi.use.query.ast;

import java.util.List;
import java.util.ArrayList;

public class QueryExpr extends QAst{
    private List<QFeatureExpr> features;
    private List<QInvExpr> withInvExprs;
    private List<QInvExpr> withoutInvExprs;

    private String alias ="";


    public String toString(){
        return this.alias;
    }


}