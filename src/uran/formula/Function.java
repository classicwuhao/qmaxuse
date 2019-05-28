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
import uran.formula.type.*;
import uran.err.NullableFormulaException;
import uran.err.TypeMissmatchException;
import uran.err.ArgumentSizeException;
import uran.formula.visitor.AbstractVisitor;

/**	Abstract syntax tree for function */
public class Function extends AbstractFormula{
	private String name;
	private Type[] arguments;
	private Type returnType;
	private AbstractFormula[] functions;	//keep track of function applications.
	
	/** Construct a function based on a list of argument type */
	public Function (String n, Type...args){
		if (n==null) throw new NullableFormulaException("Function: a function's name cannot be nullable.");
		if (n.trim().equals("")) throw new NullableFormulaException("Function: a function must have a name.");
		if (args==null) throw new NullableFormulaException("Function: a function must have a return type.");

		arguments = new Type[args.length];		
		for (int i=0;i<args.length;i++){
			if (args[i]==null) throw new NullableFormulaException("Function: an agrument is null.");
			arguments[i]=args[i];
		}
		this.name = n;
	}

	/** Construct a function application */
	public Function (Function fun, AbstractFormula...args){
		this.name = fun.name();
		this.arguments = fun.getArgs();
		this.returnType = fun.getReturnType();
		this.functions = args;
	}

	/** Return the arity of this function. */
	public int arity(){	
		if (arguments==null) throw new NullableFormulaException("Function: agurment is null, no arity is avaible.");
		return arguments.length-1;
	}

	/** Return the name of this function. */
	public String name(){
		if (name==null) throw new NullableFormulaException("Function: name is null.");
		if (name.trim().equals("")) throw new NullableFormulaException("Function: name is empty.");
		return this.name;
	}

	/** Return all arguments */	
	public Type[] getArgs(){return this.arguments;}
	
	/** Get a specific argument type. */
	public Type getArgs(int index){
		if (arguments==null) throw new NullableFormulaException("Function: agurment is null, cannot get args.");
		if (index<0) throw new NullableFormulaException("Function: agurment index is out of bound.");
		return arguments[index];
	}

	/** Get the return type of this function. */
	public Type getReturnType(){
		if (arguments==null) throw new NullableFormulaException("Function: agurment is null, cannot get return type.");
		return arguments[arguments.length-1];
	}

	/** A constant is that a function has 0 arity. */
	public boolean isConstant(){
		if (arguments==null) throw new NullableFormulaException("Function: agurment is null, cannot get return type.");
		return arguments.length==1;
	}

	/** Returns true  */
	public boolean isFunction(){return true;}
	
	/** Apply this function on a list of functions.
	 *	
	 *	@param functions	list of functions to be applied on.
	 */
	public Function apply(AbstractFormula...functions){
		if (arguments.length-1 != functions.length) throw new ArgumentSizeException();	
		
		//Function[] f = new Function[functions.length];
		//for (int i=0;i<functions.length;i++){
			//if (functions[i].isFunction()){
			//	if (!arguments[i].equalsTo(((Function)functions[i]).getReturnType())){
			//		throw new TypeMissmatchException("Error: expected type is "+arguments[i]);
			//	}
			//	else{
					//f[i]=functions[i];
			//	}
			//}
		//}
		
		return new Function(this,functions);
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder("(");
		sb.append(name);
		for (int i=0;i<arguments.length;i++){
			sb.append(" ");
			sb.append(arguments[i]);
			sb.append(" ");
		}
		sb.append(")");
		return sb.toString();
	}
	
	@Override
	/** This is for generating function application.  NOTE: Function declaration must be created 1st. */
	public String toSMT2(){

		if (this.functions==null) 
			throw new NullableFormulaException("Function: SMT2 formula generation failed because no function application can be found.");

		StringBuilder sb = new StringBuilder();
		sb.append("( "+name);
		for (int i=0;i<this.functions.length;i++) sb.append(" "+this.functions[i].toSMT2()+" ");
		sb.append(") ");
		return sb.toString();
		//return toSMT2_decl();
	}
	
	/** This is for generating declaration only. */
	public String toSMT2_decl(){
		StringBuilder sb = new StringBuilder();
		sb.append(name+" (");
		for (int i=0;i<arguments.length-1;i++) sb.append(" "+arguments[i]);
		sb.append(") "+arguments[arguments.length-1]);
		return sb.toString();		
	}
	
	public void accept (AbstractVisitor visitor){
		visitor.visit(this);
	}

}
