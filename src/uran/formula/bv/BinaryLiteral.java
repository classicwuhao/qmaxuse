/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++Written by: Hao Wu++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *
 *	This is a part of my research work.
 *  haowu@cs.nuim.ie
 *  OCTOBER-2016 
 *  
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * ++++++++++++++++++++++++++++++Do or do not, there is no try.+++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package uran.formula.bv;
import uran.formula.AbstractFormula;
import uran.formula.visitor.AbstractVisitor;
import uran.err.IllFormedFormulaException;


/**
 * Abstract syntax tree for binary literal
 */
public final class BinaryLiteral extends BV_Literal{

	private String binary;

	/* disable the default constructor */
	private BinaryLiteral(){}

	/**
	 *	Create a binary literal node.	
	 * @param binary	a string of 0s and 1s.	
	 */
	public BinaryLiteral(String binary){
		if (binary==null) throw new IllFormedFormulaException("Error: name cannot be null.");
		if (binary.length()<=0) throw new IllFormedFormulaException("Error: the name is not specified.");
		
		this.binary = binary;
	}
	
	/**
	 *	Create a binary literal node.
	 *	
	 *	@param binary	a decimal number is encoded in a binary string.
	 */
	public BinaryLiteral(int dec){
		this.binary = Integer.toString(dec,2);
	}

	/**
	 *	Create a binary literal node.
	 *	
	 *	@param binary	a decimal number is encoded in a binary string with padded zeros in front of this binary.
	 */
	
	public BinaryLiteral (int dec, int n){
		String unpadded_binary = Integer.toString(dec,2);
		/* this is the case we need to pad zeros in front of the binary string.*/
		this.binary = (unpadded_binary.length()!=n) ? padZeros(unpadded_binary,n) : unpadded_binary;
	}

	private String padZeros (String str, int n){
		StringBuffer sb = new StringBuffer();
		for (int i=0;i<n-str.length();i++) sb.append("0");
		
		sb.append(str);
		return sb.toString();
	}

	/**
	 *
	 *	@return a string representation;
	 */
	public String binary(){ return this.binary;}

	private boolean check(String binary){
		for (int i=0;i<binary.length();i++)	
			if (binary.charAt(i)!='0' && binary.charAt(i)!='1') return false;
			
		return true;
	}
	
	@Override
	/**
	 *	@return the length of this bit vector
	 */
	public long length(){return this.binary.length();}
	
	/**
	 *	@return	true.
	 */		
	@Override
	public boolean isLiteral(){return true;}
	/**
	 *	@return	true.
	 */
	@Override
	public boolean isBinaryLiteral(){return true;}

	/**
	 *	@return	binary literal in SMT2 standard.
	 */
	@Override
	public String toSMT2(){
		return this.toString();
	}
	
	/**
	 * Accept a concrete visitor that inherits from AbstractVisitor
	 * @Param	visitor	the visitor used for generating formulas in SMT2 standard
	 */
	@Override
	public void accept (AbstractVisitor visitor){
		visitor.visit(this);
	}	

	/**
	 *	@return	the string representation of a binaryliteral.
	 */
	
	@Override
	public String toString(){
		return "#b"+this.binary;
	}
		
}
