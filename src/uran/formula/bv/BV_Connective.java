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

public enum BV_Connective{
	EQUAL {public String toString(){return "=";}},
	AND {public String toString(){return "bvand";}},
	OR {public String toString(){return "bvor";}},
	XOR {public String toString(){return "bvxor";}},
	NOT {public String toString(){return "bvnot";}},
	NOR {public String toString(){return "bvnor";}},
	NAND{public String toString(){return "bvnand";}},
	ADD {public String toString(){return "bvadd";}},
	SUB {public String toString(){return "bvsub";}},
	NEG {public String toString(){return "bvneg";}},
	MUL {public String toString(){return "bvmul";}},
	SREM {public String toString(){return "bvsrem";}},// signed remainder
	UREM {public String toString(){return "bvurem";}},// unsigned remainder
	SMOD {public String toString(){return "bvsmod";}},// signed modulo
	//UMOD {public String toString(){return "bvsmod";}},// unsigned modulo
	SHL {public String toString(){return "bvshl";}},// shift left
	SHR {public String toString(){return "bvshr";}},// shift right
	//LSHL {public String toString(){return "bvlshl";}},// unsigned (logcial) shift left
	LSHR {public String toString(){return "bvlshr";}},// unsigned (logcial) shift right
	//ASHL {public String toString(){return "bvashl";}},//signed (arithmetical) shift left	
	ASHR {public String toString(){return "bvashr";}},//signed (arithmetical) shift right
	ULE {public String toString(){return "bvule";}},//unsigend less or equal
	ULT {public String toString(){return "bvult";}},//unsigend less than
	UGE {public String toString(){return "bvuge";}},//unsigend greater or equal
	UGT {public String toString(){return "bvugt";}},//unsigend greater than
	SLE {public String toString(){return "bvsle";}},//sigend less or equal
	SLT {public String toString(){return "bvslt";}},//sigend less than
	SGE {public String toString(){return "bvsge";}},//sigend greater or equal
	SGT {public String toString(){return "bvsgt";}}//sigend greater than	
	;
}
