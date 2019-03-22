package org.tzi.use.query.ast;
public abstract class AbstractQuery extends QAst{
    private ModuleExpr module=null;
    private String variable="";

    public boolean isBinaryQuery(){return false;}
    public boolean isQueryExpr(){return false;}
    
    public void setModule (ModuleExpr module){
        this.module = module;
    }

    public ModuleExpr module(){
        return this.module;
    }

    public void setVariable(String name){this.variable=name;}
    public String variable(){
        return this.variable;
    }

    public boolean isVariableSet(){
        return !this.variable.equals("");
    }
}