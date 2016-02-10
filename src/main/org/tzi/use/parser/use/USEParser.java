// $ANTLR 3.4 USE.g 2016-02-10 16:34:41
 
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
import org.tzi.use.parser.use.tag.*;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", "NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", "REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", "WS", "'Bag'", "'Collection'", "'Comment'", "'OrderedSet'", "'Override'", "'Sequence'", "'Set'", "'Strong'", "'Tuple'", "'Type'", "'Undefined'", "'Weak'", "'Weight'", "'abstract'", "'allInstances'", "'and'", "'associationClass'", "'associationclass'", "'attributes'", "'begin'", "'between'", "'byUseId'", "'constraints'", "'context'", "'create'", "'declare'", "'default'", "'delete'", "'destroy'", "'div'", "'do'", "'else'", "'end'", "'endif'", "'enum'", "'existential'", "'false'", "'for'", "'from'", "'if'", "'implies'", "'in'", "'insert'", "'into'", "'inv'", "'iterate'", "'let'", "'model'", "'new'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", "'oclInState'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", "'operations'", "'or'", "'ordered'", "'post'", "'pre'", "'psm'", "'redefines'", "'selectByKind'", "'selectByType'", "'statemachines'", "'states'", "'subsets'", "'then'", "'transitions'", "'true'", "'while'", "'xor'"
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
    // USE.g:131:1: model returns [ASTModel n] : as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )* EOF ;
    public final ASTModel model() throws RecognitionException {
        ASTModel n = null;


        Token modelName=null;
        Set<ASTAnnotation> as =null;

        ASTAssociation a =null;

        ASTConstraintDefinition cons =null;

        ASTPrePost ppc =null;

        ASTEnumTypeDefinition e =null;


        try {
            // USE.g:132:2: (as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )* EOF )
            // USE.g:133:2: as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )* EOF
            {
            pushFollow(FOLLOW_annotationSet_in_model71);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            match(input,91,FOLLOW_91_in_model77); if (state.failed) return n;

            modelName=(Token)match(input,IDENT,FOLLOW_IDENT_in_model81); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTModel(modelName); n.setAnnotations(as); }

            // USE.g:135:5: ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )*
            loop2:
            do {
                int alt2=5;
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
            	    match(input,66,FOLLOW_66_in_model120); if (state.failed) return n;

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

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,EOF,FOLLOW_EOF_in_model214); if (state.failed) return n;

            }

        }
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
            pushFollow(FOLLOW_annotationSet_in_enumTypeDefinition242);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            match(input,78,FOLLOW_78_in_enumTypeDefinition248); if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumTypeDefinition252); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_enumTypeDefinition254); if (state.failed) return n;

            pushFollow(FOLLOW_idList_in_enumTypeDefinition258);
            idListRes=idList();

            state._fsp--;
            if (state.failed) return n;

            match(input,RBRACE,FOLLOW_RBRACE_in_enumTypeDefinition260); if (state.failed) return n;

            // USE.g:154:54: ( SEMI )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==SEMI) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // USE.g:154:56: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_enumTypeDefinition264); if (state.failed) return n;

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
            pushFollow(FOLLOW_annotationSet_in_generalClassifierDefinition302);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return ;

            // USE.g:169:5: ( 'abstract' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==57) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // USE.g:169:7: 'abstract'
                    {
                    match(input,57,FOLLOW_57_in_generalClassifierDefinition310); if (state.failed) return ;

                    if ( state.backtracking==0 ) { isAbstract = true; }

                    }
                    break;

            }


            // USE.g:170:5: (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] )
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
            case 60:
            case 61:
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
                    // USE.g:171:9: c= classDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_classDefinition_in_generalClassifierDefinition338);
                    c=classDefinition(isAbstract);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { n.addClass(c); c.setAnnotations(as); }

                    }
                    break;
                case 2 :
                    // USE.g:174:9: ac= associationClassDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_associationClassDefinition_in_generalClassifierDefinition376);
                    ac=associationClassDefinition(isAbstract);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { n.addAssociationClass(ac); ac.setAnnotations(as); }

                    }
                    break;
                case 3 :
                    // USE.g:177:9: s= signalDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_signalDefinition_in_generalClassifierDefinition421);
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
    // USE.g:198:1: classDefinition[boolean isAbstract] returns [ASTClass n] : ( block_annotation )? keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end' ;
    public final ASTClass classDefinition(boolean isAbstract) throws RecognitionException {
        ASTClass n = null;


        Token name=null;
        List idListRes =null;

        ASTAttribute a =null;

        ASTOperation op =null;

        ASTInvariantClause inv =null;

        ASTStateMachine sm =null;


         List idList; 
        try {
            // USE.g:200:2: ( ( block_annotation )? keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end' )
            // USE.g:201:2: ( block_annotation )? keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end'
            {
            // USE.g:201:2: ( block_annotation )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==AT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // USE.g:201:3: block_annotation
                    {
                    pushFollow(FOLLOW_block_annotation_in_classDefinition473);
                    block_annotation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_keyClass_in_classDefinition482);
            keyClass();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_classDefinition486); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTClass(name, isAbstract); }

            // USE.g:203:5: ( LESS idListRes= idList )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LESS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // USE.g:203:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_classDefinition496); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_classDefinition500);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addSuperClasses(idListRes); }

                    }
                    break;

            }


            // USE.g:204:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==62) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // USE.g:204:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,62,FOLLOW_62_in_classDefinition513); if (state.failed) return n;

                    // USE.g:205:7: (a= attributeDefinition )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==AT||LA8_0==IDENT||LA8_0==57||(LA8_0 >= 60 && LA8_0 <= 61)||LA8_0==78||LA8_0==88||LA8_0==91||(LA8_0 >= 104 && LA8_0 <= 105)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // USE.g:205:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_classDefinition526);
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


            // USE.g:207:5: ( 'operations' (op= operationDefinition )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==101) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // USE.g:207:7: 'operations' (op= operationDefinition )*
                    {
                    match(input,101,FOLLOW_101_in_classDefinition547); if (state.failed) return n;

                    // USE.g:208:7: (op= operationDefinition )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==AT||LA10_0==IDENT||LA10_0==57||(LA10_0 >= 60 && LA10_0 <= 61)||LA10_0==78||LA10_0==88||LA10_0==91||(LA10_0 >= 104 && LA10_0 <= 105)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // USE.g:208:9: op= operationDefinition
                    	    {
                    	    pushFollow(FOLLOW_operationDefinition_in_classDefinition560);
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


            // USE.g:210:5: ( 'constraints' (inv= invariantClause )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==66) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // USE.g:210:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,66,FOLLOW_66_in_classDefinition581); if (state.failed) return n;

                    // USE.g:211:7: (inv= invariantClause )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==AT||LA12_0==IDENT||LA12_0==57||(LA12_0 >= 60 && LA12_0 <= 61)||(LA12_0 >= 78 && LA12_0 <= 79)||LA12_0==88||LA12_0==91||(LA12_0 >= 104 && LA12_0 <= 105)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // USE.g:212:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_classDefinition601);
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


            // USE.g:215:5: ( 'statemachines' (sm= stateMachine )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==110) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // USE.g:215:7: 'statemachines' (sm= stateMachine )*
                    {
                    match(input,110,FOLLOW_110_in_classDefinition627); if (state.failed) return n;

                    // USE.g:216:7: (sm= stateMachine )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==106) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // USE.g:217:9: sm= stateMachine
                    	    {
                    	    pushFollow(FOLLOW_stateMachine_in_classDefinition647);
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


            match(input,76,FOLLOW_76_in_classDefinition671); if (state.failed) return n;

            }

        }
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

            if ( (input.LA(1) >= 60 && input.LA(1) <= 61) ) {
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

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationClassDefinition730); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociationClass(name, isAbstract); }

            // USE.g:250:5: ( LESS idListRes= idList )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LESS) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // USE.g:250:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_associationClassDefinition740); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_associationClassDefinition744);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addSuperClasses(idListRes); }

                    }
                    break;

            }


            // USE.g:251:5: ( 'between' ae= associationEnd (ae= associationEnd )+ )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==64) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // USE.g:251:6: 'between' ae= associationEnd (ae= associationEnd )+
                    {
                    match(input,64,FOLLOW_64_in_associationClassDefinition756); if (state.failed) return n;

                    pushFollow(FOLLOW_associationEnd_in_associationClassDefinition764);
                    ae=associationEnd();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addEnd(ae); }

                    // USE.g:253:5: (ae= associationEnd )+
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
                    	    // USE.g:253:7: ae= associationEnd
                    	    {
                    	    pushFollow(FOLLOW_associationEnd_in_associationClassDefinition776);
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


            // USE.g:255:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==62) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // USE.g:255:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,62,FOLLOW_62_in_associationClassDefinition796); if (state.failed) return n;

                    // USE.g:256:7: (a= attributeDefinition )*
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
                    	    // USE.g:256:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_associationClassDefinition809);
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


            // USE.g:258:5: ( 'operations' (op= operationDefinition )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==101) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // USE.g:258:7: 'operations' (op= operationDefinition )*
                    {
                    match(input,101,FOLLOW_101_in_associationClassDefinition830); if (state.failed) return n;

                    // USE.g:259:7: (op= operationDefinition )*
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
                    	    // USE.g:259:9: op= operationDefinition
                    	    {
                    	    pushFollow(FOLLOW_operationDefinition_in_associationClassDefinition843);
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


            // USE.g:261:5: ( 'constraints' (inv= invariantClause )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==66) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // USE.g:261:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,66,FOLLOW_66_in_associationClassDefinition864); if (state.failed) return n;

                    // USE.g:262:7: (inv= invariantClause )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==AT||LA23_0==79||LA23_0==88) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // USE.g:263:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_associationClassDefinition884);
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


            // USE.g:266:5: ( 'statemachines' (sm= stateMachine )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==110) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // USE.g:266:7: 'statemachines' (sm= stateMachine )*
                    {
                    match(input,110,FOLLOW_110_in_associationClassDefinition910); if (state.failed) return n;

                    // USE.g:267:7: (sm= stateMachine )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==106) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // USE.g:268:9: sm= stateMachine
                    	    {
                    	    pushFollow(FOLLOW_stateMachine_in_associationClassDefinition930);
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


            // USE.g:272:5: ( ( keyAggregation | keyComposition ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==IDENT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // USE.g:272:7: ( keyAggregation | keyComposition )
                    {
                    if ( state.backtracking==0 ) { t = input.LT(1); }

                    // USE.g:273:7: ( keyAggregation | keyComposition )
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
                            // USE.g:273:9: keyAggregation
                            {
                            pushFollow(FOLLOW_keyAggregation_in_associationClassDefinition971);
                            keyAggregation();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;
                        case 2 :
                            // USE.g:273:26: keyComposition
                            {
                            pushFollow(FOLLOW_keyComposition_in_associationClassDefinition975);
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


            match(input,76,FOLLOW_76_in_associationClassDefinition998); if (state.failed) return n;

            }

        }
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
            pushFollow(FOLLOW_annotationSet_in_attributeDefinition1026);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_attributeDefinition1034); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_attributeDefinition1036); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_attributeDefinition1040);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            // USE.g:288:5: ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )?
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==IDENT) ) {
                int LA30_1 = input.LA(2);

                if ( (((input.LT(1).getText().equals("derive"))||(input.LT(1).getText().equals("derived")))) ) {
                    alt30=1;
                }
                else if ( ((input.LT(1).getText().equals("init"))) ) {
                    alt30=2;
                }
            }
            switch (alt30) {
                case 1 :
                    // USE.g:289:9: ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression )
                    {
                    // USE.g:289:9: ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression )
                    // USE.g:289:10: ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression
                    {
                    // USE.g:289:10: ( keyDerive | keyDerived )
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
                            // USE.g:289:11: keyDerive
                            {
                            pushFollow(FOLLOW_keyDerive_in_attributeDefinition1064);
                            keyDerive();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;
                        case 2 :
                            // USE.g:289:21: keyDerived
                            {
                            pushFollow(FOLLOW_keyDerived_in_attributeDefinition1066);
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


                    pushFollow(FOLLOW_expression_in_attributeDefinition1079);
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
                    pushFollow(FOLLOW_keyInit_in_attributeDefinition1099);
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


                    pushFollow(FOLLOW_expression_in_attributeDefinition1115);
                    initExpression=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    }


                    }
                    break;

            }


            // USE.g:293:5: ( SEMI )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==SEMI) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // USE.g:293:5: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_attributeDefinition1129); if (state.failed) return n;

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
            pushFollow(FOLLOW_annotationSet_in_operationDefinition1160);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationDefinition1170); if (state.failed) return n;

            pushFollow(FOLLOW_paramList_in_operationDefinition1180);
            pl=paramList();

            state._fsp--;
            if (state.failed) return n;

            // USE.g:315:5: ( COLON t= type )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==COLON) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // USE.g:315:7: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_operationDefinition1194); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_operationDefinition1200);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n = new ASTOperation(name, pl, t); n.setAnnotations(as); }

            // USE.g:317:5: ( ( EQUAL e= expression ) | (s= blockStat ) )?
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==EQUAL) ) {
                alt33=1;
            }
            else if ( (LA33_0==63) ) {
                alt33=2;
            }
            switch (alt33) {
                case 1 :
                    // USE.g:318:9: ( EQUAL e= expression )
                    {
                    // USE.g:318:9: ( EQUAL e= expression )
                    // USE.g:318:11: EQUAL e= expression
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_operationDefinition1228); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_operationDefinition1234);
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
                    pushFollow(FOLLOW_blockStat_in_operationDefinition1256);
                    s=blockStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setStatement((s!=null?s.n:null));  }

                    }


                    }
                    break;

            }


            // USE.g:321:5: (ppc= prePostClause )*
            loop34:
            do {
                int alt34=2;
                alt34 = dfa34.predict(input);
                switch (alt34) {
            	case 1 :
            	    // USE.g:321:7: ppc= prePostClause
            	    {
            	    pushFollow(FOLLOW_prePostClause_in_operationDefinition1278);
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


            // USE.g:322:5: ( SEMI )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==SEMI) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // USE.g:322:7: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_operationDefinition1291); if (state.failed) return n;

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
    // USE.g:332:1: associationDefinition returns [ASTAssociation n] : as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' ;
    public final ASTAssociation associationDefinition() throws RecognitionException {
        ASTAssociation n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        ASTAssociationEnd ae =null;


         Token t = null; 
        try {
            // USE.g:334:2: (as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' )
            // USE.g:335:2: as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end'
            {
            pushFollow(FOLLOW_annotationSet_in_associationDefinition1322);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { t = input.LT(1); }

            // USE.g:337:5: ( keyAssociation | keyAggregation | keyComposition )
            int alt36=3;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==IDENT) ) {
                int LA36_1 = input.LA(2);

                if ( ((input.LT(1).getText().equals("association"))) ) {
                    alt36=1;
                }
                else if ( ((input.LT(1).getText().equals("aggregation"))) ) {
                    alt36=2;
                }
                else if ( ((input.LT(1).getText().equals("composition"))) ) {
                    alt36=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // USE.g:337:7: keyAssociation
                    {
                    pushFollow(FOLLOW_keyAssociation_in_associationDefinition1336);
                    keyAssociation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 2 :
                    // USE.g:337:24: keyAggregation
                    {
                    pushFollow(FOLLOW_keyAggregation_in_associationDefinition1340);
                    keyAggregation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 3 :
                    // USE.g:337:41: keyComposition
                    {
                    pushFollow(FOLLOW_keyComposition_in_associationDefinition1344);
                    keyComposition();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationDefinition1354); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociation(t, name); n.setAnnotations(as); }

            match(input,64,FOLLOW_64_in_associationDefinition1362); if (state.failed) return n;

            pushFollow(FOLLOW_associationEnd_in_associationDefinition1370);
            ae=associationEnd();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addEnd(ae); }

            // USE.g:341:5: (ae= associationEnd )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==AT||LA37_0==IDENT||LA37_0==57||(LA37_0 >= 60 && LA37_0 <= 61)||LA37_0==78||LA37_0==88||LA37_0==91||(LA37_0 >= 104 && LA37_0 <= 105)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // USE.g:341:7: ae= associationEnd
            	    {
            	    pushFollow(FOLLOW_associationEnd_in_associationDefinition1382);
            	    ae=associationEnd();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addEnd(ae); }

            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);


            match(input,76,FOLLOW_76_in_associationDefinition1393); if (state.failed) return n;

            }

        }
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
    // USE.g:350:1: associationEnd returns [ASTAssociationEnd n] : as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? ;
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
            // USE.g:351:2: (as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? )
            // USE.g:352:2: as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_associationEnd1418);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1426); if (state.failed) return n;

            match(input,LBRACK,FOLLOW_LBRACK_in_associationEnd1428); if (state.failed) return n;

            pushFollow(FOLLOW_multiplicity_in_associationEnd1432);
            m=multiplicity();

            state._fsp--;
            if (state.failed) return n;

            match(input,RBRACK,FOLLOW_RBRACK_in_associationEnd1434); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociationEnd(name, m); n.setAnnotations(as); }

            // USE.g:354:5: ( keyRole rn= IDENT )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==IDENT) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==IDENT) ) {
                    int LA38_3 = input.LA(3);

                    if ( ((input.LT(1).getText().equals("role"))) ) {
                        alt38=1;
                    }
                }
            }
            switch (alt38) {
                case 1 :
                    // USE.g:354:7: keyRole rn= IDENT
                    {
                    pushFollow(FOLLOW_keyRole_in_associationEnd1445);
                    keyRole();

                    state._fsp--;
                    if (state.failed) return n;

                    rn=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1449); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setRolename(rn); }

                    }
                    break;

            }


            // USE.g:355:5: ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )*
            loop41:
            do {
                int alt41=7;
                switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA41_3 = input.LA(2);

                    if ( ((input.LT(1).getText().equals("union"))) ) {
                        alt41=3;
                    }
                    else if ( (((input.LT(1).getText().equals("derive"))||(input.LT(1).getText().equals("derived")))) ) {
                        alt41=5;
                    }
                    else if ( ((input.LT(1).getText().equals("qualifier"))) ) {
                        alt41=6;
                    }


                    }
                    break;
                case 103:
                    {
                    alt41=1;
                    }
                    break;
                case 112:
                    {
                    alt41=2;
                    }
                    break;
                case 107:
                    {
                    alt41=4;
                    }
                    break;

                }

                switch (alt41) {
            	case 1 :
            	    // USE.g:356:9: 'ordered'
            	    {
            	    match(input,103,FOLLOW_103_in_associationEnd1470); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setOrdered(); }

            	    }
            	    break;
            	case 2 :
            	    // USE.g:357:9: 'subsets' sr= IDENT
            	    {
            	    match(input,112,FOLLOW_112_in_associationEnd1482); if (state.failed) return n;

            	    sr=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1486); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addSubsetsRolename(sr); }

            	    }
            	    break;
            	case 3 :
            	    // USE.g:358:9: keyUnion
            	    {
            	    pushFollow(FOLLOW_keyUnion_in_associationEnd1498);
            	    keyUnion();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setUnion(true); }

            	    }
            	    break;
            	case 4 :
            	    // USE.g:359:9: 'redefines' rd= IDENT
            	    {
            	    match(input,107,FOLLOW_107_in_associationEnd1510); if (state.failed) return n;

            	    rd=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1514); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addRedefinesRolename(rd); }

            	    }
            	    break;
            	case 5 :
            	    // USE.g:360:9: ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression
            	    {
            	    // USE.g:360:9: ( keyDerived | keyDerive )
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==IDENT) ) {
            	        int LA39_1 = input.LA(2);

            	        if ( ((input.LT(1).getText().equals("derived"))) ) {
            	            alt39=1;
            	        }
            	        else if ( ((input.LT(1).getText().equals("derive"))) ) {
            	            alt39=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return n;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 39, 1, input);

            	            throw nvae;

            	        }
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // USE.g:360:10: keyDerived
            	            {
            	            pushFollow(FOLLOW_keyDerived_in_associationEnd1527);
            	            keyDerived();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;
            	        case 2 :
            	            // USE.g:360:21: keyDerive
            	            {
            	            pushFollow(FOLLOW_keyDerive_in_associationEnd1529);
            	            keyDerive();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    // USE.g:360:32: ( LPAREN parameter= elemVarsDeclaration RPAREN )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==LPAREN) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // USE.g:360:34: LPAREN parameter= elemVarsDeclaration RPAREN
            	            {
            	            match(input,LPAREN,FOLLOW_LPAREN_in_associationEnd1534); if (state.failed) return n;

            	            pushFollow(FOLLOW_elemVarsDeclaration_in_associationEnd1540);
            	            parameter=elemVarsDeclaration();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            match(input,RPAREN,FOLLOW_RPAREN_in_associationEnd1542); if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_associationEnd1546); if (state.failed) return n;

            	    pushFollow(FOLLOW_expression_in_associationEnd1550);
            	    exp=expression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setDerived((exp!=null?exp.n:null), parameter); }

            	    }
            	    break;
            	case 6 :
            	    // USE.g:361:9: keyQualifier qualifiers= paramList
            	    {
            	    pushFollow(FOLLOW_keyQualifier_in_associationEnd1562);
            	    keyQualifier();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    pushFollow(FOLLOW_paramList_in_associationEnd1568);
            	    qualifiers=paramList();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) {n.setQualifiers(qualifiers); }

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            // USE.g:363:5: ( SEMI )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==SEMI) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // USE.g:363:7: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_associationEnd1585); if (state.failed) return n;

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
    // USE.g:377:1: multiplicity returns [ASTMultiplicity n] :mr= multiplicityRange ( COMMA mr= multiplicityRange )* ;
    public final ASTMultiplicity multiplicity() throws RecognitionException {
        ASTMultiplicity n = null;


        ASTMultiplicityRange mr =null;


        try {
            // USE.g:378:5: (mr= multiplicityRange ( COMMA mr= multiplicityRange )* )
            // USE.g:379:5: mr= multiplicityRange ( COMMA mr= multiplicityRange )*
            {
            if ( state.backtracking==0 ) { 
            	Token t = input.LT(1); // remember start position of expression
            	n = new ASTMultiplicity(t);
                }

            pushFollow(FOLLOW_multiplicityRange_in_multiplicity1620);
            mr=multiplicityRange();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addRange(mr); }

            // USE.g:384:5: ( COMMA mr= multiplicityRange )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMMA) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // USE.g:384:7: COMMA mr= multiplicityRange
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multiplicity1630); if (state.failed) return n;

            	    pushFollow(FOLLOW_multiplicityRange_in_multiplicity1634);
            	    mr=multiplicityRange();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addRange(mr); }

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
    // $ANTLR end "multiplicity"



    // $ANTLR start "multiplicityRange"
    // USE.g:387:1: multiplicityRange returns [ASTMultiplicityRange n] : ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? ;
    public final ASTMultiplicityRange multiplicityRange() throws RecognitionException {
        ASTMultiplicityRange n = null;


        int ms1 =0;

        int ms2 =0;


        try {
            // USE.g:388:5: (ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? )
            // USE.g:389:5: ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )?
            {
            pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange1663);
            ms1=multiplicitySpec();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTMultiplicityRange(ms1); }

            // USE.g:390:5: ( DOTDOT ms2= multiplicitySpec )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==DOTDOT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // USE.g:390:7: DOTDOT ms2= multiplicitySpec
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_multiplicityRange1673); if (state.failed) return n;

                    pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange1677);
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
    // USE.g:393:1: multiplicitySpec returns [int m] : (i= INT | STAR );
    public final int multiplicitySpec() throws RecognitionException {
        int m = 0;


        Token i=null;

         m = -1; 
        try {
            // USE.g:395:7: (i= INT | STAR )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==INT) ) {
                alt45=1;
            }
            else if ( (LA45_0==STAR) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return m;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }
            switch (alt45) {
                case 1 :
                    // USE.g:396:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_multiplicitySpec1711); if (state.failed) return m;

                    if ( state.backtracking==0 ) { m = Integer.parseInt((i!=null?i.getText():null)); }

                    }
                    break;
                case 2 :
                    // USE.g:397:7: STAR
                    {
                    match(input,STAR,FOLLOW_STAR_in_multiplicitySpec1721); if (state.failed) return m;

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
    // USE.g:400:1: annotationSpec returns [AnnotationTag tag] : (rtag= block_annotation |rtag= line_annotation[tag] );
    public final AnnotationTag annotationSpec() throws RecognitionException {
        AnnotationTag tag = null;


        AnnotationTag rtag =null;


        tag = new AnnotationTag();
        try {
            // USE.g:402:2: (rtag= block_annotation |rtag= line_annotation[tag] )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==AT) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==IDENT) ) {
                    alt46=1;
                }
                else if ( (LA46_1==46||LA46_1==53||LA46_1==56) ) {
                    alt46=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return tag;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return tag;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }
            switch (alt46) {
                case 1 :
                    // USE.g:403:2: rtag= block_annotation
                    {
                    pushFollow(FOLLOW_block_annotation_in_annotationSpec1748);
                    rtag=block_annotation();

                    state._fsp--;
                    if (state.failed) return tag;

                    if ( state.backtracking==0 ) {tag =rtag;}

                    }
                    break;
                case 2 :
                    // USE.g:404:4: rtag= line_annotation[tag]
                    {
                    pushFollow(FOLLOW_line_annotation_in_annotationSpec1757);
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
    // USE.g:407:1: block_annotation returns [AnnotationTag tag] : AT IDENT LBRACE ( annotation_tag[tag] )* RBRACE ;
    public final AnnotationTag block_annotation() throws RecognitionException {
        AnnotationTag tag = null;


        Token IDENT1=null;

        tag = new AnnotationTag();
        try {
            // USE.g:409:2: ( AT IDENT LBRACE ( annotation_tag[tag] )* RBRACE )
            // USE.g:410:2: AT IDENT LBRACE ( annotation_tag[tag] )* RBRACE
            {
            match(input,AT,FOLLOW_AT_in_block_annotation1779); if (state.failed) return tag;

            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_block_annotation1781); if (state.failed) return tag;

            match(input,LBRACE,FOLLOW_LBRACE_in_block_annotation1783); if (state.failed) return tag;

            // USE.g:411:3: ( annotation_tag[tag] )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==46||LA47_0==53||LA47_0==56) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // USE.g:411:4: annotation_tag[tag]
            	    {
            	    pushFollow(FOLLOW_annotation_tag_in_block_annotation1788);
            	    annotation_tag(tag);

            	    state._fsp--;
            	    if (state.failed) return tag;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            if ( state.backtracking==0 ) {tag.setName(IDENT1.getText());}

            match(input,RBRACE,FOLLOW_RBRACE_in_block_annotation1796); if (state.failed) return tag;

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
    // USE.g:415:1: line_annotation[AnnotationTag tag] returns [AnnotationTag rtag] : AT ( annotation_tag[tag] ) ;
    public final AnnotationTag line_annotation(AnnotationTag tag) throws RecognitionException {
        AnnotationTag rtag = null;


        if (tag==null) tag = new AnnotationTag();
        try {
            // USE.g:416:50: ( AT ( annotation_tag[tag] ) )
            // USE.g:417:2: AT ( annotation_tag[tag] )
            {
            match(input,AT,FOLLOW_AT_in_line_annotation1815); if (state.failed) return rtag;

            // USE.g:417:5: ( annotation_tag[tag] )
            // USE.g:417:6: annotation_tag[tag]
            {
            pushFollow(FOLLOW_annotation_tag_in_line_annotation1818);
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
    // USE.g:420:1: annotation_tag[AnnotationTag tag] : ( annotation_comment EQUAL ( NON_OCL_STRING ) | annotation_weight EQUAL ( annotation_def | INT ) | annotation_type EQUAL ( annotation_enum_type | annotation_ref ) );
    public final void annotation_tag(AnnotationTag tag) throws RecognitionException {
        Token NON_OCL_STRING2=null;
        Token INT3=null;

        try {
            // USE.g:421:2: ( annotation_comment EQUAL ( NON_OCL_STRING ) | annotation_weight EQUAL ( annotation_def | INT ) | annotation_type EQUAL ( annotation_enum_type | annotation_ref ) )
            int alt50=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt50=1;
                }
                break;
            case 56:
                {
                alt50=2;
                }
                break;
            case 53:
                {
                alt50=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;

            }

            switch (alt50) {
                case 1 :
                    // USE.g:422:2: annotation_comment EQUAL ( NON_OCL_STRING )
                    {
                    pushFollow(FOLLOW_annotation_comment_in_annotation_tag1834);
                    annotation_comment();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,EQUAL,FOLLOW_EQUAL_in_annotation_tag1836); if (state.failed) return ;

                    // USE.g:422:27: ( NON_OCL_STRING )
                    // USE.g:422:28: NON_OCL_STRING
                    {
                    NON_OCL_STRING2=(Token)match(input,NON_OCL_STRING,FOLLOW_NON_OCL_STRING_in_annotation_tag1839); if (state.failed) return ;

                    if ( state.backtracking==0 ) {tag.setComments(NON_OCL_STRING2.getText());}

                    }


                    }
                    break;
                case 2 :
                    // USE.g:423:4: annotation_weight EQUAL ( annotation_def | INT )
                    {
                    pushFollow(FOLLOW_annotation_weight_in_annotation_tag1847);
                    annotation_weight();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,EQUAL,FOLLOW_EQUAL_in_annotation_tag1849); if (state.failed) return ;

                    // USE.g:423:28: ( annotation_def | INT )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==70) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==INT) ) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;

                    }
                    switch (alt48) {
                        case 1 :
                            // USE.g:423:29: annotation_def
                            {
                            pushFollow(FOLLOW_annotation_def_in_annotation_tag1852);
                            annotation_def();

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {tag.setWeight(new IntWeight(-1));}

                            }
                            break;
                        case 2 :
                            // USE.g:423:83: INT
                            {
                            INT3=(Token)match(input,INT,FOLLOW_INT_in_annotation_tag1858); if (state.failed) return ;

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
                    // USE.g:427:4: annotation_type EQUAL ( annotation_enum_type | annotation_ref )
                    {
                    pushFollow(FOLLOW_annotation_type_in_annotation_tag1866);
                    annotation_type();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,EQUAL,FOLLOW_EQUAL_in_annotation_tag1868); if (state.failed) return ;

                    // USE.g:427:26: ( annotation_enum_type | annotation_ref )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==51||LA49_0==55) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==AT) ) {
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
                            // USE.g:427:27: annotation_enum_type
                            {
                            pushFollow(FOLLOW_annotation_enum_type_in_annotation_tag1871);
                            annotation_enum_type();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // USE.g:427:50: annotation_ref
                            {
                            pushFollow(FOLLOW_annotation_ref_in_annotation_tag1875);
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
    // USE.g:430:1: annotation_predefined : ( 'Comment' | 'Weight' | 'Type' );
    public final void annotation_predefined() throws RecognitionException {
        try {
            // USE.g:430:22: ( 'Comment' | 'Weight' | 'Type' )
            // USE.g:
            {
            if ( input.LA(1)==46||input.LA(1)==53||input.LA(1)==56 ) {
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
    // USE.g:436:1: annotation_comment : 'Comment' ;
    public final void annotation_comment() throws RecognitionException {
        try {
            // USE.g:436:19: ( 'Comment' )
            // USE.g:436:21: 'Comment'
            {
            match(input,46,FOLLOW_46_in_annotation_comment1903); if (state.failed) return ;

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
    // USE.g:437:1: annotation_weight : 'Weight' ;
    public final void annotation_weight() throws RecognitionException {
        try {
            // USE.g:437:18: ( 'Weight' )
            // USE.g:437:20: 'Weight'
            {
            match(input,56,FOLLOW_56_in_annotation_weight1910); if (state.failed) return ;

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
    // USE.g:438:1: annotation_type : 'Type' ;
    public final void annotation_type() throws RecognitionException {
        try {
            // USE.g:438:16: ( 'Type' )
            // USE.g:438:18: 'Type'
            {
            match(input,53,FOLLOW_53_in_annotation_type1917); if (state.failed) return ;

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
    // USE.g:440:1: annotation_override : 'Override' LPAREN LBRACE annotation_term RBRACE RPAREN ;
    public final void annotation_override() throws RecognitionException {
        try {
            // USE.g:440:20: ( 'Override' LPAREN LBRACE annotation_term RBRACE RPAREN )
            // USE.g:441:1: 'Override' LPAREN LBRACE annotation_term RBRACE RPAREN
            {
            match(input,48,FOLLOW_48_in_annotation_override1926); if (state.failed) return ;

            match(input,LPAREN,FOLLOW_LPAREN_in_annotation_override1928); if (state.failed) return ;

            match(input,LBRACE,FOLLOW_LBRACE_in_annotation_override1930); if (state.failed) return ;

            pushFollow(FOLLOW_annotation_term_in_annotation_override1932);
            annotation_term();

            state._fsp--;
            if (state.failed) return ;

            match(input,RBRACE,FOLLOW_RBRACE_in_annotation_override1934); if (state.failed) return ;

            match(input,RPAREN,FOLLOW_RPAREN_in_annotation_override1936); if (state.failed) return ;

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
    // USE.g:444:1: annotation_term returns [AnnotationTag tag] : annotation_tag[tag] ( COMMA annotation_tag[tag] )* ;
    public final AnnotationTag annotation_term() throws RecognitionException {
        AnnotationTag tag = null;


        tag = new AnnotationTag();
        try {
            // USE.g:445:35: ( annotation_tag[tag] ( COMMA annotation_tag[tag] )* )
            // USE.g:446:2: annotation_tag[tag] ( COMMA annotation_tag[tag] )*
            {
            pushFollow(FOLLOW_annotation_tag_in_annotation_term1953);
            annotation_tag(tag);

            state._fsp--;
            if (state.failed) return tag;

            // USE.g:446:22: ( COMMA annotation_tag[tag] )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==COMMA) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // USE.g:446:23: COMMA annotation_tag[tag]
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_annotation_term1957); if (state.failed) return tag;

            	    pushFollow(FOLLOW_annotation_tag_in_annotation_term1959);
            	    annotation_tag(tag);

            	    state._fsp--;
            	    if (state.failed) return tag;

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // USE.g:449:1: annotation_ref : AT IDENT DOT annotation_predefined ;
    public final void annotation_ref() throws RecognitionException {
        try {
            // USE.g:449:15: ( AT IDENT DOT annotation_predefined )
            // USE.g:450:2: AT IDENT DOT annotation_predefined
            {
            match(input,AT,FOLLOW_AT_in_annotation_ref1971); if (state.failed) return ;

            match(input,IDENT,FOLLOW_IDENT_in_annotation_ref1973); if (state.failed) return ;

            match(input,DOT,FOLLOW_DOT_in_annotation_ref1975); if (state.failed) return ;

            pushFollow(FOLLOW_annotation_predefined_in_annotation_ref1977);
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
    // USE.g:453:1: annotation_def : 'default' ;
    public final void annotation_def() throws RecognitionException {
        try {
            // USE.g:453:15: ( 'default' )
            // USE.g:454:2: 'default'
            {
            match(input,70,FOLLOW_70_in_annotation_def1986); if (state.failed) return ;

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
    // USE.g:456:1: annotation_enum_type : ( 'Strong' | 'Weak' );
    public final void annotation_enum_type() throws RecognitionException {
        try {
            // USE.g:456:22: ( 'Strong' | 'Weak' )
            // USE.g:
            {
            if ( input.LA(1)==51||input.LA(1)==55 ) {
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
    // USE.g:478:1: invariant returns [ASTConstraintDefinition n] : (tag= block_annotation )? 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* ;
    public final ASTConstraintDefinition invariant() throws RecognitionException {
        ASTConstraintDefinition n = null;


        Token v=null;
        AnnotationTag tag =null;

        ASTSimpleType t =null;

        ASTInvariantClause inv =null;


        try {
            // USE.g:479:5: ( (tag= block_annotation )? 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* )
            // USE.g:480:5: (tag= block_annotation )? 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )*
            {
            if ( state.backtracking==0 ) { n = new ASTConstraintDefinition();}

            // USE.g:481:2: (tag= block_annotation )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==AT) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // USE.g:481:3: tag= block_annotation
                    {
                    pushFollow(FOLLOW_block_annotation_in_invariant2033);
                    tag=block_annotation();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n.addBlockAnnotationTag(tag);}

                    }
                    break;

            }


            match(input,67,FOLLOW_67_in_invariant2044); if (state.failed) return n;

            // USE.g:483:5: (v= IDENT ( ',' v= IDENT )* COLON )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==IDENT) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==COLON||LA54_1==COMMA) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // USE.g:483:7: v= IDENT ( ',' v= IDENT )* COLON
                    {
                    v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant2054); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addVarName(v); }

                    // USE.g:484:8: ( ',' v= IDENT )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==COMMA) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // USE.g:484:9: ',' v= IDENT
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_invariant2066); if (state.failed) return n;

                    	    v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant2070); if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addVarName(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    match(input,COLON,FOLLOW_COLON_in_invariant2078); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_simpleType_in_invariant2090);
            t=simpleType();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setType(t); }

            // USE.g:486:5: (inv= invariantClause )*
            loop55:
            do {
                int alt55=2;
                alt55 = dfa55.predict(input);
                switch (alt55) {
            	case 1 :
            	    // USE.g:486:7: inv= invariantClause
            	    {
            	    pushFollow(FOLLOW_invariantClause_in_invariant2102);
            	    inv=invariantClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

            	    }
            	    break;

            	default :
            	    break loop55;
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
    // USE.g:493:1: invariantClause returns [ASTInvariantClause n] : ( (tag= line_annotation[tag] )* as= annotationSet 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression );
    public final ASTInvariantClause invariantClause() throws RecognitionException {
        ASTInvariantClause n = null;


        Token name=null;
        AnnotationTag tag =null;

        Set<ASTAnnotation> as =null;

        USEParser.expression_return e =null;


        tag = null;
        try {
            // USE.g:494:19: ( (tag= line_annotation[tag] )* as= annotationSet 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==AT||LA59_0==IDENT||LA59_0==57||(LA59_0 >= 60 && LA59_0 <= 61)||LA59_0==78||LA59_0==88||LA59_0==91||(LA59_0 >= 104 && LA59_0 <= 105)) ) {
                alt59=1;
            }
            else if ( (LA59_0==79) ) {
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
                    // USE.g:495:2: (tag= line_annotation[tag] )* as= annotationSet 'inv' (name= IDENT )? COLON e= expression
                    {
                    // USE.g:495:2: (tag= line_annotation[tag] )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==AT) ) {
                            int LA56_1 = input.LA(2);

                            if ( (LA56_1==46||LA56_1==53||LA56_1==56) ) {
                                alt56=1;
                            }


                        }


                        switch (alt56) {
                    	case 1 :
                    	    // USE.g:495:3: tag= line_annotation[tag]
                    	    {
                    	    pushFollow(FOLLOW_line_annotation_in_invariantClause2134);
                    	    tag=line_annotation(tag);

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    pushFollow(FOLLOW_annotationSet_in_invariantClause2144);
                    as=annotationSet();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,88,FOLLOW_88_in_invariantClause2151); if (state.failed) return n;

                    // USE.g:497:12: (name= IDENT )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==IDENT) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // USE.g:497:14: name= IDENT
                            {
                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause2157); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,COLON,FOLLOW_COLON_in_invariantClause2162); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_invariantClause2166);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTInvariantClause(name, (e!=null?e.n:null)); n.setAnnotations(as);n.setAnnotationTag(tag);}

                    }
                    break;
                case 2 :
                    // USE.g:499:7: 'existential' 'inv' (name= IDENT )? COLON e= expression
                    {
                    match(input,79,FOLLOW_79_in_invariantClause2183); if (state.failed) return n;

                    match(input,88,FOLLOW_88_in_invariantClause2185); if (state.failed) return n;

                    // USE.g:499:27: (name= IDENT )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==IDENT) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // USE.g:499:29: name= IDENT
                            {
                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause2191); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,COLON,FOLLOW_COLON_in_invariantClause2196); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_invariantClause2200);
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
    // USE.g:511:1: prePost returns [ASTPrePost n] : 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ ;
    public final ASTPrePost prePost() throws RecognitionException {
        ASTPrePost n = null;


        Token classname=null;
        Token opname=null;
        List<ASTVariableDeclaration> pl =null;

        ASTType rt =null;

        ASTPrePostClause ppc =null;


        try {
            // USE.g:512:5: ( 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ )
            // USE.g:513:5: 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+
            {
            match(input,67,FOLLOW_67_in_prePost2233); if (state.failed) return n;

            classname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost2237); if (state.failed) return n;

            match(input,COLON_COLON,FOLLOW_COLON_COLON_in_prePost2239); if (state.failed) return n;

            opname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost2243); if (state.failed) return n;

            pushFollow(FOLLOW_paramList_in_prePost2247);
            pl=paramList();

            state._fsp--;
            if (state.failed) return n;

            // USE.g:513:69: ( COLON rt= type )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==COLON) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // USE.g:513:71: COLON rt= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_prePost2251); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_prePost2255);
                    rt=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n = new ASTPrePost(classname, opname, pl, rt); }

            // USE.g:515:5: (ppc= prePostClause )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                alt61 = dfa61.predict(input);
                switch (alt61) {
            	case 1 :
            	    // USE.g:515:7: ppc= prePostClause
            	    {
            	    pushFollow(FOLLOW_prePostClause_in_prePost2274);
            	    ppc=prePostClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addPrePostClause(ppc); }

            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
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
    // USE.g:522:1: prePostClause returns [ASTPrePostClause n] : as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression ;
    public final ASTPrePostClause prePostClause() throws RecognitionException {
        ASTPrePostClause n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        USEParser.expression_return e =null;


         Token t = null; 
        try {
            // USE.g:524:2: (as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression )
            // USE.g:525:2: as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression
            {
            pushFollow(FOLLOW_annotationSet_in_prePostClause2308);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { t = input.LT(1); }

            if ( (input.LA(1) >= 104 && input.LA(1) <= 105) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // USE.g:527:25: (name= IDENT )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==IDENT) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // USE.g:527:27: name= IDENT
                    {
                    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePostClause2335); if (state.failed) return n;

                    }
                    break;

            }


            match(input,COLON,FOLLOW_COLON_in_prePostClause2340); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_prePostClause2344);
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
    // USE.g:531:1: annotationSet returns [Set<ASTAnnotation> annotations] : (an= annotation )* ;
    public final Set<ASTAnnotation> annotationSet() throws RecognitionException {
        Set<ASTAnnotation> annotations = null;


        ASTAnnotation an =null;


         annotations = new HashSet<ASTAnnotation>(); 
        try {
            // USE.g:533:2: ( (an= annotation )* )
            // USE.g:534:2: (an= annotation )*
            {
            // USE.g:534:2: (an= annotation )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==AT) ) {
                    int LA63_2 = input.LA(2);

                    if ( (LA63_2==IDENT) ) {
                        int LA63_3 = input.LA(3);

                        if ( (LA63_3==LPAREN) ) {
                            alt63=1;
                        }


                    }


                }


                switch (alt63) {
            	case 1 :
            	    // USE.g:534:3: an= annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotationSet2371);
            	    an=annotation();

            	    state._fsp--;
            	    if (state.failed) return annotations;

            	    if ( state.backtracking==0 ) { annotations.add(an); }

            	    }
            	    break;

            	default :
            	    break loop63;
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
    // USE.g:537:1: annotation returns [ASTAnnotation n] : AT name= IDENT LPAREN values= annotationValues RPAREN ;
    public final ASTAnnotation annotation() throws RecognitionException {
        ASTAnnotation n = null;


        Token name=null;
        Map<Token, Token> values =null;


        try {
            // USE.g:537:37: ( AT name= IDENT LPAREN values= annotationValues RPAREN )
            // USE.g:538:2: AT name= IDENT LPAREN values= annotationValues RPAREN
            {
            match(input,AT,FOLLOW_AT_in_annotation2390); if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotation2394); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = new ASTAnnotation(name);}

            match(input,LPAREN,FOLLOW_LPAREN_in_annotation2400); if (state.failed) return n;

            pushFollow(FOLLOW_annotationValues_in_annotation2409);
            values=annotationValues();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setValues(values); }

            match(input,RPAREN,FOLLOW_RPAREN_in_annotation2414); if (state.failed) return n;

            }

        }
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
    // USE.g:544:1: annotationValues returns [Map<Token, Token> values] : (firstVal= annotationValue )? ( COMMA val= annotationValue )* ;
    public final Map<Token, Token> annotationValues() throws RecognitionException {
        Map<Token, Token> values = null;


        USEParser.annotationValue_return firstVal =null;

        USEParser.annotationValue_return val =null;


         values = new HashMap<Token, Token>(); 
        try {
            // USE.g:546:2: ( (firstVal= annotationValue )? ( COMMA val= annotationValue )* )
            // USE.g:547:2: (firstVal= annotationValue )? ( COMMA val= annotationValue )*
            {
            // USE.g:547:2: (firstVal= annotationValue )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==IDENT) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // USE.g:547:3: firstVal= annotationValue
                    {
                    pushFollow(FOLLOW_annotationValue_in_annotationValues2437);
                    firstVal=annotationValue();

                    state._fsp--;
                    if (state.failed) return values;

                    if ( state.backtracking==0 ) { values.put((firstVal!=null?firstVal.name:null), (firstVal!=null?firstVal.value:null)); }

                    }
                    break;

            }


            // USE.g:548:2: ( COMMA val= annotationValue )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==COMMA) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // USE.g:548:3: COMMA val= annotationValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_annotationValues2445); if (state.failed) return values;

            	    pushFollow(FOLLOW_annotationValue_in_annotationValues2449);
            	    val=annotationValue();

            	    state._fsp--;
            	    if (state.failed) return values;

            	    if ( state.backtracking==0 ) { values.put((val!=null?val.name:null), (val!=null?val.value:null)); }

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
        return values;
    }
    // $ANTLR end "annotationValues"


    public static class annotationValue_return extends ParserRuleReturnScope {
        public Token name;
        public Token value;
    };


    // $ANTLR start "annotationValue"
    // USE.g:551:1: annotationValue returns [Token name, Token value] : aName= IDENT EQUAL aValue= NON_OCL_STRING ;
    public final USEParser.annotationValue_return annotationValue() throws RecognitionException {
        USEParser.annotationValue_return retval = new USEParser.annotationValue_return();
        retval.start = input.LT(1);


        Token aName=null;
        Token aValue=null;

        try {
            // USE.g:551:50: (aName= IDENT EQUAL aValue= NON_OCL_STRING )
            // USE.g:552:2: aName= IDENT EQUAL aValue= NON_OCL_STRING
            {
            aName=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotationValue2468); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.name = aName; }

            match(input,EQUAL,FOLLOW_EQUAL_in_annotationValue2473); if (state.failed) return retval;

            aValue=(Token)match(input,NON_OCL_STRING,FOLLOW_NON_OCL_STRING_in_annotationValue2479); if (state.failed) return retval;

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
    // USE.g:557:1: stateMachine returns [ASTStateMachine n] : ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end' ;
    public final ASTStateMachine stateMachine() throws RecognitionException {
        ASTStateMachine n = null;


        Token smName=null;
        ASTStateDefinition s =null;

        ASTTransitionDefinition t =null;


        try {
            // USE.g:558:5: ( ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end' )
            // USE.g:559:5: ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end'
            {
            // USE.g:559:5: ( 'psm' )
            // USE.g:560:8: 'psm'
            {
            match(input,106,FOLLOW_106_in_stateMachine2509); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTProtocolStateMachine(); }

            }


            smName=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateMachine2542); if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setName(smName); }

            match(input,111,FOLLOW_111_in_stateMachine2555); if (state.failed) return n;

            // USE.g:567:10: (s= stateDefinition )+
            int cnt66=0;
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==IDENT) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // USE.g:567:11: s= stateDefinition
            	    {
            	    pushFollow(FOLLOW_stateDefinition_in_stateMachine2571);
            	    s=stateDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addStateDefinition(s); }

            	    }
            	    break;

            	default :
            	    if ( cnt66 >= 1 ) break loop66;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(66, input);
                        throw eee;
                }
                cnt66++;
            } while (true);


            match(input,114,FOLLOW_114_in_stateMachine2581); if (state.failed) return n;

            // USE.g:569:10: (t= transitionDefinition )+
            int cnt67=0;
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==IDENT) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // USE.g:569:11: t= transitionDefinition
            	    {
            	    pushFollow(FOLLOW_transitionDefinition_in_stateMachine2597);
            	    t=transitionDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addTransitionDefinition(t); }

            	    }
            	    break;

            	default :
            	    if ( cnt67 >= 1 ) break loop67;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(67, input);
                        throw eee;
                }
                cnt67++;
            } while (true);


            match(input,76,FOLLOW_76_in_stateMachine2607); if (state.failed) return n;

            }

        }
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
    // USE.g:573:1: stateDefinition returns [ASTStateDefinition n] : sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )? ;
    public final ASTStateDefinition stateDefinition() throws RecognitionException {
        ASTStateDefinition n = null;


        Token sn=null;
        Token stateType=null;
        USEParser.expression_return stateInv =null;


        try {
            // USE.g:573:47: (sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )? )
            // USE.g:574:3: sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )?
            {
            sn=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateDefinition2623); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = new ASTStateDefinition(sn); }

            // USE.g:575:3: ( COLON stateType= IDENT )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==COLON) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // USE.g:575:5: COLON stateType= IDENT
                    {
                    match(input,COLON,FOLLOW_COLON_in_stateDefinition2631); if (state.failed) return n;

                    stateType=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateDefinition2635); if (state.failed) return n;

                    if ( state.backtracking==0 ) {n.setType(stateType); }

                    }
                    break;

            }


            // USE.g:576:3: ( LBRACK stateInv= expression RBRACK )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==LBRACK) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // USE.g:576:5: LBRACK stateInv= expression RBRACK
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_stateDefinition2646); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_stateDefinition2652);
                    stateInv=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RBRACK,FOLLOW_RBRACK_in_stateDefinition2654); if (state.failed) return n;

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
    // USE.g:579:1: transitionDefinition returns [ASTTransitionDefinition n] : source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )? ;
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
            // USE.g:579:57: (source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )? )
            // USE.g:580:3: source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )?
            {
            source=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition2675); if (state.failed) return n;

            match(input,ARROW,FOLLOW_ARROW_in_transitionDefinition2677); if (state.failed) return n;

            target=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition2681); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTransitionDefinition(source, target); }

            // USE.g:581:5: ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==LBRACE) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // USE.g:581:6: LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_transitionDefinition2691); if (state.failed) return n;

                    // USE.g:582:7: ( LBRACK pre= expression RBRACK )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==LBRACK) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // USE.g:582:8: LBRACK pre= expression RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_transitionDefinition2701); if (state.failed) return n;

                            pushFollow(FOLLOW_expression_in_transitionDefinition2705);
                            pre=expression();

                            state._fsp--;
                            if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setPreCondition((pre!=null?pre.n:null)); }

                            match(input,RBRACK,FOLLOW_RBRACK_in_transitionDefinition2709); if (state.failed) return n;

                            }
                            break;

                    }


                    // USE.g:583:7: (e= event |o= IDENT LPAREN (args= paramList )? RPAREN )
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==68) ) {
                        alt72=1;
                    }
                    else if ( (LA72_0==IDENT) ) {
                        alt72=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 0, input);

                        throw nvae;

                    }
                    switch (alt72) {
                        case 1 :
                            // USE.g:584:11: e= event
                            {
                            pushFollow(FOLLOW_event_in_transitionDefinition2733);
                            e=event();

                            state._fsp--;
                            if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setEvent(e); }

                            }
                            break;
                        case 2 :
                            // USE.g:585:11: o= IDENT LPAREN (args= paramList )? RPAREN
                            {
                            o=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition2749); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setOperation(o); }

                            match(input,LPAREN,FOLLOW_LPAREN_in_transitionDefinition2753); if (state.failed) return n;

                            // USE.g:585:50: (args= paramList )?
                            int alt71=2;
                            int LA71_0 = input.LA(1);

                            if ( (LA71_0==LPAREN) ) {
                                alt71=1;
                            }
                            switch (alt71) {
                                case 1 :
                                    // USE.g:585:51: args= paramList
                                    {
                                    pushFollow(FOLLOW_paramList_in_transitionDefinition2758);
                                    args=paramList();

                                    state._fsp--;
                                    if (state.failed) return n;

                                    if ( state.backtracking==0 ) { n.setOperationArgs(args); }

                                    }
                                    break;

                            }


                            match(input,RPAREN,FOLLOW_RPAREN_in_transitionDefinition2765); if (state.failed) return n;

                            }
                            break;

                    }


                    // USE.g:587:7: ( LBRACK post= expression RBRACK )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==LBRACK) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // USE.g:587:8: LBRACK post= expression RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_transitionDefinition2782); if (state.failed) return n;

                            pushFollow(FOLLOW_expression_in_transitionDefinition2786);
                            post=expression();

                            state._fsp--;
                            if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setPostCondition((post!=null?post.n:null)); }

                            match(input,RBRACK,FOLLOW_RBRACK_in_transitionDefinition2790); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,RBRACE,FOLLOW_RBRACE_in_transitionDefinition2798); if (state.failed) return n;

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
    // USE.g:591:1: event returns [Token t] : tcr= 'create' ;
    public final Token event() throws RecognitionException {
        Token t = null;


        Token tcr=null;

        try {
            // USE.g:591:24: (tcr= 'create' )
            // USE.g:592:5: tcr= 'create'
            {
            tcr=(Token)match(input,68,FOLLOW_68_in_event2820); if (state.failed) return t;

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
    // USE.g:595:1: signalDefinition[boolean isAbstract] returns [ASTSignal n] : keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' ;
    public final ASTSignal signalDefinition(boolean isAbstract) throws RecognitionException {
        ASTSignal n = null;


        Token name=null;
        List idListRes =null;

        ASTAttribute a =null;

        ASTInvariantClause inv =null;


        try {
            // USE.g:595:59: ( keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' )
            // USE.g:596:5: keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end'
            {
            pushFollow(FOLLOW_keySignal_in_signalDefinition2840);
            keySignal();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_signalDefinition2844); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTSignal(name, isAbstract); }

            // USE.g:598:5: ( LESS idListRes= idList )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==LESS) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // USE.g:598:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_signalDefinition2859); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_signalDefinition2863);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addGenerals(idListRes); }

                    }
                    break;

            }


            // USE.g:599:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==62) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // USE.g:599:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,62,FOLLOW_62_in_signalDefinition2876); if (state.failed) return n;

                    // USE.g:600:7: (a= attributeDefinition )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==AT||LA76_0==IDENT||LA76_0==57||(LA76_0 >= 60 && LA76_0 <= 61)||LA76_0==78||LA76_0==88||LA76_0==91||(LA76_0 >= 104 && LA76_0 <= 105)) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // USE.g:600:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_signalDefinition2889);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addAttribute(a); }

                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:602:5: ( 'constraints' (inv= invariantClause )* )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==66) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // USE.g:602:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,66,FOLLOW_66_in_signalDefinition2910); if (state.failed) return n;

                    // USE.g:603:7: (inv= invariantClause )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==AT||LA78_0==IDENT||LA78_0==57||(LA78_0 >= 60 && LA78_0 <= 61)||(LA78_0 >= 78 && LA78_0 <= 79)||LA78_0==88||LA78_0==91||(LA78_0 >= 104 && LA78_0 <= 105)) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // USE.g:604:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_signalDefinition2930);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,76,FOLLOW_76_in_signalDefinition2954); if (state.failed) return n;

            }

        }
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
    // USE.g:610:1: keyUnion :{...}? IDENT ;
    public final void keyUnion() throws RecognitionException {
        try {
            // USE.g:610:9: ({...}? IDENT )
            // USE.g:611:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("union"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyUnion", "input.LT(1).getText().equals(\"union\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyUnion2972); if (state.failed) return ;

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
    // USE.g:613:1: keyAssociation :{...}? IDENT ;
    public final void keyAssociation() throws RecognitionException {
        try {
            // USE.g:613:15: ({...}? IDENT )
            // USE.g:614:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("association"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyAssociation", "input.LT(1).getText().equals(\"association\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyAssociation2986); if (state.failed) return ;

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
    // USE.g:616:1: keyRole :{...}? IDENT ;
    public final void keyRole() throws RecognitionException {
        try {
            // USE.g:616:8: ({...}? IDENT )
            // USE.g:617:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("role"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyRole", "input.LT(1).getText().equals(\"role\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyRole3000); if (state.failed) return ;

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
    // USE.g:619:1: keyComposition :{...}? IDENT ;
    public final void keyComposition() throws RecognitionException {
        try {
            // USE.g:619:15: ({...}? IDENT )
            // USE.g:620:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("composition"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyComposition", "input.LT(1).getText().equals(\"composition\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyComposition3012); if (state.failed) return ;

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
    // USE.g:622:1: keyAggregation :{...}? IDENT ;
    public final void keyAggregation() throws RecognitionException {
        try {
            // USE.g:622:15: ({...}? IDENT )
            // USE.g:623:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("aggregation"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyAggregation", "input.LT(1).getText().equals(\"aggregation\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyAggregation3024); if (state.failed) return ;

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
    // USE.g:625:1: keyClass :{...}? IDENT ;
    public final void keyClass() throws RecognitionException {
        try {
            // USE.g:625:9: ({...}? IDENT )
            // USE.g:626:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("class"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyClass", "input.LT(1).getText().equals(\"class\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyClass3038); if (state.failed) return ;

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
    // USE.g:628:1: keySignal :{...}? IDENT ;
    public final void keySignal() throws RecognitionException {
        try {
            // USE.g:628:10: ({...}? IDENT )
            // USE.g:629:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("signal"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keySignal", "input.LT(1).getText().equals(\"signal\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keySignal3050); if (state.failed) return ;

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
    // USE.g:631:1: keyDerived :{...}? IDENT ;
    public final void keyDerived() throws RecognitionException {
        try {
            // USE.g:631:11: ({...}? IDENT )
            // USE.g:632:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("derived"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyDerived", "input.LT(1).getText().equals(\"derived\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyDerived3064); if (state.failed) return ;

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
    // USE.g:634:1: keyDerive :{...}? IDENT ;
    public final void keyDerive() throws RecognitionException {
        try {
            // USE.g:634:10: ({...}? IDENT )
            // USE.g:635:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("derive"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyDerive", "input.LT(1).getText().equals(\"derive\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyDerive3078); if (state.failed) return ;

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
    // USE.g:637:1: keyInit :{...}? IDENT ;
    public final void keyInit() throws RecognitionException {
        try {
            // USE.g:637:8: ({...}? IDENT )
            // USE.g:638:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("init"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyInit", "input.LT(1).getText().equals(\"init\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyInit3090); if (state.failed) return ;

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
    // USE.g:640:1: keyQualifier :{...}? IDENT ;
    public final void keyQualifier() throws RecognitionException {
        try {
            // USE.g:640:13: ({...}? IDENT )
            // USE.g:641:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("qualifier"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyQualifier", "input.LT(1).getText().equals(\"qualifier\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyQualifier3106); if (state.failed) return ;

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
    // USE.g:670:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;


        USEParser.expression_return nExp =null;


        try {
            // USE.g:671:5: (nExp= expression EOF )
            // USE.g:672:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly3134);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_expressionOnly3136); if (state.failed) return n;

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
    // USE.g:679:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
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
            // USE.g:685:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
            // USE.g:686:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }

            // USE.g:687:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==90) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // USE.g:688:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
            	    {
            	    match(input,90,FOLLOW_90_in_expression3184); if (state.failed) return retval;

            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression3195); if (state.failed) return retval;

            	    // USE.g:689:18: ( COLON t= type )?
            	    int alt80=2;
            	    int LA80_0 = input.LA(1);

            	    if ( (LA80_0==COLON) ) {
            	        alt80=1;
            	    }
            	    switch (alt80) {
            	        case 1 :
            	            // USE.g:689:20: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression3199); if (state.failed) return retval;

            	            pushFollow(FOLLOW_type_in_expression3203);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression3208); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expression_in_expression3212);
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

            	    // USE.g:699:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
            	    loop82:
            	    do {
            	        int alt82=2;
            	        int LA82_0 = input.LA(1);

            	        if ( (LA82_0==COMMA) ) {
            	            alt82=1;
            	        }


            	        switch (alt82) {
            	    	case 1 :
            	    	    // USE.g:700:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_expression3250); if (state.failed) return retval;

            	    	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression3262); if (state.failed) return retval;

            	    	    // USE.g:701:20: ( COLON t= type )?
            	    	    int alt81=2;
            	    	    int LA81_0 = input.LA(1);

            	    	    if ( (LA81_0==COLON) ) {
            	    	        alt81=1;
            	    	    }
            	    	    switch (alt81) {
            	    	        case 1 :
            	    	            // USE.g:701:22: COLON t= type
            	    	            {
            	    	            match(input,COLON,FOLLOW_COLON_in_expression3266); if (state.failed) return retval;

            	    	            pushFollow(FOLLOW_type_in_expression3270);
            	    	            t=type();

            	    	            state._fsp--;
            	    	            if (state.failed) return retval;

            	    	            }
            	    	            break;

            	    	    }


            	    	    match(input,EQUAL,FOLLOW_EQUAL_in_expression3275); if (state.failed) return retval;

            	    	    pushFollow(FOLLOW_expression_in_expression3279);
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
            	    	    break loop82;
            	        }
            	    } while (true);


            	    match(input,85,FOLLOW_85_in_expression3320); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression3336);
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
    // USE.g:733:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;


        ASTVariableDeclaration v =null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // USE.g:735:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // USE.g:736:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList3369); if (state.failed) return paramList;

            // USE.g:737:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==IDENT) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // USE.g:738:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList3386);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;

                    if ( state.backtracking==0 ) { paramList.add(v); }

                    // USE.g:739:7: ( COMMA v= variableDeclaration )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==COMMA) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // USE.g:739:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList3398); if (state.failed) return paramList;

                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList3402);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;

                    	    if ( state.backtracking==0 ) { paramList.add(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_paramList3422); if (state.failed) return paramList;

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
    // USE.g:747:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;


        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // USE.g:749:5: (id0= IDENT ( COMMA idn= IDENT )* )
            // USE.g:750:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList3451); if (state.failed) return idList;

            if ( state.backtracking==0 ) { idList.add(id0); }

            // USE.g:751:5: ( COMMA idn= IDENT )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==COMMA) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // USE.g:751:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList3461); if (state.failed) return idList;

            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList3465); if (state.failed) return idList;

            	    if ( state.backtracking==0 ) { idList.add(idn); }

            	    }
            	    break;

            	default :
            	    break loop86;
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
    // USE.g:759:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;


        Token name=null;
        ASTType t =null;


        try {
            // USE.g:760:5: (name= IDENT COLON t= type )
            // USE.g:761:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration3496); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableDeclaration3498); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableDeclaration3502);
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
    // USE.g:769:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndOrExp =null;

        ASTExpression n1 =null;


        try {
            // USE.g:770:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // USE.g:771:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression3538);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndOrExp;}

            // USE.g:772:5: (op= 'implies' n1= conditionalOrExpression )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==84) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // USE.g:772:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,84,FOLLOW_84_in_conditionalImpliesExpression3551); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression3555);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop87;
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
    // USE.g:781:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndXorExp =null;

        ASTExpression n1 =null;


        try {
            // USE.g:782:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // USE.g:783:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression3600);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndXorExp;}

            // USE.g:784:5: (op= 'or' n1= conditionalXOrExpression )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==102) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // USE.g:784:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,102,FOLLOW_102_in_conditionalOrExpression3613); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression3617);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop88;
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
    // USE.g:793:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndAndExp =null;

        ASTExpression n1 =null;


        try {
            // USE.g:794:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // USE.g:795:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression3661);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndAndExp;}

            // USE.g:796:5: (op= 'xor' n1= conditionalAndExpression )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==117) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // USE.g:796:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,117,FOLLOW_117_in_conditionalXOrExpression3674); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression3678);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

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
        return n;
    }
    // $ANTLR end "conditionalXOrExpression"



    // $ANTLR start "conditionalAndExpression"
    // USE.g:805:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nEqExp =null;

        ASTExpression n1 =null;


        try {
            // USE.g:806:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // USE.g:807:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression3722);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nEqExp;}

            // USE.g:808:5: (op= 'and' n1= equalityExpression )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==59) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // USE.g:808:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,59,FOLLOW_59_in_conditionalAndExpression3735); if (state.failed) return n;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression3739);
            	    n1=equalityExpression();

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
    // $ANTLR end "conditionalAndExpression"



    // $ANTLR start "equalityExpression"
    // USE.g:817:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nRelExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // USE.g:819:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // USE.g:820:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression3787);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nRelExp;}

            // USE.g:821:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==EQUAL||LA91_0==NOT_EQUAL) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // USE.g:821:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression3816);
            	    n1=relationalExpression();

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
    // $ANTLR end "equalityExpression"



    // $ANTLR start "relationalExpression"
    // USE.g:831:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nAddiExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // USE.g:833:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // USE.g:834:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression3865);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nAddiExp;}

            // USE.g:835:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( ((LA92_0 >= GREATER && LA92_0 <= GREATER_EQUAL)||(LA92_0 >= LESS && LA92_0 <= LESS_EQUAL)) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // USE.g:835:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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


            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression3901);
            	    n1=additiveExpression();

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
    // $ANTLR end "relationalExpression"



    // $ANTLR start "additiveExpression"
    // USE.g:845:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nMulExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // USE.g:847:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // USE.g:848:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression3951);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nMulExp;}

            // USE.g:849:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==MINUS||LA93_0==PLUS) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // USE.g:849:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression3979);
            	    n1=multiplicativeExpression();

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
    // $ANTLR end "additiveExpression"



    // $ANTLR start "multiplicativeExpression"
    // USE.g:860:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // USE.g:862:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // USE.g:863:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4029);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nUnExp;}

            // USE.g:864:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==SLASH||LA94_0==STAR||LA94_0==73) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // USE.g:864:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==73 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4061);
            	    n1=unaryExpression();

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
    // $ANTLR end "multiplicativeExpression"



    // $ANTLR start "unaryExpression"
    // USE.g:876:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression nPosExp =null;


         Token op = null; 
        try {
            // USE.g:878:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==MINUS||LA95_0==PLUS||LA95_0==93) ) {
                alt95=1;
            }
            else if ( (LA95_0==AT||LA95_0==HASH||(LA95_0 >= IDENT && LA95_0 <= INT)||LA95_0==LPAREN||LA95_0==REAL||(LA95_0 >= STAR && LA95_0 <= STRING)||(LA95_0 >= 44 && LA95_0 <= 45)||LA95_0==47||(LA95_0 >= 49 && LA95_0 <= 50)||LA95_0==52||LA95_0==54||LA95_0==80||LA95_0==83||LA95_0==89||(LA95_0 >= 94 && LA95_0 <= 100)||(LA95_0 >= 108 && LA95_0 <= 109)||LA95_0==115) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;

            }
            switch (alt95) {
                case 1 :
                    // USE.g:879:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // USE.g:879:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // USE.g:879:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) { op = input.LT(1); }

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==93 ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4147);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }

                    }


                    }
                    break;
                case 2 :
                    // USE.g:883:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression4167);
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
    // USE.g:891:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nPrimExp =null;

        ASTExpression nPc =null;


         boolean arrow = false; 
        try {
            // USE.g:893:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // USE.g:894:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression4200);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nPrimExp; }

            // USE.g:895:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==DOT) ) {
                    int LA97_2 = input.LA(2);

                    if ( (LA97_2==IDENT) ) {
                        int LA97_4 = input.LA(3);

                        if ( (LA97_4==EOF||(LA97_4 >= ARROW && LA97_4 <= BAR)||(LA97_4 >= COMMA && LA97_4 <= EQUAL)||(LA97_4 >= GREATER && LA97_4 <= GREATER_EQUAL)||LA97_4==IDENT||(LA97_4 >= LBRACE && LA97_4 <= MINUS)||(LA97_4 >= NOT_EQUAL && LA97_4 <= PLUS)||(LA97_4 >= RBRACE && LA97_4 <= RBRACK)||(LA97_4 >= RPAREN && LA97_4 <= SLASH)||LA97_4==STAR||LA97_4==57||(LA97_4 >= 59 && LA97_4 <= 62)||(LA97_4 >= 66 && LA97_4 <= 67)||(LA97_4 >= 73 && LA97_4 <= 79)||(LA97_4 >= 84 && LA97_4 <= 85)||LA97_4==88||(LA97_4 >= 101 && LA97_4 <= 105)||LA97_4==107||LA97_4==110||(LA97_4 >= 112 && LA97_4 <= 113)||LA97_4==117) ) {
                            alt97=1;
                        }


                    }
                    else if ( (LA97_2==89||LA97_2==95||(LA97_2 >= 97 && LA97_2 <= 99)||(LA97_2 >= 108 && LA97_2 <= 109)) ) {
                        alt97=1;
                    }


                }
                else if ( (LA97_0==ARROW) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // USE.g:896:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // USE.g:896:6: ( ARROW | DOT )
            	    int alt96=2;
            	    int LA96_0 = input.LA(1);

            	    if ( (LA96_0==ARROW) ) {
            	        alt96=1;
            	    }
            	    else if ( (LA96_0==DOT) ) {
            	        alt96=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 96, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt96) {
            	        case 1 :
            	            // USE.g:896:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression4218); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = true; }

            	            }
            	            break;
            	        case 2 :
            	            // USE.g:896:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression4224); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = false; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression4235);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = nPc; }

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
    // $ANTLR end "postfixExpression"



    // $ANTLR start "primaryExpression"
    // USE.g:912:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? );
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
            // USE.g:913:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? )
            int alt101=7;
            switch ( input.LA(1) ) {
            case HASH:
            case INT:
            case REAL:
            case STAR:
            case STRING:
            case 44:
            case 45:
            case 47:
            case 49:
            case 50:
            case 52:
            case 54:
            case 80:
            case 94:
            case 96:
            case 100:
            case 115:
                {
                alt101=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt101=1;
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
                case 59:
                case 60:
                case 61:
                case 62:
                case 66:
                case 67:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 84:
                case 85:
                case 88:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 107:
                case 110:
                case 112:
                case 113:
                case 117:
                    {
                    alt101=3;
                    }
                    break;
                case DOT:
                    {
                    switch ( input.LA(3) ) {
                    case 58:
                        {
                        alt101=6;
                        }
                        break;
                    case 65:
                        {
                        alt101=7;
                        }
                        break;
                    case IDENT:
                    case 89:
                    case 95:
                    case 97:
                    case 98:
                    case 99:
                    case 108:
                    case 109:
                        {
                        alt101=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 101, 7, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 101, 2, input);

                    throw nvae;

                }

                }
                break;
            case AT:
                {
                alt101=2;
                }
                break;
            case 89:
            case 95:
            case 97:
            case 98:
            case 99:
            case 108:
            case 109:
                {
                alt101=3;
                }
                break;
            case LPAREN:
                {
                alt101=4;
                }
                break;
            case 83:
                {
                alt101=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;

            }

            switch (alt101) {
                case 1 :
                    // USE.g:914:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression4275);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nLit; }

                    }
                    break;
                case 2 :
                    // USE.g:915:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression4289);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nOr; }

                    }
                    break;
                case 3 :
                    // USE.g:916:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression4301);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPc; }

                    }
                    break;
                case 4 :
                    // USE.g:917:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression4312); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression4316);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression4318); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExp!=null?nExp.n:null); }

                    }
                    break;
                case 5 :
                    // USE.g:918:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression4330);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nIfExp; }

                    }
                    break;
                case 6 :
                    // USE.g:919:7: id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression4342); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression4344); if (state.failed) return n;

                    match(input,58,FOLLOW_58_in_primaryExpression4346); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }

                    // USE.g:921:9: ( AT 'pre' )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==AT) ) {
                        int LA98_1 = input.LA(2);

                        if ( (LA98_1==105) ) {
                            alt98=1;
                        }
                    }
                    switch (alt98) {
                        case 1 :
                            // USE.g:921:11: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression4369); if (state.failed) return n;

                            match(input,105,FOLLOW_105_in_primaryExpression4371); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setIsPre(); }

                            }
                            break;

                    }


                    // USE.g:922:9: ( LPAREN RPAREN )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==LPAREN) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // USE.g:922:11: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression4389); if (state.failed) return n;

                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression4391); if (state.failed) return n;

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // USE.g:923:7: id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )?
                    {
                    id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression4404); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression4406); if (state.failed) return n;

                    match(input,65,FOLLOW_65_in_primaryExpression4408); if (state.failed) return n;

                    // USE.g:923:31: ( LPAREN idExp= expression RPAREN )
                    // USE.g:923:33: LPAREN idExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression4412); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression4416);
                    idExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression4418); if (state.failed) return n;

                    }


                    if ( state.backtracking==0 ) { n = new ASTObjectByUseIdExpression(id2, (idExp!=null?idExp.n:null)); }

                    // USE.g:925:7: ( AT 'pre' )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==AT) ) {
                        int LA100_1 = input.LA(2);

                        if ( (LA100_1==105) ) {
                            alt100=1;
                        }
                    }
                    switch (alt100) {
                        case 1 :
                            // USE.g:925:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression4438); if (state.failed) return n;

                            match(input,105,FOLLOW_105_in_primaryExpression4440); if (state.failed) return n;

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
    // USE.g:929:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;


        Token objectName=null;

        try {
            // USE.g:930:3: ( AT objectName= IDENT )
            // USE.g:931:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference4466); if (state.failed) return n;

            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference4474); if (state.failed) return n;

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
    // USE.g:945:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExpQuery =null;

        ASTExpression nExpIterate =null;

        USEParser.operationExpression_return nExpOperation =null;

        ASTTypeArgExpression nExpType =null;

        ASTInStateExpression nExpInState =null;


        try {
            // USE.g:946:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] )
            int alt102=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA102_1 = input.LA(2);

                if ( (((( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))&&( input.LA(2) == LPAREN ))) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 1, input);

                    throw nvae;

                }
                }
                break;
            case 89:
                {
                alt102=2;
                }
                break;
            case 95:
            case 98:
            case 99:
            case 108:
            case 109:
                {
                alt102=4;
                }
                break;
            case 97:
                {
                alt102=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;

            }

            switch (alt102) {
                case 1 :
                    // USE.g:950:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }

                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }

                    pushFollow(FOLLOW_queryExpression_in_propertyCall4539);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpQuery; }

                    }
                    break;
                case 2 :
                    // USE.g:953:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall4552);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpIterate; }

                    }
                    break;
                case 3 :
                    // USE.g:954:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall4565);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExpOperation!=null?nExpOperation.n:null); }

                    }
                    break;
                case 4 :
                    // USE.g:955:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall4578);
                    nExpType=typeExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpType; }

                    }
                    break;
                case 5 :
                    // USE.g:956:7: nExpInState= inStateExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_inStateExpression_in_propertyCall4591);
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
    // USE.g:965:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTElemVarsDeclaration decls =null;

        USEParser.expression_return nExp =null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // USE.g:966:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // USE.g:967:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression4626); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression4633); if (state.failed) return n;

            // USE.g:969:5: (decls= elemVarsDeclaration BAR )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==IDENT) ) {
                int LA103_1 = input.LA(2);

                if ( ((LA103_1 >= BAR && LA103_1 <= COLON)||LA103_1==COMMA) ) {
                    alt103=1;
                }
            }
            switch (alt103) {
                case 1 :
                    // USE.g:969:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression4644);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {decl = decls;}

                    match(input,BAR,FOLLOW_BAR_in_queryExpression4648); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_queryExpression4659);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression4665); if (state.failed) return n;

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
    // USE.g:983:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTElemVarsDeclaration decls =null;

        ASTVariableInitialization init =null;

        USEParser.expression_return nExp =null;


        try {
            // USE.g:983:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // USE.g:984:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,89,FOLLOW_89_in_iterateExpression4697); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression4703); if (state.failed) return n;

            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression4711);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;

            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression4713); if (state.failed) return n;

            pushFollow(FOLLOW_variableInitialization_in_iterateExpression4721);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;

            match(input,BAR,FOLLOW_BAR_in_iterateExpression4723); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_iterateExpression4731);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression4737); if (state.failed) return n;

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
    // USE.g:1005:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final USEParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        USEParser.operationExpression_return retval = new USEParser.operationExpression_return();
        retval.start = input.LT(1);


        Token name=null;
        USEParser.expression_return rolename =null;

        USEParser.expression_return e =null;


        try {
            // USE.g:1007:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // USE.g:1008:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression4781); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }

            // USE.g:1014:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==LBRACK) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // USE.g:1014:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression4803); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_operationExpression4816);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    // USE.g:1016:9: ( COMMA rolename= expression )*
                    loop104:
                    do {
                        int alt104=2;
                        int LA104_0 = input.LA(1);

                        if ( (LA104_0==COMMA) ) {
                            alt104=1;
                        }


                        switch (alt104) {
                    	case 1 :
                    	    // USE.g:1016:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression4829); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_operationExpression4833);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    	    }
                    	    break;

                    	default :
                    	    break loop104;
                        }
                    } while (true);


                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression4845); if (state.failed) return retval;

                    // USE.g:1019:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==LBRACK) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // USE.g:1019:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression4862); if (state.failed) return retval;

                            pushFollow(FOLLOW_expression_in_operationExpression4877);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            // USE.g:1021:11: ( COMMA rolename= expression )*
                            loop105:
                            do {
                                int alt105=2;
                                int LA105_0 = input.LA(1);

                                if ( (LA105_0==COMMA) ) {
                                    alt105=1;
                                }


                                switch (alt105) {
                            	case 1 :
                            	    // USE.g:1021:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression4892); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression4896);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop105;
                                }
                            } while (true);


                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression4910); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            // USE.g:1026:5: ( AT 'pre' )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==AT) ) {
                int LA108_1 = input.LA(2);

                if ( (LA108_1==105) ) {
                    alt108=1;
                }
            }
            switch (alt108) {
                case 1 :
                    // USE.g:1026:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression4935); if (state.failed) return retval;

                    match(input,105,FOLLOW_105_in_operationExpression4937); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.setIsPre(); }

                    }
                    break;

            }


            // USE.g:1028:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==LPAREN) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // USE.g:1029:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression4962); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.hasParentheses(); }

                    // USE.g:1030:7: (e= expression ( COMMA e= expression )* )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==AT||LA110_0==HASH||(LA110_0 >= IDENT && LA110_0 <= INT)||(LA110_0 >= LPAREN && LA110_0 <= MINUS)||LA110_0==PLUS||LA110_0==REAL||(LA110_0 >= STAR && LA110_0 <= STRING)||(LA110_0 >= 44 && LA110_0 <= 45)||LA110_0==47||(LA110_0 >= 49 && LA110_0 <= 50)||LA110_0==52||LA110_0==54||LA110_0==80||LA110_0==83||(LA110_0 >= 89 && LA110_0 <= 90)||(LA110_0 >= 93 && LA110_0 <= 100)||(LA110_0 >= 108 && LA110_0 <= 109)||LA110_0==115) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // USE.g:1031:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression4983);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            // USE.g:1032:7: ( COMMA e= expression )*
                            loop109:
                            do {
                                int alt109=2;
                                int LA109_0 = input.LA(1);

                                if ( (LA109_0==COMMA) ) {
                                    alt109=1;
                                }


                                switch (alt109) {
                            	case 1 :
                            	    // USE.g:1032:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression4995); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression4999);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop109;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression5019); if (state.failed) return retval;

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
    // USE.g:1039:1: inStateExpression[ASTExpression source, boolean followsArrow] returns [ASTInStateExpression n] : opToken= 'oclInState' LPAREN s= IDENT RPAREN ;
    public final ASTInStateExpression inStateExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTInStateExpression n = null;


        Token opToken=null;
        Token s=null;

        try {
            // USE.g:1040:35: (opToken= 'oclInState' LPAREN s= IDENT RPAREN )
            // USE.g:1041:4: opToken= 'oclInState' LPAREN s= IDENT RPAREN
            {
            opToken=(Token)match(input,97,FOLLOW_97_in_inStateExpression5056); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_inStateExpression5061); if (state.failed) return n;

            s=(Token)match(input,IDENT,FOLLOW_IDENT_in_inStateExpression5070); if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_inStateExpression5075); if (state.failed) return n;

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
    // USE.g:1053:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;


        ASTType t =null;


         Token opToken = null; 
        try {
            // USE.g:1056:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN )
            // USE.g:1057:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) { opToken = input.LT(1); }

            if ( input.LA(1)==95||(input.LA(1) >= 98 && input.LA(1) <= 99)||(input.LA(1) >= 108 && input.LA(1) <= 109) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression5135); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_typeExpression5139);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression5141); if (state.failed) return n;

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
    // USE.g:1068:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;


        Token var1=null;
        Token varN=null;
        ASTType t =null;

        ASTType tN =null;


        try {
            // USE.g:1069:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // USE.g:1070:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }

            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration5179); if (state.failed) return n;

            // USE.g:1071:17: ( COLON t= type )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==COLON) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // USE.g:1071:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration5182); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_elemVarsDeclaration5186);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}

            // USE.g:1072:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==COMMA) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // USE.g:1072:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration5196); if (state.failed) return n;

            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration5202); if (state.failed) return n;

            	    // USE.g:1072:24: ( COLON tN= type )?
            	    int alt113=2;
            	    int LA113_0 = input.LA(1);

            	    if ( (LA113_0==COLON) ) {
            	        alt113=1;
            	    }
            	    switch (alt113) {
            	        case 1 :
            	            // USE.g:1072:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration5205); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration5211);
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
    // $ANTLR end "elemVarsDeclaration"



    // $ANTLR start "variableInitialization"
    // USE.g:1080:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;


        Token name=null;
        ASTType t =null;

        USEParser.expression_return e =null;


        try {
            // USE.g:1081:5: (name= IDENT COLON t= type EQUAL e= expression )
            // USE.g:1082:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization5239); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableInitialization5241); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableInitialization5245);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization5247); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_variableInitialization5251);
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
    // USE.g:1091:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        USEParser.expression_return cond =null;

        USEParser.expression_return t =null;

        USEParser.expression_return e =null;


        try {
            // USE.g:1092:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // USE.g:1093:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,83,FOLLOW_83_in_ifExpression5283); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression5287);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,113,FOLLOW_113_in_ifExpression5289); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression5293);
            t=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,75,FOLLOW_75_in_ifExpression5295); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression5299);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,77,FOLLOW_77_in_ifExpression5301); if (state.failed) return n;

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
    // USE.g:1112:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR );
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
            // USE.g:1113:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR )
            int alt115=12;
            switch ( input.LA(1) ) {
            case 115:
                {
                alt115=1;
                }
                break;
            case 80:
                {
                alt115=2;
                }
                break;
            case INT:
                {
                alt115=3;
                }
                break;
            case REAL:
                {
                alt115=4;
                }
                break;
            case STRING:
                {
                alt115=5;
                }
                break;
            case HASH:
                {
                alt115=6;
                }
                break;
            case IDENT:
                {
                alt115=7;
                }
                break;
            case 44:
            case 47:
            case 49:
            case 50:
                {
                int LA115_8 = input.LA(2);

                if ( (LA115_8==LPAREN) ) {
                    alt115=9;
                }
                else if ( (LA115_8==LBRACE) ) {
                    alt115=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 115, 8, input);

                    throw nvae;

                }
                }
                break;
            case 45:
            case 96:
                {
                alt115=9;
                }
                break;
            case 54:
            case 94:
            case 100:
                {
                alt115=10;
                }
                break;
            case 52:
                {
                alt115=11;
                }
                break;
            case STAR:
                {
                alt115=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;

            }

            switch (alt115) {
                case 1 :
                    // USE.g:1114:7: t= 'true'
                    {
                    t=(Token)match(input,115,FOLLOW_115_in_literal5340); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }

                    }
                    break;
                case 2 :
                    // USE.g:1115:7: f= 'false'
                    {
                    f=(Token)match(input,80,FOLLOW_80_in_literal5354); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }

                    }
                    break;
                case 3 :
                    // USE.g:1116:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal5367); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }

                    }
                    break;
                case 4 :
                    // USE.g:1117:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal5382); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }

                    }
                    break;
                case 5 :
                    // USE.g:1118:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal5396); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }

                    }
                    break;
                case 6 :
                    // USE.g:1119:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal5406); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal5410); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}

                    }
                    break;
                case 7 :
                    // USE.g:1120:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal5422); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal5424); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal5428); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }

                    }
                    break;
                case 8 :
                    // USE.g:1121:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal5440);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nColIt; }

                    }
                    break;
                case 9 :
                    // USE.g:1122:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal5452);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nEColIt; }

                    }
                    break;
                case 10 :
                    // USE.g:1123:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal5464);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nUndLit; }

                    }
                    break;
                case 11 :
                    // USE.g:1124:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal5476);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nTupleLit; }

                    }
                    break;
                case 12 :
                    // USE.g:1125:7: un= STAR
                    {
                    un=(Token)match(input,STAR,FOLLOW_STAR_in_literal5488); if (state.failed) return n;

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
    // USE.g:1133:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;


        ASTCollectionItem ci =null;


         Token op = null; 
        try {
            // USE.g:1135:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // USE.g:1136:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( input.LA(1)==44||input.LA(1)==47||(input.LA(1) >= 49 && input.LA(1) <= 50) ) {
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

            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral5555); if (state.failed) return n;

            // USE.g:1140:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==AT||LA117_0==HASH||(LA117_0 >= IDENT && LA117_0 <= INT)||(LA117_0 >= LPAREN && LA117_0 <= MINUS)||LA117_0==PLUS||LA117_0==REAL||(LA117_0 >= STAR && LA117_0 <= STRING)||(LA117_0 >= 44 && LA117_0 <= 45)||LA117_0==47||(LA117_0 >= 49 && LA117_0 <= 50)||LA117_0==52||LA117_0==54||LA117_0==80||LA117_0==83||(LA117_0 >= 89 && LA117_0 <= 90)||(LA117_0 >= 93 && LA117_0 <= 100)||(LA117_0 >= 108 && LA117_0 <= 109)||LA117_0==115) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // USE.g:1141:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral5572);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addItem(ci); }

                    // USE.g:1142:7: ( COMMA ci= collectionItem )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==COMMA) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // USE.g:1142:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral5585); if (state.failed) return n;

                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral5589);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addItem(ci); }

                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral5608); if (state.failed) return n;

            }

        }
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
    // USE.g:1151:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;


        USEParser.expression_return e =null;


         n = new ASTCollectionItem(); 
        try {
            // USE.g:1153:5: (e= expression ( DOTDOT e= expression )? )
            // USE.g:1154:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem5637);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setFirst((e!=null?e.n:null)); }

            // USE.g:1155:5: ( DOTDOT e= expression )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==DOTDOT) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // USE.g:1155:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem5648); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_collectionItem5652);
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
    // USE.g:1165:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;


        ASTCollectionType t =null;


        try {
            // USE.g:1166:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==96) ) {
                alt119=1;
            }
            else if ( ((LA119_0 >= 44 && LA119_0 <= 45)||LA119_0==47||(LA119_0 >= 49 && LA119_0 <= 50)) ) {
                alt119=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;

            }
            switch (alt119) {
                case 1 :
                    // USE.g:1167:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,96,FOLLOW_96_in_emptyCollectionLiteral5681); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral5683); if (state.failed) return n;

                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral5687);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral5689); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;
                case 2 :
                    // USE.g:1170:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral5705);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral5707); if (state.failed) return n;

                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral5709); if (state.failed) return n;

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
    // USE.g:1181:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;


        ASTType t =null;


        try {
            // USE.g:1182:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt120=4;
            switch ( input.LA(1) ) {
            case 100:
                {
                alt120=1;
                }
                break;
            case 54:
                {
                alt120=2;
                }
                break;
            case 94:
                {
                int LA120_3 = input.LA(2);

                if ( (LA120_3==LPAREN) ) {
                    alt120=3;
                }
                else if ( (LA120_3==EOF||(LA120_3 >= ARROW && LA120_3 <= BAR)||(LA120_3 >= COMMA && LA120_3 <= EQUAL)||(LA120_3 >= GREATER && LA120_3 <= GREATER_EQUAL)||LA120_3==IDENT||LA120_3==LBRACE||(LA120_3 >= LESS && LA120_3 <= LESS_EQUAL)||LA120_3==MINUS||(LA120_3 >= NOT_EQUAL && LA120_3 <= PLUS)||(LA120_3 >= RBRACE && LA120_3 <= RBRACK)||(LA120_3 >= RPAREN && LA120_3 <= SLASH)||LA120_3==STAR||LA120_3==57||(LA120_3 >= 59 && LA120_3 <= 62)||(LA120_3 >= 66 && LA120_3 <= 67)||(LA120_3 >= 73 && LA120_3 <= 79)||(LA120_3 >= 84 && LA120_3 <= 85)||LA120_3==88||(LA120_3 >= 101 && LA120_3 <= 105)||LA120_3==107||LA120_3==110||(LA120_3 >= 112 && LA120_3 <= 113)||LA120_3==117) ) {
                    alt120=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 120, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;

            }

            switch (alt120) {
                case 1 :
                    // USE.g:1183:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,100,FOLLOW_100_in_undefinedLiteral5739); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral5741); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral5745);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral5747); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 2 :
                    // USE.g:1186:5: 'Undefined'
                    {
                    match(input,54,FOLLOW_54_in_undefinedLiteral5761); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;
                case 3 :
                    // USE.g:1189:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,94,FOLLOW_94_in_undefinedLiteral5775); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral5777); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral5781);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral5783); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 4 :
                    // USE.g:1192:5: 'null'
                    {
                    match(input,94,FOLLOW_94_in_undefinedLiteral5797); if (state.failed) return n;

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
    // USE.g:1202:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;


        ASTTupleItem ti =null;


         List tiList = new ArrayList(); 
        try {
            // USE.g:1204:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // USE.g:1205:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,52,FOLLOW_52_in_tupleLiteral5836); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral5842); if (state.failed) return n;

            pushFollow(FOLLOW_tupleItem_in_tupleLiteral5850);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tiList.add(ti); }

            // USE.g:1208:5: ( COMMA ti= tupleItem )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==COMMA) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // USE.g:1208:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral5861); if (state.failed) return n;

            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral5865);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tiList.add(ti); }

            	    }
            	    break;

            	default :
            	    break loop121;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral5876); if (state.failed) return n;

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
    // USE.g:1216:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;


        Token name=null;
        ASTType t =null;

        USEParser.expression_return e =null;


        try {
            // USE.g:1217:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // USE.g:1218:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem5907); if (state.failed) return n;

            // USE.g:1219:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==COLON) ) {
                int LA122_1 = input.LA(2);

                if ( (synpred1_USE()) ) {
                    alt122=1;
                }
                else if ( (true) ) {
                    alt122=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 122, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA122_0==EQUAL) ) {
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
                    // USE.g:1222:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem5946); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_tupleItem5950);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem5952); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_tupleItem5956);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, (e!=null?e.n:null)); }

                    }
                    break;
                case 2 :
                    // USE.g:1225:7: ( COLON | EQUAL ) e= expression
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


                    pushFollow(FOLLOW_expression_in_tupleItem5988);
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
    // USE.g:1236:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;


        ASTSimpleType nTSimple =null;

        ASTCollectionType nTCollection =null;

        ASTTupleType nTTuple =null;


         Token tok = null; 
        try {
            // USE.g:1238:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
            // USE.g:1239:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }

            // USE.g:1240:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            int alt123=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt123=1;
                }
                break;
            case 44:
            case 45:
            case 47:
            case 49:
            case 50:
                {
                alt123=2;
                }
                break;
            case 52:
                {
                alt123=3;
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
                    // USE.g:1241:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type6054);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 2 :
                    // USE.g:1242:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type6066);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 3 :
                    // USE.g:1243:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type6078);
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
    // USE.g:1248:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;


        ASTType nT =null;


        try {
            // USE.g:1249:5: (nT= type EOF )
            // USE.g:1250:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly6110);
            nT=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_typeOnly6112); if (state.failed) return n;

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
    // USE.g:1260:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;


        Token name=null;

        try {
            // USE.g:1261:5: (name= IDENT )
            // USE.g:1262:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType6140); if (state.failed) return n;

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
    // USE.g:1270:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;


        ASTType elemType =null;


         Token op = null; 
        try {
            // USE.g:1272:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // USE.g:1273:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( (input.LA(1) >= 44 && input.LA(1) <= 45)||input.LA(1)==47||(input.LA(1) >= 49 && input.LA(1) <= 50) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType6205); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_collectionType6209);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType6211); if (state.failed) return n;

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
    // USE.g:1283:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;


        ASTTuplePart tp =null;


         List tpList = new ArrayList(); 
        try {
            // USE.g:1285:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // USE.g:1286:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,52,FOLLOW_52_in_tupleType6245); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType6247); if (state.failed) return n;

            pushFollow(FOLLOW_tuplePart_in_tupleType6256);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tpList.add(tp); }

            // USE.g:1288:5: ( COMMA tp= tuplePart )*
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( (LA124_0==COMMA) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // USE.g:1288:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType6267); if (state.failed) return n;

            	    pushFollow(FOLLOW_tuplePart_in_tupleType6271);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tpList.add(tp); }

            	    }
            	    break;

            	default :
            	    break loop124;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType6283); if (state.failed) return n;

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
    // USE.g:1297:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;


        Token name=null;
        ASTType t =null;


        try {
            // USE.g:1298:5: (name= IDENT COLON t= type )
            // USE.g:1299:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart6315); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_tuplePart6317); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_tuplePart6321);
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
    // USE.g:1338:1: statOnly returns [ASTStatement n] : s= stat EOF ;
    public final ASTStatement statOnly() throws RecognitionException {
        ASTStatement n = null;


        USEParser.stat_return s =null;


        try {
            // USE.g:1339:3: (s= stat EOF )
            // USE.g:1340:3: s= stat EOF
            {
            pushFollow(FOLLOW_stat_in_statOnly6370);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_statOnly6374); if (state.failed) return n;

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
    // USE.g:1350:1: stat returns [ASTStatement n] : s= singleStat ( SEMI s2= singleStat )* ;
    public final USEParser.stat_return stat() throws RecognitionException {
        USEParser.stat_return retval = new USEParser.stat_return();
        retval.start = input.LT(1);


        ASTStatement s =null;

        ASTStatement s2 =null;



          ASTSequenceStatement seq = new ASTSequenceStatement(((Token)retval.start));

        try {
            // USE.g:1354:3: (s= singleStat ( SEMI s2= singleStat )* )
            // USE.g:1355:3: s= singleStat ( SEMI s2= singleStat )*
            {
            pushFollow(FOLLOW_singleStat_in_stat6409);
            s=singleStat();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {seq.addStatement(s);}

            // USE.g:1356:3: ( SEMI s2= singleStat )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==SEMI) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // USE.g:1357:5: SEMI s2= singleStat
            	    {
            	    match(input,SEMI,FOLLOW_SEMI_in_stat6421); if (state.failed) return retval;

            	    pushFollow(FOLLOW_singleStat_in_stat6431);
            	    s2=singleStat();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {seq.addStatement(s2); }

            	    }
            	    break;

            	default :
            	    break loop125;
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
    // USE.g:1369:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat );
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
            // USE.g:1370:5: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat )
            int alt126=11;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==EOF||LA126_0==SEMI||(LA126_0 >= 75 && LA126_0 <= 76)) ) {
                alt126=1;
            }
            else if ( (LA126_0==90) && (synpred2_USE())) {
                alt126=2;
            }
            else if ( (LA126_0==MINUS||LA126_0==PLUS||LA126_0==93) && (synpred2_USE())) {
                alt126=2;
            }
            else if ( (LA126_0==115) && (synpred2_USE())) {
                alt126=2;
            }
            else if ( (LA126_0==80) && (synpred2_USE())) {
                alt126=2;
            }
            else if ( (LA126_0==INT) && (synpred2_USE())) {
                alt126=2;
            }
            else if ( (LA126_0==REAL) && (synpred2_USE())) {
                alt126=2;
            }
            else if ( (LA126_0==STRING) && (synpred2_USE())) {
                alt126=2;
            }
            else if ( (LA126_0==HASH) && (synpred2_USE())) {
                alt126=2;
            }
            else if ( (LA126_0==IDENT) ) {
                int LA126_13 = input.LA(2);

                if ( (synpred2_USE()) ) {
                    alt126=2;
                }
                else if ( (true) ) {
                    alt126=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 126, 13, input);

                    throw nvae;

                }
            }
            else if ( (LA126_0==44||LA126_0==47||(LA126_0 >= 49 && LA126_0 <= 50)) && (synpred2_USE())) {
                alt126=2;
            }
            else if ( (LA126_0==96) && (synpred2_USE())) {
                alt126=2;
            }
            else if ( (LA126_0==45) && (synpred2_USE())) {
                alt126=2;
            }
            else if ( (LA126_0==100) && (synpred2_USE())) {
                alt126=2;
            }
            else if ( (LA126_0==54) && (synpred2_USE())) {
                alt126=2;
            }
            else if ( (LA126_0==94) && (synpred2_USE())) {
                alt126=2;
            }
            else if ( (LA126_0==52) && (synpred2_USE())) {
                alt126=2;
            }
            else if ( (LA126_0==STAR) && (synpred2_USE())) {
                alt126=2;
            }
            else if ( (LA126_0==AT) && (synpred2_USE())) {
                alt126=2;
            }
            else if ( (LA126_0==89) && (synpred2_USE())) {
                alt126=2;
            }
            else if ( (LA126_0==95||(LA126_0 >= 98 && LA126_0 <= 99)||(LA126_0 >= 108 && LA126_0 <= 109)) && (synpred2_USE())) {
                alt126=2;
            }
            else if ( (LA126_0==97) && (synpred2_USE())) {
                alt126=2;
            }
            else if ( (LA126_0==LPAREN) && (synpred2_USE())) {
                alt126=2;
            }
            else if ( (LA126_0==83) ) {
                int LA126_27 = input.LA(2);

                if ( (synpred2_USE()) ) {
                    alt126=2;
                }
                else if ( (true) ) {
                    alt126=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 126, 27, input);

                    throw nvae;

                }
            }
            else if ( (LA126_0==92) ) {
                alt126=4;
            }
            else if ( (LA126_0==72) ) {
                alt126=5;
            }
            else if ( (LA126_0==86) ) {
                alt126=6;
            }
            else if ( (LA126_0==71) ) {
                alt126=7;
            }
            else if ( (LA126_0==81) ) {
                alt126=9;
            }
            else if ( (LA126_0==116) ) {
                alt126=10;
            }
            else if ( (LA126_0==63) ) {
                alt126=11;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;

            }
            switch (alt126) {
                case 1 :
                    // USE.g:1371:5: emp= emptyStat
                    {
                    pushFollow(FOLLOW_emptyStat_in_singleStat6471);
                    emp=emptyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = emp; }

                    }
                    break;
                case 2 :
                    // USE.g:1373:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
                    {
                    pushFollow(FOLLOW_statStartingWithExpr_in_singleStat6497);
                    sse=statStartingWithExpr();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (sse!=null?sse.n:null); }

                    }
                    break;
                case 3 :
                    // USE.g:1374:5: vas= varAssignStat
                    {
                    pushFollow(FOLLOW_varAssignStat_in_singleStat6509);
                    vas=varAssignStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = vas; }

                    }
                    break;
                case 4 :
                    // USE.g:1375:5: ocs= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_singleStat6523);
                    ocs=objCreateStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ocs!=null?ocs.n:null); }

                    }
                    break;
                case 5 :
                    // USE.g:1376:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleStat6537);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ods!=null?ods.n:null); }

                    }
                    break;
                case 6 :
                    // USE.g:1377:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleStat6550);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lis!=null?lis.n:null); }

                    }
                    break;
                case 7 :
                    // USE.g:1378:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleStat6567);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lds!=null?lds.n:null); }

                    }
                    break;
                case 8 :
                    // USE.g:1379:5: ces= condExStat
                    {
                    pushFollow(FOLLOW_condExStat_in_singleStat6584);
                    ces=condExStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ces!=null?ces.n:null); }

                    }
                    break;
                case 9 :
                    // USE.g:1380:5: its= iterStat
                    {
                    pushFollow(FOLLOW_iterStat_in_singleStat6601);
                    its=iterStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (its!=null?its.n:null); }

                    }
                    break;
                case 10 :
                    // USE.g:1382:5: whs= whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_singleStat6623);
                    whs=whileStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (whs!=null?whs.n:null); }

                    }
                    break;
                case 11 :
                    // USE.g:1383:5: blk= blockStat
                    {
                    pushFollow(FOLLOW_blockStat_in_singleStat6641);
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
    // USE.g:1390:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
    public final ASTEmptyStatement emptyStat() throws RecognitionException {
        ASTEmptyStatement n = null;


        try {
            // USE.g:1391:3: ( nothing )
            // USE.g:1392:3: nothing
            {
            pushFollow(FOLLOW_nothing_in_emptyStat6668);
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
    // USE.g:1397:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
    public final USEParser.statStartingWithExpr_return statStartingWithExpr() throws RecognitionException {
        USEParser.statStartingWithExpr_return retval = new USEParser.statStartingWithExpr_return();
        retval.start = input.LT(1);


        ASTExpression expr =null;

        ASTAttributeAssignmentStatement aas =null;


        try {
            // USE.g:1398:3: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
            // USE.g:1399:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
            {
            pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr6694);
            expr=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            // USE.g:1400:3: (aas= attAssignStat[$expr.n] )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==DOT) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // USE.g:1401:5: aas= attAssignStat[$expr.n]
                    {
                    pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr6708);
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
    // USE.g:1413:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
    public final ASTStatement varAssignStat() throws RecognitionException {
        ASTStatement n = null;


        Token varName=null;
        ASTRValue rVal =null;


        try {
            // USE.g:1414:3: (varName= IDENT COLON_EQUAL rVal= rValue )
            // USE.g:1415:3: varName= IDENT COLON_EQUAL rVal= rValue
            {
            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat6746); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat6750); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_varAssignStat6758);
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
    // USE.g:1427:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
    public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
        ASTAttributeAssignmentStatement n = null;


        Token attName=null;
        ASTRValue r =null;


        try {
            // USE.g:1428:3: ( DOT attName= IDENT COLON_EQUAL r= rValue )
            // USE.g:1429:3: DOT attName= IDENT COLON_EQUAL r= rValue
            {
            match(input,DOT,FOLLOW_DOT_in_attAssignStat6782); if (state.failed) return n;

            attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat6791); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat6795); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_attAssignStat6803);
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
    // USE.g:1441:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
    public final USEParser.objCreateStat_return objCreateStat() throws RecognitionException {
        USEParser.objCreateStat_return retval = new USEParser.objCreateStat_return();
        retval.start = input.LT(1);


        ASTSimpleType ident =null;

        ASTExpression objName =null;

        USEParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // USE.g:1442:3: ( 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
            // USE.g:1443:3: 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            {
            match(input,92,FOLLOW_92_in_objCreateStat6829); if (state.failed) return retval;

            pushFollow(FOLLOW_simpleType_in_objCreateStat6837);
            ident=simpleType();

            state._fsp--;
            if (state.failed) return retval;

            // USE.g:1445:3: ( LPAREN (objName= inSoilExpression )? RPAREN )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==LPAREN) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // USE.g:1446:5: LPAREN (objName= inSoilExpression )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat6847); if (state.failed) return retval;

                    // USE.g:1447:7: (objName= inSoilExpression )?
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==AT||LA128_0==HASH||(LA128_0 >= IDENT && LA128_0 <= INT)||(LA128_0 >= LPAREN && LA128_0 <= MINUS)||LA128_0==PLUS||LA128_0==REAL||(LA128_0 >= STAR && LA128_0 <= STRING)||(LA128_0 >= 44 && LA128_0 <= 45)||LA128_0==47||(LA128_0 >= 49 && LA128_0 <= 50)||LA128_0==52||LA128_0==54||LA128_0==80||LA128_0==83||(LA128_0 >= 89 && LA128_0 <= 90)||(LA128_0 >= 93 && LA128_0 <= 100)||(LA128_0 >= 108 && LA128_0 <= 109)||LA128_0==115) ) {
                        alt128=1;
                    }
                    switch (alt128) {
                        case 1 :
                            // USE.g:1447:8: objName= inSoilExpression
                            {
                            pushFollow(FOLLOW_inSoilExpression_in_objCreateStat6860);
                            objName=inSoilExpression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat6868); if (state.failed) return retval;

                    }
                    break;

            }


            // USE.g:1451:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==64) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // USE.g:1452:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
                    {
                    match(input,64,FOLLOW_64_in_objCreateStat6886); if (state.failed) return retval;

                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat6894); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat6908);
                    p=rValListMin2WithOptionalQualifiers();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat6916); if (state.failed) return retval;

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
    // USE.g:1471:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
    public final USEParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
        USEParser.objDestroyStat_return retval = new USEParser.objDestroyStat_return();
        retval.start = input.LT(1);


        List<ASTExpression> el =null;


        try {
            // USE.g:1472:3: ( 'destroy' el= exprListMin1 )
            // USE.g:1473:3: 'destroy' el= exprListMin1
            {
            match(input,72,FOLLOW_72_in_objDestroyStat6952); if (state.failed) return retval;

            pushFollow(FOLLOW_exprListMin1_in_objDestroyStat6960);
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
    // USE.g:1492:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
    public final USEParser.lnkInsStat_return lnkInsStat() throws RecognitionException {
        USEParser.lnkInsStat_return retval = new USEParser.lnkInsStat_return();
        retval.start = input.LT(1);


        Token ass=null;
        USEParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // USE.g:1493:3: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
            // USE.g:1494:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
            {
            match(input,86,FOLLOW_86_in_lnkInsStat6986); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat6990); if (state.failed) return retval;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat7000);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat7004); if (state.failed) return retval;

            match(input,87,FOLLOW_87_in_lnkInsStat7008); if (state.failed) return retval;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat7016); if (state.failed) return retval;

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
    // USE.g:1504:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
    public final USEParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
        USEParser.rValListMin2WithOptionalQualifiers_return retval = new USEParser.rValListMin2WithOptionalQualifiers_return();
        retval.start = input.LT(1);


        ASTRValue r =null;

        List<ASTRValue> qualifierValues =null;



          retval.participans = new ArrayList<ASTRValue>();
          retval.qualifiers = new ArrayList<List<ASTRValue>>();
          List<ASTRValue> currentQualifiers = Collections.emptyList();

        try {
            // USE.g:1510:3: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
            // USE.g:1511:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7045);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add(r); }

            // USE.g:1512:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==LBRACE) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // USE.g:1513:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7056); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7065);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7072); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers7088); if (state.failed) return retval;

            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7099);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add(r); }

            // USE.g:1525:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==LBRACE) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // USE.g:1526:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7110); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7119);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7126); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            // USE.g:1535:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            loop134:
            do {
                int alt134=2;
                int LA134_0 = input.LA(1);

                if ( (LA134_0==COMMA) ) {
                    alt134=1;
                }


                switch (alt134) {
            	case 1 :
            	    // USE.g:1536:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers7148); if (state.failed) return retval;

            	    pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7163);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.participans.add(r); }

            	    // USE.g:1540:5: ( LBRACE qualifierValues= rValList RBRACE )?
            	    int alt133=2;
            	    int LA133_0 = input.LA(1);

            	    if ( (LA133_0==LBRACE) ) {
            	        alt133=1;
            	    }
            	    switch (alt133) {
            	        case 1 :
            	            // USE.g:1541:6: LBRACE qualifierValues= rValList RBRACE
            	            {
            	            match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7183); if (state.failed) return retval;

            	            pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7194);
            	            qualifierValues=rValList();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

            	            match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7203); if (state.failed) return retval;

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
            	    break loop134;
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
    // USE.g:1556:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
    public final USEParser.lnkDelStat_return lnkDelStat() throws RecognitionException {
        USEParser.lnkDelStat_return retval = new USEParser.lnkDelStat_return();
        retval.start = input.LT(1);


        Token ass=null;
        USEParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // USE.g:1557:3: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
            // USE.g:1558:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
            {
            match(input,71,FOLLOW_71_in_lnkDelStat7244); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat7248); if (state.failed) return retval;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat7258);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat7262); if (state.failed) return retval;

            match(input,82,FOLLOW_82_in_lnkDelStat7266); if (state.failed) return retval;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat7275); if (state.failed) return retval;

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
    // USE.g:1572:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' ;
    public final USEParser.condExStat_return condExStat() throws RecognitionException {
        USEParser.condExStat_return retval = new USEParser.condExStat_return();
        retval.start = input.LT(1);


        ASTExpression con =null;

        ASTStatement ts =null;

        ASTStatement es =null;



          ASTStatement elseStat = new ASTEmptyStatement();

        try {
            // USE.g:1576:3: ( 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' )
            // USE.g:1577:3: 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end'
            {
            match(input,83,FOLLOW_83_in_condExStat7306); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_condExStat7315);
            con=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,113,FOLLOW_113_in_condExStat7319); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat7328);
            ts=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            // USE.g:1581:3: ( 'else' es= statOrImplicitBlock )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==75) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // USE.g:1582:5: 'else' es= statOrImplicitBlock
                    {
                    match(input,75,FOLLOW_75_in_condExStat7339); if (state.failed) return retval;

                    pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat7351);
                    es=statOrImplicitBlock();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { elseStat = es; }

                    }
                    break;

            }


            match(input,76,FOLLOW_76_in_condExStat7363); if (state.failed) return retval;

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
    // USE.g:1593:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final USEParser.iterStat_return iterStat() throws RecognitionException {
        USEParser.iterStat_return retval = new USEParser.iterStat_return();
        retval.start = input.LT(1);


        Token var=null;
        ASTExpression set =null;

        ASTStatement s =null;


        try {
            // USE.g:1594:3: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // USE.g:1595:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,81,FOLLOW_81_in_iterStat7388); if (state.failed) return retval;

            var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat7396); if (state.failed) return retval;

            match(input,85,FOLLOW_85_in_iterStat7400); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_iterStat7408);
            set=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,74,FOLLOW_74_in_iterStat7412); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_iterStat7420);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            match(input,76,FOLLOW_76_in_iterStat7425); if (state.failed) return retval;

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
    // USE.g:1610:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final USEParser.whileStat_return whileStat() throws RecognitionException {
        USEParser.whileStat_return retval = new USEParser.whileStat_return();
        retval.start = input.LT(1);


        ASTExpression cond =null;

        ASTStatement s =null;


        try {
            // USE.g:1611:3: ( 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // USE.g:1612:3: 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,116,FOLLOW_116_in_whileStat7451); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_whileStat7459);
            cond=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,74,FOLLOW_74_in_whileStat7463); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_whileStat7471);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            match(input,76,FOLLOW_76_in_whileStat7476); if (state.failed) return retval;

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
    // USE.g:1624:1: blockStat returns [ASTBlockStatement n] : 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' ;
    public final USEParser.blockStat_return blockStat() throws RecognitionException {
        USEParser.blockStat_return retval = new USEParser.blockStat_return();
        retval.start = input.LT(1);


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        USEParser.stat_return s =null;



          retval.n = new ASTBlockStatement(((Token)retval.start), org.tzi.use.config.Options.explicitVariableDeclarations);

        try {
            // USE.g:1628:2: ( 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' )
            // USE.g:1629:2: 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end'
            {
            match(input,63,FOLLOW_63_in_blockStat7506); if (state.failed) return retval;

            // USE.g:1630:2: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==69) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // USE.g:1630:4: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI
                    {
                    match(input,69,FOLLOW_69_in_blockStat7511); if (state.failed) return retval;

                    pushFollow(FOLLOW_variableDeclaration_in_blockStat7517);
                    vd=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}

                    // USE.g:1630:73: ( COMMA vd1= variableDeclaration )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==COMMA) ) {
                            alt136=1;
                        }


                        switch (alt136) {
                    	case 1 :
                    	    // USE.g:1630:75: COMMA vd1= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_blockStat7523); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_variableDeclaration_in_blockStat7529);
                    	    vd1=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}

                    	    }
                    	    break;

                    	default :
                    	    break loop136;
                        }
                    } while (true);


                    match(input,SEMI,FOLLOW_SEMI_in_blockStat7536); if (state.failed) return retval;

                    }
                    break;

            }


            pushFollow(FOLLOW_stat_in_blockStat7546);
            s=stat();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n.setBody((s!=null?s.n:null)); }

            match(input,76,FOLLOW_76_in_blockStat7551); if (state.failed) return retval;

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
    // USE.g:1639:1: implicitBlockStat returns [ASTBlockStatement n] : 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat ;
    public final USEParser.implicitBlockStat_return implicitBlockStat() throws RecognitionException {
        USEParser.implicitBlockStat_return retval = new USEParser.implicitBlockStat_return();
        retval.start = input.LT(1);


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        USEParser.stat_return s =null;



          retval.n = new ASTBlockStatement(((Token)retval.start), false);

        try {
            // USE.g:1643:3: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat )
            // USE.g:1644:3: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat
            {
            match(input,69,FOLLOW_69_in_implicitBlockStat7577); if (state.failed) return retval;

            pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat7583);
            vd=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}

            // USE.g:1644:72: ( COMMA vd1= variableDeclaration )*
            loop138:
            do {
                int alt138=2;
                int LA138_0 = input.LA(1);

                if ( (LA138_0==COMMA) ) {
                    alt138=1;
                }


                switch (alt138) {
            	case 1 :
            	    // USE.g:1644:74: COMMA vd1= variableDeclaration
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_implicitBlockStat7589); if (state.failed) return retval;

            	    pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat7595);
            	    vd1=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}

            	    }
            	    break;

            	default :
            	    break loop138;
                }
            } while (true);


            match(input,SEMI,FOLLOW_SEMI_in_implicitBlockStat7602); if (state.failed) return retval;

            pushFollow(FOLLOW_stat_in_implicitBlockStat7610);
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
    // USE.g:1648:1: statOrImplicitBlock returns [ASTStatement n] : (s1= stat |s2= implicitBlockStat ) ;
    public final ASTStatement statOrImplicitBlock() throws RecognitionException {
        ASTStatement n = null;


        USEParser.stat_return s1 =null;

        USEParser.implicitBlockStat_return s2 =null;


        try {
            // USE.g:1649:3: ( (s1= stat |s2= implicitBlockStat ) )
            // USE.g:1650:3: (s1= stat |s2= implicitBlockStat )
            {
            // USE.g:1650:3: (s1= stat |s2= implicitBlockStat )
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==AT||LA139_0==HASH||(LA139_0 >= IDENT && LA139_0 <= INT)||(LA139_0 >= LPAREN && LA139_0 <= MINUS)||LA139_0==PLUS||LA139_0==REAL||LA139_0==SEMI||(LA139_0 >= STAR && LA139_0 <= STRING)||(LA139_0 >= 44 && LA139_0 <= 45)||LA139_0==47||(LA139_0 >= 49 && LA139_0 <= 50)||LA139_0==52||LA139_0==54||LA139_0==63||(LA139_0 >= 71 && LA139_0 <= 72)||(LA139_0 >= 75 && LA139_0 <= 76)||(LA139_0 >= 80 && LA139_0 <= 81)||LA139_0==83||LA139_0==86||(LA139_0 >= 89 && LA139_0 <= 90)||(LA139_0 >= 92 && LA139_0 <= 100)||(LA139_0 >= 108 && LA139_0 <= 109)||(LA139_0 >= 115 && LA139_0 <= 116)) ) {
                alt139=1;
            }
            else if ( (LA139_0==69) ) {
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
                    // USE.g:1650:4: s1= stat
                    {
                    pushFollow(FOLLOW_stat_in_statOrImplicitBlock7633);
                    s1=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s1!=null?s1.n:null); }

                    }
                    break;
                case 2 :
                    // USE.g:1650:31: s2= implicitBlockStat
                    {
                    pushFollow(FOLLOW_implicitBlockStat_in_statOrImplicitBlock7643);
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
    // USE.g:1664:1: nothing :;
    public final void nothing() throws RecognitionException {
        try {
            // USE.g:1665:1: ()
            // USE.g:1666:1: 
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
    // USE.g:1672:1: rValue returns [ASTRValue n] : (e= inSoilExpression |oc= objCreateStat );
    public final ASTRValue rValue() throws RecognitionException {
        ASTRValue n = null;


        ASTExpression e =null;

        USEParser.objCreateStat_return oc =null;


        try {
            // USE.g:1673:5: (e= inSoilExpression |oc= objCreateStat )
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==AT||LA140_0==HASH||(LA140_0 >= IDENT && LA140_0 <= INT)||(LA140_0 >= LPAREN && LA140_0 <= MINUS)||LA140_0==PLUS||LA140_0==REAL||(LA140_0 >= STAR && LA140_0 <= STRING)||(LA140_0 >= 44 && LA140_0 <= 45)||LA140_0==47||(LA140_0 >= 49 && LA140_0 <= 50)||LA140_0==52||LA140_0==54||LA140_0==80||LA140_0==83||(LA140_0 >= 89 && LA140_0 <= 90)||(LA140_0 >= 93 && LA140_0 <= 100)||(LA140_0 >= 108 && LA140_0 <= 109)||LA140_0==115) ) {
                alt140=1;
            }
            else if ( (LA140_0==92) ) {
                alt140=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;

            }
            switch (alt140) {
                case 1 :
                    // USE.g:1674:5: e= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_rValue7689);
                    e=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRValueExpressionOrOpCall(e); }

                    }
                    break;
                case 2 :
                    // USE.g:1675:5: oc= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_rValue7701);
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
    // USE.g:1688:1: rValList returns [List<ASTRValue> n] : ( nothing |rl= rValListMin1 );
    public final List<ASTRValue> rValList() throws RecognitionException {
        List<ASTRValue> n = null;


        List<ASTRValue> rl =null;


        try {
            // USE.g:1689:3: ( nothing |rl= rValListMin1 )
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==RBRACE) ) {
                alt141=1;
            }
            else if ( (LA141_0==AT||LA141_0==HASH||(LA141_0 >= IDENT && LA141_0 <= INT)||(LA141_0 >= LPAREN && LA141_0 <= MINUS)||LA141_0==PLUS||LA141_0==REAL||(LA141_0 >= STAR && LA141_0 <= STRING)||(LA141_0 >= 44 && LA141_0 <= 45)||LA141_0==47||(LA141_0 >= 49 && LA141_0 <= 50)||LA141_0==52||LA141_0==54||LA141_0==80||LA141_0==83||(LA141_0 >= 89 && LA141_0 <= 90)||(LA141_0 >= 92 && LA141_0 <= 100)||(LA141_0 >= 108 && LA141_0 <= 109)||LA141_0==115) ) {
                alt141=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;

            }
            switch (alt141) {
                case 1 :
                    // USE.g:1690:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_rValList7724);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = Collections.<ASTRValue>emptyList(); }

                    }
                    break;
                case 2 :
                    // USE.g:1693:3: rl= rValListMin1
                    {
                    pushFollow(FOLLOW_rValListMin1_in_rValList7751);
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
    // USE.g:1701:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin1() throws RecognitionException {
        List<ASTRValue> n = null;


        ASTRValue r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // USE.g:1705:3: (r= rValue ( COMMA r= rValue )* )
            // USE.g:1706:3: r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin17784);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            // USE.g:1708:3: ( COMMA r= rValue )*
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==COMMA) ) {
                    alt142=1;
                }


                switch (alt142) {
            	case 1 :
            	    // USE.g:1709:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin17798); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin17808);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add(r); }

            	    }
            	    break;

            	default :
            	    break loop142;
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
    // USE.g:1719:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin2() throws RecognitionException {
        List<ASTRValue> n = null;


        ASTRValue r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // USE.g:1723:3: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
            // USE.g:1724:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin27847);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin27855); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_rValListMin27863);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            // USE.g:1729:3: ( COMMA r= rValue )*
            loop143:
            do {
                int alt143=2;
                int LA143_0 = input.LA(1);

                if ( (LA143_0==COMMA) ) {
                    alt143=1;
                }


                switch (alt143) {
            	case 1 :
            	    // USE.g:1730:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin27877); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin27887);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add(r); }

            	    }
            	    break;

            	default :
            	    break loop143;
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
    // USE.g:1740:1: inSoilExpression returns [ASTExpression n] : e= expression ;
    public final ASTExpression inSoilExpression() throws RecognitionException {
        ASTExpression n = null;


        USEParser.expression_return e =null;


        try {
            // USE.g:1741:3: (e= expression )
            // USE.g:1742:3: e= expression
            {
            pushFollow(FOLLOW_expression_in_inSoilExpression7921);
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
    // USE.g:1751:1: exprList returns [List<ASTExpression> n] : ( nothing |el= exprListMin1 );
    public final List<ASTExpression> exprList() throws RecognitionException {
        List<ASTExpression> n = null;


        List<ASTExpression> el =null;


        try {
            // USE.g:1752:3: ( nothing |el= exprListMin1 )
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==EOF) ) {
                alt144=1;
            }
            else if ( (LA144_0==AT||LA144_0==HASH||(LA144_0 >= IDENT && LA144_0 <= INT)||(LA144_0 >= LPAREN && LA144_0 <= MINUS)||LA144_0==PLUS||LA144_0==REAL||(LA144_0 >= STAR && LA144_0 <= STRING)||(LA144_0 >= 44 && LA144_0 <= 45)||LA144_0==47||(LA144_0 >= 49 && LA144_0 <= 50)||LA144_0==52||LA144_0==54||LA144_0==80||LA144_0==83||(LA144_0 >= 89 && LA144_0 <= 90)||(LA144_0 >= 93 && LA144_0 <= 100)||(LA144_0 >= 108 && LA144_0 <= 109)||LA144_0==115) ) {
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
                    // USE.g:1753:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_exprList7950);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<ASTExpression>(); }

                    }
                    break;
                case 2 :
                    // USE.g:1756:3: el= exprListMin1
                    {
                    pushFollow(FOLLOW_exprListMin1_in_exprList7968);
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
    // USE.g:1764:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin1() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // USE.g:1768:3: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // USE.g:1769:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin18001);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // USE.g:1771:3: ( COMMA e= inSoilExpression )*
            loop145:
            do {
                int alt145=2;
                int LA145_0 = input.LA(1);

                if ( (LA145_0==COMMA) ) {
                    alt145=1;
                }


                switch (alt145) {
            	case 1 :
            	    // USE.g:1772:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin18016); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin18026);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

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
    // $ANTLR end "exprListMin1"



    // $ANTLR start "exprListMin2"
    // USE.g:1782:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin2() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // USE.g:1786:3: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // USE.g:1787:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin28066);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            match(input,COMMA,FOLLOW_COMMA_in_exprListMin28074); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_exprListMin28082);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // USE.g:1792:3: ( COMMA e= inSoilExpression )*
            loop146:
            do {
                int alt146=2;
                int LA146_0 = input.LA(1);

                if ( (LA146_0==COMMA) ) {
                    alt146=1;
                }


                switch (alt146) {
            	case 1 :
            	    // USE.g:1793:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin28096); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin28106);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

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
    // $ANTLR end "exprListMin2"



    // $ANTLR start "identList"
    // USE.g:1803:1: identList returns [List<String> n] : ( nothing |il= identListMin1 );
    public final List<String> identList() throws RecognitionException {
        List<String> n = null;


        List<String> il =null;


        try {
            // USE.g:1804:3: ( nothing |il= identListMin1 )
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==EOF||LA147_0==RBRACE||LA147_0==SEMI||(LA147_0 >= 75 && LA147_0 <= 76)) ) {
                alt147=1;
            }
            else if ( (LA147_0==IDENT) ) {
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
                    // USE.g:1805:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_identList8136);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<String>(); }

                    }
                    break;
                case 2 :
                    // USE.g:1808:3: il= identListMin1
                    {
                    pushFollow(FOLLOW_identListMin1_in_identList8153);
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
    // USE.g:1816:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
    public final List<String> identListMin1() throws RecognitionException {
        List<String> n = null;


        Token id=null;


          n = new ArrayList<String>();

        try {
            // USE.g:1820:3: (id= IDENT ( COMMA id= IDENT )* )
            // USE.g:1821:3: id= IDENT ( COMMA id= IDENT )*
            {
            id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin18187); if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((id!=null?id.getText():null)); }

            // USE.g:1823:3: ( COMMA id= IDENT )*
            loop148:
            do {
                int alt148=2;
                int LA148_0 = input.LA(1);

                if ( (LA148_0==COMMA) ) {
                    alt148=1;
                }


                switch (alt148) {
            	case 1 :
            	    // USE.g:1824:5: COMMA id= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identListMin18201); if (state.failed) return n;

            	    id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin18211); if (state.failed) return n;

            	    if ( state.backtracking==0 ) {
            	        n.add((id!=null?id.getText():null)); }

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
    // $ANTLR end "identListMin1"

    // $ANTLR start synpred1_USE
    public final void synpred1_USE_fragment() throws RecognitionException {
        // USE.g:1222:7: ( COLON type EQUAL )
        // USE.g:1222:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred1_USE5937); if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred1_USE5939);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_USE5941); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_USE

    // $ANTLR start synpred2_USE
    public final void synpred2_USE_fragment() throws RecognitionException {
        // USE.g:1373:5: ( statStartingWithExpr )
        // USE.g:1373:6: statStartingWithExpr
        {
        pushFollow(FOLLOW_statStartingWithExpr_in_synpred2_USE6489);
        statStartingWithExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_USE

    // Delegated rules

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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA1 dfa1 = new DFA1(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA61 dfa61 = new DFA61(this);
    static final String DFA2_eotS =
        "\25\uffff";
    static final String DFA2_eofS =
        "\1\1\24\uffff";
    static final String DFA2_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\23\2\uffff\1\25\1\27\1\12\1\uffff\1"+
        "\15\1\23\1\5\1\35\1\15\1\23\1\12\1\35\1\27\1\12";
    static final String DFA2_maxS =
        "\1\116\1\uffff\1\23\1\uffff\1\23\2\uffff\1\31\1\156\1\44\1\uffff"+
        "\1\15\1\23\1\116\1\35\1\15\1\23\1\44\1\35\1\156\1\44";
    static final String DFA2_acceptS =
        "\1\uffff\1\5\1\uffff\1\1\1\uffff\1\3\1\4\3\uffff\1\2\12\uffff";
    static final String DFA2_specialS =
        "\25\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\15\uffff\1\4\45\uffff\1\3\2\uffff\2\3\4\uffff\1\5\13\uffff"+
            "\1\6",
            "",
            "\1\7",
            "",
            "\1\10",
            "",
            "",
            "\1\3\3\uffff\1\11",
            "\1\3\46\uffff\1\3\1\uffff\1\12\1\uffff\1\3\11\uffff\1\3\30"+
            "\uffff\1\3\10\uffff\1\3",
            "\1\14\10\uffff\1\13\20\uffff\1\15",
            "",
            "\1\16",
            "\1\17",
            "\1\2\15\uffff\1\20\45\uffff\1\3\2\uffff\2\3\20\uffff\1\6",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\14\31\uffff\1\15",
            "\1\24",
            "\1\3\46\uffff\1\3\1\uffff\1\12\1\uffff\1\3\11\uffff\1\3\30"+
            "\uffff\1\3\10\uffff\1\3",
            "\1\14\31\uffff\1\15"
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
            return "()* loopback of 135:5: ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )*";
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
        "\1\116\1\uffff\2\23\1\31\1\130\1\70\2\uffff\3\15\1\103\1\35\1\106"+
        "\1\67\4\70\1\23\1\13\2\70";
    static final String DFA1_acceptS =
        "\1\uffff\1\3\5\uffff\1\2\1\1\17\uffff";
    static final String DFA1_specialS =
        "\30\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\15\uffff\1\1\45\uffff\1\1\2\uffff\2\1\4\uffff\1\1\1\3\12"+
            "\uffff\1\1",
            "",
            "\1\4",
            "\1\5",
            "\1\6\3\uffff\1\1",
            "\1\10\1\uffff\1\10\1\7\1\uffff\1\10\10\uffff\1\10\45\uffff"+
            "\1\10\2\uffff\2\10\4\uffff\2\10\12\uffff\2\10\10\uffff\1\10",
            "\1\14\14\uffff\1\11\6\uffff\1\13\2\uffff\1\12",
            "",
            "",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\1\57\uffff\1\10",
            "\1\20",
            "\1\22\61\uffff\1\21",
            "\1\24\55\uffff\1\23\3\uffff\1\23",
            "\1\14\14\uffff\1\11\6\uffff\1\13\2\uffff\1\12",
            "\1\14\14\uffff\1\11\6\uffff\1\13\2\uffff\1\12",
            "\1\14\14\uffff\1\11\6\uffff\1\13\2\uffff\1\12",
            "\1\14\14\uffff\1\11\6\uffff\1\13\2\uffff\1\12",
            "\1\25",
            "\1\26",
            "\1\27\6\uffff\1\27\2\uffff\1\27",
            "\1\14\14\uffff\1\11\6\uffff\1\13\2\uffff\1\12"
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
        "\1\156\1\uffff\1\23\1\uffff\1\31\1\44\1\15\1\23\1\151\1\35\1\15"+
        "\1\44\1\35\1\44";
    static final String DFA34_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\12\uffff";
    static final String DFA34_specialS =
        "\16\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\2\15\uffff\1\1\21\uffff\1\1\34\uffff\1\1\11\uffff\1\1\33"+
            "\uffff\2\3\4\uffff\1\1",
            "",
            "\1\4",
            "",
            "\1\5",
            "\1\7\10\uffff\1\6\20\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\2\15\uffff\1\1\124\uffff\2\3",
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
            return "()* loopback of 321:5: (ppc= prePostClause )*";
        }
    }
    static final String DFA55_eotS =
        "\20\uffff";
    static final String DFA55_eofS =
        "\1\1\17\uffff";
    static final String DFA55_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\25\1\12\1\15\1\23\1\5\1\35\1\15\1\23"+
        "\1\12\1\35\1\25\1\12";
    static final String DFA55_maxS =
        "\1\130\1\uffff\1\70\1\uffff\1\31\1\44\1\15\1\23\1\130\1\35\1\15"+
        "\1\23\1\44\1\35\1\31\1\44";
    static final String DFA55_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\14\uffff";
    static final String DFA55_specialS =
        "\20\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\2\15\uffff\1\1\45\uffff\1\1\2\uffff\2\1\4\uffff\2\1\12\uffff"+
            "\1\1\1\3\10\uffff\1\3",
            "",
            "\1\4\32\uffff\1\3\6\uffff\1\3\2\uffff\1\3",
            "",
            "\1\1\3\uffff\1\5",
            "\1\7\10\uffff\1\6\20\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\13\15\uffff\1\1\45\uffff\1\1\2\uffff\2\1\20\uffff\1\1\11"+
            "\uffff\1\3",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\7\31\uffff\1\10",
            "\1\17",
            "\1\1\3\uffff\1\5",
            "\1\7\31\uffff\1\10"
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "()* loopback of 486:5: (inv= invariantClause )*";
        }
    }
    static final String DFA61_eotS =
        "\20\uffff";
    static final String DFA61_eofS =
        "\1\1\17\uffff";
    static final String DFA61_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\25\1\12\1\15\1\23\1\5\1\35\1\15\1\23"+
        "\1\12\1\35\1\25\1\12";
    static final String DFA61_maxS =
        "\1\151\1\uffff\1\23\1\uffff\1\31\1\44\1\15\1\23\1\151\1\35\1\15"+
        "\1\23\1\44\1\35\1\31\1\44";
    static final String DFA61_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\14\uffff";
    static final String DFA61_specialS =
        "\20\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\2\15\uffff\1\1\45\uffff\1\1\2\uffff\2\1\4\uffff\2\1\12\uffff"+
            "\1\1\31\uffff\2\3",
            "",
            "\1\4",
            "",
            "\1\1\3\uffff\1\5",
            "\1\7\10\uffff\1\6\20\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\13\15\uffff\1\1\45\uffff\1\1\2\uffff\2\1\20\uffff\1\1\31"+
            "\uffff\2\3",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\7\31\uffff\1\10",
            "\1\17",
            "\1\1\3\uffff\1\5",
            "\1\7\31\uffff\1\10"
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "()+ loopback of 515:5: (ppc= prePostClause )+";
        }
    }
 

    public static final BitSet FOLLOW_annotationSet_in_model71 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_model77 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_model81 = new BitSet(new long[]{0x3200000000080020L,0x0000000000004004L});
    public static final BitSet FOLLOW_generalClassifierDefinition_in_model93 = new BitSet(new long[]{0x3200000000080020L,0x0000000000004004L});
    public static final BitSet FOLLOW_associationDefinition_in_model106 = new BitSet(new long[]{0x3200000000080020L,0x0000000000004004L});
    public static final BitSet FOLLOW_66_in_model120 = new BitSet(new long[]{0x3200000000080020L,0x000000000000400CL});
    public static final BitSet FOLLOW_invariant_in_model138 = new BitSet(new long[]{0x3200000000080020L,0x000000000000400CL});
    public static final BitSet FOLLOW_prePost_in_model159 = new BitSet(new long[]{0x3200000000080020L,0x000000000000400CL});
    public static final BitSet FOLLOW_enumTypeDefinition_in_model199 = new BitSet(new long[]{0x3200000000080020L,0x0000000000004004L});
    public static final BitSet FOLLOW_EOF_in_model214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_enumTypeDefinition242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_enumTypeDefinition248 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_enumTypeDefinition252 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_enumTypeDefinition254 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_enumTypeDefinition258 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_enumTypeDefinition260 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_enumTypeDefinition264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_generalClassifierDefinition302 = new BitSet(new long[]{0x3200000000080020L});
    public static final BitSet FOLLOW_57_in_generalClassifierDefinition310 = new BitSet(new long[]{0x3000000000080020L});
    public static final BitSet FOLLOW_classDefinition_in_generalClassifierDefinition338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_associationClassDefinition_in_generalClassifierDefinition376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signalDefinition_in_generalClassifierDefinition421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_annotation_in_classDefinition473 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyClass_in_classDefinition482 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_classDefinition486 = new BitSet(new long[]{0x4000000000800000L,0x0000402000001004L});
    public static final BitSet FOLLOW_LESS_in_classDefinition496 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_classDefinition500 = new BitSet(new long[]{0x4000000000000000L,0x0000402000001004L});
    public static final BitSet FOLLOW_62_in_classDefinition513 = new BitSet(new long[]{0x0000000000080020L,0x0000402000001004L});
    public static final BitSet FOLLOW_attributeDefinition_in_classDefinition526 = new BitSet(new long[]{0x0000000000080020L,0x0000402000001004L});
    public static final BitSet FOLLOW_101_in_classDefinition547 = new BitSet(new long[]{0x0000000000080020L,0x0000400000001004L});
    public static final BitSet FOLLOW_operationDefinition_in_classDefinition560 = new BitSet(new long[]{0x0000000000080020L,0x0000400000001004L});
    public static final BitSet FOLLOW_66_in_classDefinition581 = new BitSet(new long[]{0x0000000000000020L,0x0000400001009000L});
    public static final BitSet FOLLOW_invariantClause_in_classDefinition601 = new BitSet(new long[]{0x0000000000000020L,0x0000400001009000L});
    public static final BitSet FOLLOW_110_in_classDefinition627 = new BitSet(new long[]{0x0000000000000000L,0x0000040000001000L});
    public static final BitSet FOLLOW_stateMachine_in_classDefinition647 = new BitSet(new long[]{0x0000000000000000L,0x0000040000001000L});
    public static final BitSet FOLLOW_76_in_classDefinition671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_associationClassDefinition704 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationClassDefinition730 = new BitSet(new long[]{0x4000000000880000L,0x0000402000001005L});
    public static final BitSet FOLLOW_LESS_in_associationClassDefinition740 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_associationClassDefinition744 = new BitSet(new long[]{0x4000000000080000L,0x0000402000001005L});
    public static final BitSet FOLLOW_64_in_associationClassDefinition756 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition764 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition776 = new BitSet(new long[]{0x4000000000080020L,0x0000402000001004L});
    public static final BitSet FOLLOW_62_in_associationClassDefinition796 = new BitSet(new long[]{0x0000000000080020L,0x0000402000001004L});
    public static final BitSet FOLLOW_attributeDefinition_in_associationClassDefinition809 = new BitSet(new long[]{0x0000000000080020L,0x0000402000001004L});
    public static final BitSet FOLLOW_101_in_associationClassDefinition830 = new BitSet(new long[]{0x0000000000080020L,0x0000400000001004L});
    public static final BitSet FOLLOW_operationDefinition_in_associationClassDefinition843 = new BitSet(new long[]{0x0000000000080020L,0x0000400000001004L});
    public static final BitSet FOLLOW_66_in_associationClassDefinition864 = new BitSet(new long[]{0x0000000000080020L,0x0000400001009000L});
    public static final BitSet FOLLOW_invariantClause_in_associationClassDefinition884 = new BitSet(new long[]{0x0000000000080020L,0x0000400001009000L});
    public static final BitSet FOLLOW_110_in_associationClassDefinition910 = new BitSet(new long[]{0x0000000000080000L,0x0000040000001000L});
    public static final BitSet FOLLOW_stateMachine_in_associationClassDefinition930 = new BitSet(new long[]{0x0000000000080000L,0x0000040000001000L});
    public static final BitSet FOLLOW_keyAggregation_in_associationClassDefinition971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_keyComposition_in_associationClassDefinition975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_associationClassDefinition998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_attributeDefinition1026 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attributeDefinition1034 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_attributeDefinition1036 = new BitSet(new long[]{0x0016B00000080000L});
    public static final BitSet FOLLOW_type_in_attributeDefinition1040 = new BitSet(new long[]{0x0000002000080002L});
    public static final BitSet FOLLOW_keyDerive_in_attributeDefinition1064 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_keyDerived_in_attributeDefinition1066 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_set_in_attributeDefinition1069 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_attributeDefinition1079 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_keyInit_in_attributeDefinition1099 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_set_in_attributeDefinition1103 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_attributeDefinition1115 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_attributeDefinition1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_operationDefinition1160 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_operationDefinition1170 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_paramList_in_operationDefinition1180 = new BitSet(new long[]{0x80000020000020A2L,0x0000030000000000L});
    public static final BitSet FOLLOW_COLON_in_operationDefinition1194 = new BitSet(new long[]{0x0016B00000080000L});
    public static final BitSet FOLLOW_type_in_operationDefinition1200 = new BitSet(new long[]{0x8000002000002022L,0x0000030000000000L});
    public static final BitSet FOLLOW_EQUAL_in_operationDefinition1228 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_operationDefinition1234 = new BitSet(new long[]{0x0000002000000022L,0x0000030000000000L});
    public static final BitSet FOLLOW_blockStat_in_operationDefinition1256 = new BitSet(new long[]{0x0000002000000022L,0x0000030000000000L});
    public static final BitSet FOLLOW_prePostClause_in_operationDefinition1278 = new BitSet(new long[]{0x0000002000000022L,0x0000030000000000L});
    public static final BitSet FOLLOW_SEMI_in_operationDefinition1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_associationDefinition1322 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyAssociation_in_associationDefinition1336 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyAggregation_in_associationDefinition1340 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyComposition_in_associationDefinition1344 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationDefinition1354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_associationDefinition1362 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationDefinition1370 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationDefinition1382 = new BitSet(new long[]{0x0000000000080020L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_associationDefinition1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_associationEnd1418 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd1426 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LBRACK_in_associationEnd1428 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_multiplicity_in_associationEnd1432 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_associationEnd1434 = new BitSet(new long[]{0x0000002000080002L,0x0001088000000000L});
    public static final BitSet FOLLOW_keyRole_in_associationEnd1445 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd1449 = new BitSet(new long[]{0x0000002000080002L,0x0001088000000000L});
    public static final BitSet FOLLOW_103_in_associationEnd1470 = new BitSet(new long[]{0x0000002000080002L,0x0001088000000000L});
    public static final BitSet FOLLOW_112_in_associationEnd1482 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd1486 = new BitSet(new long[]{0x0000002000080002L,0x0001088000000000L});
    public static final BitSet FOLLOW_keyUnion_in_associationEnd1498 = new BitSet(new long[]{0x0000002000080002L,0x0001088000000000L});
    public static final BitSet FOLLOW_107_in_associationEnd1510 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd1514 = new BitSet(new long[]{0x0000002000080002L,0x0001088000000000L});
    public static final BitSet FOLLOW_keyDerived_in_associationEnd1527 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_keyDerive_in_associationEnd1529 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_LPAREN_in_associationEnd1534 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_associationEnd1540 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_associationEnd1542 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_associationEnd1546 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_associationEnd1550 = new BitSet(new long[]{0x0000002000080002L,0x0001088000000000L});
    public static final BitSet FOLLOW_keyQualifier_in_associationEnd1562 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_paramList_in_associationEnd1568 = new BitSet(new long[]{0x0000002000080002L,0x0001088000000000L});
    public static final BitSet FOLLOW_SEMI_in_associationEnd1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicityRange_in_multiplicity1620 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_multiplicity1630 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_multiplicityRange_in_multiplicity1634 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange1663 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_multiplicityRange1673 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_multiplicitySpec1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicitySpec1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_annotation_in_annotationSpec1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_annotation_in_annotationSpec1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_block_annotation1779 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_block_annotation1781 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_block_annotation1783 = new BitSet(new long[]{0x0120400200000000L});
    public static final BitSet FOLLOW_annotation_tag_in_block_annotation1788 = new BitSet(new long[]{0x0120400200000000L});
    public static final BitSet FOLLOW_RBRACE_in_block_annotation1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_line_annotation1815 = new BitSet(new long[]{0x0120400000000000L});
    public static final BitSet FOLLOW_annotation_tag_in_line_annotation1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_comment_in_annotation_tag1834 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotation_tag1836 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_NON_OCL_STRING_in_annotation_tag1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_weight_in_annotation_tag1847 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotation_tag1849 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000040L});
    public static final BitSet FOLLOW_annotation_def_in_annotation_tag1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_annotation_tag1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_type_in_annotation_tag1866 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotation_tag1868 = new BitSet(new long[]{0x0088000000000020L});
    public static final BitSet FOLLOW_annotation_enum_type_in_annotation_tag1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_ref_in_annotation_tag1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_annotation_comment1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_annotation_weight1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_annotation_type1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_annotation_override1926 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_annotation_override1928 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_annotation_override1930 = new BitSet(new long[]{0x0120400000000000L});
    public static final BitSet FOLLOW_annotation_term_in_annotation_override1932 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_annotation_override1934 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_annotation_override1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_tag_in_annotation_term1953 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_annotation_term1957 = new BitSet(new long[]{0x0120400000000000L});
    public static final BitSet FOLLOW_annotation_tag_in_annotation_term1959 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_AT_in_annotation_ref1971 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_annotation_ref1973 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_annotation_ref1975 = new BitSet(new long[]{0x0120400000000000L});
    public static final BitSet FOLLOW_annotation_predefined_in_annotation_ref1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_annotation_def1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_annotation_in_invariant2033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_invariant2044 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_invariant2054 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_COMMA_in_invariant2066 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_invariant2070 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_COLON_in_invariant2078 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_invariant2090 = new BitSet(new long[]{0x0000000000000022L,0x0000000001008000L});
    public static final BitSet FOLLOW_invariantClause_in_invariant2102 = new BitSet(new long[]{0x0000000000000022L,0x0000000001008000L});
    public static final BitSet FOLLOW_line_annotation_in_invariantClause2134 = new BitSet(new long[]{0x0000000000000020L,0x0000000001000000L});
    public static final BitSet FOLLOW_annotationSet_in_invariantClause2144 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_invariantClause2151 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_IDENT_in_invariantClause2157 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_invariantClause2162 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_invariantClause2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_invariantClause2183 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_invariantClause2185 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_IDENT_in_invariantClause2191 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_invariantClause2196 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_invariantClause2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_prePost2233 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_prePost2237 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_prePost2239 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_prePost2243 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_paramList_in_prePost2247 = new BitSet(new long[]{0x00000000000000A0L,0x0000030000000000L});
    public static final BitSet FOLLOW_COLON_in_prePost2251 = new BitSet(new long[]{0x0016B00000080000L});
    public static final BitSet FOLLOW_type_in_prePost2255 = new BitSet(new long[]{0x0000000000000020L,0x0000030000000000L});
    public static final BitSet FOLLOW_prePostClause_in_prePost2274 = new BitSet(new long[]{0x0000000000000022L,0x0000030000000000L});
    public static final BitSet FOLLOW_annotationSet_in_prePostClause2308 = new BitSet(new long[]{0x0000000000000000L,0x0000030000000000L});
    public static final BitSet FOLLOW_set_in_prePostClause2320 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_IDENT_in_prePostClause2335 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_prePostClause2340 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_prePostClause2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_annotationSet2371 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_annotation2390 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_annotation2394 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_annotation2400 = new BitSet(new long[]{0x0000001000080400L});
    public static final BitSet FOLLOW_annotationValues_in_annotation2409 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_annotation2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationValue_in_annotationValues2437 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_annotationValues2445 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_annotationValue_in_annotationValues2449 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_annotationValue2468 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotationValue2473 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_NON_OCL_STRING_in_annotationValue2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_stateMachine2509 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_stateMachine2542 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_stateMachine2555 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_stateDefinition_in_stateMachine2571 = new BitSet(new long[]{0x0000000000080000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_stateMachine2581 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_transitionDefinition_in_stateMachine2597 = new BitSet(new long[]{0x0000000000080000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_stateMachine2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_stateDefinition2623 = new BitSet(new long[]{0x0000000000400082L});
    public static final BitSet FOLLOW_COLON_in_stateDefinition2631 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_stateDefinition2635 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_LBRACK_in_stateDefinition2646 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_stateDefinition2652 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_stateDefinition2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_transitionDefinition2675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ARROW_in_transitionDefinition2677 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_transitionDefinition2681 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_LBRACE_in_transitionDefinition2691 = new BitSet(new long[]{0x0000000000480000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LBRACK_in_transitionDefinition2701 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_transitionDefinition2705 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_transitionDefinition2709 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000010L});
    public static final BitSet FOLLOW_event_in_transitionDefinition2733 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_IDENT_in_transitionDefinition2749 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_transitionDefinition2753 = new BitSet(new long[]{0x0000001002000000L});
    public static final BitSet FOLLOW_paramList_in_transitionDefinition2758 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_transitionDefinition2765 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_LBRACK_in_transitionDefinition2782 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_transitionDefinition2786 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_transitionDefinition2790 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_transitionDefinition2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_event2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keySignal_in_signalDefinition2840 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_signalDefinition2844 = new BitSet(new long[]{0x4000000000800000L,0x0000000000001004L});
    public static final BitSet FOLLOW_LESS_in_signalDefinition2859 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_signalDefinition2863 = new BitSet(new long[]{0x4000000000000000L,0x0000000000001004L});
    public static final BitSet FOLLOW_62_in_signalDefinition2876 = new BitSet(new long[]{0x0000000000080020L,0x0000000000001004L});
    public static final BitSet FOLLOW_attributeDefinition_in_signalDefinition2889 = new BitSet(new long[]{0x0000000000080020L,0x0000000000001004L});
    public static final BitSet FOLLOW_66_in_signalDefinition2910 = new BitSet(new long[]{0x0000000000000020L,0x0000000001009000L});
    public static final BitSet FOLLOW_invariantClause_in_signalDefinition2930 = new BitSet(new long[]{0x0000000000000020L,0x0000000001009000L});
    public static final BitSet FOLLOW_76_in_signalDefinition2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyUnion2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyAssociation2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyRole3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyComposition3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyAggregation3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyClass3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keySignal3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyDerived3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyDerive3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyInit3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyQualifier3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly3134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_expression3184 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression3195 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression3199 = new BitSet(new long[]{0x0016B00000080000L});
    public static final BitSet FOLLOW_type_in_expression3203 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression3208 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_expression3212 = new BitSet(new long[]{0x0000000000000400L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_in_expression3250 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression3262 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression3266 = new BitSet(new long[]{0x0016B00000080000L});
    public static final BitSet FOLLOW_type_in_expression3270 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression3275 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_expression3279 = new BitSet(new long[]{0x0000000000000400L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_expression3320 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList3369 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList3386 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_paramList3398 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList3402 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_paramList3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList3451 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_idList3461 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_idList3465 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration3496 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration3498 = new BitSet(new long[]{0x0016B00000080000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression3538 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_conditionalImpliesExpression3551 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE2090000L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression3555 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression3600 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_conditionalOrExpression3613 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE2090000L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression3617 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression3661 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_conditionalXOrExpression3674 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE2090000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression3678 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression3722 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_conditionalAndExpression3735 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE2090000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression3739 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3787 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_set_in_equalityExpression3806 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE2090000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3816 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression3865 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_set_in_relationalExpression3883 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE2090000L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression3901 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression3951 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression3969 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE2090000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression3979 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4029 = new BitSet(new long[]{0x0000014000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression4047 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE2090000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4061 = new BitSet(new long[]{0x0000014000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_set_in_unaryExpression4123 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE2090000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression4167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression4200 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression4218 = new BitSet(new long[]{0x0000000000080000L,0x0000300E82000000L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression4224 = new BitSet(new long[]{0x0000000000080000L,0x0000300E82000000L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression4235 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_literal_in_primaryExpression4275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression4289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression4312 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression4316 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression4342 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression4344 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_primaryExpression4346 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression4369 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_primaryExpression4371 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression4389 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression4391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression4404 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression4406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_primaryExpression4408 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression4412 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression4416 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression4418 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression4438 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_primaryExpression4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference4466 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_objectReference4474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inStateExpression_in_propertyCall4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression4626 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression4633 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression4644 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_queryExpression4648 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_queryExpression4659 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_iterateExpression4697 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression4703 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression4711 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression4713 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression4721 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression4723 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_iterateExpression4731 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression4781 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression4803 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_operationExpression4816 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression4829 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_operationExpression4833 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression4845 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression4862 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_operationExpression4877 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression4892 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_operationExpression4896 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression4910 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_operationExpression4935 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_operationExpression4937 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression4962 = new BitSet(new long[]{0x0056B318861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_operationExpression4983 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression4995 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_operationExpression4999 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression5019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_inStateExpression5056 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_inStateExpression5061 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_inStateExpression5070 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_inStateExpression5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression5111 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression5135 = new BitSet(new long[]{0x0016B00000080000L});
    public static final BitSet FOLLOW_type_in_typeExpression5139 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression5141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration5179 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration5182 = new BitSet(new long[]{0x0016B00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration5186 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration5196 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration5202 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration5205 = new BitSet(new long[]{0x0016B00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration5211 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization5239 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization5241 = new BitSet(new long[]{0x0016B00000080000L});
    public static final BitSet FOLLOW_type_in_variableInitialization5245 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization5247 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_variableInitialization5251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ifExpression5283 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_ifExpression5287 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ifExpression5289 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_ifExpression5293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ifExpression5295 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_ifExpression5299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ifExpression5301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_literal5340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_literal5354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal5382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal5396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal5406 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal5410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal5422 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal5424 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal5428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal5440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal5452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal5464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal5476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_literal5488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral5526 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral5555 = new BitSet(new long[]{0x0056B30A861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral5572 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral5585 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral5589 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral5608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem5637 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem5648 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_collectionItem5652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_emptyCollectionLiteral5681 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral5683 = new BitSet(new long[]{0x0006B00000000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral5687 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral5689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral5705 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral5707 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral5709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_undefinedLiteral5739 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral5741 = new BitSet(new long[]{0x0016B00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral5745 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral5747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_undefinedLiteral5761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_undefinedLiteral5775 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral5777 = new BitSet(new long[]{0x0016B00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral5781 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral5783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_undefinedLiteral5797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_tupleLiteral5836 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral5842 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral5850 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral5861 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral5865 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral5876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem5907 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_tupleItem5946 = new BitSet(new long[]{0x0016B00000080000L});
    public static final BitSet FOLLOW_type_in_tupleItem5950 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem5952 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_tupleItem5956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem5978 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_expression_in_tupleItem5988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type6054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type6066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type6078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly6110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly6112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType6140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType6178 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType6205 = new BitSet(new long[]{0x0016B00000080000L});
    public static final BitSet FOLLOW_type_in_collectionType6209 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType6211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_tupleType6245 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType6247 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType6256 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleType6267 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType6271 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType6283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart6315 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_tuplePart6317 = new BitSet(new long[]{0x0016B00000080000L});
    public static final BitSet FOLLOW_type_in_tuplePart6321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOnly6370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statOnly6374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_singleStat_in_stat6409 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_stat6421 = new BitSet(new long[]{0x8056B308861A0020L,0x0018301FF64B0180L});
    public static final BitSet FOLLOW_singleStat_in_stat6431 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_emptyStat_in_singleStat6471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat6497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignStat_in_singleStat6509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_singleStat6523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleStat6537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleStat6550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleStat6567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExStat_in_singleStat6584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterStat_in_singleStat6601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_singleStat6623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStat_in_singleStat6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_emptyStat6668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr6694 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr6708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varAssignStat6746 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat6750 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FF6090000L});
    public static final BitSet FOLLOW_rValue_in_varAssignStat6758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_attAssignStat6782 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attAssignStat6791 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat6795 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FF6090000L});
    public static final BitSet FOLLOW_rValue_in_attAssignStat6803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_objCreateStat6829 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_objCreateStat6837 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat6847 = new BitSet(new long[]{0x0056B318861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat6860 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat6868 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_objCreateStat6886 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat6894 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FF6090000L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat6908 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat6916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_objDestroyStat6952 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat6960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_lnkInsStat6986 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkInsStat6990 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FF6090000L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat7000 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkInsStat7004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_lnkInsStat7008 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkInsStat7016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7045 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7056 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FF6090000L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7065 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7072 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers7088 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FF6090000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7099 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7110 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FF6090000L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7119 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7126 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers7148 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FF6090000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7163 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7183 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FF6090000L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7194 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7203 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_71_in_lnkDelStat7244 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkDelStat7248 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FF6090000L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat7258 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkDelStat7262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_lnkDelStat7266 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkDelStat7275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_condExStat7306 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_inSoilExpression_in_condExStat7315 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_condExStat7319 = new BitSet(new long[]{0x8056B308861A0020L,0x0018301FF64B01A0L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat7328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_condExStat7339 = new BitSet(new long[]{0x8056B308861A0020L,0x0018301FF64B01A0L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat7351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_condExStat7363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_iterStat7388 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_iterStat7396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_iterStat7400 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_inSoilExpression_in_iterStat7408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_iterStat7412 = new BitSet(new long[]{0x8056B308861A0020L,0x0018301FF64B01A0L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_iterStat7420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_iterStat7425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_whileStat7451 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_inSoilExpression_in_whileStat7459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_whileStat7463 = new BitSet(new long[]{0x8056B308861A0020L,0x0018301FF64B01A0L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_whileStat7471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_whileStat7476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_blockStat7506 = new BitSet(new long[]{0x8056B308861A0020L,0x0018301FF64B01A0L});
    public static final BitSet FOLLOW_69_in_blockStat7511 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat7517 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_blockStat7523 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat7529 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_blockStat7536 = new BitSet(new long[]{0x8056B308861A0020L,0x0018301FF64B0180L});
    public static final BitSet FOLLOW_stat_in_blockStat7546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_blockStat7551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_implicitBlockStat7577 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat7583 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_implicitBlockStat7589 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat7595 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_implicitBlockStat7602 = new BitSet(new long[]{0x8056B308861A0020L,0x0018301FF64B0180L});
    public static final BitSet FOLLOW_stat_in_implicitBlockStat7610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOrImplicitBlock7633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitBlockStat_in_statOrImplicitBlock7643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_rValue7689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_rValue7701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_rValList7724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValListMin1_in_rValList7751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin17784 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin17798 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FF6090000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin17808 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rValue_in_rValListMin27847 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin27855 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FF6090000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin27863 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin27877 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FF6090000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin27887 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_expression_in_inSoilExpression7921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_exprList7950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprListMin1_in_exprList7968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin18001 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin18016 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin18026 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin28066 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin28074 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin28082 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin28096 = new BitSet(new long[]{0x0056B308861A0020L,0x0008301FE6090000L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin28106 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_nothing_in_identList8136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identListMin1_in_identList8153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identListMin18187 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_identListMin18201 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_identListMin18211 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COLON_in_synpred1_USE5937 = new BitSet(new long[]{0x0016B00000080000L});
    public static final BitSet FOLLOW_type_in_synpred1_USE5939 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred1_USE5941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_synpred2_USE6489 = new BitSet(new long[]{0x0000000000000002L});

}