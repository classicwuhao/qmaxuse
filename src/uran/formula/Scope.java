/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++Written by: Hao Wu++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *
 *	This is a part of my research work.
 *  haowu@cs.nuim.ie
 *  JULY-2015 
 *  
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * ++++++++++++++++++++++++++++++Do or do not, there is no try.+++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */

package uran.formula;

import uran.formula.visitor.AbstractVisitor;
import uran.err.NullableFormulaException;
import uran.err.MissingFormulaException;
import java.util.List;
import java.util.ArrayList;

/**	A scope can contain multiple formulas and another scope 
 *	@author Hao Wu
 */
public final class Scope extends AbstractFormula{
	
	private List<AbstractFormula> context=new ArrayList<AbstractFormula>();
	/** we allow a scope that contains another scope */
	private Scope scope=null; 
	
	public Scope(AbstractFormula...formulas){
		for (int i=0;i<formulas.length;i++) add(formulas[i]);
	}

	public Scope(Scope scope){
		/** we allow an scope to be null. */
		//if (scope==null) throw new NullableFormulaException("Scope: scope can't be null.");
		this.scope=scope;
	}

	/** 
	 *	add a formula into the scope.
	 *	@param formula 	any formula
	 */
	public void add (AbstractFormula formula){
		if (formula==null) throw new NullableFormulaException("Scope: attempt to add a null reference.");
		if (formula.isNull()) throw new NullableFormulaException("Scope: some of the formula is null.");
		context.add(formula);
	}

	/** 
	 *	join the current scope with another scope (overwrite).
	 *	@param scope 	any scope
	 */
	public void join(Scope scope){
		if (scope==null) throw new NullableFormulaException("Scope: join with a null scope is not allowed.");
		this.scope=scope;
	}

	/* let array list handle the exceptions */
	public void remove(int i){context.remove(i);}
	public void remove(AbstractFormula formula){context.remove(formula);}
	public boolean isContextEmpty(){return context.size()==0;}
	public Scope getScope(){return this.scope;}
	public void setScope(Scope scope){this.scope=scope;}
	public boolean isScopeEmpty(){return this.scope==null;}
	public List<AbstractFormula> getContext(){return this.context;}
	public int size(){return context.size();}

	/**	flatten all scopes contained in the current scope */	
	public void flatten(){

		Scope s=this.scope;
		while (s!=null){
			context.addAll(s.getContext());
			s=s.getScope();
		}
		this.scope=null;
	}

	@Override
	public String toString(){
		/* faster than StringBuffer (single thread) */
		StringBuilder sb = new StringBuilder();
		sb.append("\n(push)\n");
		for (AbstractFormula ctx : context) sb.append(ctx+"\n");
		if (scope!=null) sb.append(scope);
		sb.append("\n(pop)\n");
		return sb.toString();
	}

	@Override
	public String toSMT2(){
		StringBuilder sb = new StringBuilder();
		sb.append("\n(push)\n");
		for (AbstractFormula f : context) sb.append(f.toSMT2()+"\n");
		if (scope!=null) sb .append(scope.toSMT2());
		sb.append("\n(pop)\n");
		
		return sb.toString();
	}

	@Override
	public void accept (AbstractVisitor visitor){
		visitor.visit(this);
	}

}
