// $ANTLR 3.4 Generator.g 2019-03-15 14:30:57
 
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

package org.tzi.use.parser.generator;

import org.tzi.use.parser.base.BaseParser;
import org.tzi.use.parser.use.statemachines.*;
import org.tzi.use.parser.use.*;
import org.tzi.use.parser.ocl.*;
import org.tzi.use.parser.soil.ast.*;
import org.tzi.use.uran.weight.*;
import org.tzi.use.query.ast.*;
import java.util.Arrays;
import java.util.Collections;
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
public class GeneratorParser extends BaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", "NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", "REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", "WS", "'&&'", "'=>'", "'ASSLCall'", "'Bag'", "'Barrier'", "'Collection'", "'Comment'", "'Hard'", "'OpEnter'", "'OpExit'", "'OrderedSet'", "'Override'", "'Rank'", "'Sequence'", "'Set'", "'Soft'", "'Tuple'", "'Type'", "'Undefined'", "'abstract'", "'all'", "'allInstances'", "'and'", "'as'", "'associationClass'", "'associationclass'", "'attributes'", "'automatic'", "'begin'", "'between'", "'but'", "'byUseId'", "'constraints'", "'context'", "'create'", "'declare'", "'delete'", "'destroy'", "'div'", "'do'", "'else'", "'end'", "'endif'", "'enum'", "'existential'", "'false'", "'for'", "'from'", "'if'", "'implies'", "'in'", "'inject'", "'insert'", "'into'", "'inv'", "'iterate'", "'let'", "'model'", "'module'", "'new'", "'no'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", "'oclInState'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", "'only'", "'operations'", "'or'", "'ordered'", "'post'", "'pre'", "'procedure'", "'psm'", "'redefines'", "'select'", "'selectByKind'", "'selectByType'", "'statemachines'", "'states'", "'subsets'", "'then'", "'transitions'", "'true'", "'var'", "'verify'", "'while'", "'with'", "'xor'", "'||'"
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
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int T__136=136;
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


    public GeneratorParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public GeneratorParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return GeneratorParser.tokenNames; }
    public String getGrammarFileName() { return "Generator.g"; }



    // $ANTLR start "invariantListOnly"
    // Generator.g:82:1: invariantListOnly returns [List<ASTConstraintDefinition> invariantList] : (def= invariant )* EOF ;
    public final List<ASTConstraintDefinition> invariantListOnly() throws RecognitionException {
        List<ASTConstraintDefinition> invariantList = null;


        ASTConstraintDefinition def =null;


         invariantList = new ArrayList<ASTConstraintDefinition>(); 
        try {
            // Generator.g:84:5: ( (def= invariant )* EOF )
            // Generator.g:85:5: (def= invariant )* EOF
            {
            // Generator.g:85:5: (def= invariant )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==AT||LA1_0==77) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Generator.g:85:7: def= invariant
            	    {
            	    pushFollow(FOLLOW_invariant_in_invariantListOnly80);
            	    def=invariant();

            	    state._fsp--;
            	    if (state.failed) return invariantList;

            	    if ( state.backtracking==0 ) { invariantList.add(def); }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input,EOF,FOLLOW_EOF_in_invariantListOnly91); if (state.failed) return invariantList;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return invariantList;
    }
    // $ANTLR end "invariantListOnly"



    // $ANTLR start "procedureListOnly"
    // Generator.g:139:1: procedureListOnly returns [List<ASTGProcedure> procedureList] : (proc= procedure )* EOF ;
    public final List<ASTGProcedure> procedureListOnly() throws RecognitionException {
        List<ASTGProcedure> procedureList = null;


        ASTGProcedure proc =null;


         procedureList = new ArrayList<ASTGProcedure>(); 
        try {
            // Generator.g:141:5: ( (proc= procedure )* EOF )
            // Generator.g:142:5: (proc= procedure )* EOF
            {
            // Generator.g:142:5: (proc= procedure )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==119) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Generator.g:143:7: proc= procedure
            	    {
            	    pushFollow(FOLLOW_procedure_in_procedureListOnly136);
            	    proc=procedure();

            	    state._fsp--;
            	    if (state.failed) return procedureList;

            	    if ( state.backtracking==0 ) { procedureList.add(proc); }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,EOF,FOLLOW_EOF_in_procedureListOnly151); if (state.failed) return procedureList;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return procedureList;
    }
    // $ANTLR end "procedureListOnly"



    // $ANTLR start "procedure"
    // Generator.g:154:1: procedure returns [ASTGProcedure proc] : 'procedure' name= IDENT LPAREN parameterDecls= variableDeclarationList RPAREN ( 'var' localDecls= variableDeclarationList SEMI )? 'begin' instructions= instructionList 'end' SEMI ;
    public final ASTGProcedure procedure() throws RecognitionException {
        ASTGProcedure proc = null;


        Token name=null;
        List parameterDecls =null;

        List localDecls =null;

        List instructions =null;


         localDecls = new ArrayList(); 
        try {
            // Generator.g:156:5: ( 'procedure' name= IDENT LPAREN parameterDecls= variableDeclarationList RPAREN ( 'var' localDecls= variableDeclarationList SEMI )? 'begin' instructions= instructionList 'end' SEMI )
            // Generator.g:157:5: 'procedure' name= IDENT LPAREN parameterDecls= variableDeclarationList RPAREN ( 'var' localDecls= variableDeclarationList SEMI )? 'begin' instructions= instructionList 'end' SEMI
            {
            match(input,119,FOLLOW_119_in_procedure179); if (state.failed) return proc;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedure183); if (state.failed) return proc;

            match(input,LPAREN,FOLLOW_LPAREN_in_procedure185); if (state.failed) return proc;

            pushFollow(FOLLOW_variableDeclarationList_in_procedure189);
            parameterDecls=variableDeclarationList();

            state._fsp--;
            if (state.failed) return proc;

            match(input,RPAREN,FOLLOW_RPAREN_in_procedure191); if (state.failed) return proc;

            // Generator.g:158:5: ( 'var' localDecls= variableDeclarationList SEMI )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==131) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Generator.g:158:7: 'var' localDecls= variableDeclarationList SEMI
                    {
                    match(input,131,FOLLOW_131_in_procedure199); if (state.failed) return proc;

                    pushFollow(FOLLOW_variableDeclarationList_in_procedure203);
                    localDecls=variableDeclarationList();

                    state._fsp--;
                    if (state.failed) return proc;

                    match(input,SEMI,FOLLOW_SEMI_in_procedure205); if (state.failed) return proc;

                    }
                    break;

            }


            match(input,72,FOLLOW_72_in_procedure214); if (state.failed) return proc;

            pushFollow(FOLLOW_instructionList_in_procedure218);
            instructions=instructionList();

            state._fsp--;
            if (state.failed) return proc;

            match(input,85,FOLLOW_85_in_procedure220); if (state.failed) return proc;

            match(input,SEMI,FOLLOW_SEMI_in_procedure222); if (state.failed) return proc;

            if ( state.backtracking==0 ) { proc = new ASTGProcedure(name, parameterDecls, localDecls, instructions ); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return proc;
    }
    // $ANTLR end "procedure"



    // $ANTLR start "variableDeclarationList"
    // Generator.g:167:1: variableDeclarationList returns [List varDecls] : (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )? ;
    public final List variableDeclarationList() throws RecognitionException {
        List varDecls = null;


        ASTVariableDeclaration decl =null;


         varDecls = new ArrayList(); 
        try {
            // Generator.g:169:5: ( (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )? )
            // Generator.g:170:5: (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )?
            {
            // Generator.g:170:5: (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IDENT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Generator.g:170:7: decl= variableDeclaration ( COMMA decl= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList260);
                    decl=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return varDecls;

                    if ( state.backtracking==0 ) {varDecls.add(decl);}

                    // Generator.g:171:7: ( COMMA decl= variableDeclaration )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==COMMA) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Generator.g:171:8: COMMA decl= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_variableDeclarationList271); if (state.failed) return varDecls;

                    	    pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList275);
                    	    decl=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return varDecls;

                    	    if ( state.backtracking==0 ) {varDecls.add(decl);}

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


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
        return varDecls;
    }
    // $ANTLR end "variableDeclarationList"



    // $ANTLR start "instructionList"
    // Generator.g:179:1: instructionList returns [List instructions] : (instr= instruction SEMI )* ;
    public final List instructionList() throws RecognitionException {
        List instructions = null;


        ASTGInstruction instr =null;


         instructions = new ArrayList(); 
        try {
            // Generator.g:181:5: ( (instr= instruction SEMI )* )
            // Generator.g:182:5: (instr= instruction SEMI )*
            {
            // Generator.g:182:5: (instr= instruction SEMI )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IDENT||LA6_0==LBRACK||LA6_0==46||LA6_0==48||(LA6_0 >= 52 && LA6_0 <= 53)||LA6_0==90||LA6_0==92) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Generator.g:182:7: instr= instruction SEMI
            	    {
            	    pushFollow(FOLLOW_instruction_in_instructionList319);
            	    instr=instruction();

            	    state._fsp--;
            	    if (state.failed) return instructions;

            	    match(input,SEMI,FOLLOW_SEMI_in_instructionList321); if (state.failed) return instructions;

            	    if ( state.backtracking==0 ) {instructions.add(instr);}

            	    }
            	    break;

            	default :
            	    break loop6;
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
        return instructions;
    }
    // $ANTLR end "instructionList"



    // $ANTLR start "instruction"
    // Generator.g:197:1: instruction returns [ASTGInstruction instr] : (instrVA= variableAssignment |instrAA= attributeAssignment |instrLO= loop |instrAI= atomicInstruction |instrIT= ifThenElse |instrAC= asslCall |instrOE= opEnter |instrOX= opExit |instrBA= barrier );
    public final ASTGInstruction instruction() throws RecognitionException {
        ASTGInstruction instr = null;


        ASTGVariableAssignment instrVA =null;

        ASTGAttributeAssignment instrAA =null;

        ASTGLoop instrLO =null;

        ASTGAtomicInstruction instrAI =null;

        ASTGIfThenElse instrIT =null;

        ASTGAsslCall instrAC =null;

        ASTGOpEnter instrOE =null;

        ASTGOpExit instrOX =null;

        ASTGBarrier instrBA =null;


        try {
            // Generator.g:198:7: (instrVA= variableAssignment |instrAA= attributeAssignment |instrLO= loop |instrAI= atomicInstruction |instrIT= ifThenElse |instrAC= asslCall |instrOE= opEnter |instrOX= opExit |instrBA= barrier )
            int alt7=9;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==COLON_EQUAL) ) {
                    alt7=1;
                }
                else if ( (LA7_1==LPAREN) ) {
                    alt7=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return instr;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
                }
                break;
            case LBRACK:
                {
                alt7=2;
                }
                break;
            case 90:
                {
                alt7=3;
                }
                break;
            case 92:
                {
                alt7=5;
                }
                break;
            case 46:
                {
                alt7=6;
                }
                break;
            case 52:
                {
                alt7=7;
                }
                break;
            case 53:
                {
                alt7=8;
                }
                break;
            case 48:
                {
                alt7=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return instr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // Generator.g:199:7: instrVA= variableAssignment
                    {
                    pushFollow(FOLLOW_variableAssignment_in_instruction356);
                    instrVA=variableAssignment();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrVA;}

                    }
                    break;
                case 2 :
                    // Generator.g:200:7: instrAA= attributeAssignment
                    {
                    pushFollow(FOLLOW_attributeAssignment_in_instruction371);
                    instrAA=attributeAssignment();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrAA;}

                    }
                    break;
                case 3 :
                    // Generator.g:201:7: instrLO= loop
                    {
                    pushFollow(FOLLOW_loop_in_instruction385);
                    instrLO=loop();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrLO;}

                    }
                    break;
                case 4 :
                    // Generator.g:202:7: instrAI= atomicInstruction
                    {
                    pushFollow(FOLLOW_atomicInstruction_in_instruction402);
                    instrAI=atomicInstruction();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrAI;}

                    }
                    break;
                case 5 :
                    // Generator.g:203:7: instrIT= ifThenElse
                    {
                    pushFollow(FOLLOW_ifThenElse_in_instruction416);
                    instrIT=ifThenElse();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrIT;}

                    }
                    break;
                case 6 :
                    // Generator.g:204:7: instrAC= asslCall
                    {
                    pushFollow(FOLLOW_asslCall_in_instruction432);
                    instrAC=asslCall();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrAC;}

                    }
                    break;
                case 7 :
                    // Generator.g:205:7: instrOE= opEnter
                    {
                    pushFollow(FOLLOW_opEnter_in_instruction448);
                    instrOE=opEnter();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrOE;}

                    }
                    break;
                case 8 :
                    // Generator.g:206:7: instrOX= opExit
                    {
                    pushFollow(FOLLOW_opExit_in_instruction465);
                    instrOX=opExit();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrOX;}

                    }
                    break;
                case 9 :
                    // Generator.g:207:7: instrBA= barrier
                    {
                    pushFollow(FOLLOW_barrier_in_instruction482);
                    instrBA=barrier();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrBA;}

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
        return instr;
    }
    // $ANTLR end "instruction"



    // $ANTLR start "variableAssignment"
    // Generator.g:214:1: variableAssignment returns [ASTGVariableAssignment assignment] : target= IDENT COLON_EQUAL source= valueInstruction ;
    public final ASTGVariableAssignment variableAssignment() throws RecognitionException {
        ASTGVariableAssignment assignment = null;


        Token target=null;
        ASTGValueInstruction source =null;


        try {
            // Generator.g:215:5: (target= IDENT COLON_EQUAL source= valueInstruction )
            // Generator.g:216:5: target= IDENT COLON_EQUAL source= valueInstruction
            {
            target=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableAssignment513); if (state.failed) return assignment;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_variableAssignment515); if (state.failed) return assignment;

            pushFollow(FOLLOW_valueInstruction_in_variableAssignment519);
            source=valueInstruction();

            state._fsp--;
            if (state.failed) return assignment;

            if ( state.backtracking==0 ) { assignment = new ASTGVariableAssignment( target, source ); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return assignment;
    }
    // $ANTLR end "variableAssignment"



    // $ANTLR start "attributeAssignment"
    // Generator.g:224:1: attributeAssignment returns [ASTGAttributeAssignment assignment] : targetObject= oclExpression DOT attributeName= IDENT COLON_EQUAL source= valueInstruction ;
    public final ASTGAttributeAssignment attributeAssignment() throws RecognitionException {
        ASTGAttributeAssignment assignment = null;


        Token attributeName=null;
        ASTGocl targetObject =null;

        ASTGValueInstruction source =null;


        try {
            // Generator.g:225:5: (targetObject= oclExpression DOT attributeName= IDENT COLON_EQUAL source= valueInstruction )
            // Generator.g:226:5: targetObject= oclExpression DOT attributeName= IDENT COLON_EQUAL source= valueInstruction
            {
            pushFollow(FOLLOW_oclExpression_in_attributeAssignment551);
            targetObject=oclExpression();

            state._fsp--;
            if (state.failed) return assignment;

            match(input,DOT,FOLLOW_DOT_in_attributeAssignment553); if (state.failed) return assignment;

            attributeName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attributeAssignment557); if (state.failed) return assignment;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attributeAssignment565); if (state.failed) return assignment;

            pushFollow(FOLLOW_valueInstruction_in_attributeAssignment569);
            source=valueInstruction();

            state._fsp--;
            if (state.failed) return assignment;

            if ( state.backtracking==0 ) { assignment = new ASTGAttributeAssignment(
            			 targetObject, attributeName, source ); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return assignment;
    }
    // $ANTLR end "attributeAssignment"



    // $ANTLR start "loop"
    // Generator.g:236:1: loop returns [ASTGLoop loop] : t= 'for' decl= variableDeclaration 'in' sequence= oclExpression 'begin' instructions= instructionList 'end' ;
    public final ASTGLoop loop() throws RecognitionException {
        ASTGLoop loop = null;


        Token t=null;
        ASTVariableDeclaration decl =null;

        ASTGocl sequence =null;

        List instructions =null;


        try {
            // Generator.g:237:5: (t= 'for' decl= variableDeclaration 'in' sequence= oclExpression 'begin' instructions= instructionList 'end' )
            // Generator.g:238:5: t= 'for' decl= variableDeclaration 'in' sequence= oclExpression 'begin' instructions= instructionList 'end'
            {
            t=(Token)match(input,90,FOLLOW_90_in_loop601); if (state.failed) return loop;

            pushFollow(FOLLOW_variableDeclaration_in_loop605);
            decl=variableDeclaration();

            state._fsp--;
            if (state.failed) return loop;

            match(input,94,FOLLOW_94_in_loop607); if (state.failed) return loop;

            pushFollow(FOLLOW_oclExpression_in_loop611);
            sequence=oclExpression();

            state._fsp--;
            if (state.failed) return loop;

            match(input,72,FOLLOW_72_in_loop613); if (state.failed) return loop;

            pushFollow(FOLLOW_instructionList_in_loop624);
            instructions=instructionList();

            state._fsp--;
            if (state.failed) return loop;

            match(input,85,FOLLOW_85_in_loop626); if (state.failed) return loop;

            if ( state.backtracking==0 ) { loop = new ASTGLoop( decl, sequence, instructions, t ); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return loop;
    }
    // $ANTLR end "loop"



    // $ANTLR start "ifThenElse"
    // Generator.g:249:1: ifThenElse returns [ASTGIfThenElse ifThenElse] : token= 'if' sequence= oclExpression 'then' 'begin' thenInstructions= instructionList 'end' ( 'else' 'begin' elseInstructions= instructionList 'end' )? ;
    public final ASTGIfThenElse ifThenElse() throws RecognitionException {
        ASTGIfThenElse ifThenElse = null;


        Token token=null;
        ASTGocl sequence =null;

        List thenInstructions =null;

        List elseInstructions =null;


         List elseInstructionsList = new ArrayList(); 
        try {
            // Generator.g:251:5: (token= 'if' sequence= oclExpression 'then' 'begin' thenInstructions= instructionList 'end' ( 'else' 'begin' elseInstructions= instructionList 'end' )? )
            // Generator.g:252:5: token= 'if' sequence= oclExpression 'then' 'begin' thenInstructions= instructionList 'end' ( 'else' 'begin' elseInstructions= instructionList 'end' )?
            {
            token=(Token)match(input,92,FOLLOW_92_in_ifThenElse662); if (state.failed) return ifThenElse;

            pushFollow(FOLLOW_oclExpression_in_ifThenElse666);
            sequence=oclExpression();

            state._fsp--;
            if (state.failed) return ifThenElse;

            match(input,128,FOLLOW_128_in_ifThenElse677); if (state.failed) return ifThenElse;

            match(input,72,FOLLOW_72_in_ifThenElse679); if (state.failed) return ifThenElse;

            pushFollow(FOLLOW_instructionList_in_ifThenElse683);
            thenInstructions=instructionList();

            state._fsp--;
            if (state.failed) return ifThenElse;

            match(input,85,FOLLOW_85_in_ifThenElse685); if (state.failed) return ifThenElse;

            // Generator.g:254:9: ( 'else' 'begin' elseInstructions= instructionList 'end' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==84) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Generator.g:254:10: 'else' 'begin' elseInstructions= instructionList 'end'
                    {
                    match(input,84,FOLLOW_84_in_ifThenElse696); if (state.failed) return ifThenElse;

                    match(input,72,FOLLOW_72_in_ifThenElse698); if (state.failed) return ifThenElse;

                    pushFollow(FOLLOW_instructionList_in_ifThenElse702);
                    elseInstructions=instructionList();

                    state._fsp--;
                    if (state.failed) return ifThenElse;

                    match(input,85,FOLLOW_85_in_ifThenElse704); if (state.failed) return ifThenElse;

                    if ( state.backtracking==0 ) { elseInstructionsList=elseInstructions; }

                    }
                    break;

            }


            if ( state.backtracking==0 ) { ifThenElse = new ASTGIfThenElse( sequence, thenInstructions,
                            elseInstructionsList, token ); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ifThenElse;
    }
    // $ANTLR end "ifThenElse"



    // $ANTLR start "valueInstruction"
    // Generator.g:263:1: valueInstruction returns [ASTGValueInstruction valueinstr] : (atmoicInstr= atomicInstruction |oclExpr= oclExpression );
    public final ASTGValueInstruction valueInstruction() throws RecognitionException {
        ASTGValueInstruction valueinstr = null;


        ASTGAtomicInstruction atmoicInstr =null;

        ASTGocl oclExpr =null;


        try {
            // Generator.g:264:7: (atmoicInstr= atomicInstruction |oclExpr= oclExpression )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IDENT) ) {
                alt9=1;
            }
            else if ( (LA9_0==LBRACK) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return valueinstr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // Generator.g:265:7: atmoicInstr= atomicInstruction
                    {
                    pushFollow(FOLLOW_atomicInstruction_in_valueInstruction744);
                    atmoicInstr=atomicInstruction();

                    state._fsp--;
                    if (state.failed) return valueinstr;

                    if ( state.backtracking==0 ) {valueinstr = atmoicInstr; }

                    }
                    break;
                case 2 :
                    // Generator.g:266:7: oclExpr= oclExpression
                    {
                    pushFollow(FOLLOW_oclExpression_in_valueInstruction758);
                    oclExpr=oclExpression();

                    state._fsp--;
                    if (state.failed) return valueinstr;

                    if ( state.backtracking==0 ) {valueinstr = oclExpr; }

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
        return valueinstr;
    }
    // $ANTLR end "valueInstruction"



    // $ANTLR start "atomicInstruction"
    // Generator.g:274:1: atomicInstruction returns [ASTGAtomicInstruction instr] : name= IDENT LPAREN (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )? RPAREN ;
    public final ASTGAtomicInstruction atomicInstruction() throws RecognitionException {
        ASTGAtomicInstruction instr = null;


        Token name=null;
        Object parameter =null;


        try {
            // Generator.g:275:5: (name= IDENT LPAREN (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )? RPAREN )
            // Generator.g:276:5: name= IDENT LPAREN (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )? RPAREN
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_atomicInstruction788); if (state.failed) return instr;

            if ( state.backtracking==0 ) { instr = new ASTGAtomicInstruction(name); }

            match(input,LPAREN,FOLLOW_LPAREN_in_atomicInstruction792); if (state.failed) return instr;

            // Generator.g:277:9: (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IDENT||LA11_0==LBRACK) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Generator.g:277:11: parameter= instructionParameter ( COMMA parameter= instructionParameter )*
                    {
                    pushFollow(FOLLOW_instructionParameter_in_atomicInstruction806);
                    parameter=instructionParameter();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) { instr.addParameter(parameter); }

                    // Generator.g:278:13: ( COMMA parameter= instructionParameter )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==COMMA) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // Generator.g:278:15: COMMA parameter= instructionParameter
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_atomicInstruction824); if (state.failed) return instr;

                    	    pushFollow(FOLLOW_instructionParameter_in_atomicInstruction828);
                    	    parameter=instructionParameter();

                    	    state._fsp--;
                    	    if (state.failed) return instr;

                    	    if ( state.backtracking==0 ) { instr.addParameter(parameter); }

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_atomicInstruction876); if (state.failed) return instr;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return instr;
    }
    // $ANTLR end "atomicInstruction"



    // $ANTLR start "asslCall"
    // Generator.g:289:1: asslCall returns [ASTGAsslCall instr] : 'ASSLCall' name= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN ;
    public final ASTGAsslCall asslCall() throws RecognitionException {
        ASTGAsslCall instr = null;


        Token name=null;
        ASTGocl parameter =null;


        try {
            // Generator.g:290:5: ( 'ASSLCall' name= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN )
            // Generator.g:291:5: 'ASSLCall' name= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN
            {
            match(input,46,FOLLOW_46_in_asslCall899); if (state.failed) return instr;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_asslCall903); if (state.failed) return instr;

            if ( state.backtracking==0 ) { instr = new ASTGAsslCall(name); }

            match(input,LPAREN,FOLLOW_LPAREN_in_asslCall907); if (state.failed) return instr;

            // Generator.g:292:9: (parameter= oclExpression ( COMMA parameter= oclExpression )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LBRACK) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Generator.g:292:11: parameter= oclExpression ( COMMA parameter= oclExpression )*
                    {
                    pushFollow(FOLLOW_oclExpression_in_asslCall921);
                    parameter=oclExpression();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) { instr.addParameter(parameter); }

                    // Generator.g:293:13: ( COMMA parameter= oclExpression )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // Generator.g:293:15: COMMA parameter= oclExpression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_asslCall939); if (state.failed) return instr;

                    	    pushFollow(FOLLOW_oclExpression_in_asslCall943);
                    	    parameter=oclExpression();

                    	    state._fsp--;
                    	    if (state.failed) return instr;

                    	    if ( state.backtracking==0 ) { instr.addParameter(parameter); }

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_asslCall991); if (state.failed) return instr;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return instr;
    }
    // $ANTLR end "asslCall"



    // $ANTLR start "opEnter"
    // Generator.g:304:1: opEnter returns [ASTGOpEnter instr] : 'OpEnter' oid= oclExpression opname= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN ;
    public final ASTGOpEnter opEnter() throws RecognitionException {
        ASTGOpEnter instr = null;


        Token opname=null;
        ASTGocl oid =null;

        ASTGocl parameter =null;


        try {
            // Generator.g:305:5: ( 'OpEnter' oid= oclExpression opname= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN )
            // Generator.g:306:5: 'OpEnter' oid= oclExpression opname= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN
            {
            match(input,52,FOLLOW_52_in_opEnter1014); if (state.failed) return instr;

            pushFollow(FOLLOW_oclExpression_in_opEnter1018);
            oid=oclExpression();

            state._fsp--;
            if (state.failed) return instr;

            opname=(Token)match(input,IDENT,FOLLOW_IDENT_in_opEnter1022); if (state.failed) return instr;

            if ( state.backtracking==0 ) { instr = new ASTGOpEnter(oid, opname); }

            match(input,LPAREN,FOLLOW_LPAREN_in_opEnter1026); if (state.failed) return instr;

            // Generator.g:307:9: (parameter= oclExpression ( COMMA parameter= oclExpression )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LBRACK) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Generator.g:307:11: parameter= oclExpression ( COMMA parameter= oclExpression )*
                    {
                    pushFollow(FOLLOW_oclExpression_in_opEnter1041);
                    parameter=oclExpression();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) { instr.addParameter(parameter); }

                    // Generator.g:308:13: ( COMMA parameter= oclExpression )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // Generator.g:308:15: COMMA parameter= oclExpression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_opEnter1059); if (state.failed) return instr;

                    	    pushFollow(FOLLOW_oclExpression_in_opEnter1063);
                    	    parameter=oclExpression();

                    	    state._fsp--;
                    	    if (state.failed) return instr;

                    	    if ( state.backtracking==0 ) { instr.addParameter(parameter); }

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_opEnter1111); if (state.failed) return instr;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return instr;
    }
    // $ANTLR end "opEnter"



    // $ANTLR start "opExit"
    // Generator.g:318:1: opExit returns [ASTGOpExit instr] : 'OpExit' ;
    public final ASTGOpExit opExit() throws RecognitionException {
        ASTGOpExit instr = null;


        try {
            // Generator.g:319:5: ( 'OpExit' )
            // Generator.g:320:5: 'OpExit'
            {
            match(input,53,FOLLOW_53_in_opExit1134); if (state.failed) return instr;

            if ( state.backtracking==0 ) { instr = new ASTGOpExit(); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return instr;
    }
    // $ANTLR end "opExit"



    // $ANTLR start "instructionParameter"
    // Generator.g:326:1: instructionParameter returns [Object parameter] : (parameterOcl= oclExpression |parameterIdent= instrParameterIdent );
    public final Object instructionParameter() throws RecognitionException {
        Object parameter = null;


        ASTGocl parameterOcl =null;

        Token parameterIdent =null;


        try {
            // Generator.g:327:7: (parameterOcl= oclExpression |parameterIdent= instrParameterIdent )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LBRACK) ) {
                alt16=1;
            }
            else if ( (LA16_0==IDENT) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return parameter;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // Generator.g:328:7: parameterOcl= oclExpression
                    {
                    pushFollow(FOLLOW_oclExpression_in_instructionParameter1163);
                    parameterOcl=oclExpression();

                    state._fsp--;
                    if (state.failed) return parameter;

                    if ( state.backtracking==0 ) {parameter = parameterOcl; }

                    }
                    break;
                case 2 :
                    // Generator.g:329:7: parameterIdent= instrParameterIdent
                    {
                    pushFollow(FOLLOW_instrParameterIdent_in_instructionParameter1175);
                    parameterIdent=instrParameterIdent();

                    state._fsp--;
                    if (state.failed) return parameter;

                    if ( state.backtracking==0 ) {parameter = parameterIdent; }

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
        return parameter;
    }
    // $ANTLR end "instructionParameter"



    // $ANTLR start "instrParameterIdent"
    // Generator.g:336:1: instrParameterIdent returns [Token t] : i= IDENT ;
    public final Token instrParameterIdent() throws RecognitionException {
        Token t = null;


        Token i=null;

        try {
            // Generator.g:337:5: (i= IDENT )
            // Generator.g:338:5: i= IDENT
            {
            i=(Token)match(input,IDENT,FOLLOW_IDENT_in_instrParameterIdent1203); if (state.failed) return t;

            if ( state.backtracking==0 ) { t = i; }

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
    // $ANTLR end "instrParameterIdent"



    // $ANTLR start "oclExpression"
    // Generator.g:345:1: oclExpression returns [ASTGocl encapOcl] : i= LBRACK ocl= expression RBRACK ;
    public final ASTGocl oclExpression() throws RecognitionException {
        ASTGocl encapOcl = null;


        Token i=null;
        GeneratorParser.expression_return ocl =null;


        try {
            // Generator.g:346:5: (i= LBRACK ocl= expression RBRACK )
            // Generator.g:347:5: i= LBRACK ocl= expression RBRACK
            {
            i=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_oclExpression1231); if (state.failed) return encapOcl;

            pushFollow(FOLLOW_expression_in_oclExpression1235);
            ocl=expression();

            state._fsp--;
            if (state.failed) return encapOcl;

            match(input,RBRACK,FOLLOW_RBRACK_in_oclExpression1237); if (state.failed) return encapOcl;

            if ( state.backtracking==0 ) { encapOcl = new ASTGocl((ocl!=null?ocl.n:null), i); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return encapOcl;
    }
    // $ANTLR end "oclExpression"



    // $ANTLR start "barrier"
    // Generator.g:354:1: barrier returns [ASTGBarrier barrier] : 'Barrier' LPAREN (invClass= IDENT COLON_COLON invName= IDENT |exp= oclExpression ) RPAREN ;
    public final ASTGBarrier barrier() throws RecognitionException {
        ASTGBarrier barrier = null;


        Token invClass=null;
        Token invName=null;
        ASTGocl exp =null;


        try {
            // Generator.g:355:4: ( 'Barrier' LPAREN (invClass= IDENT COLON_COLON invName= IDENT |exp= oclExpression ) RPAREN )
            // Generator.g:356:4: 'Barrier' LPAREN (invClass= IDENT COLON_COLON invName= IDENT |exp= oclExpression ) RPAREN
            {
            match(input,48,FOLLOW_48_in_barrier1265); if (state.failed) return barrier;

            match(input,LPAREN,FOLLOW_LPAREN_in_barrier1270); if (state.failed) return barrier;

            // Generator.g:357:11: (invClass= IDENT COLON_COLON invName= IDENT |exp= oclExpression )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IDENT) ) {
                alt17=1;
            }
            else if ( (LA17_0==LBRACK) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return barrier;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // Generator.g:358:8: invClass= IDENT COLON_COLON invName= IDENT
                    {
                    invClass=(Token)match(input,IDENT,FOLLOW_IDENT_in_barrier1285); if (state.failed) return barrier;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_barrier1287); if (state.failed) return barrier;

                    invName=(Token)match(input,IDENT,FOLLOW_IDENT_in_barrier1293); if (state.failed) return barrier;

                    if ( state.backtracking==0 ) { barrier = new ASTGBarrierInvariant(invClass, invName); }

                    }
                    break;
                case 2 :
                    // Generator.g:359:8: exp= oclExpression
                    {
                    pushFollow(FOLLOW_oclExpression_in_barrier1309);
                    exp=oclExpression();

                    state._fsp--;
                    if (state.failed) return barrier;

                    if ( state.backtracking==0 ) { barrier = new ASTGBarrierExpression(exp); }

                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_barrier1321); if (state.failed) return barrier;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return barrier;
    }
    // $ANTLR end "barrier"



    // $ANTLR start "procedureCallOnly"
    // Generator.g:372:1: procedureCallOnly returns [ASTGProcedureCall call] : name= IDENT LPAREN (ocl= expression ( COMMA ocl= expression )* )? RPAREN EOF ;
    public final ASTGProcedureCall procedureCallOnly() throws RecognitionException {
        ASTGProcedureCall call = null;


        Token name=null;
        GeneratorParser.expression_return ocl =null;


        try {
            // Generator.g:373:5: (name= IDENT LPAREN (ocl= expression ( COMMA ocl= expression )* )? RPAREN EOF )
            // Generator.g:374:5: name= IDENT LPAREN (ocl= expression ( COMMA ocl= expression )* )? RPAREN EOF
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureCallOnly1345); if (state.failed) return call;

            if ( state.backtracking==0 ) {call = new ASTGProcedureCall(name);}

            match(input,LPAREN,FOLLOW_LPAREN_in_procedureCallOnly1353); if (state.failed) return call;

            // Generator.g:375:12: (ocl= expression ( COMMA ocl= expression )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==AT||LA19_0==HASH||(LA19_0 >= IDENT && LA19_0 <= INT)||(LA19_0 >= LPAREN && LA19_0 <= MINUS)||LA19_0==PLUS||LA19_0==REAL||(LA19_0 >= STAR && LA19_0 <= STRING)||LA19_0==47||LA19_0==49||LA19_0==54||(LA19_0 >= 57 && LA19_0 <= 58)||LA19_0==60||LA19_0==62||LA19_0==89||LA19_0==92||(LA19_0 >= 99 && LA19_0 <= 100)||(LA19_0 >= 105 && LA19_0 <= 112)||(LA19_0 >= 123 && LA19_0 <= 124)||LA19_0==130) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Generator.g:376:5: ocl= expression ( COMMA ocl= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_procedureCallOnly1364);
                    ocl=expression();

                    state._fsp--;
                    if (state.failed) return call;

                    if ( state.backtracking==0 ) {call.addParameter((ocl!=null?ocl.n:null));}

                    // Generator.g:377:5: ( COMMA ocl= expression )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==COMMA) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // Generator.g:377:7: COMMA ocl= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_procedureCallOnly1374); if (state.failed) return call;

                    	    pushFollow(FOLLOW_expression_in_procedureCallOnly1378);
                    	    ocl=expression();

                    	    state._fsp--;
                    	    if (state.failed) return call;

                    	    if ( state.backtracking==0 ) {call.addParameter((ocl!=null?ocl.n:null));}

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_procedureCallOnly1392); if (state.failed) return call;

            match(input,EOF,FOLLOW_EOF_in_procedureCallOnly1398); if (state.failed) return call;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return call;
    }
    // $ANTLR end "procedureCallOnly"



    // $ANTLR start "model"
    // Generator.g:399:1: model returns [ASTModel n] : as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )* (m= moduleExpr )* EOF ;
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
            // Generator.g:400:2: (as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )* (m= moduleExpr )* EOF )
            // Generator.g:401:2: as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )* (m= moduleExpr )* EOF
            {
            pushFollow(FOLLOW_annotationSet_in_model1427);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            match(input,101,FOLLOW_101_in_model1433); if (state.failed) return n;

            modelName=(Token)match(input,IDENT,FOLLOW_IDENT_in_model1437); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTModel(modelName); n.setAnnotations(as); }

            // Generator.g:403:5: ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )*
            loop21:
            do {
                int alt21=5;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // Generator.g:403:9: generalClassifierDefinition[$n]
            	    {
            	    pushFollow(FOLLOW_generalClassifierDefinition_in_model1449);
            	    generalClassifierDefinition(n);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    }
            	    break;
            	case 2 :
            	    // Generator.g:404:9: a= associationDefinition
            	    {
            	    pushFollow(FOLLOW_associationDefinition_in_model1462);
            	    a=associationDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addAssociation(a); }

            	    }
            	    break;
            	case 3 :
            	    // Generator.g:405:9: ( 'constraints' (cons= invariant |ppc= prePost )* )
            	    {
            	    // Generator.g:405:9: ( 'constraints' (cons= invariant |ppc= prePost )* )
            	    // Generator.g:405:11: 'constraints' (cons= invariant |ppc= prePost )*
            	    {
            	    match(input,76,FOLLOW_76_in_model1476); if (state.failed) return n;

            	    // Generator.g:406:11: (cons= invariant |ppc= prePost )*
            	    loop20:
            	    do {
            	        int alt20=3;
            	        alt20 = dfa20.predict(input);
            	        switch (alt20) {
            	    	case 1 :
            	    	    // Generator.g:406:15: cons= invariant
            	    	    {
            	    	    pushFollow(FOLLOW_invariant_in_model1494);
            	    	    cons=invariant();

            	    	    state._fsp--;
            	    	    if (state.failed) return n;

            	    	    if ( state.backtracking==0 ) { n.addConstraint(cons); }

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // Generator.g:407:15: ppc= prePost
            	    	    {
            	    	    pushFollow(FOLLOW_prePost_in_model1515);
            	    	    ppc=prePost();

            	    	    state._fsp--;
            	    	    if (state.failed) return n;

            	    	    if ( state.backtracking==0 ) { n.addPrePost(ppc); }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop20;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 4 :
            	    // Generator.g:410:9: e= enumTypeDefinition
            	    {
            	    pushFollow(FOLLOW_enumTypeDefinition_in_model1555);
            	    e=enumTypeDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addEnumTypeDef(e); }

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            // Generator.g:412:5: (m= moduleExpr )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==102) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Generator.g:412:6: m= moduleExpr
            	    {
            	    pushFollow(FOLLOW_moduleExpr_in_model1573);
            	    m=moduleExpr();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) {n.addModule(m);}

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            match(input,EOF,FOLLOW_EOF_in_model1579); if (state.failed) return n;

            }

        }
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
    // Generator.g:418:1: enumTypeDefinition returns [ASTEnumTypeDefinition n] : as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )? ;
    public final ASTEnumTypeDefinition enumTypeDefinition() throws RecognitionException {
        ASTEnumTypeDefinition n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        List idListRes =null;


        try {
            // Generator.g:419:2: (as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )? )
            // Generator.g:420:2: as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_enumTypeDefinition1602);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            match(input,87,FOLLOW_87_in_enumTypeDefinition1608); if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumTypeDefinition1612); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_enumTypeDefinition1614); if (state.failed) return n;

            pushFollow(FOLLOW_idList_in_enumTypeDefinition1618);
            idListRes=idList();

            state._fsp--;
            if (state.failed) return n;

            match(input,RBRACE,FOLLOW_RBRACE_in_enumTypeDefinition1620); if (state.failed) return n;

            // Generator.g:421:54: ( SEMI )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==SEMI) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Generator.g:421:56: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_enumTypeDefinition1624); if (state.failed) return n;

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
    // Generator.g:430:1: generalClassifierDefinition[ASTModel n] : as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] ) ;
    public final void generalClassifierDefinition(ASTModel n) throws RecognitionException {
        Set<ASTAnnotation> as =null;

        ASTClass c =null;

        ASTAssociationClass ac =null;

        ASTSignal s =null;


         
          boolean isAbstract = false;

        try {
            // Generator.g:434:2: (as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] ) )
            // Generator.g:435:2: as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] )
            {
            pushFollow(FOLLOW_annotationSet_in_generalClassifierDefinition1662);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return ;

            // Generator.g:436:5: ( 'abstract' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==63) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Generator.g:436:7: 'abstract'
                    {
                    match(input,63,FOLLOW_63_in_generalClassifierDefinition1670); if (state.failed) return ;

                    if ( state.backtracking==0 ) { isAbstract = true; }

                    }
                    break;

            }


            // Generator.g:437:5: (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] )
            int alt25=3;
            switch ( input.LA(1) ) {
            case AT:
                {
                alt25=1;
                }
                break;
            case IDENT:
                {
                int LA25_2 = input.LA(2);

                if ( ((input.LT(1).getText().equals("class"))) ) {
                    alt25=1;
                }
                else if ( ((input.LT(1).getText().equals("signal"))) ) {
                    alt25=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    throw nvae;

                }
                }
                break;
            case 68:
            case 69:
                {
                alt25=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // Generator.g:438:9: c= classDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_classDefinition_in_generalClassifierDefinition1698);
                    c=classDefinition(isAbstract);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { n.addClass(c); c.setAnnotations(as); }

                    }
                    break;
                case 2 :
                    // Generator.g:441:9: ac= associationClassDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_associationClassDefinition_in_generalClassifierDefinition1736);
                    ac=associationClassDefinition(isAbstract);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { n.addAssociationClass(ac); ac.setAnnotations(as); }

                    }
                    break;
                case 3 :
                    // Generator.g:444:9: s= signalDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_signalDefinition_in_generalClassifierDefinition1781);
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
    // Generator.g:465:1: classDefinition[boolean isAbstract] returns [ASTClass n] : (tag= block_annotation |tag= line_annotation[tag] )? keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end' ;
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
            // Generator.g:467:2: ( (tag= block_annotation |tag= line_annotation[tag] )? keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end' )
            // Generator.g:468:2: (tag= block_annotation |tag= line_annotation[tag] )? keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end'
            {
            // Generator.g:468:2: (tag= block_annotation |tag= line_annotation[tag] )?
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==AT) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==IDENT) ) {
                    alt26=1;
                }
                else if ( (LA26_1==50||LA26_1==56||LA26_1==61) ) {
                    alt26=2;
                }
            }
            switch (alt26) {
                case 1 :
                    // Generator.g:468:3: tag= block_annotation
                    {
                    pushFollow(FOLLOW_block_annotation_in_classDefinition1835);
                    tag=block_annotation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 2 :
                    // Generator.g:468:26: tag= line_annotation[tag]
                    {
                    pushFollow(FOLLOW_line_annotation_in_classDefinition1841);
                    tag=line_annotation(tag);

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_keyClass_in_classDefinition1851);
            keyClass();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_classDefinition1855); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTClass(name, isAbstract); n.setAnnotationTag(tag);}

            // Generator.g:470:5: ( LESS idListRes= idList )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==LESS) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // Generator.g:470:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_classDefinition1865); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_classDefinition1869);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addSuperClasses(idListRes); }

                    }
                    break;

            }


            // Generator.g:471:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==70) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // Generator.g:471:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,70,FOLLOW_70_in_classDefinition1882); if (state.failed) return n;

                    // Generator.g:472:7: (a= attributeDefinition )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==AT||LA28_0==IDENT||LA28_0==63||(LA28_0 >= 68 && LA28_0 <= 69)||LA28_0==87||LA28_0==98||LA28_0==101||(LA28_0 >= 117 && LA28_0 <= 118)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // Generator.g:472:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_classDefinition1895);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addAttribute(a); }

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:474:5: ( 'operations' (op= operationDefinition )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==114) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // Generator.g:474:7: 'operations' (op= operationDefinition )*
                    {
                    match(input,114,FOLLOW_114_in_classDefinition1916); if (state.failed) return n;

                    // Generator.g:475:7: (op= operationDefinition )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==AT||LA30_0==IDENT||LA30_0==63||(LA30_0 >= 68 && LA30_0 <= 69)||LA30_0==87||LA30_0==98||LA30_0==101||(LA30_0 >= 117 && LA30_0 <= 118)) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // Generator.g:475:9: op= operationDefinition
                    	    {
                    	    pushFollow(FOLLOW_operationDefinition_in_classDefinition1929);
                    	    op=operationDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addOperation(op); }

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:477:5: ( 'constraints' (inv= invariantClause )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==76) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // Generator.g:477:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,76,FOLLOW_76_in_classDefinition1950); if (state.failed) return n;

                    // Generator.g:478:7: (inv= invariantClause )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==AT||LA32_0==IDENT||LA32_0==63||(LA32_0 >= 68 && LA32_0 <= 69)||(LA32_0 >= 87 && LA32_0 <= 88)||LA32_0==98||LA32_0==101||(LA32_0 >= 117 && LA32_0 <= 118)) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // Generator.g:479:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_classDefinition1970);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:482:5: ( 'statemachines' (sm= stateMachine )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==125) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // Generator.g:482:7: 'statemachines' (sm= stateMachine )*
                    {
                    match(input,125,FOLLOW_125_in_classDefinition1996); if (state.failed) return n;

                    // Generator.g:483:7: (sm= stateMachine )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==120) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // Generator.g:484:9: sm= stateMachine
                    	    {
                    	    pushFollow(FOLLOW_stateMachine_in_classDefinition2016);
                    	    sm=stateMachine();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addStateMachine(sm); }

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,85,FOLLOW_85_in_classDefinition2040); if (state.failed) return n;

            }

        }
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
    // Generator.g:505:1: associationClassDefinition[boolean isAbstract] returns [ASTAssociationClass n] : classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end' ;
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
            // Generator.g:507:5: (classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end' )
            // Generator.g:508:5: classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end'
            {
            classKW=(Token)input.LT(1);

            if ( (input.LA(1) >= 68 && input.LA(1) <= 69) ) {
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

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationClassDefinition2099); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociationClass(name, isAbstract); }

            // Generator.g:517:5: ( LESS idListRes= idList )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LESS) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // Generator.g:517:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_associationClassDefinition2109); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_associationClassDefinition2113);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addSuperClasses(idListRes); }

                    }
                    break;

            }


            // Generator.g:518:5: ( 'between' ae= associationEnd (ae= associationEnd )+ )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==73) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // Generator.g:518:6: 'between' ae= associationEnd (ae= associationEnd )+
                    {
                    match(input,73,FOLLOW_73_in_associationClassDefinition2125); if (state.failed) return n;

                    pushFollow(FOLLOW_associationEnd_in_associationClassDefinition2133);
                    ae=associationEnd();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addEnd(ae); }

                    // Generator.g:520:5: (ae= associationEnd )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==IDENT) ) {
                            int LA37_2 = input.LA(2);

                            if ( (LA37_2==LBRACK) ) {
                                alt37=1;
                            }


                        }
                        else if ( (LA37_0==AT) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // Generator.g:520:7: ae= associationEnd
                    	    {
                    	    pushFollow(FOLLOW_associationEnd_in_associationClassDefinition2145);
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


                    }
                    break;

            }


            // Generator.g:522:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==70) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // Generator.g:522:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,70,FOLLOW_70_in_associationClassDefinition2165); if (state.failed) return n;

                    // Generator.g:523:7: (a= attributeDefinition )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==IDENT) ) {
                            int LA39_2 = input.LA(2);

                            if ( (LA39_2==COLON) ) {
                                alt39=1;
                            }


                        }
                        else if ( (LA39_0==AT) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // Generator.g:523:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_associationClassDefinition2178);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addAttribute(a); }

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:525:5: ( 'operations' (op= operationDefinition )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==114) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // Generator.g:525:7: 'operations' (op= operationDefinition )*
                    {
                    match(input,114,FOLLOW_114_in_associationClassDefinition2199); if (state.failed) return n;

                    // Generator.g:526:7: (op= operationDefinition )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==IDENT) ) {
                            int LA41_2 = input.LA(2);

                            if ( (LA41_2==LPAREN) ) {
                                alt41=1;
                            }


                        }
                        else if ( (LA41_0==AT) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // Generator.g:526:9: op= operationDefinition
                    	    {
                    	    pushFollow(FOLLOW_operationDefinition_in_associationClassDefinition2212);
                    	    op=operationDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addOperation(op); }

                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:528:5: ( 'constraints' (inv= invariantClause )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==76) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // Generator.g:528:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,76,FOLLOW_76_in_associationClassDefinition2233); if (state.failed) return n;

                    // Generator.g:529:7: (inv= invariantClause )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==AT||LA43_0==88||LA43_0==98) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // Generator.g:530:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_associationClassDefinition2253);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:533:5: ( 'statemachines' (sm= stateMachine )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==125) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // Generator.g:533:7: 'statemachines' (sm= stateMachine )*
                    {
                    match(input,125,FOLLOW_125_in_associationClassDefinition2279); if (state.failed) return n;

                    // Generator.g:534:7: (sm= stateMachine )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==120) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // Generator.g:535:9: sm= stateMachine
                    	    {
                    	    pushFollow(FOLLOW_stateMachine_in_associationClassDefinition2299);
                    	    sm=stateMachine();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addStateMachine(sm); }

                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:539:5: ( ( keyAggregation | keyComposition ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==IDENT) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // Generator.g:539:7: ( keyAggregation | keyComposition )
                    {
                    if ( state.backtracking==0 ) { t = input.LT(1); }

                    // Generator.g:540:7: ( keyAggregation | keyComposition )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==IDENT) ) {
                        int LA47_1 = input.LA(2);

                        if ( ((input.LT(1).getText().equals("aggregation"))) ) {
                            alt47=1;
                        }
                        else if ( ((input.LT(1).getText().equals("composition"))) ) {
                            alt47=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return n;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 47, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;

                    }
                    switch (alt47) {
                        case 1 :
                            // Generator.g:540:9: keyAggregation
                            {
                            pushFollow(FOLLOW_keyAggregation_in_associationClassDefinition2340);
                            keyAggregation();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;
                        case 2 :
                            // Generator.g:540:26: keyComposition
                            {
                            pushFollow(FOLLOW_keyComposition_in_associationClassDefinition2344);
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


            match(input,85,FOLLOW_85_in_associationClassDefinition2367); if (state.failed) return n;

            }

        }
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
    // Generator.g:550:1: attributeDefinition returns [ASTAttribute n] : as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )? ;
    public final ASTAttribute attributeDefinition() throws RecognitionException {
        ASTAttribute n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        ASTType t =null;

        GeneratorParser.expression_return deriveExpression =null;

        GeneratorParser.expression_return initExpression =null;


        try {
            // Generator.g:551:2: (as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )? )
            // Generator.g:552:2: as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_attributeDefinition2395);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_attributeDefinition2403); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_attributeDefinition2405); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_attributeDefinition2409);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            // Generator.g:555:5: ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )?
            int alt50=3;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==IDENT) ) {
                int LA50_1 = input.LA(2);

                if ( (((input.LT(1).getText().equals("derived"))||(input.LT(1).getText().equals("derive")))) ) {
                    alt50=1;
                }
                else if ( ((input.LT(1).getText().equals("init"))) ) {
                    alt50=2;
                }
            }
            switch (alt50) {
                case 1 :
                    // Generator.g:556:9: ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression )
                    {
                    // Generator.g:556:9: ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression )
                    // Generator.g:556:10: ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression
                    {
                    // Generator.g:556:10: ( keyDerive | keyDerived )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==IDENT) ) {
                        int LA49_1 = input.LA(2);

                        if ( ((input.LT(1).getText().equals("derive"))) ) {
                            alt49=1;
                        }
                        else if ( ((input.LT(1).getText().equals("derived"))) ) {
                            alt49=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return n;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 49, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;

                    }
                    switch (alt49) {
                        case 1 :
                            // Generator.g:556:11: keyDerive
                            {
                            pushFollow(FOLLOW_keyDerive_in_attributeDefinition2433);
                            keyDerive();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;
                        case 2 :
                            // Generator.g:556:21: keyDerived
                            {
                            pushFollow(FOLLOW_keyDerived_in_attributeDefinition2435);
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


                    pushFollow(FOLLOW_expression_in_attributeDefinition2448);
                    deriveExpression=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    }


                    }
                    break;
                case 2 :
                    // Generator.g:558:9: ( keyInit ( COLON | EQUAL ) initExpression= expression )
                    {
                    // Generator.g:558:9: ( keyInit ( COLON | EQUAL ) initExpression= expression )
                    // Generator.g:558:10: keyInit ( COLON | EQUAL ) initExpression= expression
                    {
                    pushFollow(FOLLOW_keyInit_in_attributeDefinition2468);
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


                    pushFollow(FOLLOW_expression_in_attributeDefinition2484);
                    initExpression=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    }


                    }
                    break;

            }


            // Generator.g:560:5: ( SEMI )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==SEMI) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // Generator.g:560:5: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_attributeDefinition2498); if (state.failed) return n;

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
    // Generator.g:574:1: operationDefinition returns [ASTOperation n] : as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )? ;
    public final ASTOperation operationDefinition() throws RecognitionException {
        ASTOperation n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        List<ASTVariableDeclaration> pl =null;

        ASTType t =null;

        GeneratorParser.expression_return e =null;

        GeneratorParser.blockStat_return s =null;

        ASTPrePostClause ppc =null;


        try {
            // Generator.g:575:2: (as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )? )
            // Generator.g:576:2: as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_operationDefinition2529);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationDefinition2539); if (state.failed) return n;

            pushFollow(FOLLOW_paramList_in_operationDefinition2549);
            pl=paramList();

            state._fsp--;
            if (state.failed) return n;

            // Generator.g:582:5: ( COLON t= type )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==COLON) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // Generator.g:582:7: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_operationDefinition2563); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_operationDefinition2569);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n = new ASTOperation(name, pl, t); n.setAnnotations(as); }

            // Generator.g:584:5: ( ( EQUAL e= expression ) | (s= blockStat ) )?
            int alt53=3;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==EQUAL) ) {
                alt53=1;
            }
            else if ( (LA53_0==72) ) {
                alt53=2;
            }
            switch (alt53) {
                case 1 :
                    // Generator.g:585:9: ( EQUAL e= expression )
                    {
                    // Generator.g:585:9: ( EQUAL e= expression )
                    // Generator.g:585:11: EQUAL e= expression
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_operationDefinition2597); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_operationDefinition2603);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setExpression((e!=null?e.n:null)); }

                    }


                    }
                    break;
                case 2 :
                    // Generator.g:586:9: (s= blockStat )
                    {
                    // Generator.g:586:9: (s= blockStat )
                    // Generator.g:586:11: s= blockStat
                    {
                    pushFollow(FOLLOW_blockStat_in_operationDefinition2625);
                    s=blockStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setStatement((s!=null?s.n:null));  }

                    }


                    }
                    break;

            }


            // Generator.g:588:5: (ppc= prePostClause )*
            loop54:
            do {
                int alt54=2;
                alt54 = dfa54.predict(input);
                switch (alt54) {
            	case 1 :
            	    // Generator.g:588:7: ppc= prePostClause
            	    {
            	    pushFollow(FOLLOW_prePostClause_in_operationDefinition2647);
            	    ppc=prePostClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addPrePostClause(ppc); }

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            // Generator.g:589:5: ( SEMI )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==SEMI) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // Generator.g:589:7: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_operationDefinition2660); if (state.failed) return n;

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
    // Generator.g:599:1: associationDefinition returns [ASTAssociation n] : as= annotationSet (tag= line_annotation[tag] )? ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' ;
    public final ASTAssociation associationDefinition() throws RecognitionException {
        ASTAssociation n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        AnnotationTag tag =null;

        ASTAssociationEnd ae =null;


         Token t = null; tag=null;
        try {
            // Generator.g:601:2: (as= annotationSet (tag= line_annotation[tag] )? ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' )
            // Generator.g:602:2: as= annotationSet (tag= line_annotation[tag] )? ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end'
            {
            pushFollow(FOLLOW_annotationSet_in_associationDefinition2691);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            // Generator.g:603:2: (tag= line_annotation[tag] )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==AT) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // Generator.g:603:3: tag= line_annotation[tag]
                    {
                    pushFollow(FOLLOW_line_annotation_in_associationDefinition2697);
                    tag=line_annotation(tag);

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { t = input.LT(1); }

            // Generator.g:605:5: ( keyAssociation | keyAggregation | keyComposition )
            int alt57=3;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==IDENT) ) {
                int LA57_1 = input.LA(2);

                if ( ((input.LT(1).getText().equals("association"))) ) {
                    alt57=1;
                }
                else if ( ((input.LT(1).getText().equals("aggregation"))) ) {
                    alt57=2;
                }
                else if ( ((input.LT(1).getText().equals("composition"))) ) {
                    alt57=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }
            switch (alt57) {
                case 1 :
                    // Generator.g:605:7: keyAssociation
                    {
                    pushFollow(FOLLOW_keyAssociation_in_associationDefinition2714);
                    keyAssociation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 2 :
                    // Generator.g:605:24: keyAggregation
                    {
                    pushFollow(FOLLOW_keyAggregation_in_associationDefinition2718);
                    keyAggregation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 3 :
                    // Generator.g:605:41: keyComposition
                    {
                    pushFollow(FOLLOW_keyComposition_in_associationDefinition2722);
                    keyComposition();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationDefinition2732); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociation(t, name); n.setAnnotations(as);n.setAnnotationTag(tag);}

            match(input,73,FOLLOW_73_in_associationDefinition2740); if (state.failed) return n;

            pushFollow(FOLLOW_associationEnd_in_associationDefinition2748);
            ae=associationEnd();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addEnd(ae); }

            // Generator.g:609:5: (ae= associationEnd )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==AT||LA58_0==IDENT||LA58_0==63||(LA58_0 >= 68 && LA58_0 <= 69)||LA58_0==87||LA58_0==98||LA58_0==101||(LA58_0 >= 117 && LA58_0 <= 118)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // Generator.g:609:7: ae= associationEnd
            	    {
            	    pushFollow(FOLLOW_associationEnd_in_associationDefinition2760);
            	    ae=associationEnd();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addEnd(ae); }

            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);


            match(input,85,FOLLOW_85_in_associationDefinition2771); if (state.failed) return n;

            }

        }
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
    // Generator.g:618:1: associationEnd returns [ASTAssociationEnd n] : as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? ;
    public final ASTAssociationEnd associationEnd() throws RecognitionException {
        ASTAssociationEnd n = null;


        Token name=null;
        Token rn=null;
        Token sr=null;
        Token rd=null;
        Set<ASTAnnotation> as =null;

        ASTMultiplicity m =null;

        ASTElemVarsDeclaration parameter =null;

        GeneratorParser.expression_return exp =null;

        List<ASTVariableDeclaration> qualifiers =null;


        try {
            // Generator.g:619:2: (as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? )
            // Generator.g:620:2: as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_associationEnd2796);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd2804); if (state.failed) return n;

            match(input,LBRACK,FOLLOW_LBRACK_in_associationEnd2806); if (state.failed) return n;

            pushFollow(FOLLOW_multiplicity_in_associationEnd2810);
            m=multiplicity();

            state._fsp--;
            if (state.failed) return n;

            match(input,RBRACK,FOLLOW_RBRACK_in_associationEnd2812); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociationEnd(name, m); n.setAnnotations(as); }

            // Generator.g:622:5: ( keyRole rn= IDENT )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==IDENT) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==IDENT) ) {
                    int LA59_3 = input.LA(3);

                    if ( ((input.LT(1).getText().equals("role"))) ) {
                        alt59=1;
                    }
                }
            }
            switch (alt59) {
                case 1 :
                    // Generator.g:622:7: keyRole rn= IDENT
                    {
                    pushFollow(FOLLOW_keyRole_in_associationEnd2823);
                    keyRole();

                    state._fsp--;
                    if (state.failed) return n;

                    rn=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd2827); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setRolename(rn); }

                    }
                    break;

            }


            // Generator.g:623:5: ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )*
            loop62:
            do {
                int alt62=7;
                switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA62_3 = input.LA(2);

                    if ( ((input.LT(1).getText().equals("union"))) ) {
                        alt62=3;
                    }
                    else if ( (((input.LT(1).getText().equals("derived"))||(input.LT(1).getText().equals("derive")))) ) {
                        alt62=5;
                    }
                    else if ( ((input.LT(1).getText().equals("qualifier"))) ) {
                        alt62=6;
                    }


                    }
                    break;
                case 116:
                    {
                    alt62=1;
                    }
                    break;
                case 127:
                    {
                    alt62=2;
                    }
                    break;
                case 121:
                    {
                    alt62=4;
                    }
                    break;

                }

                switch (alt62) {
            	case 1 :
            	    // Generator.g:624:9: 'ordered'
            	    {
            	    match(input,116,FOLLOW_116_in_associationEnd2848); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setOrdered(); }

            	    }
            	    break;
            	case 2 :
            	    // Generator.g:625:9: 'subsets' sr= IDENT
            	    {
            	    match(input,127,FOLLOW_127_in_associationEnd2860); if (state.failed) return n;

            	    sr=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd2864); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addSubsetsRolename(sr); }

            	    }
            	    break;
            	case 3 :
            	    // Generator.g:626:9: keyUnion
            	    {
            	    pushFollow(FOLLOW_keyUnion_in_associationEnd2876);
            	    keyUnion();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setUnion(true); }

            	    }
            	    break;
            	case 4 :
            	    // Generator.g:627:9: 'redefines' rd= IDENT
            	    {
            	    match(input,121,FOLLOW_121_in_associationEnd2888); if (state.failed) return n;

            	    rd=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd2892); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addRedefinesRolename(rd); }

            	    }
            	    break;
            	case 5 :
            	    // Generator.g:628:9: ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression
            	    {
            	    // Generator.g:628:9: ( keyDerived | keyDerive )
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==IDENT) ) {
            	        int LA60_1 = input.LA(2);

            	        if ( ((input.LT(1).getText().equals("derived"))) ) {
            	            alt60=1;
            	        }
            	        else if ( ((input.LT(1).getText().equals("derive"))) ) {
            	            alt60=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return n;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 60, 1, input);

            	            throw nvae;

            	        }
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 60, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // Generator.g:628:10: keyDerived
            	            {
            	            pushFollow(FOLLOW_keyDerived_in_associationEnd2905);
            	            keyDerived();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;
            	        case 2 :
            	            // Generator.g:628:21: keyDerive
            	            {
            	            pushFollow(FOLLOW_keyDerive_in_associationEnd2907);
            	            keyDerive();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    // Generator.g:628:32: ( LPAREN parameter= elemVarsDeclaration RPAREN )?
            	    int alt61=2;
            	    int LA61_0 = input.LA(1);

            	    if ( (LA61_0==LPAREN) ) {
            	        alt61=1;
            	    }
            	    switch (alt61) {
            	        case 1 :
            	            // Generator.g:628:34: LPAREN parameter= elemVarsDeclaration RPAREN
            	            {
            	            match(input,LPAREN,FOLLOW_LPAREN_in_associationEnd2912); if (state.failed) return n;

            	            pushFollow(FOLLOW_elemVarsDeclaration_in_associationEnd2918);
            	            parameter=elemVarsDeclaration();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            match(input,RPAREN,FOLLOW_RPAREN_in_associationEnd2920); if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_associationEnd2924); if (state.failed) return n;

            	    pushFollow(FOLLOW_expression_in_associationEnd2928);
            	    exp=expression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setDerived((exp!=null?exp.n:null), parameter); }

            	    }
            	    break;
            	case 6 :
            	    // Generator.g:629:9: keyQualifier qualifiers= paramList
            	    {
            	    pushFollow(FOLLOW_keyQualifier_in_associationEnd2940);
            	    keyQualifier();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    pushFollow(FOLLOW_paramList_in_associationEnd2946);
            	    qualifiers=paramList();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) {n.setQualifiers(qualifiers); }

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            // Generator.g:631:5: ( SEMI )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==SEMI) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // Generator.g:631:7: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_associationEnd2963); if (state.failed) return n;

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
    // Generator.g:645:1: multiplicity returns [ASTMultiplicity n] :mr= multiplicityRange ( COMMA mr= multiplicityRange )* ;
    public final ASTMultiplicity multiplicity() throws RecognitionException {
        ASTMultiplicity n = null;


        ASTMultiplicityRange mr =null;


        try {
            // Generator.g:646:5: (mr= multiplicityRange ( COMMA mr= multiplicityRange )* )
            // Generator.g:647:5: mr= multiplicityRange ( COMMA mr= multiplicityRange )*
            {
            if ( state.backtracking==0 ) { 
            	Token t = input.LT(1); // remember start position of expression
            	n = new ASTMultiplicity(t);
                }

            pushFollow(FOLLOW_multiplicityRange_in_multiplicity2998);
            mr=multiplicityRange();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addRange(mr); }

            // Generator.g:652:5: ( COMMA mr= multiplicityRange )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==COMMA) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // Generator.g:652:7: COMMA mr= multiplicityRange
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multiplicity3008); if (state.failed) return n;

            	    pushFollow(FOLLOW_multiplicityRange_in_multiplicity3012);
            	    mr=multiplicityRange();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addRange(mr); }

            	    }
            	    break;

            	default :
            	    break loop64;
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
    // Generator.g:655:1: multiplicityRange returns [ASTMultiplicityRange n] : ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? ;
    public final ASTMultiplicityRange multiplicityRange() throws RecognitionException {
        ASTMultiplicityRange n = null;


        int ms1 =0;

        int ms2 =0;


        try {
            // Generator.g:656:5: (ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? )
            // Generator.g:657:5: ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )?
            {
            pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange3041);
            ms1=multiplicitySpec();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTMultiplicityRange(ms1); }

            // Generator.g:658:5: ( DOTDOT ms2= multiplicitySpec )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==DOTDOT) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // Generator.g:658:7: DOTDOT ms2= multiplicitySpec
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_multiplicityRange3051); if (state.failed) return n;

                    pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange3055);
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
    // Generator.g:661:1: multiplicitySpec returns [int m] : (i= INT | STAR );
    public final int multiplicitySpec() throws RecognitionException {
        int m = 0;


        Token i=null;

         m = -1; 
        try {
            // Generator.g:663:7: (i= INT | STAR )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==INT) ) {
                alt66=1;
            }
            else if ( (LA66_0==STAR) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return m;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;

            }
            switch (alt66) {
                case 1 :
                    // Generator.g:664:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_multiplicitySpec3089); if (state.failed) return m;

                    if ( state.backtracking==0 ) { m = Integer.parseInt((i!=null?i.getText():null)); }

                    }
                    break;
                case 2 :
                    // Generator.g:665:7: STAR
                    {
                    match(input,STAR,FOLLOW_STAR_in_multiplicitySpec3099); if (state.failed) return m;

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
    // Generator.g:668:1: annotationSpec returns [AnnotationTag tag] : (rtag= block_annotation |rtag= line_annotation[tag] );
    public final AnnotationTag annotationSpec() throws RecognitionException {
        AnnotationTag tag = null;


        AnnotationTag rtag =null;


        tag = new AnnotationTag();
        try {
            // Generator.g:670:2: (rtag= block_annotation |rtag= line_annotation[tag] )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==AT) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==IDENT) ) {
                    alt67=1;
                }
                else if ( (LA67_1==50||LA67_1==56||LA67_1==61) ) {
                    alt67=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return tag;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return tag;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;

            }
            switch (alt67) {
                case 1 :
                    // Generator.g:671:2: rtag= block_annotation
                    {
                    pushFollow(FOLLOW_block_annotation_in_annotationSpec3127);
                    rtag=block_annotation();

                    state._fsp--;
                    if (state.failed) return tag;

                    if ( state.backtracking==0 ) {tag =rtag;}

                    }
                    break;
                case 2 :
                    // Generator.g:672:4: rtag= line_annotation[tag]
                    {
                    pushFollow(FOLLOW_line_annotation_in_annotationSpec3136);
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
    // Generator.g:675:1: block_annotation returns [AnnotationTag tag] : AT IDENT LBRACE ( annotation_tag[tag] )* RBRACE ;
    public final AnnotationTag block_annotation() throws RecognitionException {
        AnnotationTag tag = null;


        Token IDENT1=null;

        tag = new AnnotationTag();
        try {
            // Generator.g:677:2: ( AT IDENT LBRACE ( annotation_tag[tag] )* RBRACE )
            // Generator.g:678:2: AT IDENT LBRACE ( annotation_tag[tag] )* RBRACE
            {
            match(input,AT,FOLLOW_AT_in_block_annotation3158); if (state.failed) return tag;

            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_block_annotation3160); if (state.failed) return tag;

            match(input,LBRACE,FOLLOW_LBRACE_in_block_annotation3162); if (state.failed) return tag;

            // Generator.g:679:3: ( annotation_tag[tag] )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==50||LA68_0==56||LA68_0==61) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // Generator.g:679:4: annotation_tag[tag]
            	    {
            	    pushFollow(FOLLOW_annotation_tag_in_block_annotation3167);
            	    annotation_tag(tag);

            	    state._fsp--;
            	    if (state.failed) return tag;

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            if ( state.backtracking==0 ) {tag.setName(IDENT1.getText());}

            match(input,RBRACE,FOLLOW_RBRACE_in_block_annotation3175); if (state.failed) return tag;

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
    // Generator.g:683:1: line_annotation[AnnotationTag tag] returns [AnnotationTag rtag] : AT ( annotation_tag[tag] ) ;
    public final AnnotationTag line_annotation(AnnotationTag tag) throws RecognitionException {
        AnnotationTag rtag = null;


        if (tag==null) tag = new AnnotationTag();
        try {
            // Generator.g:684:50: ( AT ( annotation_tag[tag] ) )
            // Generator.g:685:2: AT ( annotation_tag[tag] )
            {
            match(input,AT,FOLLOW_AT_in_line_annotation3194); if (state.failed) return rtag;

            // Generator.g:685:5: ( annotation_tag[tag] )
            // Generator.g:685:6: annotation_tag[tag]
            {
            pushFollow(FOLLOW_annotation_tag_in_line_annotation3197);
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
    // Generator.g:688:1: annotation_tag[AnnotationTag tag] : ( annotation_comment EQUAL ( NON_OCL_STRING ) | annotation_weight EQUAL ( annotation_def | INT ) | annotation_type EQUAL ( annotation_enum_type | annotation_ref ) );
    public final void annotation_tag(AnnotationTag tag) throws RecognitionException {
        Token NON_OCL_STRING2=null;
        Token INT3=null;

        try {
            // Generator.g:689:2: ( annotation_comment EQUAL ( NON_OCL_STRING ) | annotation_weight EQUAL ( annotation_def | INT ) | annotation_type EQUAL ( annotation_enum_type | annotation_ref ) )
            int alt71=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt71=1;
                }
                break;
            case 56:
                {
                alt71=2;
                }
                break;
            case 61:
                {
                alt71=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;

            }

            switch (alt71) {
                case 1 :
                    // Generator.g:690:2: annotation_comment EQUAL ( NON_OCL_STRING )
                    {
                    pushFollow(FOLLOW_annotation_comment_in_annotation_tag3213);
                    annotation_comment();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,EQUAL,FOLLOW_EQUAL_in_annotation_tag3215); if (state.failed) return ;

                    // Generator.g:690:27: ( NON_OCL_STRING )
                    // Generator.g:690:28: NON_OCL_STRING
                    {
                    NON_OCL_STRING2=(Token)match(input,NON_OCL_STRING,FOLLOW_NON_OCL_STRING_in_annotation_tag3218); if (state.failed) return ;

                    if ( state.backtracking==0 ) {tag.setComments(NON_OCL_STRING2.getText());}

                    }


                    }
                    break;
                case 2 :
                    // Generator.g:691:4: annotation_weight EQUAL ( annotation_def | INT )
                    {
                    pushFollow(FOLLOW_annotation_weight_in_annotation_tag3226);
                    annotation_weight();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,EQUAL,FOLLOW_EQUAL_in_annotation_tag3228); if (state.failed) return ;

                    // Generator.g:691:28: ( annotation_def | INT )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==71) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==INT) ) {
                        alt69=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;

                    }
                    switch (alt69) {
                        case 1 :
                            // Generator.g:691:29: annotation_def
                            {
                            pushFollow(FOLLOW_annotation_def_in_annotation_tag3231);
                            annotation_def();

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {tag.setWeight(new IntWeight(-1));}

                            }
                            break;
                        case 2 :
                            // Generator.g:691:83: INT
                            {
                            INT3=(Token)match(input,INT,FOLLOW_INT_in_annotation_tag3237); if (state.failed) return ;

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
                    // Generator.g:695:4: annotation_type EQUAL ( annotation_enum_type | annotation_ref )
                    {
                    pushFollow(FOLLOW_annotation_type_in_annotation_tag3245);
                    annotation_type();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,EQUAL,FOLLOW_EQUAL_in_annotation_tag3247); if (state.failed) return ;

                    // Generator.g:695:26: ( annotation_enum_type | annotation_ref )
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==51||LA70_0==59) ) {
                        alt70=1;
                    }
                    else if ( (LA70_0==AT) ) {
                        alt70=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 0, input);

                        throw nvae;

                    }
                    switch (alt70) {
                        case 1 :
                            // Generator.g:695:27: annotation_enum_type
                            {
                            pushFollow(FOLLOW_annotation_enum_type_in_annotation_tag3250);
                            annotation_enum_type();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // Generator.g:695:50: annotation_ref
                            {
                            pushFollow(FOLLOW_annotation_ref_in_annotation_tag3254);
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
    // Generator.g:698:1: annotation_predefined : ( 'Comment' | 'Rank' | 'Type' );
    public final void annotation_predefined() throws RecognitionException {
        try {
            // Generator.g:698:22: ( 'Comment' | 'Rank' | 'Type' )
            // Generator.g:
            {
            if ( input.LA(1)==50||input.LA(1)==56||input.LA(1)==61 ) {
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
    // Generator.g:704:1: annotation_comment : 'Comment' ;
    public final void annotation_comment() throws RecognitionException {
        try {
            // Generator.g:704:19: ( 'Comment' )
            // Generator.g:704:21: 'Comment'
            {
            match(input,50,FOLLOW_50_in_annotation_comment3282); if (state.failed) return ;

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
    // Generator.g:705:1: annotation_weight : 'Rank' ;
    public final void annotation_weight() throws RecognitionException {
        try {
            // Generator.g:705:18: ( 'Rank' )
            // Generator.g:705:20: 'Rank'
            {
            match(input,56,FOLLOW_56_in_annotation_weight3289); if (state.failed) return ;

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
    // Generator.g:706:1: annotation_type : 'Type' ;
    public final void annotation_type() throws RecognitionException {
        try {
            // Generator.g:706:16: ( 'Type' )
            // Generator.g:706:18: 'Type'
            {
            match(input,61,FOLLOW_61_in_annotation_type3296); if (state.failed) return ;

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
    // Generator.g:708:1: annotation_override : 'Override' LPAREN LBRACE annotation_term RBRACE RPAREN ;
    public final void annotation_override() throws RecognitionException {
        try {
            // Generator.g:708:20: ( 'Override' LPAREN LBRACE annotation_term RBRACE RPAREN )
            // Generator.g:709:1: 'Override' LPAREN LBRACE annotation_term RBRACE RPAREN
            {
            match(input,55,FOLLOW_55_in_annotation_override3305); if (state.failed) return ;

            match(input,LPAREN,FOLLOW_LPAREN_in_annotation_override3307); if (state.failed) return ;

            match(input,LBRACE,FOLLOW_LBRACE_in_annotation_override3309); if (state.failed) return ;

            pushFollow(FOLLOW_annotation_term_in_annotation_override3311);
            annotation_term();

            state._fsp--;
            if (state.failed) return ;

            match(input,RBRACE,FOLLOW_RBRACE_in_annotation_override3313); if (state.failed) return ;

            match(input,RPAREN,FOLLOW_RPAREN_in_annotation_override3315); if (state.failed) return ;

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
    // Generator.g:712:1: annotation_term returns [AnnotationTag tag] : annotation_tag[tag] ( COMMA annotation_tag[tag] )* ;
    public final AnnotationTag annotation_term() throws RecognitionException {
        AnnotationTag tag = null;


        tag = new AnnotationTag();
        try {
            // Generator.g:713:35: ( annotation_tag[tag] ( COMMA annotation_tag[tag] )* )
            // Generator.g:714:2: annotation_tag[tag] ( COMMA annotation_tag[tag] )*
            {
            pushFollow(FOLLOW_annotation_tag_in_annotation_term3332);
            annotation_tag(tag);

            state._fsp--;
            if (state.failed) return tag;

            // Generator.g:714:22: ( COMMA annotation_tag[tag] )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==COMMA) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // Generator.g:714:23: COMMA annotation_tag[tag]
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_annotation_term3336); if (state.failed) return tag;

            	    pushFollow(FOLLOW_annotation_tag_in_annotation_term3338);
            	    annotation_tag(tag);

            	    state._fsp--;
            	    if (state.failed) return tag;

            	    }
            	    break;

            	default :
            	    break loop72;
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
    // Generator.g:717:1: annotation_ref : AT IDENT DOT annotation_predefined ;
    public final void annotation_ref() throws RecognitionException {
        try {
            // Generator.g:717:15: ( AT IDENT DOT annotation_predefined )
            // Generator.g:718:2: AT IDENT DOT annotation_predefined
            {
            match(input,AT,FOLLOW_AT_in_annotation_ref3350); if (state.failed) return ;

            match(input,IDENT,FOLLOW_IDENT_in_annotation_ref3352); if (state.failed) return ;

            match(input,DOT,FOLLOW_DOT_in_annotation_ref3354); if (state.failed) return ;

            pushFollow(FOLLOW_annotation_predefined_in_annotation_ref3356);
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
    // Generator.g:721:1: annotation_def : 'automatic' ;
    public final void annotation_def() throws RecognitionException {
        try {
            // Generator.g:721:15: ( 'automatic' )
            // Generator.g:722:2: 'automatic'
            {
            match(input,71,FOLLOW_71_in_annotation_def3365); if (state.failed) return ;

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
    // Generator.g:724:1: annotation_enum_type : ( 'Soft' | 'Hard' );
    public final void annotation_enum_type() throws RecognitionException {
        try {
            // Generator.g:724:21: ( 'Soft' | 'Hard' )
            // Generator.g:
            {
            if ( input.LA(1)==51||input.LA(1)==59 ) {
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
    // Generator.g:746:1: invariant returns [ASTConstraintDefinition n] : (tag= block_annotation )? 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* ;
    public final ASTConstraintDefinition invariant() throws RecognitionException {
        ASTConstraintDefinition n = null;


        Token v=null;
        AnnotationTag tag =null;

        ASTSimpleType t =null;

        ASTInvariantClause inv =null;


        try {
            // Generator.g:747:5: ( (tag= block_annotation )? 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* )
            // Generator.g:748:5: (tag= block_annotation )? 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )*
            {
            if ( state.backtracking==0 ) { n = new ASTConstraintDefinition();}

            // Generator.g:749:2: (tag= block_annotation )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==AT) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // Generator.g:749:3: tag= block_annotation
                    {
                    pushFollow(FOLLOW_block_annotation_in_invariant3411);
                    tag=block_annotation();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n.addBlockAnnotationTag(tag);}

                    }
                    break;

            }


            match(input,77,FOLLOW_77_in_invariant3422); if (state.failed) return n;

            // Generator.g:751:5: (v= IDENT ( ',' v= IDENT )* COLON )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==IDENT) ) {
                int LA75_1 = input.LA(2);

                if ( (LA75_1==COLON||LA75_1==COMMA) ) {
                    alt75=1;
                }
            }
            switch (alt75) {
                case 1 :
                    // Generator.g:751:7: v= IDENT ( ',' v= IDENT )* COLON
                    {
                    v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant3432); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addVarName(v); }

                    // Generator.g:752:8: ( ',' v= IDENT )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==COMMA) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // Generator.g:752:9: ',' v= IDENT
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_invariant3444); if (state.failed) return n;

                    	    v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant3448); if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addVarName(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);


                    match(input,COLON,FOLLOW_COLON_in_invariant3456); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_simpleType_in_invariant3468);
            t=simpleType();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setType(t); }

            // Generator.g:754:5: (inv= invariantClause )*
            loop76:
            do {
                int alt76=2;
                alt76 = dfa76.predict(input);
                switch (alt76) {
            	case 1 :
            	    // Generator.g:754:7: inv= invariantClause
            	    {
            	    pushFollow(FOLLOW_invariantClause_in_invariant3480);
            	    inv=invariantClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

            	    }
            	    break;

            	default :
            	    break loop76;
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
    // Generator.g:761:1: invariantClause returns [ASTInvariantClause n] : ( (tag= line_annotation[tag] )* as= annotationSet 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression );
    public final ASTInvariantClause invariantClause() throws RecognitionException {
        ASTInvariantClause n = null;


        Token name=null;
        AnnotationTag tag =null;

        Set<ASTAnnotation> as =null;

        GeneratorParser.expression_return e =null;


        tag = null;
        try {
            // Generator.g:762:19: ( (tag= line_annotation[tag] )* as= annotationSet 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==AT||LA80_0==IDENT||LA80_0==63||(LA80_0 >= 68 && LA80_0 <= 69)||LA80_0==87||LA80_0==98||LA80_0==101||(LA80_0 >= 117 && LA80_0 <= 118)) ) {
                alt80=1;
            }
            else if ( (LA80_0==88) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;

            }
            switch (alt80) {
                case 1 :
                    // Generator.g:763:2: (tag= line_annotation[tag] )* as= annotationSet 'inv' (name= IDENT )? COLON e= expression
                    {
                    // Generator.g:763:2: (tag= line_annotation[tag] )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==AT) ) {
                            int LA77_1 = input.LA(2);

                            if ( (LA77_1==50||LA77_1==56||LA77_1==61) ) {
                                alt77=1;
                            }


                        }


                        switch (alt77) {
                    	case 1 :
                    	    // Generator.g:763:3: tag= line_annotation[tag]
                    	    {
                    	    pushFollow(FOLLOW_line_annotation_in_invariantClause3512);
                    	    tag=line_annotation(tag);

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);


                    pushFollow(FOLLOW_annotationSet_in_invariantClause3522);
                    as=annotationSet();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,98,FOLLOW_98_in_invariantClause3529); if (state.failed) return n;

                    // Generator.g:765:12: (name= IDENT )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==IDENT) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // Generator.g:765:14: name= IDENT
                            {
                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause3535); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,COLON,FOLLOW_COLON_in_invariantClause3540); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_invariantClause3544);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTInvariantClause(name, (e!=null?e.n:null)); n.setAnnotations(as);n.setAnnotationTag(tag);}

                    }
                    break;
                case 2 :
                    // Generator.g:767:7: 'existential' 'inv' (name= IDENT )? COLON e= expression
                    {
                    match(input,88,FOLLOW_88_in_invariantClause3561); if (state.failed) return n;

                    match(input,98,FOLLOW_98_in_invariantClause3563); if (state.failed) return n;

                    // Generator.g:767:27: (name= IDENT )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==IDENT) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // Generator.g:767:29: name= IDENT
                            {
                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause3569); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,COLON,FOLLOW_COLON_in_invariantClause3574); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_invariantClause3578);
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
    // Generator.g:779:1: prePost returns [ASTPrePost n] : 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ ;
    public final ASTPrePost prePost() throws RecognitionException {
        ASTPrePost n = null;


        Token classname=null;
        Token opname=null;
        List<ASTVariableDeclaration> pl =null;

        ASTType rt =null;

        ASTPrePostClause ppc =null;


        try {
            // Generator.g:780:5: ( 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ )
            // Generator.g:781:5: 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+
            {
            match(input,77,FOLLOW_77_in_prePost3611); if (state.failed) return n;

            classname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost3615); if (state.failed) return n;

            match(input,COLON_COLON,FOLLOW_COLON_COLON_in_prePost3617); if (state.failed) return n;

            opname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost3621); if (state.failed) return n;

            pushFollow(FOLLOW_paramList_in_prePost3625);
            pl=paramList();

            state._fsp--;
            if (state.failed) return n;

            // Generator.g:781:69: ( COLON rt= type )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==COLON) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // Generator.g:781:71: COLON rt= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_prePost3629); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_prePost3633);
                    rt=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n = new ASTPrePost(classname, opname, pl, rt); }

            // Generator.g:783:5: (ppc= prePostClause )+
            int cnt82=0;
            loop82:
            do {
                int alt82=2;
                alt82 = dfa82.predict(input);
                switch (alt82) {
            	case 1 :
            	    // Generator.g:783:7: ppc= prePostClause
            	    {
            	    pushFollow(FOLLOW_prePostClause_in_prePost3652);
            	    ppc=prePostClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addPrePostClause(ppc); }

            	    }
            	    break;

            	default :
            	    if ( cnt82 >= 1 ) break loop82;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(82, input);
                        throw eee;
                }
                cnt82++;
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
    // Generator.g:790:1: prePostClause returns [ASTPrePostClause n] : as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression ;
    public final ASTPrePostClause prePostClause() throws RecognitionException {
        ASTPrePostClause n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        GeneratorParser.expression_return e =null;


         Token t = null; 
        try {
            // Generator.g:792:2: (as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression )
            // Generator.g:793:2: as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression
            {
            pushFollow(FOLLOW_annotationSet_in_prePostClause3686);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { t = input.LT(1); }

            if ( (input.LA(1) >= 117 && input.LA(1) <= 118) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // Generator.g:795:25: (name= IDENT )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==IDENT) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // Generator.g:795:27: name= IDENT
                    {
                    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePostClause3713); if (state.failed) return n;

                    }
                    break;

            }


            match(input,COLON,FOLLOW_COLON_in_prePostClause3718); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_prePostClause3722);
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
    // Generator.g:799:1: annotationSet returns [Set<ASTAnnotation> annotations] : (an= annotation )* ;
    public final Set<ASTAnnotation> annotationSet() throws RecognitionException {
        Set<ASTAnnotation> annotations = null;


        ASTAnnotation an =null;


         annotations = new HashSet<ASTAnnotation>(); 
        try {
            // Generator.g:801:2: ( (an= annotation )* )
            // Generator.g:802:2: (an= annotation )*
            {
            // Generator.g:802:2: (an= annotation )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==AT) ) {
                    int LA84_2 = input.LA(2);

                    if ( (LA84_2==IDENT) ) {
                        int LA84_3 = input.LA(3);

                        if ( (LA84_3==LPAREN) ) {
                            alt84=1;
                        }


                    }


                }


                switch (alt84) {
            	case 1 :
            	    // Generator.g:802:3: an= annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotationSet3749);
            	    an=annotation();

            	    state._fsp--;
            	    if (state.failed) return annotations;

            	    if ( state.backtracking==0 ) { annotations.add(an); }

            	    }
            	    break;

            	default :
            	    break loop84;
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
    // Generator.g:805:1: annotation returns [ASTAnnotation n] : AT name= IDENT LPAREN values= annotationValues RPAREN ;
    public final ASTAnnotation annotation() throws RecognitionException {
        ASTAnnotation n = null;


        Token name=null;
        Map<Token, Token> values =null;


        try {
            // Generator.g:805:37: ( AT name= IDENT LPAREN values= annotationValues RPAREN )
            // Generator.g:806:2: AT name= IDENT LPAREN values= annotationValues RPAREN
            {
            match(input,AT,FOLLOW_AT_in_annotation3768); if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotation3772); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = new ASTAnnotation(name);}

            match(input,LPAREN,FOLLOW_LPAREN_in_annotation3778); if (state.failed) return n;

            pushFollow(FOLLOW_annotationValues_in_annotation3787);
            values=annotationValues();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setValues(values); }

            match(input,RPAREN,FOLLOW_RPAREN_in_annotation3792); if (state.failed) return n;

            }

        }
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
    // Generator.g:812:1: annotationValues returns [Map<Token, Token> values] : (firstVal= annotationValue )? ( COMMA val= annotationValue )* ;
    public final Map<Token, Token> annotationValues() throws RecognitionException {
        Map<Token, Token> values = null;


        GeneratorParser.annotationValue_return firstVal =null;

        GeneratorParser.annotationValue_return val =null;


         values = new HashMap<Token, Token>(); 
        try {
            // Generator.g:814:2: ( (firstVal= annotationValue )? ( COMMA val= annotationValue )* )
            // Generator.g:815:2: (firstVal= annotationValue )? ( COMMA val= annotationValue )*
            {
            // Generator.g:815:2: (firstVal= annotationValue )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==IDENT) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // Generator.g:815:3: firstVal= annotationValue
                    {
                    pushFollow(FOLLOW_annotationValue_in_annotationValues3815);
                    firstVal=annotationValue();

                    state._fsp--;
                    if (state.failed) return values;

                    if ( state.backtracking==0 ) { values.put((firstVal!=null?firstVal.name:null), (firstVal!=null?firstVal.value:null)); }

                    }
                    break;

            }


            // Generator.g:816:2: ( COMMA val= annotationValue )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==COMMA) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // Generator.g:816:3: COMMA val= annotationValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_annotationValues3823); if (state.failed) return values;

            	    pushFollow(FOLLOW_annotationValue_in_annotationValues3827);
            	    val=annotationValue();

            	    state._fsp--;
            	    if (state.failed) return values;

            	    if ( state.backtracking==0 ) { values.put((val!=null?val.name:null), (val!=null?val.value:null)); }

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
        return values;
    }
    // $ANTLR end "annotationValues"


    public static class annotationValue_return extends ParserRuleReturnScope {
        public Token name;
        public Token value;
    };


    // $ANTLR start "annotationValue"
    // Generator.g:819:1: annotationValue returns [Token name, Token value] : aName= IDENT EQUAL aValue= NON_OCL_STRING ;
    public final GeneratorParser.annotationValue_return annotationValue() throws RecognitionException {
        GeneratorParser.annotationValue_return retval = new GeneratorParser.annotationValue_return();
        retval.start = input.LT(1);


        Token aName=null;
        Token aValue=null;

        try {
            // Generator.g:819:50: (aName= IDENT EQUAL aValue= NON_OCL_STRING )
            // Generator.g:820:2: aName= IDENT EQUAL aValue= NON_OCL_STRING
            {
            aName=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotationValue3846); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.name = aName; }

            match(input,EQUAL,FOLLOW_EQUAL_in_annotationValue3851); if (state.failed) return retval;

            aValue=(Token)match(input,NON_OCL_STRING,FOLLOW_NON_OCL_STRING_in_annotationValue3857); if (state.failed) return retval;

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
    // Generator.g:825:1: stateMachine returns [ASTStateMachine n] : ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end' ;
    public final ASTStateMachine stateMachine() throws RecognitionException {
        ASTStateMachine n = null;


        Token smName=null;
        ASTStateDefinition s =null;

        ASTTransitionDefinition t =null;


        try {
            // Generator.g:826:5: ( ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end' )
            // Generator.g:827:5: ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end'
            {
            // Generator.g:827:5: ( 'psm' )
            // Generator.g:828:8: 'psm'
            {
            match(input,120,FOLLOW_120_in_stateMachine3887); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTProtocolStateMachine(); }

            }


            smName=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateMachine3920); if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setName(smName); }

            match(input,126,FOLLOW_126_in_stateMachine3933); if (state.failed) return n;

            // Generator.g:835:10: (s= stateDefinition )+
            int cnt87=0;
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==IDENT) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // Generator.g:835:11: s= stateDefinition
            	    {
            	    pushFollow(FOLLOW_stateDefinition_in_stateMachine3949);
            	    s=stateDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addStateDefinition(s); }

            	    }
            	    break;

            	default :
            	    if ( cnt87 >= 1 ) break loop87;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(87, input);
                        throw eee;
                }
                cnt87++;
            } while (true);


            match(input,129,FOLLOW_129_in_stateMachine3959); if (state.failed) return n;

            // Generator.g:837:10: (t= transitionDefinition )+
            int cnt88=0;
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==IDENT) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // Generator.g:837:11: t= transitionDefinition
            	    {
            	    pushFollow(FOLLOW_transitionDefinition_in_stateMachine3975);
            	    t=transitionDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addTransitionDefinition(t); }

            	    }
            	    break;

            	default :
            	    if ( cnt88 >= 1 ) break loop88;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(88, input);
                        throw eee;
                }
                cnt88++;
            } while (true);


            match(input,85,FOLLOW_85_in_stateMachine3985); if (state.failed) return n;

            }

        }
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
    // Generator.g:841:1: stateDefinition returns [ASTStateDefinition n] : sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )? ;
    public final ASTStateDefinition stateDefinition() throws RecognitionException {
        ASTStateDefinition n = null;


        Token sn=null;
        Token stateType=null;
        GeneratorParser.expression_return stateInv =null;


        try {
            // Generator.g:841:47: (sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )? )
            // Generator.g:842:3: sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )?
            {
            sn=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateDefinition4001); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = new ASTStateDefinition(sn); }

            // Generator.g:843:3: ( COLON stateType= IDENT )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==COLON) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // Generator.g:843:5: COLON stateType= IDENT
                    {
                    match(input,COLON,FOLLOW_COLON_in_stateDefinition4009); if (state.failed) return n;

                    stateType=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateDefinition4013); if (state.failed) return n;

                    if ( state.backtracking==0 ) {n.setType(stateType); }

                    }
                    break;

            }


            // Generator.g:844:3: ( LBRACK stateInv= expression RBRACK )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==LBRACK) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // Generator.g:844:5: LBRACK stateInv= expression RBRACK
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_stateDefinition4024); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_stateDefinition4030);
                    stateInv=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RBRACK,FOLLOW_RBRACK_in_stateDefinition4032); if (state.failed) return n;

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
    // Generator.g:847:1: transitionDefinition returns [ASTTransitionDefinition n] : source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )? ;
    public final ASTTransitionDefinition transitionDefinition() throws RecognitionException {
        ASTTransitionDefinition n = null;


        Token source=null;
        Token target=null;
        Token o=null;
        GeneratorParser.expression_return pre =null;

        Token e =null;

        List<ASTVariableDeclaration> args =null;

        GeneratorParser.expression_return post =null;


        try {
            // Generator.g:847:57: (source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )? )
            // Generator.g:848:3: source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )?
            {
            source=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition4053); if (state.failed) return n;

            match(input,ARROW,FOLLOW_ARROW_in_transitionDefinition4055); if (state.failed) return n;

            target=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition4059); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTransitionDefinition(source, target); }

            // Generator.g:849:5: ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==LBRACE) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // Generator.g:849:6: LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_transitionDefinition4069); if (state.failed) return n;

                    // Generator.g:850:7: ( LBRACK pre= expression RBRACK )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==LBRACK) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // Generator.g:850:8: LBRACK pre= expression RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_transitionDefinition4079); if (state.failed) return n;

                            pushFollow(FOLLOW_expression_in_transitionDefinition4083);
                            pre=expression();

                            state._fsp--;
                            if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setPreCondition((pre!=null?pre.n:null)); }

                            match(input,RBRACK,FOLLOW_RBRACK_in_transitionDefinition4087); if (state.failed) return n;

                            }
                            break;

                    }


                    // Generator.g:851:7: (e= event |o= IDENT LPAREN (args= paramList )? RPAREN )
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==78) ) {
                        alt93=1;
                    }
                    else if ( (LA93_0==IDENT) ) {
                        alt93=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 93, 0, input);

                        throw nvae;

                    }
                    switch (alt93) {
                        case 1 :
                            // Generator.g:852:11: e= event
                            {
                            pushFollow(FOLLOW_event_in_transitionDefinition4111);
                            e=event();

                            state._fsp--;
                            if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setEvent(e); }

                            }
                            break;
                        case 2 :
                            // Generator.g:853:11: o= IDENT LPAREN (args= paramList )? RPAREN
                            {
                            o=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition4127); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setOperation(o); }

                            match(input,LPAREN,FOLLOW_LPAREN_in_transitionDefinition4131); if (state.failed) return n;

                            // Generator.g:853:50: (args= paramList )?
                            int alt92=2;
                            int LA92_0 = input.LA(1);

                            if ( (LA92_0==LPAREN) ) {
                                alt92=1;
                            }
                            switch (alt92) {
                                case 1 :
                                    // Generator.g:853:51: args= paramList
                                    {
                                    pushFollow(FOLLOW_paramList_in_transitionDefinition4136);
                                    args=paramList();

                                    state._fsp--;
                                    if (state.failed) return n;

                                    if ( state.backtracking==0 ) { n.setOperationArgs(args); }

                                    }
                                    break;

                            }


                            match(input,RPAREN,FOLLOW_RPAREN_in_transitionDefinition4143); if (state.failed) return n;

                            }
                            break;

                    }


                    // Generator.g:855:7: ( LBRACK post= expression RBRACK )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==LBRACK) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // Generator.g:855:8: LBRACK post= expression RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_transitionDefinition4160); if (state.failed) return n;

                            pushFollow(FOLLOW_expression_in_transitionDefinition4164);
                            post=expression();

                            state._fsp--;
                            if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setPostCondition((post!=null?post.n:null)); }

                            match(input,RBRACK,FOLLOW_RBRACK_in_transitionDefinition4168); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,RBRACE,FOLLOW_RBRACE_in_transitionDefinition4176); if (state.failed) return n;

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
    // Generator.g:859:1: event returns [Token t] : tcr= 'create' ;
    public final Token event() throws RecognitionException {
        Token t = null;


        Token tcr=null;

        try {
            // Generator.g:859:24: (tcr= 'create' )
            // Generator.g:860:5: tcr= 'create'
            {
            tcr=(Token)match(input,78,FOLLOW_78_in_event4198); if (state.failed) return t;

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
    // Generator.g:863:1: signalDefinition[boolean isAbstract] returns [ASTSignal n] : keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' ;
    public final ASTSignal signalDefinition(boolean isAbstract) throws RecognitionException {
        ASTSignal n = null;


        Token name=null;
        List idListRes =null;

        ASTAttribute a =null;

        ASTInvariantClause inv =null;


        try {
            // Generator.g:863:59: ( keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' )
            // Generator.g:864:5: keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end'
            {
            pushFollow(FOLLOW_keySignal_in_signalDefinition4218);
            keySignal();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_signalDefinition4222); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTSignal(name, isAbstract); }

            // Generator.g:866:5: ( LESS idListRes= idList )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==LESS) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // Generator.g:866:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_signalDefinition4237); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_signalDefinition4241);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addGenerals(idListRes); }

                    }
                    break;

            }


            // Generator.g:867:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==70) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // Generator.g:867:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,70,FOLLOW_70_in_signalDefinition4254); if (state.failed) return n;

                    // Generator.g:868:7: (a= attributeDefinition )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==AT||LA97_0==IDENT||LA97_0==63||(LA97_0 >= 68 && LA97_0 <= 69)||LA97_0==87||LA97_0==98||LA97_0==101||(LA97_0 >= 117 && LA97_0 <= 118)) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // Generator.g:868:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_signalDefinition4267);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addAttribute(a); }

                    	    }
                    	    break;

                    	default :
                    	    break loop97;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:870:5: ( 'constraints' (inv= invariantClause )* )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==76) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // Generator.g:870:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,76,FOLLOW_76_in_signalDefinition4288); if (state.failed) return n;

                    // Generator.g:871:7: (inv= invariantClause )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==AT||LA99_0==IDENT||LA99_0==63||(LA99_0 >= 68 && LA99_0 <= 69)||(LA99_0 >= 87 && LA99_0 <= 88)||LA99_0==98||LA99_0==101||(LA99_0 >= 117 && LA99_0 <= 118)) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // Generator.g:872:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_signalDefinition4308);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

                    	    }
                    	    break;

                    	default :
                    	    break loop99;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,85,FOLLOW_85_in_signalDefinition4332); if (state.failed) return n;

            }

        }
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
    // Generator.g:878:1: keyUnion :{...}? IDENT ;
    public final void keyUnion() throws RecognitionException {
        try {
            // Generator.g:878:9: ({...}? IDENT )
            // Generator.g:879:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("union"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyUnion", "input.LT(1).getText().equals(\"union\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyUnion4350); if (state.failed) return ;

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
    // Generator.g:881:1: keyAssociation :{...}? IDENT ;
    public final void keyAssociation() throws RecognitionException {
        try {
            // Generator.g:881:15: ({...}? IDENT )
            // Generator.g:882:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("association"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyAssociation", "input.LT(1).getText().equals(\"association\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyAssociation4364); if (state.failed) return ;

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
    // Generator.g:884:1: keyRole :{...}? IDENT ;
    public final void keyRole() throws RecognitionException {
        try {
            // Generator.g:884:8: ({...}? IDENT )
            // Generator.g:885:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("role"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyRole", "input.LT(1).getText().equals(\"role\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyRole4378); if (state.failed) return ;

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
    // Generator.g:887:1: keyComposition :{...}? IDENT ;
    public final void keyComposition() throws RecognitionException {
        try {
            // Generator.g:887:15: ({...}? IDENT )
            // Generator.g:888:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("composition"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyComposition", "input.LT(1).getText().equals(\"composition\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyComposition4390); if (state.failed) return ;

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
    // Generator.g:890:1: keyAggregation :{...}? IDENT ;
    public final void keyAggregation() throws RecognitionException {
        try {
            // Generator.g:890:15: ({...}? IDENT )
            // Generator.g:891:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("aggregation"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyAggregation", "input.LT(1).getText().equals(\"aggregation\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyAggregation4402); if (state.failed) return ;

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
    // Generator.g:893:1: keyClass :{...}? IDENT ;
    public final void keyClass() throws RecognitionException {
        try {
            // Generator.g:893:9: ({...}? IDENT )
            // Generator.g:894:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("class"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyClass", "input.LT(1).getText().equals(\"class\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyClass4416); if (state.failed) return ;

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
    // Generator.g:896:1: keySignal :{...}? IDENT ;
    public final void keySignal() throws RecognitionException {
        try {
            // Generator.g:896:10: ({...}? IDENT )
            // Generator.g:897:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("signal"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keySignal", "input.LT(1).getText().equals(\"signal\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keySignal4428); if (state.failed) return ;

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
    // Generator.g:899:1: keyDerived :{...}? IDENT ;
    public final void keyDerived() throws RecognitionException {
        try {
            // Generator.g:899:11: ({...}? IDENT )
            // Generator.g:900:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("derived"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyDerived", "input.LT(1).getText().equals(\"derived\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyDerived4442); if (state.failed) return ;

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
    // Generator.g:902:1: keyDerive :{...}? IDENT ;
    public final void keyDerive() throws RecognitionException {
        try {
            // Generator.g:902:10: ({...}? IDENT )
            // Generator.g:903:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("derive"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyDerive", "input.LT(1).getText().equals(\"derive\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyDerive4456); if (state.failed) return ;

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
    // Generator.g:905:1: keyInit :{...}? IDENT ;
    public final void keyInit() throws RecognitionException {
        try {
            // Generator.g:905:8: ({...}? IDENT )
            // Generator.g:906:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("init"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyInit", "input.LT(1).getText().equals(\"init\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyInit4468); if (state.failed) return ;

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
    // Generator.g:908:1: keyQualifier :{...}? IDENT ;
    public final void keyQualifier() throws RecognitionException {
        try {
            // Generator.g:908:13: ({...}? IDENT )
            // Generator.g:909:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("qualifier"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyQualifier", "input.LT(1).getText().equals(\"qualifier\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyQualifier4484); if (state.failed) return ;

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
    // Generator.g:910:1: checkExpr returns [QAst expr] : ( 'verify' qexpr= queryExpr ( ( '&&' right_expr= queryExpr ) | ( '||' right_expr= queryExpr ) | ( '=>' right_expr= queryExpr ) )* EOF |mexpr= moduleExpr (mexpr= moduleExpr )* EOF );
    public final QAst checkExpr() throws RecognitionException {
        QAst expr = null;


        QueryExpr qexpr =null;

        QueryExpr right_expr =null;

        ModuleExpr mexpr =null;


        try {
            // Generator.g:910:30: ( 'verify' qexpr= queryExpr ( ( '&&' right_expr= queryExpr ) | ( '||' right_expr= queryExpr ) | ( '=>' right_expr= queryExpr ) )* EOF |mexpr= moduleExpr (mexpr= moduleExpr )* EOF )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==132) ) {
                alt103=1;
            }
            else if ( (LA103_0==102) ) {
                alt103=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;

            }
            switch (alt103) {
                case 1 :
                    // Generator.g:911:5: 'verify' qexpr= queryExpr ( ( '&&' right_expr= queryExpr ) | ( '||' right_expr= queryExpr ) | ( '=>' right_expr= queryExpr ) )* EOF
                    {
                    match(input,132,FOLLOW_132_in_checkExpr4499); if (state.failed) return expr;

                    pushFollow(FOLLOW_queryExpr_in_checkExpr4503);
                    qexpr=queryExpr();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr =qexpr;}

                    // Generator.g:912:10: ( ( '&&' right_expr= queryExpr ) | ( '||' right_expr= queryExpr ) | ( '=>' right_expr= queryExpr ) )*
                    loop101:
                    do {
                        int alt101=4;
                        switch ( input.LA(1) ) {
                        case 44:
                            {
                            alt101=1;
                            }
                            break;
                        case 136:
                            {
                            alt101=2;
                            }
                            break;
                        case 45:
                            {
                            alt101=3;
                            }
                            break;

                        }

                        switch (alt101) {
                    	case 1 :
                    	    // Generator.g:913:13: ( '&&' right_expr= queryExpr )
                    	    {
                    	    // Generator.g:913:13: ( '&&' right_expr= queryExpr )
                    	    // Generator.g:913:14: '&&' right_expr= queryExpr
                    	    {
                    	    match(input,44,FOLLOW_44_in_checkExpr4531); if (state.failed) return expr;

                    	    pushFollow(FOLLOW_queryExpr_in_checkExpr4535);
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
                    	    // Generator.g:919:13: ( '||' right_expr= queryExpr )
                    	    {
                    	    // Generator.g:919:13: ( '||' right_expr= queryExpr )
                    	    // Generator.g:919:14: '||' right_expr= queryExpr
                    	    {
                    	    match(input,136,FOLLOW_136_in_checkExpr4593); if (state.failed) return expr;

                    	    pushFollow(FOLLOW_queryExpr_in_checkExpr4597);
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
                    	    // Generator.g:925:13: ( '=>' right_expr= queryExpr )
                    	    {
                    	    // Generator.g:925:13: ( '=>' right_expr= queryExpr )
                    	    // Generator.g:925:15: '=>' right_expr= queryExpr
                    	    {
                    	    match(input,45,FOLLOW_45_in_checkExpr4656); if (state.failed) return expr;

                    	    pushFollow(FOLLOW_queryExpr_in_checkExpr4662);
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
                    	    break loop101;
                        }
                    } while (true);


                    match(input,EOF,FOLLOW_EOF_in_checkExpr4708); if (state.failed) return expr;

                    }
                    break;
                case 2 :
                    // Generator.g:932:9: mexpr= moduleExpr (mexpr= moduleExpr )* EOF
                    {
                    pushFollow(FOLLOW_moduleExpr_in_checkExpr4726);
                    mexpr=moduleExpr();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr = new ModuleListExpr(); ((ModuleListExpr)expr).addModule(mexpr);}

                    // Generator.g:933:9: (mexpr= moduleExpr )*
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==102) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // Generator.g:933:10: mexpr= moduleExpr
                    	    {
                    	    pushFollow(FOLLOW_moduleExpr_in_checkExpr4742);
                    	    mexpr=moduleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return expr;

                    	    if ( state.backtracking==0 ) {((ModuleListExpr)expr).addModule(mexpr);}

                    	    }
                    	    break;

                    	default :
                    	    break loop102;
                        }
                    } while (true);


                    match(input,EOF,FOLLOW_EOF_in_checkExpr4748); if (state.failed) return expr;

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
    // Generator.g:936:1: queryExpr returns [QueryExpr qexpr] : 'select' f= featureExpr ( COMMA f= featureExpr )* (with= withExpr )? (without= butExpr )? ( 'inject' o= injExpr )? ( 'as' name= IDENT )? ;
    public final QueryExpr queryExpr() throws RecognitionException {
        QueryExpr qexpr = null;


        Token name=null;
        QFeatureExpr f =null;

        QWithExpr with =null;

        QButExpr without =null;

        QOCLExpr o =null;



            qexpr = new QueryExpr();

        try {
            // Generator.g:938:2: ( 'select' f= featureExpr ( COMMA f= featureExpr )* (with= withExpr )? (without= butExpr )? ( 'inject' o= injExpr )? ( 'as' name= IDENT )? )
            // Generator.g:939:5: 'select' f= featureExpr ( COMMA f= featureExpr )* (with= withExpr )? (without= butExpr )? ( 'inject' o= injExpr )? ( 'as' name= IDENT )?
            {
            match(input,122,FOLLOW_122_in_queryExpr4769); if (state.failed) return qexpr;

            pushFollow(FOLLOW_featureExpr_in_queryExpr4773);
            f=featureExpr();

            state._fsp--;
            if (state.failed) return qexpr;

            if ( state.backtracking==0 ) {qexpr.addFeature(f);}

            // Generator.g:939:52: ( COMMA f= featureExpr )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==COMMA) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // Generator.g:939:53: COMMA f= featureExpr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_queryExpr4778); if (state.failed) return qexpr;

            	    pushFollow(FOLLOW_featureExpr_in_queryExpr4782);
            	    f=featureExpr();

            	    state._fsp--;
            	    if (state.failed) return qexpr;

            	    if ( state.backtracking==0 ) {qexpr.addFeature(f);}

            	    }
            	    break;

            	default :
            	    break loop104;
                }
            } while (true);


            // Generator.g:940:9: (with= withExpr )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==134) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // Generator.g:940:10: with= withExpr
                    {
                    pushFollow(FOLLOW_withExpr_in_queryExpr4800);
                    with=withExpr();

                    state._fsp--;
                    if (state.failed) return qexpr;

                    if ( state.backtracking==0 ) {qexpr.addWithExpr(with);}

                    }
                    break;

            }


            // Generator.g:941:9: (without= butExpr )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==74) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // Generator.g:941:10: without= butExpr
                    {
                    pushFollow(FOLLOW_butExpr_in_queryExpr4818);
                    without=butExpr();

                    state._fsp--;
                    if (state.failed) return qexpr;

                    if ( state.backtracking==0 ) {qexpr.addWithoutExpr(without);}

                    }
                    break;

            }


            // Generator.g:941:62: ( 'inject' o= injExpr )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==95) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // Generator.g:941:63: 'inject' o= injExpr
                    {
                    match(input,95,FOLLOW_95_in_queryExpr4825); if (state.failed) return qexpr;

                    pushFollow(FOLLOW_injExpr_in_queryExpr4829);
                    o=injExpr();

                    state._fsp--;
                    if (state.failed) return qexpr;

                    if ( state.backtracking==0 ) {qexpr.setOCLExpression(o);}

                    }
                    break;

            }


            // Generator.g:942:9: ( 'as' name= IDENT )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==67) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // Generator.g:942:10: 'as' name= IDENT
                    {
                    match(input,67,FOLLOW_67_in_queryExpr4844); if (state.failed) return qexpr;

                    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpr4848); if (state.failed) return qexpr;

                    if ( state.backtracking==0 ) {qexpr.setAlias(name.getText());}

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
        return qexpr;
    }
    // $ANTLR end "queryExpr"



    // $ANTLR start "featureExpr"
    // Generator.g:951:1: featureExpr returns [QFeatureExpr feature] : ( (modifier= modifiers )? dest= ( IDENT | STAR ) (k= rankExpr )? |f1= attrExpr |f2= assocExpr );
    public final QFeatureExpr featureExpr() throws RecognitionException {
        QFeatureExpr feature = null;


        Token dest=null;
        Modifier modifier =null;

        int k =0;

        QAttrExpr f1 =null;

        QAssocExpr f2 =null;


        try {
            // Generator.g:951:43: ( (modifier= modifiers )? dest= ( IDENT | STAR ) (k= rankExpr )? |f1= attrExpr |f2= assocExpr )
            int alt111=3;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==64||LA111_0==104||LA111_0==113) ) {
                alt111=1;
            }
            else if ( (LA111_0==IDENT||LA111_0==STAR) ) {
                switch ( input.LA(2) ) {
                case DOT:
                    {
                    alt111=2;
                    }
                    break;
                case COLON:
                    {
                    alt111=3;
                    }
                    break;
                case EOF:
                case AT:
                case COMMA:
                case 44:
                case 45:
                case 67:
                case 74:
                case 85:
                case 95:
                case 122:
                case 134:
                case 136:
                    {
                    alt111=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return feature;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 111, 2, input);

                    throw nvae;

                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return feature;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;

            }
            switch (alt111) {
                case 1 :
                    // Generator.g:952:5: (modifier= modifiers )? dest= ( IDENT | STAR ) (k= rankExpr )?
                    {
                    // Generator.g:952:5: (modifier= modifiers )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==64||LA109_0==104||LA109_0==113) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // Generator.g:952:6: modifier= modifiers
                            {
                            pushFollow(FOLLOW_modifiers_in_featureExpr4895);
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


                    // Generator.g:952:46: (k= rankExpr )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==AT) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // Generator.g:952:47: k= rankExpr
                            {
                            pushFollow(FOLLOW_rankExpr_in_featureExpr4911);
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
                    // Generator.g:960:7: f1= attrExpr
                    {
                    pushFollow(FOLLOW_attrExpr_in_featureExpr4931);
                    f1=attrExpr();

                    state._fsp--;
                    if (state.failed) return feature;

                    if ( state.backtracking==0 ) {feature =f1;}

                    }
                    break;
                case 3 :
                    // Generator.g:961:7: f2= assocExpr
                    {
                    pushFollow(FOLLOW_assocExpr_in_featureExpr4945);
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
    // Generator.g:964:1: modifiers returns [Modifier m] : ( 'only' | 'no' | 'all' );
    public final Modifier modifiers() throws RecognitionException {
        Modifier m = null;


        try {
            // Generator.g:964:31: ( 'only' | 'no' | 'all' )
            int alt112=3;
            switch ( input.LA(1) ) {
            case 113:
                {
                alt112=1;
                }
                break;
            case 104:
                {
                alt112=2;
                }
                break;
            case 64:
                {
                alt112=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return m;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;

            }

            switch (alt112) {
                case 1 :
                    // Generator.g:965:5: 'only'
                    {
                    match(input,113,FOLLOW_113_in_modifiers4963); if (state.failed) return m;

                    if ( state.backtracking==0 ) {m =Modifier.ONLY;}

                    }
                    break;
                case 2 :
                    // Generator.g:967:5: 'no'
                    {
                    match(input,104,FOLLOW_104_in_modifiers4977); if (state.failed) return m;

                    if ( state.backtracking==0 ) {m =Modifier.NO;}

                    }
                    break;
                case 3 :
                    // Generator.g:969:6: 'all'
                    {
                    match(input,64,FOLLOW_64_in_modifiers4987); if (state.failed) return m;

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
    // Generator.g:971:1: attrExpr returns [QAttrExpr attr] : src= ( IDENT | STAR ) DOT dest= ( IDENT | STAR ) (k= rankExpr )? ;
    public final QAttrExpr attrExpr() throws RecognitionException {
        QAttrExpr attr = null;


        Token src=null;
        Token dest=null;
        int k =0;


        try {
            // Generator.g:971:34: (src= ( IDENT | STAR ) DOT dest= ( IDENT | STAR ) (k= rankExpr )? )
            // Generator.g:972:5: src= ( IDENT | STAR ) DOT dest= ( IDENT | STAR ) (k= rankExpr )?
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


            match(input,DOT,FOLLOW_DOT_in_attrExpr5012); if (state.failed) return attr;

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


            // Generator.g:972:44: (k= rankExpr )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==AT) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // Generator.g:972:45: k= rankExpr
                    {
                    pushFollow(FOLLOW_rankExpr_in_attrExpr5025);
                    k=rankExpr();

                    state._fsp--;
                    if (state.failed) return attr;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
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
    // Generator.g:982:1: assocExpr returns [QAssocExpr assoc] : src= ( IDENT | STAR ) COLON name= ( IDENT | STAR ) COLON dest= ( IDENT | STAR ) (k= rankExpr )? ;
    public final QAssocExpr assocExpr() throws RecognitionException {
        QAssocExpr assoc = null;


        Token src=null;
        Token name=null;
        Token dest=null;
        int k =0;


        try {
            // Generator.g:983:3: (src= ( IDENT | STAR ) COLON name= ( IDENT | STAR ) COLON dest= ( IDENT | STAR ) (k= rankExpr )? )
            // Generator.g:983:3: src= ( IDENT | STAR ) COLON name= ( IDENT | STAR ) COLON dest= ( IDENT | STAR ) (k= rankExpr )?
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


            match(input,COLON,FOLLOW_COLON_in_assocExpr5055); if (state.failed) return assoc;

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


            match(input,COLON,FOLLOW_COLON_in_assocExpr5065); if (state.failed) return assoc;

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


            // Generator.g:983:68: (k= rankExpr )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==AT) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // Generator.g:983:69: k= rankExpr
                    {
                    pushFollow(FOLLOW_rankExpr_in_assocExpr5078);
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
    // Generator.g:993:1: withExpr returns [QWithExpr with] : 'with' w= invExpr ( COMMA w= invExpr )* ;
    public final QWithExpr withExpr() throws RecognitionException {
        QWithExpr with = null;


        QInvExpr w =null;



            with = new QWithExpr();

        try {
            // Generator.g:995:2: ( 'with' w= invExpr ( COMMA w= invExpr )* )
            // Generator.g:996:5: 'with' w= invExpr ( COMMA w= invExpr )*
            {
            match(input,134,FOLLOW_134_in_withExpr5107); if (state.failed) return with;

            pushFollow(FOLLOW_invExpr_in_withExpr5111);
            w=invExpr();

            state._fsp--;
            if (state.failed) return with;

            if ( state.backtracking==0 ) {with.addInvExpr(w);}

            // Generator.g:996:44: ( COMMA w= invExpr )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==COMMA) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // Generator.g:996:45: COMMA w= invExpr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_withExpr5115); if (state.failed) return with;

            	    pushFollow(FOLLOW_invExpr_in_withExpr5119);
            	    w=invExpr();

            	    state._fsp--;
            	    if (state.failed) return with;

            	    if ( state.backtracking==0 ) {with.addInvExpr(w);}

            	    }
            	    break;

            	default :
            	    break loop115;
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
    // Generator.g:998:1: butExpr returns [QButExpr without] : 'but' w= invExpr ( COMMA w= invExpr )* ;
    public final QButExpr butExpr() throws RecognitionException {
        QButExpr without = null;


        QInvExpr w =null;



            without = new QButExpr();

        try {
            // Generator.g:1001:5: ( 'but' w= invExpr ( COMMA w= invExpr )* )
            // Generator.g:1002:5: 'but' w= invExpr ( COMMA w= invExpr )*
            {
            match(input,74,FOLLOW_74_in_butExpr5142); if (state.failed) return without;

            pushFollow(FOLLOW_invExpr_in_butExpr5146);
            w=invExpr();

            state._fsp--;
            if (state.failed) return without;

            if ( state.backtracking==0 ) {without.addInvExpr(w);}

            // Generator.g:1002:46: ( COMMA w= invExpr )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==COMMA) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // Generator.g:1002:47: COMMA w= invExpr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_butExpr5150); if (state.failed) return without;

            	    pushFollow(FOLLOW_invExpr_in_butExpr5154);
            	    w=invExpr();

            	    state._fsp--;
            	    if (state.failed) return without;

            	    if ( state.backtracking==0 ) {without.addInvExpr(w);}

            	    }
            	    break;

            	default :
            	    break loop116;
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
    // Generator.g:1005:1: invExpr returns [QInvExpr inv] : src= ( IDENT | STAR ) COLON_COLON dest= ( IDENT | STAR ) (k= rankExpr )? ;
    public final QInvExpr invExpr() throws RecognitionException {
        QInvExpr inv = null;


        Token src=null;
        Token dest=null;
        int k =0;


        try {
            // Generator.g:1005:31: (src= ( IDENT | STAR ) COLON_COLON dest= ( IDENT | STAR ) (k= rankExpr )? )
            // Generator.g:1006:5: src= ( IDENT | STAR ) COLON_COLON dest= ( IDENT | STAR ) (k= rankExpr )?
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


            match(input,COLON_COLON,FOLLOW_COLON_COLON_in_invExpr5182); if (state.failed) return inv;

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


            // Generator.g:1006:52: (k= rankExpr )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==AT) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // Generator.g:1006:53: k= rankExpr
                    {
                    pushFollow(FOLLOW_rankExpr_in_invExpr5195);
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
    // Generator.g:1017:1: rankExpr returns [int rank] : AT k= INT ;
    public final int rankExpr() throws RecognitionException {
        int rank = 0;


        Token k=null;


            rank =0;
         
        try {
            // Generator.g:1019:3: ( AT k= INT )
            // Generator.g:1020:5: AT k= INT
            {
            match(input,AT,FOLLOW_AT_in_rankExpr5224); if (state.failed) return rank;

            k=(Token)match(input,INT,FOLLOW_INT_in_rankExpr5228); if (state.failed) return rank;

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
    // Generator.g:1023:1: moduleExpr returns [ModuleExpr mexpr] : 'module' name= IDENT query= queryExpr (query= queryExpr )* 'end' ;
    public final ModuleExpr moduleExpr() throws RecognitionException {
        ModuleExpr mexpr = null;


        Token name=null;
        QueryExpr query =null;


        try {
            // Generator.g:1023:38: ( 'module' name= IDENT query= queryExpr (query= queryExpr )* 'end' )
            // Generator.g:1024:5: 'module' name= IDENT query= queryExpr (query= queryExpr )* 'end'
            {
            match(input,102,FOLLOW_102_in_moduleExpr5246); if (state.failed) return mexpr;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_moduleExpr5250); if (state.failed) return mexpr;

            if ( state.backtracking==0 ) {mexpr = new ModuleExpr(name.getText());}

            pushFollow(FOLLOW_queryExpr_in_moduleExpr5264);
            query=queryExpr();

            state._fsp--;
            if (state.failed) return mexpr;

            if ( state.backtracking==0 ) {mexpr.addQuery(query);}

            // Generator.g:1026:9: (query= queryExpr )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==122) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // Generator.g:1026:10: query= queryExpr
            	    {
            	    pushFollow(FOLLOW_queryExpr_in_moduleExpr5280);
            	    query=queryExpr();

            	    state._fsp--;
            	    if (state.failed) return mexpr;

            	    if ( state.backtracking==0 ) {mexpr.addQuery(query);}

            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);


            match(input,85,FOLLOW_85_in_moduleExpr5290); if (state.failed) return mexpr;

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
    // Generator.g:1030:1: injExpr returns [QOCLExpr ocl_expr] : LBRACE expr= expression (k= rankExpr )? ( COMMA expr= expression (k= rankExpr )? )* RBRACE ;
    public final QOCLExpr injExpr() throws RecognitionException {
        QOCLExpr ocl_expr = null;


        GeneratorParser.expression_return expr =null;

        int k =0;



            ocl_expr = new QOCLExpr();

        try {
            // Generator.g:1032:2: ( LBRACE expr= expression (k= rankExpr )? ( COMMA expr= expression (k= rankExpr )? )* RBRACE )
            // Generator.g:1033:5: LBRACE expr= expression (k= rankExpr )? ( COMMA expr= expression (k= rankExpr )? )* RBRACE
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_injExpr5311); if (state.failed) return ocl_expr;

            pushFollow(FOLLOW_expression_in_injExpr5315);
            expr=expression();

            state._fsp--;
            if (state.failed) return ocl_expr;

            // Generator.g:1033:28: (k= rankExpr )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==AT) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // Generator.g:1033:29: k= rankExpr
                    {
                    pushFollow(FOLLOW_rankExpr_in_injExpr5320);
                    k=rankExpr();

                    state._fsp--;
                    if (state.failed) return ocl_expr;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                    if (k>0)
                        ocl_expr.addOCLExpression(expr.n,k);
                    else
                        ocl_expr.addOCLExpression(expr.n);
                }

            // Generator.g:1040:5: ( COMMA expr= expression (k= rankExpr )? )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==COMMA) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // Generator.g:1040:6: COMMA expr= expression (k= rankExpr )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_injExpr5337); if (state.failed) return ocl_expr;

            	    pushFollow(FOLLOW_expression_in_injExpr5341);
            	    expr=expression();

            	    state._fsp--;
            	    if (state.failed) return ocl_expr;

            	    // Generator.g:1040:28: (k= rankExpr )?
            	    int alt120=2;
            	    int LA120_0 = input.LA(1);

            	    if ( (LA120_0==AT) ) {
            	        alt120=1;
            	    }
            	    switch (alt120) {
            	        case 1 :
            	            // Generator.g:1040:29: k= rankExpr
            	            {
            	            pushFollow(FOLLOW_rankExpr_in_injExpr5346);
            	            k=rankExpr();

            	            state._fsp--;
            	            if (state.failed) return ocl_expr;

            	            }
            	            break;

            	    }


            	    if ( state.backtracking==0 ) {
            	                if (k>0)
            	                    ocl_expr.addOCLExpression(expr.n,k);
            	                else
            	                    ocl_expr.addOCLExpression(expr.n);
            	            }

            	    }
            	    break;

            	default :
            	    break loop121;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_injExpr5368); if (state.failed) return ocl_expr;

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
    // Generator.g:1076:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;


        GeneratorParser.expression_return nExp =null;


        try {
            // Generator.g:1077:5: (nExp= expression EOF )
            // Generator.g:1078:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly5395);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_expressionOnly5397); if (state.failed) return n;

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
    // Generator.g:1085:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
    public final GeneratorParser.expression_return expression() throws RecognitionException {
        GeneratorParser.expression_return retval = new GeneratorParser.expression_return();
        retval.start = input.LT(1);


        Token name=null;
        ASTType t =null;

        GeneratorParser.expression_return e1 =null;

        ASTExpression nCndImplies =null;


         
          ASTLetExpression prevLet = null, firstLet = null;
          ASTExpression e2;
          Token tok = null;

        try {
            // Generator.g:1091:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
            // Generator.g:1092:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }

            // Generator.g:1093:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==100) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // Generator.g:1094:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
            	    {
            	    match(input,100,FOLLOW_100_in_expression5445); if (state.failed) return retval;

            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression5456); if (state.failed) return retval;

            	    // Generator.g:1095:18: ( COLON t= type )?
            	    int alt122=2;
            	    int LA122_0 = input.LA(1);

            	    if ( (LA122_0==COLON) ) {
            	        alt122=1;
            	    }
            	    switch (alt122) {
            	        case 1 :
            	            // Generator.g:1095:20: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression5460); if (state.failed) return retval;

            	            pushFollow(FOLLOW_type_in_expression5464);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression5469); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expression_in_expression5473);
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

            	    // Generator.g:1105:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
            	    loop124:
            	    do {
            	        int alt124=2;
            	        int LA124_0 = input.LA(1);

            	        if ( (LA124_0==COMMA) ) {
            	            alt124=1;
            	        }


            	        switch (alt124) {
            	    	case 1 :
            	    	    // Generator.g:1106:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_expression5511); if (state.failed) return retval;

            	    	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression5523); if (state.failed) return retval;

            	    	    // Generator.g:1107:20: ( COLON t= type )?
            	    	    int alt123=2;
            	    	    int LA123_0 = input.LA(1);

            	    	    if ( (LA123_0==COLON) ) {
            	    	        alt123=1;
            	    	    }
            	    	    switch (alt123) {
            	    	        case 1 :
            	    	            // Generator.g:1107:22: COLON t= type
            	    	            {
            	    	            match(input,COLON,FOLLOW_COLON_in_expression5527); if (state.failed) return retval;

            	    	            pushFollow(FOLLOW_type_in_expression5531);
            	    	            t=type();

            	    	            state._fsp--;
            	    	            if (state.failed) return retval;

            	    	            }
            	    	            break;

            	    	    }


            	    	    match(input,EQUAL,FOLLOW_EQUAL_in_expression5536); if (state.failed) return retval;

            	    	    pushFollow(FOLLOW_expression_in_expression5540);
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
            	    	    break loop124;
            	        }
            	    } while (true);


            	    match(input,94,FOLLOW_94_in_expression5581); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop125;
                }
            } while (true);


            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression5597);
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
    // Generator.g:1140:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;


        ASTVariableDeclaration v =null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // Generator.g:1142:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // Generator.g:1143:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList5630); if (state.failed) return paramList;

            // Generator.g:1144:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==IDENT) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // Generator.g:1145:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList5647);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;

                    if ( state.backtracking==0 ) { paramList.add(v); }

                    // Generator.g:1146:7: ( COMMA v= variableDeclaration )*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==COMMA) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // Generator.g:1146:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList5659); if (state.failed) return paramList;

                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList5663);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;

                    	    if ( state.backtracking==0 ) { paramList.add(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop126;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_paramList5683); if (state.failed) return paramList;

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
    // Generator.g:1154:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;


        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // Generator.g:1156:5: (id0= IDENT ( COMMA idn= IDENT )* )
            // Generator.g:1157:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList5712); if (state.failed) return idList;

            if ( state.backtracking==0 ) { idList.add(id0); }

            // Generator.g:1158:5: ( COMMA idn= IDENT )*
            loop128:
            do {
                int alt128=2;
                int LA128_0 = input.LA(1);

                if ( (LA128_0==COMMA) ) {
                    alt128=1;
                }


                switch (alt128) {
            	case 1 :
            	    // Generator.g:1158:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList5722); if (state.failed) return idList;

            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList5726); if (state.failed) return idList;

            	    if ( state.backtracking==0 ) { idList.add(idn); }

            	    }
            	    break;

            	default :
            	    break loop128;
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
    // Generator.g:1166:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Generator.g:1167:5: (name= IDENT COLON t= type )
            // Generator.g:1168:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration5757); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableDeclaration5759); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableDeclaration5763);
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
    // Generator.g:1176:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndOrExp =null;

        ASTExpression n1 =null;


        try {
            // Generator.g:1177:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // Generator.g:1178:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression5799);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndOrExp;}

            // Generator.g:1179:5: (op= 'implies' n1= conditionalOrExpression )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==93) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // Generator.g:1179:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,93,FOLLOW_93_in_conditionalImpliesExpression5812); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression5816);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop129;
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
    // Generator.g:1188:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndXorExp =null;

        ASTExpression n1 =null;


        try {
            // Generator.g:1189:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // Generator.g:1190:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression5861);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndXorExp;}

            // Generator.g:1191:5: (op= 'or' n1= conditionalXOrExpression )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==115) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // Generator.g:1191:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,115,FOLLOW_115_in_conditionalOrExpression5874); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression5878);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop130;
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
    // Generator.g:1200:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndAndExp =null;

        ASTExpression n1 =null;


        try {
            // Generator.g:1201:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // Generator.g:1202:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression5922);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndAndExp;}

            // Generator.g:1203:5: (op= 'xor' n1= conditionalAndExpression )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==135) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // Generator.g:1203:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,135,FOLLOW_135_in_conditionalXOrExpression5935); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression5939);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop131;
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
    // Generator.g:1212:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nEqExp =null;

        ASTExpression n1 =null;


        try {
            // Generator.g:1213:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // Generator.g:1214:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression5983);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nEqExp;}

            // Generator.g:1215:5: (op= 'and' n1= equalityExpression )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( (LA132_0==66) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // Generator.g:1215:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,66,FOLLOW_66_in_conditionalAndExpression5996); if (state.failed) return n;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression6000);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop132;
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
    // Generator.g:1224:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nRelExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Generator.g:1226:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // Generator.g:1227:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression6048);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nRelExp;}

            // Generator.g:1228:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==EQUAL||LA133_0==NOT_EQUAL) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // Generator.g:1228:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression6077);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop133;
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
    // Generator.g:1238:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nAddiExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Generator.g:1240:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // Generator.g:1241:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression6126);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nAddiExp;}

            // Generator.g:1242:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop134:
            do {
                int alt134=2;
                int LA134_0 = input.LA(1);

                if ( ((LA134_0 >= GREATER && LA134_0 <= GREATER_EQUAL)||(LA134_0 >= LESS && LA134_0 <= LESS_EQUAL)) ) {
                    alt134=1;
                }


                switch (alt134) {
            	case 1 :
            	    // Generator.g:1242:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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


            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression6162);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

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
    // $ANTLR end "relationalExpression"



    // $ANTLR start "additiveExpression"
    // Generator.g:1252:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nMulExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Generator.g:1254:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // Generator.g:1255:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression6212);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nMulExp;}

            // Generator.g:1256:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==MINUS||LA135_0==PLUS) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // Generator.g:1256:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression6240);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop135;
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
    // Generator.g:1267:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Generator.g:1269:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // Generator.g:1270:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression6290);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nUnExp;}

            // Generator.g:1271:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop136:
            do {
                int alt136=2;
                int LA136_0 = input.LA(1);

                if ( (LA136_0==SLASH||LA136_0==STAR||LA136_0==82) ) {
                    alt136=1;
                }


                switch (alt136) {
            	case 1 :
            	    // Generator.g:1271:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==82 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression6322);
            	    n1=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop136;
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
    // Generator.g:1283:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression nPosExp =null;


         Token op = null; 
        try {
            // Generator.g:1285:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==MINUS||LA137_0==PLUS||LA137_0==105) ) {
                alt137=1;
            }
            else if ( (LA137_0==AT||LA137_0==HASH||(LA137_0 >= IDENT && LA137_0 <= INT)||LA137_0==LPAREN||LA137_0==REAL||(LA137_0 >= STAR && LA137_0 <= STRING)||LA137_0==47||LA137_0==49||LA137_0==54||(LA137_0 >= 57 && LA137_0 <= 58)||LA137_0==60||LA137_0==62||LA137_0==89||LA137_0==92||LA137_0==99||(LA137_0 >= 106 && LA137_0 <= 112)||(LA137_0 >= 123 && LA137_0 <= 124)||LA137_0==130) ) {
                alt137=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;

            }
            switch (alt137) {
                case 1 :
                    // Generator.g:1286:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // Generator.g:1286:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // Generator.g:1286:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) { op = input.LT(1); }

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==105 ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression6408);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }

                    }


                    }
                    break;
                case 2 :
                    // Generator.g:1290:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression6428);
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
    // Generator.g:1298:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nPrimExp =null;

        ASTExpression nPc =null;


         boolean arrow = false; 
        try {
            // Generator.g:1300:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // Generator.g:1301:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression6461);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nPrimExp; }

            // Generator.g:1302:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop139:
            do {
                int alt139=2;
                int LA139_0 = input.LA(1);

                if ( (LA139_0==DOT) ) {
                    int LA139_2 = input.LA(2);

                    if ( (LA139_2==IDENT) ) {
                        int LA139_4 = input.LA(3);

                        if ( (LA139_4==EOF||(LA139_4 >= ARROW && LA139_4 <= BAR)||(LA139_4 >= COMMA && LA139_4 <= EQUAL)||(LA139_4 >= GREATER && LA139_4 <= GREATER_EQUAL)||LA139_4==IDENT||(LA139_4 >= LBRACE && LA139_4 <= MINUS)||(LA139_4 >= NOT_EQUAL && LA139_4 <= PLUS)||(LA139_4 >= RBRACE && LA139_4 <= RBRACK)||(LA139_4 >= RPAREN && LA139_4 <= SLASH)||LA139_4==STAR||LA139_4==63||LA139_4==66||(LA139_4 >= 68 && LA139_4 <= 70)||(LA139_4 >= 76 && LA139_4 <= 77)||(LA139_4 >= 82 && LA139_4 <= 88)||(LA139_4 >= 93 && LA139_4 <= 94)||LA139_4==98||LA139_4==102||(LA139_4 >= 114 && LA139_4 <= 118)||LA139_4==121||LA139_4==125||(LA139_4 >= 127 && LA139_4 <= 128)||LA139_4==135) ) {
                            alt139=1;
                        }


                    }
                    else if ( (LA139_2==99||LA139_2==107||(LA139_2 >= 109 && LA139_2 <= 111)||(LA139_2 >= 123 && LA139_2 <= 124)) ) {
                        alt139=1;
                    }


                }
                else if ( (LA139_0==ARROW) ) {
                    alt139=1;
                }


                switch (alt139) {
            	case 1 :
            	    // Generator.g:1303:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // Generator.g:1303:6: ( ARROW | DOT )
            	    int alt138=2;
            	    int LA138_0 = input.LA(1);

            	    if ( (LA138_0==ARROW) ) {
            	        alt138=1;
            	    }
            	    else if ( (LA138_0==DOT) ) {
            	        alt138=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 138, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt138) {
            	        case 1 :
            	            // Generator.g:1303:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression6479); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = true; }

            	            }
            	            break;
            	        case 2 :
            	            // Generator.g:1303:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression6485); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = false; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression6496);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = nPc; }

            	    }
            	    break;

            	default :
            	    break loop139;
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
    // Generator.g:1319:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? );
    public final ASTExpression primaryExpression() throws RecognitionException {
        ASTExpression n = null;


        Token id1=null;
        Token id2=null;
        ASTExpression nLit =null;

        ASTExpression nOr =null;

        ASTExpression nPc =null;

        GeneratorParser.expression_return nExp =null;

        ASTExpression nIfExp =null;

        GeneratorParser.expression_return idExp =null;


        try {
            // Generator.g:1320:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? )
            int alt143=7;
            switch ( input.LA(1) ) {
            case HASH:
            case INT:
            case REAL:
            case STAR:
            case STRING:
            case 47:
            case 49:
            case 54:
            case 57:
            case 58:
            case 60:
            case 62:
            case 89:
            case 106:
            case 108:
            case 112:
            case 130:
                {
                alt143=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt143=1;
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
                case 63:
                case 66:
                case 68:
                case 69:
                case 70:
                case 76:
                case 77:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 93:
                case 94:
                case 98:
                case 102:
                case 114:
                case 115:
                case 116:
                case 117:
                case 118:
                case 121:
                case 125:
                case 127:
                case 128:
                case 135:
                    {
                    alt143=3;
                    }
                    break;
                case DOT:
                    {
                    switch ( input.LA(3) ) {
                    case 65:
                        {
                        alt143=6;
                        }
                        break;
                    case 75:
                        {
                        alt143=7;
                        }
                        break;
                    case IDENT:
                    case 99:
                    case 107:
                    case 109:
                    case 110:
                    case 111:
                    case 123:
                    case 124:
                        {
                        alt143=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 143, 7, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 143, 2, input);

                    throw nvae;

                }

                }
                break;
            case AT:
                {
                alt143=2;
                }
                break;
            case 99:
            case 107:
            case 109:
            case 110:
            case 111:
            case 123:
            case 124:
                {
                alt143=3;
                }
                break;
            case LPAREN:
                {
                alt143=4;
                }
                break;
            case 92:
                {
                alt143=5;
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
                    // Generator.g:1321:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression6536);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nLit; }

                    }
                    break;
                case 2 :
                    // Generator.g:1322:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression6550);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nOr; }

                    }
                    break;
                case 3 :
                    // Generator.g:1323:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression6562);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPc; }

                    }
                    break;
                case 4 :
                    // Generator.g:1324:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression6573); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression6577);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression6579); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExp!=null?nExp.n:null); }

                    }
                    break;
                case 5 :
                    // Generator.g:1325:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression6591);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nIfExp; }

                    }
                    break;
                case 6 :
                    // Generator.g:1326:7: id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression6603); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression6605); if (state.failed) return n;

                    match(input,65,FOLLOW_65_in_primaryExpression6607); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }

                    // Generator.g:1328:9: ( AT 'pre' )?
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==AT) ) {
                        int LA140_1 = input.LA(2);

                        if ( (LA140_1==118) ) {
                            alt140=1;
                        }
                    }
                    switch (alt140) {
                        case 1 :
                            // Generator.g:1328:11: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression6630); if (state.failed) return n;

                            match(input,118,FOLLOW_118_in_primaryExpression6632); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setIsPre(); }

                            }
                            break;

                    }


                    // Generator.g:1329:9: ( LPAREN RPAREN )?
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==LPAREN) ) {
                        alt141=1;
                    }
                    switch (alt141) {
                        case 1 :
                            // Generator.g:1329:11: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression6650); if (state.failed) return n;

                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression6652); if (state.failed) return n;

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // Generator.g:1330:7: id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )?
                    {
                    id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression6665); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression6667); if (state.failed) return n;

                    match(input,75,FOLLOW_75_in_primaryExpression6669); if (state.failed) return n;

                    // Generator.g:1330:31: ( LPAREN idExp= expression RPAREN )
                    // Generator.g:1330:33: LPAREN idExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression6673); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression6677);
                    idExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression6679); if (state.failed) return n;

                    }


                    if ( state.backtracking==0 ) { n = new ASTObjectByUseIdExpression(id2, (idExp!=null?idExp.n:null)); }

                    // Generator.g:1332:7: ( AT 'pre' )?
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==AT) ) {
                        int LA142_1 = input.LA(2);

                        if ( (LA142_1==118) ) {
                            alt142=1;
                        }
                    }
                    switch (alt142) {
                        case 1 :
                            // Generator.g:1332:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression6699); if (state.failed) return n;

                            match(input,118,FOLLOW_118_in_primaryExpression6701); if (state.failed) return n;

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
    // Generator.g:1336:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;


        Token objectName=null;

        try {
            // Generator.g:1337:3: ( AT objectName= IDENT )
            // Generator.g:1338:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference6727); if (state.failed) return n;

            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference6735); if (state.failed) return n;

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
    // Generator.g:1352:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExpQuery =null;

        ASTExpression nExpIterate =null;

        GeneratorParser.operationExpression_return nExpOperation =null;

        ASTTypeArgExpression nExpType =null;

        ASTInStateExpression nExpInState =null;


        try {
            // Generator.g:1353:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] )
            int alt144=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA144_1 = input.LA(2);

                if ( (((( input.LA(2) == LPAREN )&&( input.LA(2) == LPAREN ))&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))) ) {
                    alt144=1;
                }
                else if ( (true) ) {
                    alt144=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 144, 1, input);

                    throw nvae;

                }
                }
                break;
            case 99:
                {
                alt144=2;
                }
                break;
            case 107:
            case 110:
            case 111:
            case 123:
            case 124:
                {
                alt144=4;
                }
                break;
            case 109:
                {
                alt144=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 144, 0, input);

                throw nvae;

            }

            switch (alt144) {
                case 1 :
                    // Generator.g:1357:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }

                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }

                    pushFollow(FOLLOW_queryExpression_in_propertyCall6800);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpQuery; }

                    }
                    break;
                case 2 :
                    // Generator.g:1360:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall6813);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpIterate; }

                    }
                    break;
                case 3 :
                    // Generator.g:1361:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall6826);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExpOperation!=null?nExpOperation.n:null); }

                    }
                    break;
                case 4 :
                    // Generator.g:1362:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall6839);
                    nExpType=typeExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpType; }

                    }
                    break;
                case 5 :
                    // Generator.g:1363:7: nExpInState= inStateExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_inStateExpression_in_propertyCall6852);
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
    // Generator.g:1372:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTElemVarsDeclaration decls =null;

        GeneratorParser.expression_return nExp =null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // Generator.g:1373:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // Generator.g:1374:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression6887); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression6894); if (state.failed) return n;

            // Generator.g:1376:5: (decls= elemVarsDeclaration BAR )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==IDENT) ) {
                int LA145_1 = input.LA(2);

                if ( ((LA145_1 >= BAR && LA145_1 <= COLON)||LA145_1==COMMA) ) {
                    alt145=1;
                }
            }
            switch (alt145) {
                case 1 :
                    // Generator.g:1376:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression6905);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {decl = decls;}

                    match(input,BAR,FOLLOW_BAR_in_queryExpression6909); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_queryExpression6920);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression6926); if (state.failed) return n;

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
    // Generator.g:1390:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTElemVarsDeclaration decls =null;

        ASTVariableInitialization init =null;

        GeneratorParser.expression_return nExp =null;


        try {
            // Generator.g:1390:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // Generator.g:1391:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,99,FOLLOW_99_in_iterateExpression6958); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression6964); if (state.failed) return n;

            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression6972);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;

            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression6974); if (state.failed) return n;

            pushFollow(FOLLOW_variableInitialization_in_iterateExpression6982);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;

            match(input,BAR,FOLLOW_BAR_in_iterateExpression6984); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_iterateExpression6992);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression6998); if (state.failed) return n;

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
    // Generator.g:1412:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final GeneratorParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        GeneratorParser.operationExpression_return retval = new GeneratorParser.operationExpression_return();
        retval.start = input.LT(1);


        Token name=null;
        GeneratorParser.expression_return rolename =null;

        GeneratorParser.expression_return e =null;


        try {
            // Generator.g:1414:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // Generator.g:1415:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression7042); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }

            // Generator.g:1421:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==LBRACK) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // Generator.g:1421:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression7064); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_operationExpression7077);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    // Generator.g:1423:9: ( COMMA rolename= expression )*
                    loop146:
                    do {
                        int alt146=2;
                        int LA146_0 = input.LA(1);

                        if ( (LA146_0==COMMA) ) {
                            alt146=1;
                        }


                        switch (alt146) {
                    	case 1 :
                    	    // Generator.g:1423:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression7090); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_operationExpression7094);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    	    }
                    	    break;

                    	default :
                    	    break loop146;
                        }
                    } while (true);


                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression7106); if (state.failed) return retval;

                    // Generator.g:1426:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt148=2;
                    int LA148_0 = input.LA(1);

                    if ( (LA148_0==LBRACK) ) {
                        alt148=1;
                    }
                    switch (alt148) {
                        case 1 :
                            // Generator.g:1426:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression7123); if (state.failed) return retval;

                            pushFollow(FOLLOW_expression_in_operationExpression7138);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            // Generator.g:1428:11: ( COMMA rolename= expression )*
                            loop147:
                            do {
                                int alt147=2;
                                int LA147_0 = input.LA(1);

                                if ( (LA147_0==COMMA) ) {
                                    alt147=1;
                                }


                                switch (alt147) {
                            	case 1 :
                            	    // Generator.g:1428:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression7153); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression7157);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop147;
                                }
                            } while (true);


                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression7171); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            // Generator.g:1433:5: ( AT 'pre' )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==AT) ) {
                int LA150_1 = input.LA(2);

                if ( (LA150_1==118) ) {
                    alt150=1;
                }
            }
            switch (alt150) {
                case 1 :
                    // Generator.g:1433:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression7196); if (state.failed) return retval;

                    match(input,118,FOLLOW_118_in_operationExpression7198); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.setIsPre(); }

                    }
                    break;

            }


            // Generator.g:1435:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==LPAREN) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // Generator.g:1436:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression7223); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.hasParentheses(); }

                    // Generator.g:1437:7: (e= expression ( COMMA e= expression )* )?
                    int alt152=2;
                    int LA152_0 = input.LA(1);

                    if ( (LA152_0==AT||LA152_0==HASH||(LA152_0 >= IDENT && LA152_0 <= INT)||(LA152_0 >= LPAREN && LA152_0 <= MINUS)||LA152_0==PLUS||LA152_0==REAL||(LA152_0 >= STAR && LA152_0 <= STRING)||LA152_0==47||LA152_0==49||LA152_0==54||(LA152_0 >= 57 && LA152_0 <= 58)||LA152_0==60||LA152_0==62||LA152_0==89||LA152_0==92||(LA152_0 >= 99 && LA152_0 <= 100)||(LA152_0 >= 105 && LA152_0 <= 112)||(LA152_0 >= 123 && LA152_0 <= 124)||LA152_0==130) ) {
                        alt152=1;
                    }
                    switch (alt152) {
                        case 1 :
                            // Generator.g:1438:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression7244);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            // Generator.g:1439:7: ( COMMA e= expression )*
                            loop151:
                            do {
                                int alt151=2;
                                int LA151_0 = input.LA(1);

                                if ( (LA151_0==COMMA) ) {
                                    alt151=1;
                                }


                                switch (alt151) {
                            	case 1 :
                            	    // Generator.g:1439:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression7256); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression7260);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop151;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression7280); if (state.failed) return retval;

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
    // Generator.g:1446:1: inStateExpression[ASTExpression source, boolean followsArrow] returns [ASTInStateExpression n] : opToken= 'oclInState' LPAREN s= IDENT RPAREN ;
    public final ASTInStateExpression inStateExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTInStateExpression n = null;


        Token opToken=null;
        Token s=null;

        try {
            // Generator.g:1447:35: (opToken= 'oclInState' LPAREN s= IDENT RPAREN )
            // Generator.g:1448:4: opToken= 'oclInState' LPAREN s= IDENT RPAREN
            {
            opToken=(Token)match(input,109,FOLLOW_109_in_inStateExpression7317); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_inStateExpression7322); if (state.failed) return n;

            s=(Token)match(input,IDENT,FOLLOW_IDENT_in_inStateExpression7331); if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_inStateExpression7336); if (state.failed) return n;

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
    // Generator.g:1460:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;


        ASTType t =null;


         Token opToken = null; 
        try {
            // Generator.g:1463:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN )
            // Generator.g:1464:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) { opToken = input.LT(1); }

            if ( input.LA(1)==107||(input.LA(1) >= 110 && input.LA(1) <= 111)||(input.LA(1) >= 123 && input.LA(1) <= 124) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression7396); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_typeExpression7400);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression7402); if (state.failed) return n;

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
    // Generator.g:1475:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;


        Token var1=null;
        Token varN=null;
        ASTType t =null;

        ASTType tN =null;


        try {
            // Generator.g:1476:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // Generator.g:1477:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }

            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration7440); if (state.failed) return n;

            // Generator.g:1478:17: ( COLON t= type )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==COLON) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // Generator.g:1478:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration7443); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_elemVarsDeclaration7447);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}

            // Generator.g:1479:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop156:
            do {
                int alt156=2;
                int LA156_0 = input.LA(1);

                if ( (LA156_0==COMMA) ) {
                    alt156=1;
                }


                switch (alt156) {
            	case 1 :
            	    // Generator.g:1479:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration7457); if (state.failed) return n;

            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration7463); if (state.failed) return n;

            	    // Generator.g:1479:24: ( COLON tN= type )?
            	    int alt155=2;
            	    int LA155_0 = input.LA(1);

            	    if ( (LA155_0==COLON) ) {
            	        alt155=1;
            	    }
            	    switch (alt155) {
            	        case 1 :
            	            // Generator.g:1479:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration7466); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration7472);
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
            	    break loop156;
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
    // Generator.g:1487:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;


        Token name=null;
        ASTType t =null;

        GeneratorParser.expression_return e =null;


        try {
            // Generator.g:1488:5: (name= IDENT COLON t= type EQUAL e= expression )
            // Generator.g:1489:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization7500); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableInitialization7502); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableInitialization7506);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization7508); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_variableInitialization7512);
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
    // Generator.g:1498:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        GeneratorParser.expression_return cond =null;

        GeneratorParser.expression_return t =null;

        GeneratorParser.expression_return e =null;


        try {
            // Generator.g:1499:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // Generator.g:1500:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,92,FOLLOW_92_in_ifExpression7544); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression7548);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,128,FOLLOW_128_in_ifExpression7550); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression7554);
            t=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,84,FOLLOW_84_in_ifExpression7556); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression7560);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,86,FOLLOW_86_in_ifExpression7562); if (state.failed) return n;

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
    // Generator.g:1519:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR );
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
            // Generator.g:1520:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR )
            int alt157=12;
            switch ( input.LA(1) ) {
            case 130:
                {
                alt157=1;
                }
                break;
            case 89:
                {
                alt157=2;
                }
                break;
            case INT:
                {
                alt157=3;
                }
                break;
            case REAL:
                {
                alt157=4;
                }
                break;
            case STRING:
                {
                alt157=5;
                }
                break;
            case HASH:
                {
                alt157=6;
                }
                break;
            case IDENT:
                {
                alt157=7;
                }
                break;
            case 47:
            case 54:
            case 57:
            case 58:
                {
                int LA157_8 = input.LA(2);

                if ( (LA157_8==LPAREN) ) {
                    alt157=9;
                }
                else if ( (LA157_8==LBRACE) ) {
                    alt157=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 157, 8, input);

                    throw nvae;

                }
                }
                break;
            case 49:
            case 108:
                {
                alt157=9;
                }
                break;
            case 62:
            case 106:
            case 112:
                {
                alt157=10;
                }
                break;
            case 60:
                {
                alt157=11;
                }
                break;
            case STAR:
                {
                alt157=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 157, 0, input);

                throw nvae;

            }

            switch (alt157) {
                case 1 :
                    // Generator.g:1521:7: t= 'true'
                    {
                    t=(Token)match(input,130,FOLLOW_130_in_literal7601); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }

                    }
                    break;
                case 2 :
                    // Generator.g:1522:7: f= 'false'
                    {
                    f=(Token)match(input,89,FOLLOW_89_in_literal7615); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }

                    }
                    break;
                case 3 :
                    // Generator.g:1523:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal7628); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }

                    }
                    break;
                case 4 :
                    // Generator.g:1524:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal7643); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }

                    }
                    break;
                case 5 :
                    // Generator.g:1525:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal7657); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }

                    }
                    break;
                case 6 :
                    // Generator.g:1526:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal7667); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal7671); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}

                    }
                    break;
                case 7 :
                    // Generator.g:1527:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal7683); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal7685); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal7689); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }

                    }
                    break;
                case 8 :
                    // Generator.g:1528:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal7701);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nColIt; }

                    }
                    break;
                case 9 :
                    // Generator.g:1529:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal7713);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nEColIt; }

                    }
                    break;
                case 10 :
                    // Generator.g:1530:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal7725);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nUndLit; }

                    }
                    break;
                case 11 :
                    // Generator.g:1531:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal7737);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nTupleLit; }

                    }
                    break;
                case 12 :
                    // Generator.g:1532:7: un= STAR
                    {
                    un=(Token)match(input,STAR,FOLLOW_STAR_in_literal7749); if (state.failed) return n;

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
    // Generator.g:1540:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;


        ASTCollectionItem ci =null;


         Token op = null; 
        try {
            // Generator.g:1542:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // Generator.g:1543:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( input.LA(1)==47||input.LA(1)==54||(input.LA(1) >= 57 && input.LA(1) <= 58) ) {
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

            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral7816); if (state.failed) return n;

            // Generator.g:1547:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==AT||LA159_0==HASH||(LA159_0 >= IDENT && LA159_0 <= INT)||(LA159_0 >= LPAREN && LA159_0 <= MINUS)||LA159_0==PLUS||LA159_0==REAL||(LA159_0 >= STAR && LA159_0 <= STRING)||LA159_0==47||LA159_0==49||LA159_0==54||(LA159_0 >= 57 && LA159_0 <= 58)||LA159_0==60||LA159_0==62||LA159_0==89||LA159_0==92||(LA159_0 >= 99 && LA159_0 <= 100)||(LA159_0 >= 105 && LA159_0 <= 112)||(LA159_0 >= 123 && LA159_0 <= 124)||LA159_0==130) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // Generator.g:1548:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral7833);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addItem(ci); }

                    // Generator.g:1549:7: ( COMMA ci= collectionItem )*
                    loop158:
                    do {
                        int alt158=2;
                        int LA158_0 = input.LA(1);

                        if ( (LA158_0==COMMA) ) {
                            alt158=1;
                        }


                        switch (alt158) {
                    	case 1 :
                    	    // Generator.g:1549:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral7846); if (state.failed) return n;

                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral7850);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addItem(ci); }

                    	    }
                    	    break;

                    	default :
                    	    break loop158;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral7869); if (state.failed) return n;

            }

        }
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
    // Generator.g:1558:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;


        GeneratorParser.expression_return e =null;


         n = new ASTCollectionItem(); 
        try {
            // Generator.g:1560:5: (e= expression ( DOTDOT e= expression )? )
            // Generator.g:1561:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem7898);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setFirst((e!=null?e.n:null)); }

            // Generator.g:1562:5: ( DOTDOT e= expression )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==DOTDOT) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // Generator.g:1562:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem7909); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_collectionItem7913);
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
    // Generator.g:1572:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;


        ASTCollectionType t =null;


        try {
            // Generator.g:1573:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==108) ) {
                alt161=1;
            }
            else if ( (LA161_0==47||LA161_0==49||LA161_0==54||(LA161_0 >= 57 && LA161_0 <= 58)) ) {
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
                    // Generator.g:1574:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,108,FOLLOW_108_in_emptyCollectionLiteral7942); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral7944); if (state.failed) return n;

                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral7948);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral7950); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;
                case 2 :
                    // Generator.g:1577:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral7966);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral7968); if (state.failed) return n;

                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral7970); if (state.failed) return n;

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
    // Generator.g:1588:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;


        ASTType t =null;


        try {
            // Generator.g:1589:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt162=4;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt162=1;
                }
                break;
            case 62:
                {
                alt162=2;
                }
                break;
            case 106:
                {
                int LA162_3 = input.LA(2);

                if ( (LA162_3==LPAREN) ) {
                    alt162=3;
                }
                else if ( (LA162_3==EOF||(LA162_3 >= ARROW && LA162_3 <= BAR)||(LA162_3 >= COMMA && LA162_3 <= EQUAL)||(LA162_3 >= GREATER && LA162_3 <= GREATER_EQUAL)||LA162_3==IDENT||LA162_3==LBRACE||(LA162_3 >= LESS && LA162_3 <= LESS_EQUAL)||LA162_3==MINUS||(LA162_3 >= NOT_EQUAL && LA162_3 <= PLUS)||(LA162_3 >= RBRACE && LA162_3 <= RBRACK)||(LA162_3 >= RPAREN && LA162_3 <= SLASH)||LA162_3==STAR||LA162_3==63||LA162_3==66||(LA162_3 >= 68 && LA162_3 <= 70)||(LA162_3 >= 76 && LA162_3 <= 77)||(LA162_3 >= 82 && LA162_3 <= 88)||(LA162_3 >= 93 && LA162_3 <= 94)||LA162_3==98||LA162_3==102||(LA162_3 >= 114 && LA162_3 <= 118)||LA162_3==121||LA162_3==125||(LA162_3 >= 127 && LA162_3 <= 128)||LA162_3==135) ) {
                    alt162=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 162, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 162, 0, input);

                throw nvae;

            }

            switch (alt162) {
                case 1 :
                    // Generator.g:1590:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,112,FOLLOW_112_in_undefinedLiteral8000); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral8002); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral8006);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral8008); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 2 :
                    // Generator.g:1593:5: 'Undefined'
                    {
                    match(input,62,FOLLOW_62_in_undefinedLiteral8022); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;
                case 3 :
                    // Generator.g:1596:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,106,FOLLOW_106_in_undefinedLiteral8036); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral8038); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral8042);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral8044); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 4 :
                    // Generator.g:1599:5: 'null'
                    {
                    match(input,106,FOLLOW_106_in_undefinedLiteral8058); if (state.failed) return n;

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
    // Generator.g:1609:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;


        ASTTupleItem ti =null;


         List tiList = new ArrayList(); 
        try {
            // Generator.g:1611:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // Generator.g:1612:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,60,FOLLOW_60_in_tupleLiteral8097); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral8103); if (state.failed) return n;

            pushFollow(FOLLOW_tupleItem_in_tupleLiteral8111);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tiList.add(ti); }

            // Generator.g:1615:5: ( COMMA ti= tupleItem )*
            loop163:
            do {
                int alt163=2;
                int LA163_0 = input.LA(1);

                if ( (LA163_0==COMMA) ) {
                    alt163=1;
                }


                switch (alt163) {
            	case 1 :
            	    // Generator.g:1615:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral8122); if (state.failed) return n;

            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral8126);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tiList.add(ti); }

            	    }
            	    break;

            	default :
            	    break loop163;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral8137); if (state.failed) return n;

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
    // Generator.g:1623:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;


        Token name=null;
        ASTType t =null;

        GeneratorParser.expression_return e =null;


        try {
            // Generator.g:1624:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // Generator.g:1625:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem8168); if (state.failed) return n;

            // Generator.g:1626:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==COLON) ) {
                int LA164_1 = input.LA(2);

                if ( (synpred1_Generator()) ) {
                    alt164=1;
                }
                else if ( (true) ) {
                    alt164=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 164, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA164_0==EQUAL) ) {
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
                    // Generator.g:1629:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem8207); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_tupleItem8211);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem8213); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_tupleItem8217);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, (e!=null?e.n:null)); }

                    }
                    break;
                case 2 :
                    // Generator.g:1632:7: ( COLON | EQUAL ) e= expression
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


                    pushFollow(FOLLOW_expression_in_tupleItem8249);
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
    // Generator.g:1643:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;


        ASTSimpleType nTSimple =null;

        ASTCollectionType nTCollection =null;

        ASTTupleType nTTuple =null;


         Token tok = null; 
        try {
            // Generator.g:1645:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
            // Generator.g:1646:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }

            // Generator.g:1647:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            int alt165=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt165=1;
                }
                break;
            case 47:
            case 49:
            case 54:
            case 57:
            case 58:
                {
                alt165=2;
                }
                break;
            case 60:
                {
                alt165=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 165, 0, input);

                throw nvae;

            }

            switch (alt165) {
                case 1 :
                    // Generator.g:1648:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type8315);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 2 :
                    // Generator.g:1649:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type8327);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 3 :
                    // Generator.g:1650:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type8339);
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
    // Generator.g:1655:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;


        ASTType nT =null;


        try {
            // Generator.g:1656:5: (nT= type EOF )
            // Generator.g:1657:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly8371);
            nT=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_typeOnly8373); if (state.failed) return n;

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
    // Generator.g:1667:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;


        Token name=null;

        try {
            // Generator.g:1668:5: (name= IDENT )
            // Generator.g:1669:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType8401); if (state.failed) return n;

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
    // Generator.g:1677:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;


        ASTType elemType =null;


         Token op = null; 
        try {
            // Generator.g:1679:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // Generator.g:1680:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( input.LA(1)==47||input.LA(1)==49||input.LA(1)==54||(input.LA(1) >= 57 && input.LA(1) <= 58) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType8466); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_collectionType8470);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType8472); if (state.failed) return n;

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
    // Generator.g:1690:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;


        ASTTuplePart tp =null;


         List tpList = new ArrayList(); 
        try {
            // Generator.g:1692:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // Generator.g:1693:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,60,FOLLOW_60_in_tupleType8506); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType8508); if (state.failed) return n;

            pushFollow(FOLLOW_tuplePart_in_tupleType8517);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tpList.add(tp); }

            // Generator.g:1695:5: ( COMMA tp= tuplePart )*
            loop166:
            do {
                int alt166=2;
                int LA166_0 = input.LA(1);

                if ( (LA166_0==COMMA) ) {
                    alt166=1;
                }


                switch (alt166) {
            	case 1 :
            	    // Generator.g:1695:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType8528); if (state.failed) return n;

            	    pushFollow(FOLLOW_tuplePart_in_tupleType8532);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tpList.add(tp); }

            	    }
            	    break;

            	default :
            	    break loop166;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType8544); if (state.failed) return n;

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
    // Generator.g:1704:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Generator.g:1705:5: (name= IDENT COLON t= type )
            // Generator.g:1706:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart8576); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_tuplePart8578); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_tuplePart8582);
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
    // Generator.g:1745:1: statOnly returns [ASTStatement n] : s= stat EOF ;
    public final ASTStatement statOnly() throws RecognitionException {
        ASTStatement n = null;


        GeneratorParser.stat_return s =null;


        try {
            // Generator.g:1746:3: (s= stat EOF )
            // Generator.g:1747:3: s= stat EOF
            {
            pushFollow(FOLLOW_stat_in_statOnly8631);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_statOnly8635); if (state.failed) return n;

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
    // Generator.g:1757:1: stat returns [ASTStatement n] : s= singleStat ( SEMI s2= singleStat )* ;
    public final GeneratorParser.stat_return stat() throws RecognitionException {
        GeneratorParser.stat_return retval = new GeneratorParser.stat_return();
        retval.start = input.LT(1);


        ASTStatement s =null;

        ASTStatement s2 =null;



          ASTSequenceStatement seq = new ASTSequenceStatement(((Token)retval.start));

        try {
            // Generator.g:1761:3: (s= singleStat ( SEMI s2= singleStat )* )
            // Generator.g:1762:3: s= singleStat ( SEMI s2= singleStat )*
            {
            pushFollow(FOLLOW_singleStat_in_stat8670);
            s=singleStat();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {seq.addStatement(s);}

            // Generator.g:1763:3: ( SEMI s2= singleStat )*
            loop167:
            do {
                int alt167=2;
                int LA167_0 = input.LA(1);

                if ( (LA167_0==SEMI) ) {
                    alt167=1;
                }


                switch (alt167) {
            	case 1 :
            	    // Generator.g:1764:5: SEMI s2= singleStat
            	    {
            	    match(input,SEMI,FOLLOW_SEMI_in_stat8682); if (state.failed) return retval;

            	    pushFollow(FOLLOW_singleStat_in_stat8692);
            	    s2=singleStat();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {seq.addStatement(s2); }

            	    }
            	    break;

            	default :
            	    break loop167;
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
    // Generator.g:1776:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat );
    public final ASTStatement singleStat() throws RecognitionException {
        ASTStatement n = null;


        ASTEmptyStatement emp =null;

        GeneratorParser.statStartingWithExpr_return sse =null;

        ASTStatement vas =null;

        GeneratorParser.objCreateStat_return ocs =null;

        GeneratorParser.objDestroyStat_return ods =null;

        GeneratorParser.lnkInsStat_return lis =null;

        GeneratorParser.lnkDelStat_return lds =null;

        GeneratorParser.condExStat_return ces =null;

        GeneratorParser.iterStat_return its =null;

        GeneratorParser.whileStat_return whs =null;

        GeneratorParser.blockStat_return blk =null;


        try {
            // Generator.g:1777:5: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat )
            int alt168=11;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==EOF||LA168_0==SEMI||(LA168_0 >= 84 && LA168_0 <= 85)) ) {
                alt168=1;
            }
            else if ( (LA168_0==100) && (synpred2_Generator())) {
                alt168=2;
            }
            else if ( (LA168_0==MINUS||LA168_0==PLUS||LA168_0==105) && (synpred2_Generator())) {
                alt168=2;
            }
            else if ( (LA168_0==130) && (synpred2_Generator())) {
                alt168=2;
            }
            else if ( (LA168_0==89) && (synpred2_Generator())) {
                alt168=2;
            }
            else if ( (LA168_0==INT) && (synpred2_Generator())) {
                alt168=2;
            }
            else if ( (LA168_0==REAL) && (synpred2_Generator())) {
                alt168=2;
            }
            else if ( (LA168_0==STRING) && (synpred2_Generator())) {
                alt168=2;
            }
            else if ( (LA168_0==HASH) && (synpred2_Generator())) {
                alt168=2;
            }
            else if ( (LA168_0==IDENT) ) {
                int LA168_13 = input.LA(2);

                if ( (synpred2_Generator()) ) {
                    alt168=2;
                }
                else if ( (true) ) {
                    alt168=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 168, 13, input);

                    throw nvae;

                }
            }
            else if ( (LA168_0==47||LA168_0==54||(LA168_0 >= 57 && LA168_0 <= 58)) && (synpred2_Generator())) {
                alt168=2;
            }
            else if ( (LA168_0==108) && (synpred2_Generator())) {
                alt168=2;
            }
            else if ( (LA168_0==49) && (synpred2_Generator())) {
                alt168=2;
            }
            else if ( (LA168_0==112) && (synpred2_Generator())) {
                alt168=2;
            }
            else if ( (LA168_0==62) && (synpred2_Generator())) {
                alt168=2;
            }
            else if ( (LA168_0==106) && (synpred2_Generator())) {
                alt168=2;
            }
            else if ( (LA168_0==60) && (synpred2_Generator())) {
                alt168=2;
            }
            else if ( (LA168_0==STAR) && (synpred2_Generator())) {
                alt168=2;
            }
            else if ( (LA168_0==AT) && (synpred2_Generator())) {
                alt168=2;
            }
            else if ( (LA168_0==99) && (synpred2_Generator())) {
                alt168=2;
            }
            else if ( (LA168_0==107||(LA168_0 >= 110 && LA168_0 <= 111)||(LA168_0 >= 123 && LA168_0 <= 124)) && (synpred2_Generator())) {
                alt168=2;
            }
            else if ( (LA168_0==109) && (synpred2_Generator())) {
                alt168=2;
            }
            else if ( (LA168_0==LPAREN) && (synpred2_Generator())) {
                alt168=2;
            }
            else if ( (LA168_0==92) ) {
                int LA168_27 = input.LA(2);

                if ( (synpred2_Generator()) ) {
                    alt168=2;
                }
                else if ( (true) ) {
                    alt168=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 168, 27, input);

                    throw nvae;

                }
            }
            else if ( (LA168_0==103) ) {
                alt168=4;
            }
            else if ( (LA168_0==81) ) {
                alt168=5;
            }
            else if ( (LA168_0==96) ) {
                alt168=6;
            }
            else if ( (LA168_0==80) ) {
                alt168=7;
            }
            else if ( (LA168_0==90) ) {
                alt168=9;
            }
            else if ( (LA168_0==133) ) {
                alt168=10;
            }
            else if ( (LA168_0==72) ) {
                alt168=11;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 168, 0, input);

                throw nvae;

            }
            switch (alt168) {
                case 1 :
                    // Generator.g:1778:5: emp= emptyStat
                    {
                    pushFollow(FOLLOW_emptyStat_in_singleStat8732);
                    emp=emptyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = emp; }

                    }
                    break;
                case 2 :
                    // Generator.g:1780:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
                    {
                    pushFollow(FOLLOW_statStartingWithExpr_in_singleStat8758);
                    sse=statStartingWithExpr();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (sse!=null?sse.n:null); }

                    }
                    break;
                case 3 :
                    // Generator.g:1781:5: vas= varAssignStat
                    {
                    pushFollow(FOLLOW_varAssignStat_in_singleStat8770);
                    vas=varAssignStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = vas; }

                    }
                    break;
                case 4 :
                    // Generator.g:1782:5: ocs= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_singleStat8784);
                    ocs=objCreateStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ocs!=null?ocs.n:null); }

                    }
                    break;
                case 5 :
                    // Generator.g:1783:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleStat8798);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ods!=null?ods.n:null); }

                    }
                    break;
                case 6 :
                    // Generator.g:1784:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleStat8811);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lis!=null?lis.n:null); }

                    }
                    break;
                case 7 :
                    // Generator.g:1785:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleStat8828);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lds!=null?lds.n:null); }

                    }
                    break;
                case 8 :
                    // Generator.g:1786:5: ces= condExStat
                    {
                    pushFollow(FOLLOW_condExStat_in_singleStat8845);
                    ces=condExStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ces!=null?ces.n:null); }

                    }
                    break;
                case 9 :
                    // Generator.g:1787:5: its= iterStat
                    {
                    pushFollow(FOLLOW_iterStat_in_singleStat8862);
                    its=iterStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (its!=null?its.n:null); }

                    }
                    break;
                case 10 :
                    // Generator.g:1789:5: whs= whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_singleStat8884);
                    whs=whileStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (whs!=null?whs.n:null); }

                    }
                    break;
                case 11 :
                    // Generator.g:1790:5: blk= blockStat
                    {
                    pushFollow(FOLLOW_blockStat_in_singleStat8902);
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
    // Generator.g:1797:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
    public final ASTEmptyStatement emptyStat() throws RecognitionException {
        ASTEmptyStatement n = null;


        try {
            // Generator.g:1798:3: ( nothing )
            // Generator.g:1799:3: nothing
            {
            pushFollow(FOLLOW_nothing_in_emptyStat8929);
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
    // Generator.g:1804:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
    public final GeneratorParser.statStartingWithExpr_return statStartingWithExpr() throws RecognitionException {
        GeneratorParser.statStartingWithExpr_return retval = new GeneratorParser.statStartingWithExpr_return();
        retval.start = input.LT(1);


        ASTExpression expr =null;

        ASTAttributeAssignmentStatement aas =null;


        try {
            // Generator.g:1805:3: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
            // Generator.g:1806:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
            {
            pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr8955);
            expr=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            // Generator.g:1807:3: (aas= attAssignStat[$expr.n] )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==DOT) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // Generator.g:1808:5: aas= attAssignStat[$expr.n]
                    {
                    pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr8969);
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
    // Generator.g:1820:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
    public final ASTStatement varAssignStat() throws RecognitionException {
        ASTStatement n = null;


        Token varName=null;
        ASTRValue rVal =null;


        try {
            // Generator.g:1821:3: (varName= IDENT COLON_EQUAL rVal= rValue )
            // Generator.g:1822:3: varName= IDENT COLON_EQUAL rVal= rValue
            {
            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat9007); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat9011); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_varAssignStat9019);
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
    // Generator.g:1834:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
    public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
        ASTAttributeAssignmentStatement n = null;


        Token attName=null;
        ASTRValue r =null;


        try {
            // Generator.g:1835:3: ( DOT attName= IDENT COLON_EQUAL r= rValue )
            // Generator.g:1836:3: DOT attName= IDENT COLON_EQUAL r= rValue
            {
            match(input,DOT,FOLLOW_DOT_in_attAssignStat9043); if (state.failed) return n;

            attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat9052); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat9056); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_attAssignStat9064);
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
    // Generator.g:1848:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
    public final GeneratorParser.objCreateStat_return objCreateStat() throws RecognitionException {
        GeneratorParser.objCreateStat_return retval = new GeneratorParser.objCreateStat_return();
        retval.start = input.LT(1);


        ASTSimpleType ident =null;

        ASTExpression objName =null;

        GeneratorParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // Generator.g:1849:3: ( 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
            // Generator.g:1850:3: 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            {
            match(input,103,FOLLOW_103_in_objCreateStat9090); if (state.failed) return retval;

            pushFollow(FOLLOW_simpleType_in_objCreateStat9098);
            ident=simpleType();

            state._fsp--;
            if (state.failed) return retval;

            // Generator.g:1852:3: ( LPAREN (objName= inSoilExpression )? RPAREN )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==LPAREN) ) {
                alt171=1;
            }
            switch (alt171) {
                case 1 :
                    // Generator.g:1853:5: LPAREN (objName= inSoilExpression )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat9108); if (state.failed) return retval;

                    // Generator.g:1854:7: (objName= inSoilExpression )?
                    int alt170=2;
                    int LA170_0 = input.LA(1);

                    if ( (LA170_0==AT||LA170_0==HASH||(LA170_0 >= IDENT && LA170_0 <= INT)||(LA170_0 >= LPAREN && LA170_0 <= MINUS)||LA170_0==PLUS||LA170_0==REAL||(LA170_0 >= STAR && LA170_0 <= STRING)||LA170_0==47||LA170_0==49||LA170_0==54||(LA170_0 >= 57 && LA170_0 <= 58)||LA170_0==60||LA170_0==62||LA170_0==89||LA170_0==92||(LA170_0 >= 99 && LA170_0 <= 100)||(LA170_0 >= 105 && LA170_0 <= 112)||(LA170_0 >= 123 && LA170_0 <= 124)||LA170_0==130) ) {
                        alt170=1;
                    }
                    switch (alt170) {
                        case 1 :
                            // Generator.g:1854:8: objName= inSoilExpression
                            {
                            pushFollow(FOLLOW_inSoilExpression_in_objCreateStat9121);
                            objName=inSoilExpression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat9129); if (state.failed) return retval;

                    }
                    break;

            }


            // Generator.g:1858:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==73) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // Generator.g:1859:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
                    {
                    match(input,73,FOLLOW_73_in_objCreateStat9147); if (state.failed) return retval;

                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat9155); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat9169);
                    p=rValListMin2WithOptionalQualifiers();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat9177); if (state.failed) return retval;

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
    // Generator.g:1878:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
    public final GeneratorParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
        GeneratorParser.objDestroyStat_return retval = new GeneratorParser.objDestroyStat_return();
        retval.start = input.LT(1);


        List<ASTExpression> el =null;


        try {
            // Generator.g:1879:3: ( 'destroy' el= exprListMin1 )
            // Generator.g:1880:3: 'destroy' el= exprListMin1
            {
            match(input,81,FOLLOW_81_in_objDestroyStat9213); if (state.failed) return retval;

            pushFollow(FOLLOW_exprListMin1_in_objDestroyStat9221);
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
    // Generator.g:1899:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
    public final GeneratorParser.lnkInsStat_return lnkInsStat() throws RecognitionException {
        GeneratorParser.lnkInsStat_return retval = new GeneratorParser.lnkInsStat_return();
        retval.start = input.LT(1);


        Token ass=null;
        GeneratorParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // Generator.g:1900:3: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
            // Generator.g:1901:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
            {
            match(input,96,FOLLOW_96_in_lnkInsStat9247); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat9251); if (state.failed) return retval;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat9261);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat9265); if (state.failed) return retval;

            match(input,97,FOLLOW_97_in_lnkInsStat9269); if (state.failed) return retval;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat9277); if (state.failed) return retval;

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
    // Generator.g:1911:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
    public final GeneratorParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
        GeneratorParser.rValListMin2WithOptionalQualifiers_return retval = new GeneratorParser.rValListMin2WithOptionalQualifiers_return();
        retval.start = input.LT(1);


        ASTRValue r =null;

        List<ASTRValue> qualifierValues =null;



          retval.participans = new ArrayList<ASTRValue>();
          retval.qualifiers = new ArrayList<List<ASTRValue>>();
          List<ASTRValue> currentQualifiers = Collections.emptyList();

        try {
            // Generator.g:1917:3: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
            // Generator.g:1918:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers9306);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add(r); }

            // Generator.g:1919:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==LBRACE) ) {
                alt173=1;
            }
            switch (alt173) {
                case 1 :
                    // Generator.g:1920:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers9317); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers9326);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers9333); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers9349); if (state.failed) return retval;

            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers9360);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add(r); }

            // Generator.g:1932:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==LBRACE) ) {
                alt174=1;
            }
            switch (alt174) {
                case 1 :
                    // Generator.g:1933:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers9371); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers9380);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers9387); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            // Generator.g:1942:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            loop176:
            do {
                int alt176=2;
                int LA176_0 = input.LA(1);

                if ( (LA176_0==COMMA) ) {
                    alt176=1;
                }


                switch (alt176) {
            	case 1 :
            	    // Generator.g:1943:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers9409); if (state.failed) return retval;

            	    pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers9424);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.participans.add(r); }

            	    // Generator.g:1947:5: ( LBRACE qualifierValues= rValList RBRACE )?
            	    int alt175=2;
            	    int LA175_0 = input.LA(1);

            	    if ( (LA175_0==LBRACE) ) {
            	        alt175=1;
            	    }
            	    switch (alt175) {
            	        case 1 :
            	            // Generator.g:1948:6: LBRACE qualifierValues= rValList RBRACE
            	            {
            	            match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers9444); if (state.failed) return retval;

            	            pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers9455);
            	            qualifierValues=rValList();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

            	            match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers9464); if (state.failed) return retval;

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
            	    break loop176;
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
    // Generator.g:1963:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
    public final GeneratorParser.lnkDelStat_return lnkDelStat() throws RecognitionException {
        GeneratorParser.lnkDelStat_return retval = new GeneratorParser.lnkDelStat_return();
        retval.start = input.LT(1);


        Token ass=null;
        GeneratorParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // Generator.g:1964:3: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
            // Generator.g:1965:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
            {
            match(input,80,FOLLOW_80_in_lnkDelStat9505); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat9509); if (state.failed) return retval;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat9519);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat9523); if (state.failed) return retval;

            match(input,91,FOLLOW_91_in_lnkDelStat9527); if (state.failed) return retval;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat9536); if (state.failed) return retval;

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
    // Generator.g:1979:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' ;
    public final GeneratorParser.condExStat_return condExStat() throws RecognitionException {
        GeneratorParser.condExStat_return retval = new GeneratorParser.condExStat_return();
        retval.start = input.LT(1);


        ASTExpression con =null;

        ASTStatement ts =null;

        ASTStatement es =null;



          ASTStatement elseStat = new ASTEmptyStatement();

        try {
            // Generator.g:1983:3: ( 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' )
            // Generator.g:1984:3: 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end'
            {
            match(input,92,FOLLOW_92_in_condExStat9567); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_condExStat9576);
            con=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,128,FOLLOW_128_in_condExStat9580); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat9589);
            ts=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            // Generator.g:1988:3: ( 'else' es= statOrImplicitBlock )?
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==84) ) {
                alt177=1;
            }
            switch (alt177) {
                case 1 :
                    // Generator.g:1989:5: 'else' es= statOrImplicitBlock
                    {
                    match(input,84,FOLLOW_84_in_condExStat9600); if (state.failed) return retval;

                    pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat9612);
                    es=statOrImplicitBlock();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { elseStat = es; }

                    }
                    break;

            }


            match(input,85,FOLLOW_85_in_condExStat9624); if (state.failed) return retval;

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
    // Generator.g:2000:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final GeneratorParser.iterStat_return iterStat() throws RecognitionException {
        GeneratorParser.iterStat_return retval = new GeneratorParser.iterStat_return();
        retval.start = input.LT(1);


        Token var=null;
        ASTExpression set =null;

        ASTStatement s =null;


        try {
            // Generator.g:2001:3: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // Generator.g:2002:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,90,FOLLOW_90_in_iterStat9649); if (state.failed) return retval;

            var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat9657); if (state.failed) return retval;

            match(input,94,FOLLOW_94_in_iterStat9661); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_iterStat9669);
            set=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,83,FOLLOW_83_in_iterStat9673); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_iterStat9681);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            match(input,85,FOLLOW_85_in_iterStat9686); if (state.failed) return retval;

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
    // Generator.g:2017:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final GeneratorParser.whileStat_return whileStat() throws RecognitionException {
        GeneratorParser.whileStat_return retval = new GeneratorParser.whileStat_return();
        retval.start = input.LT(1);


        ASTExpression cond =null;

        ASTStatement s =null;


        try {
            // Generator.g:2018:3: ( 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // Generator.g:2019:3: 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,133,FOLLOW_133_in_whileStat9712); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_whileStat9720);
            cond=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,83,FOLLOW_83_in_whileStat9724); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_whileStat9732);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            match(input,85,FOLLOW_85_in_whileStat9737); if (state.failed) return retval;

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
    // Generator.g:2031:1: blockStat returns [ASTBlockStatement n] : 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' ;
    public final GeneratorParser.blockStat_return blockStat() throws RecognitionException {
        GeneratorParser.blockStat_return retval = new GeneratorParser.blockStat_return();
        retval.start = input.LT(1);


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        GeneratorParser.stat_return s =null;



          retval.n = new ASTBlockStatement(((Token)retval.start), org.tzi.use.config.Options.explicitVariableDeclarations);

        try {
            // Generator.g:2035:2: ( 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' )
            // Generator.g:2036:2: 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end'
            {
            match(input,72,FOLLOW_72_in_blockStat9767); if (state.failed) return retval;

            // Generator.g:2037:2: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )?
            int alt179=2;
            int LA179_0 = input.LA(1);

            if ( (LA179_0==79) ) {
                alt179=1;
            }
            switch (alt179) {
                case 1 :
                    // Generator.g:2037:4: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI
                    {
                    match(input,79,FOLLOW_79_in_blockStat9772); if (state.failed) return retval;

                    pushFollow(FOLLOW_variableDeclaration_in_blockStat9778);
                    vd=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}

                    // Generator.g:2037:73: ( COMMA vd1= variableDeclaration )*
                    loop178:
                    do {
                        int alt178=2;
                        int LA178_0 = input.LA(1);

                        if ( (LA178_0==COMMA) ) {
                            alt178=1;
                        }


                        switch (alt178) {
                    	case 1 :
                    	    // Generator.g:2037:75: COMMA vd1= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_blockStat9784); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_variableDeclaration_in_blockStat9790);
                    	    vd1=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}

                    	    }
                    	    break;

                    	default :
                    	    break loop178;
                        }
                    } while (true);


                    match(input,SEMI,FOLLOW_SEMI_in_blockStat9797); if (state.failed) return retval;

                    }
                    break;

            }


            pushFollow(FOLLOW_stat_in_blockStat9807);
            s=stat();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n.setBody((s!=null?s.n:null)); }

            match(input,85,FOLLOW_85_in_blockStat9812); if (state.failed) return retval;

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
    // Generator.g:2046:1: implicitBlockStat returns [ASTBlockStatement n] : 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat ;
    public final GeneratorParser.implicitBlockStat_return implicitBlockStat() throws RecognitionException {
        GeneratorParser.implicitBlockStat_return retval = new GeneratorParser.implicitBlockStat_return();
        retval.start = input.LT(1);


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        GeneratorParser.stat_return s =null;



          retval.n = new ASTBlockStatement(((Token)retval.start), false);

        try {
            // Generator.g:2050:3: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat )
            // Generator.g:2051:3: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat
            {
            match(input,79,FOLLOW_79_in_implicitBlockStat9838); if (state.failed) return retval;

            pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat9844);
            vd=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}

            // Generator.g:2051:72: ( COMMA vd1= variableDeclaration )*
            loop180:
            do {
                int alt180=2;
                int LA180_0 = input.LA(1);

                if ( (LA180_0==COMMA) ) {
                    alt180=1;
                }


                switch (alt180) {
            	case 1 :
            	    // Generator.g:2051:74: COMMA vd1= variableDeclaration
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_implicitBlockStat9850); if (state.failed) return retval;

            	    pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat9856);
            	    vd1=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}

            	    }
            	    break;

            	default :
            	    break loop180;
                }
            } while (true);


            match(input,SEMI,FOLLOW_SEMI_in_implicitBlockStat9863); if (state.failed) return retval;

            pushFollow(FOLLOW_stat_in_implicitBlockStat9871);
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
    // Generator.g:2055:1: statOrImplicitBlock returns [ASTStatement n] : (s1= stat |s2= implicitBlockStat ) ;
    public final ASTStatement statOrImplicitBlock() throws RecognitionException {
        ASTStatement n = null;


        GeneratorParser.stat_return s1 =null;

        GeneratorParser.implicitBlockStat_return s2 =null;


        try {
            // Generator.g:2056:3: ( (s1= stat |s2= implicitBlockStat ) )
            // Generator.g:2057:3: (s1= stat |s2= implicitBlockStat )
            {
            // Generator.g:2057:3: (s1= stat |s2= implicitBlockStat )
            int alt181=2;
            int LA181_0 = input.LA(1);

            if ( (LA181_0==AT||LA181_0==HASH||(LA181_0 >= IDENT && LA181_0 <= INT)||(LA181_0 >= LPAREN && LA181_0 <= MINUS)||LA181_0==PLUS||LA181_0==REAL||LA181_0==SEMI||(LA181_0 >= STAR && LA181_0 <= STRING)||LA181_0==47||LA181_0==49||LA181_0==54||(LA181_0 >= 57 && LA181_0 <= 58)||LA181_0==60||LA181_0==62||LA181_0==72||(LA181_0 >= 80 && LA181_0 <= 81)||(LA181_0 >= 84 && LA181_0 <= 85)||(LA181_0 >= 89 && LA181_0 <= 90)||LA181_0==92||LA181_0==96||(LA181_0 >= 99 && LA181_0 <= 100)||LA181_0==103||(LA181_0 >= 105 && LA181_0 <= 112)||(LA181_0 >= 123 && LA181_0 <= 124)||LA181_0==130||LA181_0==133) ) {
                alt181=1;
            }
            else if ( (LA181_0==79) ) {
                alt181=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 181, 0, input);

                throw nvae;

            }
            switch (alt181) {
                case 1 :
                    // Generator.g:2057:4: s1= stat
                    {
                    pushFollow(FOLLOW_stat_in_statOrImplicitBlock9894);
                    s1=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s1!=null?s1.n:null); }

                    }
                    break;
                case 2 :
                    // Generator.g:2057:31: s2= implicitBlockStat
                    {
                    pushFollow(FOLLOW_implicitBlockStat_in_statOrImplicitBlock9904);
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
    // Generator.g:2071:1: nothing :;
    public final void nothing() throws RecognitionException {
        try {
            // Generator.g:2072:1: ()
            // Generator.g:2073:1: 
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
    // Generator.g:2079:1: rValue returns [ASTRValue n] : (e= inSoilExpression |oc= objCreateStat );
    public final ASTRValue rValue() throws RecognitionException {
        ASTRValue n = null;


        ASTExpression e =null;

        GeneratorParser.objCreateStat_return oc =null;


        try {
            // Generator.g:2080:5: (e= inSoilExpression |oc= objCreateStat )
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==AT||LA182_0==HASH||(LA182_0 >= IDENT && LA182_0 <= INT)||(LA182_0 >= LPAREN && LA182_0 <= MINUS)||LA182_0==PLUS||LA182_0==REAL||(LA182_0 >= STAR && LA182_0 <= STRING)||LA182_0==47||LA182_0==49||LA182_0==54||(LA182_0 >= 57 && LA182_0 <= 58)||LA182_0==60||LA182_0==62||LA182_0==89||LA182_0==92||(LA182_0 >= 99 && LA182_0 <= 100)||(LA182_0 >= 105 && LA182_0 <= 112)||(LA182_0 >= 123 && LA182_0 <= 124)||LA182_0==130) ) {
                alt182=1;
            }
            else if ( (LA182_0==103) ) {
                alt182=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 182, 0, input);

                throw nvae;

            }
            switch (alt182) {
                case 1 :
                    // Generator.g:2081:5: e= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_rValue9950);
                    e=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRValueExpressionOrOpCall(e); }

                    }
                    break;
                case 2 :
                    // Generator.g:2082:5: oc= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_rValue9962);
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
    // Generator.g:2095:1: rValList returns [List<ASTRValue> n] : ( nothing |rl= rValListMin1 );
    public final List<ASTRValue> rValList() throws RecognitionException {
        List<ASTRValue> n = null;


        List<ASTRValue> rl =null;


        try {
            // Generator.g:2096:3: ( nothing |rl= rValListMin1 )
            int alt183=2;
            int LA183_0 = input.LA(1);

            if ( (LA183_0==RBRACE) ) {
                alt183=1;
            }
            else if ( (LA183_0==AT||LA183_0==HASH||(LA183_0 >= IDENT && LA183_0 <= INT)||(LA183_0 >= LPAREN && LA183_0 <= MINUS)||LA183_0==PLUS||LA183_0==REAL||(LA183_0 >= STAR && LA183_0 <= STRING)||LA183_0==47||LA183_0==49||LA183_0==54||(LA183_0 >= 57 && LA183_0 <= 58)||LA183_0==60||LA183_0==62||LA183_0==89||LA183_0==92||(LA183_0 >= 99 && LA183_0 <= 100)||LA183_0==103||(LA183_0 >= 105 && LA183_0 <= 112)||(LA183_0 >= 123 && LA183_0 <= 124)||LA183_0==130) ) {
                alt183=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 183, 0, input);

                throw nvae;

            }
            switch (alt183) {
                case 1 :
                    // Generator.g:2097:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_rValList9985);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = Collections.<ASTRValue>emptyList(); }

                    }
                    break;
                case 2 :
                    // Generator.g:2100:3: rl= rValListMin1
                    {
                    pushFollow(FOLLOW_rValListMin1_in_rValList10012);
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
    // Generator.g:2108:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin1() throws RecognitionException {
        List<ASTRValue> n = null;


        ASTRValue r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // Generator.g:2112:3: (r= rValue ( COMMA r= rValue )* )
            // Generator.g:2113:3: r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin110045);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            // Generator.g:2115:3: ( COMMA r= rValue )*
            loop184:
            do {
                int alt184=2;
                int LA184_0 = input.LA(1);

                if ( (LA184_0==COMMA) ) {
                    alt184=1;
                }


                switch (alt184) {
            	case 1 :
            	    // Generator.g:2116:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin110059); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin110069);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add(r); }

            	    }
            	    break;

            	default :
            	    break loop184;
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
    // Generator.g:2126:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin2() throws RecognitionException {
        List<ASTRValue> n = null;


        ASTRValue r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // Generator.g:2130:3: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
            // Generator.g:2131:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin210108);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin210116); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_rValListMin210124);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            // Generator.g:2136:3: ( COMMA r= rValue )*
            loop185:
            do {
                int alt185=2;
                int LA185_0 = input.LA(1);

                if ( (LA185_0==COMMA) ) {
                    alt185=1;
                }


                switch (alt185) {
            	case 1 :
            	    // Generator.g:2137:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin210138); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin210148);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add(r); }

            	    }
            	    break;

            	default :
            	    break loop185;
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
    // Generator.g:2147:1: inSoilExpression returns [ASTExpression n] : e= expression ;
    public final ASTExpression inSoilExpression() throws RecognitionException {
        ASTExpression n = null;


        GeneratorParser.expression_return e =null;


        try {
            // Generator.g:2148:3: (e= expression )
            // Generator.g:2149:3: e= expression
            {
            pushFollow(FOLLOW_expression_in_inSoilExpression10182);
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
    // Generator.g:2158:1: exprList returns [List<ASTExpression> n] : ( nothing |el= exprListMin1 );
    public final List<ASTExpression> exprList() throws RecognitionException {
        List<ASTExpression> n = null;


        List<ASTExpression> el =null;


        try {
            // Generator.g:2159:3: ( nothing |el= exprListMin1 )
            int alt186=2;
            int LA186_0 = input.LA(1);

            if ( (LA186_0==EOF) ) {
                alt186=1;
            }
            else if ( (LA186_0==AT||LA186_0==HASH||(LA186_0 >= IDENT && LA186_0 <= INT)||(LA186_0 >= LPAREN && LA186_0 <= MINUS)||LA186_0==PLUS||LA186_0==REAL||(LA186_0 >= STAR && LA186_0 <= STRING)||LA186_0==47||LA186_0==49||LA186_0==54||(LA186_0 >= 57 && LA186_0 <= 58)||LA186_0==60||LA186_0==62||LA186_0==89||LA186_0==92||(LA186_0 >= 99 && LA186_0 <= 100)||(LA186_0 >= 105 && LA186_0 <= 112)||(LA186_0 >= 123 && LA186_0 <= 124)||LA186_0==130) ) {
                alt186=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 186, 0, input);

                throw nvae;

            }
            switch (alt186) {
                case 1 :
                    // Generator.g:2160:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_exprList10211);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<ASTExpression>(); }

                    }
                    break;
                case 2 :
                    // Generator.g:2163:3: el= exprListMin1
                    {
                    pushFollow(FOLLOW_exprListMin1_in_exprList10229);
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
    // Generator.g:2171:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin1() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // Generator.g:2175:3: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // Generator.g:2176:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin110262);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // Generator.g:2178:3: ( COMMA e= inSoilExpression )*
            loop187:
            do {
                int alt187=2;
                int LA187_0 = input.LA(1);

                if ( (LA187_0==COMMA) ) {
                    alt187=1;
                }


                switch (alt187) {
            	case 1 :
            	    // Generator.g:2179:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin110277); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin110287);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            	    }
            	    break;

            	default :
            	    break loop187;
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
    // Generator.g:2189:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin2() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // Generator.g:2193:3: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // Generator.g:2194:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin210327);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            match(input,COMMA,FOLLOW_COMMA_in_exprListMin210335); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_exprListMin210343);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // Generator.g:2199:3: ( COMMA e= inSoilExpression )*
            loop188:
            do {
                int alt188=2;
                int LA188_0 = input.LA(1);

                if ( (LA188_0==COMMA) ) {
                    alt188=1;
                }


                switch (alt188) {
            	case 1 :
            	    // Generator.g:2200:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin210357); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin210367);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            	    }
            	    break;

            	default :
            	    break loop188;
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
    // Generator.g:2210:1: identList returns [List<String> n] : ( nothing |il= identListMin1 );
    public final List<String> identList() throws RecognitionException {
        List<String> n = null;


        List<String> il =null;


        try {
            // Generator.g:2211:3: ( nothing |il= identListMin1 )
            int alt189=2;
            int LA189_0 = input.LA(1);

            if ( (LA189_0==EOF||LA189_0==RBRACE||LA189_0==SEMI||(LA189_0 >= 84 && LA189_0 <= 85)) ) {
                alt189=1;
            }
            else if ( (LA189_0==IDENT) ) {
                alt189=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 189, 0, input);

                throw nvae;

            }
            switch (alt189) {
                case 1 :
                    // Generator.g:2212:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_identList10397);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<String>(); }

                    }
                    break;
                case 2 :
                    // Generator.g:2215:3: il= identListMin1
                    {
                    pushFollow(FOLLOW_identListMin1_in_identList10414);
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
    // Generator.g:2223:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
    public final List<String> identListMin1() throws RecognitionException {
        List<String> n = null;


        Token id=null;


          n = new ArrayList<String>();

        try {
            // Generator.g:2227:3: (id= IDENT ( COMMA id= IDENT )* )
            // Generator.g:2228:3: id= IDENT ( COMMA id= IDENT )*
            {
            id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin110448); if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((id!=null?id.getText():null)); }

            // Generator.g:2230:3: ( COMMA id= IDENT )*
            loop190:
            do {
                int alt190=2;
                int LA190_0 = input.LA(1);

                if ( (LA190_0==COMMA) ) {
                    alt190=1;
                }


                switch (alt190) {
            	case 1 :
            	    // Generator.g:2231:5: COMMA id= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identListMin110462); if (state.failed) return n;

            	    id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin110472); if (state.failed) return n;

            	    if ( state.backtracking==0 ) {
            	        n.add((id!=null?id.getText():null)); }

            	    }
            	    break;

            	default :
            	    break loop190;
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

    // $ANTLR start synpred1_Generator
    public final void synpred1_Generator_fragment() throws RecognitionException {
        // Generator.g:1629:7: ( COLON type EQUAL )
        // Generator.g:1629:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred1_Generator8198); if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred1_Generator8200);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_Generator8202); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Generator

    // $ANTLR start synpred2_Generator
    public final void synpred2_Generator_fragment() throws RecognitionException {
        // Generator.g:1780:5: ( statStartingWithExpr )
        // Generator.g:1780:6: statStartingWithExpr
        {
        pushFollow(FOLLOW_statStartingWithExpr_in_synpred2_Generator8750);
        statStartingWithExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Generator

    // Delegated rules

    public final boolean synpred1_Generator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Generator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Generator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Generator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA82 dfa82 = new DFA82(this);
    static final String DFA21_eotS =
        "\45\uffff";
    static final String DFA21_eofS =
        "\1\1\44\uffff";
    static final String DFA21_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\23\2\uffff\1\25\3\15\1\27\1\12\1\35"+
        "\1\24\1\5\1\uffff\1\15\1\23\1\5\5\23\1\35\1\15\2\23\1\13\1\12\1"+
        "\35\2\27\1\62\1\12\1\23";
    static final String DFA21_maxS =
        "\1\146\1\uffff\1\75\1\uffff\1\23\2\uffff\1\31\3\15\1\175\1\44\1"+
        "\35\1\107\1\73\1\uffff\1\15\1\23\1\127\5\23\1\35\1\15\2\23\1\13"+
        "\1\44\1\35\2\175\1\75\1\44\1\23";
    static final String DFA21_acceptS =
        "\1\uffff\1\5\1\uffff\1\1\1\uffff\1\3\1\4\11\uffff\1\2\24\uffff";
    static final String DFA21_specialS =
        "\45\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\2\15\uffff\1\4\53\uffff\1\3\4\uffff\2\3\6\uffff\1\5\12\uffff"+
            "\1\6\16\uffff\1\1",
            "",
            "\1\7\36\uffff\1\10\5\uffff\1\11\4\uffff\1\12",
            "",
            "\1\13",
            "",
            "",
            "\1\3\3\uffff\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\3\56\uffff\1\3\2\uffff\1\20\2\uffff\1\3\10\uffff\1\3\34"+
            "\uffff\1\3\12\uffff\1\3",
            "\1\22\10\uffff\1\21\20\uffff\1\23",
            "\1\24",
            "\1\26\62\uffff\1\25",
            "\1\30\55\uffff\1\27\7\uffff\1\27",
            "",
            "\1\31",
            "\1\32",
            "\1\2\15\uffff\1\33\53\uffff\1\3\4\uffff\2\3\21\uffff\1\6",
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
            "\1\3\56\uffff\1\3\2\uffff\1\20\2\uffff\1\3\10\uffff\1\3\34"+
            "\uffff\1\3\12\uffff\1\3",
            "\1\3\56\uffff\1\3\2\uffff\1\20\2\uffff\1\3\10\uffff\1\3\34"+
            "\uffff\1\3\12\uffff\1\3",
            "\1\44\5\uffff\1\44\4\uffff\1\44",
            "\1\22\31\uffff\1\23",
            "\1\34"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "()* loopback of 403:5: ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )*";
        }
    }
    static final String DFA20_eotS =
        "\30\uffff";
    static final String DFA20_eofS =
        "\1\1\4\uffff\1\10\22\uffff";
    static final String DFA20_minS =
        "\1\5\1\uffff\2\23\1\25\1\5\1\41\2\uffff\3\15\1\23\1\35\1\24\1\5"+
        "\4\41\1\23\1\13\1\62\1\41";
    static final String DFA20_maxS =
        "\1\146\1\uffff\1\75\1\23\1\31\1\146\1\75\2\uffff\3\15\1\115\1\35"+
        "\1\107\1\73\4\75\1\23\1\13\2\75";
    static final String DFA20_acceptS =
        "\1\uffff\1\3\5\uffff\1\2\1\1\17\uffff";
    static final String DFA20_specialS =
        "\30\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\2\15\uffff\1\1\53\uffff\1\1\4\uffff\2\1\6\uffff\1\1\1\3\11"+
            "\uffff\1\1\16\uffff\1\1",
            "",
            "\1\4\36\uffff\1\1\5\uffff\1\1\4\uffff\1\1",
            "\1\5",
            "\1\6\3\uffff\1\1",
            "\1\10\1\uffff\1\10\1\7\1\uffff\1\10\10\uffff\1\10\53\uffff"+
            "\1\10\4\uffff\2\10\6\uffff\2\10\11\uffff\2\10\11\uffff\1\10"+
            "\3\uffff\1\10",
            "\1\14\20\uffff\1\11\5\uffff\1\12\4\uffff\1\13",
            "",
            "",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\1\71\uffff\1\10",
            "\1\20",
            "\1\22\62\uffff\1\21",
            "\1\24\55\uffff\1\23\7\uffff\1\23",
            "\1\14\20\uffff\1\11\5\uffff\1\12\4\uffff\1\13",
            "\1\14\20\uffff\1\11\5\uffff\1\12\4\uffff\1\13",
            "\1\14\20\uffff\1\11\5\uffff\1\12\4\uffff\1\13",
            "\1\14\20\uffff\1\11\5\uffff\1\12\4\uffff\1\13",
            "\1\25",
            "\1\26",
            "\1\27\5\uffff\1\27\4\uffff\1\27",
            "\1\14\20\uffff\1\11\5\uffff\1\12\4\uffff\1\13"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "()* loopback of 406:11: (cons= invariant |ppc= prePost )*";
        }
    }
    static final String DFA54_eotS =
        "\16\uffff";
    static final String DFA54_eofS =
        "\16\uffff";
    static final String DFA54_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\31\1\12\1\15\1\23\1\5\1\35\1\15\1\12"+
        "\1\35\1\12";
    static final String DFA54_maxS =
        "\1\175\1\uffff\1\23\1\uffff\1\31\1\44\1\15\1\23\1\166\1\35\1\15"+
        "\1\44\1\35\1\44";
    static final String DFA54_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\12\uffff";
    static final String DFA54_specialS =
        "\16\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\2\15\uffff\1\1\21\uffff\1\1\46\uffff\1\1\10\uffff\1\1\37"+
            "\uffff\2\3\6\uffff\1\1",
            "",
            "\1\4",
            "",
            "\1\5",
            "\1\7\10\uffff\1\6\20\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\2\15\uffff\1\1\141\uffff\2\3",
            "\1\13",
            "\1\14",
            "\1\7\31\uffff\1\10",
            "\1\15",
            "\1\7\31\uffff\1\10"
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "()* loopback of 588:5: (ppc= prePostClause )*";
        }
    }
    static final String DFA76_eotS =
        "\36\uffff";
    static final String DFA76_eofS =
        "\1\1\35\uffff";
    static final String DFA76_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\25\3\15\1\12\1\35\1\24\1\5\1\15\1\23"+
        "\5\5\1\23\1\35\1\15\1\23\1\13\1\12\1\35\1\25\1\62\1\12\1\5";
    static final String DFA76_maxS =
        "\1\146\1\uffff\1\75\1\uffff\1\31\3\15\1\44\1\35\1\107\1\73\1\15"+
        "\1\23\5\142\1\23\1\35\1\15\1\75\1\13\1\44\1\35\1\31\1\75\1\44\1"+
        "\142";
    static final String DFA76_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\32\uffff";
    static final String DFA76_specialS =
        "\36\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\2\15\uffff\1\1\53\uffff\1\1\4\uffff\2\1\6\uffff\2\1\11\uffff"+
            "\1\1\1\3\11\uffff\1\3\3\uffff\1\1",
            "",
            "\1\4\36\uffff\1\5\5\uffff\1\6\4\uffff\1\7",
            "",
            "\1\1\3\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\15\10\uffff\1\14\20\uffff\1\16",
            "\1\17",
            "\1\21\62\uffff\1\20",
            "\1\23\55\uffff\1\22\7\uffff\1\22",
            "\1\24",
            "\1\25",
            "\1\26\15\uffff\1\1\53\uffff\1\1\4\uffff\2\1\21\uffff\1\1\12"+
            "\uffff\1\3",
            "\1\3\15\uffff\1\1\116\uffff\1\3",
            "\1\3\15\uffff\1\1\116\uffff\1\3",
            "\1\3\15\uffff\1\1\116\uffff\1\3",
            "\1\3\15\uffff\1\1\116\uffff\1\3",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32\36\uffff\1\1\5\uffff\1\1\4\uffff\1\1",
            "\1\33",
            "\1\15\31\uffff\1\16",
            "\1\34",
            "\1\1\3\uffff\1\10",
            "\1\35\5\uffff\1\35\4\uffff\1\35",
            "\1\15\31\uffff\1\16",
            "\1\3\15\uffff\1\1\116\uffff\1\3"
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "()* loopback of 754:5: (inv= invariantClause )*";
        }
    }
    static final String DFA82_eotS =
        "\20\uffff";
    static final String DFA82_eofS =
        "\1\1\17\uffff";
    static final String DFA82_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\25\1\12\1\15\1\23\1\5\1\35\1\15\1\23"+
        "\1\12\1\35\1\25\1\12";
    static final String DFA82_maxS =
        "\1\166\1\uffff\1\75\1\uffff\1\31\1\44\1\15\1\23\1\166\1\35\1\15"+
        "\1\75\1\44\1\35\1\31\1\44";
    static final String DFA82_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\14\uffff";
    static final String DFA82_specialS =
        "\20\uffff}>";
    static final String[] DFA82_transitionS = {
            "\1\2\15\uffff\1\1\53\uffff\1\1\4\uffff\2\1\6\uffff\2\1\11\uffff"+
            "\1\1\16\uffff\1\1\16\uffff\2\3",
            "",
            "\1\4\36\uffff\1\1\5\uffff\1\1\4\uffff\1\1",
            "",
            "\1\1\3\uffff\1\5",
            "\1\7\10\uffff\1\6\20\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\13\15\uffff\1\1\53\uffff\1\1\4\uffff\2\1\21\uffff\1\1\35"+
            "\uffff\2\3",
            "\1\14",
            "\1\15",
            "\1\16\36\uffff\1\1\5\uffff\1\1\4\uffff\1\1",
            "\1\7\31\uffff\1\10",
            "\1\17",
            "\1\1\3\uffff\1\5",
            "\1\7\31\uffff\1\10"
    };

    static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
    static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
    static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
    static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
    static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
    static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
    static final short[][] DFA82_transition;

    static {
        int numStates = DFA82_transitionS.length;
        DFA82_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
        }
    }

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = DFA82_eot;
            this.eof = DFA82_eof;
            this.min = DFA82_min;
            this.max = DFA82_max;
            this.accept = DFA82_accept;
            this.special = DFA82_special;
            this.transition = DFA82_transition;
        }
        public String getDescription() {
            return "()+ loopback of 783:5: (ppc= prePostClause )+";
        }
    }
 

    public static final BitSet FOLLOW_invariant_in_invariantListOnly80 = new BitSet(new long[]{0x0000000000000020L,0x0000000000002000L});
    public static final BitSet FOLLOW_EOF_in_invariantListOnly91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_in_procedureListOnly136 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_EOF_in_procedureListOnly151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_procedure179 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_procedure183 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_procedure185 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_variableDeclarationList_in_procedure189 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_procedure191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_procedure199 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_variableDeclarationList_in_procedure203 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_procedure205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_procedure214 = new BitSet(new long[]{0x0031400000480000L,0x0000000014200000L});
    public static final BitSet FOLLOW_instructionList_in_procedure218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_procedure220 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_procedure222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList260 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_variableDeclarationList271 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList275 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_instruction_in_instructionList319 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_instructionList321 = new BitSet(new long[]{0x0031400000480002L,0x0000000014000000L});
    public static final BitSet FOLLOW_variableAssignment_in_instruction356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeAssignment_in_instruction371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loop_in_instruction385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicInstruction_in_instruction402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifThenElse_in_instruction416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asslCall_in_instruction432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opEnter_in_instruction448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opExit_in_instruction465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_barrier_in_instruction482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variableAssignment513 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_variableAssignment515 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_valueInstruction_in_variableAssignment519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_attributeAssignment551 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_attributeAssignment553 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attributeAssignment557 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attributeAssignment565 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_valueInstruction_in_attributeAssignment569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_loop601 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_loop605 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_loop607 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_oclExpression_in_loop611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_loop613 = new BitSet(new long[]{0x0031400000480000L,0x0000000014200000L});
    public static final BitSet FOLLOW_instructionList_in_loop624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_loop626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ifThenElse662 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_oclExpression_in_ifThenElse666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_ifThenElse677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ifThenElse679 = new BitSet(new long[]{0x0031400000480000L,0x0000000014200000L});
    public static final BitSet FOLLOW_instructionList_in_ifThenElse683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ifThenElse685 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ifThenElse696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ifThenElse698 = new BitSet(new long[]{0x0031400000480000L,0x0000000014200000L});
    public static final BitSet FOLLOW_instructionList_in_ifThenElse702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ifThenElse704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicInstruction_in_valueInstruction744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_valueInstruction758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_atomicInstruction788 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_atomicInstruction792 = new BitSet(new long[]{0x0000001000480000L});
    public static final BitSet FOLLOW_instructionParameter_in_atomicInstruction806 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_atomicInstruction824 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_instructionParameter_in_atomicInstruction828 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_atomicInstruction876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_asslCall899 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_asslCall903 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_asslCall907 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_oclExpression_in_asslCall921 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_asslCall939 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_oclExpression_in_asslCall943 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_asslCall991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_opEnter1014 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_oclExpression_in_opEnter1018 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_opEnter1022 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_opEnter1026 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_oclExpression_in_opEnter1041 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_opEnter1059 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_oclExpression_in_opEnter1063 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_opEnter1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_opExit1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_instructionParameter1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrParameterIdent_in_instructionParameter1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_instrParameterIdent1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_oclExpression1231 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_oclExpression1235 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_oclExpression1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_barrier1265 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_barrier1270 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_IDENT_in_barrier1285 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_barrier1287 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_barrier1293 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_oclExpression_in_barrier1309 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_barrier1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedureCallOnly1345 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_procedureCallOnly1353 = new BitSet(new long[]{0x56428318861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_procedureCallOnly1364 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_procedureCallOnly1374 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_procedureCallOnly1378 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_procedureCallOnly1392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_procedureCallOnly1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_model1427 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_model1433 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_model1437 = new BitSet(new long[]{0x8000000000080020L,0x0000004000801030L});
    public static final BitSet FOLLOW_generalClassifierDefinition_in_model1449 = new BitSet(new long[]{0x8000000000080020L,0x0000004000801030L});
    public static final BitSet FOLLOW_associationDefinition_in_model1462 = new BitSet(new long[]{0x8000000000080020L,0x0000004000801030L});
    public static final BitSet FOLLOW_76_in_model1476 = new BitSet(new long[]{0x8000000000080020L,0x0000004000803030L});
    public static final BitSet FOLLOW_invariant_in_model1494 = new BitSet(new long[]{0x8000000000080020L,0x0000004000803030L});
    public static final BitSet FOLLOW_prePost_in_model1515 = new BitSet(new long[]{0x8000000000080020L,0x0000004000803030L});
    public static final BitSet FOLLOW_enumTypeDefinition_in_model1555 = new BitSet(new long[]{0x8000000000080020L,0x0000004000801030L});
    public static final BitSet FOLLOW_moduleExpr_in_model1573 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EOF_in_model1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_enumTypeDefinition1602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_enumTypeDefinition1608 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_enumTypeDefinition1612 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_enumTypeDefinition1614 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_enumTypeDefinition1618 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_enumTypeDefinition1620 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_enumTypeDefinition1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_generalClassifierDefinition1662 = new BitSet(new long[]{0x8000000000080020L,0x0000000000000030L});
    public static final BitSet FOLLOW_63_in_generalClassifierDefinition1670 = new BitSet(new long[]{0x0000000000080020L,0x0000000000000030L});
    public static final BitSet FOLLOW_classDefinition_in_generalClassifierDefinition1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_associationClassDefinition_in_generalClassifierDefinition1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signalDefinition_in_generalClassifierDefinition1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_annotation_in_classDefinition1835 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_line_annotation_in_classDefinition1841 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyClass_in_classDefinition1851 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_classDefinition1855 = new BitSet(new long[]{0x0000000000800000L,0x2004000000201040L});
    public static final BitSet FOLLOW_LESS_in_classDefinition1865 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_classDefinition1869 = new BitSet(new long[]{0x0000000000000000L,0x2004000000201040L});
    public static final BitSet FOLLOW_70_in_classDefinition1882 = new BitSet(new long[]{0x0000000000080020L,0x2004000000201000L});
    public static final BitSet FOLLOW_attributeDefinition_in_classDefinition1895 = new BitSet(new long[]{0x0000000000080020L,0x2004000000201000L});
    public static final BitSet FOLLOW_114_in_classDefinition1916 = new BitSet(new long[]{0x0000000000080020L,0x2000000000201000L});
    public static final BitSet FOLLOW_operationDefinition_in_classDefinition1929 = new BitSet(new long[]{0x0000000000080020L,0x2000000000201000L});
    public static final BitSet FOLLOW_76_in_classDefinition1950 = new BitSet(new long[]{0x0000000000000020L,0x2000000401200000L});
    public static final BitSet FOLLOW_invariantClause_in_classDefinition1970 = new BitSet(new long[]{0x0000000000000020L,0x2000000401200000L});
    public static final BitSet FOLLOW_125_in_classDefinition1996 = new BitSet(new long[]{0x0000000000000000L,0x0100000000200000L});
    public static final BitSet FOLLOW_stateMachine_in_classDefinition2016 = new BitSet(new long[]{0x0000000000000000L,0x0100000000200000L});
    public static final BitSet FOLLOW_85_in_classDefinition2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_associationClassDefinition2073 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationClassDefinition2099 = new BitSet(new long[]{0x0000000000880000L,0x2004000000201240L});
    public static final BitSet FOLLOW_LESS_in_associationClassDefinition2109 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_associationClassDefinition2113 = new BitSet(new long[]{0x0000000000080000L,0x2004000000201240L});
    public static final BitSet FOLLOW_73_in_associationClassDefinition2125 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition2133 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition2145 = new BitSet(new long[]{0x0000000000080020L,0x2004000000201040L});
    public static final BitSet FOLLOW_70_in_associationClassDefinition2165 = new BitSet(new long[]{0x0000000000080020L,0x2004000000201000L});
    public static final BitSet FOLLOW_attributeDefinition_in_associationClassDefinition2178 = new BitSet(new long[]{0x0000000000080020L,0x2004000000201000L});
    public static final BitSet FOLLOW_114_in_associationClassDefinition2199 = new BitSet(new long[]{0x0000000000080020L,0x2000000000201000L});
    public static final BitSet FOLLOW_operationDefinition_in_associationClassDefinition2212 = new BitSet(new long[]{0x0000000000080020L,0x2000000000201000L});
    public static final BitSet FOLLOW_76_in_associationClassDefinition2233 = new BitSet(new long[]{0x0000000000080020L,0x2000000401200000L});
    public static final BitSet FOLLOW_invariantClause_in_associationClassDefinition2253 = new BitSet(new long[]{0x0000000000080020L,0x2000000401200000L});
    public static final BitSet FOLLOW_125_in_associationClassDefinition2279 = new BitSet(new long[]{0x0000000000080000L,0x0100000000200000L});
    public static final BitSet FOLLOW_stateMachine_in_associationClassDefinition2299 = new BitSet(new long[]{0x0000000000080000L,0x0100000000200000L});
    public static final BitSet FOLLOW_keyAggregation_in_associationClassDefinition2340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_keyComposition_in_associationClassDefinition2344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_associationClassDefinition2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_attributeDefinition2395 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attributeDefinition2403 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_attributeDefinition2405 = new BitSet(new long[]{0x1642800000080000L});
    public static final BitSet FOLLOW_type_in_attributeDefinition2409 = new BitSet(new long[]{0x0000002000080002L});
    public static final BitSet FOLLOW_keyDerive_in_attributeDefinition2433 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_keyDerived_in_attributeDefinition2435 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_set_in_attributeDefinition2438 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_attributeDefinition2448 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_keyInit_in_attributeDefinition2468 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_set_in_attributeDefinition2472 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_attributeDefinition2484 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_attributeDefinition2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_operationDefinition2529 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_operationDefinition2539 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_paramList_in_operationDefinition2549 = new BitSet(new long[]{0x00000020000020A2L,0x0060000000000100L});
    public static final BitSet FOLLOW_COLON_in_operationDefinition2563 = new BitSet(new long[]{0x1642800000080000L});
    public static final BitSet FOLLOW_type_in_operationDefinition2569 = new BitSet(new long[]{0x0000002000002022L,0x0060000000000100L});
    public static final BitSet FOLLOW_EQUAL_in_operationDefinition2597 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_operationDefinition2603 = new BitSet(new long[]{0x0000002000000022L,0x0060000000000000L});
    public static final BitSet FOLLOW_blockStat_in_operationDefinition2625 = new BitSet(new long[]{0x0000002000000022L,0x0060000000000000L});
    public static final BitSet FOLLOW_prePostClause_in_operationDefinition2647 = new BitSet(new long[]{0x0000002000000022L,0x0060000000000000L});
    public static final BitSet FOLLOW_SEMI_in_operationDefinition2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_associationDefinition2691 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_line_annotation_in_associationDefinition2697 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyAssociation_in_associationDefinition2714 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyAggregation_in_associationDefinition2718 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyComposition_in_associationDefinition2722 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationDefinition2732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_associationDefinition2740 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationDefinition2748 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationDefinition2760 = new BitSet(new long[]{0x0000000000080020L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_associationDefinition2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_associationEnd2796 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd2804 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LBRACK_in_associationEnd2806 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_multiplicity_in_associationEnd2810 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_associationEnd2812 = new BitSet(new long[]{0x0000002000080002L,0x8210000000000000L});
    public static final BitSet FOLLOW_keyRole_in_associationEnd2823 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd2827 = new BitSet(new long[]{0x0000002000080002L,0x8210000000000000L});
    public static final BitSet FOLLOW_116_in_associationEnd2848 = new BitSet(new long[]{0x0000002000080002L,0x8210000000000000L});
    public static final BitSet FOLLOW_127_in_associationEnd2860 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd2864 = new BitSet(new long[]{0x0000002000080002L,0x8210000000000000L});
    public static final BitSet FOLLOW_keyUnion_in_associationEnd2876 = new BitSet(new long[]{0x0000002000080002L,0x8210000000000000L});
    public static final BitSet FOLLOW_121_in_associationEnd2888 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd2892 = new BitSet(new long[]{0x0000002000080002L,0x8210000000000000L});
    public static final BitSet FOLLOW_keyDerived_in_associationEnd2905 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_keyDerive_in_associationEnd2907 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_LPAREN_in_associationEnd2912 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_associationEnd2918 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_associationEnd2920 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_associationEnd2924 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_associationEnd2928 = new BitSet(new long[]{0x0000002000080002L,0x8210000000000000L});
    public static final BitSet FOLLOW_keyQualifier_in_associationEnd2940 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_paramList_in_associationEnd2946 = new BitSet(new long[]{0x0000002000080002L,0x8210000000000000L});
    public static final BitSet FOLLOW_SEMI_in_associationEnd2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicityRange_in_multiplicity2998 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_multiplicity3008 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_multiplicityRange_in_multiplicity3012 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange3041 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_multiplicityRange3051 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_multiplicitySpec3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicitySpec3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_annotation_in_annotationSpec3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_annotation_in_annotationSpec3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_block_annotation3158 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_block_annotation3160 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_block_annotation3162 = new BitSet(new long[]{0x2104000200000000L});
    public static final BitSet FOLLOW_annotation_tag_in_block_annotation3167 = new BitSet(new long[]{0x2104000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_block_annotation3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_line_annotation3194 = new BitSet(new long[]{0x2104000000000000L});
    public static final BitSet FOLLOW_annotation_tag_in_line_annotation3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_comment_in_annotation_tag3213 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotation_tag3215 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_NON_OCL_STRING_in_annotation_tag3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_weight_in_annotation_tag3226 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotation_tag3228 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000080L});
    public static final BitSet FOLLOW_annotation_def_in_annotation_tag3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_annotation_tag3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_type_in_annotation_tag3245 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotation_tag3247 = new BitSet(new long[]{0x0808000000000020L});
    public static final BitSet FOLLOW_annotation_enum_type_in_annotation_tag3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_ref_in_annotation_tag3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_annotation_comment3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_annotation_weight3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_annotation_type3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_annotation_override3305 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_annotation_override3307 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_annotation_override3309 = new BitSet(new long[]{0x2104000000000000L});
    public static final BitSet FOLLOW_annotation_term_in_annotation_override3311 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_annotation_override3313 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_annotation_override3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_tag_in_annotation_term3332 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_annotation_term3336 = new BitSet(new long[]{0x2104000000000000L});
    public static final BitSet FOLLOW_annotation_tag_in_annotation_term3338 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_AT_in_annotation_ref3350 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_annotation_ref3352 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_annotation_ref3354 = new BitSet(new long[]{0x2104000000000000L});
    public static final BitSet FOLLOW_annotation_predefined_in_annotation_ref3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_annotation_def3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_annotation_in_invariant3411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_invariant3422 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_invariant3432 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_COMMA_in_invariant3444 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_invariant3448 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_COLON_in_invariant3456 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_invariant3468 = new BitSet(new long[]{0x0000000000000022L,0x0000000401000000L});
    public static final BitSet FOLLOW_invariantClause_in_invariant3480 = new BitSet(new long[]{0x0000000000000022L,0x0000000401000000L});
    public static final BitSet FOLLOW_line_annotation_in_invariantClause3512 = new BitSet(new long[]{0x0000000000000020L,0x0000000400000000L});
    public static final BitSet FOLLOW_annotationSet_in_invariantClause3522 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_invariantClause3529 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_IDENT_in_invariantClause3535 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_invariantClause3540 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_invariantClause3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_invariantClause3561 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_invariantClause3563 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_IDENT_in_invariantClause3569 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_invariantClause3574 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_invariantClause3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_prePost3611 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_prePost3615 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_prePost3617 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_prePost3621 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_paramList_in_prePost3625 = new BitSet(new long[]{0x00000000000000A0L,0x0060000000000000L});
    public static final BitSet FOLLOW_COLON_in_prePost3629 = new BitSet(new long[]{0x1642800000080000L});
    public static final BitSet FOLLOW_type_in_prePost3633 = new BitSet(new long[]{0x0000000000000020L,0x0060000000000000L});
    public static final BitSet FOLLOW_prePostClause_in_prePost3652 = new BitSet(new long[]{0x0000000000000022L,0x0060000000000000L});
    public static final BitSet FOLLOW_annotationSet_in_prePostClause3686 = new BitSet(new long[]{0x0000000000000000L,0x0060000000000000L});
    public static final BitSet FOLLOW_set_in_prePostClause3698 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_IDENT_in_prePostClause3713 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_prePostClause3718 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_prePostClause3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_annotationSet3749 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_annotation3768 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_annotation3772 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_annotation3778 = new BitSet(new long[]{0x0000001000080400L});
    public static final BitSet FOLLOW_annotationValues_in_annotation3787 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_annotation3792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationValue_in_annotationValues3815 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_annotationValues3823 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_annotationValue_in_annotationValues3827 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_annotationValue3846 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotationValue3851 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_NON_OCL_STRING_in_annotationValue3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_stateMachine3887 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_stateMachine3920 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_stateMachine3933 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_stateDefinition_in_stateMachine3949 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_stateMachine3959 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_transitionDefinition_in_stateMachine3975 = new BitSet(new long[]{0x0000000000080000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_stateMachine3985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_stateDefinition4001 = new BitSet(new long[]{0x0000000000400082L});
    public static final BitSet FOLLOW_COLON_in_stateDefinition4009 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_stateDefinition4013 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_LBRACK_in_stateDefinition4024 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_stateDefinition4030 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_stateDefinition4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_transitionDefinition4053 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ARROW_in_transitionDefinition4055 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_transitionDefinition4059 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_LBRACE_in_transitionDefinition4069 = new BitSet(new long[]{0x0000000000480000L,0x0000000000004000L});
    public static final BitSet FOLLOW_LBRACK_in_transitionDefinition4079 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_transitionDefinition4083 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_transitionDefinition4087 = new BitSet(new long[]{0x0000000000080000L,0x0000000000004000L});
    public static final BitSet FOLLOW_event_in_transitionDefinition4111 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_IDENT_in_transitionDefinition4127 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_transitionDefinition4131 = new BitSet(new long[]{0x0000001002000000L});
    public static final BitSet FOLLOW_paramList_in_transitionDefinition4136 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_transitionDefinition4143 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_LBRACK_in_transitionDefinition4160 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_transitionDefinition4164 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_transitionDefinition4168 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_transitionDefinition4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_event4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keySignal_in_signalDefinition4218 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_signalDefinition4222 = new BitSet(new long[]{0x0000000000800000L,0x0000000000201040L});
    public static final BitSet FOLLOW_LESS_in_signalDefinition4237 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_signalDefinition4241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000201040L});
    public static final BitSet FOLLOW_70_in_signalDefinition4254 = new BitSet(new long[]{0x0000000000080020L,0x0000000000201000L});
    public static final BitSet FOLLOW_attributeDefinition_in_signalDefinition4267 = new BitSet(new long[]{0x0000000000080020L,0x0000000000201000L});
    public static final BitSet FOLLOW_76_in_signalDefinition4288 = new BitSet(new long[]{0x0000000000000020L,0x0000000401200000L});
    public static final BitSet FOLLOW_invariantClause_in_signalDefinition4308 = new BitSet(new long[]{0x0000000000000020L,0x0000000401200000L});
    public static final BitSet FOLLOW_85_in_signalDefinition4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyUnion4350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyAssociation4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyRole4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyComposition4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyAggregation4402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyClass4416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keySignal4428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyDerived4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyDerive4456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyInit4468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyQualifier4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_checkExpr4499 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_queryExpr_in_checkExpr4503 = new BitSet(new long[]{0x0000300000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_44_in_checkExpr4531 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_queryExpr_in_checkExpr4535 = new BitSet(new long[]{0x0000300000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_checkExpr4593 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_queryExpr_in_checkExpr4597 = new BitSet(new long[]{0x0000300000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_45_in_checkExpr4656 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_queryExpr_in_checkExpr4662 = new BitSet(new long[]{0x0000300000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_EOF_in_checkExpr4708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleExpr_in_checkExpr4726 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_moduleExpr_in_checkExpr4742 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EOF_in_checkExpr4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_queryExpr4769 = new BitSet(new long[]{0x0000010000080000L,0x0002010000000001L});
    public static final BitSet FOLLOW_featureExpr_in_queryExpr4773 = new BitSet(new long[]{0x0000000000000402L,0x0000000080000408L,0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_queryExpr4778 = new BitSet(new long[]{0x0000010000080000L,0x0002010000000001L});
    public static final BitSet FOLLOW_featureExpr_in_queryExpr4782 = new BitSet(new long[]{0x0000000000000402L,0x0000000080000408L,0x0000000000000040L});
    public static final BitSet FOLLOW_withExpr_in_queryExpr4800 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000408L});
    public static final BitSet FOLLOW_butExpr_in_queryExpr4818 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000008L});
    public static final BitSet FOLLOW_95_in_queryExpr4825 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_injExpr_in_queryExpr4829 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_queryExpr4844 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_queryExpr4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_featureExpr4895 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_featureExpr4902 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rankExpr_in_featureExpr4911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrExpr_in_featureExpr4931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assocExpr_in_featureExpr4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_modifiers4963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_modifiers4977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_modifiers4987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attrExpr5006 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_attrExpr5012 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_attrExpr5016 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rankExpr_in_attrExpr5025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assocExpr5049 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_assocExpr5055 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_assocExpr5059 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_assocExpr5065 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_assocExpr5069 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rankExpr_in_assocExpr5078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_withExpr5107 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_invExpr_in_withExpr5111 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_withExpr5115 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_invExpr_in_withExpr5119 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_74_in_butExpr5142 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_invExpr_in_butExpr5146 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_butExpr5150 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_invExpr_in_butExpr5154 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_set_in_invExpr5176 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_invExpr5182 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_set_in_invExpr5186 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rankExpr_in_invExpr5195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_rankExpr5224 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_INT_in_rankExpr5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_moduleExpr5246 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_moduleExpr5250 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_queryExpr_in_moduleExpr5264 = new BitSet(new long[]{0x0000000000000000L,0x0400000000200000L});
    public static final BitSet FOLLOW_queryExpr_in_moduleExpr5280 = new BitSet(new long[]{0x0000000000000000L,0x0400000000200000L});
    public static final BitSet FOLLOW_85_in_moduleExpr5290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_injExpr5311 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_injExpr5315 = new BitSet(new long[]{0x0000000200000420L});
    public static final BitSet FOLLOW_rankExpr_in_injExpr5320 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_injExpr5337 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_injExpr5341 = new BitSet(new long[]{0x0000000200000420L});
    public static final BitSet FOLLOW_rankExpr_in_injExpr5346 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_injExpr5368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly5395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_expression5445 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression5456 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression5460 = new BitSet(new long[]{0x1642800000080000L});
    public static final BitSet FOLLOW_type_in_expression5464 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression5469 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5473 = new BitSet(new long[]{0x0000000000000400L,0x0000000040000000L});
    public static final BitSet FOLLOW_COMMA_in_expression5511 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression5523 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression5527 = new BitSet(new long[]{0x1642800000080000L});
    public static final BitSet FOLLOW_type_in_expression5531 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression5536 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5540 = new BitSet(new long[]{0x0000000000000400L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_expression5581 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression5597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList5630 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList5647 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_paramList5659 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList5663 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_paramList5683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList5712 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_idList5722 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_idList5726 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration5757 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration5759 = new BitSet(new long[]{0x1642800000080000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration5763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression5799 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_conditionalImpliesExpression5812 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE0812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression5816 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression5861 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_conditionalOrExpression5874 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE0812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression5878 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression5922 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_conditionalXOrExpression5935 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE0812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression5939 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression5983 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_conditionalAndExpression5996 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE0812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression6000 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression6048 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_set_in_equalityExpression6067 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE0812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression6077 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression6126 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_set_in_relationalExpression6144 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE0812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression6162 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression6212 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression6230 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE0812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression6240 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression6290 = new BitSet(new long[]{0x0000014000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression6308 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE0812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression6322 = new BitSet(new long[]{0x0000014000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_set_in_unaryExpression6384 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE0812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression6408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression6428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression6461 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression6479 = new BitSet(new long[]{0x0000000000080000L,0x1800E80800000000L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression6485 = new BitSet(new long[]{0x0000000000080000L,0x1800E80800000000L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression6496 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_literal_in_primaryExpression6536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression6550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression6562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression6573 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_primaryExpression6577 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression6579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression6591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression6603 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression6605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_primaryExpression6607 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression6630 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_primaryExpression6632 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression6650 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression6652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression6665 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression6667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_primaryExpression6669 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression6673 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_primaryExpression6677 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression6679 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression6699 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_primaryExpression6701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference6727 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_objectReference6735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall6800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall6813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall6826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall6839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inStateExpression_in_propertyCall6852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression6887 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression6894 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression6905 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_queryExpression6909 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_queryExpression6920 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression6926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_iterateExpression6958 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression6964 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression6972 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression6974 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression6982 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression6984 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_iterateExpression6992 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression6998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression7042 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression7064 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_operationExpression7077 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression7090 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_operationExpression7094 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression7106 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression7123 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_operationExpression7138 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression7153 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_operationExpression7157 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression7171 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_operationExpression7196 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_operationExpression7198 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression7223 = new BitSet(new long[]{0x56428318861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_operationExpression7244 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression7256 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_operationExpression7260 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression7280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_inStateExpression7317 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_inStateExpression7322 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_inStateExpression7331 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_inStateExpression7336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression7372 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression7396 = new BitSet(new long[]{0x1642800000080000L});
    public static final BitSet FOLLOW_type_in_typeExpression7400 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression7402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration7440 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration7443 = new BitSet(new long[]{0x1642800000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration7447 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration7457 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration7463 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration7466 = new BitSet(new long[]{0x1642800000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration7472 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization7500 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization7502 = new BitSet(new long[]{0x1642800000080000L});
    public static final BitSet FOLLOW_type_in_variableInitialization7506 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization7508 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_variableInitialization7512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ifExpression7544 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_ifExpression7548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_ifExpression7550 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_ifExpression7554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ifExpression7556 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_ifExpression7560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ifExpression7562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_literal7601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_literal7615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal7628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal7643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal7657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal7667 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal7671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal7683 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal7685 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal7689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal7701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal7713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal7725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal7737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_literal7749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral7787 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral7816 = new BitSet(new long[]{0x5642830A861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral7833 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral7846 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral7850 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral7869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem7898 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem7909 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_collectionItem7913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_emptyCollectionLiteral7942 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral7944 = new BitSet(new long[]{0x0642800000000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral7948 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral7950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral7966 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral7968 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral7970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_undefinedLiteral8000 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral8002 = new BitSet(new long[]{0x1642800000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral8006 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral8008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_undefinedLiteral8022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_undefinedLiteral8036 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral8038 = new BitSet(new long[]{0x1642800000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral8042 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral8044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_undefinedLiteral8058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_tupleLiteral8097 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral8103 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral8111 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral8122 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral8126 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral8137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem8168 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_tupleItem8207 = new BitSet(new long[]{0x1642800000080000L});
    public static final BitSet FOLLOW_type_in_tupleItem8211 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem8213 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_tupleItem8217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem8239 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_tupleItem8249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type8315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type8327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type8339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly8371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly8373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType8401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType8439 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType8466 = new BitSet(new long[]{0x1642800000080000L});
    public static final BitSet FOLLOW_type_in_collectionType8470 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType8472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_tupleType8506 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType8508 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType8517 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleType8528 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType8532 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType8544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart8576 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_tuplePart8578 = new BitSet(new long[]{0x1642800000080000L});
    public static final BitSet FOLLOW_type_in_tuplePart8582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOnly8631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statOnly8635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_singleStat_in_stat8670 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_stat8682 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE9916030100L,0x0000000000000024L});
    public static final BitSet FOLLOW_singleStat_in_stat8692 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_emptyStat_in_singleStat8732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat8758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignStat_in_singleStat8770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_singleStat8784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleStat8798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleStat8811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleStat8828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExStat_in_singleStat8845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterStat_in_singleStat8862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_singleStat8884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStat_in_singleStat8902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_emptyStat8929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr8955 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr8969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varAssignStat9007 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat9011 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE9812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rValue_in_varAssignStat9019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_attAssignStat9043 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attAssignStat9052 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat9056 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE9812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rValue_in_attAssignStat9064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_objCreateStat9090 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_objCreateStat9098 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat9108 = new BitSet(new long[]{0x56428318861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat9121 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat9129 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_objCreateStat9147 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat9155 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE9812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat9169 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat9177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_objDestroyStat9213 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat9221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_lnkInsStat9247 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkInsStat9251 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE9812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat9261 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkInsStat9265 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_lnkInsStat9269 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkInsStat9277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers9306 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers9317 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE9812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers9326 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers9333 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers9349 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE9812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers9360 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers9371 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE9812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers9380 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers9387 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers9409 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE9812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers9424 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers9444 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE9812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers9455 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers9464 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_80_in_lnkDelStat9505 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkDelStat9509 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE9812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat9519 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkDelStat9523 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_lnkDelStat9527 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkDelStat9536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_condExStat9567 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_inSoilExpression_in_condExStat9576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_condExStat9580 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE9916038100L,0x0000000000000024L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat9589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_84_in_condExStat9600 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE9916038100L,0x0000000000000024L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat9612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_condExStat9624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_iterStat9649 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_iterStat9657 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_iterStat9661 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_inSoilExpression_in_iterStat9669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_iterStat9673 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE9916038100L,0x0000000000000024L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_iterStat9681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_iterStat9686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_whileStat9712 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_inSoilExpression_in_whileStat9720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_whileStat9724 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE9916038100L,0x0000000000000024L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_whileStat9732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_whileStat9737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_blockStat9767 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE9916038100L,0x0000000000000024L});
    public static final BitSet FOLLOW_79_in_blockStat9772 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat9778 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_blockStat9784 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat9790 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_blockStat9797 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE9916030100L,0x0000000000000024L});
    public static final BitSet FOLLOW_stat_in_blockStat9807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_blockStat9812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_implicitBlockStat9838 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat9844 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_implicitBlockStat9850 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat9856 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_implicitBlockStat9863 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE9916030100L,0x0000000000000024L});
    public static final BitSet FOLLOW_stat_in_implicitBlockStat9871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOrImplicitBlock9894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitBlockStat_in_statOrImplicitBlock9904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_rValue9950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_rValue9962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_rValList9985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValListMin1_in_rValList10012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin110045 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin110059 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE9812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rValue_in_rValListMin110069 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rValue_in_rValListMin210108 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin210116 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE9812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rValue_in_rValListMin210124 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin210138 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE9812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rValue_in_rValListMin210148 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_expression_in_inSoilExpression10182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_exprList10211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprListMin1_in_exprList10229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin110262 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin110277 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin110287 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin210327 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin210335 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin210343 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin210357 = new BitSet(new long[]{0x56428308861A0020L,0x1801FE1812000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin210367 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_nothing_in_identList10397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identListMin1_in_identList10414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identListMin110448 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_identListMin110462 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_identListMin110472 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COLON_in_synpred1_Generator8198 = new BitSet(new long[]{0x1642800000080000L});
    public static final BitSet FOLLOW_type_in_synpred1_Generator8200 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred1_Generator8202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_synpred2_Generator8750 = new BitSet(new long[]{0x0000000000000002L});

}