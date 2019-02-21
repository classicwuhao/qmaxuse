package org.tzi.use.query.ast;

public abstract class QAst{
    public abstract String toString();
    public boolean isQuery(){return false;}
    public boolean isBinaryQuery(){return false;}
    public boolean isModuleList(){return false;}
}