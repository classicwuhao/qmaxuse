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
 * 	Construct an arithmetic formula (+,-,*,div)
 *	@author Hao Wu
 */

public final class ArithmeticFormula extends BinaryFormula{
	public ArithmeticFormula(Connective con){super(makeOperator(con));}

	public ArithmeticFormula(Connective con, AbstractFormula f1, AbstractFormula f2){
		super(makeOperator(con),f1, f2);
	}

	/**
	 *	set formula with a new kind of connective.
	 *	@param	con	a new connective
	 */
	@Override
	public void setConnective (Connective con){
		if (!checkConnective(con))
			throw new MissingFormulaException("Build ArithmeticFormula: Connective must be one of PLUS, MINUS, MUL and DIV.");
	
		super.setConnective(con);
	}

	private static boolean checkConnective(Connective con){
		if (con==null) throw new NullableFormulaException("Set ComparisonFormula: you must specifiy a correct connective.");
		return  con==Connective.PLUS || con==Connective.MINUS || con==Connective.MUL || con==Connective.DIV;
	}

	private static Connective makeOperator(Connective con){
		if (!checkConnective(con))
			throw new MissingFormulaException("Build ComparisonFormula: you must specify a correct operator.");

		return con;
	}

	/**
	 *	merge a list of formulas 
	 *	@param	formulas	list of formulas to be merged.
	 *	@TODO: need to connect all them with AND gates
	 */
	@Override
	public BinaryFormula merge(AbstractFormula...formulas){
		ArithmeticFormula formula=this;
		int pos=0;
		if (connective()==null) throw new MissingFormulaException("You must specify a connective before mergeing any other formulas.");
		if (formulas==null) throw new NullableFormulaException("Build ArithmeticFormula: No formula(s) found.");
		if (formulas.length<=1) throw new MissingFormulaException("Build ArithmeticFormula: Formula size >=  2 is expected.");		
		
		if (this.isNull()){
			if (formulas.length<2) throw new MissingFormulaException("Build ArithmeticFormula: Formula size >=  2 is expected.");
			formula.setLeft(formulas[0]);
			formula.setRight(formulas[1]);
			pos=2;
		}
		
		for (int i=pos;i<formulas.length;i++){
			if (formulas[i].isNull()) throw new NullableFormulaException("Build And Formula: A formula cannot be null");
			formula= new ArithmeticFormula(connective(),formula,formulas[i]);
		}

		return formula;
	}	
}
