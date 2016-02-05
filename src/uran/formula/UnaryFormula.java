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

public abstract class UnaryFormula extends AbstractFormula{
	private AbstractFormula _formula;
	public UnaryFormula(AbstractFormula formula){_formula=formula;}
	public boolean isUnaryFormula() {return true;}
	public boolean isNegFormula(){return false;}
	public AbstractFormula formula(){return _formula;}
	public void setFormula(AbstractFormula formula){_formula=formula;}
	public String toString(){return "unary";}
}
