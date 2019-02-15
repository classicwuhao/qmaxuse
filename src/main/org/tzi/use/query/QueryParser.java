// $ANTLR 3.4 Query.g 2019-02-15 16:13:59

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", "NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", "REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", "WS", "'&&'", "'Bag'", "'Collection'", "'OrderedSet'", "'Sequence'", "'Set'", "'Tuple'", "'Undefined'", "'allInstances'", "'and'", "'as'", "'byUseId'", "'div'", "'else'", "'endif'", "'false'", "'full'", "'if'", "'implies'", "'in'", "'iterate'", "'let'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", "'oclInState'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", "'or'", "'pre'", "'pure'", "'select'", "'selectByKind'", "'selectByType'", "'then'", "'true'", "'verify'", "'with'", "'withocl'", "'without'", "'xor'", "'||'"
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
    // Query.g:42:1: checkExpr : ( 'verify' qexpr= queryExpr ( '&&' queryExpr )* | ( '||' queryExpr )* );
    public final void checkExpr() throws RecognitionException {
        QueryExpr qexpr =null;


        try {
            // Query.g:42:10: ( 'verify' qexpr= queryExpr ( '&&' queryExpr )* | ( '||' queryExpr )* )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==82) ) {
                alt3=1;
            }
            else if ( (LA3_0==EOF||LA3_0==87) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // Query.g:43:5: 'verify' qexpr= queryExpr ( '&&' queryExpr )*
                    {
                    match(input,82,FOLLOW_82_in_checkExpr47); if (state.failed) return ;

                    pushFollow(FOLLOW_queryExpr_in_checkExpr51);
                    qexpr=queryExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    // Query.g:43:31: ( '&&' queryExpr )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==44) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // Query.g:43:32: '&&' queryExpr
                    	    {
                    	    match(input,44,FOLLOW_44_in_checkExpr55); if (state.failed) return ;

                    	    pushFollow(FOLLOW_queryExpr_in_checkExpr57);
                    	    queryExpr();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Query.g:43:51: ( '||' queryExpr )*
                    {
                    // Query.g:43:51: ( '||' queryExpr )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==87) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // Query.g:43:52: '||' queryExpr
                    	    {
                    	    match(input,87,FOLLOW_87_in_checkExpr64); if (state.failed) return ;

                    	    pushFollow(FOLLOW_queryExpr_in_checkExpr66);
                    	    queryExpr();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


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
    // $ANTLR end "checkExpr"



    // $ANTLR start "queryExpr"
    // Query.g:46:1: queryExpr returns [QueryExpr qexpr] : ( 'select' f= featureExpr ( COMMA f= featureExpr )* (with= withExpr )? (without= withoutExpr )? ( oclExpr )? ( 'as' name= IDENT )? |alias= IDENT );
    public final QueryExpr queryExpr() throws RecognitionException {
        QueryExpr qexpr = null;


        Token name=null;
        Token alias=null;
        QFeatureExpr f =null;

        QWithExpr with =null;

        QWithoutExpr without =null;



            qexpr = new QueryExpr();

        try {
            // Query.g:48:2: ( 'select' f= featureExpr ( COMMA f= featureExpr )* (with= withExpr )? (without= withoutExpr )? ( oclExpr )? ( 'as' name= IDENT )? |alias= IDENT )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==77) ) {
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
                    // Query.g:49:5: 'select' f= featureExpr ( COMMA f= featureExpr )* (with= withExpr )? (without= withoutExpr )? ( oclExpr )? ( 'as' name= IDENT )?
                    {
                    match(input,77,FOLLOW_77_in_queryExpr89); if (state.failed) return qexpr;

                    pushFollow(FOLLOW_featureExpr_in_queryExpr93);
                    f=featureExpr();

                    state._fsp--;
                    if (state.failed) return qexpr;

                    if ( state.backtracking==0 ) {qexpr.addFeature(f);}

                    // Query.g:49:52: ( COMMA f= featureExpr )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==COMMA) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Query.g:49:53: COMMA f= featureExpr
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_queryExpr98); if (state.failed) return qexpr;

                    	    pushFollow(FOLLOW_featureExpr_in_queryExpr102);
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


                    // Query.g:50:9: (with= withExpr )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==83) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // Query.g:50:10: with= withExpr
                            {
                            pushFollow(FOLLOW_withExpr_in_queryExpr120);
                            with=withExpr();

                            state._fsp--;
                            if (state.failed) return qexpr;

                            if ( state.backtracking==0 ) {qexpr.addWithExpr(with);}

                            }
                            break;

                    }


                    // Query.g:51:9: (without= withoutExpr )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==85) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // Query.g:51:10: without= withoutExpr
                            {
                            pushFollow(FOLLOW_withoutExpr_in_queryExpr138);
                            without=withoutExpr();

                            state._fsp--;
                            if (state.failed) return qexpr;

                            if ( state.backtracking==0 ) {qexpr.addWithoutExpr(without);}

                            }
                            break;

                    }


                    // Query.g:51:66: ( oclExpr )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==84) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // Query.g:51:67: oclExpr
                            {
                            pushFollow(FOLLOW_oclExpr_in_queryExpr145);
                            oclExpr();

                            state._fsp--;
                            if (state.failed) return qexpr;

                            }
                            break;

                    }


                    // Query.g:52:9: ( 'as' name= IDENT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==54) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // Query.g:52:10: 'as' name= IDENT
                            {
                            match(input,54,FOLLOW_54_in_queryExpr159); if (state.failed) return qexpr;

                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpr163); if (state.failed) return qexpr;

                            if ( state.backtracking==0 ) {qexpr.setAlias(name.getText());}

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {System.out.println(qexpr.toString());}

                    }
                    break;
                case 2 :
                    // Query.g:54:6: alias= IDENT
                    {
                    alias=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpr184); if (state.failed) return qexpr;

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
        return qexpr;
    }
    // $ANTLR end "queryExpr"



    // $ANTLR start "modifiers"
    // Query.g:63:1: modifiers : ( 'pure' | 'full' );
    public final void modifiers() throws RecognitionException {
        try {
            // Query.g:63:10: ( 'pure' | 'full' )
            // Query.g:
            {
            if ( input.LA(1)==60||input.LA(1)==76 ) {
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
    // Query.g:69:1: featureExpr returns [QFeatureExpr feature] : ( ( 'pure' )? dest= ( IDENT | STAR ) |f1= attrExpr |f2= assocExpr );
    public final QFeatureExpr featureExpr() throws RecognitionException {
        QFeatureExpr feature = null;


        Token dest=null;
        QAttrExpr f1 =null;

        QAssocExpr f2 =null;



            boolean isPure=false;

        try {
            // Query.g:72:2: ( ( 'pure' )? dest= ( IDENT | STAR ) |f1= attrExpr |f2= assocExpr )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==76) ) {
                alt11=1;
            }
            else if ( (LA11_0==IDENT||LA11_0==STAR) ) {
                switch ( input.LA(2) ) {
                case DOT:
                    {
                    alt11=2;
                    }
                    break;
                case COLON:
                    {
                    alt11=3;
                    }
                    break;
                case EOF:
                case COMMA:
                case 44:
                case 54:
                case 83:
                case 84:
                case 85:
                case 87:
                    {
                    alt11=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return feature;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;

                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return feature;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // Query.g:73:3: ( 'pure' )? dest= ( IDENT | STAR )
                    {
                    // Query.g:73:3: ( 'pure' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==76) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // Query.g:73:4: 'pure'
                            {
                            match(input,76,FOLLOW_76_in_featureExpr242); if (state.failed) return feature;

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
                        if (state.backtracking>0) {state.failed=true; return feature;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    if ( state.backtracking==0 ) {feature = new QClassExpr(dest.getText(),isPure);}

                    }
                    break;
                case 2 :
                    // Query.g:74:6: f1= attrExpr
                    {
                    pushFollow(FOLLOW_attrExpr_in_featureExpr270);
                    f1=attrExpr();

                    state._fsp--;
                    if (state.failed) return feature;

                    if ( state.backtracking==0 ) {feature =f1;}

                    }
                    break;
                case 3 :
                    // Query.g:75:6: f2= assocExpr
                    {
                    pushFollow(FOLLOW_assocExpr_in_featureExpr283);
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



    // $ANTLR start "attrExpr"
    // Query.g:78:1: attrExpr returns [QAttrExpr attr] : src= ( IDENT | STAR ) DOT dest= ( IDENT | STAR ) ;
    public final QAttrExpr attrExpr() throws RecognitionException {
        QAttrExpr attr = null;


        Token src=null;
        Token dest=null;

        try {
            // Query.g:78:34: (src= ( IDENT | STAR ) DOT dest= ( IDENT | STAR ) )
            // Query.g:79:5: src= ( IDENT | STAR ) DOT dest= ( IDENT | STAR )
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


            match(input,DOT,FOLLOW_DOT_in_attrExpr309); if (state.failed) return attr;

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
    // Query.g:82:1: assocExpr returns [QAssocExpr assoc] : src= ( IDENT | STAR ) COLON dest= ( IDENT | STAR ) ;
    public final QAssocExpr assocExpr() throws RecognitionException {
        QAssocExpr assoc = null;


        Token src=null;
        Token dest=null;

        try {
            // Query.g:83:3: (src= ( IDENT | STAR ) COLON dest= ( IDENT | STAR ) )
            // Query.g:83:3: src= ( IDENT | STAR ) COLON dest= ( IDENT | STAR )
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


            match(input,COLON,FOLLOW_COLON_in_assocExpr342); if (state.failed) return assoc;

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


            if ( state.backtracking==0 ) {assoc = new QAssocExpr(src.getText(),dest.getText());}

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
    // Query.g:86:1: withExpr returns [QWithExpr with] : 'with' w= invExpr ( COMMA w= invExpr )* ;
    public final QWithExpr withExpr() throws RecognitionException {
        QWithExpr with = null;


        QInvExpr w =null;



            with = new QWithExpr();

        try {
            // Query.g:88:2: ( 'with' w= invExpr ( COMMA w= invExpr )* )
            // Query.g:89:5: 'with' w= invExpr ( COMMA w= invExpr )*
            {
            match(input,83,FOLLOW_83_in_withExpr374); if (state.failed) return with;

            pushFollow(FOLLOW_invExpr_in_withExpr378);
            w=invExpr();

            state._fsp--;
            if (state.failed) return with;

            if ( state.backtracking==0 ) {with.addInvExpr(w);}

            // Query.g:89:44: ( COMMA w= invExpr )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Query.g:89:45: COMMA w= invExpr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_withExpr382); if (state.failed) return with;

            	    pushFollow(FOLLOW_invExpr_in_withExpr386);
            	    w=invExpr();

            	    state._fsp--;
            	    if (state.failed) return with;

            	    if ( state.backtracking==0 ) {with.addInvExpr(w);}

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
        return with;
    }
    // $ANTLR end "withExpr"



    // $ANTLR start "withoutExpr"
    // Query.g:91:1: withoutExpr returns [QWithoutExpr without] : 'without' w= invExpr ( COMMA w= invExpr )* ;
    public final QWithoutExpr withoutExpr() throws RecognitionException {
        QWithoutExpr without = null;


        QInvExpr w =null;



            without = new QWithoutExpr();

        try {
            // Query.g:94:5: ( 'without' w= invExpr ( COMMA w= invExpr )* )
            // Query.g:95:5: 'without' w= invExpr ( COMMA w= invExpr )*
            {
            match(input,85,FOLLOW_85_in_withoutExpr409); if (state.failed) return without;

            pushFollow(FOLLOW_invExpr_in_withoutExpr413);
            w=invExpr();

            state._fsp--;
            if (state.failed) return without;

            if ( state.backtracking==0 ) {without.addInvExpr(w);}

            // Query.g:95:50: ( COMMA w= invExpr )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Query.g:95:51: COMMA w= invExpr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_withoutExpr417); if (state.failed) return without;

            	    pushFollow(FOLLOW_invExpr_in_withoutExpr421);
            	    w=invExpr();

            	    state._fsp--;
            	    if (state.failed) return without;

            	    if ( state.backtracking==0 ) {without.addInvExpr(w);}

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
        return without;
    }
    // $ANTLR end "withoutExpr"



    // $ANTLR start "invExpr"
    // Query.g:98:1: invExpr returns [QInvExpr inv] : src= ( IDENT | STAR ) COLON_COLON dest= ( IDENT | STAR ) ;
    public final QInvExpr invExpr() throws RecognitionException {
        QInvExpr inv = null;


        Token src=null;
        Token dest=null;

        try {
            // Query.g:98:31: (src= ( IDENT | STAR ) COLON_COLON dest= ( IDENT | STAR ) )
            // Query.g:99:5: src= ( IDENT | STAR ) COLON_COLON dest= ( IDENT | STAR )
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


            match(input,COLON_COLON,FOLLOW_COLON_COLON_in_invExpr451); if (state.failed) return inv;

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



    // $ANTLR start "oclExpr"
    // Query.g:102:1: oclExpr : 'withocl' expression ;
    public final void oclExpr() throws RecognitionException {
        try {
            // Query.g:102:8: ( 'withocl' expression )
            // Query.g:102:10: 'withocl' expression
            {
            match(input,84,FOLLOW_84_in_oclExpr471); if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_oclExpr473);
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



    // $ANTLR start "expressionOnly"
    // Query.g:133:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExp =null;


        try {
            // Query.g:134:5: (nExp= expression EOF )
            // Query.g:135:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly502);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_expressionOnly504); if (state.failed) return n;

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
    // Query.g:142:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
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
            // Query.g:148:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
            // Query.g:149:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }

            // Query.g:150:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==65) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Query.g:151:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
            	    {
            	    match(input,65,FOLLOW_65_in_expression552); if (state.failed) return n;

            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression563); if (state.failed) return n;

            	    // Query.g:152:18: ( COLON t= type )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==COLON) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // Query.g:152:20: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression567); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_expression571);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression576); if (state.failed) return n;

            	    pushFollow(FOLLOW_expression_in_expression580);
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

            	    // Query.g:162:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==COMMA) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // Query.g:163:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_expression618); if (state.failed) return n;

            	    	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression630); if (state.failed) return n;

            	    	    // Query.g:164:20: ( COLON t= type )?
            	    	    int alt15=2;
            	    	    int LA15_0 = input.LA(1);

            	    	    if ( (LA15_0==COLON) ) {
            	    	        alt15=1;
            	    	    }
            	    	    switch (alt15) {
            	    	        case 1 :
            	    	            // Query.g:164:22: COLON t= type
            	    	            {
            	    	            match(input,COLON,FOLLOW_COLON_in_expression634); if (state.failed) return n;

            	    	            pushFollow(FOLLOW_type_in_expression638);
            	    	            t=type();

            	    	            state._fsp--;
            	    	            if (state.failed) return n;

            	    	            }
            	    	            break;

            	    	    }


            	    	    match(input,EQUAL,FOLLOW_EQUAL_in_expression643); if (state.failed) return n;

            	    	    pushFollow(FOLLOW_expression_in_expression647);
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
            	    	    break loop16;
            	        }
            	    } while (true);


            	    match(input,63,FOLLOW_63_in_expression688); if (state.failed) return n;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression704);
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
    // Query.g:197:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;


        ASTVariableDeclaration v =null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // Query.g:199:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // Query.g:200:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList737); if (state.failed) return paramList;

            // Query.g:201:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDENT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Query.g:202:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList754);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;

                    if ( state.backtracking==0 ) { paramList.add(v); }

                    // Query.g:203:7: ( COMMA v= variableDeclaration )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==COMMA) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // Query.g:203:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList766); if (state.failed) return paramList;

                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList770);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;

                    	    if ( state.backtracking==0 ) { paramList.add(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_paramList790); if (state.failed) return paramList;

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
    // Query.g:211:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;


        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // Query.g:213:5: (id0= IDENT ( COMMA idn= IDENT )* )
            // Query.g:214:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList819); if (state.failed) return idList;

            if ( state.backtracking==0 ) { idList.add(id0); }

            // Query.g:215:5: ( COMMA idn= IDENT )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Query.g:215:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList829); if (state.failed) return idList;

            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList833); if (state.failed) return idList;

            	    if ( state.backtracking==0 ) { idList.add(idn); }

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
        return idList;
    }
    // $ANTLR end "idList"



    // $ANTLR start "variableDeclaration"
    // Query.g:223:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Query.g:224:5: (name= IDENT COLON t= type )
            // Query.g:225:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration864); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableDeclaration866); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableDeclaration870);
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
    // Query.g:233:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndOrExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:234:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // Query.g:235:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression906);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndOrExp;}

            // Query.g:236:5: (op= 'implies' n1= conditionalOrExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==62) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Query.g:236:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,62,FOLLOW_62_in_conditionalImpliesExpression919); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression923);
            	    n1=conditionalOrExpression();

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
    // $ANTLR end "conditionalImpliesExpression"



    // $ANTLR start "conditionalOrExpression"
    // Query.g:245:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndXorExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:246:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // Query.g:247:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression968);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndXorExp;}

            // Query.g:248:5: (op= 'or' n1= conditionalXOrExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==74) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Query.g:248:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,74,FOLLOW_74_in_conditionalOrExpression981); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression985);
            	    n1=conditionalXOrExpression();

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
    // $ANTLR end "conditionalOrExpression"



    // $ANTLR start "conditionalXOrExpression"
    // Query.g:257:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndAndExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:258:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // Query.g:259:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1029);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndAndExp;}

            // Query.g:260:5: (op= 'xor' n1= conditionalAndExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==86) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Query.g:260:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,86,FOLLOW_86_in_conditionalXOrExpression1042); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1046);
            	    n1=conditionalAndExpression();

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
    // $ANTLR end "conditionalXOrExpression"



    // $ANTLR start "conditionalAndExpression"
    // Query.g:269:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nEqExp =null;

        ASTExpression n1 =null;


        try {
            // Query.g:270:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // Query.g:271:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1090);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nEqExp;}

            // Query.g:272:5: (op= 'and' n1= equalityExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==53) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Query.g:272:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,53,FOLLOW_53_in_conditionalAndExpression1103); if (state.failed) return n;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1107);
            	    n1=equalityExpression();

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
    // $ANTLR end "conditionalAndExpression"



    // $ANTLR start "equalityExpression"
    // Query.g:281:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nRelExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:283:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // Query.g:284:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1155);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nRelExp;}

            // Query.g:285:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==EQUAL||LA25_0==NOT_EQUAL) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Query.g:285:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1184);
            	    n1=relationalExpression();

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
    // $ANTLR end "equalityExpression"



    // $ANTLR start "relationalExpression"
    // Query.g:295:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nAddiExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:297:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // Query.g:298:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1233);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nAddiExp;}

            // Query.g:299:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0 >= GREATER && LA26_0 <= GREATER_EQUAL)||(LA26_0 >= LESS && LA26_0 <= LESS_EQUAL)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // Query.g:299:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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


            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1269);
            	    n1=additiveExpression();

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
    // $ANTLR end "relationalExpression"



    // $ANTLR start "additiveExpression"
    // Query.g:309:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nMulExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:311:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // Query.g:312:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1319);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nMulExp;}

            // Query.g:313:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==MINUS||LA27_0==PLUS) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // Query.g:313:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1347);
            	    n1=multiplicativeExpression();

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
    // $ANTLR end "additiveExpression"



    // $ANTLR start "multiplicativeExpression"
    // Query.g:324:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Query.g:326:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // Query.g:327:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1397);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nUnExp;}

            // Query.g:328:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==SLASH||LA28_0==STAR||LA28_0==56) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Query.g:328:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==56 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1429);
            	    n1=unaryExpression();

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
    // $ANTLR end "multiplicativeExpression"



    // $ANTLR start "unaryExpression"
    // Query.g:340:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression nPosExp =null;


         Token op = null; 
        try {
            // Query.g:342:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==MINUS||LA29_0==PLUS||LA29_0==66) ) {
                alt29=1;
            }
            else if ( (LA29_0==AT||LA29_0==HASH||(LA29_0 >= IDENT && LA29_0 <= INT)||LA29_0==LPAREN||LA29_0==REAL||(LA29_0 >= STAR && LA29_0 <= STRING)||(LA29_0 >= 45 && LA29_0 <= 51)||LA29_0==59||LA29_0==61||LA29_0==64||(LA29_0 >= 67 && LA29_0 <= 73)||(LA29_0 >= 78 && LA29_0 <= 79)||LA29_0==81) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // Query.g:343:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // Query.g:343:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // Query.g:343:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) { op = input.LT(1); }

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==66 ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1515);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }

                    }


                    }
                    break;
                case 2 :
                    // Query.g:347:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression1535);
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
    // Query.g:355:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nPrimExp =null;

        ASTExpression nPc =null;


         boolean arrow = false; 
        try {
            // Query.g:357:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // Query.g:358:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression1568);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nPrimExp; }

            // Query.g:359:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==ARROW||LA31_0==DOT) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // Query.g:360:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // Query.g:360:6: ( ARROW | DOT )
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==ARROW) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==DOT) ) {
            	        alt30=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // Query.g:360:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression1586); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = true; }

            	            }
            	            break;
            	        case 2 :
            	            // Query.g:360:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression1592); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = false; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression1603);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = nPc; }

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
    // $ANTLR end "postfixExpression"



    // $ANTLR start "primaryExpression"
    // Query.g:376:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? );
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
            // Query.g:377:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? )
            int alt35=7;
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
            case 59:
            case 67:
            case 69:
            case 73:
            case 81:
                {
                alt35=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt35=1;
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
                case 44:
                case 53:
                case 54:
                case 56:
                case 57:
                case 58:
                case 62:
                case 63:
                case 74:
                case 80:
                case 86:
                case 87:
                    {
                    alt35=3;
                    }
                    break;
                case DOT:
                    {
                    switch ( input.LA(3) ) {
                    case 52:
                        {
                        alt35=6;
                        }
                        break;
                    case 55:
                        {
                        alt35=7;
                        }
                        break;
                    case IDENT:
                    case 64:
                    case 68:
                    case 70:
                    case 71:
                    case 72:
                    case 78:
                    case 79:
                        {
                        alt35=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 7, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 2, input);

                    throw nvae;

                }

                }
                break;
            case AT:
                {
                alt35=2;
                }
                break;
            case 64:
            case 68:
            case 70:
            case 71:
            case 72:
            case 78:
            case 79:
                {
                alt35=3;
                }
                break;
            case LPAREN:
                {
                alt35=4;
                }
                break;
            case 61:
                {
                alt35=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }

            switch (alt35) {
                case 1 :
                    // Query.g:378:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression1643);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nLit; }

                    }
                    break;
                case 2 :
                    // Query.g:379:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression1657);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nOr; }

                    }
                    break;
                case 3 :
                    // Query.g:380:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression1669);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPc; }

                    }
                    break;
                case 4 :
                    // Query.g:381:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1680); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression1684);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1686); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExp; }

                    }
                    break;
                case 5 :
                    // Query.g:382:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression1698);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nIfExp; }

                    }
                    break;
                case 6 :
                    // Query.g:383:7: id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression1710); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression1712); if (state.failed) return n;

                    match(input,52,FOLLOW_52_in_primaryExpression1714); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }

                    // Query.g:385:9: ( AT 'pre' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==AT) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // Query.g:385:11: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression1737); if (state.failed) return n;

                            match(input,75,FOLLOW_75_in_primaryExpression1739); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setIsPre(); }

                            }
                            break;

                    }


                    // Query.g:386:9: ( LPAREN RPAREN )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==LPAREN) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // Query.g:386:11: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1757); if (state.failed) return n;

                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1759); if (state.failed) return n;

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // Query.g:387:7: id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )?
                    {
                    id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression1772); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression1774); if (state.failed) return n;

                    match(input,55,FOLLOW_55_in_primaryExpression1776); if (state.failed) return n;

                    // Query.g:387:31: ( LPAREN idExp= expression RPAREN )
                    // Query.g:387:33: LPAREN idExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1780); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression1784);
                    idExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1786); if (state.failed) return n;

                    }


                    if ( state.backtracking==0 ) { n = new ASTObjectByUseIdExpression(id2, idExp); }

                    // Query.g:389:7: ( AT 'pre' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==AT) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // Query.g:389:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression1806); if (state.failed) return n;

                            match(input,75,FOLLOW_75_in_primaryExpression1808); if (state.failed) return n;

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
    // Query.g:393:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;


        Token objectName=null;

        try {
            // Query.g:394:3: ( AT objectName= IDENT )
            // Query.g:395:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference1834); if (state.failed) return n;

            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference1842); if (state.failed) return n;

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
    // Query.g:409:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExpQuery =null;

        ASTExpression nExpIterate =null;

        QueryParser.operationExpression_return nExpOperation =null;

        ASTTypeArgExpression nExpType =null;

        ASTInStateExpression nExpInState =null;


        try {
            // Query.g:410:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] )
            int alt36=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA36_1 = input.LA(2);

                if ( (((( input.LA(2) == LPAREN )&&( input.LA(2) == LPAREN ))&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))) ) {
                    alt36=1;
                }
                else if ( (true) ) {
                    alt36=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;

                }
                }
                break;
            case 64:
                {
                alt36=2;
                }
                break;
            case 68:
            case 71:
            case 72:
            case 78:
            case 79:
                {
                alt36=4;
                }
                break;
            case 70:
                {
                alt36=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // Query.g:414:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }

                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }

                    pushFollow(FOLLOW_queryExpression_in_propertyCall1907);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpQuery; }

                    }
                    break;
                case 2 :
                    // Query.g:417:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall1920);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpIterate; }

                    }
                    break;
                case 3 :
                    // Query.g:418:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall1933);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExpOperation!=null?nExpOperation.n:null); }

                    }
                    break;
                case 4 :
                    // Query.g:419:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall1946);
                    nExpType=typeExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpType; }

                    }
                    break;
                case 5 :
                    // Query.g:420:7: nExpInState= inStateExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_inStateExpression_in_propertyCall1959);
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
    // Query.g:429:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTElemVarsDeclaration decls =null;

        ASTExpression nExp =null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // Query.g:430:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // Query.g:431:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression1994); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression2001); if (state.failed) return n;

            // Query.g:433:5: (decls= elemVarsDeclaration BAR )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==IDENT) ) {
                int LA37_1 = input.LA(2);

                if ( ((LA37_1 >= BAR && LA37_1 <= COLON)||LA37_1==COMMA) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // Query.g:433:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression2012);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {decl = decls;}

                    match(input,BAR,FOLLOW_BAR_in_queryExpression2016); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_queryExpression2027);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression2033); if (state.failed) return n;

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
    // Query.g:447:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTElemVarsDeclaration decls =null;

        ASTVariableInitialization init =null;

        ASTExpression nExp =null;


        try {
            // Query.g:447:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // Query.g:448:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,64,FOLLOW_64_in_iterateExpression2065); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression2071); if (state.failed) return n;

            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression2079);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;

            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression2081); if (state.failed) return n;

            pushFollow(FOLLOW_variableInitialization_in_iterateExpression2089);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;

            match(input,BAR,FOLLOW_BAR_in_iterateExpression2091); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_iterateExpression2099);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression2105); if (state.failed) return n;

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
    // Query.g:469:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final QueryParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        QueryParser.operationExpression_return retval = new QueryParser.operationExpression_return();
        retval.start = input.LT(1);


        Token name=null;
        ASTExpression rolename =null;

        ASTExpression e =null;


        try {
            // Query.g:471:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // Query.g:472:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression2149); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }

            // Query.g:478:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==LBRACK) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // Query.g:478:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2171); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_operationExpression2184);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier(rolename); }

                    // Query.g:480:9: ( COMMA rolename= expression )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==COMMA) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // Query.g:480:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2197); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_operationExpression2201);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier(rolename); }

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2213); if (state.failed) return retval;

                    // Query.g:483:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==LBRACK) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // Query.g:483:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2230); if (state.failed) return retval;

                            pushFollow(FOLLOW_expression_in_operationExpression2245);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addQualifier(rolename); }

                            // Query.g:485:11: ( COMMA rolename= expression )*
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==COMMA) ) {
                                    alt39=1;
                                }


                                switch (alt39) {
                            	case 1 :
                            	    // Query.g:485:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2260); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression2264);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addQualifier(rolename); }

                            	    }
                            	    break;

                            	default :
                            	    break loop39;
                                }
                            } while (true);


                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2278); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            // Query.g:490:5: ( AT 'pre' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==AT) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // Query.g:490:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression2303); if (state.failed) return retval;

                    match(input,75,FOLLOW_75_in_operationExpression2305); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.setIsPre(); }

                    }
                    break;

            }


            // Query.g:492:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==LPAREN) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // Query.g:493:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression2330); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.hasParentheses(); }

                    // Query.g:494:7: (e= expression ( COMMA e= expression )* )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==AT||LA44_0==HASH||(LA44_0 >= IDENT && LA44_0 <= INT)||(LA44_0 >= LPAREN && LA44_0 <= MINUS)||LA44_0==PLUS||LA44_0==REAL||(LA44_0 >= STAR && LA44_0 <= STRING)||(LA44_0 >= 45 && LA44_0 <= 51)||LA44_0==59||LA44_0==61||(LA44_0 >= 64 && LA44_0 <= 73)||(LA44_0 >= 78 && LA44_0 <= 79)||LA44_0==81) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // Query.g:495:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression2351);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addArg(e); }

                            // Query.g:496:7: ( COMMA e= expression )*
                            loop43:
                            do {
                                int alt43=2;
                                int LA43_0 = input.LA(1);

                                if ( (LA43_0==COMMA) ) {
                                    alt43=1;
                                }


                                switch (alt43) {
                            	case 1 :
                            	    // Query.g:496:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2363); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression2367);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addArg(e); }

                            	    }
                            	    break;

                            	default :
                            	    break loop43;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression2387); if (state.failed) return retval;

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
    // Query.g:503:1: inStateExpression[ASTExpression source, boolean followsArrow] returns [ASTInStateExpression n] : opToken= 'oclInState' LPAREN s= IDENT RPAREN ;
    public final ASTInStateExpression inStateExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTInStateExpression n = null;


        Token opToken=null;
        Token s=null;

        try {
            // Query.g:504:35: (opToken= 'oclInState' LPAREN s= IDENT RPAREN )
            // Query.g:505:4: opToken= 'oclInState' LPAREN s= IDENT RPAREN
            {
            opToken=(Token)match(input,70,FOLLOW_70_in_inStateExpression2424); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_inStateExpression2429); if (state.failed) return n;

            s=(Token)match(input,IDENT,FOLLOW_IDENT_in_inStateExpression2438); if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_inStateExpression2443); if (state.failed) return n;

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
    // Query.g:517:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;


        ASTType t =null;


         Token opToken = null; 
        try {
            // Query.g:520:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN )
            // Query.g:521:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) { opToken = input.LT(1); }

            if ( input.LA(1)==68||(input.LA(1) >= 71 && input.LA(1) <= 72)||(input.LA(1) >= 78 && input.LA(1) <= 79) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression2503); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_typeExpression2507);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression2509); if (state.failed) return n;

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
    // Query.g:532:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;


        Token var1=null;
        Token varN=null;
        ASTType t =null;

        ASTType tN =null;


        try {
            // Query.g:533:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // Query.g:534:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }

            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2547); if (state.failed) return n;

            // Query.g:535:17: ( COLON t= type )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==COLON) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // Query.g:535:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2550); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_elemVarsDeclaration2554);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}

            // Query.g:536:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==COMMA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // Query.g:536:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration2564); if (state.failed) return n;

            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2570); if (state.failed) return n;

            	    // Query.g:536:24: ( COLON tN= type )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==COLON) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // Query.g:536:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2573); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration2579);
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
            	    break loop48;
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
    // Query.g:544:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;


        Token name=null;
        ASTType t =null;

        ASTExpression e =null;


        try {
            // Query.g:545:5: (name= IDENT COLON t= type EQUAL e= expression )
            // Query.g:546:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization2607); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableInitialization2609); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableInitialization2613);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization2615); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_variableInitialization2619);
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
    // Query.g:555:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTExpression cond =null;

        ASTExpression t =null;

        ASTExpression e =null;


        try {
            // Query.g:556:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // Query.g:557:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,61,FOLLOW_61_in_ifExpression2651); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression2655);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,80,FOLLOW_80_in_ifExpression2657); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression2661);
            t=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,57,FOLLOW_57_in_ifExpression2663); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression2667);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,58,FOLLOW_58_in_ifExpression2669); if (state.failed) return n;

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
    // Query.g:576:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR );
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
            // Query.g:577:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR )
            int alt49=12;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt49=1;
                }
                break;
            case 59:
                {
                alt49=2;
                }
                break;
            case INT:
                {
                alt49=3;
                }
                break;
            case REAL:
                {
                alt49=4;
                }
                break;
            case STRING:
                {
                alt49=5;
                }
                break;
            case HASH:
                {
                alt49=6;
                }
                break;
            case IDENT:
                {
                alt49=7;
                }
                break;
            case 45:
            case 47:
            case 48:
            case 49:
                {
                int LA49_8 = input.LA(2);

                if ( (LA49_8==LPAREN) ) {
                    alt49=9;
                }
                else if ( (LA49_8==LBRACE) ) {
                    alt49=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 8, input);

                    throw nvae;

                }
                }
                break;
            case 46:
            case 69:
                {
                alt49=9;
                }
                break;
            case 51:
            case 67:
            case 73:
                {
                alt49=10;
                }
                break;
            case 50:
                {
                alt49=11;
                }
                break;
            case STAR:
                {
                alt49=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }

            switch (alt49) {
                case 1 :
                    // Query.g:578:7: t= 'true'
                    {
                    t=(Token)match(input,81,FOLLOW_81_in_literal2708); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }

                    }
                    break;
                case 2 :
                    // Query.g:579:7: f= 'false'
                    {
                    f=(Token)match(input,59,FOLLOW_59_in_literal2722); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }

                    }
                    break;
                case 3 :
                    // Query.g:580:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal2735); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }

                    }
                    break;
                case 4 :
                    // Query.g:581:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal2750); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }

                    }
                    break;
                case 5 :
                    // Query.g:582:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal2764); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }

                    }
                    break;
                case 6 :
                    // Query.g:583:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal2774); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2778); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}

                    }
                    break;
                case 7 :
                    // Query.g:584:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2790); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal2792); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2796); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }

                    }
                    break;
                case 8 :
                    // Query.g:585:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal2808);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nColIt; }

                    }
                    break;
                case 9 :
                    // Query.g:586:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal2820);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nEColIt; }

                    }
                    break;
                case 10 :
                    // Query.g:587:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal2832);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nUndLit; }

                    }
                    break;
                case 11 :
                    // Query.g:588:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal2844);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nTupleLit; }

                    }
                    break;
                case 12 :
                    // Query.g:589:7: un= STAR
                    {
                    un=(Token)match(input,STAR,FOLLOW_STAR_in_literal2856); if (state.failed) return n;

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
    // Query.g:597:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;


        ASTCollectionItem ci =null;


         Token op = null; 
        try {
            // Query.g:599:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // Query.g:600:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
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

            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral2923); if (state.failed) return n;

            // Query.g:604:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==AT||LA51_0==HASH||(LA51_0 >= IDENT && LA51_0 <= INT)||(LA51_0 >= LPAREN && LA51_0 <= MINUS)||LA51_0==PLUS||LA51_0==REAL||(LA51_0 >= STAR && LA51_0 <= STRING)||(LA51_0 >= 45 && LA51_0 <= 51)||LA51_0==59||LA51_0==61||(LA51_0 >= 64 && LA51_0 <= 73)||(LA51_0 >= 78 && LA51_0 <= 79)||LA51_0==81) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // Query.g:605:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral2940);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addItem(ci); }

                    // Query.g:606:7: ( COMMA ci= collectionItem )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==COMMA) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // Query.g:606:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral2953); if (state.failed) return n;

                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral2957);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addItem(ci); }

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral2976); if (state.failed) return n;

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
    // Query.g:615:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;


        ASTExpression e =null;


         n = new ASTCollectionItem(); 
        try {
            // Query.g:617:5: (e= expression ( DOTDOT e= expression )? )
            // Query.g:618:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem3005);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setFirst(e); }

            // Query.g:619:5: ( DOTDOT e= expression )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==DOTDOT) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // Query.g:619:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem3016); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_collectionItem3020);
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
    // Query.g:629:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;


        ASTCollectionType t =null;


        try {
            // Query.g:630:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==69) ) {
                alt53=1;
            }
            else if ( ((LA53_0 >= 45 && LA53_0 <= 49)) ) {
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
                    // Query.g:631:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,69,FOLLOW_69_in_emptyCollectionLiteral3049); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral3051); if (state.failed) return n;

                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral3055);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral3057); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;
                case 2 :
                    // Query.g:634:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral3073);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral3075); if (state.failed) return n;

                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral3077); if (state.failed) return n;

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
    // Query.g:645:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;


        ASTType t =null;


        try {
            // Query.g:646:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt54=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt54=1;
                }
                break;
            case 51:
                {
                alt54=2;
                }
                break;
            case 67:
                {
                int LA54_3 = input.LA(2);

                if ( (LA54_3==LPAREN) ) {
                    alt54=3;
                }
                else if ( (LA54_3==EOF||LA54_3==ARROW||LA54_3==BAR||(LA54_3 >= COMMA && LA54_3 <= EQUAL)||(LA54_3 >= GREATER && LA54_3 <= GREATER_EQUAL)||(LA54_3 >= LESS && LA54_3 <= LESS_EQUAL)||LA54_3==MINUS||(LA54_3 >= NOT_EQUAL && LA54_3 <= PLUS)||(LA54_3 >= RBRACE && LA54_3 <= RBRACK)||LA54_3==RPAREN||LA54_3==SLASH||LA54_3==STAR||LA54_3==44||(LA54_3 >= 53 && LA54_3 <= 54)||(LA54_3 >= 56 && LA54_3 <= 58)||(LA54_3 >= 62 && LA54_3 <= 63)||LA54_3==74||LA54_3==80||(LA54_3 >= 86 && LA54_3 <= 87)) ) {
                    alt54=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 3, input);

                    throw nvae;

                }
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
                    // Query.g:647:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,73,FOLLOW_73_in_undefinedLiteral3107); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3109); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral3113);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3115); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 2 :
                    // Query.g:650:5: 'Undefined'
                    {
                    match(input,51,FOLLOW_51_in_undefinedLiteral3129); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;
                case 3 :
                    // Query.g:653:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,67,FOLLOW_67_in_undefinedLiteral3143); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3145); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral3149);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3151); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 4 :
                    // Query.g:656:5: 'null'
                    {
                    match(input,67,FOLLOW_67_in_undefinedLiteral3165); if (state.failed) return n;

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
    // Query.g:666:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;


        ASTTupleItem ti =null;


         List tiList = new ArrayList(); 
        try {
            // Query.g:668:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // Query.g:669:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,50,FOLLOW_50_in_tupleLiteral3204); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral3210); if (state.failed) return n;

            pushFollow(FOLLOW_tupleItem_in_tupleLiteral3218);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tiList.add(ti); }

            // Query.g:672:5: ( COMMA ti= tupleItem )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==COMMA) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // Query.g:672:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral3229); if (state.failed) return n;

            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral3233);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tiList.add(ti); }

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral3244); if (state.failed) return n;

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
    // Query.g:680:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;


        Token name=null;
        ASTType t =null;

        ASTExpression e =null;


        try {
            // Query.g:681:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // Query.g:682:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem3275); if (state.failed) return n;

            // Query.g:683:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==COLON) ) {
                int LA56_1 = input.LA(2);

                if ( (synpred1_Query()) ) {
                    alt56=1;
                }
                else if ( (true) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA56_0==EQUAL) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }
            switch (alt56) {
                case 1 :
                    // Query.g:686:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem3314); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_tupleItem3318);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem3320); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_tupleItem3324);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, e); }

                    }
                    break;
                case 2 :
                    // Query.g:689:7: ( COLON | EQUAL ) e= expression
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


                    pushFollow(FOLLOW_expression_in_tupleItem3356);
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
    // Query.g:700:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;


        ASTSimpleType nTSimple =null;

        ASTCollectionType nTCollection =null;

        ASTTupleType nTTuple =null;


         Token tok = null; 
        try {
            // Query.g:702:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
            // Query.g:703:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }

            // Query.g:704:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            int alt57=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt57=1;
                }
                break;
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                {
                alt57=2;
                }
                break;
            case 50:
                {
                alt57=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }

            switch (alt57) {
                case 1 :
                    // Query.g:705:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type3422);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 2 :
                    // Query.g:706:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type3434);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 3 :
                    // Query.g:707:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type3446);
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
    // Query.g:712:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;


        ASTType nT =null;


        try {
            // Query.g:713:5: (nT= type EOF )
            // Query.g:714:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly3478);
            nT=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_typeOnly3480); if (state.failed) return n;

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
    // Query.g:724:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;


        Token name=null;

        try {
            // Query.g:725:5: (name= IDENT )
            // Query.g:726:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType3508); if (state.failed) return n;

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
    // Query.g:734:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;


        ASTType elemType =null;


         Token op = null; 
        try {
            // Query.g:736:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // Query.g:737:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
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


            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType3573); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_collectionType3577);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType3579); if (state.failed) return n;

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
    // Query.g:747:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;


        ASTTuplePart tp =null;


         List tpList = new ArrayList(); 
        try {
            // Query.g:749:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // Query.g:750:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,50,FOLLOW_50_in_tupleType3613); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType3615); if (state.failed) return n;

            pushFollow(FOLLOW_tuplePart_in_tupleType3624);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tpList.add(tp); }

            // Query.g:752:5: ( COMMA tp= tuplePart )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==COMMA) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // Query.g:752:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType3635); if (state.failed) return n;

            	    pushFollow(FOLLOW_tuplePart_in_tupleType3639);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tpList.add(tp); }

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType3651); if (state.failed) return n;

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
    // Query.g:761:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Query.g:762:5: (name= IDENT COLON t= type )
            // Query.g:763:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart3683); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_tuplePart3685); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_tuplePart3689);
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
        // Query.g:686:7: ( COLON type EQUAL )
        // Query.g:686:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred1_Query3305); if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred1_Query3307);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_Query3309); if (state.failed) return ;

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


 

    public static final BitSet FOLLOW_82_in_checkExpr47 = new BitSet(new long[]{0x0000000000080000L,0x0000000000002000L});
    public static final BitSet FOLLOW_queryExpr_in_checkExpr51 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_checkExpr55 = new BitSet(new long[]{0x0000000000080000L,0x0000000000002000L});
    public static final BitSet FOLLOW_queryExpr_in_checkExpr57 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_87_in_checkExpr64 = new BitSet(new long[]{0x0000000000080000L,0x0000000000002000L});
    public static final BitSet FOLLOW_queryExpr_in_checkExpr66 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_77_in_queryExpr89 = new BitSet(new long[]{0x0000010000080000L,0x0000000000001000L});
    public static final BitSet FOLLOW_featureExpr_in_queryExpr93 = new BitSet(new long[]{0x0040000000000402L,0x0000000000380000L});
    public static final BitSet FOLLOW_COMMA_in_queryExpr98 = new BitSet(new long[]{0x0000010000080000L,0x0000000000001000L});
    public static final BitSet FOLLOW_featureExpr_in_queryExpr102 = new BitSet(new long[]{0x0040000000000402L,0x0000000000380000L});
    public static final BitSet FOLLOW_withExpr_in_queryExpr120 = new BitSet(new long[]{0x0040000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_withoutExpr_in_queryExpr138 = new BitSet(new long[]{0x0040000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_oclExpr_in_queryExpr145 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_queryExpr159 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_queryExpr163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpr184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_featureExpr242 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_featureExpr251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrExpr_in_featureExpr270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assocExpr_in_featureExpr283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attrExpr303 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_attrExpr309 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_attrExpr313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assocExpr334 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_assocExpr342 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_assocExpr346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_withExpr374 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_invExpr_in_withExpr378 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_withExpr382 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_invExpr_in_withExpr386 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_85_in_withoutExpr409 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_invExpr_in_withoutExpr413 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_withoutExpr417 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_invExpr_in_withoutExpr421 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_set_in_invExpr443 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_invExpr451 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_invExpr455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_oclExpr471 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FFL});
    public static final BitSet FOLLOW_expression_in_oclExpr473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_expression552 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression563 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression567 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_expression571 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression576 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FFL});
    public static final BitSet FOLLOW_expression_in_expression580 = new BitSet(new long[]{0x8000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_expression618 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression630 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression634 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_expression638 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression643 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FFL});
    public static final BitSet FOLLOW_expression_in_expression647 = new BitSet(new long[]{0x8000000000000400L});
    public static final BitSet FOLLOW_63_in_expression688 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FFL});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList737 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList754 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_paramList766 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList770 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_paramList790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList819 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_idList829 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_idList833 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration864 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration866 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression906 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_conditionalImpliesExpression919 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FDL});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression923 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression968 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_conditionalOrExpression981 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FDL});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression985 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1029 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_conditionalXOrExpression1042 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FDL});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1046 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1090 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_conditionalAndExpression1103 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FDL});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1107 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1155 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_set_in_equalityExpression1174 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FDL});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1184 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1233 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_set_in_relationalExpression1251 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FDL});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1269 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1319 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression1337 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FDL});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1347 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1397 = new BitSet(new long[]{0x0100014000000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1415 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FDL});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1429 = new BitSet(new long[]{0x0100014000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpression1491 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FDL});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression1568 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression1586 = new BitSet(new long[]{0x0000000000080000L,0x000000000000C1D1L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression1592 = new BitSet(new long[]{0x0000000000080000L,0x000000000000C1D1L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression1603 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_literal_in_primaryExpression1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression1680 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FFL});
    public static final BitSet FOLLOW_expression_in_primaryExpression1684 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression1710 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression1712 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_primaryExpression1714 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression1737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_primaryExpression1739 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression1757 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression1772 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression1774 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_primaryExpression1776 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression1780 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FFL});
    public static final BitSet FOLLOW_expression_in_primaryExpression1784 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression1786 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression1806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_primaryExpression1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference1834 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_objectReference1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inStateExpression_in_propertyCall1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression1994 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression2001 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FFL});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression2012 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_queryExpression2016 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FFL});
    public static final BitSet FOLLOW_expression_in_queryExpression2027 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_iterateExpression2065 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression2071 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression2079 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression2081 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression2089 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression2091 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FFL});
    public static final BitSet FOLLOW_expression_in_iterateExpression2099 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression2149 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2171 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FFL});
    public static final BitSet FOLLOW_expression_in_operationExpression2184 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2197 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FFL});
    public static final BitSet FOLLOW_expression_in_operationExpression2201 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2213 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2230 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FFL});
    public static final BitSet FOLLOW_expression_in_operationExpression2245 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2260 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FFL});
    public static final BitSet FOLLOW_expression_in_operationExpression2264 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2278 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_operationExpression2303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_operationExpression2305 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression2330 = new BitSet(new long[]{0x280FE318861A0020L,0x000000000002C3FFL});
    public static final BitSet FOLLOW_expression_in_operationExpression2351 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2363 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FFL});
    public static final BitSet FOLLOW_expression_in_operationExpression2367 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_inStateExpression2424 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_inStateExpression2429 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_inStateExpression2438 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_inStateExpression2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression2479 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression2503 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_typeExpression2507 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2547 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2550 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration2554 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration2564 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2570 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2573 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration2579 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization2607 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization2609 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_variableInitialization2613 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization2615 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FFL});
    public static final BitSet FOLLOW_expression_in_variableInitialization2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ifExpression2651 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FFL});
    public static final BitSet FOLLOW_expression_in_ifExpression2655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ifExpression2657 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FFL});
    public static final BitSet FOLLOW_expression_in_ifExpression2661 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ifExpression2663 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FFL});
    public static final BitSet FOLLOW_expression_in_ifExpression2667 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ifExpression2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_literal2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_literal2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal2774 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal2790 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal2792 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_literal2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral2894 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral2923 = new BitSet(new long[]{0x280FE30A861A0020L,0x000000000002C3FFL});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral2940 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral2953 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FFL});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral2957 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem3005 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem3016 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FFL});
    public static final BitSet FOLLOW_expression_in_collectionItem3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_emptyCollectionLiteral3049 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral3051 = new BitSet(new long[]{0x0003E00000000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral3055 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral3073 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral3075 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_undefinedLiteral3107 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3109 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3113 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_undefinedLiteral3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_undefinedLiteral3143 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3145 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3149 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_undefinedLiteral3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_tupleLiteral3204 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral3210 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3218 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral3229 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3233 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem3275 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_tupleItem3314 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_tupleItem3318 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem3320 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FFL});
    public static final BitSet FOLLOW_expression_in_tupleItem3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem3346 = new BitSet(new long[]{0x280FE308861A0020L,0x000000000002C3FFL});
    public static final BitSet FOLLOW_expression_in_tupleItem3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly3478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType3546 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType3573 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_collectionType3577 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_tupleType3613 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType3615 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType3624 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleType3635 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType3639 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart3683 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_tuplePart3685 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_tuplePart3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_synpred1_Query3305 = new BitSet(new long[]{0x0007E00000080000L});
    public static final BitSet FOLLOW_type_in_synpred1_Query3307 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred1_Query3309 = new BitSet(new long[]{0x0000000000000002L});

}