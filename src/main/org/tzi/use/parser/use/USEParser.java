// $ANTLR 3.4 USE.g 2019-02-01 14:46:08
 
/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2004 Mark Richters, University of Bremen
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.  
 */

package org.tzi.use.parser.use; 

// ------------------------------------
//  USE parser
// ------------------------------------
import org.tzi.use.parser.base.BaseParser;
import org.tzi.use.parser.use.statemachines.*;
import org.tzi.use.parser.ocl.*;
import org.tzi.use.parser.soil.ast.*;
import org.tzi.use.uran.weight.*;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class USEParser extends BaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", "NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", "REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", "WS", "'Bag'", "'Collection'", "'Comment'", "'Hard'", "'OrderedSet'", "'Override'", "'Rank'", "'Sequence'", "'Set'", "'Soft'", "'Tuple'", "'Type'", "'Undefined'", "'With'", "'Without'", "'abstract'", "'allInstances'", "'and'", "'associationClass'", "'associationclass'", "'attributes'", "'automatic'", "'begin'", "'between'", "'byUseId'", "'constraints'", "'context'", "'create'", "'declare'", "'delete'", "'destroy'", "'div'", "'do'", "'else'", "'end'", "'endif'", "'enum'", "'existential'", "'false'", "'for'", "'from'", "'if'", "'implies'", "'in'", "'insert'", "'into'", "'inv'", "'iterate'", "'let'", "'model'", "'new'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", "'oclInState'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", "'operations'", "'or'", "'ordered'", "'post'", "'pre'", "'psm'", "'query'", "'redefines'", "'selectByKind'", "'selectByType'", "'statemachines'", "'states'", "'subsets'", "'then'", "'transitions'", "'true'", "'while'", "'xor'"
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
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
    public static final int T__111=111;
    public static final int T__112=112;
    public static final int T__113=113;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__120=120;
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


    public USEParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public USEParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return USEParser.tokenNames; }
    public String getGrammarFileName() { return "USE.g"; }



    // $ANTLR start "model"
    // USE.g:131:1: model returns [ASTModel n] : as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition | query )* EOF ;
    public final ASTModel model() throws RecognitionException {
        ASTModel n = null;


        Token modelName=null;
        Set<ASTAnnotation> as =null;

        ASTAssociation a =null;

        ASTConstraintDefinition cons =null;

        ASTPrePost ppc =null;

        ASTEnumTypeDefinition e =null;


        try {
            // USE.g:132:2: (as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition | query )* EOF )
            // USE.g:133:2: as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition | query )* EOF
            {
            pushFollow(FOLLOW_annotationSet_in_model71);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            match(input,93,FOLLOW_93_in_model77); if (state.failed) return n;

            modelName=(Token)match(input,IDENT,FOLLOW_IDENT_in_model81); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTModel(modelName); n.setAnnotations(as); }

            // USE.g:135:5: ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition | query )*
            loop2:
            do {
                int alt2=6;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // USE.g:135:9: generalClassifierDefinition[$n]
            	    {
            	    pushFollow(FOLLOW_generalClassifierDefinition_in_model93);
            	    generalClassifierDefinition(n);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    }
            	    break;
            	case 2 :
            	    // USE.g:136:9: a= associationDefinition
            	    {
            	    pushFollow(FOLLOW_associationDefinition_in_model106);
            	    a=associationDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addAssociation(a); }

            	    }
            	    break;
            	case 3 :
            	    // USE.g:137:9: ( 'constraints' (cons= invariant |ppc= prePost )* )
            	    {
            	    // USE.g:137:9: ( 'constraints' (cons= invariant |ppc= prePost )* )
            	    // USE.g:137:11: 'constraints' (cons= invariant |ppc= prePost )*
            	    {
            	    match(input,69,FOLLOW_69_in_model120); if (state.failed) return n;

            	    // USE.g:138:11: (cons= invariant |ppc= prePost )*
            	    loop1:
            	    do {
            	        int alt1=3;
            	        alt1 = dfa1.predict(input);
            	        switch (alt1) {
            	    	case 1 :
            	    	    // USE.g:138:15: cons= invariant
            	    	    {
            	    	    pushFollow(FOLLOW_invariant_in_model138);
            	    	    cons=invariant();

            	    	    state._fsp--;
            	    	    if (state.failed) return n;

            	    	    if ( state.backtracking==0 ) { n.addConstraint(cons); }

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // USE.g:139:15: ppc= prePost
            	    	    {
            	    	    pushFollow(FOLLOW_prePost_in_model159);
            	    	    ppc=prePost();

            	    	    state._fsp--;
            	    	    if (state.failed) return n;

            	    	    if ( state.backtracking==0 ) { n.addPrePost(ppc); }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 4 :
            	    // USE.g:142:9: e= enumTypeDefinition
            	    {
            	    pushFollow(FOLLOW_enumTypeDefinition_in_model199);
            	    e=enumTypeDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addEnumTypeDef(e); }

            	    }
            	    break;
            	case 5 :
            	    // USE.g:143:9: query
            	    {
            	    pushFollow(FOLLOW_query_in_model211);
            	    query();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,EOF,FOLLOW_EOF_in_model224); if (state.failed) return n;

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
    // $ANTLR end "model"



    // $ANTLR start "enumTypeDefinition"
    // USE.g:152:1: enumTypeDefinition returns [ASTEnumTypeDefinition n] : as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )? ;
    public final ASTEnumTypeDefinition enumTypeDefinition() throws RecognitionException {
        ASTEnumTypeDefinition n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        List idListRes =null;


        try {
            // USE.g:153:2: (as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )? )
            // USE.g:154:2: as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_enumTypeDefinition252);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            match(input,80,FOLLOW_80_in_enumTypeDefinition258); if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumTypeDefinition262); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_enumTypeDefinition264); if (state.failed) return n;

            pushFollow(FOLLOW_idList_in_enumTypeDefinition268);
            idListRes=idList();

            state._fsp--;
            if (state.failed) return n;

            match(input,RBRACE,FOLLOW_RBRACE_in_enumTypeDefinition270); if (state.failed) return n;

            // USE.g:155:54: ( SEMI )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==SEMI) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // USE.g:155:56: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_enumTypeDefinition274); if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n = new ASTEnumTypeDefinition(name, idListRes); n.setAnnotations(as); }

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
    // $ANTLR end "enumTypeDefinition"



    // $ANTLR start "generalClassifierDefinition"
    // USE.g:164:1: generalClassifierDefinition[ASTModel n] : as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] ) ;
    public final void generalClassifierDefinition(ASTModel n) throws RecognitionException {
        Set<ASTAnnotation> as =null;

        ASTClass c =null;

        ASTAssociationClass ac =null;

        ASTSignal s =null;


         
          boolean isAbstract = false;

        try {
            // USE.g:168:2: (as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] ) )
            // USE.g:169:2: as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] )
            {
            pushFollow(FOLLOW_annotationSet_in_generalClassifierDefinition312);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return ;

            // USE.g:170:5: ( 'abstract' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==59) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // USE.g:170:7: 'abstract'
                    {
                    match(input,59,FOLLOW_59_in_generalClassifierDefinition320); if (state.failed) return ;

                    if ( state.backtracking==0 ) { isAbstract = true; }

                    }
                    break;

            }


            // USE.g:171:5: (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] )
            int alt5=3;
            switch ( input.LA(1) ) {
            case AT:
                {
                alt5=1;
                }
                break;
            case IDENT:
                {
                int LA5_2 = input.LA(2);

                if ( ((input.LT(1).getText().equals("class"))) ) {
                    alt5=1;
                }
                else if ( ((input.LT(1).getText().equals("signal"))) ) {
                    alt5=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;

                }
                }
                break;
            case 62:
            case 63:
                {
                alt5=2;
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
                    // USE.g:172:9: c= classDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_classDefinition_in_generalClassifierDefinition348);
                    c=classDefinition(isAbstract);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { n.addClass(c); c.setAnnotations(as); }

                    }
                    break;
                case 2 :
                    // USE.g:175:9: ac= associationClassDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_associationClassDefinition_in_generalClassifierDefinition386);
                    ac=associationClassDefinition(isAbstract);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { n.addAssociationClass(ac); ac.setAnnotations(as); }

                    }
                    break;
                case 3 :
                    // USE.g:178:9: s= signalDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_signalDefinition_in_generalClassifierDefinition431);
                    s=signalDefinition(isAbstract);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { n.addSignal(s); s.setAnnotations(as); }

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
        return ;
    }
    // $ANTLR end "generalClassifierDefinition"



    // $ANTLR start "classDefinition"
    // USE.g:199:1: classDefinition[boolean isAbstract] returns [ASTClass n] : (tag= block_annotation |tag= line_annotation[tag] )? keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end' ;
    public final ASTClass classDefinition(boolean isAbstract) throws RecognitionException {
        ASTClass n = null;


        Token name=null;
        AnnotationTag tag =null;

        List idListRes =null;

        ASTAttribute a =null;

        ASTOperation op =null;

        ASTInvariantClause inv =null;

        ASTStateMachine sm =null;


         List idList; tag=null;
        try {
            // USE.g:201:2: ( (tag= block_annotation |tag= line_annotation[tag] )? keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end' )
            // USE.g:202:2: (tag= block_annotation |tag= line_annotation[tag] )? keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end'
            {
            // USE.g:202:2: (tag= block_annotation |tag= line_annotation[tag] )?
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==AT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==IDENT) ) {
                    alt6=1;
                }
                else if ( (LA6_1==46||LA6_1==50||LA6_1==55) ) {
                    alt6=2;
                }
            }
            switch (alt6) {
                case 1 :
                    // USE.g:202:3: tag= block_annotation
                    {
                    pushFollow(FOLLOW_block_annotation_in_classDefinition485);
                    tag=block_annotation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 2 :
                    // USE.g:202:26: tag= line_annotation[tag]
                    {
                    pushFollow(FOLLOW_line_annotation_in_classDefinition491);
                    tag=line_annotation(tag);

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_keyClass_in_classDefinition501);
            keyClass();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_classDefinition505); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTClass(name, isAbstract); n.setAnnotationTag(tag);}

            // USE.g:204:5: ( LESS idListRes= idList )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LESS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // USE.g:204:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_classDefinition515); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_classDefinition519);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addSuperClasses(idListRes); }

                    }
                    break;

            }


            // USE.g:205:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==64) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // USE.g:205:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,64,FOLLOW_64_in_classDefinition532); if (state.failed) return n;

                    // USE.g:206:7: (a= attributeDefinition )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==AT||LA8_0==IDENT||LA8_0==59||(LA8_0 >= 62 && LA8_0 <= 63)||LA8_0==80||LA8_0==90||LA8_0==93||(LA8_0 >= 106 && LA8_0 <= 107)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // USE.g:206:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_classDefinition545);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addAttribute(a); }

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:208:5: ( 'operations' (op= operationDefinition )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==103) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // USE.g:208:7: 'operations' (op= operationDefinition )*
                    {
                    match(input,103,FOLLOW_103_in_classDefinition566); if (state.failed) return n;

                    // USE.g:209:7: (op= operationDefinition )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==AT||LA10_0==IDENT||LA10_0==59||(LA10_0 >= 62 && LA10_0 <= 63)||LA10_0==80||LA10_0==90||LA10_0==93||(LA10_0 >= 106 && LA10_0 <= 107)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // USE.g:209:9: op= operationDefinition
                    	    {
                    	    pushFollow(FOLLOW_operationDefinition_in_classDefinition579);
                    	    op=operationDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addOperation(op); }

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:211:5: ( 'constraints' (inv= invariantClause )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==69) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // USE.g:211:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,69,FOLLOW_69_in_classDefinition600); if (state.failed) return n;

                    // USE.g:212:7: (inv= invariantClause )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==AT||LA12_0==IDENT||LA12_0==59||(LA12_0 >= 62 && LA12_0 <= 63)||(LA12_0 >= 80 && LA12_0 <= 81)||LA12_0==90||LA12_0==93||(LA12_0 >= 106 && LA12_0 <= 107)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // USE.g:213:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_classDefinition620);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:216:5: ( 'statemachines' (sm= stateMachine )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==113) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // USE.g:216:7: 'statemachines' (sm= stateMachine )*
                    {
                    match(input,113,FOLLOW_113_in_classDefinition646); if (state.failed) return n;

                    // USE.g:217:7: (sm= stateMachine )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==108) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // USE.g:218:9: sm= stateMachine
                    	    {
                    	    pushFollow(FOLLOW_stateMachine_in_classDefinition666);
                    	    sm=stateMachine();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addStateMachine(sm); }

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,78,FOLLOW_78_in_classDefinition690); if (state.failed) return n;

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
    // $ANTLR end "classDefinition"



    // $ANTLR start "associationClassDefinition"
    // USE.g:239:1: associationClassDefinition[boolean isAbstract] returns [ASTAssociationClass n] : classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end' ;
    public final ASTAssociationClass associationClassDefinition(boolean isAbstract) throws RecognitionException {
        ASTAssociationClass n = null;


        Token classKW=null;
        Token name=null;
        List idListRes =null;

        ASTAssociationEnd ae =null;

        ASTAttribute a =null;

        ASTOperation op =null;

        ASTInvariantClause inv =null;

        ASTStateMachine sm =null;


        List idList; Token t = null;
        try {
            // USE.g:241:5: (classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end' )
            // USE.g:242:5: classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end'
            {
            classKW=(Token)input.LT(1);

            if ( (input.LA(1) >= 62 && input.LA(1) <= 63) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) { 
                	if ((classKW!=null?classKW.getText():null).equals("associationClass")) {
                           reportWarning("the 'associationClass' keyword is deprecated and will " +
                                         "not be supported in the future, use 'associationclass' instead");
                        }  
                }

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationClassDefinition749); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociationClass(name, isAbstract); }

            // USE.g:251:5: ( LESS idListRes= idList )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LESS) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // USE.g:251:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_associationClassDefinition759); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_associationClassDefinition763);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addSuperClasses(idListRes); }

                    }
                    break;

            }


            // USE.g:252:5: ( 'between' ae= associationEnd (ae= associationEnd )+ )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==67) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // USE.g:252:6: 'between' ae= associationEnd (ae= associationEnd )+
                    {
                    match(input,67,FOLLOW_67_in_associationClassDefinition775); if (state.failed) return n;

                    pushFollow(FOLLOW_associationEnd_in_associationClassDefinition783);
                    ae=associationEnd();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addEnd(ae); }

                    // USE.g:254:5: (ae= associationEnd )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==IDENT) ) {
                            int LA17_2 = input.LA(2);

                            if ( (LA17_2==LBRACK) ) {
                                alt17=1;
                            }


                        }
                        else if ( (LA17_0==AT) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // USE.g:254:7: ae= associationEnd
                    	    {
                    	    pushFollow(FOLLOW_associationEnd_in_associationClassDefinition795);
                    	    ae=associationEnd();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addEnd(ae); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                    	    if (state.backtracking>0) {state.failed=true; return n;}
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    }
                    break;

            }


            // USE.g:256:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==64) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // USE.g:256:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,64,FOLLOW_64_in_associationClassDefinition815); if (state.failed) return n;

                    // USE.g:257:7: (a= attributeDefinition )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==IDENT) ) {
                            int LA19_2 = input.LA(2);

                            if ( (LA19_2==COLON) ) {
                                alt19=1;
                            }


                        }
                        else if ( (LA19_0==AT) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // USE.g:257:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_associationClassDefinition828);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addAttribute(a); }

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:259:5: ( 'operations' (op= operationDefinition )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==103) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // USE.g:259:7: 'operations' (op= operationDefinition )*
                    {
                    match(input,103,FOLLOW_103_in_associationClassDefinition849); if (state.failed) return n;

                    // USE.g:260:7: (op= operationDefinition )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==IDENT) ) {
                            int LA21_2 = input.LA(2);

                            if ( (LA21_2==LPAREN) ) {
                                alt21=1;
                            }


                        }
                        else if ( (LA21_0==AT) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // USE.g:260:9: op= operationDefinition
                    	    {
                    	    pushFollow(FOLLOW_operationDefinition_in_associationClassDefinition862);
                    	    op=operationDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addOperation(op); }

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:262:5: ( 'constraints' (inv= invariantClause )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==69) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // USE.g:262:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,69,FOLLOW_69_in_associationClassDefinition883); if (state.failed) return n;

                    // USE.g:263:7: (inv= invariantClause )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==AT||LA23_0==81||LA23_0==90) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // USE.g:264:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_associationClassDefinition903);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:267:5: ( 'statemachines' (sm= stateMachine )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==113) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // USE.g:267:7: 'statemachines' (sm= stateMachine )*
                    {
                    match(input,113,FOLLOW_113_in_associationClassDefinition929); if (state.failed) return n;

                    // USE.g:268:7: (sm= stateMachine )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==108) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // USE.g:269:9: sm= stateMachine
                    	    {
                    	    pushFollow(FOLLOW_stateMachine_in_associationClassDefinition949);
                    	    sm=stateMachine();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addStateMachine(sm); }

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:273:5: ( ( keyAggregation | keyComposition ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==IDENT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // USE.g:273:7: ( keyAggregation | keyComposition )
                    {
                    if ( state.backtracking==0 ) { t = input.LT(1); }

                    // USE.g:274:7: ( keyAggregation | keyComposition )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==IDENT) ) {
                        int LA27_1 = input.LA(2);

                        if ( ((input.LT(1).getText().equals("aggregation"))) ) {
                            alt27=1;
                        }
                        else if ( ((input.LT(1).getText().equals("composition"))) ) {
                            alt27=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return n;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 27, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;

                    }
                    switch (alt27) {
                        case 1 :
                            // USE.g:274:9: keyAggregation
                            {
                            pushFollow(FOLLOW_keyAggregation_in_associationClassDefinition990);
                            keyAggregation();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;
                        case 2 :
                            // USE.g:274:26: keyComposition
                            {
                            pushFollow(FOLLOW_keyComposition_in_associationClassDefinition994);
                            keyComposition();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { n.setKind(t); }

                    }
                    break;

            }


            match(input,78,FOLLOW_78_in_associationClassDefinition1017); if (state.failed) return n;

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
    // $ANTLR end "associationClassDefinition"



    // $ANTLR start "attributeDefinition"
    // USE.g:284:1: attributeDefinition returns [ASTAttribute n] : as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )? ;
    public final ASTAttribute attributeDefinition() throws RecognitionException {
        ASTAttribute n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        ASTType t =null;

        USEParser.expression_return deriveExpression =null;

        USEParser.expression_return initExpression =null;


        try {
            // USE.g:285:2: (as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )? )
            // USE.g:286:2: as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_attributeDefinition1045);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_attributeDefinition1053); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_attributeDefinition1055); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_attributeDefinition1059);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            // USE.g:289:5: ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )?
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==IDENT) ) {
                int LA30_1 = input.LA(2);

                if ( (((input.LT(1).getText().equals("derived"))||(input.LT(1).getText().equals("derive")))) ) {
                    alt30=1;
                }
                else if ( ((input.LT(1).getText().equals("init"))) ) {
                    alt30=2;
                }
            }
            switch (alt30) {
                case 1 :
                    // USE.g:290:9: ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression )
                    {
                    // USE.g:290:9: ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression )
                    // USE.g:290:10: ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression
                    {
                    // USE.g:290:10: ( keyDerive | keyDerived )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==IDENT) ) {
                        int LA29_1 = input.LA(2);

                        if ( ((input.LT(1).getText().equals("derive"))) ) {
                            alt29=1;
                        }
                        else if ( ((input.LT(1).getText().equals("derived"))) ) {
                            alt29=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return n;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 29, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;

                    }
                    switch (alt29) {
                        case 1 :
                            // USE.g:290:11: keyDerive
                            {
                            pushFollow(FOLLOW_keyDerive_in_attributeDefinition1083);
                            keyDerive();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;
                        case 2 :
                            // USE.g:290:21: keyDerived
                            {
                            pushFollow(FOLLOW_keyDerived_in_attributeDefinition1085);
                            keyDerived();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;

                    }


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


                    pushFollow(FOLLOW_expression_in_attributeDefinition1098);
                    deriveExpression=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    }


                    }
                    break;
                case 2 :
                    // USE.g:292:9: ( keyInit ( COLON | EQUAL ) initExpression= expression )
                    {
                    // USE.g:292:9: ( keyInit ( COLON | EQUAL ) initExpression= expression )
                    // USE.g:292:10: keyInit ( COLON | EQUAL ) initExpression= expression
                    {
                    pushFollow(FOLLOW_keyInit_in_attributeDefinition1118);
                    keyInit();

                    state._fsp--;
                    if (state.failed) return n;

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


                    pushFollow(FOLLOW_expression_in_attributeDefinition1134);
                    initExpression=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    }


                    }
                    break;

            }


            // USE.g:294:5: ( SEMI )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==SEMI) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // USE.g:294:5: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_attributeDefinition1148); if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { 
                   n = new ASTAttribute(name, t); 
                   n.setAnnotations(as);
                   n.setDeriveExpression((deriveExpression!=null?deriveExpression.n:null));
                   n.setInitExpression((initExpression!=null?initExpression.n:null));
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
    // $ANTLR end "attributeDefinition"



    // $ANTLR start "operationDefinition"
    // USE.g:308:1: operationDefinition returns [ASTOperation n] : as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )? ;
    public final ASTOperation operationDefinition() throws RecognitionException {
        ASTOperation n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        List<ASTVariableDeclaration> pl =null;

        ASTType t =null;

        USEParser.expression_return e =null;

        USEParser.blockStat_return s =null;

        ASTPrePostClause ppc =null;


        try {
            // USE.g:309:2: (as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )? )
            // USE.g:310:2: as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_operationDefinition1179);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationDefinition1189); if (state.failed) return n;

            pushFollow(FOLLOW_paramList_in_operationDefinition1199);
            pl=paramList();

            state._fsp--;
            if (state.failed) return n;

            // USE.g:316:5: ( COLON t= type )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==COLON) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // USE.g:316:7: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_operationDefinition1213); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_operationDefinition1219);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n = new ASTOperation(name, pl, t); n.setAnnotations(as); }

            // USE.g:318:5: ( ( EQUAL e= expression ) | (s= blockStat ) )?
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==EQUAL) ) {
                alt33=1;
            }
            else if ( (LA33_0==66) ) {
                alt33=2;
            }
            switch (alt33) {
                case 1 :
                    // USE.g:319:9: ( EQUAL e= expression )
                    {
                    // USE.g:319:9: ( EQUAL e= expression )
                    // USE.g:319:11: EQUAL e= expression
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_operationDefinition1247); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_operationDefinition1253);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setExpression((e!=null?e.n:null)); }

                    }


                    }
                    break;
                case 2 :
                    // USE.g:320:9: (s= blockStat )
                    {
                    // USE.g:320:9: (s= blockStat )
                    // USE.g:320:11: s= blockStat
                    {
                    pushFollow(FOLLOW_blockStat_in_operationDefinition1275);
                    s=blockStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setStatement((s!=null?s.n:null));  }

                    }


                    }
                    break;

            }


            // USE.g:322:5: (ppc= prePostClause )*
            loop34:
            do {
                int alt34=2;
                alt34 = dfa34.predict(input);
                switch (alt34) {
            	case 1 :
            	    // USE.g:322:7: ppc= prePostClause
            	    {
            	    pushFollow(FOLLOW_prePostClause_in_operationDefinition1297);
            	    ppc=prePostClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addPrePostClause(ppc); }

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            // USE.g:323:5: ( SEMI )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==SEMI) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // USE.g:323:7: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_operationDefinition1310); if (state.failed) return n;

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
    // $ANTLR end "operationDefinition"



    // $ANTLR start "associationDefinition"
    // USE.g:333:1: associationDefinition returns [ASTAssociation n] : as= annotationSet (tag= line_annotation[tag] )? ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' ;
    public final ASTAssociation associationDefinition() throws RecognitionException {
        ASTAssociation n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        AnnotationTag tag =null;

        ASTAssociationEnd ae =null;


         Token t = null; tag=null;
        try {
            // USE.g:335:2: (as= annotationSet (tag= line_annotation[tag] )? ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' )
            // USE.g:336:2: as= annotationSet (tag= line_annotation[tag] )? ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end'
            {
            pushFollow(FOLLOW_annotationSet_in_associationDefinition1341);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            // USE.g:337:2: (tag= line_annotation[tag] )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==AT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // USE.g:337:3: tag= line_annotation[tag]
                    {
                    pushFollow(FOLLOW_line_annotation_in_associationDefinition1347);
                    tag=line_annotation(tag);

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { t = input.LT(1); }

            // USE.g:339:5: ( keyAssociation | keyAggregation | keyComposition )
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==IDENT) ) {
                int LA37_1 = input.LA(2);

                if ( ((input.LT(1).getText().equals("association"))) ) {
                    alt37=1;
                }
                else if ( ((input.LT(1).getText().equals("aggregation"))) ) {
                    alt37=2;
                }
                else if ( ((input.LT(1).getText().equals("composition"))) ) {
                    alt37=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // USE.g:339:7: keyAssociation
                    {
                    pushFollow(FOLLOW_keyAssociation_in_associationDefinition1364);
                    keyAssociation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 2 :
                    // USE.g:339:24: keyAggregation
                    {
                    pushFollow(FOLLOW_keyAggregation_in_associationDefinition1368);
                    keyAggregation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 3 :
                    // USE.g:339:41: keyComposition
                    {
                    pushFollow(FOLLOW_keyComposition_in_associationDefinition1372);
                    keyComposition();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationDefinition1382); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociation(t, name); n.setAnnotations(as);n.setAnnotationTag(tag);}

            match(input,67,FOLLOW_67_in_associationDefinition1390); if (state.failed) return n;

            pushFollow(FOLLOW_associationEnd_in_associationDefinition1398);
            ae=associationEnd();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addEnd(ae); }

            // USE.g:343:5: (ae= associationEnd )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==AT||LA38_0==IDENT||LA38_0==59||(LA38_0 >= 62 && LA38_0 <= 63)||LA38_0==80||LA38_0==90||LA38_0==93||(LA38_0 >= 106 && LA38_0 <= 107)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // USE.g:343:7: ae= associationEnd
            	    {
            	    pushFollow(FOLLOW_associationEnd_in_associationDefinition1410);
            	    ae=associationEnd();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addEnd(ae); }

            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);


            match(input,78,FOLLOW_78_in_associationDefinition1421); if (state.failed) return n;

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
    // $ANTLR end "associationDefinition"



    // $ANTLR start "associationEnd"
    // USE.g:352:1: associationEnd returns [ASTAssociationEnd n] : as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? ;
    public final ASTAssociationEnd associationEnd() throws RecognitionException {
        ASTAssociationEnd n = null;


        Token name=null;
        Token rn=null;
        Token sr=null;
        Token rd=null;
        Set<ASTAnnotation> as =null;

        ASTMultiplicity m =null;

        ASTElemVarsDeclaration parameter =null;

        USEParser.expression_return exp =null;

        List<ASTVariableDeclaration> qualifiers =null;


        try {
            // USE.g:353:2: (as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? )
            // USE.g:354:2: as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_associationEnd1446);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1454); if (state.failed) return n;

            match(input,LBRACK,FOLLOW_LBRACK_in_associationEnd1456); if (state.failed) return n;

            pushFollow(FOLLOW_multiplicity_in_associationEnd1460);
            m=multiplicity();

            state._fsp--;
            if (state.failed) return n;

            match(input,RBRACK,FOLLOW_RBRACK_in_associationEnd1462); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociationEnd(name, m); n.setAnnotations(as); }

            // USE.g:356:5: ( keyRole rn= IDENT )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==IDENT) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==IDENT) ) {
                    int LA39_3 = input.LA(3);

                    if ( ((input.LT(1).getText().equals("role"))) ) {
                        alt39=1;
                    }
                }
            }
            switch (alt39) {
                case 1 :
                    // USE.g:356:7: keyRole rn= IDENT
                    {
                    pushFollow(FOLLOW_keyRole_in_associationEnd1473);
                    keyRole();

                    state._fsp--;
                    if (state.failed) return n;

                    rn=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1477); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setRolename(rn); }

                    }
                    break;

            }


            // USE.g:357:5: ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )*
            loop42:
            do {
                int alt42=7;
                switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA42_3 = input.LA(2);

                    if ( ((input.LT(1).getText().equals("union"))) ) {
                        alt42=3;
                    }
                    else if ( (((input.LT(1).getText().equals("derived"))||(input.LT(1).getText().equals("derive")))) ) {
                        alt42=5;
                    }
                    else if ( ((input.LT(1).getText().equals("qualifier"))) ) {
                        alt42=6;
                    }


                    }
                    break;
                case 105:
                    {
                    alt42=1;
                    }
                    break;
                case 115:
                    {
                    alt42=2;
                    }
                    break;
                case 110:
                    {
                    alt42=4;
                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // USE.g:358:9: 'ordered'
            	    {
            	    match(input,105,FOLLOW_105_in_associationEnd1498); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setOrdered(); }

            	    }
            	    break;
            	case 2 :
            	    // USE.g:359:9: 'subsets' sr= IDENT
            	    {
            	    match(input,115,FOLLOW_115_in_associationEnd1510); if (state.failed) return n;

            	    sr=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1514); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addSubsetsRolename(sr); }

            	    }
            	    break;
            	case 3 :
            	    // USE.g:360:9: keyUnion
            	    {
            	    pushFollow(FOLLOW_keyUnion_in_associationEnd1526);
            	    keyUnion();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setUnion(true); }

            	    }
            	    break;
            	case 4 :
            	    // USE.g:361:9: 'redefines' rd= IDENT
            	    {
            	    match(input,110,FOLLOW_110_in_associationEnd1538); if (state.failed) return n;

            	    rd=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1542); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addRedefinesRolename(rd); }

            	    }
            	    break;
            	case 5 :
            	    // USE.g:362:9: ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression
            	    {
            	    // USE.g:362:9: ( keyDerived | keyDerive )
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==IDENT) ) {
            	        int LA40_1 = input.LA(2);

            	        if ( ((input.LT(1).getText().equals("derived"))) ) {
            	            alt40=1;
            	        }
            	        else if ( ((input.LT(1).getText().equals("derive"))) ) {
            	            alt40=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return n;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 40, 1, input);

            	            throw nvae;

            	        }
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 40, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // USE.g:362:10: keyDerived
            	            {
            	            pushFollow(FOLLOW_keyDerived_in_associationEnd1555);
            	            keyDerived();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;
            	        case 2 :
            	            // USE.g:362:21: keyDerive
            	            {
            	            pushFollow(FOLLOW_keyDerive_in_associationEnd1557);
            	            keyDerive();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    // USE.g:362:32: ( LPAREN parameter= elemVarsDeclaration RPAREN )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==LPAREN) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // USE.g:362:34: LPAREN parameter= elemVarsDeclaration RPAREN
            	            {
            	            match(input,LPAREN,FOLLOW_LPAREN_in_associationEnd1562); if (state.failed) return n;

            	            pushFollow(FOLLOW_elemVarsDeclaration_in_associationEnd1568);
            	            parameter=elemVarsDeclaration();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            match(input,RPAREN,FOLLOW_RPAREN_in_associationEnd1570); if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_associationEnd1574); if (state.failed) return n;

            	    pushFollow(FOLLOW_expression_in_associationEnd1578);
            	    exp=expression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setDerived((exp!=null?exp.n:null), parameter); }

            	    }
            	    break;
            	case 6 :
            	    // USE.g:363:9: keyQualifier qualifiers= paramList
            	    {
            	    pushFollow(FOLLOW_keyQualifier_in_associationEnd1590);
            	    keyQualifier();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    pushFollow(FOLLOW_paramList_in_associationEnd1596);
            	    qualifiers=paramList();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) {n.setQualifiers(qualifiers); }

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            // USE.g:365:5: ( SEMI )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==SEMI) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // USE.g:365:7: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_associationEnd1613); if (state.failed) return n;

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
    // $ANTLR end "associationEnd"



    // $ANTLR start "multiplicity"
    // USE.g:379:1: multiplicity returns [ASTMultiplicity n] :mr= multiplicityRange ( COMMA mr= multiplicityRange )* ;
    public final ASTMultiplicity multiplicity() throws RecognitionException {
        ASTMultiplicity n = null;


        ASTMultiplicityRange mr =null;


        try {
            // USE.g:380:5: (mr= multiplicityRange ( COMMA mr= multiplicityRange )* )
            // USE.g:381:5: mr= multiplicityRange ( COMMA mr= multiplicityRange )*
            {
            if ( state.backtracking==0 ) { 
            	Token t = input.LT(1); // remember start position of expression
            	n = new ASTMultiplicity(t);
                }

            pushFollow(FOLLOW_multiplicityRange_in_multiplicity1648);
            mr=multiplicityRange();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addRange(mr); }

            // USE.g:386:5: ( COMMA mr= multiplicityRange )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==COMMA) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // USE.g:386:7: COMMA mr= multiplicityRange
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multiplicity1658); if (state.failed) return n;

            	    pushFollow(FOLLOW_multiplicityRange_in_multiplicity1662);
            	    mr=multiplicityRange();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addRange(mr); }

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // $ANTLR end "multiplicity"



    // $ANTLR start "multiplicityRange"
    // USE.g:389:1: multiplicityRange returns [ASTMultiplicityRange n] : ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? ;
    public final ASTMultiplicityRange multiplicityRange() throws RecognitionException {
        ASTMultiplicityRange n = null;


        int ms1 =0;

        int ms2 =0;


        try {
            // USE.g:390:5: (ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? )
            // USE.g:391:5: ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )?
            {
            pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange1691);
            ms1=multiplicitySpec();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTMultiplicityRange(ms1); }

            // USE.g:392:5: ( DOTDOT ms2= multiplicitySpec )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==DOTDOT) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // USE.g:392:7: DOTDOT ms2= multiplicitySpec
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_multiplicityRange1701); if (state.failed) return n;

                    pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange1705);
                    ms2=multiplicitySpec();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setHigh(ms2); }

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
    // $ANTLR end "multiplicityRange"



    // $ANTLR start "multiplicitySpec"
    // USE.g:395:1: multiplicitySpec returns [int m] : (i= INT | STAR );
    public final int multiplicitySpec() throws RecognitionException {
        int m = 0;


        Token i=null;

         m = -1; 
        try {
            // USE.g:397:7: (i= INT | STAR )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==INT) ) {
                alt46=1;
            }
            else if ( (LA46_0==STAR) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return m;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }
            switch (alt46) {
                case 1 :
                    // USE.g:398:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_multiplicitySpec1739); if (state.failed) return m;

                    if ( state.backtracking==0 ) { m = Integer.parseInt((i!=null?i.getText():null)); }

                    }
                    break;
                case 2 :
                    // USE.g:399:7: STAR
                    {
                    match(input,STAR,FOLLOW_STAR_in_multiplicitySpec1749); if (state.failed) return m;

                    if ( state.backtracking==0 ) { m = -1; }

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
    // $ANTLR end "multiplicitySpec"



    // $ANTLR start "annotationSpec"
    // USE.g:402:1: annotationSpec returns [AnnotationTag tag] : (rtag= block_annotation |rtag= line_annotation[tag] );
    public final AnnotationTag annotationSpec() throws RecognitionException {
        AnnotationTag tag = null;


        AnnotationTag rtag =null;


        tag = new AnnotationTag();
        try {
            // USE.g:404:2: (rtag= block_annotation |rtag= line_annotation[tag] )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==AT) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==IDENT) ) {
                    alt47=1;
                }
                else if ( (LA47_1==46||LA47_1==50||LA47_1==55) ) {
                    alt47=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return tag;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return tag;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }
            switch (alt47) {
                case 1 :
                    // USE.g:405:2: rtag= block_annotation
                    {
                    pushFollow(FOLLOW_block_annotation_in_annotationSpec1777);
                    rtag=block_annotation();

                    state._fsp--;
                    if (state.failed) return tag;

                    if ( state.backtracking==0 ) {tag =rtag;}

                    }
                    break;
                case 2 :
                    // USE.g:406:4: rtag= line_annotation[tag]
                    {
                    pushFollow(FOLLOW_line_annotation_in_annotationSpec1786);
                    rtag=line_annotation(tag);

                    state._fsp--;
                    if (state.failed) return tag;

                    if ( state.backtracking==0 ) {tag =rtag;}

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
        return tag;
    }
    // $ANTLR end "annotationSpec"



    // $ANTLR start "block_annotation"
    // USE.g:409:1: block_annotation returns [AnnotationTag tag] : AT IDENT LBRACE ( annotation_tag[tag] )* RBRACE ;
    public final AnnotationTag block_annotation() throws RecognitionException {
        AnnotationTag tag = null;


        Token IDENT1=null;

        tag = new AnnotationTag();
        try {
            // USE.g:411:2: ( AT IDENT LBRACE ( annotation_tag[tag] )* RBRACE )
            // USE.g:412:2: AT IDENT LBRACE ( annotation_tag[tag] )* RBRACE
            {
            match(input,AT,FOLLOW_AT_in_block_annotation1808); if (state.failed) return tag;

            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_block_annotation1810); if (state.failed) return tag;

            match(input,LBRACE,FOLLOW_LBRACE_in_block_annotation1812); if (state.failed) return tag;

            // USE.g:413:3: ( annotation_tag[tag] )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==46||LA48_0==50||LA48_0==55) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // USE.g:413:4: annotation_tag[tag]
            	    {
            	    pushFollow(FOLLOW_annotation_tag_in_block_annotation1817);
            	    annotation_tag(tag);

            	    state._fsp--;
            	    if (state.failed) return tag;

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            if ( state.backtracking==0 ) {tag.setName(IDENT1.getText());}

            match(input,RBRACE,FOLLOW_RBRACE_in_block_annotation1825); if (state.failed) return tag;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return tag;
    }
    // $ANTLR end "block_annotation"



    // $ANTLR start "line_annotation"
    // USE.g:417:1: line_annotation[AnnotationTag tag] returns [AnnotationTag rtag] : AT ( annotation_tag[tag] ) ;
    public final AnnotationTag line_annotation(AnnotationTag tag) throws RecognitionException {
        AnnotationTag rtag = null;


        if (tag==null) tag = new AnnotationTag();
        try {
            // USE.g:418:50: ( AT ( annotation_tag[tag] ) )
            // USE.g:419:2: AT ( annotation_tag[tag] )
            {
            match(input,AT,FOLLOW_AT_in_line_annotation1844); if (state.failed) return rtag;

            // USE.g:419:5: ( annotation_tag[tag] )
            // USE.g:419:6: annotation_tag[tag]
            {
            pushFollow(FOLLOW_annotation_tag_in_line_annotation1847);
            annotation_tag(tag);

            state._fsp--;
            if (state.failed) return rtag;

            }


            if ( state.backtracking==0 ) {rtag =tag;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return rtag;
    }
    // $ANTLR end "line_annotation"



    // $ANTLR start "annotation_tag"
    // USE.g:422:1: annotation_tag[AnnotationTag tag] : ( annotation_comment EQUAL ( NON_OCL_STRING ) | annotation_weight EQUAL ( annotation_def | INT ) | annotation_type EQUAL ( annotation_enum_type | annotation_ref ) );
    public final void annotation_tag(AnnotationTag tag) throws RecognitionException {
        Token NON_OCL_STRING2=null;
        Token INT3=null;

        try {
            // USE.g:423:2: ( annotation_comment EQUAL ( NON_OCL_STRING ) | annotation_weight EQUAL ( annotation_def | INT ) | annotation_type EQUAL ( annotation_enum_type | annotation_ref ) )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt51=1;
                }
                break;
            case 50:
                {
                alt51=2;
                }
                break;
            case 55:
                {
                alt51=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }

            switch (alt51) {
                case 1 :
                    // USE.g:424:2: annotation_comment EQUAL ( NON_OCL_STRING )
                    {
                    pushFollow(FOLLOW_annotation_comment_in_annotation_tag1863);
                    annotation_comment();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,EQUAL,FOLLOW_EQUAL_in_annotation_tag1865); if (state.failed) return ;

                    // USE.g:424:27: ( NON_OCL_STRING )
                    // USE.g:424:28: NON_OCL_STRING
                    {
                    NON_OCL_STRING2=(Token)match(input,NON_OCL_STRING,FOLLOW_NON_OCL_STRING_in_annotation_tag1868); if (state.failed) return ;

                    if ( state.backtracking==0 ) {tag.setComments(NON_OCL_STRING2.getText());}

                    }


                    }
                    break;
                case 2 :
                    // USE.g:425:4: annotation_weight EQUAL ( annotation_def | INT )
                    {
                    pushFollow(FOLLOW_annotation_weight_in_annotation_tag1876);
                    annotation_weight();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,EQUAL,FOLLOW_EQUAL_in_annotation_tag1878); if (state.failed) return ;

                    // USE.g:425:28: ( annotation_def | INT )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==65) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==INT) ) {
                        alt49=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;

                    }
                    switch (alt49) {
                        case 1 :
                            // USE.g:425:29: annotation_def
                            {
                            pushFollow(FOLLOW_annotation_def_in_annotation_tag1881);
                            annotation_def();

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {tag.setWeight(new IntWeight(-1));}

                            }
                            break;
                        case 2 :
                            // USE.g:425:83: INT
                            {
                            INT3=(Token)match(input,INT,FOLLOW_INT_in_annotation_tag1887); if (state.failed) return ;

                            if ( state.backtracking==0 ) {
                            			if (Integer.parseInt(INT3.getText())==-1){System.err.println("Error: an weight cannot be negative.");return;}
                            			tag.setWeight(new IntWeight(Integer.parseInt(INT3.getText())));
                            		}

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // USE.g:429:4: annotation_type EQUAL ( annotation_enum_type | annotation_ref )
                    {
                    pushFollow(FOLLOW_annotation_type_in_annotation_tag1895);
                    annotation_type();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,EQUAL,FOLLOW_EQUAL_in_annotation_tag1897); if (state.failed) return ;

                    // USE.g:429:26: ( annotation_enum_type | annotation_ref )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==47||LA50_0==53) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==AT) ) {
                        alt50=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;

                    }
                    switch (alt50) {
                        case 1 :
                            // USE.g:429:27: annotation_enum_type
                            {
                            pushFollow(FOLLOW_annotation_enum_type_in_annotation_tag1900);
                            annotation_enum_type();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // USE.g:429:50: annotation_ref
                            {
                            pushFollow(FOLLOW_annotation_ref_in_annotation_tag1904);
                            annotation_ref();

                            state._fsp--;
                            if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "annotation_tag"



    // $ANTLR start "annotation_predefined"
    // USE.g:432:1: annotation_predefined : ( 'Comment' | 'Rank' | 'Type' );
    public final void annotation_predefined() throws RecognitionException {
        try {
            // USE.g:432:22: ( 'Comment' | 'Rank' | 'Type' )
            // USE.g:
            {
            if ( input.LA(1)==46||input.LA(1)==50||input.LA(1)==55 ) {
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
    // $ANTLR end "annotation_predefined"



    // $ANTLR start "annotation_comment"
    // USE.g:438:1: annotation_comment : 'Comment' ;
    public final void annotation_comment() throws RecognitionException {
        try {
            // USE.g:438:19: ( 'Comment' )
            // USE.g:438:21: 'Comment'
            {
            match(input,46,FOLLOW_46_in_annotation_comment1932); if (state.failed) return ;

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
    // $ANTLR end "annotation_comment"



    // $ANTLR start "annotation_weight"
    // USE.g:439:1: annotation_weight : 'Rank' ;
    public final void annotation_weight() throws RecognitionException {
        try {
            // USE.g:439:18: ( 'Rank' )
            // USE.g:439:20: 'Rank'
            {
            match(input,50,FOLLOW_50_in_annotation_weight1939); if (state.failed) return ;

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
    // $ANTLR end "annotation_weight"



    // $ANTLR start "annotation_type"
    // USE.g:440:1: annotation_type : 'Type' ;
    public final void annotation_type() throws RecognitionException {
        try {
            // USE.g:440:16: ( 'Type' )
            // USE.g:440:18: 'Type'
            {
            match(input,55,FOLLOW_55_in_annotation_type1946); if (state.failed) return ;

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
    // $ANTLR end "annotation_type"



    // $ANTLR start "annotation_override"
    // USE.g:442:1: annotation_override : 'Override' LPAREN LBRACE annotation_term RBRACE RPAREN ;
    public final void annotation_override() throws RecognitionException {
        try {
            // USE.g:442:20: ( 'Override' LPAREN LBRACE annotation_term RBRACE RPAREN )
            // USE.g:443:1: 'Override' LPAREN LBRACE annotation_term RBRACE RPAREN
            {
            match(input,49,FOLLOW_49_in_annotation_override1955); if (state.failed) return ;

            match(input,LPAREN,FOLLOW_LPAREN_in_annotation_override1957); if (state.failed) return ;

            match(input,LBRACE,FOLLOW_LBRACE_in_annotation_override1959); if (state.failed) return ;

            pushFollow(FOLLOW_annotation_term_in_annotation_override1961);
            annotation_term();

            state._fsp--;
            if (state.failed) return ;

            match(input,RBRACE,FOLLOW_RBRACE_in_annotation_override1963); if (state.failed) return ;

            match(input,RPAREN,FOLLOW_RPAREN_in_annotation_override1965); if (state.failed) return ;

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
    // $ANTLR end "annotation_override"



    // $ANTLR start "annotation_term"
    // USE.g:446:1: annotation_term returns [AnnotationTag tag] : annotation_tag[tag] ( COMMA annotation_tag[tag] )* ;
    public final AnnotationTag annotation_term() throws RecognitionException {
        AnnotationTag tag = null;


        tag = new AnnotationTag();
        try {
            // USE.g:447:35: ( annotation_tag[tag] ( COMMA annotation_tag[tag] )* )
            // USE.g:448:2: annotation_tag[tag] ( COMMA annotation_tag[tag] )*
            {
            pushFollow(FOLLOW_annotation_tag_in_annotation_term1982);
            annotation_tag(tag);

            state._fsp--;
            if (state.failed) return tag;

            // USE.g:448:22: ( COMMA annotation_tag[tag] )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==COMMA) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // USE.g:448:23: COMMA annotation_tag[tag]
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_annotation_term1986); if (state.failed) return tag;

            	    pushFollow(FOLLOW_annotation_tag_in_annotation_term1988);
            	    annotation_tag(tag);

            	    state._fsp--;
            	    if (state.failed) return tag;

            	    }
            	    break;

            	default :
            	    break loop52;
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
        return tag;
    }
    // $ANTLR end "annotation_term"



    // $ANTLR start "annotation_ref"
    // USE.g:451:1: annotation_ref : AT IDENT DOT annotation_predefined ;
    public final void annotation_ref() throws RecognitionException {
        try {
            // USE.g:451:15: ( AT IDENT DOT annotation_predefined )
            // USE.g:452:2: AT IDENT DOT annotation_predefined
            {
            match(input,AT,FOLLOW_AT_in_annotation_ref2000); if (state.failed) return ;

            match(input,IDENT,FOLLOW_IDENT_in_annotation_ref2002); if (state.failed) return ;

            match(input,DOT,FOLLOW_DOT_in_annotation_ref2004); if (state.failed) return ;

            pushFollow(FOLLOW_annotation_predefined_in_annotation_ref2006);
            annotation_predefined();

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
    // $ANTLR end "annotation_ref"



    // $ANTLR start "annotation_def"
    // USE.g:455:1: annotation_def : 'automatic' ;
    public final void annotation_def() throws RecognitionException {
        try {
            // USE.g:455:15: ( 'automatic' )
            // USE.g:456:2: 'automatic'
            {
            match(input,65,FOLLOW_65_in_annotation_def2015); if (state.failed) return ;

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
    // $ANTLR end "annotation_def"



    // $ANTLR start "annotation_enum_type"
    // USE.g:458:1: annotation_enum_type : ( 'Soft' | 'Hard' );
    public final void annotation_enum_type() throws RecognitionException {
        try {
            // USE.g:458:21: ( 'Soft' | 'Hard' )
            // USE.g:
            {
            if ( input.LA(1)==47||input.LA(1)==53 ) {
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
    // $ANTLR end "annotation_enum_type"



    // $ANTLR start "query"
    // USE.g:463:1: query : 'query' queryExpr ( queryCOND expression )* ;
    public final void query() throws RecognitionException {
        try {
            // USE.g:463:6: ( 'query' queryExpr ( queryCOND expression )* )
            // USE.g:464:3: 'query' queryExpr ( queryCOND expression )*
            {
            match(input,109,FOLLOW_109_in_query2039); if (state.failed) return ;

            pushFollow(FOLLOW_queryExpr_in_query2041);
            queryExpr();

            state._fsp--;
            if (state.failed) return ;

            // USE.g:464:21: ( queryCOND expression )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0 >= 57 && LA53_0 <= 58)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // USE.g:464:22: queryCOND expression
            	    {
            	    pushFollow(FOLLOW_queryCOND_in_query2044);
            	    queryCOND();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    pushFollow(FOLLOW_expression_in_query2046);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // $ANTLR end "query"



    // $ANTLR start "queryExpr"
    // USE.g:467:1: queryExpr : ( queryVariable ) ( COMMA queryVariable )* ;
    public final void queryExpr() throws RecognitionException {
        try {
            // USE.g:467:10: ( ( queryVariable ) ( COMMA queryVariable )* )
            // USE.g:468:3: ( queryVariable ) ( COMMA queryVariable )*
            {
            // USE.g:468:3: ( queryVariable )
            // USE.g:468:4: queryVariable
            {
            pushFollow(FOLLOW_queryVariable_in_queryExpr2059);
            queryVariable();

            state._fsp--;
            if (state.failed) return ;

            }


            // USE.g:468:19: ( COMMA queryVariable )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==COMMA) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // USE.g:468:20: COMMA queryVariable
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_queryExpr2063); if (state.failed) return ;

            	    pushFollow(FOLLOW_queryVariable_in_queryExpr2065);
            	    queryVariable();

            	    state._fsp--;
            	    if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "queryExpr"



    // $ANTLR start "queryVariable"
    // USE.g:471:1: queryVariable : IDENT ;
    public final void queryVariable() throws RecognitionException {
        try {
            // USE.g:471:14: ( IDENT )
            // USE.g:471:16: IDENT
            {
            match(input,IDENT,FOLLOW_IDENT_in_queryVariable2075); if (state.failed) return ;

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
    // $ANTLR end "queryVariable"



    // $ANTLR start "queryCOND"
    // USE.g:473:1: queryCOND : ( 'With' | 'Without' );
    public final void queryCOND() throws RecognitionException {
        try {
            // USE.g:473:10: ( 'With' | 'Without' )
            // USE.g:
            {
            if ( (input.LA(1) >= 57 && input.LA(1) <= 58) ) {
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
    // $ANTLR end "queryCOND"



    // $ANTLR start "invariant"
    // USE.g:494:1: invariant returns [ASTConstraintDefinition n] : (tag= block_annotation )? 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* ;
    public final ASTConstraintDefinition invariant() throws RecognitionException {
        ASTConstraintDefinition n = null;


        Token v=null;
        AnnotationTag tag =null;

        ASTSimpleType t =null;

        ASTInvariantClause inv =null;


        try {
            // USE.g:495:5: ( (tag= block_annotation )? 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* )
            // USE.g:496:5: (tag= block_annotation )? 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )*
            {
            if ( state.backtracking==0 ) { n = new ASTConstraintDefinition();}

            // USE.g:497:2: (tag= block_annotation )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==AT) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // USE.g:497:3: tag= block_annotation
                    {
                    pushFollow(FOLLOW_block_annotation_in_invariant2121);
                    tag=block_annotation();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n.addBlockAnnotationTag(tag);}

                    }
                    break;

            }


            match(input,70,FOLLOW_70_in_invariant2132); if (state.failed) return n;

            // USE.g:499:5: (v= IDENT ( ',' v= IDENT )* COLON )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==IDENT) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==COLON||LA57_1==COMMA) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // USE.g:499:7: v= IDENT ( ',' v= IDENT )* COLON
                    {
                    v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant2142); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addVarName(v); }

                    // USE.g:500:8: ( ',' v= IDENT )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==COMMA) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // USE.g:500:9: ',' v= IDENT
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_invariant2154); if (state.failed) return n;

                    	    v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant2158); if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addVarName(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    match(input,COLON,FOLLOW_COLON_in_invariant2166); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_simpleType_in_invariant2178);
            t=simpleType();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setType(t); }

            // USE.g:502:5: (inv= invariantClause )*
            loop58:
            do {
                int alt58=2;
                alt58 = dfa58.predict(input);
                switch (alt58) {
            	case 1 :
            	    // USE.g:502:7: inv= invariantClause
            	    {
            	    pushFollow(FOLLOW_invariantClause_in_invariant2190);
            	    inv=invariantClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

            	    }
            	    break;

            	default :
            	    break loop58;
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
    // $ANTLR end "invariant"



    // $ANTLR start "invariantClause"
    // USE.g:509:1: invariantClause returns [ASTInvariantClause n] : ( (tag= line_annotation[tag] )* as= annotationSet 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression );
    public final ASTInvariantClause invariantClause() throws RecognitionException {
        ASTInvariantClause n = null;


        Token name=null;
        AnnotationTag tag =null;

        Set<ASTAnnotation> as =null;

        USEParser.expression_return e =null;


        tag = null;
        try {
            // USE.g:510:19: ( (tag= line_annotation[tag] )* as= annotationSet 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==AT||LA62_0==IDENT||LA62_0==59||(LA62_0 >= 62 && LA62_0 <= 63)||LA62_0==80||LA62_0==90||LA62_0==93||(LA62_0 >= 106 && LA62_0 <= 107)) ) {
                alt62=1;
            }
            else if ( (LA62_0==81) ) {
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
                    // USE.g:511:2: (tag= line_annotation[tag] )* as= annotationSet 'inv' (name= IDENT )? COLON e= expression
                    {
                    // USE.g:511:2: (tag= line_annotation[tag] )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==AT) ) {
                            int LA59_1 = input.LA(2);

                            if ( (LA59_1==46||LA59_1==50||LA59_1==55) ) {
                                alt59=1;
                            }


                        }


                        switch (alt59) {
                    	case 1 :
                    	    // USE.g:511:3: tag= line_annotation[tag]
                    	    {
                    	    pushFollow(FOLLOW_line_annotation_in_invariantClause2222);
                    	    tag=line_annotation(tag);

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    pushFollow(FOLLOW_annotationSet_in_invariantClause2232);
                    as=annotationSet();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,90,FOLLOW_90_in_invariantClause2239); if (state.failed) return n;

                    // USE.g:513:12: (name= IDENT )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==IDENT) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // USE.g:513:14: name= IDENT
                            {
                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause2245); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,COLON,FOLLOW_COLON_in_invariantClause2250); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_invariantClause2254);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTInvariantClause(name, (e!=null?e.n:null)); n.setAnnotations(as);n.setAnnotationTag(tag);}

                    }
                    break;
                case 2 :
                    // USE.g:515:7: 'existential' 'inv' (name= IDENT )? COLON e= expression
                    {
                    match(input,81,FOLLOW_81_in_invariantClause2271); if (state.failed) return n;

                    match(input,90,FOLLOW_90_in_invariantClause2273); if (state.failed) return n;

                    // USE.g:515:27: (name= IDENT )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==IDENT) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // USE.g:515:29: name= IDENT
                            {
                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause2279); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,COLON,FOLLOW_COLON_in_invariantClause2284); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_invariantClause2288);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTExistentialInvariantClause(name, (e!=null?e.n:null)); n.setAnnotations(as);}

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
    // $ANTLR end "invariantClause"



    // $ANTLR start "prePost"
    // USE.g:527:1: prePost returns [ASTPrePost n] : 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ ;
    public final ASTPrePost prePost() throws RecognitionException {
        ASTPrePost n = null;


        Token classname=null;
        Token opname=null;
        List<ASTVariableDeclaration> pl =null;

        ASTType rt =null;

        ASTPrePostClause ppc =null;


        try {
            // USE.g:528:5: ( 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ )
            // USE.g:529:5: 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+
            {
            match(input,70,FOLLOW_70_in_prePost2321); if (state.failed) return n;

            classname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost2325); if (state.failed) return n;

            match(input,COLON_COLON,FOLLOW_COLON_COLON_in_prePost2327); if (state.failed) return n;

            opname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost2331); if (state.failed) return n;

            pushFollow(FOLLOW_paramList_in_prePost2335);
            pl=paramList();

            state._fsp--;
            if (state.failed) return n;

            // USE.g:529:69: ( COLON rt= type )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==COLON) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // USE.g:529:71: COLON rt= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_prePost2339); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_prePost2343);
                    rt=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n = new ASTPrePost(classname, opname, pl, rt); }

            // USE.g:531:5: (ppc= prePostClause )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                alt64 = dfa64.predict(input);
                switch (alt64) {
            	case 1 :
            	    // USE.g:531:7: ppc= prePostClause
            	    {
            	    pushFollow(FOLLOW_prePostClause_in_prePost2362);
            	    ppc=prePostClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addPrePostClause(ppc); }

            	    }
            	    break;

            	default :
            	    if ( cnt64 >= 1 ) break loop64;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
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
    // $ANTLR end "prePost"



    // $ANTLR start "prePostClause"
    // USE.g:538:1: prePostClause returns [ASTPrePostClause n] : as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression ;
    public final ASTPrePostClause prePostClause() throws RecognitionException {
        ASTPrePostClause n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        USEParser.expression_return e =null;


         Token t = null; 
        try {
            // USE.g:540:2: (as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression )
            // USE.g:541:2: as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression
            {
            pushFollow(FOLLOW_annotationSet_in_prePostClause2396);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { t = input.LT(1); }

            if ( (input.LA(1) >= 106 && input.LA(1) <= 107) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // USE.g:543:25: (name= IDENT )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==IDENT) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // USE.g:543:27: name= IDENT
                    {
                    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePostClause2423); if (state.failed) return n;

                    }
                    break;

            }


            match(input,COLON,FOLLOW_COLON_in_prePostClause2428); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_prePostClause2432);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTPrePostClause(t, name, (e!=null?e.n:null)); n.setAnnotations(as); }

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
    // $ANTLR end "prePostClause"



    // $ANTLR start "annotationSet"
    // USE.g:547:1: annotationSet returns [Set<ASTAnnotation> annotations] : (an= annotation )* ;
    public final Set<ASTAnnotation> annotationSet() throws RecognitionException {
        Set<ASTAnnotation> annotations = null;


        ASTAnnotation an =null;


         annotations = new HashSet<ASTAnnotation>(); 
        try {
            // USE.g:549:2: ( (an= annotation )* )
            // USE.g:550:2: (an= annotation )*
            {
            // USE.g:550:2: (an= annotation )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==AT) ) {
                    int LA66_2 = input.LA(2);

                    if ( (LA66_2==IDENT) ) {
                        int LA66_3 = input.LA(3);

                        if ( (LA66_3==LPAREN) ) {
                            alt66=1;
                        }


                    }


                }


                switch (alt66) {
            	case 1 :
            	    // USE.g:550:3: an= annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotationSet2459);
            	    an=annotation();

            	    state._fsp--;
            	    if (state.failed) return annotations;

            	    if ( state.backtracking==0 ) { annotations.add(an); }

            	    }
            	    break;

            	default :
            	    break loop66;
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
        return annotations;
    }
    // $ANTLR end "annotationSet"



    // $ANTLR start "annotation"
    // USE.g:553:1: annotation returns [ASTAnnotation n] : AT name= IDENT LPAREN values= annotationValues RPAREN ;
    public final ASTAnnotation annotation() throws RecognitionException {
        ASTAnnotation n = null;


        Token name=null;
        Map<Token, Token> values =null;


        try {
            // USE.g:553:37: ( AT name= IDENT LPAREN values= annotationValues RPAREN )
            // USE.g:554:2: AT name= IDENT LPAREN values= annotationValues RPAREN
            {
            match(input,AT,FOLLOW_AT_in_annotation2478); if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotation2482); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = new ASTAnnotation(name);}

            match(input,LPAREN,FOLLOW_LPAREN_in_annotation2488); if (state.failed) return n;

            pushFollow(FOLLOW_annotationValues_in_annotation2497);
            values=annotationValues();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setValues(values); }

            match(input,RPAREN,FOLLOW_RPAREN_in_annotation2502); if (state.failed) return n;

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
    // $ANTLR end "annotation"



    // $ANTLR start "annotationValues"
    // USE.g:560:1: annotationValues returns [Map<Token, Token> values] : (firstVal= annotationValue )? ( COMMA val= annotationValue )* ;
    public final Map<Token, Token> annotationValues() throws RecognitionException {
        Map<Token, Token> values = null;


        USEParser.annotationValue_return firstVal =null;

        USEParser.annotationValue_return val =null;


         values = new HashMap<Token, Token>(); 
        try {
            // USE.g:562:2: ( (firstVal= annotationValue )? ( COMMA val= annotationValue )* )
            // USE.g:563:2: (firstVal= annotationValue )? ( COMMA val= annotationValue )*
            {
            // USE.g:563:2: (firstVal= annotationValue )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==IDENT) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // USE.g:563:3: firstVal= annotationValue
                    {
                    pushFollow(FOLLOW_annotationValue_in_annotationValues2525);
                    firstVal=annotationValue();

                    state._fsp--;
                    if (state.failed) return values;

                    if ( state.backtracking==0 ) { values.put((firstVal!=null?firstVal.name:null), (firstVal!=null?firstVal.value:null)); }

                    }
                    break;

            }


            // USE.g:564:2: ( COMMA val= annotationValue )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==COMMA) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // USE.g:564:3: COMMA val= annotationValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_annotationValues2533); if (state.failed) return values;

            	    pushFollow(FOLLOW_annotationValue_in_annotationValues2537);
            	    val=annotationValue();

            	    state._fsp--;
            	    if (state.failed) return values;

            	    if ( state.backtracking==0 ) { values.put((val!=null?val.name:null), (val!=null?val.value:null)); }

            	    }
            	    break;

            	default :
            	    break loop68;
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
        return values;
    }
    // $ANTLR end "annotationValues"


    public static class annotationValue_return extends ParserRuleReturnScope {
        public Token name;
        public Token value;
    };


    // $ANTLR start "annotationValue"
    // USE.g:567:1: annotationValue returns [Token name, Token value] : aName= IDENT EQUAL aValue= NON_OCL_STRING ;
    public final USEParser.annotationValue_return annotationValue() throws RecognitionException {
        USEParser.annotationValue_return retval = new USEParser.annotationValue_return();
        retval.start = input.LT(1);


        Token aName=null;
        Token aValue=null;

        try {
            // USE.g:567:50: (aName= IDENT EQUAL aValue= NON_OCL_STRING )
            // USE.g:568:2: aName= IDENT EQUAL aValue= NON_OCL_STRING
            {
            aName=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotationValue2556); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.name = aName; }

            match(input,EQUAL,FOLLOW_EQUAL_in_annotationValue2561); if (state.failed) return retval;

            aValue=(Token)match(input,NON_OCL_STRING,FOLLOW_NON_OCL_STRING_in_annotationValue2567); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.value = aValue; }

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
    // $ANTLR end "annotationValue"



    // $ANTLR start "stateMachine"
    // USE.g:573:1: stateMachine returns [ASTStateMachine n] : ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end' ;
    public final ASTStateMachine stateMachine() throws RecognitionException {
        ASTStateMachine n = null;


        Token smName=null;
        ASTStateDefinition s =null;

        ASTTransitionDefinition t =null;


        try {
            // USE.g:574:5: ( ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end' )
            // USE.g:575:5: ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end'
            {
            // USE.g:575:5: ( 'psm' )
            // USE.g:576:8: 'psm'
            {
            match(input,108,FOLLOW_108_in_stateMachine2597); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTProtocolStateMachine(); }

            }


            smName=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateMachine2630); if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setName(smName); }

            match(input,114,FOLLOW_114_in_stateMachine2643); if (state.failed) return n;

            // USE.g:583:10: (s= stateDefinition )+
            int cnt69=0;
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==IDENT) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // USE.g:583:11: s= stateDefinition
            	    {
            	    pushFollow(FOLLOW_stateDefinition_in_stateMachine2659);
            	    s=stateDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addStateDefinition(s); }

            	    }
            	    break;

            	default :
            	    if ( cnt69 >= 1 ) break loop69;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(69, input);
                        throw eee;
                }
                cnt69++;
            } while (true);


            match(input,117,FOLLOW_117_in_stateMachine2669); if (state.failed) return n;

            // USE.g:585:10: (t= transitionDefinition )+
            int cnt70=0;
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==IDENT) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // USE.g:585:11: t= transitionDefinition
            	    {
            	    pushFollow(FOLLOW_transitionDefinition_in_stateMachine2685);
            	    t=transitionDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addTransitionDefinition(t); }

            	    }
            	    break;

            	default :
            	    if ( cnt70 >= 1 ) break loop70;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(70, input);
                        throw eee;
                }
                cnt70++;
            } while (true);


            match(input,78,FOLLOW_78_in_stateMachine2695); if (state.failed) return n;

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
    // $ANTLR end "stateMachine"



    // $ANTLR start "stateDefinition"
    // USE.g:589:1: stateDefinition returns [ASTStateDefinition n] : sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )? ;
    public final ASTStateDefinition stateDefinition() throws RecognitionException {
        ASTStateDefinition n = null;


        Token sn=null;
        Token stateType=null;
        USEParser.expression_return stateInv =null;


        try {
            // USE.g:589:47: (sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )? )
            // USE.g:590:3: sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )?
            {
            sn=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateDefinition2711); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = new ASTStateDefinition(sn); }

            // USE.g:591:3: ( COLON stateType= IDENT )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==COLON) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // USE.g:591:5: COLON stateType= IDENT
                    {
                    match(input,COLON,FOLLOW_COLON_in_stateDefinition2719); if (state.failed) return n;

                    stateType=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateDefinition2723); if (state.failed) return n;

                    if ( state.backtracking==0 ) {n.setType(stateType); }

                    }
                    break;

            }


            // USE.g:592:3: ( LBRACK stateInv= expression RBRACK )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==LBRACK) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // USE.g:592:5: LBRACK stateInv= expression RBRACK
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_stateDefinition2734); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_stateDefinition2740);
                    stateInv=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RBRACK,FOLLOW_RBRACK_in_stateDefinition2742); if (state.failed) return n;

                    if ( state.backtracking==0 ) {n.setStateInvariant((stateInv!=null?stateInv.n:null)); }

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
    // $ANTLR end "stateDefinition"



    // $ANTLR start "transitionDefinition"
    // USE.g:595:1: transitionDefinition returns [ASTTransitionDefinition n] : source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )? ;
    public final ASTTransitionDefinition transitionDefinition() throws RecognitionException {
        ASTTransitionDefinition n = null;


        Token source=null;
        Token target=null;
        Token o=null;
        USEParser.expression_return pre =null;

        Token e =null;

        List<ASTVariableDeclaration> args =null;

        USEParser.expression_return post =null;


        try {
            // USE.g:595:57: (source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )? )
            // USE.g:596:3: source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )?
            {
            source=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition2763); if (state.failed) return n;

            match(input,ARROW,FOLLOW_ARROW_in_transitionDefinition2765); if (state.failed) return n;

            target=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition2769); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTransitionDefinition(source, target); }

            // USE.g:597:5: ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==LBRACE) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // USE.g:597:6: LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_transitionDefinition2779); if (state.failed) return n;

                    // USE.g:598:7: ( LBRACK pre= expression RBRACK )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==LBRACK) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // USE.g:598:8: LBRACK pre= expression RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_transitionDefinition2789); if (state.failed) return n;

                            pushFollow(FOLLOW_expression_in_transitionDefinition2793);
                            pre=expression();

                            state._fsp--;
                            if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setPreCondition((pre!=null?pre.n:null)); }

                            match(input,RBRACK,FOLLOW_RBRACK_in_transitionDefinition2797); if (state.failed) return n;

                            }
                            break;

                    }


                    // USE.g:599:7: (e= event |o= IDENT LPAREN (args= paramList )? RPAREN )
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==71) ) {
                        alt75=1;
                    }
                    else if ( (LA75_0==IDENT) ) {
                        alt75=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 0, input);

                        throw nvae;

                    }
                    switch (alt75) {
                        case 1 :
                            // USE.g:600:11: e= event
                            {
                            pushFollow(FOLLOW_event_in_transitionDefinition2821);
                            e=event();

                            state._fsp--;
                            if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setEvent(e); }

                            }
                            break;
                        case 2 :
                            // USE.g:601:11: o= IDENT LPAREN (args= paramList )? RPAREN
                            {
                            o=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition2837); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setOperation(o); }

                            match(input,LPAREN,FOLLOW_LPAREN_in_transitionDefinition2841); if (state.failed) return n;

                            // USE.g:601:50: (args= paramList )?
                            int alt74=2;
                            int LA74_0 = input.LA(1);

                            if ( (LA74_0==LPAREN) ) {
                                alt74=1;
                            }
                            switch (alt74) {
                                case 1 :
                                    // USE.g:601:51: args= paramList
                                    {
                                    pushFollow(FOLLOW_paramList_in_transitionDefinition2846);
                                    args=paramList();

                                    state._fsp--;
                                    if (state.failed) return n;

                                    if ( state.backtracking==0 ) { n.setOperationArgs(args); }

                                    }
                                    break;

                            }


                            match(input,RPAREN,FOLLOW_RPAREN_in_transitionDefinition2853); if (state.failed) return n;

                            }
                            break;

                    }


                    // USE.g:603:7: ( LBRACK post= expression RBRACK )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==LBRACK) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // USE.g:603:8: LBRACK post= expression RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_transitionDefinition2870); if (state.failed) return n;

                            pushFollow(FOLLOW_expression_in_transitionDefinition2874);
                            post=expression();

                            state._fsp--;
                            if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setPostCondition((post!=null?post.n:null)); }

                            match(input,RBRACK,FOLLOW_RBRACK_in_transitionDefinition2878); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,RBRACE,FOLLOW_RBRACE_in_transitionDefinition2886); if (state.failed) return n;

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
    // $ANTLR end "transitionDefinition"



    // $ANTLR start "event"
    // USE.g:607:1: event returns [Token t] : tcr= 'create' ;
    public final Token event() throws RecognitionException {
        Token t = null;


        Token tcr=null;

        try {
            // USE.g:607:24: (tcr= 'create' )
            // USE.g:608:5: tcr= 'create'
            {
            tcr=(Token)match(input,71,FOLLOW_71_in_event2908); if (state.failed) return t;

            if ( state.backtracking==0 ) {t = tcr;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return t;
    }
    // $ANTLR end "event"



    // $ANTLR start "signalDefinition"
    // USE.g:611:1: signalDefinition[boolean isAbstract] returns [ASTSignal n] : keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' ;
    public final ASTSignal signalDefinition(boolean isAbstract) throws RecognitionException {
        ASTSignal n = null;


        Token name=null;
        List idListRes =null;

        ASTAttribute a =null;

        ASTInvariantClause inv =null;


        try {
            // USE.g:611:59: ( keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' )
            // USE.g:612:5: keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end'
            {
            pushFollow(FOLLOW_keySignal_in_signalDefinition2928);
            keySignal();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_signalDefinition2932); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTSignal(name, isAbstract); }

            // USE.g:614:5: ( LESS idListRes= idList )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==LESS) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // USE.g:614:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_signalDefinition2947); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_signalDefinition2951);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addGenerals(idListRes); }

                    }
                    break;

            }


            // USE.g:615:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==64) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // USE.g:615:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,64,FOLLOW_64_in_signalDefinition2964); if (state.failed) return n;

                    // USE.g:616:7: (a= attributeDefinition )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==AT||LA79_0==IDENT||LA79_0==59||(LA79_0 >= 62 && LA79_0 <= 63)||LA79_0==80||LA79_0==90||LA79_0==93||(LA79_0 >= 106 && LA79_0 <= 107)) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // USE.g:616:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_signalDefinition2977);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addAttribute(a); }

                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:618:5: ( 'constraints' (inv= invariantClause )* )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==69) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // USE.g:618:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,69,FOLLOW_69_in_signalDefinition2998); if (state.failed) return n;

                    // USE.g:619:7: (inv= invariantClause )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==AT||LA81_0==IDENT||LA81_0==59||(LA81_0 >= 62 && LA81_0 <= 63)||(LA81_0 >= 80 && LA81_0 <= 81)||LA81_0==90||LA81_0==93||(LA81_0 >= 106 && LA81_0 <= 107)) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // USE.g:620:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_signalDefinition3018);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,78,FOLLOW_78_in_signalDefinition3042); if (state.failed) return n;

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
    // $ANTLR end "signalDefinition"



    // $ANTLR start "keyUnion"
    // USE.g:626:1: keyUnion :{...}? IDENT ;
    public final void keyUnion() throws RecognitionException {
        try {
            // USE.g:626:9: ({...}? IDENT )
            // USE.g:627:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("union"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyUnion", "input.LT(1).getText().equals(\"union\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyUnion3060); if (state.failed) return ;

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
    // $ANTLR end "keyUnion"



    // $ANTLR start "keyAssociation"
    // USE.g:629:1: keyAssociation :{...}? IDENT ;
    public final void keyAssociation() throws RecognitionException {
        try {
            // USE.g:629:15: ({...}? IDENT )
            // USE.g:630:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("association"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyAssociation", "input.LT(1).getText().equals(\"association\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyAssociation3074); if (state.failed) return ;

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
    // $ANTLR end "keyAssociation"



    // $ANTLR start "keyRole"
    // USE.g:632:1: keyRole :{...}? IDENT ;
    public final void keyRole() throws RecognitionException {
        try {
            // USE.g:632:8: ({...}? IDENT )
            // USE.g:633:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("role"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyRole", "input.LT(1).getText().equals(\"role\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyRole3088); if (state.failed) return ;

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
    // $ANTLR end "keyRole"



    // $ANTLR start "keyComposition"
    // USE.g:635:1: keyComposition :{...}? IDENT ;
    public final void keyComposition() throws RecognitionException {
        try {
            // USE.g:635:15: ({...}? IDENT )
            // USE.g:636:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("composition"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyComposition", "input.LT(1).getText().equals(\"composition\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyComposition3100); if (state.failed) return ;

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
    // $ANTLR end "keyComposition"



    // $ANTLR start "keyAggregation"
    // USE.g:638:1: keyAggregation :{...}? IDENT ;
    public final void keyAggregation() throws RecognitionException {
        try {
            // USE.g:638:15: ({...}? IDENT )
            // USE.g:639:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("aggregation"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyAggregation", "input.LT(1).getText().equals(\"aggregation\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyAggregation3112); if (state.failed) return ;

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
    // $ANTLR end "keyAggregation"



    // $ANTLR start "keyClass"
    // USE.g:641:1: keyClass :{...}? IDENT ;
    public final void keyClass() throws RecognitionException {
        try {
            // USE.g:641:9: ({...}? IDENT )
            // USE.g:642:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("class"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyClass", "input.LT(1).getText().equals(\"class\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyClass3126); if (state.failed) return ;

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
    // $ANTLR end "keyClass"



    // $ANTLR start "keySignal"
    // USE.g:644:1: keySignal :{...}? IDENT ;
    public final void keySignal() throws RecognitionException {
        try {
            // USE.g:644:10: ({...}? IDENT )
            // USE.g:645:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("signal"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keySignal", "input.LT(1).getText().equals(\"signal\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keySignal3138); if (state.failed) return ;

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
    // $ANTLR end "keySignal"



    // $ANTLR start "keyDerived"
    // USE.g:647:1: keyDerived :{...}? IDENT ;
    public final void keyDerived() throws RecognitionException {
        try {
            // USE.g:647:11: ({...}? IDENT )
            // USE.g:648:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("derived"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyDerived", "input.LT(1).getText().equals(\"derived\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyDerived3152); if (state.failed) return ;

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
    // $ANTLR end "keyDerived"



    // $ANTLR start "keyDerive"
    // USE.g:650:1: keyDerive :{...}? IDENT ;
    public final void keyDerive() throws RecognitionException {
        try {
            // USE.g:650:10: ({...}? IDENT )
            // USE.g:651:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("derive"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyDerive", "input.LT(1).getText().equals(\"derive\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyDerive3166); if (state.failed) return ;

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
    // $ANTLR end "keyDerive"



    // $ANTLR start "keyInit"
    // USE.g:653:1: keyInit :{...}? IDENT ;
    public final void keyInit() throws RecognitionException {
        try {
            // USE.g:653:8: ({...}? IDENT )
            // USE.g:654:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("init"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyInit", "input.LT(1).getText().equals(\"init\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyInit3178); if (state.failed) return ;

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
    // $ANTLR end "keyInit"



    // $ANTLR start "keyQualifier"
    // USE.g:656:1: keyQualifier :{...}? IDENT ;
    public final void keyQualifier() throws RecognitionException {
        try {
            // USE.g:656:13: ({...}? IDENT )
            // USE.g:657:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("qualifier"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyQualifier", "input.LT(1).getText().equals(\"qualifier\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyQualifier3194); if (state.failed) return ;

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
    // $ANTLR end "keyQualifier"



    // $ANTLR start "expressionOnly"
    // USE.g:686:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;


        USEParser.expression_return nExp =null;


        try {
            // USE.g:687:5: (nExp= expression EOF )
            // USE.g:688:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly3222);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_expressionOnly3224); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = (nExp!=null?nExp.n:null);}

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


    public static class expression_return extends ParserRuleReturnScope {
        public ASTExpression n;
    };


    // $ANTLR start "expression"
    // USE.g:695:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
    public final USEParser.expression_return expression() throws RecognitionException {
        USEParser.expression_return retval = new USEParser.expression_return();
        retval.start = input.LT(1);


        Token name=null;
        ASTType t =null;

        USEParser.expression_return e1 =null;

        ASTExpression nCndImplies =null;


         
          ASTLetExpression prevLet = null, firstLet = null;
          ASTExpression e2;
          Token tok = null;

        try {
            // USE.g:701:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
            // USE.g:702:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }

            // USE.g:703:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==92) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // USE.g:704:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
            	    {
            	    match(input,92,FOLLOW_92_in_expression3272); if (state.failed) return retval;

            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression3283); if (state.failed) return retval;

            	    // USE.g:705:18: ( COLON t= type )?
            	    int alt83=2;
            	    int LA83_0 = input.LA(1);

            	    if ( (LA83_0==COLON) ) {
            	        alt83=1;
            	    }
            	    switch (alt83) {
            	        case 1 :
            	            // USE.g:705:20: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression3287); if (state.failed) return retval;

            	            pushFollow(FOLLOW_type_in_expression3291);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression3296); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expression_in_expression3300);
            	    e1=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { ASTLetExpression nextLet = new ASTLetExpression(name, t, (e1!=null?e1.n:null));
            	             if ( firstLet == null ) 
            	                 firstLet = nextLet;
            	             if ( prevLet != null ) 
            	                 prevLet.setInExpr(nextLet);
            	             prevLet = nextLet;
            	          }

            	    // USE.g:715:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
            	    loop85:
            	    do {
            	        int alt85=2;
            	        int LA85_0 = input.LA(1);

            	        if ( (LA85_0==COMMA) ) {
            	            alt85=1;
            	        }


            	        switch (alt85) {
            	    	case 1 :
            	    	    // USE.g:716:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_expression3338); if (state.failed) return retval;

            	    	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression3350); if (state.failed) return retval;

            	    	    // USE.g:717:20: ( COLON t= type )?
            	    	    int alt84=2;
            	    	    int LA84_0 = input.LA(1);

            	    	    if ( (LA84_0==COLON) ) {
            	    	        alt84=1;
            	    	    }
            	    	    switch (alt84) {
            	    	        case 1 :
            	    	            // USE.g:717:22: COLON t= type
            	    	            {
            	    	            match(input,COLON,FOLLOW_COLON_in_expression3354); if (state.failed) return retval;

            	    	            pushFollow(FOLLOW_type_in_expression3358);
            	    	            t=type();

            	    	            state._fsp--;
            	    	            if (state.failed) return retval;

            	    	            }
            	    	            break;

            	    	    }


            	    	    match(input,EQUAL,FOLLOW_EQUAL_in_expression3363); if (state.failed) return retval;

            	    	    pushFollow(FOLLOW_expression_in_expression3367);
            	    	    e1=expression();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;

            	    	    if ( state.backtracking==0 ) { ASTLetExpression nextLet = new ASTLetExpression(name, t, (e1!=null?e1.n:null));
            	    	               if ( firstLet == null ) 
            	    	                   firstLet = nextLet;
            	    	               if ( prevLet != null ) 
            	    	                   prevLet.setInExpr(nextLet);
            	    	               prevLet = nextLet;
            	    	            }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop85;
            	        }
            	    } while (true);


            	    match(input,87,FOLLOW_87_in_expression3408); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);


            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression3424);
            nCndImplies=conditionalImpliesExpression();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { if ( nCndImplies != null ) {
                	 retval.n = nCndImplies;
                     retval.n.setStartToken(tok);
                  }
                  
                  if ( prevLet != null ) { 
                     prevLet.setInExpr(retval.n);
                     retval.n = firstLet;
                     retval.n.setStartToken(tok);
                  }
                }

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
    // $ANTLR end "expression"



    // $ANTLR start "paramList"
    // USE.g:749:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;


        ASTVariableDeclaration v =null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // USE.g:751:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // USE.g:752:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList3457); if (state.failed) return paramList;

            // USE.g:753:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==IDENT) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // USE.g:754:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList3474);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;

                    if ( state.backtracking==0 ) { paramList.add(v); }

                    // USE.g:755:7: ( COMMA v= variableDeclaration )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==COMMA) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // USE.g:755:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList3486); if (state.failed) return paramList;

                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList3490);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;

                    	    if ( state.backtracking==0 ) { paramList.add(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_paramList3510); if (state.failed) return paramList;

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
    // USE.g:763:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;


        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // USE.g:765:5: (id0= IDENT ( COMMA idn= IDENT )* )
            // USE.g:766:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList3539); if (state.failed) return idList;

            if ( state.backtracking==0 ) { idList.add(id0); }

            // USE.g:767:5: ( COMMA idn= IDENT )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==COMMA) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // USE.g:767:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList3549); if (state.failed) return idList;

            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList3553); if (state.failed) return idList;

            	    if ( state.backtracking==0 ) { idList.add(idn); }

            	    }
            	    break;

            	default :
            	    break loop89;
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
    // USE.g:775:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;


        Token name=null;
        ASTType t =null;


        try {
            // USE.g:776:5: (name= IDENT COLON t= type )
            // USE.g:777:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration3584); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableDeclaration3586); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableDeclaration3590);
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
    // USE.g:785:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndOrExp =null;

        ASTExpression n1 =null;


        try {
            // USE.g:786:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // USE.g:787:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression3626);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndOrExp;}

            // USE.g:788:5: (op= 'implies' n1= conditionalOrExpression )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==86) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // USE.g:788:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,86,FOLLOW_86_in_conditionalImpliesExpression3639); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression3643);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop90;
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
    // USE.g:797:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndXorExp =null;

        ASTExpression n1 =null;


        try {
            // USE.g:798:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // USE.g:799:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression3688);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndXorExp;}

            // USE.g:800:5: (op= 'or' n1= conditionalXOrExpression )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==104) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // USE.g:800:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,104,FOLLOW_104_in_conditionalOrExpression3701); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression3705);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop91;
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
    // USE.g:809:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndAndExp =null;

        ASTExpression n1 =null;


        try {
            // USE.g:810:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // USE.g:811:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression3749);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndAndExp;}

            // USE.g:812:5: (op= 'xor' n1= conditionalAndExpression )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==120) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // USE.g:812:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,120,FOLLOW_120_in_conditionalXOrExpression3762); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression3766);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop92;
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
    // USE.g:821:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nEqExp =null;

        ASTExpression n1 =null;


        try {
            // USE.g:822:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // USE.g:823:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression3810);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nEqExp;}

            // USE.g:824:5: (op= 'and' n1= equalityExpression )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==61) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // USE.g:824:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,61,FOLLOW_61_in_conditionalAndExpression3823); if (state.failed) return n;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression3827);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop93;
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
    // USE.g:833:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nRelExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // USE.g:835:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // USE.g:836:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression3875);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nRelExp;}

            // USE.g:837:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==EQUAL||LA94_0==NOT_EQUAL) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // USE.g:837:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression3904);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop94;
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
    // USE.g:847:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nAddiExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // USE.g:849:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // USE.g:850:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression3953);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nAddiExp;}

            // USE.g:851:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( ((LA95_0 >= GREATER && LA95_0 <= GREATER_EQUAL)||(LA95_0 >= LESS && LA95_0 <= LESS_EQUAL)) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // USE.g:851:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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


            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression3989);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop95;
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
    // USE.g:861:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nMulExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // USE.g:863:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // USE.g:864:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4039);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nMulExp;}

            // USE.g:865:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==MINUS||LA96_0==PLUS) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // USE.g:865:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4067);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop96;
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
    // USE.g:876:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // USE.g:878:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // USE.g:879:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4117);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nUnExp;}

            // USE.g:880:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==SLASH||LA97_0==STAR||LA97_0==75) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // USE.g:880:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==75 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4149);
            	    n1=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop97;
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
    // USE.g:892:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression nPosExp =null;


         Token op = null; 
        try {
            // USE.g:894:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==MINUS||LA98_0==PLUS||LA98_0==95) ) {
                alt98=1;
            }
            else if ( (LA98_0==AT||LA98_0==HASH||(LA98_0 >= IDENT && LA98_0 <= INT)||LA98_0==LPAREN||LA98_0==REAL||(LA98_0 >= STAR && LA98_0 <= STRING)||(LA98_0 >= 44 && LA98_0 <= 45)||LA98_0==48||(LA98_0 >= 51 && LA98_0 <= 52)||LA98_0==54||LA98_0==56||LA98_0==82||LA98_0==85||LA98_0==91||(LA98_0 >= 96 && LA98_0 <= 102)||(LA98_0 >= 111 && LA98_0 <= 112)||LA98_0==118) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;

            }
            switch (alt98) {
                case 1 :
                    // USE.g:895:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // USE.g:895:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // USE.g:895:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) { op = input.LT(1); }

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==95 ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4235);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }

                    }


                    }
                    break;
                case 2 :
                    // USE.g:899:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression4255);
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
    // USE.g:907:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nPrimExp =null;

        ASTExpression nPc =null;


         boolean arrow = false; 
        try {
            // USE.g:909:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // USE.g:910:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression4288);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nPrimExp; }

            // USE.g:911:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==DOT) ) {
                    int LA100_2 = input.LA(2);

                    if ( (LA100_2==IDENT) ) {
                        int LA100_4 = input.LA(3);

                        if ( (LA100_4==EOF||(LA100_4 >= ARROW && LA100_4 <= BAR)||(LA100_4 >= COMMA && LA100_4 <= EQUAL)||(LA100_4 >= GREATER && LA100_4 <= GREATER_EQUAL)||LA100_4==IDENT||(LA100_4 >= LBRACE && LA100_4 <= MINUS)||(LA100_4 >= NOT_EQUAL && LA100_4 <= PLUS)||(LA100_4 >= RBRACE && LA100_4 <= RBRACK)||(LA100_4 >= RPAREN && LA100_4 <= SLASH)||LA100_4==STAR||(LA100_4 >= 57 && LA100_4 <= 59)||(LA100_4 >= 61 && LA100_4 <= 64)||(LA100_4 >= 69 && LA100_4 <= 70)||(LA100_4 >= 75 && LA100_4 <= 81)||(LA100_4 >= 86 && LA100_4 <= 87)||LA100_4==90||(LA100_4 >= 103 && LA100_4 <= 107)||(LA100_4 >= 109 && LA100_4 <= 110)||LA100_4==113||(LA100_4 >= 115 && LA100_4 <= 116)||LA100_4==120) ) {
                            alt100=1;
                        }


                    }
                    else if ( (LA100_2==91||LA100_2==97||(LA100_2 >= 99 && LA100_2 <= 101)||(LA100_2 >= 111 && LA100_2 <= 112)) ) {
                        alt100=1;
                    }


                }
                else if ( (LA100_0==ARROW) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // USE.g:912:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // USE.g:912:6: ( ARROW | DOT )
            	    int alt99=2;
            	    int LA99_0 = input.LA(1);

            	    if ( (LA99_0==ARROW) ) {
            	        alt99=1;
            	    }
            	    else if ( (LA99_0==DOT) ) {
            	        alt99=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 99, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt99) {
            	        case 1 :
            	            // USE.g:912:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression4306); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = true; }

            	            }
            	            break;
            	        case 2 :
            	            // USE.g:912:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression4312); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = false; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression4323);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = nPc; }

            	    }
            	    break;

            	default :
            	    break loop100;
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
    // USE.g:928:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? );
    public final ASTExpression primaryExpression() throws RecognitionException {
        ASTExpression n = null;


        Token id1=null;
        Token id2=null;
        ASTExpression nLit =null;

        ASTExpression nOr =null;

        ASTExpression nPc =null;

        USEParser.expression_return nExp =null;

        ASTExpression nIfExp =null;

        USEParser.expression_return idExp =null;


        try {
            // USE.g:929:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? )
            int alt104=7;
            switch ( input.LA(1) ) {
            case HASH:
            case INT:
            case REAL:
            case STAR:
            case STRING:
            case 44:
            case 45:
            case 48:
            case 51:
            case 52:
            case 54:
            case 56:
            case 82:
            case 96:
            case 98:
            case 102:
            case 118:
                {
                alt104=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt104=1;
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
                case IDENT:
                case LBRACE:
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
                case SEMI:
                case SLASH:
                case STAR:
                case 57:
                case 58:
                case 59:
                case 61:
                case 62:
                case 63:
                case 64:
                case 69:
                case 70:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 86:
                case 87:
                case 90:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 109:
                case 110:
                case 113:
                case 115:
                case 116:
                case 120:
                    {
                    alt104=3;
                    }
                    break;
                case DOT:
                    {
                    switch ( input.LA(3) ) {
                    case 60:
                        {
                        alt104=6;
                        }
                        break;
                    case 68:
                        {
                        alt104=7;
                        }
                        break;
                    case IDENT:
                    case 91:
                    case 97:
                    case 99:
                    case 100:
                    case 101:
                    case 111:
                    case 112:
                        {
                        alt104=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 104, 7, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 104, 2, input);

                    throw nvae;

                }

                }
                break;
            case AT:
                {
                alt104=2;
                }
                break;
            case 91:
            case 97:
            case 99:
            case 100:
            case 101:
            case 111:
            case 112:
                {
                alt104=3;
                }
                break;
            case LPAREN:
                {
                alt104=4;
                }
                break;
            case 85:
                {
                alt104=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;

            }

            switch (alt104) {
                case 1 :
                    // USE.g:930:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression4363);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nLit; }

                    }
                    break;
                case 2 :
                    // USE.g:931:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression4377);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nOr; }

                    }
                    break;
                case 3 :
                    // USE.g:932:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression4389);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPc; }

                    }
                    break;
                case 4 :
                    // USE.g:933:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression4400); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression4404);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression4406); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExp!=null?nExp.n:null); }

                    }
                    break;
                case 5 :
                    // USE.g:934:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression4418);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nIfExp; }

                    }
                    break;
                case 6 :
                    // USE.g:935:7: id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression4430); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression4432); if (state.failed) return n;

                    match(input,60,FOLLOW_60_in_primaryExpression4434); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }

                    // USE.g:937:9: ( AT 'pre' )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==AT) ) {
                        int LA101_1 = input.LA(2);

                        if ( (LA101_1==107) ) {
                            alt101=1;
                        }
                    }
                    switch (alt101) {
                        case 1 :
                            // USE.g:937:11: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression4457); if (state.failed) return n;

                            match(input,107,FOLLOW_107_in_primaryExpression4459); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setIsPre(); }

                            }
                            break;

                    }


                    // USE.g:938:9: ( LPAREN RPAREN )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==LPAREN) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // USE.g:938:11: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression4477); if (state.failed) return n;

                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression4479); if (state.failed) return n;

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // USE.g:939:7: id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )?
                    {
                    id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression4492); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression4494); if (state.failed) return n;

                    match(input,68,FOLLOW_68_in_primaryExpression4496); if (state.failed) return n;

                    // USE.g:939:31: ( LPAREN idExp= expression RPAREN )
                    // USE.g:939:33: LPAREN idExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression4500); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression4504);
                    idExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression4506); if (state.failed) return n;

                    }


                    if ( state.backtracking==0 ) { n = new ASTObjectByUseIdExpression(id2, (idExp!=null?idExp.n:null)); }

                    // USE.g:941:7: ( AT 'pre' )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==AT) ) {
                        int LA103_1 = input.LA(2);

                        if ( (LA103_1==107) ) {
                            alt103=1;
                        }
                    }
                    switch (alt103) {
                        case 1 :
                            // USE.g:941:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression4526); if (state.failed) return n;

                            match(input,107,FOLLOW_107_in_primaryExpression4528); if (state.failed) return n;

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
    // USE.g:945:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;


        Token objectName=null;

        try {
            // USE.g:946:3: ( AT objectName= IDENT )
            // USE.g:947:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference4554); if (state.failed) return n;

            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference4562); if (state.failed) return n;

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
    // USE.g:961:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExpQuery =null;

        ASTExpression nExpIterate =null;

        USEParser.operationExpression_return nExpOperation =null;

        ASTTypeArgExpression nExpType =null;

        ASTInStateExpression nExpInState =null;


        try {
            // USE.g:962:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] )
            int alt105=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA105_1 = input.LA(2);

                if ( (((( input.LA(2) == LPAREN )&&( input.LA(2) == LPAREN ))&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))) ) {
                    alt105=1;
                }
                else if ( (true) ) {
                    alt105=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 105, 1, input);

                    throw nvae;

                }
                }
                break;
            case 91:
                {
                alt105=2;
                }
                break;
            case 97:
            case 100:
            case 101:
            case 111:
            case 112:
                {
                alt105=4;
                }
                break;
            case 99:
                {
                alt105=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;

            }

            switch (alt105) {
                case 1 :
                    // USE.g:966:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }

                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }

                    pushFollow(FOLLOW_queryExpression_in_propertyCall4627);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpQuery; }

                    }
                    break;
                case 2 :
                    // USE.g:969:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall4640);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpIterate; }

                    }
                    break;
                case 3 :
                    // USE.g:970:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall4653);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExpOperation!=null?nExpOperation.n:null); }

                    }
                    break;
                case 4 :
                    // USE.g:971:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall4666);
                    nExpType=typeExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpType; }

                    }
                    break;
                case 5 :
                    // USE.g:972:7: nExpInState= inStateExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_inStateExpression_in_propertyCall4679);
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
    // USE.g:981:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTElemVarsDeclaration decls =null;

        USEParser.expression_return nExp =null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // USE.g:982:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // USE.g:983:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression4714); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression4721); if (state.failed) return n;

            // USE.g:985:5: (decls= elemVarsDeclaration BAR )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==IDENT) ) {
                int LA106_1 = input.LA(2);

                if ( ((LA106_1 >= BAR && LA106_1 <= COLON)||LA106_1==COMMA) ) {
                    alt106=1;
                }
            }
            switch (alt106) {
                case 1 :
                    // USE.g:985:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression4732);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {decl = decls;}

                    match(input,BAR,FOLLOW_BAR_in_queryExpression4736); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_queryExpression4747);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression4753); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTQueryExpression(op, range, decl, (nExp!=null?nExp.n:null)); }

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
    // USE.g:999:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTElemVarsDeclaration decls =null;

        ASTVariableInitialization init =null;

        USEParser.expression_return nExp =null;


        try {
            // USE.g:999:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // USE.g:1000:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,91,FOLLOW_91_in_iterateExpression4785); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression4791); if (state.failed) return n;

            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression4799);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;

            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression4801); if (state.failed) return n;

            pushFollow(FOLLOW_variableInitialization_in_iterateExpression4809);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;

            match(input,BAR,FOLLOW_BAR_in_iterateExpression4811); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_iterateExpression4819);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression4825); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTIterateExpression(i, range, decls, init, (nExp!=null?nExp.n:null)); }

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
    // USE.g:1021:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final USEParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        USEParser.operationExpression_return retval = new USEParser.operationExpression_return();
        retval.start = input.LT(1);


        Token name=null;
        USEParser.expression_return rolename =null;

        USEParser.expression_return e =null;


        try {
            // USE.g:1023:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // USE.g:1024:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression4869); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }

            // USE.g:1030:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==LBRACK) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // USE.g:1030:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression4891); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_operationExpression4904);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    // USE.g:1032:9: ( COMMA rolename= expression )*
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==COMMA) ) {
                            alt107=1;
                        }


                        switch (alt107) {
                    	case 1 :
                    	    // USE.g:1032:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression4917); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_operationExpression4921);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    	    }
                    	    break;

                    	default :
                    	    break loop107;
                        }
                    } while (true);


                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression4933); if (state.failed) return retval;

                    // USE.g:1035:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==LBRACK) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // USE.g:1035:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression4950); if (state.failed) return retval;

                            pushFollow(FOLLOW_expression_in_operationExpression4965);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            // USE.g:1037:11: ( COMMA rolename= expression )*
                            loop108:
                            do {
                                int alt108=2;
                                int LA108_0 = input.LA(1);

                                if ( (LA108_0==COMMA) ) {
                                    alt108=1;
                                }


                                switch (alt108) {
                            	case 1 :
                            	    // USE.g:1037:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression4980); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression4984);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop108;
                                }
                            } while (true);


                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression4998); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            // USE.g:1042:5: ( AT 'pre' )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==AT) ) {
                int LA111_1 = input.LA(2);

                if ( (LA111_1==107) ) {
                    alt111=1;
                }
            }
            switch (alt111) {
                case 1 :
                    // USE.g:1042:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression5023); if (state.failed) return retval;

                    match(input,107,FOLLOW_107_in_operationExpression5025); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.setIsPre(); }

                    }
                    break;

            }


            // USE.g:1044:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==LPAREN) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // USE.g:1045:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression5050); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.hasParentheses(); }

                    // USE.g:1046:7: (e= expression ( COMMA e= expression )* )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==AT||LA113_0==HASH||(LA113_0 >= IDENT && LA113_0 <= INT)||(LA113_0 >= LPAREN && LA113_0 <= MINUS)||LA113_0==PLUS||LA113_0==REAL||(LA113_0 >= STAR && LA113_0 <= STRING)||(LA113_0 >= 44 && LA113_0 <= 45)||LA113_0==48||(LA113_0 >= 51 && LA113_0 <= 52)||LA113_0==54||LA113_0==56||LA113_0==82||LA113_0==85||(LA113_0 >= 91 && LA113_0 <= 92)||(LA113_0 >= 95 && LA113_0 <= 102)||(LA113_0 >= 111 && LA113_0 <= 112)||LA113_0==118) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // USE.g:1047:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression5071);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            // USE.g:1048:7: ( COMMA e= expression )*
                            loop112:
                            do {
                                int alt112=2;
                                int LA112_0 = input.LA(1);

                                if ( (LA112_0==COMMA) ) {
                                    alt112=1;
                                }


                                switch (alt112) {
                            	case 1 :
                            	    // USE.g:1048:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression5083); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression5087);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop112;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression5107); if (state.failed) return retval;

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
    // USE.g:1055:1: inStateExpression[ASTExpression source, boolean followsArrow] returns [ASTInStateExpression n] : opToken= 'oclInState' LPAREN s= IDENT RPAREN ;
    public final ASTInStateExpression inStateExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTInStateExpression n = null;


        Token opToken=null;
        Token s=null;

        try {
            // USE.g:1056:35: (opToken= 'oclInState' LPAREN s= IDENT RPAREN )
            // USE.g:1057:4: opToken= 'oclInState' LPAREN s= IDENT RPAREN
            {
            opToken=(Token)match(input,99,FOLLOW_99_in_inStateExpression5144); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_inStateExpression5149); if (state.failed) return n;

            s=(Token)match(input,IDENT,FOLLOW_IDENT_in_inStateExpression5158); if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_inStateExpression5163); if (state.failed) return n;

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
    // USE.g:1069:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;


        ASTType t =null;


         Token opToken = null; 
        try {
            // USE.g:1072:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN )
            // USE.g:1073:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) { opToken = input.LT(1); }

            if ( input.LA(1)==97||(input.LA(1) >= 100 && input.LA(1) <= 101)||(input.LA(1) >= 111 && input.LA(1) <= 112) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression5223); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_typeExpression5227);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression5229); if (state.failed) return n;

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
    // USE.g:1084:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;


        Token var1=null;
        Token varN=null;
        ASTType t =null;

        ASTType tN =null;


        try {
            // USE.g:1085:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // USE.g:1086:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }

            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration5267); if (state.failed) return n;

            // USE.g:1087:17: ( COLON t= type )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==COLON) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // USE.g:1087:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration5270); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_elemVarsDeclaration5274);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}

            // USE.g:1088:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==COMMA) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // USE.g:1088:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration5284); if (state.failed) return n;

            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration5290); if (state.failed) return n;

            	    // USE.g:1088:24: ( COLON tN= type )?
            	    int alt116=2;
            	    int LA116_0 = input.LA(1);

            	    if ( (LA116_0==COLON) ) {
            	        alt116=1;
            	    }
            	    switch (alt116) {
            	        case 1 :
            	            // USE.g:1088:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration5293); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration5299);
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
            	    break loop117;
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
    // USE.g:1096:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;


        Token name=null;
        ASTType t =null;

        USEParser.expression_return e =null;


        try {
            // USE.g:1097:5: (name= IDENT COLON t= type EQUAL e= expression )
            // USE.g:1098:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization5327); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableInitialization5329); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableInitialization5333);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization5335); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_variableInitialization5339);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTVariableInitialization(name, t, (e!=null?e.n:null)); }

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
    // USE.g:1107:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        USEParser.expression_return cond =null;

        USEParser.expression_return t =null;

        USEParser.expression_return e =null;


        try {
            // USE.g:1108:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // USE.g:1109:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,85,FOLLOW_85_in_ifExpression5371); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression5375);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,116,FOLLOW_116_in_ifExpression5377); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression5381);
            t=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,77,FOLLOW_77_in_ifExpression5383); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression5387);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,79,FOLLOW_79_in_ifExpression5389); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTIfExpression(i, (cond!=null?cond.n:null), (t!=null?t.n:null), (e!=null?e.n:null)); }

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
    // USE.g:1128:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR );
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
            // USE.g:1129:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR )
            int alt118=12;
            switch ( input.LA(1) ) {
            case 118:
                {
                alt118=1;
                }
                break;
            case 82:
                {
                alt118=2;
                }
                break;
            case INT:
                {
                alt118=3;
                }
                break;
            case REAL:
                {
                alt118=4;
                }
                break;
            case STRING:
                {
                alt118=5;
                }
                break;
            case HASH:
                {
                alt118=6;
                }
                break;
            case IDENT:
                {
                alt118=7;
                }
                break;
            case 44:
            case 48:
            case 51:
            case 52:
                {
                int LA118_8 = input.LA(2);

                if ( (LA118_8==LPAREN) ) {
                    alt118=9;
                }
                else if ( (LA118_8==LBRACE) ) {
                    alt118=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 118, 8, input);

                    throw nvae;

                }
                }
                break;
            case 45:
            case 98:
                {
                alt118=9;
                }
                break;
            case 56:
            case 96:
            case 102:
                {
                alt118=10;
                }
                break;
            case 54:
                {
                alt118=11;
                }
                break;
            case STAR:
                {
                alt118=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;

            }

            switch (alt118) {
                case 1 :
                    // USE.g:1130:7: t= 'true'
                    {
                    t=(Token)match(input,118,FOLLOW_118_in_literal5428); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }

                    }
                    break;
                case 2 :
                    // USE.g:1131:7: f= 'false'
                    {
                    f=(Token)match(input,82,FOLLOW_82_in_literal5442); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }

                    }
                    break;
                case 3 :
                    // USE.g:1132:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal5455); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }

                    }
                    break;
                case 4 :
                    // USE.g:1133:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal5470); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }

                    }
                    break;
                case 5 :
                    // USE.g:1134:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal5484); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }

                    }
                    break;
                case 6 :
                    // USE.g:1135:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal5494); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal5498); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}

                    }
                    break;
                case 7 :
                    // USE.g:1136:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal5510); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal5512); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal5516); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }

                    }
                    break;
                case 8 :
                    // USE.g:1137:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal5528);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nColIt; }

                    }
                    break;
                case 9 :
                    // USE.g:1138:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal5540);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nEColIt; }

                    }
                    break;
                case 10 :
                    // USE.g:1139:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal5552);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nUndLit; }

                    }
                    break;
                case 11 :
                    // USE.g:1140:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal5564);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nTupleLit; }

                    }
                    break;
                case 12 :
                    // USE.g:1141:7: un= STAR
                    {
                    un=(Token)match(input,STAR,FOLLOW_STAR_in_literal5576); if (state.failed) return n;

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
    // USE.g:1149:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;


        ASTCollectionItem ci =null;


         Token op = null; 
        try {
            // USE.g:1151:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // USE.g:1152:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( input.LA(1)==44||input.LA(1)==48||(input.LA(1) >= 51 && input.LA(1) <= 52) ) {
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

            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral5643); if (state.failed) return n;

            // USE.g:1156:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==AT||LA120_0==HASH||(LA120_0 >= IDENT && LA120_0 <= INT)||(LA120_0 >= LPAREN && LA120_0 <= MINUS)||LA120_0==PLUS||LA120_0==REAL||(LA120_0 >= STAR && LA120_0 <= STRING)||(LA120_0 >= 44 && LA120_0 <= 45)||LA120_0==48||(LA120_0 >= 51 && LA120_0 <= 52)||LA120_0==54||LA120_0==56||LA120_0==82||LA120_0==85||(LA120_0 >= 91 && LA120_0 <= 92)||(LA120_0 >= 95 && LA120_0 <= 102)||(LA120_0 >= 111 && LA120_0 <= 112)||LA120_0==118) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // USE.g:1157:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral5660);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addItem(ci); }

                    // USE.g:1158:7: ( COMMA ci= collectionItem )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==COMMA) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // USE.g:1158:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral5673); if (state.failed) return n;

                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral5677);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addItem(ci); }

                    	    }
                    	    break;

                    	default :
                    	    break loop119;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral5696); if (state.failed) return n;

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
    // USE.g:1167:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;


        USEParser.expression_return e =null;


         n = new ASTCollectionItem(); 
        try {
            // USE.g:1169:5: (e= expression ( DOTDOT e= expression )? )
            // USE.g:1170:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem5725);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setFirst((e!=null?e.n:null)); }

            // USE.g:1171:5: ( DOTDOT e= expression )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==DOTDOT) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // USE.g:1171:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem5736); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_collectionItem5740);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setSecond((e!=null?e.n:null)); }

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
    // USE.g:1181:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;


        ASTCollectionType t =null;


        try {
            // USE.g:1182:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==98) ) {
                alt122=1;
            }
            else if ( ((LA122_0 >= 44 && LA122_0 <= 45)||LA122_0==48||(LA122_0 >= 51 && LA122_0 <= 52)) ) {
                alt122=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;

            }
            switch (alt122) {
                case 1 :
                    // USE.g:1183:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,98,FOLLOW_98_in_emptyCollectionLiteral5769); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral5771); if (state.failed) return n;

                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral5775);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral5777); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;
                case 2 :
                    // USE.g:1186:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral5793);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral5795); if (state.failed) return n;

                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral5797); if (state.failed) return n;

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
    // USE.g:1197:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;


        ASTType t =null;


        try {
            // USE.g:1198:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt123=4;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt123=1;
                }
                break;
            case 56:
                {
                alt123=2;
                }
                break;
            case 96:
                {
                int LA123_3 = input.LA(2);

                if ( (LA123_3==LPAREN) ) {
                    alt123=3;
                }
                else if ( (LA123_3==EOF||(LA123_3 >= ARROW && LA123_3 <= BAR)||(LA123_3 >= COMMA && LA123_3 <= EQUAL)||(LA123_3 >= GREATER && LA123_3 <= GREATER_EQUAL)||LA123_3==IDENT||LA123_3==LBRACE||(LA123_3 >= LESS && LA123_3 <= LESS_EQUAL)||LA123_3==MINUS||(LA123_3 >= NOT_EQUAL && LA123_3 <= PLUS)||(LA123_3 >= RBRACE && LA123_3 <= RBRACK)||(LA123_3 >= RPAREN && LA123_3 <= SLASH)||LA123_3==STAR||(LA123_3 >= 57 && LA123_3 <= 59)||(LA123_3 >= 61 && LA123_3 <= 64)||(LA123_3 >= 69 && LA123_3 <= 70)||(LA123_3 >= 75 && LA123_3 <= 81)||(LA123_3 >= 86 && LA123_3 <= 87)||LA123_3==90||(LA123_3 >= 103 && LA123_3 <= 107)||(LA123_3 >= 109 && LA123_3 <= 110)||LA123_3==113||(LA123_3 >= 115 && LA123_3 <= 116)||LA123_3==120) ) {
                    alt123=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 123, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;

            }

            switch (alt123) {
                case 1 :
                    // USE.g:1199:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,102,FOLLOW_102_in_undefinedLiteral5827); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral5829); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral5833);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral5835); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 2 :
                    // USE.g:1202:5: 'Undefined'
                    {
                    match(input,56,FOLLOW_56_in_undefinedLiteral5849); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;
                case 3 :
                    // USE.g:1205:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,96,FOLLOW_96_in_undefinedLiteral5863); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral5865); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral5869);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral5871); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 4 :
                    // USE.g:1208:5: 'null'
                    {
                    match(input,96,FOLLOW_96_in_undefinedLiteral5885); if (state.failed) return n;

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
    // USE.g:1218:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;


        ASTTupleItem ti =null;


         List tiList = new ArrayList(); 
        try {
            // USE.g:1220:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // USE.g:1221:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,54,FOLLOW_54_in_tupleLiteral5924); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral5930); if (state.failed) return n;

            pushFollow(FOLLOW_tupleItem_in_tupleLiteral5938);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tiList.add(ti); }

            // USE.g:1224:5: ( COMMA ti= tupleItem )*
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( (LA124_0==COMMA) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // USE.g:1224:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral5949); if (state.failed) return n;

            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral5953);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tiList.add(ti); }

            	    }
            	    break;

            	default :
            	    break loop124;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral5964); if (state.failed) return n;

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
    // USE.g:1232:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;


        Token name=null;
        ASTType t =null;

        USEParser.expression_return e =null;


        try {
            // USE.g:1233:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // USE.g:1234:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem5995); if (state.failed) return n;

            // USE.g:1235:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==COLON) ) {
                int LA125_1 = input.LA(2);

                if ( (synpred1_USE()) ) {
                    alt125=1;
                }
                else if ( (true) ) {
                    alt125=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 125, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA125_0==EQUAL) ) {
                alt125=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;

            }
            switch (alt125) {
                case 1 :
                    // USE.g:1238:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem6034); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_tupleItem6038);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem6040); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_tupleItem6044);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, (e!=null?e.n:null)); }

                    }
                    break;
                case 2 :
                    // USE.g:1241:7: ( COLON | EQUAL ) e= expression
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


                    pushFollow(FOLLOW_expression_in_tupleItem6076);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, (e!=null?e.n:null)); }

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
    // USE.g:1252:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;


        ASTSimpleType nTSimple =null;

        ASTCollectionType nTCollection =null;

        ASTTupleType nTTuple =null;


         Token tok = null; 
        try {
            // USE.g:1254:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
            // USE.g:1255:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }

            // USE.g:1256:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            int alt126=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt126=1;
                }
                break;
            case 44:
            case 45:
            case 48:
            case 51:
            case 52:
                {
                alt126=2;
                }
                break;
            case 54:
                {
                alt126=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;

            }

            switch (alt126) {
                case 1 :
                    // USE.g:1257:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type6142);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 2 :
                    // USE.g:1258:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type6154);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 3 :
                    // USE.g:1259:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type6166);
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
    // USE.g:1264:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;


        ASTType nT =null;


        try {
            // USE.g:1265:5: (nT= type EOF )
            // USE.g:1266:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly6198);
            nT=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_typeOnly6200); if (state.failed) return n;

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
    // USE.g:1276:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;


        Token name=null;

        try {
            // USE.g:1277:5: (name= IDENT )
            // USE.g:1278:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType6228); if (state.failed) return n;

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
    // USE.g:1286:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;


        ASTType elemType =null;


         Token op = null; 
        try {
            // USE.g:1288:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // USE.g:1289:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( (input.LA(1) >= 44 && input.LA(1) <= 45)||input.LA(1)==48||(input.LA(1) >= 51 && input.LA(1) <= 52) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType6293); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_collectionType6297);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType6299); if (state.failed) return n;

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
    // USE.g:1299:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;


        ASTTuplePart tp =null;


         List tpList = new ArrayList(); 
        try {
            // USE.g:1301:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // USE.g:1302:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,54,FOLLOW_54_in_tupleType6333); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType6335); if (state.failed) return n;

            pushFollow(FOLLOW_tuplePart_in_tupleType6344);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tpList.add(tp); }

            // USE.g:1304:5: ( COMMA tp= tuplePart )*
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( (LA127_0==COMMA) ) {
                    alt127=1;
                }


                switch (alt127) {
            	case 1 :
            	    // USE.g:1304:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType6355); if (state.failed) return n;

            	    pushFollow(FOLLOW_tuplePart_in_tupleType6359);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tpList.add(tp); }

            	    }
            	    break;

            	default :
            	    break loop127;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType6371); if (state.failed) return n;

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
    // USE.g:1313:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;


        Token name=null;
        ASTType t =null;


        try {
            // USE.g:1314:5: (name= IDENT COLON t= type )
            // USE.g:1315:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart6403); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_tuplePart6405); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_tuplePart6409);
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



    // $ANTLR start "statOnly"
    // USE.g:1354:1: statOnly returns [ASTStatement n] : s= stat EOF ;
    public final ASTStatement statOnly() throws RecognitionException {
        ASTStatement n = null;


        USEParser.stat_return s =null;


        try {
            // USE.g:1355:3: (s= stat EOF )
            // USE.g:1356:3: s= stat EOF
            {
            pushFollow(FOLLOW_stat_in_statOnly6458);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_statOnly6462); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = (s!=null?s.n:null); }

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
    // $ANTLR end "statOnly"


    public static class stat_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };


    // $ANTLR start "stat"
    // USE.g:1366:1: stat returns [ASTStatement n] : s= singleStat ( SEMI s2= singleStat )* ;
    public final USEParser.stat_return stat() throws RecognitionException {
        USEParser.stat_return retval = new USEParser.stat_return();
        retval.start = input.LT(1);


        ASTStatement s =null;

        ASTStatement s2 =null;



          ASTSequenceStatement seq = new ASTSequenceStatement(((Token)retval.start));

        try {
            // USE.g:1370:3: (s= singleStat ( SEMI s2= singleStat )* )
            // USE.g:1371:3: s= singleStat ( SEMI s2= singleStat )*
            {
            pushFollow(FOLLOW_singleStat_in_stat6497);
            s=singleStat();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {seq.addStatement(s);}

            // USE.g:1372:3: ( SEMI s2= singleStat )*
            loop128:
            do {
                int alt128=2;
                int LA128_0 = input.LA(1);

                if ( (LA128_0==SEMI) ) {
                    alt128=1;
                }


                switch (alt128) {
            	case 1 :
            	    // USE.g:1373:5: SEMI s2= singleStat
            	    {
            	    match(input,SEMI,FOLLOW_SEMI_in_stat6509); if (state.failed) return retval;

            	    pushFollow(FOLLOW_singleStat_in_stat6519);
            	    s2=singleStat();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {seq.addStatement(s2); }

            	    }
            	    break;

            	default :
            	    break loop128;
                }
            } while (true);


            if ( state.backtracking==0 ) { 
                retval.n = seq.simplify();
              }

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
    // $ANTLR end "stat"



    // $ANTLR start "singleStat"
    // USE.g:1385:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat );
    public final ASTStatement singleStat() throws RecognitionException {
        ASTStatement n = null;


        ASTEmptyStatement emp =null;

        USEParser.statStartingWithExpr_return sse =null;

        ASTStatement vas =null;

        USEParser.objCreateStat_return ocs =null;

        USEParser.objDestroyStat_return ods =null;

        USEParser.lnkInsStat_return lis =null;

        USEParser.lnkDelStat_return lds =null;

        USEParser.condExStat_return ces =null;

        USEParser.iterStat_return its =null;

        USEParser.whileStat_return whs =null;

        USEParser.blockStat_return blk =null;


        try {
            // USE.g:1386:5: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat )
            int alt129=11;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==EOF||LA129_0==SEMI||(LA129_0 >= 77 && LA129_0 <= 78)) ) {
                alt129=1;
            }
            else if ( (LA129_0==92) && (synpred2_USE())) {
                alt129=2;
            }
            else if ( (LA129_0==MINUS||LA129_0==PLUS||LA129_0==95) && (synpred2_USE())) {
                alt129=2;
            }
            else if ( (LA129_0==118) && (synpred2_USE())) {
                alt129=2;
            }
            else if ( (LA129_0==82) && (synpred2_USE())) {
                alt129=2;
            }
            else if ( (LA129_0==INT) && (synpred2_USE())) {
                alt129=2;
            }
            else if ( (LA129_0==REAL) && (synpred2_USE())) {
                alt129=2;
            }
            else if ( (LA129_0==STRING) && (synpred2_USE())) {
                alt129=2;
            }
            else if ( (LA129_0==HASH) && (synpred2_USE())) {
                alt129=2;
            }
            else if ( (LA129_0==IDENT) ) {
                int LA129_13 = input.LA(2);

                if ( (synpred2_USE()) ) {
                    alt129=2;
                }
                else if ( (true) ) {
                    alt129=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 129, 13, input);

                    throw nvae;

                }
            }
            else if ( (LA129_0==44||LA129_0==48||(LA129_0 >= 51 && LA129_0 <= 52)) && (synpred2_USE())) {
                alt129=2;
            }
            else if ( (LA129_0==98) && (synpred2_USE())) {
                alt129=2;
            }
            else if ( (LA129_0==45) && (synpred2_USE())) {
                alt129=2;
            }
            else if ( (LA129_0==102) && (synpred2_USE())) {
                alt129=2;
            }
            else if ( (LA129_0==56) && (synpred2_USE())) {
                alt129=2;
            }
            else if ( (LA129_0==96) && (synpred2_USE())) {
                alt129=2;
            }
            else if ( (LA129_0==54) && (synpred2_USE())) {
                alt129=2;
            }
            else if ( (LA129_0==STAR) && (synpred2_USE())) {
                alt129=2;
            }
            else if ( (LA129_0==AT) && (synpred2_USE())) {
                alt129=2;
            }
            else if ( (LA129_0==91) && (synpred2_USE())) {
                alt129=2;
            }
            else if ( (LA129_0==97||(LA129_0 >= 100 && LA129_0 <= 101)||(LA129_0 >= 111 && LA129_0 <= 112)) && (synpred2_USE())) {
                alt129=2;
            }
            else if ( (LA129_0==99) && (synpred2_USE())) {
                alt129=2;
            }
            else if ( (LA129_0==LPAREN) && (synpred2_USE())) {
                alt129=2;
            }
            else if ( (LA129_0==85) ) {
                int LA129_27 = input.LA(2);

                if ( (synpred2_USE()) ) {
                    alt129=2;
                }
                else if ( (true) ) {
                    alt129=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 129, 27, input);

                    throw nvae;

                }
            }
            else if ( (LA129_0==94) ) {
                alt129=4;
            }
            else if ( (LA129_0==74) ) {
                alt129=5;
            }
            else if ( (LA129_0==88) ) {
                alt129=6;
            }
            else if ( (LA129_0==73) ) {
                alt129=7;
            }
            else if ( (LA129_0==83) ) {
                alt129=9;
            }
            else if ( (LA129_0==119) ) {
                alt129=10;
            }
            else if ( (LA129_0==66) ) {
                alt129=11;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;

            }
            switch (alt129) {
                case 1 :
                    // USE.g:1387:5: emp= emptyStat
                    {
                    pushFollow(FOLLOW_emptyStat_in_singleStat6559);
                    emp=emptyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = emp; }

                    }
                    break;
                case 2 :
                    // USE.g:1389:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
                    {
                    pushFollow(FOLLOW_statStartingWithExpr_in_singleStat6585);
                    sse=statStartingWithExpr();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (sse!=null?sse.n:null); }

                    }
                    break;
                case 3 :
                    // USE.g:1390:5: vas= varAssignStat
                    {
                    pushFollow(FOLLOW_varAssignStat_in_singleStat6597);
                    vas=varAssignStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = vas; }

                    }
                    break;
                case 4 :
                    // USE.g:1391:5: ocs= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_singleStat6611);
                    ocs=objCreateStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ocs!=null?ocs.n:null); }

                    }
                    break;
                case 5 :
                    // USE.g:1392:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleStat6625);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ods!=null?ods.n:null); }

                    }
                    break;
                case 6 :
                    // USE.g:1393:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleStat6638);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lis!=null?lis.n:null); }

                    }
                    break;
                case 7 :
                    // USE.g:1394:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleStat6655);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lds!=null?lds.n:null); }

                    }
                    break;
                case 8 :
                    // USE.g:1395:5: ces= condExStat
                    {
                    pushFollow(FOLLOW_condExStat_in_singleStat6672);
                    ces=condExStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ces!=null?ces.n:null); }

                    }
                    break;
                case 9 :
                    // USE.g:1396:5: its= iterStat
                    {
                    pushFollow(FOLLOW_iterStat_in_singleStat6689);
                    its=iterStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (its!=null?its.n:null); }

                    }
                    break;
                case 10 :
                    // USE.g:1398:5: whs= whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_singleStat6711);
                    whs=whileStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (whs!=null?whs.n:null); }

                    }
                    break;
                case 11 :
                    // USE.g:1399:5: blk= blockStat
                    {
                    pushFollow(FOLLOW_blockStat_in_singleStat6729);
                    blk=blockStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (blk!=null?blk.n:null); }

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
    // $ANTLR end "singleStat"



    // $ANTLR start "emptyStat"
    // USE.g:1406:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
    public final ASTEmptyStatement emptyStat() throws RecognitionException {
        ASTEmptyStatement n = null;


        try {
            // USE.g:1407:3: ( nothing )
            // USE.g:1408:3: nothing
            {
            pushFollow(FOLLOW_nothing_in_emptyStat6756);
            nothing();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTEmptyStatement(); }

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
    // $ANTLR end "emptyStat"


    public static class statStartingWithExpr_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };


    // $ANTLR start "statStartingWithExpr"
    // USE.g:1413:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
    public final USEParser.statStartingWithExpr_return statStartingWithExpr() throws RecognitionException {
        USEParser.statStartingWithExpr_return retval = new USEParser.statStartingWithExpr_return();
        retval.start = input.LT(1);


        ASTExpression expr =null;

        ASTAttributeAssignmentStatement aas =null;


        try {
            // USE.g:1414:3: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
            // USE.g:1415:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
            {
            pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr6782);
            expr=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            // USE.g:1416:3: (aas= attAssignStat[$expr.n] )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==DOT) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // USE.g:1417:5: aas= attAssignStat[$expr.n]
                    {
                    pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr6796);
                    aas=attAssignStat(expr);

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n = aas; }

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                if (aas == null) {
                  retval.n = new ASTOperationCallStatement(((Token)retval.start), expr); 
                }
              }

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
    // $ANTLR end "statStartingWithExpr"



    // $ANTLR start "varAssignStat"
    // USE.g:1429:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
    public final ASTStatement varAssignStat() throws RecognitionException {
        ASTStatement n = null;


        Token varName=null;
        ASTRValue rVal =null;


        try {
            // USE.g:1430:3: (varName= IDENT COLON_EQUAL rVal= rValue )
            // USE.g:1431:3: varName= IDENT COLON_EQUAL rVal= rValue
            {
            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat6834); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat6838); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_varAssignStat6846);
            rVal=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {
                n = new ASTVariableAssignmentStatement(varName, (varName!=null?varName.getText():null), rVal);
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
    // $ANTLR end "varAssignStat"



    // $ANTLR start "attAssignStat"
    // USE.g:1443:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
    public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
        ASTAttributeAssignmentStatement n = null;


        Token attName=null;
        ASTRValue r =null;


        try {
            // USE.g:1444:3: ( DOT attName= IDENT COLON_EQUAL r= rValue )
            // USE.g:1445:3: DOT attName= IDENT COLON_EQUAL r= rValue
            {
            match(input,DOT,FOLLOW_DOT_in_attAssignStat6870); if (state.failed) return n;

            attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat6879); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat6883); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_attAssignStat6891);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAttributeAssignmentStatement(attName, exp, (attName!=null?attName.getText():null), r); }

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
    // $ANTLR end "attAssignStat"


    public static class objCreateStat_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };


    // $ANTLR start "objCreateStat"
    // USE.g:1457:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
    public final USEParser.objCreateStat_return objCreateStat() throws RecognitionException {
        USEParser.objCreateStat_return retval = new USEParser.objCreateStat_return();
        retval.start = input.LT(1);


        ASTSimpleType ident =null;

        ASTExpression objName =null;

        USEParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // USE.g:1458:3: ( 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
            // USE.g:1459:3: 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            {
            match(input,94,FOLLOW_94_in_objCreateStat6917); if (state.failed) return retval;

            pushFollow(FOLLOW_simpleType_in_objCreateStat6925);
            ident=simpleType();

            state._fsp--;
            if (state.failed) return retval;

            // USE.g:1461:3: ( LPAREN (objName= inSoilExpression )? RPAREN )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==LPAREN) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // USE.g:1462:5: LPAREN (objName= inSoilExpression )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat6935); if (state.failed) return retval;

                    // USE.g:1463:7: (objName= inSoilExpression )?
                    int alt131=2;
                    int LA131_0 = input.LA(1);

                    if ( (LA131_0==AT||LA131_0==HASH||(LA131_0 >= IDENT && LA131_0 <= INT)||(LA131_0 >= LPAREN && LA131_0 <= MINUS)||LA131_0==PLUS||LA131_0==REAL||(LA131_0 >= STAR && LA131_0 <= STRING)||(LA131_0 >= 44 && LA131_0 <= 45)||LA131_0==48||(LA131_0 >= 51 && LA131_0 <= 52)||LA131_0==54||LA131_0==56||LA131_0==82||LA131_0==85||(LA131_0 >= 91 && LA131_0 <= 92)||(LA131_0 >= 95 && LA131_0 <= 102)||(LA131_0 >= 111 && LA131_0 <= 112)||LA131_0==118) ) {
                        alt131=1;
                    }
                    switch (alt131) {
                        case 1 :
                            // USE.g:1463:8: objName= inSoilExpression
                            {
                            pushFollow(FOLLOW_inSoilExpression_in_objCreateStat6948);
                            objName=inSoilExpression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat6956); if (state.failed) return retval;

                    }
                    break;

            }


            // USE.g:1467:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==67) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // USE.g:1468:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
                    {
                    match(input,67,FOLLOW_67_in_objCreateStat6974); if (state.failed) return retval;

                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat6982); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat6996);
                    p=rValListMin2WithOptionalQualifiers();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat7004); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { 
                        retval.n = new ASTNewLinkObjectStatement(((Token)retval.start), ident, (p!=null?p.participans:null), (p!=null?p.qualifiers:null), objName);
                        }

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                if (retval.n == null) {
                  retval.n = new ASTNewObjectStatement(((Token)retval.start), ident, objName);
                }
              }

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
    // $ANTLR end "objCreateStat"


    public static class objDestroyStat_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };


    // $ANTLR start "objDestroyStat"
    // USE.g:1487:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
    public final USEParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
        USEParser.objDestroyStat_return retval = new USEParser.objDestroyStat_return();
        retval.start = input.LT(1);


        List<ASTExpression> el =null;


        try {
            // USE.g:1488:3: ( 'destroy' el= exprListMin1 )
            // USE.g:1489:3: 'destroy' el= exprListMin1
            {
            match(input,74,FOLLOW_74_in_objDestroyStat7040); if (state.failed) return retval;

            pushFollow(FOLLOW_exprListMin1_in_objDestroyStat7048);
            el=exprListMin1();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {
                ASTSequenceStatement seq = new ASTSequenceStatement(((Token)retval.start));
                
                for (ASTExpression expression : el) {
                  seq.addStatement(
                    new ASTObjectDestructionStatement(((Token)retval.start), expression));
                }
                
                retval.n = seq.simplify();
              }

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
    // $ANTLR end "objDestroyStat"


    public static class lnkInsStat_return extends ParserRuleReturnScope {
        public ASTLinkInsertionStatement n;
    };


    // $ANTLR start "lnkInsStat"
    // USE.g:1508:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
    public final USEParser.lnkInsStat_return lnkInsStat() throws RecognitionException {
        USEParser.lnkInsStat_return retval = new USEParser.lnkInsStat_return();
        retval.start = input.LT(1);


        Token ass=null;
        USEParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // USE.g:1509:3: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
            // USE.g:1510:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
            {
            match(input,88,FOLLOW_88_in_lnkInsStat7074); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat7078); if (state.failed) return retval;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat7088);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat7092); if (state.failed) return retval;

            match(input,89,FOLLOW_89_in_lnkInsStat7096); if (state.failed) return retval;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat7104); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTLinkInsertionStatement(((Token)retval.start), (ass!=null?ass.getText():null), (p!=null?p.participans:null), (p!=null?p.qualifiers:null)); }

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
    // $ANTLR end "lnkInsStat"


    public static class rValListMin2WithOptionalQualifiers_return extends ParserRuleReturnScope {
        public List<ASTRValue> participans;
        public List<List<ASTRValue>> qualifiers;
    };


    // $ANTLR start "rValListMin2WithOptionalQualifiers"
    // USE.g:1520:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
    public final USEParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
        USEParser.rValListMin2WithOptionalQualifiers_return retval = new USEParser.rValListMin2WithOptionalQualifiers_return();
        retval.start = input.LT(1);


        ASTRValue r =null;

        List<ASTRValue> qualifierValues =null;



          retval.participans = new ArrayList<ASTRValue>();
          retval.qualifiers = new ArrayList<List<ASTRValue>>();
          List<ASTRValue> currentQualifiers = Collections.emptyList();

        try {
            // USE.g:1526:3: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
            // USE.g:1527:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7133);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add(r); }

            // USE.g:1528:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==LBRACE) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // USE.g:1529:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7144); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7153);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7160); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers7176); if (state.failed) return retval;

            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7187);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add(r); }

            // USE.g:1541:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==LBRACE) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // USE.g:1542:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7198); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7207);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7214); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            // USE.g:1551:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            loop137:
            do {
                int alt137=2;
                int LA137_0 = input.LA(1);

                if ( (LA137_0==COMMA) ) {
                    alt137=1;
                }


                switch (alt137) {
            	case 1 :
            	    // USE.g:1552:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers7236); if (state.failed) return retval;

            	    pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7251);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.participans.add(r); }

            	    // USE.g:1556:5: ( LBRACE qualifierValues= rValList RBRACE )?
            	    int alt136=2;
            	    int LA136_0 = input.LA(1);

            	    if ( (LA136_0==LBRACE) ) {
            	        alt136=1;
            	    }
            	    switch (alt136) {
            	        case 1 :
            	            // USE.g:1557:6: LBRACE qualifierValues= rValList RBRACE
            	            {
            	            match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7271); if (state.failed) return retval;

            	            pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7282);
            	            qualifierValues=rValList();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

            	            match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7291); if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    if ( state.backtracking==0 ) {
            	          retval.qualifiers.add(currentQualifiers);
            	          currentQualifiers = Collections.emptyList();
            	        }

            	    }
            	    break;

            	default :
            	    break loop137;
                }
            } while (true);


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
    // $ANTLR end "rValListMin2WithOptionalQualifiers"


    public static class lnkDelStat_return extends ParserRuleReturnScope {
        public ASTLinkDeletionStatement n;
    };


    // $ANTLR start "lnkDelStat"
    // USE.g:1572:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
    public final USEParser.lnkDelStat_return lnkDelStat() throws RecognitionException {
        USEParser.lnkDelStat_return retval = new USEParser.lnkDelStat_return();
        retval.start = input.LT(1);


        Token ass=null;
        USEParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // USE.g:1573:3: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
            // USE.g:1574:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
            {
            match(input,73,FOLLOW_73_in_lnkDelStat7332); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat7336); if (state.failed) return retval;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat7346);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat7350); if (state.failed) return retval;

            match(input,84,FOLLOW_84_in_lnkDelStat7354); if (state.failed) return retval;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat7363); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTLinkDeletionStatement(((Token)retval.start), (ass!=null?ass.getText():null), (p!=null?p.participans:null), (p!=null?p.qualifiers:null)); }

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
    // $ANTLR end "lnkDelStat"


    public static class condExStat_return extends ParserRuleReturnScope {
        public ASTConditionalExecutionStatement n;
    };


    // $ANTLR start "condExStat"
    // USE.g:1588:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' ;
    public final USEParser.condExStat_return condExStat() throws RecognitionException {
        USEParser.condExStat_return retval = new USEParser.condExStat_return();
        retval.start = input.LT(1);


        ASTExpression con =null;

        ASTStatement ts =null;

        ASTStatement es =null;



          ASTStatement elseStat = new ASTEmptyStatement();

        try {
            // USE.g:1592:3: ( 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' )
            // USE.g:1593:3: 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end'
            {
            match(input,85,FOLLOW_85_in_condExStat7394); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_condExStat7403);
            con=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,116,FOLLOW_116_in_condExStat7407); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat7416);
            ts=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            // USE.g:1597:3: ( 'else' es= statOrImplicitBlock )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==77) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // USE.g:1598:5: 'else' es= statOrImplicitBlock
                    {
                    match(input,77,FOLLOW_77_in_condExStat7427); if (state.failed) return retval;

                    pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat7439);
                    es=statOrImplicitBlock();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { elseStat = es; }

                    }
                    break;

            }


            match(input,78,FOLLOW_78_in_condExStat7451); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTConditionalExecutionStatement(((Token)retval.start), con, ts, elseStat); }

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
    // $ANTLR end "condExStat"


    public static class iterStat_return extends ParserRuleReturnScope {
        public ASTIterationStatement n;
    };


    // $ANTLR start "iterStat"
    // USE.g:1609:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final USEParser.iterStat_return iterStat() throws RecognitionException {
        USEParser.iterStat_return retval = new USEParser.iterStat_return();
        retval.start = input.LT(1);


        Token var=null;
        ASTExpression set =null;

        ASTStatement s =null;


        try {
            // USE.g:1610:3: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // USE.g:1611:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,83,FOLLOW_83_in_iterStat7476); if (state.failed) return retval;

            var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat7484); if (state.failed) return retval;

            match(input,87,FOLLOW_87_in_iterStat7488); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_iterStat7496);
            set=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,76,FOLLOW_76_in_iterStat7500); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_iterStat7508);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            match(input,78,FOLLOW_78_in_iterStat7513); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTIterationStatement(((Token)retval.start), (var!=null?var.getText():null), set, s); }

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
    // $ANTLR end "iterStat"


    public static class whileStat_return extends ParserRuleReturnScope {
        public ASTWhileStatement n;
    };


    // $ANTLR start "whileStat"
    // USE.g:1626:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final USEParser.whileStat_return whileStat() throws RecognitionException {
        USEParser.whileStat_return retval = new USEParser.whileStat_return();
        retval.start = input.LT(1);


        ASTExpression cond =null;

        ASTStatement s =null;


        try {
            // USE.g:1627:3: ( 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // USE.g:1628:3: 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,119,FOLLOW_119_in_whileStat7539); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_whileStat7547);
            cond=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,76,FOLLOW_76_in_whileStat7551); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_whileStat7559);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            match(input,78,FOLLOW_78_in_whileStat7564); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTWhileStatement(((Token)retval.start), cond, s); }

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
    // $ANTLR end "whileStat"


    public static class blockStat_return extends ParserRuleReturnScope {
        public ASTBlockStatement n;
    };


    // $ANTLR start "blockStat"
    // USE.g:1640:1: blockStat returns [ASTBlockStatement n] : 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' ;
    public final USEParser.blockStat_return blockStat() throws RecognitionException {
        USEParser.blockStat_return retval = new USEParser.blockStat_return();
        retval.start = input.LT(1);


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        USEParser.stat_return s =null;



          retval.n = new ASTBlockStatement(((Token)retval.start), org.tzi.use.config.Options.explicitVariableDeclarations);

        try {
            // USE.g:1644:2: ( 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' )
            // USE.g:1645:2: 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end'
            {
            match(input,66,FOLLOW_66_in_blockStat7594); if (state.failed) return retval;

            // USE.g:1646:2: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==72) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // USE.g:1646:4: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI
                    {
                    match(input,72,FOLLOW_72_in_blockStat7599); if (state.failed) return retval;

                    pushFollow(FOLLOW_variableDeclaration_in_blockStat7605);
                    vd=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}

                    // USE.g:1646:73: ( COMMA vd1= variableDeclaration )*
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( (LA139_0==COMMA) ) {
                            alt139=1;
                        }


                        switch (alt139) {
                    	case 1 :
                    	    // USE.g:1646:75: COMMA vd1= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_blockStat7611); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_variableDeclaration_in_blockStat7617);
                    	    vd1=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}

                    	    }
                    	    break;

                    	default :
                    	    break loop139;
                        }
                    } while (true);


                    match(input,SEMI,FOLLOW_SEMI_in_blockStat7624); if (state.failed) return retval;

                    }
                    break;

            }


            pushFollow(FOLLOW_stat_in_blockStat7634);
            s=stat();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n.setBody((s!=null?s.n:null)); }

            match(input,78,FOLLOW_78_in_blockStat7639); if (state.failed) return retval;

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
    // $ANTLR end "blockStat"


    public static class implicitBlockStat_return extends ParserRuleReturnScope {
        public ASTBlockStatement n;
    };


    // $ANTLR start "implicitBlockStat"
    // USE.g:1655:1: implicitBlockStat returns [ASTBlockStatement n] : 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat ;
    public final USEParser.implicitBlockStat_return implicitBlockStat() throws RecognitionException {
        USEParser.implicitBlockStat_return retval = new USEParser.implicitBlockStat_return();
        retval.start = input.LT(1);


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        USEParser.stat_return s =null;



          retval.n = new ASTBlockStatement(((Token)retval.start), false);

        try {
            // USE.g:1659:3: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat )
            // USE.g:1660:3: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat
            {
            match(input,72,FOLLOW_72_in_implicitBlockStat7665); if (state.failed) return retval;

            pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat7671);
            vd=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}

            // USE.g:1660:72: ( COMMA vd1= variableDeclaration )*
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==COMMA) ) {
                    alt141=1;
                }


                switch (alt141) {
            	case 1 :
            	    // USE.g:1660:74: COMMA vd1= variableDeclaration
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_implicitBlockStat7677); if (state.failed) return retval;

            	    pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat7683);
            	    vd1=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}

            	    }
            	    break;

            	default :
            	    break loop141;
                }
            } while (true);


            match(input,SEMI,FOLLOW_SEMI_in_implicitBlockStat7690); if (state.failed) return retval;

            pushFollow(FOLLOW_stat_in_implicitBlockStat7698);
            s=stat();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n.setBody((s!=null?s.n:null)); }

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
    // $ANTLR end "implicitBlockStat"



    // $ANTLR start "statOrImplicitBlock"
    // USE.g:1664:1: statOrImplicitBlock returns [ASTStatement n] : (s1= stat |s2= implicitBlockStat ) ;
    public final ASTStatement statOrImplicitBlock() throws RecognitionException {
        ASTStatement n = null;


        USEParser.stat_return s1 =null;

        USEParser.implicitBlockStat_return s2 =null;


        try {
            // USE.g:1665:3: ( (s1= stat |s2= implicitBlockStat ) )
            // USE.g:1666:3: (s1= stat |s2= implicitBlockStat )
            {
            // USE.g:1666:3: (s1= stat |s2= implicitBlockStat )
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==AT||LA142_0==HASH||(LA142_0 >= IDENT && LA142_0 <= INT)||(LA142_0 >= LPAREN && LA142_0 <= MINUS)||LA142_0==PLUS||LA142_0==REAL||LA142_0==SEMI||(LA142_0 >= STAR && LA142_0 <= STRING)||(LA142_0 >= 44 && LA142_0 <= 45)||LA142_0==48||(LA142_0 >= 51 && LA142_0 <= 52)||LA142_0==54||LA142_0==56||LA142_0==66||(LA142_0 >= 73 && LA142_0 <= 74)||(LA142_0 >= 77 && LA142_0 <= 78)||(LA142_0 >= 82 && LA142_0 <= 83)||LA142_0==85||LA142_0==88||(LA142_0 >= 91 && LA142_0 <= 92)||(LA142_0 >= 94 && LA142_0 <= 102)||(LA142_0 >= 111 && LA142_0 <= 112)||(LA142_0 >= 118 && LA142_0 <= 119)) ) {
                alt142=1;
            }
            else if ( (LA142_0==72) ) {
                alt142=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;

            }
            switch (alt142) {
                case 1 :
                    // USE.g:1666:4: s1= stat
                    {
                    pushFollow(FOLLOW_stat_in_statOrImplicitBlock7721);
                    s1=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s1!=null?s1.n:null); }

                    }
                    break;
                case 2 :
                    // USE.g:1666:31: s2= implicitBlockStat
                    {
                    pushFollow(FOLLOW_implicitBlockStat_in_statOrImplicitBlock7731);
                    s2=implicitBlockStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s2!=null?s2.n:null); }

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
    // $ANTLR end "statOrImplicitBlock"



    // $ANTLR start "nothing"
    // USE.g:1680:1: nothing :;
    public final void nothing() throws RecognitionException {
        try {
            // USE.g:1681:1: ()
            // USE.g:1682:1: 
            {
            }

        }
        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "nothing"



    // $ANTLR start "rValue"
    // USE.g:1688:1: rValue returns [ASTRValue n] : (e= inSoilExpression |oc= objCreateStat );
    public final ASTRValue rValue() throws RecognitionException {
        ASTRValue n = null;


        ASTExpression e =null;

        USEParser.objCreateStat_return oc =null;


        try {
            // USE.g:1689:5: (e= inSoilExpression |oc= objCreateStat )
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==AT||LA143_0==HASH||(LA143_0 >= IDENT && LA143_0 <= INT)||(LA143_0 >= LPAREN && LA143_0 <= MINUS)||LA143_0==PLUS||LA143_0==REAL||(LA143_0 >= STAR && LA143_0 <= STRING)||(LA143_0 >= 44 && LA143_0 <= 45)||LA143_0==48||(LA143_0 >= 51 && LA143_0 <= 52)||LA143_0==54||LA143_0==56||LA143_0==82||LA143_0==85||(LA143_0 >= 91 && LA143_0 <= 92)||(LA143_0 >= 95 && LA143_0 <= 102)||(LA143_0 >= 111 && LA143_0 <= 112)||LA143_0==118) ) {
                alt143=1;
            }
            else if ( (LA143_0==94) ) {
                alt143=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;

            }
            switch (alt143) {
                case 1 :
                    // USE.g:1690:5: e= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_rValue7777);
                    e=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRValueExpressionOrOpCall(e); }

                    }
                    break;
                case 2 :
                    // USE.g:1691:5: oc= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_rValue7789);
                    oc=objCreateStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { 
                        if ((oc!=null?oc.n:null) instanceof ASTNewLinkObjectStatement)
                        	n = new ASTRValueNewLinkObject((ASTNewLinkObjectStatement)(oc!=null?oc.n:null));
                        else
                        	n = new ASTRValueNewObject((ASTNewObjectStatement)(oc!=null?oc.n:null));
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
    // $ANTLR end "rValue"



    // $ANTLR start "rValList"
    // USE.g:1704:1: rValList returns [List<ASTRValue> n] : ( nothing |rl= rValListMin1 );
    public final List<ASTRValue> rValList() throws RecognitionException {
        List<ASTRValue> n = null;


        List<ASTRValue> rl =null;


        try {
            // USE.g:1705:3: ( nothing |rl= rValListMin1 )
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==RBRACE) ) {
                alt144=1;
            }
            else if ( (LA144_0==AT||LA144_0==HASH||(LA144_0 >= IDENT && LA144_0 <= INT)||(LA144_0 >= LPAREN && LA144_0 <= MINUS)||LA144_0==PLUS||LA144_0==REAL||(LA144_0 >= STAR && LA144_0 <= STRING)||(LA144_0 >= 44 && LA144_0 <= 45)||LA144_0==48||(LA144_0 >= 51 && LA144_0 <= 52)||LA144_0==54||LA144_0==56||LA144_0==82||LA144_0==85||(LA144_0 >= 91 && LA144_0 <= 92)||(LA144_0 >= 94 && LA144_0 <= 102)||(LA144_0 >= 111 && LA144_0 <= 112)||LA144_0==118) ) {
                alt144=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 144, 0, input);

                throw nvae;

            }
            switch (alt144) {
                case 1 :
                    // USE.g:1706:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_rValList7812);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = Collections.<ASTRValue>emptyList(); }

                    }
                    break;
                case 2 :
                    // USE.g:1709:3: rl= rValListMin1
                    {
                    pushFollow(FOLLOW_rValListMin1_in_rValList7839);
                    rl=rValListMin1();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = rl; }

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
    // $ANTLR end "rValList"



    // $ANTLR start "rValListMin1"
    // USE.g:1717:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin1() throws RecognitionException {
        List<ASTRValue> n = null;


        ASTRValue r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // USE.g:1721:3: (r= rValue ( COMMA r= rValue )* )
            // USE.g:1722:3: r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin17872);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            // USE.g:1724:3: ( COMMA r= rValue )*
            loop145:
            do {
                int alt145=2;
                int LA145_0 = input.LA(1);

                if ( (LA145_0==COMMA) ) {
                    alt145=1;
                }


                switch (alt145) {
            	case 1 :
            	    // USE.g:1725:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin17886); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin17896);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add(r); }

            	    }
            	    break;

            	default :
            	    break loop145;
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
    // $ANTLR end "rValListMin1"



    // $ANTLR start "rValListMin2"
    // USE.g:1735:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin2() throws RecognitionException {
        List<ASTRValue> n = null;


        ASTRValue r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // USE.g:1739:3: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
            // USE.g:1740:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin27935);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin27943); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_rValListMin27951);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            // USE.g:1745:3: ( COMMA r= rValue )*
            loop146:
            do {
                int alt146=2;
                int LA146_0 = input.LA(1);

                if ( (LA146_0==COMMA) ) {
                    alt146=1;
                }


                switch (alt146) {
            	case 1 :
            	    // USE.g:1746:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin27965); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin27975);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add(r); }

            	    }
            	    break;

            	default :
            	    break loop146;
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
    // $ANTLR end "rValListMin2"



    // $ANTLR start "inSoilExpression"
    // USE.g:1756:1: inSoilExpression returns [ASTExpression n] : e= expression ;
    public final ASTExpression inSoilExpression() throws RecognitionException {
        ASTExpression n = null;


        USEParser.expression_return e =null;


        try {
            // USE.g:1757:3: (e= expression )
            // USE.g:1758:3: e= expression
            {
            pushFollow(FOLLOW_expression_in_inSoilExpression8009);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if ((e!=null?e.n:null) != null) (e!=null?e.n:null).setStringRep((e!=null?input.toString(e.start,e.stop):null)); }

            if ( state.backtracking==0 ) { n = (e!=null?e.n:null); }

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
    // $ANTLR end "inSoilExpression"



    // $ANTLR start "exprList"
    // USE.g:1767:1: exprList returns [List<ASTExpression> n] : ( nothing |el= exprListMin1 );
    public final List<ASTExpression> exprList() throws RecognitionException {
        List<ASTExpression> n = null;


        List<ASTExpression> el =null;


        try {
            // USE.g:1768:3: ( nothing |el= exprListMin1 )
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==EOF) ) {
                alt147=1;
            }
            else if ( (LA147_0==AT||LA147_0==HASH||(LA147_0 >= IDENT && LA147_0 <= INT)||(LA147_0 >= LPAREN && LA147_0 <= MINUS)||LA147_0==PLUS||LA147_0==REAL||(LA147_0 >= STAR && LA147_0 <= STRING)||(LA147_0 >= 44 && LA147_0 <= 45)||LA147_0==48||(LA147_0 >= 51 && LA147_0 <= 52)||LA147_0==54||LA147_0==56||LA147_0==82||LA147_0==85||(LA147_0 >= 91 && LA147_0 <= 92)||(LA147_0 >= 95 && LA147_0 <= 102)||(LA147_0 >= 111 && LA147_0 <= 112)||LA147_0==118) ) {
                alt147=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                throw nvae;

            }
            switch (alt147) {
                case 1 :
                    // USE.g:1769:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_exprList8038);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<ASTExpression>(); }

                    }
                    break;
                case 2 :
                    // USE.g:1772:3: el= exprListMin1
                    {
                    pushFollow(FOLLOW_exprListMin1_in_exprList8056);
                    el=exprListMin1();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = el; }

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
    // $ANTLR end "exprList"



    // $ANTLR start "exprListMin1"
    // USE.g:1780:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin1() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // USE.g:1784:3: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // USE.g:1785:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin18089);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // USE.g:1787:3: ( COMMA e= inSoilExpression )*
            loop148:
            do {
                int alt148=2;
                int LA148_0 = input.LA(1);

                if ( (LA148_0==COMMA) ) {
                    alt148=1;
                }


                switch (alt148) {
            	case 1 :
            	    // USE.g:1788:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin18104); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin18114);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            	    }
            	    break;

            	default :
            	    break loop148;
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
    // $ANTLR end "exprListMin1"



    // $ANTLR start "exprListMin2"
    // USE.g:1798:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin2() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // USE.g:1802:3: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // USE.g:1803:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin28154);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            match(input,COMMA,FOLLOW_COMMA_in_exprListMin28162); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_exprListMin28170);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // USE.g:1808:3: ( COMMA e= inSoilExpression )*
            loop149:
            do {
                int alt149=2;
                int LA149_0 = input.LA(1);

                if ( (LA149_0==COMMA) ) {
                    alt149=1;
                }


                switch (alt149) {
            	case 1 :
            	    // USE.g:1809:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin28184); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin28194);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            	    }
            	    break;

            	default :
            	    break loop149;
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
    // $ANTLR end "exprListMin2"



    // $ANTLR start "identList"
    // USE.g:1819:1: identList returns [List<String> n] : ( nothing |il= identListMin1 );
    public final List<String> identList() throws RecognitionException {
        List<String> n = null;


        List<String> il =null;


        try {
            // USE.g:1820:3: ( nothing |il= identListMin1 )
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==EOF||LA150_0==RBRACE||LA150_0==SEMI||(LA150_0 >= 77 && LA150_0 <= 78)) ) {
                alt150=1;
            }
            else if ( (LA150_0==IDENT) ) {
                alt150=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 150, 0, input);

                throw nvae;

            }
            switch (alt150) {
                case 1 :
                    // USE.g:1821:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_identList8224);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<String>(); }

                    }
                    break;
                case 2 :
                    // USE.g:1824:3: il= identListMin1
                    {
                    pushFollow(FOLLOW_identListMin1_in_identList8241);
                    il=identListMin1();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = il; }

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
    // $ANTLR end "identList"



    // $ANTLR start "identListMin1"
    // USE.g:1832:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
    public final List<String> identListMin1() throws RecognitionException {
        List<String> n = null;


        Token id=null;


          n = new ArrayList<String>();

        try {
            // USE.g:1836:3: (id= IDENT ( COMMA id= IDENT )* )
            // USE.g:1837:3: id= IDENT ( COMMA id= IDENT )*
            {
            id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin18275); if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((id!=null?id.getText():null)); }

            // USE.g:1839:3: ( COMMA id= IDENT )*
            loop151:
            do {
                int alt151=2;
                int LA151_0 = input.LA(1);

                if ( (LA151_0==COMMA) ) {
                    alt151=1;
                }


                switch (alt151) {
            	case 1 :
            	    // USE.g:1840:5: COMMA id= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identListMin18289); if (state.failed) return n;

            	    id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin18299); if (state.failed) return n;

            	    if ( state.backtracking==0 ) {
            	        n.add((id!=null?id.getText():null)); }

            	    }
            	    break;

            	default :
            	    break loop151;
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
    // $ANTLR end "identListMin1"

    // $ANTLR start synpred1_USE
    public final void synpred1_USE_fragment() throws RecognitionException {
        // USE.g:1238:7: ( COLON type EQUAL )
        // USE.g:1238:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred1_USE6025); if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred1_USE6027);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_USE6029); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_USE

    // $ANTLR start synpred2_USE
    public final void synpred2_USE_fragment() throws RecognitionException {
        // USE.g:1389:5: ( statStartingWithExpr )
        // USE.g:1389:6: statStartingWithExpr
        {
        pushFollow(FOLLOW_statStartingWithExpr_in_synpred2_USE6577);
        statStartingWithExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_USE

    // Delegated rules

    public final boolean synpred2_USE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_USE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_USE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_USE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA1 dfa1 = new DFA1(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA64 dfa64 = new DFA64(this);
    static final String DFA2_eotS =
        "\46\uffff";
    static final String DFA2_eofS =
        "\1\1\45\uffff";
    static final String DFA2_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\23\3\uffff\1\25\3\15\1\27\1\12\1\35"+
        "\1\24\1\5\1\uffff\1\15\1\23\1\5\5\23\1\35\1\15\2\23\1\13\1\12\1"+
        "\35\2\27\1\56\1\12\1\23";
    static final String DFA2_maxS =
        "\1\155\1\uffff\1\67\1\uffff\1\23\3\uffff\1\31\3\15\1\161\1\44\1"+
        "\35\1\101\1\65\1\uffff\1\15\1\23\1\120\5\23\1\35\1\15\2\23\1\13"+
        "\1\44\1\35\2\161\1\67\1\44\1\23";
    static final String DFA2_acceptS =
        "\1\uffff\1\6\1\uffff\1\1\1\uffff\1\3\1\4\1\5\11\uffff\1\2\24\uffff";
    static final String DFA2_specialS =
        "\46\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\15\uffff\1\4\47\uffff\1\3\2\uffff\2\3\5\uffff\1\5\12\uffff"+
            "\1\6\34\uffff\1\7",
            "",
            "\1\10\32\uffff\1\11\3\uffff\1\12\4\uffff\1\13",
            "",
            "\1\14",
            "",
            "",
            "",
            "\1\3\3\uffff\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\3\50\uffff\1\3\2\uffff\1\21\1\uffff\1\3\10\uffff\1\3\30"+
            "\uffff\1\3\11\uffff\1\3",
            "\1\23\10\uffff\1\22\20\uffff\1\24",
            "\1\25",
            "\1\27\54\uffff\1\26",
            "\1\31\51\uffff\1\30\5\uffff\1\30",
            "",
            "\1\32",
            "\1\33",
            "\1\2\15\uffff\1\34\47\uffff\1\3\2\uffff\2\3\20\uffff\1\6",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\23\31\uffff\1\24",
            "\1\44",
            "\1\3\50\uffff\1\3\2\uffff\1\21\1\uffff\1\3\10\uffff\1\3\30"+
            "\uffff\1\3\11\uffff\1\3",
            "\1\3\50\uffff\1\3\2\uffff\1\21\1\uffff\1\3\10\uffff\1\3\30"+
            "\uffff\1\3\11\uffff\1\3",
            "\1\45\3\uffff\1\45\4\uffff\1\45",
            "\1\23\31\uffff\1\24",
            "\1\35"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 135:5: ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition | query )*";
        }
    }
    static final String DFA1_eotS =
        "\30\uffff";
    static final String DFA1_eofS =
        "\1\1\4\uffff\1\10\22\uffff";
    static final String DFA1_minS =
        "\1\5\1\uffff\2\23\1\25\1\5\1\41\2\uffff\3\15\1\23\1\35\1\24\1\5"+
        "\4\41\1\23\1\13\1\56\1\41";
    static final String DFA1_maxS =
        "\1\155\1\uffff\1\67\1\23\1\31\1\155\1\67\2\uffff\3\15\1\106\1\35"+
        "\1\101\1\65\4\67\1\23\1\13\2\67";
    static final String DFA1_acceptS =
        "\1\uffff\1\3\5\uffff\1\2\1\1\17\uffff";
    static final String DFA1_specialS =
        "\30\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\15\uffff\1\1\47\uffff\1\1\2\uffff\2\1\5\uffff\1\1\1\3\11"+
            "\uffff\1\1\34\uffff\1\1",
            "",
            "\1\4\32\uffff\1\1\3\uffff\1\1\4\uffff\1\1",
            "\1\5",
            "\1\6\3\uffff\1\1",
            "\1\10\1\uffff\1\10\1\7\1\uffff\1\10\10\uffff\1\10\47\uffff"+
            "\1\10\2\uffff\2\10\5\uffff\2\10\11\uffff\2\10\10\uffff\1\10"+
            "\22\uffff\1\10",
            "\1\14\14\uffff\1\11\3\uffff\1\12\4\uffff\1\13",
            "",
            "",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\1\62\uffff\1\10",
            "\1\20",
            "\1\22\54\uffff\1\21",
            "\1\24\51\uffff\1\23\5\uffff\1\23",
            "\1\14\14\uffff\1\11\3\uffff\1\12\4\uffff\1\13",
            "\1\14\14\uffff\1\11\3\uffff\1\12\4\uffff\1\13",
            "\1\14\14\uffff\1\11\3\uffff\1\12\4\uffff\1\13",
            "\1\14\14\uffff\1\11\3\uffff\1\12\4\uffff\1\13",
            "\1\25",
            "\1\26",
            "\1\27\3\uffff\1\27\4\uffff\1\27",
            "\1\14\14\uffff\1\11\3\uffff\1\12\4\uffff\1\13"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()* loopback of 138:11: (cons= invariant |ppc= prePost )*";
        }
    }
    static final String DFA34_eotS =
        "\16\uffff";
    static final String DFA34_eofS =
        "\16\uffff";
    static final String DFA34_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\31\1\12\1\15\1\23\1\5\1\35\1\15\1\12"+
        "\1\35\1\12";
    static final String DFA34_maxS =
        "\1\161\1\uffff\1\23\1\uffff\1\31\1\44\1\15\1\23\1\153\1\35\1\15"+
        "\1\44\1\35\1\44";
    static final String DFA34_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\12\uffff";
    static final String DFA34_specialS =
        "\16\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\2\15\uffff\1\1\21\uffff\1\1\37\uffff\1\1\10\uffff\1\1\33"+
            "\uffff\2\3\5\uffff\1\1",
            "",
            "\1\4",
            "",
            "\1\5",
            "\1\7\10\uffff\1\6\20\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\2\15\uffff\1\1\126\uffff\2\3",
            "\1\13",
            "\1\14",
            "\1\7\31\uffff\1\10",
            "\1\15",
            "\1\7\31\uffff\1\10"
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "()* loopback of 322:5: (ppc= prePostClause )*";
        }
    }
    static final String DFA58_eotS =
        "\36\uffff";
    static final String DFA58_eofS =
        "\1\1\35\uffff";
    static final String DFA58_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\25\3\15\1\12\1\35\1\24\1\5\1\15\1\23"+
        "\5\5\1\23\1\35\1\15\1\23\1\13\1\12\1\35\1\25\1\56\1\12\1\5";
    static final String DFA58_maxS =
        "\1\155\1\uffff\1\67\1\uffff\1\31\3\15\1\44\1\35\1\101\1\65\1\15"+
        "\1\23\5\132\1\23\1\35\1\15\1\67\1\13\1\44\1\35\1\31\1\67\1\44\1"+
        "\132";
    static final String DFA58_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\32\uffff";
    static final String DFA58_specialS =
        "\36\uffff}>";
    static final String[] DFA58_transitionS = {
            "\1\2\15\uffff\1\1\47\uffff\1\1\2\uffff\2\1\5\uffff\2\1\11\uffff"+
            "\1\1\1\3\10\uffff\1\3\22\uffff\1\1",
            "",
            "\1\4\32\uffff\1\5\3\uffff\1\6\4\uffff\1\7",
            "",
            "\1\1\3\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\15\10\uffff\1\14\20\uffff\1\16",
            "\1\17",
            "\1\21\54\uffff\1\20",
            "\1\23\51\uffff\1\22\5\uffff\1\22",
            "\1\24",
            "\1\25",
            "\1\26\15\uffff\1\1\47\uffff\1\1\2\uffff\2\1\20\uffff\1\1\11"+
            "\uffff\1\3",
            "\1\3\15\uffff\1\1\106\uffff\1\3",
            "\1\3\15\uffff\1\1\106\uffff\1\3",
            "\1\3\15\uffff\1\1\106\uffff\1\3",
            "\1\3\15\uffff\1\1\106\uffff\1\3",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32\32\uffff\1\1\3\uffff\1\1\4\uffff\1\1",
            "\1\33",
            "\1\15\31\uffff\1\16",
            "\1\34",
            "\1\1\3\uffff\1\10",
            "\1\35\3\uffff\1\35\4\uffff\1\35",
            "\1\15\31\uffff\1\16",
            "\1\3\15\uffff\1\1\106\uffff\1\3"
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "()* loopback of 502:5: (inv= invariantClause )*";
        }
    }
    static final String DFA64_eotS =
        "\20\uffff";
    static final String DFA64_eofS =
        "\1\1\17\uffff";
    static final String DFA64_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\25\1\12\1\15\1\23\1\5\1\35\1\15\1\23"+
        "\1\12\1\35\1\25\1\12";
    static final String DFA64_maxS =
        "\1\155\1\uffff\1\67\1\uffff\1\31\1\44\1\15\1\23\1\153\1\35\1\15"+
        "\1\67\1\44\1\35\1\31\1\44";
    static final String DFA64_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\14\uffff";
    static final String DFA64_specialS =
        "\20\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\2\15\uffff\1\1\47\uffff\1\1\2\uffff\2\1\5\uffff\2\1\11\uffff"+
            "\1\1\31\uffff\2\3\1\uffff\1\1",
            "",
            "\1\4\32\uffff\1\1\3\uffff\1\1\4\uffff\1\1",
            "",
            "\1\1\3\uffff\1\5",
            "\1\7\10\uffff\1\6\20\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\13\15\uffff\1\1\47\uffff\1\1\2\uffff\2\1\20\uffff\1\1\31"+
            "\uffff\2\3",
            "\1\14",
            "\1\15",
            "\1\16\32\uffff\1\1\3\uffff\1\1\4\uffff\1\1",
            "\1\7\31\uffff\1\10",
            "\1\17",
            "\1\1\3\uffff\1\5",
            "\1\7\31\uffff\1\10"
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "()+ loopback of 531:5: (ppc= prePostClause )+";
        }
    }
 

    public static final BitSet FOLLOW_annotationSet_in_model71 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_model77 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_model81 = new BitSet(new long[]{0xC800000000080020L,0x0000200000010020L});
    public static final BitSet FOLLOW_generalClassifierDefinition_in_model93 = new BitSet(new long[]{0xC800000000080020L,0x0000200000010020L});
    public static final BitSet FOLLOW_associationDefinition_in_model106 = new BitSet(new long[]{0xC800000000080020L,0x0000200000010020L});
    public static final BitSet FOLLOW_69_in_model120 = new BitSet(new long[]{0xC800000000080020L,0x0000200000010060L});
    public static final BitSet FOLLOW_invariant_in_model138 = new BitSet(new long[]{0xC800000000080020L,0x0000200000010060L});
    public static final BitSet FOLLOW_prePost_in_model159 = new BitSet(new long[]{0xC800000000080020L,0x0000200000010060L});
    public static final BitSet FOLLOW_enumTypeDefinition_in_model199 = new BitSet(new long[]{0xC800000000080020L,0x0000200000010020L});
    public static final BitSet FOLLOW_query_in_model211 = new BitSet(new long[]{0xC800000000080020L,0x0000200000010020L});
    public static final BitSet FOLLOW_EOF_in_model224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_enumTypeDefinition252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_enumTypeDefinition258 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_enumTypeDefinition262 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_enumTypeDefinition264 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_enumTypeDefinition268 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_enumTypeDefinition270 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_enumTypeDefinition274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_generalClassifierDefinition312 = new BitSet(new long[]{0xC800000000080020L});
    public static final BitSet FOLLOW_59_in_generalClassifierDefinition320 = new BitSet(new long[]{0xC000000000080020L});
    public static final BitSet FOLLOW_classDefinition_in_generalClassifierDefinition348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_associationClassDefinition_in_generalClassifierDefinition386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signalDefinition_in_generalClassifierDefinition431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_annotation_in_classDefinition485 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_line_annotation_in_classDefinition491 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyClass_in_classDefinition501 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_classDefinition505 = new BitSet(new long[]{0x0000000000800000L,0x0002008000004021L});
    public static final BitSet FOLLOW_LESS_in_classDefinition515 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_classDefinition519 = new BitSet(new long[]{0x0000000000000000L,0x0002008000004021L});
    public static final BitSet FOLLOW_64_in_classDefinition532 = new BitSet(new long[]{0x0000000000080020L,0x0002008000004020L});
    public static final BitSet FOLLOW_attributeDefinition_in_classDefinition545 = new BitSet(new long[]{0x0000000000080020L,0x0002008000004020L});
    public static final BitSet FOLLOW_103_in_classDefinition566 = new BitSet(new long[]{0x0000000000080020L,0x0002000000004020L});
    public static final BitSet FOLLOW_operationDefinition_in_classDefinition579 = new BitSet(new long[]{0x0000000000080020L,0x0002000000004020L});
    public static final BitSet FOLLOW_69_in_classDefinition600 = new BitSet(new long[]{0x0000000000000020L,0x0002000004024000L});
    public static final BitSet FOLLOW_invariantClause_in_classDefinition620 = new BitSet(new long[]{0x0000000000000020L,0x0002000004024000L});
    public static final BitSet FOLLOW_113_in_classDefinition646 = new BitSet(new long[]{0x0000000000000000L,0x0000100000004000L});
    public static final BitSet FOLLOW_stateMachine_in_classDefinition666 = new BitSet(new long[]{0x0000000000000000L,0x0000100000004000L});
    public static final BitSet FOLLOW_78_in_classDefinition690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_associationClassDefinition723 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationClassDefinition749 = new BitSet(new long[]{0x0000000000880000L,0x0002008000004029L});
    public static final BitSet FOLLOW_LESS_in_associationClassDefinition759 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_associationClassDefinition763 = new BitSet(new long[]{0x0000000000080000L,0x0002008000004029L});
    public static final BitSet FOLLOW_67_in_associationClassDefinition775 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition783 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition795 = new BitSet(new long[]{0x0000000000080020L,0x0002008000004021L});
    public static final BitSet FOLLOW_64_in_associationClassDefinition815 = new BitSet(new long[]{0x0000000000080020L,0x0002008000004020L});
    public static final BitSet FOLLOW_attributeDefinition_in_associationClassDefinition828 = new BitSet(new long[]{0x0000000000080020L,0x0002008000004020L});
    public static final BitSet FOLLOW_103_in_associationClassDefinition849 = new BitSet(new long[]{0x0000000000080020L,0x0002000000004020L});
    public static final BitSet FOLLOW_operationDefinition_in_associationClassDefinition862 = new BitSet(new long[]{0x0000000000080020L,0x0002000000004020L});
    public static final BitSet FOLLOW_69_in_associationClassDefinition883 = new BitSet(new long[]{0x0000000000080020L,0x0002000004024000L});
    public static final BitSet FOLLOW_invariantClause_in_associationClassDefinition903 = new BitSet(new long[]{0x0000000000080020L,0x0002000004024000L});
    public static final BitSet FOLLOW_113_in_associationClassDefinition929 = new BitSet(new long[]{0x0000000000080000L,0x0000100000004000L});
    public static final BitSet FOLLOW_stateMachine_in_associationClassDefinition949 = new BitSet(new long[]{0x0000000000080000L,0x0000100000004000L});
    public static final BitSet FOLLOW_keyAggregation_in_associationClassDefinition990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_keyComposition_in_associationClassDefinition994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_associationClassDefinition1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_attributeDefinition1045 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attributeDefinition1053 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_attributeDefinition1055 = new BitSet(new long[]{0x0059300000080000L});
    public static final BitSet FOLLOW_type_in_attributeDefinition1059 = new BitSet(new long[]{0x0000002000080002L});
    public static final BitSet FOLLOW_keyDerive_in_attributeDefinition1083 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_keyDerived_in_attributeDefinition1085 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_set_in_attributeDefinition1088 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_attributeDefinition1098 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_keyInit_in_attributeDefinition1118 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_set_in_attributeDefinition1122 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_attributeDefinition1134 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_attributeDefinition1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_operationDefinition1179 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_operationDefinition1189 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_paramList_in_operationDefinition1199 = new BitSet(new long[]{0x00000020000020A2L,0x00000C0000000004L});
    public static final BitSet FOLLOW_COLON_in_operationDefinition1213 = new BitSet(new long[]{0x0059300000080000L});
    public static final BitSet FOLLOW_type_in_operationDefinition1219 = new BitSet(new long[]{0x0000002000002022L,0x00000C0000000004L});
    public static final BitSet FOLLOW_EQUAL_in_operationDefinition1247 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_operationDefinition1253 = new BitSet(new long[]{0x0000002000000022L,0x00000C0000000000L});
    public static final BitSet FOLLOW_blockStat_in_operationDefinition1275 = new BitSet(new long[]{0x0000002000000022L,0x00000C0000000000L});
    public static final BitSet FOLLOW_prePostClause_in_operationDefinition1297 = new BitSet(new long[]{0x0000002000000022L,0x00000C0000000000L});
    public static final BitSet FOLLOW_SEMI_in_operationDefinition1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_associationDefinition1341 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_line_annotation_in_associationDefinition1347 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyAssociation_in_associationDefinition1364 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyAggregation_in_associationDefinition1368 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyComposition_in_associationDefinition1372 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationDefinition1382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_associationDefinition1390 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationDefinition1398 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationDefinition1410 = new BitSet(new long[]{0x0000000000080020L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_associationDefinition1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_associationEnd1446 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd1454 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LBRACK_in_associationEnd1456 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_multiplicity_in_associationEnd1460 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_associationEnd1462 = new BitSet(new long[]{0x0000002000080002L,0x0008420000000000L});
    public static final BitSet FOLLOW_keyRole_in_associationEnd1473 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd1477 = new BitSet(new long[]{0x0000002000080002L,0x0008420000000000L});
    public static final BitSet FOLLOW_105_in_associationEnd1498 = new BitSet(new long[]{0x0000002000080002L,0x0008420000000000L});
    public static final BitSet FOLLOW_115_in_associationEnd1510 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd1514 = new BitSet(new long[]{0x0000002000080002L,0x0008420000000000L});
    public static final BitSet FOLLOW_keyUnion_in_associationEnd1526 = new BitSet(new long[]{0x0000002000080002L,0x0008420000000000L});
    public static final BitSet FOLLOW_110_in_associationEnd1538 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd1542 = new BitSet(new long[]{0x0000002000080002L,0x0008420000000000L});
    public static final BitSet FOLLOW_keyDerived_in_associationEnd1555 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_keyDerive_in_associationEnd1557 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_LPAREN_in_associationEnd1562 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_associationEnd1568 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_associationEnd1570 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_associationEnd1574 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_associationEnd1578 = new BitSet(new long[]{0x0000002000080002L,0x0008420000000000L});
    public static final BitSet FOLLOW_keyQualifier_in_associationEnd1590 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_paramList_in_associationEnd1596 = new BitSet(new long[]{0x0000002000080002L,0x0008420000000000L});
    public static final BitSet FOLLOW_SEMI_in_associationEnd1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicityRange_in_multiplicity1648 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_multiplicity1658 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_multiplicityRange_in_multiplicity1662 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange1691 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_multiplicityRange1701 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_multiplicitySpec1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicitySpec1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_annotation_in_annotationSpec1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_annotation_in_annotationSpec1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_block_annotation1808 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_block_annotation1810 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_block_annotation1812 = new BitSet(new long[]{0x0084400200000000L});
    public static final BitSet FOLLOW_annotation_tag_in_block_annotation1817 = new BitSet(new long[]{0x0084400200000000L});
    public static final BitSet FOLLOW_RBRACE_in_block_annotation1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_line_annotation1844 = new BitSet(new long[]{0x0084400000000000L});
    public static final BitSet FOLLOW_annotation_tag_in_line_annotation1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_comment_in_annotation_tag1863 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotation_tag1865 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_NON_OCL_STRING_in_annotation_tag1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_weight_in_annotation_tag1876 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotation_tag1878 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_def_in_annotation_tag1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_annotation_tag1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_type_in_annotation_tag1895 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotation_tag1897 = new BitSet(new long[]{0x0020800000000020L});
    public static final BitSet FOLLOW_annotation_enum_type_in_annotation_tag1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_ref_in_annotation_tag1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_annotation_comment1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_annotation_weight1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_annotation_type1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_annotation_override1955 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_annotation_override1957 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_annotation_override1959 = new BitSet(new long[]{0x0084400000000000L});
    public static final BitSet FOLLOW_annotation_term_in_annotation_override1961 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_annotation_override1963 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_annotation_override1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_tag_in_annotation_term1982 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_annotation_term1986 = new BitSet(new long[]{0x0084400000000000L});
    public static final BitSet FOLLOW_annotation_tag_in_annotation_term1988 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_AT_in_annotation_ref2000 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_annotation_ref2002 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_annotation_ref2004 = new BitSet(new long[]{0x0084400000000000L});
    public static final BitSet FOLLOW_annotation_predefined_in_annotation_ref2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_annotation_def2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_query2039 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_queryExpr_in_query2041 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_queryCOND_in_query2044 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_query2046 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_queryVariable_in_queryExpr2059 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_queryExpr2063 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_queryVariable_in_queryExpr2065 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_queryVariable2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_annotation_in_invariant2121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_invariant2132 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_invariant2142 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_COMMA_in_invariant2154 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_invariant2158 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_COLON_in_invariant2166 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_invariant2178 = new BitSet(new long[]{0x0000000000000022L,0x0000000004020000L});
    public static final BitSet FOLLOW_invariantClause_in_invariant2190 = new BitSet(new long[]{0x0000000000000022L,0x0000000004020000L});
    public static final BitSet FOLLOW_line_annotation_in_invariantClause2222 = new BitSet(new long[]{0x0000000000000020L,0x0000000004000000L});
    public static final BitSet FOLLOW_annotationSet_in_invariantClause2232 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_invariantClause2239 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_IDENT_in_invariantClause2245 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_invariantClause2250 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_invariantClause2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_invariantClause2271 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_invariantClause2273 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_IDENT_in_invariantClause2279 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_invariantClause2284 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_invariantClause2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_prePost2321 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_prePost2325 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_prePost2327 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_prePost2331 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_paramList_in_prePost2335 = new BitSet(new long[]{0x00000000000000A0L,0x00000C0000000000L});
    public static final BitSet FOLLOW_COLON_in_prePost2339 = new BitSet(new long[]{0x0059300000080000L});
    public static final BitSet FOLLOW_type_in_prePost2343 = new BitSet(new long[]{0x0000000000000020L,0x00000C0000000000L});
    public static final BitSet FOLLOW_prePostClause_in_prePost2362 = new BitSet(new long[]{0x0000000000000022L,0x00000C0000000000L});
    public static final BitSet FOLLOW_annotationSet_in_prePostClause2396 = new BitSet(new long[]{0x0000000000000000L,0x00000C0000000000L});
    public static final BitSet FOLLOW_set_in_prePostClause2408 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_IDENT_in_prePostClause2423 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_prePostClause2428 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_prePostClause2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_annotationSet2459 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_annotation2478 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_annotation2482 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_annotation2488 = new BitSet(new long[]{0x0000001000080400L});
    public static final BitSet FOLLOW_annotationValues_in_annotation2497 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_annotation2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationValue_in_annotationValues2525 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_annotationValues2533 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_annotationValue_in_annotationValues2537 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_annotationValue2556 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotationValue2561 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_NON_OCL_STRING_in_annotationValue2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_stateMachine2597 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_stateMachine2630 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_stateMachine2643 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_stateDefinition_in_stateMachine2659 = new BitSet(new long[]{0x0000000000080000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_stateMachine2669 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_transitionDefinition_in_stateMachine2685 = new BitSet(new long[]{0x0000000000080000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_stateMachine2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_stateDefinition2711 = new BitSet(new long[]{0x0000000000400082L});
    public static final BitSet FOLLOW_COLON_in_stateDefinition2719 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_stateDefinition2723 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_LBRACK_in_stateDefinition2734 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_stateDefinition2740 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_stateDefinition2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_transitionDefinition2763 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ARROW_in_transitionDefinition2765 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_transitionDefinition2769 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_LBRACE_in_transitionDefinition2779 = new BitSet(new long[]{0x0000000000480000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LBRACK_in_transitionDefinition2789 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_transitionDefinition2793 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_transitionDefinition2797 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000080L});
    public static final BitSet FOLLOW_event_in_transitionDefinition2821 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_IDENT_in_transitionDefinition2837 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_transitionDefinition2841 = new BitSet(new long[]{0x0000001002000000L});
    public static final BitSet FOLLOW_paramList_in_transitionDefinition2846 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_transitionDefinition2853 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_LBRACK_in_transitionDefinition2870 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_transitionDefinition2874 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_transitionDefinition2878 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_transitionDefinition2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_event2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keySignal_in_signalDefinition2928 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_signalDefinition2932 = new BitSet(new long[]{0x0000000000800000L,0x0000000000004021L});
    public static final BitSet FOLLOW_LESS_in_signalDefinition2947 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_signalDefinition2951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004021L});
    public static final BitSet FOLLOW_64_in_signalDefinition2964 = new BitSet(new long[]{0x0000000000080020L,0x0000000000004020L});
    public static final BitSet FOLLOW_attributeDefinition_in_signalDefinition2977 = new BitSet(new long[]{0x0000000000080020L,0x0000000000004020L});
    public static final BitSet FOLLOW_69_in_signalDefinition2998 = new BitSet(new long[]{0x0000000000000020L,0x0000000004024000L});
    public static final BitSet FOLLOW_invariantClause_in_signalDefinition3018 = new BitSet(new long[]{0x0000000000000020L,0x0000000004024000L});
    public static final BitSet FOLLOW_78_in_signalDefinition3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyUnion3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyAssociation3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyRole3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyComposition3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyAggregation3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyClass3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keySignal3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyDerived3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyDerive3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyInit3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyQualifier3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly3222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_expression3272 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression3283 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression3287 = new BitSet(new long[]{0x0059300000080000L});
    public static final BitSet FOLLOW_type_in_expression3291 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression3296 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_expression3300 = new BitSet(new long[]{0x0000000000000400L,0x0000000000800000L});
    public static final BitSet FOLLOW_COMMA_in_expression3338 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression3350 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression3354 = new BitSet(new long[]{0x0059300000080000L});
    public static final BitSet FOLLOW_type_in_expression3358 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression3363 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_expression3367 = new BitSet(new long[]{0x0000000000000400L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_expression3408 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList3457 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList3474 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_paramList3486 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList3490 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_paramList3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList3539 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_idList3549 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_idList3553 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration3584 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration3586 = new BitSet(new long[]{0x0059300000080000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression3626 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_conditionalImpliesExpression3639 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F88240000L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression3643 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression3688 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_conditionalOrExpression3701 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F88240000L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression3705 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression3749 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_conditionalXOrExpression3762 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F88240000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression3766 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression3810 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_conditionalAndExpression3823 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F88240000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression3827 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3875 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_set_in_equalityExpression3894 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F88240000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3904 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression3953 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_set_in_relationalExpression3971 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F88240000L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression3989 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4039 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression4057 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F88240000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4067 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4117 = new BitSet(new long[]{0x0000014000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression4135 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F88240000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4149 = new BitSet(new long[]{0x0000014000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_set_in_unaryExpression4211 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F88240000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression4288 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression4306 = new BitSet(new long[]{0x0000000000080000L,0x0001803A08000000L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression4312 = new BitSet(new long[]{0x0000000000080000L,0x0001803A08000000L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression4323 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_literal_in_primaryExpression4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression4377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression4400 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression4404 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression4430 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression4432 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_primaryExpression4434 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression4457 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_primaryExpression4459 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression4477 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression4492 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression4494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_primaryExpression4496 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression4500 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression4504 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression4506 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression4526 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_primaryExpression4528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference4554 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_objectReference4562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall4627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall4640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inStateExpression_in_propertyCall4679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression4714 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression4721 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression4732 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_queryExpression4736 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_queryExpression4747 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_iterateExpression4785 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression4791 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression4799 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression4801 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression4809 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression4811 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_iterateExpression4819 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression4869 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression4891 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_operationExpression4904 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression4917 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_operationExpression4921 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression4933 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression4950 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_operationExpression4965 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression4980 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_operationExpression4984 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression4998 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_operationExpression5023 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_operationExpression5025 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression5050 = new BitSet(new long[]{0x01593318861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_operationExpression5071 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression5083 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_operationExpression5087 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression5107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_inStateExpression5144 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_inStateExpression5149 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_inStateExpression5158 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_inStateExpression5163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression5199 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression5223 = new BitSet(new long[]{0x0059300000080000L});
    public static final BitSet FOLLOW_type_in_typeExpression5227 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration5267 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration5270 = new BitSet(new long[]{0x0059300000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration5274 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration5284 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration5290 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration5293 = new BitSet(new long[]{0x0059300000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration5299 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization5327 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization5329 = new BitSet(new long[]{0x0059300000080000L});
    public static final BitSet FOLLOW_type_in_variableInitialization5333 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization5335 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_variableInitialization5339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ifExpression5371 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_ifExpression5375 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_ifExpression5377 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_ifExpression5381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ifExpression5383 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_ifExpression5387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ifExpression5389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_literal5428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_literal5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal5455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal5470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal5484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal5494 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal5498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal5510 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal5512 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal5516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal5528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal5540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal5564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_literal5576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral5614 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral5643 = new BitSet(new long[]{0x0159330A861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral5660 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral5673 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral5677 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral5696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem5725 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem5736 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_collectionItem5740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_emptyCollectionLiteral5769 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral5771 = new BitSet(new long[]{0x0019300000000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral5775 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral5777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral5793 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral5795 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral5797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_undefinedLiteral5827 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral5829 = new BitSet(new long[]{0x0059300000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral5833 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral5835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_undefinedLiteral5849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_undefinedLiteral5863 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral5865 = new BitSet(new long[]{0x0059300000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral5869 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral5871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_undefinedLiteral5885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_tupleLiteral5924 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral5930 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral5938 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral5949 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral5953 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral5964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem5995 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_tupleItem6034 = new BitSet(new long[]{0x0059300000080000L});
    public static final BitSet FOLLOW_type_in_tupleItem6038 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem6040 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_tupleItem6044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem6066 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_expression_in_tupleItem6076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type6142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type6154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type6166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly6198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly6200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType6228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType6266 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType6293 = new BitSet(new long[]{0x0059300000080000L});
    public static final BitSet FOLLOW_type_in_collectionType6297 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType6299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_tupleType6333 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType6335 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType6344 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleType6355 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType6359 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType6371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart6403 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_tuplePart6405 = new BitSet(new long[]{0x0059300000080000L});
    public static final BitSet FOLLOW_type_in_tuplePart6409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOnly6458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statOnly6462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_singleStat_in_stat6497 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_stat6509 = new BitSet(new long[]{0x01593308861A0020L,0x00C1807FD92C0604L});
    public static final BitSet FOLLOW_singleStat_in_stat6519 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_emptyStat_in_singleStat6559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat6585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignStat_in_singleStat6597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_singleStat6611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleStat6625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleStat6638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleStat6655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExStat_in_singleStat6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterStat_in_singleStat6689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_singleStat6711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStat_in_singleStat6729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_emptyStat6756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr6782 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr6796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varAssignStat6834 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat6838 = new BitSet(new long[]{0x01593308861A0020L,0x0041807FD8240000L});
    public static final BitSet FOLLOW_rValue_in_varAssignStat6846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_attAssignStat6870 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attAssignStat6879 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat6883 = new BitSet(new long[]{0x01593308861A0020L,0x0041807FD8240000L});
    public static final BitSet FOLLOW_rValue_in_attAssignStat6891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_objCreateStat6917 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_objCreateStat6925 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat6935 = new BitSet(new long[]{0x01593318861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat6948 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat6956 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_objCreateStat6974 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat6982 = new BitSet(new long[]{0x01593308861A0020L,0x0041807FD8240000L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat6996 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat7004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_objDestroyStat7040 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat7048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_lnkInsStat7074 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkInsStat7078 = new BitSet(new long[]{0x01593308861A0020L,0x0041807FD8240000L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat7088 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkInsStat7092 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_lnkInsStat7096 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkInsStat7104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7133 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7144 = new BitSet(new long[]{0x01593308861A0020L,0x0041807FD8240000L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7153 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7160 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers7176 = new BitSet(new long[]{0x01593308861A0020L,0x0041807FD8240000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7187 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7198 = new BitSet(new long[]{0x01593308861A0020L,0x0041807FD8240000L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7207 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7214 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers7236 = new BitSet(new long[]{0x01593308861A0020L,0x0041807FD8240000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7251 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7271 = new BitSet(new long[]{0x01593308861A0020L,0x0041807FD8240000L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7282 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7291 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_73_in_lnkDelStat7332 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkDelStat7336 = new BitSet(new long[]{0x01593308861A0020L,0x0041807FD8240000L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat7346 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkDelStat7350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_lnkDelStat7354 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkDelStat7363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_condExStat7394 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_inSoilExpression_in_condExStat7403 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_condExStat7407 = new BitSet(new long[]{0x01593308861A0020L,0x00C1807FD92C0704L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat7416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_77_in_condExStat7427 = new BitSet(new long[]{0x01593308861A0020L,0x00C1807FD92C0704L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat7439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_condExStat7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_iterStat7476 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_iterStat7484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_iterStat7488 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_inSoilExpression_in_iterStat7496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_iterStat7500 = new BitSet(new long[]{0x01593308861A0020L,0x00C1807FD92C0704L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_iterStat7508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_iterStat7513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_whileStat7539 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_inSoilExpression_in_whileStat7547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_whileStat7551 = new BitSet(new long[]{0x01593308861A0020L,0x00C1807FD92C0704L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_whileStat7559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_whileStat7564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_blockStat7594 = new BitSet(new long[]{0x01593308861A0020L,0x00C1807FD92C0704L});
    public static final BitSet FOLLOW_72_in_blockStat7599 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat7605 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_blockStat7611 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat7617 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_blockStat7624 = new BitSet(new long[]{0x01593308861A0020L,0x00C1807FD92C0604L});
    public static final BitSet FOLLOW_stat_in_blockStat7634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_blockStat7639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_implicitBlockStat7665 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat7671 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_implicitBlockStat7677 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat7683 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_implicitBlockStat7690 = new BitSet(new long[]{0x01593308861A0020L,0x00C1807FD92C0604L});
    public static final BitSet FOLLOW_stat_in_implicitBlockStat7698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOrImplicitBlock7721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitBlockStat_in_statOrImplicitBlock7731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_rValue7777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_rValue7789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_rValList7812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValListMin1_in_rValList7839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin17872 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin17886 = new BitSet(new long[]{0x01593308861A0020L,0x0041807FD8240000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin17896 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rValue_in_rValListMin27935 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin27943 = new BitSet(new long[]{0x01593308861A0020L,0x0041807FD8240000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin27951 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin27965 = new BitSet(new long[]{0x01593308861A0020L,0x0041807FD8240000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin27975 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_expression_in_inSoilExpression8009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_exprList8038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprListMin1_in_exprList8056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin18089 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin18104 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin18114 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin28154 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin28162 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin28170 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin28184 = new BitSet(new long[]{0x01593308861A0020L,0x0041807F98240000L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin28194 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_nothing_in_identList8224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identListMin1_in_identList8241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identListMin18275 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_identListMin18289 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_identListMin18299 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COLON_in_synpred1_USE6025 = new BitSet(new long[]{0x0059300000080000L});
    public static final BitSet FOLLOW_type_in_synpred1_USE6027 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred1_USE6029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_synpred2_USE6577 = new BitSet(new long[]{0x0000000000000002L});

}