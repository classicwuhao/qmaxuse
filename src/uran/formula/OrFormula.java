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

public final class OrFormula extends BinaryFormula{

	public OrFormula(){super(Connective.OR);}
	
	public OrFormula(AbstractFormula f1, AbstractFormula f2){
		super(Connective.OR,f1,f2);
	}


	@Override	
	public OrFormula merge (AbstractFormula...formulas){
		OrFormula formula=this;
		int pos=0;

		if (formulas==null) throw new NullableFormulaException("Build Or Formula: No formula(s) found.");
		
		if (formula.isNull()){
			if (formulas.length<2) throw new MissingFormulaException("Build Or Formula: Formula size >=  2 is expected.");
			formula.setLeft(formulas[0]);
			formula.setRight(formulas[1]);
			formula.setConnective(Connective.OR);
			pos=2;
		}
		
		for (int i=pos;i<formulas.length;i++){
			if (formulas[i].isNull()) throw new NullableFormulaException("Build Or Formula: A formula cannot be null");
			formula= new OrFormula(formula,formulas[i]);
		}
		return formula;	
		
	}

}
