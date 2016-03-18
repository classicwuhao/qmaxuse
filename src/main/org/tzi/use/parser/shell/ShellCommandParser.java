// $ANTLR 3.4 ShellCommand.g 2016-03-14 16:32:07

/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2010 University of Bremen
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
 
 
package org.tzi.use.parser.shell;

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
public class ShellCommandParser extends BaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", "NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", "REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", "WS", "'Bag'", "'Collection'", "'OrderedSet'", "'Sequence'", "'Set'", "'Tuple'", "'Undefined'", "'allInstances'", "'and'", "'assign'", "'begin'", "'between'", "'byUseId'", "'create'", "'declare'", "'delete'", "'destroy'", "'div'", "'do'", "'else'", "'end'", "'endif'", "'execute'", "'false'", "'for'", "'from'", "'if'", "'implies'", "'in'", "'insert'", "'into'", "'iterate'", "'let'", "'new'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", "'oclInState'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", "'openter'", "'opexit'", "'or'", "'pre'", "'selectByKind'", "'selectByType'", "'set'", "'then'", "'true'", "'while'", "'xor'"
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


    public ShellCommandParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ShellCommandParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return ShellCommandParser.tokenNames; }
    public String getGrammarFileName() { return "ShellCommand.g"; }



    // $ANTLR start "shellCommandOnly"
    // ShellCommand.g:85:1: shellCommandOnly returns [ASTStatement n] : ( ( stat )=>s= stat | ( legacyStat )=>l= legacyStat );
    public final ASTStatement shellCommandOnly() throws RecognitionException {
        ASTStatement n = null;


        ShellCommandParser.stat_return s =null;

        ShellCommandParser.legacyStat_return l =null;


        try {
            // ShellCommand.g:86:3: ( ( stat )=>s= stat | ( legacyStat )=>l= legacyStat )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==SEMI) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==EOF) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==76) ) {
                int LA1_3 = input.LA(2);

                if ( (synpred1_ShellCommand()) ) {
                    alt1=1;
                }
                else if ( (synpred2_ShellCommand()) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;

                }
            }
            else if ( (LA1_0==MINUS||LA1_0==PLUS||LA1_0==78) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==94) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==67) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==INT) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==REAL) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==STRING) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==HASH) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==IDENT) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==44||(LA1_0 >= 46 && LA1_0 <= 48)) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==81) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==45) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==85) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==50) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==79) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==49) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==STAR) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==AT) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==75) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==80||(LA1_0 >= 83 && LA1_0 <= 84)||(LA1_0 >= 90 && LA1_0 <= 91)) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==82) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==LPAREN) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==70) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==77) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==60) ) {
                int LA1_27 = input.LA(2);

                if ( (synpred1_ShellCommand()) ) {
                    alt1=1;
                }
                else if ( (synpred2_ShellCommand()) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 27, input);

                    throw nvae;

                }
            }
            else if ( (LA1_0==73) ) {
                int LA1_28 = input.LA(2);

                if ( (synpred1_ShellCommand()) ) {
                    alt1=1;
                }
                else if ( (synpred2_ShellCommand()) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 28, input);

                    throw nvae;

                }
            }
            else if ( (LA1_0==59) ) {
                int LA1_29 = input.LA(2);

                if ( (synpred1_ShellCommand()) ) {
                    alt1=1;
                }
                else if ( (synpred2_ShellCommand()) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 29, input);

                    throw nvae;

                }
            }
            else if ( (LA1_0==68) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==95) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==54) && (synpred1_ShellCommand())) {
                alt1=1;
            }
            else if ( (LA1_0==86) && (synpred2_ShellCommand())) {
                alt1=2;
            }
            else if ( (LA1_0==87) && (synpred2_ShellCommand())) {
                alt1=2;
            }
            else if ( (LA1_0==57) && (synpred2_ShellCommand())) {
                alt1=2;
            }
            else if ( (LA1_0==53) && (synpred2_ShellCommand())) {
                alt1=2;
            }
            else if ( (LA1_0==66) && (synpred2_ShellCommand())) {
                alt1=2;
            }
            else if ( (LA1_0==92) && (synpred2_ShellCommand())) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // ShellCommand.g:87:3: ( stat )=>s= stat
                    {
                    pushFollow(FOLLOW_stat_in_shellCommandOnly65);
                    s=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s!=null?s.n:null); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:90:3: ( legacyStat )=>l= legacyStat
                    {
                    pushFollow(FOLLOW_legacyStat_in_shellCommandOnly86);
                    l=legacyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (l!=null?l.n:null); }

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
    // $ANTLR end "shellCommandOnly"



    // $ANTLR start "shellCommand"
    // ShellCommand.g:98:1: shellCommand returns [ASTStatement n] : ( ( legacyStat )=>l= legacyStat EOF | ( stat )=>s= stat EOF );
    public final ASTStatement shellCommand() throws RecognitionException {
        ASTStatement n = null;


        ShellCommandParser.legacyStat_return l =null;

        ShellCommandParser.stat_return s =null;


        try {
            // ShellCommand.g:99:3: ( ( legacyStat )=>l= legacyStat EOF | ( stat )=>s= stat EOF )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==86) && (synpred3_ShellCommand())) {
                alt2=1;
            }
            else if ( (LA2_0==87) && (synpred3_ShellCommand())) {
                alt2=1;
            }
            else if ( (LA2_0==57) && (synpred3_ShellCommand())) {
                alt2=1;
            }
            else if ( (LA2_0==53) && (synpred3_ShellCommand())) {
                alt2=1;
            }
            else if ( (LA2_0==76) ) {
                int LA2_5 = input.LA(2);

                if ( (synpred3_ShellCommand()) ) {
                    alt2=1;
                }
                else if ( (synpred4_ShellCommand()) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 5, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==66) && (synpred3_ShellCommand())) {
                alt2=1;
            }
            else if ( (LA2_0==60) ) {
                int LA2_7 = input.LA(2);

                if ( (synpred3_ShellCommand()) ) {
                    alt2=1;
                }
                else if ( (synpred4_ShellCommand()) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 7, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==92) && (synpred3_ShellCommand())) {
                alt2=1;
            }
            else if ( (LA2_0==73) ) {
                int LA2_9 = input.LA(2);

                if ( (synpred3_ShellCommand()) ) {
                    alt2=1;
                }
                else if ( (synpred4_ShellCommand()) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 9, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==59) ) {
                int LA2_10 = input.LA(2);

                if ( (synpred3_ShellCommand()) ) {
                    alt2=1;
                }
                else if ( (synpred4_ShellCommand()) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 10, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==SEMI) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==EOF) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==MINUS||LA2_0==PLUS||LA2_0==78) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==94) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==67) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==INT) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==REAL) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==STRING) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==HASH) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==IDENT) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==44||(LA2_0 >= 46 && LA2_0 <= 48)) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==81) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==45) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==85) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==50) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==79) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==49) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==STAR) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==AT) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==75) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==80||(LA2_0 >= 83 && LA2_0 <= 84)||(LA2_0 >= 90 && LA2_0 <= 91)) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==82) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==LPAREN) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==70) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==77) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==68) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==95) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else if ( (LA2_0==54) && (synpred4_ShellCommand())) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // ShellCommand.g:100:3: ( legacyStat )=>l= legacyStat EOF
                    {
                    pushFollow(FOLLOW_legacyStat_in_shellCommand118);
                    l=legacyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EOF,FOLLOW_EOF_in_shellCommand120); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (l!=null?l.n:null); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:103:3: ( stat )=>s= stat EOF
                    {
                    pushFollow(FOLLOW_stat_in_shellCommand141);
                    s=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EOF,FOLLOW_EOF_in_shellCommand143); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s!=null?s.n:null); }

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
    // $ANTLR end "shellCommand"


    public static class legacyStat_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };


    // $ANTLR start "legacyStat"
    // ShellCommand.g:113:1: legacyStat returns [ASTStatement n] : (loe= legacyOpEnter |lox= legacyOpExit | nextLegacyStat[seq] ( nextLegacyStat[seq] )* );
    public final ShellCommandParser.legacyStat_return legacyStat() throws RecognitionException {
        ShellCommandParser.legacyStat_return retval = new ShellCommandParser.legacyStat_return();
        retval.start = input.LT(1);


        ShellCommandParser.legacyOpEnter_return loe =null;

        ShellCommandParser.legacyOpExit_return lox =null;



          ASTSequenceStatement seq = new ASTSequenceStatement(((Token)retval.start));

        try {
            // ShellCommand.g:117:3: (loe= legacyOpEnter |lox= legacyOpExit | nextLegacyStat[seq] ( nextLegacyStat[seq] )* )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt4=1;
                }
                break;
            case 87:
                {
                alt4=2;
                }
                break;
            case 53:
            case 57:
            case 59:
            case 60:
            case 66:
            case 73:
            case 76:
            case 92:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // ShellCommand.g:118:3: loe= legacyOpEnter
                    {
                    pushFollow(FOLLOW_legacyOpEnter_in_legacyStat177);
                    loe=legacyOpEnter();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { 
                        retval.n = (loe!=null?loe.n:null);
                      }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:123:3: lox= legacyOpExit
                    {
                    pushFollow(FOLLOW_legacyOpExit_in_legacyStat193);
                    lox=legacyOpExit();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { 
                        retval.n = (lox!=null?lox.n:null); 
                      }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:128:3: nextLegacyStat[seq] ( nextLegacyStat[seq] )*
                    {
                    pushFollow(FOLLOW_nextLegacyStat_in_legacyStat206);
                    nextLegacyStat(seq);

                    state._fsp--;
                    if (state.failed) return retval;

                    // ShellCommand.g:129:3: ( nextLegacyStat[seq] )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==53||LA3_0==57||(LA3_0 >= 59 && LA3_0 <= 60)||LA3_0==66||LA3_0==73||LA3_0==76||LA3_0==92) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ShellCommand.g:130:5: nextLegacyStat[seq]
                    	    {
                    	    pushFollow(FOLLOW_nextLegacyStat_in_legacyStat217);
                    	    nextLegacyStat(seq);

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) { 
                        retval.n = seq.simplify();
                      }

                    }
                    break;

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
    // $ANTLR end "legacyStat"



    // $ANTLR start "nextLegacyStat"
    // ShellCommand.g:142:1: nextLegacyStat[ASTSequenceStatement seq] : s= singleLegacyStat ( SEMI )? ;
    public final void nextLegacyStat(ASTSequenceStatement seq) throws RecognitionException {
        ASTStatement s =null;


        try {
            // ShellCommand.g:143:3: (s= singleLegacyStat ( SEMI )? )
            // ShellCommand.g:144:3: s= singleLegacyStat ( SEMI )?
            {
            pushFollow(FOLLOW_singleLegacyStat_in_nextLegacyStat251);
            s=singleLegacyStat();

            state._fsp--;
            if (state.failed) return ;

            // ShellCommand.g:145:3: ( SEMI )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==SEMI) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ShellCommand.g:145:3: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_nextLegacyStat255); if (state.failed) return ;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                 seq.addStatement(s);
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
    // $ANTLR end "nextLegacyStat"



    // $ANTLR start "singleLegacyStat"
    // ShellCommand.g:156:1: singleLegacyStat returns [ASTStatement n] : (lcr= legacyCreate |lca= legacyCreateAssign |lci= legacyCreateInsert |llt= legacyLet |lex= legacyExecute |ods= objDestroyStat | 'set' e= expression aas= attAssignStat[$e.n] |lis= lnkInsStat |lds= lnkDelStat );
    public final ASTStatement singleLegacyStat() throws RecognitionException {
        ASTStatement n = null;


        ShellCommandParser.legacyCreate_return lcr =null;

        ShellCommandParser.legacyCreateAssign_return lca =null;

        ShellCommandParser.legacyCreateInsert_return lci =null;

        ShellCommandParser.legacyLet_return llt =null;

        ASTStatement lex =null;

        ShellCommandParser.objDestroyStat_return ods =null;

        ShellCommandParser.expression_return e =null;

        ASTAttributeAssignmentStatement aas =null;

        ShellCommandParser.lnkInsStat_return lis =null;

        ShellCommandParser.lnkDelStat_return lds =null;


        try {
            // ShellCommand.g:157:5: (lcr= legacyCreate |lca= legacyCreateAssign |lci= legacyCreateInsert |llt= legacyLet |lex= legacyExecute |ods= objDestroyStat | 'set' e= expression aas= attAssignStat[$e.n] |lis= lnkInsStat |lds= lnkDelStat )
            int alt6=9;
            switch ( input.LA(1) ) {
            case 57:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==IDENT) ) {
                    int LA6_9 = input.LA(3);

                    if ( (LA6_9==COLON) ) {
                        int LA6_10 = input.LA(4);

                        if ( (LA6_10==IDENT) ) {
                            int LA6_12 = input.LA(5);

                            if ( (LA6_12==55) ) {
                                alt6=3;
                            }
                            else if ( (LA6_12==EOF||LA6_12==SEMI||LA6_12==53||LA6_12==57||(LA6_12 >= 59 && LA6_12 <= 60)||LA6_12==66||LA6_12==73||LA6_12==76||LA6_12==92) ) {
                                alt6=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return n;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 12, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return n;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 10, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA6_9==COMMA) ) {
                        alt6=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 9, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
                }
                break;
            case 53:
                {
                alt6=2;
                }
                break;
            case 76:
                {
                alt6=4;
                }
                break;
            case 66:
                {
                alt6=5;
                }
                break;
            case 60:
                {
                alt6=6;
                }
                break;
            case 92:
                {
                alt6=7;
                }
                break;
            case 73:
                {
                alt6=8;
                }
                break;
            case 59:
                {
                alt6=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // ShellCommand.g:158:5: lcr= legacyCreate
                    {
                    pushFollow(FOLLOW_legacyCreate_in_singleLegacyStat288);
                    lcr=legacyCreate();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lcr!=null?lcr.n:null); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:159:5: lca= legacyCreateAssign
                    {
                    pushFollow(FOLLOW_legacyCreateAssign_in_singleLegacyStat307);
                    lca=legacyCreateAssign();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lca!=null?lca.n:null); }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:160:5: lci= legacyCreateInsert
                    {
                    pushFollow(FOLLOW_legacyCreateInsert_in_singleLegacyStat320);
                    lci=legacyCreateInsert();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lci!=null?lci.n:null); }

                    }
                    break;
                case 4 :
                    // ShellCommand.g:161:5: llt= legacyLet
                    {
                    pushFollow(FOLLOW_legacyLet_in_singleLegacyStat333);
                    llt=legacyLet();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (llt!=null?llt.n:null); }

                    }
                    break;
                case 5 :
                    // ShellCommand.g:164:5: lex= legacyExecute
                    {
                    pushFollow(FOLLOW_legacyExecute_in_singleLegacyStat361);
                    lex=legacyExecute();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = lex; }

                    }
                    break;
                case 6 :
                    // ShellCommand.g:165:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleLegacyStat379);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ods!=null?ods.n:null); }

                    }
                    break;
                case 7 :
                    // ShellCommand.g:166:5: 'set' e= expression aas= attAssignStat[$e.n]
                    {
                    match(input,92,FOLLOW_92_in_singleLegacyStat392); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_singleLegacyStat396);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    pushFollow(FOLLOW_attAssignStat_in_singleLegacyStat402);
                    aas=attAssignStat((e!=null?e.n:null));

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = aas; }

                    }
                    break;
                case 8 :
                    // ShellCommand.g:167:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleLegacyStat415);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lis!=null?lis.n:null); }

                    }
                    break;
                case 9 :
                    // ShellCommand.g:168:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleLegacyStat436);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lds!=null?lds.n:null); }

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
    // $ANTLR end "singleLegacyStat"


    public static class legacyCreate_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };


    // $ANTLR start "legacyCreate"
    // ShellCommand.g:181:1: legacyCreate returns [ASTStatement n] : 'create' objNames= identListMin1 COLON objType= simpleType ;
    public final ShellCommandParser.legacyCreate_return legacyCreate() throws RecognitionException {
        ShellCommandParser.legacyCreate_return retval = new ShellCommandParser.legacyCreate_return();
        retval.start = input.LT(1);


        List<String> objNames =null;

        ASTSimpleType objType =null;


        try {
            // ShellCommand.g:182:3: ( 'create' objNames= identListMin1 COLON objType= simpleType )
            // ShellCommand.g:183:3: 'create' objNames= identListMin1 COLON objType= simpleType
            {
            match(input,57,FOLLOW_57_in_legacyCreate472); if (state.failed) return retval;

            pushFollow(FOLLOW_identListMin1_in_legacyCreate480);
            objNames=identListMin1();

            state._fsp--;
            if (state.failed) return retval;

            match(input,COLON,FOLLOW_COLON_in_legacyCreate484); if (state.failed) return retval;

            pushFollow(FOLLOW_simpleType_in_legacyCreate492);
            objType=simpleType();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { 
                ASTSequenceStatement seq = new ASTSequenceStatement(((Token)retval.start));
                
                for (String objName : objNames) {
                  seq.addStatement(
                    new ASTNewObjectStatement(
                      ((Token)retval.start),
                      objType, 
                      new ASTStringLiteral(objName)));
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
    // $ANTLR end "legacyCreate"


    public static class legacyCreateAssign_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };


    // $ANTLR start "legacyCreateAssign"
    // ShellCommand.g:214:1: legacyCreateAssign returns [ASTStatement n] : 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType ;
    public final ShellCommandParser.legacyCreateAssign_return legacyCreateAssign() throws RecognitionException {
        ShellCommandParser.legacyCreateAssign_return retval = new ShellCommandParser.legacyCreateAssign_return();
        retval.start = input.LT(1);


        List<String> varNames =null;

        ASTSimpleType objType =null;


        try {
            // ShellCommand.g:215:3: ( 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType )
            // ShellCommand.g:216:3: 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType
            {
            match(input,53,FOLLOW_53_in_legacyCreateAssign529); if (state.failed) return retval;

            pushFollow(FOLLOW_identListMin1_in_legacyCreateAssign537);
            varNames=identListMin1();

            state._fsp--;
            if (state.failed) return retval;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_legacyCreateAssign541); if (state.failed) return retval;

            match(input,57,FOLLOW_57_in_legacyCreateAssign545); if (state.failed) return retval;

            pushFollow(FOLLOW_simpleType_in_legacyCreateAssign553);
            objType=simpleType();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {
                ASTSequenceStatement seq = new ASTSequenceStatement(((Token)retval.start));
                
                for (String varName : varNames) {
                  seq.addStatement(
                    new ASTVariableAssignmentStatement(
                      ((Token)retval.start),
                      varName, 
                      new ASTRValueNewObject(((Token)retval.start), objType)));
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
    // $ANTLR end "legacyCreateAssign"


    public static class legacyCreateInsert_return extends ParserRuleReturnScope {
        public ASTVariableAssignmentStatement n;
    };


    // $ANTLR start "legacyCreateInsert"
    // ShellCommand.g:249:1: legacyCreateInsert returns [ASTVariableAssignmentStatement n] : 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN ;
    public final ShellCommandParser.legacyCreateInsert_return legacyCreateInsert() throws RecognitionException {
        ShellCommandParser.legacyCreateInsert_return retval = new ShellCommandParser.legacyCreateInsert_return();
        retval.start = input.LT(1);


        Token name=null;
        ASTSimpleType asClassName =null;

        ShellCommandParser.rValListMin2WithOptionalQualifiers_return participants =null;


        try {
            // ShellCommand.g:250:3: ( 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN )
            // ShellCommand.g:251:3: 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN
            {
            match(input,57,FOLLOW_57_in_legacyCreateInsert587); if (state.failed) return retval;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyCreateInsert595); if (state.failed) return retval;

            match(input,COLON,FOLLOW_COLON_in_legacyCreateInsert599); if (state.failed) return retval;

            pushFollow(FOLLOW_simpleType_in_legacyCreateInsert607);
            asClassName=simpleType();

            state._fsp--;
            if (state.failed) return retval;

            match(input,55,FOLLOW_55_in_legacyCreateInsert611); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_legacyCreateInsert615); if (state.failed) return retval;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_legacyCreateInsert625);
            participants=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_legacyCreateInsert629); if (state.failed) return retval;

            if ( state.backtracking==0 ) {
                ASTNewLinkObjectStatement nlo = 
                  new ASTNewLinkObjectStatement(
                    ((Token)retval.start),
                    asClassName, 
                    (participants!=null?participants.participans:null),
                    (participants!=null?participants.qualifiers:null),
                    new ASTStringLiteral(name));
              
                retval.n = new ASTVariableAssignmentStatement(((Token)retval.start),
                  (name!=null?name.getText():null),
                  new ASTRValueNewLinkObject(nlo));
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
    // $ANTLR end "legacyCreateInsert"


    public static class legacyLet_return extends ParserRuleReturnScope {
        public ASTVariableAssignmentStatement n;
    };


    // $ANTLR start "legacyLet"
    // ShellCommand.g:286:1: legacyLet returns [ASTVariableAssignmentStatement n] : 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression ;
    public final ShellCommandParser.legacyLet_return legacyLet() throws RecognitionException {
        ShellCommandParser.legacyLet_return retval = new ShellCommandParser.legacyLet_return();
        retval.start = input.LT(1);


        Token varName=null;
        ASTType varType =null;

        ASTExpression e =null;


        try {
            // ShellCommand.g:287:3: ( 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression )
            // ShellCommand.g:288:3: 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression
            {
            match(input,76,FOLLOW_76_in_legacyLet662); if (state.failed) return retval;

            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyLet670); if (state.failed) return retval;

            // ShellCommand.g:290:3: ( COLON varType= type )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==COLON) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ShellCommand.g:291:5: COLON varType= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_legacyLet680); if (state.failed) return retval;

                    pushFollow(FOLLOW_type_in_legacyLet690);
                    varType=type();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            match(input,EQUAL,FOLLOW_EQUAL_in_legacyLet699); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_legacyLet707);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTVariableAssignmentStatement(((Token)retval.start), (varName!=null?varName.getText():null), e, varType); }

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
    // $ANTLR end "legacyLet"


    public static class legacyOpEnter_return extends ParserRuleReturnScope {
        public ASTEnterOperationStatement n;
    };


    // $ANTLR start "legacyOpEnter"
    // ShellCommand.g:312:1: legacyOpEnter returns [ASTEnterOperationStatement n] : 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN ;
    public final ShellCommandParser.legacyOpEnter_return legacyOpEnter() throws RecognitionException {
        ShellCommandParser.legacyOpEnter_return retval = new ShellCommandParser.legacyOpEnter_return();
        retval.start = input.LT(1);


        Token op=null;
        ASTExpression obj =null;

        List<ASTExpression> args =null;


        try {
            // ShellCommand.g:313:3: ( 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN )
            // ShellCommand.g:314:3: 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN
            {
            match(input,86,FOLLOW_86_in_legacyOpEnter740); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_legacyOpEnter748);
            obj=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyOpEnter756); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_legacyOpEnter760); if (state.failed) return retval;

            pushFollow(FOLLOW_exprList_in_legacyOpEnter770);
            args=exprList();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_legacyOpEnter774); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTEnterOperationStatement(((Token)retval.start), obj, (op!=null?op.getText():null), args); }

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
    // $ANTLR end "legacyOpEnter"


    public static class legacyOpExit_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };


    // $ANTLR start "legacyOpExit"
    // ShellCommand.g:337:1: legacyOpExit returns [ASTStatement n] : 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing ) ;
    public final ShellCommandParser.legacyOpExit_return legacyOpExit() throws RecognitionException {
        ShellCommandParser.legacyOpExit_return retval = new ShellCommandParser.legacyOpExit_return();
        retval.start = input.LT(1);


        ASTExpression retVal =null;


        try {
            // ShellCommand.g:338:3: ( 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing ) )
            // ShellCommand.g:339:3: 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing )
            {
            match(input,87,FOLLOW_87_in_legacyOpExit809); if (state.failed) return retval;

            // ShellCommand.g:339:12: ( ( inSoilExpression )=>retVal= inSoilExpression | nothing )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==76) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==MINUS||LA8_0==PLUS||LA8_0==78) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==94) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==67) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==INT) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==REAL) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==STRING) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==HASH) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==IDENT) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==44||(LA8_0 >= 46 && LA8_0 <= 48)) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==81) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==45) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==85) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==50) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==79) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==49) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==STAR) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==AT) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==75) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==80||(LA8_0 >= 83 && LA8_0 <= 84)||(LA8_0 >= 90 && LA8_0 <= 91)) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==82) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==LPAREN) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==70) && (synpred5_ShellCommand())) {
                alt8=1;
            }
            else if ( (LA8_0==EOF) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // ShellCommand.g:339:13: ( inSoilExpression )=>retVal= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_legacyOpExit821);
                    retVal=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // ShellCommand.g:339:62: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_legacyOpExit825);
                    nothing();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { retval.n = new ASTExitOperationStatement(((Token)retval.start), retVal); }

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
    // $ANTLR end "legacyOpExit"



    // $ANTLR start "legacyExecute"
    // ShellCommand.g:354:1: legacyExecute returns [ASTStatement n] : 'execute' expression ;
    public final ASTStatement legacyExecute() throws RecognitionException {
        ASTStatement n = null;


        try {
            // ShellCommand.g:355:3: ( 'execute' expression )
            // ShellCommand.g:356:3: 'execute' expression
            {
            match(input,66,FOLLOW_66_in_legacyExecute858); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_legacyExecute862);
            expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { 
                reportWarning("the execute command is not supported in this version"); 
                n = new ASTEmptyStatement();
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
    // $ANTLR end "legacyExecute"



    // $ANTLR start "expressionOnly"
    // ShellCommand.g:392:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;


        ShellCommandParser.expression_return nExp =null;


        try {
            // ShellCommand.g:393:5: (nExp= expression EOF )
            // ShellCommand.g:394:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly897);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_expressionOnly899); if (state.failed) return n;

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
    // ShellCommand.g:401:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
    public final ShellCommandParser.expression_return expression() throws RecognitionException {
        ShellCommandParser.expression_return retval = new ShellCommandParser.expression_return();
        retval.start = input.LT(1);


        Token name=null;
        ASTType t =null;

        ShellCommandParser.expression_return e1 =null;

        ASTExpression nCndImplies =null;


         
          ASTLetExpression prevLet = null, firstLet = null;
          ASTExpression e2;
          Token tok = null;

        try {
            // ShellCommand.g:407:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
            // ShellCommand.g:408:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }

            // ShellCommand.g:409:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==76) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ShellCommand.g:410:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
            	    {
            	    match(input,76,FOLLOW_76_in_expression947); if (state.failed) return retval;

            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression958); if (state.failed) return retval;

            	    // ShellCommand.g:411:18: ( COLON t= type )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==COLON) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ShellCommand.g:411:20: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression962); if (state.failed) return retval;

            	            pushFollow(FOLLOW_type_in_expression966);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression971); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expression_in_expression975);
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

            	    // ShellCommand.g:421:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==COMMA) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // ShellCommand.g:422:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_expression1013); if (state.failed) return retval;

            	    	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression1025); if (state.failed) return retval;

            	    	    // ShellCommand.g:423:20: ( COLON t= type )?
            	    	    int alt10=2;
            	    	    int LA10_0 = input.LA(1);

            	    	    if ( (LA10_0==COLON) ) {
            	    	        alt10=1;
            	    	    }
            	    	    switch (alt10) {
            	    	        case 1 :
            	    	            // ShellCommand.g:423:22: COLON t= type
            	    	            {
            	    	            match(input,COLON,FOLLOW_COLON_in_expression1029); if (state.failed) return retval;

            	    	            pushFollow(FOLLOW_type_in_expression1033);
            	    	            t=type();

            	    	            state._fsp--;
            	    	            if (state.failed) return retval;

            	    	            }
            	    	            break;

            	    	    }


            	    	    match(input,EQUAL,FOLLOW_EQUAL_in_expression1038); if (state.failed) return retval;

            	    	    pushFollow(FOLLOW_expression_in_expression1042);
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
            	    	    break loop11;
            	        }
            	    } while (true);


            	    match(input,72,FOLLOW_72_in_expression1083); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression1099);
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
    // ShellCommand.g:455:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;


        ASTVariableDeclaration v =null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // ShellCommand.g:457:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // ShellCommand.g:458:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList1132); if (state.failed) return paramList;

            // ShellCommand.g:459:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==IDENT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ShellCommand.g:460:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList1149);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;

                    if ( state.backtracking==0 ) { paramList.add(v); }

                    // ShellCommand.g:461:7: ( COMMA v= variableDeclaration )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==COMMA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ShellCommand.g:461:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList1161); if (state.failed) return paramList;

                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList1165);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;

                    	    if ( state.backtracking==0 ) { paramList.add(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_paramList1185); if (state.failed) return paramList;

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
    // ShellCommand.g:469:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;


        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // ShellCommand.g:471:5: (id0= IDENT ( COMMA idn= IDENT )* )
            // ShellCommand.g:472:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList1214); if (state.failed) return idList;

            if ( state.backtracking==0 ) { idList.add(id0); }

            // ShellCommand.g:473:5: ( COMMA idn= IDENT )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ShellCommand.g:473:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList1224); if (state.failed) return idList;

            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList1228); if (state.failed) return idList;

            	    if ( state.backtracking==0 ) { idList.add(idn); }

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ShellCommand.g:481:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;


        Token name=null;
        ASTType t =null;


        try {
            // ShellCommand.g:482:5: (name= IDENT COLON t= type )
            // ShellCommand.g:483:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration1259); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableDeclaration1261); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableDeclaration1265);
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
    // ShellCommand.g:491:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndOrExp =null;

        ASTExpression n1 =null;


        try {
            // ShellCommand.g:492:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // ShellCommand.g:493:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1301);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndOrExp;}

            // ShellCommand.g:494:5: (op= 'implies' n1= conditionalOrExpression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==71) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ShellCommand.g:494:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,71,FOLLOW_71_in_conditionalImpliesExpression1314); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1318);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

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
        return n;
    }
    // $ANTLR end "conditionalImpliesExpression"



    // $ANTLR start "conditionalOrExpression"
    // ShellCommand.g:503:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndXorExp =null;

        ASTExpression n1 =null;


        try {
            // ShellCommand.g:504:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // ShellCommand.g:505:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1363);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndXorExp;}

            // ShellCommand.g:506:5: (op= 'or' n1= conditionalXOrExpression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==88) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ShellCommand.g:506:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,88,FOLLOW_88_in_conditionalOrExpression1376); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1380);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

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
        return n;
    }
    // $ANTLR end "conditionalOrExpression"



    // $ANTLR start "conditionalXOrExpression"
    // ShellCommand.g:515:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndAndExp =null;

        ASTExpression n1 =null;


        try {
            // ShellCommand.g:516:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // ShellCommand.g:517:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1424);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndAndExp;}

            // ShellCommand.g:518:5: (op= 'xor' n1= conditionalAndExpression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==96) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ShellCommand.g:518:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,96,FOLLOW_96_in_conditionalXOrExpression1437); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1441);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ShellCommand.g:527:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nEqExp =null;

        ASTExpression n1 =null;


        try {
            // ShellCommand.g:528:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // ShellCommand.g:529:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1485);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nEqExp;}

            // ShellCommand.g:530:5: (op= 'and' n1= equalityExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==52) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ShellCommand.g:530:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,52,FOLLOW_52_in_conditionalAndExpression1498); if (state.failed) return n;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1502);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ShellCommand.g:539:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nRelExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // ShellCommand.g:541:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // ShellCommand.g:542:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1550);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nRelExp;}

            // ShellCommand.g:543:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==EQUAL||LA20_0==NOT_EQUAL) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ShellCommand.g:543:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1579);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

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
        return n;
    }
    // $ANTLR end "equalityExpression"



    // $ANTLR start "relationalExpression"
    // ShellCommand.g:553:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nAddiExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // ShellCommand.g:555:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // ShellCommand.g:556:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1628);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nAddiExp;}

            // ShellCommand.g:557:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0 >= GREATER && LA21_0 <= GREATER_EQUAL)||(LA21_0 >= LESS && LA21_0 <= LESS_EQUAL)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ShellCommand.g:557:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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


            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1664);
            	    n1=additiveExpression();

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
    // $ANTLR end "relationalExpression"



    // $ANTLR start "additiveExpression"
    // ShellCommand.g:567:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nMulExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // ShellCommand.g:569:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // ShellCommand.g:570:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1714);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nMulExp;}

            // ShellCommand.g:571:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==MINUS||LA22_0==PLUS) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ShellCommand.g:571:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1742);
            	    n1=multiplicativeExpression();

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
    // $ANTLR end "additiveExpression"



    // $ANTLR start "multiplicativeExpression"
    // ShellCommand.g:582:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // ShellCommand.g:584:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // ShellCommand.g:585:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1792);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nUnExp;}

            // ShellCommand.g:586:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==SLASH||LA23_0==STAR||LA23_0==61) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ShellCommand.g:586:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==61 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1824);
            	    n1=unaryExpression();

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
    // $ANTLR end "multiplicativeExpression"



    // $ANTLR start "unaryExpression"
    // ShellCommand.g:598:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression nPosExp =null;


         Token op = null; 
        try {
            // ShellCommand.g:600:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==MINUS||LA24_0==PLUS||LA24_0==78) ) {
                alt24=1;
            }
            else if ( (LA24_0==AT||LA24_0==HASH||(LA24_0 >= IDENT && LA24_0 <= INT)||LA24_0==LPAREN||LA24_0==REAL||(LA24_0 >= STAR && LA24_0 <= STRING)||(LA24_0 >= 44 && LA24_0 <= 50)||LA24_0==67||LA24_0==70||LA24_0==75||(LA24_0 >= 79 && LA24_0 <= 85)||(LA24_0 >= 90 && LA24_0 <= 91)||LA24_0==94) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // ShellCommand.g:601:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // ShellCommand.g:601:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // ShellCommand.g:601:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) { op = input.LT(1); }

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==78 ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1910);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }

                    }


                    }
                    break;
                case 2 :
                    // ShellCommand.g:605:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression1930);
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
    // ShellCommand.g:613:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nPrimExp =null;

        ASTExpression nPc =null;


         boolean arrow = false; 
        try {
            // ShellCommand.g:615:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // ShellCommand.g:616:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression1963);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nPrimExp; }

            // ShellCommand.g:617:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==DOT) ) {
                    int LA26_2 = input.LA(2);

                    if ( (LA26_2==IDENT) ) {
                        int LA26_4 = input.LA(3);

                        if ( (LA26_4==EOF||(LA26_4 >= ARROW && LA26_4 <= BAR)||(LA26_4 >= COMMA && LA26_4 <= EQUAL)||(LA26_4 >= GREATER && LA26_4 <= GREATER_EQUAL)||LA26_4==IDENT||(LA26_4 >= LBRACE && LA26_4 <= MINUS)||(LA26_4 >= NOT_EQUAL && LA26_4 <= PLUS)||(LA26_4 >= RBRACE && LA26_4 <= RBRACK)||(LA26_4 >= RPAREN && LA26_4 <= SLASH)||LA26_4==STAR||(LA26_4 >= 52 && LA26_4 <= 53)||LA26_4==57||(LA26_4 >= 59 && LA26_4 <= 66)||(LA26_4 >= 71 && LA26_4 <= 73)||LA26_4==76||LA26_4==88||(LA26_4 >= 92 && LA26_4 <= 93)||LA26_4==96) ) {
                            alt26=1;
                        }


                    }
                    else if ( (LA26_2==75||LA26_2==80||(LA26_2 >= 82 && LA26_2 <= 84)||(LA26_2 >= 90 && LA26_2 <= 91)) ) {
                        alt26=1;
                    }


                }
                else if ( (LA26_0==ARROW) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ShellCommand.g:618:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // ShellCommand.g:618:6: ( ARROW | DOT )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==ARROW) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==DOT) ) {
            	        alt25=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // ShellCommand.g:618:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression1981); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = true; }

            	            }
            	            break;
            	        case 2 :
            	            // ShellCommand.g:618:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression1987); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = false; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression1998);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = nPc; }

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
    // $ANTLR end "postfixExpression"



    // $ANTLR start "primaryExpression"
    // ShellCommand.g:634:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? );
    public final ASTExpression primaryExpression() throws RecognitionException {
        ASTExpression n = null;


        Token id1=null;
        Token id2=null;
        ASTExpression nLit =null;

        ASTExpression nOr =null;

        ASTExpression nPc =null;

        ShellCommandParser.expression_return nExp =null;

        ASTExpression nIfExp =null;

        ShellCommandParser.expression_return idExp =null;


        try {
            // ShellCommand.g:635:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? )
            int alt30=7;
            switch ( input.LA(1) ) {
            case HASH:
            case INT:
            case REAL:
            case STAR:
            case STRING:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 67:
            case 79:
            case 81:
            case 85:
            case 94:
                {
                alt30=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt30=1;
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
                case 52:
                case 53:
                case 57:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 71:
                case 72:
                case 73:
                case 76:
                case 88:
                case 92:
                case 93:
                case 96:
                    {
                    alt30=3;
                    }
                    break;
                case DOT:
                    {
                    switch ( input.LA(3) ) {
                    case 51:
                        {
                        alt30=6;
                        }
                        break;
                    case 56:
                        {
                        alt30=7;
                        }
                        break;
                    case IDENT:
                    case 75:
                    case 80:
                    case 82:
                    case 83:
                    case 84:
                    case 90:
                    case 91:
                        {
                        alt30=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 7, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;

                }

                }
                break;
            case AT:
                {
                alt30=2;
                }
                break;
            case 75:
            case 80:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
                {
                alt30=3;
                }
                break;
            case LPAREN:
                {
                alt30=4;
                }
                break;
            case 70:
                {
                alt30=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // ShellCommand.g:636:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression2038);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nLit; }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:637:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression2052);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nOr; }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:638:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression2064);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPc; }

                    }
                    break;
                case 4 :
                    // ShellCommand.g:639:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression2075); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression2079);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression2081); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExp!=null?nExp.n:null); }

                    }
                    break;
                case 5 :
                    // ShellCommand.g:640:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression2093);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nIfExp; }

                    }
                    break;
                case 6 :
                    // ShellCommand.g:641:7: id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression2105); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression2107); if (state.failed) return n;

                    match(input,51,FOLLOW_51_in_primaryExpression2109); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }

                    // ShellCommand.g:643:9: ( AT 'pre' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==AT) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ShellCommand.g:643:11: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression2132); if (state.failed) return n;

                            match(input,89,FOLLOW_89_in_primaryExpression2134); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setIsPre(); }

                            }
                            break;

                    }


                    // ShellCommand.g:644:9: ( LPAREN RPAREN )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==LPAREN) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ShellCommand.g:644:11: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression2152); if (state.failed) return n;

                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression2154); if (state.failed) return n;

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // ShellCommand.g:645:7: id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )?
                    {
                    id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression2167); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression2169); if (state.failed) return n;

                    match(input,56,FOLLOW_56_in_primaryExpression2171); if (state.failed) return n;

                    // ShellCommand.g:645:31: ( LPAREN idExp= expression RPAREN )
                    // ShellCommand.g:645:33: LPAREN idExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression2175); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression2179);
                    idExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression2181); if (state.failed) return n;

                    }


                    if ( state.backtracking==0 ) { n = new ASTObjectByUseIdExpression(id2, (idExp!=null?idExp.n:null)); }

                    // ShellCommand.g:647:7: ( AT 'pre' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==AT) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ShellCommand.g:647:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression2201); if (state.failed) return n;

                            match(input,89,FOLLOW_89_in_primaryExpression2203); if (state.failed) return n;

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
    // ShellCommand.g:651:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;


        Token objectName=null;

        try {
            // ShellCommand.g:652:3: ( AT objectName= IDENT )
            // ShellCommand.g:653:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference2229); if (state.failed) return n;

            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference2237); if (state.failed) return n;

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
    // ShellCommand.g:667:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExpQuery =null;

        ASTExpression nExpIterate =null;

        ShellCommandParser.operationExpression_return nExpOperation =null;

        ASTTypeArgExpression nExpType =null;

        ASTInStateExpression nExpInState =null;


        try {
            // ShellCommand.g:668:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] )
            int alt31=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA31_1 = input.LA(2);

                if ( (((( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))&&( input.LA(2) == LPAREN ))) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;

                }
                }
                break;
            case 75:
                {
                alt31=2;
                }
                break;
            case 80:
            case 83:
            case 84:
            case 90:
            case 91:
                {
                alt31=4;
                }
                break;
            case 82:
                {
                alt31=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // ShellCommand.g:672:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }

                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }

                    pushFollow(FOLLOW_queryExpression_in_propertyCall2302);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpQuery; }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:675:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall2315);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpIterate; }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:676:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall2328);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExpOperation!=null?nExpOperation.n:null); }

                    }
                    break;
                case 4 :
                    // ShellCommand.g:677:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall2341);
                    nExpType=typeExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpType; }

                    }
                    break;
                case 5 :
                    // ShellCommand.g:678:7: nExpInState= inStateExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_inStateExpression_in_propertyCall2354);
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
    // ShellCommand.g:687:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTElemVarsDeclaration decls =null;

        ShellCommandParser.expression_return nExp =null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // ShellCommand.g:688:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // ShellCommand.g:689:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression2389); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression2396); if (state.failed) return n;

            // ShellCommand.g:691:5: (decls= elemVarsDeclaration BAR )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==IDENT) ) {
                int LA32_1 = input.LA(2);

                if ( ((LA32_1 >= BAR && LA32_1 <= COLON)||LA32_1==COMMA) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // ShellCommand.g:691:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression2407);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {decl = decls;}

                    match(input,BAR,FOLLOW_BAR_in_queryExpression2411); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_queryExpression2422);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression2428); if (state.failed) return n;

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
    // ShellCommand.g:705:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTElemVarsDeclaration decls =null;

        ASTVariableInitialization init =null;

        ShellCommandParser.expression_return nExp =null;


        try {
            // ShellCommand.g:705:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // ShellCommand.g:706:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,75,FOLLOW_75_in_iterateExpression2460); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression2466); if (state.failed) return n;

            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression2474);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;

            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression2476); if (state.failed) return n;

            pushFollow(FOLLOW_variableInitialization_in_iterateExpression2484);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;

            match(input,BAR,FOLLOW_BAR_in_iterateExpression2486); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_iterateExpression2494);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression2500); if (state.failed) return n;

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
    // ShellCommand.g:727:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final ShellCommandParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ShellCommandParser.operationExpression_return retval = new ShellCommandParser.operationExpression_return();
        retval.start = input.LT(1);


        Token name=null;
        ShellCommandParser.expression_return rolename =null;

        ShellCommandParser.expression_return e =null;


        try {
            // ShellCommand.g:729:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // ShellCommand.g:730:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression2544); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }

            // ShellCommand.g:736:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LBRACK) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ShellCommand.g:736:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2566); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_operationExpression2579);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    // ShellCommand.g:738:9: ( COMMA rolename= expression )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==COMMA) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ShellCommand.g:738:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2592); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_operationExpression2596);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2608); if (state.failed) return retval;

                    // ShellCommand.g:741:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==LBRACK) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ShellCommand.g:741:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2625); if (state.failed) return retval;

                            pushFollow(FOLLOW_expression_in_operationExpression2640);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            // ShellCommand.g:743:11: ( COMMA rolename= expression )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==COMMA) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // ShellCommand.g:743:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2655); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression2659);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop34;
                                }
                            } while (true);


                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2673); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            // ShellCommand.g:748:5: ( AT 'pre' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==AT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ShellCommand.g:748:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression2698); if (state.failed) return retval;

                    match(input,89,FOLLOW_89_in_operationExpression2700); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.setIsPre(); }

                    }
                    break;

            }


            // ShellCommand.g:750:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==LPAREN) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ShellCommand.g:751:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression2725); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.hasParentheses(); }

                    // ShellCommand.g:752:7: (e= expression ( COMMA e= expression )* )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==AT||LA39_0==HASH||(LA39_0 >= IDENT && LA39_0 <= INT)||(LA39_0 >= LPAREN && LA39_0 <= MINUS)||LA39_0==PLUS||LA39_0==REAL||(LA39_0 >= STAR && LA39_0 <= STRING)||(LA39_0 >= 44 && LA39_0 <= 50)||LA39_0==67||LA39_0==70||(LA39_0 >= 75 && LA39_0 <= 76)||(LA39_0 >= 78 && LA39_0 <= 85)||(LA39_0 >= 90 && LA39_0 <= 91)||LA39_0==94) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ShellCommand.g:753:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression2746);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            // ShellCommand.g:754:7: ( COMMA e= expression )*
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( (LA38_0==COMMA) ) {
                                    alt38=1;
                                }


                                switch (alt38) {
                            	case 1 :
                            	    // ShellCommand.g:754:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2758); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression2762);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop38;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression2782); if (state.failed) return retval;

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
    // ShellCommand.g:761:1: inStateExpression[ASTExpression source, boolean followsArrow] returns [ASTInStateExpression n] : opToken= 'oclInState' LPAREN s= IDENT RPAREN ;
    public final ASTInStateExpression inStateExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTInStateExpression n = null;


        Token opToken=null;
        Token s=null;

        try {
            // ShellCommand.g:762:35: (opToken= 'oclInState' LPAREN s= IDENT RPAREN )
            // ShellCommand.g:763:4: opToken= 'oclInState' LPAREN s= IDENT RPAREN
            {
            opToken=(Token)match(input,82,FOLLOW_82_in_inStateExpression2819); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_inStateExpression2824); if (state.failed) return n;

            s=(Token)match(input,IDENT,FOLLOW_IDENT_in_inStateExpression2833); if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_inStateExpression2838); if (state.failed) return n;

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
    // ShellCommand.g:775:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;


        ASTType t =null;


         Token opToken = null; 
        try {
            // ShellCommand.g:778:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN )
            // ShellCommand.g:779:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) { opToken = input.LT(1); }

            if ( input.LA(1)==80||(input.LA(1) >= 83 && input.LA(1) <= 84)||(input.LA(1) >= 90 && input.LA(1) <= 91) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression2898); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_typeExpression2902);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression2904); if (state.failed) return n;

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
    // ShellCommand.g:790:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;


        Token var1=null;
        Token varN=null;
        ASTType t =null;

        ASTType tN =null;


        try {
            // ShellCommand.g:791:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // ShellCommand.g:792:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }

            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2942); if (state.failed) return n;

            // ShellCommand.g:793:17: ( COLON t= type )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==COLON) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ShellCommand.g:793:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2945); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_elemVarsDeclaration2949);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}

            // ShellCommand.g:794:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMMA) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ShellCommand.g:794:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration2959); if (state.failed) return n;

            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration2965); if (state.failed) return n;

            	    // ShellCommand.g:794:24: ( COLON tN= type )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==COLON) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // ShellCommand.g:794:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2968); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration2974);
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
    // $ANTLR end "elemVarsDeclaration"



    // $ANTLR start "variableInitialization"
    // ShellCommand.g:802:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;


        Token name=null;
        ASTType t =null;

        ShellCommandParser.expression_return e =null;


        try {
            // ShellCommand.g:803:5: (name= IDENT COLON t= type EQUAL e= expression )
            // ShellCommand.g:804:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization3002); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableInitialization3004); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableInitialization3008);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization3010); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_variableInitialization3014);
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
    // ShellCommand.g:813:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ShellCommandParser.expression_return cond =null;

        ShellCommandParser.expression_return t =null;

        ShellCommandParser.expression_return e =null;


        try {
            // ShellCommand.g:814:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // ShellCommand.g:815:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,70,FOLLOW_70_in_ifExpression3046); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression3050);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,93,FOLLOW_93_in_ifExpression3052); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression3056);
            t=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,63,FOLLOW_63_in_ifExpression3058); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression3062);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,65,FOLLOW_65_in_ifExpression3064); if (state.failed) return n;

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
    // ShellCommand.g:834:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR );
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
            // ShellCommand.g:835:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR )
            int alt44=12;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt44=1;
                }
                break;
            case 67:
                {
                alt44=2;
                }
                break;
            case INT:
                {
                alt44=3;
                }
                break;
            case REAL:
                {
                alt44=4;
                }
                break;
            case STRING:
                {
                alt44=5;
                }
                break;
            case HASH:
                {
                alt44=6;
                }
                break;
            case IDENT:
                {
                alt44=7;
                }
                break;
            case 44:
            case 46:
            case 47:
            case 48:
                {
                int LA44_8 = input.LA(2);

                if ( (LA44_8==LPAREN) ) {
                    alt44=9;
                }
                else if ( (LA44_8==LBRACE) ) {
                    alt44=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 8, input);

                    throw nvae;

                }
                }
                break;
            case 45:
            case 81:
                {
                alt44=9;
                }
                break;
            case 50:
            case 79:
            case 85:
                {
                alt44=10;
                }
                break;
            case 49:
                {
                alt44=11;
                }
                break;
            case STAR:
                {
                alt44=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }

            switch (alt44) {
                case 1 :
                    // ShellCommand.g:836:7: t= 'true'
                    {
                    t=(Token)match(input,94,FOLLOW_94_in_literal3103); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:837:7: f= 'false'
                    {
                    f=(Token)match(input,67,FOLLOW_67_in_literal3117); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:838:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal3130); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }

                    }
                    break;
                case 4 :
                    // ShellCommand.g:839:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal3145); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }

                    }
                    break;
                case 5 :
                    // ShellCommand.g:840:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal3159); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }

                    }
                    break;
                case 6 :
                    // ShellCommand.g:841:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal3169); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal3173); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}

                    }
                    break;
                case 7 :
                    // ShellCommand.g:842:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal3185); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal3187); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal3191); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }

                    }
                    break;
                case 8 :
                    // ShellCommand.g:843:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal3203);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nColIt; }

                    }
                    break;
                case 9 :
                    // ShellCommand.g:844:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal3215);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nEColIt; }

                    }
                    break;
                case 10 :
                    // ShellCommand.g:845:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal3227);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nUndLit; }

                    }
                    break;
                case 11 :
                    // ShellCommand.g:846:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal3239);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nTupleLit; }

                    }
                    break;
                case 12 :
                    // ShellCommand.g:847:7: un= STAR
                    {
                    un=(Token)match(input,STAR,FOLLOW_STAR_in_literal3251); if (state.failed) return n;

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
    // ShellCommand.g:855:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;


        ASTCollectionItem ci =null;


         Token op = null; 
        try {
            // ShellCommand.g:857:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // ShellCommand.g:858:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( input.LA(1)==44||(input.LA(1) >= 46 && input.LA(1) <= 48) ) {
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

            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral3318); if (state.failed) return n;

            // ShellCommand.g:862:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==AT||LA46_0==HASH||(LA46_0 >= IDENT && LA46_0 <= INT)||(LA46_0 >= LPAREN && LA46_0 <= MINUS)||LA46_0==PLUS||LA46_0==REAL||(LA46_0 >= STAR && LA46_0 <= STRING)||(LA46_0 >= 44 && LA46_0 <= 50)||LA46_0==67||LA46_0==70||(LA46_0 >= 75 && LA46_0 <= 76)||(LA46_0 >= 78 && LA46_0 <= 85)||(LA46_0 >= 90 && LA46_0 <= 91)||LA46_0==94) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ShellCommand.g:863:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral3335);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addItem(ci); }

                    // ShellCommand.g:864:7: ( COMMA ci= collectionItem )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==COMMA) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ShellCommand.g:864:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral3348); if (state.failed) return n;

                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral3352);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addItem(ci); }

                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral3371); if (state.failed) return n;

            }

        }
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
    // ShellCommand.g:873:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;


        ShellCommandParser.expression_return e =null;


         n = new ASTCollectionItem(); 
        try {
            // ShellCommand.g:875:5: (e= expression ( DOTDOT e= expression )? )
            // ShellCommand.g:876:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem3400);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setFirst((e!=null?e.n:null)); }

            // ShellCommand.g:877:5: ( DOTDOT e= expression )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==DOTDOT) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ShellCommand.g:877:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem3411); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_collectionItem3415);
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
    // ShellCommand.g:887:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;


        ASTCollectionType t =null;


        try {
            // ShellCommand.g:888:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==81) ) {
                alt48=1;
            }
            else if ( ((LA48_0 >= 44 && LA48_0 <= 48)) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }
            switch (alt48) {
                case 1 :
                    // ShellCommand.g:889:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,81,FOLLOW_81_in_emptyCollectionLiteral3444); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral3446); if (state.failed) return n;

                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral3450);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral3452); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:892:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral3468);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral3470); if (state.failed) return n;

                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral3472); if (state.failed) return n;

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
    // ShellCommand.g:903:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;


        ASTType t =null;


        try {
            // ShellCommand.g:904:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt49=4;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt49=1;
                }
                break;
            case 50:
                {
                alt49=2;
                }
                break;
            case 79:
                {
                int LA49_3 = input.LA(2);

                if ( (LA49_3==LPAREN) ) {
                    alt49=3;
                }
                else if ( (LA49_3==EOF||LA49_3==ARROW||LA49_3==BAR||(LA49_3 >= COMMA && LA49_3 <= EQUAL)||(LA49_3 >= GREATER && LA49_3 <= GREATER_EQUAL)||LA49_3==IDENT||LA49_3==LBRACE||(LA49_3 >= LESS && LA49_3 <= LESS_EQUAL)||LA49_3==MINUS||(LA49_3 >= NOT_EQUAL && LA49_3 <= PLUS)||(LA49_3 >= RBRACE && LA49_3 <= RBRACK)||(LA49_3 >= RPAREN && LA49_3 <= SLASH)||LA49_3==STAR||(LA49_3 >= 52 && LA49_3 <= 53)||LA49_3==57||(LA49_3 >= 59 && LA49_3 <= 66)||(LA49_3 >= 71 && LA49_3 <= 73)||LA49_3==76||LA49_3==88||(LA49_3 >= 92 && LA49_3 <= 93)||LA49_3==96) ) {
                    alt49=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 3, input);

                    throw nvae;

                }
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
                    // ShellCommand.g:905:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,85,FOLLOW_85_in_undefinedLiteral3502); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3504); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral3508);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3510); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:908:5: 'Undefined'
                    {
                    match(input,50,FOLLOW_50_in_undefinedLiteral3524); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:911:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,79,FOLLOW_79_in_undefinedLiteral3538); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3540); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral3544);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3546); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 4 :
                    // ShellCommand.g:914:5: 'null'
                    {
                    match(input,79,FOLLOW_79_in_undefinedLiteral3560); if (state.failed) return n;

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
    // ShellCommand.g:924:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;


        ASTTupleItem ti =null;


         List tiList = new ArrayList(); 
        try {
            // ShellCommand.g:926:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // ShellCommand.g:927:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,49,FOLLOW_49_in_tupleLiteral3599); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral3605); if (state.failed) return n;

            pushFollow(FOLLOW_tupleItem_in_tupleLiteral3613);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tiList.add(ti); }

            // ShellCommand.g:930:5: ( COMMA ti= tupleItem )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==COMMA) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ShellCommand.g:930:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral3624); if (state.failed) return n;

            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral3628);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tiList.add(ti); }

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral3639); if (state.failed) return n;

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
    // ShellCommand.g:938:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;


        Token name=null;
        ASTType t =null;

        ShellCommandParser.expression_return e =null;


        try {
            // ShellCommand.g:939:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // ShellCommand.g:940:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem3670); if (state.failed) return n;

            // ShellCommand.g:941:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==COLON) ) {
                int LA51_1 = input.LA(2);

                if ( (synpred6_ShellCommand()) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA51_0==EQUAL) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }
            switch (alt51) {
                case 1 :
                    // ShellCommand.g:944:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem3709); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_tupleItem3713);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem3715); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_tupleItem3719);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, (e!=null?e.n:null)); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:947:7: ( COLON | EQUAL ) e= expression
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


                    pushFollow(FOLLOW_expression_in_tupleItem3751);
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
    // ShellCommand.g:958:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;


        ASTSimpleType nTSimple =null;

        ASTCollectionType nTCollection =null;

        ASTTupleType nTTuple =null;


         Token tok = null; 
        try {
            // ShellCommand.g:960:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
            // ShellCommand.g:961:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }

            // ShellCommand.g:962:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            int alt52=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt52=1;
                }
                break;
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt52=2;
                }
                break;
            case 49:
                {
                alt52=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }

            switch (alt52) {
                case 1 :
                    // ShellCommand.g:963:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type3817);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:964:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type3829);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:965:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type3841);
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
    // ShellCommand.g:970:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;


        ASTType nT =null;


        try {
            // ShellCommand.g:971:5: (nT= type EOF )
            // ShellCommand.g:972:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly3873);
            nT=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_typeOnly3875); if (state.failed) return n;

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
    // ShellCommand.g:982:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;


        Token name=null;

        try {
            // ShellCommand.g:983:5: (name= IDENT )
            // ShellCommand.g:984:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType3903); if (state.failed) return n;

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
    // ShellCommand.g:992:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;


        ASTType elemType =null;


         Token op = null; 
        try {
            // ShellCommand.g:994:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // ShellCommand.g:995:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( (input.LA(1) >= 44 && input.LA(1) <= 48) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType3968); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_collectionType3972);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType3974); if (state.failed) return n;

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
    // ShellCommand.g:1005:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;


        ASTTuplePart tp =null;


         List tpList = new ArrayList(); 
        try {
            // ShellCommand.g:1007:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // ShellCommand.g:1008:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,49,FOLLOW_49_in_tupleType4008); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType4010); if (state.failed) return n;

            pushFollow(FOLLOW_tuplePart_in_tupleType4019);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tpList.add(tp); }

            // ShellCommand.g:1010:5: ( COMMA tp= tuplePart )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==COMMA) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ShellCommand.g:1010:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType4030); if (state.failed) return n;

            	    pushFollow(FOLLOW_tuplePart_in_tupleType4034);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tpList.add(tp); }

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType4046); if (state.failed) return n;

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
    // ShellCommand.g:1019:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;


        Token name=null;
        ASTType t =null;


        try {
            // ShellCommand.g:1020:5: (name= IDENT COLON t= type )
            // ShellCommand.g:1021:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart4078); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_tuplePart4080); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_tuplePart4084);
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
    // ShellCommand.g:1060:1: statOnly returns [ASTStatement n] : s= stat EOF ;
    public final ASTStatement statOnly() throws RecognitionException {
        ASTStatement n = null;


        ShellCommandParser.stat_return s =null;


        try {
            // ShellCommand.g:1061:3: (s= stat EOF )
            // ShellCommand.g:1062:3: s= stat EOF
            {
            pushFollow(FOLLOW_stat_in_statOnly4133);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_statOnly4137); if (state.failed) return n;

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
    // ShellCommand.g:1072:1: stat returns [ASTStatement n] : s= singleStat ( SEMI s2= singleStat )* ;
    public final ShellCommandParser.stat_return stat() throws RecognitionException {
        ShellCommandParser.stat_return retval = new ShellCommandParser.stat_return();
        retval.start = input.LT(1);


        ASTStatement s =null;

        ASTStatement s2 =null;



          ASTSequenceStatement seq = new ASTSequenceStatement(((Token)retval.start));

        try {
            // ShellCommand.g:1076:3: (s= singleStat ( SEMI s2= singleStat )* )
            // ShellCommand.g:1077:3: s= singleStat ( SEMI s2= singleStat )*
            {
            pushFollow(FOLLOW_singleStat_in_stat4172);
            s=singleStat();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {seq.addStatement(s);}

            // ShellCommand.g:1078:3: ( SEMI s2= singleStat )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==SEMI) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ShellCommand.g:1079:5: SEMI s2= singleStat
            	    {
            	    match(input,SEMI,FOLLOW_SEMI_in_stat4184); if (state.failed) return retval;

            	    pushFollow(FOLLOW_singleStat_in_stat4194);
            	    s2=singleStat();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {seq.addStatement(s2); }

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // ShellCommand.g:1091:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat );
    public final ASTStatement singleStat() throws RecognitionException {
        ASTStatement n = null;


        ASTEmptyStatement emp =null;

        ShellCommandParser.statStartingWithExpr_return sse =null;

        ASTStatement vas =null;

        ShellCommandParser.objCreateStat_return ocs =null;

        ShellCommandParser.objDestroyStat_return ods =null;

        ShellCommandParser.lnkInsStat_return lis =null;

        ShellCommandParser.lnkDelStat_return lds =null;

        ShellCommandParser.condExStat_return ces =null;

        ShellCommandParser.iterStat_return its =null;

        ShellCommandParser.whileStat_return whs =null;

        ShellCommandParser.blockStat_return blk =null;


        try {
            // ShellCommand.g:1092:5: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat )
            int alt55=11;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==EOF||LA55_0==SEMI||(LA55_0 >= 63 && LA55_0 <= 64)) ) {
                alt55=1;
            }
            else if ( (LA55_0==76) && (synpred7_ShellCommand())) {
                alt55=2;
            }
            else if ( (LA55_0==MINUS||LA55_0==PLUS||LA55_0==78) && (synpred7_ShellCommand())) {
                alt55=2;
            }
            else if ( (LA55_0==94) && (synpred7_ShellCommand())) {
                alt55=2;
            }
            else if ( (LA55_0==67) && (synpred7_ShellCommand())) {
                alt55=2;
            }
            else if ( (LA55_0==INT) && (synpred7_ShellCommand())) {
                alt55=2;
            }
            else if ( (LA55_0==REAL) && (synpred7_ShellCommand())) {
                alt55=2;
            }
            else if ( (LA55_0==STRING) && (synpred7_ShellCommand())) {
                alt55=2;
            }
            else if ( (LA55_0==HASH) && (synpred7_ShellCommand())) {
                alt55=2;
            }
            else if ( (LA55_0==IDENT) ) {
                int LA55_13 = input.LA(2);

                if ( (synpred7_ShellCommand()) ) {
                    alt55=2;
                }
                else if ( (true) ) {
                    alt55=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 13, input);

                    throw nvae;

                }
            }
            else if ( (LA55_0==44||(LA55_0 >= 46 && LA55_0 <= 48)) && (synpred7_ShellCommand())) {
                alt55=2;
            }
            else if ( (LA55_0==81) && (synpred7_ShellCommand())) {
                alt55=2;
            }
            else if ( (LA55_0==45) && (synpred7_ShellCommand())) {
                alt55=2;
            }
            else if ( (LA55_0==85) && (synpred7_ShellCommand())) {
                alt55=2;
            }
            else if ( (LA55_0==50) && (synpred7_ShellCommand())) {
                alt55=2;
            }
            else if ( (LA55_0==79) && (synpred7_ShellCommand())) {
                alt55=2;
            }
            else if ( (LA55_0==49) && (synpred7_ShellCommand())) {
                alt55=2;
            }
            else if ( (LA55_0==STAR) && (synpred7_ShellCommand())) {
                alt55=2;
            }
            else if ( (LA55_0==AT) && (synpred7_ShellCommand())) {
                alt55=2;
            }
            else if ( (LA55_0==75) && (synpred7_ShellCommand())) {
                alt55=2;
            }
            else if ( (LA55_0==80||(LA55_0 >= 83 && LA55_0 <= 84)||(LA55_0 >= 90 && LA55_0 <= 91)) && (synpred7_ShellCommand())) {
                alt55=2;
            }
            else if ( (LA55_0==82) && (synpred7_ShellCommand())) {
                alt55=2;
            }
            else if ( (LA55_0==LPAREN) && (synpred7_ShellCommand())) {
                alt55=2;
            }
            else if ( (LA55_0==70) ) {
                int LA55_27 = input.LA(2);

                if ( (synpred7_ShellCommand()) ) {
                    alt55=2;
                }
                else if ( (true) ) {
                    alt55=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 27, input);

                    throw nvae;

                }
            }
            else if ( (LA55_0==77) ) {
                alt55=4;
            }
            else if ( (LA55_0==60) ) {
                alt55=5;
            }
            else if ( (LA55_0==73) ) {
                alt55=6;
            }
            else if ( (LA55_0==59) ) {
                alt55=7;
            }
            else if ( (LA55_0==68) ) {
                alt55=9;
            }
            else if ( (LA55_0==95) ) {
                alt55=10;
            }
            else if ( (LA55_0==54) ) {
                alt55=11;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;

            }
            switch (alt55) {
                case 1 :
                    // ShellCommand.g:1093:5: emp= emptyStat
                    {
                    pushFollow(FOLLOW_emptyStat_in_singleStat4234);
                    emp=emptyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = emp; }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1095:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
                    {
                    pushFollow(FOLLOW_statStartingWithExpr_in_singleStat4260);
                    sse=statStartingWithExpr();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (sse!=null?sse.n:null); }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:1096:5: vas= varAssignStat
                    {
                    pushFollow(FOLLOW_varAssignStat_in_singleStat4272);
                    vas=varAssignStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = vas; }

                    }
                    break;
                case 4 :
                    // ShellCommand.g:1097:5: ocs= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_singleStat4286);
                    ocs=objCreateStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ocs!=null?ocs.n:null); }

                    }
                    break;
                case 5 :
                    // ShellCommand.g:1098:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleStat4300);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ods!=null?ods.n:null); }

                    }
                    break;
                case 6 :
                    // ShellCommand.g:1099:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleStat4313);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lis!=null?lis.n:null); }

                    }
                    break;
                case 7 :
                    // ShellCommand.g:1100:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleStat4330);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lds!=null?lds.n:null); }

                    }
                    break;
                case 8 :
                    // ShellCommand.g:1101:5: ces= condExStat
                    {
                    pushFollow(FOLLOW_condExStat_in_singleStat4347);
                    ces=condExStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ces!=null?ces.n:null); }

                    }
                    break;
                case 9 :
                    // ShellCommand.g:1102:5: its= iterStat
                    {
                    pushFollow(FOLLOW_iterStat_in_singleStat4364);
                    its=iterStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (its!=null?its.n:null); }

                    }
                    break;
                case 10 :
                    // ShellCommand.g:1104:5: whs= whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_singleStat4386);
                    whs=whileStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (whs!=null?whs.n:null); }

                    }
                    break;
                case 11 :
                    // ShellCommand.g:1105:5: blk= blockStat
                    {
                    pushFollow(FOLLOW_blockStat_in_singleStat4404);
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
    // ShellCommand.g:1112:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
    public final ASTEmptyStatement emptyStat() throws RecognitionException {
        ASTEmptyStatement n = null;


        try {
            // ShellCommand.g:1113:3: ( nothing )
            // ShellCommand.g:1114:3: nothing
            {
            pushFollow(FOLLOW_nothing_in_emptyStat4431);
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
    // ShellCommand.g:1119:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
    public final ShellCommandParser.statStartingWithExpr_return statStartingWithExpr() throws RecognitionException {
        ShellCommandParser.statStartingWithExpr_return retval = new ShellCommandParser.statStartingWithExpr_return();
        retval.start = input.LT(1);


        ASTExpression expr =null;

        ASTAttributeAssignmentStatement aas =null;


        try {
            // ShellCommand.g:1120:3: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
            // ShellCommand.g:1121:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
            {
            pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr4457);
            expr=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            // ShellCommand.g:1122:3: (aas= attAssignStat[$expr.n] )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==DOT) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ShellCommand.g:1123:5: aas= attAssignStat[$expr.n]
                    {
                    pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr4471);
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
    // ShellCommand.g:1135:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
    public final ASTStatement varAssignStat() throws RecognitionException {
        ASTStatement n = null;


        Token varName=null;
        ASTRValue rVal =null;


        try {
            // ShellCommand.g:1136:3: (varName= IDENT COLON_EQUAL rVal= rValue )
            // ShellCommand.g:1137:3: varName= IDENT COLON_EQUAL rVal= rValue
            {
            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat4509); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat4513); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_varAssignStat4521);
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
    // ShellCommand.g:1149:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
    public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
        ASTAttributeAssignmentStatement n = null;


        Token attName=null;
        ASTRValue r =null;


        try {
            // ShellCommand.g:1150:3: ( DOT attName= IDENT COLON_EQUAL r= rValue )
            // ShellCommand.g:1151:3: DOT attName= IDENT COLON_EQUAL r= rValue
            {
            match(input,DOT,FOLLOW_DOT_in_attAssignStat4545); if (state.failed) return n;

            attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat4554); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat4558); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_attAssignStat4566);
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
    // ShellCommand.g:1163:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
    public final ShellCommandParser.objCreateStat_return objCreateStat() throws RecognitionException {
        ShellCommandParser.objCreateStat_return retval = new ShellCommandParser.objCreateStat_return();
        retval.start = input.LT(1);


        ASTSimpleType ident =null;

        ASTExpression objName =null;

        ShellCommandParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // ShellCommand.g:1164:3: ( 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
            // ShellCommand.g:1165:3: 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            {
            match(input,77,FOLLOW_77_in_objCreateStat4592); if (state.failed) return retval;

            pushFollow(FOLLOW_simpleType_in_objCreateStat4600);
            ident=simpleType();

            state._fsp--;
            if (state.failed) return retval;

            // ShellCommand.g:1167:3: ( LPAREN (objName= inSoilExpression )? RPAREN )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==LPAREN) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ShellCommand.g:1168:5: LPAREN (objName= inSoilExpression )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat4610); if (state.failed) return retval;

                    // ShellCommand.g:1169:7: (objName= inSoilExpression )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==AT||LA57_0==HASH||(LA57_0 >= IDENT && LA57_0 <= INT)||(LA57_0 >= LPAREN && LA57_0 <= MINUS)||LA57_0==PLUS||LA57_0==REAL||(LA57_0 >= STAR && LA57_0 <= STRING)||(LA57_0 >= 44 && LA57_0 <= 50)||LA57_0==67||LA57_0==70||(LA57_0 >= 75 && LA57_0 <= 76)||(LA57_0 >= 78 && LA57_0 <= 85)||(LA57_0 >= 90 && LA57_0 <= 91)||LA57_0==94) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ShellCommand.g:1169:8: objName= inSoilExpression
                            {
                            pushFollow(FOLLOW_inSoilExpression_in_objCreateStat4623);
                            objName=inSoilExpression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat4631); if (state.failed) return retval;

                    }
                    break;

            }


            // ShellCommand.g:1173:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==55) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ShellCommand.g:1174:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
                    {
                    match(input,55,FOLLOW_55_in_objCreateStat4649); if (state.failed) return retval;

                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat4657); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat4671);
                    p=rValListMin2WithOptionalQualifiers();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat4679); if (state.failed) return retval;

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
    // ShellCommand.g:1193:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
    public final ShellCommandParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
        ShellCommandParser.objDestroyStat_return retval = new ShellCommandParser.objDestroyStat_return();
        retval.start = input.LT(1);


        List<ASTExpression> el =null;


        try {
            // ShellCommand.g:1194:3: ( 'destroy' el= exprListMin1 )
            // ShellCommand.g:1195:3: 'destroy' el= exprListMin1
            {
            match(input,60,FOLLOW_60_in_objDestroyStat4715); if (state.failed) return retval;

            pushFollow(FOLLOW_exprListMin1_in_objDestroyStat4723);
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
    // ShellCommand.g:1214:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
    public final ShellCommandParser.lnkInsStat_return lnkInsStat() throws RecognitionException {
        ShellCommandParser.lnkInsStat_return retval = new ShellCommandParser.lnkInsStat_return();
        retval.start = input.LT(1);


        Token ass=null;
        ShellCommandParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // ShellCommand.g:1215:3: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
            // ShellCommand.g:1216:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
            {
            match(input,73,FOLLOW_73_in_lnkInsStat4749); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat4753); if (state.failed) return retval;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat4763);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat4767); if (state.failed) return retval;

            match(input,74,FOLLOW_74_in_lnkInsStat4771); if (state.failed) return retval;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat4779); if (state.failed) return retval;

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
    // ShellCommand.g:1226:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
    public final ShellCommandParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
        ShellCommandParser.rValListMin2WithOptionalQualifiers_return retval = new ShellCommandParser.rValListMin2WithOptionalQualifiers_return();
        retval.start = input.LT(1);


        ASTRValue r =null;

        List<ASTRValue> qualifierValues =null;



          retval.participans = new ArrayList<ASTRValue>();
          retval.qualifiers = new ArrayList<List<ASTRValue>>();
          List<ASTRValue> currentQualifiers = Collections.emptyList();

        try {
            // ShellCommand.g:1232:3: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
            // ShellCommand.g:1233:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4808);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add(r); }

            // ShellCommand.g:1234:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==LBRACE) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ShellCommand.g:1235:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4819); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4828);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4835); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers4851); if (state.failed) return retval;

            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4862);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add(r); }

            // ShellCommand.g:1247:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==LBRACE) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ShellCommand.g:1248:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4873); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4882);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4889); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            // ShellCommand.g:1257:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==COMMA) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ShellCommand.g:1258:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers4911); if (state.failed) return retval;

            	    pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4926);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.participans.add(r); }

            	    // ShellCommand.g:1262:5: ( LBRACE qualifierValues= rValList RBRACE )?
            	    int alt62=2;
            	    int LA62_0 = input.LA(1);

            	    if ( (LA62_0==LBRACE) ) {
            	        alt62=1;
            	    }
            	    switch (alt62) {
            	        case 1 :
            	            // ShellCommand.g:1263:6: LBRACE qualifierValues= rValList RBRACE
            	            {
            	            match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4946); if (state.failed) return retval;

            	            pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4957);
            	            qualifierValues=rValList();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

            	            match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4966); if (state.failed) return retval;

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
            	    break loop63;
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
    // ShellCommand.g:1278:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
    public final ShellCommandParser.lnkDelStat_return lnkDelStat() throws RecognitionException {
        ShellCommandParser.lnkDelStat_return retval = new ShellCommandParser.lnkDelStat_return();
        retval.start = input.LT(1);


        Token ass=null;
        ShellCommandParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // ShellCommand.g:1279:3: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
            // ShellCommand.g:1280:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
            {
            match(input,59,FOLLOW_59_in_lnkDelStat5007); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat5011); if (state.failed) return retval;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat5021);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat5025); if (state.failed) return retval;

            match(input,69,FOLLOW_69_in_lnkDelStat5029); if (state.failed) return retval;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat5038); if (state.failed) return retval;

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
    // ShellCommand.g:1294:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' ;
    public final ShellCommandParser.condExStat_return condExStat() throws RecognitionException {
        ShellCommandParser.condExStat_return retval = new ShellCommandParser.condExStat_return();
        retval.start = input.LT(1);


        ASTExpression con =null;

        ASTStatement ts =null;

        ASTStatement es =null;



          ASTStatement elseStat = new ASTEmptyStatement();

        try {
            // ShellCommand.g:1298:3: ( 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' )
            // ShellCommand.g:1299:3: 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end'
            {
            match(input,70,FOLLOW_70_in_condExStat5069); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_condExStat5078);
            con=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,93,FOLLOW_93_in_condExStat5082); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat5091);
            ts=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            // ShellCommand.g:1303:3: ( 'else' es= statOrImplicitBlock )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==63) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ShellCommand.g:1304:5: 'else' es= statOrImplicitBlock
                    {
                    match(input,63,FOLLOW_63_in_condExStat5102); if (state.failed) return retval;

                    pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat5114);
                    es=statOrImplicitBlock();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { elseStat = es; }

                    }
                    break;

            }


            match(input,64,FOLLOW_64_in_condExStat5126); if (state.failed) return retval;

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
    // ShellCommand.g:1315:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final ShellCommandParser.iterStat_return iterStat() throws RecognitionException {
        ShellCommandParser.iterStat_return retval = new ShellCommandParser.iterStat_return();
        retval.start = input.LT(1);


        Token var=null;
        ASTExpression set =null;

        ASTStatement s =null;


        try {
            // ShellCommand.g:1316:3: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // ShellCommand.g:1317:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,68,FOLLOW_68_in_iterStat5151); if (state.failed) return retval;

            var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat5159); if (state.failed) return retval;

            match(input,72,FOLLOW_72_in_iterStat5163); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_iterStat5171);
            set=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,62,FOLLOW_62_in_iterStat5175); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_iterStat5183);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            match(input,64,FOLLOW_64_in_iterStat5188); if (state.failed) return retval;

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
    // ShellCommand.g:1332:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final ShellCommandParser.whileStat_return whileStat() throws RecognitionException {
        ShellCommandParser.whileStat_return retval = new ShellCommandParser.whileStat_return();
        retval.start = input.LT(1);


        ASTExpression cond =null;

        ASTStatement s =null;


        try {
            // ShellCommand.g:1333:3: ( 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // ShellCommand.g:1334:3: 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,95,FOLLOW_95_in_whileStat5214); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_whileStat5222);
            cond=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,62,FOLLOW_62_in_whileStat5226); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_whileStat5234);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            match(input,64,FOLLOW_64_in_whileStat5239); if (state.failed) return retval;

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
    // ShellCommand.g:1346:1: blockStat returns [ASTBlockStatement n] : 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' ;
    public final ShellCommandParser.blockStat_return blockStat() throws RecognitionException {
        ShellCommandParser.blockStat_return retval = new ShellCommandParser.blockStat_return();
        retval.start = input.LT(1);


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        ShellCommandParser.stat_return s =null;



          retval.n = new ASTBlockStatement(((Token)retval.start), org.tzi.use.config.Options.explicitVariableDeclarations);

        try {
            // ShellCommand.g:1350:2: ( 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' )
            // ShellCommand.g:1351:2: 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end'
            {
            match(input,54,FOLLOW_54_in_blockStat5269); if (state.failed) return retval;

            // ShellCommand.g:1352:2: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==58) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ShellCommand.g:1352:4: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI
                    {
                    match(input,58,FOLLOW_58_in_blockStat5274); if (state.failed) return retval;

                    pushFollow(FOLLOW_variableDeclaration_in_blockStat5280);
                    vd=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}

                    // ShellCommand.g:1352:73: ( COMMA vd1= variableDeclaration )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==COMMA) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ShellCommand.g:1352:75: COMMA vd1= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_blockStat5286); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_variableDeclaration_in_blockStat5292);
                    	    vd1=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}

                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);


                    match(input,SEMI,FOLLOW_SEMI_in_blockStat5299); if (state.failed) return retval;

                    }
                    break;

            }


            pushFollow(FOLLOW_stat_in_blockStat5309);
            s=stat();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n.setBody((s!=null?s.n:null)); }

            match(input,64,FOLLOW_64_in_blockStat5314); if (state.failed) return retval;

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
    // ShellCommand.g:1361:1: implicitBlockStat returns [ASTBlockStatement n] : 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat ;
    public final ShellCommandParser.implicitBlockStat_return implicitBlockStat() throws RecognitionException {
        ShellCommandParser.implicitBlockStat_return retval = new ShellCommandParser.implicitBlockStat_return();
        retval.start = input.LT(1);


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        ShellCommandParser.stat_return s =null;



          retval.n = new ASTBlockStatement(((Token)retval.start), false);

        try {
            // ShellCommand.g:1365:3: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat )
            // ShellCommand.g:1366:3: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat
            {
            match(input,58,FOLLOW_58_in_implicitBlockStat5340); if (state.failed) return retval;

            pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat5346);
            vd=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}

            // ShellCommand.g:1366:72: ( COMMA vd1= variableDeclaration )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==COMMA) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ShellCommand.g:1366:74: COMMA vd1= variableDeclaration
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_implicitBlockStat5352); if (state.failed) return retval;

            	    pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat5358);
            	    vd1=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            match(input,SEMI,FOLLOW_SEMI_in_implicitBlockStat5365); if (state.failed) return retval;

            pushFollow(FOLLOW_stat_in_implicitBlockStat5373);
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
    // ShellCommand.g:1370:1: statOrImplicitBlock returns [ASTStatement n] : (s1= stat |s2= implicitBlockStat ) ;
    public final ASTStatement statOrImplicitBlock() throws RecognitionException {
        ASTStatement n = null;


        ShellCommandParser.stat_return s1 =null;

        ShellCommandParser.implicitBlockStat_return s2 =null;


        try {
            // ShellCommand.g:1371:3: ( (s1= stat |s2= implicitBlockStat ) )
            // ShellCommand.g:1372:3: (s1= stat |s2= implicitBlockStat )
            {
            // ShellCommand.g:1372:3: (s1= stat |s2= implicitBlockStat )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==AT||LA68_0==HASH||(LA68_0 >= IDENT && LA68_0 <= INT)||(LA68_0 >= LPAREN && LA68_0 <= MINUS)||LA68_0==PLUS||LA68_0==REAL||LA68_0==SEMI||(LA68_0 >= STAR && LA68_0 <= STRING)||(LA68_0 >= 44 && LA68_0 <= 50)||LA68_0==54||(LA68_0 >= 59 && LA68_0 <= 60)||(LA68_0 >= 63 && LA68_0 <= 64)||(LA68_0 >= 67 && LA68_0 <= 68)||LA68_0==70||LA68_0==73||(LA68_0 >= 75 && LA68_0 <= 85)||(LA68_0 >= 90 && LA68_0 <= 91)||(LA68_0 >= 94 && LA68_0 <= 95)) ) {
                alt68=1;
            }
            else if ( (LA68_0==58) ) {
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
                    // ShellCommand.g:1372:4: s1= stat
                    {
                    pushFollow(FOLLOW_stat_in_statOrImplicitBlock5396);
                    s1=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s1!=null?s1.n:null); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1372:31: s2= implicitBlockStat
                    {
                    pushFollow(FOLLOW_implicitBlockStat_in_statOrImplicitBlock5406);
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
    // ShellCommand.g:1386:1: nothing :;
    public final void nothing() throws RecognitionException {
        try {
            // ShellCommand.g:1387:1: ()
            // ShellCommand.g:1388:1: 
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
    // ShellCommand.g:1394:1: rValue returns [ASTRValue n] : (e= inSoilExpression |oc= objCreateStat );
    public final ASTRValue rValue() throws RecognitionException {
        ASTRValue n = null;


        ASTExpression e =null;

        ShellCommandParser.objCreateStat_return oc =null;


        try {
            // ShellCommand.g:1395:5: (e= inSoilExpression |oc= objCreateStat )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==AT||LA69_0==HASH||(LA69_0 >= IDENT && LA69_0 <= INT)||(LA69_0 >= LPAREN && LA69_0 <= MINUS)||LA69_0==PLUS||LA69_0==REAL||(LA69_0 >= STAR && LA69_0 <= STRING)||(LA69_0 >= 44 && LA69_0 <= 50)||LA69_0==67||LA69_0==70||(LA69_0 >= 75 && LA69_0 <= 76)||(LA69_0 >= 78 && LA69_0 <= 85)||(LA69_0 >= 90 && LA69_0 <= 91)||LA69_0==94) ) {
                alt69=1;
            }
            else if ( (LA69_0==77) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }
            switch (alt69) {
                case 1 :
                    // ShellCommand.g:1396:5: e= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_rValue5452);
                    e=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRValueExpressionOrOpCall(e); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1397:5: oc= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_rValue5464);
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
    // ShellCommand.g:1410:1: rValList returns [List<ASTRValue> n] : ( nothing |rl= rValListMin1 );
    public final List<ASTRValue> rValList() throws RecognitionException {
        List<ASTRValue> n = null;


        List<ASTRValue> rl =null;


        try {
            // ShellCommand.g:1411:3: ( nothing |rl= rValListMin1 )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RBRACE) ) {
                alt70=1;
            }
            else if ( (LA70_0==AT||LA70_0==HASH||(LA70_0 >= IDENT && LA70_0 <= INT)||(LA70_0 >= LPAREN && LA70_0 <= MINUS)||LA70_0==PLUS||LA70_0==REAL||(LA70_0 >= STAR && LA70_0 <= STRING)||(LA70_0 >= 44 && LA70_0 <= 50)||LA70_0==67||LA70_0==70||(LA70_0 >= 75 && LA70_0 <= 85)||(LA70_0 >= 90 && LA70_0 <= 91)||LA70_0==94) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }
            switch (alt70) {
                case 1 :
                    // ShellCommand.g:1412:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_rValList5487);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = Collections.<ASTRValue>emptyList(); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1415:3: rl= rValListMin1
                    {
                    pushFollow(FOLLOW_rValListMin1_in_rValList5514);
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
    // ShellCommand.g:1423:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin1() throws RecognitionException {
        List<ASTRValue> n = null;


        ASTRValue r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // ShellCommand.g:1427:3: (r= rValue ( COMMA r= rValue )* )
            // ShellCommand.g:1428:3: r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin15547);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            // ShellCommand.g:1430:3: ( COMMA r= rValue )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==COMMA) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ShellCommand.g:1431:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin15561); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin15571);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add(r); }

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
        return n;
    }
    // $ANTLR end "rValListMin1"



    // $ANTLR start "rValListMin2"
    // ShellCommand.g:1441:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin2() throws RecognitionException {
        List<ASTRValue> n = null;


        ASTRValue r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // ShellCommand.g:1445:3: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
            // ShellCommand.g:1446:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin25610);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin25618); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_rValListMin25626);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            // ShellCommand.g:1451:3: ( COMMA r= rValue )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==COMMA) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ShellCommand.g:1452:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin25640); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin25650);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add(r); }

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
        return n;
    }
    // $ANTLR end "rValListMin2"



    // $ANTLR start "inSoilExpression"
    // ShellCommand.g:1462:1: inSoilExpression returns [ASTExpression n] : e= expression ;
    public final ASTExpression inSoilExpression() throws RecognitionException {
        ASTExpression n = null;


        ShellCommandParser.expression_return e =null;


        try {
            // ShellCommand.g:1463:3: (e= expression )
            // ShellCommand.g:1464:3: e= expression
            {
            pushFollow(FOLLOW_expression_in_inSoilExpression5684);
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
    // ShellCommand.g:1473:1: exprList returns [List<ASTExpression> n] : ( nothing |el= exprListMin1 );
    public final List<ASTExpression> exprList() throws RecognitionException {
        List<ASTExpression> n = null;


        List<ASTExpression> el =null;


        try {
            // ShellCommand.g:1474:3: ( nothing |el= exprListMin1 )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RPAREN) ) {
                alt73=1;
            }
            else if ( (LA73_0==AT||LA73_0==HASH||(LA73_0 >= IDENT && LA73_0 <= INT)||(LA73_0 >= LPAREN && LA73_0 <= MINUS)||LA73_0==PLUS||LA73_0==REAL||(LA73_0 >= STAR && LA73_0 <= STRING)||(LA73_0 >= 44 && LA73_0 <= 50)||LA73_0==67||LA73_0==70||(LA73_0 >= 75 && LA73_0 <= 76)||(LA73_0 >= 78 && LA73_0 <= 85)||(LA73_0 >= 90 && LA73_0 <= 91)||LA73_0==94) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;

            }
            switch (alt73) {
                case 1 :
                    // ShellCommand.g:1475:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_exprList5713);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<ASTExpression>(); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1478:3: el= exprListMin1
                    {
                    pushFollow(FOLLOW_exprListMin1_in_exprList5731);
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
    // ShellCommand.g:1486:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin1() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // ShellCommand.g:1490:3: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // ShellCommand.g:1491:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin15764);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // ShellCommand.g:1493:3: ( COMMA e= inSoilExpression )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==COMMA) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ShellCommand.g:1494:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin15779); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin15789);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

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
    // $ANTLR end "exprListMin1"



    // $ANTLR start "exprListMin2"
    // ShellCommand.g:1504:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin2() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // ShellCommand.g:1508:3: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // ShellCommand.g:1509:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin25829);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            match(input,COMMA,FOLLOW_COMMA_in_exprListMin25837); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_exprListMin25845);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // ShellCommand.g:1514:3: ( COMMA e= inSoilExpression )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==COMMA) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ShellCommand.g:1515:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin25859); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin25869);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            	    }
            	    break;

            	default :
            	    break loop75;
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
    // ShellCommand.g:1525:1: identList returns [List<String> n] : ( nothing |il= identListMin1 );
    public final List<String> identList() throws RecognitionException {
        List<String> n = null;


        List<String> il =null;


        try {
            // ShellCommand.g:1526:3: ( nothing |il= identListMin1 )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==EOF||LA76_0==RBRACE||(LA76_0 >= RPAREN && LA76_0 <= SEMI)||(LA76_0 >= 63 && LA76_0 <= 64)) ) {
                alt76=1;
            }
            else if ( (LA76_0==IDENT) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;

            }
            switch (alt76) {
                case 1 :
                    // ShellCommand.g:1527:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_identList5899);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<String>(); }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1530:3: il= identListMin1
                    {
                    pushFollow(FOLLOW_identListMin1_in_identList5916);
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
    // ShellCommand.g:1538:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
    public final List<String> identListMin1() throws RecognitionException {
        List<String> n = null;


        Token id=null;


          n = new ArrayList<String>();

        try {
            // ShellCommand.g:1542:3: (id= IDENT ( COMMA id= IDENT )* )
            // ShellCommand.g:1543:3: id= IDENT ( COMMA id= IDENT )*
            {
            id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin15950); if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((id!=null?id.getText():null)); }

            // ShellCommand.g:1545:3: ( COMMA id= IDENT )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==COMMA) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ShellCommand.g:1546:5: COMMA id= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identListMin15964); if (state.failed) return n;

            	    id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin15974); if (state.failed) return n;

            	    if ( state.backtracking==0 ) {
            	        n.add((id!=null?id.getText():null)); }

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
    // $ANTLR end "identListMin1"

    // $ANTLR start synpred1_ShellCommand
    public final void synpred1_ShellCommand_fragment() throws RecognitionException {
        // ShellCommand.g:87:3: ( stat )
        // ShellCommand.g:87:4: stat
        {
        pushFollow(FOLLOW_stat_in_synpred1_ShellCommand57);
        stat();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_ShellCommand

    // $ANTLR start synpred2_ShellCommand
    public final void synpred2_ShellCommand_fragment() throws RecognitionException {
        // ShellCommand.g:90:3: ( legacyStat )
        // ShellCommand.g:90:4: legacyStat
        {
        pushFollow(FOLLOW_legacyStat_in_synpred2_ShellCommand78);
        legacyStat();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_ShellCommand

    // $ANTLR start synpred3_ShellCommand
    public final void synpred3_ShellCommand_fragment() throws RecognitionException {
        // ShellCommand.g:100:3: ( legacyStat )
        // ShellCommand.g:100:4: legacyStat
        {
        pushFollow(FOLLOW_legacyStat_in_synpred3_ShellCommand110);
        legacyStat();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_ShellCommand

    // $ANTLR start synpred4_ShellCommand
    public final void synpred4_ShellCommand_fragment() throws RecognitionException {
        // ShellCommand.g:103:3: ( stat )
        // ShellCommand.g:103:4: stat
        {
        pushFollow(FOLLOW_stat_in_synpred4_ShellCommand133);
        stat();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_ShellCommand

    // $ANTLR start synpred5_ShellCommand
    public final void synpred5_ShellCommand_fragment() throws RecognitionException {
        // ShellCommand.g:339:13: ( inSoilExpression )
        // ShellCommand.g:339:14: inSoilExpression
        {
        pushFollow(FOLLOW_inSoilExpression_in_synpred5_ShellCommand813);
        inSoilExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_ShellCommand

    // $ANTLR start synpred6_ShellCommand
    public final void synpred6_ShellCommand_fragment() throws RecognitionException {
        // ShellCommand.g:944:7: ( COLON type EQUAL )
        // ShellCommand.g:944:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred6_ShellCommand3700); if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred6_ShellCommand3702);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUAL,FOLLOW_EQUAL_in_synpred6_ShellCommand3704); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_ShellCommand

    // $ANTLR start synpred7_ShellCommand
    public final void synpred7_ShellCommand_fragment() throws RecognitionException {
        // ShellCommand.g:1095:5: ( statStartingWithExpr )
        // ShellCommand.g:1095:6: statStartingWithExpr
        {
        pushFollow(FOLLOW_statStartingWithExpr_in_synpred7_ShellCommand4252);
        statStartingWithExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_ShellCommand

    // Delegated rules

    public final boolean synpred7_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_stat_in_shellCommandOnly65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_shellCommandOnly86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_shellCommand118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_shellCommand120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_shellCommand141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_shellCommand143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyOpEnter_in_legacyStat177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyOpExit_in_legacyStat193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nextLegacyStat_in_legacyStat206 = new BitSet(new long[]{0x1A20000000000002L,0x0000000010001204L});
    public static final BitSet FOLLOW_nextLegacyStat_in_legacyStat217 = new BitSet(new long[]{0x1A20000000000002L,0x0000000010001204L});
    public static final BitSet FOLLOW_singleLegacyStat_in_nextLegacyStat251 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_nextLegacyStat255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyCreate_in_singleLegacyStat288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyCreateAssign_in_singleLegacyStat307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyCreateInsert_in_singleLegacyStat320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyLet_in_singleLegacyStat333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyExecute_in_singleLegacyStat361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleLegacyStat379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_singleLegacyStat392 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_expression_in_singleLegacyStat396 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_attAssignStat_in_singleLegacyStat402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleLegacyStat415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleLegacyStat436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_legacyCreate472 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_identListMin1_in_legacyCreate480 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_legacyCreate484 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_legacyCreate492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_legacyCreateAssign529 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_identListMin1_in_legacyCreateAssign537 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_legacyCreateAssign541 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_legacyCreateAssign545 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_legacyCreateAssign553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_legacyCreateInsert587 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_legacyCreateInsert595 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_legacyCreateInsert599 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_legacyCreateInsert607 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_legacyCreateInsert611 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_legacyCreateInsert615 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FF848L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_legacyCreateInsert625 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_legacyCreateInsert629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_legacyLet662 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_legacyLet670 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_legacyLet680 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_legacyLet690 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_legacyLet699 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_inSoilExpression_in_legacyLet707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_legacyOpEnter740 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_inSoilExpression_in_legacyOpEnter748 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_legacyOpEnter756 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_legacyOpEnter760 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_exprList_in_legacyOpEnter770 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_legacyOpEnter774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_legacyOpExit809 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_inSoilExpression_in_legacyOpExit821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_legacyOpExit825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_legacyExecute858 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_expression_in_legacyExecute862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_expression947 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression958 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression962 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_expression966 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression971 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_expression_in_expression975 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000100L});
    public static final BitSet FOLLOW_COMMA_in_expression1013 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression1025 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression1029 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_expression1033 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression1038 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_expression_in_expression1042 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_expression1083 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList1132 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList1149 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_paramList1161 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList1165 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_paramList1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList1214 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_idList1224 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_idList1228 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration1259 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration1261 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1301 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_conditionalImpliesExpression1314 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FC848L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1318 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1363 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_conditionalOrExpression1376 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FC848L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1380 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1424 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_conditionalXOrExpression1437 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FC848L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1441 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1485 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_conditionalAndExpression1498 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FC848L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1502 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1550 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_set_in_equalityExpression1569 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FC848L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1579 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1628 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_set_in_relationalExpression1646 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FC848L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1664 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1714 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression1732 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FC848L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1742 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1792 = new BitSet(new long[]{0x2000014000000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1810 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FC848L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1824 = new BitSet(new long[]{0x2000014000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpression1886 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FC848L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression1963 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression1981 = new BitSet(new long[]{0x0000000000080000L,0x000000000C1D0800L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression1987 = new BitSet(new long[]{0x0000000000080000L,0x000000000C1D0800L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression1998 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_literal_in_primaryExpression2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression2075 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_expression_in_primaryExpression2079 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression2105 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression2107 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_primaryExpression2109 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression2132 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_primaryExpression2134 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression2152 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression2167 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression2169 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_primaryExpression2171 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression2175 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_expression_in_primaryExpression2179 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression2181 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression2201 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_primaryExpression2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference2229 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_objectReference2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inStateExpression_in_propertyCall2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression2389 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression2396 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression2407 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_queryExpression2411 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_expression_in_queryExpression2422 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_iterateExpression2460 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression2466 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression2474 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression2476 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression2484 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression2486 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_expression_in_iterateExpression2494 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression2544 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2566 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_expression_in_operationExpression2579 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2592 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_expression_in_operationExpression2596 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2608 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2625 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_expression_in_operationExpression2640 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2655 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_expression_in_operationExpression2659 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2673 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_operationExpression2698 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_operationExpression2700 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression2725 = new BitSet(new long[]{0x0007F318861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_expression_in_operationExpression2746 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2758 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_expression_in_operationExpression2762 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_inStateExpression2819 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_inStateExpression2824 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_inStateExpression2833 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_inStateExpression2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression2874 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression2898 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_typeExpression2902 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2942 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2945 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration2949 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration2959 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration2965 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2968 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration2974 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization3002 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization3004 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_variableInitialization3008 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization3010 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_expression_in_variableInitialization3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ifExpression3046 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_expression_in_ifExpression3050 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ifExpression3052 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_expression_in_ifExpression3056 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ifExpression3058 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_expression_in_ifExpression3062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ifExpression3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_literal3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_literal3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal3169 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal3185 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal3187 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_literal3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral3289 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral3318 = new BitSet(new long[]{0x0007F30A861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral3335 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral3348 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral3352 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem3400 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem3411 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_expression_in_collectionItem3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_emptyCollectionLiteral3444 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral3446 = new BitSet(new long[]{0x0001F00000000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral3450 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral3468 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral3470 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_undefinedLiteral3502 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3504 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3508 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_undefinedLiteral3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_undefinedLiteral3538 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3540 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3544 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_undefinedLiteral3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_tupleLiteral3599 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral3605 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3613 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral3624 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3628 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem3670 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_tupleItem3709 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_tupleItem3713 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem3715 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_expression_in_tupleItem3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem3741 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_expression_in_tupleItem3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly3873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType3941 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType3968 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_collectionType3972 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_tupleType4008 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType4010 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType4019 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleType4030 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType4034 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType4046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart4078 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_tuplePart4080 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_tuplePart4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOnly4133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statOnly4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_singleStat_in_stat4172 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_stat4184 = new BitSet(new long[]{0x1847F308861A0020L,0x00000000CC3FFA58L});
    public static final BitSet FOLLOW_singleStat_in_stat4194 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_emptyStat_in_singleStat4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignStat_in_singleStat4272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_singleStat4286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleStat4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleStat4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleStat4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExStat_in_singleStat4347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterStat_in_singleStat4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_singleStat4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStat_in_singleStat4404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_emptyStat4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr4457 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr4471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varAssignStat4509 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat4513 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FF848L});
    public static final BitSet FOLLOW_rValue_in_varAssignStat4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_attAssignStat4545 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attAssignStat4554 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat4558 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FF848L});
    public static final BitSet FOLLOW_rValue_in_attAssignStat4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_objCreateStat4592 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_objCreateStat4600 = new BitSet(new long[]{0x0080000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat4610 = new BitSet(new long[]{0x0007F318861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat4623 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat4631 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_objCreateStat4649 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat4657 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FF848L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat4671 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat4679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_objDestroyStat4715 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_lnkInsStat4749 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkInsStat4753 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FF848L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat4763 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkInsStat4767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_lnkInsStat4771 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkInsStat4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4808 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4819 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FF848L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4828 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4835 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers4851 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FF848L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4862 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4873 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FF848L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4882 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4889 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers4911 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FF848L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4926 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4946 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FF848L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4957 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4966 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_59_in_lnkDelStat5007 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkDelStat5011 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FF848L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat5021 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkDelStat5025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_lnkDelStat5029 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkDelStat5038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_condExStat5069 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_inSoilExpression_in_condExStat5078 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_condExStat5082 = new BitSet(new long[]{0x1C47F308861A0020L,0x00000000CC3FFA58L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat5091 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_63_in_condExStat5102 = new BitSet(new long[]{0x1C47F308861A0020L,0x00000000CC3FFA58L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat5114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_condExStat5126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_iterStat5151 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_iterStat5159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_iterStat5163 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_inSoilExpression_in_iterStat5171 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_iterStat5175 = new BitSet(new long[]{0x1C47F308861A0020L,0x00000000CC3FFA58L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_iterStat5183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_iterStat5188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_whileStat5214 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_inSoilExpression_in_whileStat5222 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_whileStat5226 = new BitSet(new long[]{0x1C47F308861A0020L,0x00000000CC3FFA58L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_whileStat5234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_whileStat5239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_blockStat5269 = new BitSet(new long[]{0x1C47F308861A0020L,0x00000000CC3FFA58L});
    public static final BitSet FOLLOW_58_in_blockStat5274 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat5280 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_blockStat5286 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat5292 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_blockStat5299 = new BitSet(new long[]{0x1847F308861A0020L,0x00000000CC3FFA58L});
    public static final BitSet FOLLOW_stat_in_blockStat5309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_blockStat5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_implicitBlockStat5340 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat5346 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_implicitBlockStat5352 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat5358 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_implicitBlockStat5365 = new BitSet(new long[]{0x1847F308861A0020L,0x00000000CC3FFA58L});
    public static final BitSet FOLLOW_stat_in_implicitBlockStat5373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOrImplicitBlock5396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitBlockStat_in_statOrImplicitBlock5406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_rValue5452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_rValue5464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_rValList5487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValListMin1_in_rValList5514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin15547 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin15561 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FF848L});
    public static final BitSet FOLLOW_rValue_in_rValListMin15571 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rValue_in_rValListMin25610 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin25618 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FF848L});
    public static final BitSet FOLLOW_rValue_in_rValListMin25626 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin25640 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FF848L});
    public static final BitSet FOLLOW_rValue_in_rValListMin25650 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_expression_in_inSoilExpression5684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_exprList5713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprListMin1_in_exprList5731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin15764 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin15779 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin15789 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin25829 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin25837 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin25845 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin25859 = new BitSet(new long[]{0x0007F308861A0020L,0x000000004C3FD848L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin25869 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_nothing_in_identList5899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identListMin1_in_identList5916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identListMin15950 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_identListMin15964 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_identListMin15974 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_stat_in_synpred1_ShellCommand57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_synpred2_ShellCommand78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_synpred3_ShellCommand110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_synpred4_ShellCommand133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_synpred5_ShellCommand813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_synpred6_ShellCommand3700 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_synpred6_ShellCommand3702 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred6_ShellCommand3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_synpred7_ShellCommand4252 = new BitSet(new long[]{0x0000000000000002L});

}