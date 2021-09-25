package org.tzi.use.query.graph;
import org.tzi.use.uml.mm.*;
import org.tzi.use.query.util.*;
import org.tzi.use.query.io.*;
import org.tzi.use.query.state.*;
import java.util.*;

public class Decomposer{
    private MModel model;
    private AttributeOclExprVisitor visitor = new AttributeOclExprVisitor();
    private ClassOclExprVisitor clsVisitor = new ClassOclExprVisitor();

    private HashMap<MAttribute, HashSet<MClassInvariant>> map = new HashMap<MAttribute, HashSet<MClassInvariant>>();
    private List<HashSet<MClassInvariant>> sets = new ArrayList<HashSet<MClassInvariant>>();
    private HashMap<MClass, HashSet<MClassInvariant>> nav_map= new HashMap<MClass, HashSet<MClassInvariant>>();

    private ColorPrint out;

    public Decomposer(MModel model){
        this.model = model;
        out = new ColorPrint();
    }

    public List<HashSet<MClassInvariant>> inv_sets(){return this.sets;}
    public MModel model(){return this.model;}
    public List<QueryState> query_states(){
        List<QueryState> states = new ArrayList<QueryState>();

        for (int i=0;i<this.sets.size();i++){
            QueryState state = new QueryState();
            states.add(state);
        }

        for (int i=0;i<states.size();i++){
            QueryState state = states.get(i);
            HashSet<MClassInvariant> set = sets.get(i);
            for (MClassInvariant inv: set){
                InvOclExprVisitor inv_visitor = new InvOclExprVisitor(this.model);
                inv.bodyExpression().accept(inv_visitor);
                state.addAllCls(inv_visitor.classes());
                state.addAllAttr(inv_visitor.attributes());
                state.addAllAssoc(inv_visitor.associations());
                state.addInv(inv);
            }
            state.refine();
        }
   
        return states;
    }

    public int size(){return this.sets.size();}

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
        
        /*for (MAttribute attr : map.keySet()){
            out.print(attr.owner()+"."+attr.name()+"->{",Color.BLUE);
            for (MClassInvariant inv : map.get(attr)){
                out.print(inv.name()+" ",Color.BLUE);
            }
            out.println("}",Color.BLUE);
        }*/

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

        /*out.println("After Phase 2:",Color.RED);
        for (HashSet<MClassInvariant> set : sets)
            out.println(set.toString(),Color.BLUE);*/

        /* Phase 3 */
        for (MClass cls: this.model.classes()){
            for (MClassInvariant inv: this.model.classInvariants()){
                clsVisitor.initialise(cls);
                inv.bodyExpression().accept(clsVisitor);
                if (clsVisitor.isUsed()){
                    if (nav_map.containsKey(cls)){
                        nav_map.get(cls).add(inv);
                    }
                    else{
                        HashSet<MClassInvariant> inv_set = new HashSet<MClassInvariant>();
                        inv_set.add(inv);
                        nav_map.put(cls, inv_set);
                    }
                    //out.println(inv.name()+ " -> "+cls.name(),Color.BLUE);
                }
            }
        }

        /*out.println("After Phase 3:", Color.RED);
        for (MClass cls:nav_map.keySet()){
            out.print(cls.name()+ "-> { ", Color.BLUE);
            for (MClassInvariant inv : nav_map.get(cls)){
                out.print(inv.name()+ " ",Color.BLUE);
            }
            out.println(" }",Color.BLUE);
        }*/

        boolean[] flag = new boolean [nav_map.size()];
        int index =0;

        for (MClass cls: nav_map.keySet()){
            flag[index]=true;
            for (HashSet<MClassInvariant> set : sets){
                for (MClassInvariant inv: nav_map.get(cls)){
                    if (set.contains(inv)){
                        set.addAll(nav_map.get(cls));
                        flag[index]= false;
                        break;
                    }
                }
            }
            index++;
        }

        /* if it does not contain in previous sets, then it will be a new set added in the sets. */
        index=0;
        for (MClass cls:nav_map.keySet()){
            if (flag[index++])
                sets.add(nav_map.get(cls));
        }
        

        /* make remaining invariants into one set */ 
        HashSet<MClassInvariant> remaining_set = new HashSet<MClassInvariant>();
        for (MClassInvariant inv : this.model.classInvariants()){
            boolean contained = false;
            for (HashSet<MClassInvariant> set : sets ){
                if (set.contains(inv)){contained=true;break;};
            }
            if (!contained){
                remaining_set.add(inv);
            }
        }
        
        if (remaining_set.size()>0) sets.add(remaining_set);

        /*out.println("Final Sets:",Color.RED);
        for (HashSet<MClassInvariant> set : sets)
            out.println(set.toString(),Color.BLUE);*/
    
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