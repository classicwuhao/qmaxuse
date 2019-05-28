

package uran.formula.bv;
import uran.formula.visitor.AbstractVisitor;


public final class BV_Extract extends BV_Formula{
	private int index0;
	private int index1;
	private BitVector bv;
	
	
	private BV_Extract(){}
	
	public BV_Extract(int i, int j, BitVector bv){
		this.index0 = i;
		this.index1 = j;
		this.bv = bv;
	}


	@Override
	public String toString(){return "( extract "+this.index0+", "+this.index1+", "+ this.bv.name() +")";}
	
	@Override
	public String toSMT2(){
		return "( (_ extract "+this.index0+" "+this.index1+" )" + bv.toSMT2() + ")";
	}

	@Override
	public void accept (AbstractVisitor visitor){
		visitor.visit(this);
	}	

}
