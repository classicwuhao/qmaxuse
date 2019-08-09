package org.tzi.use.query.graph;
import org.tzi.use.uml.mm.*;
import java.util.*;

public class Decomposer{
    private MModel model;
    private OclExprVisitor visitor = new OclExprVisitor();

    public Decomposer(MModel model){
        this.model = model;
    }

    private void descompse(){
        for (MClassInvariant inv:this.model.classInvariants()){

        }

    }

}