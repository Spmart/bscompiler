// Generated from /Users/spmart/IdeaProjects/bscompiler/src/main/java/grammars/gram.g4 by ANTLR 4.7.2
package grammars;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN_PROGRAM=1, END_PROGRAM=2, BEGIN=3, END=4, ASSIGMENT=5, UNARY_OPERATION=6, 
		TRUE=7, FALSE=8, READLN=9, WRITELN=10, WHILE=11, FOR=12, TO=13, STEP=14, 
		NEXT=15, IF=16, ELSE=17, VAR=18, RIGHT_PARANTHESIS=19, LEFT_PARANTHESIS=20, 
		IDENTIFIER=21, LETTER=22, COMMA=23, SEMICOLON=24, DOT=25, COLON=26, TYPE=27, 
		INT=28, REAL=29, BOOL=30, OPERAND_REL=31, NE=32, EQ=33, LT=34, LE=35, 
		GT=36, GE=37, OPERATION_ADD=38, PLUS=39, MIN=40, OR=41, OPERATION_MULT=42, 
		MULT=43, DIV=44, AND=45, DIGIT=46, INTEGER=47, BIN=48, OCT=49, DEC=50, 
		DEC_LETTER=51, HEX=52, FLOAT=53, ORDER=54, WS=55, NEW_LINE=56, RETURN=57, 
		TAB=58, SPACE=59, COMMENT=60;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BEGIN_PROGRAM", "END_PROGRAM", "BEGIN", "END", "ASSIGMENT", "UNARY_OPERATION", 
			"TRUE", "FALSE", "READLN", "WRITELN", "WHILE", "FOR", "TO", "STEP", "NEXT", 
			"IF", "ELSE", "VAR", "RIGHT_PARANTHESIS", "LEFT_PARANTHESIS", "IDENTIFIER", 
			"LETTER", "COMMA", "SEMICOLON", "DOT", "COLON", "TYPE", "INT", "REAL", 
			"BOOL", "OPERAND_REL", "NE", "EQ", "LT", "LE", "GT", "GE", "OPERATION_ADD", 
			"PLUS", "MIN", "OR", "OPERATION_MULT", "MULT", "DIV", "AND", "DIGIT", 
			"INTEGER", "BIN", "BIN_DIGIT", "BIN_LETTER", "OCT", "OCT_DIGIT", "OCT_LETTER", 
			"DEC", "DEC_LETTER", "HEX", "FLOAT", "ORDER", "HEX_DIGIT", "HEX_LETTER", 
			"HEX_IDT", "WS", "NEW_LINE", "RETURN", "TAB", "SPACE", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'end.'", "'begin'", "'end'", "':='", "'!'", "'true'", 
			"'false'", "'readln'", "'writeln'", "'while'", "'for'", "'to'", "'step'", 
			"'next'", "'if'", "'else'", "'var'", "')'", "'('", null, null, "','", 
			"';'", "'.'", "':'", null, "'integer'", "'real'", "'boolean'", null, 
			"'!='", "'=='", "'<'", "'<='", "'>'", "'>='", null, "'+'", "'-'", "'|'", 
			null, "'*'", "'/'", "'&&'", null, null, null, null, null, null, null, 
			null, null, null, "'\n'", "'\r'", "'\t'", "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BEGIN_PROGRAM", "END_PROGRAM", "BEGIN", "END", "ASSIGMENT", "UNARY_OPERATION", 
			"TRUE", "FALSE", "READLN", "WRITELN", "WHILE", "FOR", "TO", "STEP", "NEXT", 
			"IF", "ELSE", "VAR", "RIGHT_PARANTHESIS", "LEFT_PARANTHESIS", "IDENTIFIER", 
			"LETTER", "COMMA", "SEMICOLON", "DOT", "COLON", "TYPE", "INT", "REAL", 
			"BOOL", "OPERAND_REL", "NE", "EQ", "LT", "LE", "GT", "GE", "OPERATION_ADD", 
			"PLUS", "MIN", "OR", "OPERATION_MULT", "MULT", "DIV", "AND", "DIGIT", 
			"INTEGER", "BIN", "OCT", "DEC", "DEC_LETTER", "HEX", "FLOAT", "ORDER", 
			"WS", "NEW_LINE", "RETURN", "TAB", "SPACE", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public gramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u01c9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\7\26\u00ea\n\26\f\26\16"+
		"\26\u00ed\13\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\34\5\34\u00fc\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \5 \u0119\n \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&"+
		"\3&\3\'\3\'\3\'\5\'\u012e\n\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\5+\u0139\n+\3"+
		",\3,\3-\3-\3.\3.\3.\3/\3/\5/\u0144\n/\3\60\3\60\3\60\3\60\5\60\u014a\n"+
		"\60\3\61\6\61\u014d\n\61\r\61\16\61\u014e\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\64\6\64\u0158\n\64\r\64\16\64\u0159\3\64\3\64\3\65\3\65\3\66\3\66\3"+
		"\67\6\67\u0163\n\67\r\67\16\67\u0164\3\67\7\67\u0168\n\67\f\67\16\67\u016b"+
		"\13\67\38\38\39\69\u0170\n9\r9\169\u0171\39\79\u0175\n9\f9\169\u0178\13"+
		"9\39\39\3:\6:\u017d\n:\r:\16:\u017e\3:\3:\3:\7:\u0184\n:\f:\16:\u0187"+
		"\13:\3:\3:\3:\6:\u018c\n:\r:\16:\u018d\3:\7:\u0191\n:\f:\16:\u0194\13"+
		":\3;\3;\3;\7;\u0199\n;\f;\16;\u019c\13;\3;\5;\u019f\n;\3<\3<\3=\3=\3>"+
		"\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3D"+
		"\3D\3D\3D\7D\u01c0\nD\fD\16D\u01c3\13D\3D\3D\3D\3D\3D\3\u01c1\2E\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\2e\2g\63i\2k\2m\64o\65q\66"+
		"s\67u8w\2y\2{\2}9\177:\u0081;\u0083<\u0085=\u0087>\3\2\t\4\2C\\c|\4\2"+
		"DDdd\4\2QQqq\4\2FFff\4\2--//\4\2CHch\4\2JJjj\2\u01df\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2g\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\3\u0089\3\2\2\2\5\u0091\3\2\2\2\7\u0096\3\2\2\2\t\u009c\3\2\2\2\13"+
		"\u00a0\3\2\2\2\r\u00a3\3\2\2\2\17\u00a5\3\2\2\2\21\u00aa\3\2\2\2\23\u00b0"+
		"\3\2\2\2\25\u00b7\3\2\2\2\27\u00bf\3\2\2\2\31\u00c5\3\2\2\2\33\u00c9\3"+
		"\2\2\2\35\u00cc\3\2\2\2\37\u00d1\3\2\2\2!\u00d6\3\2\2\2#\u00d9\3\2\2\2"+
		"%\u00de\3\2\2\2\'\u00e2\3\2\2\2)\u00e4\3\2\2\2+\u00e6\3\2\2\2-\u00ee\3"+
		"\2\2\2/\u00f0\3\2\2\2\61\u00f2\3\2\2\2\63\u00f4\3\2\2\2\65\u00f6\3\2\2"+
		"\2\67\u00fb\3\2\2\29\u00fd\3\2\2\2;\u0105\3\2\2\2=\u010a\3\2\2\2?\u0118"+
		"\3\2\2\2A\u011a\3\2\2\2C\u011d\3\2\2\2E\u0120\3\2\2\2G\u0122\3\2\2\2I"+
		"\u0125\3\2\2\2K\u0127\3\2\2\2M\u012d\3\2\2\2O\u012f\3\2\2\2Q\u0131\3\2"+
		"\2\2S\u0133\3\2\2\2U\u0138\3\2\2\2W\u013a\3\2\2\2Y\u013c\3\2\2\2[\u013e"+
		"\3\2\2\2]\u0143\3\2\2\2_\u0149\3\2\2\2a\u014c\3\2\2\2c\u0152\3\2\2\2e"+
		"\u0154\3\2\2\2g\u0157\3\2\2\2i\u015d\3\2\2\2k\u015f\3\2\2\2m\u0162\3\2"+
		"\2\2o\u016c\3\2\2\2q\u016f\3\2\2\2s\u017c\3\2\2\2u\u019e\3\2\2\2w\u01a0"+
		"\3\2\2\2y\u01a2\3\2\2\2{\u01a4\3\2\2\2}\u01a6\3\2\2\2\177\u01ab\3\2\2"+
		"\2\u0081\u01af\3\2\2\2\u0083\u01b3\3\2\2\2\u0085\u01b7\3\2\2\2\u0087\u01bb"+
		"\3\2\2\2\u0089\u008a\7r\2\2\u008a\u008b\7t\2\2\u008b\u008c\7q\2\2\u008c"+
		"\u008d\7i\2\2\u008d\u008e\7t\2\2\u008e\u008f\7c\2\2\u008f\u0090\7o\2\2"+
		"\u0090\4\3\2\2\2\u0091\u0092\7g\2\2\u0092\u0093\7p\2\2\u0093\u0094\7f"+
		"\2\2\u0094\u0095\7\60\2\2\u0095\6\3\2\2\2\u0096\u0097\7d\2\2\u0097\u0098"+
		"\7g\2\2\u0098\u0099\7i\2\2\u0099\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b"+
		"\b\3\2\2\2\u009c\u009d\7g\2\2\u009d\u009e\7p\2\2\u009e\u009f\7f\2\2\u009f"+
		"\n\3\2\2\2\u00a0\u00a1\7<\2\2\u00a1\u00a2\7?\2\2\u00a2\f\3\2\2\2\u00a3"+
		"\u00a4\7#\2\2\u00a4\16\3\2\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7t\2\2\u00a7"+
		"\u00a8\7w\2\2\u00a8\u00a9\7g\2\2\u00a9\20\3\2\2\2\u00aa\u00ab\7h\2\2\u00ab"+
		"\u00ac\7c\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7g\2\2"+
		"\u00af\22\3\2\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7"+
		"c\2\2\u00b3\u00b4\7f\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7p\2\2\u00b6\24"+
		"\3\2\2\2\u00b7\u00b8\7y\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7k\2\2\u00ba"+
		"\u00bb\7v\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7p\2\2"+
		"\u00be\26\3\2\2\2\u00bf\u00c0\7y\2\2\u00c0\u00c1\7j\2\2\u00c1\u00c2\7"+
		"k\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7g\2\2\u00c4\30\3\2\2\2\u00c5\u00c6"+
		"\7h\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7t\2\2\u00c8\32\3\2\2\2\u00c9\u00ca"+
		"\7v\2\2\u00ca\u00cb\7q\2\2\u00cb\34\3\2\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce"+
		"\7v\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7r\2\2\u00d0\36\3\2\2\2\u00d1\u00d2"+
		"\7p\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7z\2\2\u00d4\u00d5\7v\2\2\u00d5"+
		" \3\2\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7h\2\2\u00d8\"\3\2\2\2\u00d9"+
		"\u00da\7g\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7g\2\2"+
		"\u00dd$\3\2\2\2\u00de\u00df\7x\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7t\2"+
		"\2\u00e1&\3\2\2\2\u00e2\u00e3\7+\2\2\u00e3(\3\2\2\2\u00e4\u00e5\7*\2\2"+
		"\u00e5*\3\2\2\2\u00e6\u00eb\5-\27\2\u00e7\u00ea\5-\27\2\u00e8\u00ea\5"+
		"w<\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec,\3\2\2\2\u00ed\u00eb\3\2\2\2"+
		"\u00ee\u00ef\t\2\2\2\u00ef.\3\2\2\2\u00f0\u00f1\7.\2\2\u00f1\60\3\2\2"+
		"\2\u00f2\u00f3\7=\2\2\u00f3\62\3\2\2\2\u00f4\u00f5\7\60\2\2\u00f5\64\3"+
		"\2\2\2\u00f6\u00f7\7<\2\2\u00f7\66\3\2\2\2\u00f8\u00fc\59\35\2\u00f9\u00fc"+
		"\5;\36\2\u00fa\u00fc\5=\37\2\u00fb\u00f8\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fa\3\2\2\2\u00fc8\3\2\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7p\2\2\u00ff"+
		"\u0100\7v\2\2\u0100\u0101\7g\2\2\u0101\u0102\7i\2\2\u0102\u0103\7g\2\2"+
		"\u0103\u0104\7t\2\2\u0104:\3\2\2\2\u0105\u0106\7t\2\2\u0106\u0107\7g\2"+
		"\2\u0107\u0108\7c\2\2\u0108\u0109\7n\2\2\u0109<\3\2\2\2\u010a\u010b\7"+
		"d\2\2\u010b\u010c\7q\2\2\u010c\u010d\7q\2\2\u010d\u010e\7n\2\2\u010e\u010f"+
		"\7g\2\2\u010f\u0110\7c\2\2\u0110\u0111\7p\2\2\u0111>\3\2\2\2\u0112\u0119"+
		"\5A!\2\u0113\u0119\5C\"\2\u0114\u0119\5E#\2\u0115\u0119\5G$\2\u0116\u0119"+
		"\5I%\2\u0117\u0119\5K&\2\u0118\u0112\3\2\2\2\u0118\u0113\3\2\2\2\u0118"+
		"\u0114\3\2\2\2\u0118\u0115\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2"+
		"\2\2\u0119@\3\2\2\2\u011a\u011b\7#\2\2\u011b\u011c\7?\2\2\u011cB\3\2\2"+
		"\2\u011d\u011e\7?\2\2\u011e\u011f\7?\2\2\u011fD\3\2\2\2\u0120\u0121\7"+
		">\2\2\u0121F\3\2\2\2\u0122\u0123\7>\2\2\u0123\u0124\7?\2\2\u0124H\3\2"+
		"\2\2\u0125\u0126\7@\2\2\u0126J\3\2\2\2\u0127\u0128\7@\2\2\u0128\u0129"+
		"\7?\2\2\u0129L\3\2\2\2\u012a\u012e\5O(\2\u012b\u012e\5Q)\2\u012c\u012e"+
		"\5S*\2\u012d\u012a\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e"+
		"N\3\2\2\2\u012f\u0130\7-\2\2\u0130P\3\2\2\2\u0131\u0132\7/\2\2\u0132R"+
		"\3\2\2\2\u0133\u0134\7~\2\2\u0134T\3\2\2\2\u0135\u0139\5W,\2\u0136\u0139"+
		"\5Y-\2\u0137\u0139\5[.\2\u0138\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0137\3\2\2\2\u0139V\3\2\2\2\u013a\u013b\7,\2\2\u013bX\3\2\2\2\u013c"+
		"\u013d\7\61\2\2\u013dZ\3\2\2\2\u013e\u013f\7(\2\2\u013f\u0140\7(\2\2\u0140"+
		"\\\3\2\2\2\u0141\u0144\5_\60\2\u0142\u0144\5s:\2\u0143\u0141\3\2\2\2\u0143"+
		"\u0142\3\2\2\2\u0144^\3\2\2\2\u0145\u014a\5a\61\2\u0146\u014a\5g\64\2"+
		"\u0147\u014a\5m\67\2\u0148\u014a\5q9\2\u0149\u0145\3\2\2\2\u0149\u0146"+
		"\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a`\3\2\2\2\u014b"+
		"\u014d\5c\62\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\5e\63\2\u0151"+
		"b\3\2\2\2\u0152\u0153\4\62\63\2\u0153d\3\2\2\2\u0154\u0155\t\3\2\2\u0155"+
		"f\3\2\2\2\u0156\u0158\5i\65\2\u0157\u0156\3\2\2\2\u0158\u0159\3\2\2\2"+
		"\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c"+
		"\5k\66\2\u015ch\3\2\2\2\u015d\u015e\4\629\2\u015ej\3\2\2\2\u015f\u0160"+
		"\t\4\2\2\u0160l\3\2\2\2\u0161\u0163\5w<\2\u0162\u0161\3\2\2\2\u0163\u0164"+
		"\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0169\3\2\2\2\u0166"+
		"\u0168\5o8\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2"+
		"\2\u0169\u016a\3\2\2\2\u016an\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d"+
		"\t\5\2\2\u016dp\3\2\2\2\u016e\u0170\5w<\2\u016f\u016e\3\2\2\2\u0170\u0171"+
		"\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0176\3\2\2\2\u0173"+
		"\u0175\5y=\2\u0174\u0173\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2"+
		"\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a"+
		"\5{>\2\u017ar\3\2\2\2\u017b\u017d\5w<\2\u017c\u017b\3\2\2\2\u017d\u017e"+
		"\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0181\5u;\2\u0181\u0185\3\2\2\2\u0182\u0184\5w<\2\u0183\u0182\3\2\2\2"+
		"\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u018b"+
		"\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0189\5\63\32\2\u0189\u018a\5w<\2\u018a"+
		"\u018c\3\2\2\2\u018b\u0188\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018d\u018e\3\2\2\2\u018e\u0192\3\2\2\2\u018f\u0191\5u;\2\u0190\u018f"+
		"\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"t\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u019f\7g\2\2\u0196\u019a\7G\2\2\u0197"+
		"\u0199\t\6\2\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2"+
		"\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d"+
		"\u019f\5w<\2\u019e\u0195\3\2\2\2\u019e\u0196\3\2\2\2\u019fv\3\2\2\2\u01a0"+
		"\u01a1\4\62;\2\u01a1x\3\2\2\2\u01a2\u01a3\t\7\2\2\u01a3z\3\2\2\2\u01a4"+
		"\u01a5\t\b\2\2\u01a5|\3\2\2\2\u01a6\u01a7\5\177@\2\u01a7\u01a8\5\u0081"+
		"A\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\b?\2\2\u01aa~\3\2\2\2\u01ab\u01ac"+
		"\7\f\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\b@\2\2\u01ae\u0080\3\2\2\2\u01af"+
		"\u01b0\7\17\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\bA\2\2\u01b2\u0082\3\2"+
		"\2\2\u01b3\u01b4\7\13\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\bB\2\2\u01b6"+
		"\u0084\3\2\2\2\u01b7\u01b8\7\"\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\bC"+
		"\2\2\u01ba\u0086\3\2\2\2\u01bb\u01bc\7\61\2\2\u01bc\u01bd\7,\2\2\u01bd"+
		"\u01c1\3\2\2\2\u01be\u01c0\13\2\2\2\u01bf\u01be\3\2\2\2\u01c0\u01c3\3"+
		"\2\2\2\u01c1\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3"+
		"\u01c1\3\2\2\2\u01c4\u01c5\7,\2\2\u01c5\u01c6\7\61\2\2\u01c6\u01c7\3\2"+
		"\2\2\u01c7\u01c8\bD\2\2\u01c8\u0088\3\2\2\2\30\2\u00e9\u00eb\u00fb\u0118"+
		"\u012d\u0138\u0143\u0149\u014e\u0159\u0164\u0169\u0171\u0176\u017e\u0185"+
		"\u018d\u0192\u019a\u019e\u01c1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}