/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++Written by: Hao Wu++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *
 *	This is a part of my research work.
 * 	haowu@cs.nuim.ie
 * 	APR-2015 
 *  
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * ++++++++++++++++++++++++++++++Do or do not, there is no try.+++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */


package uran.formula.visitor;

import uran.formula.*;

public abstract class AbstractVisitor{

	public abstract void visit (BinaryFormula f);
	public abstract void visit (ImpliesFormula f);
	public abstract void visit (NegFormula f);
	public abstract void visit (Function f);
	public abstract void visit (QuantifiedFormula f);
	public abstract void visit (Scope s);
	public abstract void visit (Decls d);
	public abstract void visit (BoolLiteral l);
	public abstract void visit (NumLiteral l);
}
