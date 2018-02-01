package org.tzi.use.syn;

import uran.test.util.*;
import uran.formula.*;
import uran.formula.*;
import uran.formula.value.*;
import uran.formula.type.*;
import uran.formula.smt2.*;
import uran.solver.*;
import java.util.*;

public final class Matrix{

	private int deltaSize=0;
	private int callLength=0;
	private Constant[][] matrix;
	private final String AUX="aux";
	private final int LB=0;
	private final int UB=1;
	private List<AbstractFormula> formulas = new ArrayList<AbstractFormula>();
	private FunctionFactory factory = new FunctionFactory(512,0.75f);
	
	public Matrix (int n, int k){
		this.deltaSize = n;
		this.callLength = k;
		initialise();
	}

	private void initialise(){
		this.matrix = new Constant[this.deltaSize][this.callLength];
	
		for (int i=0;i<this.deltaSize;i++){
			for (int j=0;j<this.callLength;j++){
				Constant var = factory.createConstant(AUX+i+j,new Int());
				this.matrix[i][j] = var;
				formulas.add (FormulaBuilder.range(0,1,var,true));
			}
		}
	}
	
	public String toString(){
		/* a single thread, use string builder */
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		for (int i=0;i<this.deltaSize;i++){
			for (int j=0;j<this.callLength;j++) sb.append(this.matrix[i][j]+ " ");
			sb.append("\n");
		}
		sb.append("\n");
		return sb.toString();
	}
	
	
	public String toValue(){
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		for (int i=0;i<this.deltaSize;i++){
			for (int j=0;j<this.callLength;j++) sb.append(factory.getValue(this.matrix[i][j].name())+ " ");
			sb.append("\n");
		}
		sb.append("\n");
		return sb.toString();		
	
	}
	
	public void solve(){
		SMT2Writer writer = new SMT2Writer("./ir.smt2",factory,formulas);
		Z3SMT2Solver solver = new Z3SMT2Solver(writer);
		
		if (solver.solve()==Result.SAT)
			ColorPrint.println("Successful.",Color.GREEN);
		else
			ColorPrint.println("No Solution.",Color.RED);
			
	}
	
	public static void main (String args[]){
		Matrix matrix = new Matrix(5,6);
		ColorPrint.print(matrix.toString(),Color.BLUE);
		matrix.solve();
		ColorPrint.print(matrix.toValue(),Color.WHITE);
	}

		
}
