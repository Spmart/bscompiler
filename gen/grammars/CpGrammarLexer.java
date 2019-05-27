// Generated from /Users/spmart/IdeaProjects/bscompiler/src/main/java/grammars/CpGrammar.g4 by ANTLR 4.7.2
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
public class CpGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, DOT=2, COMMA=3, COLON=4, SEMICOLON=5, LB=6, RB=7, LP=8, RP=9, 
		LOGIC_CONST=10, REL_OP=11, SUM_OP=12, MUL_OP=13, UNARY=14, BLOCK_COMMENT=15, 
		WS=16, BEGIN_PROGRAM=17, END_PROGRAM=18, VAR=19, BEGIN=20, END=21, INTEGER=22, 
		REAL=23, BOOLEAN=24, READLN=25, WRITELN=26, IF=27, ELSE=28, FOR=29, TO=30, 
		STEP=31, NEXT=32, WHILE=33, DO=34, ID=35, NUMBER=36, DECIMAL=37, BIN=38, 
		OCT=39, DEC=40, HEX=41, E=42, FLOAT_NUMBER=43, ORDER=44, FLOAT=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "CHAR", "DIGIT", "DOT", "COMMA", "COLON", "SEMICOLON", "LB", 
			"RB", "LP", "RP", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "EQ", "GT", 
			"LT", "GE", "LE", "NE", "OR", "AND", "NOT", "TRUE", "FALSE", "LOGIC_CONST", 
			"REL_OP", "SUM_OP", "MUL_OP", "UNARY", "BLOCK_COMMENT", "WS", "BEGIN_PROGRAM", 
			"END_PROGRAM", "VAR", "BEGIN", "END", "INTEGER", "REAL", "BOOLEAN", "READLN", 
			"WRITELN", "IF", "ELSE", "FOR", "TO", "STEP", "NEXT", "WHILE", "DO", 
			"ID", "NUMBER", "DECIMAL", "BIN_LETTER", "BIN_DIGIT", "BIN", "OCT_LETTER", 
			"OCT_DIGIT", "OCT", "DEC_LETTER", "DEC_FIRST_DIGIT", "DEC", "HEX_END_LETTER", 
			"HEX_LETTER", "HEX", "E", "FLOAT_NUMBER", "ORDER", "FLOAT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':='", "'.'", "','", "':'", "';'", "'('", "')'", "'{'", "'}'", 
			null, null, null, null, null, null, null, "'program'", "'end.'", "'var'", 
			"'begin'", "'end'", "'integer'", "'real'", "'boolean'", "'readln'", "'writeln'", 
			"'if'", "'else'", "'for'", "'to'", "'step'", "'next'", "'while'", "'do'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "DOT", "COMMA", "COLON", "SEMICOLON", "LB", "RB", "LP", "RP", 
			"LOGIC_CONST", "REL_OP", "SUM_OP", "MUL_OP", "UNARY", "BLOCK_COMMENT", 
			"WS", "BEGIN_PROGRAM", "END_PROGRAM", "VAR", "BEGIN", "END", "INTEGER", 
			"REAL", "BOOLEAN", "READLN", "WRITELN", "IF", "ELSE", "FOR", "TO", "STEP", 
			"NEXT", "WHILE", "DO", "ID", "NUMBER", "DECIMAL", "BIN", "OCT", "DEC", 
			"HEX", "E", "FLOAT_NUMBER", "ORDER", "FLOAT"
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


	public CpGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CpGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u01bd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\5\34\u00d3\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u00db\n\35\3\36\3\36\3\36\5\36\u00e0\n\36\3\37\3\37\3\37\5\37\u00e5\n"+
		"\37\3 \3 \3!\3!\3!\3!\7!\u00ed\n!\f!\16!\u00f0\13!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&"+
		"\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		"-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\7\65\u015f\n\65\f\65\16\65\u0162\13\65\3\66\3\66"+
		"\5\66\u0166\n\66\3\67\3\67\3\67\3\67\5\67\u016c\n\67\38\38\39\39\3:\6"+
		":\u0173\n:\r:\16:\u0174\3:\3:\3;\3;\3<\3<\3=\6=\u017e\n=\r=\16=\u017f"+
		"\3=\3=\3>\3>\3?\3?\3@\6@\u0189\n@\r@\16@\u018a\3@\7@\u018e\n@\f@\16@\u0191"+
		"\13@\3@\5@\u0194\n@\3A\3A\3B\3B\3C\3C\3C\6C\u019d\nC\rC\16C\u019e\3C\3"+
		"C\3D\3D\3E\6E\u01a6\nE\rE\16E\u01a7\3F\3F\3F\5F\u01ad\nF\3F\3F\3G\3G\3"+
		"G\3G\5G\u01b5\nG\3G\3G\3G\5G\u01ba\nG\5G\u01bc\nG\3\u00ee\2H\3\3\5\2\7"+
		"\2\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\2\33\2\35\2\37\2!\2#\2%\2"+
		"\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\f9\r;\16=\17?\20A\21C\22E\23G\24I\25"+
		"K\26M\27O\30Q\31S\32U\33W\34Y\35[\36]\37_ a!c\"e#g$i%k&m\'o\2q\2s(u\2"+
		"w\2y){\2}\2\177*\u0081\2\u0083\2\u0085+\u0087,\u0089-\u008b.\u008d/\3"+
		"\2\n\4\2C\\c|\5\2\13\f\17\17\"\"\4\2DDdd\4\2QQqq\4\2FFff\4\2JJjj\4\2C"+
		"Hch\4\2GGgg\2\u01c1\2\3\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2s\3\2\2\2\2y\3\2\2\2\2\177\3\2\2\2\2\u0085\3"+
		"\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2"+
		"\3\u008f\3\2\2\2\5\u0092\3\2\2\2\7\u0094\3\2\2\2\t\u0096\3\2\2\2\13\u0098"+
		"\3\2\2\2\r\u009a\3\2\2\2\17\u009c\3\2\2\2\21\u009e\3\2\2\2\23\u00a0\3"+
		"\2\2\2\25\u00a2\3\2\2\2\27\u00a4\3\2\2\2\31\u00a6\3\2\2\2\33\u00a8\3\2"+
		"\2\2\35\u00aa\3\2\2\2\37\u00ac\3\2\2\2!\u00ae\3\2\2\2#\u00b1\3\2\2\2%"+
		"\u00b3\3\2\2\2\'\u00b5\3\2\2\2)\u00b8\3\2\2\2+\u00bb\3\2\2\2-\u00be\3"+
		"\2\2\2/\u00c0\3\2\2\2\61\u00c3\3\2\2\2\63\u00c5\3\2\2\2\65\u00ca\3\2\2"+
		"\2\67\u00d2\3\2\2\29\u00da\3\2\2\2;\u00df\3\2\2\2=\u00e4\3\2\2\2?\u00e6"+
		"\3\2\2\2A\u00e8\3\2\2\2C\u00f6\3\2\2\2E\u00fa\3\2\2\2G\u0102\3\2\2\2I"+
		"\u0107\3\2\2\2K\u010b\3\2\2\2M\u0111\3\2\2\2O\u0115\3\2\2\2Q\u011d\3\2"+
		"\2\2S\u0122\3\2\2\2U\u012a\3\2\2\2W\u0131\3\2\2\2Y\u0139\3\2\2\2[\u013c"+
		"\3\2\2\2]\u0141\3\2\2\2_\u0145\3\2\2\2a\u0148\3\2\2\2c\u014d\3\2\2\2e"+
		"\u0152\3\2\2\2g\u0158\3\2\2\2i\u015b\3\2\2\2k\u0165\3\2\2\2m\u016b\3\2"+
		"\2\2o\u016d\3\2\2\2q\u016f\3\2\2\2s\u0172\3\2\2\2u\u0178\3\2\2\2w\u017a"+
		"\3\2\2\2y\u017d\3\2\2\2{\u0183\3\2\2\2}\u0185\3\2\2\2\177\u0188\3\2\2"+
		"\2\u0081\u0195\3\2\2\2\u0083\u0197\3\2\2\2\u0085\u0199\3\2\2\2\u0087\u01a2"+
		"\3\2\2\2\u0089\u01a5\3\2\2\2\u008b\u01a9\3\2\2\2\u008d\u01bb\3\2\2\2\u008f"+
		"\u0090\7<\2\2\u0090\u0091\7?\2\2\u0091\4\3\2\2\2\u0092\u0093\t\2\2\2\u0093"+
		"\6\3\2\2\2\u0094\u0095\4\62;\2\u0095\b\3\2\2\2\u0096\u0097\7\60\2\2\u0097"+
		"\n\3\2\2\2\u0098\u0099\7.\2\2\u0099\f\3\2\2\2\u009a\u009b\7<\2\2\u009b"+
		"\16\3\2\2\2\u009c\u009d\7=\2\2\u009d\20\3\2\2\2\u009e\u009f\7*\2\2\u009f"+
		"\22\3\2\2\2\u00a0\u00a1\7+\2\2\u00a1\24\3\2\2\2\u00a2\u00a3\7}\2\2\u00a3"+
		"\26\3\2\2\2\u00a4\u00a5\7\177\2\2\u00a5\30\3\2\2\2\u00a6\u00a7\7-\2\2"+
		"\u00a7\32\3\2\2\2\u00a8\u00a9\7/\2\2\u00a9\34\3\2\2\2\u00aa\u00ab\7,\2"+
		"\2\u00ab\36\3\2\2\2\u00ac\u00ad\7\61\2\2\u00ad \3\2\2\2\u00ae\u00af\7"+
		"?\2\2\u00af\u00b0\7?\2\2\u00b0\"\3\2\2\2\u00b1\u00b2\7@\2\2\u00b2$\3\2"+
		"\2\2\u00b3\u00b4\7>\2\2\u00b4&\3\2\2\2\u00b5\u00b6\7@\2\2\u00b6\u00b7"+
		"\7?\2\2\u00b7(\3\2\2\2\u00b8\u00b9\7>\2\2\u00b9\u00ba\7?\2\2\u00ba*\3"+
		"\2\2\2\u00bb\u00bc\7#\2\2\u00bc\u00bd\7?\2\2\u00bd,\3\2\2\2\u00be\u00bf"+
		"\7~\2\2\u00bf.\3\2\2\2\u00c0\u00c1\7(\2\2\u00c1\u00c2\7(\2\2\u00c2\60"+
		"\3\2\2\2\u00c3\u00c4\7#\2\2\u00c4\62\3\2\2\2\u00c5\u00c6\7v\2\2\u00c6"+
		"\u00c7\7t\2\2\u00c7\u00c8\7w\2\2\u00c8\u00c9\7g\2\2\u00c9\64\3\2\2\2\u00ca"+
		"\u00cb\7h\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7u\2\2"+
		"\u00ce\u00cf\7g\2\2\u00cf\66\3\2\2\2\u00d0\u00d3\5\63\32\2\u00d1\u00d3"+
		"\5\65\33\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d38\3\2\2\2\u00d4"+
		"\u00db\5+\26\2\u00d5\u00db\5!\21\2\u00d6\u00db\5%\23\2\u00d7\u00db\5)"+
		"\25\2\u00d8\u00db\5#\22\2\u00d9\u00db\5\'\24\2\u00da\u00d4\3\2\2\2\u00da"+
		"\u00d5\3\2\2\2\u00da\u00d6\3\2\2\2\u00da\u00d7\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00d9\3\2\2\2\u00db:\3\2\2\2\u00dc\u00e0\5\31\r\2\u00dd\u00e0"+
		"\5\33\16\2\u00de\u00e0\5-\27\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2"+
		"\u00df\u00de\3\2\2\2\u00e0<\3\2\2\2\u00e1\u00e5\5\35\17\2\u00e2\u00e5"+
		"\5\37\20\2\u00e3\u00e5\5/\30\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2\3\2\2\2"+
		"\u00e4\u00e3\3\2\2\2\u00e5>\3\2\2\2\u00e6\u00e7\5\61\31\2\u00e7@\3\2\2"+
		"\2\u00e8\u00e9\7\61\2\2\u00e9\u00ea\7,\2\2\u00ea\u00ee\3\2\2\2\u00eb\u00ed"+
		"\13\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ef\3\2\2\2"+
		"\u00ee\u00ec\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2"+
		"\7,\2\2\u00f2\u00f3\7\61\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\b!\2\2\u00f5"+
		"B\3\2\2\2\u00f6\u00f7\t\3\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\b\"\2\2"+
		"\u00f9D\3\2\2\2\u00fa\u00fb\7r\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7q\2"+
		"\2\u00fd\u00fe\7i\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7c\2\2\u0100\u0101"+
		"\7o\2\2\u0101F\3\2\2\2\u0102\u0103\7g\2\2\u0103\u0104\7p\2\2\u0104\u0105"+
		"\7f\2\2\u0105\u0106\7\60\2\2\u0106H\3\2\2\2\u0107\u0108\7x\2\2\u0108\u0109"+
		"\7c\2\2\u0109\u010a\7t\2\2\u010aJ\3\2\2\2\u010b\u010c\7d\2\2\u010c\u010d"+
		"\7g\2\2\u010d\u010e\7i\2\2\u010e\u010f\7k\2\2\u010f\u0110\7p\2\2\u0110"+
		"L\3\2\2\2\u0111\u0112\7g\2\2\u0112\u0113\7p\2\2\u0113\u0114\7f\2\2\u0114"+
		"N\3\2\2\2\u0115\u0116\7k\2\2\u0116\u0117\7p\2\2\u0117\u0118\7v\2\2\u0118"+
		"\u0119\7g\2\2\u0119\u011a\7i\2\2\u011a\u011b\7g\2\2\u011b\u011c\7t\2\2"+
		"\u011cP\3\2\2\2\u011d\u011e\7t\2\2\u011e\u011f\7g\2\2\u011f\u0120\7c\2"+
		"\2\u0120\u0121\7n\2\2\u0121R\3\2\2\2\u0122\u0123\7d\2\2\u0123\u0124\7"+
		"q\2\2\u0124\u0125\7q\2\2\u0125\u0126\7n\2\2\u0126\u0127\7g\2\2\u0127\u0128"+
		"\7c\2\2\u0128\u0129\7p\2\2\u0129T\3\2\2\2\u012a\u012b\7t\2\2\u012b\u012c"+
		"\7g\2\2\u012c\u012d\7c\2\2\u012d\u012e\7f\2\2\u012e\u012f\7n\2\2\u012f"+
		"\u0130\7p\2\2\u0130V\3\2\2\2\u0131\u0132\7y\2\2\u0132\u0133\7t\2\2\u0133"+
		"\u0134\7k\2\2\u0134\u0135\7v\2\2\u0135\u0136\7g\2\2\u0136\u0137\7n\2\2"+
		"\u0137\u0138\7p\2\2\u0138X\3\2\2\2\u0139\u013a\7k\2\2\u013a\u013b\7h\2"+
		"\2\u013bZ\3\2\2\2\u013c\u013d\7g\2\2\u013d\u013e\7n\2\2\u013e\u013f\7"+
		"u\2\2\u013f\u0140\7g\2\2\u0140\\\3\2\2\2\u0141\u0142\7h\2\2\u0142\u0143"+
		"\7q\2\2\u0143\u0144\7t\2\2\u0144^\3\2\2\2\u0145\u0146\7v\2\2\u0146\u0147"+
		"\7q\2\2\u0147`\3\2\2\2\u0148\u0149\7u\2\2\u0149\u014a\7v\2\2\u014a\u014b"+
		"\7g\2\2\u014b\u014c\7r\2\2\u014cb\3\2\2\2\u014d\u014e\7p\2\2\u014e\u014f"+
		"\7g\2\2\u014f\u0150\7z\2\2\u0150\u0151\7v\2\2\u0151d\3\2\2\2\u0152\u0153"+
		"\7y\2\2\u0153\u0154\7j\2\2\u0154\u0155\7k\2\2\u0155\u0156\7n\2\2\u0156"+
		"\u0157\7g\2\2\u0157f\3\2\2\2\u0158\u0159\7f\2\2\u0159\u015a\7q\2\2\u015a"+
		"h\3\2\2\2\u015b\u0160\5\5\3\2\u015c\u015f\5\5\3\2\u015d\u015f\5\7\4\2"+
		"\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161j\3\2\2\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0166\5m\67\2\u0164\u0166\5\u008dG\2\u0165\u0163\3\2\2\2\u0165\u0164"+
		"\3\2\2\2\u0166l\3\2\2\2\u0167\u016c\5s:\2\u0168\u016c\5y=\2\u0169\u016c"+
		"\5\177@\2\u016a\u016c\5\u0085C\2\u016b\u0167\3\2\2\2\u016b\u0168\3\2\2"+
		"\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016cn\3\2\2\2\u016d\u016e"+
		"\t\4\2\2\u016ep\3\2\2\2\u016f\u0170\4\62\63\2\u0170r\3\2\2\2\u0171\u0173"+
		"\5q9\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\5o8\2\u0177t\3\2\2\2\u0178"+
		"\u0179\t\5\2\2\u0179v\3\2\2\2\u017a\u017b\4\629\2\u017bx\3\2\2\2\u017c"+
		"\u017e\5w<\2\u017d\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u017d\3\2\2"+
		"\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\5u;\2\u0182z\3"+
		"\2\2\2\u0183\u0184\t\6\2\2\u0184|\3\2\2\2\u0185\u0186\4\63;\2\u0186~\3"+
		"\2\2\2\u0187\u0189\5}?\2\u0188\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018f\3\2\2\2\u018c\u018e\5\7"+
		"\4\2\u018d\u018c\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0194\5{"+
		">\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0080\3\2\2\2\u0195"+
		"\u0196\t\7\2\2\u0196\u0082\3\2\2\2\u0197\u0198\t\b\2\2\u0198\u0084\3\2"+
		"\2\2\u0199\u019c\5\7\4\2\u019a\u019d\5\7\4\2\u019b\u019d\5\u0083B\2\u019c"+
		"\u019a\3\2\2\2\u019c\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019c\3\2"+
		"\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\5\u0081A\2\u01a1"+
		"\u0086\3\2\2\2\u01a2\u01a3\t\t\2\2\u01a3\u0088\3\2\2\2\u01a4\u01a6\5\7"+
		"\4\2\u01a5\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u008a\3\2\2\2\u01a9\u01ac\5\u0087D\2\u01aa\u01ad"+
		"\5\31\r\2\u01ab\u01ad\5\33\16\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3\2\2"+
		"\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\5\u0089E\2\u01af"+
		"\u008c\3\2\2\2\u01b0\u01b1\5\u0089E\2\u01b1\u01b2\5\u008bF\2\u01b2\u01bc"+
		"\3\2\2\2\u01b3\u01b5\5\u0089E\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2"+
		"\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\5\t\5\2\u01b7\u01b9\5\u0089E\2\u01b8"+
		"\u01ba\5\u008bF\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc"+
		"\3\2\2\2\u01bb\u01b0\3\2\2\2\u01bb\u01b4\3\2\2\2\u01bc\u008e\3\2\2\2\30"+
		"\2\u00d2\u00da\u00df\u00e4\u00ee\u015e\u0160\u0165\u016b\u0174\u017f\u018a"+
		"\u018f\u0193\u019c\u019e\u01a7\u01ac\u01b4\u01b9\u01bb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}