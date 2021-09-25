// $ANTLR 3.4 ShellCommand.g 2021-09-25 14:47:11

/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2010 Mark Richters, University of Bremen
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

import org.tzi.use.parser.ParseErrorHandler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ShellCommandLexer extends Lexer {
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

        private ParseErrorHandler fParseErrorHandler;

        public String getFilename() {
            return fParseErrorHandler.getFileName();
        }
        
        @Override
        public String getErrorHeader(RecognitionException e) {
        	return "line " + e.line + ":" + e.charPositionInLine;
        }
        	
        public void emitErrorMessage(String msg) {
            fParseErrorHandler.reportError(msg);
        }
     
        public void init(ParseErrorHandler handler) {
            fParseErrorHandler = handler;
        }


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ShellCommandLexer() {} 
    public ShellCommandLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ShellCommandLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "ShellCommand.g"; }

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:47:7: ( 'Bag' )
            // ShellCommand.g:47:9: 'Bag'
            {
            match("Bag"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:48:7: ( 'Collection' )
            // ShellCommand.g:48:9: 'Collection'
            {
            match("Collection"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:49:7: ( 'OrderedSet' )
            // ShellCommand.g:49:9: 'OrderedSet'
            {
            match("OrderedSet"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:50:7: ( 'Sequence' )
            // ShellCommand.g:50:9: 'Sequence'
            {
            match("Sequence"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:51:7: ( 'Set' )
            // ShellCommand.g:51:9: 'Set'
            {
            match("Set"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:52:7: ( 'Tuple' )
            // ShellCommand.g:52:9: 'Tuple'
            {
            match("Tuple"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:53:7: ( 'Undefined' )
            // ShellCommand.g:53:9: 'Undefined'
            {
            match("Undefined"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:54:7: ( 'allInstances' )
            // ShellCommand.g:54:9: 'allInstances'
            {
            match("allInstances"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:55:7: ( 'and' )
            // ShellCommand.g:55:9: 'and'
            {
            match("and"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:56:7: ( 'assign' )
            // ShellCommand.g:56:9: 'assign'
            {
            match("assign"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:57:7: ( 'begin' )
            // ShellCommand.g:57:9: 'begin'
            {
            match("begin"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:58:7: ( 'between' )
            // ShellCommand.g:58:9: 'between'
            {
            match("between"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:59:7: ( 'byUseId' )
            // ShellCommand.g:59:9: 'byUseId'
            {
            match("byUseId"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:60:7: ( 'create' )
            // ShellCommand.g:60:9: 'create'
            {
            match("create"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:61:7: ( 'declare' )
            // ShellCommand.g:61:9: 'declare'
            {
            match("declare"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:62:7: ( 'delete' )
            // ShellCommand.g:62:9: 'delete'
            {
            match("delete"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:63:7: ( 'destroy' )
            // ShellCommand.g:63:9: 'destroy'
            {
            match("destroy"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:64:7: ( 'div' )
            // ShellCommand.g:64:9: 'div'
            {
            match("div"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:65:7: ( 'do' )
            // ShellCommand.g:65:9: 'do'
            {
            match("do"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:66:7: ( 'else' )
            // ShellCommand.g:66:9: 'else'
            {
            match("else"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:67:7: ( 'end' )
            // ShellCommand.g:67:9: 'end'
            {
            match("end"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:68:7: ( 'endif' )
            // ShellCommand.g:68:9: 'endif'
            {
            match("endif"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:69:7: ( 'execute' )
            // ShellCommand.g:69:9: 'execute'
            {
            match("execute"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:70:7: ( 'false' )
            // ShellCommand.g:70:9: 'false'
            {
            match("false"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:71:7: ( 'for' )
            // ShellCommand.g:71:9: 'for'
            {
            match("for"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:72:7: ( 'from' )
            // ShellCommand.g:72:9: 'from'
            {
            match("from"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:73:7: ( 'if' )
            // ShellCommand.g:73:9: 'if'
            {
            match("if"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:74:7: ( 'implies' )
            // ShellCommand.g:74:9: 'implies'
            {
            match("implies"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:75:7: ( 'in' )
            // ShellCommand.g:75:9: 'in'
            {
            match("in"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:76:7: ( 'insert' )
            // ShellCommand.g:76:9: 'insert'
            {
            match("insert"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:77:7: ( 'into' )
            // ShellCommand.g:77:9: 'into'
            {
            match("into"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:78:7: ( 'iterate' )
            // ShellCommand.g:78:9: 'iterate'
            {
            match("iterate"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:79:7: ( 'let' )
            // ShellCommand.g:79:9: 'let'
            {
            match("let"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:80:7: ( 'new' )
            // ShellCommand.g:80:9: 'new'
            {
            match("new"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:81:7: ( 'not' )
            // ShellCommand.g:81:9: 'not'
            {
            match("not"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:82:7: ( 'null' )
            // ShellCommand.g:82:9: 'null'
            {
            match("null"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:83:7: ( 'oclAsType' )
            // ShellCommand.g:83:9: 'oclAsType'
            {
            match("oclAsType"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:84:7: ( 'oclEmpty' )
            // ShellCommand.g:84:9: 'oclEmpty'
            {
            match("oclEmpty"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:85:7: ( 'oclInState' )
            // ShellCommand.g:85:9: 'oclInState'
            {
            match("oclInState"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:86:7: ( 'oclIsKindOf' )
            // ShellCommand.g:86:9: 'oclIsKindOf'
            {
            match("oclIsKindOf"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:87:7: ( 'oclIsTypeOf' )
            // ShellCommand.g:87:9: 'oclIsTypeOf'
            {
            match("oclIsTypeOf"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:88:7: ( 'oclUndefined' )
            // ShellCommand.g:88:9: 'oclUndefined'
            {
            match("oclUndefined"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:89:7: ( 'openter' )
            // ShellCommand.g:89:9: 'openter'
            {
            match("openter"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:90:7: ( 'opexit' )
            // ShellCommand.g:90:9: 'opexit'
            {
            match("opexit"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:91:7: ( 'or' )
            // ShellCommand.g:91:9: 'or'
            {
            match("or"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:92:7: ( 'pre' )
            // ShellCommand.g:92:9: 'pre'
            {
            match("pre"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:93:7: ( 'selectByKind' )
            // ShellCommand.g:93:9: 'selectByKind'
            {
            match("selectByKind"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:94:7: ( 'selectByType' )
            // ShellCommand.g:94:9: 'selectByType'
            {
            match("selectByType"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:95:7: ( 'set' )
            // ShellCommand.g:95:9: 'set'
            {
            match("set"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:96:7: ( 'then' )
            // ShellCommand.g:96:9: 'then'
            {
            match("then"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:97:7: ( 'true' )
            // ShellCommand.g:97:9: 'true'
            {
            match("true"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:98:7: ( 'while' )
            // ShellCommand.g:98:9: 'while'
            {
            match("while"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:99:7: ( 'xor' )
            // ShellCommand.g:99:9: 'xor'
            {
            match("xor"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1562:3: ( ( ' ' | '\\t' | '\\f' | NEWLINE ) )
            // ShellCommand.g:1563:5: ( ' ' | '\\t' | '\\f' | NEWLINE )
            {
            // ShellCommand.g:1563:5: ( ' ' | '\\t' | '\\f' | NEWLINE )
            int alt1=4;
            switch ( input.LA(1) ) {
            case ' ':
                {
                alt1=1;
                }
                break;
            case '\t':
                {
                alt1=2;
                }
                break;
            case '\f':
                {
                alt1=3;
                }
                break;
            case '\n':
            case '\r':
                {
                alt1=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // ShellCommand.g:1563:7: ' '
                    {
                    match(' '); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1564:7: '\\t'
                    {
                    match('\t'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // ShellCommand.g:1565:7: '\\f'
                    {
                    match('\f'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // ShellCommand.g:1566:7: NEWLINE
                    {
                    mNEWLINE(); if (state.failed) return ;


                    }
                    break;

            }


            if ( state.backtracking==0 ) { _channel=HIDDEN; }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1572:11: ( ( '//' | '--' ) (~ ( NEWLINE ) )* )
            // ShellCommand.g:1573:5: ( '//' | '--' ) (~ ( NEWLINE ) )*
            {
            // ShellCommand.g:1573:5: ( '//' | '--' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='/') ) {
                alt2=1;
            }
            else if ( (LA2_0=='-') ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // ShellCommand.g:1573:6: '//'
                    {
                    match("//"); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // ShellCommand.g:1573:13: '--'
                    {
                    match("--"); if (state.failed) return ;



                    }
                    break;

            }


            // ShellCommand.g:1574:5: (~ ( NEWLINE ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ShellCommand.g:1574:6: ~ ( NEWLINE )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            if ( state.backtracking==0 ) { _channel=HIDDEN; }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1579:11: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ShellCommand.g:1580:5: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); if (state.failed) return ;



            // ShellCommand.g:1580:10: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1 >= '\u0000' && LA4_1 <= '.')||(LA4_1 >= '0' && LA4_1 <= '\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0 >= '\u0000' && LA4_0 <= ')')||(LA4_0 >= '+' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ShellCommand.g:1580:38: .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match("*/"); if (state.failed) return ;



            if ( state.backtracking==0 ) { _channel=HIDDEN; }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            // ShellCommand.g:1584:9: ( '\\r\\n' | '\\r' | '\\n' )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='\n') ) {
                    alt5=1;
                }
                else {
                    alt5=2;
                }
            }
            else if ( (LA5_0=='\n') ) {
                alt5=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // ShellCommand.g:1585:5: '\\r\\n'
                    {
                    match("\r\n"); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // ShellCommand.g:1585:14: '\\r'
                    {
                    match('\r'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // ShellCommand.g:1585:21: '\\n'
                    {
                    match('\n'); if (state.failed) return ;

                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "ARROW"
    public final void mARROW() throws RecognitionException {
        try {
            int _type = ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1587:10: ( '->' )
            // ShellCommand.g:1587:12: '->'
            {
            match("->"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARROW"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1588:11: ( '@' )
            // ShellCommand.g:1588:13: '@'
            {
            match('@'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "BAR"
    public final void mBAR() throws RecognitionException {
        try {
            int _type = BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1589:8: ( '|' )
            // ShellCommand.g:1589:10: '|'
            {
            match('|'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BAR"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1590:10: ( ':' )
            // ShellCommand.g:1590:12: ':'
            {
            match(':'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COLON_COLON"
    public final void mCOLON_COLON() throws RecognitionException {
        try {
            int _type = COLON_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1591:14: ( '::' )
            // ShellCommand.g:1591:16: '::'
            {
            match("::"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON_COLON"

    // $ANTLR start "COLON_EQUAL"
    public final void mCOLON_EQUAL() throws RecognitionException {
        try {
            int _type = COLON_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1592:14: ( ':=' )
            // ShellCommand.g:1592:16: ':='
            {
            match(":="); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON_EQUAL"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1593:10: ( ',' )
            // ShellCommand.g:1593:12: ','
            {
            match(','); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1594:8: ( '.' )
            // ShellCommand.g:1594:10: '.'
            {
            match('.'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "DOTDOT"
    public final void mDOTDOT() throws RecognitionException {
        try {
            int _type = DOTDOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1595:11: ( '..' )
            // ShellCommand.g:1595:13: '..'
            {
            match(".."); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOTDOT"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1596:10: ( '=' )
            // ShellCommand.g:1596:12: '='
            {
            match('='); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1597:11: ( '>' )
            // ShellCommand.g:1597:13: '>'
            {
            match('>'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "GREATER_EQUAL"
    public final void mGREATER_EQUAL() throws RecognitionException {
        try {
            int _type = GREATER_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1598:15: ( '>=' )
            // ShellCommand.g:1598:17: '>='
            {
            match(">="); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATER_EQUAL"

    // $ANTLR start "HASH"
    public final void mHASH() throws RecognitionException {
        try {
            int _type = HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1599:9: ( '#' )
            // ShellCommand.g:1599:11: '#'
            {
            match('#'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HASH"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1600:11: ( '{' )
            // ShellCommand.g:1600:13: '{'
            {
            match('{'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1601:11: ( '[' )
            // ShellCommand.g:1601:13: '['
            {
            match('['); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1602:9: ( '<' )
            // ShellCommand.g:1602:11: '<'
            {
            match('<'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "LESS_EQUAL"
    public final void mLESS_EQUAL() throws RecognitionException {
        try {
            int _type = LESS_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1603:14: ( '<=' )
            // ShellCommand.g:1603:16: '<='
            {
            match("<="); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS_EQUAL"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1604:11: ( '(' )
            // ShellCommand.g:1604:13: '('
            {
            match('('); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1605:10: ( '-' )
            // ShellCommand.g:1605:12: '-'
            {
            match('-'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1606:13: ( '<>' )
            // ShellCommand.g:1606:15: '<>'
            {
            match("<>"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1607:9: ( '+' )
            // ShellCommand.g:1607:11: '+'
            {
            match('+'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
        try {
            int _type = RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1608:11: ( '}' )
            // ShellCommand.g:1608:13: '}'
            {
            match('}'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1609:11: ( ']' )
            // ShellCommand.g:1609:13: ']'
            {
            match(']'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1610:10: ( ')' )
            // ShellCommand.g:1610:12: ')'
            {
            match(')'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1611:8: ( ';' )
            // ShellCommand.g:1611:10: ';'
            {
            match(';'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1612:10: ( '/' )
            // ShellCommand.g:1612:12: '/'
            {
            match('/'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1613:9: ( '*' )
            // ShellCommand.g:1613:11: '*'
            {
            match('*'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            // ShellCommand.g:1617:4: ( ( '0' .. '9' )+ )
            // ShellCommand.g:1618:5: ( '0' .. '9' )+
            {
            // ShellCommand.g:1618:5: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ShellCommand.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            // ShellCommand.g:1622:5: ( INT ( '.' INT ( ( 'e' | 'E' ) ( '+' | '-' )? INT )? | ( 'e' | 'E' ) ( '+' | '-' )? INT ) )
            // ShellCommand.g:1623:5: INT ( '.' INT ( ( 'e' | 'E' ) ( '+' | '-' )? INT )? | ( 'e' | 'E' ) ( '+' | '-' )? INT )
            {
            mINT(); if (state.failed) return ;


            // ShellCommand.g:1623:9: ( '.' INT ( ( 'e' | 'E' ) ( '+' | '-' )? INT )? | ( 'e' | 'E' ) ( '+' | '-' )? INT )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='.') ) {
                alt10=1;
            }
            else if ( (LA10_0=='E'||LA10_0=='e') ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // ShellCommand.g:1623:10: '.' INT ( ( 'e' | 'E' ) ( '+' | '-' )? INT )?
                    {
                    match('.'); if (state.failed) return ;

                    mINT(); if (state.failed) return ;


                    // ShellCommand.g:1623:18: ( ( 'e' | 'E' ) ( '+' | '-' )? INT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ShellCommand.g:1623:19: ( 'e' | 'E' ) ( '+' | '-' )? INT
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();
                                state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            // ShellCommand.g:1623:31: ( '+' | '-' )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0=='+'||LA7_0=='-') ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // ShellCommand.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();
                                        state.failed=false;
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return ;}
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;
                                    }


                                    }
                                    break;

                            }


                            mINT(); if (state.failed) return ;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ShellCommand.g:1623:52: ( 'e' | 'E' ) ( '+' | '-' )? INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // ShellCommand.g:1623:64: ( '+' | '-' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='+'||LA9_0=='-') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ShellCommand.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                                state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    mINT(); if (state.failed) return ;


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REAL"

    // $ANTLR start "RANGE_OR_INT"
    public final void mRANGE_OR_INT() throws RecognitionException {
        try {
            int _type = RANGE_OR_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1625:13: ( ( INT '..' )=> INT | ( REAL )=> REAL | INT )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                int LA11_1 = input.LA(2);

                if ( ((LA11_1 >= '0' && LA11_1 <= '9')) && (synpred2_ShellCommand())) {
                    alt11=2;
                }
                else if ( (LA11_1=='.') && (synpred2_ShellCommand())) {
                    alt11=2;
                }
                else if ( (LA11_1=='E'||LA11_1=='e') && (synpred2_ShellCommand())) {
                    alt11=2;
                }
                else if ( (synpred1_ShellCommand()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // ShellCommand.g:1626:7: ( INT '..' )=> INT
                    {
                    mINT(); if (state.failed) return ;


                    if ( state.backtracking==0 ) { _type=INT; }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1627:7: ( REAL )=> REAL
                    {
                    mREAL(); if (state.failed) return ;


                    if ( state.backtracking==0 ) { _type=REAL; }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:1628:9: INT
                    {
                    mINT(); if (state.failed) return ;


                    if ( state.backtracking==0 ) { _type=INT; }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RANGE_OR_INT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1632:7: ( '\\'' (~ ( '\\'' | '\\\\' ) | ESC )* '\\'' )
            // ShellCommand.g:1633:5: '\\'' (~ ( '\\'' | '\\\\' ) | ESC )* '\\''
            {
            match('\''); if (state.failed) return ;

            // ShellCommand.g:1633:10: (~ ( '\\'' | '\\\\' ) | ESC )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '\u0000' && LA12_0 <= '&')||(LA12_0 >= '(' && LA12_0 <= '[')||(LA12_0 >= ']' && LA12_0 <= '\uFFFF')) ) {
                    alt12=1;
                }
                else if ( (LA12_0=='\\') ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // ShellCommand.g:1633:12: ~ ( '\\'' | '\\\\' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // ShellCommand.g:1633:27: ESC
            	    {
            	    mESC(); if (state.failed) return ;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            match('\''); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "NON_OCL_STRING"
    public final void mNON_OCL_STRING() throws RecognitionException {
        try {
            int _type = NON_OCL_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1635:15: ( '\"' (~ ( '\"' | '\\\\' ) | ESC )* '\"' )
            // ShellCommand.g:1636:5: '\"' (~ ( '\"' | '\\\\' ) | ESC )* '\"'
            {
            match('\"'); if (state.failed) return ;

            // ShellCommand.g:1636:9: (~ ( '\"' | '\\\\' ) | ESC )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= '\u0000' && LA13_0 <= '!')||(LA13_0 >= '#' && LA13_0 <= '[')||(LA13_0 >= ']' && LA13_0 <= '\uFFFF')) ) {
                    alt13=1;
                }
                else if ( (LA13_0=='\\') ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // ShellCommand.g:1636:11: ~ ( '\"' | '\\\\' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // ShellCommand.g:1636:25: ESC
            	    {
            	    mESC(); if (state.failed) return ;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            match('\"'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NON_OCL_STRING"

    // $ANTLR start "ESC"
    public final void mESC() throws RecognitionException {
        try {
            // ShellCommand.g:1649:5: ( '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT | '0' .. '3' ( '0' .. '7' ( '0' .. '7' )? )? | '4' .. '7' ( '0' .. '7' )? ) )
            // ShellCommand.g:1650:5: '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT | '0' .. '3' ( '0' .. '7' ( '0' .. '7' )? )? | '4' .. '7' ( '0' .. '7' )? )
            {
            match('\\'); if (state.failed) return ;

            // ShellCommand.g:1651:6: ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT | '0' .. '3' ( '0' .. '7' ( '0' .. '7' )? )? | '4' .. '7' ( '0' .. '7' )? )
            int alt17=11;
            switch ( input.LA(1) ) {
            case 'n':
                {
                alt17=1;
                }
                break;
            case 'r':
                {
                alt17=2;
                }
                break;
            case 't':
                {
                alt17=3;
                }
                break;
            case 'b':
                {
                alt17=4;
                }
                break;
            case 'f':
                {
                alt17=5;
                }
                break;
            case '\"':
                {
                alt17=6;
                }
                break;
            case '\'':
                {
                alt17=7;
                }
                break;
            case '\\':
                {
                alt17=8;
                }
                break;
            case 'u':
                {
                alt17=9;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
                {
                alt17=10;
                }
                break;
            case '4':
            case '5':
            case '6':
            case '7':
                {
                alt17=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // ShellCommand.g:1651:8: 'n'
                    {
                    match('n'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1652:8: 'r'
                    {
                    match('r'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // ShellCommand.g:1653:8: 't'
                    {
                    match('t'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // ShellCommand.g:1654:8: 'b'
                    {
                    match('b'); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // ShellCommand.g:1655:8: 'f'
                    {
                    match('f'); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // ShellCommand.g:1656:8: '\"'
                    {
                    match('\"'); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // ShellCommand.g:1657:8: '\\''
                    {
                    match('\''); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // ShellCommand.g:1658:8: '\\\\'
                    {
                    match('\\'); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // ShellCommand.g:1659:8: 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
                    {
                    match('u'); if (state.failed) return ;

                    mHEX_DIGIT(); if (state.failed) return ;


                    mHEX_DIGIT(); if (state.failed) return ;


                    mHEX_DIGIT(); if (state.failed) return ;


                    mHEX_DIGIT(); if (state.failed) return ;


                    }
                    break;
                case 10 :
                    // ShellCommand.g:1660:8: '0' .. '3' ( '0' .. '7' ( '0' .. '7' )? )?
                    {
                    matchRange('0','3'); if (state.failed) return ;

                    // ShellCommand.g:1660:17: ( '0' .. '7' ( '0' .. '7' )? )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0 >= '0' && LA15_0 <= '7')) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ShellCommand.g:1660:18: '0' .. '7' ( '0' .. '7' )?
                            {
                            matchRange('0','7'); if (state.failed) return ;

                            // ShellCommand.g:1660:27: ( '0' .. '7' )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( ((LA14_0 >= '0' && LA14_0 <= '7')) ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // ShellCommand.g:
                                    {
                                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                                        input.consume();
                                        state.failed=false;
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return ;}
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;
                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 11 :
                    // ShellCommand.g:1660:45: '4' .. '7' ( '0' .. '7' )?
                    {
                    matchRange('4','7'); if (state.failed) return ;

                    // ShellCommand.g:1660:54: ( '0' .. '7' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0 >= '0' && LA16_0 <= '7')) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ShellCommand.g:
                            {
                            if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                                input.consume();
                                state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // ShellCommand.g:1666:10: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )
            // ShellCommand.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ShellCommand.g:1673:6: ( ( '$' | 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ShellCommand.g:1674:5: ( '$' | 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // ShellCommand.g:1674:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0 >= '0' && LA18_0 <= '9')||(LA18_0 >= 'A' && LA18_0 <= 'Z')||LA18_0=='_'||(LA18_0 >= 'a' && LA18_0 <= 'z')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ShellCommand.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "VOCAB"
    public final void mVOCAB() throws RecognitionException {
        try {
            // ShellCommand.g:1681:6: ( '\\U0003' .. '\\U0377' )
            // ShellCommand.g:
            {
            if ( (input.LA(1) >= '\u0003' && input.LA(1) <= '\u0377') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOCAB"

    public void mTokens() throws RecognitionException {
        // ShellCommand.g:1:8: ( T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | WS | SL_COMMENT | ML_COMMENT | ARROW | AT | BAR | COLON | COLON_COLON | COLON_EQUAL | COMMA | DOT | DOTDOT | EQUAL | GREATER | GREATER_EQUAL | HASH | LBRACE | LBRACK | LESS | LESS_EQUAL | LPAREN | MINUS | NOT_EQUAL | PLUS | RBRACE | RBRACK | RPAREN | SEMI | SLASH | STAR | RANGE_OR_INT | STRING | NON_OCL_STRING | IDENT )
        int alt19=87;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // ShellCommand.g:1:10: T__44
                {
                mT__44(); if (state.failed) return ;


                }
                break;
            case 2 :
                // ShellCommand.g:1:16: T__45
                {
                mT__45(); if (state.failed) return ;


                }
                break;
            case 3 :
                // ShellCommand.g:1:22: T__46
                {
                mT__46(); if (state.failed) return ;


                }
                break;
            case 4 :
                // ShellCommand.g:1:28: T__47
                {
                mT__47(); if (state.failed) return ;


                }
                break;
            case 5 :
                // ShellCommand.g:1:34: T__48
                {
                mT__48(); if (state.failed) return ;


                }
                break;
            case 6 :
                // ShellCommand.g:1:40: T__49
                {
                mT__49(); if (state.failed) return ;


                }
                break;
            case 7 :
                // ShellCommand.g:1:46: T__50
                {
                mT__50(); if (state.failed) return ;


                }
                break;
            case 8 :
                // ShellCommand.g:1:52: T__51
                {
                mT__51(); if (state.failed) return ;


                }
                break;
            case 9 :
                // ShellCommand.g:1:58: T__52
                {
                mT__52(); if (state.failed) return ;


                }
                break;
            case 10 :
                // ShellCommand.g:1:64: T__53
                {
                mT__53(); if (state.failed) return ;


                }
                break;
            case 11 :
                // ShellCommand.g:1:70: T__54
                {
                mT__54(); if (state.failed) return ;


                }
                break;
            case 12 :
                // ShellCommand.g:1:76: T__55
                {
                mT__55(); if (state.failed) return ;


                }
                break;
            case 13 :
                // ShellCommand.g:1:82: T__56
                {
                mT__56(); if (state.failed) return ;


                }
                break;
            case 14 :
                // ShellCommand.g:1:88: T__57
                {
                mT__57(); if (state.failed) return ;


                }
                break;
            case 15 :
                // ShellCommand.g:1:94: T__58
                {
                mT__58(); if (state.failed) return ;


                }
                break;
            case 16 :
                // ShellCommand.g:1:100: T__59
                {
                mT__59(); if (state.failed) return ;


                }
                break;
            case 17 :
                // ShellCommand.g:1:106: T__60
                {
                mT__60(); if (state.failed) return ;


                }
                break;
            case 18 :
                // ShellCommand.g:1:112: T__61
                {
                mT__61(); if (state.failed) return ;


                }
                break;
            case 19 :
                // ShellCommand.g:1:118: T__62
                {
                mT__62(); if (state.failed) return ;


                }
                break;
            case 20 :
                // ShellCommand.g:1:124: T__63
                {
                mT__63(); if (state.failed) return ;


                }
                break;
            case 21 :
                // ShellCommand.g:1:130: T__64
                {
                mT__64(); if (state.failed) return ;


                }
                break;
            case 22 :
                // ShellCommand.g:1:136: T__65
                {
                mT__65(); if (state.failed) return ;


                }
                break;
            case 23 :
                // ShellCommand.g:1:142: T__66
                {
                mT__66(); if (state.failed) return ;


                }
                break;
            case 24 :
                // ShellCommand.g:1:148: T__67
                {
                mT__67(); if (state.failed) return ;


                }
                break;
            case 25 :
                // ShellCommand.g:1:154: T__68
                {
                mT__68(); if (state.failed) return ;


                }
                break;
            case 26 :
                // ShellCommand.g:1:160: T__69
                {
                mT__69(); if (state.failed) return ;


                }
                break;
            case 27 :
                // ShellCommand.g:1:166: T__70
                {
                mT__70(); if (state.failed) return ;


                }
                break;
            case 28 :
                // ShellCommand.g:1:172: T__71
                {
                mT__71(); if (state.failed) return ;


                }
                break;
            case 29 :
                // ShellCommand.g:1:178: T__72
                {
                mT__72(); if (state.failed) return ;


                }
                break;
            case 30 :
                // ShellCommand.g:1:184: T__73
                {
                mT__73(); if (state.failed) return ;


                }
                break;
            case 31 :
                // ShellCommand.g:1:190: T__74
                {
                mT__74(); if (state.failed) return ;


                }
                break;
            case 32 :
                // ShellCommand.g:1:196: T__75
                {
                mT__75(); if (state.failed) return ;


                }
                break;
            case 33 :
                // ShellCommand.g:1:202: T__76
                {
                mT__76(); if (state.failed) return ;


                }
                break;
            case 34 :
                // ShellCommand.g:1:208: T__77
                {
                mT__77(); if (state.failed) return ;


                }
                break;
            case 35 :
                // ShellCommand.g:1:214: T__78
                {
                mT__78(); if (state.failed) return ;


                }
                break;
            case 36 :
                // ShellCommand.g:1:220: T__79
                {
                mT__79(); if (state.failed) return ;


                }
                break;
            case 37 :
                // ShellCommand.g:1:226: T__80
                {
                mT__80(); if (state.failed) return ;


                }
                break;
            case 38 :
                // ShellCommand.g:1:232: T__81
                {
                mT__81(); if (state.failed) return ;


                }
                break;
            case 39 :
                // ShellCommand.g:1:238: T__82
                {
                mT__82(); if (state.failed) return ;


                }
                break;
            case 40 :
                // ShellCommand.g:1:244: T__83
                {
                mT__83(); if (state.failed) return ;


                }
                break;
            case 41 :
                // ShellCommand.g:1:250: T__84
                {
                mT__84(); if (state.failed) return ;


                }
                break;
            case 42 :
                // ShellCommand.g:1:256: T__85
                {
                mT__85(); if (state.failed) return ;


                }
                break;
            case 43 :
                // ShellCommand.g:1:262: T__86
                {
                mT__86(); if (state.failed) return ;


                }
                break;
            case 44 :
                // ShellCommand.g:1:268: T__87
                {
                mT__87(); if (state.failed) return ;


                }
                break;
            case 45 :
                // ShellCommand.g:1:274: T__88
                {
                mT__88(); if (state.failed) return ;


                }
                break;
            case 46 :
                // ShellCommand.g:1:280: T__89
                {
                mT__89(); if (state.failed) return ;


                }
                break;
            case 47 :
                // ShellCommand.g:1:286: T__90
                {
                mT__90(); if (state.failed) return ;


                }
                break;
            case 48 :
                // ShellCommand.g:1:292: T__91
                {
                mT__91(); if (state.failed) return ;


                }
                break;
            case 49 :
                // ShellCommand.g:1:298: T__92
                {
                mT__92(); if (state.failed) return ;


                }
                break;
            case 50 :
                // ShellCommand.g:1:304: T__93
                {
                mT__93(); if (state.failed) return ;


                }
                break;
            case 51 :
                // ShellCommand.g:1:310: T__94
                {
                mT__94(); if (state.failed) return ;


                }
                break;
            case 52 :
                // ShellCommand.g:1:316: T__95
                {
                mT__95(); if (state.failed) return ;


                }
                break;
            case 53 :
                // ShellCommand.g:1:322: T__96
                {
                mT__96(); if (state.failed) return ;


                }
                break;
            case 54 :
                // ShellCommand.g:1:328: WS
                {
                mWS(); if (state.failed) return ;


                }
                break;
            case 55 :
                // ShellCommand.g:1:331: SL_COMMENT
                {
                mSL_COMMENT(); if (state.failed) return ;


                }
                break;
            case 56 :
                // ShellCommand.g:1:342: ML_COMMENT
                {
                mML_COMMENT(); if (state.failed) return ;


                }
                break;
            case 57 :
                // ShellCommand.g:1:353: ARROW
                {
                mARROW(); if (state.failed) return ;


                }
                break;
            case 58 :
                // ShellCommand.g:1:359: AT
                {
                mAT(); if (state.failed) return ;


                }
                break;
            case 59 :
                // ShellCommand.g:1:362: BAR
                {
                mBAR(); if (state.failed) return ;


                }
                break;
            case 60 :
                // ShellCommand.g:1:366: COLON
                {
                mCOLON(); if (state.failed) return ;


                }
                break;
            case 61 :
                // ShellCommand.g:1:372: COLON_COLON
                {
                mCOLON_COLON(); if (state.failed) return ;


                }
                break;
            case 62 :
                // ShellCommand.g:1:384: COLON_EQUAL
                {
                mCOLON_EQUAL(); if (state.failed) return ;


                }
                break;
            case 63 :
                // ShellCommand.g:1:396: COMMA
                {
                mCOMMA(); if (state.failed) return ;


                }
                break;
            case 64 :
                // ShellCommand.g:1:402: DOT
                {
                mDOT(); if (state.failed) return ;


                }
                break;
            case 65 :
                // ShellCommand.g:1:406: DOTDOT
                {
                mDOTDOT(); if (state.failed) return ;


                }
                break;
            case 66 :
                // ShellCommand.g:1:413: EQUAL
                {
                mEQUAL(); if (state.failed) return ;


                }
                break;
            case 67 :
                // ShellCommand.g:1:419: GREATER
                {
                mGREATER(); if (state.failed) return ;


                }
                break;
            case 68 :
                // ShellCommand.g:1:427: GREATER_EQUAL
                {
                mGREATER_EQUAL(); if (state.failed) return ;


                }
                break;
            case 69 :
                // ShellCommand.g:1:441: HASH
                {
                mHASH(); if (state.failed) return ;


                }
                break;
            case 70 :
                // ShellCommand.g:1:446: LBRACE
                {
                mLBRACE(); if (state.failed) return ;


                }
                break;
            case 71 :
                // ShellCommand.g:1:453: LBRACK
                {
                mLBRACK(); if (state.failed) return ;


                }
                break;
            case 72 :
                // ShellCommand.g:1:460: LESS
                {
                mLESS(); if (state.failed) return ;


                }
                break;
            case 73 :
                // ShellCommand.g:1:465: LESS_EQUAL
                {
                mLESS_EQUAL(); if (state.failed) return ;


                }
                break;
            case 74 :
                // ShellCommand.g:1:476: LPAREN
                {
                mLPAREN(); if (state.failed) return ;


                }
                break;
            case 75 :
                // ShellCommand.g:1:483: MINUS
                {
                mMINUS(); if (state.failed) return ;


                }
                break;
            case 76 :
                // ShellCommand.g:1:489: NOT_EQUAL
                {
                mNOT_EQUAL(); if (state.failed) return ;


                }
                break;
            case 77 :
                // ShellCommand.g:1:499: PLUS
                {
                mPLUS(); if (state.failed) return ;


                }
                break;
            case 78 :
                // ShellCommand.g:1:504: RBRACE
                {
                mRBRACE(); if (state.failed) return ;


                }
                break;
            case 79 :
                // ShellCommand.g:1:511: RBRACK
                {
                mRBRACK(); if (state.failed) return ;


                }
                break;
            case 80 :
                // ShellCommand.g:1:518: RPAREN
                {
                mRPAREN(); if (state.failed) return ;


                }
                break;
            case 81 :
                // ShellCommand.g:1:525: SEMI
                {
                mSEMI(); if (state.failed) return ;


                }
                break;
            case 82 :
                // ShellCommand.g:1:530: SLASH
                {
                mSLASH(); if (state.failed) return ;


                }
                break;
            case 83 :
                // ShellCommand.g:1:536: STAR
                {
                mSTAR(); if (state.failed) return ;


                }
                break;
            case 84 :
                // ShellCommand.g:1:541: RANGE_OR_INT
                {
                mRANGE_OR_INT(); if (state.failed) return ;


                }
                break;
            case 85 :
                // ShellCommand.g:1:554: STRING
                {
                mSTRING(); if (state.failed) return ;


                }
                break;
            case 86 :
                // ShellCommand.g:1:561: NON_OCL_STRING
                {
                mNON_OCL_STRING(); if (state.failed) return ;


                }
                break;
            case 87 :
                // ShellCommand.g:1:576: IDENT
                {
                mIDENT(); if (state.failed) return ;


                }
                break;

        }

    }

    // $ANTLR start synpred1_ShellCommand
    public final void synpred1_ShellCommand_fragment() throws RecognitionException {
        // ShellCommand.g:1626:7: ( INT '..' )
        // ShellCommand.g:1626:9: INT '..'
        {
        mINT(); if (state.failed) return ;


        match(".."); if (state.failed) return ;



        }

    }
    // $ANTLR end synpred1_ShellCommand

    // $ANTLR start synpred2_ShellCommand
    public final void synpred2_ShellCommand_fragment() throws RecognitionException {
        // ShellCommand.g:1627:7: ( REAL )
        // ShellCommand.g:1627:9: REAL
        {
        mREAL(); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred2_ShellCommand

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


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\uffff\25\56\1\uffff\1\127\1\131\2\uffff\1\134\1\uffff\1\136\1"+
        "\uffff\1\140\3\uffff\1\143\13\uffff\16\56\1\166\6\56\1\175\1\56"+
        "\1\u0081\7\56\1\u0089\6\56\17\uffff\1\u0091\3\56\1\u0095\3\56\1"+
        "\u0099\10\56\1\u00a2\1\uffff\1\56\1\u00a5\2\56\1\u00a8\1\56\1\uffff"+
        "\3\56\1\uffff\1\56\1\u00ae\1\u00af\1\u00b0\3\56\1\uffff\1\u00b8"+
        "\1\56\1\u00ba\3\56\1\u00be\1\uffff\3\56\1\uffff\3\56\1\uffff\10"+
        "\56\1\uffff\1\u00cd\1\56\1\uffff\2\56\1\uffff\1\u00d1\2\56\1\u00d4"+
        "\1\56\3\uffff\1\u00d6\6\56\1\uffff\1\56\1\uffff\1\u00df\1\u00e0"+
        "\1\56\1\uffff\3\56\1\u00e5\3\56\1\u00e9\6\56\1\uffff\1\u00f0\1\56"+
        "\1\u00f2\1\uffff\2\56\1\uffff\1\56\1\uffff\10\56\2\uffff\1\u00ff"+
        "\3\56\1\uffff\2\56\1\u0105\1\uffff\2\56\1\u0108\1\56\1\u010a\1\56"+
        "\1\uffff\1\56\1\uffff\1\56\1\u010e\10\56\1\u0117\1\56\1\uffff\5"+
        "\56\1\uffff\1\u011e\1\u011f\1\uffff\1\u0120\1\uffff\1\u0121\1\u0122"+
        "\1\u0123\1\uffff\1\u0124\6\56\1\u012b\1\uffff\3\56\1\u012f\2\56"+
        "\7\uffff\1\56\1\u0133\4\56\1\uffff\3\56\1\uffff\1\u013c\1\56\1\u013e"+
        "\1\uffff\6\56\1\u0145\1\u0146\1\uffff\1\56\1\uffff\1\u0148\5\56"+
        "\2\uffff\1\56\1\uffff\1\u014f\1\u0150\3\56\1\u0154\2\uffff\1\u0155"+
        "\1\u0156\1\u0157\4\uffff";
    static final String DFA19_eofS =
        "\u0158\uffff";
    static final String DFA19_minS =
        "\1\11\1\141\1\157\1\162\1\145\1\165\1\156\1\154\1\145\1\162\1\145"+
        "\1\154\1\141\1\146\2\145\1\143\1\162\1\145\2\150\1\157\1\uffff\1"+
        "\52\1\55\2\uffff\1\72\1\uffff\1\56\1\uffff\1\75\3\uffff\1\75\13"+
        "\uffff\1\147\1\154\1\144\1\161\1\160\1\144\1\154\1\144\1\163\1\147"+
        "\1\125\1\145\1\143\1\166\1\60\1\163\1\144\1\145\1\154\1\162\1\157"+
        "\1\60\1\160\1\60\1\145\1\164\1\167\1\164\2\154\1\145\1\60\1\145"+
        "\1\154\1\145\1\165\1\151\1\162\17\uffff\1\60\1\154\1\145\1\165\1"+
        "\60\1\154\1\145\1\111\1\60\2\151\1\167\1\163\1\141\1\154\1\145\1"+
        "\164\1\60\1\uffff\1\145\1\60\1\143\1\163\1\60\1\155\1\uffff\1\154"+
        "\1\145\1\157\1\uffff\1\162\3\60\1\154\1\101\1\156\1\uffff\1\60\1"+
        "\145\1\60\1\156\1\145\1\154\1\60\1\uffff\1\145\1\162\1\145\1\uffff"+
        "\1\145\1\146\1\156\1\uffff\1\147\1\156\2\145\1\164\1\141\1\164\1"+
        "\162\1\uffff\1\60\1\146\1\uffff\1\165\1\145\1\uffff\1\60\1\151\1"+
        "\162\1\60\1\141\3\uffff\1\60\1\163\1\155\2\156\1\164\1\151\1\uffff"+
        "\1\143\1\uffff\2\60\1\145\1\uffff\1\143\1\145\1\156\1\60\1\151\1"+
        "\163\1\156\1\60\1\145\1\111\1\145\1\162\1\145\1\157\1\uffff\1\60"+
        "\1\164\1\60\1\uffff\1\145\1\164\1\uffff\1\164\1\uffff\1\124\1\160"+
        "\1\123\1\113\1\144\1\145\2\164\2\uffff\1\60\1\164\1\144\1\143\1"+
        "\uffff\1\156\1\164\1\60\1\uffff\1\156\1\144\1\60\1\145\1\60\1\171"+
        "\1\uffff\1\145\1\uffff\1\163\1\60\1\145\1\171\2\164\1\151\1\171"+
        "\1\145\1\162\1\60\1\102\1\uffff\1\151\1\123\2\145\1\141\1\uffff"+
        "\2\60\1\uffff\1\60\1\uffff\3\60\1\uffff\1\60\1\160\1\171\1\141\1"+
        "\156\1\160\1\146\1\60\1\uffff\1\171\1\157\1\145\1\60\1\144\1\156"+
        "\7\uffff\1\145\1\60\1\164\1\144\1\145\1\151\1\uffff\1\113\1\156"+
        "\1\164\1\uffff\1\60\1\143\1\60\1\uffff\1\145\2\117\1\156\1\151\1"+
        "\171\2\60\1\uffff\1\145\1\uffff\1\60\2\146\1\145\1\156\1\160\2\uffff"+
        "\1\163\1\uffff\2\60\2\144\1\145\1\60\2\uffff\3\60\4\uffff";
    static final String DFA19_maxS =
        "\1\175\1\141\1\157\1\162\1\145\1\165\1\156\1\163\1\171\1\162\1\157"+
        "\1\170\1\162\1\164\1\145\1\165\2\162\1\145\1\162\1\150\1\157\1\uffff"+
        "\1\57\1\76\2\uffff\1\75\1\uffff\1\56\1\uffff\1\75\3\uffff\1\76\13"+
        "\uffff\1\147\1\154\1\144\1\164\1\160\1\144\1\154\1\144\1\163\1\164"+
        "\1\125\1\145\1\163\1\166\1\172\1\163\1\144\1\145\1\154\1\162\1\157"+
        "\1\172\1\160\1\172\1\145\1\164\1\167\1\164\2\154\1\145\1\172\1\145"+
        "\1\164\1\145\1\165\1\151\1\162\17\uffff\1\172\1\154\1\145\1\165"+
        "\1\172\1\154\1\145\1\111\1\172\2\151\1\167\1\163\1\141\1\154\1\145"+
        "\1\164\1\172\1\uffff\1\145\1\172\1\143\1\163\1\172\1\155\1\uffff"+
        "\1\154\1\145\1\157\1\uffff\1\162\3\172\1\154\1\125\1\170\1\uffff"+
        "\1\172\1\145\1\172\1\156\1\145\1\154\1\172\1\uffff\1\145\1\162\1"+
        "\145\1\uffff\1\145\1\146\1\156\1\uffff\1\147\1\156\2\145\1\164\1"+
        "\141\1\164\1\162\1\uffff\1\172\1\146\1\uffff\1\165\1\145\1\uffff"+
        "\1\172\1\151\1\162\1\172\1\141\3\uffff\1\172\1\163\1\155\1\163\1"+
        "\156\1\164\1\151\1\uffff\1\143\1\uffff\2\172\1\145\1\uffff\1\143"+
        "\1\145\1\156\1\172\1\151\1\163\1\156\1\172\1\145\1\111\1\145\1\162"+
        "\1\145\1\157\1\uffff\1\172\1\164\1\172\1\uffff\1\145\1\164\1\uffff"+
        "\1\164\1\uffff\1\124\1\160\1\123\1\124\1\144\1\145\2\164\2\uffff"+
        "\1\172\1\164\1\144\1\143\1\uffff\1\156\1\164\1\172\1\uffff\1\156"+
        "\1\144\1\172\1\145\1\172\1\171\1\uffff\1\145\1\uffff\1\163\1\172"+
        "\1\145\1\171\2\164\1\151\1\171\1\145\1\162\1\172\1\102\1\uffff\1"+
        "\151\1\123\2\145\1\141\1\uffff\2\172\1\uffff\1\172\1\uffff\3\172"+
        "\1\uffff\1\172\1\160\1\171\1\141\1\156\1\160\1\146\1\172\1\uffff"+
        "\1\171\1\157\1\145\1\172\1\144\1\156\7\uffff\1\145\1\172\1\164\1"+
        "\144\1\145\1\151\1\uffff\1\124\1\156\1\164\1\uffff\1\172\1\143\1"+
        "\172\1\uffff\1\145\2\117\1\156\1\151\1\171\2\172\1\uffff\1\145\1"+
        "\uffff\1\172\2\146\1\145\1\156\1\160\2\uffff\1\163\1\uffff\2\172"+
        "\2\144\1\145\1\172\2\uffff\3\172\4\uffff";
    static final String DFA19_acceptS =
        "\26\uffff\1\66\2\uffff\1\72\1\73\1\uffff\1\77\1\uffff\1\102\1\uffff"+
        "\1\105\1\106\1\107\1\uffff\1\112\1\115\1\116\1\117\1\120\1\121\1"+
        "\123\1\124\1\125\1\126\1\127\46\uffff\1\67\1\70\1\122\1\71\1\113"+
        "\1\75\1\76\1\74\1\101\1\100\1\104\1\103\1\111\1\114\1\110\22\uffff"+
        "\1\23\6\uffff\1\33\3\uffff\1\35\7\uffff\1\55\7\uffff\1\1\3\uffff"+
        "\1\5\3\uffff\1\11\10\uffff\1\22\2\uffff\1\25\2\uffff\1\31\5\uffff"+
        "\1\41\1\42\1\43\7\uffff\1\56\1\uffff\1\61\3\uffff\1\65\16\uffff"+
        "\1\24\3\uffff\1\32\2\uffff\1\37\1\uffff\1\44\10\uffff\1\62\1\63"+
        "\4\uffff\1\6\3\uffff\1\13\6\uffff\1\26\1\uffff\1\30\14\uffff\1\64"+
        "\5\uffff\1\12\2\uffff\1\16\1\uffff\1\20\3\uffff\1\36\10\uffff\1"+
        "\54\6\uffff\1\14\1\15\1\17\1\21\1\27\1\34\1\40\6\uffff\1\53\3\uffff"+
        "\1\4\3\uffff\1\46\10\uffff\1\7\1\uffff\1\45\6\uffff\1\2\1\3\1\uffff"+
        "\1\47\6\uffff\1\50\1\51\3\uffff\1\10\1\52\1\57\1\60";
    static final String DFA19_specialS =
        "\u0158\uffff}>";
    static final String[] DFA19_transitionS = {
            "\2\26\1\uffff\2\26\22\uffff\1\26\1\uffff\1\55\1\40\1\56\2\uffff"+
            "\1\54\1\44\1\50\1\52\1\45\1\34\1\30\1\35\1\27\12\53\1\33\1\51"+
            "\1\43\1\36\1\37\1\uffff\1\31\1\56\1\1\1\2\13\56\1\3\3\56\1\4"+
            "\1\5\1\6\5\56\1\42\1\uffff\1\47\1\uffff\1\56\1\uffff\1\7\1\10"+
            "\1\11\1\12\1\13\1\14\2\56\1\15\2\56\1\16\1\56\1\17\1\20\1\21"+
            "\2\56\1\22\1\23\2\56\1\24\1\25\2\56\1\41\1\32\1\46",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65\1\uffff\1\66\4\uffff\1\67",
            "\1\70\23\uffff\1\71",
            "\1\72",
            "\1\73\3\uffff\1\74\5\uffff\1\75",
            "\1\76\1\uffff\1\77\11\uffff\1\100",
            "\1\101\15\uffff\1\102\2\uffff\1\103",
            "\1\104\6\uffff\1\105\1\106\5\uffff\1\107",
            "\1\110",
            "\1\111\11\uffff\1\112\5\uffff\1\113",
            "\1\114\14\uffff\1\115\1\uffff\1\116",
            "\1\117",
            "\1\120",
            "\1\121\11\uffff\1\122",
            "\1\123",
            "\1\124",
            "",
            "\1\126\4\uffff\1\125",
            "\1\125\20\uffff\1\130",
            "",
            "",
            "\1\132\2\uffff\1\133",
            "",
            "\1\135",
            "",
            "\1\137",
            "",
            "",
            "",
            "\1\141\1\142",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147\2\uffff\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156\14\uffff\1\157",
            "\1\160",
            "\1\161",
            "\1\162\10\uffff\1\163\6\uffff\1\164",
            "\1\165",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\176",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\177\1\u0080"+
            "\6\56",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u008a",
            "\1\u008b\7\uffff\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00a3",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00a4\21"+
            "\56",
            "\1\u00a6",
            "\1\u00a7",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00a9",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00b1",
            "\1\u00b2\3\uffff\1\u00b3\3\uffff\1\u00b4\13\uffff\1\u00b5",
            "\1\u00b6\11\uffff\1\u00b7",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00b9",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00ce",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00d2",
            "\1\u00d3",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00d5",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9\4\uffff\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "",
            "\1\u00de",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00e1",
            "",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00f1",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "",
            "\1\u00f5",
            "",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9\10\uffff\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "",
            "\1\u0103",
            "\1\u0104",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0106",
            "\1\u0107",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0109",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u010b",
            "",
            "\1\u010c",
            "",
            "\1\u010d",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0118",
            "",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0130",
            "\1\u0131",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0132",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "",
            "\1\u0138\10\uffff\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u013d",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0147",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "",
            "",
            "\1\u014e",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | WS | SL_COMMENT | ML_COMMENT | ARROW | AT | BAR | COLON | COLON_COLON | COLON_EQUAL | COMMA | DOT | DOTDOT | EQUAL | GREATER | GREATER_EQUAL | HASH | LBRACE | LBRACK | LESS | LESS_EQUAL | LPAREN | MINUS | NOT_EQUAL | PLUS | RBRACE | RBRACK | RPAREN | SEMI | SLASH | STAR | RANGE_OR_INT | STRING | NON_OCL_STRING | IDENT );";
        }
    }
 

}