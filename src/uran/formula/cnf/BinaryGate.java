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


package uran.formula.cnf;
import uran.formula.cnf.visitor.AbstractVisitor;

public final class BinaryGate extends BooleanCircuit{
	private BooleanCircuit input0;
	private BooleanCircuit input1;
	private int op;

	public BinaryGate(int n, BooleanCircuit c1, BooleanCircuit c2){
		super();
		input0=c1;
		input1=c2;
		op=n;
	}

	public String toString(){
		return "("+ input0 + " " +op+" "+input1+")";
	}
	
	public BooleanCircuit input0(){return input0;}
	public BooleanCircuit input1(){return input1;}
	public boolean isBinaryGate(){return true;}
	
	public int operator(){return op;}
	public void accept (AbstractVisitor v){
		v.visit(this);
	}

}
