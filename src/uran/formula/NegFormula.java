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

public final class NegFormula extends UnaryFormula {
	
	public NegFormula (AbstractFormula formula){
		super(formula);
	}

	@Override
	public boolean isNegFormula(){return true;}

	@Override
	public String toString(){return "(NOT "+this.formula().toString()+")";}

	@Override
	public String toSMT2(){return "(not "+this.formula().toSMT2()+" )";}

	@Override
	public void accept(AbstractVisitor visitor){visitor.visit(this);}

}
