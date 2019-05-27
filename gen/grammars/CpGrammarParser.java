// Generated from /Users/spmart/IdeaProjects/bscompiler/src/main/java/grammars/CpGrammar.g4 by ANTLR 4.7.2
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
public class CpGrammarParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_idx = 1, RULE_logic = 2, RULE_declaration = 3, 
		RULE_var_type = 4, RULE_operator = 5, RULE_complex = 6, RULE_assign = 7, 
		RULE_condition = 8, RULE_for_cycle = 9, RULE_while_cycle = 10, RULE_input = 11, 
		RULE_output = 12, RULE_expression = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "idx", "logic", "declaration", "var_type", "operator", "complex", 
			"assign", "condition", "for_cycle", "while_cycle", "input", "output", 
			"expression"
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

	@Override
	public String getGrammarFileName() { return "CpGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CpGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN_PROGRAM() { return getToken(CpGrammarParser.BEGIN_PROGRAM, 0); }
		public TerminalNode VAR() { return getToken(CpGrammarParser.VAR, 0); }
		public TerminalNode BEGIN() { return getToken(CpGrammarParser.BEGIN, 0); }
		public TerminalNode END_PROGRAM() { return getToken(CpGrammarParser.END_PROGRAM, 0); }
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
		public List<TerminalNode> SEMICOLON() { return getTokens(CpGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CpGrammarParser.SEMICOLON, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CpGrammarVisitor ) return ((CpGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(BEGIN_PROGRAM);
			setState(29);
			match(VAR);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << REAL) | (1L << BOOLEAN))) != 0)) {
				{
				{
				setState(30);
				declaration();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			match(BEGIN);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << READLN) | (1L << WRITELN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(37);
				operator();
				setState(38);
				match(SEMICOLON);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
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

	public static class IdxContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CpGrammarParser.ID, 0); }
		public IdxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).enterIdx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).exitIdx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CpGrammarVisitor ) return ((CpGrammarVisitor<? extends T>)visitor).visitIdx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdxContext idx() throws RecognitionException {
		IdxContext _localctx = new IdxContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_idx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(ID);
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

	public static class LogicContext extends ParserRuleContext {
		public TerminalNode LOGIC_CONST() { return getToken(CpGrammarParser.LOGIC_CONST, 0); }
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CpGrammarVisitor ) return ((CpGrammarVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_logic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(LOGIC_CONST);
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
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public List<IdxContext> idx() {
			return getRuleContexts(IdxContext.class);
		}
		public IdxContext idx(int i) {
			return getRuleContext(IdxContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(CpGrammarParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CpGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CpGrammarParser.COMMA, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CpGrammarVisitor ) return ((CpGrammarVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			var_type();
			setState(52);
			idx();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(53);
				match(COMMA);
				setState(54);
				idx();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
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

	public static class Var_typeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(CpGrammarParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(CpGrammarParser.REAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(CpGrammarParser.BOOLEAN, 0); }
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).exitVar_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CpGrammarVisitor ) return ((CpGrammarVisitor<? extends T>)visitor).visitVar_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << REAL) | (1L << BOOLEAN))) != 0)) ) {
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

	public static class OperatorContext extends ParserRuleContext {
		public ComplexContext complex() {
			return getRuleContext(ComplexContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CpGrammarParser.SEMICOLON, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public For_cycleContext for_cycle() {
			return getRuleContext(For_cycleContext.class,0);
		}
		public While_cycleContext while_cycle() {
			return getRuleContext(While_cycleContext.class,0);
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
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CpGrammarVisitor ) return ((CpGrammarVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operator);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				complex();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				assign();
				setState(66);
				match(SEMICOLON);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				condition();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				for_cycle();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				while_cycle();
				}
				break;
			case READLN:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				input();
				}
				break;
			case WRITELN:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
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

	public static class ComplexContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(CpGrammarParser.BEGIN, 0); }
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public TerminalNode END() { return getToken(CpGrammarParser.END, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CpGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CpGrammarParser.SEMICOLON, i);
		}
		public ComplexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).enterComplex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).exitComplex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CpGrammarVisitor ) return ((CpGrammarVisitor<? extends T>)visitor).visitComplex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexContext complex() throws RecognitionException {
		ComplexContext _localctx = new ComplexContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_complex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(BEGIN);
			setState(76);
			operator();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(77);
				match(SEMICOLON);
				setState(78);
				operator();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
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

	public static class AssignContext extends ParserRuleContext {
		public IdxContext idx() {
			return getRuleContext(IdxContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CpGrammarVisitor ) return ((CpGrammarVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			idx();
			setState(87);
			match(T__0);
			setState(88);
			expression(0);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CpGrammarParser.IF, 0); }
		public TerminalNode LB() { return getToken(CpGrammarParser.LB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RB() { return getToken(CpGrammarParser.RB, 0); }
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CpGrammarParser.ELSE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CpGrammarVisitor ) return ((CpGrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(IF);
			setState(91);
			match(LB);
			setState(92);
			expression(0);
			setState(93);
			match(RB);
			setState(94);
			operator();
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(95);
				match(ELSE);
				setState(96);
				operator();
				}
				break;
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

	public static class For_cycleContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CpGrammarParser.FOR, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode TO() { return getToken(CpGrammarParser.TO, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(CpGrammarParser.NEXT, 0); }
		public TerminalNode STEP() { return getToken(CpGrammarParser.STEP, 0); }
		public For_cycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_cycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).enterFor_cycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).exitFor_cycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CpGrammarVisitor ) return ((CpGrammarVisitor<? extends T>)visitor).visitFor_cycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_cycleContext for_cycle() throws RecognitionException {
		For_cycleContext _localctx = new For_cycleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for_cycle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(FOR);
			setState(100);
			assign();
			setState(101);
			match(TO);
			setState(102);
			expression(0);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(103);
				match(STEP);
				setState(104);
				expression(0);
				}
			}

			setState(107);
			operator();
			setState(108);
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

	public static class While_cycleContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CpGrammarParser.WHILE, 0); }
		public TerminalNode LB() { return getToken(CpGrammarParser.LB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RB() { return getToken(CpGrammarParser.RB, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public While_cycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_cycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).enterWhile_cycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).exitWhile_cycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CpGrammarVisitor ) return ((CpGrammarVisitor<? extends T>)visitor).visitWhile_cycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_cycleContext while_cycle() throws RecognitionException {
		While_cycleContext _localctx = new While_cycleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_cycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(WHILE);
			setState(111);
			match(LB);
			setState(112);
			expression(0);
			setState(113);
			match(RB);
			setState(114);
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
		public TerminalNode READLN() { return getToken(CpGrammarParser.READLN, 0); }
		public List<IdxContext> idx() {
			return getRuleContexts(IdxContext.class);
		}
		public IdxContext idx(int i) {
			return getRuleContext(IdxContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CpGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CpGrammarParser.COMMA, i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CpGrammarVisitor ) return ((CpGrammarVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(READLN);
			setState(117);
			idx();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(118);
				match(COMMA);
				setState(119);
				idx();
				}
				}
				setState(124);
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
		public TerminalNode WRITELN() { return getToken(CpGrammarParser.WRITELN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CpGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CpGrammarParser.COMMA, i);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CpGrammarVisitor ) return ((CpGrammarVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(WRITELN);
			setState(126);
			expression(0);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(127);
				match(COMMA);
				setState(128);
				expression(0);
				}
				}
				setState(133);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Sum_exprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SUM_OP() { return getToken(CpGrammarParser.SUM_OP, 0); }
		public Sum_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).enterSum_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).exitSum_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CpGrammarVisitor ) return ((CpGrammarVisitor<? extends T>)visitor).visitSum_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Unary_exrpContext extends ExpressionContext {
		public TerminalNode UNARY() { return getToken(CpGrammarParser.UNARY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Unary_exrpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).enterUnary_exrp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).exitUnary_exrp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CpGrammarVisitor ) return ((CpGrammarVisitor<? extends T>)visitor).visitUnary_exrp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rel_exprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode REL_OP() { return getToken(CpGrammarParser.REL_OP, 0); }
		public Rel_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).enterRel_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).exitRel_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CpGrammarVisitor ) return ((CpGrammarVisitor<? extends T>)visitor).visitRel_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Idx_exprContext extends ExpressionContext {
		public IdxContext idx() {
			return getRuleContext(IdxContext.class,0);
		}
		public Idx_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).enterIdx_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).exitIdx_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CpGrammarVisitor ) return ((CpGrammarVisitor<? extends T>)visitor).visitIdx_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Logic_exprContext extends ExpressionContext {
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public Logic_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).enterLogic_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).exitLogic_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CpGrammarVisitor ) return ((CpGrammarVisitor<? extends T>)visitor).visitLogic_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Number_exprContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(CpGrammarParser.NUMBER, 0); }
		public Number_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).enterNumber_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).exitNumber_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CpGrammarVisitor ) return ((CpGrammarVisitor<? extends T>)visitor).visitNumber_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Mul_exprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL_OP() { return getToken(CpGrammarParser.MUL_OP, 0); }
		public Mul_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).enterMul_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CpGrammarListener ) ((CpGrammarListener)listener).exitMul_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CpGrammarVisitor ) return ((CpGrammarVisitor<? extends T>)visitor).visitMul_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGIC_CONST:
				{
				_localctx = new Logic_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(135);
				logic();
				}
				break;
			case ID:
				{
				_localctx = new Idx_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				idx();
				}
				break;
			case NUMBER:
				{
				_localctx = new Number_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				match(NUMBER);
				}
				break;
			case UNARY:
				{
				_localctx = new Unary_exrpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				match(UNARY);
				setState(139);
				expression(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(151);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new Rel_exprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(142);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(143);
						match(REL_OP);
						setState(144);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new Sum_exprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(145);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(146);
						match(SUM_OP);
						setState(147);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new Mul_exprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(148);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(149);
						match(MUL_OP);
						setState(150);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u009f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\7\2\"\n\2\f\2\16\2"+
		"%\13\2\3\2\3\2\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\7\5:\n\5\f\5\16\5=\13\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7L\n\7\3\b\3\b\3\b\3\b\7\bR\n\b\f\b\16\bU\13"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nd\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13l\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\7\r{\n\r\f\r\16\r~\13\r\3\16\3\16\3\16\3\16\7\16"+
		"\u0084\n\16\f\16\16\16\u0087\13\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u008f\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u009a\n"+
		"\17\f\17\16\17\u009d\13\17\3\17\2\3\34\20\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\2\3\3\2\30\32\2\u00a4\2\36\3\2\2\2\4\61\3\2\2\2\6\63\3\2\2\2\b"+
		"\65\3\2\2\2\n@\3\2\2\2\fK\3\2\2\2\16M\3\2\2\2\20X\3\2\2\2\22\\\3\2\2\2"+
		"\24e\3\2\2\2\26p\3\2\2\2\30v\3\2\2\2\32\177\3\2\2\2\34\u008e\3\2\2\2\36"+
		"\37\7\23\2\2\37#\7\25\2\2 \"\5\b\5\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$"+
		"\3\2\2\2$&\3\2\2\2%#\3\2\2\2&,\7\26\2\2\'(\5\f\7\2()\7\7\2\2)+\3\2\2\2"+
		"*\'\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7\24"+
		"\2\2\60\3\3\2\2\2\61\62\7%\2\2\62\5\3\2\2\2\63\64\7\f\2\2\64\7\3\2\2\2"+
		"\65\66\5\n\6\2\66;\5\4\3\2\678\7\5\2\28:\5\4\3\29\67\3\2\2\2:=\3\2\2\2"+
		";9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7\7\2\2?\t\3\2\2\2@A\t\2\2"+
		"\2A\13\3\2\2\2BL\5\16\b\2CD\5\20\t\2DE\7\7\2\2EL\3\2\2\2FL\5\22\n\2GL"+
		"\5\24\13\2HL\5\26\f\2IL\5\30\r\2JL\5\32\16\2KB\3\2\2\2KC\3\2\2\2KF\3\2"+
		"\2\2KG\3\2\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L\r\3\2\2\2MN\7\26\2\2NS\5"+
		"\f\7\2OP\7\7\2\2PR\5\f\7\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3"+
		"\2\2\2US\3\2\2\2VW\7\27\2\2W\17\3\2\2\2XY\5\4\3\2YZ\7\3\2\2Z[\5\34\17"+
		"\2[\21\3\2\2\2\\]\7\35\2\2]^\7\b\2\2^_\5\34\17\2_`\7\t\2\2`c\5\f\7\2a"+
		"b\7\36\2\2bd\5\f\7\2ca\3\2\2\2cd\3\2\2\2d\23\3\2\2\2ef\7\37\2\2fg\5\20"+
		"\t\2gh\7 \2\2hk\5\34\17\2ij\7!\2\2jl\5\34\17\2ki\3\2\2\2kl\3\2\2\2lm\3"+
		"\2\2\2mn\5\f\7\2no\7\"\2\2o\25\3\2\2\2pq\7#\2\2qr\7\b\2\2rs\5\34\17\2"+
		"st\7\t\2\2tu\5\f\7\2u\27\3\2\2\2vw\7\33\2\2w|\5\4\3\2xy\7\5\2\2y{\5\4"+
		"\3\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\31\3\2\2\2~|\3\2\2\2\177"+
		"\u0080\7\34\2\2\u0080\u0085\5\34\17\2\u0081\u0082\7\5\2\2\u0082\u0084"+
		"\5\34\17\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\33\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089"+
		"\b\17\1\2\u0089\u008f\5\6\4\2\u008a\u008f\5\4\3\2\u008b\u008f\7&\2\2\u008c"+
		"\u008d\7\20\2\2\u008d\u008f\5\34\17\3\u008e\u0088\3\2\2\2\u008e\u008a"+
		"\3\2\2\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u009b\3\2\2\2\u0090"+
		"\u0091\f\6\2\2\u0091\u0092\7\r\2\2\u0092\u009a\5\34\17\7\u0093\u0094\f"+
		"\5\2\2\u0094\u0095\7\16\2\2\u0095\u009a\5\34\17\6\u0096\u0097\f\4\2\2"+
		"\u0097\u0098\7\17\2\2\u0098\u009a\5\34\17\5\u0099\u0090\3\2\2\2\u0099"+
		"\u0093\3\2\2\2\u0099\u0096\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\35\3\2\2\2\u009d\u009b\3\2\2\2\16#,;KS"+
		"ck|\u0085\u008e\u0099\u009b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}