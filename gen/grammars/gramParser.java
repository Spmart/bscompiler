// Generated from /Users/spmart/IdeaProjects/bscompiler/src/main/java/grammars/gram.g4 by ANTLR 4.7.2
package grammars;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramParser extends Parser {
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
	public static final int
		RULE_prg = 0, RULE_bool = 1, RULE_declaration = 2, RULE_operator = 3, 
		RULE_composite_operator = 4, RULE_assignments_operator = 5, RULE_conditional_operator = 6, 
		RULE_limited_cycle = 7, RULE_conditional_cycle = 8, RULE_input = 9, RULE_output = 10, 
		RULE_experssion = 11, RULE_operand = 12, RULE_summand = 13, RULE_multiplier = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prg", "bool", "declaration", "operator", "composite_operator", "assignments_operator", 
			"conditional_operator", "limited_cycle", "conditional_cycle", "input", 
			"output", "experssion", "operand", "summand", "multiplier"
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

	@Override
	public String getGrammarFileName() { return "gram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PrgContext extends ParserRuleContext {
		public TerminalNode BEGIN_PROGRAM() { return getToken(gramParser.BEGIN_PROGRAM, 0); }
		public TerminalNode END_PROGRAM() { return getToken(gramParser.END_PROGRAM, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public PrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterPrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitPrg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitPrg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrgContext prg() throws RecognitionException {
		PrgContext _localctx = new PrgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(BEGIN_PROGRAM);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << READLN) | (1L << WRITELN) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << VAR) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(33);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(31);
					declaration();
					}
					break;
				case BEGIN:
				case READLN:
				case WRITELN:
				case WHILE:
				case FOR:
				case IF:
				case IDENTIFIER:
					{
					setState(32);
					operator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(END_PROGRAM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(gramParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(gramParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(gramParser.VAR, 0); }
		public TerminalNode TYPE() { return getToken(gramParser.TYPE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(gramParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(gramParser.IDENTIFIER, i);
		}
		public TerminalNode SEMICOLON() { return getToken(gramParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(gramParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gramParser.COMMA, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(VAR);
			setState(43);
			match(TYPE);
			setState(44);
			match(IDENTIFIER);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(45);
				match(COMMA);
				setState(46);
				match(IDENTIFIER);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public Composite_operatorContext composite_operator() {
			return getRuleContext(Composite_operatorContext.class,0);
		}
		public Assignments_operatorContext assignments_operator() {
			return getRuleContext(Assignments_operatorContext.class,0);
		}
		public Conditional_operatorContext conditional_operator() {
			return getRuleContext(Conditional_operatorContext.class,0);
		}
		public Limited_cycleContext limited_cycle() {
			return getRuleContext(Limited_cycleContext.class,0);
		}
		public Conditional_cycleContext conditional_cycle() {
			return getRuleContext(Conditional_cycleContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operator);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				composite_operator();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				assignments_operator();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				conditional_operator();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				limited_cycle();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				conditional_cycle();
				}
				break;
			case READLN:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				input();
				}
				break;
			case WRITELN:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				output();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Composite_operatorContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(gramParser.BEGIN, 0); }
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public TerminalNode END_PROGRAM() { return getToken(gramParser.END_PROGRAM, 0); }
		public TerminalNode END() { return getToken(gramParser.END, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(gramParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(gramParser.SEMICOLON, i);
		}
		public Composite_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composite_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterComposite_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitComposite_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitComposite_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Composite_operatorContext composite_operator() throws RecognitionException {
		Composite_operatorContext _localctx = new Composite_operatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_composite_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(BEGIN);
			setState(64);
			operator();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(65);
				match(SEMICOLON);
				setState(66);
				operator();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(END_PROGRAM);
			setState(73);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignments_operatorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(gramParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGMENT() { return getToken(gramParser.ASSIGMENT, 0); }
		public ExperssionContext experssion() {
			return getRuleContext(ExperssionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gramParser.SEMICOLON, 0); }
		public Assignments_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignments_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterAssignments_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitAssignments_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitAssignments_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignments_operatorContext assignments_operator() throws RecognitionException {
		Assignments_operatorContext _localctx = new Assignments_operatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignments_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(IDENTIFIER);
			setState(76);
			match(ASSIGMENT);
			setState(77);
			experssion();
			setState(78);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_operatorContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(gramParser.IF, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(gramParser.LEFT_PARANTHESIS, 0); }
		public ExperssionContext experssion() {
			return getRuleContext(ExperssionContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(gramParser.RIGHT_PARANTHESIS, 0); }
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(gramParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(gramParser.ELSE, i);
		}
		public Conditional_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterConditional_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitConditional_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitConditional_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_operatorContext conditional_operator() throws RecognitionException {
		Conditional_operatorContext _localctx = new Conditional_operatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditional_operator);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(IF);
			setState(81);
			match(LEFT_PARANTHESIS);
			setState(82);
			experssion();
			setState(83);
			match(RIGHT_PARANTHESIS);
			setState(84);
			operator();
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(85);
					match(ELSE);
					setState(86);
					operator();
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Limited_cycleContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(gramParser.FOR, 0); }
		public Assignments_operatorContext assignments_operator() {
			return getRuleContext(Assignments_operatorContext.class,0);
		}
		public TerminalNode TO() { return getToken(gramParser.TO, 0); }
		public List<ExperssionContext> experssion() {
			return getRuleContexts(ExperssionContext.class);
		}
		public ExperssionContext experssion(int i) {
			return getRuleContext(ExperssionContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(gramParser.NEXT, 0); }
		public List<TerminalNode> STEP() { return getTokens(gramParser.STEP); }
		public TerminalNode STEP(int i) {
			return getToken(gramParser.STEP, i);
		}
		public Limited_cycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limited_cycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterLimited_cycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitLimited_cycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitLimited_cycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Limited_cycleContext limited_cycle() throws RecognitionException {
		Limited_cycleContext _localctx = new Limited_cycleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_limited_cycle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(FOR);
			setState(93);
			assignments_operator();
			setState(94);
			match(TO);
			setState(95);
			experssion();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STEP) {
				{
				{
				setState(96);
				match(STEP);
				setState(97);
				experssion();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			operator();
			setState(104);
			match(NEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_cycleContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(gramParser.WHILE, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(gramParser.LEFT_PARANTHESIS, 0); }
		public ExperssionContext experssion() {
			return getRuleContext(ExperssionContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(gramParser.RIGHT_PARANTHESIS, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Conditional_cycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_cycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterConditional_cycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitConditional_cycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitConditional_cycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_cycleContext conditional_cycle() throws RecognitionException {
		Conditional_cycleContext _localctx = new Conditional_cycleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditional_cycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(WHILE);
			setState(107);
			match(LEFT_PARANTHESIS);
			setState(108);
			experssion();
			setState(109);
			match(RIGHT_PARANTHESIS);
			setState(110);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputContext extends ParserRuleContext {
		public TerminalNode READLN() { return getToken(gramParser.READLN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(gramParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(gramParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(gramParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gramParser.COMMA, i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(READLN);
			setState(113);
			match(IDENTIFIER);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(114);
				match(COMMA);
				setState(115);
				match(IDENTIFIER);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode WRITELN() { return getToken(gramParser.WRITELN, 0); }
		public List<ExperssionContext> experssion() {
			return getRuleContexts(ExperssionContext.class);
		}
		public ExperssionContext experssion(int i) {
			return getRuleContext(ExperssionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(gramParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gramParser.COMMA, i);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(WRITELN);
			setState(122);
			experssion();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(123);
				match(COMMA);
				setState(124);
				experssion();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExperssionContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public List<TerminalNode> OPERAND_REL() { return getTokens(gramParser.OPERAND_REL); }
		public TerminalNode OPERAND_REL(int i) {
			return getToken(gramParser.OPERAND_REL, i);
		}
		public ExperssionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_experssion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterExperssion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitExperssion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitExperssion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExperssionContext experssion() throws RecognitionException {
		ExperssionContext _localctx = new ExperssionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_experssion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			operand();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERAND_REL) {
				{
				{
				setState(131);
				match(OPERAND_REL);
				setState(132);
				operand();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public List<SummandContext> summand() {
			return getRuleContexts(SummandContext.class);
		}
		public SummandContext summand(int i) {
			return getRuleContext(SummandContext.class,i);
		}
		public List<TerminalNode> OPERATION_ADD() { return getTokens(gramParser.OPERATION_ADD); }
		public TerminalNode OPERATION_ADD(int i) {
			return getToken(gramParser.OPERATION_ADD, i);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			summand();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATION_ADD) {
				{
				{
				setState(139);
				match(OPERATION_ADD);
				setState(140);
				summand();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SummandContext extends ParserRuleContext {
		public List<MultiplierContext> multiplier() {
			return getRuleContexts(MultiplierContext.class);
		}
		public MultiplierContext multiplier(int i) {
			return getRuleContext(MultiplierContext.class,i);
		}
		public List<TerminalNode> OPERATION_MULT() { return getTokens(gramParser.OPERATION_MULT); }
		public TerminalNode OPERATION_MULT(int i) {
			return getToken(gramParser.OPERATION_MULT, i);
		}
		public SummandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterSummand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitSummand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitSummand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SummandContext summand() throws RecognitionException {
		SummandContext _localctx = new SummandContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_summand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			multiplier();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATION_MULT) {
				{
				{
				setState(147);
				match(OPERATION_MULT);
				setState(148);
				multiplier();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(gramParser.IDENTIFIER, 0); }
		public TerminalNode DIGIT() { return getToken(gramParser.DIGIT, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode UNARY_OPERATION() { return getToken(gramParser.UNARY_OPERATION, 0); }
		public MultiplierContext multiplier() {
			return getRuleContext(MultiplierContext.class,0);
		}
		public TerminalNode LEFT_PARANTHESIS() { return getToken(gramParser.LEFT_PARANTHESIS, 0); }
		public ExperssionContext experssion() {
			return getRuleContext(ExperssionContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(gramParser.RIGHT_PARANTHESIS, 0); }
		public MultiplierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterMultiplier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitMultiplier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitMultiplier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplierContext multiplier() throws RecognitionException {
		MultiplierContext _localctx = new MultiplierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_multiplier);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(IDENTIFIER);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(DIGIT);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				bool();
				}
				break;
			case UNARY_OPERATION:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				match(UNARY_OPERATION);
				setState(158);
				multiplier();
				}
				break;
			case LEFT_PARANTHESIS:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				match(LEFT_PARANTHESIS);
				setState(160);
				experssion();
				setState(161);
				match(RIGHT_PARANTHESIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u00a8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\7\2$\n\2"+
		"\f\2\16\2\'\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4\62\n\4\f\4\16"+
		"\4\65\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5@\n\5\3\6\3\6\3\6\3"+
		"\6\7\6F\n\6\f\6\16\6I\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\7\bZ\n\b\f\b\16\b]\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\te"+
		"\n\t\f\t\16\th\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\7\13w\n\13\f\13\16\13z\13\13\3\f\3\f\3\f\3\f\7\f\u0080\n\f\f\f\16"+
		"\f\u0083\13\f\3\r\3\r\3\r\7\r\u0088\n\r\f\r\16\r\u008b\13\r\3\16\3\16"+
		"\3\16\7\16\u0090\n\16\f\16\16\16\u0093\13\16\3\17\3\17\3\17\7\17\u0098"+
		"\n\17\f\17\16\17\u009b\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u00a6\n\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		"\2\3\3\2\t\n\2\u00ad\2 \3\2\2\2\4*\3\2\2\2\6,\3\2\2\2\b?\3\2\2\2\nA\3"+
		"\2\2\2\fM\3\2\2\2\16R\3\2\2\2\20^\3\2\2\2\22l\3\2\2\2\24r\3\2\2\2\26{"+
		"\3\2\2\2\30\u0084\3\2\2\2\32\u008c\3\2\2\2\34\u0094\3\2\2\2\36\u00a5\3"+
		"\2\2\2 %\7\3\2\2!$\5\6\4\2\"$\5\b\5\2#!\3\2\2\2#\"\3\2\2\2$\'\3\2\2\2"+
		"%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\4\2\2)\3\3\2\2\2*+\t\2\2"+
		"\2+\5\3\2\2\2,-\7\24\2\2-.\7\35\2\2.\63\7\27\2\2/\60\7\31\2\2\60\62\7"+
		"\27\2\2\61/\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3"+
		"\2\2\2\65\63\3\2\2\2\66\67\7\32\2\2\67\7\3\2\2\28@\5\n\6\29@\5\f\7\2:"+
		"@\5\16\b\2;@\5\20\t\2<@\5\22\n\2=@\5\24\13\2>@\5\26\f\2?8\3\2\2\2?9\3"+
		"\2\2\2?:\3\2\2\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\t\3\2\2\2AB"+
		"\7\5\2\2BG\5\b\5\2CD\7\32\2\2DF\5\b\5\2EC\3\2\2\2FI\3\2\2\2GE\3\2\2\2"+
		"GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\4\2\2KL\7\6\2\2L\13\3\2\2\2MN\7\27"+
		"\2\2NO\7\7\2\2OP\5\30\r\2PQ\7\32\2\2Q\r\3\2\2\2RS\7\22\2\2ST\7\26\2\2"+
		"TU\5\30\r\2UV\7\25\2\2V[\5\b\5\2WX\7\23\2\2XZ\5\b\5\2YW\3\2\2\2Z]\3\2"+
		"\2\2[Y\3\2\2\2[\\\3\2\2\2\\\17\3\2\2\2][\3\2\2\2^_\7\16\2\2_`\5\f\7\2"+
		"`a\7\17\2\2af\5\30\r\2bc\7\20\2\2ce\5\30\r\2db\3\2\2\2eh\3\2\2\2fd\3\2"+
		"\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\5\b\5\2jk\7\21\2\2k\21\3\2\2\2lm"+
		"\7\r\2\2mn\7\26\2\2no\5\30\r\2op\7\25\2\2pq\5\b\5\2q\23\3\2\2\2rs\7\13"+
		"\2\2sx\7\27\2\2tu\7\31\2\2uw\7\27\2\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy"+
		"\3\2\2\2y\25\3\2\2\2zx\3\2\2\2{|\7\f\2\2|\u0081\5\30\r\2}~\7\31\2\2~\u0080"+
		"\5\30\r\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\27\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0089\5\32\16\2\u0085"+
		"\u0086\7!\2\2\u0086\u0088\5\32\16\2\u0087\u0085\3\2\2\2\u0088\u008b\3"+
		"\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\31\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u0091\5\34\17\2\u008d\u008e\7(\2\2\u008e\u0090\5"+
		"\34\17\2\u008f\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\33\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0099\5\36\20"+
		"\2\u0095\u0096\7,\2\2\u0096\u0098\5\36\20\2\u0097\u0095\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\35\3\2\2"+
		"\2\u009b\u0099\3\2\2\2\u009c\u00a6\7\27\2\2\u009d\u00a6\7\60\2\2\u009e"+
		"\u00a6\5\4\3\2\u009f\u00a0\7\b\2\2\u00a0\u00a6\5\36\20\2\u00a1\u00a2\7"+
		"\26\2\2\u00a2\u00a3\5\30\r\2\u00a3\u00a4\7\25\2\2\u00a4\u00a6\3\2\2\2"+
		"\u00a5\u009c\3\2\2\2\u00a5\u009d\3\2\2\2\u00a5\u009e\3\2\2\2\u00a5\u009f"+
		"\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6\37\3\2\2\2\17#%\63?G[fx\u0081\u0089"+
		"\u0091\u0099\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}