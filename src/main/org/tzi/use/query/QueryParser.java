// $ANTLR 3.4 Query.g 2019-02-08 17:11:03

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
public class QueryParser extends BaseParser {
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
    public BaseParser[] getDelegates() {
        return new BaseParser[] {};
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
    // Query.g:40:1: checkExpr : 'verify' queryExpr ;
    public final void checkExpr() throws RecognitionException {
        try {
            // Query.g:40:10: ( 'verify' queryExpr )
            // Query.g:40:12: 'verify' queryExpr
            {
            match(input,85,FOLLOW_85_in_checkExpr43); if (state.failed) return ;

            pushFollow(FOLLOW_queryExpr_in_checkExpr45);
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
    // Query.g:43:1: queryExpr : ( 'select' featureExpr ( COMMA featureExpr )* ( withExpr )? ( withoutExpr )? ( oclExpr )? ( 'as' IDENT )? queryExpr_nl |alias= IDENT queryExpr_nl );
    public final void queryExpr() throws RecognitionException {
        Token alias=null;

        try {
            // Query.g:43:10: ( 'select' featureExpr ( COMMA featureExpr )* ( withExpr )? ( withoutExpr )? ( oclExpr )? ( 'as' IDENT )? queryExpr_nl |alias= IDENT queryExpr_nl )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==80) ) {
                alt6=1;
            }
            else if ( (LA6_0==IDENT) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // Query.g:44:5: 'select' featureExpr ( COMMA featureExpr )* ( withExpr )? ( withoutExpr )? ( oclExpr )? ( 'as' IDENT )? queryExpr_nl
                    {
                    match(input,80,FOLLOW_80_in_queryExpr58); if (state.failed) return ;

                    pushFollow(FOLLOW_featureExpr_in_queryExpr60);
                    featureExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    // Query.g:44:26: ( COMMA featureExpr )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==COMMA) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // Query.g:44:27: COMMA featureExpr
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_queryExpr63); if (state.failed) return ;

                    	    pushFollow(FOLLOW_featureExpr_in_queryExpr65);
                    	    featureExpr();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    // Query.g:44:47: ( withExpr )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==86) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // Query.g:44:48: withExpr
                            {
                            pushFollow(FOLLOW_withExpr_in_queryExpr70);
                            withExpr();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    // Query.g:44:59: ( withoutExpr )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==88) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // Query.g:44:60: withoutExpr
                            {
                            pushFollow(FOLLOW_withoutExpr_in_queryExpr75);
                            withoutExpr();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    // Query.g:44:74: ( oclExpr )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==87) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // Query.g:44:75: oclExpr
                            {
                            pushFollow(FOLLOW_oclExpr_in_queryExpr80);
                            oclExpr();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    // Query.g:44:85: ( 'as' IDENT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==57) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // Query.g:44:86: 'as' IDENT
                            {
                            match(input,57,FOLLOW_57_in_queryExpr85); if (state.failed) return ;

                            match(input,IDENT,FOLLOW_IDENT_in_queryExpr87); if (state.failed) return ;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_queryExpr_nl_in_queryExpr91);
                    queryExpr_nl();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {System.out.println("this is a query.");}

                    }
                    break;
                case 2 :
                    // Query.g:46:6: alias= IDENT queryExpr_nl
                    {
                    alias=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpr107); if (state.failed) return ;

                    pushFollow(FOLLOW_queryExpr_nl_in_queryExpr109);
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
    // Query.g:50:1: queryExpr_nl : ( '&&' queryExpr | '||' queryExpr |);
    public final void queryExpr_nl() throws RecognitionException {
        try {
            // Query.g:50:13: ( '&&' queryExpr | '||' queryExpr |)
            int alt7=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt7=1;
                }
                break;
            case 90:
                {
                alt7=2;
                }
                break;
            case EOF:
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
                    // Query.g:51:5: '&&' queryExpr
                    {
                    match(input,47,FOLLOW_47_in_queryExpr_nl126); if (state.failed) return ;

                    pushFollow(FOLLOW_queryExpr_in_queryExpr_nl128);
                    queryExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Query.g:52:7: '||' queryExpr
                    {
                    match(input,90,FOLLOW_90_in_queryExpr_nl136); if (state.failed) return ;

                    pushFollow(FOLLOW_queryExpr_in_queryExpr_nl138);
                    queryExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Query.g:54:5: 
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
    // Query.g:56:1: modifiers : ( 'pure' | 'full' );
    public final void modifiers() throws RecognitionException {
        try {
            // Query.g:56:10: ( 'pure' | 'full' )
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
    // Query.g:62:2: featureExpr : ( ( 'pure' )? dest= ( IDENT | STAR ) | AttrExpr | AssocExpr );
    public final void featureExpr() throws RecognitionException {
        Token dest=null;


                boolean isPure=false;
            
        try {
            // Query.g:65:7: ( ( 'pure' )? dest= ( IDENT | STAR ) | AttrExpr | AssocExpr )
            int alt9=3;
            switch ( input.LA(1) ) {
            case IDENT:
            case STAR:
            case 79:
                {
                alt9=1;
                }
                break;
            case AttrExpr:
                {
                alt9=2;
                }
                break;
            case AssocExpr:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // Query.g:66:5: ( 'pure' )? dest= ( IDENT | STAR )
                    {
                    // Query.g:66:5: ( 'pure' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==79) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // Query.g:66:6: 'pure'
                            {
                            match(input,79,FOLLOW_79_in_featureExpr192); if (state.failed) return ;

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
                    // Query.g:68:5: AttrExpr
                    {
                    match(input,AttrExpr,FOLLOW_AttrExpr_in_featureExpr214); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Query.g:69:5: AssocExpr
                    {
                    match(input,AssocExpr,FOLLOW_AssocExpr_in_featureExpr220); if (state.failed) return ;

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



    // $ANTLR start "oclExpr"
    // Query.g:82:1: oclExpr : 'withocl' expression ;
    public final void oclExpr() throws RecognitionException {
        try {
            // Query.g:82:8: ( 'withocl' expression )
            // Query.g:82:10: 'withocl' expression
            {
            match(input,87,FOLLOW_87_in_oclExpr317); if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_oclExpr319);
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
    // Query.g:85:1: withExpr : 'with' InvExpr ( COMMA InvExpr )* ;
    public final void withExpr() throws RecognitionException {
        try {
            // Query.g:85:9: ( 'with' InvExpr ( COMMA InvExpr )* )
            // Query.g:86:5: 'with' InvExpr ( COMMA InvExpr )*
            {
            match(input,86,FOLLOW_86_in_withExpr332); if (state.failed) return ;

            match(input,InvExpr,FOLLOW_InvExpr_in_withExpr334); if (state.failed) return ;

            // Query.g:86:20: ( COMMA InvExpr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Query.g:86:21: COMMA InvExpr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_withExpr337); if (state.failed) return ;

            	    match(input,InvExpr,FOLLOW_InvExpr_in_withExpr339); if (state.failed) return ;

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
    // $ANTLR end "withExpr"



    // $ANTLR start "withoutExpr"
    // Query.g:88:1: withoutExpr : 'without' InvExpr ( COMMA InvExpr )* ;
    public final void withoutExpr() throws RecognitionException {
        try {
            // Query.g:88:12: ( 'without' InvExpr ( COMMA InvExpr )* )
            // Query.g:89:5: 'without' InvExpr ( COMMA InvExpr )*
            {
            match(input,88,FOLLOW_88_in_withoutExpr352); if (state.failed) return ;

            match(input,InvExpr,FOLLOW_InvExpr_in_withoutExpr354); if (state.failed) return ;

            // Query.g:89:23: ( COMMA InvExpr )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Query.g:89:24: COMMA InvExpr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_withoutExpr357); if (state.failed) return ;

            	    match(input,InvExpr,FOLLOW_InvExpr_in_withoutExpr359); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "withoutExpr"



    // $ANTLR start "expressionOnly"
    // Query.g:118:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExp =null;


        try {
            // Query.g:119:5: (nExp= expression EOF )
            // Query.g:120:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly388);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_expressionOnly390); if (state.failed) return n;

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
    // Query.g:127:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
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
            // Query.g:133:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
            // Query.g:134:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }

            // Query.g:135:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==68) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Query.g:136:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
            	    {
            	    match(input,68,FOLLOW_68_in_expression438); if (state.failed) return n;

            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression449); if (state.failed) return n;

            	    // Query.g:137:18: ( COLON t= type )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==COLON) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // Query.g:137:20: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression453); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_expression457);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression462); if (state.failed) return n;

            	    pushFollow(FOLLOW_expression_in_expression466);
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

            	    // Query.g:147:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==COMMA) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // Query.g:148:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_expression504); if (state.failed) return n;

            	    	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression516); if (state.failed) return n;

            	    	    // Query.g:149:20: ( COLON t= type )?
            	    	    int alt13=2;
            	    	    int LA13_0 = input.LA(1);

            	    	    if ( (LA13_0==COLON) ) {
            	    	        alt13=1;
            	    	    }
            	    	    switch (alt13) {
            	    	        case 1 :
            	    	            // Query.g:149:22: COLON t= type
            	    	            {
            	    	            match(input,COLON,FOLLOW_COLON_in_expression520); if (state.failed) return n;

            	    	            pushFollow(FOLLOW_type_in_expression524);
            	    	            t=type();

            	    	            state._fsp--;
            	    	            if (state.failed) return n;

            	    	            }
            	    	            break;

            	    	    }


            	    	    match(input,EQUAL,FOLLOW_EQUAL_in_expression529); if (state.failed) return n;

            	    	    pushFollow(FOLLOW_expression_in_expression533);
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
            	    	    break loop14;
            	        }
            	    } while (true);


            	    match(input,66,FOLLOW_66_in_expression574); if (state.failed) return n;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression590);
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
    // Query.g:182:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;


        ASTVariableDeclaration v =null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // Query.g:184:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // Query.g:185:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList623); if (state.failed) return paramList;

            // Query.g:186:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IDENT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // Query.g:187:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList640);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;

                    if ( state.backtracking==0 ) { paramList.add(v); }

                    // Query.g:188:7: ( COMMA v= variableDeclaration )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // Query.g:188:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList652); if (state.failed) return paramList;

                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList656);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;

                    	    if ( state.backtracking==0 ) { paramList.add(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_paramList676); if (state.failed) return paramList;

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
    // Query.g:196:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;


        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // Query.g:198:5: (id0= IDENT ( COMMA idn= IDENT )* )
            // Query.g:199:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList705); if (state.failed) return idList;

            if ( state.backtracking==0 ) { idList.add(id0); }

            // Query.g:200:5: ( COMMA idn= IDENT )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Query.g:200:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList715); if (state.failed) return idList;

            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList719); if (state.failed) return idList;

            	    if ( state.backtracking==0 ) { idList.add(idn); }

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
        return idList;
    }
    // $ANTLR end "idList"



    // $ANTLR start "variableDeclaration"
    // Query.g:208:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Query.g:209:5: (name= IDENT COLON t= type )
            // Query.g:210:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration750); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableDeclaration752); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableDeclaration756);
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
    // Query.g:218:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndOrExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:219:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // Query.g:220:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression792);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndOrExp;}

            // Query.g:221:5: (op= 'implies' n1= conditionalOrExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==65) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // Query.g:221:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,65,FOLLOW_65_in_conditionalImpliesExpression805); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression809);
            	    n1=conditionalOrExpression();

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
    // $ANTLR end "conditionalImpliesExpression"



    // $ANTLR start "conditionalOrExpression"
    // Query.g:230:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndXorExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:231:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // Query.g:232:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression854);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndXorExp;}

            // Query.g:233:5: (op= 'or' n1= conditionalXOrExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==77) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Query.g:233:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,77,FOLLOW_77_in_conditionalOrExpression867); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression871);
            	    n1=conditionalXOrExpression();

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
    // $ANTLR end "conditionalOrExpression"



    // $ANTLR start "conditionalXOrExpression"
    // Query.g:242:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndAndExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:243:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // Query.g:244:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression915);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndAndExp;}

            // Query.g:245:5: (op= 'xor' n1= conditionalAndExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==89) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Query.g:245:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,89,FOLLOW_89_in_conditionalXOrExpression928); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression932);
            	    n1=conditionalAndExpression();

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
    // $ANTLR end "conditionalXOrExpression"



    // $ANTLR start "conditionalAndExpression"
    // Query.g:254:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nEqExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:255:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // Query.g:256:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression976);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nEqExp;}

            // Query.g:257:5: (op= 'and' n1= equalityExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==56) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Query.g:257:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,56,FOLLOW_56_in_conditionalAndExpression989); if (state.failed) return n;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression993);
            	    n1=equalityExpression();

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
    // $ANTLR end "conditionalAndExpression"



    // $ANTLR start "equalityExpression"
    // Query.g:266:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nRelExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:268:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // Query.g:269:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1041);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nRelExp;}

            // Query.g:270:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==EQUAL||LA23_0==NOT_EQUAL) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Query.g:270:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1070);
            	    n1=relationalExpression();

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
    // $ANTLR end "equalityExpression"



    // $ANTLR start "relationalExpression"
    // Query.g:280:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nAddiExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:282:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // Query.g:283:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1119);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nAddiExp;}

            // Query.g:284:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0 >= GREATER && LA24_0 <= GREATER_EQUAL)||(LA24_0 >= LESS && LA24_0 <= LESS_EQUAL)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Query.g:284:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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


            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1155);
            	    n1=additiveExpression();

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
    // $ANTLR end "relationalExpression"



    // $ANTLR start "additiveExpression"
    // Query.g:294:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nMulExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:296:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // Query.g:297:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1205);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nMulExp;}

            // Query.g:298:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==MINUS||LA25_0==PLUS) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Query.g:298:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1233);
            	    n1=multiplicativeExpression();

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
    // $ANTLR end "additiveExpression"



    // $ANTLR start "multiplicativeExpression"
    // Query.g:309:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:311:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // Query.g:312:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1283);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nUnExp;}

            // Query.g:313:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==SLASH||LA26_0==STAR||LA26_0==59) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // Query.g:313:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
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


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1315);
            	    n1=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // Query.g:325:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression nPosExp =null;


         Token op = null; 
        try {
            // Query.g:327:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==MINUS||LA27_0==PLUS||LA27_0==69) ) {
                alt27=1;
            }
            else if ( (LA27_0==AT||LA27_0==HASH||(LA27_0 >= IDENT && LA27_0 <= INT)||LA27_0==LPAREN||LA27_0==REAL||(LA27_0 >= STAR && LA27_0 <= STRING)||(LA27_0 >= 48 && LA27_0 <= 54)||LA27_0==62||LA27_0==64||LA27_0==67||(LA27_0 >= 70 && LA27_0 <= 76)||(LA27_0 >= 81 && LA27_0 <= 82)||LA27_0==84) ) {
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
                    // Query.g:328:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // Query.g:328:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // Query.g:328:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
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


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1401);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }

                    }


                    }
                    break;
                case 2 :
                    // Query.g:332:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression1421);
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
    // Query.g:340:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nPrimExp =null;

        ASTExpression nPc =null;


         boolean arrow = false; 
        try {
            // Query.g:342:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // Query.g:343:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression1454);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nPrimExp; }

            // Query.g:344:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==ARROW||LA29_0==DOT) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // Query.g:345:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // Query.g:345:6: ( ARROW | DOT )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==ARROW) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==DOT) ) {
            	        alt28=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // Query.g:345:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression1472); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = true; }

            	            }
            	            break;
            	        case 2 :
            	            // Query.g:345:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression1478); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = false; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression1489);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = nPc; }

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // Query.g:361:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? );
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
            // Query.g:362:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? )
            int alt33=7;
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
                alt33=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt33=1;
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
                    alt33=3;
                    }
                    break;
                case DOT:
                    {
                    switch ( input.LA(3) ) {
                    case 55:
                        {
                        alt33=6;
                        }
                        break;
                    case 58:
                        {
                        alt33=7;
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
                        alt33=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 7, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;

                }

                }
                break;
            case AT:
                {
                alt33=2;
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
                alt33=3;
                }
                break;
            case LPAREN:
                {
                alt33=4;
                }
                break;
            case 64:
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
                    // Query.g:363:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression1529);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nLit; }

                    }
                    break;
                case 2 :
                    // Query.g:364:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression1543);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nOr; }

                    }
                    break;
                case 3 :
                    // Query.g:365:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression1555);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPc; }

                    }
                    break;
                case 4 :
                    // Query.g:366:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1566); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression1570);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1572); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExp; }

                    }
                    break;
                case 5 :
                    // Query.g:367:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression1584);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nIfExp; }

                    }
                    break;
                case 6 :
                    // Query.g:368:7: id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression1596); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression1598); if (state.failed) return n;

                    match(input,55,FOLLOW_55_in_primaryExpression1600); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }

                    // Query.g:370:9: ( AT 'pre' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==AT) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // Query.g:370:11: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression1623); if (state.failed) return n;

                            match(input,78,FOLLOW_78_in_primaryExpression1625); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setIsPre(); }

                            }
                            break;

                    }


                    // Query.g:371:9: ( LPAREN RPAREN )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==LPAREN) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // Query.g:371:11: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1643); if (state.failed) return n;

                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1645); if (state.failed) return n;

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // Query.g:372:7: id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )?
                    {
                    id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression1658); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression1660); if (state.failed) return n;

                    match(input,58,FOLLOW_58_in_primaryExpression1662); if (state.failed) return n;

                    // Query.g:372:31: ( LPAREN idExp= expression RPAREN )
                    // Query.g:372:33: LPAREN idExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1666); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression1670);
                    idExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1672); if (state.failed) return n;

                    }


                    if ( state.backtracking==0 ) { n = new ASTObjectByUseIdExpression(id2, idExp); }

                    // Query.g:374:7: ( AT 'pre' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==AT) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // Query.g:374:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression1692); if (state.failed) return n;

                            match(input,78,FOLLOW_78_in_primaryExpression1694); if (state.failed) return n;

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
    // Query.g:378:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;


        Token objectName=null;

        try {
            // Query.g:379:3: ( AT objectName= IDENT )
            // Query.g:380:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference1720); if (state.failed) return n;

            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference1728); if (state.failed) return n;

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
    // Query.g:394:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExpQuery =null;

        ASTExpression nExpIterate =null;

        QueryParser.operationExpression_return nExpOperation =null;

        ASTTypeArgExpression nExpType =null;

        ASTInStateExpression nExpInState =null;


        try {
            // Query.g:395:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] )
            int alt34=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA34_1 = input.LA(2);

                if ( (((( input.LA(2) == LPAREN )&&( input.LA(2) == LPAREN ))&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;

                }
                }
                break;
            case 67:
                {
                alt34=2;
                }
                break;
            case 71:
            case 74:
            case 75:
            case 81:
            case 82:
                {
                alt34=4;
                }
                break;
            case 73:
                {
                alt34=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }

            switch (alt34) {
                case 1 :
                    // Query.g:399:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }

                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }

                    pushFollow(FOLLOW_queryExpression_in_propertyCall1793);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpQuery; }

                    }
                    break;
                case 2 :
                    // Query.g:402:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall1806);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpIterate; }

                    }
                    break;
                case 3 :
                    // Query.g:403:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall1819);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExpOperation!=null?nExpOperation.n:null); }

                    }
                    break;
                case 4 :
                    // Query.g:404:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall1832);
                    nExpType=typeExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpType; }

                    }
                    break;
                case 5 :
                    // Query.g:405:7: nExpInState= inStateExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_inStateExpression_in_propertyCall1845);
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
    // Query.g:414:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTElemVarsDeclaration decls =null;

        ASTExpression nExp =null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // Query.g:415:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // Query.g:416:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression1880); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression1887); if (state.failed) return n;

            // Query.g:418:5: (decls= elemVarsDeclaration BAR )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==IDENT) ) {
                int LA35_1 = input.LA(2);

                if ( ((LA35_1 >= BAR && LA35_1 <= COLON)||LA35_1==COMMA) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // Query.g:418:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression1898);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {decl = decls;}

                    match(input,BAR,FOLLOW_BAR_in_queryExpression1902); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_queryExpression1913);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression1919); if (state.failed) return n;

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
    // Query.g:432:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTElemVarsDeclaration decls =null;

        ASTVariableInitialization init =null;

        ASTExpression nExp =null;


        try {
            // Query.g:432:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // Query.g:433:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,67,FOLLOW_67_in_iterateExpression1951); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression1957); if (state.failed) return n;

            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression1965);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;

            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression1967); if (state.failed) return n;

            pushFollow(FOLLOW_variableInitialization_in_iterateExpression1975);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;

            match(input,BAR,FOLLOW_BAR_in_iterateExpression1977); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_iterateExpression1985);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression1991); if (state.failed) return n;

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
    // Query.g:454:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final QueryParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        QueryParser.operationExpression_return retval = new QueryParser.operationExpression_return();
        retval.start = input.LT(1);


        Token name=null;
        ASTExpression rolename =null;

        ASTExpression e =null;


        try {
            // Query.g:456:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // Query.g:457:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression2035); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }

            // Query.g:463:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==LBRACK) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // Query.g:463:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2057); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_operationExpression2070);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier(rolename); }

                    // Query.g:465:9: ( COMMA rolename= expression )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==COMMA) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // Query.g:465:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2083); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_operationExpression2087);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier(rolename); }

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2099); if (state.failed) return retval;

                    // Query.g:468:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==LBRACK) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // Query.g:468:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2116); if (state.failed) return retval;

                            pushFollow(FOLLOW_expression_in_operationExpression2131);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addQualifier(rolename); }

                            // Query.g:470:11: ( COMMA rolename= expression )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==COMMA) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // Query.g:470:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2146); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression2150);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addQualifier(rolename); }

                            	    }
                            	    break;

                            	default :
                            	    break loop37;
                                }
                            } while (true);


                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2164); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            // Query.g:475:5: ( AT 'pre' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==AT) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // Query.g:475:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression2189); if (state.failed) return retval;

                    match(input,78,FOLLOW_78_in_operationExpression2191); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.setIsPre(); }

                    }
                    break;

            }


            // Query.g:477:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==LPAREN) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // Query.g:478:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression2216); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.hasParentheses(); }

                    // Query.g:479:7: (e= expression ( COMMA e= expression )* )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==AT||LA42_0==HASH||(LA42_0 >= IDENT && LA42_0 <= INT)||(LA42_0 >= LPAREN && LA42_0 <= MINUS)||LA42_0==PLUS||LA42_0==REAL||(LA42_0 >= STAR && LA42_0 <= STRING)||(LA42_0 >= 48 && LA42_0 <= 54)||LA42_0==62||LA42_0==64||(LA42_0 >= 67 && LA42_0 <= 76)||(LA42_0 >= 81 && LA42_0 <= 82)||LA42_0==84) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // Query.g:480:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression2237);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addArg(e); }

                            // Query.g:481:7: ( COMMA e= expression )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==COMMA) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // Query.g:481:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2249); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression2253);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addArg(e); }

                            	    }
                            	    break;

                            	default :
                            	    break loop41;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression2273); if (state.failed) return retval;

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
    // Query.g:488:1: inStateExpression[ASTExpression source, boolean followsArrow] returns [ASTInStateExpression n] : opToken= 'oclInState' LPAREN s= IDENT RPAREN ;
    public final ASTInStateExpression inStateExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTInStateExpression n = null;


        Token opToken=null;
        Token s=null;

        try {
            // Query.g:489:35: (opToken= 'oclInState' LPAREN s= IDENT RPAREN )
            // Query.g:490:4: opToken= 'oclInState' LPAREN s= IDENT RPAREN
            {
            opToken=(Token)match(input,73,FOLLOW_73_in_inStateExpression2310); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_inStateExpression2315); if (state.failed) return n;

            s=(Token)match(input,IDENT,FOLLOW_IDENT_in_inStateExpression2324); if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_inStateExpression2329); if (state.failed) return n;

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
    // Query.g:502:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;


        ASTType t =null;


         Token opToken = null; 
        try {
            // Query.g:505:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN )
            // Query.g:506:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN
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


            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression2389); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_typeExpression2393);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression2395); if (state.failed) return n;

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
    // Query.g:517:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;


        Token var1=null;
        Token varN=null;
        ASTType t =null;

        ASTType tN =null;


        try {
            // Query.g:518:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // Query.g:519:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }

            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2433); if (state.failed) return n;

            // Query.g:520:17: ( COLON t= type )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==COLON) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // Query.g:520:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2436); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_elemVarsDeclaration2440);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}

            // Query.g:521:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==COMMA) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // Query.g:521:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration2450); if (state.failed) return n;

            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2456); if (state.failed) return n;

            	    // Query.g:521:24: ( COLON tN= type )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==COLON) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // Query.g:521:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2459); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration2465);
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
            	    break loop46;
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
    // Query.g:529:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;


        Token name=null;
        ASTType t =null;

        ASTExpression e =null;


        try {
            // Query.g:530:5: (name= IDENT COLON t= type EQUAL e= expression )
            // Query.g:531:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization2493); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableInitialization2495); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableInitialization2499);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization2501); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_variableInitialization2505);
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
    // Query.g:540:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTExpression cond =null;

        ASTExpression t =null;

        ASTExpression e =null;


        try {
            // Query.g:541:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // Query.g:542:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,64,FOLLOW_64_in_ifExpression2537); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression2541);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,83,FOLLOW_83_in_ifExpression2543); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression2547);
            t=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,60,FOLLOW_60_in_ifExpression2549); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression2553);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,61,FOLLOW_61_in_ifExpression2555); if (state.failed) return n;

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
    // Query.g:561:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR );
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
            // Query.g:562:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR )
            int alt47=12;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt47=1;
                }
                break;
            case 62:
                {
                alt47=2;
                }
                break;
            case INT:
                {
                alt47=3;
                }
                break;
            case REAL:
                {
                alt47=4;
                }
                break;
            case STRING:
                {
                alt47=5;
                }
                break;
            case HASH:
                {
                alt47=6;
                }
                break;
            case IDENT:
                {
                alt47=7;
                }
                break;
            case 48:
            case 50:
            case 51:
            case 52:
                {
                int LA47_8 = input.LA(2);

                if ( (LA47_8==LPAREN) ) {
                    alt47=9;
                }
                else if ( (LA47_8==LBRACE) ) {
                    alt47=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 8, input);

                    throw nvae;

                }
                }
                break;
            case 49:
            case 72:
                {
                alt47=9;
                }
                break;
            case 54:
            case 70:
            case 76:
                {
                alt47=10;
                }
                break;
            case 53:
                {
                alt47=11;
                }
                break;
            case STAR:
                {
                alt47=12;
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
                    // Query.g:563:7: t= 'true'
                    {
                    t=(Token)match(input,84,FOLLOW_84_in_literal2594); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }

                    }
                    break;
                case 2 :
                    // Query.g:564:7: f= 'false'
                    {
                    f=(Token)match(input,62,FOLLOW_62_in_literal2608); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }

                    }
                    break;
                case 3 :
                    // Query.g:565:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal2621); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }

                    }
                    break;
                case 4 :
                    // Query.g:566:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal2636); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }

                    }
                    break;
                case 5 :
                    // Query.g:567:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal2650); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }

                    }
                    break;
                case 6 :
                    // Query.g:568:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal2660); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2664); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}

                    }
                    break;
                case 7 :
                    // Query.g:569:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2676); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal2678); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2682); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }

                    }
                    break;
                case 8 :
                    // Query.g:570:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal2694);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nColIt; }

                    }
                    break;
                case 9 :
                    // Query.g:571:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal2706);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nEColIt; }

                    }
                    break;
                case 10 :
                    // Query.g:572:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal2718);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nUndLit; }

                    }
                    break;
                case 11 :
                    // Query.g:573:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal2730);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nTupleLit; }

                    }
                    break;
                case 12 :
                    // Query.g:574:7: un= STAR
                    {
                    un=(Token)match(input,STAR,FOLLOW_STAR_in_literal2742); if (state.failed) return n;

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
    // Query.g:582:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;


        ASTCollectionItem ci =null;


         Token op = null; 
        try {
            // Query.g:584:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // Query.g:585:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
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

            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral2809); if (state.failed) return n;

            // Query.g:589:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==AT||LA49_0==HASH||(LA49_0 >= IDENT && LA49_0 <= INT)||(LA49_0 >= LPAREN && LA49_0 <= MINUS)||LA49_0==PLUS||LA49_0==REAL||(LA49_0 >= STAR && LA49_0 <= STRING)||(LA49_0 >= 48 && LA49_0 <= 54)||LA49_0==62||LA49_0==64||(LA49_0 >= 67 && LA49_0 <= 76)||(LA49_0 >= 81 && LA49_0 <= 82)||LA49_0==84) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // Query.g:590:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral2826);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addItem(ci); }

                    // Query.g:591:7: ( COMMA ci= collectionItem )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==COMMA) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // Query.g:591:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral2839); if (state.failed) return n;

                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral2843);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addItem(ci); }

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral2862); if (state.failed) return n;

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
    // Query.g:600:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;


        ASTExpression e =null;


         n = new ASTCollectionItem(); 
        try {
            // Query.g:602:5: (e= expression ( DOTDOT e= expression )? )
            // Query.g:603:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem2891);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setFirst(e); }

            // Query.g:604:5: ( DOTDOT e= expression )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==DOTDOT) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // Query.g:604:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem2902); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_collectionItem2906);
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
    // Query.g:614:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;


        ASTCollectionType t =null;


        try {
            // Query.g:615:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==72) ) {
                alt51=1;
            }
            else if ( ((LA51_0 >= 48 && LA51_0 <= 52)) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }
            switch (alt51) {
                case 1 :
                    // Query.g:616:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,72,FOLLOW_72_in_emptyCollectionLiteral2935); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral2937); if (state.failed) return n;

                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral2941);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral2943); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;
                case 2 :
                    // Query.g:619:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral2959);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral2961); if (state.failed) return n;

                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral2963); if (state.failed) return n;

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
    // Query.g:630:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;


        ASTType t =null;


        try {
            // Query.g:631:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt52=4;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt52=1;
                }
                break;
            case 54:
                {
                alt52=2;
                }
                break;
            case 70:
                {
                int LA52_3 = input.LA(2);

                if ( (LA52_3==LPAREN) ) {
                    alt52=3;
                }
                else if ( (LA52_3==EOF||LA52_3==ARROW||LA52_3==BAR||(LA52_3 >= COMMA && LA52_3 <= EQUAL)||(LA52_3 >= GREATER && LA52_3 <= GREATER_EQUAL)||(LA52_3 >= LESS && LA52_3 <= LESS_EQUAL)||LA52_3==MINUS||(LA52_3 >= NOT_EQUAL && LA52_3 <= PLUS)||(LA52_3 >= RBRACE && LA52_3 <= RBRACK)||LA52_3==RPAREN||LA52_3==SLASH||LA52_3==STAR||LA52_3==47||(LA52_3 >= 56 && LA52_3 <= 57)||(LA52_3 >= 59 && LA52_3 <= 61)||(LA52_3 >= 65 && LA52_3 <= 66)||LA52_3==77||LA52_3==83||(LA52_3 >= 89 && LA52_3 <= 90)) ) {
                    alt52=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }

            switch (alt52) {
                case 1 :
                    // Query.g:632:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,76,FOLLOW_76_in_undefinedLiteral2993); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral2995); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral2999);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3001); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 2 :
                    // Query.g:635:5: 'Undefined'
                    {
                    match(input,54,FOLLOW_54_in_undefinedLiteral3015); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;
                case 3 :
                    // Query.g:638:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,70,FOLLOW_70_in_undefinedLiteral3029); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3031); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral3035);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3037); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 4 :
                    // Query.g:641:5: 'null'
                    {
                    match(input,70,FOLLOW_70_in_undefinedLiteral3051); if (state.failed) return n;

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
    // Query.g:651:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;


        ASTTupleItem ti =null;


         List tiList = new ArrayList(); 
        try {
            // Query.g:653:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // Query.g:654:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,53,FOLLOW_53_in_tupleLiteral3090); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral3096); if (state.failed) return n;

            pushFollow(FOLLOW_tupleItem_in_tupleLiteral3104);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tiList.add(ti); }

            // Query.g:657:5: ( COMMA ti= tupleItem )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==COMMA) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // Query.g:657:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral3115); if (state.failed) return n;

            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral3119);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tiList.add(ti); }

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral3130); if (state.failed) return n;

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
    // Query.g:665:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;


        Token name=null;
        ASTType t =null;

        ASTExpression e =null;


        try {
            // Query.g:666:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // Query.g:667:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem3161); if (state.failed) return n;

            // Query.g:668:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==COLON) ) {
                int LA54_1 = input.LA(2);

                if ( (synpred1_Query()) ) {
                    alt54=1;
                }
                else if ( (true) ) {
                    alt54=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA54_0==EQUAL) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }
            switch (alt54) {
                case 1 :
                    // Query.g:671:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem3200); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_tupleItem3204);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem3206); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_tupleItem3210);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, e); }

                    }
                    break;
                case 2 :
                    // Query.g:674:7: ( COLON | EQUAL ) e= expression
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


                    pushFollow(FOLLOW_expression_in_tupleItem3242);
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
    // Query.g:685:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;


        ASTSimpleType nTSimple =null;

        ASTCollectionType nTCollection =null;

        ASTTupleType nTTuple =null;


         Token tok = null; 
        try {
            // Query.g:687:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
            // Query.g:688:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }

            // Query.g:689:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            int alt55=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt55=1;
                }
                break;
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
                {
                alt55=2;
                }
                break;
            case 53:
                {
                alt55=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;

            }

            switch (alt55) {
                case 1 :
                    // Query.g:690:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type3308);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 2 :
                    // Query.g:691:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type3320);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 3 :
                    // Query.g:692:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type3332);
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
    // Query.g:697:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;


        ASTType nT =null;


        try {
            // Query.g:698:5: (nT= type EOF )
            // Query.g:699:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly3364);
            nT=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_typeOnly3366); if (state.failed) return n;

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
    // Query.g:709:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;


        Token name=null;

        try {
            // Query.g:710:5: (name= IDENT )
            // Query.g:711:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType3394); if (state.failed) return n;

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
    // Query.g:719:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;


        ASTType elemType =null;


         Token op = null; 
        try {
            // Query.g:721:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // Query.g:722:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
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


            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType3459); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_collectionType3463);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType3465); if (state.failed) return n;

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
    // Query.g:732:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;


        ASTTuplePart tp =null;


         List tpList = new ArrayList(); 
        try {
            // Query.g:734:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // Query.g:735:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,53,FOLLOW_53_in_tupleType3499); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType3501); if (state.failed) return n;

            pushFollow(FOLLOW_tuplePart_in_tupleType3510);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tpList.add(tp); }

            // Query.g:737:5: ( COMMA tp= tuplePart )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==COMMA) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // Query.g:737:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType3521); if (state.failed) return n;

            	    pushFollow(FOLLOW_tuplePart_in_tupleType3525);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tpList.add(tp); }

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType3537); if (state.failed) return n;

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
    // Query.g:746:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Query.g:747:5: (name= IDENT COLON t= type )
            // Query.g:748:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart3569); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_tuplePart3571); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_tuplePart3575);
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
        // Query.g:671:7: ( COLON type EQUAL )
        // Query.g:671:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred1_Query3191); if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred1_Query3193);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_Query3195); if (state.failed) return ;

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


 

    public static final BitSet FOLLOW_85_in_checkExpr43 = new BitSet(new long[]{0x0000000000200000L,0x0000000000010000L});
    public static final BitSet FOLLOW_queryExpr_in_checkExpr45 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_queryExpr58 = new BitSet(new long[]{0x00000800002000C0L,0x0000000000008000L});
    public static final BitSet FOLLOW_featureExpr_in_queryExpr60 = new BitSet(new long[]{0x0200800000001000L,0x0000000005C00000L});
    public static final BitSet FOLLOW_COMMA_in_queryExpr63 = new BitSet(new long[]{0x00000800002000C0L,0x0000000000008000L});
    public static final BitSet FOLLOW_featureExpr_in_queryExpr65 = new BitSet(new long[]{0x0200800000001000L,0x0000000005C00000L});
    public static final BitSet FOLLOW_withExpr_in_queryExpr70 = new BitSet(new long[]{0x0200800000000000L,0x0000000005800000L});
    public static final BitSet FOLLOW_withoutExpr_in_queryExpr75 = new BitSet(new long[]{0x0200800000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_oclExpr_in_queryExpr80 = new BitSet(new long[]{0x0200800000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_57_in_queryExpr85 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_queryExpr87 = new BitSet(new long[]{0x0000800000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_queryExpr_nl_in_queryExpr91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpr107 = new BitSet(new long[]{0x0000800000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_queryExpr_nl_in_queryExpr109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_queryExpr_nl126 = new BitSet(new long[]{0x0000000000200000L,0x0000000000010000L});
    public static final BitSet FOLLOW_queryExpr_in_queryExpr_nl128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_queryExpr_nl136 = new BitSet(new long[]{0x0000000000200000L,0x0000000000010000L});
    public static final BitSet FOLLOW_queryExpr_in_queryExpr_nl138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_featureExpr192 = new BitSet(new long[]{0x0000080000200000L});
    public static final BitSet FOLLOW_set_in_featureExpr201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AttrExpr_in_featureExpr214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AssocExpr_in_featureExpr220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_oclExpr317 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_oclExpr319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_withExpr332 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_InvExpr_in_withExpr334 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_withExpr337 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_InvExpr_in_withExpr339 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_88_in_withoutExpr352 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_InvExpr_in_withoutExpr354 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_withoutExpr357 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_InvExpr_in_withoutExpr359 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_expression438 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_expression449 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_COLON_in_expression453 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_expression457 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUAL_in_expression462 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_expression466 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000004L});
    public static final BitSet FOLLOW_COMMA_in_expression504 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_expression516 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_COLON_in_expression520 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_expression524 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUAL_in_expression529 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_expression533 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_expression574 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList623 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList640 = new BitSet(new long[]{0x0000008000001000L});
    public static final BitSet FOLLOW_COMMA_in_paramList652 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList656 = new BitSet(new long[]{0x0000008000001000L});
    public static final BitSet FOLLOW_RPAREN_in_paramList676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList705 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_idList715 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_idList719 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration750 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration752 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression792 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_conditionalImpliesExpression805 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FE9L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression809 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression854 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_conditionalOrExpression867 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FE9L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression871 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression915 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_conditionalXOrExpression928 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FE9L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression932 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression976 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_conditionalAndExpression989 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FE9L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression993 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1041 = new BitSet(new long[]{0x0000000200008002L});
    public static final BitSet FOLLOW_set_in_equalityExpression1060 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FE9L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1070 = new BitSet(new long[]{0x0000000200008002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1119 = new BitSet(new long[]{0x000000000C060002L});
    public static final BitSet FOLLOW_set_in_relationalExpression1137 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FE9L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1155 = new BitSet(new long[]{0x000000000C060002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1205 = new BitSet(new long[]{0x0000000420000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression1223 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FE9L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1233 = new BitSet(new long[]{0x0000000420000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1283 = new BitSet(new long[]{0x08000A0000000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1301 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FE9L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1315 = new BitSet(new long[]{0x08000A0000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpression1377 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FE9L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression1454 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression1472 = new BitSet(new long[]{0x0000000000200000L,0x0000000000060E88L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression1478 = new BitSet(new long[]{0x0000000000200000L,0x0000000000060E88L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression1489 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_literal_in_primaryExpression1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression1566 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_primaryExpression1570 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression1596 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression1598 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_primaryExpression1600 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression1623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_primaryExpression1625 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression1643 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression1658 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression1660 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_primaryExpression1662 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression1666 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_primaryExpression1670 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression1672 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression1692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_primaryExpression1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference1720 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_objectReference1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inStateExpression_in_propertyCall1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression1880 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression1887 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression1898 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_BAR_in_queryExpression1902 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_queryExpression1913 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_iterateExpression1951 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression1957 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression1965 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression1967 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression1975 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression1977 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_iterateExpression1985 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression2035 = new BitSet(new long[]{0x0000000012000022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2057 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_operationExpression2070 = new BitSet(new long[]{0x0000002000001000L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2083 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_operationExpression2087 = new BitSet(new long[]{0x0000002000001000L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2099 = new BitSet(new long[]{0x0000000012000022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2116 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_operationExpression2131 = new BitSet(new long[]{0x0000002000001000L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2146 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_operationExpression2150 = new BitSet(new long[]{0x0000002000001000L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2164 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_AT_in_operationExpression2189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_operationExpression2191 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression2216 = new BitSet(new long[]{0x407F18C430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_operationExpression2237 = new BitSet(new long[]{0x0000008000001000L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2249 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_operationExpression2253 = new BitSet(new long[]{0x0000008000001000L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_inStateExpression2310 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_inStateExpression2315 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_inStateExpression2324 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_inStateExpression2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression2365 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression2389 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_typeExpression2393 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2433 = new BitSet(new long[]{0x0000000000001202L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2436 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration2440 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration2450 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2456 = new BitSet(new long[]{0x0000000000001202L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2459 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration2465 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization2493 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization2495 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_variableInitialization2499 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization2501 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_variableInitialization2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ifExpression2537 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_ifExpression2541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ifExpression2543 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_ifExpression2547 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ifExpression2549 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_ifExpression2553 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ifExpression2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_literal2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_literal2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal2660 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_literal2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal2676 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal2678 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_literal2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_literal2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral2780 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral2809 = new BitSet(new long[]{0x407F185430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral2826 = new BitSet(new long[]{0x0000001000001000L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral2839 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral2843 = new BitSet(new long[]{0x0000001000001000L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem2891 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem2902 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_collectionItem2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_emptyCollectionLiteral2935 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral2937 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral2941 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral2959 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral2961 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_undefinedLiteral2993 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral2995 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral2999 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_undefinedLiteral3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_undefinedLiteral3029 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3031 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3035 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_undefinedLiteral3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_tupleLiteral3090 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral3096 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3104 = new BitSet(new long[]{0x0000001000001000L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral3115 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3119 = new BitSet(new long[]{0x0000001000001000L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem3161 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_COLON_in_tupleItem3200 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_tupleItem3204 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem3206 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_tupleItem3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem3232 = new BitSet(new long[]{0x407F184430680020L,0x0000000000161FF9L});
    public static final BitSet FOLLOW_expression_in_tupleItem3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly3364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType3432 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType3459 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_collectionType3463 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_tupleType3499 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType3501 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType3510 = new BitSet(new long[]{0x0000008000001000L});
    public static final BitSet FOLLOW_COMMA_in_tupleType3521 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType3525 = new BitSet(new long[]{0x0000008000001000L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart3569 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_tuplePart3571 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_tuplePart3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_synpred1_Query3191 = new BitSet(new long[]{0x003F000000200000L});
    public static final BitSet FOLLOW_type_in_synpred1_Query3193 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred1_Query3195 = new BitSet(new long[]{0x0000000000000002L});

}