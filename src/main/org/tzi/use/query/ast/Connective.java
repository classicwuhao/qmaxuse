package org.tzi.use.query.ast;

public enum Connective{
    AND {public String toString(){return "&&";}},
    OR {public String toString(){return "||";}};
}