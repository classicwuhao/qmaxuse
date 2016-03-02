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

import uran.formula.visitor.AbstractVisitor;

/**	Abstract formula: this is the base class for all the formulas */
public abstract class AbstractFormula{
		
	/**	output a string representatino */
	public abstract String toString();
	public boolean isAtomicFormula(){ return false;}
	public boolean isLiteral(){return false;}
	public boolean isQuantifiedFormula(){return false;}
	public boolean isBinaryFormula(){return false;}
	public boolean isImpliesFormula(){return false;}
	public boolean isConstant(){return false;}
	public boolean isFunction(){return false;}
	public boolean isVariable(){return false;}
	public boolean isEqFormula(){return false;}
	//public boolean isComparisonFormula(){return false;}
	/**	just for the sake of inheritance */
	public boolean isNull(){return this==null;}
	
	/**	output a string representation in smt2 format */
	public abstract String toSMT2();

	/**	visit all nodes in a formula (visitor pattern) */
	public abstract void accept(AbstractVisitor visitor);
}
