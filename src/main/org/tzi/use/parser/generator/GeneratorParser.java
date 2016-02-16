// $ANTLR 3.4 Generator.g 2016-02-16 16:17:30
 
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
public class GeneratorParser extends BaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", "NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", "REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", "WS", "'ASSLCall'", "'Bag'", "'Barrier'", "'Collection'", "'Comment'", "'Hard'", "'OpEnter'", "'OpExit'", "'OrderedSet'", "'Override'", "'Sequence'", "'Set'", "'Soft'", "'Tuple'", "'Type'", "'Undefined'", "'Weight'", "'abstract'", "'allInstances'", "'and'", "'associationClass'", "'associationclass'", "'attributes'", "'begin'", "'between'", "'byUseId'", "'constraints'", "'context'", "'create'", "'declare'", "'default'", "'delete'", "'destroy'", "'div'", "'do'", "'else'", "'end'", "'endif'", "'enum'", "'existential'", "'false'", "'for'", "'from'", "'if'", "'implies'", "'in'", "'insert'", "'into'", "'inv'", "'iterate'", "'let'", "'model'", "'new'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", "'oclInState'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", "'operations'", "'or'", "'ordered'", "'post'", "'pre'", "'procedure'", "'psm'", "'redefines'", "'selectByKind'", "'selectByType'", "'statemachines'", "'states'", "'subsets'", "'then'", "'transitions'", "'true'", "'var'", "'while'", "'xor'"
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
    // Generator.g:80:1: invariantListOnly returns [List<ASTConstraintDefinition> invariantList] : (def= invariant )* EOF ;
    public final List<ASTConstraintDefinition> invariantListOnly() throws RecognitionException {
        List<ASTConstraintDefinition> invariantList = null;


        ASTConstraintDefinition def =null;


         invariantList = new ArrayList<ASTConstraintDefinition>(); 
        try {
            // Generator.g:82:5: ( (def= invariant )* EOF )
            // Generator.g:83:5: (def= invariant )* EOF
            {
            // Generator.g:83:5: (def= invariant )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==AT||LA1_0==71) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Generator.g:83:7: def= invariant
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
    // Generator.g:137:1: procedureListOnly returns [List<ASTGProcedure> procedureList] : (proc= procedure )* EOF ;
    public final List<ASTGProcedure> procedureListOnly() throws RecognitionException {
        List<ASTGProcedure> procedureList = null;


        ASTGProcedure proc =null;


         procedureList = new ArrayList<ASTGProcedure>(); 
        try {
            // Generator.g:139:5: ( (proc= procedure )* EOF )
            // Generator.g:140:5: (proc= procedure )* EOF
            {
            // Generator.g:140:5: (proc= procedure )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==110) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Generator.g:141:7: proc= procedure
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
    // Generator.g:152:1: procedure returns [ASTGProcedure proc] : 'procedure' name= IDENT LPAREN parameterDecls= variableDeclarationList RPAREN ( 'var' localDecls= variableDeclarationList SEMI )? 'begin' instructions= instructionList 'end' SEMI ;
    public final ASTGProcedure procedure() throws RecognitionException {
        ASTGProcedure proc = null;


        Token name=null;
        List parameterDecls =null;

        List localDecls =null;

        List instructions =null;


         localDecls = new ArrayList(); 
        try {
            // Generator.g:154:5: ( 'procedure' name= IDENT LPAREN parameterDecls= variableDeclarationList RPAREN ( 'var' localDecls= variableDeclarationList SEMI )? 'begin' instructions= instructionList 'end' SEMI )
            // Generator.g:155:5: 'procedure' name= IDENT LPAREN parameterDecls= variableDeclarationList RPAREN ( 'var' localDecls= variableDeclarationList SEMI )? 'begin' instructions= instructionList 'end' SEMI
            {
            match(input,110,FOLLOW_110_in_procedure179); if (state.failed) return proc;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedure183); if (state.failed) return proc;

            match(input,LPAREN,FOLLOW_LPAREN_in_procedure185); if (state.failed) return proc;

            pushFollow(FOLLOW_variableDeclarationList_in_procedure189);
            parameterDecls=variableDeclarationList();

            state._fsp--;
            if (state.failed) return proc;

            match(input,RPAREN,FOLLOW_RPAREN_in_procedure191); if (state.failed) return proc;

            // Generator.g:156:5: ( 'var' localDecls= variableDeclarationList SEMI )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==121) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Generator.g:156:7: 'var' localDecls= variableDeclarationList SEMI
                    {
                    match(input,121,FOLLOW_121_in_procedure199); if (state.failed) return proc;

                    pushFollow(FOLLOW_variableDeclarationList_in_procedure203);
                    localDecls=variableDeclarationList();

                    state._fsp--;
                    if (state.failed) return proc;

                    match(input,SEMI,FOLLOW_SEMI_in_procedure205); if (state.failed) return proc;

                    }
                    break;

            }


            match(input,67,FOLLOW_67_in_procedure214); if (state.failed) return proc;

            pushFollow(FOLLOW_instructionList_in_procedure218);
            instructions=instructionList();

            state._fsp--;
            if (state.failed) return proc;

            match(input,80,FOLLOW_80_in_procedure220); if (state.failed) return proc;

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
    // Generator.g:165:1: variableDeclarationList returns [List varDecls] : (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )? ;
    public final List variableDeclarationList() throws RecognitionException {
        List varDecls = null;


        ASTVariableDeclaration decl =null;


         varDecls = new ArrayList(); 
        try {
            // Generator.g:167:5: ( (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )? )
            // Generator.g:168:5: (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )?
            {
            // Generator.g:168:5: (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IDENT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Generator.g:168:7: decl= variableDeclaration ( COMMA decl= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList260);
                    decl=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return varDecls;

                    if ( state.backtracking==0 ) {varDecls.add(decl);}

                    // Generator.g:169:7: ( COMMA decl= variableDeclaration )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==COMMA) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Generator.g:169:8: COMMA decl= variableDeclaration
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
    // Generator.g:177:1: instructionList returns [List instructions] : (instr= instruction SEMI )* ;
    public final List instructionList() throws RecognitionException {
        List instructions = null;


        ASTGInstruction instr =null;


         instructions = new ArrayList(); 
        try {
            // Generator.g:179:5: ( (instr= instruction SEMI )* )
            // Generator.g:180:5: (instr= instruction SEMI )*
            {
            // Generator.g:180:5: (instr= instruction SEMI )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IDENT||LA6_0==LBRACK||LA6_0==44||LA6_0==46||(LA6_0 >= 50 && LA6_0 <= 51)||LA6_0==85||LA6_0==87) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Generator.g:180:7: instr= instruction SEMI
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
    // Generator.g:195:1: instruction returns [ASTGInstruction instr] : (instrVA= variableAssignment |instrAA= attributeAssignment |instrLO= loop |instrAI= atomicInstruction |instrIT= ifThenElse |instrAC= asslCall |instrOE= opEnter |instrOX= opExit |instrBA= barrier );
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
            // Generator.g:196:7: (instrVA= variableAssignment |instrAA= attributeAssignment |instrLO= loop |instrAI= atomicInstruction |instrIT= ifThenElse |instrAC= asslCall |instrOE= opEnter |instrOX= opExit |instrBA= barrier )
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
            case 85:
                {
                alt7=3;
                }
                break;
            case 87:
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
                    // Generator.g:197:7: instrVA= variableAssignment
                    {
                    pushFollow(FOLLOW_variableAssignment_in_instruction356);
                    instrVA=variableAssignment();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrVA;}

                    }
                    break;
                case 2 :
                    // Generator.g:198:7: instrAA= attributeAssignment
                    {
                    pushFollow(FOLLOW_attributeAssignment_in_instruction371);
                    instrAA=attributeAssignment();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrAA;}

                    }
                    break;
                case 3 :
                    // Generator.g:199:7: instrLO= loop
                    {
                    pushFollow(FOLLOW_loop_in_instruction385);
                    instrLO=loop();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrLO;}

                    }
                    break;
                case 4 :
                    // Generator.g:200:7: instrAI= atomicInstruction
                    {
                    pushFollow(FOLLOW_atomicInstruction_in_instruction402);
                    instrAI=atomicInstruction();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrAI;}

                    }
                    break;
                case 5 :
                    // Generator.g:201:7: instrIT= ifThenElse
                    {
                    pushFollow(FOLLOW_ifThenElse_in_instruction416);
                    instrIT=ifThenElse();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrIT;}

                    }
                    break;
                case 6 :
                    // Generator.g:202:7: instrAC= asslCall
                    {
                    pushFollow(FOLLOW_asslCall_in_instruction432);
                    instrAC=asslCall();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrAC;}

                    }
                    break;
                case 7 :
                    // Generator.g:203:7: instrOE= opEnter
                    {
                    pushFollow(FOLLOW_opEnter_in_instruction448);
                    instrOE=opEnter();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrOE;}

                    }
                    break;
                case 8 :
                    // Generator.g:204:7: instrOX= opExit
                    {
                    pushFollow(FOLLOW_opExit_in_instruction465);
                    instrOX=opExit();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrOX;}

                    }
                    break;
                case 9 :
                    // Generator.g:205:7: instrBA= barrier
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
    // Generator.g:212:1: variableAssignment returns [ASTGVariableAssignment assignment] : target= IDENT COLON_EQUAL source= valueInstruction ;
    public final ASTGVariableAssignment variableAssignment() throws RecognitionException {
        ASTGVariableAssignment assignment = null;


        Token target=null;
        ASTGValueInstruction source =null;


        try {
            // Generator.g:213:5: (target= IDENT COLON_EQUAL source= valueInstruction )
            // Generator.g:214:5: target= IDENT COLON_EQUAL source= valueInstruction
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
    // Generator.g:222:1: attributeAssignment returns [ASTGAttributeAssignment assignment] : targetObject= oclExpression DOT attributeName= IDENT COLON_EQUAL source= valueInstruction ;
    public final ASTGAttributeAssignment attributeAssignment() throws RecognitionException {
        ASTGAttributeAssignment assignment = null;


        Token attributeName=null;
        ASTGocl targetObject =null;

        ASTGValueInstruction source =null;


        try {
            // Generator.g:223:5: (targetObject= oclExpression DOT attributeName= IDENT COLON_EQUAL source= valueInstruction )
            // Generator.g:224:5: targetObject= oclExpression DOT attributeName= IDENT COLON_EQUAL source= valueInstruction
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
    // Generator.g:234:1: loop returns [ASTGLoop loop] : t= 'for' decl= variableDeclaration 'in' sequence= oclExpression 'begin' instructions= instructionList 'end' ;
    public final ASTGLoop loop() throws RecognitionException {
        ASTGLoop loop = null;


        Token t=null;
        ASTVariableDeclaration decl =null;

        ASTGocl sequence =null;

        List instructions =null;


        try {
            // Generator.g:235:5: (t= 'for' decl= variableDeclaration 'in' sequence= oclExpression 'begin' instructions= instructionList 'end' )
            // Generator.g:236:5: t= 'for' decl= variableDeclaration 'in' sequence= oclExpression 'begin' instructions= instructionList 'end'
            {
            t=(Token)match(input,85,FOLLOW_85_in_loop601); if (state.failed) return loop;

            pushFollow(FOLLOW_variableDeclaration_in_loop605);
            decl=variableDeclaration();

            state._fsp--;
            if (state.failed) return loop;

            match(input,89,FOLLOW_89_in_loop607); if (state.failed) return loop;

            pushFollow(FOLLOW_oclExpression_in_loop611);
            sequence=oclExpression();

            state._fsp--;
            if (state.failed) return loop;

            match(input,67,FOLLOW_67_in_loop613); if (state.failed) return loop;

            pushFollow(FOLLOW_instructionList_in_loop624);
            instructions=instructionList();

            state._fsp--;
            if (state.failed) return loop;

            match(input,80,FOLLOW_80_in_loop626); if (state.failed) return loop;

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
    // Generator.g:247:1: ifThenElse returns [ASTGIfThenElse ifThenElse] : token= 'if' sequence= oclExpression 'then' 'begin' thenInstructions= instructionList 'end' ( 'else' 'begin' elseInstructions= instructionList 'end' )? ;
    public final ASTGIfThenElse ifThenElse() throws RecognitionException {
        ASTGIfThenElse ifThenElse = null;


        Token token=null;
        ASTGocl sequence =null;

        List thenInstructions =null;

        List elseInstructions =null;


         List elseInstructionsList = new ArrayList(); 
        try {
            // Generator.g:249:5: (token= 'if' sequence= oclExpression 'then' 'begin' thenInstructions= instructionList 'end' ( 'else' 'begin' elseInstructions= instructionList 'end' )? )
            // Generator.g:250:5: token= 'if' sequence= oclExpression 'then' 'begin' thenInstructions= instructionList 'end' ( 'else' 'begin' elseInstructions= instructionList 'end' )?
            {
            token=(Token)match(input,87,FOLLOW_87_in_ifThenElse662); if (state.failed) return ifThenElse;

            pushFollow(FOLLOW_oclExpression_in_ifThenElse666);
            sequence=oclExpression();

            state._fsp--;
            if (state.failed) return ifThenElse;

            match(input,118,FOLLOW_118_in_ifThenElse677); if (state.failed) return ifThenElse;

            match(input,67,FOLLOW_67_in_ifThenElse679); if (state.failed) return ifThenElse;

            pushFollow(FOLLOW_instructionList_in_ifThenElse683);
            thenInstructions=instructionList();

            state._fsp--;
            if (state.failed) return ifThenElse;

            match(input,80,FOLLOW_80_in_ifThenElse685); if (state.failed) return ifThenElse;

            // Generator.g:252:9: ( 'else' 'begin' elseInstructions= instructionList 'end' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==79) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Generator.g:252:10: 'else' 'begin' elseInstructions= instructionList 'end'
                    {
                    match(input,79,FOLLOW_79_in_ifThenElse696); if (state.failed) return ifThenElse;

                    match(input,67,FOLLOW_67_in_ifThenElse698); if (state.failed) return ifThenElse;

                    pushFollow(FOLLOW_instructionList_in_ifThenElse702);
                    elseInstructions=instructionList();

                    state._fsp--;
                    if (state.failed) return ifThenElse;

                    match(input,80,FOLLOW_80_in_ifThenElse704); if (state.failed) return ifThenElse;

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
    // Generator.g:261:1: valueInstruction returns [ASTGValueInstruction valueinstr] : (atmoicInstr= atomicInstruction |oclExpr= oclExpression );
    public final ASTGValueInstruction valueInstruction() throws RecognitionException {
        ASTGValueInstruction valueinstr = null;


        ASTGAtomicInstruction atmoicInstr =null;

        ASTGocl oclExpr =null;


        try {
            // Generator.g:262:7: (atmoicInstr= atomicInstruction |oclExpr= oclExpression )
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
                    // Generator.g:263:7: atmoicInstr= atomicInstruction
                    {
                    pushFollow(FOLLOW_atomicInstruction_in_valueInstruction744);
                    atmoicInstr=atomicInstruction();

                    state._fsp--;
                    if (state.failed) return valueinstr;

                    if ( state.backtracking==0 ) {valueinstr = atmoicInstr; }

                    }
                    break;
                case 2 :
                    // Generator.g:264:7: oclExpr= oclExpression
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
    // Generator.g:272:1: atomicInstruction returns [ASTGAtomicInstruction instr] : name= IDENT LPAREN (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )? RPAREN ;
    public final ASTGAtomicInstruction atomicInstruction() throws RecognitionException {
        ASTGAtomicInstruction instr = null;


        Token name=null;
        Object parameter =null;


        try {
            // Generator.g:273:5: (name= IDENT LPAREN (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )? RPAREN )
            // Generator.g:274:5: name= IDENT LPAREN (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )? RPAREN
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_atomicInstruction788); if (state.failed) return instr;

            if ( state.backtracking==0 ) { instr = new ASTGAtomicInstruction(name); }

            match(input,LPAREN,FOLLOW_LPAREN_in_atomicInstruction792); if (state.failed) return instr;

            // Generator.g:275:9: (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IDENT||LA11_0==LBRACK) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Generator.g:275:11: parameter= instructionParameter ( COMMA parameter= instructionParameter )*
                    {
                    pushFollow(FOLLOW_instructionParameter_in_atomicInstruction806);
                    parameter=instructionParameter();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) { instr.addParameter(parameter); }

                    // Generator.g:276:13: ( COMMA parameter= instructionParameter )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==COMMA) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // Generator.g:276:15: COMMA parameter= instructionParameter
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
    // Generator.g:287:1: asslCall returns [ASTGAsslCall instr] : 'ASSLCall' name= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN ;
    public final ASTGAsslCall asslCall() throws RecognitionException {
        ASTGAsslCall instr = null;


        Token name=null;
        ASTGocl parameter =null;


        try {
            // Generator.g:288:5: ( 'ASSLCall' name= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN )
            // Generator.g:289:5: 'ASSLCall' name= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN
            {
            match(input,44,FOLLOW_44_in_asslCall899); if (state.failed) return instr;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_asslCall903); if (state.failed) return instr;

            if ( state.backtracking==0 ) { instr = new ASTGAsslCall(name); }

            match(input,LPAREN,FOLLOW_LPAREN_in_asslCall907); if (state.failed) return instr;

            // Generator.g:290:9: (parameter= oclExpression ( COMMA parameter= oclExpression )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LBRACK) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Generator.g:290:11: parameter= oclExpression ( COMMA parameter= oclExpression )*
                    {
                    pushFollow(FOLLOW_oclExpression_in_asslCall921);
                    parameter=oclExpression();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) { instr.addParameter(parameter); }

                    // Generator.g:291:13: ( COMMA parameter= oclExpression )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // Generator.g:291:15: COMMA parameter= oclExpression
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
    // Generator.g:302:1: opEnter returns [ASTGOpEnter instr] : 'OpEnter' oid= oclExpression opname= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN ;
    public final ASTGOpEnter opEnter() throws RecognitionException {
        ASTGOpEnter instr = null;


        Token opname=null;
        ASTGocl oid =null;

        ASTGocl parameter =null;


        try {
            // Generator.g:303:5: ( 'OpEnter' oid= oclExpression opname= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN )
            // Generator.g:304:5: 'OpEnter' oid= oclExpression opname= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN
            {
            match(input,50,FOLLOW_50_in_opEnter1014); if (state.failed) return instr;

            pushFollow(FOLLOW_oclExpression_in_opEnter1018);
            oid=oclExpression();

            state._fsp--;
            if (state.failed) return instr;

            opname=(Token)match(input,IDENT,FOLLOW_IDENT_in_opEnter1022); if (state.failed) return instr;

            if ( state.backtracking==0 ) { instr = new ASTGOpEnter(oid, opname); }

            match(input,LPAREN,FOLLOW_LPAREN_in_opEnter1026); if (state.failed) return instr;

            // Generator.g:305:9: (parameter= oclExpression ( COMMA parameter= oclExpression )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LBRACK) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Generator.g:305:11: parameter= oclExpression ( COMMA parameter= oclExpression )*
                    {
                    pushFollow(FOLLOW_oclExpression_in_opEnter1041);
                    parameter=oclExpression();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) { instr.addParameter(parameter); }

                    // Generator.g:306:13: ( COMMA parameter= oclExpression )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // Generator.g:306:15: COMMA parameter= oclExpression
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
    // Generator.g:316:1: opExit returns [ASTGOpExit instr] : 'OpExit' ;
    public final ASTGOpExit opExit() throws RecognitionException {
        ASTGOpExit instr = null;


        try {
            // Generator.g:317:5: ( 'OpExit' )
            // Generator.g:318:5: 'OpExit'
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
    // Generator.g:324:1: instructionParameter returns [Object parameter] : (parameterOcl= oclExpression |parameterIdent= instrParameterIdent );
    public final Object instructionParameter() throws RecognitionException {
        Object parameter = null;


        ASTGocl parameterOcl =null;

        Token parameterIdent =null;


        try {
            // Generator.g:325:7: (parameterOcl= oclExpression |parameterIdent= instrParameterIdent )
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
                    // Generator.g:326:7: parameterOcl= oclExpression
                    {
                    pushFollow(FOLLOW_oclExpression_in_instructionParameter1163);
                    parameterOcl=oclExpression();

                    state._fsp--;
                    if (state.failed) return parameter;

                    if ( state.backtracking==0 ) {parameter = parameterOcl; }

                    }
                    break;
                case 2 :
                    // Generator.g:327:7: parameterIdent= instrParameterIdent
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
    // Generator.g:334:1: instrParameterIdent returns [Token t] : i= IDENT ;
    public final Token instrParameterIdent() throws RecognitionException {
        Token t = null;


        Token i=null;

        try {
            // Generator.g:335:5: (i= IDENT )
            // Generator.g:336:5: i= IDENT
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
    // Generator.g:343:1: oclExpression returns [ASTGocl encapOcl] : i= LBRACK ocl= expression RBRACK ;
    public final ASTGocl oclExpression() throws RecognitionException {
        ASTGocl encapOcl = null;


        Token i=null;
        GeneratorParser.expression_return ocl =null;


        try {
            // Generator.g:344:5: (i= LBRACK ocl= expression RBRACK )
            // Generator.g:345:5: i= LBRACK ocl= expression RBRACK
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
    // Generator.g:352:1: barrier returns [ASTGBarrier barrier] : 'Barrier' LPAREN (invClass= IDENT COLON_COLON invName= IDENT |exp= oclExpression ) RPAREN ;
    public final ASTGBarrier barrier() throws RecognitionException {
        ASTGBarrier barrier = null;


        Token invClass=null;
        Token invName=null;
        ASTGocl exp =null;


        try {
            // Generator.g:353:4: ( 'Barrier' LPAREN (invClass= IDENT COLON_COLON invName= IDENT |exp= oclExpression ) RPAREN )
            // Generator.g:354:4: 'Barrier' LPAREN (invClass= IDENT COLON_COLON invName= IDENT |exp= oclExpression ) RPAREN
            {
            match(input,46,FOLLOW_46_in_barrier1265); if (state.failed) return barrier;

            match(input,LPAREN,FOLLOW_LPAREN_in_barrier1270); if (state.failed) return barrier;

            // Generator.g:355:11: (invClass= IDENT COLON_COLON invName= IDENT |exp= oclExpression )
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
                    // Generator.g:356:8: invClass= IDENT COLON_COLON invName= IDENT
                    {
                    invClass=(Token)match(input,IDENT,FOLLOW_IDENT_in_barrier1285); if (state.failed) return barrier;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_barrier1287); if (state.failed) return barrier;

                    invName=(Token)match(input,IDENT,FOLLOW_IDENT_in_barrier1293); if (state.failed) return barrier;

                    if ( state.backtracking==0 ) { barrier = new ASTGBarrierInvariant(invClass, invName); }

                    }
                    break;
                case 2 :
                    // Generator.g:357:8: exp= oclExpression
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
    // Generator.g:370:1: procedureCallOnly returns [ASTGProcedureCall call] : name= IDENT LPAREN (ocl= expression ( COMMA ocl= expression )* )? RPAREN EOF ;
    public final ASTGProcedureCall procedureCallOnly() throws RecognitionException {
        ASTGProcedureCall call = null;


        Token name=null;
        GeneratorParser.expression_return ocl =null;


        try {
            // Generator.g:371:5: (name= IDENT LPAREN (ocl= expression ( COMMA ocl= expression )* )? RPAREN EOF )
            // Generator.g:372:5: name= IDENT LPAREN (ocl= expression ( COMMA ocl= expression )* )? RPAREN EOF
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureCallOnly1345); if (state.failed) return call;

            if ( state.backtracking==0 ) {call = new ASTGProcedureCall(name);}

            match(input,LPAREN,FOLLOW_LPAREN_in_procedureCallOnly1353); if (state.failed) return call;

            // Generator.g:373:12: (ocl= expression ( COMMA ocl= expression )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==AT||LA19_0==HASH||(LA19_0 >= IDENT && LA19_0 <= INT)||(LA19_0 >= LPAREN && LA19_0 <= MINUS)||LA19_0==PLUS||LA19_0==REAL||(LA19_0 >= STAR && LA19_0 <= STRING)||LA19_0==45||LA19_0==47||LA19_0==52||(LA19_0 >= 54 && LA19_0 <= 55)||LA19_0==57||LA19_0==59||LA19_0==84||LA19_0==87||(LA19_0 >= 93 && LA19_0 <= 94)||(LA19_0 >= 97 && LA19_0 <= 104)||(LA19_0 >= 113 && LA19_0 <= 114)||LA19_0==120) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Generator.g:374:5: ocl= expression ( COMMA ocl= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_procedureCallOnly1364);
                    ocl=expression();

                    state._fsp--;
                    if (state.failed) return call;

                    if ( state.backtracking==0 ) {call.addParameter((ocl!=null?ocl.n:null));}

                    // Generator.g:375:5: ( COMMA ocl= expression )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==COMMA) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // Generator.g:375:7: COMMA ocl= expression
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
    // Generator.g:397:1: model returns [ASTModel n] : as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )* EOF ;
    public final ASTModel model() throws RecognitionException {
        ASTModel n = null;


        Token modelName=null;
        Set<ASTAnnotation> as =null;

        ASTAssociation a =null;

        ASTConstraintDefinition cons =null;

        ASTPrePost ppc =null;

        ASTEnumTypeDefinition e =null;


        try {
            // Generator.g:398:2: (as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )* EOF )
            // Generator.g:399:2: as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )* EOF
            {
            pushFollow(FOLLOW_annotationSet_in_model1427);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            match(input,95,FOLLOW_95_in_model1433); if (state.failed) return n;

            modelName=(Token)match(input,IDENT,FOLLOW_IDENT_in_model1437); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTModel(modelName); n.setAnnotations(as); }

            // Generator.g:401:5: ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )*
            loop21:
            do {
                int alt21=5;
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
            	    match(input,70,FOLLOW_70_in_model1476); if (state.failed) return n;

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

            	default :
            	    break loop21;
                }
            } while (true);


            match(input,EOF,FOLLOW_EOF_in_model1570); if (state.failed) return n;

            }

        }
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
    // Generator.g:417:1: enumTypeDefinition returns [ASTEnumTypeDefinition n] : as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )? ;
    public final ASTEnumTypeDefinition enumTypeDefinition() throws RecognitionException {
        ASTEnumTypeDefinition n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        List idListRes =null;


        try {
            // Generator.g:418:2: (as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )? )
            // Generator.g:419:2: as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_enumTypeDefinition1598);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            match(input,82,FOLLOW_82_in_enumTypeDefinition1604); if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumTypeDefinition1608); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_enumTypeDefinition1610); if (state.failed) return n;

            pushFollow(FOLLOW_idList_in_enumTypeDefinition1614);
            idListRes=idList();

            state._fsp--;
            if (state.failed) return n;

            match(input,RBRACE,FOLLOW_RBRACE_in_enumTypeDefinition1616); if (state.failed) return n;

            // Generator.g:420:54: ( SEMI )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==SEMI) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // Generator.g:420:56: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_enumTypeDefinition1620); if (state.failed) return n;

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
    // Generator.g:429:1: generalClassifierDefinition[ASTModel n] : as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] ) ;
    public final void generalClassifierDefinition(ASTModel n) throws RecognitionException {
        Set<ASTAnnotation> as =null;

        ASTClass c =null;

        ASTAssociationClass ac =null;

        ASTSignal s =null;


         
          boolean isAbstract = false;

        try {
            // Generator.g:433:2: (as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] ) )
            // Generator.g:434:2: as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] )
            {
            pushFollow(FOLLOW_annotationSet_in_generalClassifierDefinition1658);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return ;

            // Generator.g:435:5: ( 'abstract' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==61) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Generator.g:435:7: 'abstract'
                    {
                    match(input,61,FOLLOW_61_in_generalClassifierDefinition1666); if (state.failed) return ;

                    if ( state.backtracking==0 ) { isAbstract = true; }

                    }
                    break;

            }


            // Generator.g:436:5: (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] )
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
            case 64:
            case 65:
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
                    // Generator.g:437:9: c= classDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_classDefinition_in_generalClassifierDefinition1694);
                    c=classDefinition(isAbstract);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { n.addClass(c); c.setAnnotations(as); }

                    }
                    break;
                case 2 :
                    // Generator.g:440:9: ac= associationClassDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_associationClassDefinition_in_generalClassifierDefinition1732);
                    ac=associationClassDefinition(isAbstract);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { n.addAssociationClass(ac); ac.setAnnotations(as); }

                    }
                    break;
                case 3 :
                    // Generator.g:443:9: s= signalDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_signalDefinition_in_generalClassifierDefinition1777);
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
    // Generator.g:464:1: classDefinition[boolean isAbstract] returns [ASTClass n] : (tag= block_annotation |tag= line_annotation[tag] )? keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end' ;
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
            // Generator.g:466:2: ( (tag= block_annotation |tag= line_annotation[tag] )? keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end' )
            // Generator.g:467:2: (tag= block_annotation |tag= line_annotation[tag] )? keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end'
            {
            // Generator.g:467:2: (tag= block_annotation |tag= line_annotation[tag] )?
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==AT) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==IDENT) ) {
                    alt25=1;
                }
                else if ( (LA25_1==48||LA25_1==58||LA25_1==60) ) {
                    alt25=2;
                }
            }
            switch (alt25) {
                case 1 :
                    // Generator.g:467:3: tag= block_annotation
                    {
                    pushFollow(FOLLOW_block_annotation_in_classDefinition1831);
                    tag=block_annotation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 2 :
                    // Generator.g:467:26: tag= line_annotation[tag]
                    {
                    pushFollow(FOLLOW_line_annotation_in_classDefinition1837);
                    tag=line_annotation(tag);

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_keyClass_in_classDefinition1847);
            keyClass();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_classDefinition1851); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTClass(name, isAbstract); n.setAnnotationTag(tag);}

            // Generator.g:469:5: ( LESS idListRes= idList )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==LESS) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // Generator.g:469:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_classDefinition1861); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_classDefinition1865);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addSuperClasses(idListRes); }

                    }
                    break;

            }


            // Generator.g:470:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==66) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // Generator.g:470:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,66,FOLLOW_66_in_classDefinition1878); if (state.failed) return n;

                    // Generator.g:471:7: (a= attributeDefinition )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==AT||LA27_0==IDENT||LA27_0==61||(LA27_0 >= 64 && LA27_0 <= 65)||LA27_0==82||LA27_0==92||LA27_0==95||(LA27_0 >= 108 && LA27_0 <= 109)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // Generator.g:471:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_classDefinition1891);
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


            // Generator.g:473:5: ( 'operations' (op= operationDefinition )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==105) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // Generator.g:473:7: 'operations' (op= operationDefinition )*
                    {
                    match(input,105,FOLLOW_105_in_classDefinition1912); if (state.failed) return n;

                    // Generator.g:474:7: (op= operationDefinition )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==AT||LA29_0==IDENT||LA29_0==61||(LA29_0 >= 64 && LA29_0 <= 65)||LA29_0==82||LA29_0==92||LA29_0==95||(LA29_0 >= 108 && LA29_0 <= 109)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // Generator.g:474:9: op= operationDefinition
                    	    {
                    	    pushFollow(FOLLOW_operationDefinition_in_classDefinition1925);
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


            // Generator.g:476:5: ( 'constraints' (inv= invariantClause )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==70) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // Generator.g:476:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,70,FOLLOW_70_in_classDefinition1946); if (state.failed) return n;

                    // Generator.g:477:7: (inv= invariantClause )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==AT||LA31_0==IDENT||LA31_0==61||(LA31_0 >= 64 && LA31_0 <= 65)||(LA31_0 >= 82 && LA31_0 <= 83)||LA31_0==92||LA31_0==95||(LA31_0 >= 108 && LA31_0 <= 109)) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // Generator.g:478:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_classDefinition1966);
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


            // Generator.g:481:5: ( 'statemachines' (sm= stateMachine )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==115) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // Generator.g:481:7: 'statemachines' (sm= stateMachine )*
                    {
                    match(input,115,FOLLOW_115_in_classDefinition1992); if (state.failed) return n;

                    // Generator.g:482:7: (sm= stateMachine )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==111) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // Generator.g:483:9: sm= stateMachine
                    	    {
                    	    pushFollow(FOLLOW_stateMachine_in_classDefinition2012);
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


            match(input,80,FOLLOW_80_in_classDefinition2036); if (state.failed) return n;

            }

        }
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
    // Generator.g:504:1: associationClassDefinition[boolean isAbstract] returns [ASTAssociationClass n] : classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end' ;
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
            // Generator.g:506:5: (classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end' )
            // Generator.g:507:5: classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end'
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

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationClassDefinition2095); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociationClass(name, isAbstract); }

            // Generator.g:516:5: ( LESS idListRes= idList )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==LESS) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // Generator.g:516:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_associationClassDefinition2105); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_associationClassDefinition2109);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addSuperClasses(idListRes); }

                    }
                    break;

            }


            // Generator.g:517:5: ( 'between' ae= associationEnd (ae= associationEnd )+ )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==68) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // Generator.g:517:6: 'between' ae= associationEnd (ae= associationEnd )+
                    {
                    match(input,68,FOLLOW_68_in_associationClassDefinition2121); if (state.failed) return n;

                    pushFollow(FOLLOW_associationEnd_in_associationClassDefinition2129);
                    ae=associationEnd();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addEnd(ae); }

                    // Generator.g:519:5: (ae= associationEnd )+
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
                    	    // Generator.g:519:7: ae= associationEnd
                    	    {
                    	    pushFollow(FOLLOW_associationEnd_in_associationClassDefinition2141);
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


            // Generator.g:521:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==66) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // Generator.g:521:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,66,FOLLOW_66_in_associationClassDefinition2161); if (state.failed) return n;

                    // Generator.g:522:7: (a= attributeDefinition )*
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
                    	    // Generator.g:522:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_associationClassDefinition2174);
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


            // Generator.g:524:5: ( 'operations' (op= operationDefinition )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==105) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // Generator.g:524:7: 'operations' (op= operationDefinition )*
                    {
                    match(input,105,FOLLOW_105_in_associationClassDefinition2195); if (state.failed) return n;

                    // Generator.g:525:7: (op= operationDefinition )*
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
                    	    // Generator.g:525:9: op= operationDefinition
                    	    {
                    	    pushFollow(FOLLOW_operationDefinition_in_associationClassDefinition2208);
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


            // Generator.g:527:5: ( 'constraints' (inv= invariantClause )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==70) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // Generator.g:527:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,70,FOLLOW_70_in_associationClassDefinition2229); if (state.failed) return n;

                    // Generator.g:528:7: (inv= invariantClause )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==AT||LA42_0==83||LA42_0==92) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // Generator.g:529:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_associationClassDefinition2249);
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


            // Generator.g:532:5: ( 'statemachines' (sm= stateMachine )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==115) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // Generator.g:532:7: 'statemachines' (sm= stateMachine )*
                    {
                    match(input,115,FOLLOW_115_in_associationClassDefinition2275); if (state.failed) return n;

                    // Generator.g:533:7: (sm= stateMachine )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==111) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // Generator.g:534:9: sm= stateMachine
                    	    {
                    	    pushFollow(FOLLOW_stateMachine_in_associationClassDefinition2295);
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


            // Generator.g:538:5: ( ( keyAggregation | keyComposition ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==IDENT) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // Generator.g:538:7: ( keyAggregation | keyComposition )
                    {
                    if ( state.backtracking==0 ) { t = input.LT(1); }

                    // Generator.g:539:7: ( keyAggregation | keyComposition )
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
                            // Generator.g:539:9: keyAggregation
                            {
                            pushFollow(FOLLOW_keyAggregation_in_associationClassDefinition2336);
                            keyAggregation();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;
                        case 2 :
                            // Generator.g:539:26: keyComposition
                            {
                            pushFollow(FOLLOW_keyComposition_in_associationClassDefinition2340);
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


            match(input,80,FOLLOW_80_in_associationClassDefinition2363); if (state.failed) return n;

            }

        }
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
    // Generator.g:549:1: attributeDefinition returns [ASTAttribute n] : as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )? ;
    public final ASTAttribute attributeDefinition() throws RecognitionException {
        ASTAttribute n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        ASTType t =null;

        GeneratorParser.expression_return deriveExpression =null;

        GeneratorParser.expression_return initExpression =null;


        try {
            // Generator.g:550:2: (as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )? )
            // Generator.g:551:2: as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_attributeDefinition2391);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_attributeDefinition2399); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_attributeDefinition2401); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_attributeDefinition2405);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            // Generator.g:554:5: ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )?
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==IDENT) ) {
                int LA49_1 = input.LA(2);

                if ( (((input.LT(1).getText().equals("derive"))||(input.LT(1).getText().equals("derived")))) ) {
                    alt49=1;
                }
                else if ( ((input.LT(1).getText().equals("init"))) ) {
                    alt49=2;
                }
            }
            switch (alt49) {
                case 1 :
                    // Generator.g:555:9: ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression )
                    {
                    // Generator.g:555:9: ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression )
                    // Generator.g:555:10: ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression
                    {
                    // Generator.g:555:10: ( keyDerive | keyDerived )
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
                            // Generator.g:555:11: keyDerive
                            {
                            pushFollow(FOLLOW_keyDerive_in_attributeDefinition2429);
                            keyDerive();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;
                        case 2 :
                            // Generator.g:555:21: keyDerived
                            {
                            pushFollow(FOLLOW_keyDerived_in_attributeDefinition2431);
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


                    pushFollow(FOLLOW_expression_in_attributeDefinition2444);
                    deriveExpression=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    }


                    }
                    break;
                case 2 :
                    // Generator.g:557:9: ( keyInit ( COLON | EQUAL ) initExpression= expression )
                    {
                    // Generator.g:557:9: ( keyInit ( COLON | EQUAL ) initExpression= expression )
                    // Generator.g:557:10: keyInit ( COLON | EQUAL ) initExpression= expression
                    {
                    pushFollow(FOLLOW_keyInit_in_attributeDefinition2464);
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


                    pushFollow(FOLLOW_expression_in_attributeDefinition2480);
                    initExpression=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    }


                    }
                    break;

            }


            // Generator.g:559:5: ( SEMI )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==SEMI) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // Generator.g:559:5: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_attributeDefinition2494); if (state.failed) return n;

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
    // Generator.g:573:1: operationDefinition returns [ASTOperation n] : as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )? ;
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
            // Generator.g:574:2: (as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )? )
            // Generator.g:575:2: as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_operationDefinition2525);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationDefinition2535); if (state.failed) return n;

            pushFollow(FOLLOW_paramList_in_operationDefinition2545);
            pl=paramList();

            state._fsp--;
            if (state.failed) return n;

            // Generator.g:581:5: ( COLON t= type )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==COLON) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // Generator.g:581:7: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_operationDefinition2559); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_operationDefinition2565);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n = new ASTOperation(name, pl, t); n.setAnnotations(as); }

            // Generator.g:583:5: ( ( EQUAL e= expression ) | (s= blockStat ) )?
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==EQUAL) ) {
                alt52=1;
            }
            else if ( (LA52_0==67) ) {
                alt52=2;
            }
            switch (alt52) {
                case 1 :
                    // Generator.g:584:9: ( EQUAL e= expression )
                    {
                    // Generator.g:584:9: ( EQUAL e= expression )
                    // Generator.g:584:11: EQUAL e= expression
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_operationDefinition2593); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_operationDefinition2599);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setExpression((e!=null?e.n:null)); }

                    }


                    }
                    break;
                case 2 :
                    // Generator.g:585:9: (s= blockStat )
                    {
                    // Generator.g:585:9: (s= blockStat )
                    // Generator.g:585:11: s= blockStat
                    {
                    pushFollow(FOLLOW_blockStat_in_operationDefinition2621);
                    s=blockStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setStatement((s!=null?s.n:null));  }

                    }


                    }
                    break;

            }


            // Generator.g:587:5: (ppc= prePostClause )*
            loop53:
            do {
                int alt53=2;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // Generator.g:587:7: ppc= prePostClause
            	    {
            	    pushFollow(FOLLOW_prePostClause_in_operationDefinition2643);
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


            // Generator.g:588:5: ( SEMI )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==SEMI) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // Generator.g:588:7: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_operationDefinition2656); if (state.failed) return n;

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
    // Generator.g:598:1: associationDefinition returns [ASTAssociation n] : as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' ;
    public final ASTAssociation associationDefinition() throws RecognitionException {
        ASTAssociation n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        ASTAssociationEnd ae =null;


         Token t = null; 
        try {
            // Generator.g:600:2: (as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' )
            // Generator.g:601:2: as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end'
            {
            pushFollow(FOLLOW_annotationSet_in_associationDefinition2687);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { t = input.LT(1); }

            // Generator.g:603:5: ( keyAssociation | keyAggregation | keyComposition )
            int alt55=3;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==IDENT) ) {
                int LA55_1 = input.LA(2);

                if ( ((input.LT(1).getText().equals("association"))) ) {
                    alt55=1;
                }
                else if ( ((input.LT(1).getText().equals("aggregation"))) ) {
                    alt55=2;
                }
                else if ( ((input.LT(1).getText().equals("composition"))) ) {
                    alt55=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;

            }
            switch (alt55) {
                case 1 :
                    // Generator.g:603:7: keyAssociation
                    {
                    pushFollow(FOLLOW_keyAssociation_in_associationDefinition2701);
                    keyAssociation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 2 :
                    // Generator.g:603:24: keyAggregation
                    {
                    pushFollow(FOLLOW_keyAggregation_in_associationDefinition2705);
                    keyAggregation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 3 :
                    // Generator.g:603:41: keyComposition
                    {
                    pushFollow(FOLLOW_keyComposition_in_associationDefinition2709);
                    keyComposition();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationDefinition2719); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociation(t, name); n.setAnnotations(as); }

            match(input,68,FOLLOW_68_in_associationDefinition2727); if (state.failed) return n;

            pushFollow(FOLLOW_associationEnd_in_associationDefinition2735);
            ae=associationEnd();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addEnd(ae); }

            // Generator.g:607:5: (ae= associationEnd )+
            int cnt56=0;
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==AT||LA56_0==IDENT||LA56_0==61||(LA56_0 >= 64 && LA56_0 <= 65)||LA56_0==82||LA56_0==92||LA56_0==95||(LA56_0 >= 108 && LA56_0 <= 109)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // Generator.g:607:7: ae= associationEnd
            	    {
            	    pushFollow(FOLLOW_associationEnd_in_associationDefinition2747);
            	    ae=associationEnd();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addEnd(ae); }

            	    }
            	    break;

            	default :
            	    if ( cnt56 >= 1 ) break loop56;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(56, input);
                        throw eee;
                }
                cnt56++;
            } while (true);


            match(input,80,FOLLOW_80_in_associationDefinition2758); if (state.failed) return n;

            }

        }
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
    // Generator.g:616:1: associationEnd returns [ASTAssociationEnd n] : as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? ;
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
            // Generator.g:617:2: (as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? )
            // Generator.g:618:2: as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_associationEnd2783);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd2791); if (state.failed) return n;

            match(input,LBRACK,FOLLOW_LBRACK_in_associationEnd2793); if (state.failed) return n;

            pushFollow(FOLLOW_multiplicity_in_associationEnd2797);
            m=multiplicity();

            state._fsp--;
            if (state.failed) return n;

            match(input,RBRACK,FOLLOW_RBRACK_in_associationEnd2799); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociationEnd(name, m); n.setAnnotations(as); }

            // Generator.g:620:5: ( keyRole rn= IDENT )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==IDENT) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==IDENT) ) {
                    int LA57_3 = input.LA(3);

                    if ( ((input.LT(1).getText().equals("role"))) ) {
                        alt57=1;
                    }
                }
            }
            switch (alt57) {
                case 1 :
                    // Generator.g:620:7: keyRole rn= IDENT
                    {
                    pushFollow(FOLLOW_keyRole_in_associationEnd2810);
                    keyRole();

                    state._fsp--;
                    if (state.failed) return n;

                    rn=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd2814); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setRolename(rn); }

                    }
                    break;

            }


            // Generator.g:621:5: ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )*
            loop60:
            do {
                int alt60=7;
                switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA60_3 = input.LA(2);

                    if ( ((input.LT(1).getText().equals("union"))) ) {
                        alt60=3;
                    }
                    else if ( (((input.LT(1).getText().equals("derive"))||(input.LT(1).getText().equals("derived")))) ) {
                        alt60=5;
                    }
                    else if ( ((input.LT(1).getText().equals("qualifier"))) ) {
                        alt60=6;
                    }


                    }
                    break;
                case 107:
                    {
                    alt60=1;
                    }
                    break;
                case 117:
                    {
                    alt60=2;
                    }
                    break;
                case 112:
                    {
                    alt60=4;
                    }
                    break;

                }

                switch (alt60) {
            	case 1 :
            	    // Generator.g:622:9: 'ordered'
            	    {
            	    match(input,107,FOLLOW_107_in_associationEnd2835); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setOrdered(); }

            	    }
            	    break;
            	case 2 :
            	    // Generator.g:623:9: 'subsets' sr= IDENT
            	    {
            	    match(input,117,FOLLOW_117_in_associationEnd2847); if (state.failed) return n;

            	    sr=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd2851); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addSubsetsRolename(sr); }

            	    }
            	    break;
            	case 3 :
            	    // Generator.g:624:9: keyUnion
            	    {
            	    pushFollow(FOLLOW_keyUnion_in_associationEnd2863);
            	    keyUnion();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setUnion(true); }

            	    }
            	    break;
            	case 4 :
            	    // Generator.g:625:9: 'redefines' rd= IDENT
            	    {
            	    match(input,112,FOLLOW_112_in_associationEnd2875); if (state.failed) return n;

            	    rd=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd2879); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addRedefinesRolename(rd); }

            	    }
            	    break;
            	case 5 :
            	    // Generator.g:626:9: ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression
            	    {
            	    // Generator.g:626:9: ( keyDerived | keyDerive )
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( (LA58_0==IDENT) ) {
            	        int LA58_1 = input.LA(2);

            	        if ( ((input.LT(1).getText().equals("derived"))) ) {
            	            alt58=1;
            	        }
            	        else if ( ((input.LT(1).getText().equals("derive"))) ) {
            	            alt58=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return n;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 58, 1, input);

            	            throw nvae;

            	        }
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 58, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // Generator.g:626:10: keyDerived
            	            {
            	            pushFollow(FOLLOW_keyDerived_in_associationEnd2892);
            	            keyDerived();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;
            	        case 2 :
            	            // Generator.g:626:21: keyDerive
            	            {
            	            pushFollow(FOLLOW_keyDerive_in_associationEnd2894);
            	            keyDerive();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    // Generator.g:626:32: ( LPAREN parameter= elemVarsDeclaration RPAREN )?
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==LPAREN) ) {
            	        alt59=1;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // Generator.g:626:34: LPAREN parameter= elemVarsDeclaration RPAREN
            	            {
            	            match(input,LPAREN,FOLLOW_LPAREN_in_associationEnd2899); if (state.failed) return n;

            	            pushFollow(FOLLOW_elemVarsDeclaration_in_associationEnd2905);
            	            parameter=elemVarsDeclaration();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            match(input,RPAREN,FOLLOW_RPAREN_in_associationEnd2907); if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_associationEnd2911); if (state.failed) return n;

            	    pushFollow(FOLLOW_expression_in_associationEnd2915);
            	    exp=expression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setDerived((exp!=null?exp.n:null), parameter); }

            	    }
            	    break;
            	case 6 :
            	    // Generator.g:627:9: keyQualifier qualifiers= paramList
            	    {
            	    pushFollow(FOLLOW_keyQualifier_in_associationEnd2927);
            	    keyQualifier();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    pushFollow(FOLLOW_paramList_in_associationEnd2933);
            	    qualifiers=paramList();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) {n.setQualifiers(qualifiers); }

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            // Generator.g:629:5: ( SEMI )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==SEMI) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // Generator.g:629:7: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_associationEnd2950); if (state.failed) return n;

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
    // Generator.g:643:1: multiplicity returns [ASTMultiplicity n] :mr= multiplicityRange ( COMMA mr= multiplicityRange )* ;
    public final ASTMultiplicity multiplicity() throws RecognitionException {
        ASTMultiplicity n = null;


        ASTMultiplicityRange mr =null;


        try {
            // Generator.g:644:5: (mr= multiplicityRange ( COMMA mr= multiplicityRange )* )
            // Generator.g:645:5: mr= multiplicityRange ( COMMA mr= multiplicityRange )*
            {
            if ( state.backtracking==0 ) { 
            	Token t = input.LT(1); // remember start position of expression
            	n = new ASTMultiplicity(t);
                }

            pushFollow(FOLLOW_multiplicityRange_in_multiplicity2985);
            mr=multiplicityRange();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addRange(mr); }

            // Generator.g:650:5: ( COMMA mr= multiplicityRange )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==COMMA) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // Generator.g:650:7: COMMA mr= multiplicityRange
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multiplicity2995); if (state.failed) return n;

            	    pushFollow(FOLLOW_multiplicityRange_in_multiplicity2999);
            	    mr=multiplicityRange();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addRange(mr); }

            	    }
            	    break;

            	default :
            	    break loop62;
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
    // Generator.g:653:1: multiplicityRange returns [ASTMultiplicityRange n] : ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? ;
    public final ASTMultiplicityRange multiplicityRange() throws RecognitionException {
        ASTMultiplicityRange n = null;


        int ms1 =0;

        int ms2 =0;


        try {
            // Generator.g:654:5: (ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? )
            // Generator.g:655:5: ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )?
            {
            pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange3028);
            ms1=multiplicitySpec();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTMultiplicityRange(ms1); }

            // Generator.g:656:5: ( DOTDOT ms2= multiplicitySpec )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==DOTDOT) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // Generator.g:656:7: DOTDOT ms2= multiplicitySpec
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_multiplicityRange3038); if (state.failed) return n;

                    pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange3042);
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
    // Generator.g:659:1: multiplicitySpec returns [int m] : (i= INT | STAR );
    public final int multiplicitySpec() throws RecognitionException {
        int m = 0;


        Token i=null;

         m = -1; 
        try {
            // Generator.g:661:7: (i= INT | STAR )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==INT) ) {
                alt64=1;
            }
            else if ( (LA64_0==STAR) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return m;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }
            switch (alt64) {
                case 1 :
                    // Generator.g:662:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_multiplicitySpec3076); if (state.failed) return m;

                    if ( state.backtracking==0 ) { m = Integer.parseInt((i!=null?i.getText():null)); }

                    }
                    break;
                case 2 :
                    // Generator.g:663:7: STAR
                    {
                    match(input,STAR,FOLLOW_STAR_in_multiplicitySpec3086); if (state.failed) return m;

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
    // Generator.g:666:1: annotationSpec returns [AnnotationTag tag] : (rtag= block_annotation |rtag= line_annotation[tag] );
    public final AnnotationTag annotationSpec() throws RecognitionException {
        AnnotationTag tag = null;


        AnnotationTag rtag =null;


        tag = new AnnotationTag();
        try {
            // Generator.g:668:2: (rtag= block_annotation |rtag= line_annotation[tag] )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==AT) ) {
                int LA65_1 = input.LA(2);

                if ( (LA65_1==IDENT) ) {
                    alt65=1;
                }
                else if ( (LA65_1==48||LA65_1==58||LA65_1==60) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return tag;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return tag;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }
            switch (alt65) {
                case 1 :
                    // Generator.g:669:2: rtag= block_annotation
                    {
                    pushFollow(FOLLOW_block_annotation_in_annotationSpec3113);
                    rtag=block_annotation();

                    state._fsp--;
                    if (state.failed) return tag;

                    if ( state.backtracking==0 ) {tag =rtag;}

                    }
                    break;
                case 2 :
                    // Generator.g:670:4: rtag= line_annotation[tag]
                    {
                    pushFollow(FOLLOW_line_annotation_in_annotationSpec3122);
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
    // Generator.g:673:1: block_annotation returns [AnnotationTag tag] : AT IDENT LBRACE ( annotation_tag[tag] )* RBRACE ;
    public final AnnotationTag block_annotation() throws RecognitionException {
        AnnotationTag tag = null;


        Token IDENT1=null;

        tag = new AnnotationTag();
        try {
            // Generator.g:675:2: ( AT IDENT LBRACE ( annotation_tag[tag] )* RBRACE )
            // Generator.g:676:2: AT IDENT LBRACE ( annotation_tag[tag] )* RBRACE
            {
            match(input,AT,FOLLOW_AT_in_block_annotation3144); if (state.failed) return tag;

            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_block_annotation3146); if (state.failed) return tag;

            match(input,LBRACE,FOLLOW_LBRACE_in_block_annotation3148); if (state.failed) return tag;

            // Generator.g:677:3: ( annotation_tag[tag] )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==48||LA66_0==58||LA66_0==60) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // Generator.g:677:4: annotation_tag[tag]
            	    {
            	    pushFollow(FOLLOW_annotation_tag_in_block_annotation3153);
            	    annotation_tag(tag);

            	    state._fsp--;
            	    if (state.failed) return tag;

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            if ( state.backtracking==0 ) {tag.setName(IDENT1.getText());}

            match(input,RBRACE,FOLLOW_RBRACE_in_block_annotation3161); if (state.failed) return tag;

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
    // Generator.g:681:1: line_annotation[AnnotationTag tag] returns [AnnotationTag rtag] : AT ( annotation_tag[tag] ) ;
    public final AnnotationTag line_annotation(AnnotationTag tag) throws RecognitionException {
        AnnotationTag rtag = null;


        if (tag==null) tag = new AnnotationTag();
        try {
            // Generator.g:682:50: ( AT ( annotation_tag[tag] ) )
            // Generator.g:683:2: AT ( annotation_tag[tag] )
            {
            match(input,AT,FOLLOW_AT_in_line_annotation3180); if (state.failed) return rtag;

            // Generator.g:683:5: ( annotation_tag[tag] )
            // Generator.g:683:6: annotation_tag[tag]
            {
            pushFollow(FOLLOW_annotation_tag_in_line_annotation3183);
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
    // Generator.g:686:1: annotation_tag[AnnotationTag tag] : ( annotation_comment EQUAL ( NON_OCL_STRING ) | annotation_weight EQUAL ( annotation_def | INT ) | annotation_type EQUAL ( annotation_enum_type | annotation_ref ) );
    public final void annotation_tag(AnnotationTag tag) throws RecognitionException {
        Token NON_OCL_STRING2=null;
        Token INT3=null;

        try {
            // Generator.g:687:2: ( annotation_comment EQUAL ( NON_OCL_STRING ) | annotation_weight EQUAL ( annotation_def | INT ) | annotation_type EQUAL ( annotation_enum_type | annotation_ref ) )
            int alt69=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt69=1;
                }
                break;
            case 60:
                {
                alt69=2;
                }
                break;
            case 58:
                {
                alt69=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }

            switch (alt69) {
                case 1 :
                    // Generator.g:688:2: annotation_comment EQUAL ( NON_OCL_STRING )
                    {
                    pushFollow(FOLLOW_annotation_comment_in_annotation_tag3199);
                    annotation_comment();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,EQUAL,FOLLOW_EQUAL_in_annotation_tag3201); if (state.failed) return ;

                    // Generator.g:688:27: ( NON_OCL_STRING )
                    // Generator.g:688:28: NON_OCL_STRING
                    {
                    NON_OCL_STRING2=(Token)match(input,NON_OCL_STRING,FOLLOW_NON_OCL_STRING_in_annotation_tag3204); if (state.failed) return ;

                    if ( state.backtracking==0 ) {tag.setComments(NON_OCL_STRING2.getText());}

                    }


                    }
                    break;
                case 2 :
                    // Generator.g:689:4: annotation_weight EQUAL ( annotation_def | INT )
                    {
                    pushFollow(FOLLOW_annotation_weight_in_annotation_tag3212);
                    annotation_weight();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,EQUAL,FOLLOW_EQUAL_in_annotation_tag3214); if (state.failed) return ;

                    // Generator.g:689:28: ( annotation_def | INT )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==74) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==INT) ) {
                        alt67=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;

                    }
                    switch (alt67) {
                        case 1 :
                            // Generator.g:689:29: annotation_def
                            {
                            pushFollow(FOLLOW_annotation_def_in_annotation_tag3217);
                            annotation_def();

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {tag.setWeight(new IntWeight(-1));}

                            }
                            break;
                        case 2 :
                            // Generator.g:689:83: INT
                            {
                            INT3=(Token)match(input,INT,FOLLOW_INT_in_annotation_tag3223); if (state.failed) return ;

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
                    // Generator.g:693:4: annotation_type EQUAL ( annotation_enum_type | annotation_ref )
                    {
                    pushFollow(FOLLOW_annotation_type_in_annotation_tag3231);
                    annotation_type();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,EQUAL,FOLLOW_EQUAL_in_annotation_tag3233); if (state.failed) return ;

                    // Generator.g:693:26: ( annotation_enum_type | annotation_ref )
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==49||LA68_0==56) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==AT) ) {
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
                            // Generator.g:693:27: annotation_enum_type
                            {
                            pushFollow(FOLLOW_annotation_enum_type_in_annotation_tag3236);
                            annotation_enum_type();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // Generator.g:693:50: annotation_ref
                            {
                            pushFollow(FOLLOW_annotation_ref_in_annotation_tag3240);
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
    // Generator.g:696:1: annotation_predefined : ( 'Comment' | 'Weight' | 'Type' );
    public final void annotation_predefined() throws RecognitionException {
        try {
            // Generator.g:696:22: ( 'Comment' | 'Weight' | 'Type' )
            // Generator.g:
            {
            if ( input.LA(1)==48||input.LA(1)==58||input.LA(1)==60 ) {
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
    // Generator.g:702:1: annotation_comment : 'Comment' ;
    public final void annotation_comment() throws RecognitionException {
        try {
            // Generator.g:702:19: ( 'Comment' )
            // Generator.g:702:21: 'Comment'
            {
            match(input,48,FOLLOW_48_in_annotation_comment3268); if (state.failed) return ;

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
    // Generator.g:703:1: annotation_weight : 'Weight' ;
    public final void annotation_weight() throws RecognitionException {
        try {
            // Generator.g:703:18: ( 'Weight' )
            // Generator.g:703:20: 'Weight'
            {
            match(input,60,FOLLOW_60_in_annotation_weight3275); if (state.failed) return ;

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
    // Generator.g:704:1: annotation_type : 'Type' ;
    public final void annotation_type() throws RecognitionException {
        try {
            // Generator.g:704:16: ( 'Type' )
            // Generator.g:704:18: 'Type'
            {
            match(input,58,FOLLOW_58_in_annotation_type3282); if (state.failed) return ;

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
    // Generator.g:706:1: annotation_override : 'Override' LPAREN LBRACE annotation_term RBRACE RPAREN ;
    public final void annotation_override() throws RecognitionException {
        try {
            // Generator.g:706:20: ( 'Override' LPAREN LBRACE annotation_term RBRACE RPAREN )
            // Generator.g:707:1: 'Override' LPAREN LBRACE annotation_term RBRACE RPAREN
            {
            match(input,53,FOLLOW_53_in_annotation_override3291); if (state.failed) return ;

            match(input,LPAREN,FOLLOW_LPAREN_in_annotation_override3293); if (state.failed) return ;

            match(input,LBRACE,FOLLOW_LBRACE_in_annotation_override3295); if (state.failed) return ;

            pushFollow(FOLLOW_annotation_term_in_annotation_override3297);
            annotation_term();

            state._fsp--;
            if (state.failed) return ;

            match(input,RBRACE,FOLLOW_RBRACE_in_annotation_override3299); if (state.failed) return ;

            match(input,RPAREN,FOLLOW_RPAREN_in_annotation_override3301); if (state.failed) return ;

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
    // Generator.g:710:1: annotation_term returns [AnnotationTag tag] : annotation_tag[tag] ( COMMA annotation_tag[tag] )* ;
    public final AnnotationTag annotation_term() throws RecognitionException {
        AnnotationTag tag = null;


        tag = new AnnotationTag();
        try {
            // Generator.g:711:35: ( annotation_tag[tag] ( COMMA annotation_tag[tag] )* )
            // Generator.g:712:2: annotation_tag[tag] ( COMMA annotation_tag[tag] )*
            {
            pushFollow(FOLLOW_annotation_tag_in_annotation_term3318);
            annotation_tag(tag);

            state._fsp--;
            if (state.failed) return tag;

            // Generator.g:712:22: ( COMMA annotation_tag[tag] )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==COMMA) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // Generator.g:712:23: COMMA annotation_tag[tag]
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_annotation_term3322); if (state.failed) return tag;

            	    pushFollow(FOLLOW_annotation_tag_in_annotation_term3324);
            	    annotation_tag(tag);

            	    state._fsp--;
            	    if (state.failed) return tag;

            	    }
            	    break;

            	default :
            	    break loop70;
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
    // Generator.g:715:1: annotation_ref : AT IDENT DOT annotation_predefined ;
    public final void annotation_ref() throws RecognitionException {
        try {
            // Generator.g:715:15: ( AT IDENT DOT annotation_predefined )
            // Generator.g:716:2: AT IDENT DOT annotation_predefined
            {
            match(input,AT,FOLLOW_AT_in_annotation_ref3336); if (state.failed) return ;

            match(input,IDENT,FOLLOW_IDENT_in_annotation_ref3338); if (state.failed) return ;

            match(input,DOT,FOLLOW_DOT_in_annotation_ref3340); if (state.failed) return ;

            pushFollow(FOLLOW_annotation_predefined_in_annotation_ref3342);
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
    // Generator.g:719:1: annotation_def : 'default' ;
    public final void annotation_def() throws RecognitionException {
        try {
            // Generator.g:719:15: ( 'default' )
            // Generator.g:720:2: 'default'
            {
            match(input,74,FOLLOW_74_in_annotation_def3351); if (state.failed) return ;

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
    // Generator.g:722:1: annotation_enum_type : ( 'Soft' | 'Hard' );
    public final void annotation_enum_type() throws RecognitionException {
        try {
            // Generator.g:722:21: ( 'Soft' | 'Hard' )
            // Generator.g:
            {
            if ( input.LA(1)==49||input.LA(1)==56 ) {
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
    // Generator.g:744:1: invariant returns [ASTConstraintDefinition n] : (tag= block_annotation )? 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* ;
    public final ASTConstraintDefinition invariant() throws RecognitionException {
        ASTConstraintDefinition n = null;


        Token v=null;
        AnnotationTag tag =null;

        ASTSimpleType t =null;

        ASTInvariantClause inv =null;


        try {
            // Generator.g:745:5: ( (tag= block_annotation )? 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* )
            // Generator.g:746:5: (tag= block_annotation )? 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )*
            {
            if ( state.backtracking==0 ) { n = new ASTConstraintDefinition();}

            // Generator.g:747:2: (tag= block_annotation )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==AT) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // Generator.g:747:3: tag= block_annotation
                    {
                    pushFollow(FOLLOW_block_annotation_in_invariant3397);
                    tag=block_annotation();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n.addBlockAnnotationTag(tag);}

                    }
                    break;

            }


            match(input,71,FOLLOW_71_in_invariant3408); if (state.failed) return n;

            // Generator.g:749:5: (v= IDENT ( ',' v= IDENT )* COLON )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==IDENT) ) {
                int LA73_1 = input.LA(2);

                if ( (LA73_1==COLON||LA73_1==COMMA) ) {
                    alt73=1;
                }
            }
            switch (alt73) {
                case 1 :
                    // Generator.g:749:7: v= IDENT ( ',' v= IDENT )* COLON
                    {
                    v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant3418); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addVarName(v); }

                    // Generator.g:750:8: ( ',' v= IDENT )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==COMMA) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // Generator.g:750:9: ',' v= IDENT
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_invariant3430); if (state.failed) return n;

                    	    v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant3434); if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addVarName(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);


                    match(input,COLON,FOLLOW_COLON_in_invariant3442); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_simpleType_in_invariant3454);
            t=simpleType();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setType(t); }

            // Generator.g:752:5: (inv= invariantClause )*
            loop74:
            do {
                int alt74=2;
                alt74 = dfa74.predict(input);
                switch (alt74) {
            	case 1 :
            	    // Generator.g:752:7: inv= invariantClause
            	    {
            	    pushFollow(FOLLOW_invariantClause_in_invariant3466);
            	    inv=invariantClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

            	    }
            	    break;

            	default :
            	    break loop74;
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
    // Generator.g:759:1: invariantClause returns [ASTInvariantClause n] : ( (tag= line_annotation[tag] )* as= annotationSet 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression );
    public final ASTInvariantClause invariantClause() throws RecognitionException {
        ASTInvariantClause n = null;


        Token name=null;
        AnnotationTag tag =null;

        Set<ASTAnnotation> as =null;

        GeneratorParser.expression_return e =null;


        tag = null;
        try {
            // Generator.g:760:19: ( (tag= line_annotation[tag] )* as= annotationSet 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==AT||LA78_0==IDENT||LA78_0==61||(LA78_0 >= 64 && LA78_0 <= 65)||LA78_0==82||LA78_0==92||LA78_0==95||(LA78_0 >= 108 && LA78_0 <= 109)) ) {
                alt78=1;
            }
            else if ( (LA78_0==83) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;

            }
            switch (alt78) {
                case 1 :
                    // Generator.g:761:2: (tag= line_annotation[tag] )* as= annotationSet 'inv' (name= IDENT )? COLON e= expression
                    {
                    // Generator.g:761:2: (tag= line_annotation[tag] )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==AT) ) {
                            int LA75_1 = input.LA(2);

                            if ( (LA75_1==48||LA75_1==58||LA75_1==60) ) {
                                alt75=1;
                            }


                        }


                        switch (alt75) {
                    	case 1 :
                    	    // Generator.g:761:3: tag= line_annotation[tag]
                    	    {
                    	    pushFollow(FOLLOW_line_annotation_in_invariantClause3498);
                    	    tag=line_annotation(tag);

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);


                    pushFollow(FOLLOW_annotationSet_in_invariantClause3508);
                    as=annotationSet();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,92,FOLLOW_92_in_invariantClause3515); if (state.failed) return n;

                    // Generator.g:763:12: (name= IDENT )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==IDENT) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // Generator.g:763:14: name= IDENT
                            {
                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause3521); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,COLON,FOLLOW_COLON_in_invariantClause3526); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_invariantClause3530);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTInvariantClause(name, (e!=null?e.n:null)); n.setAnnotations(as);n.setAnnotationTag(tag);}

                    }
                    break;
                case 2 :
                    // Generator.g:765:7: 'existential' 'inv' (name= IDENT )? COLON e= expression
                    {
                    match(input,83,FOLLOW_83_in_invariantClause3547); if (state.failed) return n;

                    match(input,92,FOLLOW_92_in_invariantClause3549); if (state.failed) return n;

                    // Generator.g:765:27: (name= IDENT )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==IDENT) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // Generator.g:765:29: name= IDENT
                            {
                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause3555); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,COLON,FOLLOW_COLON_in_invariantClause3560); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_invariantClause3564);
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
    // Generator.g:777:1: prePost returns [ASTPrePost n] : 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ ;
    public final ASTPrePost prePost() throws RecognitionException {
        ASTPrePost n = null;


        Token classname=null;
        Token opname=null;
        List<ASTVariableDeclaration> pl =null;

        ASTType rt =null;

        ASTPrePostClause ppc =null;


        try {
            // Generator.g:778:5: ( 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ )
            // Generator.g:779:5: 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+
            {
            match(input,71,FOLLOW_71_in_prePost3597); if (state.failed) return n;

            classname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost3601); if (state.failed) return n;

            match(input,COLON_COLON,FOLLOW_COLON_COLON_in_prePost3603); if (state.failed) return n;

            opname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost3607); if (state.failed) return n;

            pushFollow(FOLLOW_paramList_in_prePost3611);
            pl=paramList();

            state._fsp--;
            if (state.failed) return n;

            // Generator.g:779:69: ( COLON rt= type )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==COLON) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // Generator.g:779:71: COLON rt= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_prePost3615); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_prePost3619);
                    rt=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n = new ASTPrePost(classname, opname, pl, rt); }

            // Generator.g:781:5: (ppc= prePostClause )+
            int cnt80=0;
            loop80:
            do {
                int alt80=2;
                alt80 = dfa80.predict(input);
                switch (alt80) {
            	case 1 :
            	    // Generator.g:781:7: ppc= prePostClause
            	    {
            	    pushFollow(FOLLOW_prePostClause_in_prePost3638);
            	    ppc=prePostClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addPrePostClause(ppc); }

            	    }
            	    break;

            	default :
            	    if ( cnt80 >= 1 ) break loop80;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(80, input);
                        throw eee;
                }
                cnt80++;
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
    // Generator.g:788:1: prePostClause returns [ASTPrePostClause n] : as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression ;
    public final ASTPrePostClause prePostClause() throws RecognitionException {
        ASTPrePostClause n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        GeneratorParser.expression_return e =null;


         Token t = null; 
        try {
            // Generator.g:790:2: (as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression )
            // Generator.g:791:2: as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression
            {
            pushFollow(FOLLOW_annotationSet_in_prePostClause3672);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { t = input.LT(1); }

            if ( (input.LA(1) >= 108 && input.LA(1) <= 109) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // Generator.g:793:25: (name= IDENT )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==IDENT) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // Generator.g:793:27: name= IDENT
                    {
                    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePostClause3699); if (state.failed) return n;

                    }
                    break;

            }


            match(input,COLON,FOLLOW_COLON_in_prePostClause3704); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_prePostClause3708);
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
    // Generator.g:797:1: annotationSet returns [Set<ASTAnnotation> annotations] : (an= annotation )* ;
    public final Set<ASTAnnotation> annotationSet() throws RecognitionException {
        Set<ASTAnnotation> annotations = null;


        ASTAnnotation an =null;


         annotations = new HashSet<ASTAnnotation>(); 
        try {
            // Generator.g:799:2: ( (an= annotation )* )
            // Generator.g:800:2: (an= annotation )*
            {
            // Generator.g:800:2: (an= annotation )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==AT) ) {
                    int LA82_2 = input.LA(2);

                    if ( (LA82_2==IDENT) ) {
                        int LA82_3 = input.LA(3);

                        if ( (LA82_3==LPAREN) ) {
                            alt82=1;
                        }


                    }


                }


                switch (alt82) {
            	case 1 :
            	    // Generator.g:800:3: an= annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotationSet3735);
            	    an=annotation();

            	    state._fsp--;
            	    if (state.failed) return annotations;

            	    if ( state.backtracking==0 ) { annotations.add(an); }

            	    }
            	    break;

            	default :
            	    break loop82;
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
    // Generator.g:803:1: annotation returns [ASTAnnotation n] : AT name= IDENT LPAREN values= annotationValues RPAREN ;
    public final ASTAnnotation annotation() throws RecognitionException {
        ASTAnnotation n = null;


        Token name=null;
        Map<Token, Token> values =null;


        try {
            // Generator.g:803:37: ( AT name= IDENT LPAREN values= annotationValues RPAREN )
            // Generator.g:804:2: AT name= IDENT LPAREN values= annotationValues RPAREN
            {
            match(input,AT,FOLLOW_AT_in_annotation3754); if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotation3758); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = new ASTAnnotation(name);}

            match(input,LPAREN,FOLLOW_LPAREN_in_annotation3764); if (state.failed) return n;

            pushFollow(FOLLOW_annotationValues_in_annotation3773);
            values=annotationValues();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setValues(values); }

            match(input,RPAREN,FOLLOW_RPAREN_in_annotation3778); if (state.failed) return n;

            }

        }
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
    // Generator.g:810:1: annotationValues returns [Map<Token, Token> values] : (firstVal= annotationValue )? ( COMMA val= annotationValue )* ;
    public final Map<Token, Token> annotationValues() throws RecognitionException {
        Map<Token, Token> values = null;


        GeneratorParser.annotationValue_return firstVal =null;

        GeneratorParser.annotationValue_return val =null;


         values = new HashMap<Token, Token>(); 
        try {
            // Generator.g:812:2: ( (firstVal= annotationValue )? ( COMMA val= annotationValue )* )
            // Generator.g:813:2: (firstVal= annotationValue )? ( COMMA val= annotationValue )*
            {
            // Generator.g:813:2: (firstVal= annotationValue )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==IDENT) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // Generator.g:813:3: firstVal= annotationValue
                    {
                    pushFollow(FOLLOW_annotationValue_in_annotationValues3801);
                    firstVal=annotationValue();

                    state._fsp--;
                    if (state.failed) return values;

                    if ( state.backtracking==0 ) { values.put((firstVal!=null?firstVal.name:null), (firstVal!=null?firstVal.value:null)); }

                    }
                    break;

            }


            // Generator.g:814:2: ( COMMA val= annotationValue )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==COMMA) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // Generator.g:814:3: COMMA val= annotationValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_annotationValues3809); if (state.failed) return values;

            	    pushFollow(FOLLOW_annotationValue_in_annotationValues3813);
            	    val=annotationValue();

            	    state._fsp--;
            	    if (state.failed) return values;

            	    if ( state.backtracking==0 ) { values.put((val!=null?val.name:null), (val!=null?val.value:null)); }

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
        return values;
    }
    // $ANTLR end "annotationValues"


    public static class annotationValue_return extends ParserRuleReturnScope {
        public Token name;
        public Token value;
    };


    // $ANTLR start "annotationValue"
    // Generator.g:817:1: annotationValue returns [Token name, Token value] : aName= IDENT EQUAL aValue= NON_OCL_STRING ;
    public final GeneratorParser.annotationValue_return annotationValue() throws RecognitionException {
        GeneratorParser.annotationValue_return retval = new GeneratorParser.annotationValue_return();
        retval.start = input.LT(1);


        Token aName=null;
        Token aValue=null;

        try {
            // Generator.g:817:50: (aName= IDENT EQUAL aValue= NON_OCL_STRING )
            // Generator.g:818:2: aName= IDENT EQUAL aValue= NON_OCL_STRING
            {
            aName=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotationValue3832); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.name = aName; }

            match(input,EQUAL,FOLLOW_EQUAL_in_annotationValue3837); if (state.failed) return retval;

            aValue=(Token)match(input,NON_OCL_STRING,FOLLOW_NON_OCL_STRING_in_annotationValue3843); if (state.failed) return retval;

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
    // Generator.g:823:1: stateMachine returns [ASTStateMachine n] : ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end' ;
    public final ASTStateMachine stateMachine() throws RecognitionException {
        ASTStateMachine n = null;


        Token smName=null;
        ASTStateDefinition s =null;

        ASTTransitionDefinition t =null;


        try {
            // Generator.g:824:5: ( ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end' )
            // Generator.g:825:5: ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end'
            {
            // Generator.g:825:5: ( 'psm' )
            // Generator.g:826:8: 'psm'
            {
            match(input,111,FOLLOW_111_in_stateMachine3873); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTProtocolStateMachine(); }

            }


            smName=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateMachine3906); if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setName(smName); }

            match(input,116,FOLLOW_116_in_stateMachine3919); if (state.failed) return n;

            // Generator.g:833:10: (s= stateDefinition )+
            int cnt85=0;
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==IDENT) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // Generator.g:833:11: s= stateDefinition
            	    {
            	    pushFollow(FOLLOW_stateDefinition_in_stateMachine3935);
            	    s=stateDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addStateDefinition(s); }

            	    }
            	    break;

            	default :
            	    if ( cnt85 >= 1 ) break loop85;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(85, input);
                        throw eee;
                }
                cnt85++;
            } while (true);


            match(input,119,FOLLOW_119_in_stateMachine3945); if (state.failed) return n;

            // Generator.g:835:10: (t= transitionDefinition )+
            int cnt86=0;
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==IDENT) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // Generator.g:835:11: t= transitionDefinition
            	    {
            	    pushFollow(FOLLOW_transitionDefinition_in_stateMachine3961);
            	    t=transitionDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addTransitionDefinition(t); }

            	    }
            	    break;

            	default :
            	    if ( cnt86 >= 1 ) break loop86;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(86, input);
                        throw eee;
                }
                cnt86++;
            } while (true);


            match(input,80,FOLLOW_80_in_stateMachine3971); if (state.failed) return n;

            }

        }
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
    // Generator.g:839:1: stateDefinition returns [ASTStateDefinition n] : sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )? ;
    public final ASTStateDefinition stateDefinition() throws RecognitionException {
        ASTStateDefinition n = null;


        Token sn=null;
        Token stateType=null;
        GeneratorParser.expression_return stateInv =null;


        try {
            // Generator.g:839:47: (sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )? )
            // Generator.g:840:3: sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )?
            {
            sn=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateDefinition3987); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = new ASTStateDefinition(sn); }

            // Generator.g:841:3: ( COLON stateType= IDENT )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==COLON) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // Generator.g:841:5: COLON stateType= IDENT
                    {
                    match(input,COLON,FOLLOW_COLON_in_stateDefinition3995); if (state.failed) return n;

                    stateType=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateDefinition3999); if (state.failed) return n;

                    if ( state.backtracking==0 ) {n.setType(stateType); }

                    }
                    break;

            }


            // Generator.g:842:3: ( LBRACK stateInv= expression RBRACK )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==LBRACK) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // Generator.g:842:5: LBRACK stateInv= expression RBRACK
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_stateDefinition4010); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_stateDefinition4016);
                    stateInv=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RBRACK,FOLLOW_RBRACK_in_stateDefinition4018); if (state.failed) return n;

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
    // Generator.g:845:1: transitionDefinition returns [ASTTransitionDefinition n] : source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )? ;
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
            // Generator.g:845:57: (source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )? )
            // Generator.g:846:3: source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )?
            {
            source=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition4039); if (state.failed) return n;

            match(input,ARROW,FOLLOW_ARROW_in_transitionDefinition4041); if (state.failed) return n;

            target=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition4045); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTransitionDefinition(source, target); }

            // Generator.g:847:5: ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==LBRACE) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // Generator.g:847:6: LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_transitionDefinition4055); if (state.failed) return n;

                    // Generator.g:848:7: ( LBRACK pre= expression RBRACK )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==LBRACK) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // Generator.g:848:8: LBRACK pre= expression RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_transitionDefinition4065); if (state.failed) return n;

                            pushFollow(FOLLOW_expression_in_transitionDefinition4069);
                            pre=expression();

                            state._fsp--;
                            if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setPreCondition((pre!=null?pre.n:null)); }

                            match(input,RBRACK,FOLLOW_RBRACK_in_transitionDefinition4073); if (state.failed) return n;

                            }
                            break;

                    }


                    // Generator.g:849:7: (e= event |o= IDENT LPAREN (args= paramList )? RPAREN )
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==72) ) {
                        alt91=1;
                    }
                    else if ( (LA91_0==IDENT) ) {
                        alt91=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 91, 0, input);

                        throw nvae;

                    }
                    switch (alt91) {
                        case 1 :
                            // Generator.g:850:11: e= event
                            {
                            pushFollow(FOLLOW_event_in_transitionDefinition4097);
                            e=event();

                            state._fsp--;
                            if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setEvent(e); }

                            }
                            break;
                        case 2 :
                            // Generator.g:851:11: o= IDENT LPAREN (args= paramList )? RPAREN
                            {
                            o=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition4113); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setOperation(o); }

                            match(input,LPAREN,FOLLOW_LPAREN_in_transitionDefinition4117); if (state.failed) return n;

                            // Generator.g:851:50: (args= paramList )?
                            int alt90=2;
                            int LA90_0 = input.LA(1);

                            if ( (LA90_0==LPAREN) ) {
                                alt90=1;
                            }
                            switch (alt90) {
                                case 1 :
                                    // Generator.g:851:51: args= paramList
                                    {
                                    pushFollow(FOLLOW_paramList_in_transitionDefinition4122);
                                    args=paramList();

                                    state._fsp--;
                                    if (state.failed) return n;

                                    if ( state.backtracking==0 ) { n.setOperationArgs(args); }

                                    }
                                    break;

                            }


                            match(input,RPAREN,FOLLOW_RPAREN_in_transitionDefinition4129); if (state.failed) return n;

                            }
                            break;

                    }


                    // Generator.g:853:7: ( LBRACK post= expression RBRACK )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==LBRACK) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // Generator.g:853:8: LBRACK post= expression RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_transitionDefinition4146); if (state.failed) return n;

                            pushFollow(FOLLOW_expression_in_transitionDefinition4150);
                            post=expression();

                            state._fsp--;
                            if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setPostCondition((post!=null?post.n:null)); }

                            match(input,RBRACK,FOLLOW_RBRACK_in_transitionDefinition4154); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,RBRACE,FOLLOW_RBRACE_in_transitionDefinition4162); if (state.failed) return n;

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
    // Generator.g:857:1: event returns [Token t] : tcr= 'create' ;
    public final Token event() throws RecognitionException {
        Token t = null;


        Token tcr=null;

        try {
            // Generator.g:857:24: (tcr= 'create' )
            // Generator.g:858:5: tcr= 'create'
            {
            tcr=(Token)match(input,72,FOLLOW_72_in_event4184); if (state.failed) return t;

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
    // Generator.g:861:1: signalDefinition[boolean isAbstract] returns [ASTSignal n] : keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' ;
    public final ASTSignal signalDefinition(boolean isAbstract) throws RecognitionException {
        ASTSignal n = null;


        Token name=null;
        List idListRes =null;

        ASTAttribute a =null;

        ASTInvariantClause inv =null;


        try {
            // Generator.g:861:59: ( keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' )
            // Generator.g:862:5: keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end'
            {
            pushFollow(FOLLOW_keySignal_in_signalDefinition4204);
            keySignal();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_signalDefinition4208); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTSignal(name, isAbstract); }

            // Generator.g:864:5: ( LESS idListRes= idList )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==LESS) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // Generator.g:864:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_signalDefinition4223); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_signalDefinition4227);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addGenerals(idListRes); }

                    }
                    break;

            }


            // Generator.g:865:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==66) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // Generator.g:865:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,66,FOLLOW_66_in_signalDefinition4240); if (state.failed) return n;

                    // Generator.g:866:7: (a= attributeDefinition )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==AT||LA95_0==IDENT||LA95_0==61||(LA95_0 >= 64 && LA95_0 <= 65)||LA95_0==82||LA95_0==92||LA95_0==95||(LA95_0 >= 108 && LA95_0 <= 109)) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // Generator.g:866:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_signalDefinition4253);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addAttribute(a); }

                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:868:5: ( 'constraints' (inv= invariantClause )* )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==70) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // Generator.g:868:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,70,FOLLOW_70_in_signalDefinition4274); if (state.failed) return n;

                    // Generator.g:869:7: (inv= invariantClause )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==AT||LA97_0==IDENT||LA97_0==61||(LA97_0 >= 64 && LA97_0 <= 65)||(LA97_0 >= 82 && LA97_0 <= 83)||LA97_0==92||LA97_0==95||(LA97_0 >= 108 && LA97_0 <= 109)) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // Generator.g:870:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_signalDefinition4294);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

                    	    }
                    	    break;

                    	default :
                    	    break loop97;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,80,FOLLOW_80_in_signalDefinition4318); if (state.failed) return n;

            }

        }
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
    // Generator.g:876:1: keyUnion :{...}? IDENT ;
    public final void keyUnion() throws RecognitionException {
        try {
            // Generator.g:876:9: ({...}? IDENT )
            // Generator.g:877:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("union"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyUnion", "input.LT(1).getText().equals(\"union\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyUnion4336); if (state.failed) return ;

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
    // Generator.g:879:1: keyAssociation :{...}? IDENT ;
    public final void keyAssociation() throws RecognitionException {
        try {
            // Generator.g:879:15: ({...}? IDENT )
            // Generator.g:880:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("association"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyAssociation", "input.LT(1).getText().equals(\"association\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyAssociation4350); if (state.failed) return ;

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
    // Generator.g:882:1: keyRole :{...}? IDENT ;
    public final void keyRole() throws RecognitionException {
        try {
            // Generator.g:882:8: ({...}? IDENT )
            // Generator.g:883:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("role"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyRole", "input.LT(1).getText().equals(\"role\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyRole4364); if (state.failed) return ;

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
    // Generator.g:885:1: keyComposition :{...}? IDENT ;
    public final void keyComposition() throws RecognitionException {
        try {
            // Generator.g:885:15: ({...}? IDENT )
            // Generator.g:886:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("composition"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyComposition", "input.LT(1).getText().equals(\"composition\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyComposition4376); if (state.failed) return ;

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
    // Generator.g:888:1: keyAggregation :{...}? IDENT ;
    public final void keyAggregation() throws RecognitionException {
        try {
            // Generator.g:888:15: ({...}? IDENT )
            // Generator.g:889:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("aggregation"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyAggregation", "input.LT(1).getText().equals(\"aggregation\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyAggregation4388); if (state.failed) return ;

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
    // Generator.g:891:1: keyClass :{...}? IDENT ;
    public final void keyClass() throws RecognitionException {
        try {
            // Generator.g:891:9: ({...}? IDENT )
            // Generator.g:892:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("class"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyClass", "input.LT(1).getText().equals(\"class\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyClass4402); if (state.failed) return ;

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
    // Generator.g:894:1: keySignal :{...}? IDENT ;
    public final void keySignal() throws RecognitionException {
        try {
            // Generator.g:894:10: ({...}? IDENT )
            // Generator.g:895:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("signal"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keySignal", "input.LT(1).getText().equals(\"signal\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keySignal4414); if (state.failed) return ;

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
    // Generator.g:897:1: keyDerived :{...}? IDENT ;
    public final void keyDerived() throws RecognitionException {
        try {
            // Generator.g:897:11: ({...}? IDENT )
            // Generator.g:898:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("derived"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyDerived", "input.LT(1).getText().equals(\"derived\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyDerived4428); if (state.failed) return ;

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
    // Generator.g:900:1: keyDerive :{...}? IDENT ;
    public final void keyDerive() throws RecognitionException {
        try {
            // Generator.g:900:10: ({...}? IDENT )
            // Generator.g:901:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("derive"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyDerive", "input.LT(1).getText().equals(\"derive\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyDerive4442); if (state.failed) return ;

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
    // Generator.g:903:1: keyInit :{...}? IDENT ;
    public final void keyInit() throws RecognitionException {
        try {
            // Generator.g:903:8: ({...}? IDENT )
            // Generator.g:904:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("init"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyInit", "input.LT(1).getText().equals(\"init\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyInit4454); if (state.failed) return ;

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
    // Generator.g:906:1: keyQualifier :{...}? IDENT ;
    public final void keyQualifier() throws RecognitionException {
        try {
            // Generator.g:906:13: ({...}? IDENT )
            // Generator.g:907:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("qualifier"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyQualifier", "input.LT(1).getText().equals(\"qualifier\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyQualifier4470); if (state.failed) return ;

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
    // Generator.g:936:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;


        GeneratorParser.expression_return nExp =null;


        try {
            // Generator.g:937:5: (nExp= expression EOF )
            // Generator.g:938:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly4498);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_expressionOnly4500); if (state.failed) return n;

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
    // Generator.g:945:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
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
            // Generator.g:951:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
            // Generator.g:952:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }

            // Generator.g:953:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==94) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // Generator.g:954:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
            	    {
            	    match(input,94,FOLLOW_94_in_expression4548); if (state.failed) return retval;

            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression4559); if (state.failed) return retval;

            	    // Generator.g:955:18: ( COLON t= type )?
            	    int alt99=2;
            	    int LA99_0 = input.LA(1);

            	    if ( (LA99_0==COLON) ) {
            	        alt99=1;
            	    }
            	    switch (alt99) {
            	        case 1 :
            	            // Generator.g:955:20: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression4563); if (state.failed) return retval;

            	            pushFollow(FOLLOW_type_in_expression4567);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression4572); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expression_in_expression4576);
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

            	    // Generator.g:965:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
            	    loop101:
            	    do {
            	        int alt101=2;
            	        int LA101_0 = input.LA(1);

            	        if ( (LA101_0==COMMA) ) {
            	            alt101=1;
            	        }


            	        switch (alt101) {
            	    	case 1 :
            	    	    // Generator.g:966:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_expression4614); if (state.failed) return retval;

            	    	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression4626); if (state.failed) return retval;

            	    	    // Generator.g:967:20: ( COLON t= type )?
            	    	    int alt100=2;
            	    	    int LA100_0 = input.LA(1);

            	    	    if ( (LA100_0==COLON) ) {
            	    	        alt100=1;
            	    	    }
            	    	    switch (alt100) {
            	    	        case 1 :
            	    	            // Generator.g:967:22: COLON t= type
            	    	            {
            	    	            match(input,COLON,FOLLOW_COLON_in_expression4630); if (state.failed) return retval;

            	    	            pushFollow(FOLLOW_type_in_expression4634);
            	    	            t=type();

            	    	            state._fsp--;
            	    	            if (state.failed) return retval;

            	    	            }
            	    	            break;

            	    	    }


            	    	    match(input,EQUAL,FOLLOW_EQUAL_in_expression4639); if (state.failed) return retval;

            	    	    pushFollow(FOLLOW_expression_in_expression4643);
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
            	    	    break loop101;
            	        }
            	    } while (true);


            	    match(input,89,FOLLOW_89_in_expression4684); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);


            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression4700);
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
    // Generator.g:999:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;


        ASTVariableDeclaration v =null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // Generator.g:1001:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // Generator.g:1002:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList4733); if (state.failed) return paramList;

            // Generator.g:1003:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==IDENT) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // Generator.g:1004:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList4750);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;

                    if ( state.backtracking==0 ) { paramList.add(v); }

                    // Generator.g:1005:7: ( COMMA v= variableDeclaration )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==COMMA) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // Generator.g:1005:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList4762); if (state.failed) return paramList;

                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList4766);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;

                    	    if ( state.backtracking==0 ) { paramList.add(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop103;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_paramList4786); if (state.failed) return paramList;

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
    // Generator.g:1013:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;


        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // Generator.g:1015:5: (id0= IDENT ( COMMA idn= IDENT )* )
            // Generator.g:1016:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList4815); if (state.failed) return idList;

            if ( state.backtracking==0 ) { idList.add(id0); }

            // Generator.g:1017:5: ( COMMA idn= IDENT )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==COMMA) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // Generator.g:1017:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList4825); if (state.failed) return idList;

            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList4829); if (state.failed) return idList;

            	    if ( state.backtracking==0 ) { idList.add(idn); }

            	    }
            	    break;

            	default :
            	    break loop105;
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
    // Generator.g:1025:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Generator.g:1026:5: (name= IDENT COLON t= type )
            // Generator.g:1027:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration4860); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableDeclaration4862); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableDeclaration4866);
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
    // Generator.g:1035:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndOrExp =null;

        ASTExpression n1 =null;


        try {
            // Generator.g:1036:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // Generator.g:1037:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression4902);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndOrExp;}

            // Generator.g:1038:5: (op= 'implies' n1= conditionalOrExpression )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==88) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // Generator.g:1038:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,88,FOLLOW_88_in_conditionalImpliesExpression4915); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression4919);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

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
        return n;
    }
    // $ANTLR end "conditionalImpliesExpression"



    // $ANTLR start "conditionalOrExpression"
    // Generator.g:1047:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndXorExp =null;

        ASTExpression n1 =null;


        try {
            // Generator.g:1048:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // Generator.g:1049:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression4964);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndXorExp;}

            // Generator.g:1050:5: (op= 'or' n1= conditionalXOrExpression )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==106) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // Generator.g:1050:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,106,FOLLOW_106_in_conditionalOrExpression4977); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression4981);
            	    n1=conditionalXOrExpression();

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
    // $ANTLR end "conditionalOrExpression"



    // $ANTLR start "conditionalXOrExpression"
    // Generator.g:1059:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndAndExp =null;

        ASTExpression n1 =null;


        try {
            // Generator.g:1060:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // Generator.g:1061:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression5025);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndAndExp;}

            // Generator.g:1062:5: (op= 'xor' n1= conditionalAndExpression )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==123) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // Generator.g:1062:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,123,FOLLOW_123_in_conditionalXOrExpression5038); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression5042);
            	    n1=conditionalAndExpression();

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
    // $ANTLR end "conditionalXOrExpression"



    // $ANTLR start "conditionalAndExpression"
    // Generator.g:1071:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nEqExp =null;

        ASTExpression n1 =null;


        try {
            // Generator.g:1072:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // Generator.g:1073:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression5086);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nEqExp;}

            // Generator.g:1074:5: (op= 'and' n1= equalityExpression )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==63) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // Generator.g:1074:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,63,FOLLOW_63_in_conditionalAndExpression5099); if (state.failed) return n;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression5103);
            	    n1=equalityExpression();

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
    // $ANTLR end "conditionalAndExpression"



    // $ANTLR start "equalityExpression"
    // Generator.g:1083:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nRelExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Generator.g:1085:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // Generator.g:1086:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression5151);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nRelExp;}

            // Generator.g:1087:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==EQUAL||LA110_0==NOT_EQUAL) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // Generator.g:1087:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression5180);
            	    n1=relationalExpression();

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
    // $ANTLR end "equalityExpression"



    // $ANTLR start "relationalExpression"
    // Generator.g:1097:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nAddiExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Generator.g:1099:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // Generator.g:1100:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression5229);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nAddiExp;}

            // Generator.g:1101:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( ((LA111_0 >= GREATER && LA111_0 <= GREATER_EQUAL)||(LA111_0 >= LESS && LA111_0 <= LESS_EQUAL)) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // Generator.g:1101:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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


            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression5265);
            	    n1=additiveExpression();

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
    // $ANTLR end "relationalExpression"



    // $ANTLR start "additiveExpression"
    // Generator.g:1111:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nMulExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Generator.g:1113:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // Generator.g:1114:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression5315);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nMulExp;}

            // Generator.g:1115:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==MINUS||LA112_0==PLUS) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // Generator.g:1115:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression5343);
            	    n1=multiplicativeExpression();

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
    // $ANTLR end "additiveExpression"



    // $ANTLR start "multiplicativeExpression"
    // Generator.g:1126:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Generator.g:1128:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // Generator.g:1129:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression5393);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nUnExp;}

            // Generator.g:1130:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==SLASH||LA113_0==STAR||LA113_0==77) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // Generator.g:1130:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==77 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression5425);
            	    n1=unaryExpression();

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
    // $ANTLR end "multiplicativeExpression"



    // $ANTLR start "unaryExpression"
    // Generator.g:1142:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression nPosExp =null;


         Token op = null; 
        try {
            // Generator.g:1144:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==MINUS||LA114_0==PLUS||LA114_0==97) ) {
                alt114=1;
            }
            else if ( (LA114_0==AT||LA114_0==HASH||(LA114_0 >= IDENT && LA114_0 <= INT)||LA114_0==LPAREN||LA114_0==REAL||(LA114_0 >= STAR && LA114_0 <= STRING)||LA114_0==45||LA114_0==47||LA114_0==52||(LA114_0 >= 54 && LA114_0 <= 55)||LA114_0==57||LA114_0==59||LA114_0==84||LA114_0==87||LA114_0==93||(LA114_0 >= 98 && LA114_0 <= 104)||(LA114_0 >= 113 && LA114_0 <= 114)||LA114_0==120) ) {
                alt114=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;

            }
            switch (alt114) {
                case 1 :
                    // Generator.g:1145:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // Generator.g:1145:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // Generator.g:1145:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) { op = input.LT(1); }

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==97 ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression5511);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }

                    }


                    }
                    break;
                case 2 :
                    // Generator.g:1149:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression5531);
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
    // Generator.g:1157:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nPrimExp =null;

        ASTExpression nPc =null;


         boolean arrow = false; 
        try {
            // Generator.g:1159:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // Generator.g:1160:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression5564);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nPrimExp; }

            // Generator.g:1161:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==DOT) ) {
                    int LA116_2 = input.LA(2);

                    if ( (LA116_2==IDENT) ) {
                        int LA116_4 = input.LA(3);

                        if ( (LA116_4==EOF||(LA116_4 >= ARROW && LA116_4 <= BAR)||(LA116_4 >= COMMA && LA116_4 <= EQUAL)||(LA116_4 >= GREATER && LA116_4 <= GREATER_EQUAL)||LA116_4==IDENT||(LA116_4 >= LBRACE && LA116_4 <= MINUS)||(LA116_4 >= NOT_EQUAL && LA116_4 <= PLUS)||(LA116_4 >= RBRACE && LA116_4 <= RBRACK)||(LA116_4 >= RPAREN && LA116_4 <= SLASH)||LA116_4==STAR||LA116_4==61||(LA116_4 >= 63 && LA116_4 <= 66)||(LA116_4 >= 70 && LA116_4 <= 71)||(LA116_4 >= 77 && LA116_4 <= 83)||(LA116_4 >= 88 && LA116_4 <= 89)||LA116_4==92||(LA116_4 >= 105 && LA116_4 <= 109)||LA116_4==112||LA116_4==115||(LA116_4 >= 117 && LA116_4 <= 118)||LA116_4==123) ) {
                            alt116=1;
                        }


                    }
                    else if ( (LA116_2==93||LA116_2==99||(LA116_2 >= 101 && LA116_2 <= 103)||(LA116_2 >= 113 && LA116_2 <= 114)) ) {
                        alt116=1;
                    }


                }
                else if ( (LA116_0==ARROW) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // Generator.g:1162:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // Generator.g:1162:6: ( ARROW | DOT )
            	    int alt115=2;
            	    int LA115_0 = input.LA(1);

            	    if ( (LA115_0==ARROW) ) {
            	        alt115=1;
            	    }
            	    else if ( (LA115_0==DOT) ) {
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
            	            // Generator.g:1162:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression5582); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = true; }

            	            }
            	            break;
            	        case 2 :
            	            // Generator.g:1162:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression5588); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = false; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression5599);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = nPc; }

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
    // $ANTLR end "postfixExpression"



    // $ANTLR start "primaryExpression"
    // Generator.g:1178:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? );
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
            // Generator.g:1179:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? )
            int alt120=7;
            switch ( input.LA(1) ) {
            case HASH:
            case INT:
            case REAL:
            case STAR:
            case STRING:
            case 45:
            case 47:
            case 52:
            case 54:
            case 55:
            case 57:
            case 59:
            case 84:
            case 98:
            case 100:
            case 104:
            case 120:
                {
                alt120=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt120=1;
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
                case 63:
                case 64:
                case 65:
                case 66:
                case 70:
                case 71:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 88:
                case 89:
                case 92:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 112:
                case 115:
                case 117:
                case 118:
                case 123:
                    {
                    alt120=3;
                    }
                    break;
                case DOT:
                    {
                    switch ( input.LA(3) ) {
                    case 62:
                        {
                        alt120=6;
                        }
                        break;
                    case 69:
                        {
                        alt120=7;
                        }
                        break;
                    case IDENT:
                    case 93:
                    case 99:
                    case 101:
                    case 102:
                    case 103:
                    case 113:
                    case 114:
                        {
                        alt120=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 120, 7, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 120, 2, input);

                    throw nvae;

                }

                }
                break;
            case AT:
                {
                alt120=2;
                }
                break;
            case 93:
            case 99:
            case 101:
            case 102:
            case 103:
            case 113:
            case 114:
                {
                alt120=3;
                }
                break;
            case LPAREN:
                {
                alt120=4;
                }
                break;
            case 87:
                {
                alt120=5;
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
                    // Generator.g:1180:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression5639);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nLit; }

                    }
                    break;
                case 2 :
                    // Generator.g:1181:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression5653);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nOr; }

                    }
                    break;
                case 3 :
                    // Generator.g:1182:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression5665);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPc; }

                    }
                    break;
                case 4 :
                    // Generator.g:1183:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression5676); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression5680);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression5682); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExp!=null?nExp.n:null); }

                    }
                    break;
                case 5 :
                    // Generator.g:1184:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression5694);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nIfExp; }

                    }
                    break;
                case 6 :
                    // Generator.g:1185:7: id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression5706); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression5708); if (state.failed) return n;

                    match(input,62,FOLLOW_62_in_primaryExpression5710); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }

                    // Generator.g:1187:9: ( AT 'pre' )?
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==AT) ) {
                        int LA117_1 = input.LA(2);

                        if ( (LA117_1==109) ) {
                            alt117=1;
                        }
                    }
                    switch (alt117) {
                        case 1 :
                            // Generator.g:1187:11: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression5733); if (state.failed) return n;

                            match(input,109,FOLLOW_109_in_primaryExpression5735); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setIsPre(); }

                            }
                            break;

                    }


                    // Generator.g:1188:9: ( LPAREN RPAREN )?
                    int alt118=2;
                    int LA118_0 = input.LA(1);

                    if ( (LA118_0==LPAREN) ) {
                        alt118=1;
                    }
                    switch (alt118) {
                        case 1 :
                            // Generator.g:1188:11: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression5753); if (state.failed) return n;

                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression5755); if (state.failed) return n;

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // Generator.g:1189:7: id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )?
                    {
                    id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression5768); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression5770); if (state.failed) return n;

                    match(input,69,FOLLOW_69_in_primaryExpression5772); if (state.failed) return n;

                    // Generator.g:1189:31: ( LPAREN idExp= expression RPAREN )
                    // Generator.g:1189:33: LPAREN idExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression5776); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression5780);
                    idExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression5782); if (state.failed) return n;

                    }


                    if ( state.backtracking==0 ) { n = new ASTObjectByUseIdExpression(id2, (idExp!=null?idExp.n:null)); }

                    // Generator.g:1191:7: ( AT 'pre' )?
                    int alt119=2;
                    int LA119_0 = input.LA(1);

                    if ( (LA119_0==AT) ) {
                        int LA119_1 = input.LA(2);

                        if ( (LA119_1==109) ) {
                            alt119=1;
                        }
                    }
                    switch (alt119) {
                        case 1 :
                            // Generator.g:1191:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression5802); if (state.failed) return n;

                            match(input,109,FOLLOW_109_in_primaryExpression5804); if (state.failed) return n;

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
    // Generator.g:1195:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;


        Token objectName=null;

        try {
            // Generator.g:1196:3: ( AT objectName= IDENT )
            // Generator.g:1197:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference5830); if (state.failed) return n;

            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference5838); if (state.failed) return n;

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
    // Generator.g:1211:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExpQuery =null;

        ASTExpression nExpIterate =null;

        GeneratorParser.operationExpression_return nExpOperation =null;

        ASTTypeArgExpression nExpType =null;

        ASTInStateExpression nExpInState =null;


        try {
            // Generator.g:1212:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] )
            int alt121=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA121_1 = input.LA(2);

                if ( (((( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))&&( input.LA(2) == LPAREN ))) ) {
                    alt121=1;
                }
                else if ( (true) ) {
                    alt121=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 121, 1, input);

                    throw nvae;

                }
                }
                break;
            case 93:
                {
                alt121=2;
                }
                break;
            case 99:
            case 102:
            case 103:
            case 113:
            case 114:
                {
                alt121=4;
                }
                break;
            case 101:
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
                    // Generator.g:1216:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }

                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }

                    pushFollow(FOLLOW_queryExpression_in_propertyCall5903);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpQuery; }

                    }
                    break;
                case 2 :
                    // Generator.g:1219:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall5916);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpIterate; }

                    }
                    break;
                case 3 :
                    // Generator.g:1220:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall5929);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExpOperation!=null?nExpOperation.n:null); }

                    }
                    break;
                case 4 :
                    // Generator.g:1221:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall5942);
                    nExpType=typeExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpType; }

                    }
                    break;
                case 5 :
                    // Generator.g:1222:7: nExpInState= inStateExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_inStateExpression_in_propertyCall5955);
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
    // Generator.g:1231:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTElemVarsDeclaration decls =null;

        GeneratorParser.expression_return nExp =null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // Generator.g:1232:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // Generator.g:1233:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression5990); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression5997); if (state.failed) return n;

            // Generator.g:1235:5: (decls= elemVarsDeclaration BAR )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==IDENT) ) {
                int LA122_1 = input.LA(2);

                if ( ((LA122_1 >= BAR && LA122_1 <= COLON)||LA122_1==COMMA) ) {
                    alt122=1;
                }
            }
            switch (alt122) {
                case 1 :
                    // Generator.g:1235:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression6008);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {decl = decls;}

                    match(input,BAR,FOLLOW_BAR_in_queryExpression6012); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_queryExpression6023);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression6029); if (state.failed) return n;

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
    // Generator.g:1249:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTElemVarsDeclaration decls =null;

        ASTVariableInitialization init =null;

        GeneratorParser.expression_return nExp =null;


        try {
            // Generator.g:1249:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // Generator.g:1250:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,93,FOLLOW_93_in_iterateExpression6061); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression6067); if (state.failed) return n;

            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression6075);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;

            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression6077); if (state.failed) return n;

            pushFollow(FOLLOW_variableInitialization_in_iterateExpression6085);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;

            match(input,BAR,FOLLOW_BAR_in_iterateExpression6087); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_iterateExpression6095);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression6101); if (state.failed) return n;

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
    // Generator.g:1271:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final GeneratorParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        GeneratorParser.operationExpression_return retval = new GeneratorParser.operationExpression_return();
        retval.start = input.LT(1);


        Token name=null;
        GeneratorParser.expression_return rolename =null;

        GeneratorParser.expression_return e =null;


        try {
            // Generator.g:1273:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // Generator.g:1274:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression6145); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }

            // Generator.g:1280:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==LBRACK) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // Generator.g:1280:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression6167); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_operationExpression6180);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    // Generator.g:1282:9: ( COMMA rolename= expression )*
                    loop123:
                    do {
                        int alt123=2;
                        int LA123_0 = input.LA(1);

                        if ( (LA123_0==COMMA) ) {
                            alt123=1;
                        }


                        switch (alt123) {
                    	case 1 :
                    	    // Generator.g:1282:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression6193); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_operationExpression6197);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    	    }
                    	    break;

                    	default :
                    	    break loop123;
                        }
                    } while (true);


                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression6209); if (state.failed) return retval;

                    // Generator.g:1285:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt125=2;
                    int LA125_0 = input.LA(1);

                    if ( (LA125_0==LBRACK) ) {
                        alt125=1;
                    }
                    switch (alt125) {
                        case 1 :
                            // Generator.g:1285:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression6226); if (state.failed) return retval;

                            pushFollow(FOLLOW_expression_in_operationExpression6241);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            // Generator.g:1287:11: ( COMMA rolename= expression )*
                            loop124:
                            do {
                                int alt124=2;
                                int LA124_0 = input.LA(1);

                                if ( (LA124_0==COMMA) ) {
                                    alt124=1;
                                }


                                switch (alt124) {
                            	case 1 :
                            	    // Generator.g:1287:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression6256); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression6260);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop124;
                                }
                            } while (true);


                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression6274); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            // Generator.g:1292:5: ( AT 'pre' )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==AT) ) {
                int LA127_1 = input.LA(2);

                if ( (LA127_1==109) ) {
                    alt127=1;
                }
            }
            switch (alt127) {
                case 1 :
                    // Generator.g:1292:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression6299); if (state.failed) return retval;

                    match(input,109,FOLLOW_109_in_operationExpression6301); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.setIsPre(); }

                    }
                    break;

            }


            // Generator.g:1294:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==LPAREN) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // Generator.g:1295:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression6326); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.hasParentheses(); }

                    // Generator.g:1296:7: (e= expression ( COMMA e= expression )* )?
                    int alt129=2;
                    int LA129_0 = input.LA(1);

                    if ( (LA129_0==AT||LA129_0==HASH||(LA129_0 >= IDENT && LA129_0 <= INT)||(LA129_0 >= LPAREN && LA129_0 <= MINUS)||LA129_0==PLUS||LA129_0==REAL||(LA129_0 >= STAR && LA129_0 <= STRING)||LA129_0==45||LA129_0==47||LA129_0==52||(LA129_0 >= 54 && LA129_0 <= 55)||LA129_0==57||LA129_0==59||LA129_0==84||LA129_0==87||(LA129_0 >= 93 && LA129_0 <= 94)||(LA129_0 >= 97 && LA129_0 <= 104)||(LA129_0 >= 113 && LA129_0 <= 114)||LA129_0==120) ) {
                        alt129=1;
                    }
                    switch (alt129) {
                        case 1 :
                            // Generator.g:1297:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression6347);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            // Generator.g:1298:7: ( COMMA e= expression )*
                            loop128:
                            do {
                                int alt128=2;
                                int LA128_0 = input.LA(1);

                                if ( (LA128_0==COMMA) ) {
                                    alt128=1;
                                }


                                switch (alt128) {
                            	case 1 :
                            	    // Generator.g:1298:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression6359); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression6363);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop128;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression6383); if (state.failed) return retval;

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
    // Generator.g:1305:1: inStateExpression[ASTExpression source, boolean followsArrow] returns [ASTInStateExpression n] : opToken= 'oclInState' LPAREN s= IDENT RPAREN ;
    public final ASTInStateExpression inStateExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTInStateExpression n = null;


        Token opToken=null;
        Token s=null;

        try {
            // Generator.g:1306:35: (opToken= 'oclInState' LPAREN s= IDENT RPAREN )
            // Generator.g:1307:4: opToken= 'oclInState' LPAREN s= IDENT RPAREN
            {
            opToken=(Token)match(input,101,FOLLOW_101_in_inStateExpression6420); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_inStateExpression6425); if (state.failed) return n;

            s=(Token)match(input,IDENT,FOLLOW_IDENT_in_inStateExpression6434); if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_inStateExpression6439); if (state.failed) return n;

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
    // Generator.g:1319:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;


        ASTType t =null;


         Token opToken = null; 
        try {
            // Generator.g:1322:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN )
            // Generator.g:1323:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) { opToken = input.LT(1); }

            if ( input.LA(1)==99||(input.LA(1) >= 102 && input.LA(1) <= 103)||(input.LA(1) >= 113 && input.LA(1) <= 114) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression6499); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_typeExpression6503);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression6505); if (state.failed) return n;

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
    // Generator.g:1334:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;


        Token var1=null;
        Token varN=null;
        ASTType t =null;

        ASTType tN =null;


        try {
            // Generator.g:1335:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // Generator.g:1336:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }

            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration6543); if (state.failed) return n;

            // Generator.g:1337:17: ( COLON t= type )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==COLON) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // Generator.g:1337:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration6546); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_elemVarsDeclaration6550);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}

            // Generator.g:1338:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==COMMA) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // Generator.g:1338:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration6560); if (state.failed) return n;

            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration6566); if (state.failed) return n;

            	    // Generator.g:1338:24: ( COLON tN= type )?
            	    int alt132=2;
            	    int LA132_0 = input.LA(1);

            	    if ( (LA132_0==COLON) ) {
            	        alt132=1;
            	    }
            	    switch (alt132) {
            	        case 1 :
            	            // Generator.g:1338:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration6569); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration6575);
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
    // $ANTLR end "elemVarsDeclaration"



    // $ANTLR start "variableInitialization"
    // Generator.g:1346:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;


        Token name=null;
        ASTType t =null;

        GeneratorParser.expression_return e =null;


        try {
            // Generator.g:1347:5: (name= IDENT COLON t= type EQUAL e= expression )
            // Generator.g:1348:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization6603); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableInitialization6605); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableInitialization6609);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization6611); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_variableInitialization6615);
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
    // Generator.g:1357:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        GeneratorParser.expression_return cond =null;

        GeneratorParser.expression_return t =null;

        GeneratorParser.expression_return e =null;


        try {
            // Generator.g:1358:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // Generator.g:1359:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,87,FOLLOW_87_in_ifExpression6647); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression6651);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,118,FOLLOW_118_in_ifExpression6653); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression6657);
            t=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,79,FOLLOW_79_in_ifExpression6659); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression6663);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,81,FOLLOW_81_in_ifExpression6665); if (state.failed) return n;

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
    // Generator.g:1378:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR );
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
            // Generator.g:1379:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR )
            int alt134=12;
            switch ( input.LA(1) ) {
            case 120:
                {
                alt134=1;
                }
                break;
            case 84:
                {
                alt134=2;
                }
                break;
            case INT:
                {
                alt134=3;
                }
                break;
            case REAL:
                {
                alt134=4;
                }
                break;
            case STRING:
                {
                alt134=5;
                }
                break;
            case HASH:
                {
                alt134=6;
                }
                break;
            case IDENT:
                {
                alt134=7;
                }
                break;
            case 45:
            case 52:
            case 54:
            case 55:
                {
                int LA134_8 = input.LA(2);

                if ( (LA134_8==LPAREN) ) {
                    alt134=9;
                }
                else if ( (LA134_8==LBRACE) ) {
                    alt134=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 134, 8, input);

                    throw nvae;

                }
                }
                break;
            case 47:
            case 100:
                {
                alt134=9;
                }
                break;
            case 59:
            case 98:
            case 104:
                {
                alt134=10;
                }
                break;
            case 57:
                {
                alt134=11;
                }
                break;
            case STAR:
                {
                alt134=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;

            }

            switch (alt134) {
                case 1 :
                    // Generator.g:1380:7: t= 'true'
                    {
                    t=(Token)match(input,120,FOLLOW_120_in_literal6704); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }

                    }
                    break;
                case 2 :
                    // Generator.g:1381:7: f= 'false'
                    {
                    f=(Token)match(input,84,FOLLOW_84_in_literal6718); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }

                    }
                    break;
                case 3 :
                    // Generator.g:1382:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal6731); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }

                    }
                    break;
                case 4 :
                    // Generator.g:1383:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal6746); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }

                    }
                    break;
                case 5 :
                    // Generator.g:1384:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal6760); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }

                    }
                    break;
                case 6 :
                    // Generator.g:1385:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal6770); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal6774); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}

                    }
                    break;
                case 7 :
                    // Generator.g:1386:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal6786); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal6788); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal6792); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }

                    }
                    break;
                case 8 :
                    // Generator.g:1387:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal6804);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nColIt; }

                    }
                    break;
                case 9 :
                    // Generator.g:1388:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal6816);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nEColIt; }

                    }
                    break;
                case 10 :
                    // Generator.g:1389:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal6828);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nUndLit; }

                    }
                    break;
                case 11 :
                    // Generator.g:1390:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal6840);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nTupleLit; }

                    }
                    break;
                case 12 :
                    // Generator.g:1391:7: un= STAR
                    {
                    un=(Token)match(input,STAR,FOLLOW_STAR_in_literal6852); if (state.failed) return n;

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
    // Generator.g:1399:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;


        ASTCollectionItem ci =null;


         Token op = null; 
        try {
            // Generator.g:1401:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // Generator.g:1402:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( input.LA(1)==45||input.LA(1)==52||(input.LA(1) >= 54 && input.LA(1) <= 55) ) {
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

            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral6919); if (state.failed) return n;

            // Generator.g:1406:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==AT||LA136_0==HASH||(LA136_0 >= IDENT && LA136_0 <= INT)||(LA136_0 >= LPAREN && LA136_0 <= MINUS)||LA136_0==PLUS||LA136_0==REAL||(LA136_0 >= STAR && LA136_0 <= STRING)||LA136_0==45||LA136_0==47||LA136_0==52||(LA136_0 >= 54 && LA136_0 <= 55)||LA136_0==57||LA136_0==59||LA136_0==84||LA136_0==87||(LA136_0 >= 93 && LA136_0 <= 94)||(LA136_0 >= 97 && LA136_0 <= 104)||(LA136_0 >= 113 && LA136_0 <= 114)||LA136_0==120) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // Generator.g:1407:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral6936);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addItem(ci); }

                    // Generator.g:1408:7: ( COMMA ci= collectionItem )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==COMMA) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // Generator.g:1408:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral6949); if (state.failed) return n;

                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral6953);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addItem(ci); }

                    	    }
                    	    break;

                    	default :
                    	    break loop135;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral6972); if (state.failed) return n;

            }

        }
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
    // Generator.g:1417:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;


        GeneratorParser.expression_return e =null;


         n = new ASTCollectionItem(); 
        try {
            // Generator.g:1419:5: (e= expression ( DOTDOT e= expression )? )
            // Generator.g:1420:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem7001);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setFirst((e!=null?e.n:null)); }

            // Generator.g:1421:5: ( DOTDOT e= expression )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==DOTDOT) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // Generator.g:1421:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem7012); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_collectionItem7016);
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
    // Generator.g:1431:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;


        ASTCollectionType t =null;


        try {
            // Generator.g:1432:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==100) ) {
                alt138=1;
            }
            else if ( (LA138_0==45||LA138_0==47||LA138_0==52||(LA138_0 >= 54 && LA138_0 <= 55)) ) {
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
                    // Generator.g:1433:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,100,FOLLOW_100_in_emptyCollectionLiteral7045); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral7047); if (state.failed) return n;

                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral7051);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral7053); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;
                case 2 :
                    // Generator.g:1436:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral7069);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral7071); if (state.failed) return n;

                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral7073); if (state.failed) return n;

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
    // Generator.g:1447:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;


        ASTType t =null;


        try {
            // Generator.g:1448:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt139=4;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt139=1;
                }
                break;
            case 59:
                {
                alt139=2;
                }
                break;
            case 98:
                {
                int LA139_3 = input.LA(2);

                if ( (LA139_3==LPAREN) ) {
                    alt139=3;
                }
                else if ( (LA139_3==EOF||(LA139_3 >= ARROW && LA139_3 <= BAR)||(LA139_3 >= COMMA && LA139_3 <= EQUAL)||(LA139_3 >= GREATER && LA139_3 <= GREATER_EQUAL)||LA139_3==IDENT||LA139_3==LBRACE||(LA139_3 >= LESS && LA139_3 <= LESS_EQUAL)||LA139_3==MINUS||(LA139_3 >= NOT_EQUAL && LA139_3 <= PLUS)||(LA139_3 >= RBRACE && LA139_3 <= RBRACK)||(LA139_3 >= RPAREN && LA139_3 <= SLASH)||LA139_3==STAR||LA139_3==61||(LA139_3 >= 63 && LA139_3 <= 66)||(LA139_3 >= 70 && LA139_3 <= 71)||(LA139_3 >= 77 && LA139_3 <= 83)||(LA139_3 >= 88 && LA139_3 <= 89)||LA139_3==92||(LA139_3 >= 105 && LA139_3 <= 109)||LA139_3==112||LA139_3==115||(LA139_3 >= 117 && LA139_3 <= 118)||LA139_3==123) ) {
                    alt139=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 139, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;

            }

            switch (alt139) {
                case 1 :
                    // Generator.g:1449:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,104,FOLLOW_104_in_undefinedLiteral7103); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral7105); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral7109);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral7111); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 2 :
                    // Generator.g:1452:5: 'Undefined'
                    {
                    match(input,59,FOLLOW_59_in_undefinedLiteral7125); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;
                case 3 :
                    // Generator.g:1455:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,98,FOLLOW_98_in_undefinedLiteral7139); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral7141); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral7145);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral7147); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 4 :
                    // Generator.g:1458:5: 'null'
                    {
                    match(input,98,FOLLOW_98_in_undefinedLiteral7161); if (state.failed) return n;

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
    // Generator.g:1468:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;


        ASTTupleItem ti =null;


         List tiList = new ArrayList(); 
        try {
            // Generator.g:1470:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // Generator.g:1471:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,57,FOLLOW_57_in_tupleLiteral7200); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral7206); if (state.failed) return n;

            pushFollow(FOLLOW_tupleItem_in_tupleLiteral7214);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tiList.add(ti); }

            // Generator.g:1474:5: ( COMMA ti= tupleItem )*
            loop140:
            do {
                int alt140=2;
                int LA140_0 = input.LA(1);

                if ( (LA140_0==COMMA) ) {
                    alt140=1;
                }


                switch (alt140) {
            	case 1 :
            	    // Generator.g:1474:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral7225); if (state.failed) return n;

            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral7229);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tiList.add(ti); }

            	    }
            	    break;

            	default :
            	    break loop140;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral7240); if (state.failed) return n;

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
    // Generator.g:1482:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;


        Token name=null;
        ASTType t =null;

        GeneratorParser.expression_return e =null;


        try {
            // Generator.g:1483:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // Generator.g:1484:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem7271); if (state.failed) return n;

            // Generator.g:1485:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==COLON) ) {
                int LA141_1 = input.LA(2);

                if ( (synpred1_Generator()) ) {
                    alt141=1;
                }
                else if ( (true) ) {
                    alt141=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 141, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA141_0==EQUAL) ) {
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
                    // Generator.g:1488:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem7310); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_tupleItem7314);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem7316); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_tupleItem7320);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, (e!=null?e.n:null)); }

                    }
                    break;
                case 2 :
                    // Generator.g:1491:7: ( COLON | EQUAL ) e= expression
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


                    pushFollow(FOLLOW_expression_in_tupleItem7352);
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
    // Generator.g:1502:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;


        ASTSimpleType nTSimple =null;

        ASTCollectionType nTCollection =null;

        ASTTupleType nTTuple =null;


         Token tok = null; 
        try {
            // Generator.g:1504:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
            // Generator.g:1505:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }

            // Generator.g:1506:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            int alt142=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt142=1;
                }
                break;
            case 45:
            case 47:
            case 52:
            case 54:
            case 55:
                {
                alt142=2;
                }
                break;
            case 57:
                {
                alt142=3;
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
                    // Generator.g:1507:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type7418);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 2 :
                    // Generator.g:1508:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type7430);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 3 :
                    // Generator.g:1509:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type7442);
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
    // Generator.g:1514:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;


        ASTType nT =null;


        try {
            // Generator.g:1515:5: (nT= type EOF )
            // Generator.g:1516:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly7474);
            nT=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_typeOnly7476); if (state.failed) return n;

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
    // Generator.g:1526:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;


        Token name=null;

        try {
            // Generator.g:1527:5: (name= IDENT )
            // Generator.g:1528:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType7504); if (state.failed) return n;

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
    // Generator.g:1536:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;


        ASTType elemType =null;


         Token op = null; 
        try {
            // Generator.g:1538:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // Generator.g:1539:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( input.LA(1)==45||input.LA(1)==47||input.LA(1)==52||(input.LA(1) >= 54 && input.LA(1) <= 55) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType7569); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_collectionType7573);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType7575); if (state.failed) return n;

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
    // Generator.g:1549:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;


        ASTTuplePart tp =null;


         List tpList = new ArrayList(); 
        try {
            // Generator.g:1551:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // Generator.g:1552:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,57,FOLLOW_57_in_tupleType7609); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType7611); if (state.failed) return n;

            pushFollow(FOLLOW_tuplePart_in_tupleType7620);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tpList.add(tp); }

            // Generator.g:1554:5: ( COMMA tp= tuplePart )*
            loop143:
            do {
                int alt143=2;
                int LA143_0 = input.LA(1);

                if ( (LA143_0==COMMA) ) {
                    alt143=1;
                }


                switch (alt143) {
            	case 1 :
            	    // Generator.g:1554:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType7631); if (state.failed) return n;

            	    pushFollow(FOLLOW_tuplePart_in_tupleType7635);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tpList.add(tp); }

            	    }
            	    break;

            	default :
            	    break loop143;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType7647); if (state.failed) return n;

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
    // Generator.g:1563:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Generator.g:1564:5: (name= IDENT COLON t= type )
            // Generator.g:1565:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart7679); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_tuplePart7681); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_tuplePart7685);
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
    // Generator.g:1604:1: statOnly returns [ASTStatement n] : s= stat EOF ;
    public final ASTStatement statOnly() throws RecognitionException {
        ASTStatement n = null;


        GeneratorParser.stat_return s =null;


        try {
            // Generator.g:1605:3: (s= stat EOF )
            // Generator.g:1606:3: s= stat EOF
            {
            pushFollow(FOLLOW_stat_in_statOnly7734);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_statOnly7738); if (state.failed) return n;

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
    // Generator.g:1616:1: stat returns [ASTStatement n] : s= singleStat ( SEMI s2= singleStat )* ;
    public final GeneratorParser.stat_return stat() throws RecognitionException {
        GeneratorParser.stat_return retval = new GeneratorParser.stat_return();
        retval.start = input.LT(1);


        ASTStatement s =null;

        ASTStatement s2 =null;



          ASTSequenceStatement seq = new ASTSequenceStatement(((Token)retval.start));

        try {
            // Generator.g:1620:3: (s= singleStat ( SEMI s2= singleStat )* )
            // Generator.g:1621:3: s= singleStat ( SEMI s2= singleStat )*
            {
            pushFollow(FOLLOW_singleStat_in_stat7773);
            s=singleStat();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {seq.addStatement(s);}

            // Generator.g:1622:3: ( SEMI s2= singleStat )*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==SEMI) ) {
                    alt144=1;
                }


                switch (alt144) {
            	case 1 :
            	    // Generator.g:1623:5: SEMI s2= singleStat
            	    {
            	    match(input,SEMI,FOLLOW_SEMI_in_stat7785); if (state.failed) return retval;

            	    pushFollow(FOLLOW_singleStat_in_stat7795);
            	    s2=singleStat();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {seq.addStatement(s2); }

            	    }
            	    break;

            	default :
            	    break loop144;
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
    // Generator.g:1635:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat );
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
            // Generator.g:1636:5: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat )
            int alt145=11;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==EOF||LA145_0==SEMI||(LA145_0 >= 79 && LA145_0 <= 80)) ) {
                alt145=1;
            }
            else if ( (LA145_0==94) && (synpred2_Generator())) {
                alt145=2;
            }
            else if ( (LA145_0==MINUS||LA145_0==PLUS||LA145_0==97) && (synpred2_Generator())) {
                alt145=2;
            }
            else if ( (LA145_0==120) && (synpred2_Generator())) {
                alt145=2;
            }
            else if ( (LA145_0==84) && (synpred2_Generator())) {
                alt145=2;
            }
            else if ( (LA145_0==INT) && (synpred2_Generator())) {
                alt145=2;
            }
            else if ( (LA145_0==REAL) && (synpred2_Generator())) {
                alt145=2;
            }
            else if ( (LA145_0==STRING) && (synpred2_Generator())) {
                alt145=2;
            }
            else if ( (LA145_0==HASH) && (synpred2_Generator())) {
                alt145=2;
            }
            else if ( (LA145_0==IDENT) ) {
                int LA145_13 = input.LA(2);

                if ( (synpred2_Generator()) ) {
                    alt145=2;
                }
                else if ( (true) ) {
                    alt145=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 145, 13, input);

                    throw nvae;

                }
            }
            else if ( (LA145_0==45||LA145_0==52||(LA145_0 >= 54 && LA145_0 <= 55)) && (synpred2_Generator())) {
                alt145=2;
            }
            else if ( (LA145_0==100) && (synpred2_Generator())) {
                alt145=2;
            }
            else if ( (LA145_0==47) && (synpred2_Generator())) {
                alt145=2;
            }
            else if ( (LA145_0==104) && (synpred2_Generator())) {
                alt145=2;
            }
            else if ( (LA145_0==59) && (synpred2_Generator())) {
                alt145=2;
            }
            else if ( (LA145_0==98) && (synpred2_Generator())) {
                alt145=2;
            }
            else if ( (LA145_0==57) && (synpred2_Generator())) {
                alt145=2;
            }
            else if ( (LA145_0==STAR) && (synpred2_Generator())) {
                alt145=2;
            }
            else if ( (LA145_0==AT) && (synpred2_Generator())) {
                alt145=2;
            }
            else if ( (LA145_0==93) && (synpred2_Generator())) {
                alt145=2;
            }
            else if ( (LA145_0==99||(LA145_0 >= 102 && LA145_0 <= 103)||(LA145_0 >= 113 && LA145_0 <= 114)) && (synpred2_Generator())) {
                alt145=2;
            }
            else if ( (LA145_0==101) && (synpred2_Generator())) {
                alt145=2;
            }
            else if ( (LA145_0==LPAREN) && (synpred2_Generator())) {
                alt145=2;
            }
            else if ( (LA145_0==87) ) {
                int LA145_27 = input.LA(2);

                if ( (synpred2_Generator()) ) {
                    alt145=2;
                }
                else if ( (true) ) {
                    alt145=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 145, 27, input);

                    throw nvae;

                }
            }
            else if ( (LA145_0==96) ) {
                alt145=4;
            }
            else if ( (LA145_0==76) ) {
                alt145=5;
            }
            else if ( (LA145_0==90) ) {
                alt145=6;
            }
            else if ( (LA145_0==75) ) {
                alt145=7;
            }
            else if ( (LA145_0==85) ) {
                alt145=9;
            }
            else if ( (LA145_0==122) ) {
                alt145=10;
            }
            else if ( (LA145_0==67) ) {
                alt145=11;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;

            }
            switch (alt145) {
                case 1 :
                    // Generator.g:1637:5: emp= emptyStat
                    {
                    pushFollow(FOLLOW_emptyStat_in_singleStat7835);
                    emp=emptyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = emp; }

                    }
                    break;
                case 2 :
                    // Generator.g:1639:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
                    {
                    pushFollow(FOLLOW_statStartingWithExpr_in_singleStat7861);
                    sse=statStartingWithExpr();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (sse!=null?sse.n:null); }

                    }
                    break;
                case 3 :
                    // Generator.g:1640:5: vas= varAssignStat
                    {
                    pushFollow(FOLLOW_varAssignStat_in_singleStat7873);
                    vas=varAssignStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = vas; }

                    }
                    break;
                case 4 :
                    // Generator.g:1641:5: ocs= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_singleStat7887);
                    ocs=objCreateStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ocs!=null?ocs.n:null); }

                    }
                    break;
                case 5 :
                    // Generator.g:1642:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleStat7901);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ods!=null?ods.n:null); }

                    }
                    break;
                case 6 :
                    // Generator.g:1643:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleStat7914);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lis!=null?lis.n:null); }

                    }
                    break;
                case 7 :
                    // Generator.g:1644:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleStat7931);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lds!=null?lds.n:null); }

                    }
                    break;
                case 8 :
                    // Generator.g:1645:5: ces= condExStat
                    {
                    pushFollow(FOLLOW_condExStat_in_singleStat7948);
                    ces=condExStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ces!=null?ces.n:null); }

                    }
                    break;
                case 9 :
                    // Generator.g:1646:5: its= iterStat
                    {
                    pushFollow(FOLLOW_iterStat_in_singleStat7965);
                    its=iterStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (its!=null?its.n:null); }

                    }
                    break;
                case 10 :
                    // Generator.g:1648:5: whs= whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_singleStat7987);
                    whs=whileStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (whs!=null?whs.n:null); }

                    }
                    break;
                case 11 :
                    // Generator.g:1649:5: blk= blockStat
                    {
                    pushFollow(FOLLOW_blockStat_in_singleStat8005);
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
    // Generator.g:1656:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
    public final ASTEmptyStatement emptyStat() throws RecognitionException {
        ASTEmptyStatement n = null;


        try {
            // Generator.g:1657:3: ( nothing )
            // Generator.g:1658:3: nothing
            {
            pushFollow(FOLLOW_nothing_in_emptyStat8032);
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
    // Generator.g:1663:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
    public final GeneratorParser.statStartingWithExpr_return statStartingWithExpr() throws RecognitionException {
        GeneratorParser.statStartingWithExpr_return retval = new GeneratorParser.statStartingWithExpr_return();
        retval.start = input.LT(1);


        ASTExpression expr =null;

        ASTAttributeAssignmentStatement aas =null;


        try {
            // Generator.g:1664:3: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
            // Generator.g:1665:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
            {
            pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr8058);
            expr=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            // Generator.g:1666:3: (aas= attAssignStat[$expr.n] )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==DOT) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // Generator.g:1667:5: aas= attAssignStat[$expr.n]
                    {
                    pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr8072);
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
    // Generator.g:1679:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
    public final ASTStatement varAssignStat() throws RecognitionException {
        ASTStatement n = null;


        Token varName=null;
        ASTRValue rVal =null;


        try {
            // Generator.g:1680:3: (varName= IDENT COLON_EQUAL rVal= rValue )
            // Generator.g:1681:3: varName= IDENT COLON_EQUAL rVal= rValue
            {
            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat8110); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat8114); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_varAssignStat8122);
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
    // Generator.g:1693:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
    public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
        ASTAttributeAssignmentStatement n = null;


        Token attName=null;
        ASTRValue r =null;


        try {
            // Generator.g:1694:3: ( DOT attName= IDENT COLON_EQUAL r= rValue )
            // Generator.g:1695:3: DOT attName= IDENT COLON_EQUAL r= rValue
            {
            match(input,DOT,FOLLOW_DOT_in_attAssignStat8146); if (state.failed) return n;

            attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat8155); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat8159); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_attAssignStat8167);
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
    // Generator.g:1707:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
    public final GeneratorParser.objCreateStat_return objCreateStat() throws RecognitionException {
        GeneratorParser.objCreateStat_return retval = new GeneratorParser.objCreateStat_return();
        retval.start = input.LT(1);


        ASTSimpleType ident =null;

        ASTExpression objName =null;

        GeneratorParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // Generator.g:1708:3: ( 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
            // Generator.g:1709:3: 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            {
            match(input,96,FOLLOW_96_in_objCreateStat8193); if (state.failed) return retval;

            pushFollow(FOLLOW_simpleType_in_objCreateStat8201);
            ident=simpleType();

            state._fsp--;
            if (state.failed) return retval;

            // Generator.g:1711:3: ( LPAREN (objName= inSoilExpression )? RPAREN )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==LPAREN) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // Generator.g:1712:5: LPAREN (objName= inSoilExpression )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat8211); if (state.failed) return retval;

                    // Generator.g:1713:7: (objName= inSoilExpression )?
                    int alt147=2;
                    int LA147_0 = input.LA(1);

                    if ( (LA147_0==AT||LA147_0==HASH||(LA147_0 >= IDENT && LA147_0 <= INT)||(LA147_0 >= LPAREN && LA147_0 <= MINUS)||LA147_0==PLUS||LA147_0==REAL||(LA147_0 >= STAR && LA147_0 <= STRING)||LA147_0==45||LA147_0==47||LA147_0==52||(LA147_0 >= 54 && LA147_0 <= 55)||LA147_0==57||LA147_0==59||LA147_0==84||LA147_0==87||(LA147_0 >= 93 && LA147_0 <= 94)||(LA147_0 >= 97 && LA147_0 <= 104)||(LA147_0 >= 113 && LA147_0 <= 114)||LA147_0==120) ) {
                        alt147=1;
                    }
                    switch (alt147) {
                        case 1 :
                            // Generator.g:1713:8: objName= inSoilExpression
                            {
                            pushFollow(FOLLOW_inSoilExpression_in_objCreateStat8224);
                            objName=inSoilExpression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat8232); if (state.failed) return retval;

                    }
                    break;

            }


            // Generator.g:1717:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==68) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // Generator.g:1718:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
                    {
                    match(input,68,FOLLOW_68_in_objCreateStat8250); if (state.failed) return retval;

                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat8258); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat8272);
                    p=rValListMin2WithOptionalQualifiers();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat8280); if (state.failed) return retval;

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
    // Generator.g:1737:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
    public final GeneratorParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
        GeneratorParser.objDestroyStat_return retval = new GeneratorParser.objDestroyStat_return();
        retval.start = input.LT(1);


        List<ASTExpression> el =null;


        try {
            // Generator.g:1738:3: ( 'destroy' el= exprListMin1 )
            // Generator.g:1739:3: 'destroy' el= exprListMin1
            {
            match(input,76,FOLLOW_76_in_objDestroyStat8316); if (state.failed) return retval;

            pushFollow(FOLLOW_exprListMin1_in_objDestroyStat8324);
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
    // Generator.g:1758:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
    public final GeneratorParser.lnkInsStat_return lnkInsStat() throws RecognitionException {
        GeneratorParser.lnkInsStat_return retval = new GeneratorParser.lnkInsStat_return();
        retval.start = input.LT(1);


        Token ass=null;
        GeneratorParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // Generator.g:1759:3: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
            // Generator.g:1760:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
            {
            match(input,90,FOLLOW_90_in_lnkInsStat8350); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat8354); if (state.failed) return retval;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat8364);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat8368); if (state.failed) return retval;

            match(input,91,FOLLOW_91_in_lnkInsStat8372); if (state.failed) return retval;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat8380); if (state.failed) return retval;

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
    // Generator.g:1770:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
    public final GeneratorParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
        GeneratorParser.rValListMin2WithOptionalQualifiers_return retval = new GeneratorParser.rValListMin2WithOptionalQualifiers_return();
        retval.start = input.LT(1);


        ASTRValue r =null;

        List<ASTRValue> qualifierValues =null;



          retval.participans = new ArrayList<ASTRValue>();
          retval.qualifiers = new ArrayList<List<ASTRValue>>();
          List<ASTRValue> currentQualifiers = Collections.emptyList();

        try {
            // Generator.g:1776:3: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
            // Generator.g:1777:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8409);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add(r); }

            // Generator.g:1778:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==LBRACE) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // Generator.g:1779:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8420); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8429);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8436); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers8452); if (state.failed) return retval;

            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8463);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add(r); }

            // Generator.g:1791:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==LBRACE) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // Generator.g:1792:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8474); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8483);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8490); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            // Generator.g:1801:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            loop153:
            do {
                int alt153=2;
                int LA153_0 = input.LA(1);

                if ( (LA153_0==COMMA) ) {
                    alt153=1;
                }


                switch (alt153) {
            	case 1 :
            	    // Generator.g:1802:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers8512); if (state.failed) return retval;

            	    pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8527);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.participans.add(r); }

            	    // Generator.g:1806:5: ( LBRACE qualifierValues= rValList RBRACE )?
            	    int alt152=2;
            	    int LA152_0 = input.LA(1);

            	    if ( (LA152_0==LBRACE) ) {
            	        alt152=1;
            	    }
            	    switch (alt152) {
            	        case 1 :
            	            // Generator.g:1807:6: LBRACE qualifierValues= rValList RBRACE
            	            {
            	            match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8547); if (state.failed) return retval;

            	            pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8558);
            	            qualifierValues=rValList();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

            	            match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8567); if (state.failed) return retval;

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
            	    break loop153;
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
    // Generator.g:1822:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
    public final GeneratorParser.lnkDelStat_return lnkDelStat() throws RecognitionException {
        GeneratorParser.lnkDelStat_return retval = new GeneratorParser.lnkDelStat_return();
        retval.start = input.LT(1);


        Token ass=null;
        GeneratorParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // Generator.g:1823:3: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
            // Generator.g:1824:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
            {
            match(input,75,FOLLOW_75_in_lnkDelStat8608); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat8612); if (state.failed) return retval;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat8622);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat8626); if (state.failed) return retval;

            match(input,86,FOLLOW_86_in_lnkDelStat8630); if (state.failed) return retval;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat8639); if (state.failed) return retval;

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
    // Generator.g:1838:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' ;
    public final GeneratorParser.condExStat_return condExStat() throws RecognitionException {
        GeneratorParser.condExStat_return retval = new GeneratorParser.condExStat_return();
        retval.start = input.LT(1);


        ASTExpression con =null;

        ASTStatement ts =null;

        ASTStatement es =null;



          ASTStatement elseStat = new ASTEmptyStatement();

        try {
            // Generator.g:1842:3: ( 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' )
            // Generator.g:1843:3: 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end'
            {
            match(input,87,FOLLOW_87_in_condExStat8670); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_condExStat8679);
            con=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,118,FOLLOW_118_in_condExStat8683); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat8692);
            ts=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            // Generator.g:1847:3: ( 'else' es= statOrImplicitBlock )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==79) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // Generator.g:1848:5: 'else' es= statOrImplicitBlock
                    {
                    match(input,79,FOLLOW_79_in_condExStat8703); if (state.failed) return retval;

                    pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat8715);
                    es=statOrImplicitBlock();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { elseStat = es; }

                    }
                    break;

            }


            match(input,80,FOLLOW_80_in_condExStat8727); if (state.failed) return retval;

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
    // Generator.g:1859:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final GeneratorParser.iterStat_return iterStat() throws RecognitionException {
        GeneratorParser.iterStat_return retval = new GeneratorParser.iterStat_return();
        retval.start = input.LT(1);


        Token var=null;
        ASTExpression set =null;

        ASTStatement s =null;


        try {
            // Generator.g:1860:3: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // Generator.g:1861:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,85,FOLLOW_85_in_iterStat8752); if (state.failed) return retval;

            var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat8760); if (state.failed) return retval;

            match(input,89,FOLLOW_89_in_iterStat8764); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_iterStat8772);
            set=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,78,FOLLOW_78_in_iterStat8776); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_iterStat8784);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            match(input,80,FOLLOW_80_in_iterStat8789); if (state.failed) return retval;

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
    // Generator.g:1876:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final GeneratorParser.whileStat_return whileStat() throws RecognitionException {
        GeneratorParser.whileStat_return retval = new GeneratorParser.whileStat_return();
        retval.start = input.LT(1);


        ASTExpression cond =null;

        ASTStatement s =null;


        try {
            // Generator.g:1877:3: ( 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // Generator.g:1878:3: 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,122,FOLLOW_122_in_whileStat8815); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_whileStat8823);
            cond=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,78,FOLLOW_78_in_whileStat8827); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_whileStat8835);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            match(input,80,FOLLOW_80_in_whileStat8840); if (state.failed) return retval;

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
    // Generator.g:1890:1: blockStat returns [ASTBlockStatement n] : 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' ;
    public final GeneratorParser.blockStat_return blockStat() throws RecognitionException {
        GeneratorParser.blockStat_return retval = new GeneratorParser.blockStat_return();
        retval.start = input.LT(1);


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        GeneratorParser.stat_return s =null;



          retval.n = new ASTBlockStatement(((Token)retval.start), org.tzi.use.config.Options.explicitVariableDeclarations);

        try {
            // Generator.g:1894:2: ( 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' )
            // Generator.g:1895:2: 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end'
            {
            match(input,67,FOLLOW_67_in_blockStat8870); if (state.failed) return retval;

            // Generator.g:1896:2: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==73) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // Generator.g:1896:4: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI
                    {
                    match(input,73,FOLLOW_73_in_blockStat8875); if (state.failed) return retval;

                    pushFollow(FOLLOW_variableDeclaration_in_blockStat8881);
                    vd=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}

                    // Generator.g:1896:73: ( COMMA vd1= variableDeclaration )*
                    loop155:
                    do {
                        int alt155=2;
                        int LA155_0 = input.LA(1);

                        if ( (LA155_0==COMMA) ) {
                            alt155=1;
                        }


                        switch (alt155) {
                    	case 1 :
                    	    // Generator.g:1896:75: COMMA vd1= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_blockStat8887); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_variableDeclaration_in_blockStat8893);
                    	    vd1=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}

                    	    }
                    	    break;

                    	default :
                    	    break loop155;
                        }
                    } while (true);


                    match(input,SEMI,FOLLOW_SEMI_in_blockStat8900); if (state.failed) return retval;

                    }
                    break;

            }


            pushFollow(FOLLOW_stat_in_blockStat8910);
            s=stat();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n.setBody((s!=null?s.n:null)); }

            match(input,80,FOLLOW_80_in_blockStat8915); if (state.failed) return retval;

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
    // Generator.g:1905:1: implicitBlockStat returns [ASTBlockStatement n] : 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat ;
    public final GeneratorParser.implicitBlockStat_return implicitBlockStat() throws RecognitionException {
        GeneratorParser.implicitBlockStat_return retval = new GeneratorParser.implicitBlockStat_return();
        retval.start = input.LT(1);


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        GeneratorParser.stat_return s =null;



          retval.n = new ASTBlockStatement(((Token)retval.start), false);

        try {
            // Generator.g:1909:3: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat )
            // Generator.g:1910:3: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat
            {
            match(input,73,FOLLOW_73_in_implicitBlockStat8941); if (state.failed) return retval;

            pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat8947);
            vd=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}

            // Generator.g:1910:72: ( COMMA vd1= variableDeclaration )*
            loop157:
            do {
                int alt157=2;
                int LA157_0 = input.LA(1);

                if ( (LA157_0==COMMA) ) {
                    alt157=1;
                }


                switch (alt157) {
            	case 1 :
            	    // Generator.g:1910:74: COMMA vd1= variableDeclaration
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_implicitBlockStat8953); if (state.failed) return retval;

            	    pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat8959);
            	    vd1=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}

            	    }
            	    break;

            	default :
            	    break loop157;
                }
            } while (true);


            match(input,SEMI,FOLLOW_SEMI_in_implicitBlockStat8966); if (state.failed) return retval;

            pushFollow(FOLLOW_stat_in_implicitBlockStat8974);
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
    // Generator.g:1914:1: statOrImplicitBlock returns [ASTStatement n] : (s1= stat |s2= implicitBlockStat ) ;
    public final ASTStatement statOrImplicitBlock() throws RecognitionException {
        ASTStatement n = null;


        GeneratorParser.stat_return s1 =null;

        GeneratorParser.implicitBlockStat_return s2 =null;


        try {
            // Generator.g:1915:3: ( (s1= stat |s2= implicitBlockStat ) )
            // Generator.g:1916:3: (s1= stat |s2= implicitBlockStat )
            {
            // Generator.g:1916:3: (s1= stat |s2= implicitBlockStat )
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==AT||LA158_0==HASH||(LA158_0 >= IDENT && LA158_0 <= INT)||(LA158_0 >= LPAREN && LA158_0 <= MINUS)||LA158_0==PLUS||LA158_0==REAL||LA158_0==SEMI||(LA158_0 >= STAR && LA158_0 <= STRING)||LA158_0==45||LA158_0==47||LA158_0==52||(LA158_0 >= 54 && LA158_0 <= 55)||LA158_0==57||LA158_0==59||LA158_0==67||(LA158_0 >= 75 && LA158_0 <= 76)||(LA158_0 >= 79 && LA158_0 <= 80)||(LA158_0 >= 84 && LA158_0 <= 85)||LA158_0==87||LA158_0==90||(LA158_0 >= 93 && LA158_0 <= 94)||(LA158_0 >= 96 && LA158_0 <= 104)||(LA158_0 >= 113 && LA158_0 <= 114)||LA158_0==120||LA158_0==122) ) {
                alt158=1;
            }
            else if ( (LA158_0==73) ) {
                alt158=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 158, 0, input);

                throw nvae;

            }
            switch (alt158) {
                case 1 :
                    // Generator.g:1916:4: s1= stat
                    {
                    pushFollow(FOLLOW_stat_in_statOrImplicitBlock8997);
                    s1=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s1!=null?s1.n:null); }

                    }
                    break;
                case 2 :
                    // Generator.g:1916:31: s2= implicitBlockStat
                    {
                    pushFollow(FOLLOW_implicitBlockStat_in_statOrImplicitBlock9007);
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
    // Generator.g:1930:1: nothing :;
    public final void nothing() throws RecognitionException {
        try {
            // Generator.g:1931:1: ()
            // Generator.g:1932:1: 
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
    // Generator.g:1938:1: rValue returns [ASTRValue n] : (e= inSoilExpression |oc= objCreateStat );
    public final ASTRValue rValue() throws RecognitionException {
        ASTRValue n = null;


        ASTExpression e =null;

        GeneratorParser.objCreateStat_return oc =null;


        try {
            // Generator.g:1939:5: (e= inSoilExpression |oc= objCreateStat )
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==AT||LA159_0==HASH||(LA159_0 >= IDENT && LA159_0 <= INT)||(LA159_0 >= LPAREN && LA159_0 <= MINUS)||LA159_0==PLUS||LA159_0==REAL||(LA159_0 >= STAR && LA159_0 <= STRING)||LA159_0==45||LA159_0==47||LA159_0==52||(LA159_0 >= 54 && LA159_0 <= 55)||LA159_0==57||LA159_0==59||LA159_0==84||LA159_0==87||(LA159_0 >= 93 && LA159_0 <= 94)||(LA159_0 >= 97 && LA159_0 <= 104)||(LA159_0 >= 113 && LA159_0 <= 114)||LA159_0==120) ) {
                alt159=1;
            }
            else if ( (LA159_0==96) ) {
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
                    // Generator.g:1940:5: e= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_rValue9053);
                    e=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRValueExpressionOrOpCall(e); }

                    }
                    break;
                case 2 :
                    // Generator.g:1941:5: oc= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_rValue9065);
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
    // Generator.g:1954:1: rValList returns [List<ASTRValue> n] : ( nothing |rl= rValListMin1 );
    public final List<ASTRValue> rValList() throws RecognitionException {
        List<ASTRValue> n = null;


        List<ASTRValue> rl =null;


        try {
            // Generator.g:1955:3: ( nothing |rl= rValListMin1 )
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==RBRACE) ) {
                alt160=1;
            }
            else if ( (LA160_0==AT||LA160_0==HASH||(LA160_0 >= IDENT && LA160_0 <= INT)||(LA160_0 >= LPAREN && LA160_0 <= MINUS)||LA160_0==PLUS||LA160_0==REAL||(LA160_0 >= STAR && LA160_0 <= STRING)||LA160_0==45||LA160_0==47||LA160_0==52||(LA160_0 >= 54 && LA160_0 <= 55)||LA160_0==57||LA160_0==59||LA160_0==84||LA160_0==87||(LA160_0 >= 93 && LA160_0 <= 94)||(LA160_0 >= 96 && LA160_0 <= 104)||(LA160_0 >= 113 && LA160_0 <= 114)||LA160_0==120) ) {
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
                    // Generator.g:1956:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_rValList9088);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = Collections.<ASTRValue>emptyList(); }

                    }
                    break;
                case 2 :
                    // Generator.g:1959:3: rl= rValListMin1
                    {
                    pushFollow(FOLLOW_rValListMin1_in_rValList9115);
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
    // Generator.g:1967:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin1() throws RecognitionException {
        List<ASTRValue> n = null;


        ASTRValue r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // Generator.g:1971:3: (r= rValue ( COMMA r= rValue )* )
            // Generator.g:1972:3: r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin19148);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            // Generator.g:1974:3: ( COMMA r= rValue )*
            loop161:
            do {
                int alt161=2;
                int LA161_0 = input.LA(1);

                if ( (LA161_0==COMMA) ) {
                    alt161=1;
                }


                switch (alt161) {
            	case 1 :
            	    // Generator.g:1975:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin19162); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin19172);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add(r); }

            	    }
            	    break;

            	default :
            	    break loop161;
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
    // Generator.g:1985:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin2() throws RecognitionException {
        List<ASTRValue> n = null;


        ASTRValue r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // Generator.g:1989:3: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
            // Generator.g:1990:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin29211);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin29219); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_rValListMin29227);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            // Generator.g:1995:3: ( COMMA r= rValue )*
            loop162:
            do {
                int alt162=2;
                int LA162_0 = input.LA(1);

                if ( (LA162_0==COMMA) ) {
                    alt162=1;
                }


                switch (alt162) {
            	case 1 :
            	    // Generator.g:1996:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin29241); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin29251);
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
    // $ANTLR end "rValListMin2"



    // $ANTLR start "inSoilExpression"
    // Generator.g:2006:1: inSoilExpression returns [ASTExpression n] : e= expression ;
    public final ASTExpression inSoilExpression() throws RecognitionException {
        ASTExpression n = null;


        GeneratorParser.expression_return e =null;


        try {
            // Generator.g:2007:3: (e= expression )
            // Generator.g:2008:3: e= expression
            {
            pushFollow(FOLLOW_expression_in_inSoilExpression9285);
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
    // Generator.g:2017:1: exprList returns [List<ASTExpression> n] : ( nothing |el= exprListMin1 );
    public final List<ASTExpression> exprList() throws RecognitionException {
        List<ASTExpression> n = null;


        List<ASTExpression> el =null;


        try {
            // Generator.g:2018:3: ( nothing |el= exprListMin1 )
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==EOF) ) {
                alt163=1;
            }
            else if ( (LA163_0==AT||LA163_0==HASH||(LA163_0 >= IDENT && LA163_0 <= INT)||(LA163_0 >= LPAREN && LA163_0 <= MINUS)||LA163_0==PLUS||LA163_0==REAL||(LA163_0 >= STAR && LA163_0 <= STRING)||LA163_0==45||LA163_0==47||LA163_0==52||(LA163_0 >= 54 && LA163_0 <= 55)||LA163_0==57||LA163_0==59||LA163_0==84||LA163_0==87||(LA163_0 >= 93 && LA163_0 <= 94)||(LA163_0 >= 97 && LA163_0 <= 104)||(LA163_0 >= 113 && LA163_0 <= 114)||LA163_0==120) ) {
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
                    // Generator.g:2019:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_exprList9314);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<ASTExpression>(); }

                    }
                    break;
                case 2 :
                    // Generator.g:2022:3: el= exprListMin1
                    {
                    pushFollow(FOLLOW_exprListMin1_in_exprList9332);
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
    // Generator.g:2030:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin1() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // Generator.g:2034:3: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // Generator.g:2035:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin19365);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // Generator.g:2037:3: ( COMMA e= inSoilExpression )*
            loop164:
            do {
                int alt164=2;
                int LA164_0 = input.LA(1);

                if ( (LA164_0==COMMA) ) {
                    alt164=1;
                }


                switch (alt164) {
            	case 1 :
            	    // Generator.g:2038:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin19380); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin19390);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

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
    // $ANTLR end "exprListMin1"



    // $ANTLR start "exprListMin2"
    // Generator.g:2048:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin2() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // Generator.g:2052:3: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // Generator.g:2053:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin29430);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            match(input,COMMA,FOLLOW_COMMA_in_exprListMin29438); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_exprListMin29446);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // Generator.g:2058:3: ( COMMA e= inSoilExpression )*
            loop165:
            do {
                int alt165=2;
                int LA165_0 = input.LA(1);

                if ( (LA165_0==COMMA) ) {
                    alt165=1;
                }


                switch (alt165) {
            	case 1 :
            	    // Generator.g:2059:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin29460); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin29470);
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
    // $ANTLR end "exprListMin2"



    // $ANTLR start "identList"
    // Generator.g:2069:1: identList returns [List<String> n] : ( nothing |il= identListMin1 );
    public final List<String> identList() throws RecognitionException {
        List<String> n = null;


        List<String> il =null;


        try {
            // Generator.g:2070:3: ( nothing |il= identListMin1 )
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==EOF||LA166_0==RBRACE||LA166_0==SEMI||(LA166_0 >= 79 && LA166_0 <= 80)) ) {
                alt166=1;
            }
            else if ( (LA166_0==IDENT) ) {
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
                    // Generator.g:2071:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_identList9500);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<String>(); }

                    }
                    break;
                case 2 :
                    // Generator.g:2074:3: il= identListMin1
                    {
                    pushFollow(FOLLOW_identListMin1_in_identList9517);
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
    // Generator.g:2082:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
    public final List<String> identListMin1() throws RecognitionException {
        List<String> n = null;


        Token id=null;


          n = new ArrayList<String>();

        try {
            // Generator.g:2086:3: (id= IDENT ( COMMA id= IDENT )* )
            // Generator.g:2087:3: id= IDENT ( COMMA id= IDENT )*
            {
            id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin19551); if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((id!=null?id.getText():null)); }

            // Generator.g:2089:3: ( COMMA id= IDENT )*
            loop167:
            do {
                int alt167=2;
                int LA167_0 = input.LA(1);

                if ( (LA167_0==COMMA) ) {
                    alt167=1;
                }


                switch (alt167) {
            	case 1 :
            	    // Generator.g:2090:5: COMMA id= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identListMin19565); if (state.failed) return n;

            	    id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin19575); if (state.failed) return n;

            	    if ( state.backtracking==0 ) {
            	        n.add((id!=null?id.getText():null)); }

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
    // $ANTLR end "identListMin1"

    // $ANTLR start synpred1_Generator
    public final void synpred1_Generator_fragment() throws RecognitionException {
        // Generator.g:1488:7: ( COLON type EQUAL )
        // Generator.g:1488:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred1_Generator7301); if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred1_Generator7303);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_Generator7305); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Generator

    // $ANTLR start synpred2_Generator
    public final void synpred2_Generator_fragment() throws RecognitionException {
        // Generator.g:1639:5: ( statStartingWithExpr )
        // Generator.g:1639:6: statStartingWithExpr
        {
        pushFollow(FOLLOW_statStartingWithExpr_in_synpred2_Generator7853);
        statStartingWithExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Generator

    // Delegated rules

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


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA80 dfa80 = new DFA80(this);
    static final String DFA21_eotS =
        "\25\uffff";
    static final String DFA21_eofS =
        "\1\1\24\uffff";
    static final String DFA21_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\23\2\uffff\1\25\1\27\1\12\1\uffff\1"+
        "\15\1\23\1\5\1\35\1\15\1\23\1\12\1\35\1\27\1\12";
    static final String DFA21_maxS =
        "\1\122\1\uffff\1\74\1\uffff\1\23\2\uffff\1\31\1\163\1\44\1\uffff"+
        "\1\15\1\23\1\122\1\35\1\15\1\23\1\44\1\35\1\163\1\44";
    static final String DFA21_acceptS =
        "\1\uffff\1\5\1\uffff\1\1\1\uffff\1\3\1\4\3\uffff\1\2\12\uffff";
    static final String DFA21_specialS =
        "\25\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\2\15\uffff\1\4\51\uffff\1\3\2\uffff\2\3\4\uffff\1\5\13\uffff"+
            "\1\6",
            "",
            "\1\7\34\uffff\1\3\11\uffff\1\3\1\uffff\1\3",
            "",
            "\1\10",
            "",
            "",
            "\1\3\3\uffff\1\11",
            "\1\3\52\uffff\1\3\1\uffff\1\12\1\uffff\1\3\11\uffff\1\3\30"+
            "\uffff\1\3\11\uffff\1\3",
            "\1\14\10\uffff\1\13\20\uffff\1\15",
            "",
            "\1\16",
            "\1\17",
            "\1\2\15\uffff\1\20\51\uffff\1\3\2\uffff\2\3\20\uffff\1\6",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\14\31\uffff\1\15",
            "\1\24",
            "\1\3\52\uffff\1\3\1\uffff\1\12\1\uffff\1\3\11\uffff\1\3\30"+
            "\uffff\1\3\11\uffff\1\3",
            "\1\14\31\uffff\1\15"
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
            return "()* loopback of 401:5: ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )*";
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
        "\1\122\1\uffff\1\74\1\23\1\31\1\134\1\74\2\uffff\3\15\1\107\1\35"+
        "\1\112\1\70\4\74\1\23\1\13\2\74";
    static final String DFA20_acceptS =
        "\1\uffff\1\3\5\uffff\1\2\1\1\17\uffff";
    static final String DFA20_specialS =
        "\30\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\2\15\uffff\1\1\51\uffff\1\1\2\uffff\2\1\4\uffff\1\1\1\3\12"+
            "\uffff\1\1",
            "",
            "\1\4\34\uffff\1\1\11\uffff\1\1\1\uffff\1\1",
            "\1\5",
            "\1\6\3\uffff\1\1",
            "\1\10\1\uffff\1\10\1\7\1\uffff\1\10\10\uffff\1\10\51\uffff"+
            "\1\10\2\uffff\2\10\4\uffff\2\10\12\uffff\2\10\10\uffff\1\10",
            "\1\14\16\uffff\1\11\11\uffff\1\13\1\uffff\1\12",
            "",
            "",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\1\63\uffff\1\10",
            "\1\20",
            "\1\22\65\uffff\1\21",
            "\1\24\53\uffff\1\23\6\uffff\1\23",
            "\1\14\16\uffff\1\11\11\uffff\1\13\1\uffff\1\12",
            "\1\14\16\uffff\1\11\11\uffff\1\13\1\uffff\1\12",
            "\1\14\16\uffff\1\11\11\uffff\1\13\1\uffff\1\12",
            "\1\14\16\uffff\1\11\11\uffff\1\13\1\uffff\1\12",
            "\1\25",
            "\1\26",
            "\1\27\11\uffff\1\27\1\uffff\1\27",
            "\1\14\16\uffff\1\11\11\uffff\1\13\1\uffff\1\12"
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
        "\1\163\1\uffff\1\23\1\uffff\1\31\1\44\1\15\1\23\1\155\1\35\1\15"+
        "\1\44\1\35\1\44";
    static final String DFA53_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\12\uffff";
    static final String DFA53_specialS =
        "\16\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\2\15\uffff\1\1\21\uffff\1\1\40\uffff\1\1\11\uffff\1\1\33"+
            "\uffff\2\3\5\uffff\1\1",
            "",
            "\1\4",
            "",
            "\1\5",
            "\1\7\10\uffff\1\6\20\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\2\15\uffff\1\1\130\uffff\2\3",
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
            return "()* loopback of 587:5: (ppc= prePostClause )*";
        }
    }
    static final String DFA74_eotS =
        "\36\uffff";
    static final String DFA74_eofS =
        "\1\1\35\uffff";
    static final String DFA74_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\25\3\15\1\12\1\35\1\24\1\5\1\15\1\23"+
        "\5\5\1\23\1\35\1\15\1\23\1\13\1\12\1\35\1\25\1\60\1\12\1\5";
    static final String DFA74_maxS =
        "\1\134\1\uffff\1\74\1\uffff\1\31\3\15\1\44\1\35\1\112\1\70\1\15"+
        "\1\23\5\134\1\23\1\35\1\15\1\74\1\13\1\44\1\35\1\31\1\74\1\44\1"+
        "\134";
    static final String DFA74_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\32\uffff";
    static final String DFA74_specialS =
        "\36\uffff}>";
    static final String[] DFA74_transitionS = {
            "\1\2\15\uffff\1\1\51\uffff\1\1\2\uffff\2\1\4\uffff\2\1\12\uffff"+
            "\1\1\1\3\10\uffff\1\3",
            "",
            "\1\4\34\uffff\1\5\11\uffff\1\7\1\uffff\1\6",
            "",
            "\1\1\3\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\15\10\uffff\1\14\20\uffff\1\16",
            "\1\17",
            "\1\21\65\uffff\1\20",
            "\1\23\53\uffff\1\22\6\uffff\1\22",
            "\1\24",
            "\1\25",
            "\1\26\15\uffff\1\1\51\uffff\1\1\2\uffff\2\1\20\uffff\1\1\11"+
            "\uffff\1\3",
            "\1\3\15\uffff\1\1\110\uffff\1\3",
            "\1\3\15\uffff\1\1\110\uffff\1\3",
            "\1\3\15\uffff\1\1\110\uffff\1\3",
            "\1\3\15\uffff\1\1\110\uffff\1\3",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32\34\uffff\1\1\11\uffff\1\1\1\uffff\1\1",
            "\1\33",
            "\1\15\31\uffff\1\16",
            "\1\34",
            "\1\1\3\uffff\1\10",
            "\1\35\11\uffff\1\35\1\uffff\1\35",
            "\1\15\31\uffff\1\16",
            "\1\3\15\uffff\1\1\110\uffff\1\3"
    };

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "()* loopback of 752:5: (inv= invariantClause )*";
        }
    }
    static final String DFA80_eotS =
        "\20\uffff";
    static final String DFA80_eofS =
        "\1\1\17\uffff";
    static final String DFA80_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\25\1\12\1\15\1\23\1\5\1\35\1\15\1\23"+
        "\1\12\1\35\1\25\1\12";
    static final String DFA80_maxS =
        "\1\155\1\uffff\1\74\1\uffff\1\31\1\44\1\15\1\23\1\155\1\35\1\15"+
        "\1\74\1\44\1\35\1\31\1\44";
    static final String DFA80_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\14\uffff";
    static final String DFA80_specialS =
        "\20\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\2\15\uffff\1\1\51\uffff\1\1\2\uffff\2\1\4\uffff\2\1\12\uffff"+
            "\1\1\31\uffff\2\3",
            "",
            "\1\4\34\uffff\1\1\11\uffff\1\1\1\uffff\1\1",
            "",
            "\1\1\3\uffff\1\5",
            "\1\7\10\uffff\1\6\20\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\13\15\uffff\1\1\51\uffff\1\1\2\uffff\2\1\20\uffff\1\1\31"+
            "\uffff\2\3",
            "\1\14",
            "\1\15",
            "\1\16\34\uffff\1\1\11\uffff\1\1\1\uffff\1\1",
            "\1\7\31\uffff\1\10",
            "\1\17",
            "\1\1\3\uffff\1\5",
            "\1\7\31\uffff\1\10"
    };

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "()+ loopback of 781:5: (ppc= prePostClause )+";
        }
    }
 

    public static final BitSet FOLLOW_invariant_in_invariantListOnly80 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000080L});
    public static final BitSet FOLLOW_EOF_in_invariantListOnly91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_in_procedureListOnly136 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_EOF_in_procedureListOnly151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_procedure179 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_procedure183 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_procedure185 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_variableDeclarationList_in_procedure189 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_procedure191 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000008L});
    public static final BitSet FOLLOW_121_in_procedure199 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_variableDeclarationList_in_procedure203 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_procedure205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_procedure214 = new BitSet(new long[]{0x000C500000480000L,0x0000000000A10000L});
    public static final BitSet FOLLOW_instructionList_in_procedure218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_procedure220 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_procedure222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList260 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_variableDeclarationList271 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList275 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_instruction_in_instructionList319 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_instructionList321 = new BitSet(new long[]{0x000C500000480002L,0x0000000000A00000L});
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
    public static final BitSet FOLLOW_85_in_loop601 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_loop605 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_loop607 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_oclExpression_in_loop611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_loop613 = new BitSet(new long[]{0x000C500000480000L,0x0000000000A10000L});
    public static final BitSet FOLLOW_instructionList_in_loop624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_loop626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ifThenElse662 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_oclExpression_in_ifThenElse666 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ifThenElse677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ifThenElse679 = new BitSet(new long[]{0x000C500000480000L,0x0000000000A10000L});
    public static final BitSet FOLLOW_instructionList_in_ifThenElse683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ifThenElse685 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ifThenElse696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ifThenElse698 = new BitSet(new long[]{0x000C500000480000L,0x0000000000A10000L});
    public static final BitSet FOLLOW_instructionList_in_ifThenElse702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ifThenElse704 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_LBRACK_in_oclExpression1231 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
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
    public static final BitSet FOLLOW_LPAREN_in_procedureCallOnly1353 = new BitSet(new long[]{0x0AD0A318861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_procedureCallOnly1364 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_procedureCallOnly1374 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_procedureCallOnly1378 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_procedureCallOnly1392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_procedureCallOnly1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_model1427 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_model1433 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_model1437 = new BitSet(new long[]{0x2000000000080020L,0x0000000000040043L});
    public static final BitSet FOLLOW_generalClassifierDefinition_in_model1449 = new BitSet(new long[]{0x2000000000080020L,0x0000000000040043L});
    public static final BitSet FOLLOW_associationDefinition_in_model1462 = new BitSet(new long[]{0x2000000000080020L,0x0000000000040043L});
    public static final BitSet FOLLOW_70_in_model1476 = new BitSet(new long[]{0x2000000000080020L,0x00000000000400C3L});
    public static final BitSet FOLLOW_invariant_in_model1494 = new BitSet(new long[]{0x2000000000080020L,0x00000000000400C3L});
    public static final BitSet FOLLOW_prePost_in_model1515 = new BitSet(new long[]{0x2000000000080020L,0x00000000000400C3L});
    public static final BitSet FOLLOW_enumTypeDefinition_in_model1555 = new BitSet(new long[]{0x2000000000080020L,0x0000000000040043L});
    public static final BitSet FOLLOW_EOF_in_model1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_enumTypeDefinition1598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_enumTypeDefinition1604 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_enumTypeDefinition1608 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_enumTypeDefinition1610 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_enumTypeDefinition1614 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_enumTypeDefinition1616 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_enumTypeDefinition1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_generalClassifierDefinition1658 = new BitSet(new long[]{0x2000000000080020L,0x0000000000000003L});
    public static final BitSet FOLLOW_61_in_generalClassifierDefinition1666 = new BitSet(new long[]{0x0000000000080020L,0x0000000000000003L});
    public static final BitSet FOLLOW_classDefinition_in_generalClassifierDefinition1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_associationClassDefinition_in_generalClassifierDefinition1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signalDefinition_in_generalClassifierDefinition1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_annotation_in_classDefinition1831 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_line_annotation_in_classDefinition1837 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyClass_in_classDefinition1847 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_classDefinition1851 = new BitSet(new long[]{0x0000000000800000L,0x0008020000010044L});
    public static final BitSet FOLLOW_LESS_in_classDefinition1861 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_classDefinition1865 = new BitSet(new long[]{0x0000000000000000L,0x0008020000010044L});
    public static final BitSet FOLLOW_66_in_classDefinition1878 = new BitSet(new long[]{0x0000000000080020L,0x0008020000010040L});
    public static final BitSet FOLLOW_attributeDefinition_in_classDefinition1891 = new BitSet(new long[]{0x0000000000080020L,0x0008020000010040L});
    public static final BitSet FOLLOW_105_in_classDefinition1912 = new BitSet(new long[]{0x0000000000080020L,0x0008000000010040L});
    public static final BitSet FOLLOW_operationDefinition_in_classDefinition1925 = new BitSet(new long[]{0x0000000000080020L,0x0008000000010040L});
    public static final BitSet FOLLOW_70_in_classDefinition1946 = new BitSet(new long[]{0x0000000000000020L,0x0008000010090000L});
    public static final BitSet FOLLOW_invariantClause_in_classDefinition1966 = new BitSet(new long[]{0x0000000000000020L,0x0008000010090000L});
    public static final BitSet FOLLOW_115_in_classDefinition1992 = new BitSet(new long[]{0x0000000000000000L,0x0000800000010000L});
    public static final BitSet FOLLOW_stateMachine_in_classDefinition2012 = new BitSet(new long[]{0x0000000000000000L,0x0000800000010000L});
    public static final BitSet FOLLOW_80_in_classDefinition2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_associationClassDefinition2069 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationClassDefinition2095 = new BitSet(new long[]{0x0000000000880000L,0x0008020000010054L});
    public static final BitSet FOLLOW_LESS_in_associationClassDefinition2105 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_associationClassDefinition2109 = new BitSet(new long[]{0x0000000000080000L,0x0008020000010054L});
    public static final BitSet FOLLOW_68_in_associationClassDefinition2121 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition2129 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition2141 = new BitSet(new long[]{0x0000000000080020L,0x0008020000010044L});
    public static final BitSet FOLLOW_66_in_associationClassDefinition2161 = new BitSet(new long[]{0x0000000000080020L,0x0008020000010040L});
    public static final BitSet FOLLOW_attributeDefinition_in_associationClassDefinition2174 = new BitSet(new long[]{0x0000000000080020L,0x0008020000010040L});
    public static final BitSet FOLLOW_105_in_associationClassDefinition2195 = new BitSet(new long[]{0x0000000000080020L,0x0008000000010040L});
    public static final BitSet FOLLOW_operationDefinition_in_associationClassDefinition2208 = new BitSet(new long[]{0x0000000000080020L,0x0008000000010040L});
    public static final BitSet FOLLOW_70_in_associationClassDefinition2229 = new BitSet(new long[]{0x0000000000080020L,0x0008000010090000L});
    public static final BitSet FOLLOW_invariantClause_in_associationClassDefinition2249 = new BitSet(new long[]{0x0000000000080020L,0x0008000010090000L});
    public static final BitSet FOLLOW_115_in_associationClassDefinition2275 = new BitSet(new long[]{0x0000000000080000L,0x0000800000010000L});
    public static final BitSet FOLLOW_stateMachine_in_associationClassDefinition2295 = new BitSet(new long[]{0x0000000000080000L,0x0000800000010000L});
    public static final BitSet FOLLOW_keyAggregation_in_associationClassDefinition2336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_keyComposition_in_associationClassDefinition2340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_associationClassDefinition2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_attributeDefinition2391 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attributeDefinition2399 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_attributeDefinition2401 = new BitSet(new long[]{0x02D0A00000080000L});
    public static final BitSet FOLLOW_type_in_attributeDefinition2405 = new BitSet(new long[]{0x0000002000080002L});
    public static final BitSet FOLLOW_keyDerive_in_attributeDefinition2429 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_keyDerived_in_attributeDefinition2431 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_set_in_attributeDefinition2434 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_attributeDefinition2444 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_keyInit_in_attributeDefinition2464 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_set_in_attributeDefinition2468 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_attributeDefinition2480 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_attributeDefinition2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_operationDefinition2525 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_operationDefinition2535 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_paramList_in_operationDefinition2545 = new BitSet(new long[]{0x00000020000020A2L,0x0000300000000008L});
    public static final BitSet FOLLOW_COLON_in_operationDefinition2559 = new BitSet(new long[]{0x02D0A00000080000L});
    public static final BitSet FOLLOW_type_in_operationDefinition2565 = new BitSet(new long[]{0x0000002000002022L,0x0000300000000008L});
    public static final BitSet FOLLOW_EQUAL_in_operationDefinition2593 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_operationDefinition2599 = new BitSet(new long[]{0x0000002000000022L,0x0000300000000000L});
    public static final BitSet FOLLOW_blockStat_in_operationDefinition2621 = new BitSet(new long[]{0x0000002000000022L,0x0000300000000000L});
    public static final BitSet FOLLOW_prePostClause_in_operationDefinition2643 = new BitSet(new long[]{0x0000002000000022L,0x0000300000000000L});
    public static final BitSet FOLLOW_SEMI_in_operationDefinition2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_associationDefinition2687 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyAssociation_in_associationDefinition2701 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyAggregation_in_associationDefinition2705 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyComposition_in_associationDefinition2709 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationDefinition2719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_associationDefinition2727 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationDefinition2735 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationDefinition2747 = new BitSet(new long[]{0x0000000000080020L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_associationDefinition2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_associationEnd2783 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd2791 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LBRACK_in_associationEnd2793 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_multiplicity_in_associationEnd2797 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_associationEnd2799 = new BitSet(new long[]{0x0000002000080002L,0x0021080000000000L});
    public static final BitSet FOLLOW_keyRole_in_associationEnd2810 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd2814 = new BitSet(new long[]{0x0000002000080002L,0x0021080000000000L});
    public static final BitSet FOLLOW_107_in_associationEnd2835 = new BitSet(new long[]{0x0000002000080002L,0x0021080000000000L});
    public static final BitSet FOLLOW_117_in_associationEnd2847 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd2851 = new BitSet(new long[]{0x0000002000080002L,0x0021080000000000L});
    public static final BitSet FOLLOW_keyUnion_in_associationEnd2863 = new BitSet(new long[]{0x0000002000080002L,0x0021080000000000L});
    public static final BitSet FOLLOW_112_in_associationEnd2875 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd2879 = new BitSet(new long[]{0x0000002000080002L,0x0021080000000000L});
    public static final BitSet FOLLOW_keyDerived_in_associationEnd2892 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_keyDerive_in_associationEnd2894 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_LPAREN_in_associationEnd2899 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_associationEnd2905 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_associationEnd2907 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_associationEnd2911 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_associationEnd2915 = new BitSet(new long[]{0x0000002000080002L,0x0021080000000000L});
    public static final BitSet FOLLOW_keyQualifier_in_associationEnd2927 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_paramList_in_associationEnd2933 = new BitSet(new long[]{0x0000002000080002L,0x0021080000000000L});
    public static final BitSet FOLLOW_SEMI_in_associationEnd2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicityRange_in_multiplicity2985 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_multiplicity2995 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_multiplicityRange_in_multiplicity2999 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange3028 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_multiplicityRange3038 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_multiplicitySpec3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicitySpec3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_annotation_in_annotationSpec3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_annotation_in_annotationSpec3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_block_annotation3144 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_block_annotation3146 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_block_annotation3148 = new BitSet(new long[]{0x1401000200000000L});
    public static final BitSet FOLLOW_annotation_tag_in_block_annotation3153 = new BitSet(new long[]{0x1401000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_block_annotation3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_line_annotation3180 = new BitSet(new long[]{0x1401000000000000L});
    public static final BitSet FOLLOW_annotation_tag_in_line_annotation3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_comment_in_annotation_tag3199 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotation_tag3201 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_NON_OCL_STRING_in_annotation_tag3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_weight_in_annotation_tag3212 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotation_tag3214 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000400L});
    public static final BitSet FOLLOW_annotation_def_in_annotation_tag3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_annotation_tag3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_type_in_annotation_tag3231 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotation_tag3233 = new BitSet(new long[]{0x0102000000000020L});
    public static final BitSet FOLLOW_annotation_enum_type_in_annotation_tag3236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_ref_in_annotation_tag3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_annotation_comment3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_annotation_weight3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_annotation_type3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_annotation_override3291 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_annotation_override3293 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_annotation_override3295 = new BitSet(new long[]{0x1401000000000000L});
    public static final BitSet FOLLOW_annotation_term_in_annotation_override3297 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_annotation_override3299 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_annotation_override3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_tag_in_annotation_term3318 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_annotation_term3322 = new BitSet(new long[]{0x1401000000000000L});
    public static final BitSet FOLLOW_annotation_tag_in_annotation_term3324 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_AT_in_annotation_ref3336 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_annotation_ref3338 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_annotation_ref3340 = new BitSet(new long[]{0x1401000000000000L});
    public static final BitSet FOLLOW_annotation_predefined_in_annotation_ref3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_annotation_def3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_annotation_in_invariant3397 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_invariant3408 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_invariant3418 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_COMMA_in_invariant3430 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_invariant3434 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_COLON_in_invariant3442 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_invariant3454 = new BitSet(new long[]{0x0000000000000022L,0x0000000010080000L});
    public static final BitSet FOLLOW_invariantClause_in_invariant3466 = new BitSet(new long[]{0x0000000000000022L,0x0000000010080000L});
    public static final BitSet FOLLOW_line_annotation_in_invariantClause3498 = new BitSet(new long[]{0x0000000000000020L,0x0000000010000000L});
    public static final BitSet FOLLOW_annotationSet_in_invariantClause3508 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_invariantClause3515 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_IDENT_in_invariantClause3521 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_invariantClause3526 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_invariantClause3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_invariantClause3547 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_invariantClause3549 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_IDENT_in_invariantClause3555 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_invariantClause3560 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_invariantClause3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_prePost3597 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_prePost3601 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_prePost3603 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_prePost3607 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_paramList_in_prePost3611 = new BitSet(new long[]{0x00000000000000A0L,0x0000300000000000L});
    public static final BitSet FOLLOW_COLON_in_prePost3615 = new BitSet(new long[]{0x02D0A00000080000L});
    public static final BitSet FOLLOW_type_in_prePost3619 = new BitSet(new long[]{0x0000000000000020L,0x0000300000000000L});
    public static final BitSet FOLLOW_prePostClause_in_prePost3638 = new BitSet(new long[]{0x0000000000000022L,0x0000300000000000L});
    public static final BitSet FOLLOW_annotationSet_in_prePostClause3672 = new BitSet(new long[]{0x0000000000000000L,0x0000300000000000L});
    public static final BitSet FOLLOW_set_in_prePostClause3684 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_IDENT_in_prePostClause3699 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_prePostClause3704 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_prePostClause3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_annotationSet3735 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_annotation3754 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_annotation3758 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_annotation3764 = new BitSet(new long[]{0x0000001000080400L});
    public static final BitSet FOLLOW_annotationValues_in_annotation3773 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_annotation3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationValue_in_annotationValues3801 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_annotationValues3809 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_annotationValue_in_annotationValues3813 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_annotationValue3832 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotationValue3837 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_NON_OCL_STRING_in_annotationValue3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_stateMachine3873 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_stateMachine3906 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_stateMachine3919 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_stateDefinition_in_stateMachine3935 = new BitSet(new long[]{0x0000000000080000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_stateMachine3945 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_transitionDefinition_in_stateMachine3961 = new BitSet(new long[]{0x0000000000080000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_stateMachine3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_stateDefinition3987 = new BitSet(new long[]{0x0000000000400082L});
    public static final BitSet FOLLOW_COLON_in_stateDefinition3995 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_stateDefinition3999 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_LBRACK_in_stateDefinition4010 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_stateDefinition4016 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_stateDefinition4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_transitionDefinition4039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ARROW_in_transitionDefinition4041 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_transitionDefinition4045 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_LBRACE_in_transitionDefinition4055 = new BitSet(new long[]{0x0000000000480000L,0x0000000000000100L});
    public static final BitSet FOLLOW_LBRACK_in_transitionDefinition4065 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_transitionDefinition4069 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_transitionDefinition4073 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_event_in_transitionDefinition4097 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_IDENT_in_transitionDefinition4113 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_transitionDefinition4117 = new BitSet(new long[]{0x0000001002000000L});
    public static final BitSet FOLLOW_paramList_in_transitionDefinition4122 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_transitionDefinition4129 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_LBRACK_in_transitionDefinition4146 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_transitionDefinition4150 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_transitionDefinition4154 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_transitionDefinition4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_event4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keySignal_in_signalDefinition4204 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_signalDefinition4208 = new BitSet(new long[]{0x0000000000800000L,0x0000000000010044L});
    public static final BitSet FOLLOW_LESS_in_signalDefinition4223 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_signalDefinition4227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010044L});
    public static final BitSet FOLLOW_66_in_signalDefinition4240 = new BitSet(new long[]{0x0000000000080020L,0x0000000000010040L});
    public static final BitSet FOLLOW_attributeDefinition_in_signalDefinition4253 = new BitSet(new long[]{0x0000000000080020L,0x0000000000010040L});
    public static final BitSet FOLLOW_70_in_signalDefinition4274 = new BitSet(new long[]{0x0000000000000020L,0x0000000010090000L});
    public static final BitSet FOLLOW_invariantClause_in_signalDefinition4294 = new BitSet(new long[]{0x0000000000000020L,0x0000000010090000L});
    public static final BitSet FOLLOW_80_in_signalDefinition4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyUnion4336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyAssociation4350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyRole4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyComposition4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyAggregation4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyClass4402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keySignal4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyDerived4428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyDerive4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyInit4454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyQualifier4470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly4498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly4500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_expression4548 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression4559 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression4563 = new BitSet(new long[]{0x02D0A00000080000L});
    public static final BitSet FOLLOW_type_in_expression4567 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression4572 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_expression4576 = new BitSet(new long[]{0x0000000000000400L,0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_expression4614 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression4626 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression4630 = new BitSet(new long[]{0x02D0A00000080000L});
    public static final BitSet FOLLOW_type_in_expression4634 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression4639 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_expression4643 = new BitSet(new long[]{0x0000000000000400L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_expression4684 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression4700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList4733 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList4750 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_paramList4762 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList4766 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_paramList4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList4815 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_idList4825 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_idList4829 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration4860 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration4862 = new BitSet(new long[]{0x02D0A00000080000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration4866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression4902 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_conditionalImpliesExpression4915 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE20900000L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression4919 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression4964 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_conditionalOrExpression4977 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE20900000L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression4981 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression5025 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_conditionalXOrExpression5038 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE20900000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression5042 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression5086 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_conditionalAndExpression5099 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE20900000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression5103 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression5151 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_set_in_equalityExpression5170 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE20900000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression5180 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression5229 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_set_in_relationalExpression5247 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE20900000L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression5265 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression5315 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression5333 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE20900000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression5343 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression5393 = new BitSet(new long[]{0x0000014000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression5411 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE20900000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression5425 = new BitSet(new long[]{0x0000014000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_set_in_unaryExpression5487 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE20900000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression5511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression5564 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression5582 = new BitSet(new long[]{0x0000000000080000L,0x000600E820000000L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression5588 = new BitSet(new long[]{0x0000000000080000L,0x000600E820000000L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression5599 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_literal_in_primaryExpression5639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression5653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression5665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression5676 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression5680 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression5682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression5694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression5706 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression5708 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_primaryExpression5710 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression5733 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_primaryExpression5735 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression5753 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression5755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression5768 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression5770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_primaryExpression5772 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression5776 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression5780 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression5782 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression5802 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_primaryExpression5804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference5830 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_objectReference5838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall5903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall5916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall5929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inStateExpression_in_propertyCall5955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression5990 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression5997 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression6008 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_queryExpression6012 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_queryExpression6023 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression6029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_iterateExpression6061 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression6067 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression6075 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression6077 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression6085 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression6087 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_iterateExpression6095 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression6101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression6145 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression6167 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_operationExpression6180 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression6193 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_operationExpression6197 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression6209 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression6226 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_operationExpression6241 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression6256 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_operationExpression6260 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression6274 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_operationExpression6299 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_operationExpression6301 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression6326 = new BitSet(new long[]{0x0AD0A318861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_operationExpression6347 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression6359 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_operationExpression6363 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression6383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_inStateExpression6420 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_inStateExpression6425 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_inStateExpression6434 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_inStateExpression6439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression6475 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression6499 = new BitSet(new long[]{0x02D0A00000080000L});
    public static final BitSet FOLLOW_type_in_typeExpression6503 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression6505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration6543 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration6546 = new BitSet(new long[]{0x02D0A00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration6550 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration6560 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration6566 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration6569 = new BitSet(new long[]{0x02D0A00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration6575 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization6603 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization6605 = new BitSet(new long[]{0x02D0A00000080000L});
    public static final BitSet FOLLOW_type_in_variableInitialization6609 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization6611 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_variableInitialization6615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ifExpression6647 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_ifExpression6651 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ifExpression6653 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_ifExpression6657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ifExpression6659 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_ifExpression6663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ifExpression6665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_literal6704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_literal6718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal6731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal6746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal6760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal6770 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal6774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal6786 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal6788 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal6792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal6804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal6816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal6828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal6840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_literal6852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral6890 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral6919 = new BitSet(new long[]{0x0AD0A30A861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral6936 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral6949 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral6953 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral6972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem7001 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem7012 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_collectionItem7016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_emptyCollectionLiteral7045 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral7047 = new BitSet(new long[]{0x00D0A00000000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral7051 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral7053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral7069 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral7071 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral7073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_undefinedLiteral7103 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral7105 = new BitSet(new long[]{0x02D0A00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral7109 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral7111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_undefinedLiteral7125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_undefinedLiteral7139 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral7141 = new BitSet(new long[]{0x02D0A00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral7145 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral7147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_undefinedLiteral7161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_tupleLiteral7200 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral7206 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral7214 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral7225 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral7229 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral7240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem7271 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_tupleItem7310 = new BitSet(new long[]{0x02D0A00000080000L});
    public static final BitSet FOLLOW_type_in_tupleItem7314 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem7316 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_tupleItem7320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem7342 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_expression_in_tupleItem7352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type7418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type7430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type7442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly7474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly7476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType7504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType7542 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType7569 = new BitSet(new long[]{0x02D0A00000080000L});
    public static final BitSet FOLLOW_type_in_collectionType7573 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType7575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_tupleType7609 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType7611 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType7620 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleType7631 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType7635 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType7647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart7679 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_tuplePart7681 = new BitSet(new long[]{0x02D0A00000080000L});
    public static final BitSet FOLLOW_type_in_tuplePart7685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOnly7734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statOnly7738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_singleStat_in_stat7773 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_stat7785 = new BitSet(new long[]{0x0AD0A308861A0020L,0x050601FF64B01808L});
    public static final BitSet FOLLOW_singleStat_in_stat7795 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_emptyStat_in_singleStat7835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat7861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignStat_in_singleStat7873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_singleStat7887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleStat7901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleStat7914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleStat7931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExStat_in_singleStat7948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterStat_in_singleStat7965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_singleStat7987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStat_in_singleStat8005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_emptyStat8032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr8058 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr8072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varAssignStat8110 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat8114 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FF60900000L});
    public static final BitSet FOLLOW_rValue_in_varAssignStat8122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_attAssignStat8146 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attAssignStat8155 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat8159 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FF60900000L});
    public static final BitSet FOLLOW_rValue_in_attAssignStat8167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_objCreateStat8193 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_objCreateStat8201 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat8211 = new BitSet(new long[]{0x0AD0A318861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat8224 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat8232 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_objCreateStat8250 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat8258 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FF60900000L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat8272 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat8280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_objDestroyStat8316 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat8324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_lnkInsStat8350 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkInsStat8354 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FF60900000L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat8364 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkInsStat8368 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_lnkInsStat8372 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkInsStat8380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8409 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8420 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FF60900000L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8429 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8436 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers8452 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FF60900000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8463 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8474 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FF60900000L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8483 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8490 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers8512 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FF60900000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8527 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8547 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FF60900000L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8558 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8567 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_75_in_lnkDelStat8608 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkDelStat8612 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FF60900000L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat8622 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkDelStat8626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_lnkDelStat8630 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkDelStat8639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_condExStat8670 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_inSoilExpression_in_condExStat8679 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_condExStat8683 = new BitSet(new long[]{0x0AD0A308861A0020L,0x050601FF64B01A08L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat8692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_79_in_condExStat8703 = new BitSet(new long[]{0x0AD0A308861A0020L,0x050601FF64B01A08L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat8715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_condExStat8727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_iterStat8752 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_iterStat8760 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_iterStat8764 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_inSoilExpression_in_iterStat8772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_iterStat8776 = new BitSet(new long[]{0x0AD0A308861A0020L,0x050601FF64B01A08L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_iterStat8784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_iterStat8789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_whileStat8815 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_inSoilExpression_in_whileStat8823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_whileStat8827 = new BitSet(new long[]{0x0AD0A308861A0020L,0x050601FF64B01A08L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_whileStat8835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_whileStat8840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_blockStat8870 = new BitSet(new long[]{0x0AD0A308861A0020L,0x050601FF64B01A08L});
    public static final BitSet FOLLOW_73_in_blockStat8875 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat8881 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_blockStat8887 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat8893 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_blockStat8900 = new BitSet(new long[]{0x0AD0A308861A0020L,0x050601FF64B01808L});
    public static final BitSet FOLLOW_stat_in_blockStat8910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_blockStat8915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_implicitBlockStat8941 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat8947 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_implicitBlockStat8953 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat8959 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_implicitBlockStat8966 = new BitSet(new long[]{0x0AD0A308861A0020L,0x050601FF64B01808L});
    public static final BitSet FOLLOW_stat_in_implicitBlockStat8974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOrImplicitBlock8997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitBlockStat_in_statOrImplicitBlock9007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_rValue9053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_rValue9065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_rValList9088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValListMin1_in_rValList9115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin19148 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin19162 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FF60900000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin19172 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rValue_in_rValListMin29211 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin29219 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FF60900000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin29227 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin29241 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FF60900000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin29251 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_expression_in_inSoilExpression9285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_exprList9314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprListMin1_in_exprList9332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin19365 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin19380 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin19390 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin29430 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin29438 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin29446 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin29460 = new BitSet(new long[]{0x0AD0A308861A0020L,0x010601FE60900000L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin29470 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_nothing_in_identList9500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identListMin1_in_identList9517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identListMin19551 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_identListMin19565 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_identListMin19575 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COLON_in_synpred1_Generator7301 = new BitSet(new long[]{0x02D0A00000080000L});
    public static final BitSet FOLLOW_type_in_synpred1_Generator7303 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred1_Generator7305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_synpred2_Generator7853 = new BitSet(new long[]{0x0000000000000002L});

}