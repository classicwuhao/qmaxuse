// $ANTLR 3.4 Query.g 2019-02-07 15:33:37

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "AssocExpr", "AttrExpr", "BAR", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "InvExpr", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", "NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", "REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", "WS", "'&&'", "'Bag'", "'Collection'", "'OrderedSet'", "'Sequence'", "'Set'", "'Tuple'", "'Undefined'", "'allInstances'", "'and'", "'as'", "'byUseId'", "'div'", "'else'", "'endif'", "'false'", "'full'", "'if'", "'implies'", "'in'", "'iterate'", "'let'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", "'oclInState'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", "'or'", "'pre'", "'pure'", "'select'", "'selectByKind'", "'selectByType'", "'then'", "'true'", "'verify'", "'with'", "'withocl'", "'without'", "'xor'", "'||'"
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
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
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
    // Query.g:38:1: checkExpr : 'verify' queryExpr ;
    public final void checkExpr() throws RecognitionException {
        try {
            // Query.g:38:10: ( 'verify' queryExpr )
            // Query.g:38:12: 'verify' queryExpr
            {
            match(input,85,FOLLOW_85_in_checkExpr31); if (state.failed) return ;

            pushFollow(FOLLOW_queryExpr_in_checkExpr33);
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
    // Query.g:41:1: queryExpr : ( 'select' featureExpr ( COMMA featureExpr )* ( condExpr )? ( 'as' IDENT )? queryExpr_nl |alias= IDENT queryExpr_nl );
    public final void queryExpr() throws RecognitionException {
        Token alias=null;

        try {
            // Query.g:41:10: ( 'select' featureExpr ( COMMA featureExpr )* ( condExpr )? ( 'as' IDENT )? queryExpr_nl |alias= IDENT queryExpr_nl )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==80) ) {
                alt4=1;
            }
            else if ( (LA4_0==IDENT) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // Query.g:42:5: 'select' featureExpr ( COMMA featureExpr )* ( condExpr )? ( 'as' IDENT )? queryExpr_nl
                    {
                    match(input,80,FOLLOW_80_in_queryExpr46); if (state.failed) return ;

                    pushFollow(FOLLOW_featureExpr_in_queryExpr48);
                    featureExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    // Query.g:42:26: ( COMMA featureExpr )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==COMMA) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // Query.g:42:27: COMMA featureExpr
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_queryExpr51); if (state.failed) return ;

                    	    pushFollow(FOLLOW_featureExpr_in_queryExpr53);
                    	    featureExpr();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    // Query.g:42:47: ( condExpr )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0 >= 86 && LA2_0 <= 88)) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // Query.g:42:48: condExpr
                            {
                            pushFollow(FOLLOW_condExpr_in_queryExpr58);
                            condExpr();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    // Query.g:42:59: ( 'as' IDENT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==57) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // Query.g:42:60: 'as' IDENT
                            {
                            match(input,57,FOLLOW_57_in_queryExpr63); if (state.failed) return ;

                            match(input,IDENT,FOLLOW_IDENT_in_queryExpr65); if (state.failed) return ;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_queryExpr_nl_in_queryExpr69);
                    queryExpr_nl();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {System.out.println("this is a query.");}

                    }
                    break;
                case 2 :
                    // Query.g:44:6: alias= IDENT queryExpr_nl
                    {
                    alias=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpr85); if (state.failed) return ;

                    pushFollow(FOLLOW_queryExpr_nl_in_queryExpr87);
                    queryExpr_nl();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {System.out.println("This is an query alias:"+alias.getText());}

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
        return ;
    }
    // $ANTLR end "queryExpr"



    // $ANTLR start "queryExpr_nl"
    // Query.g:48:1: queryExpr_nl : ( '&&' queryExpr | '||' queryExpr |);
    public final void queryExpr_nl() throws RecognitionException {
        try {
            // Query.g:48:13: ( '&&' queryExpr | '||' queryExpr |)
            int alt5=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt5=1;
                }
                break;
            case 90:
                {
                alt5=2;
                }
                break;
            case EOF:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // Query.g:49:5: '&&' queryExpr
                    {
                    match(input,47,FOLLOW_47_in_queryExpr_nl104); if (state.failed) return ;

                    pushFollow(FOLLOW_queryExpr_in_queryExpr_nl106);
                    queryExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Query.g:50:7: '||' queryExpr
                    {
                    match(input,90,FOLLOW_90_in_queryExpr_nl114); if (state.failed) return ;

                    pushFollow(FOLLOW_queryExpr_in_queryExpr_nl116);
                    queryExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Query.g:52:5: 
                    {
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
        return ;
    }
    // $ANTLR end "queryExpr_nl"



    // $ANTLR start "modifiers"
    // Query.g:54:1: modifiers : ( 'pure' | 'full' );
    public final void modifiers() throws RecognitionException {
        try {
            // Query.g:54:10: ( 'pure' | 'full' )
            // Query.g:
            {
            if ( input.LA(1)==63||input.LA(1)==79 ) {
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
    // Query.g:60:2: featureExpr : ( ( 'pure' )? dest= ( IDENT | STAR ) | AttrExpr | AssocExpr );
    public final void featureExpr() throws RecognitionException {
        Token dest=null;


                boolean isPure=false;
            
        try {
            // Query.g:63:7: ( ( 'pure' )? dest= ( IDENT | STAR ) | AttrExpr | AssocExpr )
            int alt7=3;
            switch ( input.LA(1) ) {
            case IDENT:
            case STAR:
            case 79:
                {
                alt7=1;
                }
                break;
            case AttrExpr:
                {
                alt7=2;
                }
                break;
            case AssocExpr:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // Query.g:64:5: ( 'pure' )? dest= ( IDENT | STAR )
                    {
                    // Query.g:64:5: ( 'pure' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==79) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // Query.g:64:6: 'pure'
                            {
                            match(input,79,FOLLOW_79_in_featureExpr170); if (state.failed) return ;

                            if ( state.backtracking==0 ) {isPure=true;}

                            }
                            break;

                    }


                    dest=(Token)input.LT(1);

                    if ( input.LA(1)==IDENT||input.LA(1)==STAR ) {
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
                    break;
                case 2 :
                    // Query.g:66:5: AttrExpr
                    {
                    match(input,AttrExpr,FOLLOW_AttrExpr_in_featureExpr192); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Query.g:67:5: AssocExpr
                    {
                    match(input,AssocExpr,FOLLOW_AssocExpr_in_featureExpr198); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "featureExpr"



    // $ANTLR start "condExpr"
    // Query.g:84:1: condExpr : ( withExpr | withoutExpr | oclExpr );
    public final void condExpr() throws RecognitionException {
        try {
            // Query.g:84:9: ( withExpr | withoutExpr | oclExpr )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt8=1;
                }
                break;
            case 88:
                {
                alt8=2;
                }
                break;
            case 87:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // Query.g:85:5: withExpr
                    {
                    pushFollow(FOLLOW_withExpr_in_condExpr302);
                    withExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Query.g:86:7: withoutExpr
                    {
                    pushFollow(FOLLOW_withoutExpr_in_condExpr310);
                    withoutExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Query.g:87:7: oclExpr
                    {
                    pushFollow(FOLLOW_oclExpr_in_condExpr318);
                    oclExpr();

                    state._fsp--;
                    if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "condExpr"



    // $ANTLR start "oclExpr"
    // Query.g:90:1: oclExpr : 'withocl' expression ;
    public final void oclExpr() throws RecognitionException {
        try {
            // Query.g:90:8: ( 'withocl' expression )
            // Query.g:90:10: 'withocl' expression
            {
            match(input,87,FOLLOW_87_in_oclExpr326); if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_oclExpr328);
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
    // $ANTLR end "oclExpr"



    // $ANTLR start "withExpr"
    // Query.g:93:1: withExpr : 'with' InvExpr ( COMMA InvExpr )* ;
    public final void withExpr() throws RecognitionException {
        try {
            // Query.g:93:9: ( 'with' InvExpr ( COMMA InvExpr )* )
            // Query.g:94:5: 'with' InvExpr ( COMMA InvExpr )*
            {
            match(input,86,FOLLOW_86_in_withExpr341); if (state.failed) return ;

            match(input,InvExpr,FOLLOW_InvExpr_in_withExpr343); if (state.failed) return ;

            // Query.g:94:20: ( COMMA InvExpr )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==COMMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Query.g:94:21: COMMA InvExpr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_withExpr346); if (state.failed) return ;

            	    match(input,InvExpr,FOLLOW_InvExpr_in_withExpr348); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
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
        return ;
    }
    // $ANTLR end "withExpr"



    // $ANTLR start "withoutExpr"
    // Query.g:96:1: withoutExpr : 'without' InvExpr ( COMMA InvExpr )* ;
    public final void withoutExpr() throws RecognitionException {
        try {
            // Query.g:96:12: ( 'without' InvExpr ( COMMA InvExpr )* )
            // Query.g:97:5: 'without' InvExpr ( COMMA InvExpr )*
            {
            match(input,88,FOLLOW_88_in_withoutExpr361); if (state.failed) return ;

            match(input,InvExpr,FOLLOW_InvExpr_in_withoutExpr363); if (state.failed) return ;

            // Query.g:97:23: ( COMMA InvExpr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Query.g:97:24: COMMA InvExpr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_withoutExpr366); if (state.failed) return ;

            	    match(input,InvExpr,FOLLOW_InvExpr_in_withoutExpr368); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "withoutExpr"



    // $ANTLR start "expressionOnly"
    // Query.g:126:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExp =null;


        try {
            // Query.g:127:5: (nExp= expression EOF )
            // Query.g:128:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly397);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_expressionOnly399); if (state.failed) return n;

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
    // Query.g:135:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
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
            // Query.g:141:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
            // Query.g:142:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }

            // Query.g:143:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==68) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // Query.g:144:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
            	    {
            	    match(input,68,FOLLOW_68_in_expression447); if (state.failed) return n;

            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression458); if (state.failed) return n;

            	    // Query.g:145:18: ( COLON t= type )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==COLON) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // Query.g:145:20: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression462); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_expression466);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression471); if (state.failed) return n;

            	    pushFollow(FOLLOW_expression_in_expression475);
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

            	    // Query.g:155:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==COMMA) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // Query.g:156:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_expression513); if (state.failed) return n;

            	    	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression525); if (state.failed) return n;

            	    	    // Query.g:157:20: ( COLON t= type )?
            	    	    int alt12=2;
            	    	    int LA12_0 = input.LA(1);

            	    	    if ( (LA12_0==COLON) ) {
            	    	        alt12=1;
            	    	    }
            	    	    switch (alt12) {
            	    	        case 1 :
            	    	            // Query.g:157:22: COLON t= type
            	    	            {
            	    	            match(input,COLON,FOLLOW_COLON_in_expression529); if (state.failed) return n;

            	    	            pushFollow(FOLLOW_type_in_expression533);
            	    	            t=type();

            	    	            state._fsp--;
            	    	            if (state.failed) return n;

            	    	            }
            	    	            break;

            	    	    }


            	    	    match(input,EQUAL,FOLLOW_EQUAL_in_expression538); if (state.failed) return n;

            	    	    pushFollow(FOLLOW_expression_in_expression542);
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
            	    	    break loop13;
            	        }
            	    } while (true);


            	    match(input,66,FOLLOW_66_in_expression583); if (state.failed) return n;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression599);
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
    // Query.g:190:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;


        ASTVariableDeclaration v =null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // Query.g:192:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // Query.g:193:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList632); if (state.failed) return paramList;

            // Query.g:194:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IDENT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // Query.g:195:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList649);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;

                    if ( state.backtracking==0 ) { paramList.add(v); }

                    // Query.g:196:7: ( COMMA v= variableDeclaration )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==COMMA) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Query.g:196:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList661); if (state.failed) return paramList;

                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList665);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;

                    	    if ( state.backtracking==0 ) { paramList.add(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_paramList685); if (state.failed) return paramList;

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
    // Query.g:204:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;


        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // Query.g:206:5: (id0= IDENT ( COMMA idn= IDENT )* )
            // Query.g:207:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList714); if (state.failed) return idList;

            if ( state.backtracking==0 ) { idList.add(id0); }

            // Query.g:208:5: ( COMMA idn= IDENT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Query.g:208:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList724); if (state.failed) return idList;

            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList728); if (state.failed) return idList;

            	    if ( state.backtracking==0 ) { idList.add(idn); }

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
        return idList;
    }
    // $ANTLR end "idList"



    // $ANTLR start "variableDeclaration"
    // Query.g:216:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Query.g:217:5: (name= IDENT COLON t= type )
            // Query.g:218:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration759); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableDeclaration761); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableDeclaration765);
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
    // Query.g:226:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndOrExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:227:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // Query.g:228:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression801);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndOrExp;}

            // Query.g:229:5: (op= 'implies' n1= conditionalOrExpression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==65) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Query.g:229:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,65,FOLLOW_65_in_conditionalImpliesExpression814); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression818);
            	    n1=conditionalOrExpression();

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
    // $ANTLR end "conditionalImpliesExpression"



    // $ANTLR start "conditionalOrExpression"
    // Query.g:238:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndXorExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:239:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // Query.g:240:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression863);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndXorExp;}

            // Query.g:241:5: (op= 'or' n1= conditionalXOrExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==77) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // Query.g:241:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,77,FOLLOW_77_in_conditionalOrExpression876); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression880);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // Query.g:250:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndAndExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:251:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // Query.g:252:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression924);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndAndExp;}

            // Query.g:253:5: (op= 'xor' n1= conditionalAndExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==89) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Query.g:253:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,89,FOLLOW_89_in_conditionalXOrExpression937); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression941);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // Query.g:262:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nEqExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:263:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // Query.g:264:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression985);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nEqExp;}

            // Query.g:265:5: (op= 'and' n1= equalityExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==56) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Query.g:265:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,56,FOLLOW_56_in_conditionalAndExpression998); if (state.failed) return n;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1002);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

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
    // $ANTLR end "conditionalAndExpression"



    // $ANTLR start "equalityExpression"
    // Query.g:274:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nRelExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:276:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // Query.g:277:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1050);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nRelExp;}

            // Query.g:278:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==EQUAL||LA22_0==NOT_EQUAL) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Query.g:278:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1079);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // Query.g:288:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nAddiExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:290:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // Query.g:291:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1128);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nAddiExp;}

            // Query.g:292:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0 >= GREATER && LA23_0 <= GREATER_EQUAL)||(LA23_0 >= LESS && LA23_0 <= LESS_EQUAL)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Query.g:292:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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


            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1164);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // Query.g:302:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nMulExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:304:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // Query.g:305:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1214);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nMulExp;}

            // Query.g:306:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==MINUS||LA24_0==PLUS) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Query.g:306:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1242);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // Query.g:317:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:319:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // Query.g:320:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1292);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nUnExp;}

            // Query.g:321:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==SLASH||LA25_0==STAR||LA25_0==59) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Query.g:321:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==59 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1324);
            	    n1=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // Query.g:333:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression nPosExp =null;


         Token op = null; 
        try {
            // Query.g:335:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==MINUS||LA26_0==PLUS||LA26_0==69) ) {
                alt26=1;
            }
            else if ( (LA26_0==AT||LA26_0==HASH||(LA26_0 >= IDENT && LA26_0 <= INT)||LA26_0==LPAREN||LA26_0==REAL||(LA26_0 >= STAR && LA26_0 <= STRING)||(LA26_0 >= 48 && LA26_0 <= 54)||LA26_0==62||LA26_0==64||LA26_0==67||(LA26_0 >= 70 && LA26_0 <= 76)||(LA26_0 >= 81 && LA26_0 <= 82)||LA26_0==84) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // Query.g:336:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // Query.g:336:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // Query.g:336:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) { op = input.LT(1); }

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==69 ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1410);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }

                    }


                    }
                    break;
                case 2 :
                    // Query.g:340:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression1430);
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
    // Query.g:348:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nPrimExp =null;

        ASTExpression nPc =null;


         boolean arrow = false; 
        try {
            // Query.g:350:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // Query.g:351:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression1463);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nPrimExp; }

            // Query.g:352:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==ARROW||LA28_0==DOT) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Query.g:353:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // Query.g:353:6: ( ARROW | DOT )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==ARROW) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==DOT) ) {
            	        alt27=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // Query.g:353:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression1481); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = true; }

            	            }
            	            break;
            	        case 2 :
            	            // Query.g:353:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression1487); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = false; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression1498);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = nPc; }

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // Query.g:369:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? );
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
            // Query.g:370:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? )
            int alt32=7;
            switch ( input.LA(1) ) {
            case HASH:
            case INT:
            case REAL:
            case STAR:
            case STRING:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 62:
            case 70:
            case 72:
            case 76:
            case 84:
                {
                alt32=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt32=1;
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
                case 47:
                case 56:
                case 57:
                case 59:
                case 60:
                case 61:
                case 65:
                case 66:
                case 77:
                case 83:
                case 89:
                case 90:
                    {
                    alt32=3;
                    }
                    break;
                case DOT:
                    {
                    switch ( input.LA(3) ) {
                    case 55:
                        {
                        alt32=6;
                        }
                        break;
                    case 58:
                        {
                        alt32=7;
                        }
                        break;
                    case IDENT:
                    case 67:
                    case 71:
                    case 73:
                    case 74:
                    case 75:
                    case 81:
                    case 82:
                        {
                        alt32=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 7, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 2, input);

                    throw nvae;

                }

                }
                break;
            case AT:
                {
                alt32=2;
                }
                break;
            case 67:
            case 71:
            case 73:
            case 74:
            case 75:
            case 81:
            case 82:
                {
                alt32=3;
                }
                break;
            case LPAREN:
                {
                alt32=4;
                }
                break;
            case 64:
                {
                alt32=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // Query.g:371:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression1538);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nLit; }

                    }
                    break;
                case 2 :
                    // Query.g:372:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression1552);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nOr; }

                    }
                    break;
                case 3 :
                    // Query.g:373:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression1564);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPc; }

                    }
                    break;
                case 4 :
                    // Query.g:374:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1575); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression1579);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1581); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExp; }

                    }
                    break;
                case 5 :
                    // Query.g:375:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression1593);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nIfExp; }

                    }
                    break;
                case 6 :
                    // Query.g:376:7: id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression1605); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression1607); if (state.failed) return n;

                    match(input,55,FOLLOW_55_in_primaryExpression1609); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }

                    // Query.g:378:9: ( AT 'pre' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==AT) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // Query.g:378:11: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression1632); if (state.failed) return n;

                            match(input,78,FOLLOW_78_in_primaryExpression1634); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setIsPre(); }

                            }
                            break;

                    }


                    // Query.g:379:9: ( LPAREN RPAREN )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==LPAREN) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // Query.g:379:11: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1652); if (state.failed) return n;

                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1654); if (state.failed) return n;

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // Query.g:380:7: id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )?
                    {
                    id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression1667); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression1669); if (state.failed) return n;

                    match(input,58,FOLLOW_58_in_primaryExpression1671); if (state.failed) return n;

                    // Query.g:380:31: ( LPAREN idExp= expression RPAREN )
                    // Query.g:380:33: LPAREN idExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1675); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression1679);
                    idExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1681); if (state.failed) return n;

                    }


                    if ( state.backtracking==0 ) { n = new ASTObjectByUseIdExpression(id2, idExp); }

                    // Query.g:382:7: ( AT 'pre' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==AT) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // Query.g:382:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression1701); if (state.failed) return n;

                            match(input,78,FOLLOW_78_in_primaryExpression1703); if (state.failed) return n;

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
    // Query.g:386:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;


        Token objectName=null;

        try {
            // Query.g:387:3: ( AT objectName= IDENT )
            // Query.g:388:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference1729); if (state.failed) return n;

            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference1737); if (state.failed) return n;

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
    // Query.g:402:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExpQuery =null;

        ASTExpression nExpIterate =null;

        QueryParser.operationExpression_return nExpOperation =null;

        ASTTypeArgExpression nExpType =null;

        ASTInStateExpression nExpInState =null;


        try {
            // Query.g:403:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] )
            int alt33=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA33_1 = input.LA(2);

                if ( (((( input.LA(2) == LPAREN )&&( input.LA(2) == LPAREN ))&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;

                }
                }
                break;
            case 67:
                {
                alt33=2;
                }
                break;
            case 71:
            case 74:
            case 75:
            case 81:
            case 82:
                {
                alt33=4;
                }
                break;
            case 73:
                {
                alt33=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // Query.g:407:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }

                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }

                    pushFollow(FOLLOW_queryExpression_in_propertyCall1802);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpQuery; }

                    }
                    break;
                case 2 :
                    // Query.g:410:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall1815);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpIterate; }

                    }
                    break;
                case 3 :
                    // Query.g:411:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall1828);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExpOperation!=null?nExpOperation.n:null); }

                    }
                    break;
                case 4 :
                    // Query.g:412:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall1841);
                    nExpType=typeExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpType; }

                    }
                    break;
                case 5 :
                    // Query.g:413:7: nExpInState= inStateExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_inStateExpression_in_propertyCall1854);
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
    // Query.g:422:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTElemVarsDeclaration decls =null;

        ASTExpression nExp =null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // Query.g:423:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // Query.g:424:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression1889); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression1896); if (state.failed) return n;

            // Query.g:426:5: (decls= elemVarsDeclaration BAR )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==IDENT) ) {
                int LA34_1 = input.LA(2);

                if ( ((LA34_1 >= BAR && LA34_1 <= COLON)||LA34_1==COMMA) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // Query.g:426:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression1907);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {decl = decls;}

                    match(input,BAR,FOLLOW_BAR_in_queryExpression1911); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_queryExpression1922);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression1928); if (state.failed) return n;

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
    // Query.g:440:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTElemVarsDeclaration decls =null;

        ASTVariableInitialization init =null;

        ASTExpression nExp =null;


        try {
            // Query.g:440:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // Query.g:441:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,67,FOLLOW_67_in_iterateExpression1960); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression1966); if (state.failed) return n;

            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression1974);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;

            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression1976); if (state.failed) return n;

            pushFollow(FOLLOW_variableInitialization_in_iterateExpression1984);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;

            match(input,BAR,FOLLOW_BAR_in_iterateExpression1986); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_iterateExpression1994);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression2000); if (state.failed) return n;

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
    // Query.g:462:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final QueryParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        QueryParser.operationExpression_return retval = new QueryParser.operationExpression_return();
        retval.start = input.LT(1);


        Token name=null;
        ASTExpression rolename =null;

        ASTExpression e =null;


        try {
            // Query.g:464:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // Query.g:465:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression2044); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }

            // Query.g:471:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==LBRACK) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // Query.g:471:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2066); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_operationExpression2079);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier(rolename); }

                    // Query.g:473:9: ( COMMA rolename= expression )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==COMMA) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // Query.g:473:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2092); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_operationExpression2096);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier(rolename); }

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2108); if (state.failed) return retval;

                    // Query.g:476:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==LBRACK) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // Query.g:476:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2125); if (state.failed) return retval;

                            pushFollow(FOLLOW_expression_in_operationExpression2140);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addQualifier(rolename); }

                            // Query.g:478:11: ( COMMA rolename= expression )*
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( (LA36_0==COMMA) ) {
                                    alt36=1;
                                }


                                switch (alt36) {
                            	case 1 :
                            	    // Query.g:478:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2155); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression2159);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addQualifier(rolename); }

                            	    }
                            	    break;

                            	default :
                            	    break loop36;
                                }
                            } while (true);


                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2173); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            // Query.g:483:5: ( AT 'pre' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==AT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // Query.g:483:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression2198); if (state.failed) return retval;

                    match(input,78,FOLLOW_78_in_operationExpression2200); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.setIsPre(); }

                    }
                    break;

            }


            // Query.g:485:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==LPAREN) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // Query.g:486:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression2225); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.hasParentheses(); }

                    // Query.g:487:7: (e= expression ( COMMA e= expression )* )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==AT||LA41_0==HASH||(LA41_0 >= IDENT && LA41_0 <= INT)||(LA41_0 >= LPAREN && LA41_0 <= MINUS)||LA41_0==PLUS||LA41_0==REAL||(LA41_0 >= STAR && LA41_0 <= STRING)||(LA41_0 >= 48 && LA41_0 <= 54)||LA41_0==62||LA41_0==64||(LA41_0 >= 67 && LA41_0 <= 76)||(LA41_0 >= 81 && LA41_0 <= 82)||LA41_0==84) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // Query.g:488:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression2246);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addArg(e); }

                            // Query.g:489:7: ( COMMA e= expression )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==COMMA) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // Query.g:489:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2258); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression2262);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addArg(e); }

                            	    }
                            	    break;

                            	default :
                            	    break loop40;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression2282); if (state.failed) return retval;

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
    // Query.g:496:1: inStateExpression[ASTExpression source, boolean followsArrow] returns [ASTInStateExpression n] : opToken= 'oclInState' LPAREN s= IDENT RPAREN ;
    public final ASTInStateExpression inStateExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTInStateExpression n = null;


        Token opToken=null;
        Token s=null;

        try {
            // Query.g:497:35: (opToken= 'oclInState' LPAREN s= IDENT RPAREN )
            // Query.g:498:4: opToken= 'oclInState' LPAREN s= IDENT RPAREN
            {
            opToken=(Token)match(input,73,FOLLOW_73_in_inStateExpression2319); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_inStateExpression2324); if (state.failed) return n;

            s=(Token)match(input,IDENT,FOLLOW_IDENT_in_inStateExpression2333); if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_inStateExpression2338); if (state.failed) return n;

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
    // Query.g:510:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;


        ASTType t =null;


         Token opToken = null; 
        try {
            // Query.g:513:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN )
            // Query.g:514:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) { opToken = input.LT(1); }

            if ( input.LA(1)==71||(input.LA(1) >= 74 && input.LA(1) <= 75)||(input.LA(1) >= 81 && input.LA(1) <= 82) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression2398); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_typeExpression2402);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression2404); if (state.failed) return n;

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
    // Query.g:525:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;


        Token var1=null;
        Token varN=null;
        ASTType t =null;

        ASTType tN =null;


        try {
            // Query.g:526:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // Query.g:527:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }

            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2442); if (state.failed) return n;

            // Query.g:528:17: ( COLON t= type )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==COLON) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // Query.g:528:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2445); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_elemVarsDeclaration2449);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}

            // Query.g:529:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==COMMA) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // Query.g:529:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration2459); if (state.failed) return n;

            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2465); if (state.failed) return n;

            	    // Query.g:529:24: ( COLON tN= type )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==COLON) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // Query.g:529:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2468); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration2474);
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
            	    break loop45;
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
    // Query.g:537:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;


        Token name=null;
        ASTType t =null;

        ASTExpression e =null;


        try {
            // Query.g:538:5: (name= IDENT COLON t= type EQUAL e= expression )
            // Query.g:539:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization2502); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableInitialization2504); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableInitialization2508);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization2510); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_variableInitialization2514);
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
    // Query.g:548:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTExpression cond =null;

        ASTExpression t =null;

        ASTExpression e =null;


        try {
            // Query.g:549:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // Query.g:550:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,64,FOLLOW_64_in_ifExpression2546); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression2550);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,83,FOLLOW_83_in_ifExpression2552); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression2556);
            t=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,60,FOLLOW_60_in_ifExpression2558); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression2562);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,61,FOLLOW_61_in_ifExpression2564); if (state.failed) return n;

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
    // Query.g:569:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR );
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
            // Query.g:570:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR )
            int alt46=12;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt46=1;
                }
                break;
            case 62:
                {
                alt46=2;
                }
                break;
            case INT:
                {
                alt46=3;
                }
                break;
            case REAL:
                {
                alt46=4;
                }
                break;
            case STRING:
                {
                alt46=5;
                }
                break;
            case HASH:
                {
                alt46=6;
                }
                break;
            case IDENT:
                {
                alt46=7;
                }
                break;
            case 48:
            case 50:
            case 51:
            case 52:
                {
                int LA46_8 = input.LA(2);

                if ( (LA46_8==LPAREN) ) {
                    alt46=9;
                }
                else if ( (LA46_8==LBRACE) ) {
                    alt46=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 8, input);

                    throw nvae;

                }
                }
                break;
            case 49:
            case 72:
                {
                alt46=9;
                }
                break;
            case 54:
            case 70:
            case 76:
                {
                alt46=10;
                }
                break;
            case 53:
                {
                alt46=11;
                }
                break;
            case STAR:
                {
                alt46=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }

            switch (alt46) {
                case 1 :
                    // Query.g:571:7: t= 'true'
                    {
                    t=(Token)match(input,84,FOLLOW_84_in_literal2603); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }

                    }
                    break;
                case 2 :
                    // Query.g:572:7: f= 'false'
                    {
                    f=(Token)match(input,62,FOLLOW_62_in_literal2617); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }

                    }
                    break;
                case 3 :
                    // Query.g:573:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal2630); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }

                    }
                    break;
                case 4 :
                    // Query.g:574:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal2645); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }

                    }
                    break;
                case 5 :
                    // Query.g:575:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal2659); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }

                    }
                    break;
                case 6 :
                    // Query.g:576:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal2669); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2673); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}

                    }
                    break;
                case 7 :
                    // Query.g:577:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2685); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal2687); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2691); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }

                    }
                    break;
                case 8 :
                    // Query.g:578:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal2703);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nColIt; }

                    }
                    break;
                case 9 :
                    // Query.g:579:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal2715);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nEColIt; }

                    }
                    break;
                case 10 :
                    // Query.g:580:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal2727);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nUndLit; }

                    }
                    break;
                case 11 :
                    // Query.g:581:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal2739);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nTupleLit; }

                    }
                    break;
                case 12 :
                    // Query.g:582:7: un= STAR
                    {
                    un=(Token)match(input,STAR,FOLLOW_STAR_in_literal2751); if (state.failed) return n;

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
    // Query.g:590:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;


        ASTCollectionItem ci =null;


         Token op = null; 
        try {
            // Query.g:592:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // Query.g:593:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( input.LA(1)==48||(input.LA(1) >= 50 && input.LA(1) <= 52) ) {
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

            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral2818); if (state.failed) return n;

            // Query.g:597:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==AT||LA48_0==HASH||(LA48_0 >= IDENT && LA48_0 <= INT)||(LA48_0 >= LPAREN && LA48_0 <= MINUS)||LA48_0==PLUS||LA48_0==REAL||(LA48_0 >= STAR && LA48_0 <= STRING)||(LA48_0 >= 48 && LA48_0 <= 54)||LA48_0==62||LA48_0==64||(LA48_0 >= 67 && LA48_0 <= 76)||(LA48_0 >= 81 && LA48_0 <= 82)||LA48_0==84) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // Query.g:598:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral2835);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addItem(ci); }

                    // Query.g:599:7: ( COMMA ci= collectionItem )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==COMMA) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // Query.g:599:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral2848); if (state.failed) return n;

                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral2852);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addItem(ci); }

                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral2871); if (state.failed) return n;

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
    // Query.g:608:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;


        ASTExpression e =null;


         n = new ASTCollectionItem(); 
        try {
            // Query.g:610:5: (e= expression ( DOTDOT e= expression )? )
            // Query.g:611:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem2900);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setFirst(e); }

            // Query.g:612:5: ( DOTDOT e= expression )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==DOTDOT) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // Query.g:612:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem2911); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_collectionItem2915);
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
    // Query.g:622:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;


        ASTCollectionType t =null;


        try {
            // Query.g:623:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==72) ) {
                alt50=1;
            }
            else if ( ((LA50_0 >= 48 && LA50_0 <= 52)) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;

            }
            switch (alt50) {
                case 1 :
                    // Query.g:624:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,72,FOLLOW_72_in_emptyCollectionLiteral2944); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral2946); if (state.failed) return n;

                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral2950);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral2952); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;
                case 2 :
                    // Query.g:627:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral2968);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral2970); if (state.failed) return n;

                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral2972); if (state.failed) return n;

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
    // Query.g:638:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;


        ASTType t =null;


        try {
            // Query.g:639:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt51=4;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt51=1;
                }
                break;
            case 54:
                {
                alt51=2;
                }
                break;
            case 70:
                {
                int LA51_3 = input.LA(2);

                if ( (LA51_3==LPAREN) ) {
                    alt51=3;
                }
                else if ( (LA51_3==EOF||LA51_3==ARROW||LA51_3==BAR||(LA51_3 >= COMMA && LA51_3 <= EQUAL)||(LA51_3 >= GREATER && LA51_3 <= GREATER_EQUAL)||(LA51_3 >= LESS && LA51_3 <= LESS_EQUAL)||LA51_3==MINUS||(LA51_3 >= NOT_EQUAL && LA51_3 <= PLUS)||(LA51_3 >= RBRACE && LA51_3 <= RBRACK)||LA51_3==RPAREN||LA51_3==SLASH||LA51_3==STAR||LA51_3==47||(LA51_3 >= 56 && LA51_3 <= 57)||(LA51_3 >= 59 && LA51_3 <= 61)||(LA51_3 >= 65 && LA51_3 <= 66)||LA51_3==77||LA51_3==83||(LA51_3 >= 89 && LA51_3 <= 90)) ) {
                    alt51=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }

            switch (alt51) {
                case 1 :
                    // Query.g:640:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,76,FOLLOW_76_in_undefinedLiteral3002); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3004); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral3008);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3010); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 2 :
                    // Query.g:643:5: 'Undefined'
                    {
                    match(input,54,FOLLOW_54_in_undefinedLiteral3024); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;
                case 3 :
                    // Query.g:646:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,70,FOLLOW_70_in_undefinedLiteral3038); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3040); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral3044);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3046); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 4 :
                    // Query.g:649:5: 'null'
                    {
                    match(input,70,FOLLOW_70_in_undefinedLiteral3060); if (state.failed) return n;

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
    // Query.g:659:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;


        ASTTupleItem ti =null;


         List tiList = new ArrayList(); 
        try {
            // Query.g:661:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // Query.g:662:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,53,FOLLOW_53_in_tupleLiteral3099); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral3105); if (state.failed) return n;

            pushFollow(FOLLOW_tupleItem_in_tupleLiteral3113);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tiList.add(ti); }

            // Query.g:665:5: ( COMMA ti= tupleItem )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==COMMA) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // Query.g:665:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral3124); if (state.failed) return n;

            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral3128);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tiList.add(ti); }

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral3139); if (state.failed) return n;

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
    // Query.g:673:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;


        Token name=null;
        ASTType t =null;

        ASTExpression e =null;


        try {
            // Query.g:674:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // Query.g:675:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem3170); if (state.failed) return n;

            // Query.g:676:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==COLON) ) {
                int LA53_1 = input.LA(2);

                if ( (synpred1_Query()) ) {
                    alt53=1;
                }
                else if ( (true) ) {
                    alt53=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA53_0==EQUAL) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }
            switch (alt53) {
                case 1 :
                    // Query.g:679:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem3209); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_tupleItem3213);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem3215); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_tupleItem3219);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, e); }

                    }
                    break;
                case 2 :
                    // Query.g:682:7: ( COLON | EQUAL ) e= expression
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


                    pushFollow(FOLLOW_expression_in_tupleItem3251);
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
    // Query.g:693:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;


        ASTSimpleType nTSimple =null;

        ASTCollectionType nTCollection =null;

        ASTTupleType nTTuple =null;


         Token tok = null; 
        try {
            // Query.g:695:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
            // Query.g:696:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }

            // Query.g:697:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            int alt54=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt54=1;
                }
                break;
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
                {
                alt54=2;
                }
                break;
            case 53:
                {
                alt54=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }

            switch (alt54) {
                case 1 :
                    // Query.g:698:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type3317);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 2 :
                    // Query.g:699:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type3329);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 3 :
                    // Query.g:700:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type3341);
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
    // Query.g:705:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;


        ASTType nT =null;


        try {
            // Query.g:706:5: (nT= type EOF )
            // Query.g:707:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly3373);
            nT=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_typeOnly3375); if (state.failed) return n;

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
    // Query.g:717:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;


        Token name=null;

        try {
            // Query.g:718:5: (name= IDENT )
            // Query.g:719:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType3403); if (state.failed) return n;

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
    // Query.g:727:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;


        ASTType elemType =null;


         Token op = null; 
        try {
            // Query.g:729:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // Query.g:730:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( (input.LA(1) >= 48 && input.LA(1) <= 52) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType3468); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_collectionType3472);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType3474); if (state.failed) return n;

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
    // Query.g:740:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;


        ASTTuplePart tp =null;


         List tpList = new ArrayList(); 
        try {
            // Query.g:742:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // Query.g:743:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,53,FOLLOW_53_in_tupleType3508); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType3510); if (state.failed) return n;

            pushFollow(FOLLOW_tuplePart_in_tupleType3519);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tpList.add(tp); }

            // Query.g:745:5: ( COMMA tp= tuplePart )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==COMMA) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // Query.g:745:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType3530); if (state.failed) return n;

            	    pushFollow(FOLLOW_tuplePart_in_tupleType3534);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tpList.add(tp); }

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType3546); if (state.failed) return n;

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
    // Query.g:754:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Query.g:755:5: (name= IDENT COLON t= type )
            // Query.g:756:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart3578); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_tuplePart3580); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_tuplePart3584);
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
        // Query.g:679:7: ( COLON type EQUAL )
        // Query.g:679:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred1_Query3200); if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred1_Query3202);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_Query3204); if (state.failed) return ;

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


 

    public static final BitSet FOLLOW_85_in_checkExpr31 = new BitSet(new long[]{0x0000000000200000L,0x0000000000010000L});
    public static final BitSet FOLLOW_queryExpr_in_checkExpr33 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_queryExpr46 = new BitSet(new long[]{0x00000800002000C0L,0x0000000000008000L});
    public static final BitSet FOLLOW_featureExpr_in_queryExpr48 = new BitSet(new long[]{0x0200800000001000L,0x0000000005C00000L});
    public static final BitSet FOLLOW_COMMA_in_queryExpr51 = new BitSet(new long[]{0x00000800002000C0L,0x0000000000008000L});
    public static final BitSet FOLLOW_featureExpr_in_queryExpr53 = new BitSet(new long[]{0x0200800000001000L,0x0000000005C00000L});
    public static final BitSet FOLLOW_condExpr_in_queryExpr58 = new BitSet(new long[]{0x0200800000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_57_in_queryExpr63 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_queryExpr65 = new BitSet(new long[]{0x0000800000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_queryExpr_nl_in_queryExpr69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpr85 = new BitSet(new long[]{0x0000800000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_queryExpr_nl_in_queryExpr87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_queryExpr_nl104 = new BitSet(new long[]{0x0000000000200000L,0x0000000000010000L});
    public static final BitSet FOLLOW_queryExpr_in_queryExpr_nl106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_queryExpr_nl114 = new BitSet(new long[]{0x0000000000200000L,0x0000000000010000L});
    public static final BitSet FOLLOW_queryExpr_in_queryExpr_nl116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_featureExpr170 = new BitSet(new long[]{0x0000080000200000L});
    public static final BitSet FOLLOW_set_in_featureExpr179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AttrExpr_in_featureExpr192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AssocExpr_in_featureExpr198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withExpr_in_condExpr302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withoutExpr_in_condExpr310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpr_in_condExpr318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_oclExpr326 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_oclExpr328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_withExpr341 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_InvExpr_in_withExpr343 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_withExpr346 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_InvExpr_in_withExpr348 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_88_in_withoutExpr361 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_InvExpr_in_withoutExpr363 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_withoutExpr366 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_InvExpr_in_withoutExpr368 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_expression447 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_expression458 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_COLON_in_expression462 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_expression466 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUAL_in_expression471 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_expression475 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000004L});
    public static final BitSet FOLLOW_COMMA_in_expression513 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_expression525 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_COLON_in_expression529 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_expression533 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUAL_in_expression538 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_expression542 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_expression583 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList632 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList649 = new BitSet(new long[]{0x0000008000001000L});
    public static final BitSet FOLLOW_COMMA_in_paramList661 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList665 = new BitSet(new long[]{0x0000008000001000L});
    public static final BitSet FOLLOW_RPAREN_in_paramList685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList714 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_idList724 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_idList728 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration759 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration761 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression801 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_conditionalImpliesExpression814 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FE9L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression818 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression863 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_conditionalOrExpression876 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FE9L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression880 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression924 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_conditionalXOrExpression937 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FE9L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression941 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression985 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_conditionalAndExpression998 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FE9L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1002 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1050 = new BitSet(new long[]{0x0000000200008002L});
    public static final BitSet FOLLOW_set_in_equalityExpression1069 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FE9L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1079 = new BitSet(new long[]{0x0000000200008002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1128 = new BitSet(new long[]{0x000000000C060002L});
    public static final BitSet FOLLOW_set_in_relationalExpression1146 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FE9L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1164 = new BitSet(new long[]{0x000000000C060002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1214 = new BitSet(new long[]{0x0000000420000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression1232 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FE9L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1242 = new BitSet(new long[]{0x0000000420000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1292 = new BitSet(new long[]{0x08000A0000000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1310 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FE9L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1324 = new BitSet(new long[]{0x08000A0000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpression1386 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FE9L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression1463 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression1481 = new BitSet(new long[]{0x0000000000200000L,0x0000000000060E88L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression1487 = new BitSet(new long[]{0x0000000000200000L,0x0000000000060E88L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression1498 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_literal_in_primaryExpression1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression1575 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_primaryExpression1579 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression1605 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression1607 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_primaryExpression1609 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression1632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_primaryExpression1634 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression1652 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression1667 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression1669 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_primaryExpression1671 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression1675 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_primaryExpression1679 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression1681 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression1701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_primaryExpression1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference1729 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_objectReference1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inStateExpression_in_propertyCall1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression1889 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression1896 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression1907 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_BAR_in_queryExpression1911 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_queryExpression1922 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_iterateExpression1960 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression1966 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression1974 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression1976 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression1984 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression1986 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_iterateExpression1994 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression2044 = new BitSet(new long[]{0x0000000012000022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2066 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_operationExpression2079 = new BitSet(new long[]{0x0000002000001000L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2092 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_operationExpression2096 = new BitSet(new long[]{0x0000002000001000L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2108 = new BitSet(new long[]{0x0000000012000022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2125 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_operationExpression2140 = new BitSet(new long[]{0x0000002000001000L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2155 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_operationExpression2159 = new BitSet(new long[]{0x0000002000001000L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2173 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_AT_in_operationExpression2198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_operationExpression2200 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression2225 = new BitSet(new long[]{0x407F18C430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_operationExpression2246 = new BitSet(new long[]{0x0000008000001000L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2258 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_operationExpression2262 = new BitSet(new long[]{0x0000008000001000L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_inStateExpression2319 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_inStateExpression2324 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_inStateExpression2333 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_inStateExpression2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression2374 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression2398 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_typeExpression2402 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2442 = new BitSet(new long[]{0x0000000000001202L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2445 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration2449 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration2459 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2465 = new BitSet(new long[]{0x0000000000001202L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2468 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration2474 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization2502 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization2504 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_variableInitialization2508 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization2510 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_variableInitialization2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ifExpression2546 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_ifExpression2550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ifExpression2552 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_ifExpression2556 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ifExpression2558 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_ifExpression2562 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ifExpression2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_literal2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_literal2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal2669 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_literal2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal2685 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal2687 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_literal2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_literal2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral2789 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral2818 = new BitSet(new long[]{0x407F185430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral2835 = new BitSet(new long[]{0x0000001000001000L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral2848 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral2852 = new BitSet(new long[]{0x0000001000001000L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem2900 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem2911 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_collectionItem2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_emptyCollectionLiteral2944 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral2946 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral2950 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral2968 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral2970 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_undefinedLiteral3002 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3004 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3008 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_undefinedLiteral3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_undefinedLiteral3038 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3040 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3044 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_undefinedLiteral3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_tupleLiteral3099 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral3105 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3113 = new BitSet(new long[]{0x0000001000001000L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral3124 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3128 = new BitSet(new long[]{0x0000001000001000L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem3170 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_COLON_in_tupleItem3209 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_tupleItem3213 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem3215 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_tupleItem3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem3241 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_tupleItem3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly3373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType3441 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType3468 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_collectionType3472 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_tupleType3508 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType3510 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType3519 = new BitSet(new long[]{0x0000008000001000L});
    public static final BitSet FOLLOW_COMMA_in_tupleType3530 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType3534 = new BitSet(new long[]{0x0000008000001000L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart3578 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_tuplePart3580 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_tuplePart3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_synpred1_Query3200 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_synpred1_Query3202 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred1_Query3204 = new BitSet(new long[]{0x0000000000000002L});

}