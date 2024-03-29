/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2004 Mark Richters, University of Bremen
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

// $Id: ExpSelect.java 5494 2015-02-05 12:59:25Z lhamann $

package org.tzi.use.uml.ocl.expr;

import org.tzi.use.uml.ocl.value.Value;
import org.tzi.use.uran.visitor.AbstractExprVisitor;
import org.tzi.use.uran.visitor.AbstractRankVisitor;
import uran.formula.AbstractFormula;
import org.tzi.use.query.util.AbstractOclExprVisitor;

/** 
 * OCL select expression.
 *
 * @version     $ProjectVersion: 0.393 $
 * @author  Mark Richters
 */
public class ExpSelect extends ExpQuery {
    
    /**
     * Constructs a select expression. <code>elemVarDecl</code> may be null.
     */
    public ExpSelect(VarDecl elemVarDecl,
                     Expression rangeExp, 
                     Expression queryExp) 
        throws ExpInvalidException
    {
        // result has same type as range expression
        super(rangeExp.type(), 
              ( elemVarDecl != null ) ? new VarDeclList(elemVarDecl) : new VarDeclList(true),
              rangeExp, queryExp);
    
        // queryExp must be a boolean expression
        assertBooleanQuery();
    }

    /**
     * Constructs a select expression. <code>elemVarDecl</code> may be null.
     */
    public ExpSelect(VarDeclList elemVarDeclList,
                     Expression  rangeExp, 
                     Expression  queryExp) 
        throws ExpInvalidException
    {
        // result has same type as range expression
        super(rangeExp.type(), elemVarDeclList, rangeExp, queryExp);
    
        // queryExp must be a boolean expression
        assertBooleanQuery();
    }
    
    /** 
     * Return name of query expression.
     */
    public String name() {
        return "select";
    }

    /**
     * Evaluates expression and returns result value.
     */
    public Value eval(EvalContext ctx) {
        ctx.enter(this);
        Value res = evalSelectOrReject(ctx, true);
        ctx.exit(this, res);
        return res;
    }

	@Override
	public void processWithVisitor(ExpressionVisitor visitor) {
		visitor.visitSelect(this);
	}

	@Override
	public AbstractFormula accept (AbstractExprVisitor visitor){
		return visitor.visitSelect(this);
	}

	@Override
	public int accept (AbstractRankVisitor visitor){
		return visitor.visitSelect(this);
    }
    
    @Override
    public void accept (AbstractOclExprVisitor visitor){
        visitor.visitSelect(this);
    }
    
}
