package query;
import org.tzi.use.query.QueryCompiler;
import org.tzi.use.query.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import uran.test.util.*;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.tzi.use.parser.ParseErrorHandler;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public final class QueryTest{

    public QueryTest(){

    }

    public static void main (String args[]){
        QueryTest test = new QueryTest();
        System.out.println(test.Case1());
    }

    @Test
    public void test0(){
        QueryTest qt = new QueryTest();
        assertEquals(0,qt.Case1());
    }
    
    @Test
    public void test1(){
        QueryTest qt = new QueryTest();
        assertEquals(0,qt.Case2());
    }

    @Test
    public void test2(){
        QueryTest qt = new QueryTest();
        assertEquals(0,qt.Case3());
    }

    @Test
    public void test3(){
        QueryTest qt = new QueryTest();
        assertEquals(0,qt.Case4());
    }

    @Test
    public void test4(){
        QueryTest qt = new QueryTest();
        assertEquals(0,qt.Case5());
    }

    @Test
    public void test5(){
        QueryTest qt = new QueryTest();
        assertEquals(0,qt.Case6());
    }

    @Test
    public void test6(){
        QueryTest qt = new QueryTest();
        assertEquals(0,qt.Case7());
    }

    @Test
    public void test7(){
        QueryTest qt = new QueryTest();
        assertEquals(0,qt.Case8());
    }

    @Test
    public void test8(){
        QueryTest qt = new QueryTest();
        assertEquals(0,qt.Case9());
    }

    @Test
    public void test9(){
        QueryTest qt = new QueryTest();
        assertEquals(0,qt.Case10());
    }

    public int Case1(){
        String query0="verify select * with *::*";
        PrintWriter err = new PrintWriter(System.err);
        int query0_rc = QueryCompiler.compileExpression(new ByteArrayInputStream(query0.getBytes()),"<text>",err);

        if (query0_rc==0)
            ColorPrint.println("query0 accepted.",Color.BLUE);
        else    
            ColorPrint.println("query0 failed: "+ query0_rc+" syntax issue(s)",Color.RED);
        return query0_rc;
    }

    public int Case2(){
        String query0="verify select *.age with Student::*, Person::*";
        PrintWriter err = new PrintWriter(System.err);
        int query0_rc = QueryCompiler.compileExpression(new ByteArrayInputStream(query0.getBytes()),"<text>",err);

        if (query0_rc==0)
            ColorPrint.println("query1 accepted.",Color.BLUE);
        else    
            ColorPrint.println("query1 failed: "+query0_rc+" syntax issue(s)",Color.RED);

        return query0_rc;
    }

    public int Case3(){
        String query0="verify select Student, Person with Student::inv1";
        PrintWriter err = new PrintWriter(System.err);
        int query0_rc = QueryCompiler.compileExpression(new ByteArrayInputStream(query0.getBytes()),"<text>",err);

        if (query0_rc==0)
            ColorPrint.println("query2 accepted.",Color.BLUE);
        else    
            ColorPrint.println("query2 failed: "+query0_rc+" syntax issue(s)",Color.RED);

        return query0_rc;
    }

    public int Case4(){
        String query0="verify select Person.*,Student.*,Department.* without Student::*, Person::*";
        PrintWriter err = new PrintWriter(System.err);
        int query0_rc = QueryCompiler.compileExpression(new ByteArrayInputStream(query0.getBytes()),"<text>",err);

        if (query0_rc==0)
            ColorPrint.println("query3 accepted.",Color.BLUE);
        else    
            ColorPrint.println("query3 failed: "+query0_rc+" syntax issue(s)",Color.RED);

        return query0_rc;
    }

    public int Case5(){
        String query0="verify select Module.*, Student.* without Person::*";
        PrintWriter err = new PrintWriter(System.err);
        int query0_rc = QueryCompiler.compileExpression(new ByteArrayInputStream(query0.getBytes()),"<text>",err);

        if (query0_rc==0)
            ColorPrint.println("query4 accepted.",Color.BLUE);
        else    
            ColorPrint.println("query4 failed: "+query0_rc+" syntax issue(s)",Color.RED);

        return query0_rc;
    }

    public int Case6(){
        String query0="verify select pure A, pure B, C with B::*, C::inv without A::*";
        PrintWriter err = new PrintWriter(System.err);
        int query0_rc = QueryCompiler.compileExpression(new ByteArrayInputStream(query0.getBytes()),"<text>",err);

        if (query0_rc==0)
            ColorPrint.println("query5 accepted.",Color.BLUE);
        else    
            ColorPrint.println("query5 failed: "+query0_rc+" syntax issue(s)",Color.RED);

        return query0_rc;
    }

    public int Case7(){
        String query0="verify select pure A, pure B, pure C without C::* as QueryA";
        PrintWriter err = new PrintWriter(System.err);
        int query0_rc = QueryCompiler.compileExpression(new ByteArrayInputStream(query0.getBytes()),"<text>",err);

        if (query0_rc==0)
            ColorPrint.println("query6 accepted.",Color.BLUE);
        else    
            ColorPrint.println("query6 failed: "+query0_rc+" syntax issue(s)",Color.RED);

        return query0_rc;
    }

    public int Case8(){
        String query0="verify select pure A, pure B, pure C without C::* && select C.*, D.* with C::*, D::*";
        PrintWriter err = new PrintWriter(System.err);
        int query0_rc = QueryCompiler.compileExpression(new ByteArrayInputStream(query0.getBytes()),"<text>",err);

        if (query0_rc==0)
            ColorPrint.println("query7 accepted.",Color.BLUE);
        else    
            ColorPrint.println("query7 failed: "+query0_rc+" syntax issue(s)",Color.RED);

        return query0_rc;
    }

    public int Case9(){
        String query0="verify select pure A, pure B, pure C without C::* as queryA && select C.*, D.* with C::*, D::* as queryB";
        PrintWriter err = new PrintWriter(System.err);
        int query0_rc = QueryCompiler.compileExpression(new ByteArrayInputStream(query0.getBytes()),"<text>",err);

        if (query0_rc==0)
            ColorPrint.println("query8 accepted.",Color.BLUE);
        else    
            ColorPrint.println("query8 failed: "+query0_rc+" syntax issue(s)",Color.RED);

        return query0_rc;
    
    }

    public int Case10(){
        String query0="verify queryA && queryB && select A.*, pure B, C.* without C::*";
        PrintWriter err = new PrintWriter(System.err);
        int query0_rc = QueryCompiler.compileExpression(new ByteArrayInputStream(query0.getBytes()),"<text>",err);

        if (query0_rc==0)
            ColorPrint.println("query9 accepted.",Color.BLUE);
        else    
            ColorPrint.println("query9 failed: "+query0_rc+" syntax issue(s)",Color.RED);

        return query0_rc;
    
    }

}