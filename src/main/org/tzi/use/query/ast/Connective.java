package org.tzi.use.query.ast;

public enum Connective{
    UNION {public String toString(){return "+";}},
    DIFFER {public String toString(){return "-";}},
    INTER {public String toString(){return "&";}
    };
}
