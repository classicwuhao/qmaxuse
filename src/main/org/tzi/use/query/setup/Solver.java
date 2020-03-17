package org.tzi.use.query.setup;

public enum Solver{
    Z3 {public String toString(){return "z3";}},
    CVC4 {public String toString(){return "cvc";}},
    UNDEF {public String toString(){return "undefined";}}
}