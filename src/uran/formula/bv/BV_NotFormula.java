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
import uran.formula.visitor.AbstractVisitor;

public final class BV_NotFormula extends BV_UnaryFormula {
	private BV_Connective conn;
	
	public BV_NotFormula (BV_Formula formula){
		super(formula);
		this.conn = BV_Connective.NOT;
	}

	@Override
	public boolean isBV_NotFormula(){return true;}

	@Override
	public String toString(){return "(bvnot "+this.formula().toString()+")";}

	@Override
	public String toSMT2(){return "("+this.conn+" "+this.formula().toSMT2()+")";}

	@Override
	public void accept(AbstractVisitor visitor){visitor.visit(this);}

}
