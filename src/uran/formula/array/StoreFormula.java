package uran.formula.array;

import uran.formula.AbstractFormula;
import uran.formula.visitor.AbstractVisitor;
import uran.formula.type.Type;
import uran.formula.value.Value;

public final class StoreFormula extends ArrayFormula{
	private ArrayEx<? extends Type,? extends Type> array;
	//<T1 extends Type, T2 extends Type> ArrayEx<T1,T2> array;
	private int index;
	private Value value;
	
	public StoreFormula (ArrayEx<? extends Type,? extends Type> array, int index, Value value){
		this.array = array;
		this.index = index;
		this.value = value;
	}
	
	@Override
	public String toString(){
		return "(store "+this.array.name()+" "+this.index+" "+this.value+")";	
	}
	
	@Override
	public void accept (AbstractVisitor visitor){
		visitor.visit(this);
	}
	
	@Override
	public String toSMT2(){
		return "(store "+this.array.toSMT2()+" "+this.index+" "+this.value+")";
	}
	
}
