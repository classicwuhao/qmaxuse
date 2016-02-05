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

package uran.formula.type;
import uran.err.NullableFormulaException;

public abstract class Type{
	protected int type;

	protected static int INT=0x01;
	protected static int BOOL=0x02;
	protected static int REAL=0x03;
	
	/*@TODO: We need to define a new class for a user-defined sort. */
	protected static int SORT=0x04;

	public Type(){;}
	public Type(String n){;}
	public abstract String toString();
	public abstract String name();
	
	public int getType(){return this.type;}
	public boolean isBool(){return false;}
	public boolean isInt(){return false;}
	public boolean isReal(){return false;}
	public boolean isSort(){return false;}
	public boolean equalsTo(Type t){
		if (t==null) throw new NullableFormulaException("Error: type cannot be null.");
		return this.type == t.getType();
	}
		
}
