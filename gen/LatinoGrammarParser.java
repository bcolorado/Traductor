// Generated from /home/carlos/languages/Traductor/grammar/LatinoGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LatinoGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, STRING=4, TKN_AND=5, TKN_OR=6, TKN_CONCAT=7, TKN_PERIOD=8, 
		TKN_COMMA=9, TKN_SEMICOLON=10, TKN_COLON=11, TKN_OPENING_KEY=12, TKN_CLOSING_KEY=13, 
		TKN_OPENING_BRA=14, TKN_CLOSING_BRA=15, TKN_OPENING_PAR=16, TKN_CLOSING_PAR=17, 
		TKN_INCREMENT=18, TKN_DECREMENT=19, TKN_MOD_ASSIGN=20, TKN_DIV_ASSIGN=21, 
		TKN_TIMES_ASSIGN=22, TKN_MINUS_ASSIGN=23, TKN_PLUS_ASSIGN=24, TKN_PLUS=25, 
		TKN_MINUS=26, TKN_TIMES=27, TKN_DIV=28, TKN_POWER=29, TKN_MOD=30, TKN_EQUAL=31, 
		TKN_NEQ=32, TKN_LEQ=33, TKN_GEQ=34, TKN_GREATER=35, TKN_LESS=36, TKN_REGEX=37, 
		TKN_ASSIGN=38, TKN_NOT=39, NUM=40, ID=41, ESPACIO=42;
	public static final int
		RULE_main_program = 0, RULE_substatement = 1, RULE_assign = 2, RULE_assignAux = 3, 
		RULE_assignmentOperator = 4, RULE_print_stat = 5, RULE_print_stat_cont = 6, 
		RULE_print_concat_string = 7, RULE_print_concat_string_aux = 8, RULE_print_operations = 9, 
		RULE_expr = 10, RULE_exprRest = 11, RULE_expBool = 12, RULE_expBoolRest = 13, 
		RULE_opRel = 14, RULE_expRel = 15, RULE_expArit = 16, RULE_expAritOp = 17, 
		RULE_term = 18, RULE_termOp = 19, RULE_factor = 20, RULE_factorOp = 21, 
		RULE_t_factor = 22, RULE_expr_terminals = 23, RULE_expr_factor = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"main_program", "substatement", "assign", "assignAux", "assignmentOperator", 
			"print_stat", "print_stat_cont", "print_concat_string", "print_concat_string_aux", 
			"print_operations", "expr", "exprRest", "expBool", "expBoolRest", "opRel", 
			"expRel", "expArit", "expAritOp", "term", "termOp", "factor", "factorOp", 
			"t_factor", "expr_terminals", "expr_factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'escribir'", "'imprimir'", "'poner'", null, "'&&'", "'||'", "'..'", 
			"'.'", "','", "';'", "':'", "'{'", "'}'", "'['", "']'", "'('", "')'", 
			"'++'", "'--'", "'%='", "'/='", "'*='", "'-='", "'+='", "'+'", "'-'", 
			"'*'", "'/'", "'^'", "'%'", "'=='", "'!='", "'<='", "'>='", "'>'", "'<'", 
			"'~='", "'='", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "STRING", "TKN_AND", "TKN_OR", "TKN_CONCAT", 
			"TKN_PERIOD", "TKN_COMMA", "TKN_SEMICOLON", "TKN_COLON", "TKN_OPENING_KEY", 
			"TKN_CLOSING_KEY", "TKN_OPENING_BRA", "TKN_CLOSING_BRA", "TKN_OPENING_PAR", 
			"TKN_CLOSING_PAR", "TKN_INCREMENT", "TKN_DECREMENT", "TKN_MOD_ASSIGN", 
			"TKN_DIV_ASSIGN", "TKN_TIMES_ASSIGN", "TKN_MINUS_ASSIGN", "TKN_PLUS_ASSIGN", 
			"TKN_PLUS", "TKN_MINUS", "TKN_TIMES", "TKN_DIV", "TKN_POWER", "TKN_MOD", 
			"TKN_EQUAL", "TKN_NEQ", "TKN_LEQ", "TKN_GEQ", "TKN_GREATER", "TKN_LESS", 
			"TKN_REGEX", "TKN_ASSIGN", "TKN_NOT", "NUM", "ID", "ESPACIO"
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
	public String getGrammarFileName() { return "LatinoGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LatinoGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Main_programContext extends ParserRuleContext {
		public SubstatementContext substatement() {
			return getRuleContext(SubstatementContext.class,0);
		}
		public Main_programContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterMain_program(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitMain_program(this);
		}
	}

	public final Main_programContext main_program() throws RecognitionException {
		Main_programContext _localctx = new Main_programContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			substatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubstatementContext extends ParserRuleContext {
		public Print_statContext print_stat() {
			return getRuleContext(Print_statContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public SubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterSubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitSubstatement(this);
		}
	}

	public final SubstatementContext substatement() throws RecognitionException {
		SubstatementContext _localctx = new SubstatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_substatement);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				print_stat();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				assign();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LatinoGrammarParser.ID, 0); }
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SubstatementContext substatement() {
			return getRuleContext(SubstatementContext.class,0);
		}
		public AssignAuxContext assignAux() {
			return getRuleContext(AssignAuxContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assign);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(ID);
				setState(58);
				assignmentOperator();
				setState(59);
				expr();
				setState(60);
				substatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(ID);
				setState(63);
				assignAux();
				setState(64);
				expr();
				setState(65);
				substatement();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignAuxContext extends ParserRuleContext {
		public List<TerminalNode> TKN_COMMA() { return getTokens(LatinoGrammarParser.TKN_COMMA); }
		public TerminalNode TKN_COMMA(int i) {
			return getToken(LatinoGrammarParser.TKN_COMMA, i);
		}
		public TerminalNode ID() { return getToken(LatinoGrammarParser.ID, 0); }
		public AssignAuxContext assignAux() {
			return getRuleContext(AssignAuxContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TKN_ASSIGN() { return getToken(LatinoGrammarParser.TKN_ASSIGN, 0); }
		public AssignAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterAssignAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitAssignAux(this);
		}
	}

	public final AssignAuxContext assignAux() throws RecognitionException {
		AssignAuxContext _localctx = new AssignAuxContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignAux);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(69);
				match(TKN_COMMA);
				}
				{
				setState(70);
				match(ID);
				}
				{
				setState(71);
				assignAux();
				}
				{
				setState(72);
				expr();
				}
				{
				setState(73);
				match(TKN_COMMA);
				}
				}
				break;
			case TKN_ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(TKN_ASSIGN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode TKN_DIV_ASSIGN() { return getToken(LatinoGrammarParser.TKN_DIV_ASSIGN, 0); }
		public TerminalNode TKN_MOD_ASSIGN() { return getToken(LatinoGrammarParser.TKN_MOD_ASSIGN, 0); }
		public TerminalNode TKN_PLUS_ASSIGN() { return getToken(LatinoGrammarParser.TKN_PLUS_ASSIGN, 0); }
		public TerminalNode TKN_MINUS_ASSIGN() { return getToken(LatinoGrammarParser.TKN_MINUS_ASSIGN, 0); }
		public TerminalNode TKN_TIMES_ASSIGN() { return getToken(LatinoGrammarParser.TKN_TIMES_ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32505856L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Print_statContext extends ParserRuleContext {
		public Print_operationsContext print_operations() {
			return getRuleContext(Print_operationsContext.class,0);
		}
		public TerminalNode TKN_OPENING_PAR() { return getToken(LatinoGrammarParser.TKN_OPENING_PAR, 0); }
		public Print_stat_contContext print_stat_cont() {
			return getRuleContext(Print_stat_contContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(LatinoGrammarParser.TKN_CLOSING_PAR, 0); }
		public SubstatementContext substatement() {
			return getRuleContext(SubstatementContext.class,0);
		}
		public Print_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterPrint_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitPrint_stat(this);
		}
	}

	public final Print_statContext print_stat() throws RecognitionException {
		Print_statContext _localctx = new Print_statContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			print_operations();
			setState(81);
			match(TKN_OPENING_PAR);
			setState(82);
			print_stat_cont();
			setState(83);
			match(TKN_CLOSING_PAR);
			setState(84);
			substatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Print_stat_contContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Print_concat_stringContext print_concat_string() {
			return getRuleContext(Print_concat_stringContext.class,0);
		}
		public Print_stat_contContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stat_cont; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterPrint_stat_cont(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitPrint_stat_cont(this);
		}
	}

	public final Print_stat_contContext print_stat_cont() throws RecognitionException {
		Print_stat_contContext _localctx = new Print_stat_contContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print_stat_cont);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				print_concat_string();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Print_concat_stringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(LatinoGrammarParser.STRING, 0); }
		public Print_concat_string_auxContext print_concat_string_aux() {
			return getRuleContext(Print_concat_string_auxContext.class,0);
		}
		public Print_concat_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_concat_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterPrint_concat_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitPrint_concat_string(this);
		}
	}

	public final Print_concat_stringContext print_concat_string() throws RecognitionException {
		Print_concat_stringContext _localctx = new Print_concat_stringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print_concat_string);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(STRING);
				setState(91);
				print_concat_string_aux();
				}
				break;
			case TKN_CLOSING_PAR:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Print_concat_string_auxContext extends ParserRuleContext {
		public TerminalNode TKN_CONCAT() { return getToken(LatinoGrammarParser.TKN_CONCAT, 0); }
		public TerminalNode STRING() { return getToken(LatinoGrammarParser.STRING, 0); }
		public Print_concat_string_auxContext print_concat_string_aux() {
			return getRuleContext(Print_concat_string_auxContext.class,0);
		}
		public Print_concat_string_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_concat_string_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterPrint_concat_string_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitPrint_concat_string_aux(this);
		}
	}

	public final Print_concat_string_auxContext print_concat_string_aux() throws RecognitionException {
		Print_concat_string_auxContext _localctx = new Print_concat_string_auxContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_print_concat_string_aux);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_CONCAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(TKN_CONCAT);
				setState(96);
				match(STRING);
				setState(97);
				print_concat_string_aux();
				}
				break;
			case TKN_CLOSING_PAR:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Print_operationsContext extends ParserRuleContext {
		public Print_operationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterPrint_operations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitPrint_operations(this);
		}
	}

	public final Print_operationsContext print_operations() throws RecognitionException {
		Print_operationsContext _localctx = new Print_operationsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_print_operations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExpBoolContext expBool() {
			return getRuleContext(ExpBoolContext.class,0);
		}
		public ExprRestContext exprRest() {
			return getRuleContext(ExprRestContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			expBool();
			setState(104);
			exprRest();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprRestContext extends ParserRuleContext {
		public TerminalNode TKN_OR() { return getToken(LatinoGrammarParser.TKN_OR, 0); }
		public ExpBoolContext expBool() {
			return getRuleContext(ExpBoolContext.class,0);
		}
		public ExprRestContext exprRest() {
			return getRuleContext(ExprRestContext.class,0);
		}
		public ExprRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterExprRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitExprRest(this);
		}
	}

	public final ExprRestContext exprRest() throws RecognitionException {
		ExprRestContext _localctx = new ExprRestContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exprRest);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(TKN_OR);
				setState(107);
				expBool();
				setState(108);
				exprRest();
				}
				break;
			case EOF:
			case T__0:
			case T__1:
			case T__2:
			case TKN_COMMA:
			case TKN_CLOSING_PAR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpBoolContext extends ParserRuleContext {
		public ExpRelContext expRel() {
			return getRuleContext(ExpRelContext.class,0);
		}
		public ExpBoolRestContext expBoolRest() {
			return getRuleContext(ExpBoolRestContext.class,0);
		}
		public ExpBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterExpBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitExpBool(this);
		}
	}

	public final ExpBoolContext expBool() throws RecognitionException {
		ExpBoolContext _localctx = new ExpBoolContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			expRel();
			setState(114);
			expBoolRest();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpBoolRestContext extends ParserRuleContext {
		public TerminalNode TKN_AND() { return getToken(LatinoGrammarParser.TKN_AND, 0); }
		public ExpRelContext expRel() {
			return getRuleContext(ExpRelContext.class,0);
		}
		public ExpBoolRestContext expBoolRest() {
			return getRuleContext(ExpBoolRestContext.class,0);
		}
		public ExpBoolRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expBoolRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterExpBoolRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitExpBoolRest(this);
		}
	}

	public final ExpBoolRestContext expBoolRest() throws RecognitionException {
		ExpBoolRestContext _localctx = new ExpBoolRestContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expBoolRest);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(TKN_AND);
				setState(117);
				expRel();
				setState(118);
				expBoolRest();
				}
				break;
			case EOF:
			case T__0:
			case T__1:
			case T__2:
			case TKN_OR:
			case TKN_COMMA:
			case TKN_CLOSING_PAR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpRelContext extends ParserRuleContext {
		public TerminalNode TKN_EQUAL() { return getToken(LatinoGrammarParser.TKN_EQUAL, 0); }
		public TerminalNode TKN_GEQ() { return getToken(LatinoGrammarParser.TKN_GEQ, 0); }
		public TerminalNode TKN_GREATER() { return getToken(LatinoGrammarParser.TKN_GREATER, 0); }
		public TerminalNode TKN_LEQ() { return getToken(LatinoGrammarParser.TKN_LEQ, 0); }
		public TerminalNode TKN_LESS() { return getToken(LatinoGrammarParser.TKN_LESS, 0); }
		public TerminalNode TKN_NEQ() { return getToken(LatinoGrammarParser.TKN_NEQ, 0); }
		public OpRelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opRel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterOpRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitOpRel(this);
		}
	}

	public final OpRelContext opRel() throws RecognitionException {
		OpRelContext _localctx = new OpRelContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_opRel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 135291469824L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpRelContext extends ParserRuleContext {
		public List<ExpAritContext> expArit() {
			return getRuleContexts(ExpAritContext.class);
		}
		public ExpAritContext expArit(int i) {
			return getRuleContext(ExpAritContext.class,i);
		}
		public OpRelContext opRel() {
			return getRuleContext(OpRelContext.class,0);
		}
		public ExpRelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expRel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterExpRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitExpRel(this);
		}
	}

	public final ExpRelContext expRel() throws RecognitionException {
		ExpRelContext _localctx = new ExpRelContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expRel);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(125);
				expArit();
				}
				{
				setState(126);
				opRel();
				}
				{
				setState(127);
				expArit();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(129);
				expArit();
				}
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpAritContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<ExpAritOpContext> expAritOp() {
			return getRuleContexts(ExpAritOpContext.class);
		}
		public ExpAritOpContext expAritOp(int i) {
			return getRuleContext(ExpAritOpContext.class,i);
		}
		public ExpAritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expArit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterExpArit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitExpArit(this);
		}
	}

	public final ExpAritContext expArit() throws RecognitionException {
		ExpAritContext _localctx = new ExpAritContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expArit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			term();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_PLUS || _la==TKN_MINUS) {
				{
				{
				setState(133);
				expAritOp();
				setState(134);
				term();
				}
				}
				setState(140);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpAritOpContext extends ParserRuleContext {
		public TerminalNode TKN_PLUS() { return getToken(LatinoGrammarParser.TKN_PLUS, 0); }
		public TerminalNode TKN_MINUS() { return getToken(LatinoGrammarParser.TKN_MINUS, 0); }
		public ExpAritOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expAritOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterExpAritOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitExpAritOp(this);
		}
	}

	public final ExpAritOpContext expAritOp() throws RecognitionException {
		ExpAritOpContext _localctx = new ExpAritOpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expAritOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !(_la==TKN_PLUS || _la==TKN_MINUS) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TermOpContext> termOp() {
			return getRuleContexts(TermOpContext.class);
		}
		public TermOpContext termOp(int i) {
			return getRuleContext(TermOpContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			factor();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1476395008L) != 0)) {
				{
				{
				setState(144);
				termOp();
				setState(145);
				factor();
				}
				}
				setState(151);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermOpContext extends ParserRuleContext {
		public TerminalNode TKN_TIMES() { return getToken(LatinoGrammarParser.TKN_TIMES, 0); }
		public TerminalNode TKN_DIV() { return getToken(LatinoGrammarParser.TKN_DIV, 0); }
		public TerminalNode TKN_MOD() { return getToken(LatinoGrammarParser.TKN_MOD, 0); }
		public TermOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterTermOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitTermOp(this);
		}
	}

	public final TermOpContext termOp() throws RecognitionException {
		TermOpContext _localctx = new TermOpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_termOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1476395008L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public List<T_factorContext> t_factor() {
			return getRuleContexts(T_factorContext.class);
		}
		public T_factorContext t_factor(int i) {
			return getRuleContext(T_factorContext.class,i);
		}
		public List<FactorOpContext> factorOp() {
			return getRuleContexts(FactorOpContext.class);
		}
		public FactorOpContext factorOp(int i) {
			return getRuleContext(FactorOpContext.class,i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			t_factor();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_POWER) {
				{
				{
				setState(155);
				factorOp();
				setState(156);
				t_factor();
				}
				}
				setState(162);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorOpContext extends ParserRuleContext {
		public TerminalNode TKN_POWER() { return getToken(LatinoGrammarParser.TKN_POWER, 0); }
		public FactorOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterFactorOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitFactorOp(this);
		}
	}

	public final FactorOpContext factorOp() throws RecognitionException {
		FactorOpContext _localctx = new FactorOpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_factorOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(TKN_POWER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class T_factorContext extends ParserRuleContext {
		public Expr_factorContext expr_factor() {
			return getRuleContext(Expr_factorContext.class,0);
		}
		public Expr_terminalsContext expr_terminals() {
			return getRuleContext(Expr_terminalsContext.class,0);
		}
		public T_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterT_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitT_factor(this);
		}
	}

	public final T_factorContext t_factor() throws RecognitionException {
		T_factorContext _localctx = new T_factorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_t_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(165);
			expr_factor();
			}
			{
			setState(166);
			expr_terminals();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_terminalsContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(LatinoGrammarParser.NUM, 0); }
		public TerminalNode ID() { return getToken(LatinoGrammarParser.ID, 0); }
		public TerminalNode TKN_OPENING_PAR() { return getToken(LatinoGrammarParser.TKN_OPENING_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(LatinoGrammarParser.TKN_CLOSING_PAR, 0); }
		public TerminalNode STRING() { return getToken(LatinoGrammarParser.STRING, 0); }
		public Expr_terminalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_terminals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterExpr_terminals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitExpr_terminals(this);
		}
	}

	public final Expr_terminalsContext expr_terminals() throws RecognitionException {
		Expr_terminalsContext _localctx = new Expr_terminalsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr_terminals);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(NUM);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(ID);
				}
				break;
			case TKN_OPENING_PAR:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(170);
				match(TKN_OPENING_PAR);
				}
				{
				setState(171);
				expr();
				}
				{
				setState(172);
				match(TKN_CLOSING_PAR);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_factorContext extends ParserRuleContext {
		public List<TerminalNode> TKN_MINUS() { return getTokens(LatinoGrammarParser.TKN_MINUS); }
		public TerminalNode TKN_MINUS(int i) {
			return getToken(LatinoGrammarParser.TKN_MINUS, i);
		}
		public List<TerminalNode> TKN_PLUS() { return getTokens(LatinoGrammarParser.TKN_PLUS); }
		public TerminalNode TKN_PLUS(int i) {
			return getToken(LatinoGrammarParser.TKN_PLUS, i);
		}
		public List<TerminalNode> TKN_NOT() { return getTokens(LatinoGrammarParser.TKN_NOT); }
		public TerminalNode TKN_NOT(int i) {
			return getToken(LatinoGrammarParser.TKN_NOT, i);
		}
		public Expr_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterExpr_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitExpr_factor(this);
		}
	}

	public final Expr_factorContext expr_factor() throws RecognitionException {
		Expr_factorContext _localctx = new Expr_factorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549856477184L) != 0)) {
				{
				{
				setState(177);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 549856477184L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(182);
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

	public static final String _serializedATN =
		"\u0004\u0001*\u00b8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"8\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"D\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003M\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0003\u0006Y\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007^\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bd\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bp\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\rz\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0083\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u0089\b\u0010\n\u0010\f\u0010\u008c\t\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u0094\b\u0012\n\u0012\f\u0012\u0097\t\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u009f\b\u0014\n"+
		"\u0014\f\u0014\u00a2\t\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00b0\b\u0017\u0001\u0018\u0005"+
		"\u0018\u00b3\b\u0018\n\u0018\f\u0018\u00b6\t\u0018\u0001\u0018\u0000\u0000"+
		"\u0019\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.0\u0000\u0006\u0001\u0000\u0014\u0018\u0001"+
		"\u0000\u0001\u0003\u0001\u0000\u001f$\u0001\u0000\u0019\u001a\u0002\u0000"+
		"\u001b\u001c\u001e\u001e\u0002\u0000\u0019\u001a\'\'\u00af\u00002\u0001"+
		"\u0000\u0000\u0000\u00027\u0001\u0000\u0000\u0000\u0004C\u0001\u0000\u0000"+
		"\u0000\u0006L\u0001\u0000\u0000\u0000\bN\u0001\u0000\u0000\u0000\nP\u0001"+
		"\u0000\u0000\u0000\fX\u0001\u0000\u0000\u0000\u000e]\u0001\u0000\u0000"+
		"\u0000\u0010c\u0001\u0000\u0000\u0000\u0012e\u0001\u0000\u0000\u0000\u0014"+
		"g\u0001\u0000\u0000\u0000\u0016o\u0001\u0000\u0000\u0000\u0018q\u0001"+
		"\u0000\u0000\u0000\u001ay\u0001\u0000\u0000\u0000\u001c{\u0001\u0000\u0000"+
		"\u0000\u001e\u0082\u0001\u0000\u0000\u0000 \u0084\u0001\u0000\u0000\u0000"+
		"\"\u008d\u0001\u0000\u0000\u0000$\u008f\u0001\u0000\u0000\u0000&\u0098"+
		"\u0001\u0000\u0000\u0000(\u009a\u0001\u0000\u0000\u0000*\u00a3\u0001\u0000"+
		"\u0000\u0000,\u00a5\u0001\u0000\u0000\u0000.\u00af\u0001\u0000\u0000\u0000"+
		"0\u00b4\u0001\u0000\u0000\u000023\u0003\u0002\u0001\u00003\u0001\u0001"+
		"\u0000\u0000\u000048\u0003\n\u0005\u000058\u0003\u0004\u0002\u000068\u0001"+
		"\u0000\u0000\u000074\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"76\u0001\u0000\u0000\u00008\u0003\u0001\u0000\u0000\u00009:\u0005)\u0000"+
		"\u0000:;\u0003\b\u0004\u0000;<\u0003\u0014\n\u0000<=\u0003\u0002\u0001"+
		"\u0000=D\u0001\u0000\u0000\u0000>?\u0005)\u0000\u0000?@\u0003\u0006\u0003"+
		"\u0000@A\u0003\u0014\n\u0000AB\u0003\u0002\u0001\u0000BD\u0001\u0000\u0000"+
		"\u0000C9\u0001\u0000\u0000\u0000C>\u0001\u0000\u0000\u0000D\u0005\u0001"+
		"\u0000\u0000\u0000EF\u0005\t\u0000\u0000FG\u0005)\u0000\u0000GH\u0003"+
		"\u0006\u0003\u0000HI\u0003\u0014\n\u0000IJ\u0005\t\u0000\u0000JM\u0001"+
		"\u0000\u0000\u0000KM\u0005&\u0000\u0000LE\u0001\u0000\u0000\u0000LK\u0001"+
		"\u0000\u0000\u0000M\u0007\u0001\u0000\u0000\u0000NO\u0007\u0000\u0000"+
		"\u0000O\t\u0001\u0000\u0000\u0000PQ\u0003\u0012\t\u0000QR\u0005\u0010"+
		"\u0000\u0000RS\u0003\f\u0006\u0000ST\u0005\u0011\u0000\u0000TU\u0003\u0002"+
		"\u0001\u0000U\u000b\u0001\u0000\u0000\u0000VY\u0003\u0014\n\u0000WY\u0003"+
		"\u000e\u0007\u0000XV\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000"+
		"Y\r\u0001\u0000\u0000\u0000Z[\u0005\u0004\u0000\u0000[^\u0003\u0010\b"+
		"\u0000\\^\u0001\u0000\u0000\u0000]Z\u0001\u0000\u0000\u0000]\\\u0001\u0000"+
		"\u0000\u0000^\u000f\u0001\u0000\u0000\u0000_`\u0005\u0007\u0000\u0000"+
		"`a\u0005\u0004\u0000\u0000ad\u0003\u0010\b\u0000bd\u0001\u0000\u0000\u0000"+
		"c_\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000d\u0011\u0001\u0000"+
		"\u0000\u0000ef\u0007\u0001\u0000\u0000f\u0013\u0001\u0000\u0000\u0000"+
		"gh\u0003\u0018\f\u0000hi\u0003\u0016\u000b\u0000i\u0015\u0001\u0000\u0000"+
		"\u0000jk\u0005\u0006\u0000\u0000kl\u0003\u0018\f\u0000lm\u0003\u0016\u000b"+
		"\u0000mp\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000oj\u0001\u0000"+
		"\u0000\u0000on\u0001\u0000\u0000\u0000p\u0017\u0001\u0000\u0000\u0000"+
		"qr\u0003\u001e\u000f\u0000rs\u0003\u001a\r\u0000s\u0019\u0001\u0000\u0000"+
		"\u0000tu\u0005\u0005\u0000\u0000uv\u0003\u001e\u000f\u0000vw\u0003\u001a"+
		"\r\u0000wz\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000yt\u0001\u0000"+
		"\u0000\u0000yx\u0001\u0000\u0000\u0000z\u001b\u0001\u0000\u0000\u0000"+
		"{|\u0007\u0002\u0000\u0000|\u001d\u0001\u0000\u0000\u0000}~\u0003 \u0010"+
		"\u0000~\u007f\u0003\u001c\u000e\u0000\u007f\u0080\u0003 \u0010\u0000\u0080"+
		"\u0083\u0001\u0000\u0000\u0000\u0081\u0083\u0003 \u0010\u0000\u0082}\u0001"+
		"\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u001f\u0001"+
		"\u0000\u0000\u0000\u0084\u008a\u0003$\u0012\u0000\u0085\u0086\u0003\""+
		"\u0011\u0000\u0086\u0087\u0003$\u0012\u0000\u0087\u0089\u0001\u0000\u0000"+
		"\u0000\u0088\u0085\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000"+
		"\u0000\u008b!\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0007\u0003\u0000\u0000\u008e#\u0001\u0000\u0000\u0000\u008f"+
		"\u0095\u0003(\u0014\u0000\u0090\u0091\u0003&\u0013\u0000\u0091\u0092\u0003"+
		"(\u0014\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0090\u0001\u0000"+
		"\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096%\u0001\u0000\u0000"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0007\u0004\u0000"+
		"\u0000\u0099\'\u0001\u0000\u0000\u0000\u009a\u00a0\u0003,\u0016\u0000"+
		"\u009b\u009c\u0003*\u0015\u0000\u009c\u009d\u0003,\u0016\u0000\u009d\u009f"+
		"\u0001\u0000\u0000\u0000\u009e\u009b\u0001\u0000\u0000\u0000\u009f\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a1)\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0005\u001d\u0000\u0000\u00a4+\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u00030\u0018\u0000\u00a6\u00a7\u0003.\u0017\u0000"+
		"\u00a7-\u0001\u0000\u0000\u0000\u00a8\u00b0\u0005(\u0000\u0000\u00a9\u00b0"+
		"\u0005)\u0000\u0000\u00aa\u00ab\u0005\u0010\u0000\u0000\u00ab\u00ac\u0003"+
		"\u0014\n\u0000\u00ac\u00ad\u0005\u0011\u0000\u0000\u00ad\u00b0\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b0\u0005\u0004\u0000\u0000\u00af\u00a8\u0001\u0000"+
		"\u0000\u0000\u00af\u00a9\u0001\u0000\u0000\u0000\u00af\u00aa\u0001\u0000"+
		"\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0/\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b3\u0007\u0005\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b51\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b4\u0001\u0000\u0000\u0000\u000e7CLX]coy\u0082\u008a\u0095\u00a0"+
		"\u00af\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}