
package uran.formula.array;

import uran.formula.AbstractFormula;
import uran.formula.visitor.AbstractVisitor;
import uran.formula.type.Type;

public abstract class ArrayFormula extends AbstractFormula{
	public String toString(){return "ArrayFormula";}
	
	@Override
	public boolean isArrayFormula(){return true;}
}


