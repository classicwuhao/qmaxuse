package org.tzi.use.query.ast;

import java.util.List;
import java.util.ArrayList;

public class QWithoutExpr extends QAst{
    private List<QInvExpr> invs = new ArrayList<QInvExpr>();
    
    public QWithoutExpr(){}

    public QWithoutExpr (QInvExpr inv){
        invs.add (inv);
    }

    public void addInvExpr (QInvExpr inv){
        invs.add (inv);
    }

    public List<QInvExpr> expressions(){
        return this.invs;
    }

    public String toString(){   
        StringBuffer sb = new StringBuffer();
        
        sb.append("without ");
        for (int i=0;i<invs.size();i++)
            sb.append(invs.get(i).toString()+" ");
    
        return sb.toString();
    }
}