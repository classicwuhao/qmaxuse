package org.tzi.use.uran.msc;
import uran.test.util.*;
import uran.formula.*;
import uran.formula.value.*;
import uran.formula.type.*;
import uran.formula.smt2.*;
import uran.formula.type.*;
import uran.solver.*;
import java.util.*;

public final class MscSolver{
		
	private int sizeOfUnv;
	private int sizeOfSub;
	private int sets[][];
	private Constant atoms[];
	private Constant subsets[];
	private FunctionFactory factory = new FunctionFactory(512,0.75f);
	private List<List<Integer>> solutions = new ArrayList<List<Integer>>();

	public MscSolver(int m[][]){
		sets=m;
		this.sizeOfUnv = m.length;
		this.sizeOfSub = m[0].length;
	}

	public int getSizeOfUnv(){return this.sizeOfUnv;}
	public int getSizeOfSub(){return this.sizeOfSub;}
	
	public List<AbstractFormula> formalise(){
		if (sets==null) throw new MscSolverException("Error: my universe cannot be null.");
		if (sets.length==0) throw new MscSolverException("Error: my universe is empty.");
		if (sets[0].length==0) throw new MscSolverException("Error: no subet is found.");
		
		List<AbstractFormula> formulas = new ArrayList<AbstractFormula>();
		List<AbstractFormula> tmp_a = new ArrayList<AbstractFormula>();
		List<AbstractFormula> tmp_b = new ArrayList<AbstractFormula>();

		for (int i=0;i<sets.length;i++) {
			Constant x = factory.createConstant("A"+i, new Int());
			formulas.add (FormulaBuilder.range(0,1,x,true));
		}
	
		for (int i=0;i<sets[0].length;i++){
			Constant s = factory.createConstant("s"+i, new Int());
			formulas.add (FormulaBuilder.range(0,1,s,true));
		}

		for (int i=0;i<sets.length;i++){
			for (int j=0;j<sets[0].length;j++){
				if (sets[i][j]!=0) {
					Constant e = factory.createConstant("a_"+i+"_"+j, new Int());
					formulas.add (FormulaBuilder.range(0,1,e,true));
				}
			}
		}

		for (int i=0;i<sets[0].length;i++){
			Constant s = factory.conLookup("s"+i);
			tmp_a.clear();tmp_b.clear();
			for (int j=0;j<sets.length;j++){
				if (sets[j][i]!=0){
					Constant e = factory.conLookup("a_"+j+"_"+i);
					tmp_a.add(new EqFormula(e,new NumLiteral(1)));
					tmp_b.add(new EqFormula(e, new NumLiteral(0)));
				}
			}

			if (tmp_a.size()<=0){
				/* this is an empty set */
				formulas.add (new EqFormula(s,new NumLiteral(0)));
				continue;
			}

			if (tmp_a.size()>1){
				formulas.add(new ImpliesFormula( new EqFormula(s,new NumLiteral(1)), new AndFormula().merge(tmp_a.toArray(new AbstractFormula[tmp_a.size()]))));
				formulas.add(new ImpliesFormula( new EqFormula(s,new NumLiteral(0)), new AndFormula().merge(tmp_b.toArray(new AbstractFormula[tmp_b.size()]))));
			}
			else{
				formulas.add(new ImpliesFormula(new EqFormula(s, new NumLiteral(1)), tmp_a.get(0)));
				formulas.add(new ImpliesFormula(new EqFormula(s, new NumLiteral(0)), tmp_b.get(0)));
			}
			
		}
		
		for (int i=0;i<sets.length;i++){
			tmp_a.clear();tmp_b.clear();
			Constant x = factory.conLookup("A"+i);
			for (int j=0;j<sets[0].length;j++){
				if (sets[i][j]!=0){
					Constant a = factory.conLookup("a_"+i+"_"+j);
					tmp_a.add (new EqFormula(a,new NumLiteral(1)));
					tmp_b.add (new EqFormula(a,new NumLiteral(0)));
				}
			}

			if (tmp_a.size()<=0){
				/* this element cannot be covered. UNSAT */
				formulas.add(new EqFormula(x, new NumLiteral(0)));				
				continue;
			}

			if (tmp_a.size()>1){
				formulas.add(new ImpliesFormula(new OrFormula().merge(tmp_a.toArray(new AbstractFormula[tmp_a.size()])),new EqFormula(x,new NumLiteral(1))));
				formulas.add(new ImpliesFormula(new AndFormula().merge(tmp_b.toArray(new AbstractFormula[tmp_b.size()])),new EqFormula(x,new NumLiteral(0))));
			}
			else{
				formulas.add(new ImpliesFormula(tmp_a.get(0), new EqFormula(x,new NumLiteral(1))));
				formulas.add(new ImpliesFormula(tmp_b.get(0), new EqFormula(x,new NumLiteral(0))));
			}


		}

		/* form final two formulas */
		atoms = new Constant[sets.length];
		for (int i=0;i<sets.length;i++) atoms[i]=factory.conLookup("A"+i);
		formulas.add (FormulaBuilder.sum(atoms.length,atoms));

		subsets = new Constant[sets[0].length];
		for (int i=0;i<sets[0].length;i++) subsets[i]=factory.conLookup("s"+i);
		formulas.add(FormulaBuilder.sum(1,subsets));
		
		return formulas;
	}

	public void solve(List<AbstractFormula> formulas){
		List<AbstractFormula> newformulas = new ArrayList<AbstractFormula>();
		List<AbstractFormula> blockformulas = new ArrayList<AbstractFormula>();
		ColorPrint.println("Solving SC...",Color.WHITE);
		SMT2Writer writer = new SMT2Writer("./msc.smt2",factory,formulas);
		Z3SMT2Solver solver = new Z3SMT2Solver(writer);

		int k=1;int j=1;
		//newformulas.add (FormulaBuilder.sum(k,subsets));
		//writer.overwrite(newformulas,3);
		writer.remove(2);
		long current = System.currentTimeMillis();
		while (k<=subsets.length){
			j=0;
			while (solver.solve()==Result.SAT){
				//ColorPrint.println(k+" Set(s): ",Color.BLUE);
				ColorPrint.println("Single SC Solution:"+(System.currentTimeMillis()-current)+" ms.",Color.BLUE);
				AbstractFormula f = blockFormula();
				writer.append(f);
				newformulas.add(f);
				j++;
			}
			newformulas.add(FormulaBuilder.sum(++k,subsets));
			writer.overwrite(newformulas,j+1);
			newformulas.clear();
		}
		
	}

	private AbstractFormula blockFormula(){
		List<AbstractFormula> formulas = new ArrayList<AbstractFormula>();
		List<Integer> sol = new ArrayList<Integer>();
		for (int i=0;i<sets[0].length;i++){
			Value v = factory.getValue("s"+i);
			IntValue iv = (IntValue)v;
			Constant s = factory.conLookup("s"+i);
			if (iv.getValue()==1) {
				formulas.add(new EqFormula(s, new NumLiteral(1)));
				sol.add(i);
			}
		}
		solutions.add(sol);
		return (formulas.size()<=1) ? 
				new NegFormula(formulas.get(0)) 
			: 
				new NegFormula(new AndFormula().merge(formulas.toArray(new AbstractFormula[formulas.size()])));
	}

	public List<List<Integer>> getSubsets(){
		for (int i=0;i<solutions.size();i++){
			List<Integer> sol = solutions.get(i);
			for (int j=0;j<sol.size();j++){
				System.out.print(sol.get(j)+" ");
			}
			System.out.println();
		}
		return solutions;
	}

	public static void main (String args[]){
		int[][] matrix={
			{1,0,0,0},
			{1,1,0,0},
			{1,0,1,0},
			{0,1,1,1},
			{0,0,0,1}
		};

		int[][] matrix1={
			{0,1,0,0,1,0,0,0},
			{0,1,0,0,0,1,0,0},
			{0,1,0,0,0,0,1,0},
			{1,0,0,0,1,0,0,0},
			{0,1,0,0,0,0,0,1},
			{1,0,0,0,0,1,0,0},
			{1,0,0,0,0,0,1,0},
			{1,0,0,0,0,0,0,1}
		};		

		int [][] matrix2={
			{0,0,1,0,0,1,0,0,1},
			{0,1,0,0,0,1,0,0,1},
			{0,0,1,0,0,0,0,1,1},
			{1,0,1,0,0,0,0,0,1},
			{0,0,1,0,0,0,1,0,1},
			{0,1,0,0,0,0,0,1,0},
			{1,1,0,0,0,0,0,0,1},
			{0,1,0,0,0,0,1,0,1}
		};

		int [][] matrix3={
			{ 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1 },
			{ 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1 },
			{ 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1 },
			{ 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1 },
			{ 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1 },
			{ 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0 },
			{ 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1 },
			{ 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1 }
		};

	
		MscSolver solver = new MscSolver(matrix2);

		long current = System.currentTimeMillis();		
		solver.solve(solver.formalise());
		List<List<Integer>> sets = solver.getSubsets();
		
		ColorPrint.println("Time spent:"+(System.currentTimeMillis()-current)+" ms",Color.BLUE);
		
	}

}
