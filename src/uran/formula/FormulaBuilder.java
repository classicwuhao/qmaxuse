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
import uran.formula.value.*;
import uran.formula.type.*;

public final class FormulaBuilder{

	public static AbstractFormula some(AbstractFormula...formulas){
		return new OrFormula().merge(formulas);
	}

	public static AbstractFormula one(AbstractFormula...formulas){
		return new OneFormula().merge(formulas);
	}

	public static AbstractFormula all(AbstractFormula...formulas){
		return new AndFormula().merge(formulas);	
	}

	public static AbstractFormula negation(AbstractFormula formula){
		return new NegFormula(formula);
	}

	public static AbstractFormula neq(AbstractFormula formula1, AbstractFormula formula2){
		return negation(new EqFormula(formula1, formula2));
	}
	
	public static AbstractFormula sum(int k, AbstractFormula...formulas){
		return new EqFormula(new ArithmeticFormula(Connective.PLUS).merge(formulas),new NumLiteral(new IntValue(k)));
	}

	public static AbstractFormula none(AbstractFormula...formulas){
		return new NegFormula(new AndFormula().merge(formulas));
	}
	
	public static AbstractFormula exact (int k, AbstractFormula...formulas){
		return sum(k,formulas);
	}

	public static AbstractFormula negassign (AbstractFormula...formulas){
		return negation(all(formulas));
	}
	
	public static AbstractFormula range (int k, int j, Function f, boolean inclusive){
		return  inclusive 
				? 
				new AndFormula(
					new ComparisonFormula (Connective.GEQ, f, new NumLiteral(k)),
					new ComparisonFormula (Connective.LEQ, f, new NumLiteral(j))
				)
				:
				new AndFormula(
					new ComparisonFormula (Connective.GREATER, f, new NumLiteral(k)),
					new ComparisonFormula (Connective.LESS, f, new NumLiteral(j))
				);
	}
		
		
}
