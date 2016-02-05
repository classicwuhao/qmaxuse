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
	
public abstract class BooleanCircuit extends Node{
	public static final int UNDEFINED=-1;
	private long label=UNDEFINED;

	public long label(){return label;}
	public void assign(long k){label=k;}

	public long negation(){
		return -label;
	}
	
	public boolean isBooleanVariable(){return false;}
	public boolean isBinaryGate(){return false;}
	public boolean isNotGate(){return false;}
	public abstract void accept(AbstractVisitor v);
	
}
