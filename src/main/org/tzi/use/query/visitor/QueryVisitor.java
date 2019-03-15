package org.tzi.use.query.visitor;

import org.tzi.use.query.state.QueryState;
import org.tzi.use.query.ast.*;
import org.tzi.use.uml.mm.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Iterator;
import java.util.HashSet;
import org.tzi.use.query.io.ColorPrint;
import org.tzi.use.query.io.Color;

public class QueryVisitor extends AbstractVisitor {
    private MModel model;
    private ColorPrint out;
    private boolean verbose;
    private QueryState state;

    public QueryVisitor(MModel model) {
        this.model = model;
        this.out = new ColorPrint();
        this.verbose = true;
        this.state = new QueryState();
    }

    public void visitQueryExpr(QueryExpr e) {
        if (this.model==null) {
            out.println("Model is empty.",Color.RED);
            return;
        }

        /* This is a module call */ 
        if (e.isModuleAlised()){
            ((ModuleAliasExpr)e).accept(this);
            return;
        }

        /* this is an aliased query. */ 
        if (e.isPureAliased()){
            String name = e.alias();
            e = model.queryContext().seek(name);
            if (e==null) {
                out.println("Error: no "+name+" is found in current context.",Color.RED);
                return;
            }
            visitFeatures(e);
            return;
        }

        if (e.isAliased() && !e.isPureAliased() && !e.isContained()) {
            model.queryContext().add(e.alias(),e);
            out.println("Alias "+e.alias()+" is saved.",Color.BLUE);
        }

        visitFeatures(e);

    }

    private void visitFeatures(QueryExpr e){
        for (QFeatureExpr expr: e.features()) expr.accept(this);

        /* visit with expr */
        if (e.withExpr()!=null) e.withExpr().accept(this);

        /* visit but expr */
        if (e.butExpr()!=null) e.butExpr().accept(this);
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
        List<MAssociation> list = new ArrayList<MAssociation>();
        list.addAll(model.associations());
        
        if (!e.endA().equals("*")){
            Iterator<MAssociation> it = list.iterator(); //IMPORTANT: use an iterator to remove elements in a list.
            while (it.hasNext()){
                MAssociation assoc = it.next();
                if (!assoc.associationEnds().get(0).cls().name().equals(e.endA())) it.remove();
            }
        }
        
        if (!e.name().equals("*")){
            Iterator<MAssociation> it = list.iterator(); //IMPORTANT: use an iterator to remove elements in a list.
            while (it.hasNext()){
                MAssociation assoc = it.next();
                if (!assoc.name().equals(e.name())) it.remove();
            }
        }
        
        if (!e.endB().equals("*")){
            Iterator<MAssociation> it = list.iterator(); //IMPORTANT: use an iterator to remove elements in a list.
            while (it.hasNext()){
                MAssociation assoc = it.next();   
                if (!assoc.associationEnds().get(1).cls().name().equals(e.endB())) it.remove();
            }
        }
        
        for (MAssociation assoc: list) {
            if (assoc!=null){
                 state.associations().add(assoc);
                 MClass clsA = assoc.associationEnds().get(0).cls();
                 MClass clsB = assoc.associationEnds().get(1).cls();
                 if (! state.classes().contains(clsA)) state.classes().add(clsA);
                 if (! state.classes().contains(clsB)) state.classes().add(clsB);
            }
        }
    }

    public void visitInvExpr (QInvExpr e){

        List<MClassInvariant> list = new ArrayList<MClassInvariant>();
        if (e.context().equals("*")){
            list.addAll(model.classInvariants());
        }
        else{
            MClass cls = findClass(e.context());
            if (cls==null) {
                out.println("Class "+e.context()+" cannot be found in the current model.",Color.RED);
                return;
            }
            list.addAll(model.classInvariants(cls));
        }

        if (e.name().equals("*")){
            System.err.println("name=*");
            state.invariants().addAll(list);
        }
        else {
            Iterator<MClassInvariant> it = list.iterator();
            while (it.hasNext()){
                MClassInvariant inv = it.next();
                //out.println(inv.name()+" "+inv.qualifiedName(),Color.BLUE);
                if (!inv.name().equals(e.name())) it.remove();
            }
            state.invariants().addAll(list);
        }

        if (list.size()==0) out.println("No such invariants <"+e.name()+"> can be found in the class(es): "+e.context()+" .", Color.RED);
    }

    public void visitWithExpr (QWithExpr e){
        for (QInvExpr inv : e.expressions()) inv.accept(this);
    }

    public void visitButExpr (QButExpr e){
        for (QInvExpr inv: e.expressions()) {
            Iterator<MClassInvariant> it = state.invariants().iterator();
            while (it.hasNext()){
                if (!inv.context().equals("*")){
                    if (!inv.name().equals("*"))
                        removeInv(inv.context()+"::"+inv.name(),it,true);
                    else
                        removeInv(inv.context(),it,false);
                }
                else{
                    MClassInvariant i = it.next();
                    if (inv.name().equals("*")){
                        it.remove();
                    }
                    else{
                        if (i.name().equals(inv.name())) it.remove();
                    }
                }
            }
        }
    }

    private void removeInv(String fullname, Iterator<MClassInvariant> it, boolean qualifiedName){
        MClassInvariant inv  = it.next();
        if (qualifiedName==true){
            if (inv.qualifiedName().equals(fullname)) it.remove();
        }
        else {
            if (inv.cls().name().equals(fullname)) it.remove();
        }
    }

    public void visitCheckExpr (CheckExpr e){
        if (e.query()!=null){
            QueryExpr expr = e.query();
            if (expr.isPureAliased()){
                String name=expr.alias();
                expr = model.queryContext().seek(expr.alias());
                if (expr==null)
                    out.println("Error: alias name "+name+" cannotbe found.",Color.RED);
                else
                    expr.accept(this);
            }
            else
                expr.accept(this);
        }
    }

    public void visitModuleAliasExpr(ModuleAliasExpr e){
        List<QueryExpr> list =new ArrayList<QueryExpr>();
        if (!e.module().equals("*") && !e.query().equals("*")){
            QueryExpr expr = findQuery(e.module()+"."+e.query());
            if (expr!=null) {
                list.add(expr);
            }
            else{
                out.println("Error: no query "+e.module()+"."+e.query()+" can be found.",Color.RED);
                return;
            }
        }

        if (e.module().equals("*") && !e.query().equals("*")){
            list = model.queryContext().AllQueries(e.query());
            if (list.size()==0)
                out.println("Error: no such queries "+e.query()+" can be found.",Color.RED);
        }

        if (e.module().equals("*") && e.query().equals("*")){
            list = model.queryContext().AllQueries();
            if (list.size()==0)
                out.println("Error: no query module exists.",Color.RED);
        }

        if (!e.module().equals("*") && e.query().equals("*")){
            list = model.queryContext().ModuleQueries(e.module());
            if (list.size()==0) out.println("Error: no module "+ e.module() +" exists.",Color.RED);
        }
        
        for (QueryExpr qe : list){
            this.state().clearAll(); 
            qe.accept(this);
        }

    }

    public void visitModuleExpr(ModuleExpr e){

    }

    private QueryExpr findQuery(String name){
        return model.queryContext().seek(name);
    }

    private MClass findClass (String name){
        return model.getClass(name);
    }
    
    public QueryState state(){return this.state;}
}