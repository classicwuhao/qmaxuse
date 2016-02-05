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

public abstract class TernaryFormula extends AbstractFormula{
	private AbstractFormula _formula_a;
	private Connective _operator;
	private AbstractFormula _formula_b;
	private AbstractFormula _formula_c;
		
	public TernaryFormula (Connective operator, AbstractFormula a, AbstractFormula b, AbstractFormula c){
		_operator=operator;
		_formula_a=a;
		_formula_b=b;
		_formula_c=c;
	}
	
}
