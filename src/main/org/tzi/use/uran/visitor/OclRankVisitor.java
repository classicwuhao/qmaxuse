package org.tzi.use.uran.visitor;

import org.tzi.use.uml.ocl.expr.*;
import org.tzi.use.uml.ocl.type.*;
import org.tzi.use.uml.mm.*;
import uran.formula.*;
import uran.formula.value.*;
import uran.formula.type.*;
import uran.formula.smt2.*;
import uran.formula.type.*;
import uran.solver.*;
import java.util.*;

public final class OclRankVisitor implements AbstractRankVisitor{
	public OclRankVisitor(){}
	
	@Override
	public int visitForAll (ExpForAll expr){	
		return visitQuery(expr);
	}

	@Override
	public int visitExists (ExpExists expr){
		return visitQuery(expr);
	}
	
	private int visitQuery(ExpQuery expr){
		return 	expr.getRangeExpression().accept(this)+
				expr.getVariableDeclarations().accept(this)+
				expr.getQueryExpression().accept(this);
	}
	
	@Override
	public int visitNavigation (ExpNavigation expr){
		return expr.getObjectExpression().accept(this)+1;
	}

	@Override
	public int visitVarDeclList(VarDeclList varDeclList){
		int size=0;
		
		for (int i = 0; i < varDeclList.size(); ++i)
			size+=varDeclList.varDecl(i).accept(this);
				
		return size;
	}
	
	@Override
	public int visitVarDecl(VarDecl var){
		return 1;
	}

	@Override
	public int visitConstInteger (ExpConstInteger expr){
		return 1;
	}

	@Override
	public int visitConstBoolean (ExpConstBoolean expr){
		return 1;
	}

	@Override
	public int visitAttrOp(ExpAttrOp expr){
		return expr.objExp().accept(this)+1;
	}

	@Override
	public int visitSelect(ExpSelect expr){
		return expr.getRangeExpression().accept(this)+expr.getQueryExpression().accept(this)+1;
	}

	@Override
	public int visitStdOp(ExpStdOp expr){
		Expression[] args = expr.args();
		int size=1;
		if(expr.getOperation().isInfixOrPrefix()){
			if (args.length==1){
				size+=args[0].accept(this);
			}
			else{
				size+=(args[0].accept(this) + args[1].accept(this));
			}
		}else{
			if(expr.isPre()){}
			if(args.length == 0){
				
			} else {
				size+=args[0].accept(this);
				if(args.length > 1){
					for(int i = 1; i < args.length; i++) size+=args[i].accept(this);
				}
			}
		}
		return size;
	}
	
	@Override
	public int visitVariable(ExpVariable expr){
		return 1;
	}
}
