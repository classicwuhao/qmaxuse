package org.tzi.use.query;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.tzi.use.query.ast.*;
import org.tzi.use.parser.ParseErrorHandler;
import org.tzi.use.query.ast.QAst;
import org.tzi.use.parser.ocl.OCLCompiler;
import org.tzi.use.parser.Context;
import org.tzi.use.parser.ParseErrorHandler;
import org.tzi.use.parser.ocl.ASTExpression;
import org.tzi.use.parser.SemanticException;
import org.tzi.use.parser.Symtable;
import org.tzi.use.uml.mm.MModel;
import org.tzi.use.uml.ocl.expr.Expression;
import org.tzi.use.uml.ocl.type.Type;
import org.tzi.use.uml.ocl.value.VarBindings;
import org.tzi.use.uml.sys.MSystemState;
import org.tzi.use.query.visitor.AbstractVisitor;
import org.tzi.use.query.visitor.QueryVisitor;
import org.tzi.use.query.io.ColorPrint;
import org.tzi.use.query.io.Color;
import java.io.PrintStream;

public class QueryCompiler{
    private int errors=0;
    private QAst expressions=null;

    public QueryCompiler(){}

    public static int compileExpression (MModel model, MSystemState state, InputStream in, String inName,PrintWriter err)
    {
        ParseErrorHandler errHandler = new ParseErrorHandler(inName, err);
        ANTLRInputStream aInput;
        QAst expr =null;
        ColorPrint out = new ColorPrint();

		try {
			aInput = new ANTLRInputStream(in);
			aInput.name = inName;
		} catch (IOException e1) {
            err.println(e1.getMessage());
            return -1;
        }
        
        QueryLexer lexer = new QueryLexer(aInput);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        QueryParser parser = new QueryParser(tokenStream);
        lexer.init(errHandler);
        parser.init(errHandler);
        out.println("Launching QueryCompiler...",Color.WHITE);

        try{
            expr = parser.checkExpr();
            if (errHandler.errorCount() == 0 ) {
                QueryVisitor visitor = new QueryVisitor(model);
                expr.accept(visitor);
                out.println(visitor.state().toString(),Color.CYAN);
                return 1;
            }
            else{
                out.println("Invalid query,"+ errHandler.errorCount()+" syntax error(s)",Color.RED);
                return -1;
            }
        }
        catch(RecognitionException e){
            err.println(parser.getSourceName() +":" + 
            e.line + ":" +
            e.charPositionInLine + ": " + 
            e.getMessage());
        }
        return 1;
    }

    public static int compileExpression (MModel model, MSystemState state, InputStream in, String inName,
        PrintWriter err, VarBindings globalBindings)
    {
        ParseErrorHandler errHandler = new ParseErrorHandler(inName, err);
        ANTLRInputStream aInput;
        QAst expr =null;

		try {
			aInput = new ANTLRInputStream(in);
			aInput.name = inName;
		} catch (IOException e1) {
            err.println(e1.getMessage());
            return -1;
        }
        
        QueryLexer lexer = new QueryLexer(aInput);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        QueryParser parser = new QueryParser(tokenStream);
        lexer.init(errHandler);
        parser.init(errHandler);

        try{
             expr = parser.checkExpr();
             if (expr.isQuery()){
                QueryExpr qexpr = (QueryExpr) expr;
                if (qexpr.containInjection()){
                    System.err.println("injection detected.");
                    QOCLExpr oclexpr = qexpr.oclExpr();
                    Context ctx = new Context(inName, err, globalBindings, null);
                    ctx.setModel(model);
                    ctx.setSystemState(state);
                    ASTExpression astExpr = oclexpr.expression().get(0);
                    System.out.println("ASTExpression:"+astExpr.toString());
                    Expression e = astExpr.gen(ctx);
                    System.out.println("expression:"+e.toString());
                }
             }
           if (errHandler.errorCount() == 0 ) {
                //System.out.println("no error");
                return 1;
            }
            else{
                //System.out.println("syntax error:"+errHandler.errorCount());
                return -1;
            }
        }
        catch(RecognitionException e){
            err.println(parser.getSourceName() +":" + 
            e.line + ":" +
            e.charPositionInLine + ": " + 
            e.getMessage());
        }
        catch (SemanticException e) {
            err.println(e.getMessage());
        }
        return 1;
    }


    public int errors() {return this.errors;}
    public QAst expressions() {return this.expressions;}

    public QAst compileExpression (InputStream in, String inName,PrintWriter err){
        ParseErrorHandler errHandler = new ParseErrorHandler(inName, err);
        ANTLRInputStream aInput=null;
		try {
			aInput = new ANTLRInputStream(in);
			aInput.name = inName;
		} catch (IOException e1) {
            err.println(e1.getMessage());
        }

        QueryLexer lexer = new QueryLexer(aInput);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        QueryParser parser = new QueryParser(tokenStream);
        lexer.init(errHandler);
        parser.init(errHandler);

        try{
            this.expressions = parser.checkExpr();
            this.errors = errHandler.errorCount();
        }
        catch(RecognitionException e){
            err.println(parser.getSourceName() +":" + 
            e.line + ":" +
            e.charPositionInLine + ": " + 
            e.getMessage());
        }
        return this.expressions;
    }

}