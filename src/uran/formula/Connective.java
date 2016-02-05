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

public enum Connective{
	AND {public String toString(){return "and";}},
	OR {public String toString(){return "or";}},
	XOR {public String toString(){return "xor";}},
	IMPLIES {public String toString(){return "=>";}},
	NOT {public String toString(){return "not";}},
	IFF {public String toString(){return "<=>";}},
	EQUAL{public String toString(){return "=";}},
	PLUS{public String toString(){return "+";}},
	MINUS{public String toString(){return "-";}},
	MUL{public String toString(){return "*";}},
	DIV{public String toString(){return "div";}},
	GREATER{public String toString(){return ">";}},
	LESS{public String toString(){return "<";}},
	GEQ{public String toString(){return ">=";}},	
	LEQ{public String toString(){return "<=";}};
}
