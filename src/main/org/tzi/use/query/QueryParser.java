// $ANTLR 3.4 Query.g 2021-10-08 12:03:35

package org.tzi.use.query;
import org.tzi.use.query.ast.*;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", "NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", "REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", "WS", "'&'", "'Bag'", "'Collection'", "'OrderedSet'", "'Sequence'", "'Set'", "'Tuple'", "'Undefined'", "'all'", "'allInstances'", "'and'", "'as'", "'but'", "'byUseId'", "'div'", "'else'", "'end'", "'endif'", "'false'", "'if'", "'implies'", "'in'", "'inject'", "'iterate'", "'let'", "'module'", "'no'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", "'oclInState'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", "'only'", "'or'", "'pre'", "'select'", "'selectByKind'", "'selectByType'", "'then'", "'true'", "'with'", "'xor'"
    };

    public static final int EOF=-1;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
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
    public static final int ARROW=4;
    public static final int AT=5;
    public static final int BAR=6;
    public static final int COLON=7;
    public static final int COLON_COLON=8;
    public static final int COLON_EQUAL=9;
    public static final int COMMA=10;
    public static final int DOT=11;
    public static final int DOTDOT=12;
    public static final int EQUAL=13;
    public static final int ESC=14;
    public static final int GREATER=15;
    public static final int GREATER_EQUAL=16;
    public static final int HASH=17;
    public static final int HEX_DIGIT=18;
    public static final int IDENT=19;
    public static final int INT=20;
    public static final int LBRACE=21;
    public static final int LBRACK=22;
    public static final int LESS=23;
    public static final int LESS_EQUAL=24;
    public static final int LPAREN=25;
    public static final int MINUS=26;
    public static final int ML_COMMENT=27;
    public static final int NEWLINE=28;
    public static final int NON_OCL_STRING=29;
    public static final int NOT_EQUAL=30;
    public static final int PLUS=31;
    public static final int RANGE_OR_INT=32;
    public static final int RBRACE=33;
    public static final int RBRACK=34;
    public static final int REAL=35;
    public static final int RPAREN=36;
    public static final int SEMI=37;
    public static final int SLASH=38;
    public static final int SL_COMMENT=39;
    public static final int STAR=40;
    public static final int STRING=41;
    public static final int VOCAB=42;
    public static final int WS=43;

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
    // Query.g:46:1: checkExpr returns [QAst expr] : (qexpr= abstractQueryExpr EOF |mexpr= moduleExpr (mexpr= moduleExpr )* EOF );
    public final QAst checkExpr() throws RecognitionException {
        QAst expr = null;


        AbstractQuery qexpr =null;

        ModuleExpr mexpr =null;


        try {
            // Query.g:46:30: (qexpr= abstractQueryExpr EOF |mexpr= moduleExpr (mexpr= moduleExpr )* EOF )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENT||LA2_0==82) ) {
                alt2=1;
            }
            else if ( (LA2_0==69) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // Query.g:47:5: qexpr= abstractQueryExpr EOF
                    {
                    pushFollow(FOLLOW_abstractQueryExpr_in_checkExpr57);
                    qexpr=abstractQueryExpr();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =qexpr;}

                    match(input,EOF,FOLLOW_EOF_in_checkExpr61); if (state.failed) return expr;

                    }
                    break;
                case 2 :
                    // Query.g:49:9: mexpr= moduleExpr (mexpr= moduleExpr )* EOF
                    {
                    pushFollow(FOLLOW_moduleExpr_in_checkExpr79);
                    mexpr=moduleExpr();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr = new ModuleListExpr(); ((ModuleListExpr)expr).addModule(mexpr);}

                    // Query.g:50:9: (mexpr= moduleExpr )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==69) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // Query.g:50:10: mexpr= moduleExpr
                    	    {
                    	    pushFollow(FOLLOW_moduleExpr_in_checkExpr95);
                    	    mexpr=moduleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return expr;

                    	    if ( state.backtracking==0 ) {((ModuleListExpr)expr).addModule(mexpr);}

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    match(input,EOF,FOLLOW_EOF_in_checkExpr101); if (state.failed) return expr;

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
        return expr;
    }
    // $ANTLR end "checkExpr"



    // $ANTLR start "abstractQueryExpr"
    // Query.g:53:1: abstractQueryExpr returns [AbstractQuery expr] : qexpr= queryExpr ( ( '+' right_expr= queryExpr ) | ( '-' right_expr= queryExpr ) | ( '&' right_expr= queryExpr ) )* ;
    public final AbstractQuery abstractQueryExpr() throws RecognitionException {
        AbstractQuery expr = null;


        QueryExpr qexpr =null;

        QueryExpr right_expr =null;


        try {
            // Query.g:53:47: (qexpr= queryExpr ( ( '+' right_expr= queryExpr ) | ( '-' right_expr= queryExpr ) | ( '&' right_expr= queryExpr ) )* )
            // Query.g:54:5: qexpr= queryExpr ( ( '+' right_expr= queryExpr ) | ( '-' right_expr= queryExpr ) | ( '&' right_expr= queryExpr ) )*
            {
            pushFollow(FOLLOW_queryExpr_in_abstractQueryExpr119);
            qexpr=queryExpr();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =qexpr;}

            // Query.g:55:10: ( ( '+' right_expr= queryExpr ) | ( '-' right_expr= queryExpr ) | ( '&' right_expr= queryExpr ) )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case PLUS:
                    {
                    alt3=1;
                    }
                    break;
                case MINUS:
                    {
                    alt3=2;
                    }
                    break;
                case 44:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // Query.g:56:13: ( '+' right_expr= queryExpr )
            	    {
            	    // Query.g:56:13: ( '+' right_expr= queryExpr )
            	    // Query.g:56:14: '+' right_expr= queryExpr
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_abstractQueryExpr147); if (state.failed) return expr;

            	    pushFollow(FOLLOW_queryExpr_in_abstractQueryExpr151);
            	    right_expr=queryExpr();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {
            	                        expr = new QueryBinaryExpr(expr, right_expr, Connective.UNION);
            	                    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // Query.g:62:13: ( '-' right_expr= queryExpr )
            	    {
            	    // Query.g:62:13: ( '-' right_expr= queryExpr )
            	    // Query.g:62:14: '-' right_expr= queryExpr
            	    {
            	    match(input,MINUS,FOLLOW_MINUS_in_abstractQueryExpr209); if (state.failed) return expr;

            	    pushFollow(FOLLOW_queryExpr_in_abstractQueryExpr213);
            	    right_expr=queryExpr();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {
            	                        expr = new QueryBinaryExpr(expr, right_expr, Connective.DIFFER);
            	                    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // Query.g:68:13: ( '&' right_expr= queryExpr )
            	    {
            	    // Query.g:68:13: ( '&' right_expr= queryExpr )
            	    // Query.g:68:15: '&' right_expr= queryExpr
            	    {
            	    match(input,44,FOLLOW_44_in_abstractQueryExpr272); if (state.failed) return expr;

            	    pushFollow(FOLLOW_queryExpr_in_abstractQueryExpr278);
            	    right_expr=queryExpr();

            	    state._fsp--;
            	    if (state.failed) return expr;

            	    if ( state.backtracking==0 ) {
            	                        expr = new QueryBinaryExpr(expr, right_expr, Connective.INTER);
            	                    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
        return expr;
    }
    // $ANTLR end "abstractQueryExpr"



    // $ANTLR start "queryExpr"
    // Query.g:76:1: queryExpr returns [QueryExpr qexpr] : ( 'select' f= featureExpr ( COMMA f= featureExpr )* (with= withExpr )? (without= butExpr )? ( 'inject' o= injExpr )? ( 'as' name= IDENT )? |alias= IDENT |module= moduleAlias );
    public final QueryExpr queryExpr() throws RecognitionException {
        QueryExpr qexpr = null;


        Token name=null;
        Token alias=null;
        QFeatureExpr f =null;

        QWithExpr with =null;

        QButExpr without =null;

        QOCLExpr o =null;

        ModuleAliasExpr module =null;



            qexpr = new QueryExpr();

        try {
            // Query.g:78:2: ( 'select' f= featureExpr ( COMMA f= featureExpr )* (with= withExpr )? (without= butExpr )? ( 'inject' o= injExpr )? ( 'as' name= IDENT )? |alias= IDENT |module= moduleAlias )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==82) ) {
                alt9=1;
            }
            else if ( (LA9_0==IDENT) ) {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==EOF||LA9_2==IDENT||LA9_2==MINUS||LA9_2==PLUS||LA9_2==44||LA9_2==60||LA9_2==82) ) {
                    alt9=2;
                }
                else if ( (LA9_2==DOT) ) {
                    alt9=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return qexpr;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return qexpr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // Query.g:79:5: 'select' f= featureExpr ( COMMA f= featureExpr )* (with= withExpr )? (without= butExpr )? ( 'inject' o= injExpr )? ( 'as' name= IDENT )?
                    {
                    match(input,82,FOLLOW_82_in_queryExpr343); if (state.failed) return qexpr;

                    pushFollow(FOLLOW_featureExpr_in_queryExpr347);
                    f=featureExpr();

                    state._fsp--;
                    if (state.failed) return qexpr;

                    if ( state.backtracking==0 ) {qexpr.addFeature(f);}

                    // Query.g:79:52: ( COMMA f= featureExpr )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==COMMA) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Query.g:79:53: COMMA f= featureExpr
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_queryExpr352); if (state.failed) return qexpr;

                    	    pushFollow(FOLLOW_featureExpr_in_queryExpr356);
                    	    f=featureExpr();

                    	    state._fsp--;
                    	    if (state.failed) return qexpr;

                    	    if ( state.backtracking==0 ) {qexpr.addFeature(f);}

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    // Query.g:80:9: (with= withExpr )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==87) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // Query.g:80:10: with= withExpr
                            {
                            pushFollow(FOLLOW_withExpr_in_queryExpr374);
                            with=withExpr();

                            state._fsp--;
                            if (state.failed) return qexpr;

                            if ( state.backtracking==0 ) {qexpr.addWithExpr(with);}

                            }
                            break;

                    }


                    // Query.g:81:9: (without= butExpr )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==56) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // Query.g:81:10: without= butExpr
                            {
                            pushFollow(FOLLOW_butExpr_in_queryExpr392);
                            without=butExpr();

                            state._fsp--;
                            if (state.failed) return qexpr;

                            if ( state.backtracking==0 ) {qexpr.addWithoutExpr(without);}

                            }
                            break;

                    }


                    // Query.g:81:62: ( 'inject' o= injExpr )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==66) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // Query.g:81:63: 'inject' o= injExpr
                            {
                            match(input,66,FOLLOW_66_in_queryExpr399); if (state.failed) return qexpr;

                            pushFollow(FOLLOW_injExpr_in_queryExpr403);
                            o=injExpr();

                            state._fsp--;
                            if (state.failed) return qexpr;

                            if ( state.backtracking==0 ) {qexpr.setOCLExpression(o);}

                            }
                            break;

                    }


                    // Query.g:82:9: ( 'as' name= IDENT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==55) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // Query.g:82:10: 'as' name= IDENT
                            {
                            match(input,55,FOLLOW_55_in_queryExpr418); if (state.failed) return qexpr;

                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpr422); if (state.failed) return qexpr;

                            if ( state.backtracking==0 ) {qexpr.setAlias(name.getText());}

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Query.g:83:6: alias= IDENT
                    {
                    alias=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpr438); if (state.failed) return qexpr;

                    if ( state.backtracking==0 ) {qexpr.setAlias(alias.getText());qexpr.setPureAliased();}

                    }
                    break;
                case 3 :
                    // Query.g:84:6: module= moduleAlias
                    {
                    pushFollow(FOLLOW_moduleAlias_in_queryExpr449);
                    module=moduleAlias();

                    state._fsp--;
                    if (state.failed) return qexpr;

                    if ( state.backtracking==0 ) {qexpr =module;}

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
        return qexpr;
    }
    // $ANTLR end "queryExpr"



    // $ANTLR start "moduleAlias"
    // Query.g:90:1: moduleAlias returns [ModuleAliasExpr maexpr] : module= IDENT DOT query= ( IDENT | STAR ) ;
    public final ModuleAliasExpr moduleAlias() throws RecognitionException {
        ModuleAliasExpr maexpr = null;


        Token module=null;
        Token query=null;


            maexpr = new ModuleAliasExpr(); 

        try {
            // Query.g:92:2: (module= IDENT DOT query= ( IDENT | STAR ) )
            // Query.g:93:5: module= IDENT DOT query= ( IDENT | STAR )
            {
            module=(Token)match(input,IDENT,FOLLOW_IDENT_in_moduleAlias475); if (state.failed) return maexpr;

            if ( state.backtracking==0 ) {maexpr.setModuleName(module.getText());}

            match(input,DOT,FOLLOW_DOT_in_moduleAlias483); if (state.failed) return maexpr;

            query=(Token)input.LT(1);

            if ( input.LA(1)==IDENT||input.LA(1)==STAR ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return maexpr;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) {maexpr.setQueryName(query.getText());}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return maexpr;
    }
    // $ANTLR end "moduleAlias"



    // $ANTLR start "featureExpr"
    // Query.g:101:1: featureExpr returns [QFeatureExpr feature] : ( (modifier= modifiers )? dest= ( IDENT | STAR ) (k= rankExpr )? | (modifier= modifiers )? f1= attrExpr |f2= assocExpr );
    public final QFeatureExpr featureExpr() throws RecognitionException {
        QFeatureExpr feature = null;


        Token dest=null;
        Modifier modifier =null;

        int k =0;

        QAttrExpr f1 =null;

        QAssocExpr f2 =null;


        try {
            // Query.g:101:43: ( (modifier= modifiers )? dest= ( IDENT | STAR ) (k= rankExpr )? | (modifier= modifiers )? f1= attrExpr |f2= assocExpr )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==IDENT||LA13_1==STAR) ) {
                    int LA13_5 = input.LA(3);

                    if ( (LA13_5==DOT) ) {
                        alt13=2;
                    }
                    else if ( (LA13_5==EOF||LA13_5==AT||LA13_5==COMMA||LA13_5==IDENT||LA13_5==MINUS||LA13_5==PLUS||LA13_5==44||(LA13_5 >= 55 && LA13_5 <= 56)||LA13_5==60||LA13_5==66||LA13_5==82||LA13_5==87) ) {
                        alt13=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return feature;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 5, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return feature;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
                }
                break;
            case 70:
                {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==IDENT||LA13_2==STAR) ) {
                    int LA13_5 = input.LA(3);

                    if ( (LA13_5==DOT) ) {
                        alt13=2;
                    }
                    else if ( (LA13_5==EOF||LA13_5==AT||LA13_5==COMMA||LA13_5==IDENT||LA13_5==MINUS||LA13_5==PLUS||LA13_5==44||(LA13_5 >= 55 && LA13_5 <= 56)||LA13_5==60||LA13_5==66||LA13_5==82||LA13_5==87) ) {
                        alt13=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return feature;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 5, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return feature;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;

                }
                }
                break;
            case 52:
                {
                int LA13_3 = input.LA(2);

                if ( (LA13_3==IDENT||LA13_3==STAR) ) {
                    int LA13_5 = input.LA(3);

                    if ( (LA13_5==DOT) ) {
                        alt13=2;
                    }
                    else if ( (LA13_5==EOF||LA13_5==AT||LA13_5==COMMA||LA13_5==IDENT||LA13_5==MINUS||LA13_5==PLUS||LA13_5==44||(LA13_5 >= 55 && LA13_5 <= 56)||LA13_5==60||LA13_5==66||LA13_5==82||LA13_5==87) ) {
                        alt13=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return feature;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 5, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return feature;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;

                }
                }
                break;
            case IDENT:
            case STAR:
                {
                switch ( input.LA(2) ) {
                case DOT:
                    {
                    alt13=2;
                    }
                    break;
                case COLON:
                    {
                    alt13=3;
                    }
                    break;
                case EOF:
                case AT:
                case COMMA:
                case IDENT:
                case MINUS:
                case PLUS:
                case 44:
                case 55:
                case 56:
                case 60:
                case 66:
                case 82:
                case 87:
                    {
                    alt13=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return feature;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 4, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return feature;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // Query.g:102:5: (modifier= modifiers )? dest= ( IDENT | STAR ) (k= rankExpr )?
                    {
                    // Query.g:102:5: (modifier= modifiers )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==52||LA10_0==70||LA10_0==79) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // Query.g:102:6: modifier= modifiers
                            {
                            pushFollow(FOLLOW_modifiers_in_featureExpr524);
                            modifier=modifiers();

                            state._fsp--;
                            if (state.failed) return feature;

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
                        if (state.backtracking>0) {state.failed=true; return feature;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // Query.g:102:46: (k= rankExpr )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==AT) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // Query.g:102:47: k= rankExpr
                            {
                            pushFollow(FOLLOW_rankExpr_in_featureExpr540);
                            k=rankExpr();

                            state._fsp--;
                            if (state.failed) return feature;

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                            feature = (k>0) ?
                                        new QClassExpr(dest.getText(),modifier,k)
                                        :
                                        new QClassExpr(dest.getText(),modifier)
                                        ;
                        }

                    }
                    break;
                case 2 :
                    // Query.g:110:7: (modifier= modifiers )? f1= attrExpr
                    {
                    // Query.g:110:7: (modifier= modifiers )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==52||LA12_0==70||LA12_0==79) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // Query.g:110:8: modifier= modifiers
                            {
                            pushFollow(FOLLOW_modifiers_in_featureExpr559);
                            modifier=modifiers();

                            state._fsp--;
                            if (state.failed) return feature;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_attrExpr_in_featureExpr568);
                    f1=attrExpr();

                    state._fsp--;
                    if (state.failed) return feature;

                    if ( state.backtracking==0 ) {
                                if (modifier!=null) f1.setModifier(modifier);
                                feature =f1;
                            }

                    }
                    break;
                case 3 :
                    // Query.g:114:7: f2= assocExpr
                    {
                    pushFollow(FOLLOW_assocExpr_in_featureExpr582);
                    f2=assocExpr();

                    state._fsp--;
                    if (state.failed) return feature;

                    if ( state.backtracking==0 ) {feature =f2;}

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
        return feature;
    }
    // $ANTLR end "featureExpr"



    // $ANTLR start "modifiers"
    // Query.g:117:1: modifiers returns [Modifier m] : ( 'only' | 'no' | 'all' );
    public final Modifier modifiers() throws RecognitionException {
        Modifier m = null;


        try {
            // Query.g:117:31: ( 'only' | 'no' | 'all' )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt14=1;
                }
                break;
            case 70:
                {
                alt14=2;
                }
                break;
            case 52:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return m;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // Query.g:118:5: 'only'
                    {
                    match(input,79,FOLLOW_79_in_modifiers600); if (state.failed) return m;

                    if ( state.backtracking==0 ) {m =Modifier.ONLY;}

                    }
                    break;
                case 2 :
                    // Query.g:120:5: 'no'
                    {
                    match(input,70,FOLLOW_70_in_modifiers614); if (state.failed) return m;

                    if ( state.backtracking==0 ) {m =Modifier.NO;}

                    }
                    break;
                case 3 :
                    // Query.g:122:6: 'all'
                    {
                    match(input,52,FOLLOW_52_in_modifiers624); if (state.failed) return m;

                    if ( state.backtracking==0 ) {m =Modifier.ALL;}

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
        return m;
    }
    // $ANTLR end "modifiers"



    // $ANTLR start "attrExpr"
    // Query.g:125:1: attrExpr returns [QAttrExpr attr] : src= ( IDENT | STAR ) DOT dest= ( IDENT | STAR ) (k= rankExpr )? ;
    public final QAttrExpr attrExpr() throws RecognitionException {
        QAttrExpr attr = null;


        Token src=null;
        Token dest=null;
        int k =0;


        try {
            // Query.g:125:34: (src= ( IDENT | STAR ) DOT dest= ( IDENT | STAR ) (k= rankExpr )? )
            // Query.g:126:5: src= ( IDENT | STAR ) DOT dest= ( IDENT | STAR ) (k= rankExpr )?
            {
            src=(Token)input.LT(1);

            if ( input.LA(1)==IDENT||input.LA(1)==STAR ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return attr;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,DOT,FOLLOW_DOT_in_attrExpr650); if (state.failed) return attr;

            dest=(Token)input.LT(1);

            if ( input.LA(1)==IDENT||input.LA(1)==STAR ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return attr;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // Query.g:126:44: (k= rankExpr )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==AT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Query.g:126:45: k= rankExpr
                    {
                    pushFollow(FOLLOW_rankExpr_in_attrExpr663);
                    k=rankExpr();

                    state._fsp--;
                    if (state.failed) return attr;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {;
                    attr = (k>0) ? 
                           new QAttrExpr(src.getText(),dest.getText(),k)
                           :
                           new QAttrExpr(src.getText(),dest.getText())
                           ;
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
        return attr;
    }
    // $ANTLR end "attrExpr"



    // $ANTLR start "assocExpr"
    // Query.g:136:1: assocExpr returns [QAssocExpr assoc] : src= ( IDENT | STAR ) COLON name= ( IDENT | STAR ) COLON dest= ( IDENT | STAR ) (k= rankExpr )? ;
    public final QAssocExpr assocExpr() throws RecognitionException {
        QAssocExpr assoc = null;


        Token src=null;
        Token name=null;
        Token dest=null;
        int k =0;


        try {
            // Query.g:137:3: (src= ( IDENT | STAR ) COLON name= ( IDENT | STAR ) COLON dest= ( IDENT | STAR ) (k= rankExpr )? )
            // Query.g:137:3: src= ( IDENT | STAR ) COLON name= ( IDENT | STAR ) COLON dest= ( IDENT | STAR ) (k= rankExpr )?
            {
            src=(Token)input.LT(1);

            if ( input.LA(1)==IDENT||input.LA(1)==STAR ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return assoc;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,COLON,FOLLOW_COLON_in_assocExpr693); if (state.failed) return assoc;

            name=(Token)input.LT(1);

            if ( input.LA(1)==IDENT||input.LA(1)==STAR ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return assoc;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,COLON,FOLLOW_COLON_in_assocExpr703); if (state.failed) return assoc;

            dest=(Token)input.LT(1);

            if ( input.LA(1)==IDENT||input.LA(1)==STAR ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return assoc;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // Query.g:137:68: (k= rankExpr )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==AT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // Query.g:137:69: k= rankExpr
                    {
                    pushFollow(FOLLOW_rankExpr_in_assocExpr716);
                    k=rankExpr();

                    state._fsp--;
                    if (state.failed) return assoc;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                    assoc = (k>0) ? 
                            new QAssocExpr(src.getText(),name.getText(),dest.getText(),k) 
                            :
                            new QAssocExpr(src.getText(),name.getText(),dest.getText())
                            ;
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
        return assoc;
    }
    // $ANTLR end "assocExpr"



    // $ANTLR start "withExpr"
    // Query.g:147:1: withExpr returns [QWithExpr with] : 'with' w= invExpr ( COMMA w= invExpr )* ;
    public final QWithExpr withExpr() throws RecognitionException {
        QWithExpr with = null;


        QInvExpr w =null;



            with = new QWithExpr();

        try {
            // Query.g:149:2: ( 'with' w= invExpr ( COMMA w= invExpr )* )
            // Query.g:150:5: 'with' w= invExpr ( COMMA w= invExpr )*
            {
            match(input,87,FOLLOW_87_in_withExpr745); if (state.failed) return with;

            pushFollow(FOLLOW_invExpr_in_withExpr749);
            w=invExpr();

            state._fsp--;
            if (state.failed) return with;

            if ( state.backtracking==0 ) {with.addInvExpr(w);}

            // Query.g:150:44: ( COMMA w= invExpr )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Query.g:150:45: COMMA w= invExpr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_withExpr753); if (state.failed) return with;

            	    pushFollow(FOLLOW_invExpr_in_withExpr757);
            	    w=invExpr();

            	    state._fsp--;
            	    if (state.failed) return with;

            	    if ( state.backtracking==0 ) {with.addInvExpr(w);}

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
        return with;
    }
    // $ANTLR end "withExpr"



    // $ANTLR start "butExpr"
    // Query.g:153:1: butExpr returns [QButExpr without] : 'but' (f= featureExpr |w= invExpr ) ( COMMA (f= featureExpr |w= invExpr ) )* ;
    public final QButExpr butExpr() throws RecognitionException {
        QButExpr without = null;


        QFeatureExpr f =null;

        QInvExpr w =null;



            without = new QButExpr();

        try {
            // Query.g:156:5: ( 'but' (f= featureExpr |w= invExpr ) ( COMMA (f= featureExpr |w= invExpr ) )* )
            // Query.g:157:5: 'but' (f= featureExpr |w= invExpr ) ( COMMA (f= featureExpr |w= invExpr ) )*
            {
            match(input,56,FOLLOW_56_in_butExpr781); if (state.failed) return without;

            // Query.g:157:11: (f= featureExpr |w= invExpr )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==52||LA18_0==70||LA18_0==79) ) {
                alt18=1;
            }
            else if ( (LA18_0==IDENT||LA18_0==STAR) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==EOF||LA18_2==AT||LA18_2==COLON||(LA18_2 >= COMMA && LA18_2 <= DOT)||LA18_2==IDENT||LA18_2==MINUS||LA18_2==PLUS||LA18_2==44||LA18_2==55||LA18_2==60||LA18_2==66||LA18_2==82) ) {
                    alt18=1;
                }
                else if ( (LA18_2==COLON_COLON) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return without;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return without;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // Query.g:157:12: f= featureExpr
                    {
                    pushFollow(FOLLOW_featureExpr_in_butExpr786);
                    f=featureExpr();

                    state._fsp--;
                    if (state.failed) return without;

                    if ( state.backtracking==0 ) {without.addFeatureExpr(f);}

                    }
                    break;
                case 2 :
                    // Query.g:157:59: w= invExpr
                    {
                    pushFollow(FOLLOW_invExpr_in_butExpr795);
                    w=invExpr();

                    state._fsp--;
                    if (state.failed) return without;

                    if ( state.backtracking==0 ) {without.addFeatureExpr(w);}

                    }
                    break;

            }


            // Query.g:158:5: ( COMMA (f= featureExpr |w= invExpr ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Query.g:158:6: COMMA (f= featureExpr |w= invExpr )
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_butExpr806); if (state.failed) return without;

            	    // Query.g:158:12: (f= featureExpr |w= invExpr )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==52||LA19_0==70||LA19_0==79) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==IDENT||LA19_0==STAR) ) {
            	        int LA19_2 = input.LA(2);

            	        if ( (LA19_2==EOF||LA19_2==AT||LA19_2==COLON||(LA19_2 >= COMMA && LA19_2 <= DOT)||LA19_2==IDENT||LA19_2==MINUS||LA19_2==PLUS||LA19_2==44||LA19_2==55||LA19_2==60||LA19_2==66||LA19_2==82) ) {
            	            alt19=1;
            	        }
            	        else if ( (LA19_2==COLON_COLON) ) {
            	            alt19=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return without;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 19, 2, input);

            	            throw nvae;

            	        }
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return without;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // Query.g:158:13: f= featureExpr
            	            {
            	            pushFollow(FOLLOW_featureExpr_in_butExpr811);
            	            f=featureExpr();

            	            state._fsp--;
            	            if (state.failed) return without;

            	            if ( state.backtracking==0 ) {without.addFeatureExpr(f);}

            	            }
            	            break;
            	        case 2 :
            	            // Query.g:158:59: w= invExpr
            	            {
            	            pushFollow(FOLLOW_invExpr_in_butExpr819);
            	            w=invExpr();

            	            state._fsp--;
            	            if (state.failed) return without;

            	            if ( state.backtracking==0 ) {without.addFeatureExpr(w);}

            	            }
            	            break;

            	    }


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
        return without;
    }
    // $ANTLR end "butExpr"



    // $ANTLR start "invExpr"
    // Query.g:161:1: invExpr returns [QInvExpr inv] : src= ( IDENT | STAR ) COLON_COLON dest= ( IDENT | STAR ) (k= rankExpr )? ;
    public final QInvExpr invExpr() throws RecognitionException {
        QInvExpr inv = null;


        Token src=null;
        Token dest=null;
        int k =0;


        try {
            // Query.g:161:31: (src= ( IDENT | STAR ) COLON_COLON dest= ( IDENT | STAR ) (k= rankExpr )? )
            // Query.g:162:5: src= ( IDENT | STAR ) COLON_COLON dest= ( IDENT | STAR ) (k= rankExpr )?
            {
            src=(Token)input.LT(1);

            if ( input.LA(1)==IDENT||input.LA(1)==STAR ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return inv;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,COLON_COLON,FOLLOW_COLON_COLON_in_invExpr849); if (state.failed) return inv;

            dest=(Token)input.LT(1);

            if ( input.LA(1)==IDENT||input.LA(1)==STAR ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return inv;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // Query.g:162:52: (k= rankExpr )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==AT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // Query.g:162:53: k= rankExpr
                    {
                    pushFollow(FOLLOW_rankExpr_in_invExpr862);
                    k=rankExpr();

                    state._fsp--;
                    if (state.failed) return inv;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                    
                    inv =   (k>0) ? 
                            new QInvExpr(src.getText(),dest.getText(),k)
                            :
                            new QInvExpr(src.getText(),dest.getText())
                            ;
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
        return inv;
    }
    // $ANTLR end "invExpr"



    // $ANTLR start "rankExpr"
    // Query.g:173:1: rankExpr returns [int rank] : AT k= INT ;
    public final int rankExpr() throws RecognitionException {
        int rank = 0;


        Token k=null;


            rank =0;
         
        try {
            // Query.g:175:3: ( AT k= INT )
            // Query.g:176:5: AT k= INT
            {
            match(input,AT,FOLLOW_AT_in_rankExpr891); if (state.failed) return rank;

            k=(Token)match(input,INT,FOLLOW_INT_in_rankExpr895); if (state.failed) return rank;

            if ( state.backtracking==0 ) {rank =Integer.parseInt((k!=null?k.getText():null));}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return rank;
    }
    // $ANTLR end "rankExpr"



    // $ANTLR start "moduleExpr"
    // Query.g:179:1: moduleExpr returns [ModuleExpr mexpr] : 'module' name= IDENT query= abstractQueryExpr (query= abstractQueryExpr )* 'end' ;
    public final ModuleExpr moduleExpr() throws RecognitionException {
        ModuleExpr mexpr = null;


        Token name=null;
        AbstractQuery query =null;


        try {
            // Query.g:179:38: ( 'module' name= IDENT query= abstractQueryExpr (query= abstractQueryExpr )* 'end' )
            // Query.g:180:5: 'module' name= IDENT query= abstractQueryExpr (query= abstractQueryExpr )* 'end'
            {
            match(input,69,FOLLOW_69_in_moduleExpr913); if (state.failed) return mexpr;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_moduleExpr917); if (state.failed) return mexpr;

            if ( state.backtracking==0 ) {mexpr = new ModuleExpr(name.getText());}

            pushFollow(FOLLOW_abstractQueryExpr_in_moduleExpr931);
            query=abstractQueryExpr();

            state._fsp--;
            if (state.failed) return mexpr;

            if ( state.backtracking==0 ) {mexpr.addQuery(query);}

            // Query.g:182:9: (query= abstractQueryExpr )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==IDENT||LA22_0==82) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Query.g:182:10: query= abstractQueryExpr
            	    {
            	    pushFollow(FOLLOW_abstractQueryExpr_in_moduleExpr947);
            	    query=abstractQueryExpr();

            	    state._fsp--;
            	    if (state.failed) return mexpr;

            	    if ( state.backtracking==0 ) {mexpr.addQuery(query);}

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            if ( state.backtracking==0 ) {query.setModule(mexpr);}

            match(input,60,FOLLOW_60_in_moduleExpr967); if (state.failed) return mexpr;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return mexpr;
    }
    // $ANTLR end "moduleExpr"



    // $ANTLR start "injExpr"
    // Query.g:187:1: injExpr returns [QOCLExpr ocl_expr] : LBRACE expr= expression (k= rankExpr )? ( COMMA expr= expression (k= rankExpr )? )* RBRACE ;
    public final QOCLExpr injExpr() throws RecognitionException {
        QOCLExpr ocl_expr = null;


        ASTExpression expr =null;

        int k =0;



            ocl_expr = new QOCLExpr();

        try {
            // Query.g:189:2: ( LBRACE expr= expression (k= rankExpr )? ( COMMA expr= expression (k= rankExpr )? )* RBRACE )
            // Query.g:190:5: LBRACE expr= expression (k= rankExpr )? ( COMMA expr= expression (k= rankExpr )? )* RBRACE
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_injExpr988); if (state.failed) return ocl_expr;

            pushFollow(FOLLOW_expression_in_injExpr992);
            expr=expression();

            state._fsp--;
            if (state.failed) return ocl_expr;

            // Query.g:190:28: (k= rankExpr )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==AT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Query.g:190:29: k= rankExpr
                    {
                    pushFollow(FOLLOW_rankExpr_in_injExpr997);
                    k=rankExpr();

                    state._fsp--;
                    if (state.failed) return ocl_expr;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                    if (k>0)
                        ocl_expr.addOCLExpression(expr,k);
                    else
                        ocl_expr.addOCLExpression(expr);
                }

            // Query.g:197:5: ( COMMA expr= expression (k= rankExpr )? )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==COMMA) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Query.g:197:6: COMMA expr= expression (k= rankExpr )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_injExpr1014); if (state.failed) return ocl_expr;

            	    pushFollow(FOLLOW_expression_in_injExpr1018);
            	    expr=expression();

            	    state._fsp--;
            	    if (state.failed) return ocl_expr;

            	    // Query.g:197:28: (k= rankExpr )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==AT) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // Query.g:197:29: k= rankExpr
            	            {
            	            pushFollow(FOLLOW_rankExpr_in_injExpr1023);
            	            k=rankExpr();

            	            state._fsp--;
            	            if (state.failed) return ocl_expr;

            	            }
            	            break;

            	    }


            	    if ( state.backtracking==0 ) {
            	                if (k>0)
            	                    ocl_expr.addOCLExpression(expr,k);
            	                else
            	                    ocl_expr.addOCLExpression(expr);
            	            }

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_injExpr1045); if (state.failed) return ocl_expr;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ocl_expr;
    }
    // $ANTLR end "injExpr"



    // $ANTLR start "expressionOnly"
    // Query.g:233:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExp =null;


        try {
            // Query.g:234:5: (nExp= expression EOF )
            // Query.g:235:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly1072);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_expressionOnly1074); if (state.failed) return n;

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
    // Query.g:242:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
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
            // Query.g:248:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
            // Query.g:249:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }

            // Query.g:250:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==68) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // Query.g:251:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
            	    {
            	    match(input,68,FOLLOW_68_in_expression1122); if (state.failed) return n;

            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression1133); if (state.failed) return n;

            	    // Query.g:252:18: ( COLON t= type )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==COLON) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // Query.g:252:20: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression1137); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_expression1141);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression1146); if (state.failed) return n;

            	    pushFollow(FOLLOW_expression_in_expression1150);
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

            	    // Query.g:262:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==COMMA) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // Query.g:263:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_expression1188); if (state.failed) return n;

            	    	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression1200); if (state.failed) return n;

            	    	    // Query.g:264:20: ( COLON t= type )?
            	    	    int alt27=2;
            	    	    int LA27_0 = input.LA(1);

            	    	    if ( (LA27_0==COLON) ) {
            	    	        alt27=1;
            	    	    }
            	    	    switch (alt27) {
            	    	        case 1 :
            	    	            // Query.g:264:22: COLON t= type
            	    	            {
            	    	            match(input,COLON,FOLLOW_COLON_in_expression1204); if (state.failed) return n;

            	    	            pushFollow(FOLLOW_type_in_expression1208);
            	    	            t=type();

            	    	            state._fsp--;
            	    	            if (state.failed) return n;

            	    	            }
            	    	            break;

            	    	    }


            	    	    match(input,EQUAL,FOLLOW_EQUAL_in_expression1213); if (state.failed) return n;

            	    	    pushFollow(FOLLOW_expression_in_expression1217);
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
            	    	    break loop28;
            	        }
            	    } while (true);


            	    match(input,65,FOLLOW_65_in_expression1258); if (state.failed) return n;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression1274);
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
    // Query.g:297:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;


        ASTVariableDeclaration v =null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // Query.g:299:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // Query.g:300:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList1307); if (state.failed) return paramList;

            // Query.g:301:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==IDENT) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // Query.g:302:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList1324);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;

                    if ( state.backtracking==0 ) { paramList.add(v); }

                    // Query.g:303:7: ( COMMA v= variableDeclaration )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==COMMA) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // Query.g:303:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList1336); if (state.failed) return paramList;

                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList1340);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;

                    	    if ( state.backtracking==0 ) { paramList.add(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_paramList1360); if (state.failed) return paramList;

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
    // Query.g:311:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;


        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // Query.g:313:5: (id0= IDENT ( COMMA idn= IDENT )* )
            // Query.g:314:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList1389); if (state.failed) return idList;

            if ( state.backtracking==0 ) { idList.add(id0); }

            // Query.g:315:5: ( COMMA idn= IDENT )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==COMMA) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // Query.g:315:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList1399); if (state.failed) return idList;

            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList1403); if (state.failed) return idList;

            	    if ( state.backtracking==0 ) { idList.add(idn); }

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // Query.g:323:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Query.g:324:5: (name= IDENT COLON t= type )
            // Query.g:325:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration1434); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableDeclaration1436); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableDeclaration1440);
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
    // Query.g:333:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndOrExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:334:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // Query.g:335:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1476);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndOrExp;}

            // Query.g:336:5: (op= 'implies' n1= conditionalOrExpression )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==64) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // Query.g:336:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,64,FOLLOW_64_in_conditionalImpliesExpression1489); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1493);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // Query.g:345:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndXorExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:346:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // Query.g:347:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1538);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndXorExp;}

            // Query.g:348:5: (op= 'or' n1= conditionalXOrExpression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==80) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // Query.g:348:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,80,FOLLOW_80_in_conditionalOrExpression1551); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1555);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // Query.g:357:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndAndExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:358:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // Query.g:359:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1599);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndAndExp;}

            // Query.g:360:5: (op= 'xor' n1= conditionalAndExpression )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==88) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // Query.g:360:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,88,FOLLOW_88_in_conditionalXOrExpression1612); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1616);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // Query.g:369:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nEqExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:370:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // Query.g:371:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1660);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nEqExp;}

            // Query.g:372:5: (op= 'and' n1= equalityExpression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==54) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // Query.g:372:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,54,FOLLOW_54_in_conditionalAndExpression1673); if (state.failed) return n;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1677);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // Query.g:381:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nRelExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:383:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // Query.g:384:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1725);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nRelExp;}

            // Query.g:385:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==EQUAL||LA37_0==NOT_EQUAL) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // Query.g:385:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1754);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // Query.g:395:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nAddiExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:397:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // Query.g:398:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1803);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nAddiExp;}

            // Query.g:399:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0 >= GREATER && LA38_0 <= GREATER_EQUAL)||(LA38_0 >= LESS && LA38_0 <= LESS_EQUAL)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // Query.g:399:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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


            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1839);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

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
    // $ANTLR end "relationalExpression"



    // $ANTLR start "additiveExpression"
    // Query.g:409:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nMulExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:411:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // Query.g:412:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1889);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nMulExp;}

            // Query.g:413:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==MINUS||LA39_0==PLUS) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // Query.g:413:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1917);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // Query.g:424:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:426:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // Query.g:427:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1967);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nUnExp;}

            // Query.g:428:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==SLASH||LA40_0==STAR||LA40_0==58) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // Query.g:428:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
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


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1999);
            	    n1=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // Query.g:440:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression nPosExp =null;


         Token op = null; 
        try {
            // Query.g:442:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==MINUS||LA41_0==PLUS||LA41_0==71) ) {
                alt41=1;
            }
            else if ( (LA41_0==AT||LA41_0==HASH||(LA41_0 >= IDENT && LA41_0 <= INT)||LA41_0==LPAREN||LA41_0==REAL||(LA41_0 >= STAR && LA41_0 <= STRING)||(LA41_0 >= 45 && LA41_0 <= 51)||(LA41_0 >= 62 && LA41_0 <= 63)||LA41_0==67||(LA41_0 >= 72 && LA41_0 <= 78)||(LA41_0 >= 83 && LA41_0 <= 84)||LA41_0==86) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }
            switch (alt41) {
                case 1 :
                    // Query.g:443:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // Query.g:443:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // Query.g:443:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) { op = input.LT(1); }

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==71 ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2085);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }

                    }


                    }
                    break;
                case 2 :
                    // Query.g:447:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression2105);
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
    // Query.g:455:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nPrimExp =null;

        ASTExpression nPc =null;


         boolean arrow = false; 
        try {
            // Query.g:457:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // Query.g:458:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression2138);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nPrimExp; }

            // Query.g:459:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==ARROW||LA43_0==DOT) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // Query.g:460:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // Query.g:460:6: ( ARROW | DOT )
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==ARROW) ) {
            	        alt42=1;
            	    }
            	    else if ( (LA42_0==DOT) ) {
            	        alt42=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // Query.g:460:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression2156); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = true; }

            	            }
            	            break;
            	        case 2 :
            	            // Query.g:460:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression2162); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = false; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression2173);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = nPc; }

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // Query.g:476:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? );
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
            // Query.g:477:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? )
            int alt47=7;
            switch ( input.LA(1) ) {
            case HASH:
            case INT:
            case REAL:
            case STAR:
            case STRING:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 62:
            case 72:
            case 74:
            case 78:
            case 86:
                {
                alt47=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt47=1;
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
                case 54:
                case 58:
                case 59:
                case 61:
                case 64:
                case 65:
                case 80:
                case 85:
                case 88:
                    {
                    alt47=3;
                    }
                    break;
                case DOT:
                    {
                    switch ( input.LA(3) ) {
                    case 53:
                        {
                        alt47=6;
                        }
                        break;
                    case 57:
                        {
                        alt47=7;
                        }
                        break;
                    case IDENT:
                    case 67:
                    case 73:
                    case 75:
                    case 76:
                    case 77:
                    case 83:
                    case 84:
                        {
                        alt47=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 7, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 2, input);

                    throw nvae;

                }

                }
                break;
            case AT:
                {
                alt47=2;
                }
                break;
            case 67:
            case 73:
            case 75:
            case 76:
            case 77:
            case 83:
            case 84:
                {
                alt47=3;
                }
                break;
            case LPAREN:
                {
                alt47=4;
                }
                break;
            case 63:
                {
                alt47=5;
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
                    // Query.g:478:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression2213);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nLit; }

                    }
                    break;
                case 2 :
                    // Query.g:479:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression2227);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nOr; }

                    }
                    break;
                case 3 :
                    // Query.g:480:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression2239);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPc; }

                    }
                    break;
                case 4 :
                    // Query.g:481:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression2250); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression2254);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression2256); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExp; }

                    }
                    break;
                case 5 :
                    // Query.g:482:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression2268);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nIfExp; }

                    }
                    break;
                case 6 :
                    // Query.g:483:7: id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression2280); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression2282); if (state.failed) return n;

                    match(input,53,FOLLOW_53_in_primaryExpression2284); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }

                    // Query.g:485:9: ( AT 'pre' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==AT) ) {
                        int LA44_1 = input.LA(2);

                        if ( (LA44_1==81) ) {
                            alt44=1;
                        }
                    }
                    switch (alt44) {
                        case 1 :
                            // Query.g:485:11: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression2307); if (state.failed) return n;

                            match(input,81,FOLLOW_81_in_primaryExpression2309); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setIsPre(); }

                            }
                            break;

                    }


                    // Query.g:486:9: ( LPAREN RPAREN )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==LPAREN) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // Query.g:486:11: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression2327); if (state.failed) return n;

                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression2329); if (state.failed) return n;

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // Query.g:487:7: id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )?
                    {
                    id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression2342); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression2344); if (state.failed) return n;

                    match(input,57,FOLLOW_57_in_primaryExpression2346); if (state.failed) return n;

                    // Query.g:487:31: ( LPAREN idExp= expression RPAREN )
                    // Query.g:487:33: LPAREN idExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression2350); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression2354);
                    idExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression2356); if (state.failed) return n;

                    }


                    if ( state.backtracking==0 ) { n = new ASTObjectByUseIdExpression(id2, idExp); }

                    // Query.g:489:7: ( AT 'pre' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==AT) ) {
                        int LA46_1 = input.LA(2);

                        if ( (LA46_1==81) ) {
                            alt46=1;
                        }
                    }
                    switch (alt46) {
                        case 1 :
                            // Query.g:489:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression2376); if (state.failed) return n;

                            match(input,81,FOLLOW_81_in_primaryExpression2378); if (state.failed) return n;

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
    // Query.g:493:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;


        Token objectName=null;

        try {
            // Query.g:494:3: ( AT objectName= IDENT )
            // Query.g:495:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference2404); if (state.failed) return n;

            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference2412); if (state.failed) return n;

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
    // Query.g:509:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExpQuery =null;

        ASTExpression nExpIterate =null;

        QueryParser.operationExpression_return nExpOperation =null;

        ASTTypeArgExpression nExpType =null;

        ASTInStateExpression nExpInState =null;


        try {
            // Query.g:510:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] )
            int alt48=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA48_1 = input.LA(2);

                if ( (((( input.LA(2) == LPAREN )&&( input.LA(2) == LPAREN ))&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))) ) {
                    alt48=1;
                }
                else if ( (true) ) {
                    alt48=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;

                }
                }
                break;
            case 67:
                {
                alt48=2;
                }
                break;
            case 73:
            case 76:
            case 77:
            case 83:
            case 84:
                {
                alt48=4;
                }
                break;
            case 75:
                {
                alt48=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }

            switch (alt48) {
                case 1 :
                    // Query.g:514:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }

                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }

                    pushFollow(FOLLOW_queryExpression_in_propertyCall2477);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpQuery; }

                    }
                    break;
                case 2 :
                    // Query.g:517:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall2490);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpIterate; }

                    }
                    break;
                case 3 :
                    // Query.g:518:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall2503);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExpOperation!=null?nExpOperation.n:null); }

                    }
                    break;
                case 4 :
                    // Query.g:519:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall2516);
                    nExpType=typeExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpType; }

                    }
                    break;
                case 5 :
                    // Query.g:520:7: nExpInState= inStateExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_inStateExpression_in_propertyCall2529);
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
    // Query.g:529:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTElemVarsDeclaration decls =null;

        ASTExpression nExp =null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // Query.g:530:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // Query.g:531:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression2564); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression2571); if (state.failed) return n;

            // Query.g:533:5: (decls= elemVarsDeclaration BAR )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==IDENT) ) {
                int LA49_1 = input.LA(2);

                if ( ((LA49_1 >= BAR && LA49_1 <= COLON)||LA49_1==COMMA) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // Query.g:533:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression2582);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {decl = decls;}

                    match(input,BAR,FOLLOW_BAR_in_queryExpression2586); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_queryExpression2597);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression2603); if (state.failed) return n;

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
    // Query.g:547:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTElemVarsDeclaration decls =null;

        ASTVariableInitialization init =null;

        ASTExpression nExp =null;


        try {
            // Query.g:547:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // Query.g:548:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,67,FOLLOW_67_in_iterateExpression2635); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression2641); if (state.failed) return n;

            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression2649);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;

            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression2651); if (state.failed) return n;

            pushFollow(FOLLOW_variableInitialization_in_iterateExpression2659);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;

            match(input,BAR,FOLLOW_BAR_in_iterateExpression2661); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_iterateExpression2669);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression2675); if (state.failed) return n;

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
    // Query.g:569:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final QueryParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        QueryParser.operationExpression_return retval = new QueryParser.operationExpression_return();
        retval.start = input.LT(1);


        Token name=null;
        ASTExpression rolename =null;

        ASTExpression e =null;


        try {
            // Query.g:571:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // Query.g:572:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression2719); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }

            // Query.g:578:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==LBRACK) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // Query.g:578:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2741); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_operationExpression2754);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier(rolename); }

                    // Query.g:580:9: ( COMMA rolename= expression )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==COMMA) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // Query.g:580:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2767); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_operationExpression2771);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier(rolename); }

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2783); if (state.failed) return retval;

                    // Query.g:583:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==LBRACK) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // Query.g:583:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2800); if (state.failed) return retval;

                            pushFollow(FOLLOW_expression_in_operationExpression2815);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addQualifier(rolename); }

                            // Query.g:585:11: ( COMMA rolename= expression )*
                            loop51:
                            do {
                                int alt51=2;
                                int LA51_0 = input.LA(1);

                                if ( (LA51_0==COMMA) ) {
                                    alt51=1;
                                }


                                switch (alt51) {
                            	case 1 :
                            	    // Query.g:585:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2830); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression2834);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addQualifier(rolename); }

                            	    }
                            	    break;

                            	default :
                            	    break loop51;
                                }
                            } while (true);


                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2848); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            // Query.g:590:5: ( AT 'pre' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==AT) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==81) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // Query.g:590:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression2873); if (state.failed) return retval;

                    match(input,81,FOLLOW_81_in_operationExpression2875); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.setIsPre(); }

                    }
                    break;

            }


            // Query.g:592:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==LPAREN) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // Query.g:593:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression2900); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.hasParentheses(); }

                    // Query.g:594:7: (e= expression ( COMMA e= expression )* )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==AT||LA56_0==HASH||(LA56_0 >= IDENT && LA56_0 <= INT)||(LA56_0 >= LPAREN && LA56_0 <= MINUS)||LA56_0==PLUS||LA56_0==REAL||(LA56_0 >= STAR && LA56_0 <= STRING)||(LA56_0 >= 45 && LA56_0 <= 51)||(LA56_0 >= 62 && LA56_0 <= 63)||(LA56_0 >= 67 && LA56_0 <= 68)||(LA56_0 >= 71 && LA56_0 <= 78)||(LA56_0 >= 83 && LA56_0 <= 84)||LA56_0==86) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // Query.g:595:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression2921);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addArg(e); }

                            // Query.g:596:7: ( COMMA e= expression )*
                            loop55:
                            do {
                                int alt55=2;
                                int LA55_0 = input.LA(1);

                                if ( (LA55_0==COMMA) ) {
                                    alt55=1;
                                }


                                switch (alt55) {
                            	case 1 :
                            	    // Query.g:596:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2933); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression2937);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addArg(e); }

                            	    }
                            	    break;

                            	default :
                            	    break loop55;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression2957); if (state.failed) return retval;

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
    // Query.g:603:1: inStateExpression[ASTExpression source, boolean followsArrow] returns [ASTInStateExpression n] : opToken= 'oclInState' LPAREN s= IDENT RPAREN ;
    public final ASTInStateExpression inStateExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTInStateExpression n = null;


        Token opToken=null;
        Token s=null;

        try {
            // Query.g:604:35: (opToken= 'oclInState' LPAREN s= IDENT RPAREN )
            // Query.g:605:4: opToken= 'oclInState' LPAREN s= IDENT RPAREN
            {
            opToken=(Token)match(input,75,FOLLOW_75_in_inStateExpression2994); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_inStateExpression2999); if (state.failed) return n;

            s=(Token)match(input,IDENT,FOLLOW_IDENT_in_inStateExpression3008); if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_inStateExpression3013); if (state.failed) return n;

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
    // Query.g:617:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;


        ASTType t =null;


         Token opToken = null; 
        try {
            // Query.g:620:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN )
            // Query.g:621:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) { opToken = input.LT(1); }

            if ( input.LA(1)==73||(input.LA(1) >= 76 && input.LA(1) <= 77)||(input.LA(1) >= 83 && input.LA(1) <= 84) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression3073); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_typeExpression3077);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression3079); if (state.failed) return n;

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
    // Query.g:632:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;


        Token var1=null;
        Token varN=null;
        ASTType t =null;

        ASTType tN =null;


        try {
            // Query.g:633:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // Query.g:634:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }

            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration3117); if (state.failed) return n;

            // Query.g:635:17: ( COLON t= type )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==COLON) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // Query.g:635:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration3120); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_elemVarsDeclaration3124);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}

            // Query.g:636:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==COMMA) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // Query.g:636:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration3134); if (state.failed) return n;

            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration3140); if (state.failed) return n;

            	    // Query.g:636:24: ( COLON tN= type )?
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==COLON) ) {
            	        alt59=1;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // Query.g:636:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration3143); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration3149);
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
            	    break loop60;
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
    // Query.g:644:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;


        Token name=null;
        ASTType t =null;

        ASTExpression e =null;


        try {
            // Query.g:645:5: (name= IDENT COLON t= type EQUAL e= expression )
            // Query.g:646:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization3177); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableInitialization3179); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableInitialization3183);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization3185); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_variableInitialization3189);
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
    // Query.g:655:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTExpression cond =null;

        ASTExpression t =null;

        ASTExpression e =null;


        try {
            // Query.g:656:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // Query.g:657:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,63,FOLLOW_63_in_ifExpression3221); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression3225);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,85,FOLLOW_85_in_ifExpression3227); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression3231);
            t=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,59,FOLLOW_59_in_ifExpression3233); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression3237);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,61,FOLLOW_61_in_ifExpression3239); if (state.failed) return n;

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
    // Query.g:676:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR );
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
            // Query.g:677:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR )
            int alt61=12;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt61=1;
                }
                break;
            case 62:
                {
                alt61=2;
                }
                break;
            case INT:
                {
                alt61=3;
                }
                break;
            case REAL:
                {
                alt61=4;
                }
                break;
            case STRING:
                {
                alt61=5;
                }
                break;
            case HASH:
                {
                alt61=6;
                }
                break;
            case IDENT:
                {
                alt61=7;
                }
                break;
            case 45:
            case 47:
            case 48:
            case 49:
                {
                int LA61_8 = input.LA(2);

                if ( (LA61_8==LPAREN) ) {
                    alt61=9;
                }
                else if ( (LA61_8==LBRACE) ) {
                    alt61=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 8, input);

                    throw nvae;

                }
                }
                break;
            case 46:
            case 74:
                {
                alt61=9;
                }
                break;
            case 51:
            case 72:
            case 78:
                {
                alt61=10;
                }
                break;
            case 50:
                {
                alt61=11;
                }
                break;
            case STAR:
                {
                alt61=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }

            switch (alt61) {
                case 1 :
                    // Query.g:678:7: t= 'true'
                    {
                    t=(Token)match(input,86,FOLLOW_86_in_literal3278); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }

                    }
                    break;
                case 2 :
                    // Query.g:679:7: f= 'false'
                    {
                    f=(Token)match(input,62,FOLLOW_62_in_literal3292); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }

                    }
                    break;
                case 3 :
                    // Query.g:680:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal3305); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }

                    }
                    break;
                case 4 :
                    // Query.g:681:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal3320); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }

                    }
                    break;
                case 5 :
                    // Query.g:682:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal3334); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }

                    }
                    break;
                case 6 :
                    // Query.g:683:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal3344); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal3348); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}

                    }
                    break;
                case 7 :
                    // Query.g:684:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal3360); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal3362); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal3366); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }

                    }
                    break;
                case 8 :
                    // Query.g:685:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal3378);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nColIt; }

                    }
                    break;
                case 9 :
                    // Query.g:686:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal3390);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nEColIt; }

                    }
                    break;
                case 10 :
                    // Query.g:687:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal3402);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nUndLit; }

                    }
                    break;
                case 11 :
                    // Query.g:688:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal3414);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nTupleLit; }

                    }
                    break;
                case 12 :
                    // Query.g:689:7: un= STAR
                    {
                    un=(Token)match(input,STAR,FOLLOW_STAR_in_literal3426); if (state.failed) return n;

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
    // Query.g:697:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;


        ASTCollectionItem ci =null;


         Token op = null; 
        try {
            // Query.g:699:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // Query.g:700:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( input.LA(1)==45||(input.LA(1) >= 47 && input.LA(1) <= 49) ) {
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

            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral3493); if (state.failed) return n;

            // Query.g:704:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==AT||LA63_0==HASH||(LA63_0 >= IDENT && LA63_0 <= INT)||(LA63_0 >= LPAREN && LA63_0 <= MINUS)||LA63_0==PLUS||LA63_0==REAL||(LA63_0 >= STAR && LA63_0 <= STRING)||(LA63_0 >= 45 && LA63_0 <= 51)||(LA63_0 >= 62 && LA63_0 <= 63)||(LA63_0 >= 67 && LA63_0 <= 68)||(LA63_0 >= 71 && LA63_0 <= 78)||(LA63_0 >= 83 && LA63_0 <= 84)||LA63_0==86) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // Query.g:705:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral3510);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addItem(ci); }

                    // Query.g:706:7: ( COMMA ci= collectionItem )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==COMMA) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // Query.g:706:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral3523); if (state.failed) return n;

                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral3527);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addItem(ci); }

                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral3546); if (state.failed) return n;

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
    // Query.g:715:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;


        ASTExpression e =null;


         n = new ASTCollectionItem(); 
        try {
            // Query.g:717:5: (e= expression ( DOTDOT e= expression )? )
            // Query.g:718:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem3575);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setFirst(e); }

            // Query.g:719:5: ( DOTDOT e= expression )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==DOTDOT) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // Query.g:719:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem3586); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_collectionItem3590);
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
    // Query.g:729:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;


        ASTCollectionType t =null;


        try {
            // Query.g:730:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==74) ) {
                alt65=1;
            }
            else if ( ((LA65_0 >= 45 && LA65_0 <= 49)) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }
            switch (alt65) {
                case 1 :
                    // Query.g:731:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,74,FOLLOW_74_in_emptyCollectionLiteral3619); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral3621); if (state.failed) return n;

                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral3625);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral3627); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;
                case 2 :
                    // Query.g:734:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral3643);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral3645); if (state.failed) return n;

                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral3647); if (state.failed) return n;

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
    // Query.g:745:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;


        ASTType t =null;


        try {
            // Query.g:746:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt66=4;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt66=1;
                }
                break;
            case 51:
                {
                alt66=2;
                }
                break;
            case 72:
                {
                int LA66_3 = input.LA(2);

                if ( (LA66_3==LPAREN) ) {
                    alt66=3;
                }
                else if ( (LA66_3==EOF||(LA66_3 >= ARROW && LA66_3 <= BAR)||(LA66_3 >= COMMA && LA66_3 <= EQUAL)||(LA66_3 >= GREATER && LA66_3 <= GREATER_EQUAL)||(LA66_3 >= LESS && LA66_3 <= LESS_EQUAL)||LA66_3==MINUS||(LA66_3 >= NOT_EQUAL && LA66_3 <= PLUS)||(LA66_3 >= RBRACE && LA66_3 <= RBRACK)||LA66_3==RPAREN||LA66_3==SLASH||LA66_3==STAR||LA66_3==54||(LA66_3 >= 58 && LA66_3 <= 59)||LA66_3==61||(LA66_3 >= 64 && LA66_3 <= 65)||LA66_3==80||LA66_3==85||LA66_3==88) ) {
                    alt66=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;

            }

            switch (alt66) {
                case 1 :
                    // Query.g:747:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,78,FOLLOW_78_in_undefinedLiteral3677); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3679); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral3683);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3685); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 2 :
                    // Query.g:750:5: 'Undefined'
                    {
                    match(input,51,FOLLOW_51_in_undefinedLiteral3699); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;
                case 3 :
                    // Query.g:753:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,72,FOLLOW_72_in_undefinedLiteral3713); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3715); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral3719);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3721); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 4 :
                    // Query.g:756:5: 'null'
                    {
                    match(input,72,FOLLOW_72_in_undefinedLiteral3735); if (state.failed) return n;

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
    // Query.g:766:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;


        ASTTupleItem ti =null;


         List tiList = new ArrayList(); 
        try {
            // Query.g:768:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // Query.g:769:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,50,FOLLOW_50_in_tupleLiteral3774); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral3780); if (state.failed) return n;

            pushFollow(FOLLOW_tupleItem_in_tupleLiteral3788);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tiList.add(ti); }

            // Query.g:772:5: ( COMMA ti= tupleItem )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==COMMA) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // Query.g:772:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral3799); if (state.failed) return n;

            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral3803);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tiList.add(ti); }

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral3814); if (state.failed) return n;

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
    // Query.g:780:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;


        Token name=null;
        ASTType t =null;

        ASTExpression e =null;


        try {
            // Query.g:781:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // Query.g:782:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem3845); if (state.failed) return n;

            // Query.g:783:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==COLON) ) {
                int LA68_1 = input.LA(2);

                if ( (synpred1_Query()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA68_0==EQUAL) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;

            }
            switch (alt68) {
                case 1 :
                    // Query.g:786:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem3884); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_tupleItem3888);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem3890); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_tupleItem3894);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, e); }

                    }
                    break;
                case 2 :
                    // Query.g:789:7: ( COLON | EQUAL ) e= expression
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


                    pushFollow(FOLLOW_expression_in_tupleItem3926);
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
    // Query.g:800:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;


        ASTSimpleType nTSimple =null;

        ASTCollectionType nTCollection =null;

        ASTTupleType nTTuple =null;


         Token tok = null; 
        try {
            // Query.g:802:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
            // Query.g:803:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }

            // Query.g:804:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            int alt69=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt69=1;
                }
                break;
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                {
                alt69=2;
                }
                break;
            case 50:
                {
                alt69=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }

            switch (alt69) {
                case 1 :
                    // Query.g:805:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type3992);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 2 :
                    // Query.g:806:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type4004);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 3 :
                    // Query.g:807:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type4016);
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
    // Query.g:812:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;


        ASTType nT =null;


        try {
            // Query.g:813:5: (nT= type EOF )
            // Query.g:814:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly4048);
            nT=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_typeOnly4050); if (state.failed) return n;

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
    // Query.g:824:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;


        Token name=null;

        try {
            // Query.g:825:5: (name= IDENT )
            // Query.g:826:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType4078); if (state.failed) return n;

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
    // Query.g:834:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;


        ASTType elemType =null;


         Token op = null; 
        try {
            // Query.g:836:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // Query.g:837:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( (input.LA(1) >= 45 && input.LA(1) <= 49) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType4143); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_collectionType4147);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType4149); if (state.failed) return n;

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
    // Query.g:847:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;


        ASTTuplePart tp =null;


         List tpList = new ArrayList(); 
        try {
            // Query.g:849:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // Query.g:850:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,50,FOLLOW_50_in_tupleType4183); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType4185); if (state.failed) return n;

            pushFollow(FOLLOW_tuplePart_in_tupleType4194);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tpList.add(tp); }

            // Query.g:852:5: ( COMMA tp= tuplePart )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==COMMA) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // Query.g:852:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType4205); if (state.failed) return n;

            	    pushFollow(FOLLOW_tuplePart_in_tupleType4209);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tpList.add(tp); }

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType4221); if (state.failed) return n;

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
    // Query.g:861:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Query.g:862:5: (name= IDENT COLON t= type )
            // Query.g:863:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart4253); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_tuplePart4255); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_tuplePart4259);
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
        // Query.g:786:7: ( COLON type EQUAL )
        // Query.g:786:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred1_Query3875); if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred1_Query3877);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_Query3879); if (state.failed) return ;

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


 

    public static final BitSet FOLLOW_abstractQueryExpr_in_checkExpr57 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_checkExpr61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleExpr_in_checkExpr79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_moduleExpr_in_checkExpr95 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_EOF_in_checkExpr101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpr_in_abstractQueryExpr119 = new BitSet(new long[]{0x0000100084000002L});
    public static final BitSet FOLLOW_PLUS_in_abstractQueryExpr147 = new BitSet(new long[]{0x0000000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_queryExpr_in_abstractQueryExpr151 = new BitSet(new long[]{0x0000100084000002L});
    public static final BitSet FOLLOW_MINUS_in_abstractQueryExpr209 = new BitSet(new long[]{0x0000000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_queryExpr_in_abstractQueryExpr213 = new BitSet(new long[]{0x0000100084000002L});
    public static final BitSet FOLLOW_44_in_abstractQueryExpr272 = new BitSet(new long[]{0x0000000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_queryExpr_in_abstractQueryExpr278 = new BitSet(new long[]{0x0000100084000002L});
    public static final BitSet FOLLOW_82_in_queryExpr343 = new BitSet(new long[]{0x0010010000080000L,0x0000000000008040L});
    public static final BitSet FOLLOW_featureExpr_in_queryExpr347 = new BitSet(new long[]{0x0180000000000402L,0x0000000000800004L});
    public static final BitSet FOLLOW_COMMA_in_queryExpr352 = new BitSet(new long[]{0x0010010000080000L,0x0000000000008040L});
    public static final BitSet FOLLOW_featureExpr_in_queryExpr356 = new BitSet(new long[]{0x0180000000000402L,0x0000000000800004L});
    public static final BitSet FOLLOW_withExpr_in_queryExpr374 = new BitSet(new long[]{0x0180000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_butExpr_in_queryExpr392 = new BitSet(new long[]{0x0080000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_queryExpr399 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_injExpr_in_queryExpr403 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_queryExpr418 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_queryExpr422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpr438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleAlias_in_queryExpr449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_moduleAlias475 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_moduleAlias483 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_moduleAlias487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_featureExpr524 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_featureExpr531 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rankExpr_in_featureExpr540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_featureExpr559 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_attrExpr_in_featureExpr568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assocExpr_in_featureExpr582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_modifiers600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_modifiers614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_modifiers624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attrExpr644 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_attrExpr650 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_attrExpr654 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rankExpr_in_attrExpr663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assocExpr687 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_assocExpr693 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_assocExpr697 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_assocExpr703 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_assocExpr707 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rankExpr_in_assocExpr716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_withExpr745 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_invExpr_in_withExpr749 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_withExpr753 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_invExpr_in_withExpr757 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_56_in_butExpr781 = new BitSet(new long[]{0x0010010000080000L,0x0000000000008040L});
    public static final BitSet FOLLOW_featureExpr_in_butExpr786 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_invExpr_in_butExpr795 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_butExpr806 = new BitSet(new long[]{0x0010010000080000L,0x0000000000008040L});
    public static final BitSet FOLLOW_featureExpr_in_butExpr811 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_invExpr_in_butExpr819 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_set_in_invExpr843 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_invExpr849 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_invExpr853 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rankExpr_in_invExpr862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_rankExpr891 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_INT_in_rankExpr895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_moduleExpr913 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_moduleExpr917 = new BitSet(new long[]{0x0000000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_abstractQueryExpr_in_moduleExpr931 = new BitSet(new long[]{0x1000000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_abstractQueryExpr_in_moduleExpr947 = new BitSet(new long[]{0x1000000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_60_in_moduleExpr967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_injExpr988 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_injExpr992 = new BitSet(new long[]{0x0000000200000420L});
    public static final BitSet FOLLOW_rankExpr_in_injExpr997 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_injExpr1014 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_injExpr1018 = new BitSet(new long[]{0x0000000200000420L});
    public static final BitSet FOLLOW_rankExpr_in_injExpr1023 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_injExpr1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly1072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_expression1122 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression1133 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression1137 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_expression1141 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression1146 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_expression1150 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_expression1188 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression1200 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression1204 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_expression1208 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression1213 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_expression1217 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_expression1258 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList1307 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList1324 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_paramList1336 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList1340 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_paramList1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList1389 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_idList1399 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_idList1403 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration1434 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration1436 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1476 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_conditionalImpliesExpression1489 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F88L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1493 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1538 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_conditionalOrExpression1551 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F88L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1555 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1599 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_conditionalXOrExpression1612 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F88L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1616 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1660 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_conditionalAndExpression1673 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F88L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1677 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1725 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_set_in_equalityExpression1744 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F88L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1754 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1803 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_set_in_relationalExpression1821 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F88L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1839 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1889 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression1907 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F88L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1917 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1967 = new BitSet(new long[]{0x0400014000000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1985 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F88L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1999 = new BitSet(new long[]{0x0400014000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpression2061 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F88L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression2138 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression2156 = new BitSet(new long[]{0x0000000000080000L,0x0000000000183A08L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression2162 = new BitSet(new long[]{0x0000000000080000L,0x0000000000183A08L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression2173 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_literal_in_primaryExpression2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression2250 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_primaryExpression2254 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression2280 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression2282 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_primaryExpression2284 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression2307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_primaryExpression2309 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression2327 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression2342 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression2344 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_primaryExpression2346 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression2350 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_primaryExpression2354 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression2356 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression2376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_primaryExpression2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference2404 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_objectReference2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inStateExpression_in_propertyCall2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression2564 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression2571 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression2582 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_queryExpression2586 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_queryExpression2597 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_iterateExpression2635 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression2641 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression2649 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression2651 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression2659 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression2661 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_iterateExpression2669 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression2719 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2741 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_operationExpression2754 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2767 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_operationExpression2771 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2783 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2800 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_operationExpression2815 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2830 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_operationExpression2834 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2848 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_operationExpression2873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_operationExpression2875 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression2900 = new BitSet(new long[]{0xC00FE318861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_operationExpression2921 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2933 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_operationExpression2937 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_inStateExpression2994 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_inStateExpression2999 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_inStateExpression3008 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_inStateExpression3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression3049 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression3073 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_typeExpression3077 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration3117 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration3120 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration3124 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration3134 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration3140 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration3143 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration3149 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization3177 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization3179 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_variableInitialization3183 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization3185 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_variableInitialization3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ifExpression3221 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_ifExpression3225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ifExpression3227 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_ifExpression3231 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ifExpression3233 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_ifExpression3237 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ifExpression3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_literal3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_literal3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal3344 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal3360 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal3362 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_literal3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral3464 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral3493 = new BitSet(new long[]{0xC00FE30A861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral3510 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral3523 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral3527 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem3575 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem3586 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_collectionItem3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_emptyCollectionLiteral3619 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral3621 = new BitSet(new long[]{0x0003E00000000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral3625 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral3643 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral3645 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_undefinedLiteral3677 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3679 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3683 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_undefinedLiteral3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_undefinedLiteral3713 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3715 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3719 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_undefinedLiteral3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_tupleLiteral3774 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral3780 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3788 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral3799 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3803 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem3845 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_tupleItem3884 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_tupleItem3888 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem3890 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_tupleItem3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem3916 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_tupleItem3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type4016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly4048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType4116 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType4143 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_collectionType4147 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType4149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_tupleType4183 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType4185 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType4194 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleType4205 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType4209 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType4221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart4253 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_tuplePart4255 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_tuplePart4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_synpred1_Query3875 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_synpred1_Query3877 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred1_Query3879 = new BitSet(new long[]{0x0000000000000002L});

}