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
import uran.err.NullableFormulaException;
import uran.formula.visitor.AbstractVisitor;

/** 
 * 	Base class for all binary formulas 
 *	@author Hao Wu
 */

public abstract class BinaryFormula extends AbstractFormula{
	private AbstractFormula _left;
	private AbstractFormula _right;
	private Connective _conn;
	
	/**
	 *	setup connective
	 */	
	public BinaryFormula(Connective conn){_conn=conn;}
	
	public BinaryFormula(Connective conn, AbstractFormula left, AbstractFormula right){
		_left=left;
		_right=right;
		_conn=conn;
	}

	/**
 	 *	if both left and right nodes are null, then this formula is considered to be null.
	 */
	@Override
	public boolean isNull(){
		return _left==null && _right==null;
	}	
	/**
 	 * @return	the left node
	 */
	public AbstractFormula left(){
		return _left;
	}

	/**
 	 * @return	the right node
	 */
	public AbstractFormula right(){
		return _right;
	}
	/**
 	 * @return	the connective
	 */
	public Connective connective(){
		return _conn;
	}

	/**
	 *	set up a new left node.
 	 * @param	formula the new left node
	 */
	public void setLeft(AbstractFormula formula){
		if (formula.isNull()) throw new NullableFormulaException("BinaryFormula: Cannot set a fomrula to be null");
		_left=formula;
	}

	/**
	 *	set up a new right node.
 	 * @param	formula the new right node
	 */
	public void setRight(AbstractFormula formula){
		if (formula.isNull()) throw new NullableFormulaException("BinaryFormula: Cannot set a fomrula to be null");
		_right=formula;
	}

	public void setConnective(Connective con){_conn=con;}
	
	public String toString(){
		return "("+_left.toString()+" "+_conn.toString()+" "+_right.toString()+")";
	}

	/**
	 *	merge a series of binary formulas.
 	 * @param	formulas formulas to be merged
	 */
	public abstract BinaryFormula merge(AbstractFormula...formulas);
	
	@Override
	public String toSMT2(){
		return "("+_conn+" "+_left.toSMT2()+" "+_right.toSMT2()+")";
	}

	@Override	
	public void accept (AbstractVisitor visitor){
		visitor.visit(this);
	}

	@Override
	public boolean isBinaryFormula(){return true;}
	
}
