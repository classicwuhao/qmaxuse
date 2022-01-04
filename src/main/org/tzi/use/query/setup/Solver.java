package org.tzi.use.query.setup;

public enum Solver{
    Z3 {public String toString(){return "z3";}},
    CVC5 {public String toString(){return "cvc5";}},
    UNDEF {public String toString(){return "undefined";}}
}
