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
        this.classes = classes;
        this.attributes = attributes;
        this.associations = associations;
        this.invariants = invariants;
    }

    public Set<MClass> classes (){return this.classes;}
    public Set<MAttribute> attributes (){return this.attributes;}
    public Set<MAssociation> associations(){return this.associations;}
    public Set<MClassInvariant> invariants(){return this.invariants;}

    public void refine(){
        /* class */
    }

    public void preprocess(){
        AttributeOclExprVisitor visitor = new AttributeOclExprVisitor();
        for (MAttribute attr : attributes){
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