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

public abstract class BV_UnaryFormula extends BV_Formula{
	private BV_Formula _formula;
	public BV_UnaryFormula(BV_Formula formula){_formula=formula;}
	public boolean isBV_UnaryFormula() {return true;}
	public boolean isBV_NotFormula(){return false;}
	public BV_Formula formula(){return _formula;}
	public void setFormula(BV_Formula formula){_formula=formula;}
	public String toString(){return "bvunary";}
}
