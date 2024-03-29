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

import uran.err.NullableFormulaException;

public final class Decls extends AbstractFormula{
	private Constant vars[];
		
	public Decls (Constant...v){
		if (v==null) throw new NullableFormulaException("Decls: a list of variables must not be nullable.");
	
		vars = new Constant[v.length];
		for (int i=0;i<v.length;i++){
			if (v[i]==null) throw new NullableFormulaException("Decls: a vairbale mustnot be nullable.");
			vars[i]=v[i];
		}
	}

	public int size(){return vars.length;}
	public Constant get(int index){
		if (index<0) throw new NullableFormulaException("Decls: index is out of bound.");
		return vars[index];
	}

	public Constant[] get(){return vars;}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder("(");
		for (int i=0;i<vars.length;i++){
			sb.append(" ");
			sb.append(vars[i].toString());
			sb.append(" ");
		}
		
		return sb.append(")").toString();
	}		
	
	@Override
	public String toSMT2(){
		/*StringBuilder sb = new StringBuilder();
		for (int i=0;i<vars.length;i++){
			sb.append("( ");
			sb.append(vars[i].toString());
			sb.append(" )");
		}
		return sb.toString();*/
		return "";
	}
	
	@Override
	public void accept(AbstractVisitor visitor){
		visitor.visit(this);
	}

}
