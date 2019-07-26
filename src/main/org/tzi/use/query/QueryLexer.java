// $ANTLR 3.4 Query.g 2019-07-26 18:11:41

package org.tzi.use.query;
import org.tzi.use.query.ast.*;
import org.tzi.use.parser.ParseErrorHandler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class QueryLexer extends Lexer {
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

    public QueryLexer() {} 
    public QueryLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public QueryLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Query.g"; }

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:28:7: ( '&' )
            // Query.g:28:9: '&'
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
            // Query.g:29:7: ( 'Bag' )
            // Query.g:29:9: 'Bag'
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
            // Query.g:30:7: ( 'Collection' )
            // Query.g:30:9: 'Collection'
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
            // Query.g:31:7: ( 'OrderedSet' )
            // Query.g:31:9: 'OrderedSet'
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
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:32:7: ( 'Sequence' )
            // Query.g:32:9: 'Sequence'
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
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:33:7: ( 'Set' )
            // Query.g:33:9: 'Set'
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
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:34:7: ( 'Tuple' )
            // Query.g:34:9: 'Tuple'
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
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:35:7: ( 'Undefined' )
            // Query.g:35:9: 'Undefined'
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
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:36:7: ( 'all' )
            // Query.g:36:9: 'all'
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:37:7: ( 'allInstances' )
            // Query.g:37:9: 'allInstances'
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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:38:7: ( 'and' )
            // Query.g:38:9: 'and'
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
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:39:7: ( 'as' )
            // Query.g:39:9: 'as'
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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:40:7: ( 'but' )
            // Query.g:40:9: 'but'
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
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:41:7: ( 'byUseId' )
            // Query.g:41:9: 'byUseId'
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
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:42:7: ( 'div' )
            // Query.g:42:9: 'div'
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
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:43:7: ( 'else' )
            // Query.g:43:9: 'else'
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
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:44:7: ( 'end' )
            // Query.g:44:9: 'end'
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
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:45:7: ( 'endif' )
            // Query.g:45:9: 'endif'
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
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:46:7: ( 'false' )
            // Query.g:46:9: 'false'
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
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:47:7: ( 'if' )
            // Query.g:47:9: 'if'
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
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:48:7: ( 'implies' )
            // Query.g:48:9: 'implies'
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:49:7: ( 'in' )
            // Query.g:49:9: 'in'
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:50:7: ( 'inject' )
            // Query.g:50:9: 'inject'
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:51:7: ( 'iterate' )
            // Query.g:51:9: 'iterate'
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:52:7: ( 'let' )
            // Query.g:52:9: 'let'
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:53:7: ( 'module' )
            // Query.g:53:9: 'module'
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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:54:7: ( 'no' )
            // Query.g:54:9: 'no'
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:55:7: ( 'not' )
            // Query.g:55:9: 'not'
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
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:56:7: ( 'null' )
            // Query.g:56:9: 'null'
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
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:57:7: ( 'oclAsType' )
            // Query.g:57:9: 'oclAsType'
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
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:58:7: ( 'oclEmpty' )
            // Query.g:58:9: 'oclEmpty'
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
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:59:7: ( 'oclInState' )
            // Query.g:59:9: 'oclInState'
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
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:60:7: ( 'oclIsKindOf' )
            // Query.g:60:9: 'oclIsKindOf'
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
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:61:7: ( 'oclIsTypeOf' )
            // Query.g:61:9: 'oclIsTypeOf'
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
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:62:7: ( 'oclUndefined' )
            // Query.g:62:9: 'oclUndefined'
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
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:63:7: ( 'only' )
            // Query.g:63:9: 'only'
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
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:64:7: ( 'or' )
            // Query.g:64:9: 'or'
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
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:65:7: ( 'pre' )
            // Query.g:65:9: 'pre'
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
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:66:7: ( 'select' )
            // Query.g:66:9: 'select'
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
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:67:7: ( 'selectByKind' )
            // Query.g:67:9: 'selectByKind'
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
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:68:7: ( 'selectByType' )
            // Query.g:68:9: 'selectByType'
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
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:69:7: ( 'then' )
            // Query.g:69:9: 'then'
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
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:70:7: ( 'true' )
            // Query.g:70:9: 'true'
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
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:71:7: ( 'with' )
            // Query.g:71:9: 'with'
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
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:72:7: ( 'xor' )
            // Query.g:72:9: 'xor'
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
    // $ANTLR end "T__88"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Query.g:865:3: ( ( ' ' | '\\t' | '\\f' | NEWLINE ) )
            // Query.g:866:5: ( ' ' | '\\t' | '\\f' | NEWLINE )
            {
            // Query.g:866:5: ( ' ' | '\\t' | '\\f' | NEWLINE )
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
                    // Query.g:866:7: ' '
                    {
                    match(' '); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Query.g:867:7: '\\t'
                    {
                    match('\t'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Query.g:868:7: '\\f'
                    {
                    match('\f'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // Query.g:869:7: NEWLINE
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
            // Query.g:875:11: ( ( '//' | '--' ) (~ ( NEWLINE ) )* )
            // Query.g:876:5: ( '//' | '--' ) (~ ( NEWLINE ) )*
            {
            // Query.g:876:5: ( '//' | '--' )
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
                    // Query.g:876:6: '//'
                    {
                    match("//"); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // Query.g:876:13: '--'
                    {
                    match("--"); if (state.failed) return ;



                    }
                    break;

            }


            // Query.g:877:5: (~ ( NEWLINE ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Query.g:877:6: ~ ( NEWLINE )
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
            // Query.g:882:11: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // Query.g:883:5: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); if (state.failed) return ;



            // Query.g:883:10: ( options {greedy=false; } : . )*
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
            	    // Query.g:883:38: .
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
            // Query.g:887:9: ( '\\r\\n' | '\\r' | '\\n' )
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
                    // Query.g:888:5: '\\r\\n'
                    {
                    match("\r\n"); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // Query.g:888:14: '\\r'
                    {
                    match('\r'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Query.g:888:21: '\\n'
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
            // Query.g:890:10: ( '->' )
            // Query.g:890:12: '->'
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
            // Query.g:891:11: ( '@' )
            // Query.g:891:13: '@'
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
            // Query.g:892:8: ( '|' )
            // Query.g:892:10: '|'
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
            // Query.g:893:10: ( ':' )
            // Query.g:893:12: ':'
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
            // Query.g:894:14: ( '::' )
            // Query.g:894:16: '::'
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
            // Query.g:895:14: ( ':=' )
            // Query.g:895:16: ':='
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
            // Query.g:896:10: ( ',' )
            // Query.g:896:12: ','
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
            // Query.g:897:8: ( '.' )
            // Query.g:897:10: '.'
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
            // Query.g:898:11: ( '..' )
            // Query.g:898:13: '..'
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
            // Query.g:899:10: ( '=' )
            // Query.g:899:12: '='
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
            // Query.g:900:11: ( '>' )
            // Query.g:900:13: '>'
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
            // Query.g:901:15: ( '>=' )
            // Query.g:901:17: '>='
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
            // Query.g:902:9: ( '#' )
            // Query.g:902:11: '#'
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
            // Query.g:903:11: ( '{' )
            // Query.g:903:13: '{'
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
            // Query.g:904:11: ( '[' )
            // Query.g:904:13: '['
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
            // Query.g:905:9: ( '<' )
            // Query.g:905:11: '<'
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
            // Query.g:906:14: ( '<=' )
            // Query.g:906:16: '<='
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
            // Query.g:907:11: ( '(' )
            // Query.g:907:13: '('
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
            // Query.g:908:10: ( '-' )
            // Query.g:908:12: '-'
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
            // Query.g:909:13: ( '<>' )
            // Query.g:909:15: '<>'
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
            // Query.g:910:9: ( '+' )
            // Query.g:910:11: '+'
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
            // Query.g:911:11: ( '}' )
            // Query.g:911:13: '}'
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
            // Query.g:912:11: ( ']' )
            // Query.g:912:13: ']'
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
            // Query.g:913:10: ( ')' )
            // Query.g:913:12: ')'
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
            // Query.g:914:8: ( ';' )
            // Query.g:914:10: ';'
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
            // Query.g:915:10: ( '/' )
            // Query.g:915:12: '/'
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
            // Query.g:916:9: ( '*' )
            // Query.g:916:11: '*'
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
            // Query.g:920:4: ( ( '0' .. '9' )+ )
            // Query.g:921:5: ( '0' .. '9' )+
            {
            // Query.g:921:5: ( '0' .. '9' )+
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
            	    // Query.g:
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
            // Query.g:925:5: ( INT ( '.' INT ( ( 'e' | 'E' ) ( '+' | '-' )? INT )? | ( 'e' | 'E' ) ( '+' | '-' )? INT ) )
            // Query.g:926:5: INT ( '.' INT ( ( 'e' | 'E' ) ( '+' | '-' )? INT )? | ( 'e' | 'E' ) ( '+' | '-' )? INT )
            {
            mINT(); if (state.failed) return ;


            // Query.g:926:9: ( '.' INT ( ( 'e' | 'E' ) ( '+' | '-' )? INT )? | ( 'e' | 'E' ) ( '+' | '-' )? INT )
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
                    // Query.g:926:10: '.' INT ( ( 'e' | 'E' ) ( '+' | '-' )? INT )?
                    {
                    match('.'); if (state.failed) return ;

                    mINT(); if (state.failed) return ;


                    // Query.g:926:18: ( ( 'e' | 'E' ) ( '+' | '-' )? INT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // Query.g:926:19: ( 'e' | 'E' ) ( '+' | '-' )? INT
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


                            // Query.g:926:31: ( '+' | '-' )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0=='+'||LA7_0=='-') ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // Query.g:
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
                    // Query.g:926:52: ( 'e' | 'E' ) ( '+' | '-' )? INT
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


                    // Query.g:926:64: ( '+' | '-' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='+'||LA9_0=='-') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // Query.g:
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
            // Query.g:928:13: ( ( INT '..' )=> INT | ( REAL )=> REAL | INT )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                int LA11_1 = input.LA(2);

                if ( ((LA11_1 >= '0' && LA11_1 <= '9')) && (synpred2_Query())) {
                    alt11=2;
                }
                else if ( (LA11_1=='.') && (synpred2_Query())) {
                    alt11=2;
                }
                else if ( (LA11_1=='E'||LA11_1=='e') && (synpred2_Query())) {
                    alt11=2;
                }
                else if ( (synpred1_Query()) ) {
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
                    // Query.g:929:7: ( INT '..' )=> INT
                    {
                    mINT(); if (state.failed) return ;


                    if ( state.backtracking==0 ) { _type=INT; }

                    }
                    break;
                case 2 :
                    // Query.g:930:7: ( REAL )=> REAL
                    {
                    mREAL(); if (state.failed) return ;


                    if ( state.backtracking==0 ) { _type=REAL; }

                    }
                    break;
                case 3 :
                    // Query.g:931:9: INT
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
            // Query.g:935:7: ( '\\'' (~ ( '\\'' | '\\\\' ) | ESC )* '\\'' )
            // Query.g:936:5: '\\'' (~ ( '\\'' | '\\\\' ) | ESC )* '\\''
            {
            match('\''); if (state.failed) return ;

            // Query.g:936:10: (~ ( '\\'' | '\\\\' ) | ESC )*
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
            	    // Query.g:936:12: ~ ( '\\'' | '\\\\' )
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
            	    // Query.g:936:27: ESC
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
            // Query.g:938:15: ( '\"' (~ ( '\"' | '\\\\' ) | ESC )* '\"' )
            // Query.g:939:5: '\"' (~ ( '\"' | '\\\\' ) | ESC )* '\"'
            {
            match('\"'); if (state.failed) return ;

            // Query.g:939:9: (~ ( '\"' | '\\\\' ) | ESC )*
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
            	    // Query.g:939:11: ~ ( '\"' | '\\\\' )
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
            	    // Query.g:939:25: ESC
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
            // Query.g:952:5: ( '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT | '0' .. '3' ( '0' .. '7' ( '0' .. '7' )? )? | '4' .. '7' ( '0' .. '7' )? ) )
            // Query.g:953:5: '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT | '0' .. '3' ( '0' .. '7' ( '0' .. '7' )? )? | '4' .. '7' ( '0' .. '7' )? )
            {
            match('\\'); if (state.failed) return ;

            // Query.g:954:6: ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT | '0' .. '3' ( '0' .. '7' ( '0' .. '7' )? )? | '4' .. '7' ( '0' .. '7' )? )
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
                    // Query.g:954:8: 'n'
                    {
                    match('n'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Query.g:955:8: 'r'
                    {
                    match('r'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Query.g:956:8: 't'
                    {
                    match('t'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // Query.g:957:8: 'b'
                    {
                    match('b'); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // Query.g:958:8: 'f'
                    {
                    match('f'); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // Query.g:959:8: '\"'
                    {
                    match('\"'); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // Query.g:960:8: '\\''
                    {
                    match('\''); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // Query.g:961:8: '\\\\'
                    {
                    match('\\'); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // Query.g:962:8: 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
                    {
                    match('u'); if (state.failed) return ;

                    mHEX_DIGIT(); if (state.failed) return ;


                    mHEX_DIGIT(); if (state.failed) return ;


                    mHEX_DIGIT(); if (state.failed) return ;


                    mHEX_DIGIT(); if (state.failed) return ;


                    }
                    break;
                case 10 :
                    // Query.g:963:8: '0' .. '3' ( '0' .. '7' ( '0' .. '7' )? )?
                    {
                    matchRange('0','3'); if (state.failed) return ;

                    // Query.g:963:17: ( '0' .. '7' ( '0' .. '7' )? )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0 >= '0' && LA15_0 <= '7')) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // Query.g:963:18: '0' .. '7' ( '0' .. '7' )?
                            {
                            matchRange('0','7'); if (state.failed) return ;

                            // Query.g:963:27: ( '0' .. '7' )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( ((LA14_0 >= '0' && LA14_0 <= '7')) ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // Query.g:
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
                    // Query.g:963:45: '4' .. '7' ( '0' .. '7' )?
                    {
                    matchRange('4','7'); if (state.failed) return ;

                    // Query.g:963:54: ( '0' .. '7' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0 >= '0' && LA16_0 <= '7')) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // Query.g:
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
            // Query.g:969:10: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )
            // Query.g:
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
            // Query.g:976:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // Query.g:977:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Query.g:977:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0 >= '0' && LA18_0 <= '9')||(LA18_0 >= 'A' && LA18_0 <= 'Z')||LA18_0=='_'||(LA18_0 >= 'a' && LA18_0 <= 'z')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Query.g:
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
            // Query.g:988:6: ( '\\U0003' .. '\\U0377' )
            // Query.g:
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
        // Query.g:1:8: ( T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | WS | SL_COMMENT | ML_COMMENT | ARROW | AT | BAR | COLON | COLON_COLON | COLON_EQUAL | COMMA | DOT | DOTDOT | EQUAL | GREATER | GREATER_EQUAL | HASH | LBRACE | LBRACK | LESS | LESS_EQUAL | LPAREN | MINUS | NOT_EQUAL | PLUS | RBRACE | RBRACK | RPAREN | SEMI | SLASH | STAR | RANGE_OR_INT | STRING | NON_OCL_STRING | IDENT )
        int alt19=79;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // Query.g:1:10: T__44
                {
                mT__44(); if (state.failed) return ;


                }
                break;
            case 2 :
                // Query.g:1:16: T__45
                {
                mT__45(); if (state.failed) return ;


                }
                break;
            case 3 :
                // Query.g:1:22: T__46
                {
                mT__46(); if (state.failed) return ;


                }
                break;
            case 4 :
                // Query.g:1:28: T__47
                {
                mT__47(); if (state.failed) return ;


                }
                break;
            case 5 :
                // Query.g:1:34: T__48
                {
                mT__48(); if (state.failed) return ;


                }
                break;
            case 6 :
                // Query.g:1:40: T__49
                {
                mT__49(); if (state.failed) return ;


                }
                break;
            case 7 :
                // Query.g:1:46: T__50
                {
                mT__50(); if (state.failed) return ;


                }
                break;
            case 8 :
                // Query.g:1:52: T__51
                {
                mT__51(); if (state.failed) return ;


                }
                break;
            case 9 :
                // Query.g:1:58: T__52
                {
                mT__52(); if (state.failed) return ;


                }
                break;
            case 10 :
                // Query.g:1:64: T__53
                {
                mT__53(); if (state.failed) return ;


                }
                break;
            case 11 :
                // Query.g:1:70: T__54
                {
                mT__54(); if (state.failed) return ;


                }
                break;
            case 12 :
                // Query.g:1:76: T__55
                {
                mT__55(); if (state.failed) return ;


                }
                break;
            case 13 :
                // Query.g:1:82: T__56
                {
                mT__56(); if (state.failed) return ;


                }
                break;
            case 14 :
                // Query.g:1:88: T__57
                {
                mT__57(); if (state.failed) return ;


                }
                break;
            case 15 :
                // Query.g:1:94: T__58
                {
                mT__58(); if (state.failed) return ;


                }
                break;
            case 16 :
                // Query.g:1:100: T__59
                {
                mT__59(); if (state.failed) return ;


                }
                break;
            case 17 :
                // Query.g:1:106: T__60
                {
                mT__60(); if (state.failed) return ;


                }
                break;
            case 18 :
                // Query.g:1:112: T__61
                {
                mT__61(); if (state.failed) return ;


                }
                break;
            case 19 :
                // Query.g:1:118: T__62
                {
                mT__62(); if (state.failed) return ;


                }
                break;
            case 20 :
                // Query.g:1:124: T__63
                {
                mT__63(); if (state.failed) return ;


                }
                break;
            case 21 :
                // Query.g:1:130: T__64
                {
                mT__64(); if (state.failed) return ;


                }
                break;
            case 22 :
                // Query.g:1:136: T__65
                {
                mT__65(); if (state.failed) return ;


                }
                break;
            case 23 :
                // Query.g:1:142: T__66
                {
                mT__66(); if (state.failed) return ;


                }
                break;
            case 24 :
                // Query.g:1:148: T__67
                {
                mT__67(); if (state.failed) return ;


                }
                break;
            case 25 :
                // Query.g:1:154: T__68
                {
                mT__68(); if (state.failed) return ;


                }
                break;
            case 26 :
                // Query.g:1:160: T__69
                {
                mT__69(); if (state.failed) return ;


                }
                break;
            case 27 :
                // Query.g:1:166: T__70
                {
                mT__70(); if (state.failed) return ;


                }
                break;
            case 28 :
                // Query.g:1:172: T__71
                {
                mT__71(); if (state.failed) return ;


                }
                break;
            case 29 :
                // Query.g:1:178: T__72
                {
                mT__72(); if (state.failed) return ;


                }
                break;
            case 30 :
                // Query.g:1:184: T__73
                {
                mT__73(); if (state.failed) return ;


                }
                break;
            case 31 :
                // Query.g:1:190: T__74
                {
                mT__74(); if (state.failed) return ;


                }
                break;
            case 32 :
                // Query.g:1:196: T__75
                {
                mT__75(); if (state.failed) return ;


                }
                break;
            case 33 :
                // Query.g:1:202: T__76
                {
                mT__76(); if (state.failed) return ;


                }
                break;
            case 34 :
                // Query.g:1:208: T__77
                {
                mT__77(); if (state.failed) return ;


                }
                break;
            case 35 :
                // Query.g:1:214: T__78
                {
                mT__78(); if (state.failed) return ;


                }
                break;
            case 36 :
                // Query.g:1:220: T__79
                {
                mT__79(); if (state.failed) return ;


                }
                break;
            case 37 :
                // Query.g:1:226: T__80
                {
                mT__80(); if (state.failed) return ;


                }
                break;
            case 38 :
                // Query.g:1:232: T__81
                {
                mT__81(); if (state.failed) return ;


                }
                break;
            case 39 :
                // Query.g:1:238: T__82
                {
                mT__82(); if (state.failed) return ;


                }
                break;
            case 40 :
                // Query.g:1:244: T__83
                {
                mT__83(); if (state.failed) return ;


                }
                break;
            case 41 :
                // Query.g:1:250: T__84
                {
                mT__84(); if (state.failed) return ;


                }
                break;
            case 42 :
                // Query.g:1:256: T__85
                {
                mT__85(); if (state.failed) return ;


                }
                break;
            case 43 :
                // Query.g:1:262: T__86
                {
                mT__86(); if (state.failed) return ;


                }
                break;
            case 44 :
                // Query.g:1:268: T__87
                {
                mT__87(); if (state.failed) return ;


                }
                break;
            case 45 :
                // Query.g:1:274: T__88
                {
                mT__88(); if (state.failed) return ;


                }
                break;
            case 46 :
                // Query.g:1:280: WS
                {
                mWS(); if (state.failed) return ;


                }
                break;
            case 47 :
                // Query.g:1:283: SL_COMMENT
                {
                mSL_COMMENT(); if (state.failed) return ;


                }
                break;
            case 48 :
                // Query.g:1:294: ML_COMMENT
                {
                mML_COMMENT(); if (state.failed) return ;


                }
                break;
            case 49 :
                // Query.g:1:305: ARROW
                {
                mARROW(); if (state.failed) return ;


                }
                break;
            case 50 :
                // Query.g:1:311: AT
                {
                mAT(); if (state.failed) return ;


                }
                break;
            case 51 :
                // Query.g:1:314: BAR
                {
                mBAR(); if (state.failed) return ;


                }
                break;
            case 52 :
                // Query.g:1:318: COLON
                {
                mCOLON(); if (state.failed) return ;


                }
                break;
            case 53 :
                // Query.g:1:324: COLON_COLON
                {
                mCOLON_COLON(); if (state.failed) return ;


                }
                break;
            case 54 :
                // Query.g:1:336: COLON_EQUAL
                {
                mCOLON_EQUAL(); if (state.failed) return ;


                }
                break;
            case 55 :
                // Query.g:1:348: COMMA
                {
                mCOMMA(); if (state.failed) return ;


                }
                break;
            case 56 :
                // Query.g:1:354: DOT
                {
                mDOT(); if (state.failed) return ;


                }
                break;
            case 57 :
                // Query.g:1:358: DOTDOT
                {
                mDOTDOT(); if (state.failed) return ;


                }
                break;
            case 58 :
                // Query.g:1:365: EQUAL
                {
                mEQUAL(); if (state.failed) return ;


                }
                break;
            case 59 :
                // Query.g:1:371: GREATER
                {
                mGREATER(); if (state.failed) return ;


                }
                break;
            case 60 :
                // Query.g:1:379: GREATER_EQUAL
                {
                mGREATER_EQUAL(); if (state.failed) return ;


                }
                break;
            case 61 :
                // Query.g:1:393: HASH
                {
                mHASH(); if (state.failed) return ;


                }
                break;
            case 62 :
                // Query.g:1:398: LBRACE
                {
                mLBRACE(); if (state.failed) return ;


                }
                break;
            case 63 :
                // Query.g:1:405: LBRACK
                {
                mLBRACK(); if (state.failed) return ;


                }
                break;
            case 64 :
                // Query.g:1:412: LESS
                {
                mLESS(); if (state.failed) return ;


                }
                break;
            case 65 :
                // Query.g:1:417: LESS_EQUAL
                {
                mLESS_EQUAL(); if (state.failed) return ;


                }
                break;
            case 66 :
                // Query.g:1:428: LPAREN
                {
                mLPAREN(); if (state.failed) return ;


                }
                break;
            case 67 :
                // Query.g:1:435: MINUS
                {
                mMINUS(); if (state.failed) return ;


                }
                break;
            case 68 :
                // Query.g:1:441: NOT_EQUAL
                {
                mNOT_EQUAL(); if (state.failed) return ;


                }
                break;
            case 69 :
                // Query.g:1:451: PLUS
                {
                mPLUS(); if (state.failed) return ;


                }
                break;
            case 70 :
                // Query.g:1:456: RBRACE
                {
                mRBRACE(); if (state.failed) return ;


                }
                break;
            case 71 :
                // Query.g:1:463: RBRACK
                {
                mRBRACK(); if (state.failed) return ;


                }
                break;
            case 72 :
                // Query.g:1:470: RPAREN
                {
                mRPAREN(); if (state.failed) return ;


                }
                break;
            case 73 :
                // Query.g:1:477: SEMI
                {
                mSEMI(); if (state.failed) return ;


                }
                break;
            case 74 :
                // Query.g:1:482: SLASH
                {
                mSLASH(); if (state.failed) return ;


                }
                break;
            case 75 :
                // Query.g:1:488: STAR
                {
                mSTAR(); if (state.failed) return ;


                }
                break;
            case 76 :
                // Query.g:1:493: RANGE_OR_INT
                {
                mRANGE_OR_INT(); if (state.failed) return ;


                }
                break;
            case 77 :
                // Query.g:1:506: STRING
                {
                mSTRING(); if (state.failed) return ;


                }
                break;
            case 78 :
                // Query.g:1:513: NON_OCL_STRING
                {
                mNON_OCL_STRING(); if (state.failed) return ;


                }
                break;
            case 79 :
                // Query.g:1:528: IDENT
                {
                mIDENT(); if (state.failed) return ;


                }
                break;

        }

    }

    // $ANTLR start synpred1_Query
    public final void synpred1_Query_fragment() throws RecognitionException {
        // Query.g:929:7: ( INT '..' )
        // Query.g:929:9: INT '..'
        {
        mINT(); if (state.failed) return ;


        match(".."); if (state.failed) return ;



        }

    }
    // $ANTLR end synpred1_Query

    // $ANTLR start synpred2_Query
    public final void synpred2_Query_fragment() throws RecognitionException {
        // Query.g:930:7: ( REAL )
        // Query.g:930:9: REAL
        {
        mREAL(); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred2_Query

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
    public final boolean synpred2_Query() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Query_fragment(); // can never throw exception
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
        "\2\uffff\25\57\1\uffff\1\122\1\124\2\uffff\1\127\1\uffff\1\131\1"+
        "\uffff\1\133\3\uffff\1\136\13\uffff\10\57\1\150\6\57\1\157\1\57"+
        "\1\162\3\57\1\167\3\57\1\173\6\57\17\uffff\1\u0082\3\57\1\u0086"+
        "\2\57\1\u008a\1\u008b\1\uffff\1\u008c\1\57\1\u008e\1\57\1\u0091"+
        "\1\57\1\uffff\2\57\1\uffff\1\57\1\u0096\1\57\1\u0098\1\uffff\3\57"+
        "\1\uffff\1\u009f\4\57\1\u00a4\1\uffff\3\57\1\uffff\3\57\3\uffff"+
        "\1\57\1\uffff\1\u00ac\1\57\1\uffff\4\57\1\uffff\1\57\1\uffff\1\u00b3"+
        "\4\57\1\u00b9\1\uffff\1\57\1\u00bb\1\u00bc\1\u00bd\1\uffff\3\57"+
        "\1\u00c1\3\57\1\uffff\1\u00c5\1\u00c6\4\57\1\uffff\5\57\1\uffff"+
        "\1\57\3\uffff\3\57\1\uffff\3\57\2\uffff\1\57\1\u00d9\1\57\1\u00db"+
        "\6\57\1\u00e3\5\57\1\u00e9\1\u00ea\1\uffff\1\u00eb\1\uffff\7\57"+
        "\1\uffff\2\57\1\u00f5\2\57\3\uffff\1\57\1\u00f9\7\57\1\uffff\1\u0102"+
        "\1\57\1\u0104\1\uffff\6\57\1\u010b\1\u010c\1\uffff\1\57\1\uffff"+
        "\1\u010e\5\57\2\uffff\1\57\1\uffff\1\u0115\1\u0116\3\57\1\u011a"+
        "\2\uffff\1\u011b\1\u011c\1\u011d\4\uffff";
    static final String DFA19_eofS =
        "\u011e\uffff";
    static final String DFA19_minS =
        "\1\11\1\uffff\1\141\1\157\1\162\1\145\1\165\1\156\1\154\1\165\1"+
        "\151\1\154\1\141\1\146\1\145\2\157\1\143\1\162\1\145\1\150\1\151"+
        "\1\157\1\uffff\1\52\1\55\2\uffff\1\72\1\uffff\1\56\1\uffff\1\75"+
        "\3\uffff\1\75\13\uffff\1\147\1\154\1\144\1\161\1\160\1\144\1\154"+
        "\1\144\1\60\1\164\1\125\1\166\1\163\1\144\1\154\1\60\1\160\1\60"+
        "\1\145\1\164\1\144\1\60\3\154\1\60\1\145\1\154\1\145\1\165\1\164"+
        "\1\162\17\uffff\1\60\1\154\1\145\1\165\1\60\1\154\1\145\2\60\1\uffff"+
        "\1\60\1\163\1\60\1\145\1\60\1\163\1\uffff\1\154\1\145\1\uffff\1"+
        "\162\1\60\1\165\1\60\1\uffff\1\154\1\101\1\171\1\uffff\1\60\1\145"+
        "\1\156\1\145\1\150\1\60\1\uffff\1\145\1\162\1\145\1\uffff\1\145"+
        "\1\146\1\156\3\uffff\1\145\1\uffff\1\60\1\146\1\uffff\1\145\1\151"+
        "\1\143\1\141\1\uffff\1\154\1\uffff\1\60\1\163\1\155\2\156\1\60\1"+
        "\uffff\1\143\3\60\1\uffff\1\143\1\145\1\156\1\60\1\151\1\163\1\111"+
        "\1\uffff\2\60\1\145\2\164\1\145\1\uffff\1\124\1\160\1\123\1\113"+
        "\1\144\1\uffff\1\164\3\uffff\1\164\1\144\1\143\1\uffff\1\156\1\164"+
        "\1\144\2\uffff\1\163\1\60\1\145\1\60\1\171\2\164\1\151\1\171\1\145"+
        "\1\60\1\151\1\123\2\145\1\141\2\60\1\uffff\1\60\1\uffff\1\160\1"+
        "\171\1\141\1\156\1\160\1\146\1\171\1\uffff\1\157\1\145\1\60\1\144"+
        "\1\156\3\uffff\1\145\1\60\1\164\1\144\1\145\1\151\1\113\1\156\1"+
        "\164\1\uffff\1\60\1\143\1\60\1\uffff\1\145\2\117\1\156\1\151\1\171"+
        "\2\60\1\uffff\1\145\1\uffff\1\60\2\146\1\145\1\156\1\160\2\uffff"+
        "\1\163\1\uffff\2\60\2\144\1\145\1\60\2\uffff\3\60\4\uffff";
    static final String DFA19_maxS =
        "\1\175\1\uffff\1\141\1\157\1\162\1\145\1\165\1\156\1\163\1\171\1"+
        "\151\1\156\1\141\1\164\1\145\1\157\1\165\2\162\1\145\1\162\1\151"+
        "\1\157\1\uffff\1\57\1\76\2\uffff\1\75\1\uffff\1\56\1\uffff\1\75"+
        "\3\uffff\1\76\13\uffff\1\147\1\154\1\144\1\164\1\160\1\144\1\154"+
        "\1\144\1\172\1\164\1\125\1\166\1\163\1\144\1\154\1\172\1\160\1\172"+
        "\1\145\1\164\1\144\1\172\3\154\1\172\1\145\1\154\1\145\1\165\1\164"+
        "\1\162\17\uffff\1\172\1\154\1\145\1\165\1\172\1\154\1\145\2\172"+
        "\1\uffff\1\172\1\163\1\172\1\145\1\172\1\163\1\uffff\1\154\1\145"+
        "\1\uffff\1\162\1\172\1\165\1\172\1\uffff\1\154\1\125\1\171\1\uffff"+
        "\1\172\1\145\1\156\1\145\1\150\1\172\1\uffff\1\145\1\162\1\145\1"+
        "\uffff\1\145\1\146\1\156\3\uffff\1\145\1\uffff\1\172\1\146\1\uffff"+
        "\1\145\1\151\1\143\1\141\1\uffff\1\154\1\uffff\1\172\1\163\1\155"+
        "\1\163\1\156\1\172\1\uffff\1\143\3\172\1\uffff\1\143\1\145\1\156"+
        "\1\172\1\151\1\163\1\111\1\uffff\2\172\1\145\2\164\1\145\1\uffff"+
        "\1\124\1\160\1\123\1\124\1\144\1\uffff\1\164\3\uffff\1\164\1\144"+
        "\1\143\1\uffff\1\156\1\164\1\144\2\uffff\1\163\1\172\1\145\1\172"+
        "\1\171\2\164\1\151\1\171\1\145\1\172\1\151\1\123\2\145\1\141\2\172"+
        "\1\uffff\1\172\1\uffff\1\160\1\171\1\141\1\156\1\160\1\146\1\171"+
        "\1\uffff\1\157\1\145\1\172\1\144\1\156\3\uffff\1\145\1\172\1\164"+
        "\1\144\1\145\1\151\1\124\1\156\1\164\1\uffff\1\172\1\143\1\172\1"+
        "\uffff\1\145\2\117\1\156\1\151\1\171\2\172\1\uffff\1\145\1\uffff"+
        "\1\172\2\146\1\145\1\156\1\160\2\uffff\1\163\1\uffff\2\172\2\144"+
        "\1\145\1\172\2\uffff\3\172\4\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\1\25\uffff\1\56\2\uffff\1\62\1\63\1\uffff\1\67\1\uffff"+
        "\1\72\1\uffff\1\75\1\76\1\77\1\uffff\1\102\1\105\1\106\1\107\1\110"+
        "\1\111\1\113\1\114\1\115\1\116\1\117\40\uffff\1\57\1\60\1\112\1"+
        "\61\1\103\1\65\1\66\1\64\1\71\1\70\1\74\1\73\1\101\1\104\1\100\11"+
        "\uffff\1\14\6\uffff\1\24\2\uffff\1\26\4\uffff\1\33\3\uffff\1\45"+
        "\6\uffff\1\2\3\uffff\1\6\3\uffff\1\11\1\13\1\15\1\uffff\1\17\2\uffff"+
        "\1\21\4\uffff\1\31\1\uffff\1\34\6\uffff\1\46\4\uffff\1\55\7\uffff"+
        "\1\20\6\uffff\1\35\5\uffff\1\44\1\uffff\1\52\1\53\1\54\3\uffff\1"+
        "\7\3\uffff\1\22\1\23\22\uffff\1\27\1\uffff\1\32\7\uffff\1\47\5\uffff"+
        "\1\16\1\25\1\30\11\uffff\1\5\3\uffff\1\37\10\uffff\1\10\1\uffff"+
        "\1\36\6\uffff\1\3\1\4\1\uffff\1\40\6\uffff\1\41\1\42\3\uffff\1\12"+
        "\1\43\1\50\1\51";
    static final String DFA19_specialS =
        "\u011e\uffff}>";
    static final String[] DFA19_transitionS = {
            "\2\27\1\uffff\2\27\22\uffff\1\27\1\uffff\1\56\1\41\2\uffff\1"+
            "\1\1\55\1\45\1\51\1\53\1\46\1\35\1\31\1\36\1\30\12\54\1\34\1"+
            "\52\1\44\1\37\1\40\1\uffff\1\32\1\57\1\2\1\3\13\57\1\4\3\57"+
            "\1\5\1\6\1\7\5\57\1\43\1\uffff\1\50\1\uffff\1\57\1\uffff\1\10"+
            "\1\11\1\57\1\12\1\13\1\14\2\57\1\15\2\57\1\16\1\17\1\20\1\21"+
            "\1\22\2\57\1\23\1\24\2\57\1\25\1\26\2\57\1\42\1\33\1\47",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66\1\uffff\1\67\4\uffff\1\70",
            "\1\71\3\uffff\1\72",
            "\1\73",
            "\1\74\1\uffff\1\75",
            "\1\76",
            "\1\77\6\uffff\1\100\1\101\5\uffff\1\102",
            "\1\103",
            "\1\104",
            "\1\105\5\uffff\1\106",
            "\1\107\12\uffff\1\110\3\uffff\1\111",
            "\1\112",
            "\1\113",
            "\1\114\11\uffff\1\115",
            "\1\116",
            "\1\117",
            "",
            "\1\121\4\uffff\1\120",
            "\1\120\20\uffff\1\123",
            "",
            "",
            "\1\125\2\uffff\1\126",
            "",
            "\1\130",
            "",
            "\1\132",
            "",
            "",
            "",
            "\1\134\1\135",
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
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142\2\uffff\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\160",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\11\57\1\161\20\57",
            "\1\163",
            "\1\164",
            "\1\165",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\166\6\57",
            "\1\170",
            "\1\171",
            "\1\172",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
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
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0087",
            "\1\u0088",
            "\12\57\7\uffff\10\57\1\u0089\21\57\4\uffff\1\57\1\uffff\32"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u008d",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u008f",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u0090\21"+
            "\57",
            "\1\u0092",
            "",
            "\1\u0093",
            "\1\u0094",
            "",
            "\1\u0095",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0097",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0099",
            "\1\u009a\3\uffff\1\u009b\3\uffff\1\u009c\13\uffff\1\u009d",
            "\1\u009e",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "",
            "",
            "\1\u00ab",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "\1\u00b2",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6\4\uffff\1\u00b7",
            "\1\u00b8",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00ba",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce\10\uffff\1\u00cf",
            "\1\u00d0",
            "",
            "\1\u00d1",
            "",
            "",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "",
            "",
            "\1\u00d8",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00da",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\12\57\7\uffff\1\57\1\u00e2\30\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "",
            "",
            "\1\u00f8",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe\10\uffff\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0103",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u010d",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "",
            "",
            "\1\u0114",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
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
            return "1:1: Tokens : ( T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | WS | SL_COMMENT | ML_COMMENT | ARROW | AT | BAR | COLON | COLON_COLON | COLON_EQUAL | COMMA | DOT | DOTDOT | EQUAL | GREATER | GREATER_EQUAL | HASH | LBRACE | LBRACK | LESS | LESS_EQUAL | LPAREN | MINUS | NOT_EQUAL | PLUS | RBRACE | RBRACK | RPAREN | SEMI | SLASH | STAR | RANGE_OR_INT | STRING | NON_OCL_STRING | IDENT );";
        }
    }
 

}