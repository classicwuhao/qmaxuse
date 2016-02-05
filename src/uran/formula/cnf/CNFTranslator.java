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


/* 
 * This is the standard tseitin transformation.
 * 
 */

package uran.formula.cnf;

import java.util.Hashtable;
import java.util.ArrayList;
import java.io.IOException;
import java.io.RandomAccessFile;
import uran.err.NullableFormulaException;
import uran.err.MissingFormulaException;
import uran.formula.cnf.visitor.AbstractVisitor;
import uran.formula.cnf.*;

public final class CNFTranslator extends AbstractVisitor implements Translator{
		
	private BooleanCircuit[] circuits;
	private long[] clause;
	private Hashtable<BooleanCircuit, Long> variables = new Hashtable<BooleanCircuit, Long>();
	private Hashtable<BooleanCircuit, long[]> cache = new Hashtable<BooleanCircuit, long[]>();
	private long label=1;
	private long clauses=0;
	private RandomAccessFile raf;
	private final String file;
	private final int size=8192;
	private StringBuilder buffer=new StringBuilder(size); //default size for buffer

	public CNFTranslator(BooleanCircuit c, String filename){
		checkNull(c);
		circuits = new BooleanCircuit[1];
		circuits[0] = c;
		file=filename;
		PrepareToWrite();
	}

	public CNFTranslator(BooleanCircuit[] c, String filename){
		checkNull(c);
		circuits = c;
		file=filename;
		PrepareToWrite();
	}

	public void translate(){
		BinaryGate ands=null;
		if (circuits.length==0){ return;}
		if (circuits.length==1) {
			circuits[0].accept(this);
			buffer.append(circuits[0].label()+" 0\n");			
			return;
		}

		if (circuits.length>=2) ands = new BinaryGate(Operator.AND,circuits[0],circuits[1]);

		for (int i=2;i<circuits.length;i++) ands = new BinaryGate(Operator.AND,ands,circuits[i]);
		ands.accept(this);
		buffer.append(ands.label()+" 0\n");
		
		printVars(); //for debug purpose only.
		
	}	
	
	public void translate(BooleanCircuit c){
		c.accept(this);
	}

	private void checkNull(BooleanCircuit[] c){
		if (c==null) throw new NullableFormulaException("Error: formula cannot be null.");
		for (int i=0;i<c.length;i++)
			checkNull(c[i]);
	}

	private void checkNull(BooleanCircuit c){
		if (c==null) throw new NullableFormulaException("Error: formula cannot be null.");
	}

	public void visit (BinaryGate b){
		if (cache.containsKey(b)) return;
		newVariable(b);

		switch (b.operator()){
			case Operator.AND:
				b.input0().accept(this);
				b.input1().accept(this);
				clause=translateAND(b);
				debug(clause);
				tobuffer(clause);
				return;

			case Operator.OR:
				b.input0().accept(this);
				b.input1().accept(this);
				clause=translateOR(b);
				debug(clause);
				tobuffer(clause);
				return;

			case Operator.XOR:
				b.input0().accept(this);
				b.input1().accept(this);
				clause=translateXOR(b);
				debug(clause);
				tobuffer(clause);
				return;
		
			case Operator.NAND:
				b.input0().accept(this);
				b.input1().accept(this);
				clause=translateNAND(b);
				debug(clause);		
				tobuffer(clause);	
				return;

			case Operator.NOR:
				b.input0().accept(this);
				b.input1().accept(this);
				clause=translateNOR(b);
				debug(clause);
				tobuffer(clause);
				return;

			default:
				; //denote as an empty expression
		}
	}

	private long[] translateAND(BinaryGate and){
		clauses++;
		if (cache.containsKey(and)) return cache.get(and);
		
		long[] _clause = new long[7];
		_clause[0]=and.input0().negation();
		_clause[1]=and.input1().negation();
		_clause[2]=and.label();
		_clause[3]=and.input0().label();
		_clause[4]=and.negation();
		_clause[5]=and.input1().label();
		_clause[6]=and.negation();
		cache.put(and,_clause);
	
		return _clause;
	}

	private long[] translateOR(BinaryGate or){
		clauses++;
		long[] _clause = new long[7];
		_clause[0]=or.input0().label();
		_clause[1]=or.input1().label();
		_clause[2]=or.negation();
		_clause[3]=or.input0().negation();
		_clause[4]=or.label();
		_clause[5]=or.input1().negation();
		_clause[6]=or.label();
		cache.put(or,_clause);
		
		return _clause;
	}

	private long[] translateNOT(NotGate not){
		clauses++;

		long[] _clause = new long[4];
		_clause[0]=not.input().negation();
		_clause[1]=not.negation();
		_clause[2]=not.input().label();
		_clause[3]=not.label();
		cache.put(not, _clause);
		
		return _clause;
	}

	private long[] translateXOR(BinaryGate xor){
		clauses++;
		long[] _clause = new long [12];
		_clause[0]=xor.input0().negation();
		_clause[1]=xor.input1().negation();
		_clause[2]=xor.negation();
		_clause[3]=xor.input0().label();
		_clause[4]=xor.input1().label();
		_clause[5]=xor.negation();
		_clause[6]=xor.input0().label();
		_clause[7]=xor.input1().negation();
		_clause[8]=xor.label();
		_clause[9]=xor.input0().negation();
		_clause[10]=xor.input1().label();
		_clause[11]=xor.label();
		cache.put(xor,_clause);

		return _clause;
	}


	private long[] translateNOR(BinaryGate nor){
		clauses++;
		long[] _clause= new long[7];
		_clause[0]=nor.input0().label();
		_clause[1]=nor.input1().label();
		_clause[2]=nor.label();
		_clause[3]=nor.input0().negation();
		_clause[4]=nor.negation();
		_clause[5]=nor.input1().negation();
		_clause[6]=nor.negation();
		cache.put(nor, _clause);

		return _clause;

	}

	private long[] translateNAND(BinaryGate nand){
		clauses++;
		long[] _clause= new long[7];
		_clause[0]=nand.input0().negation();
		_clause[1]=nand.input1().negation();
		_clause[2]=nand.negation();
		_clause[3]=nand.input0().label();
		_clause[4]=nand.label();
		_clause[5]=nand.input1().label();
		_clause[6]=nand.label();
		cache.put(nand, _clause);

		return _clause;
	}


	public void visit (BooleanVariable v){
		newVariable(v);
	}

	public void visit (NotGate n){
		newVariable(n);
		if (cache.containsKey(n)) return;
		clause=translateNOT(n); // do the translation here ?
		debug(clause);
		tobuffer(clause);
	}

	public void newVariable(BooleanCircuit c){
		if (!variables.containsKey(c)){
			variables.put(c,label);
			c.assign(label++);  //make sure we record this varaible (no need for getting value from table again.)
		}
	}

	private void debug (long[] clause){
		for (int i=0;i<clause.length;i++){
			System.err.print(clause[i]+" ");
		}
		System.out.println();	
	}

	private void printVars(){
		for (BooleanCircuit b : variables.keySet())
			if (b.isBooleanVariable())
				System.err.println(((BooleanVariable)b).alias()+"|->"+variables.get(b));
	}

	private void tobuffer(long[] clause){
		if (buffer.length()>=size){
			flush();
			buffer.setLength(0);
		}

		for (int i=0;i<clause.length;i++) buffer.append(clause[i]+" ");
		buffer.append("0 \n");
	}

	private void flush(){
		try{
			raf.writeBytes(buffer.toString());
			buffer.setLength(0);
		}
		catch (IOException e){
			throw new RuntimeException("Error: failed to write buffer.");
		}
		
	}

	public void generate(){
		try{
			flush();
			raf.seek(0);
			raf.writeBytes("p cnf "+this.noOfVariables()+" "+this.noOfClauses()+" ");
			raf.close();
		}
		catch (IOException e){
			throw new RuntimeException("Error: failed to generate cnf file."+e.getMessage());

		}
	}

	public long noOfVariables(){return label-1;}
	public long noOfClauses(){return clauses;}

	private void PrepareToWrite(){
		try{
			raf =new RandomAccessFile(file,"rw");
			for (int i=0;i<String.valueOf(Long.MAX_VALUE).length()*2+8;i++) buffer.append(" "); //make space for writing header
			buffer.append("\n");
		}
		catch (IOException e){
			throw new RuntimeException("Error: failed to write CNF file: "+file);
		}
	}

}
