/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++Written by: Hao Wu++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *
 *	This is a part of my research work.
 *  haowu@cs.nuim.ie
 *  OCT-2016
 *  
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * ++++++++++++++++++++++++++++++Do or do not, there is no try.+++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */

package uran.formula.bv;

import uran.err.NullableFormulaException;
import uran.err.MissingFormulaException;

public final class BV_NorFormula extends BV_BinaryFormula{

	public BV_NorFormula(){super(BV_Connective.NOR);}
	
	public BV_NorFormula(BV_Formula f1, BV_Formula f2){
		super(BV_Connective.NOR,f1,f2);
	}

	@Override	
	public BV_NorFormula merge (BV_Formula...formulas){
		BV_NorFormula formula=this;
		int pos=0;

		if (formulas==null) throw new NullableFormulaException("Build Or Formula: No formula(s) found.");
		
		if (formula.isNull()){
			if (formulas.length<2) throw new MissingFormulaException("Build Or Formula: Formula size >=  2 is expected.");
			formula.setLeft(formulas[0]);
			formula.setRight(formulas[1]);
			formula.setConnective(BV_Connective.OR);
			pos=2;
		}
		
		for (int i=pos;i<formulas.length;i++){
			if (formulas[i].isNull()) throw new NullableFormulaException("Build Or Formula: A formula cannot be null");
			formula= new BV_NorFormula(formula,formulas[i]);
		}
		return formula;
		
	}

}
