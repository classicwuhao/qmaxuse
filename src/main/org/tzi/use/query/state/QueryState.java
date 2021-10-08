package org.tzi.use.query.state;
import org.tzi.use.query.ast.*;
import org.tzi.use.uml.mm.*;
import java.util.*;
import org.tzi.use.query.util.*;

public class QueryState{
    private Set<MClass> classes;
    private Set<MAttribute> attributes;
    private Set<MAssociation> associations;
    private Set<MClassInvariant> invariants;
    private HashMap<MAttribute, List<MClassInvariant>> map = new HashMap<MAttribute, List<MClassInvariant>>();
    
    public QueryState(){
        this.classes = new HashSet<MClass>();
        this.attributes = new HashSet<MAttribute>();
        this.associations = new HashSet<MAssociation>();
        this.invariants = new HashSet<MClassInvariant>();
    }

    public QueryState(Set<MClass> classes, Set<MAttribute> attributes, Set<MAssociation> associations, Set<MClassInvariant> invariants){
        /* make sure we do not create NULL pointer for the solver */ 
        this.classes = (classes==null) ? new HashSet<MClass>() : classes;
        this.attributes = (attributes == null) ? new HashSet<MAttribute>() : attributes;
        this.associations = (associations==null) ? new HashSet<MAssociation>() : associations;
        this.invariants = (invariants==null) ? new HashSet<MClassInvariant>() : invariants;
    }

    public Set<MClass> classes (){return this.classes;}
    public Set<MAttribute> attributes (){return this.attributes;}
    public Set<MAssociation> associations(){return this.associations;}
    public Set<MClassInvariant> invariants(){return this.invariants;}

    public void addAllCls(Set<MClass> cls){
        this.classes.addAll(cls);
    }

    public void addAllAttr(Set<MAttribute> attrs){
        this.attributes.addAll(attrs);
    }

    public void addAllAssoc(Set<MAssociation> assoc){
        this.associations.addAll(assoc);
    }

    public void addAllInv(Set<MClassInvariant> inv){
        this.invariants.addAll(inv);
    }

    public void addInv(MClassInvariant inv){
        this.invariants.add(inv);
    }

    public void refine(){
        AttributeOclExprVisitor visitor = new AttributeOclExprVisitor();
        List<MAttribute> ocl_attr = new ArrayList<MAttribute>();
        List<MAssociation> ocl_assoc = new ArrayList<MAssociation>();

        /* class */
        for (MAttribute attr:this.attributes){
            if (!this.classes.contains(attr.owner()))
                this.classes.add(attr.owner());
        }

        for (MAssociation assoc:this.associations){
            this.classes.addAll(assoc.associatedClasses());
        }

        for (MClassInvariant inv: this.invariants){
            if (!this.classes.contains(inv.cls()))
                this.classes.add(inv.cls());
            inv.bodyExpression().accept(visitor);
            ocl_attr.addAll(visitor.attributes());
            ocl_assoc.addAll(visitor.associations());
        }

        for (MAttribute attr : ocl_attr){
            if (!this.attributes.contains(attr)){
                this.attributes.add(attr);
            }
            if (!this.classes.contains(attr.owner())){
                this.classes.add(attr.owner());
            }
        }

        for (MAssociation assoc:ocl_assoc){
            if (!this.associations.contains(assoc)){
                this.associations.add(assoc);
            }
        }

    }

    public void preprocess(){
        AttributeOclExprVisitor visitor = new AttributeOclExprVisitor();
        for (MAttribute attr : attributes){
            //System.out.println("attr:"+attr.name());
            visitor.initialise(attr);
            for (MClassInvariant inv : invariants){
                inv.bodyExpression().accept(visitor);
                if (visitor.isUsed()) {
                    if (map.containsKey(attr)){
                        map.get(attr).add(inv);
                    }
                    else{
                        List<MClassInvariant> list = new ArrayList<MClassInvariant>();
                        list.add(inv);
                        map.put(attr, list);
                    }
                } 
            }
        }
    }

    public void clearAll(){
        this.classes.clear();
        this.attributes.clear();
        this.associations.clear();
        this.invariants.clear();
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("========Selected Classes======== \n");
        sb.append(this.classes);
        sb.append("\n");
        sb.append("========Selected Attributes======== \n");
        sb.append("[");
        for (MAttribute attr : attributes) sb.append(attr.owner()+"."+attr.name()+" ");
        sb.append("]\n");
        sb.append("========Selected Associations======== \n");
        sb.append("[");
        for (MAssociation assoc: associations) sb.append(assoc.name()+":"+assoc.associatedClasses()+" ");
        sb.append("]\n");
        sb.append("========Selected Invariants======== \n");
        sb.append("[");
        for (MClassInvariant inv: invariants) sb.append(inv.qualifiedName()+" ");
        sb.append("]\n");

        sb.append("=======Used Attributes======== \n");
        for (MAttribute attr : map.keySet()){
            sb.append(attr.name()+"->{ ");
            List<MClassInvariant> list = map.get(attr);
            for (MClassInvariant inv : list){
                sb.append (inv.qualifiedName()+" ");
            }
            sb.append("}\n");
        }

        return sb.toString();
    }


}