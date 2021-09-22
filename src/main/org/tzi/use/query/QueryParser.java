// $ANTLR 3.4 Query.g 2021-09-22 15:15:24

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

            if ( state.backtracking==0 ) {mexpr.addQuery(query);query.setModule(mexpr);}

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

            	    if ( state.backtracking==0 ) {mexpr.addQuery(query);query.setModule(mexpr);}

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            match(input,60,FOLLOW_60_in_moduleExpr957); if (state.failed) return mexpr;

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
    // Query.g:186:1: injExpr returns [QOCLExpr ocl_expr] : LBRACE expr= expression (k= rankExpr )? ( COMMA expr= expression (k= rankExpr )? )* RBRACE ;
    public final QOCLExpr injExpr() throws RecognitionException {
        QOCLExpr ocl_expr = null;


        ASTExpression expr =null;

        int k =0;



            ocl_expr = new QOCLExpr();

        try {
            // Query.g:188:2: ( LBRACE expr= expression (k= rankExpr )? ( COMMA expr= expression (k= rankExpr )? )* RBRACE )
            // Query.g:189:5: LBRACE expr= expression (k= rankExpr )? ( COMMA expr= expression (k= rankExpr )? )* RBRACE
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_injExpr978); if (state.failed) return ocl_expr;

            pushFollow(FOLLOW_expression_in_injExpr982);
            expr=expression();

            state._fsp--;
            if (state.failed) return ocl_expr;

            // Query.g:189:28: (k= rankExpr )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==AT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Query.g:189:29: k= rankExpr
                    {
                    pushFollow(FOLLOW_rankExpr_in_injExpr987);
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

            // Query.g:196:5: ( COMMA expr= expression (k= rankExpr )? )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==COMMA) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Query.g:196:6: COMMA expr= expression (k= rankExpr )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_injExpr1004); if (state.failed) return ocl_expr;

            	    pushFollow(FOLLOW_expression_in_injExpr1008);
            	    expr=expression();

            	    state._fsp--;
            	    if (state.failed) return ocl_expr;

            	    // Query.g:196:28: (k= rankExpr )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==AT) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // Query.g:196:29: k= rankExpr
            	            {
            	            pushFollow(FOLLOW_rankExpr_in_injExpr1013);
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


            match(input,RBRACE,FOLLOW_RBRACE_in_injExpr1035); if (state.failed) return ocl_expr;

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
    // Query.g:232:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExp =null;


        try {
            // Query.g:233:5: (nExp= expression EOF )
            // Query.g:234:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly1062);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_expressionOnly1064); if (state.failed) return n;

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
    // Query.g:241:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
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
            // Query.g:247:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
            // Query.g:248:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }

            // Query.g:249:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==68) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // Query.g:250:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
            	    {
            	    match(input,68,FOLLOW_68_in_expression1112); if (state.failed) return n;

            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression1123); if (state.failed) return n;

            	    // Query.g:251:18: ( COLON t= type )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==COLON) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // Query.g:251:20: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression1127); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_expression1131);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression1136); if (state.failed) return n;

            	    pushFollow(FOLLOW_expression_in_expression1140);
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

            	    // Query.g:261:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==COMMA) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // Query.g:262:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_expression1178); if (state.failed) return n;

            	    	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression1190); if (state.failed) return n;

            	    	    // Query.g:263:20: ( COLON t= type )?
            	    	    int alt27=2;
            	    	    int LA27_0 = input.LA(1);

            	    	    if ( (LA27_0==COLON) ) {
            	    	        alt27=1;
            	    	    }
            	    	    switch (alt27) {
            	    	        case 1 :
            	    	            // Query.g:263:22: COLON t= type
            	    	            {
            	    	            match(input,COLON,FOLLOW_COLON_in_expression1194); if (state.failed) return n;

            	    	            pushFollow(FOLLOW_type_in_expression1198);
            	    	            t=type();

            	    	            state._fsp--;
            	    	            if (state.failed) return n;

            	    	            }
            	    	            break;

            	    	    }


            	    	    match(input,EQUAL,FOLLOW_EQUAL_in_expression1203); if (state.failed) return n;

            	    	    pushFollow(FOLLOW_expression_in_expression1207);
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


            	    match(input,65,FOLLOW_65_in_expression1248); if (state.failed) return n;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression1264);
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
    // Query.g:296:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;


        ASTVariableDeclaration v =null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // Query.g:298:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // Query.g:299:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList1297); if (state.failed) return paramList;

            // Query.g:300:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==IDENT) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // Query.g:301:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList1314);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;

                    if ( state.backtracking==0 ) { paramList.add(v); }

                    // Query.g:302:7: ( COMMA v= variableDeclaration )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==COMMA) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // Query.g:302:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList1326); if (state.failed) return paramList;

                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList1330);
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


            match(input,RPAREN,FOLLOW_RPAREN_in_paramList1350); if (state.failed) return paramList;

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
    // Query.g:310:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;


        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // Query.g:312:5: (id0= IDENT ( COMMA idn= IDENT )* )
            // Query.g:313:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList1379); if (state.failed) return idList;

            if ( state.backtracking==0 ) { idList.add(id0); }

            // Query.g:314:5: ( COMMA idn= IDENT )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==COMMA) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // Query.g:314:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList1389); if (state.failed) return idList;

            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList1393); if (state.failed) return idList;

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
    // Query.g:322:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Query.g:323:5: (name= IDENT COLON t= type )
            // Query.g:324:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration1424); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableDeclaration1426); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableDeclaration1430);
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
    // Query.g:332:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndOrExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:333:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // Query.g:334:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1466);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndOrExp;}

            // Query.g:335:5: (op= 'implies' n1= conditionalOrExpression )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==64) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // Query.g:335:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,64,FOLLOW_64_in_conditionalImpliesExpression1479); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1483);
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
    // Query.g:344:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndXorExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:345:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // Query.g:346:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1528);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndXorExp;}

            // Query.g:347:5: (op= 'or' n1= conditionalXOrExpression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==80) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // Query.g:347:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,80,FOLLOW_80_in_conditionalOrExpression1541); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1545);
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
    // Query.g:356:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndAndExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:357:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // Query.g:358:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1589);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndAndExp;}

            // Query.g:359:5: (op= 'xor' n1= conditionalAndExpression )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==88) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // Query.g:359:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,88,FOLLOW_88_in_conditionalXOrExpression1602); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1606);
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
    // Query.g:368:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nEqExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:369:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // Query.g:370:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1650);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nEqExp;}

            // Query.g:371:5: (op= 'and' n1= equalityExpression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==54) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // Query.g:371:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,54,FOLLOW_54_in_conditionalAndExpression1663); if (state.failed) return n;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1667);
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
    // Query.g:380:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nRelExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:382:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // Query.g:383:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1715);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nRelExp;}

            // Query.g:384:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==EQUAL||LA37_0==NOT_EQUAL) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // Query.g:384:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1744);
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
    // Query.g:394:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nAddiExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:396:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // Query.g:397:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1793);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nAddiExp;}

            // Query.g:398:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0 >= GREATER && LA38_0 <= GREATER_EQUAL)||(LA38_0 >= LESS && LA38_0 <= LESS_EQUAL)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // Query.g:398:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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


            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1829);
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
    // Query.g:408:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nMulExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:410:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // Query.g:411:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1879);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nMulExp;}

            // Query.g:412:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==MINUS||LA39_0==PLUS) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // Query.g:412:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1907);
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
    // Query.g:423:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:425:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // Query.g:426:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1957);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nUnExp;}

            // Query.g:427:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==SLASH||LA40_0==STAR||LA40_0==58) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // Query.g:427:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
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


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1989);
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
    // Query.g:439:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression nPosExp =null;


         Token op = null; 
        try {
            // Query.g:441:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
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
                    // Query.g:442:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // Query.g:442:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // Query.g:442:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
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


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2075);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }

                    }


                    }
                    break;
                case 2 :
                    // Query.g:446:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression2095);
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
    // Query.g:454:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nPrimExp =null;

        ASTExpression nPc =null;


         boolean arrow = false; 
        try {
            // Query.g:456:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // Query.g:457:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression2128);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nPrimExp; }

            // Query.g:458:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==ARROW||LA43_0==DOT) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // Query.g:459:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // Query.g:459:6: ( ARROW | DOT )
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
            	            // Query.g:459:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression2146); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = true; }

            	            }
            	            break;
            	        case 2 :
            	            // Query.g:459:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression2152); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = false; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression2163);
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
    // Query.g:475:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? );
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
            // Query.g:476:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? )
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
                    // Query.g:477:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression2203);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nLit; }

                    }
                    break;
                case 2 :
                    // Query.g:478:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression2217);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nOr; }

                    }
                    break;
                case 3 :
                    // Query.g:479:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression2229);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPc; }

                    }
                    break;
                case 4 :
                    // Query.g:480:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression2240); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression2244);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression2246); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExp; }

                    }
                    break;
                case 5 :
                    // Query.g:481:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression2258);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nIfExp; }

                    }
                    break;
                case 6 :
                    // Query.g:482:7: id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression2270); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression2272); if (state.failed) return n;

                    match(input,53,FOLLOW_53_in_primaryExpression2274); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }

                    // Query.g:484:9: ( AT 'pre' )?
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
                            // Query.g:484:11: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression2297); if (state.failed) return n;

                            match(input,81,FOLLOW_81_in_primaryExpression2299); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setIsPre(); }

                            }
                            break;

                    }


                    // Query.g:485:9: ( LPAREN RPAREN )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==LPAREN) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // Query.g:485:11: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression2317); if (state.failed) return n;

                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression2319); if (state.failed) return n;

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // Query.g:486:7: id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )?
                    {
                    id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression2332); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression2334); if (state.failed) return n;

                    match(input,57,FOLLOW_57_in_primaryExpression2336); if (state.failed) return n;

                    // Query.g:486:31: ( LPAREN idExp= expression RPAREN )
                    // Query.g:486:33: LPAREN idExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression2340); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression2344);
                    idExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression2346); if (state.failed) return n;

                    }


                    if ( state.backtracking==0 ) { n = new ASTObjectByUseIdExpression(id2, idExp); }

                    // Query.g:488:7: ( AT 'pre' )?
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
                            // Query.g:488:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression2366); if (state.failed) return n;

                            match(input,81,FOLLOW_81_in_primaryExpression2368); if (state.failed) return n;

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
    // Query.g:492:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;


        Token objectName=null;

        try {
            // Query.g:493:3: ( AT objectName= IDENT )
            // Query.g:494:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference2394); if (state.failed) return n;

            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference2402); if (state.failed) return n;

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
    // Query.g:508:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExpQuery =null;

        ASTExpression nExpIterate =null;

        QueryParser.operationExpression_return nExpOperation =null;

        ASTTypeArgExpression nExpType =null;

        ASTInStateExpression nExpInState =null;


        try {
            // Query.g:509:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] )
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
                    // Query.g:513:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }

                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }

                    pushFollow(FOLLOW_queryExpression_in_propertyCall2467);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpQuery; }

                    }
                    break;
                case 2 :
                    // Query.g:516:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall2480);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpIterate; }

                    }
                    break;
                case 3 :
                    // Query.g:517:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall2493);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExpOperation!=null?nExpOperation.n:null); }

                    }
                    break;
                case 4 :
                    // Query.g:518:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall2506);
                    nExpType=typeExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpType; }

                    }
                    break;
                case 5 :
                    // Query.g:519:7: nExpInState= inStateExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_inStateExpression_in_propertyCall2519);
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
    // Query.g:528:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTElemVarsDeclaration decls =null;

        ASTExpression nExp =null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // Query.g:529:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // Query.g:530:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression2554); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression2561); if (state.failed) return n;

            // Query.g:532:5: (decls= elemVarsDeclaration BAR )?
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
                    // Query.g:532:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression2572);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {decl = decls;}

                    match(input,BAR,FOLLOW_BAR_in_queryExpression2576); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_queryExpression2587);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression2593); if (state.failed) return n;

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
    // Query.g:546:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTElemVarsDeclaration decls =null;

        ASTVariableInitialization init =null;

        ASTExpression nExp =null;


        try {
            // Query.g:546:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // Query.g:547:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,67,FOLLOW_67_in_iterateExpression2625); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression2631); if (state.failed) return n;

            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression2639);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;

            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression2641); if (state.failed) return n;

            pushFollow(FOLLOW_variableInitialization_in_iterateExpression2649);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;

            match(input,BAR,FOLLOW_BAR_in_iterateExpression2651); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_iterateExpression2659);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression2665); if (state.failed) return n;

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
    // Query.g:568:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final QueryParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        QueryParser.operationExpression_return retval = new QueryParser.operationExpression_return();
        retval.start = input.LT(1);


        Token name=null;
        ASTExpression rolename =null;

        ASTExpression e =null;


        try {
            // Query.g:570:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // Query.g:571:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression2709); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }

            // Query.g:577:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==LBRACK) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // Query.g:577:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2731); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_operationExpression2744);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier(rolename); }

                    // Query.g:579:9: ( COMMA rolename= expression )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==COMMA) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // Query.g:579:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2757); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_operationExpression2761);
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


                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2773); if (state.failed) return retval;

                    // Query.g:582:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==LBRACK) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // Query.g:582:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2790); if (state.failed) return retval;

                            pushFollow(FOLLOW_expression_in_operationExpression2805);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addQualifier(rolename); }

                            // Query.g:584:11: ( COMMA rolename= expression )*
                            loop51:
                            do {
                                int alt51=2;
                                int LA51_0 = input.LA(1);

                                if ( (LA51_0==COMMA) ) {
                                    alt51=1;
                                }


                                switch (alt51) {
                            	case 1 :
                            	    // Query.g:584:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2820); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression2824);
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


                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2838); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            // Query.g:589:5: ( AT 'pre' )?
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
                    // Query.g:589:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression2863); if (state.failed) return retval;

                    match(input,81,FOLLOW_81_in_operationExpression2865); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.setIsPre(); }

                    }
                    break;

            }


            // Query.g:591:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==LPAREN) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // Query.g:592:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression2890); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.hasParentheses(); }

                    // Query.g:593:7: (e= expression ( COMMA e= expression )* )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==AT||LA56_0==HASH||(LA56_0 >= IDENT && LA56_0 <= INT)||(LA56_0 >= LPAREN && LA56_0 <= MINUS)||LA56_0==PLUS||LA56_0==REAL||(LA56_0 >= STAR && LA56_0 <= STRING)||(LA56_0 >= 45 && LA56_0 <= 51)||(LA56_0 >= 62 && LA56_0 <= 63)||(LA56_0 >= 67 && LA56_0 <= 68)||(LA56_0 >= 71 && LA56_0 <= 78)||(LA56_0 >= 83 && LA56_0 <= 84)||LA56_0==86) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // Query.g:594:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression2911);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addArg(e); }

                            // Query.g:595:7: ( COMMA e= expression )*
                            loop55:
                            do {
                                int alt55=2;
                                int LA55_0 = input.LA(1);

                                if ( (LA55_0==COMMA) ) {
                                    alt55=1;
                                }


                                switch (alt55) {
                            	case 1 :
                            	    // Query.g:595:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2923); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression2927);
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


                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression2947); if (state.failed) return retval;

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
    // Query.g:602:1: inStateExpression[ASTExpression source, boolean followsArrow] returns [ASTInStateExpression n] : opToken= 'oclInState' LPAREN s= IDENT RPAREN ;
    public final ASTInStateExpression inStateExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTInStateExpression n = null;


        Token opToken=null;
        Token s=null;

        try {
            // Query.g:603:35: (opToken= 'oclInState' LPAREN s= IDENT RPAREN )
            // Query.g:604:4: opToken= 'oclInState' LPAREN s= IDENT RPAREN
            {
            opToken=(Token)match(input,75,FOLLOW_75_in_inStateExpression2984); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_inStateExpression2989); if (state.failed) return n;

            s=(Token)match(input,IDENT,FOLLOW_IDENT_in_inStateExpression2998); if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_inStateExpression3003); if (state.failed) return n;

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
    // Query.g:616:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;


        ASTType t =null;


         Token opToken = null; 
        try {
            // Query.g:619:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN )
            // Query.g:620:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN
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


            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression3063); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_typeExpression3067);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression3069); if (state.failed) return n;

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
    // Query.g:631:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;


        Token var1=null;
        Token varN=null;
        ASTType t =null;

        ASTType tN =null;


        try {
            // Query.g:632:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // Query.g:633:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }

            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration3107); if (state.failed) return n;

            // Query.g:634:17: ( COLON t= type )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==COLON) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // Query.g:634:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration3110); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_elemVarsDeclaration3114);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}

            // Query.g:635:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==COMMA) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // Query.g:635:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration3124); if (state.failed) return n;

            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration3130); if (state.failed) return n;

            	    // Query.g:635:24: ( COLON tN= type )?
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==COLON) ) {
            	        alt59=1;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // Query.g:635:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration3133); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration3139);
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
    // Query.g:643:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;


        Token name=null;
        ASTType t =null;

        ASTExpression e =null;


        try {
            // Query.g:644:5: (name= IDENT COLON t= type EQUAL e= expression )
            // Query.g:645:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization3167); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableInitialization3169); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableInitialization3173);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization3175); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_variableInitialization3179);
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
    // Query.g:654:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTExpression cond =null;

        ASTExpression t =null;

        ASTExpression e =null;


        try {
            // Query.g:655:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // Query.g:656:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,63,FOLLOW_63_in_ifExpression3211); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression3215);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,85,FOLLOW_85_in_ifExpression3217); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression3221);
            t=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,59,FOLLOW_59_in_ifExpression3223); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression3227);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,61,FOLLOW_61_in_ifExpression3229); if (state.failed) return n;

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
    // Query.g:675:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR );
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
            // Query.g:676:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR )
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
                    // Query.g:677:7: t= 'true'
                    {
                    t=(Token)match(input,86,FOLLOW_86_in_literal3268); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }

                    }
                    break;
                case 2 :
                    // Query.g:678:7: f= 'false'
                    {
                    f=(Token)match(input,62,FOLLOW_62_in_literal3282); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }

                    }
                    break;
                case 3 :
                    // Query.g:679:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal3295); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }

                    }
                    break;
                case 4 :
                    // Query.g:680:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal3310); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }

                    }
                    break;
                case 5 :
                    // Query.g:681:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal3324); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }

                    }
                    break;
                case 6 :
                    // Query.g:682:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal3334); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal3338); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}

                    }
                    break;
                case 7 :
                    // Query.g:683:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal3350); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal3352); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal3356); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }

                    }
                    break;
                case 8 :
                    // Query.g:684:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal3368);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nColIt; }

                    }
                    break;
                case 9 :
                    // Query.g:685:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal3380);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nEColIt; }

                    }
                    break;
                case 10 :
                    // Query.g:686:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal3392);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nUndLit; }

                    }
                    break;
                case 11 :
                    // Query.g:687:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal3404);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nTupleLit; }

                    }
                    break;
                case 12 :
                    // Query.g:688:7: un= STAR
                    {
                    un=(Token)match(input,STAR,FOLLOW_STAR_in_literal3416); if (state.failed) return n;

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
    // Query.g:696:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;


        ASTCollectionItem ci =null;


         Token op = null; 
        try {
            // Query.g:698:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // Query.g:699:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
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

            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral3483); if (state.failed) return n;

            // Query.g:703:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==AT||LA63_0==HASH||(LA63_0 >= IDENT && LA63_0 <= INT)||(LA63_0 >= LPAREN && LA63_0 <= MINUS)||LA63_0==PLUS||LA63_0==REAL||(LA63_0 >= STAR && LA63_0 <= STRING)||(LA63_0 >= 45 && LA63_0 <= 51)||(LA63_0 >= 62 && LA63_0 <= 63)||(LA63_0 >= 67 && LA63_0 <= 68)||(LA63_0 >= 71 && LA63_0 <= 78)||(LA63_0 >= 83 && LA63_0 <= 84)||LA63_0==86) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // Query.g:704:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral3500);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addItem(ci); }

                    // Query.g:705:7: ( COMMA ci= collectionItem )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==COMMA) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // Query.g:705:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral3513); if (state.failed) return n;

                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral3517);
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


            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral3536); if (state.failed) return n;

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
    // Query.g:714:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;


        ASTExpression e =null;


         n = new ASTCollectionItem(); 
        try {
            // Query.g:716:5: (e= expression ( DOTDOT e= expression )? )
            // Query.g:717:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem3565);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setFirst(e); }

            // Query.g:718:5: ( DOTDOT e= expression )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==DOTDOT) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // Query.g:718:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem3576); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_collectionItem3580);
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
    // Query.g:728:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;


        ASTCollectionType t =null;


        try {
            // Query.g:729:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
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
                    // Query.g:730:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,74,FOLLOW_74_in_emptyCollectionLiteral3609); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral3611); if (state.failed) return n;

                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral3615);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral3617); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;
                case 2 :
                    // Query.g:733:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral3633);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral3635); if (state.failed) return n;

                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral3637); if (state.failed) return n;

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
    // Query.g:744:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;


        ASTType t =null;


        try {
            // Query.g:745:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
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
                    // Query.g:746:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,78,FOLLOW_78_in_undefinedLiteral3667); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3669); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral3673);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3675); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 2 :
                    // Query.g:749:5: 'Undefined'
                    {
                    match(input,51,FOLLOW_51_in_undefinedLiteral3689); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;
                case 3 :
                    // Query.g:752:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,72,FOLLOW_72_in_undefinedLiteral3703); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3705); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral3709);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3711); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 4 :
                    // Query.g:755:5: 'null'
                    {
                    match(input,72,FOLLOW_72_in_undefinedLiteral3725); if (state.failed) return n;

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
    // Query.g:765:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;


        ASTTupleItem ti =null;


         List tiList = new ArrayList(); 
        try {
            // Query.g:767:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // Query.g:768:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,50,FOLLOW_50_in_tupleLiteral3764); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral3770); if (state.failed) return n;

            pushFollow(FOLLOW_tupleItem_in_tupleLiteral3778);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tiList.add(ti); }

            // Query.g:771:5: ( COMMA ti= tupleItem )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==COMMA) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // Query.g:771:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral3789); if (state.failed) return n;

            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral3793);
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


            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral3804); if (state.failed) return n;

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
    // Query.g:779:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;


        Token name=null;
        ASTType t =null;

        ASTExpression e =null;


        try {
            // Query.g:780:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // Query.g:781:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem3835); if (state.failed) return n;

            // Query.g:782:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
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
                    // Query.g:785:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem3874); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_tupleItem3878);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem3880); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_tupleItem3884);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, e); }

                    }
                    break;
                case 2 :
                    // Query.g:788:7: ( COLON | EQUAL ) e= expression
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


                    pushFollow(FOLLOW_expression_in_tupleItem3916);
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
    // Query.g:799:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;


        ASTSimpleType nTSimple =null;

        ASTCollectionType nTCollection =null;

        ASTTupleType nTTuple =null;


         Token tok = null; 
        try {
            // Query.g:801:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
            // Query.g:802:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }

            // Query.g:803:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
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
                    // Query.g:804:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type3982);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 2 :
                    // Query.g:805:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type3994);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 3 :
                    // Query.g:806:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type4006);
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
    // Query.g:811:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;


        ASTType nT =null;


        try {
            // Query.g:812:5: (nT= type EOF )
            // Query.g:813:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly4038);
            nT=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_typeOnly4040); if (state.failed) return n;

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
    // Query.g:823:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;


        Token name=null;

        try {
            // Query.g:824:5: (name= IDENT )
            // Query.g:825:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType4068); if (state.failed) return n;

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
    // Query.g:833:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;


        ASTType elemType =null;


         Token op = null; 
        try {
            // Query.g:835:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // Query.g:836:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
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


            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType4133); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_collectionType4137);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType4139); if (state.failed) return n;

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
    // Query.g:846:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;


        ASTTuplePart tp =null;


         List tpList = new ArrayList(); 
        try {
            // Query.g:848:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // Query.g:849:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,50,FOLLOW_50_in_tupleType4173); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType4175); if (state.failed) return n;

            pushFollow(FOLLOW_tuplePart_in_tupleType4184);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tpList.add(tp); }

            // Query.g:851:5: ( COMMA tp= tuplePart )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==COMMA) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // Query.g:851:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType4195); if (state.failed) return n;

            	    pushFollow(FOLLOW_tuplePart_in_tupleType4199);
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


            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType4211); if (state.failed) return n;

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
    // Query.g:860:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Query.g:861:5: (name= IDENT COLON t= type )
            // Query.g:862:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart4243); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_tuplePart4245); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_tuplePart4249);
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
        // Query.g:785:7: ( COLON type EQUAL )
        // Query.g:785:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred1_Query3865); if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred1_Query3867);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_Query3869); if (state.failed) return ;

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
    public static final BitSet FOLLOW_60_in_moduleExpr957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_injExpr978 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_injExpr982 = new BitSet(new long[]{0x0000000200000420L});
    public static final BitSet FOLLOW_rankExpr_in_injExpr987 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_injExpr1004 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_injExpr1008 = new BitSet(new long[]{0x0000000200000420L});
    public static final BitSet FOLLOW_rankExpr_in_injExpr1013 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_injExpr1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly1062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_expression1112 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression1123 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression1127 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_expression1131 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression1136 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_expression1140 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_expression1178 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression1190 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression1194 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_expression1198 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression1203 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_expression1207 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_expression1248 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList1297 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList1314 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_paramList1326 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList1330 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_paramList1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList1379 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_idList1389 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_idList1393 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration1424 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration1426 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1466 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_conditionalImpliesExpression1479 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F88L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1483 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1528 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_conditionalOrExpression1541 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F88L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1545 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1589 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_conditionalXOrExpression1602 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F88L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1606 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1650 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_conditionalAndExpression1663 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F88L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1667 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1715 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_set_in_equalityExpression1734 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F88L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1744 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1793 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_set_in_relationalExpression1811 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F88L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1829 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1879 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression1897 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F88L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1907 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1957 = new BitSet(new long[]{0x0400014000000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1975 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F88L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1989 = new BitSet(new long[]{0x0400014000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpression2051 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F88L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression2128 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression2146 = new BitSet(new long[]{0x0000000000080000L,0x0000000000183A08L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression2152 = new BitSet(new long[]{0x0000000000080000L,0x0000000000183A08L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression2163 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_literal_in_primaryExpression2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression2240 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_primaryExpression2244 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression2270 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression2272 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_primaryExpression2274 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression2297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_primaryExpression2299 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression2317 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression2332 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression2334 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_primaryExpression2336 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression2340 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_primaryExpression2344 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression2346 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression2366 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_primaryExpression2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference2394 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_objectReference2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inStateExpression_in_propertyCall2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression2554 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression2561 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression2572 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_queryExpression2576 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_queryExpression2587 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_iterateExpression2625 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression2631 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression2639 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression2641 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression2649 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression2651 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_iterateExpression2659 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression2709 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2731 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_operationExpression2744 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2757 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_operationExpression2761 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2773 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2790 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_operationExpression2805 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2820 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_operationExpression2824 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2838 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_operationExpression2863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_operationExpression2865 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression2890 = new BitSet(new long[]{0xC00FE318861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_operationExpression2911 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2923 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_operationExpression2927 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_inStateExpression2984 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_inStateExpression2989 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_inStateExpression2998 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_inStateExpression3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression3039 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression3063 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_typeExpression3067 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration3107 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration3110 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration3114 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration3124 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration3130 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration3133 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration3139 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization3167 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization3169 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_variableInitialization3173 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization3175 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_variableInitialization3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ifExpression3211 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_ifExpression3215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ifExpression3217 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_ifExpression3221 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ifExpression3223 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_ifExpression3227 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ifExpression3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_literal3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_literal3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal3334 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal3350 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal3352 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_literal3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral3454 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral3483 = new BitSet(new long[]{0xC00FE30A861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral3500 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral3513 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral3517 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral3536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem3565 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem3576 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_collectionItem3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_emptyCollectionLiteral3609 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral3611 = new BitSet(new long[]{0x0003E00000000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral3615 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral3633 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral3635 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_undefinedLiteral3667 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3669 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3673 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_undefinedLiteral3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_undefinedLiteral3703 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3705 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3709 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_undefinedLiteral3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_tupleLiteral3764 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral3770 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3778 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral3789 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3793 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem3835 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_tupleItem3874 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_tupleItem3878 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem3880 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_tupleItem3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem3906 = new BitSet(new long[]{0xC00FE308861A0020L,0x0000000000587F98L});
    public static final BitSet FOLLOW_expression_in_tupleItem3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type4006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly4038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly4040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType4106 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType4133 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_collectionType4137 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_tupleType4173 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType4175 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType4184 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleType4195 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType4199 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart4243 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_tuplePart4245 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_tuplePart4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_synpred1_Query3865 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_synpred1_Query3867 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred1_Query3869 = new BitSet(new long[]{0x0000000000000002L});

}