package org.tzi.use.query.ast;
import java.util.List;
import java.util.ArrayList;

public class ModuleExpr extends QAst{
    private List<QueryExpr> queries;
    private String name;

    public ModuleExpr(String name){
        this.queries = new ArrayList<QueryExpr>();
        this.name = name;
    }

    public void addQuery(QueryExpr expr){
        this.queries.add(expr);
    }

    public List<QueryExpr> queries(){
        return this.queries;
    }

    public String name(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return this.name;
    }

    public String details(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("module "+this.name+" \n");

        for (QueryExpr q : queries){
            sb.append("\t"+q.toString()+"\n");
        }

        sb.append("end\n");
        return sb.toString();
    }

}