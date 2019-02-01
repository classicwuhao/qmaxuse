// $ANTLR 3.4 Generator.g 2019-02-01 14:46:11
 
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", "NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", "REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", "WS", "'ASSLCall'", "'Bag'", "'Barrier'", "'Collection'", "'Comment'", "'Hard'", "'OpEnter'", "'OpExit'", "'OrderedSet'", "'Override'", "'Rank'", "'Sequence'", "'Set'", "'Soft'", "'Tuple'", "'Type'", "'Undefined'", "'With'", "'Without'", "'abstract'", "'allInstances'", "'and'", "'associationClass'", "'associationclass'", "'attributes'", "'automatic'", "'begin'", "'between'", "'byUseId'", "'constraints'", "'context'", "'create'", "'declare'", "'delete'", "'destroy'", "'div'", "'do'", "'else'", "'end'", "'endif'", "'enum'", "'existential'", "'false'", "'for'", "'from'", "'if'", "'implies'", "'in'", "'insert'", "'into'", "'inv'", "'iterate'", "'let'", "'model'", "'new'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", "'oclInState'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", "'operations'", "'or'", "'ordered'", "'post'", "'pre'", "'procedure'", "'psm'", "'query'", "'redefines'", "'selectByKind'", "'selectByType'", "'statemachines'", "'states'", "'subsets'", "'then'", "'transitions'", "'true'", "'var'", "'while'", "'xor'"
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
    // Generator.g:79:1: invariantListOnly returns [List<ASTConstraintDefinition> invariantList] : (def= invariant )* EOF ;
    public final List<ASTConstraintDefinition> invariantListOnly() throws RecognitionException {
        List<ASTConstraintDefinition> invariantList = null;


        ASTConstraintDefinition def =null;


         invariantList = new ArrayList<ASTConstraintDefinition>(); 
        try {
            // Generator.g:81:5: ( (def= invariant )* EOF )
            // Generator.g:82:5: (def= invariant )* EOF
            {
            // Generator.g:82:5: (def= invariant )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==AT||LA1_0==74) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Generator.g:82:7: def= invariant
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
    // Generator.g:136:1: procedureListOnly returns [List<ASTGProcedure> procedureList] : (proc= procedure )* EOF ;
    public final List<ASTGProcedure> procedureListOnly() throws RecognitionException {
        List<ASTGProcedure> procedureList = null;


        ASTGProcedure proc =null;


         procedureList = new ArrayList<ASTGProcedure>(); 
        try {
            // Generator.g:138:5: ( (proc= procedure )* EOF )
            // Generator.g:139:5: (proc= procedure )* EOF
            {
            // Generator.g:139:5: (proc= procedure )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==112) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Generator.g:140:7: proc= procedure
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
    // Generator.g:151:1: procedure returns [ASTGProcedure proc] : 'procedure' name= IDENT LPAREN parameterDecls= variableDeclarationList RPAREN ( 'var' localDecls= variableDeclarationList SEMI )? 'begin' instructions= instructionList 'end' SEMI ;
    public final ASTGProcedure procedure() throws RecognitionException {
        ASTGProcedure proc = null;


        Token name=null;
        List parameterDecls =null;

        List localDecls =null;

        List instructions =null;


         localDecls = new ArrayList(); 
        try {
            // Generator.g:153:5: ( 'procedure' name= IDENT LPAREN parameterDecls= variableDeclarationList RPAREN ( 'var' localDecls= variableDeclarationList SEMI )? 'begin' instructions= instructionList 'end' SEMI )
            // Generator.g:154:5: 'procedure' name= IDENT LPAREN parameterDecls= variableDeclarationList RPAREN ( 'var' localDecls= variableDeclarationList SEMI )? 'begin' instructions= instructionList 'end' SEMI
            {
            match(input,112,FOLLOW_112_in_procedure179); if (state.failed) return proc;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedure183); if (state.failed) return proc;

            match(input,LPAREN,FOLLOW_LPAREN_in_procedure185); if (state.failed) return proc;

            pushFollow(FOLLOW_variableDeclarationList_in_procedure189);
            parameterDecls=variableDeclarationList();

            state._fsp--;
            if (state.failed) return proc;

            match(input,RPAREN,FOLLOW_RPAREN_in_procedure191); if (state.failed) return proc;

            // Generator.g:155:5: ( 'var' localDecls= variableDeclarationList SEMI )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==124) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Generator.g:155:7: 'var' localDecls= variableDeclarationList SEMI
                    {
                    match(input,124,FOLLOW_124_in_procedure199); if (state.failed) return proc;

                    pushFollow(FOLLOW_variableDeclarationList_in_procedure203);
                    localDecls=variableDeclarationList();

                    state._fsp--;
                    if (state.failed) return proc;

                    match(input,SEMI,FOLLOW_SEMI_in_procedure205); if (state.failed) return proc;

                    }
                    break;

            }


            match(input,70,FOLLOW_70_in_procedure214); if (state.failed) return proc;

            pushFollow(FOLLOW_instructionList_in_procedure218);
            instructions=instructionList();

            state._fsp--;
            if (state.failed) return proc;

            match(input,82,FOLLOW_82_in_procedure220); if (state.failed) return proc;

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
    // Generator.g:164:1: variableDeclarationList returns [List varDecls] : (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )? ;
    public final List variableDeclarationList() throws RecognitionException {
        List varDecls = null;


        ASTVariableDeclaration decl =null;


         varDecls = new ArrayList(); 
        try {
            // Generator.g:166:5: ( (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )? )
            // Generator.g:167:5: (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )?
            {
            // Generator.g:167:5: (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IDENT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Generator.g:167:7: decl= variableDeclaration ( COMMA decl= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList260);
                    decl=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return varDecls;

                    if ( state.backtracking==0 ) {varDecls.add(decl);}

                    // Generator.g:168:7: ( COMMA decl= variableDeclaration )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==COMMA) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Generator.g:168:8: COMMA decl= variableDeclaration
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
    // Generator.g:176:1: instructionList returns [List instructions] : (instr= instruction SEMI )* ;
    public final List instructionList() throws RecognitionException {
        List instructions = null;


        ASTGInstruction instr =null;


         instructions = new ArrayList(); 
        try {
            // Generator.g:178:5: ( (instr= instruction SEMI )* )
            // Generator.g:179:5: (instr= instruction SEMI )*
            {
            // Generator.g:179:5: (instr= instruction SEMI )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IDENT||LA6_0==LBRACK||LA6_0==44||LA6_0==46||(LA6_0 >= 50 && LA6_0 <= 51)||LA6_0==87||LA6_0==89) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Generator.g:179:7: instr= instruction SEMI
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
    // Generator.g:194:1: instruction returns [ASTGInstruction instr] : (instrVA= variableAssignment |instrAA= attributeAssignment |instrLO= loop |instrAI= atomicInstruction |instrIT= ifThenElse |instrAC= asslCall |instrOE= opEnter |instrOX= opExit |instrBA= barrier );
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
            // Generator.g:195:7: (instrVA= variableAssignment |instrAA= attributeAssignment |instrLO= loop |instrAI= atomicInstruction |instrIT= ifThenElse |instrAC= asslCall |instrOE= opEnter |instrOX= opExit |instrBA= barrier )
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
            case 87:
                {
                alt7=3;
                }
                break;
            case 89:
                {
                alt7=5;
                }
                break;
            case 44:
                {
                alt7=6;
                }
                break;
            case 50:
                {
                alt7=7;
                }
                break;
            case 51:
                {
                alt7=8;
                }
                break;
            case 46:
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
                    // Generator.g:196:7: instrVA= variableAssignment
                    {
                    pushFollow(FOLLOW_variableAssignment_in_instruction356);
                    instrVA=variableAssignment();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrVA;}

                    }
                    break;
                case 2 :
                    // Generator.g:197:7: instrAA= attributeAssignment
                    {
                    pushFollow(FOLLOW_attributeAssignment_in_instruction371);
                    instrAA=attributeAssignment();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrAA;}

                    }
                    break;
                case 3 :
                    // Generator.g:198:7: instrLO= loop
                    {
                    pushFollow(FOLLOW_loop_in_instruction385);
                    instrLO=loop();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrLO;}

                    }
                    break;
                case 4 :
                    // Generator.g:199:7: instrAI= atomicInstruction
                    {
                    pushFollow(FOLLOW_atomicInstruction_in_instruction402);
                    instrAI=atomicInstruction();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrAI;}

                    }
                    break;
                case 5 :
                    // Generator.g:200:7: instrIT= ifThenElse
                    {
                    pushFollow(FOLLOW_ifThenElse_in_instruction416);
                    instrIT=ifThenElse();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrIT;}

                    }
                    break;
                case 6 :
                    // Generator.g:201:7: instrAC= asslCall
                    {
                    pushFollow(FOLLOW_asslCall_in_instruction432);
                    instrAC=asslCall();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrAC;}

                    }
                    break;
                case 7 :
                    // Generator.g:202:7: instrOE= opEnter
                    {
                    pushFollow(FOLLOW_opEnter_in_instruction448);
                    instrOE=opEnter();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrOE;}

                    }
                    break;
                case 8 :
                    // Generator.g:203:7: instrOX= opExit
                    {
                    pushFollow(FOLLOW_opExit_in_instruction465);
                    instrOX=opExit();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrOX;}

                    }
                    break;
                case 9 :
                    // Generator.g:204:7: instrBA= barrier
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
    // Generator.g:211:1: variableAssignment returns [ASTGVariableAssignment assignment] : target= IDENT COLON_EQUAL source= valueInstruction ;
    public final ASTGVariableAssignment variableAssignment() throws RecognitionException {
        ASTGVariableAssignment assignment = null;


        Token target=null;
        ASTGValueInstruction source =null;


        try {
            // Generator.g:212:5: (target= IDENT COLON_EQUAL source= valueInstruction )
            // Generator.g:213:5: target= IDENT COLON_EQUAL source= valueInstruction
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
    // Generator.g:221:1: attributeAssignment returns [ASTGAttributeAssignment assignment] : targetObject= oclExpression DOT attributeName= IDENT COLON_EQUAL source= valueInstruction ;
    public final ASTGAttributeAssignment attributeAssignment() throws RecognitionException {
        ASTGAttributeAssignment assignment = null;


        Token attributeName=null;
        ASTGocl targetObject =null;

        ASTGValueInstruction source =null;


        try {
            // Generator.g:222:5: (targetObject= oclExpression DOT attributeName= IDENT COLON_EQUAL source= valueInstruction )
            // Generator.g:223:5: targetObject= oclExpression DOT attributeName= IDENT COLON_EQUAL source= valueInstruction
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
    // Generator.g:233:1: loop returns [ASTGLoop loop] : t= 'for' decl= variableDeclaration 'in' sequence= oclExpression 'begin' instructions= instructionList 'end' ;
    public final ASTGLoop loop() throws RecognitionException {
        ASTGLoop loop = null;


        Token t=null;
        ASTVariableDeclaration decl =null;

        ASTGocl sequence =null;

        List instructions =null;


        try {
            // Generator.g:234:5: (t= 'for' decl= variableDeclaration 'in' sequence= oclExpression 'begin' instructions= instructionList 'end' )
            // Generator.g:235:5: t= 'for' decl= variableDeclaration 'in' sequence= oclExpression 'begin' instructions= instructionList 'end'
            {
            t=(Token)match(input,87,FOLLOW_87_in_loop601); if (state.failed) return loop;

            pushFollow(FOLLOW_variableDeclaration_in_loop605);
            decl=variableDeclaration();

            state._fsp--;
            if (state.failed) return loop;

            match(input,91,FOLLOW_91_in_loop607); if (state.failed) return loop;

            pushFollow(FOLLOW_oclExpression_in_loop611);
            sequence=oclExpression();

            state._fsp--;
            if (state.failed) return loop;

            match(input,70,FOLLOW_70_in_loop613); if (state.failed) return loop;

            pushFollow(FOLLOW_instructionList_in_loop624);
            instructions=instructionList();

            state._fsp--;
            if (state.failed) return loop;

            match(input,82,FOLLOW_82_in_loop626); if (state.failed) return loop;

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
    // Generator.g:246:1: ifThenElse returns [ASTGIfThenElse ifThenElse] : token= 'if' sequence= oclExpression 'then' 'begin' thenInstructions= instructionList 'end' ( 'else' 'begin' elseInstructions= instructionList 'end' )? ;
    public final ASTGIfThenElse ifThenElse() throws RecognitionException {
        ASTGIfThenElse ifThenElse = null;


        Token token=null;
        ASTGocl sequence =null;

        List thenInstructions =null;

        List elseInstructions =null;


         List elseInstructionsList = new ArrayList(); 
        try {
            // Generator.g:248:5: (token= 'if' sequence= oclExpression 'then' 'begin' thenInstructions= instructionList 'end' ( 'else' 'begin' elseInstructions= instructionList 'end' )? )
            // Generator.g:249:5: token= 'if' sequence= oclExpression 'then' 'begin' thenInstructions= instructionList 'end' ( 'else' 'begin' elseInstructions= instructionList 'end' )?
            {
            token=(Token)match(input,89,FOLLOW_89_in_ifThenElse662); if (state.failed) return ifThenElse;

            pushFollow(FOLLOW_oclExpression_in_ifThenElse666);
            sequence=oclExpression();

            state._fsp--;
            if (state.failed) return ifThenElse;

            match(input,121,FOLLOW_121_in_ifThenElse677); if (state.failed) return ifThenElse;

            match(input,70,FOLLOW_70_in_ifThenElse679); if (state.failed) return ifThenElse;

            pushFollow(FOLLOW_instructionList_in_ifThenElse683);
            thenInstructions=instructionList();

            state._fsp--;
            if (state.failed) return ifThenElse;

            match(input,82,FOLLOW_82_in_ifThenElse685); if (state.failed) return ifThenElse;

            // Generator.g:251:9: ( 'else' 'begin' elseInstructions= instructionList 'end' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==81) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Generator.g:251:10: 'else' 'begin' elseInstructions= instructionList 'end'
                    {
                    match(input,81,FOLLOW_81_in_ifThenElse696); if (state.failed) return ifThenElse;

                    match(input,70,FOLLOW_70_in_ifThenElse698); if (state.failed) return ifThenElse;

                    pushFollow(FOLLOW_instructionList_in_ifThenElse702);
                    elseInstructions=instructionList();

                    state._fsp--;
                    if (state.failed) return ifThenElse;

                    match(input,82,FOLLOW_82_in_ifThenElse704); if (state.failed) return ifThenElse;

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
    // Generator.g:260:1: valueInstruction returns [ASTGValueInstruction valueinstr] : (atmoicInstr= atomicInstruction |oclExpr= oclExpression );
    public final ASTGValueInstruction valueInstruction() throws RecognitionException {
        ASTGValueInstruction valueinstr = null;


        ASTGAtomicInstruction atmoicInstr =null;

        ASTGocl oclExpr =null;


        try {
            // Generator.g:261:7: (atmoicInstr= atomicInstruction |oclExpr= oclExpression )
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
                    // Generator.g:262:7: atmoicInstr= atomicInstruction
                    {
                    pushFollow(FOLLOW_atomicInstruction_in_valueInstruction744);
                    atmoicInstr=atomicInstruction();

                    state._fsp--;
                    if (state.failed) return valueinstr;

                    if ( state.backtracking==0 ) {valueinstr = atmoicInstr; }

                    }
                    break;
                case 2 :
                    // Generator.g:263:7: oclExpr= oclExpression
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
    // Generator.g:271:1: atomicInstruction returns [ASTGAtomicInstruction instr] : name= IDENT LPAREN (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )? RPAREN ;
    public final ASTGAtomicInstruction atomicInstruction() throws RecognitionException {
        ASTGAtomicInstruction instr = null;


        Token name=null;
        Object parameter =null;


        try {
            // Generator.g:272:5: (name= IDENT LPAREN (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )? RPAREN )
            // Generator.g:273:5: name= IDENT LPAREN (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )? RPAREN
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_atomicInstruction788); if (state.failed) return instr;

            if ( state.backtracking==0 ) { instr = new ASTGAtomicInstruction(name); }

            match(input,LPAREN,FOLLOW_LPAREN_in_atomicInstruction792); if (state.failed) return instr;

            // Generator.g:274:9: (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IDENT||LA11_0==LBRACK) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Generator.g:274:11: parameter= instructionParameter ( COMMA parameter= instructionParameter )*
                    {
                    pushFollow(FOLLOW_instructionParameter_in_atomicInstruction806);
                    parameter=instructionParameter();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) { instr.addParameter(parameter); }

                    // Generator.g:275:13: ( COMMA parameter= instructionParameter )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==COMMA) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // Generator.g:275:15: COMMA parameter= instructionParameter
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
    // Generator.g:286:1: asslCall returns [ASTGAsslCall instr] : 'ASSLCall' name= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN ;
    public final ASTGAsslCall asslCall() throws RecognitionException {
        ASTGAsslCall instr = null;


        Token name=null;
        ASTGocl parameter =null;


        try {
            // Generator.g:287:5: ( 'ASSLCall' name= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN )
            // Generator.g:288:5: 'ASSLCall' name= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN
            {
            match(input,44,FOLLOW_44_in_asslCall899); if (state.failed) return instr;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_asslCall903); if (state.failed) return instr;

            if ( state.backtracking==0 ) { instr = new ASTGAsslCall(name); }

            match(input,LPAREN,FOLLOW_LPAREN_in_asslCall907); if (state.failed) return instr;

            // Generator.g:289:9: (parameter= oclExpression ( COMMA parameter= oclExpression )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LBRACK) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Generator.g:289:11: parameter= oclExpression ( COMMA parameter= oclExpression )*
                    {
                    pushFollow(FOLLOW_oclExpression_in_asslCall921);
                    parameter=oclExpression();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) { instr.addParameter(parameter); }

                    // Generator.g:290:13: ( COMMA parameter= oclExpression )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // Generator.g:290:15: COMMA parameter= oclExpression
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
    // Generator.g:301:1: opEnter returns [ASTGOpEnter instr] : 'OpEnter' oid= oclExpression opname= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN ;
    public final ASTGOpEnter opEnter() throws RecognitionException {
        ASTGOpEnter instr = null;


        Token opname=null;
        ASTGocl oid =null;

        ASTGocl parameter =null;


        try {
            // Generator.g:302:5: ( 'OpEnter' oid= oclExpression opname= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN )
            // Generator.g:303:5: 'OpEnter' oid= oclExpression opname= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN
            {
            match(input,50,FOLLOW_50_in_opEnter1014); if (state.failed) return instr;

            pushFollow(FOLLOW_oclExpression_in_opEnter1018);
            oid=oclExpression();

            state._fsp--;
            if (state.failed) return instr;

            opname=(Token)match(input,IDENT,FOLLOW_IDENT_in_opEnter1022); if (state.failed) return instr;

            if ( state.backtracking==0 ) { instr = new ASTGOpEnter(oid, opname); }

            match(input,LPAREN,FOLLOW_LPAREN_in_opEnter1026); if (state.failed) return instr;

            // Generator.g:304:9: (parameter= oclExpression ( COMMA parameter= oclExpression )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LBRACK) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Generator.g:304:11: parameter= oclExpression ( COMMA parameter= oclExpression )*
                    {
                    pushFollow(FOLLOW_oclExpression_in_opEnter1041);
                    parameter=oclExpression();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) { instr.addParameter(parameter); }

                    // Generator.g:305:13: ( COMMA parameter= oclExpression )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // Generator.g:305:15: COMMA parameter= oclExpression
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
    // Generator.g:315:1: opExit returns [ASTGOpExit instr] : 'OpExit' ;
    public final ASTGOpExit opExit() throws RecognitionException {
        ASTGOpExit instr = null;


        try {
            // Generator.g:316:5: ( 'OpExit' )
            // Generator.g:317:5: 'OpExit'
            {
            match(input,51,FOLLOW_51_in_opExit1134); if (state.failed) return instr;

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
    // Generator.g:323:1: instructionParameter returns [Object parameter] : (parameterOcl= oclExpression |parameterIdent= instrParameterIdent );
    public final Object instructionParameter() throws RecognitionException {
        Object parameter = null;


        ASTGocl parameterOcl =null;

        Token parameterIdent =null;


        try {
            // Generator.g:324:7: (parameterOcl= oclExpression |parameterIdent= instrParameterIdent )
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
                    // Generator.g:325:7: parameterOcl= oclExpression
                    {
                    pushFollow(FOLLOW_oclExpression_in_instructionParameter1163);
                    parameterOcl=oclExpression();

                    state._fsp--;
                    if (state.failed) return parameter;

                    if ( state.backtracking==0 ) {parameter = parameterOcl; }

                    }
                    break;
                case 2 :
                    // Generator.g:326:7: parameterIdent= instrParameterIdent
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
    // Generator.g:333:1: instrParameterIdent returns [Token t] : i= IDENT ;
    public final Token instrParameterIdent() throws RecognitionException {
        Token t = null;


        Token i=null;

        try {
            // Generator.g:334:5: (i= IDENT )
            // Generator.g:335:5: i= IDENT
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
    // Generator.g:342:1: oclExpression returns [ASTGocl encapOcl] : i= LBRACK ocl= expression RBRACK ;
    public final ASTGocl oclExpression() throws RecognitionException {
        ASTGocl encapOcl = null;


        Token i=null;
        GeneratorParser.expression_return ocl =null;


        try {
            // Generator.g:343:5: (i= LBRACK ocl= expression RBRACK )
            // Generator.g:344:5: i= LBRACK ocl= expression RBRACK
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
    // Generator.g:351:1: barrier returns [ASTGBarrier barrier] : 'Barrier' LPAREN (invClass= IDENT COLON_COLON invName= IDENT |exp= oclExpression ) RPAREN ;
    public final ASTGBarrier barrier() throws RecognitionException {
        ASTGBarrier barrier = null;


        Token invClass=null;
        Token invName=null;
        ASTGocl exp =null;


        try {
            // Generator.g:352:4: ( 'Barrier' LPAREN (invClass= IDENT COLON_COLON invName= IDENT |exp= oclExpression ) RPAREN )
            // Generator.g:353:4: 'Barrier' LPAREN (invClass= IDENT COLON_COLON invName= IDENT |exp= oclExpression ) RPAREN
            {
            match(input,46,FOLLOW_46_in_barrier1265); if (state.failed) return barrier;

            match(input,LPAREN,FOLLOW_LPAREN_in_barrier1270); if (state.failed) return barrier;

            // Generator.g:354:11: (invClass= IDENT COLON_COLON invName= IDENT |exp= oclExpression )
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
                    // Generator.g:355:8: invClass= IDENT COLON_COLON invName= IDENT
                    {
                    invClass=(Token)match(input,IDENT,FOLLOW_IDENT_in_barrier1285); if (state.failed) return barrier;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_barrier1287); if (state.failed) return barrier;

                    invName=(Token)match(input,IDENT,FOLLOW_IDENT_in_barrier1293); if (state.failed) return barrier;

                    if ( state.backtracking==0 ) { barrier = new ASTGBarrierInvariant(invClass, invName); }

                    }
                    break;
                case 2 :
                    // Generator.g:356:8: exp= oclExpression
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
    // Generator.g:369:1: procedureCallOnly returns [ASTGProcedureCall call] : name= IDENT LPAREN (ocl= expression ( COMMA ocl= expression )* )? RPAREN EOF ;
    public final ASTGProcedureCall procedureCallOnly() throws RecognitionException {
        ASTGProcedureCall call = null;


        Token name=null;
        GeneratorParser.expression_return ocl =null;


        try {
            // Generator.g:370:5: (name= IDENT LPAREN (ocl= expression ( COMMA ocl= expression )* )? RPAREN EOF )
            // Generator.g:371:5: name= IDENT LPAREN (ocl= expression ( COMMA ocl= expression )* )? RPAREN EOF
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureCallOnly1345); if (state.failed) return call;

            if ( state.backtracking==0 ) {call = new ASTGProcedureCall(name);}

            match(input,LPAREN,FOLLOW_LPAREN_in_procedureCallOnly1353); if (state.failed) return call;

            // Generator.g:372:12: (ocl= expression ( COMMA ocl= expression )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==AT||LA19_0==HASH||(LA19_0 >= IDENT && LA19_0 <= INT)||(LA19_0 >= LPAREN && LA19_0 <= MINUS)||LA19_0==PLUS||LA19_0==REAL||(LA19_0 >= STAR && LA19_0 <= STRING)||LA19_0==45||LA19_0==47||LA19_0==52||(LA19_0 >= 55 && LA19_0 <= 56)||LA19_0==58||LA19_0==60||LA19_0==86||LA19_0==89||(LA19_0 >= 95 && LA19_0 <= 96)||(LA19_0 >= 99 && LA19_0 <= 106)||(LA19_0 >= 116 && LA19_0 <= 117)||LA19_0==123) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Generator.g:373:5: ocl= expression ( COMMA ocl= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_procedureCallOnly1364);
                    ocl=expression();

                    state._fsp--;
                    if (state.failed) return call;

                    if ( state.backtracking==0 ) {call.addParameter((ocl!=null?ocl.n:null));}

                    // Generator.g:374:5: ( COMMA ocl= expression )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==COMMA) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // Generator.g:374:7: COMMA ocl= expression
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
    // Generator.g:397:1: model returns [ASTModel n] : as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition | query )* EOF ;
    public final ASTModel model() throws RecognitionException {
        ASTModel n = null;


        Token modelName=null;
        Set<ASTAnnotation> as =null;

        ASTAssociation a =null;

        ASTConstraintDefinition cons =null;

        ASTPrePost ppc =null;

        ASTEnumTypeDefinition e =null;


        try {
            // Generator.g:398:2: (as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition | query )* EOF )
            // Generator.g:399:2: as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition | query )* EOF
            {
            pushFollow(FOLLOW_annotationSet_in_model1427);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            match(input,97,FOLLOW_97_in_model1433); if (state.failed) return n;

            modelName=(Token)match(input,IDENT,FOLLOW_IDENT_in_model1437); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTModel(modelName); n.setAnnotations(as); }

            // Generator.g:401:5: ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition | query )*
            loop21:
            do {
                int alt21=6;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // Generator.g:401:9: generalClassifierDefinition[$n]
            	    {
            	    pushFollow(FOLLOW_generalClassifierDefinition_in_model1449);
            	    generalClassifierDefinition(n);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    }
            	    break;
            	case 2 :
            	    // Generator.g:402:9: a= associationDefinition
            	    {
            	    pushFollow(FOLLOW_associationDefinition_in_model1462);
            	    a=associationDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addAssociation(a); }

            	    }
            	    break;
            	case 3 :
            	    // Generator.g:403:9: ( 'constraints' (cons= invariant |ppc= prePost )* )
            	    {
            	    // Generator.g:403:9: ( 'constraints' (cons= invariant |ppc= prePost )* )
            	    // Generator.g:403:11: 'constraints' (cons= invariant |ppc= prePost )*
            	    {
            	    match(input,73,FOLLOW_73_in_model1476); if (state.failed) return n;

            	    // Generator.g:404:11: (cons= invariant |ppc= prePost )*
            	    loop20:
            	    do {
            	        int alt20=3;
            	        alt20 = dfa20.predict(input);
            	        switch (alt20) {
            	    	case 1 :
            	    	    // Generator.g:404:15: cons= invariant
            	    	    {
            	    	    pushFollow(FOLLOW_invariant_in_model1494);
            	    	    cons=invariant();

            	    	    state._fsp--;
            	    	    if (state.failed) return n;

            	    	    if ( state.backtracking==0 ) { n.addConstraint(cons); }

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // Generator.g:405:15: ppc= prePost
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
            	    // Generator.g:408:9: e= enumTypeDefinition
            	    {
            	    pushFollow(FOLLOW_enumTypeDefinition_in_model1555);
            	    e=enumTypeDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addEnumTypeDef(e); }

            	    }
            	    break;
            	case 5 :
            	    // Generator.g:409:9: query
            	    {
            	    pushFollow(FOLLOW_query_in_model1567);
            	    query();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            match(input,EOF,FOLLOW_EOF_in_model1580); if (state.failed) return n;

            }

        }
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
            pushFollow(FOLLOW_annotationSet_in_enumTypeDefinition1608);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            match(input,84,FOLLOW_84_in_enumTypeDefinition1614); if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumTypeDefinition1618); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_enumTypeDefinition1620); if (state.failed) return n;

            pushFollow(FOLLOW_idList_in_enumTypeDefinition1624);
            idListRes=idList();

            state._fsp--;
            if (state.failed) return n;

            match(input,RBRACE,FOLLOW_RBRACE_in_enumTypeDefinition1626); if (state.failed) return n;

            // Generator.g:421:54: ( SEMI )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==SEMI) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // Generator.g:421:56: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_enumTypeDefinition1630); if (state.failed) return n;

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
            pushFollow(FOLLOW_annotationSet_in_generalClassifierDefinition1668);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return ;

            // Generator.g:436:5: ( 'abstract' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==63) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Generator.g:436:7: 'abstract'
                    {
                    match(input,63,FOLLOW_63_in_generalClassifierDefinition1676); if (state.failed) return ;

                    if ( state.backtracking==0 ) { isAbstract = true; }

                    }
                    break;

            }


            // Generator.g:437:5: (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] )
            int alt24=3;
            switch ( input.LA(1) ) {
            case AT:
                {
                alt24=1;
                }
                break;
            case IDENT:
                {
                int LA24_2 = input.LA(2);

                if ( ((input.LT(1).getText().equals("class"))) ) {
                    alt24=1;
                }
                else if ( ((input.LT(1).getText().equals("signal"))) ) {
                    alt24=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;

                }
                }
                break;
            case 66:
            case 67:
                {
                alt24=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // Generator.g:438:9: c= classDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_classDefinition_in_generalClassifierDefinition1704);
                    c=classDefinition(isAbstract);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { n.addClass(c); c.setAnnotations(as); }

                    }
                    break;
                case 2 :
                    // Generator.g:441:9: ac= associationClassDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_associationClassDefinition_in_generalClassifierDefinition1742);
                    ac=associationClassDefinition(isAbstract);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { n.addAssociationClass(ac); ac.setAnnotations(as); }

                    }
                    break;
                case 3 :
                    // Generator.g:444:9: s= signalDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_signalDefinition_in_generalClassifierDefinition1787);
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
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==AT) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==IDENT) ) {
                    alt25=1;
                }
                else if ( (LA25_1==48||LA25_1==54||LA25_1==59) ) {
                    alt25=2;
                }
            }
            switch (alt25) {
                case 1 :
                    // Generator.g:468:3: tag= block_annotation
                    {
                    pushFollow(FOLLOW_block_annotation_in_classDefinition1841);
                    tag=block_annotation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 2 :
                    // Generator.g:468:26: tag= line_annotation[tag]
                    {
                    pushFollow(FOLLOW_line_annotation_in_classDefinition1847);
                    tag=line_annotation(tag);

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_keyClass_in_classDefinition1857);
            keyClass();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_classDefinition1861); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTClass(name, isAbstract); n.setAnnotationTag(tag);}

            // Generator.g:470:5: ( LESS idListRes= idList )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==LESS) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // Generator.g:470:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_classDefinition1871); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_classDefinition1875);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addSuperClasses(idListRes); }

                    }
                    break;

            }


            // Generator.g:471:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==68) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // Generator.g:471:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,68,FOLLOW_68_in_classDefinition1888); if (state.failed) return n;

                    // Generator.g:472:7: (a= attributeDefinition )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==AT||LA27_0==IDENT||LA27_0==63||(LA27_0 >= 66 && LA27_0 <= 67)||LA27_0==84||LA27_0==94||LA27_0==97||(LA27_0 >= 110 && LA27_0 <= 111)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // Generator.g:472:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_classDefinition1901);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addAttribute(a); }

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:474:5: ( 'operations' (op= operationDefinition )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==107) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // Generator.g:474:7: 'operations' (op= operationDefinition )*
                    {
                    match(input,107,FOLLOW_107_in_classDefinition1922); if (state.failed) return n;

                    // Generator.g:475:7: (op= operationDefinition )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==AT||LA29_0==IDENT||LA29_0==63||(LA29_0 >= 66 && LA29_0 <= 67)||LA29_0==84||LA29_0==94||LA29_0==97||(LA29_0 >= 110 && LA29_0 <= 111)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // Generator.g:475:9: op= operationDefinition
                    	    {
                    	    pushFollow(FOLLOW_operationDefinition_in_classDefinition1935);
                    	    op=operationDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addOperation(op); }

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:477:5: ( 'constraints' (inv= invariantClause )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==73) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // Generator.g:477:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,73,FOLLOW_73_in_classDefinition1956); if (state.failed) return n;

                    // Generator.g:478:7: (inv= invariantClause )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==AT||LA31_0==IDENT||LA31_0==63||(LA31_0 >= 66 && LA31_0 <= 67)||(LA31_0 >= 84 && LA31_0 <= 85)||LA31_0==94||LA31_0==97||(LA31_0 >= 110 && LA31_0 <= 111)) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // Generator.g:479:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_classDefinition1976);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:482:5: ( 'statemachines' (sm= stateMachine )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==118) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // Generator.g:482:7: 'statemachines' (sm= stateMachine )*
                    {
                    match(input,118,FOLLOW_118_in_classDefinition2002); if (state.failed) return n;

                    // Generator.g:483:7: (sm= stateMachine )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==113) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // Generator.g:484:9: sm= stateMachine
                    	    {
                    	    pushFollow(FOLLOW_stateMachine_in_classDefinition2022);
                    	    sm=stateMachine();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addStateMachine(sm); }

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,82,FOLLOW_82_in_classDefinition2046); if (state.failed) return n;

            }

        }
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

            if ( (input.LA(1) >= 66 && input.LA(1) <= 67) ) {
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

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationClassDefinition2105); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociationClass(name, isAbstract); }

            // Generator.g:517:5: ( LESS idListRes= idList )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==LESS) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // Generator.g:517:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_associationClassDefinition2115); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_associationClassDefinition2119);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addSuperClasses(idListRes); }

                    }
                    break;

            }


            // Generator.g:518:5: ( 'between' ae= associationEnd (ae= associationEnd )+ )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==71) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // Generator.g:518:6: 'between' ae= associationEnd (ae= associationEnd )+
                    {
                    match(input,71,FOLLOW_71_in_associationClassDefinition2131); if (state.failed) return n;

                    pushFollow(FOLLOW_associationEnd_in_associationClassDefinition2139);
                    ae=associationEnd();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addEnd(ae); }

                    // Generator.g:520:5: (ae= associationEnd )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==IDENT) ) {
                            int LA36_2 = input.LA(2);

                            if ( (LA36_2==LBRACK) ) {
                                alt36=1;
                            }


                        }
                        else if ( (LA36_0==AT) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // Generator.g:520:7: ae= associationEnd
                    	    {
                    	    pushFollow(FOLLOW_associationEnd_in_associationClassDefinition2151);
                    	    ae=associationEnd();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addEnd(ae); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt36 >= 1 ) break loop36;
                    	    if (state.backtracking>0) {state.failed=true; return n;}
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);


                    }
                    break;

            }


            // Generator.g:522:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==68) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // Generator.g:522:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,68,FOLLOW_68_in_associationClassDefinition2171); if (state.failed) return n;

                    // Generator.g:523:7: (a= attributeDefinition )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==IDENT) ) {
                            int LA38_2 = input.LA(2);

                            if ( (LA38_2==COLON) ) {
                                alt38=1;
                            }


                        }
                        else if ( (LA38_0==AT) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // Generator.g:523:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_associationClassDefinition2184);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addAttribute(a); }

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:525:5: ( 'operations' (op= operationDefinition )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==107) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // Generator.g:525:7: 'operations' (op= operationDefinition )*
                    {
                    match(input,107,FOLLOW_107_in_associationClassDefinition2205); if (state.failed) return n;

                    // Generator.g:526:7: (op= operationDefinition )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==IDENT) ) {
                            int LA40_2 = input.LA(2);

                            if ( (LA40_2==LPAREN) ) {
                                alt40=1;
                            }


                        }
                        else if ( (LA40_0==AT) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // Generator.g:526:9: op= operationDefinition
                    	    {
                    	    pushFollow(FOLLOW_operationDefinition_in_associationClassDefinition2218);
                    	    op=operationDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addOperation(op); }

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:528:5: ( 'constraints' (inv= invariantClause )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==73) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // Generator.g:528:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,73,FOLLOW_73_in_associationClassDefinition2239); if (state.failed) return n;

                    // Generator.g:529:7: (inv= invariantClause )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==AT||LA42_0==85||LA42_0==94) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // Generator.g:530:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_associationClassDefinition2259);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:533:5: ( 'statemachines' (sm= stateMachine )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==118) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // Generator.g:533:7: 'statemachines' (sm= stateMachine )*
                    {
                    match(input,118,FOLLOW_118_in_associationClassDefinition2285); if (state.failed) return n;

                    // Generator.g:534:7: (sm= stateMachine )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==113) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // Generator.g:535:9: sm= stateMachine
                    	    {
                    	    pushFollow(FOLLOW_stateMachine_in_associationClassDefinition2305);
                    	    sm=stateMachine();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addStateMachine(sm); }

                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:539:5: ( ( keyAggregation | keyComposition ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==IDENT) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // Generator.g:539:7: ( keyAggregation | keyComposition )
                    {
                    if ( state.backtracking==0 ) { t = input.LT(1); }

                    // Generator.g:540:7: ( keyAggregation | keyComposition )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==IDENT) ) {
                        int LA46_1 = input.LA(2);

                        if ( ((input.LT(1).getText().equals("aggregation"))) ) {
                            alt46=1;
                        }
                        else if ( ((input.LT(1).getText().equals("composition"))) ) {
                            alt46=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return n;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 46, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;

                    }
                    switch (alt46) {
                        case 1 :
                            // Generator.g:540:9: keyAggregation
                            {
                            pushFollow(FOLLOW_keyAggregation_in_associationClassDefinition2346);
                            keyAggregation();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;
                        case 2 :
                            // Generator.g:540:26: keyComposition
                            {
                            pushFollow(FOLLOW_keyComposition_in_associationClassDefinition2350);
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


            match(input,82,FOLLOW_82_in_associationClassDefinition2373); if (state.failed) return n;

            }

        }
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
            pushFollow(FOLLOW_annotationSet_in_attributeDefinition2401);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_attributeDefinition2409); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_attributeDefinition2411); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_attributeDefinition2415);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            // Generator.g:555:5: ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )?
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==IDENT) ) {
                int LA49_1 = input.LA(2);

                if ( (((input.LT(1).getText().equals("derived"))||(input.LT(1).getText().equals("derive")))) ) {
                    alt49=1;
                }
                else if ( ((input.LT(1).getText().equals("init"))) ) {
                    alt49=2;
                }
            }
            switch (alt49) {
                case 1 :
                    // Generator.g:556:9: ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression )
                    {
                    // Generator.g:556:9: ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression )
                    // Generator.g:556:10: ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression
                    {
                    // Generator.g:556:10: ( keyDerive | keyDerived )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==IDENT) ) {
                        int LA48_1 = input.LA(2);

                        if ( ((input.LT(1).getText().equals("derive"))) ) {
                            alt48=1;
                        }
                        else if ( ((input.LT(1).getText().equals("derived"))) ) {
                            alt48=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return n;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 48, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;

                    }
                    switch (alt48) {
                        case 1 :
                            // Generator.g:556:11: keyDerive
                            {
                            pushFollow(FOLLOW_keyDerive_in_attributeDefinition2439);
                            keyDerive();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;
                        case 2 :
                            // Generator.g:556:21: keyDerived
                            {
                            pushFollow(FOLLOW_keyDerived_in_attributeDefinition2441);
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


                    pushFollow(FOLLOW_expression_in_attributeDefinition2454);
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
                    pushFollow(FOLLOW_keyInit_in_attributeDefinition2474);
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


                    pushFollow(FOLLOW_expression_in_attributeDefinition2490);
                    initExpression=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    }


                    }
                    break;

            }


            // Generator.g:560:5: ( SEMI )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==SEMI) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // Generator.g:560:5: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_attributeDefinition2504); if (state.failed) return n;

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
            pushFollow(FOLLOW_annotationSet_in_operationDefinition2535);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationDefinition2545); if (state.failed) return n;

            pushFollow(FOLLOW_paramList_in_operationDefinition2555);
            pl=paramList();

            state._fsp--;
            if (state.failed) return n;

            // Generator.g:582:5: ( COLON t= type )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==COLON) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // Generator.g:582:7: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_operationDefinition2569); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_operationDefinition2575);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n = new ASTOperation(name, pl, t); n.setAnnotations(as); }

            // Generator.g:584:5: ( ( EQUAL e= expression ) | (s= blockStat ) )?
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==EQUAL) ) {
                alt52=1;
            }
            else if ( (LA52_0==70) ) {
                alt52=2;
            }
            switch (alt52) {
                case 1 :
                    // Generator.g:585:9: ( EQUAL e= expression )
                    {
                    // Generator.g:585:9: ( EQUAL e= expression )
                    // Generator.g:585:11: EQUAL e= expression
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_operationDefinition2603); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_operationDefinition2609);
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
                    pushFollow(FOLLOW_blockStat_in_operationDefinition2631);
                    s=blockStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setStatement((s!=null?s.n:null));  }

                    }


                    }
                    break;

            }


            // Generator.g:588:5: (ppc= prePostClause )*
            loop53:
            do {
                int alt53=2;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // Generator.g:588:7: ppc= prePostClause
            	    {
            	    pushFollow(FOLLOW_prePostClause_in_operationDefinition2653);
            	    ppc=prePostClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addPrePostClause(ppc); }

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            // Generator.g:589:5: ( SEMI )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==SEMI) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // Generator.g:589:7: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_operationDefinition2666); if (state.failed) return n;

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
            pushFollow(FOLLOW_annotationSet_in_associationDefinition2697);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            // Generator.g:603:2: (tag= line_annotation[tag] )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==AT) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // Generator.g:603:3: tag= line_annotation[tag]
                    {
                    pushFollow(FOLLOW_line_annotation_in_associationDefinition2703);
                    tag=line_annotation(tag);

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { t = input.LT(1); }

            // Generator.g:605:5: ( keyAssociation | keyAggregation | keyComposition )
            int alt56=3;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==IDENT) ) {
                int LA56_1 = input.LA(2);

                if ( ((input.LT(1).getText().equals("association"))) ) {
                    alt56=1;
                }
                else if ( ((input.LT(1).getText().equals("aggregation"))) ) {
                    alt56=2;
                }
                else if ( ((input.LT(1).getText().equals("composition"))) ) {
                    alt56=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }
            switch (alt56) {
                case 1 :
                    // Generator.g:605:7: keyAssociation
                    {
                    pushFollow(FOLLOW_keyAssociation_in_associationDefinition2720);
                    keyAssociation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 2 :
                    // Generator.g:605:24: keyAggregation
                    {
                    pushFollow(FOLLOW_keyAggregation_in_associationDefinition2724);
                    keyAggregation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 3 :
                    // Generator.g:605:41: keyComposition
                    {
                    pushFollow(FOLLOW_keyComposition_in_associationDefinition2728);
                    keyComposition();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationDefinition2738); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociation(t, name); n.setAnnotations(as);n.setAnnotationTag(tag);}

            match(input,71,FOLLOW_71_in_associationDefinition2746); if (state.failed) return n;

            pushFollow(FOLLOW_associationEnd_in_associationDefinition2754);
            ae=associationEnd();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addEnd(ae); }

            // Generator.g:609:5: (ae= associationEnd )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==AT||LA57_0==IDENT||LA57_0==63||(LA57_0 >= 66 && LA57_0 <= 67)||LA57_0==84||LA57_0==94||LA57_0==97||(LA57_0 >= 110 && LA57_0 <= 111)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // Generator.g:609:7: ae= associationEnd
            	    {
            	    pushFollow(FOLLOW_associationEnd_in_associationDefinition2766);
            	    ae=associationEnd();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addEnd(ae); }

            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);


            match(input,82,FOLLOW_82_in_associationDefinition2777); if (state.failed) return n;

            }

        }
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
            pushFollow(FOLLOW_annotationSet_in_associationEnd2802);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd2810); if (state.failed) return n;

            match(input,LBRACK,FOLLOW_LBRACK_in_associationEnd2812); if (state.failed) return n;

            pushFollow(FOLLOW_multiplicity_in_associationEnd2816);
            m=multiplicity();

            state._fsp--;
            if (state.failed) return n;

            match(input,RBRACK,FOLLOW_RBRACK_in_associationEnd2818); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociationEnd(name, m); n.setAnnotations(as); }

            // Generator.g:622:5: ( keyRole rn= IDENT )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==IDENT) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==IDENT) ) {
                    int LA58_3 = input.LA(3);

                    if ( ((input.LT(1).getText().equals("role"))) ) {
                        alt58=1;
                    }
                }
            }
            switch (alt58) {
                case 1 :
                    // Generator.g:622:7: keyRole rn= IDENT
                    {
                    pushFollow(FOLLOW_keyRole_in_associationEnd2829);
                    keyRole();

                    state._fsp--;
                    if (state.failed) return n;

                    rn=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd2833); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setRolename(rn); }

                    }
                    break;

            }


            // Generator.g:623:5: ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )*
            loop61:
            do {
                int alt61=7;
                switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA61_3 = input.LA(2);

                    if ( ((input.LT(1).getText().equals("union"))) ) {
                        alt61=3;
                    }
                    else if ( (((input.LT(1).getText().equals("derived"))||(input.LT(1).getText().equals("derive")))) ) {
                        alt61=5;
                    }
                    else if ( ((input.LT(1).getText().equals("qualifier"))) ) {
                        alt61=6;
                    }


                    }
                    break;
                case 109:
                    {
                    alt61=1;
                    }
                    break;
                case 120:
                    {
                    alt61=2;
                    }
                    break;
                case 115:
                    {
                    alt61=4;
                    }
                    break;

                }

                switch (alt61) {
            	case 1 :
            	    // Generator.g:624:9: 'ordered'
            	    {
            	    match(input,109,FOLLOW_109_in_associationEnd2854); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setOrdered(); }

            	    }
            	    break;
            	case 2 :
            	    // Generator.g:625:9: 'subsets' sr= IDENT
            	    {
            	    match(input,120,FOLLOW_120_in_associationEnd2866); if (state.failed) return n;

            	    sr=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd2870); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addSubsetsRolename(sr); }

            	    }
            	    break;
            	case 3 :
            	    // Generator.g:626:9: keyUnion
            	    {
            	    pushFollow(FOLLOW_keyUnion_in_associationEnd2882);
            	    keyUnion();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setUnion(true); }

            	    }
            	    break;
            	case 4 :
            	    // Generator.g:627:9: 'redefines' rd= IDENT
            	    {
            	    match(input,115,FOLLOW_115_in_associationEnd2894); if (state.failed) return n;

            	    rd=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd2898); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addRedefinesRolename(rd); }

            	    }
            	    break;
            	case 5 :
            	    // Generator.g:628:9: ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression
            	    {
            	    // Generator.g:628:9: ( keyDerived | keyDerive )
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==IDENT) ) {
            	        int LA59_1 = input.LA(2);

            	        if ( ((input.LT(1).getText().equals("derived"))) ) {
            	            alt59=1;
            	        }
            	        else if ( ((input.LT(1).getText().equals("derive"))) ) {
            	            alt59=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return n;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 59, 1, input);

            	            throw nvae;

            	        }
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 59, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // Generator.g:628:10: keyDerived
            	            {
            	            pushFollow(FOLLOW_keyDerived_in_associationEnd2911);
            	            keyDerived();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;
            	        case 2 :
            	            // Generator.g:628:21: keyDerive
            	            {
            	            pushFollow(FOLLOW_keyDerive_in_associationEnd2913);
            	            keyDerive();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    // Generator.g:628:32: ( LPAREN parameter= elemVarsDeclaration RPAREN )?
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==LPAREN) ) {
            	        alt60=1;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // Generator.g:628:34: LPAREN parameter= elemVarsDeclaration RPAREN
            	            {
            	            match(input,LPAREN,FOLLOW_LPAREN_in_associationEnd2918); if (state.failed) return n;

            	            pushFollow(FOLLOW_elemVarsDeclaration_in_associationEnd2924);
            	            parameter=elemVarsDeclaration();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            match(input,RPAREN,FOLLOW_RPAREN_in_associationEnd2926); if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_associationEnd2930); if (state.failed) return n;

            	    pushFollow(FOLLOW_expression_in_associationEnd2934);
            	    exp=expression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setDerived((exp!=null?exp.n:null), parameter); }

            	    }
            	    break;
            	case 6 :
            	    // Generator.g:629:9: keyQualifier qualifiers= paramList
            	    {
            	    pushFollow(FOLLOW_keyQualifier_in_associationEnd2946);
            	    keyQualifier();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    pushFollow(FOLLOW_paramList_in_associationEnd2952);
            	    qualifiers=paramList();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) {n.setQualifiers(qualifiers); }

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            // Generator.g:631:5: ( SEMI )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==SEMI) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // Generator.g:631:7: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_associationEnd2969); if (state.failed) return n;

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

            pushFollow(FOLLOW_multiplicityRange_in_multiplicity3004);
            mr=multiplicityRange();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addRange(mr); }

            // Generator.g:652:5: ( COMMA mr= multiplicityRange )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==COMMA) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // Generator.g:652:7: COMMA mr= multiplicityRange
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multiplicity3014); if (state.failed) return n;

            	    pushFollow(FOLLOW_multiplicityRange_in_multiplicity3018);
            	    mr=multiplicityRange();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addRange(mr); }

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
            pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange3047);
            ms1=multiplicitySpec();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTMultiplicityRange(ms1); }

            // Generator.g:658:5: ( DOTDOT ms2= multiplicitySpec )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==DOTDOT) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // Generator.g:658:7: DOTDOT ms2= multiplicitySpec
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_multiplicityRange3057); if (state.failed) return n;

                    pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange3061);
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
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==INT) ) {
                alt65=1;
            }
            else if ( (LA65_0==STAR) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return m;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }
            switch (alt65) {
                case 1 :
                    // Generator.g:664:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_multiplicitySpec3095); if (state.failed) return m;

                    if ( state.backtracking==0 ) { m = Integer.parseInt((i!=null?i.getText():null)); }

                    }
                    break;
                case 2 :
                    // Generator.g:665:7: STAR
                    {
                    match(input,STAR,FOLLOW_STAR_in_multiplicitySpec3105); if (state.failed) return m;

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
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==AT) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==IDENT) ) {
                    alt66=1;
                }
                else if ( (LA66_1==48||LA66_1==54||LA66_1==59) ) {
                    alt66=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return tag;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return tag;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;

            }
            switch (alt66) {
                case 1 :
                    // Generator.g:671:2: rtag= block_annotation
                    {
                    pushFollow(FOLLOW_block_annotation_in_annotationSpec3133);
                    rtag=block_annotation();

                    state._fsp--;
                    if (state.failed) return tag;

                    if ( state.backtracking==0 ) {tag =rtag;}

                    }
                    break;
                case 2 :
                    // Generator.g:672:4: rtag= line_annotation[tag]
                    {
                    pushFollow(FOLLOW_line_annotation_in_annotationSpec3142);
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
            match(input,AT,FOLLOW_AT_in_block_annotation3164); if (state.failed) return tag;

            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_block_annotation3166); if (state.failed) return tag;

            match(input,LBRACE,FOLLOW_LBRACE_in_block_annotation3168); if (state.failed) return tag;

            // Generator.g:679:3: ( annotation_tag[tag] )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==48||LA67_0==54||LA67_0==59) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // Generator.g:679:4: annotation_tag[tag]
            	    {
            	    pushFollow(FOLLOW_annotation_tag_in_block_annotation3173);
            	    annotation_tag(tag);

            	    state._fsp--;
            	    if (state.failed) return tag;

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            if ( state.backtracking==0 ) {tag.setName(IDENT1.getText());}

            match(input,RBRACE,FOLLOW_RBRACE_in_block_annotation3181); if (state.failed) return tag;

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
            match(input,AT,FOLLOW_AT_in_line_annotation3200); if (state.failed) return rtag;

            // Generator.g:685:5: ( annotation_tag[tag] )
            // Generator.g:685:6: annotation_tag[tag]
            {
            pushFollow(FOLLOW_annotation_tag_in_line_annotation3203);
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
            int alt70=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt70=1;
                }
                break;
            case 54:
                {
                alt70=2;
                }
                break;
            case 59:
                {
                alt70=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }

            switch (alt70) {
                case 1 :
                    // Generator.g:690:2: annotation_comment EQUAL ( NON_OCL_STRING )
                    {
                    pushFollow(FOLLOW_annotation_comment_in_annotation_tag3219);
                    annotation_comment();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,EQUAL,FOLLOW_EQUAL_in_annotation_tag3221); if (state.failed) return ;

                    // Generator.g:690:27: ( NON_OCL_STRING )
                    // Generator.g:690:28: NON_OCL_STRING
                    {
                    NON_OCL_STRING2=(Token)match(input,NON_OCL_STRING,FOLLOW_NON_OCL_STRING_in_annotation_tag3224); if (state.failed) return ;

                    if ( state.backtracking==0 ) {tag.setComments(NON_OCL_STRING2.getText());}

                    }


                    }
                    break;
                case 2 :
                    // Generator.g:691:4: annotation_weight EQUAL ( annotation_def | INT )
                    {
                    pushFollow(FOLLOW_annotation_weight_in_annotation_tag3232);
                    annotation_weight();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,EQUAL,FOLLOW_EQUAL_in_annotation_tag3234); if (state.failed) return ;

                    // Generator.g:691:28: ( annotation_def | INT )
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==69) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==INT) ) {
                        alt68=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;

                    }
                    switch (alt68) {
                        case 1 :
                            // Generator.g:691:29: annotation_def
                            {
                            pushFollow(FOLLOW_annotation_def_in_annotation_tag3237);
                            annotation_def();

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {tag.setWeight(new IntWeight(-1));}

                            }
                            break;
                        case 2 :
                            // Generator.g:691:83: INT
                            {
                            INT3=(Token)match(input,INT,FOLLOW_INT_in_annotation_tag3243); if (state.failed) return ;

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
                    pushFollow(FOLLOW_annotation_type_in_annotation_tag3251);
                    annotation_type();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,EQUAL,FOLLOW_EQUAL_in_annotation_tag3253); if (state.failed) return ;

                    // Generator.g:695:26: ( annotation_enum_type | annotation_ref )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==49||LA69_0==57) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==AT) ) {
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
                            // Generator.g:695:27: annotation_enum_type
                            {
                            pushFollow(FOLLOW_annotation_enum_type_in_annotation_tag3256);
                            annotation_enum_type();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // Generator.g:695:50: annotation_ref
                            {
                            pushFollow(FOLLOW_annotation_ref_in_annotation_tag3260);
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
            if ( input.LA(1)==48||input.LA(1)==54||input.LA(1)==59 ) {
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
            match(input,48,FOLLOW_48_in_annotation_comment3288); if (state.failed) return ;

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
            match(input,54,FOLLOW_54_in_annotation_weight3295); if (state.failed) return ;

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
            match(input,59,FOLLOW_59_in_annotation_type3302); if (state.failed) return ;

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
            match(input,53,FOLLOW_53_in_annotation_override3311); if (state.failed) return ;

            match(input,LPAREN,FOLLOW_LPAREN_in_annotation_override3313); if (state.failed) return ;

            match(input,LBRACE,FOLLOW_LBRACE_in_annotation_override3315); if (state.failed) return ;

            pushFollow(FOLLOW_annotation_term_in_annotation_override3317);
            annotation_term();

            state._fsp--;
            if (state.failed) return ;

            match(input,RBRACE,FOLLOW_RBRACE_in_annotation_override3319); if (state.failed) return ;

            match(input,RPAREN,FOLLOW_RPAREN_in_annotation_override3321); if (state.failed) return ;

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
            pushFollow(FOLLOW_annotation_tag_in_annotation_term3338);
            annotation_tag(tag);

            state._fsp--;
            if (state.failed) return tag;

            // Generator.g:714:22: ( COMMA annotation_tag[tag] )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==COMMA) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // Generator.g:714:23: COMMA annotation_tag[tag]
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_annotation_term3342); if (state.failed) return tag;

            	    pushFollow(FOLLOW_annotation_tag_in_annotation_term3344);
            	    annotation_tag(tag);

            	    state._fsp--;
            	    if (state.failed) return tag;

            	    }
            	    break;

            	default :
            	    break loop71;
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
            match(input,AT,FOLLOW_AT_in_annotation_ref3356); if (state.failed) return ;

            match(input,IDENT,FOLLOW_IDENT_in_annotation_ref3358); if (state.failed) return ;

            match(input,DOT,FOLLOW_DOT_in_annotation_ref3360); if (state.failed) return ;

            pushFollow(FOLLOW_annotation_predefined_in_annotation_ref3362);
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
            match(input,69,FOLLOW_69_in_annotation_def3371); if (state.failed) return ;

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
            if ( input.LA(1)==49||input.LA(1)==57 ) {
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
    // Generator.g:729:1: query : 'query' queryExpr ( queryCOND expression )* ;
    public final void query() throws RecognitionException {
        try {
            // Generator.g:729:6: ( 'query' queryExpr ( queryCOND expression )* )
            // Generator.g:730:3: 'query' queryExpr ( queryCOND expression )*
            {
            match(input,114,FOLLOW_114_in_query3395); if (state.failed) return ;

            pushFollow(FOLLOW_queryExpr_in_query3397);
            queryExpr();

            state._fsp--;
            if (state.failed) return ;

            // Generator.g:730:21: ( queryCOND expression )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0 >= 61 && LA72_0 <= 62)) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // Generator.g:730:22: queryCOND expression
            	    {
            	    pushFollow(FOLLOW_queryCOND_in_query3400);
            	    queryCOND();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    pushFollow(FOLLOW_expression_in_query3402);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "query"



    // $ANTLR start "queryExpr"
    // Generator.g:733:1: queryExpr : ( queryVariable ) ( COMMA queryVariable )* ;
    public final void queryExpr() throws RecognitionException {
        try {
            // Generator.g:733:10: ( ( queryVariable ) ( COMMA queryVariable )* )
            // Generator.g:734:3: ( queryVariable ) ( COMMA queryVariable )*
            {
            // Generator.g:734:3: ( queryVariable )
            // Generator.g:734:4: queryVariable
            {
            pushFollow(FOLLOW_queryVariable_in_queryExpr3415);
            queryVariable();

            state._fsp--;
            if (state.failed) return ;

            }


            // Generator.g:734:19: ( COMMA queryVariable )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==COMMA) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // Generator.g:734:20: COMMA queryVariable
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_queryExpr3419); if (state.failed) return ;

            	    pushFollow(FOLLOW_queryVariable_in_queryExpr3421);
            	    queryVariable();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop73;
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
    // Generator.g:737:1: queryVariable : IDENT ;
    public final void queryVariable() throws RecognitionException {
        try {
            // Generator.g:737:14: ( IDENT )
            // Generator.g:737:16: IDENT
            {
            match(input,IDENT,FOLLOW_IDENT_in_queryVariable3431); if (state.failed) return ;

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
    // Generator.g:739:1: queryCOND : ( 'With' | 'Without' );
    public final void queryCOND() throws RecognitionException {
        try {
            // Generator.g:739:10: ( 'With' | 'Without' )
            // Generator.g:
            {
            if ( (input.LA(1) >= 61 && input.LA(1) <= 62) ) {
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
    // Generator.g:760:1: invariant returns [ASTConstraintDefinition n] : (tag= block_annotation )? 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* ;
    public final ASTConstraintDefinition invariant() throws RecognitionException {
        ASTConstraintDefinition n = null;


        Token v=null;
        AnnotationTag tag =null;

        ASTSimpleType t =null;

        ASTInvariantClause inv =null;


        try {
            // Generator.g:761:5: ( (tag= block_annotation )? 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* )
            // Generator.g:762:5: (tag= block_annotation )? 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )*
            {
            if ( state.backtracking==0 ) { n = new ASTConstraintDefinition();}

            // Generator.g:763:2: (tag= block_annotation )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==AT) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // Generator.g:763:3: tag= block_annotation
                    {
                    pushFollow(FOLLOW_block_annotation_in_invariant3477);
                    tag=block_annotation();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n.addBlockAnnotationTag(tag);}

                    }
                    break;

            }


            match(input,74,FOLLOW_74_in_invariant3488); if (state.failed) return n;

            // Generator.g:765:5: (v= IDENT ( ',' v= IDENT )* COLON )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==IDENT) ) {
                int LA76_1 = input.LA(2);

                if ( (LA76_1==COLON||LA76_1==COMMA) ) {
                    alt76=1;
                }
            }
            switch (alt76) {
                case 1 :
                    // Generator.g:765:7: v= IDENT ( ',' v= IDENT )* COLON
                    {
                    v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant3498); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addVarName(v); }

                    // Generator.g:766:8: ( ',' v= IDENT )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==COMMA) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // Generator.g:766:9: ',' v= IDENT
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_invariant3510); if (state.failed) return n;

                    	    v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant3514); if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addVarName(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);


                    match(input,COLON,FOLLOW_COLON_in_invariant3522); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_simpleType_in_invariant3534);
            t=simpleType();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setType(t); }

            // Generator.g:768:5: (inv= invariantClause )*
            loop77:
            do {
                int alt77=2;
                alt77 = dfa77.predict(input);
                switch (alt77) {
            	case 1 :
            	    // Generator.g:768:7: inv= invariantClause
            	    {
            	    pushFollow(FOLLOW_invariantClause_in_invariant3546);
            	    inv=invariantClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

            	    }
            	    break;

            	default :
            	    break loop77;
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
    // Generator.g:775:1: invariantClause returns [ASTInvariantClause n] : ( (tag= line_annotation[tag] )* as= annotationSet 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression );
    public final ASTInvariantClause invariantClause() throws RecognitionException {
        ASTInvariantClause n = null;


        Token name=null;
        AnnotationTag tag =null;

        Set<ASTAnnotation> as =null;

        GeneratorParser.expression_return e =null;


        tag = null;
        try {
            // Generator.g:776:19: ( (tag= line_annotation[tag] )* as= annotationSet 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==AT||LA81_0==IDENT||LA81_0==63||(LA81_0 >= 66 && LA81_0 <= 67)||LA81_0==84||LA81_0==94||LA81_0==97||(LA81_0 >= 110 && LA81_0 <= 111)) ) {
                alt81=1;
            }
            else if ( (LA81_0==85) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;

            }
            switch (alt81) {
                case 1 :
                    // Generator.g:777:2: (tag= line_annotation[tag] )* as= annotationSet 'inv' (name= IDENT )? COLON e= expression
                    {
                    // Generator.g:777:2: (tag= line_annotation[tag] )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==AT) ) {
                            int LA78_1 = input.LA(2);

                            if ( (LA78_1==48||LA78_1==54||LA78_1==59) ) {
                                alt78=1;
                            }


                        }


                        switch (alt78) {
                    	case 1 :
                    	    // Generator.g:777:3: tag= line_annotation[tag]
                    	    {
                    	    pushFollow(FOLLOW_line_annotation_in_invariantClause3578);
                    	    tag=line_annotation(tag);

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);


                    pushFollow(FOLLOW_annotationSet_in_invariantClause3588);
                    as=annotationSet();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,94,FOLLOW_94_in_invariantClause3595); if (state.failed) return n;

                    // Generator.g:779:12: (name= IDENT )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==IDENT) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // Generator.g:779:14: name= IDENT
                            {
                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause3601); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,COLON,FOLLOW_COLON_in_invariantClause3606); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_invariantClause3610);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTInvariantClause(name, (e!=null?e.n:null)); n.setAnnotations(as);n.setAnnotationTag(tag);}

                    }
                    break;
                case 2 :
                    // Generator.g:781:7: 'existential' 'inv' (name= IDENT )? COLON e= expression
                    {
                    match(input,85,FOLLOW_85_in_invariantClause3627); if (state.failed) return n;

                    match(input,94,FOLLOW_94_in_invariantClause3629); if (state.failed) return n;

                    // Generator.g:781:27: (name= IDENT )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==IDENT) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // Generator.g:781:29: name= IDENT
                            {
                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause3635); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,COLON,FOLLOW_COLON_in_invariantClause3640); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_invariantClause3644);
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
    // Generator.g:793:1: prePost returns [ASTPrePost n] : 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ ;
    public final ASTPrePost prePost() throws RecognitionException {
        ASTPrePost n = null;


        Token classname=null;
        Token opname=null;
        List<ASTVariableDeclaration> pl =null;

        ASTType rt =null;

        ASTPrePostClause ppc =null;


        try {
            // Generator.g:794:5: ( 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ )
            // Generator.g:795:5: 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+
            {
            match(input,74,FOLLOW_74_in_prePost3677); if (state.failed) return n;

            classname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost3681); if (state.failed) return n;

            match(input,COLON_COLON,FOLLOW_COLON_COLON_in_prePost3683); if (state.failed) return n;

            opname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost3687); if (state.failed) return n;

            pushFollow(FOLLOW_paramList_in_prePost3691);
            pl=paramList();

            state._fsp--;
            if (state.failed) return n;

            // Generator.g:795:69: ( COLON rt= type )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==COLON) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // Generator.g:795:71: COLON rt= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_prePost3695); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_prePost3699);
                    rt=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n = new ASTPrePost(classname, opname, pl, rt); }

            // Generator.g:797:5: (ppc= prePostClause )+
            int cnt83=0;
            loop83:
            do {
                int alt83=2;
                alt83 = dfa83.predict(input);
                switch (alt83) {
            	case 1 :
            	    // Generator.g:797:7: ppc= prePostClause
            	    {
            	    pushFollow(FOLLOW_prePostClause_in_prePost3718);
            	    ppc=prePostClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addPrePostClause(ppc); }

            	    }
            	    break;

            	default :
            	    if ( cnt83 >= 1 ) break loop83;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(83, input);
                        throw eee;
                }
                cnt83++;
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
    // Generator.g:804:1: prePostClause returns [ASTPrePostClause n] : as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression ;
    public final ASTPrePostClause prePostClause() throws RecognitionException {
        ASTPrePostClause n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        GeneratorParser.expression_return e =null;


         Token t = null; 
        try {
            // Generator.g:806:2: (as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression )
            // Generator.g:807:2: as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression
            {
            pushFollow(FOLLOW_annotationSet_in_prePostClause3752);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { t = input.LT(1); }

            if ( (input.LA(1) >= 110 && input.LA(1) <= 111) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // Generator.g:809:25: (name= IDENT )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==IDENT) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // Generator.g:809:27: name= IDENT
                    {
                    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePostClause3779); if (state.failed) return n;

                    }
                    break;

            }


            match(input,COLON,FOLLOW_COLON_in_prePostClause3784); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_prePostClause3788);
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
    // Generator.g:813:1: annotationSet returns [Set<ASTAnnotation> annotations] : (an= annotation )* ;
    public final Set<ASTAnnotation> annotationSet() throws RecognitionException {
        Set<ASTAnnotation> annotations = null;


        ASTAnnotation an =null;


         annotations = new HashSet<ASTAnnotation>(); 
        try {
            // Generator.g:815:2: ( (an= annotation )* )
            // Generator.g:816:2: (an= annotation )*
            {
            // Generator.g:816:2: (an= annotation )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==AT) ) {
                    int LA85_2 = input.LA(2);

                    if ( (LA85_2==IDENT) ) {
                        int LA85_3 = input.LA(3);

                        if ( (LA85_3==LPAREN) ) {
                            alt85=1;
                        }


                    }


                }


                switch (alt85) {
            	case 1 :
            	    // Generator.g:816:3: an= annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotationSet3815);
            	    an=annotation();

            	    state._fsp--;
            	    if (state.failed) return annotations;

            	    if ( state.backtracking==0 ) { annotations.add(an); }

            	    }
            	    break;

            	default :
            	    break loop85;
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
    // Generator.g:819:1: annotation returns [ASTAnnotation n] : AT name= IDENT LPAREN values= annotationValues RPAREN ;
    public final ASTAnnotation annotation() throws RecognitionException {
        ASTAnnotation n = null;


        Token name=null;
        Map<Token, Token> values =null;


        try {
            // Generator.g:819:37: ( AT name= IDENT LPAREN values= annotationValues RPAREN )
            // Generator.g:820:2: AT name= IDENT LPAREN values= annotationValues RPAREN
            {
            match(input,AT,FOLLOW_AT_in_annotation3834); if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotation3838); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = new ASTAnnotation(name);}

            match(input,LPAREN,FOLLOW_LPAREN_in_annotation3844); if (state.failed) return n;

            pushFollow(FOLLOW_annotationValues_in_annotation3853);
            values=annotationValues();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setValues(values); }

            match(input,RPAREN,FOLLOW_RPAREN_in_annotation3858); if (state.failed) return n;

            }

        }
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
    // Generator.g:826:1: annotationValues returns [Map<Token, Token> values] : (firstVal= annotationValue )? ( COMMA val= annotationValue )* ;
    public final Map<Token, Token> annotationValues() throws RecognitionException {
        Map<Token, Token> values = null;


        GeneratorParser.annotationValue_return firstVal =null;

        GeneratorParser.annotationValue_return val =null;


         values = new HashMap<Token, Token>(); 
        try {
            // Generator.g:828:2: ( (firstVal= annotationValue )? ( COMMA val= annotationValue )* )
            // Generator.g:829:2: (firstVal= annotationValue )? ( COMMA val= annotationValue )*
            {
            // Generator.g:829:2: (firstVal= annotationValue )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==IDENT) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // Generator.g:829:3: firstVal= annotationValue
                    {
                    pushFollow(FOLLOW_annotationValue_in_annotationValues3881);
                    firstVal=annotationValue();

                    state._fsp--;
                    if (state.failed) return values;

                    if ( state.backtracking==0 ) { values.put((firstVal!=null?firstVal.name:null), (firstVal!=null?firstVal.value:null)); }

                    }
                    break;

            }


            // Generator.g:830:2: ( COMMA val= annotationValue )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==COMMA) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // Generator.g:830:3: COMMA val= annotationValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_annotationValues3889); if (state.failed) return values;

            	    pushFollow(FOLLOW_annotationValue_in_annotationValues3893);
            	    val=annotationValue();

            	    state._fsp--;
            	    if (state.failed) return values;

            	    if ( state.backtracking==0 ) { values.put((val!=null?val.name:null), (val!=null?val.value:null)); }

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
        return values;
    }
    // $ANTLR end "annotationValues"


    public static class annotationValue_return extends ParserRuleReturnScope {
        public Token name;
        public Token value;
    };


    // $ANTLR start "annotationValue"
    // Generator.g:833:1: annotationValue returns [Token name, Token value] : aName= IDENT EQUAL aValue= NON_OCL_STRING ;
    public final GeneratorParser.annotationValue_return annotationValue() throws RecognitionException {
        GeneratorParser.annotationValue_return retval = new GeneratorParser.annotationValue_return();
        retval.start = input.LT(1);


        Token aName=null;
        Token aValue=null;

        try {
            // Generator.g:833:50: (aName= IDENT EQUAL aValue= NON_OCL_STRING )
            // Generator.g:834:2: aName= IDENT EQUAL aValue= NON_OCL_STRING
            {
            aName=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotationValue3912); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.name = aName; }

            match(input,EQUAL,FOLLOW_EQUAL_in_annotationValue3917); if (state.failed) return retval;

            aValue=(Token)match(input,NON_OCL_STRING,FOLLOW_NON_OCL_STRING_in_annotationValue3923); if (state.failed) return retval;

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
    // Generator.g:839:1: stateMachine returns [ASTStateMachine n] : ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end' ;
    public final ASTStateMachine stateMachine() throws RecognitionException {
        ASTStateMachine n = null;


        Token smName=null;
        ASTStateDefinition s =null;

        ASTTransitionDefinition t =null;


        try {
            // Generator.g:840:5: ( ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end' )
            // Generator.g:841:5: ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end'
            {
            // Generator.g:841:5: ( 'psm' )
            // Generator.g:842:8: 'psm'
            {
            match(input,113,FOLLOW_113_in_stateMachine3953); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTProtocolStateMachine(); }

            }


            smName=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateMachine3986); if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setName(smName); }

            match(input,119,FOLLOW_119_in_stateMachine3999); if (state.failed) return n;

            // Generator.g:849:10: (s= stateDefinition )+
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
            	    // Generator.g:849:11: s= stateDefinition
            	    {
            	    pushFollow(FOLLOW_stateDefinition_in_stateMachine4015);
            	    s=stateDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addStateDefinition(s); }

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


            match(input,122,FOLLOW_122_in_stateMachine4025); if (state.failed) return n;

            // Generator.g:851:10: (t= transitionDefinition )+
            int cnt89=0;
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==IDENT) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // Generator.g:851:11: t= transitionDefinition
            	    {
            	    pushFollow(FOLLOW_transitionDefinition_in_stateMachine4041);
            	    t=transitionDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addTransitionDefinition(t); }

            	    }
            	    break;

            	default :
            	    if ( cnt89 >= 1 ) break loop89;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(89, input);
                        throw eee;
                }
                cnt89++;
            } while (true);


            match(input,82,FOLLOW_82_in_stateMachine4051); if (state.failed) return n;

            }

        }
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
    // Generator.g:855:1: stateDefinition returns [ASTStateDefinition n] : sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )? ;
    public final ASTStateDefinition stateDefinition() throws RecognitionException {
        ASTStateDefinition n = null;


        Token sn=null;
        Token stateType=null;
        GeneratorParser.expression_return stateInv =null;


        try {
            // Generator.g:855:47: (sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )? )
            // Generator.g:856:3: sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )?
            {
            sn=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateDefinition4067); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = new ASTStateDefinition(sn); }

            // Generator.g:857:3: ( COLON stateType= IDENT )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==COLON) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // Generator.g:857:5: COLON stateType= IDENT
                    {
                    match(input,COLON,FOLLOW_COLON_in_stateDefinition4075); if (state.failed) return n;

                    stateType=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateDefinition4079); if (state.failed) return n;

                    if ( state.backtracking==0 ) {n.setType(stateType); }

                    }
                    break;

            }


            // Generator.g:858:3: ( LBRACK stateInv= expression RBRACK )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==LBRACK) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // Generator.g:858:5: LBRACK stateInv= expression RBRACK
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_stateDefinition4090); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_stateDefinition4096);
                    stateInv=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RBRACK,FOLLOW_RBRACK_in_stateDefinition4098); if (state.failed) return n;

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
    // Generator.g:861:1: transitionDefinition returns [ASTTransitionDefinition n] : source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )? ;
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
            // Generator.g:861:57: (source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )? )
            // Generator.g:862:3: source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )?
            {
            source=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition4119); if (state.failed) return n;

            match(input,ARROW,FOLLOW_ARROW_in_transitionDefinition4121); if (state.failed) return n;

            target=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition4125); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTransitionDefinition(source, target); }

            // Generator.g:863:5: ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==LBRACE) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // Generator.g:863:6: LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_transitionDefinition4135); if (state.failed) return n;

                    // Generator.g:864:7: ( LBRACK pre= expression RBRACK )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==LBRACK) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // Generator.g:864:8: LBRACK pre= expression RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_transitionDefinition4145); if (state.failed) return n;

                            pushFollow(FOLLOW_expression_in_transitionDefinition4149);
                            pre=expression();

                            state._fsp--;
                            if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setPreCondition((pre!=null?pre.n:null)); }

                            match(input,RBRACK,FOLLOW_RBRACK_in_transitionDefinition4153); if (state.failed) return n;

                            }
                            break;

                    }


                    // Generator.g:865:7: (e= event |o= IDENT LPAREN (args= paramList )? RPAREN )
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==75) ) {
                        alt94=1;
                    }
                    else if ( (LA94_0==IDENT) ) {
                        alt94=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 94, 0, input);

                        throw nvae;

                    }
                    switch (alt94) {
                        case 1 :
                            // Generator.g:866:11: e= event
                            {
                            pushFollow(FOLLOW_event_in_transitionDefinition4177);
                            e=event();

                            state._fsp--;
                            if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setEvent(e); }

                            }
                            break;
                        case 2 :
                            // Generator.g:867:11: o= IDENT LPAREN (args= paramList )? RPAREN
                            {
                            o=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition4193); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setOperation(o); }

                            match(input,LPAREN,FOLLOW_LPAREN_in_transitionDefinition4197); if (state.failed) return n;

                            // Generator.g:867:50: (args= paramList )?
                            int alt93=2;
                            int LA93_0 = input.LA(1);

                            if ( (LA93_0==LPAREN) ) {
                                alt93=1;
                            }
                            switch (alt93) {
                                case 1 :
                                    // Generator.g:867:51: args= paramList
                                    {
                                    pushFollow(FOLLOW_paramList_in_transitionDefinition4202);
                                    args=paramList();

                                    state._fsp--;
                                    if (state.failed) return n;

                                    if ( state.backtracking==0 ) { n.setOperationArgs(args); }

                                    }
                                    break;

                            }


                            match(input,RPAREN,FOLLOW_RPAREN_in_transitionDefinition4209); if (state.failed) return n;

                            }
                            break;

                    }


                    // Generator.g:869:7: ( LBRACK post= expression RBRACK )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==LBRACK) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // Generator.g:869:8: LBRACK post= expression RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_transitionDefinition4226); if (state.failed) return n;

                            pushFollow(FOLLOW_expression_in_transitionDefinition4230);
                            post=expression();

                            state._fsp--;
                            if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setPostCondition((post!=null?post.n:null)); }

                            match(input,RBRACK,FOLLOW_RBRACK_in_transitionDefinition4234); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,RBRACE,FOLLOW_RBRACE_in_transitionDefinition4242); if (state.failed) return n;

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
    // Generator.g:873:1: event returns [Token t] : tcr= 'create' ;
    public final Token event() throws RecognitionException {
        Token t = null;


        Token tcr=null;

        try {
            // Generator.g:873:24: (tcr= 'create' )
            // Generator.g:874:5: tcr= 'create'
            {
            tcr=(Token)match(input,75,FOLLOW_75_in_event4264); if (state.failed) return t;

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
    // Generator.g:877:1: signalDefinition[boolean isAbstract] returns [ASTSignal n] : keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' ;
    public final ASTSignal signalDefinition(boolean isAbstract) throws RecognitionException {
        ASTSignal n = null;


        Token name=null;
        List idListRes =null;

        ASTAttribute a =null;

        ASTInvariantClause inv =null;


        try {
            // Generator.g:877:59: ( keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' )
            // Generator.g:878:5: keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end'
            {
            pushFollow(FOLLOW_keySignal_in_signalDefinition4284);
            keySignal();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_signalDefinition4288); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTSignal(name, isAbstract); }

            // Generator.g:880:5: ( LESS idListRes= idList )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==LESS) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // Generator.g:880:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_signalDefinition4303); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_signalDefinition4307);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addGenerals(idListRes); }

                    }
                    break;

            }


            // Generator.g:881:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==68) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // Generator.g:881:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,68,FOLLOW_68_in_signalDefinition4320); if (state.failed) return n;

                    // Generator.g:882:7: (a= attributeDefinition )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==AT||LA98_0==IDENT||LA98_0==63||(LA98_0 >= 66 && LA98_0 <= 67)||LA98_0==84||LA98_0==94||LA98_0==97||(LA98_0 >= 110 && LA98_0 <= 111)) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // Generator.g:882:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_signalDefinition4333);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addAttribute(a); }

                    	    }
                    	    break;

                    	default :
                    	    break loop98;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:884:5: ( 'constraints' (inv= invariantClause )* )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==73) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // Generator.g:884:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,73,FOLLOW_73_in_signalDefinition4354); if (state.failed) return n;

                    // Generator.g:885:7: (inv= invariantClause )*
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==AT||LA100_0==IDENT||LA100_0==63||(LA100_0 >= 66 && LA100_0 <= 67)||(LA100_0 >= 84 && LA100_0 <= 85)||LA100_0==94||LA100_0==97||(LA100_0 >= 110 && LA100_0 <= 111)) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // Generator.g:886:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_signalDefinition4374);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

                    	    }
                    	    break;

                    	default :
                    	    break loop100;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,82,FOLLOW_82_in_signalDefinition4398); if (state.failed) return n;

            }

        }
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
    // Generator.g:892:1: keyUnion :{...}? IDENT ;
    public final void keyUnion() throws RecognitionException {
        try {
            // Generator.g:892:9: ({...}? IDENT )
            // Generator.g:893:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("union"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyUnion", "input.LT(1).getText().equals(\"union\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyUnion4416); if (state.failed) return ;

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
    // Generator.g:895:1: keyAssociation :{...}? IDENT ;
    public final void keyAssociation() throws RecognitionException {
        try {
            // Generator.g:895:15: ({...}? IDENT )
            // Generator.g:896:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("association"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyAssociation", "input.LT(1).getText().equals(\"association\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyAssociation4430); if (state.failed) return ;

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
    // Generator.g:898:1: keyRole :{...}? IDENT ;
    public final void keyRole() throws RecognitionException {
        try {
            // Generator.g:898:8: ({...}? IDENT )
            // Generator.g:899:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("role"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyRole", "input.LT(1).getText().equals(\"role\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyRole4444); if (state.failed) return ;

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
    // Generator.g:901:1: keyComposition :{...}? IDENT ;
    public final void keyComposition() throws RecognitionException {
        try {
            // Generator.g:901:15: ({...}? IDENT )
            // Generator.g:902:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("composition"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyComposition", "input.LT(1).getText().equals(\"composition\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyComposition4456); if (state.failed) return ;

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
    // Generator.g:904:1: keyAggregation :{...}? IDENT ;
    public final void keyAggregation() throws RecognitionException {
        try {
            // Generator.g:904:15: ({...}? IDENT )
            // Generator.g:905:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("aggregation"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyAggregation", "input.LT(1).getText().equals(\"aggregation\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyAggregation4468); if (state.failed) return ;

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
    // Generator.g:907:1: keyClass :{...}? IDENT ;
    public final void keyClass() throws RecognitionException {
        try {
            // Generator.g:907:9: ({...}? IDENT )
            // Generator.g:908:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("class"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyClass", "input.LT(1).getText().equals(\"class\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyClass4482); if (state.failed) return ;

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
    // Generator.g:910:1: keySignal :{...}? IDENT ;
    public final void keySignal() throws RecognitionException {
        try {
            // Generator.g:910:10: ({...}? IDENT )
            // Generator.g:911:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("signal"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keySignal", "input.LT(1).getText().equals(\"signal\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keySignal4494); if (state.failed) return ;

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
    // Generator.g:913:1: keyDerived :{...}? IDENT ;
    public final void keyDerived() throws RecognitionException {
        try {
            // Generator.g:913:11: ({...}? IDENT )
            // Generator.g:914:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("derived"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyDerived", "input.LT(1).getText().equals(\"derived\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyDerived4508); if (state.failed) return ;

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
    // Generator.g:916:1: keyDerive :{...}? IDENT ;
    public final void keyDerive() throws RecognitionException {
        try {
            // Generator.g:916:10: ({...}? IDENT )
            // Generator.g:917:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("derive"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyDerive", "input.LT(1).getText().equals(\"derive\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyDerive4522); if (state.failed) return ;

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
    // Generator.g:919:1: keyInit :{...}? IDENT ;
    public final void keyInit() throws RecognitionException {
        try {
            // Generator.g:919:8: ({...}? IDENT )
            // Generator.g:920:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("init"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyInit", "input.LT(1).getText().equals(\"init\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyInit4534); if (state.failed) return ;

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
    // Generator.g:922:1: keyQualifier :{...}? IDENT ;
    public final void keyQualifier() throws RecognitionException {
        try {
            // Generator.g:922:13: ({...}? IDENT )
            // Generator.g:923:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("qualifier"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyQualifier", "input.LT(1).getText().equals(\"qualifier\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyQualifier4550); if (state.failed) return ;

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
    // Generator.g:952:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;


        GeneratorParser.expression_return nExp =null;


        try {
            // Generator.g:953:5: (nExp= expression EOF )
            // Generator.g:954:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly4578);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_expressionOnly4580); if (state.failed) return n;

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
    // Generator.g:961:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
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
            // Generator.g:967:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
            // Generator.g:968:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }

            // Generator.g:969:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==96) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // Generator.g:970:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
            	    {
            	    match(input,96,FOLLOW_96_in_expression4628); if (state.failed) return retval;

            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression4639); if (state.failed) return retval;

            	    // Generator.g:971:18: ( COLON t= type )?
            	    int alt102=2;
            	    int LA102_0 = input.LA(1);

            	    if ( (LA102_0==COLON) ) {
            	        alt102=1;
            	    }
            	    switch (alt102) {
            	        case 1 :
            	            // Generator.g:971:20: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression4643); if (state.failed) return retval;

            	            pushFollow(FOLLOW_type_in_expression4647);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression4652); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expression_in_expression4656);
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

            	    // Generator.g:981:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
            	    loop104:
            	    do {
            	        int alt104=2;
            	        int LA104_0 = input.LA(1);

            	        if ( (LA104_0==COMMA) ) {
            	            alt104=1;
            	        }


            	        switch (alt104) {
            	    	case 1 :
            	    	    // Generator.g:982:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_expression4694); if (state.failed) return retval;

            	    	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression4706); if (state.failed) return retval;

            	    	    // Generator.g:983:20: ( COLON t= type )?
            	    	    int alt103=2;
            	    	    int LA103_0 = input.LA(1);

            	    	    if ( (LA103_0==COLON) ) {
            	    	        alt103=1;
            	    	    }
            	    	    switch (alt103) {
            	    	        case 1 :
            	    	            // Generator.g:983:22: COLON t= type
            	    	            {
            	    	            match(input,COLON,FOLLOW_COLON_in_expression4710); if (state.failed) return retval;

            	    	            pushFollow(FOLLOW_type_in_expression4714);
            	    	            t=type();

            	    	            state._fsp--;
            	    	            if (state.failed) return retval;

            	    	            }
            	    	            break;

            	    	    }


            	    	    match(input,EQUAL,FOLLOW_EQUAL_in_expression4719); if (state.failed) return retval;

            	    	    pushFollow(FOLLOW_expression_in_expression4723);
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
            	    	    break loop104;
            	        }
            	    } while (true);


            	    match(input,91,FOLLOW_91_in_expression4764); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);


            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression4780);
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
    // Generator.g:1015:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;


        ASTVariableDeclaration v =null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // Generator.g:1017:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // Generator.g:1018:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList4813); if (state.failed) return paramList;

            // Generator.g:1019:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==IDENT) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // Generator.g:1020:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList4830);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;

                    if ( state.backtracking==0 ) { paramList.add(v); }

                    // Generator.g:1021:7: ( COMMA v= variableDeclaration )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==COMMA) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // Generator.g:1021:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList4842); if (state.failed) return paramList;

                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList4846);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;

                    	    if ( state.backtracking==0 ) { paramList.add(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop106;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_paramList4866); if (state.failed) return paramList;

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
    // Generator.g:1029:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;


        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // Generator.g:1031:5: (id0= IDENT ( COMMA idn= IDENT )* )
            // Generator.g:1032:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList4895); if (state.failed) return idList;

            if ( state.backtracking==0 ) { idList.add(id0); }

            // Generator.g:1033:5: ( COMMA idn= IDENT )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==COMMA) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // Generator.g:1033:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList4905); if (state.failed) return idList;

            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList4909); if (state.failed) return idList;

            	    if ( state.backtracking==0 ) { idList.add(idn); }

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
        return idList;
    }
    // $ANTLR end "idList"



    // $ANTLR start "variableDeclaration"
    // Generator.g:1041:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Generator.g:1042:5: (name= IDENT COLON t= type )
            // Generator.g:1043:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration4940); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableDeclaration4942); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableDeclaration4946);
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
    // Generator.g:1051:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndOrExp =null;

        ASTExpression n1 =null;


        try {
            // Generator.g:1052:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // Generator.g:1053:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression4982);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndOrExp;}

            // Generator.g:1054:5: (op= 'implies' n1= conditionalOrExpression )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==90) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // Generator.g:1054:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,90,FOLLOW_90_in_conditionalImpliesExpression4995); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression4999);
            	    n1=conditionalOrExpression();

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
    // $ANTLR end "conditionalImpliesExpression"



    // $ANTLR start "conditionalOrExpression"
    // Generator.g:1063:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndXorExp =null;

        ASTExpression n1 =null;


        try {
            // Generator.g:1064:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // Generator.g:1065:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression5044);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndXorExp;}

            // Generator.g:1066:5: (op= 'or' n1= conditionalXOrExpression )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==108) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // Generator.g:1066:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,108,FOLLOW_108_in_conditionalOrExpression5057); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression5061);
            	    n1=conditionalXOrExpression();

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
    // $ANTLR end "conditionalOrExpression"



    // $ANTLR start "conditionalXOrExpression"
    // Generator.g:1075:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndAndExp =null;

        ASTExpression n1 =null;


        try {
            // Generator.g:1076:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // Generator.g:1077:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression5105);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndAndExp;}

            // Generator.g:1078:5: (op= 'xor' n1= conditionalAndExpression )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==126) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // Generator.g:1078:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,126,FOLLOW_126_in_conditionalXOrExpression5118); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression5122);
            	    n1=conditionalAndExpression();

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
    // $ANTLR end "conditionalXOrExpression"



    // $ANTLR start "conditionalAndExpression"
    // Generator.g:1087:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nEqExp =null;

        ASTExpression n1 =null;


        try {
            // Generator.g:1088:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // Generator.g:1089:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression5166);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nEqExp;}

            // Generator.g:1090:5: (op= 'and' n1= equalityExpression )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==65) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // Generator.g:1090:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,65,FOLLOW_65_in_conditionalAndExpression5179); if (state.failed) return n;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression5183);
            	    n1=equalityExpression();

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
    // $ANTLR end "conditionalAndExpression"



    // $ANTLR start "equalityExpression"
    // Generator.g:1099:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nRelExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Generator.g:1101:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // Generator.g:1102:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression5231);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nRelExp;}

            // Generator.g:1103:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==EQUAL||LA113_0==NOT_EQUAL) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // Generator.g:1103:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression5260);
            	    n1=relationalExpression();

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
    // $ANTLR end "equalityExpression"



    // $ANTLR start "relationalExpression"
    // Generator.g:1113:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nAddiExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Generator.g:1115:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // Generator.g:1116:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression5309);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nAddiExp;}

            // Generator.g:1117:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( ((LA114_0 >= GREATER && LA114_0 <= GREATER_EQUAL)||(LA114_0 >= LESS && LA114_0 <= LESS_EQUAL)) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // Generator.g:1117:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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


            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression5345);
            	    n1=additiveExpression();

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
    // $ANTLR end "relationalExpression"



    // $ANTLR start "additiveExpression"
    // Generator.g:1127:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nMulExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Generator.g:1129:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // Generator.g:1130:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression5395);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nMulExp;}

            // Generator.g:1131:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==MINUS||LA115_0==PLUS) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // Generator.g:1131:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression5423);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

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
        return n;
    }
    // $ANTLR end "additiveExpression"



    // $ANTLR start "multiplicativeExpression"
    // Generator.g:1142:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Generator.g:1144:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // Generator.g:1145:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression5473);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nUnExp;}

            // Generator.g:1146:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==SLASH||LA116_0==STAR||LA116_0==79) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // Generator.g:1146:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==79 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression5505);
            	    n1=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

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
        return n;
    }
    // $ANTLR end "multiplicativeExpression"



    // $ANTLR start "unaryExpression"
    // Generator.g:1158:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression nPosExp =null;


         Token op = null; 
        try {
            // Generator.g:1160:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==MINUS||LA117_0==PLUS||LA117_0==99) ) {
                alt117=1;
            }
            else if ( (LA117_0==AT||LA117_0==HASH||(LA117_0 >= IDENT && LA117_0 <= INT)||LA117_0==LPAREN||LA117_0==REAL||(LA117_0 >= STAR && LA117_0 <= STRING)||LA117_0==45||LA117_0==47||LA117_0==52||(LA117_0 >= 55 && LA117_0 <= 56)||LA117_0==58||LA117_0==60||LA117_0==86||LA117_0==89||LA117_0==95||(LA117_0 >= 100 && LA117_0 <= 106)||(LA117_0 >= 116 && LA117_0 <= 117)||LA117_0==123) ) {
                alt117=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;

            }
            switch (alt117) {
                case 1 :
                    // Generator.g:1161:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // Generator.g:1161:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // Generator.g:1161:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) { op = input.LT(1); }

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==99 ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression5591);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }

                    }


                    }
                    break;
                case 2 :
                    // Generator.g:1165:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression5611);
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
    // Generator.g:1173:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nPrimExp =null;

        ASTExpression nPc =null;


         boolean arrow = false; 
        try {
            // Generator.g:1175:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // Generator.g:1176:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression5644);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nPrimExp; }

            // Generator.g:1177:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==DOT) ) {
                    int LA119_2 = input.LA(2);

                    if ( (LA119_2==IDENT) ) {
                        int LA119_4 = input.LA(3);

                        if ( (LA119_4==EOF||(LA119_4 >= ARROW && LA119_4 <= BAR)||(LA119_4 >= COMMA && LA119_4 <= EQUAL)||(LA119_4 >= GREATER && LA119_4 <= GREATER_EQUAL)||LA119_4==IDENT||(LA119_4 >= LBRACE && LA119_4 <= MINUS)||(LA119_4 >= NOT_EQUAL && LA119_4 <= PLUS)||(LA119_4 >= RBRACE && LA119_4 <= RBRACK)||(LA119_4 >= RPAREN && LA119_4 <= SLASH)||LA119_4==STAR||(LA119_4 >= 61 && LA119_4 <= 63)||(LA119_4 >= 65 && LA119_4 <= 68)||(LA119_4 >= 73 && LA119_4 <= 74)||(LA119_4 >= 79 && LA119_4 <= 85)||(LA119_4 >= 90 && LA119_4 <= 91)||LA119_4==94||(LA119_4 >= 107 && LA119_4 <= 111)||(LA119_4 >= 114 && LA119_4 <= 115)||LA119_4==118||(LA119_4 >= 120 && LA119_4 <= 121)||LA119_4==126) ) {
                            alt119=1;
                        }


                    }
                    else if ( (LA119_2==95||LA119_2==101||(LA119_2 >= 103 && LA119_2 <= 105)||(LA119_2 >= 116 && LA119_2 <= 117)) ) {
                        alt119=1;
                    }


                }
                else if ( (LA119_0==ARROW) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // Generator.g:1178:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // Generator.g:1178:6: ( ARROW | DOT )
            	    int alt118=2;
            	    int LA118_0 = input.LA(1);

            	    if ( (LA118_0==ARROW) ) {
            	        alt118=1;
            	    }
            	    else if ( (LA118_0==DOT) ) {
            	        alt118=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 118, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt118) {
            	        case 1 :
            	            // Generator.g:1178:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression5662); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = true; }

            	            }
            	            break;
            	        case 2 :
            	            // Generator.g:1178:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression5668); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = false; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression5679);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = nPc; }

            	    }
            	    break;

            	default :
            	    break loop119;
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
    // Generator.g:1194:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? );
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
            // Generator.g:1195:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? )
            int alt123=7;
            switch ( input.LA(1) ) {
            case HASH:
            case INT:
            case REAL:
            case STAR:
            case STRING:
            case 45:
            case 47:
            case 52:
            case 55:
            case 56:
            case 58:
            case 60:
            case 86:
            case 100:
            case 102:
            case 106:
            case 123:
                {
                alt123=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt123=1;
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
                case 61:
                case 62:
                case 63:
                case 65:
                case 66:
                case 67:
                case 68:
                case 73:
                case 74:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 90:
                case 91:
                case 94:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 114:
                case 115:
                case 118:
                case 120:
                case 121:
                case 126:
                    {
                    alt123=3;
                    }
                    break;
                case DOT:
                    {
                    switch ( input.LA(3) ) {
                    case 64:
                        {
                        alt123=6;
                        }
                        break;
                    case 72:
                        {
                        alt123=7;
                        }
                        break;
                    case IDENT:
                    case 95:
                    case 101:
                    case 103:
                    case 104:
                    case 105:
                    case 116:
                    case 117:
                        {
                        alt123=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 123, 7, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 123, 2, input);

                    throw nvae;

                }

                }
                break;
            case AT:
                {
                alt123=2;
                }
                break;
            case 95:
            case 101:
            case 103:
            case 104:
            case 105:
            case 116:
            case 117:
                {
                alt123=3;
                }
                break;
            case LPAREN:
                {
                alt123=4;
                }
                break;
            case 89:
                {
                alt123=5;
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
                    // Generator.g:1196:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression5719);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nLit; }

                    }
                    break;
                case 2 :
                    // Generator.g:1197:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression5733);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nOr; }

                    }
                    break;
                case 3 :
                    // Generator.g:1198:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression5745);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPc; }

                    }
                    break;
                case 4 :
                    // Generator.g:1199:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression5756); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression5760);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression5762); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExp!=null?nExp.n:null); }

                    }
                    break;
                case 5 :
                    // Generator.g:1200:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression5774);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nIfExp; }

                    }
                    break;
                case 6 :
                    // Generator.g:1201:7: id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression5786); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression5788); if (state.failed) return n;

                    match(input,64,FOLLOW_64_in_primaryExpression5790); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }

                    // Generator.g:1203:9: ( AT 'pre' )?
                    int alt120=2;
                    int LA120_0 = input.LA(1);

                    if ( (LA120_0==AT) ) {
                        int LA120_1 = input.LA(2);

                        if ( (LA120_1==111) ) {
                            alt120=1;
                        }
                    }
                    switch (alt120) {
                        case 1 :
                            // Generator.g:1203:11: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression5813); if (state.failed) return n;

                            match(input,111,FOLLOW_111_in_primaryExpression5815); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setIsPre(); }

                            }
                            break;

                    }


                    // Generator.g:1204:9: ( LPAREN RPAREN )?
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==LPAREN) ) {
                        alt121=1;
                    }
                    switch (alt121) {
                        case 1 :
                            // Generator.g:1204:11: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression5833); if (state.failed) return n;

                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression5835); if (state.failed) return n;

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // Generator.g:1205:7: id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )?
                    {
                    id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression5848); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression5850); if (state.failed) return n;

                    match(input,72,FOLLOW_72_in_primaryExpression5852); if (state.failed) return n;

                    // Generator.g:1205:31: ( LPAREN idExp= expression RPAREN )
                    // Generator.g:1205:33: LPAREN idExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression5856); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression5860);
                    idExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression5862); if (state.failed) return n;

                    }


                    if ( state.backtracking==0 ) { n = new ASTObjectByUseIdExpression(id2, (idExp!=null?idExp.n:null)); }

                    // Generator.g:1207:7: ( AT 'pre' )?
                    int alt122=2;
                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==AT) ) {
                        int LA122_1 = input.LA(2);

                        if ( (LA122_1==111) ) {
                            alt122=1;
                        }
                    }
                    switch (alt122) {
                        case 1 :
                            // Generator.g:1207:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression5882); if (state.failed) return n;

                            match(input,111,FOLLOW_111_in_primaryExpression5884); if (state.failed) return n;

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
    // Generator.g:1211:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;


        Token objectName=null;

        try {
            // Generator.g:1212:3: ( AT objectName= IDENT )
            // Generator.g:1213:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference5910); if (state.failed) return n;

            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference5918); if (state.failed) return n;

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
    // Generator.g:1227:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExpQuery =null;

        ASTExpression nExpIterate =null;

        GeneratorParser.operationExpression_return nExpOperation =null;

        ASTTypeArgExpression nExpType =null;

        ASTInStateExpression nExpInState =null;


        try {
            // Generator.g:1228:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] )
            int alt124=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA124_1 = input.LA(2);

                if ( (((( input.LA(2) == LPAREN )&&( input.LA(2) == LPAREN ))&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))) ) {
                    alt124=1;
                }
                else if ( (true) ) {
                    alt124=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 124, 1, input);

                    throw nvae;

                }
                }
                break;
            case 95:
                {
                alt124=2;
                }
                break;
            case 101:
            case 104:
            case 105:
            case 116:
            case 117:
                {
                alt124=4;
                }
                break;
            case 103:
                {
                alt124=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;

            }

            switch (alt124) {
                case 1 :
                    // Generator.g:1232:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }

                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }

                    pushFollow(FOLLOW_queryExpression_in_propertyCall5983);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpQuery; }

                    }
                    break;
                case 2 :
                    // Generator.g:1235:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall5996);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpIterate; }

                    }
                    break;
                case 3 :
                    // Generator.g:1236:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall6009);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExpOperation!=null?nExpOperation.n:null); }

                    }
                    break;
                case 4 :
                    // Generator.g:1237:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall6022);
                    nExpType=typeExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpType; }

                    }
                    break;
                case 5 :
                    // Generator.g:1238:7: nExpInState= inStateExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_inStateExpression_in_propertyCall6035);
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
    // Generator.g:1247:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTElemVarsDeclaration decls =null;

        GeneratorParser.expression_return nExp =null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // Generator.g:1248:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // Generator.g:1249:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression6070); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression6077); if (state.failed) return n;

            // Generator.g:1251:5: (decls= elemVarsDeclaration BAR )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==IDENT) ) {
                int LA125_1 = input.LA(2);

                if ( ((LA125_1 >= BAR && LA125_1 <= COLON)||LA125_1==COMMA) ) {
                    alt125=1;
                }
            }
            switch (alt125) {
                case 1 :
                    // Generator.g:1251:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression6088);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {decl = decls;}

                    match(input,BAR,FOLLOW_BAR_in_queryExpression6092); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_queryExpression6103);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression6109); if (state.failed) return n;

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
    // Generator.g:1265:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTElemVarsDeclaration decls =null;

        ASTVariableInitialization init =null;

        GeneratorParser.expression_return nExp =null;


        try {
            // Generator.g:1265:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // Generator.g:1266:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,95,FOLLOW_95_in_iterateExpression6141); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression6147); if (state.failed) return n;

            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression6155);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;

            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression6157); if (state.failed) return n;

            pushFollow(FOLLOW_variableInitialization_in_iterateExpression6165);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;

            match(input,BAR,FOLLOW_BAR_in_iterateExpression6167); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_iterateExpression6175);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression6181); if (state.failed) return n;

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
    // Generator.g:1287:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final GeneratorParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        GeneratorParser.operationExpression_return retval = new GeneratorParser.operationExpression_return();
        retval.start = input.LT(1);


        Token name=null;
        GeneratorParser.expression_return rolename =null;

        GeneratorParser.expression_return e =null;


        try {
            // Generator.g:1289:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // Generator.g:1290:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression6225); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }

            // Generator.g:1296:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==LBRACK) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // Generator.g:1296:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression6247); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_operationExpression6260);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    // Generator.g:1298:9: ( COMMA rolename= expression )*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==COMMA) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // Generator.g:1298:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression6273); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_operationExpression6277);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    	    }
                    	    break;

                    	default :
                    	    break loop126;
                        }
                    } while (true);


                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression6289); if (state.failed) return retval;

                    // Generator.g:1301:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==LBRACK) ) {
                        alt128=1;
                    }
                    switch (alt128) {
                        case 1 :
                            // Generator.g:1301:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression6306); if (state.failed) return retval;

                            pushFollow(FOLLOW_expression_in_operationExpression6321);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            // Generator.g:1303:11: ( COMMA rolename= expression )*
                            loop127:
                            do {
                                int alt127=2;
                                int LA127_0 = input.LA(1);

                                if ( (LA127_0==COMMA) ) {
                                    alt127=1;
                                }


                                switch (alt127) {
                            	case 1 :
                            	    // Generator.g:1303:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression6336); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression6340);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop127;
                                }
                            } while (true);


                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression6354); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            // Generator.g:1308:5: ( AT 'pre' )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==AT) ) {
                int LA130_1 = input.LA(2);

                if ( (LA130_1==111) ) {
                    alt130=1;
                }
            }
            switch (alt130) {
                case 1 :
                    // Generator.g:1308:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression6379); if (state.failed) return retval;

                    match(input,111,FOLLOW_111_in_operationExpression6381); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.setIsPre(); }

                    }
                    break;

            }


            // Generator.g:1310:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==LPAREN) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // Generator.g:1311:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression6406); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.hasParentheses(); }

                    // Generator.g:1312:7: (e= expression ( COMMA e= expression )* )?
                    int alt132=2;
                    int LA132_0 = input.LA(1);

                    if ( (LA132_0==AT||LA132_0==HASH||(LA132_0 >= IDENT && LA132_0 <= INT)||(LA132_0 >= LPAREN && LA132_0 <= MINUS)||LA132_0==PLUS||LA132_0==REAL||(LA132_0 >= STAR && LA132_0 <= STRING)||LA132_0==45||LA132_0==47||LA132_0==52||(LA132_0 >= 55 && LA132_0 <= 56)||LA132_0==58||LA132_0==60||LA132_0==86||LA132_0==89||(LA132_0 >= 95 && LA132_0 <= 96)||(LA132_0 >= 99 && LA132_0 <= 106)||(LA132_0 >= 116 && LA132_0 <= 117)||LA132_0==123) ) {
                        alt132=1;
                    }
                    switch (alt132) {
                        case 1 :
                            // Generator.g:1313:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression6427);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            // Generator.g:1314:7: ( COMMA e= expression )*
                            loop131:
                            do {
                                int alt131=2;
                                int LA131_0 = input.LA(1);

                                if ( (LA131_0==COMMA) ) {
                                    alt131=1;
                                }


                                switch (alt131) {
                            	case 1 :
                            	    // Generator.g:1314:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression6439); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression6443);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop131;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression6463); if (state.failed) return retval;

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
    // Generator.g:1321:1: inStateExpression[ASTExpression source, boolean followsArrow] returns [ASTInStateExpression n] : opToken= 'oclInState' LPAREN s= IDENT RPAREN ;
    public final ASTInStateExpression inStateExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTInStateExpression n = null;


        Token opToken=null;
        Token s=null;

        try {
            // Generator.g:1322:35: (opToken= 'oclInState' LPAREN s= IDENT RPAREN )
            // Generator.g:1323:4: opToken= 'oclInState' LPAREN s= IDENT RPAREN
            {
            opToken=(Token)match(input,103,FOLLOW_103_in_inStateExpression6500); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_inStateExpression6505); if (state.failed) return n;

            s=(Token)match(input,IDENT,FOLLOW_IDENT_in_inStateExpression6514); if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_inStateExpression6519); if (state.failed) return n;

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
    // Generator.g:1335:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;


        ASTType t =null;


         Token opToken = null; 
        try {
            // Generator.g:1338:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN )
            // Generator.g:1339:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) { opToken = input.LT(1); }

            if ( input.LA(1)==101||(input.LA(1) >= 104 && input.LA(1) <= 105)||(input.LA(1) >= 116 && input.LA(1) <= 117) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression6579); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_typeExpression6583);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression6585); if (state.failed) return n;

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
    // Generator.g:1350:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;


        Token var1=null;
        Token varN=null;
        ASTType t =null;

        ASTType tN =null;


        try {
            // Generator.g:1351:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // Generator.g:1352:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }

            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration6623); if (state.failed) return n;

            // Generator.g:1353:17: ( COLON t= type )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==COLON) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // Generator.g:1353:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration6626); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_elemVarsDeclaration6630);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}

            // Generator.g:1354:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop136:
            do {
                int alt136=2;
                int LA136_0 = input.LA(1);

                if ( (LA136_0==COMMA) ) {
                    alt136=1;
                }


                switch (alt136) {
            	case 1 :
            	    // Generator.g:1354:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration6640); if (state.failed) return n;

            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration6646); if (state.failed) return n;

            	    // Generator.g:1354:24: ( COLON tN= type )?
            	    int alt135=2;
            	    int LA135_0 = input.LA(1);

            	    if ( (LA135_0==COLON) ) {
            	        alt135=1;
            	    }
            	    switch (alt135) {
            	        case 1 :
            	            // Generator.g:1354:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration6649); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration6655);
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
    // $ANTLR end "elemVarsDeclaration"



    // $ANTLR start "variableInitialization"
    // Generator.g:1362:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;


        Token name=null;
        ASTType t =null;

        GeneratorParser.expression_return e =null;


        try {
            // Generator.g:1363:5: (name= IDENT COLON t= type EQUAL e= expression )
            // Generator.g:1364:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization6683); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableInitialization6685); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableInitialization6689);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization6691); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_variableInitialization6695);
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
    // Generator.g:1373:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        GeneratorParser.expression_return cond =null;

        GeneratorParser.expression_return t =null;

        GeneratorParser.expression_return e =null;


        try {
            // Generator.g:1374:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // Generator.g:1375:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,89,FOLLOW_89_in_ifExpression6727); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression6731);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,121,FOLLOW_121_in_ifExpression6733); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression6737);
            t=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,81,FOLLOW_81_in_ifExpression6739); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression6743);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,83,FOLLOW_83_in_ifExpression6745); if (state.failed) return n;

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
    // Generator.g:1394:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR );
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
            // Generator.g:1395:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR )
            int alt137=12;
            switch ( input.LA(1) ) {
            case 123:
                {
                alt137=1;
                }
                break;
            case 86:
                {
                alt137=2;
                }
                break;
            case INT:
                {
                alt137=3;
                }
                break;
            case REAL:
                {
                alt137=4;
                }
                break;
            case STRING:
                {
                alt137=5;
                }
                break;
            case HASH:
                {
                alt137=6;
                }
                break;
            case IDENT:
                {
                alt137=7;
                }
                break;
            case 45:
            case 52:
            case 55:
            case 56:
                {
                int LA137_8 = input.LA(2);

                if ( (LA137_8==LPAREN) ) {
                    alt137=9;
                }
                else if ( (LA137_8==LBRACE) ) {
                    alt137=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 137, 8, input);

                    throw nvae;

                }
                }
                break;
            case 47:
            case 102:
                {
                alt137=9;
                }
                break;
            case 60:
            case 100:
            case 106:
                {
                alt137=10;
                }
                break;
            case 58:
                {
                alt137=11;
                }
                break;
            case STAR:
                {
                alt137=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;

            }

            switch (alt137) {
                case 1 :
                    // Generator.g:1396:7: t= 'true'
                    {
                    t=(Token)match(input,123,FOLLOW_123_in_literal6784); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }

                    }
                    break;
                case 2 :
                    // Generator.g:1397:7: f= 'false'
                    {
                    f=(Token)match(input,86,FOLLOW_86_in_literal6798); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }

                    }
                    break;
                case 3 :
                    // Generator.g:1398:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal6811); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }

                    }
                    break;
                case 4 :
                    // Generator.g:1399:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal6826); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }

                    }
                    break;
                case 5 :
                    // Generator.g:1400:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal6840); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }

                    }
                    break;
                case 6 :
                    // Generator.g:1401:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal6850); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal6854); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}

                    }
                    break;
                case 7 :
                    // Generator.g:1402:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal6866); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal6868); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal6872); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }

                    }
                    break;
                case 8 :
                    // Generator.g:1403:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal6884);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nColIt; }

                    }
                    break;
                case 9 :
                    // Generator.g:1404:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal6896);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nEColIt; }

                    }
                    break;
                case 10 :
                    // Generator.g:1405:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal6908);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nUndLit; }

                    }
                    break;
                case 11 :
                    // Generator.g:1406:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal6920);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nTupleLit; }

                    }
                    break;
                case 12 :
                    // Generator.g:1407:7: un= STAR
                    {
                    un=(Token)match(input,STAR,FOLLOW_STAR_in_literal6932); if (state.failed) return n;

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
    // Generator.g:1415:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;


        ASTCollectionItem ci =null;


         Token op = null; 
        try {
            // Generator.g:1417:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // Generator.g:1418:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( input.LA(1)==45||input.LA(1)==52||(input.LA(1) >= 55 && input.LA(1) <= 56) ) {
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

            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral6999); if (state.failed) return n;

            // Generator.g:1422:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==AT||LA139_0==HASH||(LA139_0 >= IDENT && LA139_0 <= INT)||(LA139_0 >= LPAREN && LA139_0 <= MINUS)||LA139_0==PLUS||LA139_0==REAL||(LA139_0 >= STAR && LA139_0 <= STRING)||LA139_0==45||LA139_0==47||LA139_0==52||(LA139_0 >= 55 && LA139_0 <= 56)||LA139_0==58||LA139_0==60||LA139_0==86||LA139_0==89||(LA139_0 >= 95 && LA139_0 <= 96)||(LA139_0 >= 99 && LA139_0 <= 106)||(LA139_0 >= 116 && LA139_0 <= 117)||LA139_0==123) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // Generator.g:1423:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral7016);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addItem(ci); }

                    // Generator.g:1424:7: ( COMMA ci= collectionItem )*
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( (LA138_0==COMMA) ) {
                            alt138=1;
                        }


                        switch (alt138) {
                    	case 1 :
                    	    // Generator.g:1424:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral7029); if (state.failed) return n;

                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral7033);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addItem(ci); }

                    	    }
                    	    break;

                    	default :
                    	    break loop138;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral7052); if (state.failed) return n;

            }

        }
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
    // Generator.g:1433:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;


        GeneratorParser.expression_return e =null;


         n = new ASTCollectionItem(); 
        try {
            // Generator.g:1435:5: (e= expression ( DOTDOT e= expression )? )
            // Generator.g:1436:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem7081);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setFirst((e!=null?e.n:null)); }

            // Generator.g:1437:5: ( DOTDOT e= expression )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==DOTDOT) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // Generator.g:1437:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem7092); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_collectionItem7096);
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
    // Generator.g:1447:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;


        ASTCollectionType t =null;


        try {
            // Generator.g:1448:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==102) ) {
                alt141=1;
            }
            else if ( (LA141_0==45||LA141_0==47||LA141_0==52||(LA141_0 >= 55 && LA141_0 <= 56)) ) {
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
                    // Generator.g:1449:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,102,FOLLOW_102_in_emptyCollectionLiteral7125); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral7127); if (state.failed) return n;

                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral7131);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral7133); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;
                case 2 :
                    // Generator.g:1452:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral7149);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral7151); if (state.failed) return n;

                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral7153); if (state.failed) return n;

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
    // Generator.g:1463:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;


        ASTType t =null;


        try {
            // Generator.g:1464:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt142=4;
            switch ( input.LA(1) ) {
            case 106:
                {
                alt142=1;
                }
                break;
            case 60:
                {
                alt142=2;
                }
                break;
            case 100:
                {
                int LA142_3 = input.LA(2);

                if ( (LA142_3==LPAREN) ) {
                    alt142=3;
                }
                else if ( (LA142_3==EOF||(LA142_3 >= ARROW && LA142_3 <= BAR)||(LA142_3 >= COMMA && LA142_3 <= EQUAL)||(LA142_3 >= GREATER && LA142_3 <= GREATER_EQUAL)||LA142_3==IDENT||LA142_3==LBRACE||(LA142_3 >= LESS && LA142_3 <= LESS_EQUAL)||LA142_3==MINUS||(LA142_3 >= NOT_EQUAL && LA142_3 <= PLUS)||(LA142_3 >= RBRACE && LA142_3 <= RBRACK)||(LA142_3 >= RPAREN && LA142_3 <= SLASH)||LA142_3==STAR||(LA142_3 >= 61 && LA142_3 <= 63)||(LA142_3 >= 65 && LA142_3 <= 68)||(LA142_3 >= 73 && LA142_3 <= 74)||(LA142_3 >= 79 && LA142_3 <= 85)||(LA142_3 >= 90 && LA142_3 <= 91)||LA142_3==94||(LA142_3 >= 107 && LA142_3 <= 111)||(LA142_3 >= 114 && LA142_3 <= 115)||LA142_3==118||(LA142_3 >= 120 && LA142_3 <= 121)||LA142_3==126) ) {
                    alt142=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 142, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;

            }

            switch (alt142) {
                case 1 :
                    // Generator.g:1465:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,106,FOLLOW_106_in_undefinedLiteral7183); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral7185); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral7189);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral7191); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 2 :
                    // Generator.g:1468:5: 'Undefined'
                    {
                    match(input,60,FOLLOW_60_in_undefinedLiteral7205); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;
                case 3 :
                    // Generator.g:1471:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,100,FOLLOW_100_in_undefinedLiteral7219); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral7221); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral7225);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral7227); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 4 :
                    // Generator.g:1474:5: 'null'
                    {
                    match(input,100,FOLLOW_100_in_undefinedLiteral7241); if (state.failed) return n;

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
    // Generator.g:1484:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;


        ASTTupleItem ti =null;


         List tiList = new ArrayList(); 
        try {
            // Generator.g:1486:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // Generator.g:1487:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,58,FOLLOW_58_in_tupleLiteral7280); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral7286); if (state.failed) return n;

            pushFollow(FOLLOW_tupleItem_in_tupleLiteral7294);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tiList.add(ti); }

            // Generator.g:1490:5: ( COMMA ti= tupleItem )*
            loop143:
            do {
                int alt143=2;
                int LA143_0 = input.LA(1);

                if ( (LA143_0==COMMA) ) {
                    alt143=1;
                }


                switch (alt143) {
            	case 1 :
            	    // Generator.g:1490:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral7305); if (state.failed) return n;

            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral7309);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tiList.add(ti); }

            	    }
            	    break;

            	default :
            	    break loop143;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral7320); if (state.failed) return n;

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
    // Generator.g:1498:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;


        Token name=null;
        ASTType t =null;

        GeneratorParser.expression_return e =null;


        try {
            // Generator.g:1499:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // Generator.g:1500:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem7351); if (state.failed) return n;

            // Generator.g:1501:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==COLON) ) {
                int LA144_1 = input.LA(2);

                if ( (synpred1_Generator()) ) {
                    alt144=1;
                }
                else if ( (true) ) {
                    alt144=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 144, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA144_0==EQUAL) ) {
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
                    // Generator.g:1504:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem7390); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_tupleItem7394);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem7396); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_tupleItem7400);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, (e!=null?e.n:null)); }

                    }
                    break;
                case 2 :
                    // Generator.g:1507:7: ( COLON | EQUAL ) e= expression
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


                    pushFollow(FOLLOW_expression_in_tupleItem7432);
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
    // Generator.g:1518:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;


        ASTSimpleType nTSimple =null;

        ASTCollectionType nTCollection =null;

        ASTTupleType nTTuple =null;


         Token tok = null; 
        try {
            // Generator.g:1520:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
            // Generator.g:1521:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }

            // Generator.g:1522:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            int alt145=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt145=1;
                }
                break;
            case 45:
            case 47:
            case 52:
            case 55:
            case 56:
                {
                alt145=2;
                }
                break;
            case 58:
                {
                alt145=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;

            }

            switch (alt145) {
                case 1 :
                    // Generator.g:1523:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type7498);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 2 :
                    // Generator.g:1524:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type7510);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 3 :
                    // Generator.g:1525:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type7522);
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
    // Generator.g:1530:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;


        ASTType nT =null;


        try {
            // Generator.g:1531:5: (nT= type EOF )
            // Generator.g:1532:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly7554);
            nT=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_typeOnly7556); if (state.failed) return n;

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
    // Generator.g:1542:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;


        Token name=null;

        try {
            // Generator.g:1543:5: (name= IDENT )
            // Generator.g:1544:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType7584); if (state.failed) return n;

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
    // Generator.g:1552:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;


        ASTType elemType =null;


         Token op = null; 
        try {
            // Generator.g:1554:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // Generator.g:1555:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( input.LA(1)==45||input.LA(1)==47||input.LA(1)==52||(input.LA(1) >= 55 && input.LA(1) <= 56) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType7649); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_collectionType7653);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType7655); if (state.failed) return n;

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
    // Generator.g:1565:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;


        ASTTuplePart tp =null;


         List tpList = new ArrayList(); 
        try {
            // Generator.g:1567:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // Generator.g:1568:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,58,FOLLOW_58_in_tupleType7689); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType7691); if (state.failed) return n;

            pushFollow(FOLLOW_tuplePart_in_tupleType7700);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tpList.add(tp); }

            // Generator.g:1570:5: ( COMMA tp= tuplePart )*
            loop146:
            do {
                int alt146=2;
                int LA146_0 = input.LA(1);

                if ( (LA146_0==COMMA) ) {
                    alt146=1;
                }


                switch (alt146) {
            	case 1 :
            	    // Generator.g:1570:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType7711); if (state.failed) return n;

            	    pushFollow(FOLLOW_tuplePart_in_tupleType7715);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tpList.add(tp); }

            	    }
            	    break;

            	default :
            	    break loop146;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType7727); if (state.failed) return n;

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
    // Generator.g:1579:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Generator.g:1580:5: (name= IDENT COLON t= type )
            // Generator.g:1581:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart7759); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_tuplePart7761); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_tuplePart7765);
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
    // Generator.g:1620:1: statOnly returns [ASTStatement n] : s= stat EOF ;
    public final ASTStatement statOnly() throws RecognitionException {
        ASTStatement n = null;


        GeneratorParser.stat_return s =null;


        try {
            // Generator.g:1621:3: (s= stat EOF )
            // Generator.g:1622:3: s= stat EOF
            {
            pushFollow(FOLLOW_stat_in_statOnly7814);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_statOnly7818); if (state.failed) return n;

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
    // Generator.g:1632:1: stat returns [ASTStatement n] : s= singleStat ( SEMI s2= singleStat )* ;
    public final GeneratorParser.stat_return stat() throws RecognitionException {
        GeneratorParser.stat_return retval = new GeneratorParser.stat_return();
        retval.start = input.LT(1);


        ASTStatement s =null;

        ASTStatement s2 =null;



          ASTSequenceStatement seq = new ASTSequenceStatement(((Token)retval.start));

        try {
            // Generator.g:1636:3: (s= singleStat ( SEMI s2= singleStat )* )
            // Generator.g:1637:3: s= singleStat ( SEMI s2= singleStat )*
            {
            pushFollow(FOLLOW_singleStat_in_stat7853);
            s=singleStat();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {seq.addStatement(s);}

            // Generator.g:1638:3: ( SEMI s2= singleStat )*
            loop147:
            do {
                int alt147=2;
                int LA147_0 = input.LA(1);

                if ( (LA147_0==SEMI) ) {
                    alt147=1;
                }


                switch (alt147) {
            	case 1 :
            	    // Generator.g:1639:5: SEMI s2= singleStat
            	    {
            	    match(input,SEMI,FOLLOW_SEMI_in_stat7865); if (state.failed) return retval;

            	    pushFollow(FOLLOW_singleStat_in_stat7875);
            	    s2=singleStat();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {seq.addStatement(s2); }

            	    }
            	    break;

            	default :
            	    break loop147;
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
    // Generator.g:1651:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat );
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
            // Generator.g:1652:5: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat )
            int alt148=11;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==EOF||LA148_0==SEMI||(LA148_0 >= 81 && LA148_0 <= 82)) ) {
                alt148=1;
            }
            else if ( (LA148_0==96) && (synpred2_Generator())) {
                alt148=2;
            }
            else if ( (LA148_0==MINUS||LA148_0==PLUS||LA148_0==99) && (synpred2_Generator())) {
                alt148=2;
            }
            else if ( (LA148_0==123) && (synpred2_Generator())) {
                alt148=2;
            }
            else if ( (LA148_0==86) && (synpred2_Generator())) {
                alt148=2;
            }
            else if ( (LA148_0==INT) && (synpred2_Generator())) {
                alt148=2;
            }
            else if ( (LA148_0==REAL) && (synpred2_Generator())) {
                alt148=2;
            }
            else if ( (LA148_0==STRING) && (synpred2_Generator())) {
                alt148=2;
            }
            else if ( (LA148_0==HASH) && (synpred2_Generator())) {
                alt148=2;
            }
            else if ( (LA148_0==IDENT) ) {
                int LA148_13 = input.LA(2);

                if ( (synpred2_Generator()) ) {
                    alt148=2;
                }
                else if ( (true) ) {
                    alt148=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 148, 13, input);

                    throw nvae;

                }
            }
            else if ( (LA148_0==45||LA148_0==52||(LA148_0 >= 55 && LA148_0 <= 56)) && (synpred2_Generator())) {
                alt148=2;
            }
            else if ( (LA148_0==102) && (synpred2_Generator())) {
                alt148=2;
            }
            else if ( (LA148_0==47) && (synpred2_Generator())) {
                alt148=2;
            }
            else if ( (LA148_0==106) && (synpred2_Generator())) {
                alt148=2;
            }
            else if ( (LA148_0==60) && (synpred2_Generator())) {
                alt148=2;
            }
            else if ( (LA148_0==100) && (synpred2_Generator())) {
                alt148=2;
            }
            else if ( (LA148_0==58) && (synpred2_Generator())) {
                alt148=2;
            }
            else if ( (LA148_0==STAR) && (synpred2_Generator())) {
                alt148=2;
            }
            else if ( (LA148_0==AT) && (synpred2_Generator())) {
                alt148=2;
            }
            else if ( (LA148_0==95) && (synpred2_Generator())) {
                alt148=2;
            }
            else if ( (LA148_0==101||(LA148_0 >= 104 && LA148_0 <= 105)||(LA148_0 >= 116 && LA148_0 <= 117)) && (synpred2_Generator())) {
                alt148=2;
            }
            else if ( (LA148_0==103) && (synpred2_Generator())) {
                alt148=2;
            }
            else if ( (LA148_0==LPAREN) && (synpred2_Generator())) {
                alt148=2;
            }
            else if ( (LA148_0==89) ) {
                int LA148_27 = input.LA(2);

                if ( (synpred2_Generator()) ) {
                    alt148=2;
                }
                else if ( (true) ) {
                    alt148=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 148, 27, input);

                    throw nvae;

                }
            }
            else if ( (LA148_0==98) ) {
                alt148=4;
            }
            else if ( (LA148_0==78) ) {
                alt148=5;
            }
            else if ( (LA148_0==92) ) {
                alt148=6;
            }
            else if ( (LA148_0==77) ) {
                alt148=7;
            }
            else if ( (LA148_0==87) ) {
                alt148=9;
            }
            else if ( (LA148_0==125) ) {
                alt148=10;
            }
            else if ( (LA148_0==70) ) {
                alt148=11;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 148, 0, input);

                throw nvae;

            }
            switch (alt148) {
                case 1 :
                    // Generator.g:1653:5: emp= emptyStat
                    {
                    pushFollow(FOLLOW_emptyStat_in_singleStat7915);
                    emp=emptyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = emp; }

                    }
                    break;
                case 2 :
                    // Generator.g:1655:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
                    {
                    pushFollow(FOLLOW_statStartingWithExpr_in_singleStat7941);
                    sse=statStartingWithExpr();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (sse!=null?sse.n:null); }

                    }
                    break;
                case 3 :
                    // Generator.g:1656:5: vas= varAssignStat
                    {
                    pushFollow(FOLLOW_varAssignStat_in_singleStat7953);
                    vas=varAssignStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = vas; }

                    }
                    break;
                case 4 :
                    // Generator.g:1657:5: ocs= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_singleStat7967);
                    ocs=objCreateStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ocs!=null?ocs.n:null); }

                    }
                    break;
                case 5 :
                    // Generator.g:1658:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleStat7981);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ods!=null?ods.n:null); }

                    }
                    break;
                case 6 :
                    // Generator.g:1659:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleStat7994);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lis!=null?lis.n:null); }

                    }
                    break;
                case 7 :
                    // Generator.g:1660:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleStat8011);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lds!=null?lds.n:null); }

                    }
                    break;
                case 8 :
                    // Generator.g:1661:5: ces= condExStat
                    {
                    pushFollow(FOLLOW_condExStat_in_singleStat8028);
                    ces=condExStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ces!=null?ces.n:null); }

                    }
                    break;
                case 9 :
                    // Generator.g:1662:5: its= iterStat
                    {
                    pushFollow(FOLLOW_iterStat_in_singleStat8045);
                    its=iterStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (its!=null?its.n:null); }

                    }
                    break;
                case 10 :
                    // Generator.g:1664:5: whs= whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_singleStat8067);
                    whs=whileStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (whs!=null?whs.n:null); }

                    }
                    break;
                case 11 :
                    // Generator.g:1665:5: blk= blockStat
                    {
                    pushFollow(FOLLOW_blockStat_in_singleStat8085);
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
    // Generator.g:1672:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
    public final ASTEmptyStatement emptyStat() throws RecognitionException {
        ASTEmptyStatement n = null;


        try {
            // Generator.g:1673:3: ( nothing )
            // Generator.g:1674:3: nothing
            {
            pushFollow(FOLLOW_nothing_in_emptyStat8112);
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
    // Generator.g:1679:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
    public final GeneratorParser.statStartingWithExpr_return statStartingWithExpr() throws RecognitionException {
        GeneratorParser.statStartingWithExpr_return retval = new GeneratorParser.statStartingWithExpr_return();
        retval.start = input.LT(1);


        ASTExpression expr =null;

        ASTAttributeAssignmentStatement aas =null;


        try {
            // Generator.g:1680:3: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
            // Generator.g:1681:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
            {
            pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr8138);
            expr=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            // Generator.g:1682:3: (aas= attAssignStat[$expr.n] )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==DOT) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // Generator.g:1683:5: aas= attAssignStat[$expr.n]
                    {
                    pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr8152);
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
    // Generator.g:1695:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
    public final ASTStatement varAssignStat() throws RecognitionException {
        ASTStatement n = null;


        Token varName=null;
        ASTRValue rVal =null;


        try {
            // Generator.g:1696:3: (varName= IDENT COLON_EQUAL rVal= rValue )
            // Generator.g:1697:3: varName= IDENT COLON_EQUAL rVal= rValue
            {
            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat8190); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat8194); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_varAssignStat8202);
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
    // Generator.g:1709:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
    public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
        ASTAttributeAssignmentStatement n = null;


        Token attName=null;
        ASTRValue r =null;


        try {
            // Generator.g:1710:3: ( DOT attName= IDENT COLON_EQUAL r= rValue )
            // Generator.g:1711:3: DOT attName= IDENT COLON_EQUAL r= rValue
            {
            match(input,DOT,FOLLOW_DOT_in_attAssignStat8226); if (state.failed) return n;

            attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat8235); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat8239); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_attAssignStat8247);
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
    // Generator.g:1723:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
    public final GeneratorParser.objCreateStat_return objCreateStat() throws RecognitionException {
        GeneratorParser.objCreateStat_return retval = new GeneratorParser.objCreateStat_return();
        retval.start = input.LT(1);


        ASTSimpleType ident =null;

        ASTExpression objName =null;

        GeneratorParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // Generator.g:1724:3: ( 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
            // Generator.g:1725:3: 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            {
            match(input,98,FOLLOW_98_in_objCreateStat8273); if (state.failed) return retval;

            pushFollow(FOLLOW_simpleType_in_objCreateStat8281);
            ident=simpleType();

            state._fsp--;
            if (state.failed) return retval;

            // Generator.g:1727:3: ( LPAREN (objName= inSoilExpression )? RPAREN )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==LPAREN) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // Generator.g:1728:5: LPAREN (objName= inSoilExpression )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat8291); if (state.failed) return retval;

                    // Generator.g:1729:7: (objName= inSoilExpression )?
                    int alt150=2;
                    int LA150_0 = input.LA(1);

                    if ( (LA150_0==AT||LA150_0==HASH||(LA150_0 >= IDENT && LA150_0 <= INT)||(LA150_0 >= LPAREN && LA150_0 <= MINUS)||LA150_0==PLUS||LA150_0==REAL||(LA150_0 >= STAR && LA150_0 <= STRING)||LA150_0==45||LA150_0==47||LA150_0==52||(LA150_0 >= 55 && LA150_0 <= 56)||LA150_0==58||LA150_0==60||LA150_0==86||LA150_0==89||(LA150_0 >= 95 && LA150_0 <= 96)||(LA150_0 >= 99 && LA150_0 <= 106)||(LA150_0 >= 116 && LA150_0 <= 117)||LA150_0==123) ) {
                        alt150=1;
                    }
                    switch (alt150) {
                        case 1 :
                            // Generator.g:1729:8: objName= inSoilExpression
                            {
                            pushFollow(FOLLOW_inSoilExpression_in_objCreateStat8304);
                            objName=inSoilExpression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat8312); if (state.failed) return retval;

                    }
                    break;

            }


            // Generator.g:1733:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==71) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // Generator.g:1734:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
                    {
                    match(input,71,FOLLOW_71_in_objCreateStat8330); if (state.failed) return retval;

                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat8338); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat8352);
                    p=rValListMin2WithOptionalQualifiers();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat8360); if (state.failed) return retval;

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
    // Generator.g:1753:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
    public final GeneratorParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
        GeneratorParser.objDestroyStat_return retval = new GeneratorParser.objDestroyStat_return();
        retval.start = input.LT(1);


        List<ASTExpression> el =null;


        try {
            // Generator.g:1754:3: ( 'destroy' el= exprListMin1 )
            // Generator.g:1755:3: 'destroy' el= exprListMin1
            {
            match(input,78,FOLLOW_78_in_objDestroyStat8396); if (state.failed) return retval;

            pushFollow(FOLLOW_exprListMin1_in_objDestroyStat8404);
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
    // Generator.g:1774:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
    public final GeneratorParser.lnkInsStat_return lnkInsStat() throws RecognitionException {
        GeneratorParser.lnkInsStat_return retval = new GeneratorParser.lnkInsStat_return();
        retval.start = input.LT(1);


        Token ass=null;
        GeneratorParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // Generator.g:1775:3: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
            // Generator.g:1776:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
            {
            match(input,92,FOLLOW_92_in_lnkInsStat8430); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat8434); if (state.failed) return retval;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat8444);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat8448); if (state.failed) return retval;

            match(input,93,FOLLOW_93_in_lnkInsStat8452); if (state.failed) return retval;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat8460); if (state.failed) return retval;

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
    // Generator.g:1786:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
    public final GeneratorParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
        GeneratorParser.rValListMin2WithOptionalQualifiers_return retval = new GeneratorParser.rValListMin2WithOptionalQualifiers_return();
        retval.start = input.LT(1);


        ASTRValue r =null;

        List<ASTRValue> qualifierValues =null;



          retval.participans = new ArrayList<ASTRValue>();
          retval.qualifiers = new ArrayList<List<ASTRValue>>();
          List<ASTRValue> currentQualifiers = Collections.emptyList();

        try {
            // Generator.g:1792:3: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
            // Generator.g:1793:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8489);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add(r); }

            // Generator.g:1794:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==LBRACE) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // Generator.g:1795:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8500); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8509);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8516); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers8532); if (state.failed) return retval;

            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8543);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add(r); }

            // Generator.g:1807:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==LBRACE) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // Generator.g:1808:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8554); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8563);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8570); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            // Generator.g:1817:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            loop156:
            do {
                int alt156=2;
                int LA156_0 = input.LA(1);

                if ( (LA156_0==COMMA) ) {
                    alt156=1;
                }


                switch (alt156) {
            	case 1 :
            	    // Generator.g:1818:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers8592); if (state.failed) return retval;

            	    pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8607);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.participans.add(r); }

            	    // Generator.g:1822:5: ( LBRACE qualifierValues= rValList RBRACE )?
            	    int alt155=2;
            	    int LA155_0 = input.LA(1);

            	    if ( (LA155_0==LBRACE) ) {
            	        alt155=1;
            	    }
            	    switch (alt155) {
            	        case 1 :
            	            // Generator.g:1823:6: LBRACE qualifierValues= rValList RBRACE
            	            {
            	            match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8627); if (state.failed) return retval;

            	            pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8638);
            	            qualifierValues=rValList();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

            	            match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8647); if (state.failed) return retval;

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
            	    break loop156;
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
    // Generator.g:1838:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
    public final GeneratorParser.lnkDelStat_return lnkDelStat() throws RecognitionException {
        GeneratorParser.lnkDelStat_return retval = new GeneratorParser.lnkDelStat_return();
        retval.start = input.LT(1);


        Token ass=null;
        GeneratorParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // Generator.g:1839:3: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
            // Generator.g:1840:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
            {
            match(input,77,FOLLOW_77_in_lnkDelStat8688); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat8692); if (state.failed) return retval;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat8702);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat8706); if (state.failed) return retval;

            match(input,88,FOLLOW_88_in_lnkDelStat8710); if (state.failed) return retval;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat8719); if (state.failed) return retval;

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
    // Generator.g:1854:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' ;
    public final GeneratorParser.condExStat_return condExStat() throws RecognitionException {
        GeneratorParser.condExStat_return retval = new GeneratorParser.condExStat_return();
        retval.start = input.LT(1);


        ASTExpression con =null;

        ASTStatement ts =null;

        ASTStatement es =null;



          ASTStatement elseStat = new ASTEmptyStatement();

        try {
            // Generator.g:1858:3: ( 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' )
            // Generator.g:1859:3: 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end'
            {
            match(input,89,FOLLOW_89_in_condExStat8750); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_condExStat8759);
            con=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,121,FOLLOW_121_in_condExStat8763); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat8772);
            ts=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            // Generator.g:1863:3: ( 'else' es= statOrImplicitBlock )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==81) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // Generator.g:1864:5: 'else' es= statOrImplicitBlock
                    {
                    match(input,81,FOLLOW_81_in_condExStat8783); if (state.failed) return retval;

                    pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat8795);
                    es=statOrImplicitBlock();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { elseStat = es; }

                    }
                    break;

            }


            match(input,82,FOLLOW_82_in_condExStat8807); if (state.failed) return retval;

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
    // Generator.g:1875:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final GeneratorParser.iterStat_return iterStat() throws RecognitionException {
        GeneratorParser.iterStat_return retval = new GeneratorParser.iterStat_return();
        retval.start = input.LT(1);


        Token var=null;
        ASTExpression set =null;

        ASTStatement s =null;


        try {
            // Generator.g:1876:3: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // Generator.g:1877:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,87,FOLLOW_87_in_iterStat8832); if (state.failed) return retval;

            var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat8840); if (state.failed) return retval;

            match(input,91,FOLLOW_91_in_iterStat8844); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_iterStat8852);
            set=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,80,FOLLOW_80_in_iterStat8856); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_iterStat8864);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            match(input,82,FOLLOW_82_in_iterStat8869); if (state.failed) return retval;

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
    // Generator.g:1892:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final GeneratorParser.whileStat_return whileStat() throws RecognitionException {
        GeneratorParser.whileStat_return retval = new GeneratorParser.whileStat_return();
        retval.start = input.LT(1);


        ASTExpression cond =null;

        ASTStatement s =null;


        try {
            // Generator.g:1893:3: ( 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // Generator.g:1894:3: 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,125,FOLLOW_125_in_whileStat8895); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_whileStat8903);
            cond=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,80,FOLLOW_80_in_whileStat8907); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_whileStat8915);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            match(input,82,FOLLOW_82_in_whileStat8920); if (state.failed) return retval;

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
    // Generator.g:1906:1: blockStat returns [ASTBlockStatement n] : 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' ;
    public final GeneratorParser.blockStat_return blockStat() throws RecognitionException {
        GeneratorParser.blockStat_return retval = new GeneratorParser.blockStat_return();
        retval.start = input.LT(1);


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        GeneratorParser.stat_return s =null;



          retval.n = new ASTBlockStatement(((Token)retval.start), org.tzi.use.config.Options.explicitVariableDeclarations);

        try {
            // Generator.g:1910:2: ( 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' )
            // Generator.g:1911:2: 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end'
            {
            match(input,70,FOLLOW_70_in_blockStat8950); if (state.failed) return retval;

            // Generator.g:1912:2: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==76) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // Generator.g:1912:4: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI
                    {
                    match(input,76,FOLLOW_76_in_blockStat8955); if (state.failed) return retval;

                    pushFollow(FOLLOW_variableDeclaration_in_blockStat8961);
                    vd=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}

                    // Generator.g:1912:73: ( COMMA vd1= variableDeclaration )*
                    loop158:
                    do {
                        int alt158=2;
                        int LA158_0 = input.LA(1);

                        if ( (LA158_0==COMMA) ) {
                            alt158=1;
                        }


                        switch (alt158) {
                    	case 1 :
                    	    // Generator.g:1912:75: COMMA vd1= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_blockStat8967); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_variableDeclaration_in_blockStat8973);
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


                    match(input,SEMI,FOLLOW_SEMI_in_blockStat8980); if (state.failed) return retval;

                    }
                    break;

            }


            pushFollow(FOLLOW_stat_in_blockStat8990);
            s=stat();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n.setBody((s!=null?s.n:null)); }

            match(input,82,FOLLOW_82_in_blockStat8995); if (state.failed) return retval;

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
    // Generator.g:1921:1: implicitBlockStat returns [ASTBlockStatement n] : 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat ;
    public final GeneratorParser.implicitBlockStat_return implicitBlockStat() throws RecognitionException {
        GeneratorParser.implicitBlockStat_return retval = new GeneratorParser.implicitBlockStat_return();
        retval.start = input.LT(1);


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        GeneratorParser.stat_return s =null;



          retval.n = new ASTBlockStatement(((Token)retval.start), false);

        try {
            // Generator.g:1925:3: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat )
            // Generator.g:1926:3: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat
            {
            match(input,76,FOLLOW_76_in_implicitBlockStat9021); if (state.failed) return retval;

            pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat9027);
            vd=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}

            // Generator.g:1926:72: ( COMMA vd1= variableDeclaration )*
            loop160:
            do {
                int alt160=2;
                int LA160_0 = input.LA(1);

                if ( (LA160_0==COMMA) ) {
                    alt160=1;
                }


                switch (alt160) {
            	case 1 :
            	    // Generator.g:1926:74: COMMA vd1= variableDeclaration
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_implicitBlockStat9033); if (state.failed) return retval;

            	    pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat9039);
            	    vd1=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}

            	    }
            	    break;

            	default :
            	    break loop160;
                }
            } while (true);


            match(input,SEMI,FOLLOW_SEMI_in_implicitBlockStat9046); if (state.failed) return retval;

            pushFollow(FOLLOW_stat_in_implicitBlockStat9054);
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
    // Generator.g:1930:1: statOrImplicitBlock returns [ASTStatement n] : (s1= stat |s2= implicitBlockStat ) ;
    public final ASTStatement statOrImplicitBlock() throws RecognitionException {
        ASTStatement n = null;


        GeneratorParser.stat_return s1 =null;

        GeneratorParser.implicitBlockStat_return s2 =null;


        try {
            // Generator.g:1931:3: ( (s1= stat |s2= implicitBlockStat ) )
            // Generator.g:1932:3: (s1= stat |s2= implicitBlockStat )
            {
            // Generator.g:1932:3: (s1= stat |s2= implicitBlockStat )
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==AT||LA161_0==HASH||(LA161_0 >= IDENT && LA161_0 <= INT)||(LA161_0 >= LPAREN && LA161_0 <= MINUS)||LA161_0==PLUS||LA161_0==REAL||LA161_0==SEMI||(LA161_0 >= STAR && LA161_0 <= STRING)||LA161_0==45||LA161_0==47||LA161_0==52||(LA161_0 >= 55 && LA161_0 <= 56)||LA161_0==58||LA161_0==60||LA161_0==70||(LA161_0 >= 77 && LA161_0 <= 78)||(LA161_0 >= 81 && LA161_0 <= 82)||(LA161_0 >= 86 && LA161_0 <= 87)||LA161_0==89||LA161_0==92||(LA161_0 >= 95 && LA161_0 <= 96)||(LA161_0 >= 98 && LA161_0 <= 106)||(LA161_0 >= 116 && LA161_0 <= 117)||LA161_0==123||LA161_0==125) ) {
                alt161=1;
            }
            else if ( (LA161_0==76) ) {
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
                    // Generator.g:1932:4: s1= stat
                    {
                    pushFollow(FOLLOW_stat_in_statOrImplicitBlock9077);
                    s1=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s1!=null?s1.n:null); }

                    }
                    break;
                case 2 :
                    // Generator.g:1932:31: s2= implicitBlockStat
                    {
                    pushFollow(FOLLOW_implicitBlockStat_in_statOrImplicitBlock9087);
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
    // Generator.g:1946:1: nothing :;
    public final void nothing() throws RecognitionException {
        try {
            // Generator.g:1947:1: ()
            // Generator.g:1948:1: 
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
    // Generator.g:1954:1: rValue returns [ASTRValue n] : (e= inSoilExpression |oc= objCreateStat );
    public final ASTRValue rValue() throws RecognitionException {
        ASTRValue n = null;


        ASTExpression e =null;

        GeneratorParser.objCreateStat_return oc =null;


        try {
            // Generator.g:1955:5: (e= inSoilExpression |oc= objCreateStat )
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==AT||LA162_0==HASH||(LA162_0 >= IDENT && LA162_0 <= INT)||(LA162_0 >= LPAREN && LA162_0 <= MINUS)||LA162_0==PLUS||LA162_0==REAL||(LA162_0 >= STAR && LA162_0 <= STRING)||LA162_0==45||LA162_0==47||LA162_0==52||(LA162_0 >= 55 && LA162_0 <= 56)||LA162_0==58||LA162_0==60||LA162_0==86||LA162_0==89||(LA162_0 >= 95 && LA162_0 <= 96)||(LA162_0 >= 99 && LA162_0 <= 106)||(LA162_0 >= 116 && LA162_0 <= 117)||LA162_0==123) ) {
                alt162=1;
            }
            else if ( (LA162_0==98) ) {
                alt162=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 162, 0, input);

                throw nvae;

            }
            switch (alt162) {
                case 1 :
                    // Generator.g:1956:5: e= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_rValue9133);
                    e=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRValueExpressionOrOpCall(e); }

                    }
                    break;
                case 2 :
                    // Generator.g:1957:5: oc= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_rValue9145);
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
    // Generator.g:1970:1: rValList returns [List<ASTRValue> n] : ( nothing |rl= rValListMin1 );
    public final List<ASTRValue> rValList() throws RecognitionException {
        List<ASTRValue> n = null;


        List<ASTRValue> rl =null;


        try {
            // Generator.g:1971:3: ( nothing |rl= rValListMin1 )
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==RBRACE) ) {
                alt163=1;
            }
            else if ( (LA163_0==AT||LA163_0==HASH||(LA163_0 >= IDENT && LA163_0 <= INT)||(LA163_0 >= LPAREN && LA163_0 <= MINUS)||LA163_0==PLUS||LA163_0==REAL||(LA163_0 >= STAR && LA163_0 <= STRING)||LA163_0==45||LA163_0==47||LA163_0==52||(LA163_0 >= 55 && LA163_0 <= 56)||LA163_0==58||LA163_0==60||LA163_0==86||LA163_0==89||(LA163_0 >= 95 && LA163_0 <= 96)||(LA163_0 >= 98 && LA163_0 <= 106)||(LA163_0 >= 116 && LA163_0 <= 117)||LA163_0==123) ) {
                alt163=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 163, 0, input);

                throw nvae;

            }
            switch (alt163) {
                case 1 :
                    // Generator.g:1972:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_rValList9168);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = Collections.<ASTRValue>emptyList(); }

                    }
                    break;
                case 2 :
                    // Generator.g:1975:3: rl= rValListMin1
                    {
                    pushFollow(FOLLOW_rValListMin1_in_rValList9195);
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
    // Generator.g:1983:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin1() throws RecognitionException {
        List<ASTRValue> n = null;


        ASTRValue r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // Generator.g:1987:3: (r= rValue ( COMMA r= rValue )* )
            // Generator.g:1988:3: r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin19228);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            // Generator.g:1990:3: ( COMMA r= rValue )*
            loop164:
            do {
                int alt164=2;
                int LA164_0 = input.LA(1);

                if ( (LA164_0==COMMA) ) {
                    alt164=1;
                }


                switch (alt164) {
            	case 1 :
            	    // Generator.g:1991:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin19242); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin19252);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add(r); }

            	    }
            	    break;

            	default :
            	    break loop164;
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
    // Generator.g:2001:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin2() throws RecognitionException {
        List<ASTRValue> n = null;


        ASTRValue r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // Generator.g:2005:3: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
            // Generator.g:2006:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin29291);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin29299); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_rValListMin29307);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            // Generator.g:2011:3: ( COMMA r= rValue )*
            loop165:
            do {
                int alt165=2;
                int LA165_0 = input.LA(1);

                if ( (LA165_0==COMMA) ) {
                    alt165=1;
                }


                switch (alt165) {
            	case 1 :
            	    // Generator.g:2012:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin29321); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin29331);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add(r); }

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
    // $ANTLR end "rValListMin2"



    // $ANTLR start "inSoilExpression"
    // Generator.g:2022:1: inSoilExpression returns [ASTExpression n] : e= expression ;
    public final ASTExpression inSoilExpression() throws RecognitionException {
        ASTExpression n = null;


        GeneratorParser.expression_return e =null;


        try {
            // Generator.g:2023:3: (e= expression )
            // Generator.g:2024:3: e= expression
            {
            pushFollow(FOLLOW_expression_in_inSoilExpression9365);
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
    // Generator.g:2033:1: exprList returns [List<ASTExpression> n] : ( nothing |el= exprListMin1 );
    public final List<ASTExpression> exprList() throws RecognitionException {
        List<ASTExpression> n = null;


        List<ASTExpression> el =null;


        try {
            // Generator.g:2034:3: ( nothing |el= exprListMin1 )
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==EOF) ) {
                alt166=1;
            }
            else if ( (LA166_0==AT||LA166_0==HASH||(LA166_0 >= IDENT && LA166_0 <= INT)||(LA166_0 >= LPAREN && LA166_0 <= MINUS)||LA166_0==PLUS||LA166_0==REAL||(LA166_0 >= STAR && LA166_0 <= STRING)||LA166_0==45||LA166_0==47||LA166_0==52||(LA166_0 >= 55 && LA166_0 <= 56)||LA166_0==58||LA166_0==60||LA166_0==86||LA166_0==89||(LA166_0 >= 95 && LA166_0 <= 96)||(LA166_0 >= 99 && LA166_0 <= 106)||(LA166_0 >= 116 && LA166_0 <= 117)||LA166_0==123) ) {
                alt166=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 166, 0, input);

                throw nvae;

            }
            switch (alt166) {
                case 1 :
                    // Generator.g:2035:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_exprList9394);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<ASTExpression>(); }

                    }
                    break;
                case 2 :
                    // Generator.g:2038:3: el= exprListMin1
                    {
                    pushFollow(FOLLOW_exprListMin1_in_exprList9412);
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
    // Generator.g:2046:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin1() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // Generator.g:2050:3: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // Generator.g:2051:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin19445);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // Generator.g:2053:3: ( COMMA e= inSoilExpression )*
            loop167:
            do {
                int alt167=2;
                int LA167_0 = input.LA(1);

                if ( (LA167_0==COMMA) ) {
                    alt167=1;
                }


                switch (alt167) {
            	case 1 :
            	    // Generator.g:2054:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin19460); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin19470);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            	    }
            	    break;

            	default :
            	    break loop167;
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
    // Generator.g:2064:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin2() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // Generator.g:2068:3: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // Generator.g:2069:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin29510);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            match(input,COMMA,FOLLOW_COMMA_in_exprListMin29518); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_exprListMin29526);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // Generator.g:2074:3: ( COMMA e= inSoilExpression )*
            loop168:
            do {
                int alt168=2;
                int LA168_0 = input.LA(1);

                if ( (LA168_0==COMMA) ) {
                    alt168=1;
                }


                switch (alt168) {
            	case 1 :
            	    // Generator.g:2075:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin29540); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin29550);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

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
    // $ANTLR end "exprListMin2"



    // $ANTLR start "identList"
    // Generator.g:2085:1: identList returns [List<String> n] : ( nothing |il= identListMin1 );
    public final List<String> identList() throws RecognitionException {
        List<String> n = null;


        List<String> il =null;


        try {
            // Generator.g:2086:3: ( nothing |il= identListMin1 )
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==EOF||LA169_0==RBRACE||LA169_0==SEMI||(LA169_0 >= 81 && LA169_0 <= 82)) ) {
                alt169=1;
            }
            else if ( (LA169_0==IDENT) ) {
                alt169=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 169, 0, input);

                throw nvae;

            }
            switch (alt169) {
                case 1 :
                    // Generator.g:2087:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_identList9580);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<String>(); }

                    }
                    break;
                case 2 :
                    // Generator.g:2090:3: il= identListMin1
                    {
                    pushFollow(FOLLOW_identListMin1_in_identList9597);
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
    // Generator.g:2098:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
    public final List<String> identListMin1() throws RecognitionException {
        List<String> n = null;


        Token id=null;


          n = new ArrayList<String>();

        try {
            // Generator.g:2102:3: (id= IDENT ( COMMA id= IDENT )* )
            // Generator.g:2103:3: id= IDENT ( COMMA id= IDENT )*
            {
            id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin19631); if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((id!=null?id.getText():null)); }

            // Generator.g:2105:3: ( COMMA id= IDENT )*
            loop170:
            do {
                int alt170=2;
                int LA170_0 = input.LA(1);

                if ( (LA170_0==COMMA) ) {
                    alt170=1;
                }


                switch (alt170) {
            	case 1 :
            	    // Generator.g:2106:5: COMMA id= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identListMin19645); if (state.failed) return n;

            	    id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin19655); if (state.failed) return n;

            	    if ( state.backtracking==0 ) {
            	        n.add((id!=null?id.getText():null)); }

            	    }
            	    break;

            	default :
            	    break loop170;
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
        // Generator.g:1504:7: ( COLON type EQUAL )
        // Generator.g:1504:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred1_Generator7381); if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred1_Generator7383);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_Generator7385); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Generator

    // $ANTLR start synpred2_Generator
    public final void synpred2_Generator_fragment() throws RecognitionException {
        // Generator.g:1655:5: ( statStartingWithExpr )
        // Generator.g:1655:6: statStartingWithExpr
        {
        pushFollow(FOLLOW_statStartingWithExpr_in_synpred2_Generator7933);
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
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA83 dfa83 = new DFA83(this);
    static final String DFA21_eotS =
        "\46\uffff";
    static final String DFA21_eofS =
        "\1\1\45\uffff";
    static final String DFA21_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\23\3\uffff\1\25\3\15\1\27\1\12\1\35"+
        "\1\24\1\5\1\uffff\1\15\1\23\1\5\5\23\1\35\1\15\2\23\1\13\1\12\1"+
        "\35\2\27\1\60\1\12\1\23";
    static final String DFA21_maxS =
        "\1\162\1\uffff\1\73\1\uffff\1\23\3\uffff\1\31\3\15\1\166\1\44\1"+
        "\35\1\105\1\71\1\uffff\1\15\1\23\1\124\5\23\1\35\1\15\2\23\1\13"+
        "\1\44\1\35\2\166\1\73\1\44\1\23";
    static final String DFA21_acceptS =
        "\1\uffff\1\6\1\uffff\1\1\1\uffff\1\3\1\4\1\5\11\uffff\1\2\24\uffff";
    static final String DFA21_specialS =
        "\46\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\2\15\uffff\1\4\53\uffff\1\3\2\uffff\2\3\5\uffff\1\5\12\uffff"+
            "\1\6\35\uffff\1\7",
            "",
            "\1\10\34\uffff\1\11\5\uffff\1\12\4\uffff\1\13",
            "",
            "\1\14",
            "",
            "",
            "",
            "\1\3\3\uffff\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\3\54\uffff\1\3\2\uffff\1\21\1\uffff\1\3\10\uffff\1\3\30"+
            "\uffff\1\3\12\uffff\1\3",
            "\1\23\10\uffff\1\22\20\uffff\1\24",
            "\1\25",
            "\1\27\60\uffff\1\26",
            "\1\31\53\uffff\1\30\7\uffff\1\30",
            "",
            "\1\32",
            "\1\33",
            "\1\2\15\uffff\1\34\53\uffff\1\3\2\uffff\2\3\20\uffff\1\6",
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
            "\1\3\54\uffff\1\3\2\uffff\1\21\1\uffff\1\3\10\uffff\1\3\30"+
            "\uffff\1\3\12\uffff\1\3",
            "\1\3\54\uffff\1\3\2\uffff\1\21\1\uffff\1\3\10\uffff\1\3\30"+
            "\uffff\1\3\12\uffff\1\3",
            "\1\45\5\uffff\1\45\4\uffff\1\45",
            "\1\23\31\uffff\1\24",
            "\1\35"
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
            return "()* loopback of 401:5: ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition | query )*";
        }
    }
    static final String DFA20_eotS =
        "\30\uffff";
    static final String DFA20_eofS =
        "\1\1\4\uffff\1\10\22\uffff";
    static final String DFA20_minS =
        "\1\5\1\uffff\2\23\1\25\1\5\1\41\2\uffff\3\15\1\23\1\35\1\24\1\5"+
        "\4\41\1\23\1\13\1\60\1\41";
    static final String DFA20_maxS =
        "\1\162\1\uffff\1\73\1\23\1\31\1\162\1\73\2\uffff\3\15\1\112\1\35"+
        "\1\105\1\71\4\73\1\23\1\13\2\73";
    static final String DFA20_acceptS =
        "\1\uffff\1\3\5\uffff\1\2\1\1\17\uffff";
    static final String DFA20_specialS =
        "\30\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\2\15\uffff\1\1\53\uffff\1\1\2\uffff\2\1\5\uffff\1\1\1\3\11"+
            "\uffff\1\1\35\uffff\1\1",
            "",
            "\1\4\34\uffff\1\1\5\uffff\1\1\4\uffff\1\1",
            "\1\5",
            "\1\6\3\uffff\1\1",
            "\1\10\1\uffff\1\10\1\7\1\uffff\1\10\10\uffff\1\10\53\uffff"+
            "\1\10\2\uffff\2\10\5\uffff\2\10\11\uffff\2\10\10\uffff\1\10"+
            "\23\uffff\1\10",
            "\1\14\16\uffff\1\11\5\uffff\1\12\4\uffff\1\13",
            "",
            "",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\1\66\uffff\1\10",
            "\1\20",
            "\1\22\60\uffff\1\21",
            "\1\24\53\uffff\1\23\7\uffff\1\23",
            "\1\14\16\uffff\1\11\5\uffff\1\12\4\uffff\1\13",
            "\1\14\16\uffff\1\11\5\uffff\1\12\4\uffff\1\13",
            "\1\14\16\uffff\1\11\5\uffff\1\12\4\uffff\1\13",
            "\1\14\16\uffff\1\11\5\uffff\1\12\4\uffff\1\13",
            "\1\25",
            "\1\26",
            "\1\27\5\uffff\1\27\4\uffff\1\27",
            "\1\14\16\uffff\1\11\5\uffff\1\12\4\uffff\1\13"
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
            return "()* loopback of 404:11: (cons= invariant |ppc= prePost )*";
        }
    }
    static final String DFA53_eotS =
        "\16\uffff";
    static final String DFA53_eofS =
        "\16\uffff";
    static final String DFA53_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\31\1\12\1\15\1\23\1\5\1\35\1\15\1\12"+
        "\1\35\1\12";
    static final String DFA53_maxS =
        "\1\166\1\uffff\1\23\1\uffff\1\31\1\44\1\15\1\23\1\157\1\35\1\15"+
        "\1\44\1\35\1\44";
    static final String DFA53_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\12\uffff";
    static final String DFA53_specialS =
        "\16\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\2\15\uffff\1\1\21\uffff\1\1\43\uffff\1\1\10\uffff\1\1\33"+
            "\uffff\2\3\6\uffff\1\1",
            "",
            "\1\4",
            "",
            "\1\5",
            "\1\7\10\uffff\1\6\20\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\2\15\uffff\1\1\132\uffff\2\3",
            "\1\13",
            "\1\14",
            "\1\7\31\uffff\1\10",
            "\1\15",
            "\1\7\31\uffff\1\10"
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "()* loopback of 588:5: (ppc= prePostClause )*";
        }
    }
    static final String DFA77_eotS =
        "\36\uffff";
    static final String DFA77_eofS =
        "\1\1\35\uffff";
    static final String DFA77_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\25\3\15\1\12\1\35\1\24\1\5\1\15\1\23"+
        "\5\5\1\23\1\35\1\15\1\23\1\13\1\12\1\35\1\25\1\60\1\12\1\5";
    static final String DFA77_maxS =
        "\1\162\1\uffff\1\73\1\uffff\1\31\3\15\1\44\1\35\1\105\1\71\1\15"+
        "\1\23\5\136\1\23\1\35\1\15\1\73\1\13\1\44\1\35\1\31\1\73\1\44\1"+
        "\136";
    static final String DFA77_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\32\uffff";
    static final String DFA77_specialS =
        "\36\uffff}>";
    static final String[] DFA77_transitionS = {
            "\1\2\15\uffff\1\1\53\uffff\1\1\2\uffff\2\1\5\uffff\2\1\11\uffff"+
            "\1\1\1\3\10\uffff\1\3\23\uffff\1\1",
            "",
            "\1\4\34\uffff\1\5\5\uffff\1\6\4\uffff\1\7",
            "",
            "\1\1\3\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\15\10\uffff\1\14\20\uffff\1\16",
            "\1\17",
            "\1\21\60\uffff\1\20",
            "\1\23\53\uffff\1\22\7\uffff\1\22",
            "\1\24",
            "\1\25",
            "\1\26\15\uffff\1\1\53\uffff\1\1\2\uffff\2\1\20\uffff\1\1\11"+
            "\uffff\1\3",
            "\1\3\15\uffff\1\1\112\uffff\1\3",
            "\1\3\15\uffff\1\1\112\uffff\1\3",
            "\1\3\15\uffff\1\1\112\uffff\1\3",
            "\1\3\15\uffff\1\1\112\uffff\1\3",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32\34\uffff\1\1\5\uffff\1\1\4\uffff\1\1",
            "\1\33",
            "\1\15\31\uffff\1\16",
            "\1\34",
            "\1\1\3\uffff\1\10",
            "\1\35\5\uffff\1\35\4\uffff\1\35",
            "\1\15\31\uffff\1\16",
            "\1\3\15\uffff\1\1\112\uffff\1\3"
    };

    static final short[] DFA77_eot = DFA.unpackEncodedString(DFA77_eotS);
    static final short[] DFA77_eof = DFA.unpackEncodedString(DFA77_eofS);
    static final char[] DFA77_min = DFA.unpackEncodedStringToUnsignedChars(DFA77_minS);
    static final char[] DFA77_max = DFA.unpackEncodedStringToUnsignedChars(DFA77_maxS);
    static final short[] DFA77_accept = DFA.unpackEncodedString(DFA77_acceptS);
    static final short[] DFA77_special = DFA.unpackEncodedString(DFA77_specialS);
    static final short[][] DFA77_transition;

    static {
        int numStates = DFA77_transitionS.length;
        DFA77_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA77_transition[i] = DFA.unpackEncodedString(DFA77_transitionS[i]);
        }
    }

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = DFA77_eot;
            this.eof = DFA77_eof;
            this.min = DFA77_min;
            this.max = DFA77_max;
            this.accept = DFA77_accept;
            this.special = DFA77_special;
            this.transition = DFA77_transition;
        }
        public String getDescription() {
            return "()* loopback of 768:5: (inv= invariantClause )*";
        }
    }
    static final String DFA83_eotS =
        "\20\uffff";
    static final String DFA83_eofS =
        "\1\1\17\uffff";
    static final String DFA83_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\25\1\12\1\15\1\23\1\5\1\35\1\15\1\23"+
        "\1\12\1\35\1\25\1\12";
    static final String DFA83_maxS =
        "\1\162\1\uffff\1\73\1\uffff\1\31\1\44\1\15\1\23\1\157\1\35\1\15"+
        "\1\73\1\44\1\35\1\31\1\44";
    static final String DFA83_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\14\uffff";
    static final String DFA83_specialS =
        "\20\uffff}>";
    static final String[] DFA83_transitionS = {
            "\1\2\15\uffff\1\1\53\uffff\1\1\2\uffff\2\1\5\uffff\2\1\11\uffff"+
            "\1\1\31\uffff\2\3\2\uffff\1\1",
            "",
            "\1\4\34\uffff\1\1\5\uffff\1\1\4\uffff\1\1",
            "",
            "\1\1\3\uffff\1\5",
            "\1\7\10\uffff\1\6\20\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\13\15\uffff\1\1\53\uffff\1\1\2\uffff\2\1\20\uffff\1\1\31"+
            "\uffff\2\3",
            "\1\14",
            "\1\15",
            "\1\16\34\uffff\1\1\5\uffff\1\1\4\uffff\1\1",
            "\1\7\31\uffff\1\10",
            "\1\17",
            "\1\1\3\uffff\1\5",
            "\1\7\31\uffff\1\10"
    };

    static final short[] DFA83_eot = DFA.unpackEncodedString(DFA83_eotS);
    static final short[] DFA83_eof = DFA.unpackEncodedString(DFA83_eofS);
    static final char[] DFA83_min = DFA.unpackEncodedStringToUnsignedChars(DFA83_minS);
    static final char[] DFA83_max = DFA.unpackEncodedStringToUnsignedChars(DFA83_maxS);
    static final short[] DFA83_accept = DFA.unpackEncodedString(DFA83_acceptS);
    static final short[] DFA83_special = DFA.unpackEncodedString(DFA83_specialS);
    static final short[][] DFA83_transition;

    static {
        int numStates = DFA83_transitionS.length;
        DFA83_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA83_transition[i] = DFA.unpackEncodedString(DFA83_transitionS[i]);
        }
    }

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = DFA83_eot;
            this.eof = DFA83_eof;
            this.min = DFA83_min;
            this.max = DFA83_max;
            this.accept = DFA83_accept;
            this.special = DFA83_special;
            this.transition = DFA83_transition;
        }
        public String getDescription() {
            return "()+ loopback of 797:5: (ppc= prePostClause )+";
        }
    }
 

    public static final BitSet FOLLOW_invariant_in_invariantListOnly80 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000400L});
    public static final BitSet FOLLOW_EOF_in_invariantListOnly91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_in_procedureListOnly136 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_EOF_in_procedureListOnly151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_procedure179 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_procedure183 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_procedure185 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_variableDeclarationList_in_procedure189 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_procedure191 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000040L});
    public static final BitSet FOLLOW_124_in_procedure199 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_variableDeclarationList_in_procedure203 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_procedure205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_procedure214 = new BitSet(new long[]{0x000C500000480000L,0x0000000002840000L});
    public static final BitSet FOLLOW_instructionList_in_procedure218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_procedure220 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_procedure222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList260 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_variableDeclarationList271 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList275 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_instruction_in_instructionList319 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_instructionList321 = new BitSet(new long[]{0x000C500000480002L,0x0000000002800000L});
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
    public static final BitSet FOLLOW_87_in_loop601 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_loop605 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_loop607 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_oclExpression_in_loop611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_loop613 = new BitSet(new long[]{0x000C500000480000L,0x0000000002840000L});
    public static final BitSet FOLLOW_instructionList_in_loop624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_loop626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ifThenElse662 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_oclExpression_in_ifThenElse666 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_ifThenElse677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ifThenElse679 = new BitSet(new long[]{0x000C500000480000L,0x0000000002840000L});
    public static final BitSet FOLLOW_instructionList_in_ifThenElse683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ifThenElse685 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ifThenElse696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ifThenElse698 = new BitSet(new long[]{0x000C500000480000L,0x0000000002840000L});
    public static final BitSet FOLLOW_instructionList_in_ifThenElse702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ifThenElse704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicInstruction_in_valueInstruction744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_valueInstruction758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_atomicInstruction788 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_atomicInstruction792 = new BitSet(new long[]{0x0000001000480000L});
    public static final BitSet FOLLOW_instructionParameter_in_atomicInstruction806 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_atomicInstruction824 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_instructionParameter_in_atomicInstruction828 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_atomicInstruction876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_asslCall899 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_asslCall903 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_asslCall907 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_oclExpression_in_asslCall921 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_asslCall939 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_oclExpression_in_asslCall943 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_asslCall991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_opEnter1014 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_oclExpression_in_opEnter1018 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_opEnter1022 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_opEnter1026 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_oclExpression_in_opEnter1041 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_opEnter1059 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_oclExpression_in_opEnter1063 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_opEnter1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_opExit1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_instructionParameter1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrParameterIdent_in_instructionParameter1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_instrParameterIdent1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_oclExpression1231 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_oclExpression1235 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_oclExpression1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_barrier1265 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_barrier1270 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_IDENT_in_barrier1285 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_barrier1287 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_barrier1293 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_oclExpression_in_barrier1309 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_barrier1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedureCallOnly1345 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_procedureCallOnly1353 = new BitSet(new long[]{0x1590A318861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_procedureCallOnly1364 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_procedureCallOnly1374 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_procedureCallOnly1378 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_procedureCallOnly1392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_procedureCallOnly1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_model1427 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_model1433 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_model1437 = new BitSet(new long[]{0x8000000000080020L,0x000400000010020CL});
    public static final BitSet FOLLOW_generalClassifierDefinition_in_model1449 = new BitSet(new long[]{0x8000000000080020L,0x000400000010020CL});
    public static final BitSet FOLLOW_associationDefinition_in_model1462 = new BitSet(new long[]{0x8000000000080020L,0x000400000010020CL});
    public static final BitSet FOLLOW_73_in_model1476 = new BitSet(new long[]{0x8000000000080020L,0x000400000010060CL});
    public static final BitSet FOLLOW_invariant_in_model1494 = new BitSet(new long[]{0x8000000000080020L,0x000400000010060CL});
    public static final BitSet FOLLOW_prePost_in_model1515 = new BitSet(new long[]{0x8000000000080020L,0x000400000010060CL});
    public static final BitSet FOLLOW_enumTypeDefinition_in_model1555 = new BitSet(new long[]{0x8000000000080020L,0x000400000010020CL});
    public static final BitSet FOLLOW_query_in_model1567 = new BitSet(new long[]{0x8000000000080020L,0x000400000010020CL});
    public static final BitSet FOLLOW_EOF_in_model1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_enumTypeDefinition1608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_enumTypeDefinition1614 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_enumTypeDefinition1618 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_enumTypeDefinition1620 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_enumTypeDefinition1624 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_enumTypeDefinition1626 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_enumTypeDefinition1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_generalClassifierDefinition1668 = new BitSet(new long[]{0x8000000000080020L,0x000000000000000CL});
    public static final BitSet FOLLOW_63_in_generalClassifierDefinition1676 = new BitSet(new long[]{0x0000000000080020L,0x000000000000000CL});
    public static final BitSet FOLLOW_classDefinition_in_generalClassifierDefinition1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_associationClassDefinition_in_generalClassifierDefinition1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signalDefinition_in_generalClassifierDefinition1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_annotation_in_classDefinition1841 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_line_annotation_in_classDefinition1847 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyClass_in_classDefinition1857 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_classDefinition1861 = new BitSet(new long[]{0x0000000000800000L,0x0040080000040210L});
    public static final BitSet FOLLOW_LESS_in_classDefinition1871 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_classDefinition1875 = new BitSet(new long[]{0x0000000000000000L,0x0040080000040210L});
    public static final BitSet FOLLOW_68_in_classDefinition1888 = new BitSet(new long[]{0x0000000000080020L,0x0040080000040200L});
    public static final BitSet FOLLOW_attributeDefinition_in_classDefinition1901 = new BitSet(new long[]{0x0000000000080020L,0x0040080000040200L});
    public static final BitSet FOLLOW_107_in_classDefinition1922 = new BitSet(new long[]{0x0000000000080020L,0x0040000000040200L});
    public static final BitSet FOLLOW_operationDefinition_in_classDefinition1935 = new BitSet(new long[]{0x0000000000080020L,0x0040000000040200L});
    public static final BitSet FOLLOW_73_in_classDefinition1956 = new BitSet(new long[]{0x0000000000000020L,0x0040000040240000L});
    public static final BitSet FOLLOW_invariantClause_in_classDefinition1976 = new BitSet(new long[]{0x0000000000000020L,0x0040000040240000L});
    public static final BitSet FOLLOW_118_in_classDefinition2002 = new BitSet(new long[]{0x0000000000000000L,0x0002000000040000L});
    public static final BitSet FOLLOW_stateMachine_in_classDefinition2022 = new BitSet(new long[]{0x0000000000000000L,0x0002000000040000L});
    public static final BitSet FOLLOW_82_in_classDefinition2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_associationClassDefinition2079 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationClassDefinition2105 = new BitSet(new long[]{0x0000000000880000L,0x0040080000040290L});
    public static final BitSet FOLLOW_LESS_in_associationClassDefinition2115 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_associationClassDefinition2119 = new BitSet(new long[]{0x0000000000080000L,0x0040080000040290L});
    public static final BitSet FOLLOW_71_in_associationClassDefinition2131 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition2139 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition2151 = new BitSet(new long[]{0x0000000000080020L,0x0040080000040210L});
    public static final BitSet FOLLOW_68_in_associationClassDefinition2171 = new BitSet(new long[]{0x0000000000080020L,0x0040080000040200L});
    public static final BitSet FOLLOW_attributeDefinition_in_associationClassDefinition2184 = new BitSet(new long[]{0x0000000000080020L,0x0040080000040200L});
    public static final BitSet FOLLOW_107_in_associationClassDefinition2205 = new BitSet(new long[]{0x0000000000080020L,0x0040000000040200L});
    public static final BitSet FOLLOW_operationDefinition_in_associationClassDefinition2218 = new BitSet(new long[]{0x0000000000080020L,0x0040000000040200L});
    public static final BitSet FOLLOW_73_in_associationClassDefinition2239 = new BitSet(new long[]{0x0000000000080020L,0x0040000040240000L});
    public static final BitSet FOLLOW_invariantClause_in_associationClassDefinition2259 = new BitSet(new long[]{0x0000000000080020L,0x0040000040240000L});
    public static final BitSet FOLLOW_118_in_associationClassDefinition2285 = new BitSet(new long[]{0x0000000000080000L,0x0002000000040000L});
    public static final BitSet FOLLOW_stateMachine_in_associationClassDefinition2305 = new BitSet(new long[]{0x0000000000080000L,0x0002000000040000L});
    public static final BitSet FOLLOW_keyAggregation_in_associationClassDefinition2346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_keyComposition_in_associationClassDefinition2350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_associationClassDefinition2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_attributeDefinition2401 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attributeDefinition2409 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_attributeDefinition2411 = new BitSet(new long[]{0x0590A00000080000L});
    public static final BitSet FOLLOW_type_in_attributeDefinition2415 = new BitSet(new long[]{0x0000002000080002L});
    public static final BitSet FOLLOW_keyDerive_in_attributeDefinition2439 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_keyDerived_in_attributeDefinition2441 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_set_in_attributeDefinition2444 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_attributeDefinition2454 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_keyInit_in_attributeDefinition2474 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_set_in_attributeDefinition2478 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_attributeDefinition2490 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_attributeDefinition2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_operationDefinition2535 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_operationDefinition2545 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_paramList_in_operationDefinition2555 = new BitSet(new long[]{0x00000020000020A2L,0x0000C00000000040L});
    public static final BitSet FOLLOW_COLON_in_operationDefinition2569 = new BitSet(new long[]{0x0590A00000080000L});
    public static final BitSet FOLLOW_type_in_operationDefinition2575 = new BitSet(new long[]{0x0000002000002022L,0x0000C00000000040L});
    public static final BitSet FOLLOW_EQUAL_in_operationDefinition2603 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_operationDefinition2609 = new BitSet(new long[]{0x0000002000000022L,0x0000C00000000000L});
    public static final BitSet FOLLOW_blockStat_in_operationDefinition2631 = new BitSet(new long[]{0x0000002000000022L,0x0000C00000000000L});
    public static final BitSet FOLLOW_prePostClause_in_operationDefinition2653 = new BitSet(new long[]{0x0000002000000022L,0x0000C00000000000L});
    public static final BitSet FOLLOW_SEMI_in_operationDefinition2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_associationDefinition2697 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_line_annotation_in_associationDefinition2703 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyAssociation_in_associationDefinition2720 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyAggregation_in_associationDefinition2724 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyComposition_in_associationDefinition2728 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationDefinition2738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_associationDefinition2746 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationDefinition2754 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationDefinition2766 = new BitSet(new long[]{0x0000000000080020L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_associationDefinition2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_associationEnd2802 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd2810 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LBRACK_in_associationEnd2812 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_multiplicity_in_associationEnd2816 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_associationEnd2818 = new BitSet(new long[]{0x0000002000080002L,0x0108200000000000L});
    public static final BitSet FOLLOW_keyRole_in_associationEnd2829 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd2833 = new BitSet(new long[]{0x0000002000080002L,0x0108200000000000L});
    public static final BitSet FOLLOW_109_in_associationEnd2854 = new BitSet(new long[]{0x0000002000080002L,0x0108200000000000L});
    public static final BitSet FOLLOW_120_in_associationEnd2866 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd2870 = new BitSet(new long[]{0x0000002000080002L,0x0108200000000000L});
    public static final BitSet FOLLOW_keyUnion_in_associationEnd2882 = new BitSet(new long[]{0x0000002000080002L,0x0108200000000000L});
    public static final BitSet FOLLOW_115_in_associationEnd2894 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd2898 = new BitSet(new long[]{0x0000002000080002L,0x0108200000000000L});
    public static final BitSet FOLLOW_keyDerived_in_associationEnd2911 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_keyDerive_in_associationEnd2913 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_LPAREN_in_associationEnd2918 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_associationEnd2924 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_associationEnd2926 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_associationEnd2930 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_associationEnd2934 = new BitSet(new long[]{0x0000002000080002L,0x0108200000000000L});
    public static final BitSet FOLLOW_keyQualifier_in_associationEnd2946 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_paramList_in_associationEnd2952 = new BitSet(new long[]{0x0000002000080002L,0x0108200000000000L});
    public static final BitSet FOLLOW_SEMI_in_associationEnd2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicityRange_in_multiplicity3004 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_multiplicity3014 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_multiplicityRange_in_multiplicity3018 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange3047 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_multiplicityRange3057 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_multiplicitySpec3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicitySpec3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_annotation_in_annotationSpec3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_annotation_in_annotationSpec3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_block_annotation3164 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_block_annotation3166 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_block_annotation3168 = new BitSet(new long[]{0x0841000200000000L});
    public static final BitSet FOLLOW_annotation_tag_in_block_annotation3173 = new BitSet(new long[]{0x0841000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_block_annotation3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_line_annotation3200 = new BitSet(new long[]{0x0841000000000000L});
    public static final BitSet FOLLOW_annotation_tag_in_line_annotation3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_comment_in_annotation_tag3219 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotation_tag3221 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_NON_OCL_STRING_in_annotation_tag3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_weight_in_annotation_tag3232 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotation_tag3234 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000020L});
    public static final BitSet FOLLOW_annotation_def_in_annotation_tag3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_annotation_tag3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_type_in_annotation_tag3251 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotation_tag3253 = new BitSet(new long[]{0x0202000000000020L});
    public static final BitSet FOLLOW_annotation_enum_type_in_annotation_tag3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_ref_in_annotation_tag3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_annotation_comment3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_annotation_weight3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_annotation_type3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_annotation_override3311 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_annotation_override3313 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_annotation_override3315 = new BitSet(new long[]{0x0841000000000000L});
    public static final BitSet FOLLOW_annotation_term_in_annotation_override3317 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_annotation_override3319 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_annotation_override3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_tag_in_annotation_term3338 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_annotation_term3342 = new BitSet(new long[]{0x0841000000000000L});
    public static final BitSet FOLLOW_annotation_tag_in_annotation_term3344 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_AT_in_annotation_ref3356 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_annotation_ref3358 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_annotation_ref3360 = new BitSet(new long[]{0x0841000000000000L});
    public static final BitSet FOLLOW_annotation_predefined_in_annotation_ref3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_annotation_def3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_query3395 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_queryExpr_in_query3397 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_queryCOND_in_query3400 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_query3402 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_queryVariable_in_queryExpr3415 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_queryExpr3419 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_queryVariable_in_queryExpr3421 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_queryVariable3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_annotation_in_invariant3477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_invariant3488 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_invariant3498 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_COMMA_in_invariant3510 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_invariant3514 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_COLON_in_invariant3522 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_invariant3534 = new BitSet(new long[]{0x0000000000000022L,0x0000000040200000L});
    public static final BitSet FOLLOW_invariantClause_in_invariant3546 = new BitSet(new long[]{0x0000000000000022L,0x0000000040200000L});
    public static final BitSet FOLLOW_line_annotation_in_invariantClause3578 = new BitSet(new long[]{0x0000000000000020L,0x0000000040000000L});
    public static final BitSet FOLLOW_annotationSet_in_invariantClause3588 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_invariantClause3595 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_IDENT_in_invariantClause3601 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_invariantClause3606 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_invariantClause3610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_invariantClause3627 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_invariantClause3629 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_IDENT_in_invariantClause3635 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_invariantClause3640 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_invariantClause3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_prePost3677 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_prePost3681 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_prePost3683 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_prePost3687 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_paramList_in_prePost3691 = new BitSet(new long[]{0x00000000000000A0L,0x0000C00000000000L});
    public static final BitSet FOLLOW_COLON_in_prePost3695 = new BitSet(new long[]{0x0590A00000080000L});
    public static final BitSet FOLLOW_type_in_prePost3699 = new BitSet(new long[]{0x0000000000000020L,0x0000C00000000000L});
    public static final BitSet FOLLOW_prePostClause_in_prePost3718 = new BitSet(new long[]{0x0000000000000022L,0x0000C00000000000L});
    public static final BitSet FOLLOW_annotationSet_in_prePostClause3752 = new BitSet(new long[]{0x0000000000000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_set_in_prePostClause3764 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_IDENT_in_prePostClause3779 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_prePostClause3784 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_prePostClause3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_annotationSet3815 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_annotation3834 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_annotation3838 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_annotation3844 = new BitSet(new long[]{0x0000001000080400L});
    public static final BitSet FOLLOW_annotationValues_in_annotation3853 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_annotation3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationValue_in_annotationValues3881 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_annotationValues3889 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_annotationValue_in_annotationValues3893 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_annotationValue3912 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotationValue3917 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_NON_OCL_STRING_in_annotationValue3923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_stateMachine3953 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_stateMachine3986 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_stateMachine3999 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_stateDefinition_in_stateMachine4015 = new BitSet(new long[]{0x0000000000080000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_stateMachine4025 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_transitionDefinition_in_stateMachine4041 = new BitSet(new long[]{0x0000000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_stateMachine4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_stateDefinition4067 = new BitSet(new long[]{0x0000000000400082L});
    public static final BitSet FOLLOW_COLON_in_stateDefinition4075 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_stateDefinition4079 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_LBRACK_in_stateDefinition4090 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_stateDefinition4096 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_stateDefinition4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_transitionDefinition4119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ARROW_in_transitionDefinition4121 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_transitionDefinition4125 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_LBRACE_in_transitionDefinition4135 = new BitSet(new long[]{0x0000000000480000L,0x0000000000000800L});
    public static final BitSet FOLLOW_LBRACK_in_transitionDefinition4145 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_transitionDefinition4149 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_transitionDefinition4153 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000800L});
    public static final BitSet FOLLOW_event_in_transitionDefinition4177 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_IDENT_in_transitionDefinition4193 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_transitionDefinition4197 = new BitSet(new long[]{0x0000001002000000L});
    public static final BitSet FOLLOW_paramList_in_transitionDefinition4202 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_transitionDefinition4209 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_LBRACK_in_transitionDefinition4226 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_transitionDefinition4230 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_transitionDefinition4234 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_transitionDefinition4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_event4264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keySignal_in_signalDefinition4284 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_signalDefinition4288 = new BitSet(new long[]{0x0000000000800000L,0x0000000000040210L});
    public static final BitSet FOLLOW_LESS_in_signalDefinition4303 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_signalDefinition4307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040210L});
    public static final BitSet FOLLOW_68_in_signalDefinition4320 = new BitSet(new long[]{0x0000000000080020L,0x0000000000040200L});
    public static final BitSet FOLLOW_attributeDefinition_in_signalDefinition4333 = new BitSet(new long[]{0x0000000000080020L,0x0000000000040200L});
    public static final BitSet FOLLOW_73_in_signalDefinition4354 = new BitSet(new long[]{0x0000000000000020L,0x0000000040240000L});
    public static final BitSet FOLLOW_invariantClause_in_signalDefinition4374 = new BitSet(new long[]{0x0000000000000020L,0x0000000040240000L});
    public static final BitSet FOLLOW_82_in_signalDefinition4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyUnion4416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyAssociation4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyRole4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyComposition4456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyAggregation4468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyClass4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keySignal4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyDerived4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyDerive4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyInit4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyQualifier4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly4578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly4580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_expression4628 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression4639 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression4643 = new BitSet(new long[]{0x0590A00000080000L});
    public static final BitSet FOLLOW_type_in_expression4647 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression4652 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_expression4656 = new BitSet(new long[]{0x0000000000000400L,0x0000000008000000L});
    public static final BitSet FOLLOW_COMMA_in_expression4694 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression4706 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression4710 = new BitSet(new long[]{0x0590A00000080000L});
    public static final BitSet FOLLOW_type_in_expression4714 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression4719 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_expression4723 = new BitSet(new long[]{0x0000000000000400L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_expression4764 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList4813 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList4830 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_paramList4842 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList4846 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_paramList4866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList4895 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_idList4905 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_idList4909 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration4940 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration4942 = new BitSet(new long[]{0x0590A00000080000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration4946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression4982 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_conditionalImpliesExpression4995 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F882400000L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression4999 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression5044 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_conditionalOrExpression5057 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F882400000L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression5061 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression5105 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_conditionalXOrExpression5118 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F882400000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression5122 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression5166 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_conditionalAndExpression5179 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F882400000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression5183 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression5231 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_set_in_equalityExpression5250 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F882400000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression5260 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression5309 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_set_in_relationalExpression5327 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F882400000L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression5345 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression5395 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression5413 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F882400000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression5423 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression5473 = new BitSet(new long[]{0x0000014000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression5491 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F882400000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression5505 = new BitSet(new long[]{0x0000014000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_set_in_unaryExpression5567 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F882400000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression5591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression5611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression5644 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression5662 = new BitSet(new long[]{0x0000000000080000L,0x003003A080000000L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression5668 = new BitSet(new long[]{0x0000000000080000L,0x003003A080000000L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression5679 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_literal_in_primaryExpression5719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression5733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression5745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression5756 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression5760 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression5762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression5774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression5786 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression5788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_primaryExpression5790 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression5813 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_primaryExpression5815 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression5833 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression5835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression5848 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression5850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_primaryExpression5852 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression5856 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression5860 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression5862 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression5882 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_primaryExpression5884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference5910 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_objectReference5918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall5983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall5996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall6009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall6022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inStateExpression_in_propertyCall6035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression6070 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression6077 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression6088 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_queryExpression6092 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_queryExpression6103 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression6109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_iterateExpression6141 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression6147 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression6155 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression6157 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression6165 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression6167 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_iterateExpression6175 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression6181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression6225 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression6247 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_operationExpression6260 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression6273 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_operationExpression6277 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression6289 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression6306 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_operationExpression6321 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression6336 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_operationExpression6340 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression6354 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_operationExpression6379 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_operationExpression6381 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression6406 = new BitSet(new long[]{0x1590A318861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_operationExpression6427 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression6439 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_operationExpression6443 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression6463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_inStateExpression6500 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_inStateExpression6505 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_inStateExpression6514 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_inStateExpression6519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression6555 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression6579 = new BitSet(new long[]{0x0590A00000080000L});
    public static final BitSet FOLLOW_type_in_typeExpression6583 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression6585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration6623 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration6626 = new BitSet(new long[]{0x0590A00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration6630 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration6640 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration6646 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration6649 = new BitSet(new long[]{0x0590A00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration6655 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization6683 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization6685 = new BitSet(new long[]{0x0590A00000080000L});
    public static final BitSet FOLLOW_type_in_variableInitialization6689 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization6691 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_variableInitialization6695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ifExpression6727 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_ifExpression6731 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_ifExpression6733 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_ifExpression6737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ifExpression6739 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_ifExpression6743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ifExpression6745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_literal6784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_literal6798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal6811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal6826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal6840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal6850 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal6854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal6866 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal6868 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal6872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal6884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal6896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal6908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal6920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_literal6932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral6970 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral6999 = new BitSet(new long[]{0x1590A30A861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral7016 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral7029 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral7033 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral7052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem7081 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem7092 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_collectionItem7096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_emptyCollectionLiteral7125 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral7127 = new BitSet(new long[]{0x0190A00000000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral7131 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral7133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral7149 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral7151 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral7153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_undefinedLiteral7183 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral7185 = new BitSet(new long[]{0x0590A00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral7189 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral7191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_undefinedLiteral7205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_undefinedLiteral7219 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral7221 = new BitSet(new long[]{0x0590A00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral7225 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral7227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_undefinedLiteral7241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_tupleLiteral7280 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral7286 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral7294 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral7305 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral7309 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral7320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem7351 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_tupleItem7390 = new BitSet(new long[]{0x0590A00000080000L});
    public static final BitSet FOLLOW_type_in_tupleItem7394 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem7396 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_tupleItem7400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem7422 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_expression_in_tupleItem7432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type7498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type7510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type7522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly7554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly7556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType7584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType7622 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType7649 = new BitSet(new long[]{0x0590A00000080000L});
    public static final BitSet FOLLOW_type_in_collectionType7653 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType7655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_tupleType7689 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType7691 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType7700 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleType7711 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType7715 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType7727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart7759 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_tuplePart7761 = new BitSet(new long[]{0x0590A00000080000L});
    public static final BitSet FOLLOW_type_in_tuplePart7765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOnly7814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statOnly7818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_singleStat_in_stat7853 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_stat7865 = new BitSet(new long[]{0x1590A308861A0020L,0x283007FD92C06040L});
    public static final BitSet FOLLOW_singleStat_in_stat7875 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_emptyStat_in_singleStat7915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat7941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignStat_in_singleStat7953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_singleStat7967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleStat7981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleStat7994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleStat8011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExStat_in_singleStat8028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterStat_in_singleStat8045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_singleStat8067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStat_in_singleStat8085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_emptyStat8112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr8138 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr8152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varAssignStat8190 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat8194 = new BitSet(new long[]{0x1590A308861A0020L,0x083007FD82400000L});
    public static final BitSet FOLLOW_rValue_in_varAssignStat8202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_attAssignStat8226 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attAssignStat8235 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat8239 = new BitSet(new long[]{0x1590A308861A0020L,0x083007FD82400000L});
    public static final BitSet FOLLOW_rValue_in_attAssignStat8247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_objCreateStat8273 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_objCreateStat8281 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat8291 = new BitSet(new long[]{0x1590A318861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat8304 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat8312 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_objCreateStat8330 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat8338 = new BitSet(new long[]{0x1590A308861A0020L,0x083007FD82400000L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat8352 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat8360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_objDestroyStat8396 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat8404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_lnkInsStat8430 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkInsStat8434 = new BitSet(new long[]{0x1590A308861A0020L,0x083007FD82400000L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat8444 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkInsStat8448 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_lnkInsStat8452 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkInsStat8460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8489 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8500 = new BitSet(new long[]{0x1590A308861A0020L,0x083007FD82400000L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8509 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8516 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers8532 = new BitSet(new long[]{0x1590A308861A0020L,0x083007FD82400000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8543 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8554 = new BitSet(new long[]{0x1590A308861A0020L,0x083007FD82400000L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8563 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8570 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers8592 = new BitSet(new long[]{0x1590A308861A0020L,0x083007FD82400000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8607 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8627 = new BitSet(new long[]{0x1590A308861A0020L,0x083007FD82400000L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8638 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8647 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_77_in_lnkDelStat8688 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkDelStat8692 = new BitSet(new long[]{0x1590A308861A0020L,0x083007FD82400000L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat8702 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkDelStat8706 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_lnkDelStat8710 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkDelStat8719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_condExStat8750 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_inSoilExpression_in_condExStat8759 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_condExStat8763 = new BitSet(new long[]{0x1590A308861A0020L,0x283007FD92C07040L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat8772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_81_in_condExStat8783 = new BitSet(new long[]{0x1590A308861A0020L,0x283007FD92C07040L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat8795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_condExStat8807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_iterStat8832 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_iterStat8840 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_iterStat8844 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_inSoilExpression_in_iterStat8852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_iterStat8856 = new BitSet(new long[]{0x1590A308861A0020L,0x283007FD92C07040L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_iterStat8864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_iterStat8869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_whileStat8895 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_inSoilExpression_in_whileStat8903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_whileStat8907 = new BitSet(new long[]{0x1590A308861A0020L,0x283007FD92C07040L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_whileStat8915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_whileStat8920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_blockStat8950 = new BitSet(new long[]{0x1590A308861A0020L,0x283007FD92C07040L});
    public static final BitSet FOLLOW_76_in_blockStat8955 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat8961 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_blockStat8967 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat8973 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_blockStat8980 = new BitSet(new long[]{0x1590A308861A0020L,0x283007FD92C06040L});
    public static final BitSet FOLLOW_stat_in_blockStat8990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_blockStat8995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_implicitBlockStat9021 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat9027 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_implicitBlockStat9033 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat9039 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_implicitBlockStat9046 = new BitSet(new long[]{0x1590A308861A0020L,0x283007FD92C06040L});
    public static final BitSet FOLLOW_stat_in_implicitBlockStat9054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOrImplicitBlock9077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitBlockStat_in_statOrImplicitBlock9087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_rValue9133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_rValue9145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_rValList9168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValListMin1_in_rValList9195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin19228 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin19242 = new BitSet(new long[]{0x1590A308861A0020L,0x083007FD82400000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin19252 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rValue_in_rValListMin29291 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin29299 = new BitSet(new long[]{0x1590A308861A0020L,0x083007FD82400000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin29307 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin29321 = new BitSet(new long[]{0x1590A308861A0020L,0x083007FD82400000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin29331 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_expression_in_inSoilExpression9365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_exprList9394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprListMin1_in_exprList9412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin19445 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin19460 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin19470 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin29510 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin29518 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin29526 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin29540 = new BitSet(new long[]{0x1590A308861A0020L,0x083007F982400000L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin29550 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_nothing_in_identList9580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identListMin1_in_identList9597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identListMin19631 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_identListMin19645 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_identListMin19655 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COLON_in_synpred1_Generator7381 = new BitSet(new long[]{0x0590A00000080000L});
    public static final BitSet FOLLOW_type_in_synpred1_Generator7383 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred1_Generator7385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_synpred2_Generator7933 = new BitSet(new long[]{0x0000000000000002L});

}