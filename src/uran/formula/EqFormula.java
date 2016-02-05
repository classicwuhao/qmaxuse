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

import uran.err.NullableFormulaException;
import uran.err.MissingFormulaException;

public final class EqFormula extends BinaryFormula{

	public EqFormula(){super(Connective.EQUAL);}
		
	public EqFormula(AbstractFormula f1, AbstractFormula f2){
		super(Connective.EQUAL,f1,f2);
	}

	@Override	
	public BinaryFormula merge (AbstractFormula...formulas){
		EqFormula formula,prev;
		int pos=0;

		prev=formula=this;
		if (formulas==null) throw new NullableFormulaException("Build Equal Formula: No formula(s) found.");
		
		if (formula.isNull()){
			if (formulas.length<2) throw new MissingFormulaException("Build Equal Formula: Formula size >=  2 is expected.");
			formula.setLeft(formulas[0]);
			formula.setRight(formulas[1]);
			formula.setConnective(Connective.EQUAL);
			pos=2;
		}

		if (formulas.length<=2) return formula;
		
		AndFormula r = new AndFormula(prev, new EqFormula(prev.right(), formulas[2]));		
		for (int i=pos;i<formulas.length;i++){
			if (formulas[i].isNull()) throw new NullableFormulaException("Build Equal Formula: A formula cannot be null");
			EqFormula eq = new EqFormula(prev.right(),formulas[i]);
			r=new AndFormula(r,eq);
			prev=eq;
		}
		return r;
	}

	@Override
	public boolean isEqFormula (){return true;}
}
