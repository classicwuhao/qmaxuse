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
 public abstract class BV_Formula extends AbstractFormula{
 	
 	@Override
 	public boolean isBV_Formula(){return true;}
 	public boolean isBV_Literal(){return false;}
 	
 	public void accept (AbstractVisitor visitor){
		visitor.visit(this);
	}
 	
 }
