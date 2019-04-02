package org.tzi.use.query.ast;

public enum Modifier{
    STAR {public String toString(){return "*";}},
    ONLY {public String toString(){return "only";}},
    NO {public String toString(){return "no";}},
    ALL {public String toString(){return "all";}},
    DEFAULT {public String toString(){return "default";}}
}