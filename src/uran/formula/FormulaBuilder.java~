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
import java.util.List;

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

	public static AbstractFormula neg(AbstractFormula formula){
		return new NegFormula(formula);
	}

	public static AbstractFormula neq(AbstractFormula formula1, AbstractFormula formula2){
		return neg(new EqFormula(formula1, formula2));
	}

	public static AbstractFormula sum(int k, List<Constant> formulas){
		return sum(k, formulas.toArray(new Constant[formulas.size()]));
	}
	
	public static AbstractFormula sum(int k, AbstractFormula...formulas){
		return 
			(formulas.length > 1) ?
				new EqFormula(new ArithmeticFormula(Connective.PLUS).merge(formulas),new NumLiteral(new IntValue(k)))
			:
				new EqFormula(formulas[0], new NumLiteral(new IntValue(k)))
			;
	}

	public static AbstractFormula none(AbstractFormula...formulas){
		return new NegFormula(new AndFormula().merge(formulas));
	}
	
	public static AbstractFormula exact (int k, AbstractFormula...formulas){
		return sum(k,formulas);
	}

	public static AbstractFormula plus(AbstractFormula...formulas){
		return new ArithmeticFormula(Connective.PLUS).merge(formulas);
	}

	public static AbstractFormula plus (List<Constant> formulas){
		return plus(formulas.toArray(new Constant[formulas.size()]));
	}

	public static AbstractFormula above(AbstractFormula f, int k, boolean inclusive){
		return inclusive
				?
					new ComparisonFormula(Connective.GEQ, f, new NumLiteral(k)) 
				:
					new ComparisonFormula(Connective.GREATER, f, new NumLiteral(k)); 
	}
	
	public static AbstractFormula below(AbstractFormula f, int k, boolean inclusive){
		return inclusive
				?
					new ComparisonFormula(Connective.LEQ, f, new NumLiteral(k)) 
				:
					new ComparisonFormula(Connective.LESS, f, new NumLiteral(k));
	}

	public static AbstractFormula negassign (AbstractFormula...formulas){
		return neg(all(formulas));
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
