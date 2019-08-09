package org.tzi.use.query.util;
import org.tzi.use.uml.mm.*;
import java.util.*;

public final class ModelFragment extends Fragment{
    private Set<MClass> classes = new HashSet<MClass>();
    private Set<MAssociation> associations = new HashSet<MAssociation>();
    private Set<MClassInvariant> invariants =new HashSet<MClassInvariant>();

    public ModelFragment (){

    }

    public void addClass(MClass cls){
        classes.add(cls);
    }

    public void addAssociation (MAssociation assoc){
        associations.add(assoc);
    }

    public void addInvariants (MClassInvariant inv){
        invariants.add(inv);
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("[classes: ");
        for (MClass cls : classes) sb.append(cls.name()+" ");
        sb.append(" ] \n [associations: ");
        for (MAssociation assoc : associations) sb.append(assoc.name()+ " ");
        sb.append(" ] \n [invariants: ");
        for (MClassInvariant inv: invariants) sb.append(inv.name()+" ");
        sb.append(" ]\n");
        
        return sb.toString();
    }



}