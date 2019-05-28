/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++Written by: Hao Wu++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *
 *	This is a part of my research work.
 *  haowu@cs.nuim.ie
 *  OCT-2016
 *  
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * ++++++++++++++++++++++++++++++Do or do not, there is no try.+++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */

package uran.formula.bv;
import uran.formula.AbstractFormula;
import uran.formula.visitor.AbstractVisitor;
import uran.err.IllFormedFormulaException;
import uran.formula.value.IntValue;

/**
 * Abstract syntax tree for BitVector
 */
public final class BitVector extends BV_Literal{
	private long length;
	private String name;
	private IntValue value;
	
	/* disable the default constructor */
	private BitVector(){}
	
	/**
	 * Create a new bit vector with a specified name and length
	 * @Param name		the specified name (the name cannot be null must contain some characters).
	 * @Param len		the specified length (the length cannot be <=0).
	 */
	public BitVector(String name, long len){
		if (len<=0) throw new IllFormedFormulaException("Error: the length of a bitvector cannot be <=0");
		if (name==null) throw new IllFormedFormulaException("Error: name cannot be null.");
		if (name.length()<=0) throw new IllFormedFormulaException("Error: the name is not specified.");
		
		this.length = len;
		this.name = name;
	}
	
	/**
	 *	@return	the specified name.
	 */
	
	public String name(){return this.name();}
	
	/**
	 *	@return	the specified length.
	 */
	public long length(){return this.length;}
	
	
	/**
	 *	@return	the this formula in SMT2 standard.
	 */
	
	@Override
	public String toSMT2(){
		return this.name; //remember that we only use its name, not the definition.
	}
	
	/**
	 *	Accept a concrete visitor that inherits from AbstractVisitor
	 * @Param	visitor	the visitor used for generating formulas in SMT2 standard
	 */
	@Override
	public void accept (AbstractVisitor visitor){
		visitor.visit(this);
	}	

	/**
	 *	@return	the value in decimal.
	 */	
	public int value(){ return value.getValue();}

	/**
	 *	@Param	value	a value that is retrieved from SMT solver.
	 */	
	public void setValue(IntValue value){ this.value = value;}

	/**
	 *	@return	the string representation of a BitVector.
	 */
	@Override
	public String toString(){
		return this.name+" (_ BitVec "+ this.length +")"; //remember that we use the definition here just for declaration.
	}

	/**
	 *	@return	true.
	 */	
	@Override
	public boolean isBitVector(){return true;}
	
}
