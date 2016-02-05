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
	
public final class BooleanVariable extends BooleanCircuit{
	private String alias;
	private int hashcode;
	public BooleanVariable (String name){alias=name;hashcode=hash(alias);}

	@Override
	public int hashCode(){return hashcode;}
	
	private int hash(String str){
		int rv = 0x811c9dc5;
        final int len = str.length();
        for(int i = 0; i < len; i++) {
            rv ^= str.charAt(i);
            rv *= 0x01000193;
        }
        return rv;	
	}
	public String alias(){return alias;}
	public String toString(){
		return alias;
	}
	public boolean isBooleanVariable(){return true;}
	public void accept(AbstractVisitor v){v.visit(this);}
	
}
