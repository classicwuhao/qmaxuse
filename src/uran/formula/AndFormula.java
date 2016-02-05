
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

/** 
 * 	Constrcut and formula. 
 *	@author Hao Wu
 */
public final class AndFormula extends BinaryFormula{
	public AndFormula(){super(Connective.AND);}
			
	public AndFormula(AbstractFormula f1, AbstractFormula f2){
		super(Connective.AND,f1,f2);		
	}


	/**	
	 *	merge a list of formulas, all with the and gate 
	 *	@param formulas		a list of formulas.
	 *	@return				a new and formula.
	 */

	@Override	
	public BinaryFormula merge (AbstractFormula...formulas){
		AndFormula formula=this;
		int pos=0;

		if (formulas==null) throw new NullableFormulaException("Build And Formula: No formula(s) found.");
					
		if (formula.isNull()){
			if (formulas.length<2) throw new MissingFormulaException("Build And Formula: Formula size >=  2 is expected.");
			formula.setLeft(formulas[0]);
			formula.setRight(formulas[1]);
			formula.setConnective(Connective.AND);
			pos=2;
		}

		for (int i=pos;i<formulas.length;i++){
			if (formulas[i].isNull()) throw new NullableFormulaException("Build And Formula: A formula cannot be null");
			formula= new AndFormula(formula,formulas[i]);
		}
		return formula;
	}
		
}
