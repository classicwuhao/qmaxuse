package org.tzi.use.query.ast;
import org.tzi.use.query.visitor.AbstractVisitor;

public class ModuleAliasExpr extends QueryExpr{
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

    public void setModuleName(String module){
        this.module = module;
    }

    public void setQueryName(String query){
        this.query = query;
    }

    public String name(){return this.module;}
    public String query(){return this.query;}
    
    public String toString(){
        return this.module+"."+this.query;
    }
    
    public void accept(AbstractVisitor visitor){
        visitor.visitModuleAliasExpr(this);
    }

    @Override
    public boolean isModuleAlised(){return true;}
}