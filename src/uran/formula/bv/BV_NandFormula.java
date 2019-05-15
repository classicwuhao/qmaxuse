
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

/** 
 * 	Constrcut bitvector and formula. 
 *	@author Hao Wu
 */
public final class BV_NandFormula extends BV_BinaryFormula{
	public BV_NandFormula(){super(BV_Connective.NAND);}
			
	public BV_NandFormula(BV_Formula f1, BV_Formula f2){
		super(BV_Connective.NAND,f1,f2);
	}


	/**	
	 *	merge a list of formulas, all with the and gate 
	 *	@param formulas		a list of bit vector formulas.
	 *	@return				a new bit vector and formula.
	 */

	@Override	
	public BV_BinaryFormula merge (BV_Formula...formulas){
		BV_NandFormula formula=this;
		int pos=0;

		if (formulas==null) throw new NullableFormulaException("Build And Formula: No formula(s) found.");
					
		if (formula.isNull()){
			if (formulas.length<2) throw new MissingFormulaException("Build And Formula: Formula size >=  2 is expected.");
			formula.setLeft(formulas[0]);
			formula.setRight(formulas[1]);
			formula.setConnective(BV_Connective.NAND);
			pos=2;
		}

		for (int i=pos;i<formulas.length;i++){
			if (formulas[i].isNull()) throw new NullableFormulaException("Build And Formula: A formula cannot be null");
			formula= new BV_NandFormula(formula,formulas[i]);
		}
		return formula;
	}
		
}
