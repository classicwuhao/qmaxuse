package org.tzi.use.common;

import java.util.*;
import org.tzi.use.uml.mm.*;

public class FeatureSet{
    private Set<MClass> classes;
    private Set<MAttribute> attributes;
    private Set<MAssociation> associations;
    private Set<MClassInvariant> invariants;

    public FeatureSet(Set<MClass> classes, Set<MAttribute> attributes, Set<MAssociation> associations, Set<MClassInvariant> invariants){
        this.classes = classes;
        this.attributes = attributes;
        this.associations = associations;
        this.invariants = invariants;        
    }

    public Set<MClass> classes(){return this.classes;}
    public Set<MAttribute> attributes(){return this.attributes;}
    public Set<MAssociation> associations(){return this.associations;}
    public Set<MClassInvariant> invariants(){return this.invariants;}
    
}