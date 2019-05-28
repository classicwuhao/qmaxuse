package uran.formula.array;

import uran.formula.AbstractFormula;
import uran.formula.visitor.AbstractVisitor;
import uran.formula.type.Type;
import uran.formula.value.Value;
import uran.err.NullableFormulaException;
/**
 *	Create an array with 2 arguments: index, and value.
 *	
 */
public final class ArrayEx <I extends Type, V extends Type> extends AbstractFormula{
	
	private Class<I> index;
	private Class<V> value;
	private String name;
	private String interp;
		
	public ArrayEx(String name, Class<I> index, Class<V> value){
		this.name = name;
		this.index = index;
		this.value = value;
	}
	
	@Override
	public String toString(){
		return this.name()+" (Array "+index.getSimpleName()+" "+value.getSimpleName()+")";
	}
	
	@Override
	public String toSMT2(){return this.name();}
	
	@Override
	public void accept (AbstractVisitor visitor){
		visitor.visit(this);
	}
	
	public Class<I> indexType(){return this.index;}
	public Class<V> valueType(){return this.value;}
	public String name(){return this.name;}
	public void setInterp(String str){this.interp = str;}
	public String interp(){return this.interp;}
	
}
