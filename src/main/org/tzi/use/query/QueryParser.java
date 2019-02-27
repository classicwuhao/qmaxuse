// $ANTLR 3.4 Query.g 2019-02-27 15:40:05

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", "NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", "REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", "WS", "'&&'", "'=>'", "'Bag'", "'Collection'", "'OrderedSet'", "'Sequence'", "'Set'", "'Tuple'", "'Undefined'", "'all'", "'allInstances'", "'and'", "'as'", "'but'", "'byUseId'", "'div'", "'else'", "'end'", "'endif'", "'false'", "'if'", "'implies'", "'in'", "'iterate'", "'let'", "'module'", "'no'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", "'oclInState'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", "'only'", "'or'", "'pre'", "'select'", "'selectByKind'", "'selectByType'", "'then'", "'true'", "'verify'", "'with'", "'xor'", "'||'"
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
    public static final int T__89=89;
    public static final int T__90=90;
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
    // Query.g:42:1: checkExpr returns [QAst expr] : ( 'verify' qexpr= queryExpr ( ( '&&' right_expr= queryExpr ) | ( '||' right_expr= queryExpr ) | ( '=>' right_expr= queryExpr ) )* EOF |mexpr= moduleExpr (mexpr= moduleExpr )* EOF );
    public final QAst checkExpr() throws RecognitionException {
        QAst expr = null;


        QueryExpr qexpr =null;

        QueryExpr right_expr =null;

        ModuleExpr mexpr =null;


        try {
            // Query.g:42:30: ( 'verify' qexpr= queryExpr ( ( '&&' right_expr= queryExpr ) | ( '||' right_expr= queryExpr ) | ( '=>' right_expr= queryExpr ) )* EOF |mexpr= moduleExpr (mexpr= moduleExpr )* EOF )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==87) ) {
                alt3=1;
            }
            else if ( (LA3_0==69) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // Query.g:43:5: 'verify' qexpr= queryExpr ( ( '&&' right_expr= queryExpr ) | ( '||' right_expr= queryExpr ) | ( '=>' right_expr= queryExpr ) )* EOF
                    {
                    match(input,87,FOLLOW_87_in_checkExpr51); if (state.failed) return expr;

                    pushFollow(FOLLOW_queryExpr_in_checkExpr55);
                    qexpr=queryExpr();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =qexpr;}

                    // Query.g:44:10: ( ( '&&' right_expr= queryExpr ) | ( '||' right_expr= queryExpr ) | ( '=>' right_expr= queryExpr ) )*
                    loop1:
                    do {
                        int alt1=4;
                        switch ( input.LA(1) ) {
                        case 44:
                            {
                            alt1=1;
                            }
                            break;
                        case 90:
                            {
                            alt1=2;
                            }
                            break;
                        case 45:
                            {
                            alt1=3;
                            }
                            break;

                        }

                        switch (alt1) {
                    	case 1 :
                    	    // Query.g:45:13: ( '&&' right_expr= queryExpr )
                    	    {
                    	    // Query.g:45:13: ( '&&' right_expr= queryExpr )
                    	    // Query.g:45:14: '&&' right_expr= queryExpr
                    	    {
                    	    match(input,44,FOLLOW_44_in_checkExpr83); if (state.failed) return expr;

                    	    pushFollow(FOLLOW_queryExpr_in_checkExpr87);
                    	    right_expr=queryExpr();

                    	    state._fsp--;
                    	    if (state.failed) return expr;

                    	    if ( state.backtracking==0 ) {
                    	                        expr = new QueryBinaryExpr(expr, right_expr, Connective.AND);
                    	                    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // Query.g:51:13: ( '||' right_expr= queryExpr )
                    	    {
                    	    // Query.g:51:13: ( '||' right_expr= queryExpr )
                    	    // Query.g:51:14: '||' right_expr= queryExpr
                    	    {
                    	    match(input,90,FOLLOW_90_in_checkExpr145); if (state.failed) return expr;

                    	    pushFollow(FOLLOW_queryExpr_in_checkExpr149);
                    	    right_expr=queryExpr();

                    	    state._fsp--;
                    	    if (state.failed) return expr;

                    	    if ( state.backtracking==0 ) {
                    	                        expr = new QueryBinaryExpr(expr, right_expr, Connective.OR);
                    	                    }

                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // Query.g:57:13: ( '=>' right_expr= queryExpr )
                    	    {
                    	    // Query.g:57:13: ( '=>' right_expr= queryExpr )
                    	    // Query.g:57:15: '=>' right_expr= queryExpr
                    	    {
                    	    match(input,45,FOLLOW_45_in_checkExpr208); if (state.failed) return expr;

                    	    pushFollow(FOLLOW_queryExpr_in_checkExpr214);
                    	    right_expr=queryExpr();

                    	    state._fsp--;
                    	    if (state.failed) return expr;

                    	    if ( state.backtracking==0 ) {
                    	                        expr = new QueryBinaryExpr(expr, right_expr, Connective.IMPLIES);
                    	                    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    match(input,EOF,FOLLOW_EOF_in_checkExpr260); if (state.failed) return expr;

                    }
                    break;
                case 2 :
                    // Query.g:64:9: mexpr= moduleExpr (mexpr= moduleExpr )* EOF
                    {
                    pushFollow(FOLLOW_moduleExpr_in_checkExpr278);
                    mexpr=moduleExpr();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr = new ModuleListExpr(); ((ModuleListExpr)expr).addModule(mexpr);}

                    // Query.g:65:9: (mexpr= moduleExpr )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==69) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // Query.g:65:10: mexpr= moduleExpr
                    	    {
                    	    pushFollow(FOLLOW_moduleExpr_in_checkExpr294);
                    	    mexpr=moduleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return expr;

                    	    if ( state.backtracking==0 ) {((ModuleListExpr)expr).addModule(mexpr);}

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    match(input,EOF,FOLLOW_EOF_in_checkExpr300); if (state.failed) return expr;

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



    // $ANTLR start "queryExpr"
    // Query.g:68:1: queryExpr returns [QueryExpr qexpr] : ( 'select' f= featureExpr ( COMMA f= featureExpr )* (with= withExpr )? (without= butExpr )? (o= oclExpr )? ( 'as' name= IDENT )? |alias= IDENT );
    public final QueryExpr queryExpr() throws RecognitionException {
        QueryExpr qexpr = null;


        Token name=null;
        Token alias=null;
        QFeatureExpr f =null;

        QWithExpr with =null;

        QButExpr without =null;

        QOCLExpr o =null;



            qexpr = new QueryExpr();

        try {
            // Query.g:70:2: ( 'select' f= featureExpr ( COMMA f= featureExpr )* (with= withExpr )? (without= butExpr )? (o= oclExpr )? ( 'as' name= IDENT )? |alias= IDENT )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==82) ) {
                alt9=1;
            }
            else if ( (LA9_0==IDENT) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return qexpr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // Query.g:71:5: 'select' f= featureExpr ( COMMA f= featureExpr )* (with= withExpr )? (without= butExpr )? (o= oclExpr )? ( 'as' name= IDENT )?
                    {
                    match(input,82,FOLLOW_82_in_queryExpr321); if (state.failed) return qexpr;

                    pushFollow(FOLLOW_featureExpr_in_queryExpr325);
                    f=featureExpr();

                    state._fsp--;
                    if (state.failed) return qexpr;

                    if ( state.backtracking==0 ) {qexpr.addFeature(f);}

                    // Query.g:71:52: ( COMMA f= featureExpr )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==COMMA) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Query.g:71:53: COMMA f= featureExpr
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_queryExpr330); if (state.failed) return qexpr;

                    	    pushFollow(FOLLOW_featureExpr_in_queryExpr334);
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


                    // Query.g:72:9: (with= withExpr )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==88) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // Query.g:72:10: with= withExpr
                            {
                            pushFollow(FOLLOW_withExpr_in_queryExpr352);
                            with=withExpr();

                            state._fsp--;
                            if (state.failed) return qexpr;

                            if ( state.backtracking==0 ) {qexpr.addWithExpr(with);}

                            }
                            break;

                    }


                    // Query.g:73:9: (without= butExpr )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==57) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // Query.g:73:10: without= butExpr
                            {
                            pushFollow(FOLLOW_butExpr_in_queryExpr370);
                            without=butExpr();

                            state._fsp--;
                            if (state.failed) return qexpr;

                            if ( state.backtracking==0 ) {qexpr.addWithoutExpr(without);}

                            }
                            break;

                    }


                    // Query.g:73:63: (o= oclExpr )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==LBRACE) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // Query.g:73:64: o= oclExpr
                            {
                            pushFollow(FOLLOW_oclExpr_in_queryExpr380);
                            o=oclExpr();

                            state._fsp--;
                            if (state.failed) return qexpr;

                            if ( state.backtracking==0 ) {qexpr.setOCLExpression(o);}

                            }
                            break;

                    }


                    // Query.g:74:9: ( 'as' name= IDENT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==56) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // Query.g:74:10: 'as' name= IDENT
                            {
                            match(input,56,FOLLOW_56_in_queryExpr396); if (state.failed) return qexpr;

                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpr400); if (state.failed) return qexpr;

                            if ( state.backtracking==0 ) {qexpr.setAlias(name.getText());}

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Query.g:75:6: alias= IDENT
                    {
                    alias=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpr416); if (state.failed) return qexpr;

                    if ( state.backtracking==0 ) {qexpr.setAlias(alias.getText());}

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



    // $ANTLR start "featureExpr"
    // Query.g:82:1: featureExpr returns [QFeatureExpr feature] : ( (modifier= modifiers )? dest= ( IDENT | STAR ) ( rankExpr )? |f1= attrExpr |f2= assocExpr );
    public final QFeatureExpr featureExpr() throws RecognitionException {
        QFeatureExpr feature = null;


        Token dest=null;
        Modifier modifier =null;

        QAttrExpr f1 =null;

        QAssocExpr f2 =null;


        try {
            // Query.g:82:43: ( (modifier= modifiers )? dest= ( IDENT | STAR ) ( rankExpr )? |f1= attrExpr |f2= assocExpr )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==53||LA12_0==70||LA12_0==79) ) {
                alt12=1;
            }
            else if ( (LA12_0==IDENT||LA12_0==STAR) ) {
                switch ( input.LA(2) ) {
                case DOT:
                    {
                    alt12=2;
                    }
                    break;
                case COLON:
                    {
                    alt12=3;
                    }
                    break;
                case EOF:
                case AT:
                case COMMA:
                case IDENT:
                case LBRACE:
                case 44:
                case 45:
                case 56:
                case 57:
                case 61:
                case 82:
                case 88:
                case 90:
                    {
                    alt12=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return feature;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;

                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return feature;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // Query.g:83:5: (modifier= modifiers )? dest= ( IDENT | STAR ) ( rankExpr )?
                    {
                    // Query.g:83:5: (modifier= modifiers )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==53||LA10_0==70||LA10_0==79) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // Query.g:83:6: modifier= modifiers
                            {
                            pushFollow(FOLLOW_modifiers_in_featureExpr446);
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


                    // Query.g:83:46: ( rankExpr )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==AT) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // Query.g:83:47: rankExpr
                            {
                            pushFollow(FOLLOW_rankExpr_in_featureExpr460);
                            rankExpr();

                            state._fsp--;
                            if (state.failed) return feature;

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                            feature = new QClassExpr(dest.getText(),modifier);
                        }

                    }
                    break;
                case 2 :
                    // Query.g:87:7: f1= attrExpr
                    {
                    pushFollow(FOLLOW_attrExpr_in_featureExpr480);
                    f1=attrExpr();

                    state._fsp--;
                    if (state.failed) return feature;

                    if ( state.backtracking==0 ) {feature =f1;}

                    }
                    break;
                case 3 :
                    // Query.g:88:7: f2= assocExpr
                    {
                    pushFollow(FOLLOW_assocExpr_in_featureExpr494);
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
    // Query.g:91:1: modifiers returns [Modifier m] : ( 'only' | 'no' | 'all' );
    public final Modifier modifiers() throws RecognitionException {
        Modifier m = null;


        try {
            // Query.g:91:31: ( 'only' | 'no' | 'all' )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt13=1;
                }
                break;
            case 70:
                {
                alt13=2;
                }
                break;
            case 53:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return m;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // Query.g:92:5: 'only'
                    {
                    match(input,79,FOLLOW_79_in_modifiers512); if (state.failed) return m;

                    if ( state.backtracking==0 ) {m =Modifier.ONLY;}

                    }
                    break;
                case 2 :
                    // Query.g:94:5: 'no'
                    {
                    match(input,70,FOLLOW_70_in_modifiers526); if (state.failed) return m;

                    if ( state.backtracking==0 ) {m =Modifier.NO;}

                    }
                    break;
                case 3 :
                    // Query.g:96:6: 'all'
                    {
                    match(input,53,FOLLOW_53_in_modifiers536); if (state.failed) return m;

                    if ( state.backtracking==0 ) {m =Modifier.NO;}

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
    // Query.g:98:1: attrExpr returns [QAttrExpr attr] : src= ( IDENT | STAR ) DOT dest= ( IDENT | STAR ) ( rankExpr )? ;
    public final QAttrExpr attrExpr() throws RecognitionException {
        QAttrExpr attr = null;


        Token src=null;
        Token dest=null;

        try {
            // Query.g:98:34: (src= ( IDENT | STAR ) DOT dest= ( IDENT | STAR ) ( rankExpr )? )
            // Query.g:99:5: src= ( IDENT | STAR ) DOT dest= ( IDENT | STAR ) ( rankExpr )?
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


            match(input,DOT,FOLLOW_DOT_in_attrExpr561); if (state.failed) return attr;

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


            // Query.g:99:44: ( rankExpr )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==AT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Query.g:99:45: rankExpr
                    {
                    pushFollow(FOLLOW_rankExpr_in_attrExpr572);
                    rankExpr();

                    state._fsp--;
                    if (state.failed) return attr;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {attr = new QAttrExpr(src.getText(),dest.getText());}

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
    // Query.g:102:1: assocExpr returns [QAssocExpr assoc] : src= ( IDENT | STAR ) COLON name= ( IDENT | STAR ) COLON dest= ( IDENT | STAR ) ( rankExpr )? ;
    public final QAssocExpr assocExpr() throws RecognitionException {
        QAssocExpr assoc = null;


        Token src=null;
        Token name=null;
        Token dest=null;

        try {
            // Query.g:103:3: (src= ( IDENT | STAR ) COLON name= ( IDENT | STAR ) COLON dest= ( IDENT | STAR ) ( rankExpr )? )
            // Query.g:103:3: src= ( IDENT | STAR ) COLON name= ( IDENT | STAR ) COLON dest= ( IDENT | STAR ) ( rankExpr )?
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


            match(input,COLON,FOLLOW_COLON_in_assocExpr597); if (state.failed) return assoc;

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


            match(input,COLON,FOLLOW_COLON_in_assocExpr607); if (state.failed) return assoc;

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


            // Query.g:103:68: ( rankExpr )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==AT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Query.g:103:69: rankExpr
                    {
                    pushFollow(FOLLOW_rankExpr_in_assocExpr618);
                    rankExpr();

                    state._fsp--;
                    if (state.failed) return assoc;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {assoc = new QAssocExpr(src.getText(),name.getText(),dest.getText());}

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
    // Query.g:107:1: withExpr returns [QWithExpr with] : 'with' w= invExpr ( COMMA w= invExpr )* ;
    public final QWithExpr withExpr() throws RecognitionException {
        QWithExpr with = null;


        QInvExpr w =null;



            with = new QWithExpr();

        try {
            // Query.g:109:2: ( 'with' w= invExpr ( COMMA w= invExpr )* )
            // Query.g:110:5: 'with' w= invExpr ( COMMA w= invExpr )*
            {
            match(input,88,FOLLOW_88_in_withExpr647); if (state.failed) return with;

            pushFollow(FOLLOW_invExpr_in_withExpr651);
            w=invExpr();

            state._fsp--;
            if (state.failed) return with;

            if ( state.backtracking==0 ) {with.addInvExpr(w);}

            // Query.g:110:44: ( COMMA w= invExpr )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Query.g:110:45: COMMA w= invExpr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_withExpr655); if (state.failed) return with;

            	    pushFollow(FOLLOW_invExpr_in_withExpr659);
            	    w=invExpr();

            	    state._fsp--;
            	    if (state.failed) return with;

            	    if ( state.backtracking==0 ) {with.addInvExpr(w);}

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
        return with;
    }
    // $ANTLR end "withExpr"



    // $ANTLR start "butExpr"
    // Query.g:112:1: butExpr returns [QButExpr without] : 'but' w= invExpr ( COMMA w= invExpr )* ;
    public final QButExpr butExpr() throws RecognitionException {
        QButExpr without = null;


        QInvExpr w =null;



            without = new QButExpr();

        try {
            // Query.g:115:5: ( 'but' w= invExpr ( COMMA w= invExpr )* )
            // Query.g:116:5: 'but' w= invExpr ( COMMA w= invExpr )*
            {
            match(input,57,FOLLOW_57_in_butExpr682); if (state.failed) return without;

            pushFollow(FOLLOW_invExpr_in_butExpr686);
            w=invExpr();

            state._fsp--;
            if (state.failed) return without;

            if ( state.backtracking==0 ) {without.addInvExpr(w);}

            // Query.g:116:46: ( COMMA w= invExpr )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Query.g:116:47: COMMA w= invExpr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_butExpr690); if (state.failed) return without;

            	    pushFollow(FOLLOW_invExpr_in_butExpr694);
            	    w=invExpr();

            	    state._fsp--;
            	    if (state.failed) return without;

            	    if ( state.backtracking==0 ) {without.addInvExpr(w);}

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
        return without;
    }
    // $ANTLR end "butExpr"



    // $ANTLR start "invExpr"
    // Query.g:119:1: invExpr returns [QInvExpr inv] : src= ( IDENT | STAR ) COLON_COLON dest= ( IDENT | STAR ) ( rankExpr )? ;
    public final QInvExpr invExpr() throws RecognitionException {
        QInvExpr inv = null;


        Token src=null;
        Token dest=null;

        try {
            // Query.g:119:31: (src= ( IDENT | STAR ) COLON_COLON dest= ( IDENT | STAR ) ( rankExpr )? )
            // Query.g:120:5: src= ( IDENT | STAR ) COLON_COLON dest= ( IDENT | STAR ) ( rankExpr )?
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


            match(input,COLON_COLON,FOLLOW_COLON_COLON_in_invExpr722); if (state.failed) return inv;

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


            // Query.g:120:52: ( rankExpr )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==AT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Query.g:120:53: rankExpr
                    {
                    pushFollow(FOLLOW_rankExpr_in_invExpr733);
                    rankExpr();

                    state._fsp--;
                    if (state.failed) return inv;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {inv = new QInvExpr(src.getText(),dest.getText());}

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
    // Query.g:123:1: rankExpr returns [int rank] : AT k= INT ;
    public final int rankExpr() throws RecognitionException {
        int rank = 0;


        Token k=null;

        try {
            // Query.g:123:28: ( AT k= INT )
            // Query.g:124:5: AT k= INT
            {
            match(input,AT,FOLLOW_AT_in_rankExpr753); if (state.failed) return rank;

            k=(Token)match(input,INT,FOLLOW_INT_in_rankExpr757); if (state.failed) return rank;

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
    // Query.g:127:1: moduleExpr returns [ModuleExpr mexpr] : 'module' name= IDENT query= queryExpr (query= queryExpr )* 'end' ;
    public final ModuleExpr moduleExpr() throws RecognitionException {
        ModuleExpr mexpr = null;


        Token name=null;
        QueryExpr query =null;


        try {
            // Query.g:127:38: ( 'module' name= IDENT query= queryExpr (query= queryExpr )* 'end' )
            // Query.g:128:5: 'module' name= IDENT query= queryExpr (query= queryExpr )* 'end'
            {
            match(input,69,FOLLOW_69_in_moduleExpr775); if (state.failed) return mexpr;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_moduleExpr779); if (state.failed) return mexpr;

            if ( state.backtracking==0 ) {mexpr = new ModuleExpr(name.getText());}

            pushFollow(FOLLOW_queryExpr_in_moduleExpr793);
            query=queryExpr();

            state._fsp--;
            if (state.failed) return mexpr;

            if ( state.backtracking==0 ) {mexpr.addQuery(query);}

            // Query.g:130:9: (query= queryExpr )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==IDENT||LA19_0==82) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // Query.g:130:10: query= queryExpr
            	    {
            	    pushFollow(FOLLOW_queryExpr_in_moduleExpr809);
            	    query=queryExpr();

            	    state._fsp--;
            	    if (state.failed) return mexpr;

            	    if ( state.backtracking==0 ) {mexpr.addQuery(query);}

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            match(input,61,FOLLOW_61_in_moduleExpr819); if (state.failed) return mexpr;

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



    // $ANTLR start "oclExpr"
    // Query.g:134:1: oclExpr returns [QOCLExpr ocl_expr] : LBRACE expr= expression RBRACE ;
    public final QOCLExpr oclExpr() throws RecognitionException {
        QOCLExpr ocl_expr = null;


        ASTExpression expr =null;



            ocl_expr = new QOCLExpr();

        try {
            // Query.g:136:2: ( LBRACE expr= expression RBRACE )
            // Query.g:137:5: LBRACE expr= expression RBRACE
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_oclExpr840); if (state.failed) return ocl_expr;

            pushFollow(FOLLOW_expression_in_oclExpr844);
            expr=expression();

            state._fsp--;
            if (state.failed) return ocl_expr;

            if ( state.backtracking==0 ) {ocl_expr.setExpression(expr);}

            match(input,RBRACE,FOLLOW_RBRACE_in_oclExpr848); if (state.failed) return ocl_expr;

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
    // $ANTLR end "oclExpr"



    // $ANTLR start "expressionOnly"
    // Query.g:166:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExp =null;


        try {
            // Query.g:167:5: (nExp= expression EOF )
            // Query.g:168:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly875);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_expressionOnly877); if (state.failed) return n;

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
    // Query.g:175:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
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
            // Query.g:181:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
            // Query.g:182:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }

            // Query.g:183:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==68) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Query.g:184:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
            	    {
            	    match(input,68,FOLLOW_68_in_expression925); if (state.failed) return n;

            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression936); if (state.failed) return n;

            	    // Query.g:185:18: ( COLON t= type )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==COLON) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // Query.g:185:20: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression940); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_expression944);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression949); if (state.failed) return n;

            	    pushFollow(FOLLOW_expression_in_expression953);
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

            	    // Query.g:195:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==COMMA) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // Query.g:196:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_expression991); if (state.failed) return n;

            	    	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression1003); if (state.failed) return n;

            	    	    // Query.g:197:20: ( COLON t= type )?
            	    	    int alt21=2;
            	    	    int LA21_0 = input.LA(1);

            	    	    if ( (LA21_0==COLON) ) {
            	    	        alt21=1;
            	    	    }
            	    	    switch (alt21) {
            	    	        case 1 :
            	    	            // Query.g:197:22: COLON t= type
            	    	            {
            	    	            match(input,COLON,FOLLOW_COLON_in_expression1007); if (state.failed) return n;

            	    	            pushFollow(FOLLOW_type_in_expression1011);
            	    	            t=type();

            	    	            state._fsp--;
            	    	            if (state.failed) return n;

            	    	            }
            	    	            break;

            	    	    }


            	    	    match(input,EQUAL,FOLLOW_EQUAL_in_expression1016); if (state.failed) return n;

            	    	    pushFollow(FOLLOW_expression_in_expression1020);
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
            	    	    break loop22;
            	        }
            	    } while (true);


            	    match(input,66,FOLLOW_66_in_expression1061); if (state.failed) return n;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression1077);
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
    // Query.g:230:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;


        ASTVariableDeclaration v =null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // Query.g:232:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // Query.g:233:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList1110); if (state.failed) return paramList;

            // Query.g:234:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==IDENT) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // Query.g:235:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList1127);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;

                    if ( state.backtracking==0 ) { paramList.add(v); }

                    // Query.g:236:7: ( COMMA v= variableDeclaration )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==COMMA) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // Query.g:236:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList1139); if (state.failed) return paramList;

                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList1143);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;

                    	    if ( state.backtracking==0 ) { paramList.add(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_paramList1163); if (state.failed) return paramList;

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
    // Query.g:244:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;


        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // Query.g:246:5: (id0= IDENT ( COMMA idn= IDENT )* )
            // Query.g:247:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList1192); if (state.failed) return idList;

            if ( state.backtracking==0 ) { idList.add(id0); }

            // Query.g:248:5: ( COMMA idn= IDENT )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==COMMA) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // Query.g:248:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList1202); if (state.failed) return idList;

            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList1206); if (state.failed) return idList;

            	    if ( state.backtracking==0 ) { idList.add(idn); }

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
        return idList;
    }
    // $ANTLR end "idList"



    // $ANTLR start "variableDeclaration"
    // Query.g:256:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Query.g:257:5: (name= IDENT COLON t= type )
            // Query.g:258:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration1237); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableDeclaration1239); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableDeclaration1243);
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
    // Query.g:266:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndOrExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:267:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // Query.g:268:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1279);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndOrExp;}

            // Query.g:269:5: (op= 'implies' n1= conditionalOrExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==65) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // Query.g:269:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,65,FOLLOW_65_in_conditionalImpliesExpression1292); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1296);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // Query.g:278:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndXorExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:279:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // Query.g:280:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1341);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndXorExp;}

            // Query.g:281:5: (op= 'or' n1= conditionalXOrExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==80) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Query.g:281:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,80,FOLLOW_80_in_conditionalOrExpression1354); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1358);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

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
    // $ANTLR end "conditionalOrExpression"



    // $ANTLR start "conditionalXOrExpression"
    // Query.g:290:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndAndExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:291:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // Query.g:292:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1402);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndAndExp;}

            // Query.g:293:5: (op= 'xor' n1= conditionalAndExpression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==89) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // Query.g:293:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,89,FOLLOW_89_in_conditionalXOrExpression1415); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1419);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

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
    // $ANTLR end "conditionalXOrExpression"



    // $ANTLR start "conditionalAndExpression"
    // Query.g:302:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nEqExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:303:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // Query.g:304:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1463);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nEqExp;}

            // Query.g:305:5: (op= 'and' n1= equalityExpression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==55) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // Query.g:305:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,55,FOLLOW_55_in_conditionalAndExpression1476); if (state.failed) return n;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1480);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // Query.g:314:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nRelExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:316:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // Query.g:317:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1528);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nRelExp;}

            // Query.g:318:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==EQUAL||LA31_0==NOT_EQUAL) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // Query.g:318:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1557);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // Query.g:328:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nAddiExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:330:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // Query.g:331:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1606);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nAddiExp;}

            // Query.g:332:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0 >= GREATER && LA32_0 <= GREATER_EQUAL)||(LA32_0 >= LESS && LA32_0 <= LESS_EQUAL)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // Query.g:332:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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


            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1642);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

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
        return n;
    }
    // $ANTLR end "relationalExpression"



    // $ANTLR start "additiveExpression"
    // Query.g:342:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nMulExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:344:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // Query.g:345:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1692);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nMulExp;}

            // Query.g:346:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==MINUS||LA33_0==PLUS) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // Query.g:346:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1720);
            	    n1=multiplicativeExpression();

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
    // $ANTLR end "additiveExpression"



    // $ANTLR start "multiplicativeExpression"
    // Query.g:357:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:359:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // Query.g:360:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1770);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nUnExp;}

            // Query.g:361:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==SLASH||LA34_0==STAR||LA34_0==59) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // Query.g:361:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
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


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1802);
            	    n1=unaryExpression();

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
    // $ANTLR end "multiplicativeExpression"



    // $ANTLR start "unaryExpression"
    // Query.g:373:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression nPosExp =null;


         Token op = null; 
        try {
            // Query.g:375:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==MINUS||LA35_0==PLUS||LA35_0==71) ) {
                alt35=1;
            }
            else if ( (LA35_0==AT||LA35_0==HASH||(LA35_0 >= IDENT && LA35_0 <= INT)||LA35_0==LPAREN||LA35_0==REAL||(LA35_0 >= STAR && LA35_0 <= STRING)||(LA35_0 >= 46 && LA35_0 <= 52)||(LA35_0 >= 63 && LA35_0 <= 64)||LA35_0==67||(LA35_0 >= 72 && LA35_0 <= 78)||(LA35_0 >= 83 && LA35_0 <= 84)||LA35_0==86) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // Query.g:376:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // Query.g:376:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // Query.g:376:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
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


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1888);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }

                    }


                    }
                    break;
                case 2 :
                    // Query.g:380:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression1908);
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
    // Query.g:388:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nPrimExp =null;

        ASTExpression nPc =null;


         boolean arrow = false; 
        try {
            // Query.g:390:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // Query.g:391:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression1941);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nPrimExp; }

            // Query.g:392:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==ARROW||LA37_0==DOT) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // Query.g:393:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // Query.g:393:6: ( ARROW | DOT )
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==ARROW) ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0==DOT) ) {
            	        alt36=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // Query.g:393:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression1959); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = true; }

            	            }
            	            break;
            	        case 2 :
            	            // Query.g:393:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression1965); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = false; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression1976);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = nPc; }

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
    // $ANTLR end "postfixExpression"



    // $ANTLR start "primaryExpression"
    // Query.g:409:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? );
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
            // Query.g:410:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? )
            int alt41=7;
            switch ( input.LA(1) ) {
            case HASH:
            case INT:
            case REAL:
            case STAR:
            case STRING:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 63:
            case 72:
            case 74:
            case 78:
            case 86:
                {
                alt41=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt41=1;
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
                case 59:
                case 60:
                case 62:
                case 65:
                case 66:
                case 80:
                case 85:
                case 89:
                    {
                    alt41=3;
                    }
                    break;
                case DOT:
                    {
                    switch ( input.LA(3) ) {
                    case 54:
                        {
                        alt41=6;
                        }
                        break;
                    case 58:
                        {
                        alt41=7;
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
                        alt41=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 7, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;

                }

                }
                break;
            case AT:
                {
                alt41=2;
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
                alt41=3;
                }
                break;
            case LPAREN:
                {
                alt41=4;
                }
                break;
            case 64:
                {
                alt41=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }

            switch (alt41) {
                case 1 :
                    // Query.g:411:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression2016);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nLit; }

                    }
                    break;
                case 2 :
                    // Query.g:412:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression2030);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nOr; }

                    }
                    break;
                case 3 :
                    // Query.g:413:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression2042);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPc; }

                    }
                    break;
                case 4 :
                    // Query.g:414:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression2053); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression2057);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression2059); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExp; }

                    }
                    break;
                case 5 :
                    // Query.g:415:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression2071);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nIfExp; }

                    }
                    break;
                case 6 :
                    // Query.g:416:7: id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression2083); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression2085); if (state.failed) return n;

                    match(input,54,FOLLOW_54_in_primaryExpression2087); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }

                    // Query.g:418:9: ( AT 'pre' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==AT) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // Query.g:418:11: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression2110); if (state.failed) return n;

                            match(input,81,FOLLOW_81_in_primaryExpression2112); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setIsPre(); }

                            }
                            break;

                    }


                    // Query.g:419:9: ( LPAREN RPAREN )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==LPAREN) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // Query.g:419:11: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression2130); if (state.failed) return n;

                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression2132); if (state.failed) return n;

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // Query.g:420:7: id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )?
                    {
                    id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression2145); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression2147); if (state.failed) return n;

                    match(input,58,FOLLOW_58_in_primaryExpression2149); if (state.failed) return n;

                    // Query.g:420:31: ( LPAREN idExp= expression RPAREN )
                    // Query.g:420:33: LPAREN idExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression2153); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression2157);
                    idExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression2159); if (state.failed) return n;

                    }


                    if ( state.backtracking==0 ) { n = new ASTObjectByUseIdExpression(id2, idExp); }

                    // Query.g:422:7: ( AT 'pre' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==AT) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // Query.g:422:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression2179); if (state.failed) return n;

                            match(input,81,FOLLOW_81_in_primaryExpression2181); if (state.failed) return n;

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
    // Query.g:426:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;


        Token objectName=null;

        try {
            // Query.g:427:3: ( AT objectName= IDENT )
            // Query.g:428:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference2207); if (state.failed) return n;

            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference2215); if (state.failed) return n;

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
    // Query.g:442:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExpQuery =null;

        ASTExpression nExpIterate =null;

        QueryParser.operationExpression_return nExpOperation =null;

        ASTTypeArgExpression nExpType =null;

        ASTInStateExpression nExpInState =null;


        try {
            // Query.g:443:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] )
            int alt42=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA42_1 = input.LA(2);

                if ( (((( input.LA(2) == LPAREN )&&( input.LA(2) == LPAREN ))&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))) ) {
                    alt42=1;
                }
                else if ( (true) ) {
                    alt42=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;

                }
                }
                break;
            case 67:
                {
                alt42=2;
                }
                break;
            case 73:
            case 76:
            case 77:
            case 83:
            case 84:
                {
                alt42=4;
                }
                break;
            case 75:
                {
                alt42=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }

            switch (alt42) {
                case 1 :
                    // Query.g:447:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }

                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }

                    pushFollow(FOLLOW_queryExpression_in_propertyCall2280);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpQuery; }

                    }
                    break;
                case 2 :
                    // Query.g:450:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall2293);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpIterate; }

                    }
                    break;
                case 3 :
                    // Query.g:451:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall2306);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExpOperation!=null?nExpOperation.n:null); }

                    }
                    break;
                case 4 :
                    // Query.g:452:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall2319);
                    nExpType=typeExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpType; }

                    }
                    break;
                case 5 :
                    // Query.g:453:7: nExpInState= inStateExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_inStateExpression_in_propertyCall2332);
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
    // Query.g:462:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTElemVarsDeclaration decls =null;

        ASTExpression nExp =null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // Query.g:463:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // Query.g:464:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression2367); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression2374); if (state.failed) return n;

            // Query.g:466:5: (decls= elemVarsDeclaration BAR )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==IDENT) ) {
                int LA43_1 = input.LA(2);

                if ( ((LA43_1 >= BAR && LA43_1 <= COLON)||LA43_1==COMMA) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // Query.g:466:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression2385);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {decl = decls;}

                    match(input,BAR,FOLLOW_BAR_in_queryExpression2389); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_queryExpression2400);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression2406); if (state.failed) return n;

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
    // Query.g:480:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTElemVarsDeclaration decls =null;

        ASTVariableInitialization init =null;

        ASTExpression nExp =null;


        try {
            // Query.g:480:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // Query.g:481:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,67,FOLLOW_67_in_iterateExpression2438); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression2444); if (state.failed) return n;

            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression2452);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;

            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression2454); if (state.failed) return n;

            pushFollow(FOLLOW_variableInitialization_in_iterateExpression2462);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;

            match(input,BAR,FOLLOW_BAR_in_iterateExpression2464); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_iterateExpression2472);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression2478); if (state.failed) return n;

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
    // Query.g:502:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final QueryParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        QueryParser.operationExpression_return retval = new QueryParser.operationExpression_return();
        retval.start = input.LT(1);


        Token name=null;
        ASTExpression rolename =null;

        ASTExpression e =null;


        try {
            // Query.g:504:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // Query.g:505:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression2522); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }

            // Query.g:511:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==LBRACK) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // Query.g:511:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2544); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_operationExpression2557);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier(rolename); }

                    // Query.g:513:9: ( COMMA rolename= expression )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==COMMA) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // Query.g:513:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2570); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_operationExpression2574);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier(rolename); }

                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2586); if (state.failed) return retval;

                    // Query.g:516:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==LBRACK) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // Query.g:516:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2603); if (state.failed) return retval;

                            pushFollow(FOLLOW_expression_in_operationExpression2618);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addQualifier(rolename); }

                            // Query.g:518:11: ( COMMA rolename= expression )*
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( (LA45_0==COMMA) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // Query.g:518:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2633); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression2637);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addQualifier(rolename); }

                            	    }
                            	    break;

                            	default :
                            	    break loop45;
                                }
                            } while (true);


                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2651); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            // Query.g:523:5: ( AT 'pre' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==AT) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // Query.g:523:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression2676); if (state.failed) return retval;

                    match(input,81,FOLLOW_81_in_operationExpression2678); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.setIsPre(); }

                    }
                    break;

            }


            // Query.g:525:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==LPAREN) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // Query.g:526:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression2703); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.hasParentheses(); }

                    // Query.g:527:7: (e= expression ( COMMA e= expression )* )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==AT||LA50_0==HASH||(LA50_0 >= IDENT && LA50_0 <= INT)||(LA50_0 >= LPAREN && LA50_0 <= MINUS)||LA50_0==PLUS||LA50_0==REAL||(LA50_0 >= STAR && LA50_0 <= STRING)||(LA50_0 >= 46 && LA50_0 <= 52)||(LA50_0 >= 63 && LA50_0 <= 64)||(LA50_0 >= 67 && LA50_0 <= 68)||(LA50_0 >= 71 && LA50_0 <= 78)||(LA50_0 >= 83 && LA50_0 <= 84)||LA50_0==86) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // Query.g:528:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression2724);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addArg(e); }

                            // Query.g:529:7: ( COMMA e= expression )*
                            loop49:
                            do {
                                int alt49=2;
                                int LA49_0 = input.LA(1);

                                if ( (LA49_0==COMMA) ) {
                                    alt49=1;
                                }


                                switch (alt49) {
                            	case 1 :
                            	    // Query.g:529:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2736); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression2740);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addArg(e); }

                            	    }
                            	    break;

                            	default :
                            	    break loop49;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression2760); if (state.failed) return retval;

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
    // Query.g:536:1: inStateExpression[ASTExpression source, boolean followsArrow] returns [ASTInStateExpression n] : opToken= 'oclInState' LPAREN s= IDENT RPAREN ;
    public final ASTInStateExpression inStateExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTInStateExpression n = null;


        Token opToken=null;
        Token s=null;

        try {
            // Query.g:537:35: (opToken= 'oclInState' LPAREN s= IDENT RPAREN )
            // Query.g:538:4: opToken= 'oclInState' LPAREN s= IDENT RPAREN
            {
            opToken=(Token)match(input,75,FOLLOW_75_in_inStateExpression2797); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_inStateExpression2802); if (state.failed) return n;

            s=(Token)match(input,IDENT,FOLLOW_IDENT_in_inStateExpression2811); if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_inStateExpression2816); if (state.failed) return n;

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
    // Query.g:550:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;


        ASTType t =null;


         Token opToken = null; 
        try {
            // Query.g:553:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN )
            // Query.g:554:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN
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


            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression2876); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_typeExpression2880);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression2882); if (state.failed) return n;

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
    // Query.g:565:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;


        Token var1=null;
        Token varN=null;
        ASTType t =null;

        ASTType tN =null;


        try {
            // Query.g:566:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // Query.g:567:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }

            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2920); if (state.failed) return n;

            // Query.g:568:17: ( COLON t= type )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==COLON) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // Query.g:568:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2923); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_elemVarsDeclaration2927);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}

            // Query.g:569:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==COMMA) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // Query.g:569:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration2937); if (state.failed) return n;

            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2943); if (state.failed) return n;

            	    // Query.g:569:24: ( COLON tN= type )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==COLON) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // Query.g:569:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2946); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration2952);
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
            	    break loop54;
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
    // Query.g:577:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;


        Token name=null;
        ASTType t =null;

        ASTExpression e =null;


        try {
            // Query.g:578:5: (name= IDENT COLON t= type EQUAL e= expression )
            // Query.g:579:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization2980); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableInitialization2982); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableInitialization2986);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization2988); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_variableInitialization2992);
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
    // Query.g:588:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTExpression cond =null;

        ASTExpression t =null;

        ASTExpression e =null;


        try {
            // Query.g:589:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // Query.g:590:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,64,FOLLOW_64_in_ifExpression3024); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression3028);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,85,FOLLOW_85_in_ifExpression3030); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression3034);
            t=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,60,FOLLOW_60_in_ifExpression3036); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression3040);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,62,FOLLOW_62_in_ifExpression3042); if (state.failed) return n;

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
    // Query.g:609:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR );
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
            // Query.g:610:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR )
            int alt55=12;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt55=1;
                }
                break;
            case 63:
                {
                alt55=2;
                }
                break;
            case INT:
                {
                alt55=3;
                }
                break;
            case REAL:
                {
                alt55=4;
                }
                break;
            case STRING:
                {
                alt55=5;
                }
                break;
            case HASH:
                {
                alt55=6;
                }
                break;
            case IDENT:
                {
                alt55=7;
                }
                break;
            case 46:
            case 48:
            case 49:
            case 50:
                {
                int LA55_8 = input.LA(2);

                if ( (LA55_8==LPAREN) ) {
                    alt55=9;
                }
                else if ( (LA55_8==LBRACE) ) {
                    alt55=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 8, input);

                    throw nvae;

                }
                }
                break;
            case 47:
            case 74:
                {
                alt55=9;
                }
                break;
            case 52:
            case 72:
            case 78:
                {
                alt55=10;
                }
                break;
            case 51:
                {
                alt55=11;
                }
                break;
            case STAR:
                {
                alt55=12;
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
                    // Query.g:611:7: t= 'true'
                    {
                    t=(Token)match(input,86,FOLLOW_86_in_literal3081); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }

                    }
                    break;
                case 2 :
                    // Query.g:612:7: f= 'false'
                    {
                    f=(Token)match(input,63,FOLLOW_63_in_literal3095); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }

                    }
                    break;
                case 3 :
                    // Query.g:613:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal3108); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }

                    }
                    break;
                case 4 :
                    // Query.g:614:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal3123); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }

                    }
                    break;
                case 5 :
                    // Query.g:615:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal3137); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }

                    }
                    break;
                case 6 :
                    // Query.g:616:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal3147); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal3151); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}

                    }
                    break;
                case 7 :
                    // Query.g:617:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal3163); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal3165); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal3169); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }

                    }
                    break;
                case 8 :
                    // Query.g:618:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal3181);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nColIt; }

                    }
                    break;
                case 9 :
                    // Query.g:619:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal3193);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nEColIt; }

                    }
                    break;
                case 10 :
                    // Query.g:620:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal3205);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nUndLit; }

                    }
                    break;
                case 11 :
                    // Query.g:621:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal3217);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nTupleLit; }

                    }
                    break;
                case 12 :
                    // Query.g:622:7: un= STAR
                    {
                    un=(Token)match(input,STAR,FOLLOW_STAR_in_literal3229); if (state.failed) return n;

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
    // Query.g:630:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;


        ASTCollectionItem ci =null;


         Token op = null; 
        try {
            // Query.g:632:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // Query.g:633:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( input.LA(1)==46||(input.LA(1) >= 48 && input.LA(1) <= 50) ) {
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

            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral3296); if (state.failed) return n;

            // Query.g:637:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==AT||LA57_0==HASH||(LA57_0 >= IDENT && LA57_0 <= INT)||(LA57_0 >= LPAREN && LA57_0 <= MINUS)||LA57_0==PLUS||LA57_0==REAL||(LA57_0 >= STAR && LA57_0 <= STRING)||(LA57_0 >= 46 && LA57_0 <= 52)||(LA57_0 >= 63 && LA57_0 <= 64)||(LA57_0 >= 67 && LA57_0 <= 68)||(LA57_0 >= 71 && LA57_0 <= 78)||(LA57_0 >= 83 && LA57_0 <= 84)||LA57_0==86) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // Query.g:638:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral3313);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addItem(ci); }

                    // Query.g:639:7: ( COMMA ci= collectionItem )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==COMMA) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // Query.g:639:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral3326); if (state.failed) return n;

                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral3330);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addItem(ci); }

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral3349); if (state.failed) return n;

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
    // Query.g:648:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;


        ASTExpression e =null;


         n = new ASTCollectionItem(); 
        try {
            // Query.g:650:5: (e= expression ( DOTDOT e= expression )? )
            // Query.g:651:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem3378);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setFirst(e); }

            // Query.g:652:5: ( DOTDOT e= expression )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==DOTDOT) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // Query.g:652:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem3389); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_collectionItem3393);
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
    // Query.g:662:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;


        ASTCollectionType t =null;


        try {
            // Query.g:663:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==74) ) {
                alt59=1;
            }
            else if ( ((LA59_0 >= 46 && LA59_0 <= 50)) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }
            switch (alt59) {
                case 1 :
                    // Query.g:664:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,74,FOLLOW_74_in_emptyCollectionLiteral3422); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral3424); if (state.failed) return n;

                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral3428);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral3430); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;
                case 2 :
                    // Query.g:667:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral3446);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral3448); if (state.failed) return n;

                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral3450); if (state.failed) return n;

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
    // Query.g:678:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;


        ASTType t =null;


        try {
            // Query.g:679:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt60=4;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt60=1;
                }
                break;
            case 52:
                {
                alt60=2;
                }
                break;
            case 72:
                {
                int LA60_3 = input.LA(2);

                if ( (LA60_3==LPAREN) ) {
                    alt60=3;
                }
                else if ( (LA60_3==EOF||LA60_3==ARROW||LA60_3==BAR||(LA60_3 >= COMMA && LA60_3 <= EQUAL)||(LA60_3 >= GREATER && LA60_3 <= GREATER_EQUAL)||(LA60_3 >= LESS && LA60_3 <= LESS_EQUAL)||LA60_3==MINUS||(LA60_3 >= NOT_EQUAL && LA60_3 <= PLUS)||(LA60_3 >= RBRACE && LA60_3 <= RBRACK)||LA60_3==RPAREN||LA60_3==SLASH||LA60_3==STAR||LA60_3==55||(LA60_3 >= 59 && LA60_3 <= 60)||LA60_3==62||(LA60_3 >= 65 && LA60_3 <= 66)||LA60_3==80||LA60_3==85||LA60_3==89) ) {
                    alt60=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;

            }

            switch (alt60) {
                case 1 :
                    // Query.g:680:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,78,FOLLOW_78_in_undefinedLiteral3480); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3482); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral3486);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3488); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 2 :
                    // Query.g:683:5: 'Undefined'
                    {
                    match(input,52,FOLLOW_52_in_undefinedLiteral3502); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;
                case 3 :
                    // Query.g:686:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,72,FOLLOW_72_in_undefinedLiteral3516); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3518); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral3522);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3524); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 4 :
                    // Query.g:689:5: 'null'
                    {
                    match(input,72,FOLLOW_72_in_undefinedLiteral3538); if (state.failed) return n;

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
    // Query.g:699:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;


        ASTTupleItem ti =null;


         List tiList = new ArrayList(); 
        try {
            // Query.g:701:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // Query.g:702:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,51,FOLLOW_51_in_tupleLiteral3577); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral3583); if (state.failed) return n;

            pushFollow(FOLLOW_tupleItem_in_tupleLiteral3591);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tiList.add(ti); }

            // Query.g:705:5: ( COMMA ti= tupleItem )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==COMMA) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // Query.g:705:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral3602); if (state.failed) return n;

            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral3606);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tiList.add(ti); }

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral3617); if (state.failed) return n;

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
    // Query.g:713:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;


        Token name=null;
        ASTType t =null;

        ASTExpression e =null;


        try {
            // Query.g:714:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // Query.g:715:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem3648); if (state.failed) return n;

            // Query.g:716:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==COLON) ) {
                int LA62_1 = input.LA(2);

                if ( (synpred1_Query()) ) {
                    alt62=1;
                }
                else if ( (true) ) {
                    alt62=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA62_0==EQUAL) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;

            }
            switch (alt62) {
                case 1 :
                    // Query.g:719:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem3687); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_tupleItem3691);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem3693); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_tupleItem3697);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, e); }

                    }
                    break;
                case 2 :
                    // Query.g:722:7: ( COLON | EQUAL ) e= expression
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


                    pushFollow(FOLLOW_expression_in_tupleItem3729);
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
    // Query.g:733:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;


        ASTSimpleType nTSimple =null;

        ASTCollectionType nTCollection =null;

        ASTTupleType nTTuple =null;


         Token tok = null; 
        try {
            // Query.g:735:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
            // Query.g:736:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }

            // Query.g:737:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            int alt63=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt63=1;
                }
                break;
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                {
                alt63=2;
                }
                break;
            case 51:
                {
                alt63=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }

            switch (alt63) {
                case 1 :
                    // Query.g:738:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type3795);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 2 :
                    // Query.g:739:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type3807);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 3 :
                    // Query.g:740:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type3819);
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
    // Query.g:745:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;


        ASTType nT =null;


        try {
            // Query.g:746:5: (nT= type EOF )
            // Query.g:747:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly3851);
            nT=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_typeOnly3853); if (state.failed) return n;

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
    // Query.g:757:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;


        Token name=null;

        try {
            // Query.g:758:5: (name= IDENT )
            // Query.g:759:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType3881); if (state.failed) return n;

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
    // Query.g:767:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;


        ASTType elemType =null;


         Token op = null; 
        try {
            // Query.g:769:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // Query.g:770:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( (input.LA(1) >= 46 && input.LA(1) <= 50) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType3946); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_collectionType3950);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType3952); if (state.failed) return n;

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
    // Query.g:780:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;


        ASTTuplePart tp =null;


         List tpList = new ArrayList(); 
        try {
            // Query.g:782:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // Query.g:783:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,51,FOLLOW_51_in_tupleType3986); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType3988); if (state.failed) return n;

            pushFollow(FOLLOW_tuplePart_in_tupleType3997);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tpList.add(tp); }

            // Query.g:785:5: ( COMMA tp= tuplePart )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==COMMA) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // Query.g:785:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType4008); if (state.failed) return n;

            	    pushFollow(FOLLOW_tuplePart_in_tupleType4012);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tpList.add(tp); }

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType4024); if (state.failed) return n;

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
    // Query.g:794:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Query.g:795:5: (name= IDENT COLON t= type )
            // Query.g:796:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart4056); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_tuplePart4058); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_tuplePart4062);
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
        // Query.g:719:7: ( COLON type EQUAL )
        // Query.g:719:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred1_Query3678); if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred1_Query3680);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_Query3682); if (state.failed) return ;

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


 

    public static final BitSet FOLLOW_87_in_checkExpr51 = new BitSet(new long[]{0x0000000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_queryExpr_in_checkExpr55 = new BitSet(new long[]{0x0000300000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_44_in_checkExpr83 = new BitSet(new long[]{0x0000000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_queryExpr_in_checkExpr87 = new BitSet(new long[]{0x0000300000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_checkExpr145 = new BitSet(new long[]{0x0000000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_queryExpr_in_checkExpr149 = new BitSet(new long[]{0x0000300000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_45_in_checkExpr208 = new BitSet(new long[]{0x0000000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_queryExpr_in_checkExpr214 = new BitSet(new long[]{0x0000300000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_EOF_in_checkExpr260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleExpr_in_checkExpr278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_moduleExpr_in_checkExpr294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_EOF_in_checkExpr300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_queryExpr321 = new BitSet(new long[]{0x0020010000080000L,0x0000000000008040L});
    public static final BitSet FOLLOW_featureExpr_in_queryExpr325 = new BitSet(new long[]{0x0300000000200402L,0x0000000001000000L});
    public static final BitSet FOLLOW_COMMA_in_queryExpr330 = new BitSet(new long[]{0x0020010000080000L,0x0000000000008040L});
    public static final BitSet FOLLOW_featureExpr_in_queryExpr334 = new BitSet(new long[]{0x0300000000200402L,0x0000000001000000L});
    public static final BitSet FOLLOW_withExpr_in_queryExpr352 = new BitSet(new long[]{0x0300000000200002L});
    public static final BitSet FOLLOW_butExpr_in_queryExpr370 = new BitSet(new long[]{0x0100000000200002L});
    public static final BitSet FOLLOW_oclExpr_in_queryExpr380 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_queryExpr396 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_queryExpr400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpr416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_featureExpr446 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_featureExpr453 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rankExpr_in_featureExpr460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrExpr_in_featureExpr480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assocExpr_in_featureExpr494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_modifiers512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_modifiers526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_modifiers536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attrExpr555 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_attrExpr561 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_attrExpr565 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rankExpr_in_attrExpr572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assocExpr591 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_assocExpr597 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_assocExpr601 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_assocExpr607 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_assocExpr611 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rankExpr_in_assocExpr618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_withExpr647 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_invExpr_in_withExpr651 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_withExpr655 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_invExpr_in_withExpr659 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_57_in_butExpr682 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_invExpr_in_butExpr686 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_butExpr690 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_invExpr_in_butExpr694 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_set_in_invExpr716 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_invExpr722 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_invExpr726 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rankExpr_in_invExpr733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_rankExpr753 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_INT_in_rankExpr757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_moduleExpr775 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_moduleExpr779 = new BitSet(new long[]{0x0000000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_queryExpr_in_moduleExpr793 = new BitSet(new long[]{0x2000000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_queryExpr_in_moduleExpr809 = new BitSet(new long[]{0x2000000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_61_in_moduleExpr819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_oclExpr840 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F99L});
    public static final BitSet FOLLOW_expression_in_oclExpr844 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_oclExpr848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_expression925 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression936 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression940 = new BitSet(new long[]{0x000FC00000080000L});
    public static final BitSet FOLLOW_type_in_expression944 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression949 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F99L});
    public static final BitSet FOLLOW_expression_in_expression953 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000004L});
    public static final BitSet FOLLOW_COMMA_in_expression991 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression1003 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression1007 = new BitSet(new long[]{0x000FC00000080000L});
    public static final BitSet FOLLOW_type_in_expression1011 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression1016 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F99L});
    public static final BitSet FOLLOW_expression_in_expression1020 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_expression1061 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F99L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList1110 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList1127 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_paramList1139 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList1143 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_paramList1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList1192 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_idList1202 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_idList1206 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration1237 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration1239 = new BitSet(new long[]{0x000FC00000080000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1279 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_conditionalImpliesExpression1292 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F89L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1296 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1341 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_conditionalOrExpression1354 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F89L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1358 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1402 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_conditionalXOrExpression1415 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F89L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1419 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1463 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_conditionalAndExpression1476 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F89L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1480 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1528 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_set_in_equalityExpression1547 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F89L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1557 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1606 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_set_in_relationalExpression1624 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F89L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1642 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1692 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression1710 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F89L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1720 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1770 = new BitSet(new long[]{0x0800014000000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1788 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F89L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1802 = new BitSet(new long[]{0x0800014000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpression1864 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F89L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression1941 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression1959 = new BitSet(new long[]{0x0000000000080000L,0x0000000000183A08L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression1965 = new BitSet(new long[]{0x0000000000080000L,0x0000000000183A08L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression1976 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_literal_in_primaryExpression2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression2053 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F99L});
    public static final BitSet FOLLOW_expression_in_primaryExpression2057 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression2083 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression2085 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_primaryExpression2087 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression2110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_primaryExpression2112 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression2130 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression2145 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression2147 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_primaryExpression2149 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression2153 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F99L});
    public static final BitSet FOLLOW_expression_in_primaryExpression2157 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression2159 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression2179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_primaryExpression2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference2207 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_objectReference2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inStateExpression_in_propertyCall2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression2367 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression2374 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F99L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression2385 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_queryExpression2389 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F99L});
    public static final BitSet FOLLOW_expression_in_queryExpression2400 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_iterateExpression2438 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression2444 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression2452 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression2454 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression2462 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression2464 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F99L});
    public static final BitSet FOLLOW_expression_in_iterateExpression2472 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression2522 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2544 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F99L});
    public static final BitSet FOLLOW_expression_in_operationExpression2557 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2570 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F99L});
    public static final BitSet FOLLOW_expression_in_operationExpression2574 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2586 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2603 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F99L});
    public static final BitSet FOLLOW_expression_in_operationExpression2618 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2633 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F99L});
    public static final BitSet FOLLOW_expression_in_operationExpression2637 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2651 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_operationExpression2676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_operationExpression2678 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression2703 = new BitSet(new long[]{0x801FC318861A0020L,0x0000000000587F99L});
    public static final BitSet FOLLOW_expression_in_operationExpression2724 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2736 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F99L});
    public static final BitSet FOLLOW_expression_in_operationExpression2740 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_inStateExpression2797 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_inStateExpression2802 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_inStateExpression2811 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_inStateExpression2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression2852 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression2876 = new BitSet(new long[]{0x000FC00000080000L});
    public static final BitSet FOLLOW_type_in_typeExpression2880 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2920 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2923 = new BitSet(new long[]{0x000FC00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration2927 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration2937 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2943 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2946 = new BitSet(new long[]{0x000FC00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration2952 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization2980 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization2982 = new BitSet(new long[]{0x000FC00000080000L});
    public static final BitSet FOLLOW_type_in_variableInitialization2986 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization2988 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F99L});
    public static final BitSet FOLLOW_expression_in_variableInitialization2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ifExpression3024 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F99L});
    public static final BitSet FOLLOW_expression_in_ifExpression3028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ifExpression3030 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F99L});
    public static final BitSet FOLLOW_expression_in_ifExpression3034 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ifExpression3036 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F99L});
    public static final BitSet FOLLOW_expression_in_ifExpression3040 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ifExpression3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_literal3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_literal3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal3147 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal3163 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal3165 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_literal3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral3267 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral3296 = new BitSet(new long[]{0x801FC30A861A0020L,0x0000000000587F99L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral3313 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral3326 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F99L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral3330 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem3378 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem3389 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F99L});
    public static final BitSet FOLLOW_expression_in_collectionItem3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_emptyCollectionLiteral3422 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral3424 = new BitSet(new long[]{0x0007C00000000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral3428 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral3446 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral3448 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_undefinedLiteral3480 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3482 = new BitSet(new long[]{0x000FC00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3486 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_undefinedLiteral3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_undefinedLiteral3516 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3518 = new BitSet(new long[]{0x000FC00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3522 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_undefinedLiteral3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_tupleLiteral3577 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral3583 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3591 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral3602 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3606 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem3648 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_tupleItem3687 = new BitSet(new long[]{0x000FC00000080000L});
    public static final BitSet FOLLOW_type_in_tupleItem3691 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem3693 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F99L});
    public static final BitSet FOLLOW_expression_in_tupleItem3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem3719 = new BitSet(new long[]{0x801FC308861A0020L,0x0000000000587F99L});
    public static final BitSet FOLLOW_expression_in_tupleItem3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly3851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly3853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType3919 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType3946 = new BitSet(new long[]{0x000FC00000080000L});
    public static final BitSet FOLLOW_type_in_collectionType3950 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_tupleType3986 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType3988 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType3997 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleType4008 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType4012 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart4056 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_tuplePart4058 = new BitSet(new long[]{0x000FC00000080000L});
    public static final BitSet FOLLOW_type_in_tuplePart4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_synpred1_Query3678 = new BitSet(new long[]{0x000FC00000080000L});
    public static final BitSet FOLLOW_type_in_synpred1_Query3680 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred1_Query3682 = new BitSet(new long[]{0x0000000000000002L});

}