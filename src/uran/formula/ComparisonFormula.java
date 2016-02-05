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


public final class ComparisonFormula extends BinaryFormula{

	public ComparisonFormula (Connective op){super(makeOperator(op));}

	public ComparisonFormula(Connective op, AbstractFormula f1, AbstractFormula f2){
		super(makeOperator(op),f1,f2);
	}

	private static boolean checkConnective(Connective con){
		if (con==null) throw new NullableFormulaException("Set ComparisonFormula: you must specifiy a correct connective.");
		return  con==Connective.GREATER || con==Connective.LESS || con==Connective.GEQ || con==Connective.LEQ;
	}

	private static Connective makeOperator(Connective con){
		if (!checkConnective(con))
			throw new MissingFormulaException("Build ComparisonFormula: you must specify a correct operator.");

		return con;
	}

	@Override
	public BinaryFormula merge(AbstractFormula...formulas){
		ComparisonFormula formula=this;
		int pos=0;

		if (formulas==null) throw new NullableFormulaException("Build ComparisonFormula: No formula(s) found.");
		if (formulas.length<=0) throw new MissingFormulaException("Build ComparisonFormula: Formula size >=  1 is expected.");
		if (this.connective()==null) throw new MissingFormulaException("Build ComparisonFormula: an operator must be specified.");

		if (formula.isNull()){
			formula.setLeft(formulas[0]);
			formula.setRight(formulas[1]);
			pos=2;
		}

		AbstractFormula right=formula.right();
		AndFormula and=null;
		AbstractFormula prev=formula;

		for (int i=pos;i<formulas.length;i++){
			if (formulas[i]==null) throw new NullableFormulaException("Build ComparisonFormula: a formula cannot be null.");
			ComparisonFormula cmp = new ComparisonFormula(this.connective(),right,formulas[i]);
			prev= and = new AndFormula(prev, cmp);
			right=formulas[i];
		}
		
		return and;
	}

	//@Override
	//public boolean isComparisonFormula(){return true;}

}
