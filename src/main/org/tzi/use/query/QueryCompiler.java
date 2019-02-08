package org.tzi.use.query;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.tzi.use.parser.ParseErrorHandler;
import org.tzi.use.uml.mm.MModel;
import org.tzi.use.uml.sys.MSystemState;

public class QueryCompiler{

    public QueryCompiler(){}
    public static void f(){
        System.out.println("f");
    }
    public static int compileExpression (MModel model, MSystemState state, InputStream in, String inName,PrintWriter err)
    {
        ParseErrorHandler errHandler = new ParseErrorHandler(inName, err);

        ANTLRInputStream aInput;
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
            parser.checkExpr();
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
        return 1;
    }

    public static int compileExpression (InputStream in, String inName,PrintWriter err){
        ParseErrorHandler errHandler = new ParseErrorHandler(inName, err);
        ANTLRInputStream aInput;
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
            parser.checkExpr();
        }
        catch(RecognitionException e){
            err.println(parser.getSourceName() +":" + 
            e.line + ":" +
            e.charPositionInLine + ": " + 
            e.getMessage());
        }
        return errHandler.errorCount();
    }

}