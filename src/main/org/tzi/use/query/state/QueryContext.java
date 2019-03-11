package org.tzi.use.query.state;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import org.tzi.use.query.ast.*;
import org.tzi.use.query.io.ColorPrint;
import org.tzi.use.query.io.Color;

public class QueryContext{
    private Map<String, QueryExpr> context;
    private Map<String, ModuleExpr> modules;

    private ColorPrint out;
    public QueryContext(){
        context = new HashMap<String, QueryExpr>();
        modules = new HashMap<String, ModuleExpr>();
        out = new ColorPrint();
    }

    public void add (String name, QueryExpr expr){
        if (!context.containsKey(name))
            context.put(name, expr);
        else
            out.println("Warning: alias " +name+" has already been used so it is ignored, please use another name.",Color.YELLOW);
    }

    public QueryExpr seek(String name){
        return (!context.containsKey(name))? null : context.get(name);
    }

    public ModuleExpr seekModule(String name){
        return (!modules.containsKey(name)) ? null : modules.get(name);
    }

    public void setModuleList(ModuleListExpr list){
        for (ModuleExpr m : list.modules()){
            if (!modules.containsKey(m.name())){
                modules.put(m.name(),m);
                for (QueryExpr e :  m.queries())
                    if (e.isAliased()) add (e.alias(),e);
            }
            else{
                out.println("Warning: Module "+m.name()+" has already been defined so it is ignored, please use another name.",Color.YELLOW);
            }
        }
    }
}