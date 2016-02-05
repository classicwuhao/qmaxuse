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

public final class ImpliesFormula extends BinaryFormula{
	
	public ImpliesFormula(){super(Connective.IMPLIES);}
	
	public ImpliesFormula(AbstractFormula f1, AbstractFormula f2){
		super(Connective.IMPLIES,f1,f2);
	}
	

	@Override	
	public BinaryFormula merge (AbstractFormula...formulas){
		ImpliesFormula formula=this;
		int pos=0;

		if (formulas==null) throw new NullableFormulaException("Build And Formula: No formula(s) found.");
					
		if (formula.isNull()){
			if (formulas.length<2) throw new MissingFormulaException("Build And Formula: Formula size >=  2 is expected.");
			formula.setLeft(formulas[0]);
			formula.setRight(formulas[1]);
			formula.setConnective(Connective.IMPLIES);
			pos=2;
		}
		
		for (int i=pos;i<formulas.length;i++){
			if (formulas[i].isNull()) throw new NullableFormulaException("Build And Formula: A formula cannot be null");
			formula= new ImpliesFormula(formula,formulas[i]);
		}
		return formula;
	}

	
}
