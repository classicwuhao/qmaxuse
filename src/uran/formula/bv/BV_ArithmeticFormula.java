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
 * 	Construct an arithmetic formula (+,-,shift,*,%,etc)
 *	@author Hao Wu
 */

public final class BV_ArithmeticFormula extends BV_BinaryFormula{
	public BV_ArithmeticFormula(BV_Connective con){super(makeOperator(con));}

	/**
	 *	Construct an arithmetic formula with an appropriate connective.
	 *	@param	con	bit vector connective
	 *  @param	f1	left node
	 *	@param	f2	right node
	 */
	public BV_ArithmeticFormula(BV_Connective con, BV_Formula f1, BV_Formula f2){
		super(makeOperator(con),f1, f2);
	}

	/**
	 *	set formula with a new kind of connective.
	 *	@param	con	a new connective
	 */
	@Override
	public void setConnective (BV_Connective con){
		/*if (!checkConnective(con))
			throw new MissingFormulaException("Build ArithmeticFormula: Connective must be one of PLUS, MINUS, MUL and DIV.");*/
	
		super.setConnective(con);
	}

	private static BV_Connective makeOperator(BV_Connective con){
		/*if (!checkConnective(con))
			throw new MissingFormulaException("Build ComparisonFormula: you must specify a correct operator.");*/

		return con;
	}

	/**
	 *	merge a list of formulas 
	 *	@param	formulas	list of formulas to be merged.
	 */
	@Override
	public BV_BinaryFormula merge(BV_Formula...formulas){
		BV_ArithmeticFormula formula=this;
		int pos=0;
		if (connective()==null) throw new MissingFormulaException("You must specify a connective before mergeing any other formulas.");
		if (formulas==null) throw new NullableFormulaException("Build BV_ArithmeticFormula: No formula(s) found.");
		if (formulas.length<=1) throw new MissingFormulaException("Build BV_ArithmeticFormula: Formula size >=  2 is expected.");		
		
		if (this.isNull()){
			if (formulas.length<2) throw new MissingFormulaException("Build BV_ArithmeticFormula: Formula size >=  2 is expected.");
			formula.setLeft(formulas[0]);
			formula.setRight(formulas[1]);
			pos=2;
		}
		
		for (int i=pos;i<formulas.length;i++){
			if (formulas[i].isNull()) throw new NullableFormulaException("Build And Formula: A formula cannot be null");
			formula= new BV_ArithmeticFormula(connective(),formula,formulas[i]);
		}

		return formula;
	}	
}
