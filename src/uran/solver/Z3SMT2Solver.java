/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++Written by: Hao Wu++++++++++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *
 *	This is a part of my research work.
 *  haowu@cs.nuim.ie
 *  JULY-2015 
 *  
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * ++++++++++++++++++++++++++++++Do or do not, there is no try.+++++++++++++++++++++++++
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */

package uran.solver;

import java.util.HashMap;
import uran.formula.FunctionFactory;
import uran.formula.smt2.SMT2Writer;
import uran.formula.*;
import com.microsoft.z3.*;
import com.microsoft.z3.enumerations.*;
import uran.formula.value.Value;
import uran.formula.value.BoolValue;
import uran.formula.value.IntValue;

/**
 * We only need to use Z3 APIs to read in an smt2 file and solve it for us, we also update our constants and uninterpreted functions 
 * We decouple the following piece of code from Z3 APIs as much as possible so that we can easily upgrade our own formula part.
 * 
 * A very simple solve method that uses Z3 API to solve the formula we have generated.
 */

public final class Z3SMT2Solver{
	
	private FunctionFactory factory;
	private SMT2Writer writer;	
	
	/**
	 *	Construct solver with a non-null SMT2Writer.
	 */	
	public Z3SMT2Solver(SMT2Writer writer){
		this.writer = writer;
		this.factory = writer.getFactory();
	}

	/**
	 *	Returns the current formula writer.
	 */
	public SMT2Writer getWriter(){return this.writer;}
	
	/**
	 * Use Z3 Java APIs to perform solving.
	 */
	public Result solve(){
		/* parse SMT2 file */
		HashMap<String, String> cfg = new HashMap<String, String>();
		cfg.put("model","true");
		cfg.put("produce-unsat-cores","true");
		try{
			Context ctx = new Context();
			Solver solver = ctx.mkSolver();
			solver.add(ctx.mkAnd(ctx.parseSMTLIB2File(writer.getFile(),null, null, null, null)));
			Status result = solver.check();
			if (result == Status.SATISFIABLE){
				updateFuns(solver.getModel());
				return Result.SAT;
			}
			else if (result == Status.UNSATISFIABLE){
				//System.out.println(solver.getProof());
				/*for (Expr c : solver.getUnsatCore()){
					System.out.println("unsat: "+ c);
				}*/
				return Result.UNSAT;
			}
			else
				return Result.UNKNOWN;
		}
		catch (Z3Exception e){
			System.err.println("Z3 solver error: "+e.getMessage());
		}
		return Result.UNKNOWN;
	}
		
	private void updateFuns(Model model){
		FuncDecl cons[] = model.getConstDecls();
		Sort funs[] = model.getSorts(); 

		Expr expr;		
		/* constants */
		for (int i=0;i<cons.length;i++){
			Z3_sort_kind sort = cons[i].getRange().getSortKind();
			//System.out.println("Arity:"+cons[i].getArity()+cons[i].toString());
			if (sort==Z3_sort_kind.Z3_INT_SORT || sort==Z3_sort_kind.Z3_BV_SORT || sort==Z3_sort_kind.Z3_BOOL_SORT){
				expr = model.getConstInterp(cons[i]);
				Symbol sym = cons[i].getName();
				if (expr.isBool()){
					factory.updateValue(cons[i].getName().toString(),new BoolValue(expr.isTrue()));
				}
				else if (expr.isInt()){
					factory.updateValue(cons[i].getName().toString(),
					new IntValue(Integer.parseInt(((IntExpr)expr).toString())));
				}
				else if (expr.isBV()){
					factory.updateBV(cons[i].getName().toString(), new IntValue(((BitVecNum)expr).getInt()));
				}
				else{
					System.out.println(expr);
				}				
			}
			else if (sort == Z3_sort_kind.Z3_ARRAY_SORT){
				FuncInterp array_interp = model.getFuncInterp(cons[i]);
				factory.updateArray(cons[i].getName().toString(),array_interp.toString());
				//System.out.println("Array Interpretation:"+array_interp.toString());
			}
			else {
				System.out.println("Unsupported interpretation.");
			}
		}
		/* interpreted functions */
		FuncDecl func[] = model.getFuncDecls();
		FuncInterp p;
		for (int i=0;i<func.length;i++){
			p = model.getFuncInterp(func[i]);
			FuncInterp.Entry entry[] = p.getEntries();
			for (int j=0;j<entry.length;j++){
				Expr e = entry[j].getValue();
				if (e.isBool()){
					factory.updateValue(func[i].getName().toString(), new BoolValue(e.isTrue()));
				}
				else if (e.isInt()){
					factory.updateValue(func[i].getName().toString(),
					new IntValue(Integer.parseInt(((IntExpr)e).toString())));
				}
			}
		}
	}
	
}
