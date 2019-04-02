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

    public void visitBinaryExpr(QueryBinaryExpr e){
        /* copy evrything to leftstate */
        e.left().accept(this);
        QueryState leftState = copy(this.state);
        this.state.clearAll();

        /* copy evrything to rightstate */
        e.right().accept(this);
        QueryState rightState = copy(this.state);
        this.state.clearAll();

        switch (e.operator()){
            case UNION:
                out.println("computing union of two queries.",Color.GREEN);
                state = union(leftState, rightState);
                break;

            case DIFFER:
                out.println("computing difference of two queries.",Color.GREEN);
                state = difference(leftState,rightState);
                break;

            case INTER:
                out.println("computing intersection of two queries",Color.GREEN);
                state = intersect(leftState,rightState);
                break;

            default:
                out.println("Error: operator cannot be recognized.",Color.RED);
        }
        
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
            AbstractQuery query = model.queryContext().seek(name);
            if (query==null) {
                out.println("Error: no "+name+" is found in current context.",Color.RED);
                return;
            }
            query.accept(this);
            return;
        }

        if (e.isAliased() && !e.isPureAliased() && !e.isContained() && !e.isSaved()) {
            e.save();
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

    }

    private void removeInvExpr(QButExpr e){
     for (QInvExpr inv: e.invariants()) {
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
        /*if (e.query()!=null){
            QueryExpr expr = e.query();
            if (expr.isPureAliased()){
                String name=expr.alias();
                expr = model.queryContext().seek(expr.alias());
                if (expr==null)
                    out.println("Error: alias name "+name+" cannotbe found.",Color.RED);
                https://github.com/classicwuhao
                https://github.com/classicwuhao
            }
            elsehttps://github.com/classicwuhao
                expr.accept(this);
        }*/
    }

    public void visitModuleAliasExpr(ModuleAliasExpr e){
        List<AbstractQuery> list =new ArrayList<AbstractQuery>();
        if (!e.name().equals("*") && !e.query().equals("*")){
            AbstractQuery expr = findQuery(e.name()+"."+e.query());
            if (expr!=null) {
                list.add(expr);
            }
            else{
                out.println("Error: no query "+e.name()+"."+e.query()+" can be found.",Color.RED);
                return;
            }
        }

        if (e.name().equals("*") && !e.query().equals("*")){
            list = model.queryContext().AllQueries(e.query());
            if (list.size()==0)
                out.println("Error: no such queries "+e.query()+" can be found.",Color.RED);
        }

        if (e.name().equals("*") && e.query().equals("*")){
            list = model.queryContext().AllQueries();
            if (list.size()==0)
                out.println("Error: no query module exists.",Color.RED);
        }

        if (!e.name().equals("*") && e.query().equals("*")){
            list = model.queryContext().ModuleQueries(e.name());
            if (list.size()==0) out.println("Error: no queries exists in "+e.name()+" or please assign a query to a variable.",Color.RED);
        }
        
        for (AbstractQuery qe : list){
            this.state().clearAll(); 
            qe.accept(this);
        }

    }

    public void visitModuleExpr(ModuleExpr e){

    }

    public void visitModuleListExpr(ModuleListExpr e){

    }

    public void visitOCLExpr (QOCLExpr e){

    }

    private AbstractQuery findQuery(String name){
        return model.queryContext().seek(name);
    }

    private MClass findClass (String name){
        return model.getClass(name);
    }
    
    public QueryState state(){return this.state;}

    public QueryState copy(QueryState state){
        QueryState newstate = new QueryState();
        newstate.classes().addAll(state.classes());
        newstate.attributes().addAll(state.attributes());
        newstate.associations().addAll(state.associations());
        newstate.invariants().addAll(state.invariants());
        return newstate;
    }

    public QueryState union (QueryState state1, QueryState state2){
        Set<MClass> classes = new HashSet<MClass>();
        Set<MAttribute> attributes = new HashSet<MAttribute>();
        Set<MAssociation> associations = new HashSet<MAssociation>();
        Set<MClassInvariant> invariants = new HashSet<MClassInvariant>();

        classes.addAll(state1.classes());
        classes.addAll(state2.classes());
        attributes.addAll(state1.attributes());
        attributes.addAll(state2.attributes());
        associations.addAll(state1.associations());
        associations.addAll(state2.associations());
        invariants.addAll(state1.invariants());
        invariants.addAll(state2.invariants());

        return new QueryState(classes, attributes,associations,invariants);
    }

    public QueryState difference (QueryState state1, QueryState state2){
        Set<MClass> classes = new HashSet<MClass>();
        Set<MAttribute> attributes = new HashSet<MAttribute>();
        Set<MAssociation> associations = new HashSet<MAssociation>();
        Set<MClassInvariant> invariants = new HashSet<MClassInvariant>();

        classes.addAll(state1.classes());
        classes.removeAll(state2.classes());
        attributes.addAll(state1.attributes());
        attributes.removeAll(state2.attributes());
        associations.addAll(state1.associations());
        associations.removeAll(state2.associations());
        invariants.addAll(state1.invariants());
        invariants.removeAll(state2.invariants());

        return new QueryState(classes, attributes,associations,invariants);
    }

    public QueryState intersect (QueryState state1, QueryState state2){
        Set<MClass> classes = new HashSet<MClass>();
        Set<MAttribute> attributes = new HashSet<MAttribute>();
        Set<MAssociation> associations = new HashSet<MAssociation>();
        Set<MClassInvariant> invariants = new HashSet<MClassInvariant>();

        for (MClass cls : state1.classes()) if (state2.classes().contains(cls)) classes.add(cls);
        for (MAttribute attr: state1.attributes()) if (state2.attributes().contains(attr)) attributes.add(attr);
        for (MAssociation assoc: state1.associations()) if (state2.associations().contains(assoc)) associations.add(assoc);
        for (MClassInvariant inv: state1.invariants()) if (state2.invariants().contains(inv)) invariants.add(inv);

        return new QueryState(classes, attributes,associations,invariants);
    }
}