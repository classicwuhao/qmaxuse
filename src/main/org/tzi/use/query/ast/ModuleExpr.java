package org.tzi.use.query.ast;
import java.util.List;
import java.util.ArrayList;
import org.tzi.use.query.visitor.AbstractVisitor;

public class ModuleExpr extends QAst{
    private List<AbstractQuery> queries;
    private String name;

    public ModuleExpr(String name){
        this.queries = new ArrayList<AbstractQuery>();
        this.name = name;
    }

    public void addQuery(AbstractQuery expr){
        this.queries.add(expr);
    }

    public List<AbstractQuery> queries(){
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

        for (AbstractQuery q : queries){
            sb.append("\t"+q.toString()+"\n");
        }

        sb.append("end\n");
        return sb.toString();
    }

    public void accept(AbstractVisitor visitor){
        visitor.visitModuleExpr(this);
    }
}