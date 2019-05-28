package uran.formula.smt2;
import java.io.*;
import java.util.*;
import uran.formula.AbstractFormula;
import uran.formula.ArithmeticFormula;
import uran.formula.AndFormula;
import uran.formula.OrFormula;
import uran.formula.OneFormula;
import uran.formula.ImpliesFormula;
import uran.formula.Function;
import uran.formula.BinaryFormula;
import uran.formula.QuantifiedFormula;
import uran.formula.Constant;
import uran.formula.Variable;
import uran.formula.Literal;
import uran.formula.BoolLiteral;
import uran.formula.NumLiteral;
import uran.formula.Decls;
import uran.formula.EqFormula;
import uran.formula.NegFormula;
import uran.formula.ComparisonFormula;
import uran.formula.Scope;
import uran.formula.Connective;
import uran.formula.FunctionFactory;
import uran.formula.LabeledFormula;
import uran.formula.bv.BV_BinaryFormula;
import uran.formula.bv.BV_Literal;
import uran.formula.bv.BV_AndFormula;
import uran.formula.bv.BV_NotFormula;
import uran.formula.bv.BV_UnaryFormula;
import uran.formula.bv.BV_Formula;
import uran.formula.bv.BitVector;
import uran.formula.bv.BinaryLiteral;
import uran.formula.bv.BV_HexLiteral;
import uran.formula.bv.BV_Extract;
import uran.formula.array.ArrayEx;
import uran.formula.array.SelectFormula;
import uran.formula.array.StoreFormula;
import uran.formula.smt2.SMT2Writer;
import uran.formula.visitor.AbstractVisitor;
import uran.solver.Result;
import uran.err.VarExistsException;

public class SolverLauncher extends AbstractVisitor {
	private Process process;
	private String file;
	private String options;
	private SMT2Writer writer;
	private	OutputStream in = null;
	private	InputStream err = null;
	private	InputStream out = null;
	public final static String PRODUCE_UNSAT_CORES = "(set-option :produce-unsat-cores true)";
	private final String CHECK = "(check-sat)";
	private final String UNSAT_CORES = "(get-unsat-core)";
	private final String ASSERT = "assert";
	
	private HashMap <String, AbstractFormula> subset = new HashMap<String, AbstractFormula>();
	private List<AbstractFormula> cores = new ArrayList<AbstractFormula>();
	
	public SolverLauncher (String file, SMT2Writer writer, String options){
		
		this.writer = writer;
		this.file = file;
		this.options = options;
		
		try{
			process = Runtime.getRuntime().exec(file);
			in = process.getOutputStream();
			err = process.getErrorStream();
			out = process.getInputStream();
		}
		catch(Exception e){
			e.printStackTrace();
		}
				
	}
	
	private SolverLauncher (String file){
		this.file = file;
	}
	
	public void visit (QuantifiedFormula f){assemble(f);}
	public void visit (NegFormula f){assemble(f);}
	public void visit (Function f){assemble(f);}
	public void visit (BinaryFormula f){assemble(f);}
	public void visit (Scope s){assemble(s);}
	public void visit (ImpliesFormula f){assemble(f);}
	public void visit (BoolLiteral l){assemble(l);}
	public void visit (NumLiteral l){assemble(l);}
	public void visit (BV_Formula f){assemble(f);}
	public void visit (BV_Literal l){assemble(l);}
	public void visit (BV_BinaryFormula f){assemble(f);}
	public void visit (BV_NotFormula f){assemble(f);}
	public void visit (BV_Extract e){assemble(e);}
	public void visit (ArrayEx a){assemble(a);}
	public void visit (SelectFormula f){assemble(f);}
	public void visit (StoreFormula f){assemble(f);}
	public void visit (LabeledFormula f){assembleLabeledFormula(f);}
	//public void visit (BV_UnaryFormula f){assemble(f);}
	//public void visit (AppliedFunction f){assemble(f);}
	public void visit (Decls d){; /* do nothing */ }
	
	private void assembleLabeledFormula(LabeledFormula f){
		/* keep track of the formula so that we will know which ones cause UNSAT */
		if (subset.containsKey(f.label()))
			throw new VarExistsException ("Named expression is already defined:"+f.label());
		else
			//System.out.println(f.label());
			subset.put(f.label(),f);
		try{
			in.write(("("+ASSERT+" "+f.toSMT2()+ ")\n").getBytes());
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private void assemble(AbstractFormula formula){
		try{
			in.write(("("+ASSERT+" "+formula.toSMT2()+ ")\n").getBytes());
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
		
	public Result launch(){
		Result result=Result.UNUSED;
		try{
			in.write ( (this.options+"\n").getBytes());
			List<Function> functions = writer.getDecls();
			for (int i=0;i<functions.size();i++)
			in.write(("(declare-fun "+functions.get(i).toSMT2_decl()+")\n").getBytes());
			
			List<AbstractFormula> formulas = writer.getFormulas();
			for (AbstractFormula f : formulas) f.accept(this);
		
			in.write(CHECK.getBytes());
			in.write(UNSAT_CORES.getBytes());
			in.flush();
			in.close();
		
			BufferedReader output = new BufferedReader (new InputStreamReader(out));
			String line;
			
			line=output.readLine();
			result = parseResult(line);
			
			if (result==Result.UNSAT) {
				String str = output.readLine();
				System.out.println("Z3 Raw:"+str);
				getCores(str);
			}
			
			/*while ((line=output.readLine())!=null){
				System.out.println("output:"+line);
			}*/
			
			output.close();
			out.close();
			

		}
		catch (Exception e){
			e.printStackTrace();
		}

		return result;
	}
	
	private Result parseResult(String line){
		if (line.trim().equals("sat"))
			return Result.SAT;
		else if (line.trim().equals("unsat"))
			return Result.UNSAT;
		else
			return Result.UNKNOWN;
	}
	
	private void getCores(String line){
		line=line.trim();
		if (line.length()>=2)
			line=line.substring(1,line.length()-1);
		if (line.length()==0) return;
		
		String[] name = line.split("\\s+");
				
		for (int i =0;i<name.length;i++) 
			if (subset.containsKey(name[i])) cores.add (subset.get(name[i]));
	}
	
	public List<AbstractFormula> cores(){return this.cores;}
			
}
