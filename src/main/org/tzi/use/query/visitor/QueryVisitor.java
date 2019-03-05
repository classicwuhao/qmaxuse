package org.tzi.use.query.visitor;

import org.tzi.use.query.state.QueryState;
import org.tzi.use.query.ast.*;
import org.tzi.use.uml.mm.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import org.tzi.use.query.io.ColorPrint;
import org.tzi.use.query.io.Color;

public class QueryVisitor extends AbstractVisitor {
    private MModel model;
    ColorPrint out;
    private boolean verbose;
    private QueryState state;

    public QueryVisitor(MModel model) {
        this.model = model;
        this.out = new ColorPrint();
        this.verbose = true;
        this.state = new QueryState();
    }

    public void visitQueryExpr(QueryExpr e) {
        for (QFeatureExpr expr: e.features()) expr.accept(this);
    }

    public void visitClassExpr(QClassExpr e) {
        if (e.name().equals("*")){
            if (this.verbose) out.println("Classes:"+model.classes()+" are selected.",Color.BLUE);
            state.classes().addAll(model.classes());
            return;
        }

        MClass cls = findClass(e.name());
        if (cls==null){
            out.println("Class <" +e.name()+"> cannot be found in the current model.",Color.RED);
            return;
        }

        state.classes().add(cls);
        if (this.verbose) out.println("Classes: "+ state.classes()+" selected.",Color.BLUE);
    }

    public void visitAttrExpr(QAttrExpr e) {
        MAttribute attr = null ;
        List<MClass> list =  new ArrayList<MClass>();
        MClass cls = null;

        if (e.container().equals("*")) {
            list.addAll(model.classes());
            state.classes().addAll(model.classes());
        }
        else{
            cls = findClass(e.container());
            if (cls==null){
                out.println("Attribute <" + e.name()+ ">'s class <" +e.container()+"> cannot be found in the current model.",Color.RED);
                return;
            }else{
                if (this.verbose) out.println("Class: "+cls.name()+" is added.",Color.BLUE);
                list.add(cls);
                state.classes().add(cls);
            }
        }    

        for (MClass c : list){
            if (e.name().equals("*")){
                if (this.verbose) out.println("Attributes: "+c.allAttributes()+" are selected.", Color.BLUE);
                state.attributes().addAll(c.allAttributes());
            }
            else{
                attr = c.attribute(e.name(),true);
                if (attr==null){
                    if (state.classes().contains(c)) state.classes().remove(c);
                    if (!e.container().equals("*")){
                        out.println("Attribute <" + e.name()+ "> cannot be found in the class <" +e.container()+">.",Color.RED);
                        return;
                    }
                }else {
                    state.classes().add(c);
                    if (attr.owner()!=c){ 
                        if (this.verbose) out.println("Class: "+attr.owner().name()+" is also selected.",Color.BLUE);
                        state.classes().add(attr.owner());
                    }
                    state.attributes().add(attr);
                }
            }
        }
        
        /*if (e.name().equals("*")){
            attributes.addAll(cls.allAttributes());
            for (MAttribute a : cls.allAttributes()){
                if (a.owner()!=cls && !classes.contains(a.owner())){
                    if (this.verbose) out.println("Class: "+a.owner().name()+" is also selected.",Color.BLUE);
                    classes.add(a.owner());
                } 
            }
            return;
        }*/
        //if (this.verbose) out.println("Attributes: "+attributes+" selected.",Color.BLUE);
        //if (this.verbose) out.println("Attributes: "+attributes+" selected.",Color.BLUE);
    }

    public void visitAssocExpr(QAssocExpr e){

    }

    public void visitInvExpr (QInvExpr e){

    }

    private MClass findClass (String name){
        return model.getClass(name);
    }
    
    public QueryState state(){return this.state;}
}