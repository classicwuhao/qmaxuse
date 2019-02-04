// $ANTLR 3.4 Query.g 2019-02-04 18:28:55

package org.tzi.use.query;
import org.tzi.use.parser.base.*;
import org.tzi.use.parser.base.BaseParser;
import org.tzi.use.parser.ocl.*;
import org.tzi.use.parser.soil.ast.*;
import java.util.Collections;
import java.util.Arrays;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class QueryParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "AssocExpr", "AttrExpr", "BAR", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "InvExpr", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", "NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", "REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", "WS", "'Bag'", "'Collection'", "'OrderedSet'", "'Sequence'", "'Set'", "'Tuple'", "'Undefined'", "'allInstances'", "'and'", "'byUseId'", "'check'", "'div'", "'else'", "'endif'", "'false'", "'full'", "'if'", "'implies'", "'in'", "'iterate'", "'let'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", "'oclInState'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", "'or'", "'pre'", "'pure'", "'select'", "'selectByKind'", "'selectByType'", "'then'", "'true'", "'with'", "'xor'"
    };

    public static final int EOF=-1;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int ARROW=4;
    public static final int AT=5;
    public static final int AssocExpr=6;
    public static final int AttrExpr=7;
    public static final int BAR=8;
    public static final int COLON=9;
    public static final int COLON_COLON=10;
    public static final int COLON_EQUAL=11;
    public static final int COMMA=12;
    public static final int DOT=13;
    public static final int DOTDOT=14;
    public static final int EQUAL=15;
    public static final int ESC=16;
    public static final int GREATER=17;
    public static final int GREATER_EQUAL=18;
    public static final int HASH=19;
    public static final int HEX_DIGIT=20;
    public static final int IDENT=21;
    public static final int INT=22;
    public static final int InvExpr=23;
    public static final int LBRACE=24;
    public static final int LBRACK=25;
    public static final int LESS=26;
    public static final int LESS_EQUAL=27;
    public static final int LPAREN=28;
    public static final int MINUS=29;
    public static final int ML_COMMENT=30;
    public static final int NEWLINE=31;
    public static final int NON_OCL_STRING=32;
    public static final int NOT_EQUAL=33;
    public static final int PLUS=34;
    public static final int RANGE_OR_INT=35;
    public static final int RBRACE=36;
    public static final int RBRACK=37;
    public static final int REAL=38;
    public static final int RPAREN=39;
    public static final int SEMI=40;
    public static final int SLASH=41;
    public static final int SL_COMMENT=42;
    public static final int STAR=43;
    public static final int STRING=44;
    public static final int VOCAB=45;
    public static final int WS=46;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public QueryParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public QueryParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return QueryParser.tokenNames; }
    public String getGrammarFileName() { return "Query.g"; }



    // $ANTLR start "checkExpr"
    // Query.g:38:1: checkExpr : 'check' ( modifiers )? queryExpr ;
    public final void checkExpr() throws RecognitionException {
        try {
            // Query.g:38:10: ( 'check' ( modifiers )? queryExpr )
            // Query.g:38:12: 'check' ( modifiers )? queryExpr
            {
            match(input,57,FOLLOW_57_in_checkExpr31); if (state.failed) return ;

            // Query.g:39:4: ( modifiers )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==62||LA1_0==78) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Query.g:39:5: modifiers
                    {
                    pushFollow(FOLLOW_modifiers_in_checkExpr37);
                    modifiers();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_queryExpr_in_checkExpr41);
            queryExpr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "checkExpr"



    // $ANTLR start "queryExpr"
    // Query.g:42:1: queryExpr : 'select' featureExpr ( COMMA featureExpr )* ( condExpr )* ;
    public final void queryExpr() throws RecognitionException {
        try {
            // Query.g:42:10: ( 'select' featureExpr ( COMMA featureExpr )* ( condExpr )* )
            // Query.g:43:4: 'select' featureExpr ( COMMA featureExpr )* ( condExpr )*
            {
            match(input,79,FOLLOW_79_in_queryExpr53); if (state.failed) return ;

            pushFollow(FOLLOW_featureExpr_in_queryExpr55);
            featureExpr();

            state._fsp--;
            if (state.failed) return ;

            // Query.g:43:25: ( COMMA featureExpr )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==COMMA) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Query.g:43:26: COMMA featureExpr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_queryExpr58); if (state.failed) return ;

            	    pushFollow(FOLLOW_featureExpr_in_queryExpr60);
            	    featureExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // Query.g:43:46: ( condExpr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==84) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Query.g:43:47: condExpr
            	    {
            	    pushFollow(FOLLOW_condExpr_in_queryExpr65);
            	    condExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            if ( state.backtracking==0 ) {System.out.println("this is a query.");}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "queryExpr"



    // $ANTLR start "modifiers"
    // Query.g:47:1: modifiers : ( 'pure' | 'full' );
    public final void modifiers() throws RecognitionException {
        try {
            // Query.g:47:10: ( 'pure' | 'full' )
            // Query.g:
            {
            if ( input.LA(1)==62||input.LA(1)==78 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "modifiers"



    // $ANTLR start "featureExpr"
    // Query.g:53:2: featureExpr : ( IDENT | AttrExpr | AssocExpr | InvExpr );
    public final void featureExpr() throws RecognitionException {
        try {
            // Query.g:53:13: ( IDENT | AttrExpr | AssocExpr | InvExpr )
            // Query.g:
            {
            if ( (input.LA(1) >= AssocExpr && input.LA(1) <= AttrExpr)||input.LA(1)==IDENT||input.LA(1)==InvExpr ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "featureExpr"



    // $ANTLR start "condExpr"
    // Query.g:65:1: condExpr : 'with' expression ;
    public final void condExpr() throws RecognitionException {
        try {
            // Query.g:65:9: ( 'with' expression )
            // Query.g:65:11: 'with' expression
            {
            match(input,84,FOLLOW_84_in_condExpr158); if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_condExpr160);
            expression();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "condExpr"



    // $ANTLR start "expressionOnly"
    // Query.g:94:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExp =null;


        try {
            // Query.g:95:5: (nExp= expression EOF )
            // Query.g:96:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly187);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_expressionOnly189); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nExp;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "expressionOnly"



    // $ANTLR start "expression"
    // Query.g:103:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
    public final ASTExpression expression() throws RecognitionException {
        ASTExpression n = null;


        Token name=null;
        ASTType t =null;

        ASTExpression e1 =null;

        ASTExpression nCndImplies =null;


         
          ASTLetExpression prevLet = null, firstLet = null;
          ASTExpression e2;
          Token tok = null;

        try {
            // Query.g:109:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
            // Query.g:110:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }

            // Query.g:111:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==67) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Query.g:112:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
            	    {
            	    match(input,67,FOLLOW_67_in_expression237); if (state.failed) return n;

            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression248); if (state.failed) return n;

            	    // Query.g:113:18: ( COLON t= type )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==COLON) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // Query.g:113:20: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression252); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_expression256);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression261); if (state.failed) return n;

            	    pushFollow(FOLLOW_expression_in_expression265);
            	    e1=expression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { ASTLetExpression nextLet = new ASTLetExpression(name, t, e1);
            	             if ( firstLet == null ) 
            	                 firstLet = nextLet;
            	             if ( prevLet != null ) 
            	                 prevLet.setInExpr(nextLet);
            	             prevLet = nextLet;
            	          }

            	    // Query.g:123:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==COMMA) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // Query.g:124:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_expression303); if (state.failed) return n;

            	    	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression315); if (state.failed) return n;

            	    	    // Query.g:125:20: ( COLON t= type )?
            	    	    int alt5=2;
            	    	    int LA5_0 = input.LA(1);

            	    	    if ( (LA5_0==COLON) ) {
            	    	        alt5=1;
            	    	    }
            	    	    switch (alt5) {
            	    	        case 1 :
            	    	            // Query.g:125:22: COLON t= type
            	    	            {
            	    	            match(input,COLON,FOLLOW_COLON_in_expression319); if (state.failed) return n;

            	    	            pushFollow(FOLLOW_type_in_expression323);
            	    	            t=type();

            	    	            state._fsp--;
            	    	            if (state.failed) return n;

            	    	            }
            	    	            break;

            	    	    }


            	    	    match(input,EQUAL,FOLLOW_EQUAL_in_expression328); if (state.failed) return n;

            	    	    pushFollow(FOLLOW_expression_in_expression332);
            	    	    e1=expression();

            	    	    state._fsp--;
            	    	    if (state.failed) return n;

            	    	    if ( state.backtracking==0 ) { ASTLetExpression nextLet = new ASTLetExpression(name, t, e1);
            	    	               if ( firstLet == null ) 
            	    	                   firstLet = nextLet;
            	    	               if ( prevLet != null ) 
            	    	                   prevLet.setInExpr(nextLet);
            	    	               prevLet = nextLet;
            	    	            }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);


            	    match(input,65,FOLLOW_65_in_expression373); if (state.failed) return n;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression389);
            nCndImplies=conditionalImpliesExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { 
                    if ( nCndImplies != null ) {
                	 n = nCndImplies;
                     n.setStartToken(tok);
                  }
                  
                  if ( prevLet != null ) { 
                     prevLet.setInExpr(n);
                     n = firstLet;
                     n.setStartToken(tok);
                  }
                }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "expression"



    // $ANTLR start "paramList"
    // Query.g:158:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;


        ASTVariableDeclaration v =null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // Query.g:160:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // Query.g:161:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList422); if (state.failed) return paramList;

            // Query.g:162:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IDENT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Query.g:163:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList439);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;

                    if ( state.backtracking==0 ) { paramList.add(v); }

                    // Query.g:164:7: ( COMMA v= variableDeclaration )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Query.g:164:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList451); if (state.failed) return paramList;

                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList455);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;

                    	    if ( state.backtracking==0 ) { paramList.add(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_paramList475); if (state.failed) return paramList;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return paramList;
    }
    // $ANTLR end "paramList"



    // $ANTLR start "idList"
    // Query.g:172:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;


        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // Query.g:174:5: (id0= IDENT ( COMMA idn= IDENT )* )
            // Query.g:175:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList504); if (state.failed) return idList;

            if ( state.backtracking==0 ) { idList.add(id0); }

            // Query.g:176:5: ( COMMA idn= IDENT )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Query.g:176:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList514); if (state.failed) return idList;

            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList518); if (state.failed) return idList;

            	    if ( state.backtracking==0 ) { idList.add(idn); }

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return idList;
    }
    // $ANTLR end "idList"



    // $ANTLR start "variableDeclaration"
    // Query.g:184:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Query.g:185:5: (name= IDENT COLON t= type )
            // Query.g:186:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration549); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableDeclaration551); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableDeclaration555);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTVariableDeclaration(name, t); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "variableDeclaration"



    // $ANTLR start "conditionalImpliesExpression"
    // Query.g:194:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndOrExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:195:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // Query.g:196:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression591);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndOrExp;}

            // Query.g:197:5: (op= 'implies' n1= conditionalOrExpression )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==64) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Query.g:197:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,64,FOLLOW_64_in_conditionalImpliesExpression604); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression608);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "conditionalImpliesExpression"



    // $ANTLR start "conditionalOrExpression"
    // Query.g:206:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndXorExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:207:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // Query.g:208:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression653);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndXorExp;}

            // Query.g:209:5: (op= 'or' n1= conditionalXOrExpression )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==76) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Query.g:209:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,76,FOLLOW_76_in_conditionalOrExpression666); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression670);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "conditionalOrExpression"



    // $ANTLR start "conditionalXOrExpression"
    // Query.g:218:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndAndExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:219:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // Query.g:220:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression714);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndAndExp;}

            // Query.g:221:5: (op= 'xor' n1= conditionalAndExpression )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==85) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Query.g:221:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,85,FOLLOW_85_in_conditionalXOrExpression727); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression731);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "conditionalXOrExpression"



    // $ANTLR start "conditionalAndExpression"
    // Query.g:230:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nEqExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:231:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // Query.g:232:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression775);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nEqExp;}

            // Query.g:233:5: (op= 'and' n1= equalityExpression )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==55) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // Query.g:233:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,55,FOLLOW_55_in_conditionalAndExpression788); if (state.failed) return n;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression792);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "conditionalAndExpression"



    // $ANTLR start "equalityExpression"
    // Query.g:242:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nRelExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:244:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // Query.g:245:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression840);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nRelExp;}

            // Query.g:246:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==EQUAL||LA15_0==NOT_EQUAL) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Query.g:246:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==EQUAL||input.LA(1)==NOT_EQUAL ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression869);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "equalityExpression"



    // $ANTLR start "relationalExpression"
    // Query.g:256:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nAddiExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:258:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // Query.g:259:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression918);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nAddiExp;}

            // Query.g:260:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0 >= GREATER && LA16_0 <= GREATER_EQUAL)||(LA16_0 >= LESS && LA16_0 <= LESS_EQUAL)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Query.g:260:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( (input.LA(1) >= GREATER && input.LA(1) <= GREATER_EQUAL)||(input.LA(1) >= LESS && input.LA(1) <= LESS_EQUAL) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression954);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "relationalExpression"



    // $ANTLR start "additiveExpression"
    // Query.g:270:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nMulExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:272:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // Query.g:273:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1004);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nMulExp;}

            // Query.g:274:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==MINUS||LA17_0==PLUS) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Query.g:274:7: ( PLUS | MINUS ) n1= multiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1032);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "additiveExpression"



    // $ANTLR start "multiplicativeExpression"
    // Query.g:285:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:287:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // Query.g:288:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1082);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nUnExp;}

            // Query.g:289:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==SLASH||LA18_0==STAR||LA18_0==58) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Query.g:289:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==58 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1114);
            	    n1=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "multiplicativeExpression"



    // $ANTLR start "unaryExpression"
    // Query.g:301:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression nPosExp =null;


         Token op = null; 
        try {
            // Query.g:303:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==MINUS||LA19_0==PLUS||LA19_0==68) ) {
                alt19=1;
            }
            else if ( (LA19_0==AT||LA19_0==HASH||(LA19_0 >= IDENT && LA19_0 <= INT)||LA19_0==LPAREN||LA19_0==REAL||(LA19_0 >= STAR && LA19_0 <= STRING)||(LA19_0 >= 47 && LA19_0 <= 53)||LA19_0==61||LA19_0==63||LA19_0==66||(LA19_0 >= 69 && LA19_0 <= 75)||(LA19_0 >= 80 && LA19_0 <= 81)||LA19_0==83) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // Query.g:304:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // Query.g:304:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // Query.g:304:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) { op = input.LT(1); }

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==68 ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1200);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }

                    }


                    }
                    break;
                case 2 :
                    // Query.g:308:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression1220);
                    nPosExp=postfixExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPosExp; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "unaryExpression"



    // $ANTLR start "postfixExpression"
    // Query.g:316:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nPrimExp =null;

        ASTExpression nPc =null;


         boolean arrow = false; 
        try {
            // Query.g:318:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // Query.g:319:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression1253);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nPrimExp; }

            // Query.g:320:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==ARROW||LA21_0==DOT) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Query.g:321:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // Query.g:321:6: ( ARROW | DOT )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==ARROW) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==DOT) ) {
            	        alt20=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // Query.g:321:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression1271); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = true; }

            	            }
            	            break;
            	        case 2 :
            	            // Query.g:321:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression1277); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = false; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression1288);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = nPc; }

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "postfixExpression"



    // $ANTLR start "primaryExpression"
    // Query.g:337:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? );
    public final ASTExpression primaryExpression() throws RecognitionException {
        ASTExpression n = null;


        Token id1=null;
        Token id2=null;
        ASTExpression nLit =null;

        ASTExpression nOr =null;

        ASTExpression nPc =null;

        ASTExpression nExp =null;

        ASTExpression nIfExp =null;

        ASTExpression idExp =null;


        try {
            // Query.g:338:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? )
            int alt25=7;
            switch ( input.LA(1) ) {
            case HASH:
            case INT:
            case REAL:
            case STAR:
            case STRING:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 61:
            case 69:
            case 71:
            case 75:
            case 83:
                {
                alt25=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt25=1;
                    }
                    break;
                case EOF:
                case ARROW:
                case AT:
                case BAR:
                case COMMA:
                case DOTDOT:
                case EQUAL:
                case GREATER:
                case GREATER_EQUAL:
                case LBRACK:
                case LESS:
                case LESS_EQUAL:
                case LPAREN:
                case MINUS:
                case NOT_EQUAL:
                case PLUS:
                case RBRACE:
                case RBRACK:
                case RPAREN:
                case SLASH:
                case STAR:
                case 55:
                case 58:
                case 59:
                case 60:
                case 64:
                case 65:
                case 76:
                case 82:
                case 84:
                case 85:
                    {
                    alt25=3;
                    }
                    break;
                case DOT:
                    {
                    switch ( input.LA(3) ) {
                    case 54:
                        {
                        alt25=6;
                        }
                        break;
                    case 56:
                        {
                        alt25=7;
                        }
                        break;
                    case IDENT:
                    case 66:
                    case 70:
                    case 72:
                    case 73:
                    case 74:
                    case 80:
                    case 81:
                        {
                        alt25=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 7, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    throw nvae;

                }

                }
                break;
            case AT:
                {
                alt25=2;
                }
                break;
            case 66:
            case 70:
            case 72:
            case 73:
            case 74:
            case 80:
            case 81:
                {
                alt25=3;
                }
                break;
            case LPAREN:
                {
                alt25=4;
                }
                break;
            case 63:
                {
                alt25=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // Query.g:339:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression1328);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nLit; }

                    }
                    break;
                case 2 :
                    // Query.g:340:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression1342);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nOr; }

                    }
                    break;
                case 3 :
                    // Query.g:341:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression1354);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPc; }

                    }
                    break;
                case 4 :
                    // Query.g:342:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1365); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression1369);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1371); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExp; }

                    }
                    break;
                case 5 :
                    // Query.g:343:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression1383);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nIfExp; }

                    }
                    break;
                case 6 :
                    // Query.g:344:7: id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression1395); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression1397); if (state.failed) return n;

                    match(input,54,FOLLOW_54_in_primaryExpression1399); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }

                    // Query.g:346:9: ( AT 'pre' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==AT) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // Query.g:346:11: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression1422); if (state.failed) return n;

                            match(input,77,FOLLOW_77_in_primaryExpression1424); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setIsPre(); }

                            }
                            break;

                    }


                    // Query.g:347:9: ( LPAREN RPAREN )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==LPAREN) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // Query.g:347:11: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1442); if (state.failed) return n;

                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1444); if (state.failed) return n;

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // Query.g:348:7: id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )?
                    {
                    id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression1457); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression1459); if (state.failed) return n;

                    match(input,56,FOLLOW_56_in_primaryExpression1461); if (state.failed) return n;

                    // Query.g:348:31: ( LPAREN idExp= expression RPAREN )
                    // Query.g:348:33: LPAREN idExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1465); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression1469);
                    idExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1471); if (state.failed) return n;

                    }


                    if ( state.backtracking==0 ) { n = new ASTObjectByUseIdExpression(id2, idExp); }

                    // Query.g:350:7: ( AT 'pre' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==AT) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // Query.g:350:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression1491); if (state.failed) return n;

                            match(input,77,FOLLOW_77_in_primaryExpression1493); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setIsPre(); }

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "primaryExpression"



    // $ANTLR start "objectReference"
    // Query.g:354:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;


        Token objectName=null;

        try {
            // Query.g:355:3: ( AT objectName= IDENT )
            // Query.g:356:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference1519); if (state.failed) return n;

            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference1527); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTObjectReferenceExpression(objectName); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "objectReference"



    // $ANTLR start "propertyCall"
    // Query.g:370:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExpQuery =null;

        ASTExpression nExpIterate =null;

        QueryParser.operationExpression_return nExpOperation =null;

        ASTTypeArgExpression nExpType =null;

        ASTInStateExpression nExpInState =null;


        try {
            // Query.g:371:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] )
            int alt26=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA26_1 = input.LA(2);

                if ( (((( input.LA(2) == LPAREN )&&( input.LA(2) == LPAREN ))&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))) ) {
                    alt26=1;
                }
                else if ( (true) ) {
                    alt26=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;

                }
                }
                break;
            case 66:
                {
                alt26=2;
                }
                break;
            case 70:
            case 73:
            case 74:
            case 80:
            case 81:
                {
                alt26=4;
                }
                break;
            case 72:
                {
                alt26=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // Query.g:375:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }

                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }

                    pushFollow(FOLLOW_queryExpression_in_propertyCall1592);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpQuery; }

                    }
                    break;
                case 2 :
                    // Query.g:378:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall1605);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpIterate; }

                    }
                    break;
                case 3 :
                    // Query.g:379:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall1618);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExpOperation!=null?nExpOperation.n:null); }

                    }
                    break;
                case 4 :
                    // Query.g:380:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall1631);
                    nExpType=typeExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpType; }

                    }
                    break;
                case 5 :
                    // Query.g:381:7: nExpInState= inStateExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_inStateExpression_in_propertyCall1644);
                    nExpInState=inStateExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpInState; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "propertyCall"



    // $ANTLR start "queryExpression"
    // Query.g:390:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTElemVarsDeclaration decls =null;

        ASTExpression nExp =null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // Query.g:391:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // Query.g:392:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression1679); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression1686); if (state.failed) return n;

            // Query.g:394:5: (decls= elemVarsDeclaration BAR )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==IDENT) ) {
                int LA27_1 = input.LA(2);

                if ( ((LA27_1 >= BAR && LA27_1 <= COLON)||LA27_1==COMMA) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // Query.g:394:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression1697);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {decl = decls;}

                    match(input,BAR,FOLLOW_BAR_in_queryExpression1701); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_queryExpression1712);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression1718); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTQueryExpression(op, range, decl, nExp); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "queryExpression"



    // $ANTLR start "iterateExpression"
    // Query.g:408:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTElemVarsDeclaration decls =null;

        ASTVariableInitialization init =null;

        ASTExpression nExp =null;


        try {
            // Query.g:408:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // Query.g:409:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,66,FOLLOW_66_in_iterateExpression1750); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression1756); if (state.failed) return n;

            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression1764);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;

            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression1766); if (state.failed) return n;

            pushFollow(FOLLOW_variableInitialization_in_iterateExpression1774);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;

            match(input,BAR,FOLLOW_BAR_in_iterateExpression1776); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_iterateExpression1784);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression1790); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTIterateExpression(i, range, decls, init, nExp); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "iterateExpression"


    public static class operationExpression_return extends ParserRuleReturnScope {
        public ASTOperationExpression n;
    };


    // $ANTLR start "operationExpression"
    // Query.g:430:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final QueryParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        QueryParser.operationExpression_return retval = new QueryParser.operationExpression_return();
        retval.start = input.LT(1);


        Token name=null;
        ASTExpression rolename =null;

        ASTExpression e =null;


        try {
            // Query.g:432:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // Query.g:433:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression1834); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }

            // Query.g:439:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==LBRACK) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // Query.g:439:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression1856); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_operationExpression1869);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier(rolename); }

                    // Query.g:441:9: ( COMMA rolename= expression )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==COMMA) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // Query.g:441:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression1882); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_operationExpression1886);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier(rolename); }

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression1898); if (state.failed) return retval;

                    // Query.g:444:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==LBRACK) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // Query.g:444:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression1915); if (state.failed) return retval;

                            pushFollow(FOLLOW_expression_in_operationExpression1930);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addQualifier(rolename); }

                            // Query.g:446:11: ( COMMA rolename= expression )*
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( (LA29_0==COMMA) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // Query.g:446:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression1945); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression1949);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addQualifier(rolename); }

                            	    }
                            	    break;

                            	default :
                            	    break loop29;
                                }
                            } while (true);


                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression1963); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            // Query.g:451:5: ( AT 'pre' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==AT) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // Query.g:451:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression1988); if (state.failed) return retval;

                    match(input,77,FOLLOW_77_in_operationExpression1990); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.setIsPre(); }

                    }
                    break;

            }


            // Query.g:453:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==LPAREN) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // Query.g:454:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression2015); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.hasParentheses(); }

                    // Query.g:455:7: (e= expression ( COMMA e= expression )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==AT||LA34_0==HASH||(LA34_0 >= IDENT && LA34_0 <= INT)||(LA34_0 >= LPAREN && LA34_0 <= MINUS)||LA34_0==PLUS||LA34_0==REAL||(LA34_0 >= STAR && LA34_0 <= STRING)||(LA34_0 >= 47 && LA34_0 <= 53)||LA34_0==61||LA34_0==63||(LA34_0 >= 66 && LA34_0 <= 75)||(LA34_0 >= 80 && LA34_0 <= 81)||LA34_0==83) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // Query.g:456:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression2036);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addArg(e); }

                            // Query.g:457:7: ( COMMA e= expression )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==COMMA) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // Query.g:457:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2048); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression2052);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addArg(e); }

                            	    }
                            	    break;

                            	default :
                            	    break loop33;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression2072); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { retval.n.setStartToken(((Token)retval.start)); }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "operationExpression"



    // $ANTLR start "inStateExpression"
    // Query.g:464:1: inStateExpression[ASTExpression source, boolean followsArrow] returns [ASTInStateExpression n] : opToken= 'oclInState' LPAREN s= IDENT RPAREN ;
    public final ASTInStateExpression inStateExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTInStateExpression n = null;


        Token opToken=null;
        Token s=null;

        try {
            // Query.g:465:35: (opToken= 'oclInState' LPAREN s= IDENT RPAREN )
            // Query.g:466:4: opToken= 'oclInState' LPAREN s= IDENT RPAREN
            {
            opToken=(Token)match(input,72,FOLLOW_72_in_inStateExpression2109); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_inStateExpression2114); if (state.failed) return n;

            s=(Token)match(input,IDENT,FOLLOW_IDENT_in_inStateExpression2123); if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_inStateExpression2128); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTInStateExpression(opToken, source, s, followsArrow); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "inStateExpression"



    // $ANTLR start "typeExpression"
    // Query.g:478:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;


        ASTType t =null;


         Token opToken = null; 
        try {
            // Query.g:481:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN )
            // Query.g:482:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) { opToken = input.LT(1); }

            if ( input.LA(1)==70||(input.LA(1) >= 73 && input.LA(1) <= 74)||(input.LA(1) >= 80 && input.LA(1) <= 81) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression2188); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_typeExpression2192);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression2194); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTypeArgExpression(opToken, source, t, followsArrow); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "typeExpression"



    // $ANTLR start "elemVarsDeclaration"
    // Query.g:493:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;


        Token var1=null;
        Token varN=null;
        ASTType t =null;

        ASTType tN =null;


        try {
            // Query.g:494:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // Query.g:495:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }

            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2232); if (state.failed) return n;

            // Query.g:496:17: ( COLON t= type )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==COLON) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // Query.g:496:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2235); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_elemVarsDeclaration2239);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}

            // Query.g:497:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==COMMA) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // Query.g:497:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration2249); if (state.failed) return n;

            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2255); if (state.failed) return n;

            	    // Query.g:497:24: ( COLON tN= type )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==COLON) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // Query.g:497:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2258); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration2264);
            	            tN=type();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    if ( state.backtracking==0 ) {n.addDeclaration(varN, tN); }

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "elemVarsDeclaration"



    // $ANTLR start "variableInitialization"
    // Query.g:505:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;


        Token name=null;
        ASTType t =null;

        ASTExpression e =null;


        try {
            // Query.g:506:5: (name= IDENT COLON t= type EQUAL e= expression )
            // Query.g:507:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization2292); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableInitialization2294); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableInitialization2298);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization2300); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_variableInitialization2304);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTVariableInitialization(name, t, e); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "variableInitialization"



    // $ANTLR start "ifExpression"
    // Query.g:516:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTExpression cond =null;

        ASTExpression t =null;

        ASTExpression e =null;


        try {
            // Query.g:517:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // Query.g:518:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,63,FOLLOW_63_in_ifExpression2336); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression2340);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,82,FOLLOW_82_in_ifExpression2342); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression2346);
            t=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,59,FOLLOW_59_in_ifExpression2348); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression2352);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,60,FOLLOW_60_in_ifExpression2354); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTIfExpression(i, cond, t, e); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "ifExpression"



    // $ANTLR start "literal"
    // Query.g:537:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR );
    public final ASTExpression literal() throws RecognitionException {
        ASTExpression n = null;


        Token t=null;
        Token f=null;
        Token i=null;
        Token r=null;
        Token s=null;
        Token enumLit=null;
        Token enumName=null;
        Token un=null;
        ASTCollectionLiteral nColIt =null;

        ASTEmptyCollectionLiteral nEColIt =null;

        ASTUndefinedLiteral nUndLit =null;

        ASTTupleLiteral nTupleLit =null;


        try {
            // Query.g:538:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR )
            int alt39=12;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt39=1;
                }
                break;
            case 61:
                {
                alt39=2;
                }
                break;
            case INT:
                {
                alt39=3;
                }
                break;
            case REAL:
                {
                alt39=4;
                }
                break;
            case STRING:
                {
                alt39=5;
                }
                break;
            case HASH:
                {
                alt39=6;
                }
                break;
            case IDENT:
                {
                alt39=7;
                }
                break;
            case 47:
            case 49:
            case 50:
            case 51:
                {
                int LA39_8 = input.LA(2);

                if ( (LA39_8==LPAREN) ) {
                    alt39=9;
                }
                else if ( (LA39_8==LBRACE) ) {
                    alt39=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 8, input);

                    throw nvae;

                }
                }
                break;
            case 48:
            case 71:
                {
                alt39=9;
                }
                break;
            case 53:
            case 69:
            case 75:
                {
                alt39=10;
                }
                break;
            case 52:
                {
                alt39=11;
                }
                break;
            case STAR:
                {
                alt39=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }

            switch (alt39) {
                case 1 :
                    // Query.g:539:7: t= 'true'
                    {
                    t=(Token)match(input,83,FOLLOW_83_in_literal2393); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }

                    }
                    break;
                case 2 :
                    // Query.g:540:7: f= 'false'
                    {
                    f=(Token)match(input,61,FOLLOW_61_in_literal2407); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }

                    }
                    break;
                case 3 :
                    // Query.g:541:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal2420); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }

                    }
                    break;
                case 4 :
                    // Query.g:542:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal2435); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }

                    }
                    break;
                case 5 :
                    // Query.g:543:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal2449); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }

                    }
                    break;
                case 6 :
                    // Query.g:544:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal2459); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2463); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}

                    }
                    break;
                case 7 :
                    // Query.g:545:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2475); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal2477); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2481); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }

                    }
                    break;
                case 8 :
                    // Query.g:546:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal2493);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nColIt; }

                    }
                    break;
                case 9 :
                    // Query.g:547:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal2505);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nEColIt; }

                    }
                    break;
                case 10 :
                    // Query.g:548:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal2517);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nUndLit; }

                    }
                    break;
                case 11 :
                    // Query.g:549:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal2529);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nTupleLit; }

                    }
                    break;
                case 12 :
                    // Query.g:550:7: un= STAR
                    {
                    un=(Token)match(input,STAR,FOLLOW_STAR_in_literal2541); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnlimitedNaturalLiteral(un); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "literal"



    // $ANTLR start "collectionLiteral"
    // Query.g:558:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;


        ASTCollectionItem ci =null;


         Token op = null; 
        try {
            // Query.g:560:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // Query.g:561:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( input.LA(1)==47||(input.LA(1) >= 49 && input.LA(1) <= 51) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) { n = new ASTCollectionLiteral(op); }

            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral2608); if (state.failed) return n;

            // Query.g:565:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==AT||LA41_0==HASH||(LA41_0 >= IDENT && LA41_0 <= INT)||(LA41_0 >= LPAREN && LA41_0 <= MINUS)||LA41_0==PLUS||LA41_0==REAL||(LA41_0 >= STAR && LA41_0 <= STRING)||(LA41_0 >= 47 && LA41_0 <= 53)||LA41_0==61||LA41_0==63||(LA41_0 >= 66 && LA41_0 <= 75)||(LA41_0 >= 80 && LA41_0 <= 81)||LA41_0==83) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // Query.g:566:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral2625);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addItem(ci); }

                    // Query.g:567:7: ( COMMA ci= collectionItem )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==COMMA) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // Query.g:567:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral2638); if (state.failed) return n;

                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral2642);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addItem(ci); }

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral2661); if (state.failed) return n;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "collectionLiteral"



    // $ANTLR start "collectionItem"
    // Query.g:576:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;


        ASTExpression e =null;


         n = new ASTCollectionItem(); 
        try {
            // Query.g:578:5: (e= expression ( DOTDOT e= expression )? )
            // Query.g:579:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem2690);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setFirst(e); }

            // Query.g:580:5: ( DOTDOT e= expression )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==DOTDOT) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // Query.g:580:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem2701); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_collectionItem2705);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setSecond(e); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "collectionItem"



    // $ANTLR start "emptyCollectionLiteral"
    // Query.g:590:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;


        ASTCollectionType t =null;


        try {
            // Query.g:591:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==71) ) {
                alt43=1;
            }
            else if ( ((LA43_0 >= 47 && LA43_0 <= 51)) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }
            switch (alt43) {
                case 1 :
                    // Query.g:592:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,71,FOLLOW_71_in_emptyCollectionLiteral2734); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral2736); if (state.failed) return n;

                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral2740);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral2742); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;
                case 2 :
                    // Query.g:595:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral2758);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral2760); if (state.failed) return n;

                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral2762); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "emptyCollectionLiteral"



    // $ANTLR start "undefinedLiteral"
    // Query.g:606:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;


        ASTType t =null;


        try {
            // Query.g:607:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt44=1;
                }
                break;
            case 53:
                {
                alt44=2;
                }
                break;
            case 69:
                {
                int LA44_3 = input.LA(2);

                if ( (LA44_3==LPAREN) ) {
                    alt44=3;
                }
                else if ( (LA44_3==EOF||LA44_3==ARROW||LA44_3==BAR||(LA44_3 >= COMMA && LA44_3 <= EQUAL)||(LA44_3 >= GREATER && LA44_3 <= GREATER_EQUAL)||(LA44_3 >= LESS && LA44_3 <= LESS_EQUAL)||LA44_3==MINUS||(LA44_3 >= NOT_EQUAL && LA44_3 <= PLUS)||(LA44_3 >= RBRACE && LA44_3 <= RBRACK)||LA44_3==RPAREN||LA44_3==SLASH||LA44_3==STAR||LA44_3==55||(LA44_3 >= 58 && LA44_3 <= 60)||(LA44_3 >= 64 && LA44_3 <= 65)||LA44_3==76||LA44_3==82||(LA44_3 >= 84 && LA44_3 <= 85)) ) {
                    alt44=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }

            switch (alt44) {
                case 1 :
                    // Query.g:608:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,75,FOLLOW_75_in_undefinedLiteral2792); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral2794); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral2798);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral2800); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 2 :
                    // Query.g:611:5: 'Undefined'
                    {
                    match(input,53,FOLLOW_53_in_undefinedLiteral2814); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;
                case 3 :
                    // Query.g:614:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,69,FOLLOW_69_in_undefinedLiteral2828); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral2830); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral2834);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral2836); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 4 :
                    // Query.g:617:5: 'null'
                    {
                    match(input,69,FOLLOW_69_in_undefinedLiteral2850); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "undefinedLiteral"



    // $ANTLR start "tupleLiteral"
    // Query.g:627:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;


        ASTTupleItem ti =null;


         List tiList = new ArrayList(); 
        try {
            // Query.g:629:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // Query.g:630:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,52,FOLLOW_52_in_tupleLiteral2889); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral2895); if (state.failed) return n;

            pushFollow(FOLLOW_tupleItem_in_tupleLiteral2903);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tiList.add(ti); }

            // Query.g:633:5: ( COMMA ti= tupleItem )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==COMMA) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // Query.g:633:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral2914); if (state.failed) return n;

            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral2918);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tiList.add(ti); }

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral2929); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTupleLiteral(tiList); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "tupleLiteral"



    // $ANTLR start "tupleItem"
    // Query.g:641:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;


        Token name=null;
        ASTType t =null;

        ASTExpression e =null;


        try {
            // Query.g:642:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // Query.g:643:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem2960); if (state.failed) return n;

            // Query.g:644:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==COLON) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred1_Query()) ) {
                    alt46=1;
                }
                else if ( (true) ) {
                    alt46=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA46_0==EQUAL) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }
            switch (alt46) {
                case 1 :
                    // Query.g:647:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem2999); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_tupleItem3003);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem3005); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_tupleItem3009);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, e); }

                    }
                    break;
                case 2 :
                    // Query.g:650:7: ( COLON | EQUAL ) e= expression
                    {
                    if ( input.LA(1)==COLON||input.LA(1)==EQUAL ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_expression_in_tupleItem3041);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, e); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "tupleItem"



    // $ANTLR start "type"
    // Query.g:661:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;


        ASTSimpleType nTSimple =null;

        ASTCollectionType nTCollection =null;

        ASTTupleType nTTuple =null;


         Token tok = null; 
        try {
            // Query.g:663:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
            // Query.g:664:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }

            // Query.g:665:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            int alt47=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt47=1;
                }
                break;
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt47=2;
                }
                break;
            case 52:
                {
                alt47=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }

            switch (alt47) {
                case 1 :
                    // Query.g:666:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type3107);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 2 :
                    // Query.g:667:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type3119);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 3 :
                    // Query.g:668:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type3131);
                    nTTuple=tupleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTTuple; if (n != null) n.setStartToken(tok); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "type"



    // $ANTLR start "typeOnly"
    // Query.g:673:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;


        ASTType nT =null;


        try {
            // Query.g:674:5: (nT= type EOF )
            // Query.g:675:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly3163);
            nT=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_typeOnly3165); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nT; }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "typeOnly"



    // $ANTLR start "simpleType"
    // Query.g:685:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;


        Token name=null;

        try {
            // Query.g:686:5: (name= IDENT )
            // Query.g:687:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType3193); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTSimpleType(name); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "simpleType"



    // $ANTLR start "collectionType"
    // Query.g:695:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;


        ASTType elemType =null;


         Token op = null; 
        try {
            // Query.g:697:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // Query.g:698:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( (input.LA(1) >= 47 && input.LA(1) <= 51) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType3258); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_collectionType3262);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType3264); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTCollectionType(op, elemType); if (n != null) n.setStartToken(op);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "collectionType"



    // $ANTLR start "tupleType"
    // Query.g:708:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;


        ASTTuplePart tp =null;


         List tpList = new ArrayList(); 
        try {
            // Query.g:710:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // Query.g:711:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,52,FOLLOW_52_in_tupleType3298); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType3300); if (state.failed) return n;

            pushFollow(FOLLOW_tuplePart_in_tupleType3309);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tpList.add(tp); }

            // Query.g:713:5: ( COMMA tp= tuplePart )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==COMMA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // Query.g:713:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType3320); if (state.failed) return n;

            	    pushFollow(FOLLOW_tuplePart_in_tupleType3324);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tpList.add(tp); }

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType3336); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTupleType(tpList); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "tupleType"



    // $ANTLR start "tuplePart"
    // Query.g:722:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Query.g:723:5: (name= IDENT COLON t= type )
            // Query.g:724:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart3368); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_tuplePart3370); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_tuplePart3374);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTuplePart(name, t); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "tuplePart"

    // $ANTLR start synpred1_Query
    public final void synpred1_Query_fragment() throws RecognitionException {
        // Query.g:647:7: ( COLON type EQUAL )
        // Query.g:647:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred1_Query2990); if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred1_Query2992);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_Query2994); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Query

    // Delegated rules

    public final boolean synpred1_Query() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Query_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_57_in_checkExpr31 = new BitSet(new long[]{0x4000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_modifiers_in_checkExpr37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_queryExpr_in_checkExpr41 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_queryExpr53 = new BitSet(new long[]{0x0000000000A000C0L});
    public static final BitSet FOLLOW_featureExpr_in_queryExpr55 = new BitSet(new long[]{0x0000000000001002L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMA_in_queryExpr58 = new BitSet(new long[]{0x0000000000A000C0L});
    public static final BitSet FOLLOW_featureExpr_in_queryExpr60 = new BitSet(new long[]{0x0000000000001002L,0x0000000000100000L});
    public static final BitSet FOLLOW_condExpr_in_queryExpr65 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_condExpr158 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FFCL});
    public static final BitSet FOLLOW_expression_in_condExpr160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_expression237 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_expression248 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_COLON_in_expression252 = new BitSet(new long[]{0x001F800000200000L});
    public static final BitSet FOLLOW_type_in_expression256 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUAL_in_expression261 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FFCL});
    public static final BitSet FOLLOW_expression_in_expression265 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_expression303 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_expression315 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_COLON_in_expression319 = new BitSet(new long[]{0x001F800000200000L});
    public static final BitSet FOLLOW_type_in_expression323 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUAL_in_expression328 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FFCL});
    public static final BitSet FOLLOW_expression_in_expression332 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_expression373 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FFCL});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList422 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList439 = new BitSet(new long[]{0x0000008000001000L});
    public static final BitSet FOLLOW_COMMA_in_paramList451 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList455 = new BitSet(new long[]{0x0000008000001000L});
    public static final BitSet FOLLOW_RPAREN_in_paramList475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList504 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_idList514 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_idList518 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration549 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration551 = new BitSet(new long[]{0x001F800000200000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression591 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_conditionalImpliesExpression604 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FF4L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression608 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression653 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_conditionalOrExpression666 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FF4L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression670 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression714 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_conditionalXOrExpression727 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FF4L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression731 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression775 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_conditionalAndExpression788 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FF4L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression792 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression840 = new BitSet(new long[]{0x0000000200008002L});
    public static final BitSet FOLLOW_set_in_equalityExpression859 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FF4L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression869 = new BitSet(new long[]{0x0000000200008002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression918 = new BitSet(new long[]{0x000000000C060002L});
    public static final BitSet FOLLOW_set_in_relationalExpression936 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FF4L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression954 = new BitSet(new long[]{0x000000000C060002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1004 = new BitSet(new long[]{0x0000000420000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression1022 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FF4L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1032 = new BitSet(new long[]{0x0000000420000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1082 = new BitSet(new long[]{0x04000A0000000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1100 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FF4L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1114 = new BitSet(new long[]{0x04000A0000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpression1176 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FF4L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression1253 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression1271 = new BitSet(new long[]{0x0000000000200000L,0x0000000000030744L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression1277 = new BitSet(new long[]{0x0000000000200000L,0x0000000000030744L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression1288 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_literal_in_primaryExpression1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression1365 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FFCL});
    public static final BitSet FOLLOW_expression_in_primaryExpression1369 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression1395 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression1397 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_primaryExpression1399 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression1422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_primaryExpression1424 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression1442 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression1457 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression1459 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_primaryExpression1461 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression1465 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FFCL});
    public static final BitSet FOLLOW_expression_in_primaryExpression1469 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression1471 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression1491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_primaryExpression1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference1519 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_objectReference1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inStateExpression_in_propertyCall1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression1679 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression1686 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FFCL});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression1697 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_BAR_in_queryExpression1701 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FFCL});
    public static final BitSet FOLLOW_expression_in_queryExpression1712 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_iterateExpression1750 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression1756 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression1764 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression1766 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression1774 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression1776 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FFCL});
    public static final BitSet FOLLOW_expression_in_iterateExpression1784 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression1834 = new BitSet(new long[]{0x0000000012000022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression1856 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FFCL});
    public static final BitSet FOLLOW_expression_in_operationExpression1869 = new BitSet(new long[]{0x0000002000001000L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression1882 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FFCL});
    public static final BitSet FOLLOW_expression_in_operationExpression1886 = new BitSet(new long[]{0x0000002000001000L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression1898 = new BitSet(new long[]{0x0000000012000022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression1915 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FFCL});
    public static final BitSet FOLLOW_expression_in_operationExpression1930 = new BitSet(new long[]{0x0000002000001000L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression1945 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FFCL});
    public static final BitSet FOLLOW_expression_in_operationExpression1949 = new BitSet(new long[]{0x0000002000001000L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression1963 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_AT_in_operationExpression1988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_operationExpression1990 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression2015 = new BitSet(new long[]{0xA03F98C430680020L,0x00000000000B0FFCL});
    public static final BitSet FOLLOW_expression_in_operationExpression2036 = new BitSet(new long[]{0x0000008000001000L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2048 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FFCL});
    public static final BitSet FOLLOW_expression_in_operationExpression2052 = new BitSet(new long[]{0x0000008000001000L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_inStateExpression2109 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_inStateExpression2114 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_inStateExpression2123 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_inStateExpression2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression2164 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression2188 = new BitSet(new long[]{0x001F800000200000L});
    public static final BitSet FOLLOW_type_in_typeExpression2192 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2232 = new BitSet(new long[]{0x0000000000001202L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2235 = new BitSet(new long[]{0x001F800000200000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration2239 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration2249 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2255 = new BitSet(new long[]{0x0000000000001202L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2258 = new BitSet(new long[]{0x001F800000200000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration2264 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization2292 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization2294 = new BitSet(new long[]{0x001F800000200000L});
    public static final BitSet FOLLOW_type_in_variableInitialization2298 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization2300 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FFCL});
    public static final BitSet FOLLOW_expression_in_variableInitialization2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ifExpression2336 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FFCL});
    public static final BitSet FOLLOW_expression_in_ifExpression2340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ifExpression2342 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FFCL});
    public static final BitSet FOLLOW_expression_in_ifExpression2346 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ifExpression2348 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FFCL});
    public static final BitSet FOLLOW_expression_in_ifExpression2352 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ifExpression2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_literal2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_literal2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal2459 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_literal2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal2475 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal2477 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_literal2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_literal2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral2579 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral2608 = new BitSet(new long[]{0xA03F985430680020L,0x00000000000B0FFCL});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral2625 = new BitSet(new long[]{0x0000001000001000L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral2638 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FFCL});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral2642 = new BitSet(new long[]{0x0000001000001000L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem2690 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem2701 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FFCL});
    public static final BitSet FOLLOW_expression_in_collectionItem2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_emptyCollectionLiteral2734 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral2736 = new BitSet(new long[]{0x000F800000000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral2740 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral2758 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral2760 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_undefinedLiteral2792 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral2794 = new BitSet(new long[]{0x001F800000200000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral2798 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_undefinedLiteral2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_undefinedLiteral2828 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral2830 = new BitSet(new long[]{0x001F800000200000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral2834 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_undefinedLiteral2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_tupleLiteral2889 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral2895 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral2903 = new BitSet(new long[]{0x0000001000001000L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral2914 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral2918 = new BitSet(new long[]{0x0000001000001000L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem2960 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_COLON_in_tupleItem2999 = new BitSet(new long[]{0x001F800000200000L});
    public static final BitSet FOLLOW_type_in_tupleItem3003 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem3005 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FFCL});
    public static final BitSet FOLLOW_expression_in_tupleItem3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem3031 = new BitSet(new long[]{0xA03F984430680020L,0x00000000000B0FFCL});
    public static final BitSet FOLLOW_expression_in_tupleItem3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly3163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType3231 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType3258 = new BitSet(new long[]{0x001F800000200000L});
    public static final BitSet FOLLOW_type_in_collectionType3262 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_tupleType3298 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType3300 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType3309 = new BitSet(new long[]{0x0000008000001000L});
    public static final BitSet FOLLOW_COMMA_in_tupleType3320 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType3324 = new BitSet(new long[]{0x0000008000001000L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart3368 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_tuplePart3370 = new BitSet(new long[]{0x001F800000200000L});
    public static final BitSet FOLLOW_type_in_tuplePart3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_synpred1_Query2990 = new BitSet(new long[]{0x001F800000200000L});
    public static final BitSet FOLLOW_type_in_synpred1_Query2992 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred1_Query2994 = new BitSet(new long[]{0x0000000000000002L});

}