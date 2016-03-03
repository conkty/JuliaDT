// Generated from org/julia/lang/parser/Julia.g4 by ANTLR 4.5.1
package org.julia.lang.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JuliaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, OR=5, AND=6, MINUS=7, NOT=8, BITWISE_NOT=9, 
		SUB_TYPE=10, ASSIGNMENT_OPERATOR=11, CONDITIONAL_OPERATOR=12, ARROW_OPERATOR=13, 
		RELATIONAL_OPERATOR=14, PIPE_OPERATOR=15, INSTANCE_OF=16, COLON=17, PLUS=18, 
		ADDITIVE_OPERATOR=19, BIT_SHIFT_OPERATOR=20, TIMES=21, MULTIPLICATIVE_OPERATOR=22, 
		RATIONAL_OPERATOR=23, POWER_OPERATOR=24, EQ=25, DOLLAR=26, DOT=27, BEGIN=28, 
		WHILE=29, IMPORT_ALL=30, IMPORT=31, IF=32, FOR=33, TRY=34, RETURN=35, 
		BREAK=36, CONTINUE=37, FUNCTION=38, STAGED_FUNCTION=39, MACRO=40, QUOTE=41, 
		LET=42, LOCAL=43, GLOBAL=44, CONST=45, ABSTRACT=46, TYPE_ALIAS=47, TYPE=48, 
		BITS_TYPE=49, IMMUTABLE=50, CCALL=51, MODULE=52, BARE_MODULE=53, USING=54, 
		EXPORT=55, DO=56, CATCH=57, FINALLY=58, ARROW=59, AT=60, SEMI_COLON=61, 
		ELLIPSE=62, ELSE_IF=63, ELSE=64, COMMA=65, END=66, END_LITERAL=67, LEFT_PARENTHESIS=68, 
		RIGHT_PARENTHESIS=69, LEFT_BRACE=70, RIGHT_BRACE=71, LEFT_BRACKET=72, 
		RIGHT_BRACKET=73, REGEX=74, INT_LITERAL=75, BINARY=76, OCTAL=77, HEX=78, 
		FLOAT32_LITERAL=79, HEX_FLOAT=80, FLOAT64_LITERAL=81, CHARACTER_LITERAL=82, 
		STRING=83, WS=84, NL=85, IGNORED_EOL=86, COMMENT=87, LINE_COMMENT=88, 
		ID=89, SIZE=90;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "OR", "AND", "MINUS", "NOT", "BITWISE_NOT", 
		"SUB_TYPE", "ASSIGNMENT_OPERATOR", "CONDITIONAL_OPERATOR", "ARROW_OPERATOR", 
		"RELATIONAL_OPERATOR", "PIPE_OPERATOR", "INSTANCE_OF", "COLON", "PLUS", 
		"ADDITIVE_OPERATOR", "BIT_SHIFT_OPERATOR", "TIMES", "MULTIPLICATIVE_OPERATOR", 
		"RATIONAL_OPERATOR", "POWER_OPERATOR", "EQ", "DOLLAR", "DOT", "BEGIN", 
		"WHILE", "IMPORT_ALL", "IMPORT", "IF", "FOR", "TRY", "RETURN", "BREAK", 
		"CONTINUE", "FUNCTION", "STAGED_FUNCTION", "MACRO", "QUOTE", "LET", "LOCAL", 
		"GLOBAL", "CONST", "ABSTRACT", "TYPE_ALIAS", "TYPE", "BITS_TYPE", "IMMUTABLE", 
		"CCALL", "MODULE", "BARE_MODULE", "USING", "EXPORT", "DO", "CATCH", "FINALLY", 
		"ARROW", "AT", "SEMI_COLON", "ELLIPSE", "ELSE_IF", "ELSE", "COMMA", "END", 
		"END_LITERAL", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "LEFT_BRACE", 
		"RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", "REGEX", "INT_LITERAL", 
		"BINARY", "OCTAL", "HEX", "FLOAT32_LITERAL", "HEX_FLOAT", "EXP32", "FLOAT64_LITERAL", 
		"EXP64", "CHARACTER_LITERAL", "STRING", "SPACES", "WS", "NL", "IGNORED_EOL", 
		"COMMENT", "LINE_COMMENT", "ID", "DEC_DGT", "BIN_DGT", "OCT_DGT", "HEX_DGT", 
		"SIZE", "UNi"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'in'", "'true'", "'false'", "'Union'", "'||'", "'&&'", "'-'", "'!'", 
		"'~'", "'<:'", null, "'?'", null, null, null, "'::'", "':'", "'+'", null, 
		null, "'*'", null, null, null, "'='", "'$'", "'.'", "'begin'", "'while'", 
		"'importall'", "'import'", "'if'", "'for'", "'try'", "'return'", "'break'", 
		"'continue'", "'function'", "'stagedfunction'", "'macro'", "'quote'", 
		"'let'", "'local'", "'global'", "'const'", "'abstract'", "'typealias'", 
		"'type'", "'bitstype'", "'immutable'", "'ccall'", "'module'", "'baremodule'", 
		"'using'", "'export'", "'do'", "'catch'", "'finally'", "'->'", "'@'", 
		"';'", "'...'", "'elseif'", "'else'", "','", null, null, "'('", "')'", 
		"'{'", "'}'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "OR", "AND", "MINUS", "NOT", "BITWISE_NOT", 
		"SUB_TYPE", "ASSIGNMENT_OPERATOR", "CONDITIONAL_OPERATOR", "ARROW_OPERATOR", 
		"RELATIONAL_OPERATOR", "PIPE_OPERATOR", "INSTANCE_OF", "COLON", "PLUS", 
		"ADDITIVE_OPERATOR", "BIT_SHIFT_OPERATOR", "TIMES", "MULTIPLICATIVE_OPERATOR", 
		"RATIONAL_OPERATOR", "POWER_OPERATOR", "EQ", "DOLLAR", "DOT", "BEGIN", 
		"WHILE", "IMPORT_ALL", "IMPORT", "IF", "FOR", "TRY", "RETURN", "BREAK", 
		"CONTINUE", "FUNCTION", "STAGED_FUNCTION", "MACRO", "QUOTE", "LET", "LOCAL", 
		"GLOBAL", "CONST", "ABSTRACT", "TYPE_ALIAS", "TYPE", "BITS_TYPE", "IMMUTABLE", 
		"CCALL", "MODULE", "BARE_MODULE", "USING", "EXPORT", "DO", "CATCH", "FINALLY", 
		"ARROW", "AT", "SEMI_COLON", "ELLIPSE", "ELSE_IF", "ELSE", "COMMA", "END", 
		"END_LITERAL", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "LEFT_BRACE", 
		"RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", "REGEX", "INT_LITERAL", 
		"BINARY", "OCTAL", "HEX", "FLOAT32_LITERAL", "HEX_FLOAT", "FLOAT64_LITERAL", 
		"CHARACTER_LITERAL", "STRING", "WS", "NL", "IGNORED_EOL", "COMMENT", "LINE_COMMENT", 
		"ID", "SIZE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	   int nesting = 0;
	   int bracketNesting = 0;


	public JuliaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Julia.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 67:
			LEFT_PARENTHESIS_action((RuleContext)_localctx, actionIndex);
			break;
		case 68:
			RIGHT_PARENTHESIS_action((RuleContext)_localctx, actionIndex);
			break;
		case 69:
			LEFT_BRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 70:
			RIGHT_BRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 71:
			LEFT_BRACKET_action((RuleContext)_localctx, actionIndex);
			break;
		case 72:
			RIGHT_BRACKET_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void LEFT_PARENTHESIS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			nesting++;
			break;
		}
	}
	private void RIGHT_PARENTHESIS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			nesting--;
			break;
		}
	}
	private void LEFT_BRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			nesting++;
			break;
		}
	}
	private void RIGHT_BRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			nesting--;
			break;
		}
	}
	private void LEFT_BRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			nesting++;bracketNesting++;
			break;
		}
	}
	private void RIGHT_BRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			nesting--;bracketNesting--;
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 65:
			return END_sempred((RuleContext)_localctx, predIndex);
		case 66:
			return END_LITERAL_sempred((RuleContext)_localctx, predIndex);
		case 87:
			return NL_sempred((RuleContext)_localctx, predIndex);
		case 88:
			return IGNORED_EOL_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean END_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return bracketNesting==0;
		}
		return true;
	}
	private boolean END_LITERAL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return bracketNesting>0;
		}
		return true;
	}
	private boolean NL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return nesting==0;
		}
		return true;
	}
	private boolean IGNORED_EOL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return nesting>0;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\\\u03ba\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0129"+
		"\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u0132\n\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u0164\n\17\3\20\3\20\3\20\3\20\5\20\u016a\n\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u0178\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u018b\n\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u019b\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u01a2\n\30\3\31\3\31\3\31\5\31\u01a7\n\31\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 "+
		"\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*"+
		"\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3."+
		"\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\38\38\38\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3<\3<\3<\3=\3=\3>\3>\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3"+
		"A\3A\3A\3A\3A\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3F\3F\3F\3"+
		"G\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3K\3L\6L\u02c2\nL\rL\16L\u02c3"+
		"\3M\3M\3M\3M\6M\u02ca\nM\rM\16M\u02cb\3N\3N\3N\3N\6N\u02d2\nN\rN\16N\u02d3"+
		"\3O\3O\3O\3O\6O\u02da\nO\rO\16O\u02db\3P\6P\u02df\nP\rP\16P\u02e0\3P\3"+
		"P\7P\u02e5\nP\fP\16P\u02e8\13P\3P\5P\u02eb\nP\3P\3P\7P\u02ef\nP\fP\16"+
		"P\u02f2\13P\3P\5P\u02f5\nP\5P\u02f7\nP\3Q\3Q\3Q\3Q\5Q\u02fd\nQ\3Q\3Q\7"+
		"Q\u0301\nQ\fQ\16Q\u0304\13Q\5Q\u0306\nQ\3Q\3Q\5Q\u030a\nQ\3Q\6Q\u030d"+
		"\nQ\rQ\16Q\u030e\3R\3R\5R\u0313\nR\3R\6R\u0316\nR\rR\16R\u0317\3S\6S\u031b"+
		"\nS\rS\16S\u031c\3S\3S\7S\u0321\nS\fS\16S\u0324\13S\3S\5S\u0327\nS\3S"+
		"\3S\7S\u032b\nS\fS\16S\u032e\13S\3S\5S\u0331\nS\5S\u0333\nS\3T\3T\5T\u0337"+
		"\nT\3T\6T\u033a\nT\rT\16T\u033b\3U\3U\3U\3U\3U\3U\3U\5U\u0345\nU\3V\3"+
		"V\3V\3V\7V\u034b\nV\fV\16V\u034e\13V\3V\3V\3W\6W\u0353\nW\rW\16W\u0354"+
		"\3X\3X\3X\3X\3Y\5Y\u035c\nY\3Y\3Y\3Y\5Y\u0361\nY\6Y\u0363\nY\rY\16Y\u0364"+
		"\3Y\3Y\3Z\5Z\u036a\nZ\3Z\3Z\3Z\5Z\u036f\nZ\6Z\u0371\nZ\rZ\16Z\u0372\3"+
		"Z\3Z\3Z\3Z\3[\3[\3[\3[\7[\u037d\n[\f[\16[\u0380\13[\3[\3[\3[\3[\3[\3\\"+
		"\3\\\7\\\u0389\n\\\f\\\16\\\u038c\13\\\3\\\3\\\3]\3]\5]\u0392\n]\3]\3"+
		"]\3]\7]\u0397\n]\f]\16]\u039a\13]\3]\5]\u039d\n]\3^\3^\3_\3_\3`\3`\3a"+
		"\3a\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u03b7\nb\3c\3c"+
		"\3\u037e\2d\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008b"+
		"G\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009f"+
		"Q\u00a1R\u00a3\2\u00a5S\u00a7\2\u00a9T\u00abU\u00ad\2\u00afV\u00b1W\u00b3"+
		"X\u00b5Y\u00b7Z\u00b9[\u00bb\2\u00bd\2\u00bf\2\u00c1\2\u00c3\\\u00c5\2"+
		"\3\2\23\4\2>>@@\35\2~~\u00b3\u00b3\u2215\u2216\u223a\u223a\u2244\u2244"+
		"\u2251\u2251\u2290\u2290\u2296\u2296\u22bd\u22bd\u22bf\u22bf\u22d0\u22d0"+
		"\u22d5\u22d5\u29fc\u29fd\u2a0a\u2a0a\u2a24\u2a30\u2a3b\u2a3c\u2a43\u2a44"+
		"\u2a47\u2a47\u2a4c\u2a4c\u2a4e\u2a4e\u2a51\u2a52\u2a54\u2a54\u2a56\u2a56"+
		"\u2a58\u2a59\u2a5d\u2a5d\u2a5f\u2a5f\u2a63\u2a65\7\2\'\'\u00d9\u00d9\u00f9"+
		"\u00f9\u221a\u221a\u22c7\u22c7\4\2\60\60^^\4\2RRrr\4\2--//\3\2hh\3\2g"+
		"g\3\2))\3\2$$\4\2\13\13\"\"\4\2\f\f\17\17\4\2\62;aa\4\2\62\63aa\4\2\62"+
		"9aa\6\2\62;CHaach\17\2C\\c|\u00c2\u00d8\u00da\u00f8\u00fa\u0301\u0372"+
		"\u037f\u0381\u2001\u200e\u200f\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902"+
		"\ufdd1\ufdf2\uffff\u0421\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d"+
		"\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a5\3\2\2\2\2\u00a9\3\2\2"+
		"\2\2\u00ab\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5"+
		"\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00c3\3\2\2\2\3\u00c7\3\2\2"+
		"\2\5\u00ca\3\2\2\2\7\u00cf\3\2\2\2\t\u00d5\3\2\2\2\13\u00db\3\2\2\2\r"+
		"\u00de\3\2\2\2\17\u00e1\3\2\2\2\21\u00e3\3\2\2\2\23\u00e5\3\2\2\2\25\u00e7"+
		"\3\2\2\2\27\u0128\3\2\2\2\31\u012a\3\2\2\2\33\u0131\3\2\2\2\35\u0163\3"+
		"\2\2\2\37\u0169\3\2\2\2!\u016b\3\2\2\2#\u016e\3\2\2\2%\u0170\3\2\2\2\'"+
		"\u0177\3\2\2\2)\u018a\3\2\2\2+\u018c\3\2\2\2-\u019a\3\2\2\2/\u01a1\3\2"+
		"\2\2\61\u01a6\3\2\2\2\63\u01a8\3\2\2\2\65\u01aa\3\2\2\2\67\u01ac\3\2\2"+
		"\29\u01ae\3\2\2\2;\u01b4\3\2\2\2=\u01ba\3\2\2\2?\u01c4\3\2\2\2A\u01cb"+
		"\3\2\2\2C\u01ce\3\2\2\2E\u01d2\3\2\2\2G\u01d6\3\2\2\2I\u01dd\3\2\2\2K"+
		"\u01e3\3\2\2\2M\u01ec\3\2\2\2O\u01f5\3\2\2\2Q\u0204\3\2\2\2S\u020a\3\2"+
		"\2\2U\u0210\3\2\2\2W\u0214\3\2\2\2Y\u021a\3\2\2\2[\u0221\3\2\2\2]\u0227"+
		"\3\2\2\2_\u0230\3\2\2\2a\u023a\3\2\2\2c\u023f\3\2\2\2e\u0248\3\2\2\2g"+
		"\u0252\3\2\2\2i\u0258\3\2\2\2k\u025f\3\2\2\2m\u026a\3\2\2\2o\u0270\3\2"+
		"\2\2q\u0277\3\2\2\2s\u027a\3\2\2\2u\u0280\3\2\2\2w\u0288\3\2\2\2y\u028b"+
		"\3\2\2\2{\u028d\3\2\2\2}\u028f\3\2\2\2\177\u0293\3\2\2\2\u0081\u029a\3"+
		"\2\2\2\u0083\u029f\3\2\2\2\u0085\u02a1\3\2\2\2\u0087\u02a6\3\2\2\2\u0089"+
		"\u02ab\3\2\2\2\u008b\u02ae\3\2\2\2\u008d\u02b1\3\2\2\2\u008f\u02b4\3\2"+
		"\2\2\u0091\u02b7\3\2\2\2\u0093\u02ba\3\2\2\2\u0095\u02bd\3\2\2\2\u0097"+
		"\u02c1\3\2\2\2\u0099\u02c5\3\2\2\2\u009b\u02cd\3\2\2\2\u009d\u02d5\3\2"+
		"\2\2\u009f\u02f6\3\2\2\2\u00a1\u02f8\3\2\2\2\u00a3\u0310\3\2\2\2\u00a5"+
		"\u0332\3\2\2\2\u00a7\u0334\3\2\2\2\u00a9\u0344\3\2\2\2\u00ab\u0346\3\2"+
		"\2\2\u00ad\u0352\3\2\2\2\u00af\u0356\3\2\2\2\u00b1\u0362\3\2\2\2\u00b3"+
		"\u0370\3\2\2\2\u00b5\u0378\3\2\2\2\u00b7\u0386\3\2\2\2\u00b9\u0391\3\2"+
		"\2\2\u00bb\u039e\3\2\2\2\u00bd\u03a0\3\2\2\2\u00bf\u03a2\3\2\2\2\u00c1"+
		"\u03a4\3\2\2\2\u00c3\u03b6\3\2\2\2\u00c5\u03b8\3\2\2\2\u00c7\u00c8\7k"+
		"\2\2\u00c8\u00c9\7p\2\2\u00c9\4\3\2\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc"+
		"\7t\2\2\u00cc\u00cd\7w\2\2\u00cd\u00ce\7g\2\2\u00ce\6\3\2\2\2\u00cf\u00d0"+
		"\7h\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7u\2\2\u00d3"+
		"\u00d4\7g\2\2\u00d4\b\3\2\2\2\u00d5\u00d6\7W\2\2\u00d6\u00d7\7p\2\2\u00d7"+
		"\u00d8\7k\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7p\2\2\u00da\n\3\2\2\2\u00db"+
		"\u00dc\7~\2\2\u00dc\u00dd\7~\2\2\u00dd\f\3\2\2\2\u00de\u00df\7(\2\2\u00df"+
		"\u00e0\7(\2\2\u00e0\16\3\2\2\2\u00e1\u00e2\7/\2\2\u00e2\20\3\2\2\2\u00e3"+
		"\u00e4\7#\2\2\u00e4\22\3\2\2\2\u00e5\u00e6\7\u0080\2\2\u00e6\24\3\2\2"+
		"\2\u00e7\u00e8\7>\2\2\u00e8\u00e9\7<\2\2\u00e9\26\3\2\2\2\u00ea\u00eb"+
		"\7<\2\2\u00eb\u0129\7?\2\2\u00ec\u00ed\7-\2\2\u00ed\u0129\7?\2\2\u00ee"+
		"\u00ef\7/\2\2\u00ef\u0129\7?\2\2\u00f0\u00f1\7,\2\2\u00f1\u0129\7?\2\2"+
		"\u00f2\u00f3\7\61\2\2\u00f3\u0129\7?\2\2\u00f4\u00f5\7\61\2\2\u00f5\u00f6"+
		"\7\61\2\2\u00f6\u0129\7?\2\2\u00f7\u00f8\7\60\2\2\u00f8\u00f9\7\61\2\2"+
		"\u00f9\u00fa\7\61\2\2\u00fa\u0129\7?\2\2\u00fb\u00fc\7\60\2\2\u00fc\u00fd"+
		"\7,\2\2\u00fd\u0129\7?\2\2\u00fe\u00ff\7\60\2\2\u00ff\u0100\7\61\2\2\u0100"+
		"\u0129\7?\2\2\u0101\u0102\7^\2\2\u0102\u0129\7?\2\2\u0103\u0104\7\60\2"+
		"\2\u0104\u0105\7^\2\2\u0105\u0129\7?\2\2\u0106\u0107\7`\2\2\u0107\u0129"+
		"\7?\2\2\u0108\u0109\7\60\2\2\u0109\u010a\7`\2\2\u010a\u0129\7?\2\2\u010b"+
		"\u010c\7\'\2\2\u010c\u0129\7?\2\2\u010d\u010e\7\60\2\2\u010e\u010f\7\'"+
		"\2\2\u010f\u0129\7?\2\2\u0110\u0111\7~\2\2\u0111\u0129\7?\2\2\u0112\u0113"+
		"\7(\2\2\u0113\u0129\7?\2\2\u0114\u0115\7&\2\2\u0115\u0129\7?\2\2\u0116"+
		"\u0117\7?\2\2\u0117\u0129\7@\2\2\u0118\u0119\7>\2\2\u0119\u011a\7>\2\2"+
		"\u011a\u0129\7?\2\2\u011b\u011c\7@\2\2\u011c\u011d\7@\2\2\u011d\u0129"+
		"\7?\2\2\u011e\u011f\7@\2\2\u011f\u0120\7@\2\2\u0120\u0121\7@\2\2\u0121"+
		"\u0129\7?\2\2\u0122\u0123\7\60\2\2\u0123\u0124\7-\2\2\u0124\u0129\7?\2"+
		"\2\u0125\u0126\7\60\2\2\u0126\u0127\7/\2\2\u0127\u0129\7?\2\2\u0128\u00ea"+
		"\3\2\2\2\u0128\u00ec\3\2\2\2\u0128\u00ee\3\2\2\2\u0128\u00f0\3\2\2\2\u0128"+
		"\u00f2\3\2\2\2\u0128\u00f4\3\2\2\2\u0128\u00f7\3\2\2\2\u0128\u00fb\3\2"+
		"\2\2\u0128\u00fe\3\2\2\2\u0128\u0101\3\2\2\2\u0128\u0103\3\2\2\2\u0128"+
		"\u0106\3\2\2\2\u0128\u0108\3\2\2\2\u0128\u010b\3\2\2\2\u0128\u010d\3\2"+
		"\2\2\u0128\u0110\3\2\2\2\u0128\u0112\3\2\2\2\u0128\u0114\3\2\2\2\u0128"+
		"\u0116\3\2\2\2\u0128\u0118\3\2\2\2\u0128\u011b\3\2\2\2\u0128\u011e\3\2"+
		"\2\2\u0128\u0122\3\2\2\2\u0128\u0125\3\2\2\2\u0129\30\3\2\2\2\u012a\u012b"+
		"\7A\2\2\u012b\32\3\2\2\2\u012c\u012d\7/\2\2\u012d\u0132\7/\2\2\u012e\u012f"+
		"\7/\2\2\u012f\u0130\7/\2\2\u0130\u0132\7@\2\2\u0131\u012c\3\2\2\2\u0131"+
		"\u012e\3\2\2\2\u0132\34\3\2\2\2\u0133\u0134\7@\2\2\u0134\u0164\7<\2\2"+
		"\u0135\u0164\t\2\2\2\u0136\u0137\7@\2\2\u0137\u0164\7?\2\2\u0138\u0164"+
		"\7\u2267\2\2\u0139\u013a\7>\2\2\u013a\u0164\7?\2\2\u013b\u0164\7\u2266"+
		"\2\2\u013c\u013d\7?\2\2\u013d\u0164\7?\2\2\u013e\u013f\7?\2\2\u013f\u0140"+
		"\7?\2\2\u0140\u0164\7?\2\2\u0141\u0164\7\u2263\2\2\u0142\u0143\7#\2\2"+
		"\u0143\u0164\7?\2\2\u0144\u0164\7\u2262\2\2\u0145\u0146\7#\2\2\u0146\u0147"+
		"\7?\2\2\u0147\u0164\7?\2\2\u0148\u0164\7\u2264\2\2\u0149\u014a\7\60\2"+
		"\2\u014a\u0164\7@\2\2\u014b\u014c\7\60\2\2\u014c\u0164\7>\2\2\u014d\u014e"+
		"\7\60\2\2\u014e\u014f\7@\2\2\u014f\u0164\7?\2\2\u0150\u0151\7\60\2\2\u0151"+
		"\u0164\7\u2267\2\2\u0152\u0153\7\60\2\2\u0153\u0154\7>\2\2\u0154\u0164"+
		"\7?\2\2\u0155\u0156\7\60\2\2\u0156\u0164\7\u2266\2\2\u0157\u0158\7\60"+
		"\2\2\u0158\u0159\7?\2\2\u0159\u0164\7?\2\2\u015a\u015b\7\60\2\2\u015b"+
		"\u015c\7#\2\2\u015c\u0164\7?\2\2\u015d\u015e\7\60\2\2\u015e\u0164\7\u2262"+
		"\2\2\u015f\u0160\7\60\2\2\u0160\u0164\7?\2\2\u0161\u0162\7\60\2\2\u0162"+
		"\u0164\7#\2\2\u0163\u0133\3\2\2\2\u0163\u0135\3\2\2\2\u0163\u0136\3\2"+
		"\2\2\u0163\u0138\3\2\2\2\u0163\u0139\3\2\2\2\u0163\u013b\3\2\2\2\u0163"+
		"\u013c\3\2\2\2\u0163\u013e\3\2\2\2\u0163\u0141\3\2\2\2\u0163\u0142\3\2"+
		"\2\2\u0163\u0144\3\2\2\2\u0163\u0145\3\2\2\2\u0163\u0148\3\2\2\2\u0163"+
		"\u0149\3\2\2\2\u0163\u014b\3\2\2\2\u0163\u014d\3\2\2\2\u0163\u0150\3\2"+
		"\2\2\u0163\u0152\3\2\2\2\u0163\u0155\3\2\2\2\u0163\u0157\3\2\2\2\u0163"+
		"\u015a\3\2\2\2\u0163\u015d\3\2\2\2\u0163\u015f\3\2\2\2\u0163\u0161\3\2"+
		"\2\2\u0164\36\3\2\2\2\u0165\u0166\7~\2\2\u0166\u016a\7@\2\2\u0167\u0168"+
		"\7>\2\2\u0168\u016a\7~\2\2\u0169\u0165\3\2\2\2\u0169\u0167\3\2\2\2\u016a"+
		" \3\2\2\2\u016b\u016c\7<\2\2\u016c\u016d\7<\2\2\u016d\"\3\2\2\2\u016e"+
		"\u016f\7<\2\2\u016f$\3\2\2\2\u0170\u0171\7-\2\2\u0171&\3\2\2\2\u0172\u0173"+
		"\7\60\2\2\u0173\u0178\7-\2\2\u0174\u0175\7\60\2\2\u0175\u0178\7/\2\2\u0176"+
		"\u0178\t\3\2\2\u0177\u0172\3\2\2\2\u0177\u0174\3\2\2\2\u0177\u0176\3\2"+
		"\2\2\u0178(\3\2\2\2\u0179\u017a\7>\2\2\u017a\u018b\7>\2\2\u017b\u017c"+
		"\7@\2\2\u017c\u018b\7@\2\2\u017d\u017e\7@\2\2\u017e\u017f\7@\2\2\u017f"+
		"\u018b\7@\2\2\u0180\u0181\7\60\2\2\u0181\u0182\7>\2\2\u0182\u018b\7>\2"+
		"\2\u0183\u0184\7\60\2\2\u0184\u0185\7@\2\2\u0185\u018b\7@\2\2\u0186\u0187"+
		"\7\60\2\2\u0187\u0188\7@\2\2\u0188\u0189\7@\2\2\u0189\u018b\7@\2\2\u018a"+
		"\u0179\3\2\2\2\u018a\u017b\3\2\2\2\u018a\u017d\3\2\2\2\u018a\u0180\3\2"+
		"\2\2\u018a\u0183\3\2\2\2\u018a\u0186\3\2\2\2\u018b*\3\2\2\2\u018c\u018d"+
		"\7,\2\2\u018d,\3\2\2\2\u018e\u019b\7\61\2\2\u018f\u0190\7\60\2\2\u0190"+
		"\u019b\7\61\2\2\u0191\u019b\t\4\2\2\u0192\u0193\7\60\2\2\u0193\u019b\7"+
		"\'\2\2\u0194\u0195\7\60\2\2\u0195\u019b\7,\2\2\u0196\u019b\7^\2\2\u0197"+
		"\u0198\7\60\2\2\u0198\u019b\7^\2\2\u0199\u019b\7(\2\2\u019a\u018e\3\2"+
		"\2\2\u019a\u018f\3\2\2\2\u019a\u0191\3\2\2\2\u019a\u0192\3\2\2\2\u019a"+
		"\u0194\3\2\2\2\u019a\u0196\3\2\2\2\u019a\u0197\3\2\2\2\u019a\u0199\3\2"+
		"\2\2\u019b.\3\2\2\2\u019c\u019d\7\61\2\2\u019d\u01a2\7\61\2\2\u019e\u019f"+
		"\7\60\2\2\u019f\u01a0\7\61\2\2\u01a0\u01a2\7\61\2\2\u01a1\u019c\3\2\2"+
		"\2\u01a1\u019e\3\2\2\2\u01a2\60\3\2\2\2\u01a3\u01a7\7`\2\2\u01a4\u01a5"+
		"\7\60\2\2\u01a5\u01a7\7`\2\2\u01a6\u01a3\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7"+
		"\62\3\2\2\2\u01a8\u01a9\7?\2\2\u01a9\64\3\2\2\2\u01aa\u01ab\7&\2\2\u01ab"+
		"\66\3\2\2\2\u01ac\u01ad\7\60\2\2\u01ad8\3\2\2\2\u01ae\u01af\7d\2\2\u01af"+
		"\u01b0\7g\2\2\u01b0\u01b1\7i\2\2\u01b1\u01b2\7k\2\2\u01b2\u01b3\7p\2\2"+
		"\u01b3:\3\2\2\2\u01b4\u01b5\7y\2\2\u01b5\u01b6\7j\2\2\u01b6\u01b7\7k\2"+
		"\2\u01b7\u01b8\7n\2\2\u01b8\u01b9\7g\2\2\u01b9<\3\2\2\2\u01ba\u01bb\7"+
		"k\2\2\u01bb\u01bc\7o\2\2\u01bc\u01bd\7r\2\2\u01bd\u01be\7q\2\2\u01be\u01bf"+
		"\7t\2\2\u01bf\u01c0\7v\2\2\u01c0\u01c1\7c\2\2\u01c1\u01c2\7n\2\2\u01c2"+
		"\u01c3\7n\2\2\u01c3>\3\2\2\2\u01c4\u01c5\7k\2\2\u01c5\u01c6\7o\2\2\u01c6"+
		"\u01c7\7r\2\2\u01c7\u01c8\7q\2\2\u01c8\u01c9\7t\2\2\u01c9\u01ca\7v\2\2"+
		"\u01ca@\3\2\2\2\u01cb\u01cc\7k\2\2\u01cc\u01cd\7h\2\2\u01cdB\3\2\2\2\u01ce"+
		"\u01cf\7h\2\2\u01cf\u01d0\7q\2\2\u01d0\u01d1\7t\2\2\u01d1D\3\2\2\2\u01d2"+
		"\u01d3\7v\2\2\u01d3\u01d4\7t\2\2\u01d4\u01d5\7{\2\2\u01d5F\3\2\2\2\u01d6"+
		"\u01d7\7t\2\2\u01d7\u01d8\7g\2\2\u01d8\u01d9\7v\2\2\u01d9\u01da\7w\2\2"+
		"\u01da\u01db\7t\2\2\u01db\u01dc\7p\2\2\u01dcH\3\2\2\2\u01dd\u01de\7d\2"+
		"\2\u01de\u01df\7t\2\2\u01df\u01e0\7g\2\2\u01e0\u01e1\7c\2\2\u01e1\u01e2"+
		"\7m\2\2\u01e2J\3\2\2\2\u01e3\u01e4\7e\2\2\u01e4\u01e5\7q\2\2\u01e5\u01e6"+
		"\7p\2\2\u01e6\u01e7\7v\2\2\u01e7\u01e8\7k\2\2\u01e8\u01e9\7p\2\2\u01e9"+
		"\u01ea\7w\2\2\u01ea\u01eb\7g\2\2\u01ebL\3\2\2\2\u01ec\u01ed\7h\2\2\u01ed"+
		"\u01ee\7w\2\2\u01ee\u01ef\7p\2\2\u01ef\u01f0\7e\2\2\u01f0\u01f1\7v\2\2"+
		"\u01f1\u01f2\7k\2\2\u01f2\u01f3\7q\2\2\u01f3\u01f4\7p\2\2\u01f4N\3\2\2"+
		"\2\u01f5\u01f6\7u\2\2\u01f6\u01f7\7v\2\2\u01f7\u01f8\7c\2\2\u01f8\u01f9"+
		"\7i\2\2\u01f9\u01fa\7g\2\2\u01fa\u01fb\7f\2\2\u01fb\u01fc\7h\2\2\u01fc"+
		"\u01fd\7w\2\2\u01fd\u01fe\7p\2\2\u01fe\u01ff\7e\2\2\u01ff\u0200\7v\2\2"+
		"\u0200\u0201\7k\2\2\u0201\u0202\7q\2\2\u0202\u0203\7p\2\2\u0203P\3\2\2"+
		"\2\u0204\u0205\7o\2\2\u0205\u0206\7c\2\2\u0206\u0207\7e\2\2\u0207\u0208"+
		"\7t\2\2\u0208\u0209\7q\2\2\u0209R\3\2\2\2\u020a\u020b\7s\2\2\u020b\u020c"+
		"\7w\2\2\u020c\u020d\7q\2\2\u020d\u020e\7v\2\2\u020e\u020f\7g\2\2\u020f"+
		"T\3\2\2\2\u0210\u0211\7n\2\2\u0211\u0212\7g\2\2\u0212\u0213\7v\2\2\u0213"+
		"V\3\2\2\2\u0214\u0215\7n\2\2\u0215\u0216\7q\2\2\u0216\u0217\7e\2\2\u0217"+
		"\u0218\7c\2\2\u0218\u0219\7n\2\2\u0219X\3\2\2\2\u021a\u021b\7i\2\2\u021b"+
		"\u021c\7n\2\2\u021c\u021d\7q\2\2\u021d\u021e\7d\2\2\u021e\u021f\7c\2\2"+
		"\u021f\u0220\7n\2\2\u0220Z\3\2\2\2\u0221\u0222\7e\2\2\u0222\u0223\7q\2"+
		"\2\u0223\u0224\7p\2\2\u0224\u0225\7u\2\2\u0225\u0226\7v\2\2\u0226\\\3"+
		"\2\2\2\u0227\u0228\7c\2\2\u0228\u0229\7d\2\2\u0229\u022a\7u\2\2\u022a"+
		"\u022b\7v\2\2\u022b\u022c\7t\2\2\u022c\u022d\7c\2\2\u022d\u022e\7e\2\2"+
		"\u022e\u022f\7v\2\2\u022f^\3\2\2\2\u0230\u0231\7v\2\2\u0231\u0232\7{\2"+
		"\2\u0232\u0233\7r\2\2\u0233\u0234\7g\2\2\u0234\u0235\7c\2\2\u0235\u0236"+
		"\7n\2\2\u0236\u0237\7k\2\2\u0237\u0238\7c\2\2\u0238\u0239\7u\2\2\u0239"+
		"`\3\2\2\2\u023a\u023b\7v\2\2\u023b\u023c\7{\2\2\u023c\u023d\7r\2\2\u023d"+
		"\u023e\7g\2\2\u023eb\3\2\2\2\u023f\u0240\7d\2\2\u0240\u0241\7k\2\2\u0241"+
		"\u0242\7v\2\2\u0242\u0243\7u\2\2\u0243\u0244\7v\2\2\u0244\u0245\7{\2\2"+
		"\u0245\u0246\7r\2\2\u0246\u0247\7g\2\2\u0247d\3\2\2\2\u0248\u0249\7k\2"+
		"\2\u0249\u024a\7o\2\2\u024a\u024b\7o\2\2\u024b\u024c\7w\2\2\u024c\u024d"+
		"\7v\2\2\u024d\u024e\7c\2\2\u024e\u024f\7d\2\2\u024f\u0250\7n\2\2\u0250"+
		"\u0251\7g\2\2\u0251f\3\2\2\2\u0252\u0253\7e\2\2\u0253\u0254\7e\2\2\u0254"+
		"\u0255\7c\2\2\u0255\u0256\7n\2\2\u0256\u0257\7n\2\2\u0257h\3\2\2\2\u0258"+
		"\u0259\7o\2\2\u0259\u025a\7q\2\2\u025a\u025b\7f\2\2\u025b\u025c\7w\2\2"+
		"\u025c\u025d\7n\2\2\u025d\u025e\7g\2\2\u025ej\3\2\2\2\u025f\u0260\7d\2"+
		"\2\u0260\u0261\7c\2\2\u0261\u0262\7t\2\2\u0262\u0263\7g\2\2\u0263\u0264"+
		"\7o\2\2\u0264\u0265\7q\2\2\u0265\u0266\7f\2\2\u0266\u0267\7w\2\2\u0267"+
		"\u0268\7n\2\2\u0268\u0269\7g\2\2\u0269l\3\2\2\2\u026a\u026b\7w\2\2\u026b"+
		"\u026c\7u\2\2\u026c\u026d\7k\2\2\u026d\u026e\7p\2\2\u026e\u026f\7i\2\2"+
		"\u026fn\3\2\2\2\u0270\u0271\7g\2\2\u0271\u0272\7z\2\2\u0272\u0273\7r\2"+
		"\2\u0273\u0274\7q\2\2\u0274\u0275\7t\2\2\u0275\u0276\7v\2\2\u0276p\3\2"+
		"\2\2\u0277\u0278\7f\2\2\u0278\u0279\7q\2\2\u0279r\3\2\2\2\u027a\u027b"+
		"\7e\2\2\u027b\u027c\7c\2\2\u027c\u027d\7v\2\2\u027d\u027e\7e\2\2\u027e"+
		"\u027f\7j\2\2\u027ft\3\2\2\2\u0280\u0281\7h\2\2\u0281\u0282\7k\2\2\u0282"+
		"\u0283\7p\2\2\u0283\u0284\7c\2\2\u0284\u0285\7n\2\2\u0285\u0286\7n\2\2"+
		"\u0286\u0287\7{\2\2\u0287v\3\2\2\2\u0288\u0289\7/\2\2\u0289\u028a\7@\2"+
		"\2\u028ax\3\2\2\2\u028b\u028c\7B\2\2\u028cz\3\2\2\2\u028d\u028e\7=\2\2"+
		"\u028e|\3\2\2\2\u028f\u0290\7\60\2\2\u0290\u0291\7\60\2\2\u0291\u0292"+
		"\7\60\2\2\u0292~\3\2\2\2\u0293\u0294\7g\2\2\u0294\u0295\7n\2\2\u0295\u0296"+
		"\7u\2\2\u0296\u0297\7g\2\2\u0297\u0298\7k\2\2\u0298\u0299\7h\2\2\u0299"+
		"\u0080\3\2\2\2\u029a\u029b\7g\2\2\u029b\u029c\7n\2\2\u029c\u029d\7u\2"+
		"\2\u029d\u029e\7g\2\2\u029e\u0082\3\2\2\2\u029f\u02a0\7.\2\2\u02a0\u0084"+
		"\3\2\2\2\u02a1\u02a2\6C\2\2\u02a2\u02a3\7g\2\2\u02a3\u02a4\7p\2\2\u02a4"+
		"\u02a5\7f\2\2\u02a5\u0086\3\2\2\2\u02a6\u02a7\6D\3\2\u02a7\u02a8\7g\2"+
		"\2\u02a8\u02a9\7p\2\2\u02a9\u02aa\7f\2\2\u02aa\u0088\3\2\2\2\u02ab\u02ac"+
		"\7*\2\2\u02ac\u02ad\bE\2\2\u02ad\u008a\3\2\2\2\u02ae\u02af\7+\2\2\u02af"+
		"\u02b0\bF\3\2\u02b0\u008c\3\2\2\2\u02b1\u02b2\7}\2\2\u02b2\u02b3\bG\4"+
		"\2\u02b3\u008e\3\2\2\2\u02b4\u02b5\7\177\2\2\u02b5\u02b6\bH\5\2\u02b6"+
		"\u0090\3\2\2\2\u02b7\u02b8\7]\2\2\u02b8\u02b9\bI\6\2\u02b9\u0092\3\2\2"+
		"\2\u02ba\u02bb\7_\2\2\u02bb\u02bc\bJ\7\2\u02bc\u0094\3\2\2\2\u02bd\u02be"+
		"\7t\2\2\u02be\u02bf\5\u00abV\2\u02bf\u0096\3\2\2\2\u02c0\u02c2\5\u00bb"+
		"^\2\u02c1\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3"+
		"\u02c4\3\2\2\2\u02c4\u0098\3\2\2\2\u02c5\u02c6\7\62\2\2\u02c6\u02c7\7"+
		"d\2\2\u02c7\u02c9\3\2\2\2\u02c8\u02ca\5\u00bd_\2\u02c9\u02c8\3\2\2\2\u02ca"+
		"\u02cb\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u009a\3\2"+
		"\2\2\u02cd\u02ce\7\62\2\2\u02ce\u02cf\7q\2\2\u02cf\u02d1\3\2\2\2\u02d0"+
		"\u02d2\5\u00bf`\2\u02d1\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d1"+
		"\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u009c\3\2\2\2\u02d5\u02d6\7\62\2\2"+
		"\u02d6\u02d7\7z\2\2\u02d7\u02d9\3\2\2\2\u02d8\u02da\5\u00c1a\2\u02d9\u02d8"+
		"\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc"+
		"\u009e\3\2\2\2\u02dd\u02df\5\u00bb^\2\u02de\u02dd\3\2\2\2\u02df\u02e0"+
		"\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2"+
		"\u02e6\t\5\2\2\u02e3\u02e5\5\u00bb^\2\u02e4\u02e3\3\2\2\2\u02e5\u02e8"+
		"\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02ea\3\2\2\2\u02e8"+
		"\u02e6\3\2\2\2\u02e9\u02eb\5\u00a3R\2\u02ea\u02e9\3\2\2\2\u02ea\u02eb"+
		"\3\2\2\2\u02eb\u02f7\3\2\2\2\u02ec\u02f0\7\60\2\2\u02ed\u02ef\5\u00bb"+
		"^\2\u02ee\u02ed\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0"+
		"\u02f1\3\2\2\2\u02f1\u02f4\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f3\u02f5\5\u00a3"+
		"R\2\u02f4\u02f3\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f7\3\2\2\2\u02f6"+
		"\u02de\3\2\2\2\u02f6\u02ec\3\2\2\2\u02f7\u00a0\3\2\2\2\u02f8\u02f9\7\62"+
		"\2\2\u02f9\u02fa\7z\2\2\u02fa\u02fc\3\2\2\2\u02fb\u02fd\5\u00c1a\2\u02fc"+
		"\u02fb\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u0305\3\2\2\2\u02fe\u0302\7\60"+
		"\2\2\u02ff\u0301\5\u00c1a\2\u0300\u02ff\3\2\2\2\u0301\u0304\3\2\2\2\u0302"+
		"\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0306\3\2\2\2\u0304\u0302\3\2"+
		"\2\2\u0305\u02fe\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0307\3\2\2\2\u0307"+
		"\u0309\t\6\2\2\u0308\u030a\t\7\2\2\u0309\u0308\3\2\2\2\u0309\u030a\3\2"+
		"\2\2\u030a\u030c\3\2\2\2\u030b\u030d\5\u00bb^\2\u030c\u030b\3\2\2\2\u030d"+
		"\u030e\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u00a2\3\2"+
		"\2\2\u0310\u0312\t\b\2\2\u0311\u0313\t\7\2\2\u0312\u0311\3\2\2\2\u0312"+
		"\u0313\3\2\2\2\u0313\u0315\3\2\2\2\u0314\u0316\5\u00bb^\2\u0315\u0314"+
		"\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318"+
		"\u00a4\3\2\2\2\u0319\u031b\5\u00bb^\2\u031a\u0319\3\2\2\2\u031b\u031c"+
		"\3\2\2\2\u031c\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031e\3\2\2\2\u031e"+
		"\u0322\t\5\2\2\u031f\u0321\5\u00bb^\2\u0320\u031f\3\2\2\2\u0321\u0324"+
		"\3\2\2\2\u0322\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0326\3\2\2\2\u0324"+
		"\u0322\3\2\2\2\u0325\u0327\5\u00a7T\2\u0326\u0325\3\2\2\2\u0326\u0327"+
		"\3\2\2\2\u0327\u0333\3\2\2\2\u0328\u032c\7\60\2\2\u0329\u032b\5\u00bb"+
		"^\2\u032a\u0329\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032a\3\2\2\2\u032c"+
		"\u032d\3\2\2\2\u032d\u0330\3\2\2\2\u032e\u032c\3\2\2\2\u032f\u0331\5\u00a7"+
		"T\2\u0330\u032f\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0333\3\2\2\2\u0332"+
		"\u031a\3\2\2\2\u0332\u0328\3\2\2\2\u0333\u00a6\3\2\2\2\u0334\u0336\t\t"+
		"\2\2\u0335\u0337\t\7\2\2\u0336\u0335\3\2\2\2\u0336\u0337\3\2\2\2\u0337"+
		"\u0339\3\2\2\2\u0338\u033a\5\u00bb^\2\u0339\u0338\3\2\2\2\u033a\u033b"+
		"\3\2\2\2\u033b\u0339\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u00a8\3\2\2\2\u033d"+
		"\u033e\7)\2\2\u033e\u033f\n\n\2\2\u033f\u0345\7)\2\2\u0340\u0341\7)\2"+
		"\2\u0341\u0342\7^\2\2\u0342\u0343\13\2\2\2\u0343\u0345\7)\2\2\u0344\u033d"+
		"\3\2\2\2\u0344\u0340\3\2\2\2\u0345\u00aa\3\2\2\2\u0346\u034c\7$\2\2\u0347"+
		"\u0348\7^\2\2\u0348\u034b\7$\2\2\u0349\u034b\n\13\2\2\u034a\u0347\3\2"+
		"\2\2\u034a\u0349\3\2\2\2\u034b\u034e\3\2\2\2\u034c\u034a\3\2\2\2\u034c"+
		"\u034d\3\2\2\2\u034d\u034f\3\2\2\2\u034e\u034c\3\2\2\2\u034f\u0350\7$"+
		"\2\2\u0350\u00ac\3\2\2\2\u0351\u0353\t\f\2\2\u0352\u0351\3\2\2\2\u0353"+
		"\u0354\3\2\2\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u00ae\3\2"+
		"\2\2\u0356\u0357\5\u00adW\2\u0357\u0358\3\2\2\2\u0358\u0359\bX\b\2\u0359"+
		"\u00b0\3\2\2\2\u035a\u035c\7\17\2\2\u035b\u035a\3\2\2\2\u035b\u035c\3"+
		"\2\2\2\u035c\u035d\3\2\2\2\u035d\u035e\7\f\2\2\u035e\u0360\3\2\2\2\u035f"+
		"\u0361\5\u00adW\2\u0360\u035f\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0363"+
		"\3\2\2\2\u0362\u035b\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0362\3\2\2\2\u0364"+
		"\u0365\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0367\6Y\4\2\u0367\u00b2\3\2"+
		"\2\2\u0368\u036a\7\17\2\2\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a"+
		"\u036b\3\2\2\2\u036b\u036c\7\f\2\2\u036c\u036e\3\2\2\2\u036d\u036f\5\u00ad"+
		"W\2\u036e\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0371\3\2\2\2\u0370"+
		"\u0369\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0370\3\2\2\2\u0372\u0373\3\2"+
		"\2\2\u0373\u0374\3\2\2\2\u0374\u0375\6Z\5\2\u0375\u0376\3\2\2\2\u0376"+
		"\u0377\bZ\b\2\u0377\u00b4\3\2\2\2\u0378\u0379\7%\2\2\u0379\u037a\7?\2"+
		"\2\u037a\u037e\3\2\2\2\u037b\u037d\13\2\2\2\u037c\u037b\3\2\2\2\u037d"+
		"\u0380\3\2\2\2\u037e\u037f\3\2\2\2\u037e\u037c\3\2\2\2\u037f\u0381\3\2"+
		"\2\2\u0380\u037e\3\2\2\2\u0381\u0382\7?\2\2\u0382\u0383\7%\2\2\u0383\u0384"+
		"\3\2\2\2\u0384\u0385\b[\b\2\u0385\u00b6\3\2\2\2\u0386\u038a\7%\2\2\u0387"+
		"\u0389\n\r\2\2\u0388\u0387\3\2\2\2\u0389\u038c\3\2\2\2\u038a\u0388\3\2"+
		"\2\2\u038a\u038b\3\2\2\2\u038b\u038d\3\2\2\2\u038c\u038a\3\2\2\2\u038d"+
		"\u038e\b\\\b\2\u038e\u00b8\3\2\2\2\u038f\u0392\7a\2\2\u0390\u0392\5\u00c5"+
		"c\2\u0391\u038f\3\2\2\2\u0391\u0390\3\2\2\2\u0392\u0398\3\2\2\2\u0393"+
		"\u0397\7a\2\2\u0394\u0397\5\u00c5c\2\u0395\u0397\5\u00bb^\2\u0396\u0393"+
		"\3\2\2\2\u0396\u0394\3\2\2\2\u0396\u0395\3\2\2\2\u0397\u039a\3\2\2\2\u0398"+
		"\u0396\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039c\3\2\2\2\u039a\u0398\3\2"+
		"\2\2\u039b\u039d\7#\2\2\u039c\u039b\3\2\2\2\u039c\u039d\3\2\2\2\u039d"+
		"\u00ba\3\2\2\2\u039e\u039f\t\16\2\2\u039f\u00bc\3\2\2\2\u03a0\u03a1\t"+
		"\17\2\2\u03a1\u00be\3\2\2\2\u03a2\u03a3\t\20\2\2\u03a3\u00c0\3\2\2\2\u03a4"+
		"\u03a5\t\21\2\2\u03a5\u00c2\3\2\2\2\u03a6\u03b7\7:\2\2\u03a7\u03a8\7\63"+
		"\2\2\u03a8\u03b7\78\2\2\u03a9\u03aa\7\65\2\2\u03aa\u03b7\7\64\2\2\u03ab"+
		"\u03ac\78\2\2\u03ac\u03b7\7\66\2\2\u03ad\u03ae\7\63\2\2\u03ae\u03af\7"+
		"\64\2\2\u03af\u03b7\7:\2\2\u03b0\u03b1\7\64\2\2\u03b1\u03b2\7\67\2\2\u03b2"+
		"\u03b7\78\2\2\u03b3\u03b4\7\67\2\2\u03b4\u03b5\7\63\2\2\u03b5\u03b7\7"+
		"\64\2\2\u03b6\u03a6\3\2\2\2\u03b6\u03a7\3\2\2\2\u03b6\u03a9\3\2\2\2\u03b6"+
		"\u03ab\3\2\2\2\u03b6\u03ad\3\2\2\2\u03b6\u03b0\3\2\2\2\u03b6\u03b3\3\2"+
		"\2\2\u03b7\u00c4\3\2\2\2\u03b8\u03b9\t\22\2\2\u03b9\u00c6\3\2\2\2\66\2"+
		"\u0128\u0131\u0163\u0169\u0177\u018a\u019a\u01a1\u01a6\u02c3\u02cb\u02d3"+
		"\u02db\u02e0\u02e6\u02ea\u02f0\u02f4\u02f6\u02fc\u0302\u0305\u0309\u030e"+
		"\u0312\u0317\u031c\u0322\u0326\u032c\u0330\u0332\u0336\u033b\u0344\u034a"+
		"\u034c\u0354\u035b\u0360\u0364\u0369\u036e\u0372\u037e\u038a\u0391\u0396"+
		"\u0398\u039c\u03b6\t\3E\2\3F\3\3G\4\3H\5\3I\6\3J\7\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}