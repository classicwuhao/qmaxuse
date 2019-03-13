package org.tzi.use.query.ast;
import org.tzi.use.query.visitor.AbstractVisitor;

public class ModuleAliasExpr extends QAst{
    private String module;
    private String query;

    public ModuleAliasExpr(){
        module="";
        query="";
    }

    public ModuleAliasExpr(String module, String query){
        this.module = module;
        this.query = query;
    }

    public String toString(){
        return this.module+"."+this.query;
    }
    
    public void accept(AbstractVisitor visitor){
        visitor.visitModuleAliasExpr(this);
    }
}