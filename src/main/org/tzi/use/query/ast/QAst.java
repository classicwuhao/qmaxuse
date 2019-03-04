package org.tzi.use.query.ast;
import org.tzi.use.query.visitor.AbstractVisitor;

public abstract class QAst{
    private int rank;

    public abstract String toString();
    public boolean isQuery(){return false;}
    public boolean isBinaryQuery(){return false;}
    public boolean isModuleList(){return false;}
    public void setRank (int k){this.rank=k;}
    public int rank(){return this.rank;}
    public abstract void accept(AbstractVisitor visitor);

}