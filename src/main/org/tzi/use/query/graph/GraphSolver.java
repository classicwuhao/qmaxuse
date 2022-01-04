package org.tzi.use.query.graph;
import org.tzi.use.query.state.*;
import org.tzi.use.common.*;
import java.util.*;
import org.tzi.use.query.io.*;
import org.tzi.use.query.setup.*;

public final class GraphSolver{
    private Decomposer decomposer;
    private final String filename = "thread";
    private ColorPrint out = new ColorPrint();
    private HashSet<List<String>> cores = new HashSet<List<String>>();
    private Settings settings;

    public GraphSolver (Decomposer decomposer, Settings settings){
        this.decomposer = decomposer;
        this.settings = settings;
    }

    public void solve(){
        decomposer.decompose();
        solve(decomposer.size());
    }

    /* solve this graph with k number of threads. */ 
    private void solve(int k){
        List<QueryState> states = this.decomposer.query_states();
        FOLTranslator[]  translators = new FOLTranslator[k];
        
        final long startTime = System.currentTimeMillis();
        FOLTranslator.reset();
        for (int i=0;i<k;i++){
            QueryState state = states.get(i);
            translators[i] = new FOLTranslator(new FeatureSet(state.classes(),state.attributes(),
                    state.associations(),state.invariants()),this.decomposer.model(),filename+i, this.settings);
            translators[i].start();
            try{
                translators[i].join();
                if (translators[i].get_unsat_cores().size()>0)
                    cores.add(translators[i].get_unsat_cores());
            }
            catch(InterruptedException e){ 
            }
        }

        /*try{
            for (int i=0;i<k;i++)
                translators[i].join();
        }
        catch(InterruptedException e){}*/
        /* wait until until all threads finish */ 
        
        int c = 0;
        for (List<String> list : cores){
            out.print("core "+c++ + ":",Color.RED+"{ ");
            for (String str :  list) out.print(str+" ",Color.RED);
            out.print("}",Color.RED);
            out.println(" ",Color.RED);
        }

        final long time = System.currentTimeMillis() - startTime;
        out.println("Total conflicts: "+FOLTranslator.cores(),Color.CYAN);
        out.println("Total Time Spent (" + states.size()+" threads): " + time +" ms.",Color.CYAN);
    }
}