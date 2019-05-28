package uran.formula.array;

import uran.formula.AbstractFormula;
import uran.formula.visitor.AbstractVisitor;
import uran.formula.type.Type;

public final class SelectFormula extends ArrayFormula{
	private ArrayEx<? extends Type,? extends Type> array;
	//<T1 extends Type, T2 extends Type> ArrayEx<T1,T2> array;
	private int index;
	
	public SelectFormula (ArrayEx<? extends Type,? extends Type> array, int index){
		this.array = array;
		this.index = index;
	}
	
	@Override
	public String toString(){
		return "(select "+this.array.name()+" "+this.index+")";	
	}
	
	@Override
	public void accept (AbstractVisitor visitor){
		visitor.visit(this);
	}
	
	@Override
	public String toSMT2(){
		return "(select "+this.array.toSMT2()+" "+this.index+")";
	}
	
}
