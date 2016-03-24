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

public final class QuantifiedFormula extends AbstractFormula{
	AbstractFormula formula;
	Decls vars;
	Quantifier quan;
	
	public QuantifiedFormula(Quantifier q, Decls d, AbstractFormula f){
		formula=f;
		quan=q;
		vars=d;	
	}
	
	public Quantifier getQuantifier(){return quan;}
	public AbstractFormula getFormula(){return formula;}
	public Constant[] getVariables(){return vars.get();}
	public Decls getDecls(){return vars;}
	public void setVariables (Decls d){vars=d;}
	public void setFormula (AbstractFormula f){formula=f;}
	
	@Override
	public boolean isQuantifiedFormula(){return true;}	
		
	@Override 
	public String toString(){
		return "("+quan+" "+vars+" "+formula+" " +")";
	}

	@Override
	public String toSMT2(){
		StringBuilder sb = new StringBuilder();
		sb.append("("+quan+" (");
		for (int i=0;i<vars.size();i++) sb.append(vars.get(i).toString());
		sb.append(") " + formula.toSMT2());
		sb.append(")");
		
		return sb.toString();
	}

	@Override
	public void accept (AbstractVisitor visitor){
		visitor.visit(this);
	}

}
