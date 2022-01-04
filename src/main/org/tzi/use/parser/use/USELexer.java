// $ANTLR 3.4 USE.g 2022-01-04 16:20:11

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

import org.tzi.use.parser.ParseErrorHandler;
// ------------------------------------
//  USE parser
// ------------------------------------


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class USELexer extends Lexer {
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

    public USELexer() {} 
    public USELexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public USELexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "USE.g"; }

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:50:7: ( '&' )
            // USE.g:50:9: '&'
            {
            match('&'); if (state.failed) return ;

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
            // USE.g:51:7: ( 'Bag' )
            // USE.g:51:9: 'Bag'
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:52:7: ( 'Collection' )
            // USE.g:52:9: 'Collection'
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
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:53:7: ( 'Comment' )
            // USE.g:53:9: 'Comment'
            {
            match("Comment"); if (state.failed) return ;



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
            // USE.g:54:7: ( 'Hard' )
            // USE.g:54:9: 'Hard'
            {
            match("Hard"); if (state.failed) return ;



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
            // USE.g:55:7: ( 'OrderedSet' )
            // USE.g:55:9: 'OrderedSet'
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
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:56:7: ( 'Override' )
            // USE.g:56:9: 'Override'
            {
            match("Override"); if (state.failed) return ;



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
            // USE.g:57:7: ( 'Rank' )
            // USE.g:57:9: 'Rank'
            {
            match("Rank"); if (state.failed) return ;



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
            // USE.g:58:7: ( 'Sequence' )
            // USE.g:58:9: 'Sequence'
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:59:7: ( 'Set' )
            // USE.g:59:9: 'Set'
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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:60:7: ( 'Soft' )
            // USE.g:60:9: 'Soft'
            {
            match("Soft"); if (state.failed) return ;



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
            // USE.g:61:7: ( 'Tuple' )
            // USE.g:61:9: 'Tuple'
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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:62:7: ( 'Type' )
            // USE.g:62:9: 'Type'
            {
            match("Type"); if (state.failed) return ;



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
            // USE.g:63:7: ( 'Undefined' )
            // USE.g:63:9: 'Undefined'
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
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:64:7: ( 'abstract' )
            // USE.g:64:9: 'abstract'
            {
            match("abstract"); if (state.failed) return ;



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
            // USE.g:65:7: ( 'all' )
            // USE.g:65:9: 'all'
            {
            match("all"); if (state.failed) return ;



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
            // USE.g:66:7: ( 'allInstances' )
            // USE.g:66:9: 'allInstances'
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
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:67:7: ( 'and' )
            // USE.g:67:9: 'and'
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
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:68:7: ( 'as' )
            // USE.g:68:9: 'as'
            {
            match("as"); if (state.failed) return ;



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
            // USE.g:69:7: ( 'associationClass' )
            // USE.g:69:9: 'associationClass'
            {
            match("associationClass"); if (state.failed) return ;



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
            // USE.g:70:7: ( 'associationclass' )
            // USE.g:70:9: 'associationclass'
            {
            match("associationclass"); if (state.failed) return ;



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
            // USE.g:71:7: ( 'attributes' )
            // USE.g:71:9: 'attributes'
            {
            match("attributes"); if (state.failed) return ;



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
            // USE.g:72:7: ( 'automatic' )
            // USE.g:72:9: 'automatic'
            {
            match("automatic"); if (state.failed) return ;



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
            // USE.g:73:7: ( 'begin' )
            // USE.g:73:9: 'begin'
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:74:7: ( 'between' )
            // USE.g:74:9: 'between'
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:75:7: ( 'but' )
            // USE.g:75:9: 'but'
            {
            match("but"); if (state.failed) return ;



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
            // USE.g:76:7: ( 'byUseId' )
            // USE.g:76:9: 'byUseId'
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:77:7: ( 'constraints' )
            // USE.g:77:9: 'constraints'
            {
            match("constraints"); if (state.failed) return ;



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
            // USE.g:78:7: ( 'context' )
            // USE.g:78:9: 'context'
            {
            match("context"); if (state.failed) return ;



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
            // USE.g:79:7: ( 'create' )
            // USE.g:79:9: 'create'
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
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:80:7: ( 'declare' )
            // USE.g:80:9: 'declare'
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
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:81:7: ( 'delete' )
            // USE.g:81:9: 'delete'
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
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:82:7: ( 'destroy' )
            // USE.g:82:9: 'destroy'
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
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:83:7: ( 'div' )
            // USE.g:83:9: 'div'
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
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:84:7: ( 'do' )
            // USE.g:84:9: 'do'
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
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:85:7: ( 'downward' )
            // USE.g:85:9: 'downward'
            {
            match("downward"); if (state.failed) return ;



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
            // USE.g:86:7: ( 'else' )
            // USE.g:86:9: 'else'
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
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:87:7: ( 'end' )
            // USE.g:87:9: 'end'
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
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:88:7: ( 'endif' )
            // USE.g:88:9: 'endif'
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
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:89:7: ( 'enum' )
            // USE.g:89:9: 'enum'
            {
            match("enum"); if (state.failed) return ;



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
            // USE.g:90:7: ( 'existential' )
            // USE.g:90:9: 'existential'
            {
            match("existential"); if (state.failed) return ;



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
            // USE.g:91:7: ( 'false' )
            // USE.g:91:9: 'false'
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
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:92:7: ( 'for' )
            // USE.g:92:9: 'for'
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
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:93:7: ( 'from' )
            // USE.g:93:9: 'from'
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
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:94:7: ( 'if' )
            // USE.g:94:9: 'if'
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
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:95:7: ( 'implies' )
            // USE.g:95:9: 'implies'
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
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:96:7: ( 'in' )
            // USE.g:96:9: 'in'
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
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:97:7: ( 'inject' )
            // USE.g:97:9: 'inject'
            {
            match("inject"); if (state.failed) return ;



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
            // USE.g:98:7: ( 'insert' )
            // USE.g:98:9: 'insert'
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
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:99:7: ( 'into' )
            // USE.g:99:9: 'into'
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
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:100:7: ( 'inv' )
            // USE.g:100:9: 'inv'
            {
            match("inv"); if (state.failed) return ;



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
            // USE.g:101:7: ( 'iterate' )
            // USE.g:101:9: 'iterate'
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
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:102:7: ( 'let' )
            // USE.g:102:9: 'let'
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
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:103:7: ( 'model' )
            // USE.g:103:9: 'model'
            {
            match("model"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:104:7: ( 'module' )
            // USE.g:104:9: 'module'
            {
            match("module"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:105:7: ( 'new' )
            // USE.g:105:9: 'new'
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
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:106:8: ( 'no' )
            // USE.g:106:10: 'no'
            {
            match("no"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:107:8: ( 'not' )
            // USE.g:107:10: 'not'
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
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:108:8: ( 'null' )
            // USE.g:108:10: 'null'
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
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:109:8: ( 'oclAsType' )
            // USE.g:109:10: 'oclAsType'
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
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:110:8: ( 'oclEmpty' )
            // USE.g:110:10: 'oclEmpty'
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
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:111:8: ( 'oclInState' )
            // USE.g:111:10: 'oclInState'
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
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:112:8: ( 'oclIsKindOf' )
            // USE.g:112:10: 'oclIsKindOf'
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
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:113:8: ( 'oclIsTypeOf' )
            // USE.g:113:10: 'oclIsTypeOf'
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
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:114:8: ( 'oclUndefined' )
            // USE.g:114:10: 'oclUndefined'
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
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:115:8: ( 'only' )
            // USE.g:115:10: 'only'
            {
            match("only"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:116:8: ( 'operations' )
            // USE.g:116:10: 'operations'
            {
            match("operations"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:117:8: ( 'or' )
            // USE.g:117:10: 'or'
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
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:118:8: ( 'ordered' )
            // USE.g:118:10: 'ordered'
            {
            match("ordered"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:119:8: ( 'post' )
            // USE.g:119:10: 'post'
            {
            match("post"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:120:8: ( 'pre' )
            // USE.g:120:10: 'pre'
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
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:121:8: ( 'psm' )
            // USE.g:121:10: 'psm'
            {
            match("psm"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:122:8: ( 'redefines' )
            // USE.g:122:10: 'redefines'
            {
            match("redefines"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:123:8: ( 'select' )
            // USE.g:123:10: 'select'
            {
            match("select"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:124:8: ( 'selectByKind' )
            // USE.g:124:10: 'selectByKind'
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
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:125:8: ( 'selectByType' )
            // USE.g:125:10: 'selectByType'
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
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:126:8: ( 'statemachines' )
            // USE.g:126:10: 'statemachines'
            {
            match("statemachines"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:127:8: ( 'states' )
            // USE.g:127:10: 'states'
            {
            match("states"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:128:8: ( 'subsets' )
            // USE.g:128:10: 'subsets'
            {
            match("subsets"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:129:8: ( 'then' )
            // USE.g:129:10: 'then'
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
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:130:8: ( 'transitions' )
            // USE.g:130:10: 'transitions'
            {
            match("transitions"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:131:8: ( 'true' )
            // USE.g:131:10: 'true'
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
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:132:8: ( 'upward' )
            // USE.g:132:10: 'upward'
            {
            match("upward"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:133:8: ( 'while' )
            // USE.g:133:10: 'while'
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
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:134:8: ( 'with' )
            // USE.g:134:10: 'with'
            {
            match("with"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:135:8: ( 'xor' )
            // USE.g:135:10: 'xor'
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
    // $ANTLR end "T__129"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // USE.g:2000:3: ( ( ' ' | '\\t' | '\\f' | NEWLINE ) )
            // USE.g:2001:5: ( ' ' | '\\t' | '\\f' | NEWLINE )
            {
            // USE.g:2001:5: ( ' ' | '\\t' | '\\f' | NEWLINE )
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
                    // USE.g:2001:7: ' '
                    {
                    match(' '); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // USE.g:2002:7: '\\t'
                    {
                    match('\t'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // USE.g:2003:7: '\\f'
                    {
                    match('\f'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // USE.g:2004:7: NEWLINE
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
            // USE.g:2010:11: ( ( '//' | '--' ) (~ ( NEWLINE ) )* )
            // USE.g:2011:5: ( '//' | '--' ) (~ ( NEWLINE ) )*
            {
            // USE.g:2011:5: ( '//' | '--' )
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
                    // USE.g:2011:6: '//'
                    {
                    match("//"); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // USE.g:2011:13: '--'
                    {
                    match("--"); if (state.failed) return ;



                    }
                    break;

            }


            // USE.g:2012:5: (~ ( NEWLINE ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // USE.g:2012:6: ~ ( NEWLINE )
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
            // USE.g:2017:11: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // USE.g:2018:5: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); if (state.failed) return ;



            // USE.g:2018:10: ( options {greedy=false; } : . )*
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
            	    // USE.g:2018:38: .
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
            // USE.g:2022:9: ( '\\r\\n' | '\\r' | '\\n' )
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
                    // USE.g:2023:5: '\\r\\n'
                    {
                    match("\r\n"); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // USE.g:2023:14: '\\r'
                    {
                    match('\r'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // USE.g:2023:21: '\\n'
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
            // USE.g:2025:10: ( '->' )
            // USE.g:2025:12: '->'
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
            // USE.g:2026:11: ( '@' )
            // USE.g:2026:13: '@'
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
            // USE.g:2027:8: ( '|' )
            // USE.g:2027:10: '|'
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
            // USE.g:2028:10: ( ':' )
            // USE.g:2028:12: ':'
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
            // USE.g:2029:14: ( '::' )
            // USE.g:2029:16: '::'
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
            // USE.g:2030:14: ( ':=' )
            // USE.g:2030:16: ':='
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
            // USE.g:2031:10: ( ',' )
            // USE.g:2031:12: ','
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
            // USE.g:2032:8: ( '.' )
            // USE.g:2032:10: '.'
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
            // USE.g:2033:11: ( '..' )
            // USE.g:2033:13: '..'
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
            // USE.g:2034:10: ( '=' )
            // USE.g:2034:12: '='
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
            // USE.g:2035:11: ( '>' )
            // USE.g:2035:13: '>'
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
            // USE.g:2036:15: ( '>=' )
            // USE.g:2036:17: '>='
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
            // USE.g:2037:9: ( '#' )
            // USE.g:2037:11: '#'
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
            // USE.g:2038:11: ( '{' )
            // USE.g:2038:13: '{'
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
            // USE.g:2039:11: ( '[' )
            // USE.g:2039:13: '['
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
            // USE.g:2040:9: ( '<' )
            // USE.g:2040:11: '<'
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
            // USE.g:2041:14: ( '<=' )
            // USE.g:2041:16: '<='
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
            // USE.g:2042:11: ( '(' )
            // USE.g:2042:13: '('
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
            // USE.g:2043:10: ( '-' )
            // USE.g:2043:12: '-'
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
            // USE.g:2044:13: ( '<>' )
            // USE.g:2044:15: '<>'
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
            // USE.g:2045:9: ( '+' )
            // USE.g:2045:11: '+'
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
            // USE.g:2046:11: ( '}' )
            // USE.g:2046:13: '}'
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
            // USE.g:2047:11: ( ']' )
            // USE.g:2047:13: ']'
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
            // USE.g:2048:10: ( ')' )
            // USE.g:2048:12: ')'
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
            // USE.g:2049:8: ( ';' )
            // USE.g:2049:10: ';'
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
            // USE.g:2050:10: ( '/' )
            // USE.g:2050:12: '/'
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
            // USE.g:2051:9: ( '*' )
            // USE.g:2051:11: '*'
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
            // USE.g:2055:4: ( ( '0' .. '9' )+ )
            // USE.g:2056:5: ( '0' .. '9' )+
            {
            // USE.g:2056:5: ( '0' .. '9' )+
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
            	    // USE.g:
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
            // USE.g:2060:5: ( INT ( '.' INT ( ( 'e' | 'E' ) ( '+' | '-' )? INT )? | ( 'e' | 'E' ) ( '+' | '-' )? INT ) )
            // USE.g:2061:5: INT ( '.' INT ( ( 'e' | 'E' ) ( '+' | '-' )? INT )? | ( 'e' | 'E' ) ( '+' | '-' )? INT )
            {
            mINT(); if (state.failed) return ;


            // USE.g:2061:9: ( '.' INT ( ( 'e' | 'E' ) ( '+' | '-' )? INT )? | ( 'e' | 'E' ) ( '+' | '-' )? INT )
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
                    // USE.g:2061:10: '.' INT ( ( 'e' | 'E' ) ( '+' | '-' )? INT )?
                    {
                    match('.'); if (state.failed) return ;

                    mINT(); if (state.failed) return ;


                    // USE.g:2061:18: ( ( 'e' | 'E' ) ( '+' | '-' )? INT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // USE.g:2061:19: ( 'e' | 'E' ) ( '+' | '-' )? INT
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


                            // USE.g:2061:31: ( '+' | '-' )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0=='+'||LA7_0=='-') ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // USE.g:
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
                    // USE.g:2061:52: ( 'e' | 'E' ) ( '+' | '-' )? INT
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


                    // USE.g:2061:64: ( '+' | '-' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='+'||LA9_0=='-') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // USE.g:
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
            // USE.g:2063:13: ( ( INT '..' )=> INT | ( REAL )=> REAL | INT )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                int LA11_1 = input.LA(2);

                if ( ((LA11_1 >= '0' && LA11_1 <= '9')) && (synpred2_USE())) {
                    alt11=2;
                }
                else if ( (LA11_1=='.') && (synpred2_USE())) {
                    alt11=2;
                }
                else if ( (LA11_1=='E'||LA11_1=='e') && (synpred2_USE())) {
                    alt11=2;
                }
                else if ( (synpred1_USE()) ) {
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
                    // USE.g:2064:7: ( INT '..' )=> INT
                    {
                    mINT(); if (state.failed) return ;


                    if ( state.backtracking==0 ) { _type=INT; }

                    }
                    break;
                case 2 :
                    // USE.g:2065:7: ( REAL )=> REAL
                    {
                    mREAL(); if (state.failed) return ;


                    if ( state.backtracking==0 ) { _type=REAL; }

                    }
                    break;
                case 3 :
                    // USE.g:2066:9: INT
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
            // USE.g:2070:7: ( '\\'' (~ ( '\\'' | '\\\\' ) | ESC )* '\\'' )
            // USE.g:2071:5: '\\'' (~ ( '\\'' | '\\\\' ) | ESC )* '\\''
            {
            match('\''); if (state.failed) return ;

            // USE.g:2071:10: (~ ( '\\'' | '\\\\' ) | ESC )*
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
            	    // USE.g:2071:12: ~ ( '\\'' | '\\\\' )
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
            	    // USE.g:2071:27: ESC
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
            // USE.g:2073:15: ( '\"' (~ ( '\"' | '\\\\' ) | ESC )* '\"' )
            // USE.g:2074:5: '\"' (~ ( '\"' | '\\\\' ) | ESC )* '\"'
            {
            match('\"'); if (state.failed) return ;

            // USE.g:2074:9: (~ ( '\"' | '\\\\' ) | ESC )*
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
            	    // USE.g:2074:11: ~ ( '\"' | '\\\\' )
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
            	    // USE.g:2074:25: ESC
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
            // USE.g:2087:5: ( '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT | '0' .. '3' ( '0' .. '7' ( '0' .. '7' )? )? | '4' .. '7' ( '0' .. '7' )? ) )
            // USE.g:2088:5: '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT | '0' .. '3' ( '0' .. '7' ( '0' .. '7' )? )? | '4' .. '7' ( '0' .. '7' )? )
            {
            match('\\'); if (state.failed) return ;

            // USE.g:2089:6: ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT | '0' .. '3' ( '0' .. '7' ( '0' .. '7' )? )? | '4' .. '7' ( '0' .. '7' )? )
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
                    // USE.g:2089:8: 'n'
                    {
                    match('n'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // USE.g:2090:8: 'r'
                    {
                    match('r'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // USE.g:2091:8: 't'
                    {
                    match('t'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // USE.g:2092:8: 'b'
                    {
                    match('b'); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // USE.g:2093:8: 'f'
                    {
                    match('f'); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // USE.g:2094:8: '\"'
                    {
                    match('\"'); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // USE.g:2095:8: '\\''
                    {
                    match('\''); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // USE.g:2096:8: '\\\\'
                    {
                    match('\\'); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // USE.g:2097:8: 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
                    {
                    match('u'); if (state.failed) return ;

                    mHEX_DIGIT(); if (state.failed) return ;


                    mHEX_DIGIT(); if (state.failed) return ;


                    mHEX_DIGIT(); if (state.failed) return ;


                    mHEX_DIGIT(); if (state.failed) return ;


                    }
                    break;
                case 10 :
                    // USE.g:2098:8: '0' .. '3' ( '0' .. '7' ( '0' .. '7' )? )?
                    {
                    matchRange('0','3'); if (state.failed) return ;

                    // USE.g:2098:17: ( '0' .. '7' ( '0' .. '7' )? )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0 >= '0' && LA15_0 <= '7')) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // USE.g:2098:18: '0' .. '7' ( '0' .. '7' )?
                            {
                            matchRange('0','7'); if (state.failed) return ;

                            // USE.g:2098:27: ( '0' .. '7' )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( ((LA14_0 >= '0' && LA14_0 <= '7')) ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // USE.g:
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
                    // USE.g:2098:45: '4' .. '7' ( '0' .. '7' )?
                    {
                    matchRange('4','7'); if (state.failed) return ;

                    // USE.g:2098:54: ( '0' .. '7' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0 >= '0' && LA16_0 <= '7')) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // USE.g:
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
            // USE.g:2104:10: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )
            // USE.g:
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
            // USE.g:2111:6: ( ( '$' | 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // USE.g:2112:5: ( '$' | 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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


            // USE.g:2112:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0 >= '0' && LA18_0 <= '9')||(LA18_0 >= 'A' && LA18_0 <= 'Z')||LA18_0=='_'||(LA18_0 >= 'a' && LA18_0 <= 'z')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // USE.g:
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
            // USE.g:2119:6: ( '\\U0003' .. '\\U0377' )
            // USE.g:
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
        // USE.g:1:8: ( T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | WS | SL_COMMENT | ML_COMMENT | ARROW | AT | BAR | COLON | COLON_COLON | COLON_EQUAL | COMMA | DOT | DOTDOT | EQUAL | GREATER | GREATER_EQUAL | HASH | LBRACE | LBRACK | LESS | LESS_EQUAL | LPAREN | MINUS | NOT_EQUAL | PLUS | RBRACE | RBRACK | RPAREN | SEMI | SLASH | STAR | RANGE_OR_INT | STRING | NON_OCL_STRING | IDENT )
        int alt19=120;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // USE.g:1:10: T__44
                {
                mT__44(); if (state.failed) return ;


                }
                break;
            case 2 :
                // USE.g:1:16: T__45
                {
                mT__45(); if (state.failed) return ;


                }
                break;
            case 3 :
                // USE.g:1:22: T__46
                {
                mT__46(); if (state.failed) return ;


                }
                break;
            case 4 :
                // USE.g:1:28: T__47
                {
                mT__47(); if (state.failed) return ;


                }
                break;
            case 5 :
                // USE.g:1:34: T__48
                {
                mT__48(); if (state.failed) return ;


                }
                break;
            case 6 :
                // USE.g:1:40: T__49
                {
                mT__49(); if (state.failed) return ;


                }
                break;
            case 7 :
                // USE.g:1:46: T__50
                {
                mT__50(); if (state.failed) return ;


                }
                break;
            case 8 :
                // USE.g:1:52: T__51
                {
                mT__51(); if (state.failed) return ;


                }
                break;
            case 9 :
                // USE.g:1:58: T__52
                {
                mT__52(); if (state.failed) return ;


                }
                break;
            case 10 :
                // USE.g:1:64: T__53
                {
                mT__53(); if (state.failed) return ;


                }
                break;
            case 11 :
                // USE.g:1:70: T__54
                {
                mT__54(); if (state.failed) return ;


                }
                break;
            case 12 :
                // USE.g:1:76: T__55
                {
                mT__55(); if (state.failed) return ;


                }
                break;
            case 13 :
                // USE.g:1:82: T__56
                {
                mT__56(); if (state.failed) return ;


                }
                break;
            case 14 :
                // USE.g:1:88: T__57
                {
                mT__57(); if (state.failed) return ;


                }
                break;
            case 15 :
                // USE.g:1:94: T__58
                {
                mT__58(); if (state.failed) return ;


                }
                break;
            case 16 :
                // USE.g:1:100: T__59
                {
                mT__59(); if (state.failed) return ;


                }
                break;
            case 17 :
                // USE.g:1:106: T__60
                {
                mT__60(); if (state.failed) return ;


                }
                break;
            case 18 :
                // USE.g:1:112: T__61
                {
                mT__61(); if (state.failed) return ;


                }
                break;
            case 19 :
                // USE.g:1:118: T__62
                {
                mT__62(); if (state.failed) return ;


                }
                break;
            case 20 :
                // USE.g:1:124: T__63
                {
                mT__63(); if (state.failed) return ;


                }
                break;
            case 21 :
                // USE.g:1:130: T__64
                {
                mT__64(); if (state.failed) return ;


                }
                break;
            case 22 :
                // USE.g:1:136: T__65
                {
                mT__65(); if (state.failed) return ;


                }
                break;
            case 23 :
                // USE.g:1:142: T__66
                {
                mT__66(); if (state.failed) return ;


                }
                break;
            case 24 :
                // USE.g:1:148: T__67
                {
                mT__67(); if (state.failed) return ;


                }
                break;
            case 25 :
                // USE.g:1:154: T__68
                {
                mT__68(); if (state.failed) return ;


                }
                break;
            case 26 :
                // USE.g:1:160: T__69
                {
                mT__69(); if (state.failed) return ;


                }
                break;
            case 27 :
                // USE.g:1:166: T__70
                {
                mT__70(); if (state.failed) return ;


                }
                break;
            case 28 :
                // USE.g:1:172: T__71
                {
                mT__71(); if (state.failed) return ;


                }
                break;
            case 29 :
                // USE.g:1:178: T__72
                {
                mT__72(); if (state.failed) return ;


                }
                break;
            case 30 :
                // USE.g:1:184: T__73
                {
                mT__73(); if (state.failed) return ;


                }
                break;
            case 31 :
                // USE.g:1:190: T__74
                {
                mT__74(); if (state.failed) return ;


                }
                break;
            case 32 :
                // USE.g:1:196: T__75
                {
                mT__75(); if (state.failed) return ;


                }
                break;
            case 33 :
                // USE.g:1:202: T__76
                {
                mT__76(); if (state.failed) return ;


                }
                break;
            case 34 :
                // USE.g:1:208: T__77
                {
                mT__77(); if (state.failed) return ;


                }
                break;
            case 35 :
                // USE.g:1:214: T__78
                {
                mT__78(); if (state.failed) return ;


                }
                break;
            case 36 :
                // USE.g:1:220: T__79
                {
                mT__79(); if (state.failed) return ;


                }
                break;
            case 37 :
                // USE.g:1:226: T__80
                {
                mT__80(); if (state.failed) return ;


                }
                break;
            case 38 :
                // USE.g:1:232: T__81
                {
                mT__81(); if (state.failed) return ;


                }
                break;
            case 39 :
                // USE.g:1:238: T__82
                {
                mT__82(); if (state.failed) return ;


                }
                break;
            case 40 :
                // USE.g:1:244: T__83
                {
                mT__83(); if (state.failed) return ;


                }
                break;
            case 41 :
                // USE.g:1:250: T__84
                {
                mT__84(); if (state.failed) return ;


                }
                break;
            case 42 :
                // USE.g:1:256: T__85
                {
                mT__85(); if (state.failed) return ;


                }
                break;
            case 43 :
                // USE.g:1:262: T__86
                {
                mT__86(); if (state.failed) return ;


                }
                break;
            case 44 :
                // USE.g:1:268: T__87
                {
                mT__87(); if (state.failed) return ;


                }
                break;
            case 45 :
                // USE.g:1:274: T__88
                {
                mT__88(); if (state.failed) return ;


                }
                break;
            case 46 :
                // USE.g:1:280: T__89
                {
                mT__89(); if (state.failed) return ;


                }
                break;
            case 47 :
                // USE.g:1:286: T__90
                {
                mT__90(); if (state.failed) return ;


                }
                break;
            case 48 :
                // USE.g:1:292: T__91
                {
                mT__91(); if (state.failed) return ;


                }
                break;
            case 49 :
                // USE.g:1:298: T__92
                {
                mT__92(); if (state.failed) return ;


                }
                break;
            case 50 :
                // USE.g:1:304: T__93
                {
                mT__93(); if (state.failed) return ;


                }
                break;
            case 51 :
                // USE.g:1:310: T__94
                {
                mT__94(); if (state.failed) return ;


                }
                break;
            case 52 :
                // USE.g:1:316: T__95
                {
                mT__95(); if (state.failed) return ;


                }
                break;
            case 53 :
                // USE.g:1:322: T__96
                {
                mT__96(); if (state.failed) return ;


                }
                break;
            case 54 :
                // USE.g:1:328: T__97
                {
                mT__97(); if (state.failed) return ;


                }
                break;
            case 55 :
                // USE.g:1:334: T__98
                {
                mT__98(); if (state.failed) return ;


                }
                break;
            case 56 :
                // USE.g:1:340: T__99
                {
                mT__99(); if (state.failed) return ;


                }
                break;
            case 57 :
                // USE.g:1:346: T__100
                {
                mT__100(); if (state.failed) return ;


                }
                break;
            case 58 :
                // USE.g:1:353: T__101
                {
                mT__101(); if (state.failed) return ;


                }
                break;
            case 59 :
                // USE.g:1:360: T__102
                {
                mT__102(); if (state.failed) return ;


                }
                break;
            case 60 :
                // USE.g:1:367: T__103
                {
                mT__103(); if (state.failed) return ;


                }
                break;
            case 61 :
                // USE.g:1:374: T__104
                {
                mT__104(); if (state.failed) return ;


                }
                break;
            case 62 :
                // USE.g:1:381: T__105
                {
                mT__105(); if (state.failed) return ;


                }
                break;
            case 63 :
                // USE.g:1:388: T__106
                {
                mT__106(); if (state.failed) return ;


                }
                break;
            case 64 :
                // USE.g:1:395: T__107
                {
                mT__107(); if (state.failed) return ;


                }
                break;
            case 65 :
                // USE.g:1:402: T__108
                {
                mT__108(); if (state.failed) return ;


                }
                break;
            case 66 :
                // USE.g:1:409: T__109
                {
                mT__109(); if (state.failed) return ;


                }
                break;
            case 67 :
                // USE.g:1:416: T__110
                {
                mT__110(); if (state.failed) return ;


                }
                break;
            case 68 :
                // USE.g:1:423: T__111
                {
                mT__111(); if (state.failed) return ;


                }
                break;
            case 69 :
                // USE.g:1:430: T__112
                {
                mT__112(); if (state.failed) return ;


                }
                break;
            case 70 :
                // USE.g:1:437: T__113
                {
                mT__113(); if (state.failed) return ;


                }
                break;
            case 71 :
                // USE.g:1:444: T__114
                {
                mT__114(); if (state.failed) return ;


                }
                break;
            case 72 :
                // USE.g:1:451: T__115
                {
                mT__115(); if (state.failed) return ;


                }
                break;
            case 73 :
                // USE.g:1:458: T__116
                {
                mT__116(); if (state.failed) return ;


                }
                break;
            case 74 :
                // USE.g:1:465: T__117
                {
                mT__117(); if (state.failed) return ;


                }
                break;
            case 75 :
                // USE.g:1:472: T__118
                {
                mT__118(); if (state.failed) return ;


                }
                break;
            case 76 :
                // USE.g:1:479: T__119
                {
                mT__119(); if (state.failed) return ;


                }
                break;
            case 77 :
                // USE.g:1:486: T__120
                {
                mT__120(); if (state.failed) return ;


                }
                break;
            case 78 :
                // USE.g:1:493: T__121
                {
                mT__121(); if (state.failed) return ;


                }
                break;
            case 79 :
                // USE.g:1:500: T__122
                {
                mT__122(); if (state.failed) return ;


                }
                break;
            case 80 :
                // USE.g:1:507: T__123
                {
                mT__123(); if (state.failed) return ;


                }
                break;
            case 81 :
                // USE.g:1:514: T__124
                {
                mT__124(); if (state.failed) return ;


                }
                break;
            case 82 :
                // USE.g:1:521: T__125
                {
                mT__125(); if (state.failed) return ;


                }
                break;
            case 83 :
                // USE.g:1:528: T__126
                {
                mT__126(); if (state.failed) return ;


                }
                break;
            case 84 :
                // USE.g:1:535: T__127
                {
                mT__127(); if (state.failed) return ;


                }
                break;
            case 85 :
                // USE.g:1:542: T__128
                {
                mT__128(); if (state.failed) return ;


                }
                break;
            case 86 :
                // USE.g:1:549: T__129
                {
                mT__129(); if (state.failed) return ;


                }
                break;
            case 87 :
                // USE.g:1:556: WS
                {
                mWS(); if (state.failed) return ;


                }
                break;
            case 88 :
                // USE.g:1:559: SL_COMMENT
                {
                mSL_COMMENT(); if (state.failed) return ;


                }
                break;
            case 89 :
                // USE.g:1:570: ML_COMMENT
                {
                mML_COMMENT(); if (state.failed) return ;


                }
                break;
            case 90 :
                // USE.g:1:581: ARROW
                {
                mARROW(); if (state.failed) return ;


                }
                break;
            case 91 :
                // USE.g:1:587: AT
                {
                mAT(); if (state.failed) return ;


                }
                break;
            case 92 :
                // USE.g:1:590: BAR
                {
                mBAR(); if (state.failed) return ;


                }
                break;
            case 93 :
                // USE.g:1:594: COLON
                {
                mCOLON(); if (state.failed) return ;


                }
                break;
            case 94 :
                // USE.g:1:600: COLON_COLON
                {
                mCOLON_COLON(); if (state.failed) return ;


                }
                break;
            case 95 :
                // USE.g:1:612: COLON_EQUAL
                {
                mCOLON_EQUAL(); if (state.failed) return ;


                }
                break;
            case 96 :
                // USE.g:1:624: COMMA
                {
                mCOMMA(); if (state.failed) return ;


                }
                break;
            case 97 :
                // USE.g:1:630: DOT
                {
                mDOT(); if (state.failed) return ;


                }
                break;
            case 98 :
                // USE.g:1:634: DOTDOT
                {
                mDOTDOT(); if (state.failed) return ;


                }
                break;
            case 99 :
                // USE.g:1:641: EQUAL
                {
                mEQUAL(); if (state.failed) return ;


                }
                break;
            case 100 :
                // USE.g:1:647: GREATER
                {
                mGREATER(); if (state.failed) return ;


                }
                break;
            case 101 :
                // USE.g:1:655: GREATER_EQUAL
                {
                mGREATER_EQUAL(); if (state.failed) return ;


                }
                break;
            case 102 :
                // USE.g:1:669: HASH
                {
                mHASH(); if (state.failed) return ;


                }
                break;
            case 103 :
                // USE.g:1:674: LBRACE
                {
                mLBRACE(); if (state.failed) return ;


                }
                break;
            case 104 :
                // USE.g:1:681: LBRACK
                {
                mLBRACK(); if (state.failed) return ;


                }
                break;
            case 105 :
                // USE.g:1:688: LESS
                {
                mLESS(); if (state.failed) return ;


                }
                break;
            case 106 :
                // USE.g:1:693: LESS_EQUAL
                {
                mLESS_EQUAL(); if (state.failed) return ;


                }
                break;
            case 107 :
                // USE.g:1:704: LPAREN
                {
                mLPAREN(); if (state.failed) return ;


                }
                break;
            case 108 :
                // USE.g:1:711: MINUS
                {
                mMINUS(); if (state.failed) return ;


                }
                break;
            case 109 :
                // USE.g:1:717: NOT_EQUAL
                {
                mNOT_EQUAL(); if (state.failed) return ;


                }
                break;
            case 110 :
                // USE.g:1:727: PLUS
                {
                mPLUS(); if (state.failed) return ;


                }
                break;
            case 111 :
                // USE.g:1:732: RBRACE
                {
                mRBRACE(); if (state.failed) return ;


                }
                break;
            case 112 :
                // USE.g:1:739: RBRACK
                {
                mRBRACK(); if (state.failed) return ;


                }
                break;
            case 113 :
                // USE.g:1:746: RPAREN
                {
                mRPAREN(); if (state.failed) return ;


                }
                break;
            case 114 :
                // USE.g:1:753: SEMI
                {
                mSEMI(); if (state.failed) return ;


                }
                break;
            case 115 :
                // USE.g:1:758: SLASH
                {
                mSLASH(); if (state.failed) return ;


                }
                break;
            case 116 :
                // USE.g:1:764: STAR
                {
                mSTAR(); if (state.failed) return ;


                }
                break;
            case 117 :
                // USE.g:1:769: RANGE_OR_INT
                {
                mRANGE_OR_INT(); if (state.failed) return ;


                }
                break;
            case 118 :
                // USE.g:1:782: STRING
                {
                mSTRING(); if (state.failed) return ;


                }
                break;
            case 119 :
                // USE.g:1:789: NON_OCL_STRING
                {
                mNON_OCL_STRING(); if (state.failed) return ;


                }
                break;
            case 120 :
                // USE.g:1:804: IDENT
                {
                mIDENT(); if (state.failed) return ;


                }
                break;

        }

    }

    // $ANTLR start synpred1_USE
    public final void synpred1_USE_fragment() throws RecognitionException {
        // USE.g:2064:7: ( INT '..' )
        // USE.g:2064:9: INT '..'
        {
        mINT(); if (state.failed) return ;


        match(".."); if (state.failed) return ;



        }

    }
    // $ANTLR end synpred1_USE

    // $ANTLR start synpred2_USE
    public final void synpred2_USE_fragment() throws RecognitionException {
        // USE.g:2065:7: ( REAL )
        // USE.g:2065:9: REAL
        {
        mREAL(); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred2_USE

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


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\2\uffff\32\64\1\uffff\1\160\1\162\2\uffff\1\165\1\uffff\1\167\1"+
        "\uffff\1\171\3\uffff\1\174\13\uffff\16\64\1\u008e\11\64\1\u009c"+
        "\6\64\1\u00a4\1\64\1\u00aa\4\64\1\u00b0\4\64\1\u00b6\15\64\17\uffff"+
        "\1\u00c5\7\64\1\u00cd\5\64\1\u00d4\1\u00d5\1\64\1\uffff\4\64\1\u00db"+
        "\6\64\1\u00e3\1\64\1\uffff\1\64\1\u00e7\3\64\1\u00eb\1\64\1\uffff"+
        "\4\64\1\u00f1\1\uffff\1\64\1\u00f3\1\64\1\u00f6\1\u00f7\1\uffff"+
        "\5\64\1\uffff\1\64\1\u0101\1\u0102\12\64\1\u010d\1\uffff\2\64\1"+
        "\u0110\2\64\1\u0113\1\64\1\uffff\1\u0115\1\64\1\u0117\3\64\2\uffff"+
        "\5\64\1\uffff\7\64\1\uffff\1\64\1\u0128\1\64\1\uffff\1\u012a\2\64"+
        "\1\uffff\1\u012d\3\64\1\u0131\1\uffff\1\64\1\uffff\2\64\2\uffff"+
        "\1\u0135\4\64\1\u013b\2\64\1\u013e\2\uffff\4\64\1\u0143\1\64\1\u0145"+
        "\2\64\1\u0148\1\uffff\2\64\1\uffff\2\64\1\uffff\1\64\1\uffff\1\u014e"+
        "\1\uffff\6\64\1\u0155\11\64\1\uffff\1\u015f\1\uffff\1\64\1\u0161"+
        "\1\uffff\3\64\1\uffff\1\64\1\u0166\1\64\1\uffff\5\64\1\uffff\2\64"+
        "\1\uffff\4\64\1\uffff\1\64\1\uffff\1\64\1\u0177\1\uffff\5\64\1\uffff"+
        "\6\64\1\uffff\4\64\1\u0187\1\64\1\u0189\2\64\1\uffff\1\64\1\uffff"+
        "\1\64\1\u018e\1\u018f\1\64\1\uffff\1\u0191\11\64\1\u019c\1\64\1"+
        "\u019e\2\64\1\u01a1\1\uffff\1\64\1\u01a3\11\64\1\u01ad\1\u01ae\1"+
        "\64\1\u01b0\1\uffff\1\u01b1\1\uffff\1\u01b2\2\64\1\u01b5\2\uffff"+
        "\1\u01b6\1\uffff\7\64\1\u01be\2\64\1\uffff\1\64\1\uffff\1\u01c2"+
        "\1\64\1\uffff\1\64\1\uffff\1\64\1\u01c6\1\u01c7\1\64\1\u01c9\4\64"+
        "\2\uffff\1\64\3\uffff\1\u01cf\1\64\2\uffff\1\64\1\u01d2\5\64\1\uffff"+
        "\3\64\1\uffff\3\64\2\uffff\1\u01df\1\uffff\3\64\1\u01e3\1\64\1\uffff"+
        "\1\64\1\u01e6\1\uffff\5\64\1\u01ec\4\64\1\u01f1\1\u01f2\1\uffff"+
        "\2\64\1\u01f5\1\uffff\2\64\1\uffff\1\u01f8\3\64\1\u01fc\1\uffff"+
        "\4\64\2\uffff\2\64\1\uffff\1\u0204\1\u0205\1\uffff\1\u0206\1\u0207"+
        "\1\64\1\uffff\3\64\1\u020c\1\u020d\2\64\4\uffff\1\u0210\1\u0211"+
        "\1\u0212\1\64\2\uffff\2\64\3\uffff\1\u0216\2\64\1\uffff\2\64\1\u021b"+
        "\1\u021c\2\uffff";
    static final String DFA19_eofS =
        "\u021d\uffff";
    static final String DFA19_minS =
        "\1\11\1\uffff\1\141\1\157\1\141\1\162\1\141\1\145\1\165\1\156\1"+
        "\142\1\145\1\157\1\145\1\154\1\141\1\146\1\145\1\157\1\145\1\143"+
        "\1\157\2\145\1\150\1\160\1\150\1\157\1\uffff\1\52\1\55\2\uffff\1"+
        "\72\1\uffff\1\56\1\uffff\1\75\3\uffff\1\75\13\uffff\1\147\1\154"+
        "\1\162\1\144\1\145\1\156\1\161\1\146\2\160\1\144\1\163\1\154\1\144"+
        "\1\60\2\164\1\147\1\164\1\125\1\156\1\145\1\143\1\166\1\60\1\163"+
        "\1\144\1\151\1\154\1\162\1\157\1\60\1\160\1\60\1\145\1\164\1\144"+
        "\1\167\1\60\3\154\1\145\1\60\1\163\1\145\1\155\1\144\1\154\1\141"+
        "\1\142\1\145\1\141\1\167\1\151\1\164\1\162\17\uffff\1\60\1\154\1"+
        "\155\1\144\1\145\1\162\1\153\1\165\1\60\1\164\1\154\2\145\1\164"+
        "\2\60\1\157\1\uffff\1\162\1\157\1\151\1\167\1\60\2\163\1\141\1\154"+
        "\1\145\1\164\1\60\1\156\1\uffff\1\145\1\60\1\155\2\163\1\60\1\155"+
        "\1\uffff\1\154\2\145\1\157\1\60\1\uffff\1\162\1\60\1\145\2\60\1"+
        "\uffff\1\154\1\101\1\171\1\162\1\145\1\uffff\1\164\2\60\2\145\1"+
        "\164\1\163\2\156\1\145\1\141\1\154\1\150\1\60\1\uffff\2\145\1\60"+
        "\2\162\1\60\1\145\1\uffff\1\60\1\145\1\60\1\146\1\162\1\156\2\uffff"+
        "\1\143\1\151\1\155\1\156\1\145\1\uffff\1\145\1\164\1\145\1\164\1"+
        "\141\1\164\1\162\1\uffff\1\167\1\60\1\146\1\uffff\1\60\1\164\1\145"+
        "\1\uffff\1\60\1\151\1\143\1\162\1\60\1\uffff\1\141\1\uffff\2\154"+
        "\2\uffff\1\60\1\163\1\155\2\156\1\60\1\141\1\162\1\60\2\uffff\1"+
        "\146\1\143\2\145\1\60\1\163\1\60\1\162\1\145\1\60\1\uffff\1\143"+
        "\1\156\1\uffff\1\145\1\151\1\uffff\1\156\1\uffff\1\60\1\uffff\1"+
        "\151\1\141\1\163\1\151\1\142\1\141\1\60\1\145\1\111\1\162\1\170"+
        "\1\145\1\162\1\145\1\157\1\141\1\uffff\1\60\1\uffff\1\145\1\60\1"+
        "\uffff\1\145\2\164\1\uffff\1\164\1\60\1\145\1\uffff\1\124\1\160"+
        "\1\123\1\113\1\144\1\uffff\1\164\1\145\1\uffff\1\151\1\164\1\155"+
        "\1\164\1\uffff\1\151\1\uffff\1\144\1\60\1\uffff\2\164\2\144\1\143"+
        "\1\uffff\1\156\1\143\1\164\1\141\1\165\1\164\1\uffff\1\156\1\144"+
        "\1\141\1\164\1\60\1\145\1\60\1\171\1\162\1\uffff\1\156\1\uffff\1"+
        "\163\2\60\1\145\1\uffff\1\60\1\171\2\164\1\151\1\171\1\145\1\151"+
        "\1\144\1\156\1\60\1\141\1\60\1\163\1\164\1\60\1\uffff\1\151\1\60"+
        "\1\123\3\145\1\164\1\141\2\164\1\151\2\60\1\151\1\60\1\uffff\1\60"+
        "\1\uffff\1\60\1\144\1\164\1\60\2\uffff\1\60\1\uffff\1\160\1\171"+
        "\1\141\1\156\1\160\1\146\1\157\1\60\1\145\1\171\1\uffff\1\143\1"+
        "\uffff\1\60\1\151\1\uffff\1\157\1\uffff\1\145\2\60\1\144\1\60\1"+
        "\156\1\151\1\145\1\143\2\uffff\1\156\3\uffff\1\60\1\151\2\uffff"+
        "\1\145\1\60\1\164\1\144\1\145\1\151\1\156\1\uffff\1\163\1\113\1"+
        "\150\1\uffff\1\157\1\156\1\164\2\uffff\1\60\1\uffff\1\143\1\157"+
        "\1\163\1\60\1\164\1\uffff\1\141\1\60\1\uffff\1\145\2\117\1\156\1"+
        "\163\1\60\1\151\1\171\1\151\1\156\2\60\1\uffff\1\145\1\156\1\60"+
        "\1\uffff\1\163\1\154\1\uffff\1\60\2\146\1\145\1\60\1\uffff\1\156"+
        "\1\160\1\156\1\163\2\uffff\1\163\1\103\1\uffff\2\60\1\uffff\2\60"+
        "\1\144\1\uffff\1\144\2\145\2\60\2\154\4\uffff\3\60\1\163\2\uffff"+
        "\2\141\3\uffff\1\60\2\163\1\uffff\2\163\2\60\2\uffff";
    static final String DFA19_maxS =
        "\1\175\1\uffff\1\141\1\157\1\141\1\166\1\141\1\157\1\171\1\156\1"+
        "\165\1\171\1\162\1\157\1\170\1\162\1\164\1\145\1\157\1\165\1\162"+
        "\1\163\1\145\1\165\1\162\1\160\1\151\1\157\1\uffff\1\57\1\76\2\uffff"+
        "\1\75\1\uffff\1\56\1\uffff\1\75\3\uffff\1\76\13\uffff\1\147\1\155"+
        "\1\162\1\144\1\145\1\156\1\164\1\146\2\160\1\144\1\163\1\154\1\144"+
        "\1\172\4\164\1\125\1\156\1\145\1\163\1\166\1\172\1\163\1\165\1\151"+
        "\1\154\1\162\1\157\1\172\1\160\1\172\1\145\1\164\1\144\1\167\1\172"+
        "\3\154\1\145\1\172\1\163\1\145\1\155\1\144\1\154\1\141\1\142\1\145"+
        "\1\165\1\167\1\151\1\164\1\162\17\uffff\1\172\1\154\1\155\1\144"+
        "\1\145\1\162\1\153\1\165\1\172\1\164\1\154\2\145\1\164\2\172\1\157"+
        "\1\uffff\1\162\1\157\1\151\1\167\1\172\1\163\1\164\1\141\1\154\1"+
        "\145\1\164\1\172\1\156\1\uffff\1\145\1\172\1\155\2\163\1\172\1\155"+
        "\1\uffff\1\154\2\145\1\157\1\172\1\uffff\1\162\1\172\1\165\2\172"+
        "\1\uffff\1\154\1\125\1\171\1\162\1\145\1\uffff\1\164\2\172\2\145"+
        "\1\164\1\163\2\156\1\145\1\141\1\154\1\150\1\172\1\uffff\2\145\1"+
        "\172\2\162\1\172\1\145\1\uffff\1\172\1\145\1\172\1\146\1\162\1\156"+
        "\2\uffff\1\143\1\151\1\155\1\156\1\145\1\uffff\1\145\1\164\1\145"+
        "\1\164\1\141\1\164\1\162\1\uffff\1\167\1\172\1\146\1\uffff\1\172"+
        "\1\164\1\145\1\uffff\1\172\1\151\1\143\1\162\1\172\1\uffff\1\141"+
        "\1\uffff\2\154\2\uffff\1\172\1\163\1\155\1\163\1\156\1\172\1\141"+
        "\1\162\1\172\2\uffff\1\146\1\143\2\145\1\172\1\163\1\172\1\162\1"+
        "\145\1\172\1\uffff\1\143\1\156\1\uffff\1\145\1\151\1\uffff\1\156"+
        "\1\uffff\1\172\1\uffff\1\151\1\141\1\163\1\151\1\142\1\141\1\172"+
        "\1\145\1\111\1\162\1\170\1\145\1\162\1\145\1\157\1\141\1\uffff\1"+
        "\172\1\uffff\1\145\1\172\1\uffff\1\145\2\164\1\uffff\1\164\1\172"+
        "\1\145\1\uffff\1\124\1\160\1\123\1\124\1\144\1\uffff\1\164\1\145"+
        "\1\uffff\1\151\1\164\1\163\1\164\1\uffff\1\151\1\uffff\1\144\1\172"+
        "\1\uffff\2\164\2\144\1\143\1\uffff\1\156\1\143\1\164\1\141\1\165"+
        "\1\164\1\uffff\1\156\1\144\1\141\1\164\1\172\1\145\1\172\1\171\1"+
        "\162\1\uffff\1\156\1\uffff\1\163\2\172\1\145\1\uffff\1\172\1\171"+
        "\2\164\1\151\1\171\1\145\1\151\1\144\1\156\1\172\1\141\1\172\1\163"+
        "\1\164\1\172\1\uffff\1\151\1\172\1\123\3\145\1\164\1\141\2\164\1"+
        "\151\2\172\1\151\1\172\1\uffff\1\172\1\uffff\1\172\1\144\1\164\1"+
        "\172\2\uffff\1\172\1\uffff\1\160\1\171\1\141\1\156\1\160\1\146\1"+
        "\157\1\172\1\145\1\171\1\uffff\1\143\1\uffff\1\172\1\151\1\uffff"+
        "\1\157\1\uffff\1\145\2\172\1\144\1\172\1\156\1\151\1\145\1\143\2"+
        "\uffff\1\156\3\uffff\1\172\1\151\2\uffff\1\145\1\172\1\164\1\144"+
        "\1\145\1\151\1\156\1\uffff\1\163\1\124\1\150\1\uffff\1\157\1\156"+
        "\1\164\2\uffff\1\172\1\uffff\1\143\1\157\1\163\1\172\1\164\1\uffff"+
        "\1\141\1\172\1\uffff\1\145\2\117\1\156\1\163\1\172\1\151\1\171\1"+
        "\151\1\156\2\172\1\uffff\1\145\1\156\1\172\1\uffff\1\163\1\154\1"+
        "\uffff\1\172\2\146\1\145\1\172\1\uffff\1\156\1\160\1\156\1\163\2"+
        "\uffff\1\163\1\143\1\uffff\2\172\1\uffff\2\172\1\144\1\uffff\1\144"+
        "\2\145\2\172\2\154\4\uffff\3\172\1\163\2\uffff\2\141\3\uffff\1\172"+
        "\2\163\1\uffff\2\163\2\172\2\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\1\32\uffff\1\127\2\uffff\1\133\1\134\1\uffff\1\140\1"+
        "\uffff\1\143\1\uffff\1\146\1\147\1\150\1\uffff\1\153\1\156\1\157"+
        "\1\160\1\161\1\162\1\164\1\165\1\166\1\167\1\170\71\uffff\1\130"+
        "\1\131\1\163\1\132\1\154\1\136\1\137\1\135\1\142\1\141\1\145\1\144"+
        "\1\152\1\155\1\151\21\uffff\1\23\15\uffff\1\43\7\uffff\1\55\5\uffff"+
        "\1\57\5\uffff\1\71\5\uffff\1\104\16\uffff\1\2\7\uffff\1\12\6\uffff"+
        "\1\20\1\22\5\uffff\1\32\7\uffff\1\42\3\uffff\1\46\3\uffff\1\53\5"+
        "\uffff\1\63\1\uffff\1\65\2\uffff\1\70\1\72\11\uffff\1\107\1\110"+
        "\12\uffff\1\126\2\uffff\1\5\2\uffff\1\10\1\uffff\1\13\1\uffff\1"+
        "\15\20\uffff\1\45\1\uffff\1\50\2\uffff\1\54\3\uffff\1\62\3\uffff"+
        "\1\73\5\uffff\1\102\2\uffff\1\106\4\uffff\1\120\1\uffff\1\122\2"+
        "\uffff\1\125\5\uffff\1\14\6\uffff\1\30\11\uffff\1\47\1\uffff\1\52"+
        "\4\uffff\1\66\20\uffff\1\124\17\uffff\1\36\1\uffff\1\40\4\uffff"+
        "\1\60\1\61\1\uffff\1\67\12\uffff\1\112\1\uffff\1\116\2\uffff\1\123"+
        "\1\uffff\1\4\11\uffff\1\31\1\33\1\uffff\1\35\1\37\1\41\2\uffff\1"+
        "\56\1\64\7\uffff\1\105\3\uffff\1\117\3\uffff\1\7\1\11\1\uffff\1"+
        "\17\5\uffff\1\44\2\uffff\1\75\14\uffff\1\16\3\uffff\1\27\2\uffff"+
        "\1\74\5\uffff\1\111\4\uffff\1\3\1\6\2\uffff\1\26\2\uffff\1\76\3"+
        "\uffff\1\103\7\uffff\1\34\1\51\1\77\1\100\4\uffff\1\121\1\21\2\uffff"+
        "\1\101\1\113\1\114\3\uffff\1\115\4\uffff\1\24\1\25";
    static final String DFA19_specialS =
        "\u021d\uffff}>";
    static final String[] DFA19_transitionS = {
            "\2\34\1\uffff\2\34\22\uffff\1\34\1\uffff\1\63\1\46\1\64\1\uffff"+
            "\1\1\1\62\1\52\1\56\1\60\1\53\1\42\1\36\1\43\1\35\12\61\1\41"+
            "\1\57\1\51\1\44\1\45\1\uffff\1\37\1\64\1\2\1\3\4\64\1\4\6\64"+
            "\1\5\2\64\1\6\1\7\1\10\1\11\5\64\1\50\1\uffff\1\55\1\uffff\1"+
            "\64\1\uffff\1\12\1\13\1\14\1\15\1\16\1\17\2\64\1\20\2\64\1\21"+
            "\1\22\1\23\1\24\1\25\1\64\1\26\1\27\1\30\1\31\1\64\1\32\1\33"+
            "\2\64\1\47\1\40\1\54",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70\3\uffff\1\71",
            "\1\72",
            "\1\73\11\uffff\1\74",
            "\1\75\3\uffff\1\76",
            "\1\77",
            "\1\100\11\uffff\1\101\1\uffff\1\102\4\uffff\1\103\1\104\1\105",
            "\1\106\17\uffff\1\107\3\uffff\1\110",
            "\1\111\2\uffff\1\112",
            "\1\113\3\uffff\1\114\5\uffff\1\115",
            "\1\116\1\uffff\1\117\11\uffff\1\120",
            "\1\121\15\uffff\1\122\2\uffff\1\123",
            "\1\124\6\uffff\1\125\1\126\5\uffff\1\127",
            "\1\130",
            "\1\131",
            "\1\132\11\uffff\1\133\5\uffff\1\134",
            "\1\135\12\uffff\1\136\1\uffff\1\137\1\uffff\1\140",
            "\1\141\2\uffff\1\142\1\143",
            "\1\144",
            "\1\145\16\uffff\1\146\1\147",
            "\1\150\11\uffff\1\151",
            "\1\152",
            "\1\153\1\154",
            "\1\155",
            "",
            "\1\157\4\uffff\1\156",
            "\1\156\20\uffff\1\161",
            "",
            "",
            "\1\163\2\uffff\1\164",
            "",
            "\1\166",
            "",
            "\1\170",
            "",
            "",
            "",
            "\1\172\1\173",
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
            "\1\175",
            "\1\176\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084\2\uffff\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u008d\7\64",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091\14\uffff\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097\10\uffff\1\u0098\6\uffff\1\u0099",
            "\1\u009a",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\26\64\1\u009b\3\64",
            "\1\u009d",
            "\1\u009e\20\uffff\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00a5",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\11\64\1\u00a6\10"+
            "\64\1\u00a7\1\u00a8\1\64\1\u00a9\4\64",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u00af\6\64",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\3\64\1\u00b5\26\64",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf\23\uffff\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
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
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\12\64\7\uffff\10\64\1\u00d3\21\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00dc",
            "\1\u00dd\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00e4",
            "",
            "\1\u00e5",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u00e6\21"+
            "\64",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u00f2",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00f4\17\uffff\1\u00f5",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u00f8",
            "\1\u00f9\3\uffff\1\u00fa\3\uffff\1\u00fb\13\uffff\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "\1\u0100",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u010e",
            "\1\u010f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0111",
            "\1\u0112",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0114",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0116",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "",
            "",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "",
            "\1\u0127",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0129",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u012b",
            "\1\u012c",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0132",
            "",
            "\1\u0133",
            "\1\u0134",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138\4\uffff\1\u0139",
            "\1\u013a",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u013c",
            "\1\u013d",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0144",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0146",
            "\1\u0147",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0149",
            "\1\u014a",
            "",
            "\1\u014b",
            "\1\u014c",
            "",
            "\1\u014d",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0160",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "",
            "\1\u0165",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0167",
            "",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b\10\uffff\1\u016c",
            "\1\u016d",
            "",
            "\1\u016e",
            "\1\u016f",
            "",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172\5\uffff\1\u0173",
            "\1\u0174",
            "",
            "\1\u0175",
            "",
            "\1\u0176",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0188",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u018a",
            "\1\u018b",
            "",
            "\1\u018c",
            "",
            "\1\u018d",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0190",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\12\64\7\uffff\1\64\1\u019b\30\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u019d",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u019f",
            "\1\u01a0",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u01a2",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01af",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01b3",
            "\1\u01b4",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01bf",
            "\1\u01c0",
            "",
            "\1\u01c1",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01c3",
            "",
            "\1\u01c4",
            "",
            "\1\u01c5",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01c8",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "",
            "",
            "\1\u01ce",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01d0",
            "",
            "",
            "\1\u01d1",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "",
            "\1\u01d8",
            "\1\u01d9\10\uffff\1\u01da",
            "\1\u01db",
            "",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01e4",
            "",
            "\1\u01e5",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u01f3",
            "\1\u01f4",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u01f6",
            "\1\u01f7",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "",
            "",
            "\1\u0201",
            "\1\u0202\37\uffff\1\u0203",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0208",
            "",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u020e",
            "\1\u020f",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0213",
            "",
            "",
            "\1\u0214",
            "\1\u0215",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0217",
            "\1\u0218",
            "",
            "\1\u0219",
            "\1\u021a",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
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
            return "1:1: Tokens : ( T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | WS | SL_COMMENT | ML_COMMENT | ARROW | AT | BAR | COLON | COLON_COLON | COLON_EQUAL | COMMA | DOT | DOTDOT | EQUAL | GREATER | GREATER_EQUAL | HASH | LBRACE | LBRACK | LESS | LESS_EQUAL | LPAREN | MINUS | NOT_EQUAL | PLUS | RBRACE | RBRACK | RPAREN | SEMI | SLASH | STAR | RANGE_OR_INT | STRING | NON_OCL_STRING | IDENT );";
        }
    }
 

}