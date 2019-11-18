package org.tzi.use.query.graph;
import org.tzi.use.uml.mm.*;
import org.tzi.use.query.util.*;
import org.tzi.use.query.io.*;
import java.util.*;

public class Decomposer{
    private MModel model;
    private AttributeOclExprVisitor visitor = new AttributeOclExprVisitor();
    private HashMap<MAttribute, HashSet<MClassInvariant>> map = new HashMap<MAttribute, HashSet<MClassInvariant>>();
    private List<HashSet<MClassInvariant>> sets = new ArrayList<HashSet<MClassInvariant>>();
    private ColorPrint out;

    public Decomposer(MModel model){
        this.model = model;
        out = new ColorPrint();
    }

    public void decompose(){
        List<HashSet<MClassInvariant>> list = new ArrayList<HashSet<MClassInvariant>>();
        /* Phase 1 */ 
        for (MClass cls : this.model.classes()){
            for (MAttribute attr:cls.attributes()){
                for (MClassInvariant inv : this.model.classInvariants()){
                    visitor.initialise(attr);
                    inv.bodyExpression().accept(visitor);
                    if (visitor.isUsed()){
                        //out.println(attr.owner().name()+" "+attr.toString()+" is used in "+inv.toString(),Color.BLUE);
                        if (map.containsKey(attr))
                            map.get(attr).add(inv);
                        else{
                            HashSet<MClassInvariant> set = new HashSet<MClassInvariant>();
                            set.add(inv);
                            map.put(attr,set);
                            list.add(set);
                        }
                    }
                }
            }
        }
        
        for (MAttribute attr : map.keySet()){
            out.print(attr.owner()+"."+attr.name()+"->{",Color.BLUE);
            for (MClassInvariant inv : map.get(attr)){
                out.print(inv.name()+" ",Color.BLUE);
            }
            out.println("}",Color.BLUE);
        }

        /* Phase 2 */
        for (int i=0;i<list.size();i++){
            HashSet<MClassInvariant> seta = list.get(i);
            Iterator<HashSet<MClassInvariant>> it = list.iterator();
            while (it.hasNext()){
                HashSet<MClassInvariant> setb = it.next();
                if (setb!=seta){
                    if (intersect(seta, setb)){
                        seta=union(seta,setb);
                        it.remove();
                    }
                }
            }
            sets.add(seta);
        }

        out.println("After Phase 2:",Color.RED);
        for (HashSet<MClassInvariant> set : sets)
            out.println(set.toString(),Color.BLUE);
    }

    private HashSet<MClassInvariant> union (HashSet<MClassInvariant> seta, HashSet<MClassInvariant> setb){
        HashSet<MClassInvariant> set = new HashSet<MClassInvariant>();
        for (MClassInvariant inv: seta) set.add(inv);
        for (MClassInvariant inv: setb) set.add(inv);
        return set;
    }

    private boolean intersect (HashSet<MClassInvariant> seta, HashSet<MClassInvariant> setb){
        for (MClassInvariant inv:seta)
            if (setb.contains(inv)) return true;
        return false;
    }

}