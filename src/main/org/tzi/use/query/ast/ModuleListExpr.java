package org.tzi.use.query.ast;
import java.util.List;
import java.util.ArrayList;

public class ModuleListExpr extends QAst{
    private List<ModuleExpr> modules;

    public ModuleListExpr(){
        this.modules = new ArrayList<ModuleExpr>();
    }

    public void addModule(ModuleExpr expr){
        this.modules.add(expr);
    }

    public boolean isModuleList(){return true;}

    public String toString(){
        StringBuilder sb = new StringBuilder();

        for (ModuleExpr m: modules)
            sb.append("\n " + m.toString()+"\n");
        
        return sb.toString();
    }


}