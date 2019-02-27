// $ANTLR 3.4 USE.g 2019-02-27 15:40:04
 
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
import org.tzi.use.query.ast.*;
import java.util.Arrays;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", "NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", "REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", "WS", "'&&'", "'=>'", "'Bag'", "'Collection'", "'Comment'", "'Hard'", "'OrderedSet'", "'Override'", "'Rank'", "'Sequence'", "'Set'", "'Soft'", "'Tuple'", "'Type'", "'Undefined'", "'abstract'", "'all'", "'allInstances'", "'and'", "'as'", "'associationClass'", "'associationclass'", "'attributes'", "'automatic'", "'begin'", "'between'", "'but'", "'byUseId'", "'constraints'", "'context'", "'create'", "'declare'", "'delete'", "'destroy'", "'div'", "'do'", "'else'", "'end'", "'endif'", "'enum'", "'existential'", "'false'", "'for'", "'from'", "'if'", "'implies'", "'in'", "'insert'", "'into'", "'inv'", "'iterate'", "'let'", "'model'", "'module'", "'new'", "'no'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", "'oclInState'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", "'only'", "'operations'", "'or'", "'ordered'", "'post'", "'pre'", "'psm'", "'redefines'", "'select'", "'selectByKind'", "'selectByType'", "'statemachines'", "'states'", "'subsets'", "'then'", "'transitions'", "'true'", "'verify'", "'while'", "'with'", "'xor'", "'||'"
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
    public static final int T__121=121;
    public static final int T__122=122;
    public static final int T__123=123;
    public static final int T__124=124;
    public static final int T__125=125;
    public static final int T__126=126;
    public static final int T__127=127;
    public static final int T__128=128;
    public static final int T__129=129;
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
    // USE.g:132:1: model returns [ASTModel n] : as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )* (m= moduleExpr )* EOF ;
    public final ASTModel model() throws RecognitionException {
        ASTModel n = null;


        Token modelName=null;
        Set<ASTAnnotation> as =null;

        ASTAssociation a =null;

        ASTConstraintDefinition cons =null;

        ASTPrePost ppc =null;

        ASTEnumTypeDefinition e =null;

        ModuleExpr m =null;


        try {
            // USE.g:133:2: (as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )* (m= moduleExpr )* EOF )
            // USE.g:134:2: as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )* (m= moduleExpr )* EOF
            {
            pushFollow(FOLLOW_annotationSet_in_model71);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            match(input,96,FOLLOW_96_in_model77); if (state.failed) return n;

            modelName=(Token)match(input,IDENT,FOLLOW_IDENT_in_model81); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTModel(modelName); n.setAnnotations(as); }

            // USE.g:136:5: ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )*
            loop2:
            do {
                int alt2=5;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // USE.g:136:9: generalClassifierDefinition[$n]
            	    {
            	    pushFollow(FOLLOW_generalClassifierDefinition_in_model93);
            	    generalClassifierDefinition(n);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    }
            	    break;
            	case 2 :
            	    // USE.g:137:9: a= associationDefinition
            	    {
            	    pushFollow(FOLLOW_associationDefinition_in_model106);
            	    a=associationDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addAssociation(a); }

            	    }
            	    break;
            	case 3 :
            	    // USE.g:138:9: ( 'constraints' (cons= invariant |ppc= prePost )* )
            	    {
            	    // USE.g:138:9: ( 'constraints' (cons= invariant |ppc= prePost )* )
            	    // USE.g:138:11: 'constraints' (cons= invariant |ppc= prePost )*
            	    {
            	    match(input,72,FOLLOW_72_in_model120); if (state.failed) return n;

            	    // USE.g:139:11: (cons= invariant |ppc= prePost )*
            	    loop1:
            	    do {
            	        int alt1=3;
            	        alt1 = dfa1.predict(input);
            	        switch (alt1) {
            	    	case 1 :
            	    	    // USE.g:139:15: cons= invariant
            	    	    {
            	    	    pushFollow(FOLLOW_invariant_in_model138);
            	    	    cons=invariant();

            	    	    state._fsp--;
            	    	    if (state.failed) return n;

            	    	    if ( state.backtracking==0 ) { n.addConstraint(cons); }

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // USE.g:140:15: ppc= prePost
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
            	    // USE.g:143:9: e= enumTypeDefinition
            	    {
            	    pushFollow(FOLLOW_enumTypeDefinition_in_model199);
            	    e=enumTypeDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addEnumTypeDef(e); }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // USE.g:145:5: (m= moduleExpr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==97) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // USE.g:145:6: m= moduleExpr
            	    {
            	    pushFollow(FOLLOW_moduleExpr_in_model217);
            	    m=moduleExpr();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) {n.addModule(m);}

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match(input,EOF,FOLLOW_EOF_in_model223); if (state.failed) return n;

            }

        }
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
    // USE.g:151:1: enumTypeDefinition returns [ASTEnumTypeDefinition n] : as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )? ;
    public final ASTEnumTypeDefinition enumTypeDefinition() throws RecognitionException {
        ASTEnumTypeDefinition n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        List idListRes =null;


        try {
            // USE.g:152:2: (as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )? )
            // USE.g:153:2: as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_enumTypeDefinition246);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            match(input,83,FOLLOW_83_in_enumTypeDefinition252); if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumTypeDefinition256); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_enumTypeDefinition258); if (state.failed) return n;

            pushFollow(FOLLOW_idList_in_enumTypeDefinition262);
            idListRes=idList();

            state._fsp--;
            if (state.failed) return n;

            match(input,RBRACE,FOLLOW_RBRACE_in_enumTypeDefinition264); if (state.failed) return n;

            // USE.g:154:54: ( SEMI )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==SEMI) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // USE.g:154:56: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_enumTypeDefinition268); if (state.failed) return n;

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
    // USE.g:163:1: generalClassifierDefinition[ASTModel n] : as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] ) ;
    public final void generalClassifierDefinition(ASTModel n) throws RecognitionException {
        Set<ASTAnnotation> as =null;

        ASTClass c =null;

        ASTAssociationClass ac =null;

        ASTSignal s =null;


         
          boolean isAbstract = false;

        try {
            // USE.g:167:2: (as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] ) )
            // USE.g:168:2: as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] )
            {
            pushFollow(FOLLOW_annotationSet_in_generalClassifierDefinition306);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return ;

            // USE.g:169:5: ( 'abstract' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==59) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // USE.g:169:7: 'abstract'
                    {
                    match(input,59,FOLLOW_59_in_generalClassifierDefinition314); if (state.failed) return ;

                    if ( state.backtracking==0 ) { isAbstract = true; }

                    }
                    break;

            }


            // USE.g:170:5: (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] )
            int alt6=3;
            switch ( input.LA(1) ) {
            case AT:
                {
                alt6=1;
                }
                break;
            case IDENT:
                {
                int LA6_2 = input.LA(2);

                if ( ((input.LT(1).getText().equals("class"))) ) {
                    alt6=1;
                }
                else if ( ((input.LT(1).getText().equals("signal"))) ) {
                    alt6=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;

                }
                }
                break;
            case 64:
            case 65:
                {
                alt6=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // USE.g:171:9: c= classDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_classDefinition_in_generalClassifierDefinition342);
                    c=classDefinition(isAbstract);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { n.addClass(c); c.setAnnotations(as); }

                    }
                    break;
                case 2 :
                    // USE.g:174:9: ac= associationClassDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_associationClassDefinition_in_generalClassifierDefinition380);
                    ac=associationClassDefinition(isAbstract);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { n.addAssociationClass(ac); ac.setAnnotations(as); }

                    }
                    break;
                case 3 :
                    // USE.g:177:9: s= signalDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_signalDefinition_in_generalClassifierDefinition425);
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
    // USE.g:198:1: classDefinition[boolean isAbstract] returns [ASTClass n] : (tag= block_annotation |tag= line_annotation[tag] )? keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end' ;
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
            // USE.g:200:2: ( (tag= block_annotation |tag= line_annotation[tag] )? keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end' )
            // USE.g:201:2: (tag= block_annotation |tag= line_annotation[tag] )? keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end'
            {
            // USE.g:201:2: (tag= block_annotation |tag= line_annotation[tag] )?
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==AT) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==IDENT) ) {
                    alt7=1;
                }
                else if ( (LA7_1==48||LA7_1==52||LA7_1==57) ) {
                    alt7=2;
                }
            }
            switch (alt7) {
                case 1 :
                    // USE.g:201:3: tag= block_annotation
                    {
                    pushFollow(FOLLOW_block_annotation_in_classDefinition479);
                    tag=block_annotation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 2 :
                    // USE.g:201:26: tag= line_annotation[tag]
                    {
                    pushFollow(FOLLOW_line_annotation_in_classDefinition485);
                    tag=line_annotation(tag);

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_keyClass_in_classDefinition495);
            keyClass();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_classDefinition499); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTClass(name, isAbstract); n.setAnnotationTag(tag);}

            // USE.g:203:5: ( LESS idListRes= idList )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==LESS) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // USE.g:203:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_classDefinition509); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_classDefinition513);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addSuperClasses(idListRes); }

                    }
                    break;

            }


            // USE.g:204:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==66) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // USE.g:204:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,66,FOLLOW_66_in_classDefinition526); if (state.failed) return n;

                    // USE.g:205:7: (a= attributeDefinition )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==AT||LA9_0==IDENT||LA9_0==59||(LA9_0 >= 64 && LA9_0 <= 65)||LA9_0==83||LA9_0==93||LA9_0==96||(LA9_0 >= 112 && LA9_0 <= 113)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // USE.g:205:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_classDefinition539);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addAttribute(a); }

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:207:5: ( 'operations' (op= operationDefinition )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==109) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // USE.g:207:7: 'operations' (op= operationDefinition )*
                    {
                    match(input,109,FOLLOW_109_in_classDefinition560); if (state.failed) return n;

                    // USE.g:208:7: (op= operationDefinition )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==AT||LA11_0==IDENT||LA11_0==59||(LA11_0 >= 64 && LA11_0 <= 65)||LA11_0==83||LA11_0==93||LA11_0==96||(LA11_0 >= 112 && LA11_0 <= 113)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // USE.g:208:9: op= operationDefinition
                    	    {
                    	    pushFollow(FOLLOW_operationDefinition_in_classDefinition573);
                    	    op=operationDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addOperation(op); }

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:210:5: ( 'constraints' (inv= invariantClause )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==72) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // USE.g:210:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,72,FOLLOW_72_in_classDefinition594); if (state.failed) return n;

                    // USE.g:211:7: (inv= invariantClause )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==AT||LA13_0==IDENT||LA13_0==59||(LA13_0 >= 64 && LA13_0 <= 65)||(LA13_0 >= 83 && LA13_0 <= 84)||LA13_0==93||LA13_0==96||(LA13_0 >= 112 && LA13_0 <= 113)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // USE.g:212:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_classDefinition614);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:215:5: ( 'statemachines' (sm= stateMachine )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==119) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // USE.g:215:7: 'statemachines' (sm= stateMachine )*
                    {
                    match(input,119,FOLLOW_119_in_classDefinition640); if (state.failed) return n;

                    // USE.g:216:7: (sm= stateMachine )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==114) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // USE.g:217:9: sm= stateMachine
                    	    {
                    	    pushFollow(FOLLOW_stateMachine_in_classDefinition660);
                    	    sm=stateMachine();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addStateMachine(sm); }

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,81,FOLLOW_81_in_classDefinition684); if (state.failed) return n;

            }

        }
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
    // USE.g:238:1: associationClassDefinition[boolean isAbstract] returns [ASTAssociationClass n] : classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end' ;
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
            // USE.g:240:5: (classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end' )
            // USE.g:241:5: classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end'
            {
            classKW=(Token)input.LT(1);

            if ( (input.LA(1) >= 64 && input.LA(1) <= 65) ) {
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

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationClassDefinition743); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociationClass(name, isAbstract); }

            // USE.g:250:5: ( LESS idListRes= idList )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==LESS) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // USE.g:250:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_associationClassDefinition753); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_associationClassDefinition757);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addSuperClasses(idListRes); }

                    }
                    break;

            }


            // USE.g:251:5: ( 'between' ae= associationEnd (ae= associationEnd )+ )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==69) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // USE.g:251:6: 'between' ae= associationEnd (ae= associationEnd )+
                    {
                    match(input,69,FOLLOW_69_in_associationClassDefinition769); if (state.failed) return n;

                    pushFollow(FOLLOW_associationEnd_in_associationClassDefinition777);
                    ae=associationEnd();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addEnd(ae); }

                    // USE.g:253:5: (ae= associationEnd )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==IDENT) ) {
                            int LA18_2 = input.LA(2);

                            if ( (LA18_2==LBRACK) ) {
                                alt18=1;
                            }


                        }
                        else if ( (LA18_0==AT) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // USE.g:253:7: ae= associationEnd
                    	    {
                    	    pushFollow(FOLLOW_associationEnd_in_associationClassDefinition789);
                    	    ae=associationEnd();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addEnd(ae); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                    	    if (state.backtracking>0) {state.failed=true; return n;}
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    }
                    break;

            }


            // USE.g:255:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==66) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // USE.g:255:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,66,FOLLOW_66_in_associationClassDefinition809); if (state.failed) return n;

                    // USE.g:256:7: (a= attributeDefinition )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==IDENT) ) {
                            int LA20_2 = input.LA(2);

                            if ( (LA20_2==COLON) ) {
                                alt20=1;
                            }


                        }
                        else if ( (LA20_0==AT) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // USE.g:256:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_associationClassDefinition822);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addAttribute(a); }

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:258:5: ( 'operations' (op= operationDefinition )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==109) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // USE.g:258:7: 'operations' (op= operationDefinition )*
                    {
                    match(input,109,FOLLOW_109_in_associationClassDefinition843); if (state.failed) return n;

                    // USE.g:259:7: (op= operationDefinition )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==IDENT) ) {
                            int LA22_2 = input.LA(2);

                            if ( (LA22_2==LPAREN) ) {
                                alt22=1;
                            }


                        }
                        else if ( (LA22_0==AT) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // USE.g:259:9: op= operationDefinition
                    	    {
                    	    pushFollow(FOLLOW_operationDefinition_in_associationClassDefinition856);
                    	    op=operationDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addOperation(op); }

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:261:5: ( 'constraints' (inv= invariantClause )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==72) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // USE.g:261:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,72,FOLLOW_72_in_associationClassDefinition877); if (state.failed) return n;

                    // USE.g:262:7: (inv= invariantClause )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==AT||LA24_0==84||LA24_0==93) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // USE.g:263:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_associationClassDefinition897);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:266:5: ( 'statemachines' (sm= stateMachine )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==119) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // USE.g:266:7: 'statemachines' (sm= stateMachine )*
                    {
                    match(input,119,FOLLOW_119_in_associationClassDefinition923); if (state.failed) return n;

                    // USE.g:267:7: (sm= stateMachine )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==114) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // USE.g:268:9: sm= stateMachine
                    	    {
                    	    pushFollow(FOLLOW_stateMachine_in_associationClassDefinition943);
                    	    sm=stateMachine();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addStateMachine(sm); }

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:272:5: ( ( keyAggregation | keyComposition ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==IDENT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // USE.g:272:7: ( keyAggregation | keyComposition )
                    {
                    if ( state.backtracking==0 ) { t = input.LT(1); }

                    // USE.g:273:7: ( keyAggregation | keyComposition )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==IDENT) ) {
                        int LA28_1 = input.LA(2);

                        if ( ((input.LT(1).getText().equals("aggregation"))) ) {
                            alt28=1;
                        }
                        else if ( ((input.LT(1).getText().equals("composition"))) ) {
                            alt28=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return n;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 28, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;

                    }
                    switch (alt28) {
                        case 1 :
                            // USE.g:273:9: keyAggregation
                            {
                            pushFollow(FOLLOW_keyAggregation_in_associationClassDefinition984);
                            keyAggregation();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;
                        case 2 :
                            // USE.g:273:26: keyComposition
                            {
                            pushFollow(FOLLOW_keyComposition_in_associationClassDefinition988);
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


            match(input,81,FOLLOW_81_in_associationClassDefinition1011); if (state.failed) return n;

            }

        }
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
    // USE.g:283:1: attributeDefinition returns [ASTAttribute n] : as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )? ;
    public final ASTAttribute attributeDefinition() throws RecognitionException {
        ASTAttribute n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        ASTType t =null;

        USEParser.expression_return deriveExpression =null;

        USEParser.expression_return initExpression =null;


        try {
            // USE.g:284:2: (as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )? )
            // USE.g:285:2: as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_attributeDefinition1039);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_attributeDefinition1047); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_attributeDefinition1049); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_attributeDefinition1053);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            // USE.g:288:5: ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )?
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==IDENT) ) {
                int LA31_1 = input.LA(2);

                if ( (((input.LT(1).getText().equals("derived"))||(input.LT(1).getText().equals("derive")))) ) {
                    alt31=1;
                }
                else if ( ((input.LT(1).getText().equals("init"))) ) {
                    alt31=2;
                }
            }
            switch (alt31) {
                case 1 :
                    // USE.g:289:9: ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression )
                    {
                    // USE.g:289:9: ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression )
                    // USE.g:289:10: ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression
                    {
                    // USE.g:289:10: ( keyDerive | keyDerived )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==IDENT) ) {
                        int LA30_1 = input.LA(2);

                        if ( ((input.LT(1).getText().equals("derive"))) ) {
                            alt30=1;
                        }
                        else if ( ((input.LT(1).getText().equals("derived"))) ) {
                            alt30=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return n;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 30, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;

                    }
                    switch (alt30) {
                        case 1 :
                            // USE.g:289:11: keyDerive
                            {
                            pushFollow(FOLLOW_keyDerive_in_attributeDefinition1077);
                            keyDerive();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;
                        case 2 :
                            // USE.g:289:21: keyDerived
                            {
                            pushFollow(FOLLOW_keyDerived_in_attributeDefinition1079);
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


                    pushFollow(FOLLOW_expression_in_attributeDefinition1092);
                    deriveExpression=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    }


                    }
                    break;
                case 2 :
                    // USE.g:291:9: ( keyInit ( COLON | EQUAL ) initExpression= expression )
                    {
                    // USE.g:291:9: ( keyInit ( COLON | EQUAL ) initExpression= expression )
                    // USE.g:291:10: keyInit ( COLON | EQUAL ) initExpression= expression
                    {
                    pushFollow(FOLLOW_keyInit_in_attributeDefinition1112);
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


                    pushFollow(FOLLOW_expression_in_attributeDefinition1128);
                    initExpression=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    }


                    }
                    break;

            }


            // USE.g:293:5: ( SEMI )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==SEMI) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // USE.g:293:5: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_attributeDefinition1142); if (state.failed) return n;

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
    // USE.g:307:1: operationDefinition returns [ASTOperation n] : as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )? ;
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
            // USE.g:308:2: (as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )? )
            // USE.g:309:2: as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_operationDefinition1173);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationDefinition1183); if (state.failed) return n;

            pushFollow(FOLLOW_paramList_in_operationDefinition1193);
            pl=paramList();

            state._fsp--;
            if (state.failed) return n;

            // USE.g:315:5: ( COLON t= type )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==COLON) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // USE.g:315:7: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_operationDefinition1207); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_operationDefinition1213);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n = new ASTOperation(name, pl, t); n.setAnnotations(as); }

            // USE.g:317:5: ( ( EQUAL e= expression ) | (s= blockStat ) )?
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==EQUAL) ) {
                alt34=1;
            }
            else if ( (LA34_0==68) ) {
                alt34=2;
            }
            switch (alt34) {
                case 1 :
                    // USE.g:318:9: ( EQUAL e= expression )
                    {
                    // USE.g:318:9: ( EQUAL e= expression )
                    // USE.g:318:11: EQUAL e= expression
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_operationDefinition1241); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_operationDefinition1247);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setExpression((e!=null?e.n:null)); }

                    }


                    }
                    break;
                case 2 :
                    // USE.g:319:9: (s= blockStat )
                    {
                    // USE.g:319:9: (s= blockStat )
                    // USE.g:319:11: s= blockStat
                    {
                    pushFollow(FOLLOW_blockStat_in_operationDefinition1269);
                    s=blockStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setStatement((s!=null?s.n:null));  }

                    }


                    }
                    break;

            }


            // USE.g:321:5: (ppc= prePostClause )*
            loop35:
            do {
                int alt35=2;
                alt35 = dfa35.predict(input);
                switch (alt35) {
            	case 1 :
            	    // USE.g:321:7: ppc= prePostClause
            	    {
            	    pushFollow(FOLLOW_prePostClause_in_operationDefinition1291);
            	    ppc=prePostClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addPrePostClause(ppc); }

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            // USE.g:322:5: ( SEMI )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==SEMI) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // USE.g:322:7: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_operationDefinition1304); if (state.failed) return n;

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
    // USE.g:332:1: associationDefinition returns [ASTAssociation n] : as= annotationSet (tag= line_annotation[tag] )? ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' ;
    public final ASTAssociation associationDefinition() throws RecognitionException {
        ASTAssociation n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        AnnotationTag tag =null;

        ASTAssociationEnd ae =null;


         Token t = null; tag=null;
        try {
            // USE.g:334:2: (as= annotationSet (tag= line_annotation[tag] )? ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' )
            // USE.g:335:2: as= annotationSet (tag= line_annotation[tag] )? ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end'
            {
            pushFollow(FOLLOW_annotationSet_in_associationDefinition1335);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            // USE.g:336:2: (tag= line_annotation[tag] )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==AT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // USE.g:336:3: tag= line_annotation[tag]
                    {
                    pushFollow(FOLLOW_line_annotation_in_associationDefinition1341);
                    tag=line_annotation(tag);

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { t = input.LT(1); }

            // USE.g:338:5: ( keyAssociation | keyAggregation | keyComposition )
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==IDENT) ) {
                int LA38_1 = input.LA(2);

                if ( ((input.LT(1).getText().equals("association"))) ) {
                    alt38=1;
                }
                else if ( ((input.LT(1).getText().equals("aggregation"))) ) {
                    alt38=2;
                }
                else if ( ((input.LT(1).getText().equals("composition"))) ) {
                    alt38=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // USE.g:338:7: keyAssociation
                    {
                    pushFollow(FOLLOW_keyAssociation_in_associationDefinition1358);
                    keyAssociation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 2 :
                    // USE.g:338:24: keyAggregation
                    {
                    pushFollow(FOLLOW_keyAggregation_in_associationDefinition1362);
                    keyAggregation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 3 :
                    // USE.g:338:41: keyComposition
                    {
                    pushFollow(FOLLOW_keyComposition_in_associationDefinition1366);
                    keyComposition();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationDefinition1376); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociation(t, name); n.setAnnotations(as);n.setAnnotationTag(tag);}

            match(input,69,FOLLOW_69_in_associationDefinition1384); if (state.failed) return n;

            pushFollow(FOLLOW_associationEnd_in_associationDefinition1392);
            ae=associationEnd();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addEnd(ae); }

            // USE.g:342:5: (ae= associationEnd )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==AT||LA39_0==IDENT||LA39_0==59||(LA39_0 >= 64 && LA39_0 <= 65)||LA39_0==83||LA39_0==93||LA39_0==96||(LA39_0 >= 112 && LA39_0 <= 113)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // USE.g:342:7: ae= associationEnd
            	    {
            	    pushFollow(FOLLOW_associationEnd_in_associationDefinition1404);
            	    ae=associationEnd();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addEnd(ae); }

            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);


            match(input,81,FOLLOW_81_in_associationDefinition1415); if (state.failed) return n;

            }

        }
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
    // USE.g:351:1: associationEnd returns [ASTAssociationEnd n] : as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? ;
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
            // USE.g:352:2: (as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? )
            // USE.g:353:2: as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_associationEnd1440);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1448); if (state.failed) return n;

            match(input,LBRACK,FOLLOW_LBRACK_in_associationEnd1450); if (state.failed) return n;

            pushFollow(FOLLOW_multiplicity_in_associationEnd1454);
            m=multiplicity();

            state._fsp--;
            if (state.failed) return n;

            match(input,RBRACK,FOLLOW_RBRACK_in_associationEnd1456); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociationEnd(name, m); n.setAnnotations(as); }

            // USE.g:355:5: ( keyRole rn= IDENT )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==IDENT) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==IDENT) ) {
                    int LA40_3 = input.LA(3);

                    if ( ((input.LT(1).getText().equals("role"))) ) {
                        alt40=1;
                    }
                }
            }
            switch (alt40) {
                case 1 :
                    // USE.g:355:7: keyRole rn= IDENT
                    {
                    pushFollow(FOLLOW_keyRole_in_associationEnd1467);
                    keyRole();

                    state._fsp--;
                    if (state.failed) return n;

                    rn=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1471); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setRolename(rn); }

                    }
                    break;

            }


            // USE.g:356:5: ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )*
            loop43:
            do {
                int alt43=7;
                switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA43_3 = input.LA(2);

                    if ( ((input.LT(1).getText().equals("union"))) ) {
                        alt43=3;
                    }
                    else if ( (((input.LT(1).getText().equals("derived"))||(input.LT(1).getText().equals("derive")))) ) {
                        alt43=5;
                    }
                    else if ( ((input.LT(1).getText().equals("qualifier"))) ) {
                        alt43=6;
                    }


                    }
                    break;
                case 111:
                    {
                    alt43=1;
                    }
                    break;
                case 121:
                    {
                    alt43=2;
                    }
                    break;
                case 115:
                    {
                    alt43=4;
                    }
                    break;

                }

                switch (alt43) {
            	case 1 :
            	    // USE.g:357:9: 'ordered'
            	    {
            	    match(input,111,FOLLOW_111_in_associationEnd1492); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setOrdered(); }

            	    }
            	    break;
            	case 2 :
            	    // USE.g:358:9: 'subsets' sr= IDENT
            	    {
            	    match(input,121,FOLLOW_121_in_associationEnd1504); if (state.failed) return n;

            	    sr=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1508); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addSubsetsRolename(sr); }

            	    }
            	    break;
            	case 3 :
            	    // USE.g:359:9: keyUnion
            	    {
            	    pushFollow(FOLLOW_keyUnion_in_associationEnd1520);
            	    keyUnion();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setUnion(true); }

            	    }
            	    break;
            	case 4 :
            	    // USE.g:360:9: 'redefines' rd= IDENT
            	    {
            	    match(input,115,FOLLOW_115_in_associationEnd1532); if (state.failed) return n;

            	    rd=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1536); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addRedefinesRolename(rd); }

            	    }
            	    break;
            	case 5 :
            	    // USE.g:361:9: ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression
            	    {
            	    // USE.g:361:9: ( keyDerived | keyDerive )
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==IDENT) ) {
            	        int LA41_1 = input.LA(2);

            	        if ( ((input.LT(1).getText().equals("derived"))) ) {
            	            alt41=1;
            	        }
            	        else if ( ((input.LT(1).getText().equals("derive"))) ) {
            	            alt41=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return n;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 41, 1, input);

            	            throw nvae;

            	        }
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // USE.g:361:10: keyDerived
            	            {
            	            pushFollow(FOLLOW_keyDerived_in_associationEnd1549);
            	            keyDerived();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;
            	        case 2 :
            	            // USE.g:361:21: keyDerive
            	            {
            	            pushFollow(FOLLOW_keyDerive_in_associationEnd1551);
            	            keyDerive();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    // USE.g:361:32: ( LPAREN parameter= elemVarsDeclaration RPAREN )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==LPAREN) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // USE.g:361:34: LPAREN parameter= elemVarsDeclaration RPAREN
            	            {
            	            match(input,LPAREN,FOLLOW_LPAREN_in_associationEnd1556); if (state.failed) return n;

            	            pushFollow(FOLLOW_elemVarsDeclaration_in_associationEnd1562);
            	            parameter=elemVarsDeclaration();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            match(input,RPAREN,FOLLOW_RPAREN_in_associationEnd1564); if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_associationEnd1568); if (state.failed) return n;

            	    pushFollow(FOLLOW_expression_in_associationEnd1572);
            	    exp=expression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setDerived((exp!=null?exp.n:null), parameter); }

            	    }
            	    break;
            	case 6 :
            	    // USE.g:362:9: keyQualifier qualifiers= paramList
            	    {
            	    pushFollow(FOLLOW_keyQualifier_in_associationEnd1584);
            	    keyQualifier();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    pushFollow(FOLLOW_paramList_in_associationEnd1590);
            	    qualifiers=paramList();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) {n.setQualifiers(qualifiers); }

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            // USE.g:364:5: ( SEMI )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==SEMI) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // USE.g:364:7: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_associationEnd1607); if (state.failed) return n;

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
    // USE.g:378:1: multiplicity returns [ASTMultiplicity n] :mr= multiplicityRange ( COMMA mr= multiplicityRange )* ;
    public final ASTMultiplicity multiplicity() throws RecognitionException {
        ASTMultiplicity n = null;


        ASTMultiplicityRange mr =null;


        try {
            // USE.g:379:5: (mr= multiplicityRange ( COMMA mr= multiplicityRange )* )
            // USE.g:380:5: mr= multiplicityRange ( COMMA mr= multiplicityRange )*
            {
            if ( state.backtracking==0 ) { 
            	Token t = input.LT(1); // remember start position of expression
            	n = new ASTMultiplicity(t);
                }

            pushFollow(FOLLOW_multiplicityRange_in_multiplicity1642);
            mr=multiplicityRange();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addRange(mr); }

            // USE.g:385:5: ( COMMA mr= multiplicityRange )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==COMMA) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // USE.g:385:7: COMMA mr= multiplicityRange
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multiplicity1652); if (state.failed) return n;

            	    pushFollow(FOLLOW_multiplicityRange_in_multiplicity1656);
            	    mr=multiplicityRange();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addRange(mr); }

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
    // $ANTLR end "multiplicity"



    // $ANTLR start "multiplicityRange"
    // USE.g:388:1: multiplicityRange returns [ASTMultiplicityRange n] : ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? ;
    public final ASTMultiplicityRange multiplicityRange() throws RecognitionException {
        ASTMultiplicityRange n = null;


        int ms1 =0;

        int ms2 =0;


        try {
            // USE.g:389:5: (ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? )
            // USE.g:390:5: ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )?
            {
            pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange1685);
            ms1=multiplicitySpec();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTMultiplicityRange(ms1); }

            // USE.g:391:5: ( DOTDOT ms2= multiplicitySpec )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==DOTDOT) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // USE.g:391:7: DOTDOT ms2= multiplicitySpec
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_multiplicityRange1695); if (state.failed) return n;

                    pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange1699);
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
    // USE.g:394:1: multiplicitySpec returns [int m] : (i= INT | STAR );
    public final int multiplicitySpec() throws RecognitionException {
        int m = 0;


        Token i=null;

         m = -1; 
        try {
            // USE.g:396:7: (i= INT | STAR )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==INT) ) {
                alt47=1;
            }
            else if ( (LA47_0==STAR) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return m;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }
            switch (alt47) {
                case 1 :
                    // USE.g:397:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_multiplicitySpec1733); if (state.failed) return m;

                    if ( state.backtracking==0 ) { m = Integer.parseInt((i!=null?i.getText():null)); }

                    }
                    break;
                case 2 :
                    // USE.g:398:7: STAR
                    {
                    match(input,STAR,FOLLOW_STAR_in_multiplicitySpec1743); if (state.failed) return m;

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
    // USE.g:401:1: annotationSpec returns [AnnotationTag tag] : (rtag= block_annotation |rtag= line_annotation[tag] );
    public final AnnotationTag annotationSpec() throws RecognitionException {
        AnnotationTag tag = null;


        AnnotationTag rtag =null;


        tag = new AnnotationTag();
        try {
            // USE.g:403:2: (rtag= block_annotation |rtag= line_annotation[tag] )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==AT) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==IDENT) ) {
                    alt48=1;
                }
                else if ( (LA48_1==48||LA48_1==52||LA48_1==57) ) {
                    alt48=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return tag;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return tag;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }
            switch (alt48) {
                case 1 :
                    // USE.g:404:2: rtag= block_annotation
                    {
                    pushFollow(FOLLOW_block_annotation_in_annotationSpec1771);
                    rtag=block_annotation();

                    state._fsp--;
                    if (state.failed) return tag;

                    if ( state.backtracking==0 ) {tag =rtag;}

                    }
                    break;
                case 2 :
                    // USE.g:405:4: rtag= line_annotation[tag]
                    {
                    pushFollow(FOLLOW_line_annotation_in_annotationSpec1780);
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
    // USE.g:408:1: block_annotation returns [AnnotationTag tag] : AT IDENT LBRACE ( annotation_tag[tag] )* RBRACE ;
    public final AnnotationTag block_annotation() throws RecognitionException {
        AnnotationTag tag = null;


        Token IDENT1=null;

        tag = new AnnotationTag();
        try {
            // USE.g:410:2: ( AT IDENT LBRACE ( annotation_tag[tag] )* RBRACE )
            // USE.g:411:2: AT IDENT LBRACE ( annotation_tag[tag] )* RBRACE
            {
            match(input,AT,FOLLOW_AT_in_block_annotation1802); if (state.failed) return tag;

            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_block_annotation1804); if (state.failed) return tag;

            match(input,LBRACE,FOLLOW_LBRACE_in_block_annotation1806); if (state.failed) return tag;

            // USE.g:412:3: ( annotation_tag[tag] )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==48||LA49_0==52||LA49_0==57) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // USE.g:412:4: annotation_tag[tag]
            	    {
            	    pushFollow(FOLLOW_annotation_tag_in_block_annotation1811);
            	    annotation_tag(tag);

            	    state._fsp--;
            	    if (state.failed) return tag;

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            if ( state.backtracking==0 ) {tag.setName(IDENT1.getText());}

            match(input,RBRACE,FOLLOW_RBRACE_in_block_annotation1819); if (state.failed) return tag;

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
    // USE.g:416:1: line_annotation[AnnotationTag tag] returns [AnnotationTag rtag] : AT ( annotation_tag[tag] ) ;
    public final AnnotationTag line_annotation(AnnotationTag tag) throws RecognitionException {
        AnnotationTag rtag = null;


        if (tag==null) tag = new AnnotationTag();
        try {
            // USE.g:417:50: ( AT ( annotation_tag[tag] ) )
            // USE.g:418:2: AT ( annotation_tag[tag] )
            {
            match(input,AT,FOLLOW_AT_in_line_annotation1838); if (state.failed) return rtag;

            // USE.g:418:5: ( annotation_tag[tag] )
            // USE.g:418:6: annotation_tag[tag]
            {
            pushFollow(FOLLOW_annotation_tag_in_line_annotation1841);
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
    // USE.g:421:1: annotation_tag[AnnotationTag tag] : ( annotation_comment EQUAL ( NON_OCL_STRING ) | annotation_weight EQUAL ( annotation_def | INT ) | annotation_type EQUAL ( annotation_enum_type | annotation_ref ) );
    public final void annotation_tag(AnnotationTag tag) throws RecognitionException {
        Token NON_OCL_STRING2=null;
        Token INT3=null;

        try {
            // USE.g:422:2: ( annotation_comment EQUAL ( NON_OCL_STRING ) | annotation_weight EQUAL ( annotation_def | INT ) | annotation_type EQUAL ( annotation_enum_type | annotation_ref ) )
            int alt52=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt52=1;
                }
                break;
            case 52:
                {
                alt52=2;
                }
                break;
            case 57:
                {
                alt52=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }

            switch (alt52) {
                case 1 :
                    // USE.g:423:2: annotation_comment EQUAL ( NON_OCL_STRING )
                    {
                    pushFollow(FOLLOW_annotation_comment_in_annotation_tag1857);
                    annotation_comment();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,EQUAL,FOLLOW_EQUAL_in_annotation_tag1859); if (state.failed) return ;

                    // USE.g:423:27: ( NON_OCL_STRING )
                    // USE.g:423:28: NON_OCL_STRING
                    {
                    NON_OCL_STRING2=(Token)match(input,NON_OCL_STRING,FOLLOW_NON_OCL_STRING_in_annotation_tag1862); if (state.failed) return ;

                    if ( state.backtracking==0 ) {tag.setComments(NON_OCL_STRING2.getText());}

                    }


                    }
                    break;
                case 2 :
                    // USE.g:424:4: annotation_weight EQUAL ( annotation_def | INT )
                    {
                    pushFollow(FOLLOW_annotation_weight_in_annotation_tag1870);
                    annotation_weight();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,EQUAL,FOLLOW_EQUAL_in_annotation_tag1872); if (state.failed) return ;

                    // USE.g:424:28: ( annotation_def | INT )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==67) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==INT) ) {
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
                            // USE.g:424:29: annotation_def
                            {
                            pushFollow(FOLLOW_annotation_def_in_annotation_tag1875);
                            annotation_def();

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {tag.setWeight(new IntWeight(-1));}

                            }
                            break;
                        case 2 :
                            // USE.g:424:83: INT
                            {
                            INT3=(Token)match(input,INT,FOLLOW_INT_in_annotation_tag1881); if (state.failed) return ;

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
                    // USE.g:428:4: annotation_type EQUAL ( annotation_enum_type | annotation_ref )
                    {
                    pushFollow(FOLLOW_annotation_type_in_annotation_tag1889);
                    annotation_type();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,EQUAL,FOLLOW_EQUAL_in_annotation_tag1891); if (state.failed) return ;

                    // USE.g:428:26: ( annotation_enum_type | annotation_ref )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==49||LA51_0==55) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==AT) ) {
                        alt51=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;

                    }
                    switch (alt51) {
                        case 1 :
                            // USE.g:428:27: annotation_enum_type
                            {
                            pushFollow(FOLLOW_annotation_enum_type_in_annotation_tag1894);
                            annotation_enum_type();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // USE.g:428:50: annotation_ref
                            {
                            pushFollow(FOLLOW_annotation_ref_in_annotation_tag1898);
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
    // USE.g:431:1: annotation_predefined : ( 'Comment' | 'Rank' | 'Type' );
    public final void annotation_predefined() throws RecognitionException {
        try {
            // USE.g:431:22: ( 'Comment' | 'Rank' | 'Type' )
            // USE.g:
            {
            if ( input.LA(1)==48||input.LA(1)==52||input.LA(1)==57 ) {
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
    // USE.g:437:1: annotation_comment : 'Comment' ;
    public final void annotation_comment() throws RecognitionException {
        try {
            // USE.g:437:19: ( 'Comment' )
            // USE.g:437:21: 'Comment'
            {
            match(input,48,FOLLOW_48_in_annotation_comment1926); if (state.failed) return ;

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
    // USE.g:438:1: annotation_weight : 'Rank' ;
    public final void annotation_weight() throws RecognitionException {
        try {
            // USE.g:438:18: ( 'Rank' )
            // USE.g:438:20: 'Rank'
            {
            match(input,52,FOLLOW_52_in_annotation_weight1933); if (state.failed) return ;

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
    // USE.g:439:1: annotation_type : 'Type' ;
    public final void annotation_type() throws RecognitionException {
        try {
            // USE.g:439:16: ( 'Type' )
            // USE.g:439:18: 'Type'
            {
            match(input,57,FOLLOW_57_in_annotation_type1940); if (state.failed) return ;

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
    // USE.g:441:1: annotation_override : 'Override' LPAREN LBRACE annotation_term RBRACE RPAREN ;
    public final void annotation_override() throws RecognitionException {
        try {
            // USE.g:441:20: ( 'Override' LPAREN LBRACE annotation_term RBRACE RPAREN )
            // USE.g:442:1: 'Override' LPAREN LBRACE annotation_term RBRACE RPAREN
            {
            match(input,51,FOLLOW_51_in_annotation_override1949); if (state.failed) return ;

            match(input,LPAREN,FOLLOW_LPAREN_in_annotation_override1951); if (state.failed) return ;

            match(input,LBRACE,FOLLOW_LBRACE_in_annotation_override1953); if (state.failed) return ;

            pushFollow(FOLLOW_annotation_term_in_annotation_override1955);
            annotation_term();

            state._fsp--;
            if (state.failed) return ;

            match(input,RBRACE,FOLLOW_RBRACE_in_annotation_override1957); if (state.failed) return ;

            match(input,RPAREN,FOLLOW_RPAREN_in_annotation_override1959); if (state.failed) return ;

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
    // USE.g:445:1: annotation_term returns [AnnotationTag tag] : annotation_tag[tag] ( COMMA annotation_tag[tag] )* ;
    public final AnnotationTag annotation_term() throws RecognitionException {
        AnnotationTag tag = null;


        tag = new AnnotationTag();
        try {
            // USE.g:446:35: ( annotation_tag[tag] ( COMMA annotation_tag[tag] )* )
            // USE.g:447:2: annotation_tag[tag] ( COMMA annotation_tag[tag] )*
            {
            pushFollow(FOLLOW_annotation_tag_in_annotation_term1976);
            annotation_tag(tag);

            state._fsp--;
            if (state.failed) return tag;

            // USE.g:447:22: ( COMMA annotation_tag[tag] )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==COMMA) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // USE.g:447:23: COMMA annotation_tag[tag]
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_annotation_term1980); if (state.failed) return tag;

            	    pushFollow(FOLLOW_annotation_tag_in_annotation_term1982);
            	    annotation_tag(tag);

            	    state._fsp--;
            	    if (state.failed) return tag;

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
        return tag;
    }
    // $ANTLR end "annotation_term"



    // $ANTLR start "annotation_ref"
    // USE.g:450:1: annotation_ref : AT IDENT DOT annotation_predefined ;
    public final void annotation_ref() throws RecognitionException {
        try {
            // USE.g:450:15: ( AT IDENT DOT annotation_predefined )
            // USE.g:451:2: AT IDENT DOT annotation_predefined
            {
            match(input,AT,FOLLOW_AT_in_annotation_ref1994); if (state.failed) return ;

            match(input,IDENT,FOLLOW_IDENT_in_annotation_ref1996); if (state.failed) return ;

            match(input,DOT,FOLLOW_DOT_in_annotation_ref1998); if (state.failed) return ;

            pushFollow(FOLLOW_annotation_predefined_in_annotation_ref2000);
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
    // USE.g:454:1: annotation_def : 'automatic' ;
    public final void annotation_def() throws RecognitionException {
        try {
            // USE.g:454:15: ( 'automatic' )
            // USE.g:455:2: 'automatic'
            {
            match(input,67,FOLLOW_67_in_annotation_def2009); if (state.failed) return ;

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
    // USE.g:457:1: annotation_enum_type : ( 'Soft' | 'Hard' );
    public final void annotation_enum_type() throws RecognitionException {
        try {
            // USE.g:457:21: ( 'Soft' | 'Hard' )
            // USE.g:
            {
            if ( input.LA(1)==49||input.LA(1)==55 ) {
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



    // $ANTLR start "invariant"
    // USE.g:479:1: invariant returns [ASTConstraintDefinition n] : (tag= block_annotation )? 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* ;
    public final ASTConstraintDefinition invariant() throws RecognitionException {
        ASTConstraintDefinition n = null;


        Token v=null;
        AnnotationTag tag =null;

        ASTSimpleType t =null;

        ASTInvariantClause inv =null;


        try {
            // USE.g:480:5: ( (tag= block_annotation )? 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* )
            // USE.g:481:5: (tag= block_annotation )? 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )*
            {
            if ( state.backtracking==0 ) { n = new ASTConstraintDefinition();}

            // USE.g:482:2: (tag= block_annotation )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==AT) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // USE.g:482:3: tag= block_annotation
                    {
                    pushFollow(FOLLOW_block_annotation_in_invariant2055);
                    tag=block_annotation();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n.addBlockAnnotationTag(tag);}

                    }
                    break;

            }


            match(input,73,FOLLOW_73_in_invariant2066); if (state.failed) return n;

            // USE.g:484:5: (v= IDENT ( ',' v= IDENT )* COLON )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==IDENT) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==COLON||LA56_1==COMMA) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // USE.g:484:7: v= IDENT ( ',' v= IDENT )* COLON
                    {
                    v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant2076); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addVarName(v); }

                    // USE.g:485:8: ( ',' v= IDENT )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==COMMA) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // USE.g:485:9: ',' v= IDENT
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_invariant2088); if (state.failed) return n;

                    	    v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant2092); if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addVarName(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);


                    match(input,COLON,FOLLOW_COLON_in_invariant2100); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_simpleType_in_invariant2112);
            t=simpleType();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setType(t); }

            // USE.g:487:5: (inv= invariantClause )*
            loop57:
            do {
                int alt57=2;
                alt57 = dfa57.predict(input);
                switch (alt57) {
            	case 1 :
            	    // USE.g:487:7: inv= invariantClause
            	    {
            	    pushFollow(FOLLOW_invariantClause_in_invariant2124);
            	    inv=invariantClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

            	    }
            	    break;

            	default :
            	    break loop57;
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
    // USE.g:494:1: invariantClause returns [ASTInvariantClause n] : ( (tag= line_annotation[tag] )* as= annotationSet 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression );
    public final ASTInvariantClause invariantClause() throws RecognitionException {
        ASTInvariantClause n = null;


        Token name=null;
        AnnotationTag tag =null;

        Set<ASTAnnotation> as =null;

        USEParser.expression_return e =null;


        tag = null;
        try {
            // USE.g:495:19: ( (tag= line_annotation[tag] )* as= annotationSet 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==AT||LA61_0==IDENT||LA61_0==59||(LA61_0 >= 64 && LA61_0 <= 65)||LA61_0==83||LA61_0==93||LA61_0==96||(LA61_0 >= 112 && LA61_0 <= 113)) ) {
                alt61=1;
            }
            else if ( (LA61_0==84) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }
            switch (alt61) {
                case 1 :
                    // USE.g:496:2: (tag= line_annotation[tag] )* as= annotationSet 'inv' (name= IDENT )? COLON e= expression
                    {
                    // USE.g:496:2: (tag= line_annotation[tag] )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==AT) ) {
                            int LA58_1 = input.LA(2);

                            if ( (LA58_1==48||LA58_1==52||LA58_1==57) ) {
                                alt58=1;
                            }


                        }


                        switch (alt58) {
                    	case 1 :
                    	    // USE.g:496:3: tag= line_annotation[tag]
                    	    {
                    	    pushFollow(FOLLOW_line_annotation_in_invariantClause2156);
                    	    tag=line_annotation(tag);

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


                    pushFollow(FOLLOW_annotationSet_in_invariantClause2166);
                    as=annotationSet();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,93,FOLLOW_93_in_invariantClause2173); if (state.failed) return n;

                    // USE.g:498:12: (name= IDENT )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==IDENT) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // USE.g:498:14: name= IDENT
                            {
                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause2179); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,COLON,FOLLOW_COLON_in_invariantClause2184); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_invariantClause2188);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTInvariantClause(name, (e!=null?e.n:null)); n.setAnnotations(as);n.setAnnotationTag(tag);}

                    }
                    break;
                case 2 :
                    // USE.g:500:7: 'existential' 'inv' (name= IDENT )? COLON e= expression
                    {
                    match(input,84,FOLLOW_84_in_invariantClause2205); if (state.failed) return n;

                    match(input,93,FOLLOW_93_in_invariantClause2207); if (state.failed) return n;

                    // USE.g:500:27: (name= IDENT )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==IDENT) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // USE.g:500:29: name= IDENT
                            {
                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause2213); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,COLON,FOLLOW_COLON_in_invariantClause2218); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_invariantClause2222);
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
    // USE.g:512:1: prePost returns [ASTPrePost n] : 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ ;
    public final ASTPrePost prePost() throws RecognitionException {
        ASTPrePost n = null;


        Token classname=null;
        Token opname=null;
        List<ASTVariableDeclaration> pl =null;

        ASTType rt =null;

        ASTPrePostClause ppc =null;


        try {
            // USE.g:513:5: ( 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ )
            // USE.g:514:5: 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+
            {
            match(input,73,FOLLOW_73_in_prePost2255); if (state.failed) return n;

            classname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost2259); if (state.failed) return n;

            match(input,COLON_COLON,FOLLOW_COLON_COLON_in_prePost2261); if (state.failed) return n;

            opname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost2265); if (state.failed) return n;

            pushFollow(FOLLOW_paramList_in_prePost2269);
            pl=paramList();

            state._fsp--;
            if (state.failed) return n;

            // USE.g:514:69: ( COLON rt= type )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==COLON) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // USE.g:514:71: COLON rt= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_prePost2273); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_prePost2277);
                    rt=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n = new ASTPrePost(classname, opname, pl, rt); }

            // USE.g:516:5: (ppc= prePostClause )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                alt63 = dfa63.predict(input);
                switch (alt63) {
            	case 1 :
            	    // USE.g:516:7: ppc= prePostClause
            	    {
            	    pushFollow(FOLLOW_prePostClause_in_prePost2296);
            	    ppc=prePostClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addPrePostClause(ppc); }

            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
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
    // USE.g:523:1: prePostClause returns [ASTPrePostClause n] : as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression ;
    public final ASTPrePostClause prePostClause() throws RecognitionException {
        ASTPrePostClause n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        USEParser.expression_return e =null;


         Token t = null; 
        try {
            // USE.g:525:2: (as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression )
            // USE.g:526:2: as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression
            {
            pushFollow(FOLLOW_annotationSet_in_prePostClause2330);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { t = input.LT(1); }

            if ( (input.LA(1) >= 112 && input.LA(1) <= 113) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // USE.g:528:25: (name= IDENT )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==IDENT) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // USE.g:528:27: name= IDENT
                    {
                    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePostClause2357); if (state.failed) return n;

                    }
                    break;

            }


            match(input,COLON,FOLLOW_COLON_in_prePostClause2362); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_prePostClause2366);
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
    // USE.g:532:1: annotationSet returns [Set<ASTAnnotation> annotations] : (an= annotation )* ;
    public final Set<ASTAnnotation> annotationSet() throws RecognitionException {
        Set<ASTAnnotation> annotations = null;


        ASTAnnotation an =null;


         annotations = new HashSet<ASTAnnotation>(); 
        try {
            // USE.g:534:2: ( (an= annotation )* )
            // USE.g:535:2: (an= annotation )*
            {
            // USE.g:535:2: (an= annotation )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==AT) ) {
                    int LA65_2 = input.LA(2);

                    if ( (LA65_2==IDENT) ) {
                        int LA65_3 = input.LA(3);

                        if ( (LA65_3==LPAREN) ) {
                            alt65=1;
                        }


                    }


                }


                switch (alt65) {
            	case 1 :
            	    // USE.g:535:3: an= annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotationSet2393);
            	    an=annotation();

            	    state._fsp--;
            	    if (state.failed) return annotations;

            	    if ( state.backtracking==0 ) { annotations.add(an); }

            	    }
            	    break;

            	default :
            	    break loop65;
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
    // USE.g:538:1: annotation returns [ASTAnnotation n] : AT name= IDENT LPAREN values= annotationValues RPAREN ;
    public final ASTAnnotation annotation() throws RecognitionException {
        ASTAnnotation n = null;


        Token name=null;
        Map<Token, Token> values =null;


        try {
            // USE.g:538:37: ( AT name= IDENT LPAREN values= annotationValues RPAREN )
            // USE.g:539:2: AT name= IDENT LPAREN values= annotationValues RPAREN
            {
            match(input,AT,FOLLOW_AT_in_annotation2412); if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotation2416); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = new ASTAnnotation(name);}

            match(input,LPAREN,FOLLOW_LPAREN_in_annotation2422); if (state.failed) return n;

            pushFollow(FOLLOW_annotationValues_in_annotation2431);
            values=annotationValues();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setValues(values); }

            match(input,RPAREN,FOLLOW_RPAREN_in_annotation2436); if (state.failed) return n;

            }

        }
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
    // USE.g:545:1: annotationValues returns [Map<Token, Token> values] : (firstVal= annotationValue )? ( COMMA val= annotationValue )* ;
    public final Map<Token, Token> annotationValues() throws RecognitionException {
        Map<Token, Token> values = null;


        USEParser.annotationValue_return firstVal =null;

        USEParser.annotationValue_return val =null;


         values = new HashMap<Token, Token>(); 
        try {
            // USE.g:547:2: ( (firstVal= annotationValue )? ( COMMA val= annotationValue )* )
            // USE.g:548:2: (firstVal= annotationValue )? ( COMMA val= annotationValue )*
            {
            // USE.g:548:2: (firstVal= annotationValue )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==IDENT) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // USE.g:548:3: firstVal= annotationValue
                    {
                    pushFollow(FOLLOW_annotationValue_in_annotationValues2459);
                    firstVal=annotationValue();

                    state._fsp--;
                    if (state.failed) return values;

                    if ( state.backtracking==0 ) { values.put((firstVal!=null?firstVal.name:null), (firstVal!=null?firstVal.value:null)); }

                    }
                    break;

            }


            // USE.g:549:2: ( COMMA val= annotationValue )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==COMMA) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // USE.g:549:3: COMMA val= annotationValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_annotationValues2467); if (state.failed) return values;

            	    pushFollow(FOLLOW_annotationValue_in_annotationValues2471);
            	    val=annotationValue();

            	    state._fsp--;
            	    if (state.failed) return values;

            	    if ( state.backtracking==0 ) { values.put((val!=null?val.name:null), (val!=null?val.value:null)); }

            	    }
            	    break;

            	default :
            	    break loop67;
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
    // USE.g:552:1: annotationValue returns [Token name, Token value] : aName= IDENT EQUAL aValue= NON_OCL_STRING ;
    public final USEParser.annotationValue_return annotationValue() throws RecognitionException {
        USEParser.annotationValue_return retval = new USEParser.annotationValue_return();
        retval.start = input.LT(1);


        Token aName=null;
        Token aValue=null;

        try {
            // USE.g:552:50: (aName= IDENT EQUAL aValue= NON_OCL_STRING )
            // USE.g:553:2: aName= IDENT EQUAL aValue= NON_OCL_STRING
            {
            aName=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotationValue2490); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.name = aName; }

            match(input,EQUAL,FOLLOW_EQUAL_in_annotationValue2495); if (state.failed) return retval;

            aValue=(Token)match(input,NON_OCL_STRING,FOLLOW_NON_OCL_STRING_in_annotationValue2501); if (state.failed) return retval;

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
    // USE.g:558:1: stateMachine returns [ASTStateMachine n] : ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end' ;
    public final ASTStateMachine stateMachine() throws RecognitionException {
        ASTStateMachine n = null;


        Token smName=null;
        ASTStateDefinition s =null;

        ASTTransitionDefinition t =null;


        try {
            // USE.g:559:5: ( ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end' )
            // USE.g:560:5: ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end'
            {
            // USE.g:560:5: ( 'psm' )
            // USE.g:561:8: 'psm'
            {
            match(input,114,FOLLOW_114_in_stateMachine2531); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTProtocolStateMachine(); }

            }


            smName=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateMachine2564); if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setName(smName); }

            match(input,120,FOLLOW_120_in_stateMachine2577); if (state.failed) return n;

            // USE.g:568:10: (s= stateDefinition )+
            int cnt68=0;
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==IDENT) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // USE.g:568:11: s= stateDefinition
            	    {
            	    pushFollow(FOLLOW_stateDefinition_in_stateMachine2593);
            	    s=stateDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addStateDefinition(s); }

            	    }
            	    break;

            	default :
            	    if ( cnt68 >= 1 ) break loop68;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(68, input);
                        throw eee;
                }
                cnt68++;
            } while (true);


            match(input,123,FOLLOW_123_in_stateMachine2603); if (state.failed) return n;

            // USE.g:570:10: (t= transitionDefinition )+
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
            	    // USE.g:570:11: t= transitionDefinition
            	    {
            	    pushFollow(FOLLOW_transitionDefinition_in_stateMachine2619);
            	    t=transitionDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addTransitionDefinition(t); }

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


            match(input,81,FOLLOW_81_in_stateMachine2629); if (state.failed) return n;

            }

        }
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
    // USE.g:574:1: stateDefinition returns [ASTStateDefinition n] : sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )? ;
    public final ASTStateDefinition stateDefinition() throws RecognitionException {
        ASTStateDefinition n = null;


        Token sn=null;
        Token stateType=null;
        USEParser.expression_return stateInv =null;


        try {
            // USE.g:574:47: (sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )? )
            // USE.g:575:3: sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )?
            {
            sn=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateDefinition2645); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = new ASTStateDefinition(sn); }

            // USE.g:576:3: ( COLON stateType= IDENT )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==COLON) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // USE.g:576:5: COLON stateType= IDENT
                    {
                    match(input,COLON,FOLLOW_COLON_in_stateDefinition2653); if (state.failed) return n;

                    stateType=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateDefinition2657); if (state.failed) return n;

                    if ( state.backtracking==0 ) {n.setType(stateType); }

                    }
                    break;

            }


            // USE.g:577:3: ( LBRACK stateInv= expression RBRACK )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==LBRACK) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // USE.g:577:5: LBRACK stateInv= expression RBRACK
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_stateDefinition2668); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_stateDefinition2674);
                    stateInv=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RBRACK,FOLLOW_RBRACK_in_stateDefinition2676); if (state.failed) return n;

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
    // USE.g:580:1: transitionDefinition returns [ASTTransitionDefinition n] : source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )? ;
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
            // USE.g:580:57: (source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )? )
            // USE.g:581:3: source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )?
            {
            source=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition2697); if (state.failed) return n;

            match(input,ARROW,FOLLOW_ARROW_in_transitionDefinition2699); if (state.failed) return n;

            target=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition2703); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTransitionDefinition(source, target); }

            // USE.g:582:5: ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==LBRACE) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // USE.g:582:6: LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_transitionDefinition2713); if (state.failed) return n;

                    // USE.g:583:7: ( LBRACK pre= expression RBRACK )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==LBRACK) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // USE.g:583:8: LBRACK pre= expression RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_transitionDefinition2723); if (state.failed) return n;

                            pushFollow(FOLLOW_expression_in_transitionDefinition2727);
                            pre=expression();

                            state._fsp--;
                            if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setPreCondition((pre!=null?pre.n:null)); }

                            match(input,RBRACK,FOLLOW_RBRACK_in_transitionDefinition2731); if (state.failed) return n;

                            }
                            break;

                    }


                    // USE.g:584:7: (e= event |o= IDENT LPAREN (args= paramList )? RPAREN )
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==74) ) {
                        alt74=1;
                    }
                    else if ( (LA74_0==IDENT) ) {
                        alt74=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 0, input);

                        throw nvae;

                    }
                    switch (alt74) {
                        case 1 :
                            // USE.g:585:11: e= event
                            {
                            pushFollow(FOLLOW_event_in_transitionDefinition2755);
                            e=event();

                            state._fsp--;
                            if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setEvent(e); }

                            }
                            break;
                        case 2 :
                            // USE.g:586:11: o= IDENT LPAREN (args= paramList )? RPAREN
                            {
                            o=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition2771); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setOperation(o); }

                            match(input,LPAREN,FOLLOW_LPAREN_in_transitionDefinition2775); if (state.failed) return n;

                            // USE.g:586:50: (args= paramList )?
                            int alt73=2;
                            int LA73_0 = input.LA(1);

                            if ( (LA73_0==LPAREN) ) {
                                alt73=1;
                            }
                            switch (alt73) {
                                case 1 :
                                    // USE.g:586:51: args= paramList
                                    {
                                    pushFollow(FOLLOW_paramList_in_transitionDefinition2780);
                                    args=paramList();

                                    state._fsp--;
                                    if (state.failed) return n;

                                    if ( state.backtracking==0 ) { n.setOperationArgs(args); }

                                    }
                                    break;

                            }


                            match(input,RPAREN,FOLLOW_RPAREN_in_transitionDefinition2787); if (state.failed) return n;

                            }
                            break;

                    }


                    // USE.g:588:7: ( LBRACK post= expression RBRACK )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==LBRACK) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // USE.g:588:8: LBRACK post= expression RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_transitionDefinition2804); if (state.failed) return n;

                            pushFollow(FOLLOW_expression_in_transitionDefinition2808);
                            post=expression();

                            state._fsp--;
                            if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setPostCondition((post!=null?post.n:null)); }

                            match(input,RBRACK,FOLLOW_RBRACK_in_transitionDefinition2812); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,RBRACE,FOLLOW_RBRACE_in_transitionDefinition2820); if (state.failed) return n;

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
    // USE.g:592:1: event returns [Token t] : tcr= 'create' ;
    public final Token event() throws RecognitionException {
        Token t = null;


        Token tcr=null;

        try {
            // USE.g:592:24: (tcr= 'create' )
            // USE.g:593:5: tcr= 'create'
            {
            tcr=(Token)match(input,74,FOLLOW_74_in_event2842); if (state.failed) return t;

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
    // USE.g:596:1: signalDefinition[boolean isAbstract] returns [ASTSignal n] : keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' ;
    public final ASTSignal signalDefinition(boolean isAbstract) throws RecognitionException {
        ASTSignal n = null;


        Token name=null;
        List idListRes =null;

        ASTAttribute a =null;

        ASTInvariantClause inv =null;


        try {
            // USE.g:596:59: ( keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' )
            // USE.g:597:5: keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end'
            {
            pushFollow(FOLLOW_keySignal_in_signalDefinition2862);
            keySignal();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_signalDefinition2866); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTSignal(name, isAbstract); }

            // USE.g:599:5: ( LESS idListRes= idList )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==LESS) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // USE.g:599:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_signalDefinition2881); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_signalDefinition2885);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addGenerals(idListRes); }

                    }
                    break;

            }


            // USE.g:600:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==66) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // USE.g:600:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,66,FOLLOW_66_in_signalDefinition2898); if (state.failed) return n;

                    // USE.g:601:7: (a= attributeDefinition )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==AT||LA78_0==IDENT||LA78_0==59||(LA78_0 >= 64 && LA78_0 <= 65)||LA78_0==83||LA78_0==93||LA78_0==96||(LA78_0 >= 112 && LA78_0 <= 113)) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // USE.g:601:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_signalDefinition2911);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addAttribute(a); }

                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:603:5: ( 'constraints' (inv= invariantClause )* )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==72) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // USE.g:603:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,72,FOLLOW_72_in_signalDefinition2932); if (state.failed) return n;

                    // USE.g:604:7: (inv= invariantClause )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==AT||LA80_0==IDENT||LA80_0==59||(LA80_0 >= 64 && LA80_0 <= 65)||(LA80_0 >= 83 && LA80_0 <= 84)||LA80_0==93||LA80_0==96||(LA80_0 >= 112 && LA80_0 <= 113)) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // USE.g:605:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_signalDefinition2952);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,81,FOLLOW_81_in_signalDefinition2976); if (state.failed) return n;

            }

        }
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
    // USE.g:611:1: keyUnion :{...}? IDENT ;
    public final void keyUnion() throws RecognitionException {
        try {
            // USE.g:611:9: ({...}? IDENT )
            // USE.g:612:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("union"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyUnion", "input.LT(1).getText().equals(\"union\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyUnion2994); if (state.failed) return ;

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
    // USE.g:614:1: keyAssociation :{...}? IDENT ;
    public final void keyAssociation() throws RecognitionException {
        try {
            // USE.g:614:15: ({...}? IDENT )
            // USE.g:615:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("association"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyAssociation", "input.LT(1).getText().equals(\"association\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyAssociation3008); if (state.failed) return ;

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
    // USE.g:617:1: keyRole :{...}? IDENT ;
    public final void keyRole() throws RecognitionException {
        try {
            // USE.g:617:8: ({...}? IDENT )
            // USE.g:618:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("role"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyRole", "input.LT(1).getText().equals(\"role\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyRole3022); if (state.failed) return ;

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
    // USE.g:620:1: keyComposition :{...}? IDENT ;
    public final void keyComposition() throws RecognitionException {
        try {
            // USE.g:620:15: ({...}? IDENT )
            // USE.g:621:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("composition"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyComposition", "input.LT(1).getText().equals(\"composition\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyComposition3034); if (state.failed) return ;

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
    // USE.g:623:1: keyAggregation :{...}? IDENT ;
    public final void keyAggregation() throws RecognitionException {
        try {
            // USE.g:623:15: ({...}? IDENT )
            // USE.g:624:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("aggregation"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyAggregation", "input.LT(1).getText().equals(\"aggregation\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyAggregation3046); if (state.failed) return ;

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
    // USE.g:626:1: keyClass :{...}? IDENT ;
    public final void keyClass() throws RecognitionException {
        try {
            // USE.g:626:9: ({...}? IDENT )
            // USE.g:627:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("class"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyClass", "input.LT(1).getText().equals(\"class\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyClass3060); if (state.failed) return ;

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
    // USE.g:629:1: keySignal :{...}? IDENT ;
    public final void keySignal() throws RecognitionException {
        try {
            // USE.g:629:10: ({...}? IDENT )
            // USE.g:630:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("signal"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keySignal", "input.LT(1).getText().equals(\"signal\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keySignal3072); if (state.failed) return ;

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
    // USE.g:632:1: keyDerived :{...}? IDENT ;
    public final void keyDerived() throws RecognitionException {
        try {
            // USE.g:632:11: ({...}? IDENT )
            // USE.g:633:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("derived"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyDerived", "input.LT(1).getText().equals(\"derived\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyDerived3086); if (state.failed) return ;

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
    // USE.g:635:1: keyDerive :{...}? IDENT ;
    public final void keyDerive() throws RecognitionException {
        try {
            // USE.g:635:10: ({...}? IDENT )
            // USE.g:636:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("derive"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyDerive", "input.LT(1).getText().equals(\"derive\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyDerive3100); if (state.failed) return ;

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
    // USE.g:638:1: keyInit :{...}? IDENT ;
    public final void keyInit() throws RecognitionException {
        try {
            // USE.g:638:8: ({...}? IDENT )
            // USE.g:639:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("init"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyInit", "input.LT(1).getText().equals(\"init\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyInit3112); if (state.failed) return ;

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
    // USE.g:641:1: keyQualifier :{...}? IDENT ;
    public final void keyQualifier() throws RecognitionException {
        try {
            // USE.g:641:13: ({...}? IDENT )
            // USE.g:642:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("qualifier"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyQualifier", "input.LT(1).getText().equals(\"qualifier\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyQualifier3128); if (state.failed) return ;

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



    // $ANTLR start "checkExpr"
    // USE.g:643:1: checkExpr returns [QAst expr] : ( 'verify' qexpr= queryExpr ( ( '&&' right_expr= queryExpr ) | ( '||' right_expr= queryExpr ) | ( '=>' right_expr= queryExpr ) )* EOF |mexpr= moduleExpr (mexpr= moduleExpr )* EOF );
    public final QAst checkExpr() throws RecognitionException {
        QAst expr = null;


        QueryExpr qexpr =null;

        QueryExpr right_expr =null;

        ModuleExpr mexpr =null;


        try {
            // USE.g:643:30: ( 'verify' qexpr= queryExpr ( ( '&&' right_expr= queryExpr ) | ( '||' right_expr= queryExpr ) | ( '=>' right_expr= queryExpr ) )* EOF |mexpr= moduleExpr (mexpr= moduleExpr )* EOF )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==125) ) {
                alt84=1;
            }
            else if ( (LA84_0==97) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;

            }
            switch (alt84) {
                case 1 :
                    // USE.g:644:5: 'verify' qexpr= queryExpr ( ( '&&' right_expr= queryExpr ) | ( '||' right_expr= queryExpr ) | ( '=>' right_expr= queryExpr ) )* EOF
                    {
                    match(input,125,FOLLOW_125_in_checkExpr3143); if (state.failed) return expr;

                    pushFollow(FOLLOW_queryExpr_in_checkExpr3147);
                    qexpr=queryExpr();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =qexpr;}

                    // USE.g:645:10: ( ( '&&' right_expr= queryExpr ) | ( '||' right_expr= queryExpr ) | ( '=>' right_expr= queryExpr ) )*
                    loop82:
                    do {
                        int alt82=4;
                        switch ( input.LA(1) ) {
                        case 44:
                            {
                            alt82=1;
                            }
                            break;
                        case 129:
                            {
                            alt82=2;
                            }
                            break;
                        case 45:
                            {
                            alt82=3;
                            }
                            break;

                        }

                        switch (alt82) {
                    	case 1 :
                    	    // USE.g:646:13: ( '&&' right_expr= queryExpr )
                    	    {
                    	    // USE.g:646:13: ( '&&' right_expr= queryExpr )
                    	    // USE.g:646:14: '&&' right_expr= queryExpr
                    	    {
                    	    match(input,44,FOLLOW_44_in_checkExpr3175); if (state.failed) return expr;

                    	    pushFollow(FOLLOW_queryExpr_in_checkExpr3179);
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
                    	    // USE.g:652:13: ( '||' right_expr= queryExpr )
                    	    {
                    	    // USE.g:652:13: ( '||' right_expr= queryExpr )
                    	    // USE.g:652:14: '||' right_expr= queryExpr
                    	    {
                    	    match(input,129,FOLLOW_129_in_checkExpr3237); if (state.failed) return expr;

                    	    pushFollow(FOLLOW_queryExpr_in_checkExpr3241);
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
                    	    // USE.g:658:13: ( '=>' right_expr= queryExpr )
                    	    {
                    	    // USE.g:658:13: ( '=>' right_expr= queryExpr )
                    	    // USE.g:658:15: '=>' right_expr= queryExpr
                    	    {
                    	    match(input,45,FOLLOW_45_in_checkExpr3300); if (state.failed) return expr;

                    	    pushFollow(FOLLOW_queryExpr_in_checkExpr3306);
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
                    	    break loop82;
                        }
                    } while (true);


                    match(input,EOF,FOLLOW_EOF_in_checkExpr3352); if (state.failed) return expr;

                    }
                    break;
                case 2 :
                    // USE.g:665:9: mexpr= moduleExpr (mexpr= moduleExpr )* EOF
                    {
                    pushFollow(FOLLOW_moduleExpr_in_checkExpr3370);
                    mexpr=moduleExpr();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr = new ModuleListExpr(); ((ModuleListExpr)expr).addModule(mexpr);}

                    // USE.g:666:9: (mexpr= moduleExpr )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==97) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // USE.g:666:10: mexpr= moduleExpr
                    	    {
                    	    pushFollow(FOLLOW_moduleExpr_in_checkExpr3386);
                    	    mexpr=moduleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return expr;

                    	    if ( state.backtracking==0 ) {((ModuleListExpr)expr).addModule(mexpr);}

                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);


                    match(input,EOF,FOLLOW_EOF_in_checkExpr3392); if (state.failed) return expr;

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
    // USE.g:669:1: queryExpr returns [QueryExpr qexpr] : ( 'select' f= featureExpr ( COMMA f= featureExpr )* (with= withExpr )? (without= butExpr )? ( 'as' name= IDENT )? |alias= IDENT );
    public final QueryExpr queryExpr() throws RecognitionException {
        QueryExpr qexpr = null;


        Token name=null;
        Token alias=null;
        QFeatureExpr f =null;

        QWithExpr with =null;

        QButExpr without =null;



            qexpr = new QueryExpr();

        try {
            // USE.g:671:2: ( 'select' f= featureExpr ( COMMA f= featureExpr )* (with= withExpr )? (without= butExpr )? ( 'as' name= IDENT )? |alias= IDENT )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==116) ) {
                alt89=1;
            }
            else if ( (LA89_0==IDENT) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return qexpr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;

            }
            switch (alt89) {
                case 1 :
                    // USE.g:672:5: 'select' f= featureExpr ( COMMA f= featureExpr )* (with= withExpr )? (without= butExpr )? ( 'as' name= IDENT )?
                    {
                    match(input,116,FOLLOW_116_in_queryExpr3413); if (state.failed) return qexpr;

                    pushFollow(FOLLOW_featureExpr_in_queryExpr3417);
                    f=featureExpr();

                    state._fsp--;
                    if (state.failed) return qexpr;

                    if ( state.backtracking==0 ) {qexpr.addFeature(f);}

                    // USE.g:672:52: ( COMMA f= featureExpr )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==COMMA) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // USE.g:672:53: COMMA f= featureExpr
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_queryExpr3422); if (state.failed) return qexpr;

                    	    pushFollow(FOLLOW_featureExpr_in_queryExpr3426);
                    	    f=featureExpr();

                    	    state._fsp--;
                    	    if (state.failed) return qexpr;

                    	    if ( state.backtracking==0 ) {qexpr.addFeature(f);}

                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);


                    // USE.g:673:9: (with= withExpr )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==127) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // USE.g:673:10: with= withExpr
                            {
                            pushFollow(FOLLOW_withExpr_in_queryExpr3444);
                            with=withExpr();

                            state._fsp--;
                            if (state.failed) return qexpr;

                            if ( state.backtracking==0 ) {qexpr.addWithExpr(with);}

                            }
                            break;

                    }


                    // USE.g:674:9: (without= butExpr )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==70) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // USE.g:674:10: without= butExpr
                            {
                            pushFollow(FOLLOW_butExpr_in_queryExpr3462);
                            without=butExpr();

                            state._fsp--;
                            if (state.failed) return qexpr;

                            if ( state.backtracking==0 ) {qexpr.addWithoutExpr(without);}

                            }
                            break;

                    }


                    // USE.g:675:9: ( 'as' name= IDENT )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==63) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // USE.g:675:10: 'as' name= IDENT
                            {
                            match(input,63,FOLLOW_63_in_queryExpr3479); if (state.failed) return qexpr;

                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpr3483); if (state.failed) return qexpr;

                            if ( state.backtracking==0 ) {qexpr.setAlias(name.getText());}

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // USE.g:676:6: alias= IDENT
                    {
                    alias=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpr3499); if (state.failed) return qexpr;

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
    // USE.g:683:1: featureExpr returns [QFeatureExpr feature] : ( (modifier= modifiers )? dest= ( IDENT | STAR ) ( rankExpr )? |f1= attrExpr |f2= assocExpr );
    public final QFeatureExpr featureExpr() throws RecognitionException {
        QFeatureExpr feature = null;


        Token dest=null;
        Modifier modifier =null;

        QAttrExpr f1 =null;

        QAssocExpr f2 =null;


        try {
            // USE.g:683:43: ( (modifier= modifiers )? dest= ( IDENT | STAR ) ( rankExpr )? |f1= attrExpr |f2= assocExpr )
            int alt92=3;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==60||LA92_0==99||LA92_0==108) ) {
                alt92=1;
            }
            else if ( (LA92_0==IDENT||LA92_0==STAR) ) {
                switch ( input.LA(2) ) {
                case DOT:
                    {
                    alt92=2;
                    }
                    break;
                case COLON:
                    {
                    alt92=3;
                    }
                    break;
                case EOF:
                case AT:
                case COMMA:
                case IDENT:
                case 44:
                case 45:
                case 63:
                case 70:
                case 81:
                case 116:
                case 127:
                case 129:
                    {
                    alt92=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return feature;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 92, 2, input);

                    throw nvae;

                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return feature;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;

            }
            switch (alt92) {
                case 1 :
                    // USE.g:684:5: (modifier= modifiers )? dest= ( IDENT | STAR ) ( rankExpr )?
                    {
                    // USE.g:684:5: (modifier= modifiers )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==60||LA90_0==99||LA90_0==108) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // USE.g:684:6: modifier= modifiers
                            {
                            pushFollow(FOLLOW_modifiers_in_featureExpr3529);
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


                    // USE.g:684:46: ( rankExpr )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==AT) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // USE.g:684:47: rankExpr
                            {
                            pushFollow(FOLLOW_rankExpr_in_featureExpr3543);
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
                    // USE.g:688:7: f1= attrExpr
                    {
                    pushFollow(FOLLOW_attrExpr_in_featureExpr3563);
                    f1=attrExpr();

                    state._fsp--;
                    if (state.failed) return feature;

                    if ( state.backtracking==0 ) {feature =f1;}

                    }
                    break;
                case 3 :
                    // USE.g:689:7: f2= assocExpr
                    {
                    pushFollow(FOLLOW_assocExpr_in_featureExpr3577);
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
    // USE.g:692:1: modifiers returns [Modifier m] : ( 'only' | 'no' | 'all' );
    public final Modifier modifiers() throws RecognitionException {
        Modifier m = null;


        try {
            // USE.g:692:31: ( 'only' | 'no' | 'all' )
            int alt93=3;
            switch ( input.LA(1) ) {
            case 108:
                {
                alt93=1;
                }
                break;
            case 99:
                {
                alt93=2;
                }
                break;
            case 60:
                {
                alt93=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return m;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;

            }

            switch (alt93) {
                case 1 :
                    // USE.g:693:5: 'only'
                    {
                    match(input,108,FOLLOW_108_in_modifiers3595); if (state.failed) return m;

                    if ( state.backtracking==0 ) {m =Modifier.ONLY;}

                    }
                    break;
                case 2 :
                    // USE.g:695:5: 'no'
                    {
                    match(input,99,FOLLOW_99_in_modifiers3609); if (state.failed) return m;

                    if ( state.backtracking==0 ) {m =Modifier.NO;}

                    }
                    break;
                case 3 :
                    // USE.g:697:6: 'all'
                    {
                    match(input,60,FOLLOW_60_in_modifiers3619); if (state.failed) return m;

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
    // USE.g:699:1: attrExpr returns [QAttrExpr attr] : src= ( IDENT | STAR ) DOT dest= ( IDENT | STAR ) ( rankExpr )? ;
    public final QAttrExpr attrExpr() throws RecognitionException {
        QAttrExpr attr = null;


        Token src=null;
        Token dest=null;

        try {
            // USE.g:699:34: (src= ( IDENT | STAR ) DOT dest= ( IDENT | STAR ) ( rankExpr )? )
            // USE.g:700:5: src= ( IDENT | STAR ) DOT dest= ( IDENT | STAR ) ( rankExpr )?
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


            match(input,DOT,FOLLOW_DOT_in_attrExpr3644); if (state.failed) return attr;

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


            // USE.g:700:44: ( rankExpr )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==AT) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // USE.g:700:45: rankExpr
                    {
                    pushFollow(FOLLOW_rankExpr_in_attrExpr3655);
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
    // USE.g:703:1: assocExpr returns [QAssocExpr assoc] : src= ( IDENT | STAR ) COLON name= ( IDENT | STAR ) COLON dest= ( IDENT | STAR ) ( rankExpr )? ;
    public final QAssocExpr assocExpr() throws RecognitionException {
        QAssocExpr assoc = null;


        Token src=null;
        Token name=null;
        Token dest=null;

        try {
            // USE.g:704:3: (src= ( IDENT | STAR ) COLON name= ( IDENT | STAR ) COLON dest= ( IDENT | STAR ) ( rankExpr )? )
            // USE.g:704:3: src= ( IDENT | STAR ) COLON name= ( IDENT | STAR ) COLON dest= ( IDENT | STAR ) ( rankExpr )?
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


            match(input,COLON,FOLLOW_COLON_in_assocExpr3680); if (state.failed) return assoc;

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


            match(input,COLON,FOLLOW_COLON_in_assocExpr3690); if (state.failed) return assoc;

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


            // USE.g:704:68: ( rankExpr )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==AT) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // USE.g:704:69: rankExpr
                    {
                    pushFollow(FOLLOW_rankExpr_in_assocExpr3701);
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
    // USE.g:708:1: withExpr returns [QWithExpr with] : 'with' w= invExpr ( COMMA w= invExpr )* ;
    public final QWithExpr withExpr() throws RecognitionException {
        QWithExpr with = null;


        QInvExpr w =null;



            with = new QWithExpr();

        try {
            // USE.g:710:2: ( 'with' w= invExpr ( COMMA w= invExpr )* )
            // USE.g:711:5: 'with' w= invExpr ( COMMA w= invExpr )*
            {
            match(input,127,FOLLOW_127_in_withExpr3730); if (state.failed) return with;

            pushFollow(FOLLOW_invExpr_in_withExpr3734);
            w=invExpr();

            state._fsp--;
            if (state.failed) return with;

            if ( state.backtracking==0 ) {with.addInvExpr(w);}

            // USE.g:711:44: ( COMMA w= invExpr )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==COMMA) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // USE.g:711:45: COMMA w= invExpr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_withExpr3738); if (state.failed) return with;

            	    pushFollow(FOLLOW_invExpr_in_withExpr3742);
            	    w=invExpr();

            	    state._fsp--;
            	    if (state.failed) return with;

            	    if ( state.backtracking==0 ) {with.addInvExpr(w);}

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
        return with;
    }
    // $ANTLR end "withExpr"



    // $ANTLR start "butExpr"
    // USE.g:713:1: butExpr returns [QButExpr without] : 'but' w= invExpr ( COMMA w= invExpr )* ;
    public final QButExpr butExpr() throws RecognitionException {
        QButExpr without = null;


        QInvExpr w =null;



            without = new QButExpr();

        try {
            // USE.g:716:5: ( 'but' w= invExpr ( COMMA w= invExpr )* )
            // USE.g:717:5: 'but' w= invExpr ( COMMA w= invExpr )*
            {
            match(input,70,FOLLOW_70_in_butExpr3765); if (state.failed) return without;

            pushFollow(FOLLOW_invExpr_in_butExpr3769);
            w=invExpr();

            state._fsp--;
            if (state.failed) return without;

            if ( state.backtracking==0 ) {without.addInvExpr(w);}

            // USE.g:717:46: ( COMMA w= invExpr )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==COMMA) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // USE.g:717:47: COMMA w= invExpr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_butExpr3773); if (state.failed) return without;

            	    pushFollow(FOLLOW_invExpr_in_butExpr3777);
            	    w=invExpr();

            	    state._fsp--;
            	    if (state.failed) return without;

            	    if ( state.backtracking==0 ) {without.addInvExpr(w);}

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
        return without;
    }
    // $ANTLR end "butExpr"



    // $ANTLR start "invExpr"
    // USE.g:720:1: invExpr returns [QInvExpr inv] : src= ( IDENT | STAR ) COLON_COLON dest= ( IDENT | STAR ) ( rankExpr )? ;
    public final QInvExpr invExpr() throws RecognitionException {
        QInvExpr inv = null;


        Token src=null;
        Token dest=null;

        try {
            // USE.g:720:31: (src= ( IDENT | STAR ) COLON_COLON dest= ( IDENT | STAR ) ( rankExpr )? )
            // USE.g:721:5: src= ( IDENT | STAR ) COLON_COLON dest= ( IDENT | STAR ) ( rankExpr )?
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


            match(input,COLON_COLON,FOLLOW_COLON_COLON_in_invExpr3805); if (state.failed) return inv;

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


            // USE.g:721:52: ( rankExpr )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==AT) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // USE.g:721:53: rankExpr
                    {
                    pushFollow(FOLLOW_rankExpr_in_invExpr3816);
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
    // USE.g:724:1: rankExpr returns [int rank] : AT k= INT ;
    public final int rankExpr() throws RecognitionException {
        int rank = 0;


        Token k=null;

        try {
            // USE.g:724:28: ( AT k= INT )
            // USE.g:725:5: AT k= INT
            {
            match(input,AT,FOLLOW_AT_in_rankExpr3836); if (state.failed) return rank;

            k=(Token)match(input,INT,FOLLOW_INT_in_rankExpr3840); if (state.failed) return rank;

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
    // USE.g:728:1: moduleExpr returns [ModuleExpr mexpr] : 'module' name= IDENT query= queryExpr (query= queryExpr )* 'end' ;
    public final ModuleExpr moduleExpr() throws RecognitionException {
        ModuleExpr mexpr = null;


        Token name=null;
        QueryExpr query =null;


        try {
            // USE.g:728:38: ( 'module' name= IDENT query= queryExpr (query= queryExpr )* 'end' )
            // USE.g:729:5: 'module' name= IDENT query= queryExpr (query= queryExpr )* 'end'
            {
            match(input,97,FOLLOW_97_in_moduleExpr3858); if (state.failed) return mexpr;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_moduleExpr3862); if (state.failed) return mexpr;

            if ( state.backtracking==0 ) {mexpr = new ModuleExpr(name.getText());}

            pushFollow(FOLLOW_queryExpr_in_moduleExpr3876);
            query=queryExpr();

            state._fsp--;
            if (state.failed) return mexpr;

            if ( state.backtracking==0 ) {mexpr.addQuery(query);}

            // USE.g:731:9: (query= queryExpr )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==IDENT||LA99_0==116) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // USE.g:731:10: query= queryExpr
            	    {
            	    pushFollow(FOLLOW_queryExpr_in_moduleExpr3892);
            	    query=queryExpr();

            	    state._fsp--;
            	    if (state.failed) return mexpr;

            	    if ( state.backtracking==0 ) {mexpr.addQuery(query);}

            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);


            match(input,81,FOLLOW_81_in_moduleExpr3902); if (state.failed) return mexpr;

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



    // $ANTLR start "expressionOnly"
    // USE.g:761:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;


        USEParser.expression_return nExp =null;


        try {
            // USE.g:762:5: (nExp= expression EOF )
            // USE.g:763:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly3929);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_expressionOnly3931); if (state.failed) return n;

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
    // USE.g:770:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
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
            // USE.g:776:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
            // USE.g:777:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }

            // USE.g:778:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==95) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // USE.g:779:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
            	    {
            	    match(input,95,FOLLOW_95_in_expression3979); if (state.failed) return retval;

            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression3990); if (state.failed) return retval;

            	    // USE.g:780:18: ( COLON t= type )?
            	    int alt100=2;
            	    int LA100_0 = input.LA(1);

            	    if ( (LA100_0==COLON) ) {
            	        alt100=1;
            	    }
            	    switch (alt100) {
            	        case 1 :
            	            // USE.g:780:20: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression3994); if (state.failed) return retval;

            	            pushFollow(FOLLOW_type_in_expression3998);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression4003); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expression_in_expression4007);
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

            	    // USE.g:790:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
            	    loop102:
            	    do {
            	        int alt102=2;
            	        int LA102_0 = input.LA(1);

            	        if ( (LA102_0==COMMA) ) {
            	            alt102=1;
            	        }


            	        switch (alt102) {
            	    	case 1 :
            	    	    // USE.g:791:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_expression4045); if (state.failed) return retval;

            	    	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression4057); if (state.failed) return retval;

            	    	    // USE.g:792:20: ( COLON t= type )?
            	    	    int alt101=2;
            	    	    int LA101_0 = input.LA(1);

            	    	    if ( (LA101_0==COLON) ) {
            	    	        alt101=1;
            	    	    }
            	    	    switch (alt101) {
            	    	        case 1 :
            	    	            // USE.g:792:22: COLON t= type
            	    	            {
            	    	            match(input,COLON,FOLLOW_COLON_in_expression4061); if (state.failed) return retval;

            	    	            pushFollow(FOLLOW_type_in_expression4065);
            	    	            t=type();

            	    	            state._fsp--;
            	    	            if (state.failed) return retval;

            	    	            }
            	    	            break;

            	    	    }


            	    	    match(input,EQUAL,FOLLOW_EQUAL_in_expression4070); if (state.failed) return retval;

            	    	    pushFollow(FOLLOW_expression_in_expression4074);
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
            	    	    break loop102;
            	        }
            	    } while (true);


            	    match(input,90,FOLLOW_90_in_expression4115); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);


            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression4131);
            nCndImplies=conditionalImpliesExpression();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { 
                    if ( nCndImplies != null ) {
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
    // USE.g:825:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;


        ASTVariableDeclaration v =null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // USE.g:827:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // USE.g:828:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList4164); if (state.failed) return paramList;

            // USE.g:829:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==IDENT) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // USE.g:830:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList4181);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;

                    if ( state.backtracking==0 ) { paramList.add(v); }

                    // USE.g:831:7: ( COMMA v= variableDeclaration )*
                    loop104:
                    do {
                        int alt104=2;
                        int LA104_0 = input.LA(1);

                        if ( (LA104_0==COMMA) ) {
                            alt104=1;
                        }


                        switch (alt104) {
                    	case 1 :
                    	    // USE.g:831:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList4193); if (state.failed) return paramList;

                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList4197);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;

                    	    if ( state.backtracking==0 ) { paramList.add(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop104;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_paramList4217); if (state.failed) return paramList;

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
    // USE.g:839:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;


        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // USE.g:841:5: (id0= IDENT ( COMMA idn= IDENT )* )
            // USE.g:842:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList4246); if (state.failed) return idList;

            if ( state.backtracking==0 ) { idList.add(id0); }

            // USE.g:843:5: ( COMMA idn= IDENT )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==COMMA) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // USE.g:843:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList4256); if (state.failed) return idList;

            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList4260); if (state.failed) return idList;

            	    if ( state.backtracking==0 ) { idList.add(idn); }

            	    }
            	    break;

            	default :
            	    break loop106;
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
    // USE.g:851:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;


        Token name=null;
        ASTType t =null;


        try {
            // USE.g:852:5: (name= IDENT COLON t= type )
            // USE.g:853:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration4291); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableDeclaration4293); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableDeclaration4297);
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
    // USE.g:861:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndOrExp =null;

        ASTExpression n1 =null;


        try {
            // USE.g:862:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // USE.g:863:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression4333);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndOrExp;}

            // USE.g:864:5: (op= 'implies' n1= conditionalOrExpression )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==89) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // USE.g:864:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,89,FOLLOW_89_in_conditionalImpliesExpression4346); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression4350);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop107;
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
    // USE.g:873:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndXorExp =null;

        ASTExpression n1 =null;


        try {
            // USE.g:874:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // USE.g:875:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression4395);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndXorExp;}

            // USE.g:876:5: (op= 'or' n1= conditionalXOrExpression )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==110) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // USE.g:876:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,110,FOLLOW_110_in_conditionalOrExpression4408); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression4412);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop108;
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
    // USE.g:885:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndAndExp =null;

        ASTExpression n1 =null;


        try {
            // USE.g:886:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // USE.g:887:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression4456);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndAndExp;}

            // USE.g:888:5: (op= 'xor' n1= conditionalAndExpression )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==128) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // USE.g:888:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,128,FOLLOW_128_in_conditionalXOrExpression4469); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression4473);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop109;
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
    // USE.g:897:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nEqExp =null;

        ASTExpression n1 =null;


        try {
            // USE.g:898:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // USE.g:899:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression4517);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nEqExp;}

            // USE.g:900:5: (op= 'and' n1= equalityExpression )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==62) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // USE.g:900:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,62,FOLLOW_62_in_conditionalAndExpression4530); if (state.failed) return n;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression4534);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop110;
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
    // USE.g:909:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nRelExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // USE.g:911:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // USE.g:912:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression4582);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nRelExp;}

            // USE.g:913:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==EQUAL||LA111_0==NOT_EQUAL) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // USE.g:913:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression4611);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop111;
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
    // USE.g:923:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nAddiExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // USE.g:925:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // USE.g:926:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression4660);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nAddiExp;}

            // USE.g:927:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( ((LA112_0 >= GREATER && LA112_0 <= GREATER_EQUAL)||(LA112_0 >= LESS && LA112_0 <= LESS_EQUAL)) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // USE.g:927:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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


            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression4696);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop112;
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
    // USE.g:937:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nMulExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // USE.g:939:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // USE.g:940:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4746);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nMulExp;}

            // USE.g:941:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==MINUS||LA113_0==PLUS) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // USE.g:941:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4774);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop113;
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
    // USE.g:952:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // USE.g:954:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // USE.g:955:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4824);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nUnExp;}

            // USE.g:956:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==SLASH||LA114_0==STAR||LA114_0==78) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // USE.g:956:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==78 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4856);
            	    n1=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop114;
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
    // USE.g:968:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression nPosExp =null;


         Token op = null; 
        try {
            // USE.g:970:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==MINUS||LA115_0==PLUS||LA115_0==100) ) {
                alt115=1;
            }
            else if ( (LA115_0==AT||LA115_0==HASH||(LA115_0 >= IDENT && LA115_0 <= INT)||LA115_0==LPAREN||LA115_0==REAL||(LA115_0 >= STAR && LA115_0 <= STRING)||(LA115_0 >= 46 && LA115_0 <= 47)||LA115_0==50||(LA115_0 >= 53 && LA115_0 <= 54)||LA115_0==56||LA115_0==58||LA115_0==85||LA115_0==88||LA115_0==94||(LA115_0 >= 101 && LA115_0 <= 107)||(LA115_0 >= 117 && LA115_0 <= 118)||LA115_0==124) ) {
                alt115=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;

            }
            switch (alt115) {
                case 1 :
                    // USE.g:971:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // USE.g:971:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // USE.g:971:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) { op = input.LT(1); }

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==100 ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4942);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }

                    }


                    }
                    break;
                case 2 :
                    // USE.g:975:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression4962);
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
    // USE.g:983:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nPrimExp =null;

        ASTExpression nPc =null;


         boolean arrow = false; 
        try {
            // USE.g:985:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // USE.g:986:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression4995);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nPrimExp; }

            // USE.g:987:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==DOT) ) {
                    int LA117_2 = input.LA(2);

                    if ( (LA117_2==IDENT) ) {
                        int LA117_4 = input.LA(3);

                        if ( (LA117_4==EOF||(LA117_4 >= ARROW && LA117_4 <= BAR)||(LA117_4 >= COMMA && LA117_4 <= EQUAL)||(LA117_4 >= GREATER && LA117_4 <= GREATER_EQUAL)||LA117_4==IDENT||(LA117_4 >= LBRACE && LA117_4 <= MINUS)||(LA117_4 >= NOT_EQUAL && LA117_4 <= PLUS)||(LA117_4 >= RBRACE && LA117_4 <= RBRACK)||(LA117_4 >= RPAREN && LA117_4 <= SLASH)||LA117_4==STAR||LA117_4==59||LA117_4==62||(LA117_4 >= 64 && LA117_4 <= 66)||(LA117_4 >= 72 && LA117_4 <= 73)||(LA117_4 >= 78 && LA117_4 <= 84)||(LA117_4 >= 89 && LA117_4 <= 90)||LA117_4==93||LA117_4==97||(LA117_4 >= 109 && LA117_4 <= 113)||LA117_4==115||LA117_4==119||(LA117_4 >= 121 && LA117_4 <= 122)||LA117_4==128) ) {
                            alt117=1;
                        }


                    }
                    else if ( (LA117_2==94||LA117_2==102||(LA117_2 >= 104 && LA117_2 <= 106)||(LA117_2 >= 117 && LA117_2 <= 118)) ) {
                        alt117=1;
                    }


                }
                else if ( (LA117_0==ARROW) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // USE.g:988:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // USE.g:988:6: ( ARROW | DOT )
            	    int alt116=2;
            	    int LA116_0 = input.LA(1);

            	    if ( (LA116_0==ARROW) ) {
            	        alt116=1;
            	    }
            	    else if ( (LA116_0==DOT) ) {
            	        alt116=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 116, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt116) {
            	        case 1 :
            	            // USE.g:988:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression5013); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = true; }

            	            }
            	            break;
            	        case 2 :
            	            // USE.g:988:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression5019); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = false; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression5030);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = nPc; }

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
    // $ANTLR end "postfixExpression"



    // $ANTLR start "primaryExpression"
    // USE.g:1004:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? );
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
            // USE.g:1005:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? )
            int alt121=7;
            switch ( input.LA(1) ) {
            case HASH:
            case INT:
            case REAL:
            case STAR:
            case STRING:
            case 46:
            case 47:
            case 50:
            case 53:
            case 54:
            case 56:
            case 58:
            case 85:
            case 101:
            case 103:
            case 107:
            case 124:
                {
                alt121=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt121=1;
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
                case 59:
                case 62:
                case 64:
                case 65:
                case 66:
                case 72:
                case 73:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 89:
                case 90:
                case 93:
                case 97:
                case 109:
                case 110:
                case 111:
                case 112:
                case 113:
                case 115:
                case 119:
                case 121:
                case 122:
                case 128:
                    {
                    alt121=3;
                    }
                    break;
                case DOT:
                    {
                    switch ( input.LA(3) ) {
                    case 61:
                        {
                        alt121=6;
                        }
                        break;
                    case 71:
                        {
                        alt121=7;
                        }
                        break;
                    case IDENT:
                    case 94:
                    case 102:
                    case 104:
                    case 105:
                    case 106:
                    case 117:
                    case 118:
                        {
                        alt121=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 121, 7, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 121, 2, input);

                    throw nvae;

                }

                }
                break;
            case AT:
                {
                alt121=2;
                }
                break;
            case 94:
            case 102:
            case 104:
            case 105:
            case 106:
            case 117:
            case 118:
                {
                alt121=3;
                }
                break;
            case LPAREN:
                {
                alt121=4;
                }
                break;
            case 88:
                {
                alt121=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;

            }

            switch (alt121) {
                case 1 :
                    // USE.g:1006:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression5070);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nLit; }

                    }
                    break;
                case 2 :
                    // USE.g:1007:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression5084);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nOr; }

                    }
                    break;
                case 3 :
                    // USE.g:1008:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression5096);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPc; }

                    }
                    break;
                case 4 :
                    // USE.g:1009:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression5107); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression5111);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression5113); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExp!=null?nExp.n:null); }

                    }
                    break;
                case 5 :
                    // USE.g:1010:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression5125);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nIfExp; }

                    }
                    break;
                case 6 :
                    // USE.g:1011:7: id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression5137); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression5139); if (state.failed) return n;

                    match(input,61,FOLLOW_61_in_primaryExpression5141); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }

                    // USE.g:1013:9: ( AT 'pre' )?
                    int alt118=2;
                    int LA118_0 = input.LA(1);

                    if ( (LA118_0==AT) ) {
                        int LA118_1 = input.LA(2);

                        if ( (LA118_1==113) ) {
                            alt118=1;
                        }
                    }
                    switch (alt118) {
                        case 1 :
                            // USE.g:1013:11: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression5164); if (state.failed) return n;

                            match(input,113,FOLLOW_113_in_primaryExpression5166); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setIsPre(); }

                            }
                            break;

                    }


                    // USE.g:1014:9: ( LPAREN RPAREN )?
                    int alt119=2;
                    int LA119_0 = input.LA(1);

                    if ( (LA119_0==LPAREN) ) {
                        alt119=1;
                    }
                    switch (alt119) {
                        case 1 :
                            // USE.g:1014:11: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression5184); if (state.failed) return n;

                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression5186); if (state.failed) return n;

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // USE.g:1015:7: id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )?
                    {
                    id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression5199); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression5201); if (state.failed) return n;

                    match(input,71,FOLLOW_71_in_primaryExpression5203); if (state.failed) return n;

                    // USE.g:1015:31: ( LPAREN idExp= expression RPAREN )
                    // USE.g:1015:33: LPAREN idExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression5207); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression5211);
                    idExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression5213); if (state.failed) return n;

                    }


                    if ( state.backtracking==0 ) { n = new ASTObjectByUseIdExpression(id2, (idExp!=null?idExp.n:null)); }

                    // USE.g:1017:7: ( AT 'pre' )?
                    int alt120=2;
                    int LA120_0 = input.LA(1);

                    if ( (LA120_0==AT) ) {
                        int LA120_1 = input.LA(2);

                        if ( (LA120_1==113) ) {
                            alt120=1;
                        }
                    }
                    switch (alt120) {
                        case 1 :
                            // USE.g:1017:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression5233); if (state.failed) return n;

                            match(input,113,FOLLOW_113_in_primaryExpression5235); if (state.failed) return n;

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
    // USE.g:1021:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;


        Token objectName=null;

        try {
            // USE.g:1022:3: ( AT objectName= IDENT )
            // USE.g:1023:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference5261); if (state.failed) return n;

            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference5269); if (state.failed) return n;

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
    // USE.g:1037:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExpQuery =null;

        ASTExpression nExpIterate =null;

        USEParser.operationExpression_return nExpOperation =null;

        ASTTypeArgExpression nExpType =null;

        ASTInStateExpression nExpInState =null;


        try {
            // USE.g:1038:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] )
            int alt122=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA122_1 = input.LA(2);

                if ( (((( input.LA(2) == LPAREN )&&( input.LA(2) == LPAREN ))&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))) ) {
                    alt122=1;
                }
                else if ( (true) ) {
                    alt122=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 122, 1, input);

                    throw nvae;

                }
                }
                break;
            case 94:
                {
                alt122=2;
                }
                break;
            case 102:
            case 105:
            case 106:
            case 117:
            case 118:
                {
                alt122=4;
                }
                break;
            case 104:
                {
                alt122=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;

            }

            switch (alt122) {
                case 1 :
                    // USE.g:1042:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }

                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }

                    pushFollow(FOLLOW_queryExpression_in_propertyCall5334);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpQuery; }

                    }
                    break;
                case 2 :
                    // USE.g:1045:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall5347);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpIterate; }

                    }
                    break;
                case 3 :
                    // USE.g:1046:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall5360);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExpOperation!=null?nExpOperation.n:null); }

                    }
                    break;
                case 4 :
                    // USE.g:1047:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall5373);
                    nExpType=typeExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpType; }

                    }
                    break;
                case 5 :
                    // USE.g:1048:7: nExpInState= inStateExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_inStateExpression_in_propertyCall5386);
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
    // USE.g:1057:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTElemVarsDeclaration decls =null;

        USEParser.expression_return nExp =null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // USE.g:1058:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // USE.g:1059:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression5421); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression5428); if (state.failed) return n;

            // USE.g:1061:5: (decls= elemVarsDeclaration BAR )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==IDENT) ) {
                int LA123_1 = input.LA(2);

                if ( ((LA123_1 >= BAR && LA123_1 <= COLON)||LA123_1==COMMA) ) {
                    alt123=1;
                }
            }
            switch (alt123) {
                case 1 :
                    // USE.g:1061:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression5439);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {decl = decls;}

                    match(input,BAR,FOLLOW_BAR_in_queryExpression5443); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_queryExpression5454);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression5460); if (state.failed) return n;

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
    // USE.g:1075:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTElemVarsDeclaration decls =null;

        ASTVariableInitialization init =null;

        USEParser.expression_return nExp =null;


        try {
            // USE.g:1075:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // USE.g:1076:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,94,FOLLOW_94_in_iterateExpression5492); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression5498); if (state.failed) return n;

            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression5506);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;

            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression5508); if (state.failed) return n;

            pushFollow(FOLLOW_variableInitialization_in_iterateExpression5516);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;

            match(input,BAR,FOLLOW_BAR_in_iterateExpression5518); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_iterateExpression5526);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression5532); if (state.failed) return n;

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
    // USE.g:1097:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final USEParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        USEParser.operationExpression_return retval = new USEParser.operationExpression_return();
        retval.start = input.LT(1);


        Token name=null;
        USEParser.expression_return rolename =null;

        USEParser.expression_return e =null;


        try {
            // USE.g:1099:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // USE.g:1100:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression5576); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }

            // USE.g:1106:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==LBRACK) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // USE.g:1106:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression5598); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_operationExpression5611);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    // USE.g:1108:9: ( COMMA rolename= expression )*
                    loop124:
                    do {
                        int alt124=2;
                        int LA124_0 = input.LA(1);

                        if ( (LA124_0==COMMA) ) {
                            alt124=1;
                        }


                        switch (alt124) {
                    	case 1 :
                    	    // USE.g:1108:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression5624); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_operationExpression5628);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    	    }
                    	    break;

                    	default :
                    	    break loop124;
                        }
                    } while (true);


                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression5640); if (state.failed) return retval;

                    // USE.g:1111:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==LBRACK) ) {
                        alt126=1;
                    }
                    switch (alt126) {
                        case 1 :
                            // USE.g:1111:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression5657); if (state.failed) return retval;

                            pushFollow(FOLLOW_expression_in_operationExpression5672);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            // USE.g:1113:11: ( COMMA rolename= expression )*
                            loop125:
                            do {
                                int alt125=2;
                                int LA125_0 = input.LA(1);

                                if ( (LA125_0==COMMA) ) {
                                    alt125=1;
                                }


                                switch (alt125) {
                            	case 1 :
                            	    // USE.g:1113:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression5687); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression5691);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop125;
                                }
                            } while (true);


                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression5705); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            // USE.g:1118:5: ( AT 'pre' )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==AT) ) {
                int LA128_1 = input.LA(2);

                if ( (LA128_1==113) ) {
                    alt128=1;
                }
            }
            switch (alt128) {
                case 1 :
                    // USE.g:1118:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression5730); if (state.failed) return retval;

                    match(input,113,FOLLOW_113_in_operationExpression5732); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.setIsPre(); }

                    }
                    break;

            }


            // USE.g:1120:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==LPAREN) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // USE.g:1121:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression5757); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.hasParentheses(); }

                    // USE.g:1122:7: (e= expression ( COMMA e= expression )* )?
                    int alt130=2;
                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==AT||LA130_0==HASH||(LA130_0 >= IDENT && LA130_0 <= INT)||(LA130_0 >= LPAREN && LA130_0 <= MINUS)||LA130_0==PLUS||LA130_0==REAL||(LA130_0 >= STAR && LA130_0 <= STRING)||(LA130_0 >= 46 && LA130_0 <= 47)||LA130_0==50||(LA130_0 >= 53 && LA130_0 <= 54)||LA130_0==56||LA130_0==58||LA130_0==85||LA130_0==88||(LA130_0 >= 94 && LA130_0 <= 95)||(LA130_0 >= 100 && LA130_0 <= 107)||(LA130_0 >= 117 && LA130_0 <= 118)||LA130_0==124) ) {
                        alt130=1;
                    }
                    switch (alt130) {
                        case 1 :
                            // USE.g:1123:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression5778);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            // USE.g:1124:7: ( COMMA e= expression )*
                            loop129:
                            do {
                                int alt129=2;
                                int LA129_0 = input.LA(1);

                                if ( (LA129_0==COMMA) ) {
                                    alt129=1;
                                }


                                switch (alt129) {
                            	case 1 :
                            	    // USE.g:1124:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression5790); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression5794);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop129;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression5814); if (state.failed) return retval;

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
    // USE.g:1131:1: inStateExpression[ASTExpression source, boolean followsArrow] returns [ASTInStateExpression n] : opToken= 'oclInState' LPAREN s= IDENT RPAREN ;
    public final ASTInStateExpression inStateExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTInStateExpression n = null;


        Token opToken=null;
        Token s=null;

        try {
            // USE.g:1132:35: (opToken= 'oclInState' LPAREN s= IDENT RPAREN )
            // USE.g:1133:4: opToken= 'oclInState' LPAREN s= IDENT RPAREN
            {
            opToken=(Token)match(input,104,FOLLOW_104_in_inStateExpression5851); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_inStateExpression5856); if (state.failed) return n;

            s=(Token)match(input,IDENT,FOLLOW_IDENT_in_inStateExpression5865); if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_inStateExpression5870); if (state.failed) return n;

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
    // USE.g:1145:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;


        ASTType t =null;


         Token opToken = null; 
        try {
            // USE.g:1148:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN )
            // USE.g:1149:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) { opToken = input.LT(1); }

            if ( input.LA(1)==102||(input.LA(1) >= 105 && input.LA(1) <= 106)||(input.LA(1) >= 117 && input.LA(1) <= 118) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression5930); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_typeExpression5934);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression5936); if (state.failed) return n;

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
    // USE.g:1160:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;


        Token var1=null;
        Token varN=null;
        ASTType t =null;

        ASTType tN =null;


        try {
            // USE.g:1161:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // USE.g:1162:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }

            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration5974); if (state.failed) return n;

            // USE.g:1163:17: ( COLON t= type )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==COLON) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // USE.g:1163:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration5977); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_elemVarsDeclaration5981);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}

            // USE.g:1164:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop134:
            do {
                int alt134=2;
                int LA134_0 = input.LA(1);

                if ( (LA134_0==COMMA) ) {
                    alt134=1;
                }


                switch (alt134) {
            	case 1 :
            	    // USE.g:1164:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration5991); if (state.failed) return n;

            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration5997); if (state.failed) return n;

            	    // USE.g:1164:24: ( COLON tN= type )?
            	    int alt133=2;
            	    int LA133_0 = input.LA(1);

            	    if ( (LA133_0==COLON) ) {
            	        alt133=1;
            	    }
            	    switch (alt133) {
            	        case 1 :
            	            // USE.g:1164:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration6000); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration6006);
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
            	    break loop134;
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
    // USE.g:1172:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;


        Token name=null;
        ASTType t =null;

        USEParser.expression_return e =null;


        try {
            // USE.g:1173:5: (name= IDENT COLON t= type EQUAL e= expression )
            // USE.g:1174:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization6034); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableInitialization6036); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableInitialization6040);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization6042); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_variableInitialization6046);
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
    // USE.g:1183:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        USEParser.expression_return cond =null;

        USEParser.expression_return t =null;

        USEParser.expression_return e =null;


        try {
            // USE.g:1184:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // USE.g:1185:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,88,FOLLOW_88_in_ifExpression6078); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression6082);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,122,FOLLOW_122_in_ifExpression6084); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression6088);
            t=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,80,FOLLOW_80_in_ifExpression6090); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression6094);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,82,FOLLOW_82_in_ifExpression6096); if (state.failed) return n;

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
    // USE.g:1204:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR );
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
            // USE.g:1205:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR )
            int alt135=12;
            switch ( input.LA(1) ) {
            case 124:
                {
                alt135=1;
                }
                break;
            case 85:
                {
                alt135=2;
                }
                break;
            case INT:
                {
                alt135=3;
                }
                break;
            case REAL:
                {
                alt135=4;
                }
                break;
            case STRING:
                {
                alt135=5;
                }
                break;
            case HASH:
                {
                alt135=6;
                }
                break;
            case IDENT:
                {
                alt135=7;
                }
                break;
            case 46:
            case 50:
            case 53:
            case 54:
                {
                int LA135_8 = input.LA(2);

                if ( (LA135_8==LPAREN) ) {
                    alt135=9;
                }
                else if ( (LA135_8==LBRACE) ) {
                    alt135=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 135, 8, input);

                    throw nvae;

                }
                }
                break;
            case 47:
            case 103:
                {
                alt135=9;
                }
                break;
            case 58:
            case 101:
            case 107:
                {
                alt135=10;
                }
                break;
            case 56:
                {
                alt135=11;
                }
                break;
            case STAR:
                {
                alt135=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;

            }

            switch (alt135) {
                case 1 :
                    // USE.g:1206:7: t= 'true'
                    {
                    t=(Token)match(input,124,FOLLOW_124_in_literal6135); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }

                    }
                    break;
                case 2 :
                    // USE.g:1207:7: f= 'false'
                    {
                    f=(Token)match(input,85,FOLLOW_85_in_literal6149); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }

                    }
                    break;
                case 3 :
                    // USE.g:1208:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal6162); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }

                    }
                    break;
                case 4 :
                    // USE.g:1209:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal6177); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }

                    }
                    break;
                case 5 :
                    // USE.g:1210:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal6191); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }

                    }
                    break;
                case 6 :
                    // USE.g:1211:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal6201); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal6205); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}

                    }
                    break;
                case 7 :
                    // USE.g:1212:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal6217); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal6219); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal6223); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }

                    }
                    break;
                case 8 :
                    // USE.g:1213:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal6235);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nColIt; }

                    }
                    break;
                case 9 :
                    // USE.g:1214:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal6247);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nEColIt; }

                    }
                    break;
                case 10 :
                    // USE.g:1215:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal6259);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nUndLit; }

                    }
                    break;
                case 11 :
                    // USE.g:1216:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal6271);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nTupleLit; }

                    }
                    break;
                case 12 :
                    // USE.g:1217:7: un= STAR
                    {
                    un=(Token)match(input,STAR,FOLLOW_STAR_in_literal6283); if (state.failed) return n;

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
    // USE.g:1225:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;


        ASTCollectionItem ci =null;


         Token op = null; 
        try {
            // USE.g:1227:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // USE.g:1228:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( input.LA(1)==46||input.LA(1)==50||(input.LA(1) >= 53 && input.LA(1) <= 54) ) {
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

            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral6350); if (state.failed) return n;

            // USE.g:1232:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==AT||LA137_0==HASH||(LA137_0 >= IDENT && LA137_0 <= INT)||(LA137_0 >= LPAREN && LA137_0 <= MINUS)||LA137_0==PLUS||LA137_0==REAL||(LA137_0 >= STAR && LA137_0 <= STRING)||(LA137_0 >= 46 && LA137_0 <= 47)||LA137_0==50||(LA137_0 >= 53 && LA137_0 <= 54)||LA137_0==56||LA137_0==58||LA137_0==85||LA137_0==88||(LA137_0 >= 94 && LA137_0 <= 95)||(LA137_0 >= 100 && LA137_0 <= 107)||(LA137_0 >= 117 && LA137_0 <= 118)||LA137_0==124) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // USE.g:1233:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral6367);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addItem(ci); }

                    // USE.g:1234:7: ( COMMA ci= collectionItem )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==COMMA) ) {
                            alt136=1;
                        }


                        switch (alt136) {
                    	case 1 :
                    	    // USE.g:1234:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral6380); if (state.failed) return n;

                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral6384);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addItem(ci); }

                    	    }
                    	    break;

                    	default :
                    	    break loop136;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral6403); if (state.failed) return n;

            }

        }
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
    // USE.g:1243:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;


        USEParser.expression_return e =null;


         n = new ASTCollectionItem(); 
        try {
            // USE.g:1245:5: (e= expression ( DOTDOT e= expression )? )
            // USE.g:1246:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem6432);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setFirst((e!=null?e.n:null)); }

            // USE.g:1247:5: ( DOTDOT e= expression )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==DOTDOT) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // USE.g:1247:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem6443); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_collectionItem6447);
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
    // USE.g:1257:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;


        ASTCollectionType t =null;


        try {
            // USE.g:1258:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==103) ) {
                alt139=1;
            }
            else if ( ((LA139_0 >= 46 && LA139_0 <= 47)||LA139_0==50||(LA139_0 >= 53 && LA139_0 <= 54)) ) {
                alt139=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;

            }
            switch (alt139) {
                case 1 :
                    // USE.g:1259:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,103,FOLLOW_103_in_emptyCollectionLiteral6476); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral6478); if (state.failed) return n;

                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral6482);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral6484); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;
                case 2 :
                    // USE.g:1262:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral6500);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral6502); if (state.failed) return n;

                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral6504); if (state.failed) return n;

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
    // USE.g:1273:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;


        ASTType t =null;


        try {
            // USE.g:1274:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt140=4;
            switch ( input.LA(1) ) {
            case 107:
                {
                alt140=1;
                }
                break;
            case 58:
                {
                alt140=2;
                }
                break;
            case 101:
                {
                int LA140_3 = input.LA(2);

                if ( (LA140_3==LPAREN) ) {
                    alt140=3;
                }
                else if ( (LA140_3==EOF||(LA140_3 >= ARROW && LA140_3 <= BAR)||(LA140_3 >= COMMA && LA140_3 <= EQUAL)||(LA140_3 >= GREATER && LA140_3 <= GREATER_EQUAL)||LA140_3==IDENT||LA140_3==LBRACE||(LA140_3 >= LESS && LA140_3 <= LESS_EQUAL)||LA140_3==MINUS||(LA140_3 >= NOT_EQUAL && LA140_3 <= PLUS)||(LA140_3 >= RBRACE && LA140_3 <= RBRACK)||(LA140_3 >= RPAREN && LA140_3 <= SLASH)||LA140_3==STAR||LA140_3==59||LA140_3==62||(LA140_3 >= 64 && LA140_3 <= 66)||(LA140_3 >= 72 && LA140_3 <= 73)||(LA140_3 >= 78 && LA140_3 <= 84)||(LA140_3 >= 89 && LA140_3 <= 90)||LA140_3==93||LA140_3==97||(LA140_3 >= 109 && LA140_3 <= 113)||LA140_3==115||LA140_3==119||(LA140_3 >= 121 && LA140_3 <= 122)||LA140_3==128) ) {
                    alt140=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 140, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;

            }

            switch (alt140) {
                case 1 :
                    // USE.g:1275:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,107,FOLLOW_107_in_undefinedLiteral6534); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral6536); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral6540);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral6542); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 2 :
                    // USE.g:1278:5: 'Undefined'
                    {
                    match(input,58,FOLLOW_58_in_undefinedLiteral6556); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;
                case 3 :
                    // USE.g:1281:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,101,FOLLOW_101_in_undefinedLiteral6570); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral6572); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral6576);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral6578); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 4 :
                    // USE.g:1284:5: 'null'
                    {
                    match(input,101,FOLLOW_101_in_undefinedLiteral6592); if (state.failed) return n;

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
    // USE.g:1294:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;


        ASTTupleItem ti =null;


         List tiList = new ArrayList(); 
        try {
            // USE.g:1296:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // USE.g:1297:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,56,FOLLOW_56_in_tupleLiteral6631); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral6637); if (state.failed) return n;

            pushFollow(FOLLOW_tupleItem_in_tupleLiteral6645);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tiList.add(ti); }

            // USE.g:1300:5: ( COMMA ti= tupleItem )*
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==COMMA) ) {
                    alt141=1;
                }


                switch (alt141) {
            	case 1 :
            	    // USE.g:1300:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral6656); if (state.failed) return n;

            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral6660);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tiList.add(ti); }

            	    }
            	    break;

            	default :
            	    break loop141;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral6671); if (state.failed) return n;

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
    // USE.g:1308:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;


        Token name=null;
        ASTType t =null;

        USEParser.expression_return e =null;


        try {
            // USE.g:1309:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // USE.g:1310:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem6702); if (state.failed) return n;

            // USE.g:1311:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==COLON) ) {
                int LA142_1 = input.LA(2);

                if ( (synpred1_USE()) ) {
                    alt142=1;
                }
                else if ( (true) ) {
                    alt142=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 142, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA142_0==EQUAL) ) {
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
                    // USE.g:1314:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem6741); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_tupleItem6745);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem6747); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_tupleItem6751);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, (e!=null?e.n:null)); }

                    }
                    break;
                case 2 :
                    // USE.g:1317:7: ( COLON | EQUAL ) e= expression
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


                    pushFollow(FOLLOW_expression_in_tupleItem6783);
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
    // USE.g:1328:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;


        ASTSimpleType nTSimple =null;

        ASTCollectionType nTCollection =null;

        ASTTupleType nTTuple =null;


         Token tok = null; 
        try {
            // USE.g:1330:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
            // USE.g:1331:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }

            // USE.g:1332:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            int alt143=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt143=1;
                }
                break;
            case 46:
            case 47:
            case 50:
            case 53:
            case 54:
                {
                alt143=2;
                }
                break;
            case 56:
                {
                alt143=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;

            }

            switch (alt143) {
                case 1 :
                    // USE.g:1333:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type6849);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 2 :
                    // USE.g:1334:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type6861);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 3 :
                    // USE.g:1335:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type6873);
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
    // USE.g:1340:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;


        ASTType nT =null;


        try {
            // USE.g:1341:5: (nT= type EOF )
            // USE.g:1342:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly6905);
            nT=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_typeOnly6907); if (state.failed) return n;

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
    // USE.g:1352:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;


        Token name=null;

        try {
            // USE.g:1353:5: (name= IDENT )
            // USE.g:1354:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType6935); if (state.failed) return n;

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
    // USE.g:1362:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;


        ASTType elemType =null;


         Token op = null; 
        try {
            // USE.g:1364:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // USE.g:1365:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( (input.LA(1) >= 46 && input.LA(1) <= 47)||input.LA(1)==50||(input.LA(1) >= 53 && input.LA(1) <= 54) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType7000); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_collectionType7004);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType7006); if (state.failed) return n;

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
    // USE.g:1375:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;


        ASTTuplePart tp =null;


         List tpList = new ArrayList(); 
        try {
            // USE.g:1377:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // USE.g:1378:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,56,FOLLOW_56_in_tupleType7040); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType7042); if (state.failed) return n;

            pushFollow(FOLLOW_tuplePart_in_tupleType7051);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tpList.add(tp); }

            // USE.g:1380:5: ( COMMA tp= tuplePart )*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==COMMA) ) {
                    alt144=1;
                }


                switch (alt144) {
            	case 1 :
            	    // USE.g:1380:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType7062); if (state.failed) return n;

            	    pushFollow(FOLLOW_tuplePart_in_tupleType7066);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tpList.add(tp); }

            	    }
            	    break;

            	default :
            	    break loop144;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType7078); if (state.failed) return n;

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
    // USE.g:1389:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;


        Token name=null;
        ASTType t =null;


        try {
            // USE.g:1390:5: (name= IDENT COLON t= type )
            // USE.g:1391:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart7110); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_tuplePart7112); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_tuplePart7116);
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
    // USE.g:1430:1: statOnly returns [ASTStatement n] : s= stat EOF ;
    public final ASTStatement statOnly() throws RecognitionException {
        ASTStatement n = null;


        USEParser.stat_return s =null;


        try {
            // USE.g:1431:3: (s= stat EOF )
            // USE.g:1432:3: s= stat EOF
            {
            pushFollow(FOLLOW_stat_in_statOnly7165);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_statOnly7169); if (state.failed) return n;

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
    // USE.g:1442:1: stat returns [ASTStatement n] : s= singleStat ( SEMI s2= singleStat )* ;
    public final USEParser.stat_return stat() throws RecognitionException {
        USEParser.stat_return retval = new USEParser.stat_return();
        retval.start = input.LT(1);


        ASTStatement s =null;

        ASTStatement s2 =null;



          ASTSequenceStatement seq = new ASTSequenceStatement(((Token)retval.start));

        try {
            // USE.g:1446:3: (s= singleStat ( SEMI s2= singleStat )* )
            // USE.g:1447:3: s= singleStat ( SEMI s2= singleStat )*
            {
            pushFollow(FOLLOW_singleStat_in_stat7204);
            s=singleStat();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {seq.addStatement(s);}

            // USE.g:1448:3: ( SEMI s2= singleStat )*
            loop145:
            do {
                int alt145=2;
                int LA145_0 = input.LA(1);

                if ( (LA145_0==SEMI) ) {
                    alt145=1;
                }


                switch (alt145) {
            	case 1 :
            	    // USE.g:1449:5: SEMI s2= singleStat
            	    {
            	    match(input,SEMI,FOLLOW_SEMI_in_stat7216); if (state.failed) return retval;

            	    pushFollow(FOLLOW_singleStat_in_stat7226);
            	    s2=singleStat();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {seq.addStatement(s2); }

            	    }
            	    break;

            	default :
            	    break loop145;
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
    // USE.g:1461:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat );
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
            // USE.g:1462:5: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat )
            int alt146=11;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==EOF||LA146_0==SEMI||(LA146_0 >= 80 && LA146_0 <= 81)) ) {
                alt146=1;
            }
            else if ( (LA146_0==95) && (synpred2_USE())) {
                alt146=2;
            }
            else if ( (LA146_0==MINUS||LA146_0==PLUS||LA146_0==100) && (synpred2_USE())) {
                alt146=2;
            }
            else if ( (LA146_0==124) && (synpred2_USE())) {
                alt146=2;
            }
            else if ( (LA146_0==85) && (synpred2_USE())) {
                alt146=2;
            }
            else if ( (LA146_0==INT) && (synpred2_USE())) {
                alt146=2;
            }
            else if ( (LA146_0==REAL) && (synpred2_USE())) {
                alt146=2;
            }
            else if ( (LA146_0==STRING) && (synpred2_USE())) {
                alt146=2;
            }
            else if ( (LA146_0==HASH) && (synpred2_USE())) {
                alt146=2;
            }
            else if ( (LA146_0==IDENT) ) {
                int LA146_13 = input.LA(2);

                if ( (synpred2_USE()) ) {
                    alt146=2;
                }
                else if ( (true) ) {
                    alt146=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 146, 13, input);

                    throw nvae;

                }
            }
            else if ( (LA146_0==46||LA146_0==50||(LA146_0 >= 53 && LA146_0 <= 54)) && (synpred2_USE())) {
                alt146=2;
            }
            else if ( (LA146_0==103) && (synpred2_USE())) {
                alt146=2;
            }
            else if ( (LA146_0==47) && (synpred2_USE())) {
                alt146=2;
            }
            else if ( (LA146_0==107) && (synpred2_USE())) {
                alt146=2;
            }
            else if ( (LA146_0==58) && (synpred2_USE())) {
                alt146=2;
            }
            else if ( (LA146_0==101) && (synpred2_USE())) {
                alt146=2;
            }
            else if ( (LA146_0==56) && (synpred2_USE())) {
                alt146=2;
            }
            else if ( (LA146_0==STAR) && (synpred2_USE())) {
                alt146=2;
            }
            else if ( (LA146_0==AT) && (synpred2_USE())) {
                alt146=2;
            }
            else if ( (LA146_0==94) && (synpred2_USE())) {
                alt146=2;
            }
            else if ( (LA146_0==102||(LA146_0 >= 105 && LA146_0 <= 106)||(LA146_0 >= 117 && LA146_0 <= 118)) && (synpred2_USE())) {
                alt146=2;
            }
            else if ( (LA146_0==104) && (synpred2_USE())) {
                alt146=2;
            }
            else if ( (LA146_0==LPAREN) && (synpred2_USE())) {
                alt146=2;
            }
            else if ( (LA146_0==88) ) {
                int LA146_27 = input.LA(2);

                if ( (synpred2_USE()) ) {
                    alt146=2;
                }
                else if ( (true) ) {
                    alt146=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 146, 27, input);

                    throw nvae;

                }
            }
            else if ( (LA146_0==98) ) {
                alt146=4;
            }
            else if ( (LA146_0==77) ) {
                alt146=5;
            }
            else if ( (LA146_0==91) ) {
                alt146=6;
            }
            else if ( (LA146_0==76) ) {
                alt146=7;
            }
            else if ( (LA146_0==86) ) {
                alt146=9;
            }
            else if ( (LA146_0==126) ) {
                alt146=10;
            }
            else if ( (LA146_0==68) ) {
                alt146=11;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;

            }
            switch (alt146) {
                case 1 :
                    // USE.g:1463:5: emp= emptyStat
                    {
                    pushFollow(FOLLOW_emptyStat_in_singleStat7266);
                    emp=emptyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = emp; }

                    }
                    break;
                case 2 :
                    // USE.g:1465:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
                    {
                    pushFollow(FOLLOW_statStartingWithExpr_in_singleStat7292);
                    sse=statStartingWithExpr();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (sse!=null?sse.n:null); }

                    }
                    break;
                case 3 :
                    // USE.g:1466:5: vas= varAssignStat
                    {
                    pushFollow(FOLLOW_varAssignStat_in_singleStat7304);
                    vas=varAssignStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = vas; }

                    }
                    break;
                case 4 :
                    // USE.g:1467:5: ocs= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_singleStat7318);
                    ocs=objCreateStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ocs!=null?ocs.n:null); }

                    }
                    break;
                case 5 :
                    // USE.g:1468:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleStat7332);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ods!=null?ods.n:null); }

                    }
                    break;
                case 6 :
                    // USE.g:1469:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleStat7345);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lis!=null?lis.n:null); }

                    }
                    break;
                case 7 :
                    // USE.g:1470:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleStat7362);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lds!=null?lds.n:null); }

                    }
                    break;
                case 8 :
                    // USE.g:1471:5: ces= condExStat
                    {
                    pushFollow(FOLLOW_condExStat_in_singleStat7379);
                    ces=condExStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ces!=null?ces.n:null); }

                    }
                    break;
                case 9 :
                    // USE.g:1472:5: its= iterStat
                    {
                    pushFollow(FOLLOW_iterStat_in_singleStat7396);
                    its=iterStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (its!=null?its.n:null); }

                    }
                    break;
                case 10 :
                    // USE.g:1474:5: whs= whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_singleStat7418);
                    whs=whileStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (whs!=null?whs.n:null); }

                    }
                    break;
                case 11 :
                    // USE.g:1475:5: blk= blockStat
                    {
                    pushFollow(FOLLOW_blockStat_in_singleStat7436);
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
    // USE.g:1482:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
    public final ASTEmptyStatement emptyStat() throws RecognitionException {
        ASTEmptyStatement n = null;


        try {
            // USE.g:1483:3: ( nothing )
            // USE.g:1484:3: nothing
            {
            pushFollow(FOLLOW_nothing_in_emptyStat7463);
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
    // USE.g:1489:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
    public final USEParser.statStartingWithExpr_return statStartingWithExpr() throws RecognitionException {
        USEParser.statStartingWithExpr_return retval = new USEParser.statStartingWithExpr_return();
        retval.start = input.LT(1);


        ASTExpression expr =null;

        ASTAttributeAssignmentStatement aas =null;


        try {
            // USE.g:1490:3: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
            // USE.g:1491:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
            {
            pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr7489);
            expr=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            // USE.g:1492:3: (aas= attAssignStat[$expr.n] )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==DOT) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // USE.g:1493:5: aas= attAssignStat[$expr.n]
                    {
                    pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr7503);
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
    // USE.g:1505:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
    public final ASTStatement varAssignStat() throws RecognitionException {
        ASTStatement n = null;


        Token varName=null;
        ASTRValue rVal =null;


        try {
            // USE.g:1506:3: (varName= IDENT COLON_EQUAL rVal= rValue )
            // USE.g:1507:3: varName= IDENT COLON_EQUAL rVal= rValue
            {
            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat7541); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat7545); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_varAssignStat7553);
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
    // USE.g:1519:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
    public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
        ASTAttributeAssignmentStatement n = null;


        Token attName=null;
        ASTRValue r =null;


        try {
            // USE.g:1520:3: ( DOT attName= IDENT COLON_EQUAL r= rValue )
            // USE.g:1521:3: DOT attName= IDENT COLON_EQUAL r= rValue
            {
            match(input,DOT,FOLLOW_DOT_in_attAssignStat7577); if (state.failed) return n;

            attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat7586); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat7590); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_attAssignStat7598);
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
    // USE.g:1533:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
    public final USEParser.objCreateStat_return objCreateStat() throws RecognitionException {
        USEParser.objCreateStat_return retval = new USEParser.objCreateStat_return();
        retval.start = input.LT(1);


        ASTSimpleType ident =null;

        ASTExpression objName =null;

        USEParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // USE.g:1534:3: ( 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
            // USE.g:1535:3: 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            {
            match(input,98,FOLLOW_98_in_objCreateStat7624); if (state.failed) return retval;

            pushFollow(FOLLOW_simpleType_in_objCreateStat7632);
            ident=simpleType();

            state._fsp--;
            if (state.failed) return retval;

            // USE.g:1537:3: ( LPAREN (objName= inSoilExpression )? RPAREN )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==LPAREN) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // USE.g:1538:5: LPAREN (objName= inSoilExpression )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat7642); if (state.failed) return retval;

                    // USE.g:1539:7: (objName= inSoilExpression )?
                    int alt148=2;
                    int LA148_0 = input.LA(1);

                    if ( (LA148_0==AT||LA148_0==HASH||(LA148_0 >= IDENT && LA148_0 <= INT)||(LA148_0 >= LPAREN && LA148_0 <= MINUS)||LA148_0==PLUS||LA148_0==REAL||(LA148_0 >= STAR && LA148_0 <= STRING)||(LA148_0 >= 46 && LA148_0 <= 47)||LA148_0==50||(LA148_0 >= 53 && LA148_0 <= 54)||LA148_0==56||LA148_0==58||LA148_0==85||LA148_0==88||(LA148_0 >= 94 && LA148_0 <= 95)||(LA148_0 >= 100 && LA148_0 <= 107)||(LA148_0 >= 117 && LA148_0 <= 118)||LA148_0==124) ) {
                        alt148=1;
                    }
                    switch (alt148) {
                        case 1 :
                            // USE.g:1539:8: objName= inSoilExpression
                            {
                            pushFollow(FOLLOW_inSoilExpression_in_objCreateStat7655);
                            objName=inSoilExpression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat7663); if (state.failed) return retval;

                    }
                    break;

            }


            // USE.g:1543:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==69) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // USE.g:1544:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
                    {
                    match(input,69,FOLLOW_69_in_objCreateStat7681); if (state.failed) return retval;

                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat7689); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat7703);
                    p=rValListMin2WithOptionalQualifiers();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat7711); if (state.failed) return retval;

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
    // USE.g:1563:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
    public final USEParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
        USEParser.objDestroyStat_return retval = new USEParser.objDestroyStat_return();
        retval.start = input.LT(1);


        List<ASTExpression> el =null;


        try {
            // USE.g:1564:3: ( 'destroy' el= exprListMin1 )
            // USE.g:1565:3: 'destroy' el= exprListMin1
            {
            match(input,77,FOLLOW_77_in_objDestroyStat7747); if (state.failed) return retval;

            pushFollow(FOLLOW_exprListMin1_in_objDestroyStat7755);
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
    // USE.g:1584:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
    public final USEParser.lnkInsStat_return lnkInsStat() throws RecognitionException {
        USEParser.lnkInsStat_return retval = new USEParser.lnkInsStat_return();
        retval.start = input.LT(1);


        Token ass=null;
        USEParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // USE.g:1585:3: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
            // USE.g:1586:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
            {
            match(input,91,FOLLOW_91_in_lnkInsStat7781); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat7785); if (state.failed) return retval;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat7795);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat7799); if (state.failed) return retval;

            match(input,92,FOLLOW_92_in_lnkInsStat7803); if (state.failed) return retval;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat7811); if (state.failed) return retval;

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
    // USE.g:1596:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
    public final USEParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
        USEParser.rValListMin2WithOptionalQualifiers_return retval = new USEParser.rValListMin2WithOptionalQualifiers_return();
        retval.start = input.LT(1);


        ASTRValue r =null;

        List<ASTRValue> qualifierValues =null;



          retval.participans = new ArrayList<ASTRValue>();
          retval.qualifiers = new ArrayList<List<ASTRValue>>();
          List<ASTRValue> currentQualifiers = Collections.emptyList();

        try {
            // USE.g:1602:3: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
            // USE.g:1603:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7840);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add(r); }

            // USE.g:1604:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==LBRACE) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // USE.g:1605:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7851); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7860);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7867); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers7883); if (state.failed) return retval;

            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7894);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add(r); }

            // USE.g:1617:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==LBRACE) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // USE.g:1618:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7905); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7914);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7921); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            // USE.g:1627:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            loop154:
            do {
                int alt154=2;
                int LA154_0 = input.LA(1);

                if ( (LA154_0==COMMA) ) {
                    alt154=1;
                }


                switch (alt154) {
            	case 1 :
            	    // USE.g:1628:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers7943); if (state.failed) return retval;

            	    pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7958);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.participans.add(r); }

            	    // USE.g:1632:5: ( LBRACE qualifierValues= rValList RBRACE )?
            	    int alt153=2;
            	    int LA153_0 = input.LA(1);

            	    if ( (LA153_0==LBRACE) ) {
            	        alt153=1;
            	    }
            	    switch (alt153) {
            	        case 1 :
            	            // USE.g:1633:6: LBRACE qualifierValues= rValList RBRACE
            	            {
            	            match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7978); if (state.failed) return retval;

            	            pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7989);
            	            qualifierValues=rValList();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

            	            match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7998); if (state.failed) return retval;

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
            	    break loop154;
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
    // USE.g:1648:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
    public final USEParser.lnkDelStat_return lnkDelStat() throws RecognitionException {
        USEParser.lnkDelStat_return retval = new USEParser.lnkDelStat_return();
        retval.start = input.LT(1);


        Token ass=null;
        USEParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // USE.g:1649:3: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
            // USE.g:1650:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
            {
            match(input,76,FOLLOW_76_in_lnkDelStat8039); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat8043); if (state.failed) return retval;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat8053);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat8057); if (state.failed) return retval;

            match(input,87,FOLLOW_87_in_lnkDelStat8061); if (state.failed) return retval;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat8070); if (state.failed) return retval;

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
    // USE.g:1664:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' ;
    public final USEParser.condExStat_return condExStat() throws RecognitionException {
        USEParser.condExStat_return retval = new USEParser.condExStat_return();
        retval.start = input.LT(1);


        ASTExpression con =null;

        ASTStatement ts =null;

        ASTStatement es =null;



          ASTStatement elseStat = new ASTEmptyStatement();

        try {
            // USE.g:1668:3: ( 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' )
            // USE.g:1669:3: 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end'
            {
            match(input,88,FOLLOW_88_in_condExStat8101); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_condExStat8110);
            con=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,122,FOLLOW_122_in_condExStat8114); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat8123);
            ts=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            // USE.g:1673:3: ( 'else' es= statOrImplicitBlock )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==80) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // USE.g:1674:5: 'else' es= statOrImplicitBlock
                    {
                    match(input,80,FOLLOW_80_in_condExStat8134); if (state.failed) return retval;

                    pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat8146);
                    es=statOrImplicitBlock();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { elseStat = es; }

                    }
                    break;

            }


            match(input,81,FOLLOW_81_in_condExStat8158); if (state.failed) return retval;

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
    // USE.g:1685:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final USEParser.iterStat_return iterStat() throws RecognitionException {
        USEParser.iterStat_return retval = new USEParser.iterStat_return();
        retval.start = input.LT(1);


        Token var=null;
        ASTExpression set =null;

        ASTStatement s =null;


        try {
            // USE.g:1686:3: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // USE.g:1687:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,86,FOLLOW_86_in_iterStat8183); if (state.failed) return retval;

            var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat8191); if (state.failed) return retval;

            match(input,90,FOLLOW_90_in_iterStat8195); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_iterStat8203);
            set=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,79,FOLLOW_79_in_iterStat8207); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_iterStat8215);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            match(input,81,FOLLOW_81_in_iterStat8220); if (state.failed) return retval;

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
    // USE.g:1702:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final USEParser.whileStat_return whileStat() throws RecognitionException {
        USEParser.whileStat_return retval = new USEParser.whileStat_return();
        retval.start = input.LT(1);


        ASTExpression cond =null;

        ASTStatement s =null;


        try {
            // USE.g:1703:3: ( 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // USE.g:1704:3: 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,126,FOLLOW_126_in_whileStat8246); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_whileStat8254);
            cond=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,79,FOLLOW_79_in_whileStat8258); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_whileStat8266);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            match(input,81,FOLLOW_81_in_whileStat8271); if (state.failed) return retval;

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
    // USE.g:1716:1: blockStat returns [ASTBlockStatement n] : 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' ;
    public final USEParser.blockStat_return blockStat() throws RecognitionException {
        USEParser.blockStat_return retval = new USEParser.blockStat_return();
        retval.start = input.LT(1);


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        USEParser.stat_return s =null;



          retval.n = new ASTBlockStatement(((Token)retval.start), org.tzi.use.config.Options.explicitVariableDeclarations);

        try {
            // USE.g:1720:2: ( 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' )
            // USE.g:1721:2: 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end'
            {
            match(input,68,FOLLOW_68_in_blockStat8301); if (state.failed) return retval;

            // USE.g:1722:2: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==75) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // USE.g:1722:4: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI
                    {
                    match(input,75,FOLLOW_75_in_blockStat8306); if (state.failed) return retval;

                    pushFollow(FOLLOW_variableDeclaration_in_blockStat8312);
                    vd=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}

                    // USE.g:1722:73: ( COMMA vd1= variableDeclaration )*
                    loop156:
                    do {
                        int alt156=2;
                        int LA156_0 = input.LA(1);

                        if ( (LA156_0==COMMA) ) {
                            alt156=1;
                        }


                        switch (alt156) {
                    	case 1 :
                    	    // USE.g:1722:75: COMMA vd1= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_blockStat8318); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_variableDeclaration_in_blockStat8324);
                    	    vd1=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}

                    	    }
                    	    break;

                    	default :
                    	    break loop156;
                        }
                    } while (true);


                    match(input,SEMI,FOLLOW_SEMI_in_blockStat8331); if (state.failed) return retval;

                    }
                    break;

            }


            pushFollow(FOLLOW_stat_in_blockStat8341);
            s=stat();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n.setBody((s!=null?s.n:null)); }

            match(input,81,FOLLOW_81_in_blockStat8346); if (state.failed) return retval;

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
    // USE.g:1731:1: implicitBlockStat returns [ASTBlockStatement n] : 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat ;
    public final USEParser.implicitBlockStat_return implicitBlockStat() throws RecognitionException {
        USEParser.implicitBlockStat_return retval = new USEParser.implicitBlockStat_return();
        retval.start = input.LT(1);


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        USEParser.stat_return s =null;



          retval.n = new ASTBlockStatement(((Token)retval.start), false);

        try {
            // USE.g:1735:3: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat )
            // USE.g:1736:3: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat
            {
            match(input,75,FOLLOW_75_in_implicitBlockStat8372); if (state.failed) return retval;

            pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat8378);
            vd=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}

            // USE.g:1736:72: ( COMMA vd1= variableDeclaration )*
            loop158:
            do {
                int alt158=2;
                int LA158_0 = input.LA(1);

                if ( (LA158_0==COMMA) ) {
                    alt158=1;
                }


                switch (alt158) {
            	case 1 :
            	    // USE.g:1736:74: COMMA vd1= variableDeclaration
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_implicitBlockStat8384); if (state.failed) return retval;

            	    pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat8390);
            	    vd1=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}

            	    }
            	    break;

            	default :
            	    break loop158;
                }
            } while (true);


            match(input,SEMI,FOLLOW_SEMI_in_implicitBlockStat8397); if (state.failed) return retval;

            pushFollow(FOLLOW_stat_in_implicitBlockStat8405);
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
    // USE.g:1740:1: statOrImplicitBlock returns [ASTStatement n] : (s1= stat |s2= implicitBlockStat ) ;
    public final ASTStatement statOrImplicitBlock() throws RecognitionException {
        ASTStatement n = null;


        USEParser.stat_return s1 =null;

        USEParser.implicitBlockStat_return s2 =null;


        try {
            // USE.g:1741:3: ( (s1= stat |s2= implicitBlockStat ) )
            // USE.g:1742:3: (s1= stat |s2= implicitBlockStat )
            {
            // USE.g:1742:3: (s1= stat |s2= implicitBlockStat )
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==AT||LA159_0==HASH||(LA159_0 >= IDENT && LA159_0 <= INT)||(LA159_0 >= LPAREN && LA159_0 <= MINUS)||LA159_0==PLUS||LA159_0==REAL||LA159_0==SEMI||(LA159_0 >= STAR && LA159_0 <= STRING)||(LA159_0 >= 46 && LA159_0 <= 47)||LA159_0==50||(LA159_0 >= 53 && LA159_0 <= 54)||LA159_0==56||LA159_0==58||LA159_0==68||(LA159_0 >= 76 && LA159_0 <= 77)||(LA159_0 >= 80 && LA159_0 <= 81)||(LA159_0 >= 85 && LA159_0 <= 86)||LA159_0==88||LA159_0==91||(LA159_0 >= 94 && LA159_0 <= 95)||LA159_0==98||(LA159_0 >= 100 && LA159_0 <= 107)||(LA159_0 >= 117 && LA159_0 <= 118)||LA159_0==124||LA159_0==126) ) {
                alt159=1;
            }
            else if ( (LA159_0==75) ) {
                alt159=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 159, 0, input);

                throw nvae;

            }
            switch (alt159) {
                case 1 :
                    // USE.g:1742:4: s1= stat
                    {
                    pushFollow(FOLLOW_stat_in_statOrImplicitBlock8428);
                    s1=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s1!=null?s1.n:null); }

                    }
                    break;
                case 2 :
                    // USE.g:1742:31: s2= implicitBlockStat
                    {
                    pushFollow(FOLLOW_implicitBlockStat_in_statOrImplicitBlock8438);
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
    // USE.g:1756:1: nothing :;
    public final void nothing() throws RecognitionException {
        try {
            // USE.g:1757:1: ()
            // USE.g:1758:1: 
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
    // USE.g:1764:1: rValue returns [ASTRValue n] : (e= inSoilExpression |oc= objCreateStat );
    public final ASTRValue rValue() throws RecognitionException {
        ASTRValue n = null;


        ASTExpression e =null;

        USEParser.objCreateStat_return oc =null;


        try {
            // USE.g:1765:5: (e= inSoilExpression |oc= objCreateStat )
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==AT||LA160_0==HASH||(LA160_0 >= IDENT && LA160_0 <= INT)||(LA160_0 >= LPAREN && LA160_0 <= MINUS)||LA160_0==PLUS||LA160_0==REAL||(LA160_0 >= STAR && LA160_0 <= STRING)||(LA160_0 >= 46 && LA160_0 <= 47)||LA160_0==50||(LA160_0 >= 53 && LA160_0 <= 54)||LA160_0==56||LA160_0==58||LA160_0==85||LA160_0==88||(LA160_0 >= 94 && LA160_0 <= 95)||(LA160_0 >= 100 && LA160_0 <= 107)||(LA160_0 >= 117 && LA160_0 <= 118)||LA160_0==124) ) {
                alt160=1;
            }
            else if ( (LA160_0==98) ) {
                alt160=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 160, 0, input);

                throw nvae;

            }
            switch (alt160) {
                case 1 :
                    // USE.g:1766:5: e= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_rValue8484);
                    e=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRValueExpressionOrOpCall(e); }

                    }
                    break;
                case 2 :
                    // USE.g:1767:5: oc= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_rValue8496);
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
    // USE.g:1780:1: rValList returns [List<ASTRValue> n] : ( nothing |rl= rValListMin1 );
    public final List<ASTRValue> rValList() throws RecognitionException {
        List<ASTRValue> n = null;


        List<ASTRValue> rl =null;


        try {
            // USE.g:1781:3: ( nothing |rl= rValListMin1 )
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==RBRACE) ) {
                alt161=1;
            }
            else if ( (LA161_0==AT||LA161_0==HASH||(LA161_0 >= IDENT && LA161_0 <= INT)||(LA161_0 >= LPAREN && LA161_0 <= MINUS)||LA161_0==PLUS||LA161_0==REAL||(LA161_0 >= STAR && LA161_0 <= STRING)||(LA161_0 >= 46 && LA161_0 <= 47)||LA161_0==50||(LA161_0 >= 53 && LA161_0 <= 54)||LA161_0==56||LA161_0==58||LA161_0==85||LA161_0==88||(LA161_0 >= 94 && LA161_0 <= 95)||LA161_0==98||(LA161_0 >= 100 && LA161_0 <= 107)||(LA161_0 >= 117 && LA161_0 <= 118)||LA161_0==124) ) {
                alt161=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 161, 0, input);

                throw nvae;

            }
            switch (alt161) {
                case 1 :
                    // USE.g:1782:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_rValList8519);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = Collections.<ASTRValue>emptyList(); }

                    }
                    break;
                case 2 :
                    // USE.g:1785:3: rl= rValListMin1
                    {
                    pushFollow(FOLLOW_rValListMin1_in_rValList8546);
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
    // USE.g:1793:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin1() throws RecognitionException {
        List<ASTRValue> n = null;


        ASTRValue r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // USE.g:1797:3: (r= rValue ( COMMA r= rValue )* )
            // USE.g:1798:3: r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin18579);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            // USE.g:1800:3: ( COMMA r= rValue )*
            loop162:
            do {
                int alt162=2;
                int LA162_0 = input.LA(1);

                if ( (LA162_0==COMMA) ) {
                    alt162=1;
                }


                switch (alt162) {
            	case 1 :
            	    // USE.g:1801:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin18593); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin18603);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add(r); }

            	    }
            	    break;

            	default :
            	    break loop162;
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
    // USE.g:1811:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin2() throws RecognitionException {
        List<ASTRValue> n = null;


        ASTRValue r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // USE.g:1815:3: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
            // USE.g:1816:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin28642);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin28650); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_rValListMin28658);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            // USE.g:1821:3: ( COMMA r= rValue )*
            loop163:
            do {
                int alt163=2;
                int LA163_0 = input.LA(1);

                if ( (LA163_0==COMMA) ) {
                    alt163=1;
                }


                switch (alt163) {
            	case 1 :
            	    // USE.g:1822:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin28672); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin28682);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add(r); }

            	    }
            	    break;

            	default :
            	    break loop163;
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
    // USE.g:1832:1: inSoilExpression returns [ASTExpression n] : e= expression ;
    public final ASTExpression inSoilExpression() throws RecognitionException {
        ASTExpression n = null;


        USEParser.expression_return e =null;


        try {
            // USE.g:1833:3: (e= expression )
            // USE.g:1834:3: e= expression
            {
            pushFollow(FOLLOW_expression_in_inSoilExpression8716);
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
    // USE.g:1843:1: exprList returns [List<ASTExpression> n] : ( nothing |el= exprListMin1 );
    public final List<ASTExpression> exprList() throws RecognitionException {
        List<ASTExpression> n = null;


        List<ASTExpression> el =null;


        try {
            // USE.g:1844:3: ( nothing |el= exprListMin1 )
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==EOF) ) {
                alt164=1;
            }
            else if ( (LA164_0==AT||LA164_0==HASH||(LA164_0 >= IDENT && LA164_0 <= INT)||(LA164_0 >= LPAREN && LA164_0 <= MINUS)||LA164_0==PLUS||LA164_0==REAL||(LA164_0 >= STAR && LA164_0 <= STRING)||(LA164_0 >= 46 && LA164_0 <= 47)||LA164_0==50||(LA164_0 >= 53 && LA164_0 <= 54)||LA164_0==56||LA164_0==58||LA164_0==85||LA164_0==88||(LA164_0 >= 94 && LA164_0 <= 95)||(LA164_0 >= 100 && LA164_0 <= 107)||(LA164_0 >= 117 && LA164_0 <= 118)||LA164_0==124) ) {
                alt164=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 164, 0, input);

                throw nvae;

            }
            switch (alt164) {
                case 1 :
                    // USE.g:1845:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_exprList8745);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<ASTExpression>(); }

                    }
                    break;
                case 2 :
                    // USE.g:1848:3: el= exprListMin1
                    {
                    pushFollow(FOLLOW_exprListMin1_in_exprList8763);
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
    // USE.g:1856:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin1() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // USE.g:1860:3: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // USE.g:1861:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin18796);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // USE.g:1863:3: ( COMMA e= inSoilExpression )*
            loop165:
            do {
                int alt165=2;
                int LA165_0 = input.LA(1);

                if ( (LA165_0==COMMA) ) {
                    alt165=1;
                }


                switch (alt165) {
            	case 1 :
            	    // USE.g:1864:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin18811); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin18821);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            	    }
            	    break;

            	default :
            	    break loop165;
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
    // USE.g:1874:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin2() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // USE.g:1878:3: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // USE.g:1879:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin28861);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            match(input,COMMA,FOLLOW_COMMA_in_exprListMin28869); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_exprListMin28877);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // USE.g:1884:3: ( COMMA e= inSoilExpression )*
            loop166:
            do {
                int alt166=2;
                int LA166_0 = input.LA(1);

                if ( (LA166_0==COMMA) ) {
                    alt166=1;
                }


                switch (alt166) {
            	case 1 :
            	    // USE.g:1885:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin28891); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin28901);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            	    }
            	    break;

            	default :
            	    break loop166;
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
    // USE.g:1895:1: identList returns [List<String> n] : ( nothing |il= identListMin1 );
    public final List<String> identList() throws RecognitionException {
        List<String> n = null;


        List<String> il =null;


        try {
            // USE.g:1896:3: ( nothing |il= identListMin1 )
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==EOF||LA167_0==RBRACE||LA167_0==SEMI||(LA167_0 >= 80 && LA167_0 <= 81)) ) {
                alt167=1;
            }
            else if ( (LA167_0==IDENT) ) {
                alt167=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 167, 0, input);

                throw nvae;

            }
            switch (alt167) {
                case 1 :
                    // USE.g:1897:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_identList8931);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<String>(); }

                    }
                    break;
                case 2 :
                    // USE.g:1900:3: il= identListMin1
                    {
                    pushFollow(FOLLOW_identListMin1_in_identList8948);
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
    // USE.g:1908:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
    public final List<String> identListMin1() throws RecognitionException {
        List<String> n = null;


        Token id=null;


          n = new ArrayList<String>();

        try {
            // USE.g:1912:3: (id= IDENT ( COMMA id= IDENT )* )
            // USE.g:1913:3: id= IDENT ( COMMA id= IDENT )*
            {
            id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin18982); if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((id!=null?id.getText():null)); }

            // USE.g:1915:3: ( COMMA id= IDENT )*
            loop168:
            do {
                int alt168=2;
                int LA168_0 = input.LA(1);

                if ( (LA168_0==COMMA) ) {
                    alt168=1;
                }


                switch (alt168) {
            	case 1 :
            	    // USE.g:1916:5: COMMA id= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identListMin18996); if (state.failed) return n;

            	    id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin19006); if (state.failed) return n;

            	    if ( state.backtracking==0 ) {
            	        n.add((id!=null?id.getText():null)); }

            	    }
            	    break;

            	default :
            	    break loop168;
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
        // USE.g:1314:7: ( COLON type EQUAL )
        // USE.g:1314:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred1_USE6732); if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred1_USE6734);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_USE6736); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_USE

    // $ANTLR start synpred2_USE
    public final void synpred2_USE_fragment() throws RecognitionException {
        // USE.g:1465:5: ( statStartingWithExpr )
        // USE.g:1465:6: statStartingWithExpr
        {
        pushFollow(FOLLOW_statStartingWithExpr_in_synpred2_USE7284);
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
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA63 dfa63 = new DFA63(this);
    static final String DFA2_eotS =
        "\45\uffff";
    static final String DFA2_eofS =
        "\1\1\44\uffff";
    static final String DFA2_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\23\2\uffff\1\25\3\15\1\27\1\12\1\35"+
        "\1\24\1\5\1\uffff\1\15\1\23\1\5\5\23\1\35\1\15\2\23\1\13\1\12\1"+
        "\35\2\27\1\60\1\12\1\23";
    static final String DFA2_maxS =
        "\1\141\1\uffff\1\71\1\uffff\1\23\2\uffff\1\31\3\15\1\167\1\44\1"+
        "\35\1\103\1\67\1\uffff\1\15\1\23\1\123\5\23\1\35\1\15\2\23\1\13"+
        "\1\44\1\35\2\167\1\71\1\44\1\23";
    static final String DFA2_acceptS =
        "\1\uffff\1\5\1\uffff\1\1\1\uffff\1\3\1\4\11\uffff\1\2\24\uffff";
    static final String DFA2_specialS =
        "\45\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\15\uffff\1\4\47\uffff\1\3\4\uffff\2\3\6\uffff\1\5\12\uffff"+
            "\1\6\15\uffff\1\1",
            "",
            "\1\7\34\uffff\1\10\3\uffff\1\11\4\uffff\1\12",
            "",
            "\1\13",
            "",
            "",
            "\1\3\3\uffff\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\3\52\uffff\1\3\2\uffff\1\20\2\uffff\1\3\10\uffff\1\3\33"+
            "\uffff\1\3\11\uffff\1\3",
            "\1\22\10\uffff\1\21\20\uffff\1\23",
            "\1\24",
            "\1\26\56\uffff\1\25",
            "\1\30\53\uffff\1\27\5\uffff\1\27",
            "",
            "\1\31",
            "\1\32",
            "\1\2\15\uffff\1\33\47\uffff\1\3\4\uffff\2\3\21\uffff\1\6",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\22\31\uffff\1\23",
            "\1\43",
            "\1\3\52\uffff\1\3\2\uffff\1\20\2\uffff\1\3\10\uffff\1\3\33"+
            "\uffff\1\3\11\uffff\1\3",
            "\1\3\52\uffff\1\3\2\uffff\1\20\2\uffff\1\3\10\uffff\1\3\33"+
            "\uffff\1\3\11\uffff\1\3",
            "\1\44\3\uffff\1\44\4\uffff\1\44",
            "\1\22\31\uffff\1\23",
            "\1\34"
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
            return "()* loopback of 136:5: ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )*";
        }
    }
    static final String DFA1_eotS =
        "\30\uffff";
    static final String DFA1_eofS =
        "\1\1\4\uffff\1\10\22\uffff";
    static final String DFA1_minS =
        "\1\5\1\uffff\2\23\1\25\1\5\1\41\2\uffff\3\15\1\23\1\35\1\24\1\5"+
        "\4\41\1\23\1\13\1\60\1\41";
    static final String DFA1_maxS =
        "\1\141\1\uffff\1\71\1\23\1\31\1\141\1\71\2\uffff\3\15\1\111\1\35"+
        "\1\103\1\67\4\71\1\23\1\13\2\71";
    static final String DFA1_acceptS =
        "\1\uffff\1\3\5\uffff\1\2\1\1\17\uffff";
    static final String DFA1_specialS =
        "\30\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\15\uffff\1\1\47\uffff\1\1\4\uffff\2\1\6\uffff\1\1\1\3\11"+
            "\uffff\1\1\15\uffff\1\1",
            "",
            "\1\4\34\uffff\1\1\3\uffff\1\1\4\uffff\1\1",
            "\1\5",
            "\1\6\3\uffff\1\1",
            "\1\10\1\uffff\1\10\1\7\1\uffff\1\10\10\uffff\1\10\47\uffff"+
            "\1\10\4\uffff\2\10\6\uffff\2\10\11\uffff\2\10\10\uffff\1\10"+
            "\3\uffff\1\10",
            "\1\14\16\uffff\1\11\3\uffff\1\12\4\uffff\1\13",
            "",
            "",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\1\65\uffff\1\10",
            "\1\20",
            "\1\22\56\uffff\1\21",
            "\1\24\53\uffff\1\23\5\uffff\1\23",
            "\1\14\16\uffff\1\11\3\uffff\1\12\4\uffff\1\13",
            "\1\14\16\uffff\1\11\3\uffff\1\12\4\uffff\1\13",
            "\1\14\16\uffff\1\11\3\uffff\1\12\4\uffff\1\13",
            "\1\14\16\uffff\1\11\3\uffff\1\12\4\uffff\1\13",
            "\1\25",
            "\1\26",
            "\1\27\3\uffff\1\27\4\uffff\1\27",
            "\1\14\16\uffff\1\11\3\uffff\1\12\4\uffff\1\13"
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
            return "()* loopback of 139:11: (cons= invariant |ppc= prePost )*";
        }
    }
    static final String DFA35_eotS =
        "\16\uffff";
    static final String DFA35_eofS =
        "\16\uffff";
    static final String DFA35_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\31\1\12\1\15\1\23\1\5\1\35\1\15\1\12"+
        "\1\35\1\12";
    static final String DFA35_maxS =
        "\1\167\1\uffff\1\23\1\uffff\1\31\1\44\1\15\1\23\1\161\1\35\1\15"+
        "\1\44\1\35\1\44";
    static final String DFA35_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\12\uffff";
    static final String DFA35_specialS =
        "\16\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\2\15\uffff\1\1\21\uffff\1\1\42\uffff\1\1\10\uffff\1\1\36"+
            "\uffff\2\3\5\uffff\1\1",
            "",
            "\1\4",
            "",
            "\1\5",
            "\1\7\10\uffff\1\6\20\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\2\15\uffff\1\1\134\uffff\2\3",
            "\1\13",
            "\1\14",
            "\1\7\31\uffff\1\10",
            "\1\15",
            "\1\7\31\uffff\1\10"
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "()* loopback of 321:5: (ppc= prePostClause )*";
        }
    }
    static final String DFA57_eotS =
        "\36\uffff";
    static final String DFA57_eofS =
        "\1\1\35\uffff";
    static final String DFA57_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\25\3\15\1\12\1\35\1\24\1\5\1\15\1\23"+
        "\5\5\1\23\1\35\1\15\1\23\1\13\1\12\1\35\1\25\1\60\1\12\1\5";
    static final String DFA57_maxS =
        "\1\141\1\uffff\1\71\1\uffff\1\31\3\15\1\44\1\35\1\103\1\67\1\15"+
        "\1\23\5\135\1\23\1\35\1\15\1\71\1\13\1\44\1\35\1\31\1\71\1\44\1"+
        "\135";
    static final String DFA57_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\32\uffff";
    static final String DFA57_specialS =
        "\36\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\2\15\uffff\1\1\47\uffff\1\1\4\uffff\2\1\6\uffff\2\1\11\uffff"+
            "\1\1\1\3\10\uffff\1\3\3\uffff\1\1",
            "",
            "\1\4\34\uffff\1\5\3\uffff\1\6\4\uffff\1\7",
            "",
            "\1\1\3\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\15\10\uffff\1\14\20\uffff\1\16",
            "\1\17",
            "\1\21\56\uffff\1\20",
            "\1\23\53\uffff\1\22\5\uffff\1\22",
            "\1\24",
            "\1\25",
            "\1\26\15\uffff\1\1\47\uffff\1\1\4\uffff\2\1\21\uffff\1\1\11"+
            "\uffff\1\3",
            "\1\3\15\uffff\1\1\111\uffff\1\3",
            "\1\3\15\uffff\1\1\111\uffff\1\3",
            "\1\3\15\uffff\1\1\111\uffff\1\3",
            "\1\3\15\uffff\1\1\111\uffff\1\3",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32\34\uffff\1\1\3\uffff\1\1\4\uffff\1\1",
            "\1\33",
            "\1\15\31\uffff\1\16",
            "\1\34",
            "\1\1\3\uffff\1\10",
            "\1\35\3\uffff\1\35\4\uffff\1\35",
            "\1\15\31\uffff\1\16",
            "\1\3\15\uffff\1\1\111\uffff\1\3"
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "()* loopback of 487:5: (inv= invariantClause )*";
        }
    }
    static final String DFA63_eotS =
        "\20\uffff";
    static final String DFA63_eofS =
        "\1\1\17\uffff";
    static final String DFA63_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\25\1\12\1\15\1\23\1\5\1\35\1\15\1\23"+
        "\1\12\1\35\1\25\1\12";
    static final String DFA63_maxS =
        "\1\161\1\uffff\1\71\1\uffff\1\31\1\44\1\15\1\23\1\161\1\35\1\15"+
        "\1\71\1\44\1\35\1\31\1\44";
    static final String DFA63_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\14\uffff";
    static final String DFA63_specialS =
        "\20\uffff}>";
    static final String[] DFA63_transitionS = {
            "\1\2\15\uffff\1\1\47\uffff\1\1\4\uffff\2\1\6\uffff\2\1\11\uffff"+
            "\1\1\15\uffff\1\1\16\uffff\2\3",
            "",
            "\1\4\34\uffff\1\1\3\uffff\1\1\4\uffff\1\1",
            "",
            "\1\1\3\uffff\1\5",
            "\1\7\10\uffff\1\6\20\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\13\15\uffff\1\1\47\uffff\1\1\4\uffff\2\1\21\uffff\1\1\34"+
            "\uffff\2\3",
            "\1\14",
            "\1\15",
            "\1\16\34\uffff\1\1\3\uffff\1\1\4\uffff\1\1",
            "\1\7\31\uffff\1\10",
            "\1\17",
            "\1\1\3\uffff\1\5",
            "\1\7\31\uffff\1\10"
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "()+ loopback of 516:5: (ppc= prePostClause )+";
        }
    }
 

    public static final BitSet FOLLOW_annotationSet_in_model71 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_model77 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_model81 = new BitSet(new long[]{0x0800000000080020L,0x0000000200080103L});
    public static final BitSet FOLLOW_generalClassifierDefinition_in_model93 = new BitSet(new long[]{0x0800000000080020L,0x0000000200080103L});
    public static final BitSet FOLLOW_associationDefinition_in_model106 = new BitSet(new long[]{0x0800000000080020L,0x0000000200080103L});
    public static final BitSet FOLLOW_72_in_model120 = new BitSet(new long[]{0x0800000000080020L,0x0000000200080303L});
    public static final BitSet FOLLOW_invariant_in_model138 = new BitSet(new long[]{0x0800000000080020L,0x0000000200080303L});
    public static final BitSet FOLLOW_prePost_in_model159 = new BitSet(new long[]{0x0800000000080020L,0x0000000200080303L});
    public static final BitSet FOLLOW_enumTypeDefinition_in_model199 = new BitSet(new long[]{0x0800000000080020L,0x0000000200080103L});
    public static final BitSet FOLLOW_moduleExpr_in_model217 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_EOF_in_model223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_enumTypeDefinition246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_enumTypeDefinition252 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_enumTypeDefinition256 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_enumTypeDefinition258 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_enumTypeDefinition262 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_enumTypeDefinition264 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_enumTypeDefinition268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_generalClassifierDefinition306 = new BitSet(new long[]{0x0800000000080020L,0x0000000000000003L});
    public static final BitSet FOLLOW_59_in_generalClassifierDefinition314 = new BitSet(new long[]{0x0000000000080020L,0x0000000000000003L});
    public static final BitSet FOLLOW_classDefinition_in_generalClassifierDefinition342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_associationClassDefinition_in_generalClassifierDefinition380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signalDefinition_in_generalClassifierDefinition425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_annotation_in_classDefinition479 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_line_annotation_in_classDefinition485 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyClass_in_classDefinition495 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_classDefinition499 = new BitSet(new long[]{0x0000000000800000L,0x0080200000020104L});
    public static final BitSet FOLLOW_LESS_in_classDefinition509 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_classDefinition513 = new BitSet(new long[]{0x0000000000000000L,0x0080200000020104L});
    public static final BitSet FOLLOW_66_in_classDefinition526 = new BitSet(new long[]{0x0000000000080020L,0x0080200000020100L});
    public static final BitSet FOLLOW_attributeDefinition_in_classDefinition539 = new BitSet(new long[]{0x0000000000080020L,0x0080200000020100L});
    public static final BitSet FOLLOW_109_in_classDefinition560 = new BitSet(new long[]{0x0000000000080020L,0x0080000000020100L});
    public static final BitSet FOLLOW_operationDefinition_in_classDefinition573 = new BitSet(new long[]{0x0000000000080020L,0x0080000000020100L});
    public static final BitSet FOLLOW_72_in_classDefinition594 = new BitSet(new long[]{0x0000000000000020L,0x0080000020120000L});
    public static final BitSet FOLLOW_invariantClause_in_classDefinition614 = new BitSet(new long[]{0x0000000000000020L,0x0080000020120000L});
    public static final BitSet FOLLOW_119_in_classDefinition640 = new BitSet(new long[]{0x0000000000000000L,0x0004000000020000L});
    public static final BitSet FOLLOW_stateMachine_in_classDefinition660 = new BitSet(new long[]{0x0000000000000000L,0x0004000000020000L});
    public static final BitSet FOLLOW_81_in_classDefinition684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_associationClassDefinition717 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationClassDefinition743 = new BitSet(new long[]{0x0000000000880000L,0x0080200000020124L});
    public static final BitSet FOLLOW_LESS_in_associationClassDefinition753 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_associationClassDefinition757 = new BitSet(new long[]{0x0000000000080000L,0x0080200000020124L});
    public static final BitSet FOLLOW_69_in_associationClassDefinition769 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition777 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition789 = new BitSet(new long[]{0x0000000000080020L,0x0080200000020104L});
    public static final BitSet FOLLOW_66_in_associationClassDefinition809 = new BitSet(new long[]{0x0000000000080020L,0x0080200000020100L});
    public static final BitSet FOLLOW_attributeDefinition_in_associationClassDefinition822 = new BitSet(new long[]{0x0000000000080020L,0x0080200000020100L});
    public static final BitSet FOLLOW_109_in_associationClassDefinition843 = new BitSet(new long[]{0x0000000000080020L,0x0080000000020100L});
    public static final BitSet FOLLOW_operationDefinition_in_associationClassDefinition856 = new BitSet(new long[]{0x0000000000080020L,0x0080000000020100L});
    public static final BitSet FOLLOW_72_in_associationClassDefinition877 = new BitSet(new long[]{0x0000000000080020L,0x0080000020120000L});
    public static final BitSet FOLLOW_invariantClause_in_associationClassDefinition897 = new BitSet(new long[]{0x0000000000080020L,0x0080000020120000L});
    public static final BitSet FOLLOW_119_in_associationClassDefinition923 = new BitSet(new long[]{0x0000000000080000L,0x0004000000020000L});
    public static final BitSet FOLLOW_stateMachine_in_associationClassDefinition943 = new BitSet(new long[]{0x0000000000080000L,0x0004000000020000L});
    public static final BitSet FOLLOW_keyAggregation_in_associationClassDefinition984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_keyComposition_in_associationClassDefinition988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_associationClassDefinition1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_attributeDefinition1039 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attributeDefinition1047 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_attributeDefinition1049 = new BitSet(new long[]{0x0164C00000080000L});
    public static final BitSet FOLLOW_type_in_attributeDefinition1053 = new BitSet(new long[]{0x0000002000080002L});
    public static final BitSet FOLLOW_keyDerive_in_attributeDefinition1077 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_keyDerived_in_attributeDefinition1079 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_set_in_attributeDefinition1082 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_attributeDefinition1092 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_keyInit_in_attributeDefinition1112 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_set_in_attributeDefinition1116 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_attributeDefinition1128 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_attributeDefinition1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_operationDefinition1173 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_operationDefinition1183 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_paramList_in_operationDefinition1193 = new BitSet(new long[]{0x00000020000020A2L,0x0003000000000010L});
    public static final BitSet FOLLOW_COLON_in_operationDefinition1207 = new BitSet(new long[]{0x0164C00000080000L});
    public static final BitSet FOLLOW_type_in_operationDefinition1213 = new BitSet(new long[]{0x0000002000002022L,0x0003000000000010L});
    public static final BitSet FOLLOW_EQUAL_in_operationDefinition1241 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_operationDefinition1247 = new BitSet(new long[]{0x0000002000000022L,0x0003000000000000L});
    public static final BitSet FOLLOW_blockStat_in_operationDefinition1269 = new BitSet(new long[]{0x0000002000000022L,0x0003000000000000L});
    public static final BitSet FOLLOW_prePostClause_in_operationDefinition1291 = new BitSet(new long[]{0x0000002000000022L,0x0003000000000000L});
    public static final BitSet FOLLOW_SEMI_in_operationDefinition1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_associationDefinition1335 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_line_annotation_in_associationDefinition1341 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyAssociation_in_associationDefinition1358 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyAggregation_in_associationDefinition1362 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyComposition_in_associationDefinition1366 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationDefinition1376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_associationDefinition1384 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationDefinition1392 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationDefinition1404 = new BitSet(new long[]{0x0000000000080020L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_associationDefinition1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_associationEnd1440 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd1448 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LBRACK_in_associationEnd1450 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_multiplicity_in_associationEnd1454 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_associationEnd1456 = new BitSet(new long[]{0x0000002000080002L,0x0208800000000000L});
    public static final BitSet FOLLOW_keyRole_in_associationEnd1467 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd1471 = new BitSet(new long[]{0x0000002000080002L,0x0208800000000000L});
    public static final BitSet FOLLOW_111_in_associationEnd1492 = new BitSet(new long[]{0x0000002000080002L,0x0208800000000000L});
    public static final BitSet FOLLOW_121_in_associationEnd1504 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd1508 = new BitSet(new long[]{0x0000002000080002L,0x0208800000000000L});
    public static final BitSet FOLLOW_keyUnion_in_associationEnd1520 = new BitSet(new long[]{0x0000002000080002L,0x0208800000000000L});
    public static final BitSet FOLLOW_115_in_associationEnd1532 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd1536 = new BitSet(new long[]{0x0000002000080002L,0x0208800000000000L});
    public static final BitSet FOLLOW_keyDerived_in_associationEnd1549 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_keyDerive_in_associationEnd1551 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_LPAREN_in_associationEnd1556 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_associationEnd1562 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_associationEnd1564 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_associationEnd1568 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_associationEnd1572 = new BitSet(new long[]{0x0000002000080002L,0x0208800000000000L});
    public static final BitSet FOLLOW_keyQualifier_in_associationEnd1584 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_paramList_in_associationEnd1590 = new BitSet(new long[]{0x0000002000080002L,0x0208800000000000L});
    public static final BitSet FOLLOW_SEMI_in_associationEnd1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicityRange_in_multiplicity1642 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_multiplicity1652 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_multiplicityRange_in_multiplicity1656 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange1685 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_multiplicityRange1695 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_multiplicitySpec1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicitySpec1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_annotation_in_annotationSpec1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_annotation_in_annotationSpec1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_block_annotation1802 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_block_annotation1804 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_block_annotation1806 = new BitSet(new long[]{0x0211000200000000L});
    public static final BitSet FOLLOW_annotation_tag_in_block_annotation1811 = new BitSet(new long[]{0x0211000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_block_annotation1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_line_annotation1838 = new BitSet(new long[]{0x0211000000000000L});
    public static final BitSet FOLLOW_annotation_tag_in_line_annotation1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_comment_in_annotation_tag1857 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotation_tag1859 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_NON_OCL_STRING_in_annotation_tag1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_weight_in_annotation_tag1870 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotation_tag1872 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_annotation_def_in_annotation_tag1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_annotation_tag1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_type_in_annotation_tag1889 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotation_tag1891 = new BitSet(new long[]{0x0082000000000020L});
    public static final BitSet FOLLOW_annotation_enum_type_in_annotation_tag1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_ref_in_annotation_tag1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_annotation_comment1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_annotation_weight1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_annotation_type1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_annotation_override1949 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_annotation_override1951 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_annotation_override1953 = new BitSet(new long[]{0x0211000000000000L});
    public static final BitSet FOLLOW_annotation_term_in_annotation_override1955 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_annotation_override1957 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_annotation_override1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_tag_in_annotation_term1976 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_annotation_term1980 = new BitSet(new long[]{0x0211000000000000L});
    public static final BitSet FOLLOW_annotation_tag_in_annotation_term1982 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_AT_in_annotation_ref1994 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_annotation_ref1996 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_annotation_ref1998 = new BitSet(new long[]{0x0211000000000000L});
    public static final BitSet FOLLOW_annotation_predefined_in_annotation_ref2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_annotation_def2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_annotation_in_invariant2055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_invariant2066 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_invariant2076 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_COMMA_in_invariant2088 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_invariant2092 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_COLON_in_invariant2100 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_invariant2112 = new BitSet(new long[]{0x0000000000000022L,0x0000000020100000L});
    public static final BitSet FOLLOW_invariantClause_in_invariant2124 = new BitSet(new long[]{0x0000000000000022L,0x0000000020100000L});
    public static final BitSet FOLLOW_line_annotation_in_invariantClause2156 = new BitSet(new long[]{0x0000000000000020L,0x0000000020000000L});
    public static final BitSet FOLLOW_annotationSet_in_invariantClause2166 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_invariantClause2173 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_IDENT_in_invariantClause2179 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_invariantClause2184 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_invariantClause2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_invariantClause2205 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_invariantClause2207 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_IDENT_in_invariantClause2213 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_invariantClause2218 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_invariantClause2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_prePost2255 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_prePost2259 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_prePost2261 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_prePost2265 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_paramList_in_prePost2269 = new BitSet(new long[]{0x00000000000000A0L,0x0003000000000000L});
    public static final BitSet FOLLOW_COLON_in_prePost2273 = new BitSet(new long[]{0x0164C00000080000L});
    public static final BitSet FOLLOW_type_in_prePost2277 = new BitSet(new long[]{0x0000000000000020L,0x0003000000000000L});
    public static final BitSet FOLLOW_prePostClause_in_prePost2296 = new BitSet(new long[]{0x0000000000000022L,0x0003000000000000L});
    public static final BitSet FOLLOW_annotationSet_in_prePostClause2330 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_set_in_prePostClause2342 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_IDENT_in_prePostClause2357 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_prePostClause2362 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_prePostClause2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_annotationSet2393 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_annotation2412 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_annotation2416 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_annotation2422 = new BitSet(new long[]{0x0000001000080400L});
    public static final BitSet FOLLOW_annotationValues_in_annotation2431 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_annotation2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationValue_in_annotationValues2459 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_annotationValues2467 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_annotationValue_in_annotationValues2471 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_annotationValue2490 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotationValue2495 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_NON_OCL_STRING_in_annotationValue2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_stateMachine2531 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_stateMachine2564 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_stateMachine2577 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_stateDefinition_in_stateMachine2593 = new BitSet(new long[]{0x0000000000080000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_stateMachine2603 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_transitionDefinition_in_stateMachine2619 = new BitSet(new long[]{0x0000000000080000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_stateMachine2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_stateDefinition2645 = new BitSet(new long[]{0x0000000000400082L});
    public static final BitSet FOLLOW_COLON_in_stateDefinition2653 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_stateDefinition2657 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_LBRACK_in_stateDefinition2668 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_stateDefinition2674 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_stateDefinition2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_transitionDefinition2697 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ARROW_in_transitionDefinition2699 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_transitionDefinition2703 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_LBRACE_in_transitionDefinition2713 = new BitSet(new long[]{0x0000000000480000L,0x0000000000000400L});
    public static final BitSet FOLLOW_LBRACK_in_transitionDefinition2723 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_transitionDefinition2727 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_transitionDefinition2731 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000400L});
    public static final BitSet FOLLOW_event_in_transitionDefinition2755 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_IDENT_in_transitionDefinition2771 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_transitionDefinition2775 = new BitSet(new long[]{0x0000001002000000L});
    public static final BitSet FOLLOW_paramList_in_transitionDefinition2780 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_transitionDefinition2787 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_LBRACK_in_transitionDefinition2804 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_transitionDefinition2808 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_transitionDefinition2812 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_transitionDefinition2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_event2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keySignal_in_signalDefinition2862 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_signalDefinition2866 = new BitSet(new long[]{0x0000000000800000L,0x0000000000020104L});
    public static final BitSet FOLLOW_LESS_in_signalDefinition2881 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_signalDefinition2885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020104L});
    public static final BitSet FOLLOW_66_in_signalDefinition2898 = new BitSet(new long[]{0x0000000000080020L,0x0000000000020100L});
    public static final BitSet FOLLOW_attributeDefinition_in_signalDefinition2911 = new BitSet(new long[]{0x0000000000080020L,0x0000000000020100L});
    public static final BitSet FOLLOW_72_in_signalDefinition2932 = new BitSet(new long[]{0x0000000000000020L,0x0000000020120000L});
    public static final BitSet FOLLOW_invariantClause_in_signalDefinition2952 = new BitSet(new long[]{0x0000000000000020L,0x0000000020120000L});
    public static final BitSet FOLLOW_81_in_signalDefinition2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyUnion2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyAssociation3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyRole3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyComposition3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyAggregation3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyClass3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keySignal3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyDerived3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyDerive3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyInit3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyQualifier3128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_checkExpr3143 = new BitSet(new long[]{0x0000000000080000L,0x0010000000000000L});
    public static final BitSet FOLLOW_queryExpr_in_checkExpr3147 = new BitSet(new long[]{0x0000300000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_checkExpr3175 = new BitSet(new long[]{0x0000000000080000L,0x0010000000000000L});
    public static final BitSet FOLLOW_queryExpr_in_checkExpr3179 = new BitSet(new long[]{0x0000300000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_checkExpr3237 = new BitSet(new long[]{0x0000000000080000L,0x0010000000000000L});
    public static final BitSet FOLLOW_queryExpr_in_checkExpr3241 = new BitSet(new long[]{0x0000300000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_checkExpr3300 = new BitSet(new long[]{0x0000000000080000L,0x0010000000000000L});
    public static final BitSet FOLLOW_queryExpr_in_checkExpr3306 = new BitSet(new long[]{0x0000300000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_checkExpr3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleExpr_in_checkExpr3370 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_moduleExpr_in_checkExpr3386 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_EOF_in_checkExpr3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_queryExpr3413 = new BitSet(new long[]{0x1000010000080000L,0x0000100800000000L});
    public static final BitSet FOLLOW_featureExpr_in_queryExpr3417 = new BitSet(new long[]{0x8000000000000402L,0x8000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_queryExpr3422 = new BitSet(new long[]{0x1000010000080000L,0x0000100800000000L});
    public static final BitSet FOLLOW_featureExpr_in_queryExpr3426 = new BitSet(new long[]{0x8000000000000402L,0x8000000000000040L});
    public static final BitSet FOLLOW_withExpr_in_queryExpr3444 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_butExpr_in_queryExpr3462 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_queryExpr3479 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_queryExpr3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpr3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_featureExpr3529 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_featureExpr3536 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rankExpr_in_featureExpr3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrExpr_in_featureExpr3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assocExpr_in_featureExpr3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_modifiers3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_modifiers3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_modifiers3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attrExpr3638 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_attrExpr3644 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_attrExpr3648 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rankExpr_in_attrExpr3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assocExpr3674 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_assocExpr3680 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_assocExpr3684 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_assocExpr3690 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_assocExpr3694 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rankExpr_in_assocExpr3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_withExpr3730 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_invExpr_in_withExpr3734 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_withExpr3738 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_invExpr_in_withExpr3742 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_70_in_butExpr3765 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_invExpr_in_butExpr3769 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_butExpr3773 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_invExpr_in_butExpr3777 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_set_in_invExpr3799 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_invExpr3805 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_invExpr3809 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rankExpr_in_invExpr3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_rankExpr3836 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_INT_in_rankExpr3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_moduleExpr3858 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_moduleExpr3862 = new BitSet(new long[]{0x0000000000080000L,0x0010000000000000L});
    public static final BitSet FOLLOW_queryExpr_in_moduleExpr3876 = new BitSet(new long[]{0x0000000000080000L,0x0010000000020000L});
    public static final BitSet FOLLOW_queryExpr_in_moduleExpr3892 = new BitSet(new long[]{0x0000000000080000L,0x0010000000020000L});
    public static final BitSet FOLLOW_81_in_moduleExpr3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly3929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_expression3979 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression3990 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression3994 = new BitSet(new long[]{0x0164C00000080000L});
    public static final BitSet FOLLOW_type_in_expression3998 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression4003 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_expression4007 = new BitSet(new long[]{0x0000000000000400L,0x0000000004000000L});
    public static final BitSet FOLLOW_COMMA_in_expression4045 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression4057 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression4061 = new BitSet(new long[]{0x0164C00000080000L});
    public static final BitSet FOLLOW_type_in_expression4065 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression4070 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_expression4074 = new BitSet(new long[]{0x0000000000000400L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_expression4115 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList4164 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList4181 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_paramList4193 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList4197 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_paramList4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList4246 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_idList4256 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_idList4260 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration4291 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration4293 = new BitSet(new long[]{0x0164C00000080000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression4333 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_conditionalImpliesExpression4346 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF041200000L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression4350 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression4395 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_conditionalOrExpression4408 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF041200000L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression4412 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression4456 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_conditionalXOrExpression4469 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF041200000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression4473 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression4517 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_conditionalAndExpression4530 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF041200000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression4534 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4582 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_set_in_equalityExpression4601 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF041200000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4611 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression4660 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_set_in_relationalExpression4678 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF041200000L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression4696 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4746 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression4764 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF041200000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4774 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4824 = new BitSet(new long[]{0x0000014000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression4842 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF041200000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4856 = new BitSet(new long[]{0x0000014000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_set_in_unaryExpression4918 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF041200000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression4995 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression5013 = new BitSet(new long[]{0x0000000000080000L,0x0060074040000000L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression5019 = new BitSet(new long[]{0x0000000000080000L,0x0060074040000000L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression5030 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_literal_in_primaryExpression5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression5084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression5096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression5107 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression5111 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression5125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression5137 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression5139 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_primaryExpression5141 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression5164 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_primaryExpression5166 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression5184 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression5186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression5199 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression5201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_primaryExpression5203 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression5207 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression5211 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression5213 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression5233 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_primaryExpression5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference5261 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_objectReference5269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall5334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall5347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall5360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall5373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inStateExpression_in_propertyCall5386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression5421 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression5428 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression5439 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_queryExpression5443 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_queryExpression5454 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_iterateExpression5492 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression5498 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression5506 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression5508 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression5516 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression5518 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_iterateExpression5526 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression5532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression5576 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression5598 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_operationExpression5611 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression5624 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_operationExpression5628 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression5640 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression5657 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_operationExpression5672 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression5687 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_operationExpression5691 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression5705 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_operationExpression5730 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_operationExpression5732 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression5757 = new BitSet(new long[]{0x0564C318861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_operationExpression5778 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression5790 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_operationExpression5794 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression5814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_inStateExpression5851 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_inStateExpression5856 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_inStateExpression5865 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_inStateExpression5870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression5906 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression5930 = new BitSet(new long[]{0x0164C00000080000L});
    public static final BitSet FOLLOW_type_in_typeExpression5934 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression5936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration5974 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration5977 = new BitSet(new long[]{0x0164C00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration5981 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration5991 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration5997 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration6000 = new BitSet(new long[]{0x0164C00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration6006 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization6034 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization6036 = new BitSet(new long[]{0x0164C00000080000L});
    public static final BitSet FOLLOW_type_in_variableInitialization6040 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization6042 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_variableInitialization6046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ifExpression6078 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_ifExpression6082 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_ifExpression6084 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_ifExpression6088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ifExpression6090 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_ifExpression6094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ifExpression6096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_literal6135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_literal6149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal6162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal6177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal6191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal6201 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal6205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal6217 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal6219 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal6223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal6235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal6247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal6259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal6271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_literal6283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral6321 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral6350 = new BitSet(new long[]{0x0564C30A861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral6367 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral6380 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral6384 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral6403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem6432 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem6443 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_collectionItem6447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_emptyCollectionLiteral6476 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral6478 = new BitSet(new long[]{0x0064C00000000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral6482 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral6484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral6500 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral6502 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral6504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_undefinedLiteral6534 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral6536 = new BitSet(new long[]{0x0164C00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral6540 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral6542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_undefinedLiteral6556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_undefinedLiteral6570 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral6572 = new BitSet(new long[]{0x0164C00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral6576 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral6578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_undefinedLiteral6592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_tupleLiteral6631 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral6637 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral6645 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral6656 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral6660 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral6671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem6702 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_tupleItem6741 = new BitSet(new long[]{0x0164C00000080000L});
    public static final BitSet FOLLOW_type_in_tupleItem6745 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem6747 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_tupleItem6751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem6773 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_expression_in_tupleItem6783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type6849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type6861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type6873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly6905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly6907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType6935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType6973 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType7000 = new BitSet(new long[]{0x0164C00000080000L});
    public static final BitSet FOLLOW_type_in_collectionType7004 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType7006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_tupleType7040 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType7042 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType7051 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleType7062 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType7066 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType7078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart7110 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_tuplePart7112 = new BitSet(new long[]{0x0164C00000080000L});
    public static final BitSet FOLLOW_type_in_tuplePart7116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOnly7165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statOnly7169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_singleStat_in_stat7204 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_stat7216 = new BitSet(new long[]{0x0564C308861A0020L,0x50600FF4C9603010L});
    public static final BitSet FOLLOW_singleStat_in_stat7226 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_emptyStat_in_singleStat7266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat7292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignStat_in_singleStat7304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_singleStat7318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleStat7332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleStat7345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleStat7362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExStat_in_singleStat7379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterStat_in_singleStat7396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_singleStat7418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStat_in_singleStat7436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_emptyStat7463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr7489 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr7503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varAssignStat7541 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat7545 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF4C1200000L});
    public static final BitSet FOLLOW_rValue_in_varAssignStat7553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_attAssignStat7577 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attAssignStat7586 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat7590 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF4C1200000L});
    public static final BitSet FOLLOW_rValue_in_attAssignStat7598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_objCreateStat7624 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_objCreateStat7632 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat7642 = new BitSet(new long[]{0x0564C318861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat7655 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat7663 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_objCreateStat7681 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat7689 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF4C1200000L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat7703 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat7711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_objDestroyStat7747 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat7755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_lnkInsStat7781 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkInsStat7785 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF4C1200000L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat7795 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkInsStat7799 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_lnkInsStat7803 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkInsStat7811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7840 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7851 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF4C1200000L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7860 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7867 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers7883 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF4C1200000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7894 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7905 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF4C1200000L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7914 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7921 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers7943 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF4C1200000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7958 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7978 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF4C1200000L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7989 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7998 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_76_in_lnkDelStat8039 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkDelStat8043 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF4C1200000L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat8053 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkDelStat8057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_lnkDelStat8061 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkDelStat8070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_condExStat8101 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_inSoilExpression_in_condExStat8110 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_condExStat8114 = new BitSet(new long[]{0x0564C308861A0020L,0x50600FF4C9603810L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat8123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_80_in_condExStat8134 = new BitSet(new long[]{0x0564C308861A0020L,0x50600FF4C9603810L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat8146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_condExStat8158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_iterStat8183 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_iterStat8191 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_iterStat8195 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_inSoilExpression_in_iterStat8203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_iterStat8207 = new BitSet(new long[]{0x0564C308861A0020L,0x50600FF4C9603810L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_iterStat8215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_iterStat8220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_whileStat8246 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_inSoilExpression_in_whileStat8254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_whileStat8258 = new BitSet(new long[]{0x0564C308861A0020L,0x50600FF4C9603810L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_whileStat8266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_whileStat8271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_blockStat8301 = new BitSet(new long[]{0x0564C308861A0020L,0x50600FF4C9603810L});
    public static final BitSet FOLLOW_75_in_blockStat8306 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat8312 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_blockStat8318 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat8324 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_blockStat8331 = new BitSet(new long[]{0x0564C308861A0020L,0x50600FF4C9603010L});
    public static final BitSet FOLLOW_stat_in_blockStat8341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_blockStat8346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_implicitBlockStat8372 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat8378 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_implicitBlockStat8384 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat8390 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_implicitBlockStat8397 = new BitSet(new long[]{0x0564C308861A0020L,0x50600FF4C9603010L});
    public static final BitSet FOLLOW_stat_in_implicitBlockStat8405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOrImplicitBlock8428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitBlockStat_in_statOrImplicitBlock8438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_rValue8484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_rValue8496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_rValList8519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValListMin1_in_rValList8546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin18579 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin18593 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF4C1200000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin18603 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rValue_in_rValListMin28642 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin28650 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF4C1200000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin28658 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin28672 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF4C1200000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin28682 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_expression_in_inSoilExpression8716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_exprList8745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprListMin1_in_exprList8763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin18796 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin18811 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin18821 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin28861 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin28869 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin28877 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin28891 = new BitSet(new long[]{0x0564C308861A0020L,0x10600FF0C1200000L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin28901 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_nothing_in_identList8931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identListMin1_in_identList8948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identListMin18982 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_identListMin18996 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_identListMin19006 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COLON_in_synpred1_USE6732 = new BitSet(new long[]{0x0164C00000080000L});
    public static final BitSet FOLLOW_type_in_synpred1_USE6734 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred1_USE6736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_synpred2_USE7284 = new BitSet(new long[]{0x0000000000000002L});

}