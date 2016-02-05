/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++Written by: Hao Wu++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *
 *	This is a part of my research work.
 *  haowu@cs.nuim.ie
 *  APR-2015 
 *  
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * ++++++++++++++++++++++++++++++Do or do not, there is no try.+++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package uran.formula;
import uran.formula.value.IntValue;
import uran.formula.visitor.AbstractVisitor;

/** Numeric Literal */
public class NumLiteral extends Literal{
	private IntValue value;
	
	public NumLiteral(){
		//default constructor
		value=new IntValue();
	}

	public NumLiteral(IntValue v){
		value=v;
	}
		
	/** Take an integer as a numeric constant*/
	public NumLiteral (int v){
		value=new IntValue(v);
	}

	public IntValue getValue(){
		return value;
	}

	public int getLiteral(){
		return value.getValue();
	}

	@Override
	public String toString(){
		return String.format("%d",value.getValue());	
	}

	@Override
	public String toSMT2(){return toString();}
	
	@Override
	public void accept (AbstractVisitor visitor){visitor.visit(this);}
	
}
