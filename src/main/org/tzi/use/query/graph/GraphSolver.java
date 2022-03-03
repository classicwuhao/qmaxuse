package org.tzi.use.query.graph;
import org.tzi.use.query.state.*;
import org.tzi.use.common.*;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
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
        final BlockingQueue<QueryState> queue = new ArrayBlockingQueue<QueryState>(decomposer.size());
        final long startTime = System.currentTimeMillis();
        FOLTranslator.reset();
        for (QueryState state : states) queue.add(state);
        ExecutorService pool = Executors.newFixedThreadPool(k);
        for (int i=0;i<k;i++){
            //QueryState state = states.get(i);
                while (!queue.isEmpty()){
                    QueryState state = queue.poll();
                    translators[i] = new FOLTranslator(new FeatureSet(state.classes(),state.attributes(),
                    state.associations(),state.invariants()),this.decomposer.model(),filename+i, this.settings);
                    //translators[i].start(); 
                    pool.execute(translators[i]);
                    //try{
                        if (!translators[i].isAlive()){
                            if (translators[i].get_unsat_cores().size()>0)
                            cores.add(translators[i].get_unsat_cores());
                        }
                    //}
                    //catch(InterruptedException e){}    
                }
        }
        pool.shutdown();
        try{
            pool.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        }
        catch(InterruptedException e){

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