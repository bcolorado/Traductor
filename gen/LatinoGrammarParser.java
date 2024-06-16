// Generated from C:/Users/Usuario/Desktop/Lenguajes/Traductor/Traductor/grammar/LatinoGrammar.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, STRING=30, TKN_AND=31, 
		TKN_OR=32, TKN_CONCAT=33, TKN_PERIOD=34, TKN_COMMA=35, TKN_SEMICOLON=36, 
		TKN_COLON=37, TKN_OPENING_KEY=38, TKN_CLOSING_KEY=39, TKN_OPENING_BRA=40, 
		TKN_CLOSING_BRA=41, TKN_OPENING_PAR=42, TKN_CLOSING_PAR=43, TKN_INCREMENT=44, 
		TKN_DECREMENT=45, TKN_MOD_ASSIGN=46, TKN_DIV_ASSIGN=47, TKN_TIMES_ASSIGN=48, 
		TKN_MINUS_ASSIGN=49, TKN_PLUS_ASSIGN=50, TKN_PLUS=51, TKN_MINUS=52, TKN_TIMES=53, 
		TKN_DIV=54, TKN_POWER=55, TKN_MOD=56, TKN_EQUAL=57, TKN_NEQ=58, TKN_LEQ=59, 
		TKN_GEQ=60, TKN_GREATER=61, TKN_LESS=62, TKN_REGEX=63, TKN_ASSIGN=64, 
		TKN_NOT=65, NUM=66, ID=67, ESPACIO=68, COMMENT_LINE=69, COMMENT_BLOCK=70;
	public static final int
		RULE_main_program = 0, RULE_substatement = 1, RULE_assign = 2, RULE_assignAux = 3, 
		RULE_assignmentOperator = 4, RULE_assignIncrDecr = 5, RULE_built_in_functions = 6, 
		RULE_acadena_stat = 7, RULE_incluir_stat = 8, RULE_leer_stat = 9, RULE_limpiar_stat = 10, 
		RULE_alogico_stat = 11, RULE_anumero_stat = 12, RULE_print_stat = 13, 
		RULE_print_stat_cont = 14, RULE_print_operations = 15, RULE_array_printing = 16, 
		RULE_function_stat = 17, RULE_function_name = 18, RULE_function_op = 19, 
		RULE_function_pars = 20, RULE_function_args = 21, RULE_function_args_aux = 22, 
		RULE_function_ret = 23, RULE_function_ret_op = 24, RULE_function_content = 25, 
		RULE_special_methods = 26, RULE_longitud_method = 27, RULE_brakets = 28, 
		RULE_function_call = 29, RULE_array = 30, RULE_array_content = 31, RULE_array_content_aux = 32, 
		RULE_conditionals = 33, RULE_loops = 34, RULE_if_conditional = 35, RULE_conditional_expr = 36, 
		RULE_conditional_substatement = 37, RULE_if_conditional_aux = 38, RULE_swicth_condition = 39, 
		RULE_caseBlock = 40, RULE_caseClause = 41, RULE_caseClauseExpr = 42, RULE_defaultClause = 43, 
		RULE_otherClause = 44, RULE_romperOp = 45, RULE_mientras_loop = 46, RULE_desde_loop = 47, 
		RULE_loop_substatement = 48, RULE_triple_expr = 49, RULE_loop_assign = 50, 
		RULE_loop_assignAux = 51, RULE_loop_assignmentOperator = 52, RULE_loop_assignIncrDecr = 53, 
		RULE_loop_expr = 54, RULE_loop_exprRest = 55, RULE_loop_expBool = 56, 
		RULE_loop_expBoolRest = 57, RULE_loop_opRel = 58, RULE_loop_expRel = 59, 
		RULE_loop_exprConcat = 60, RULE_loop_exprConcatOp = 61, RULE_loop_expArit = 62, 
		RULE_loop_expAritOp = 63, RULE_loop_term = 64, RULE_loop_termOp = 65, 
		RULE_loop_factor = 66, RULE_loop_factorOp = 67, RULE_loop_t_factor = 68, 
		RULE_loop_expr_terminals = 69, RULE_expr = 70, RULE_exprRest = 71, RULE_expBool = 72, 
		RULE_expBoolRest = 73, RULE_opRel = 74, RULE_expRel = 75, RULE_exprConcat = 76, 
		RULE_exprConcatOp = 77, RULE_expArit = 78, RULE_expAritOp = 79, RULE_term = 80, 
		RULE_termOp = 81, RULE_factor = 82, RULE_factorOp = 83, RULE_t_factor = 84, 
		RULE_expr_terminals = 85, RULE_expr_factor = 86;
	private static String[] makeRuleNames() {
		return new String[] {
			"main_program", "substatement", "assign", "assignAux", "assignmentOperator", 
			"assignIncrDecr", "built_in_functions", "acadena_stat", "incluir_stat", 
			"leer_stat", "limpiar_stat", "alogico_stat", "anumero_stat", "print_stat", 
			"print_stat_cont", "print_operations", "array_printing", "function_stat", 
			"function_name", "function_op", "function_pars", "function_args", "function_args_aux", 
			"function_ret", "function_ret_op", "function_content", "special_methods", 
			"longitud_method", "brakets", "function_call", "array", "array_content", 
			"array_content_aux", "conditionals", "loops", "if_conditional", "conditional_expr", 
			"conditional_substatement", "if_conditional_aux", "swicth_condition", 
			"caseBlock", "caseClause", "caseClauseExpr", "defaultClause", "otherClause", 
			"romperOp", "mientras_loop", "desde_loop", "loop_substatement", "triple_expr", 
			"loop_assign", "loop_assignAux", "loop_assignmentOperator", "loop_assignIncrDecr", 
			"loop_expr", "loop_exprRest", "loop_expBool", "loop_expBoolRest", "loop_opRel", 
			"loop_expRel", "loop_exprConcat", "loop_exprConcatOp", "loop_expArit", 
			"loop_expAritOp", "loop_term", "loop_termOp", "loop_factor", "loop_factorOp", 
			"loop_t_factor", "loop_expr_terminals", "expr", "exprRest", "expBool", 
			"expBoolRest", "opRel", "expRel", "exprConcat", "exprConcatOp", "expArit", 
			"expAritOp", "term", "termOp", "factor", "factorOp", "t_factor", "expr_terminals", 
			"expr_factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'acadena'", "'incluir'", "'leer'", "'limpiar'", "'alogico'", "'anumero'", 
			"'escribir'", "'imprimir'", "'poner'", "'fin'", "'funcion'", "'fun'", 
			"'retornar'", "'regresar'", "'ret'", "'lista'", "'longitud'", "'si'", 
			"'osi'", "'sino'", "'elegir'", "'caso'", "'defecto'", "'otro'", "'romper'", 
			"'mientras'", "'desde'", "'verdadero'", "'falso'", null, "'&&'", "'||'", 
			"'..'", "'.'", "','", "';'", "':'", "'{'", "'}'", "'['", "']'", "'('", 
			"')'", "'++'", "'--'", "'%='", "'/='", "'*='", "'-='", "'+='", "'+'", 
			"'-'", "'*'", "'/'", "'^'", "'%'", "'=='", "'!='", "'<='", "'>='", "'>'", 
			"'<'", "'~='", "'='", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "STRING", "TKN_AND", "TKN_OR", "TKN_CONCAT", 
			"TKN_PERIOD", "TKN_COMMA", "TKN_SEMICOLON", "TKN_COLON", "TKN_OPENING_KEY", 
			"TKN_CLOSING_KEY", "TKN_OPENING_BRA", "TKN_CLOSING_BRA", "TKN_OPENING_PAR", 
			"TKN_CLOSING_PAR", "TKN_INCREMENT", "TKN_DECREMENT", "TKN_MOD_ASSIGN", 
			"TKN_DIV_ASSIGN", "TKN_TIMES_ASSIGN", "TKN_MINUS_ASSIGN", "TKN_PLUS_ASSIGN", 
			"TKN_PLUS", "TKN_MINUS", "TKN_TIMES", "TKN_DIV", "TKN_POWER", "TKN_MOD", 
			"TKN_EQUAL", "TKN_NEQ", "TKN_LEQ", "TKN_GEQ", "TKN_GREATER", "TKN_LESS", 
			"TKN_REGEX", "TKN_ASSIGN", "TKN_NOT", "NUM", "ID", "ESPACIO", "COMMENT_LINE", 
			"COMMENT_BLOCK"
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
			setState(174);
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
		public SubstatementContext substatement() {
			return getRuleContext(SubstatementContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Built_in_functionsContext built_in_functions() {
			return getRuleContext(Built_in_functionsContext.class,0);
		}
		public Function_statContext function_stat() {
			return getRuleContext(Function_statContext.class,0);
		}
		public Special_methodsContext special_methods() {
			return getRuleContext(Special_methodsContext.class,0);
		}
		public ConditionalsContext conditionals() {
			return getRuleContext(ConditionalsContext.class,0);
		}
		public LoopsContext loops() {
			return getRuleContext(LoopsContext.class,0);
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
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				print_stat();
				setState(177);
				substatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				assign();
				setState(180);
				substatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				built_in_functions();
				setState(183);
				substatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				function_stat();
				setState(186);
				substatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
				special_methods();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(189);
				conditionals();
				setState(190);
				substatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(192);
				loops();
				setState(193);
				substatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
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
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LatinoGrammarParser.ID, 0); }
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignAuxContext assignAux() {
			return getRuleContext(AssignAuxContext.class,0);
		}
		public AssignIncrDecrContext assignIncrDecr() {
			return getRuleContext(AssignIncrDecrContext.class,0);
		}
		public Array_printingContext array_printing() {
			return getRuleContext(Array_printingContext.class,0);
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
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(ID);
				setState(199);
				assignmentOperator();
				setState(200);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(ID);
				setState(203);
				assignAux();
				setState(204);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(ID);
				setState(207);
				assignIncrDecr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				match(ID);
				setState(209);
				array_printing();
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
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(212);
				match(TKN_COMMA);
				}
				{
				setState(213);
				match(ID);
				}
				{
				setState(214);
				assignAux();
				}
				{
				setState(215);
				expr();
				}
				{
				setState(216);
				match(TKN_COMMA);
				}
				}
				break;
			case TKN_ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
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
			setState(221);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2181431069507584L) != 0)) ) {
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
	public static class AssignIncrDecrContext extends ParserRuleContext {
		public TerminalNode TKN_INCREMENT() { return getToken(LatinoGrammarParser.TKN_INCREMENT, 0); }
		public TerminalNode TKN_DECREMENT() { return getToken(LatinoGrammarParser.TKN_DECREMENT, 0); }
		public AssignIncrDecrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignIncrDecr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterAssignIncrDecr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitAssignIncrDecr(this);
		}
	}

	public final AssignIncrDecrContext assignIncrDecr() throws RecognitionException {
		AssignIncrDecrContext _localctx = new AssignIncrDecrContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignIncrDecr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !(_la==TKN_INCREMENT || _la==TKN_DECREMENT) ) {
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
	public static class Built_in_functionsContext extends ParserRuleContext {
		public Incluir_statContext incluir_stat() {
			return getRuleContext(Incluir_statContext.class,0);
		}
		public Leer_statContext leer_stat() {
			return getRuleContext(Leer_statContext.class,0);
		}
		public Limpiar_statContext limpiar_stat() {
			return getRuleContext(Limpiar_statContext.class,0);
		}
		public Built_in_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_built_in_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterBuilt_in_functions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitBuilt_in_functions(this);
		}
	}

	public final Built_in_functionsContext built_in_functions() throws RecognitionException {
		Built_in_functionsContext _localctx = new Built_in_functionsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_built_in_functions);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				incluir_stat();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				leer_stat();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				limpiar_stat();
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
	public static class Acadena_statContext extends ParserRuleContext {
		public TerminalNode TKN_OPENING_PAR() { return getToken(LatinoGrammarParser.TKN_OPENING_PAR, 0); }
		public ExpAritContext expArit() {
			return getRuleContext(ExpAritContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(LatinoGrammarParser.TKN_CLOSING_PAR, 0); }
		public Acadena_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acadena_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterAcadena_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitAcadena_stat(this);
		}
	}

	public final Acadena_statContext acadena_stat() throws RecognitionException {
		Acadena_statContext _localctx = new Acadena_statContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_acadena_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__0);
			setState(231);
			match(TKN_OPENING_PAR);
			setState(232);
			expArit();
			setState(233);
			match(TKN_CLOSING_PAR);
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
	public static class Incluir_statContext extends ParserRuleContext {
		public TerminalNode TKN_OPENING_PAR() { return getToken(LatinoGrammarParser.TKN_OPENING_PAR, 0); }
		public TerminalNode TKN_CLOSING_PAR() { return getToken(LatinoGrammarParser.TKN_CLOSING_PAR, 0); }
		public Incluir_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incluir_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterIncluir_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitIncluir_stat(this);
		}
	}

	public final Incluir_statContext incluir_stat() throws RecognitionException {
		Incluir_statContext _localctx = new Incluir_statContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_incluir_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__1);
			setState(236);
			match(TKN_OPENING_PAR);
			setState(237);
			match(TKN_CLOSING_PAR);
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
	public static class Leer_statContext extends ParserRuleContext {
		public TerminalNode TKN_OPENING_PAR() { return getToken(LatinoGrammarParser.TKN_OPENING_PAR, 0); }
		public TerminalNode TKN_CLOSING_PAR() { return getToken(LatinoGrammarParser.TKN_CLOSING_PAR, 0); }
		public Leer_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLeer_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLeer_stat(this);
		}
	}

	public final Leer_statContext leer_stat() throws RecognitionException {
		Leer_statContext _localctx = new Leer_statContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_leer_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__2);
			setState(240);
			match(TKN_OPENING_PAR);
			setState(241);
			match(TKN_CLOSING_PAR);
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
	public static class Limpiar_statContext extends ParserRuleContext {
		public TerminalNode TKN_OPENING_PAR() { return getToken(LatinoGrammarParser.TKN_OPENING_PAR, 0); }
		public TerminalNode TKN_CLOSING_PAR() { return getToken(LatinoGrammarParser.TKN_CLOSING_PAR, 0); }
		public Limpiar_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limpiar_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLimpiar_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLimpiar_stat(this);
		}
	}

	public final Limpiar_statContext limpiar_stat() throws RecognitionException {
		Limpiar_statContext _localctx = new Limpiar_statContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_limpiar_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__3);
			setState(244);
			match(TKN_OPENING_PAR);
			setState(245);
			match(TKN_CLOSING_PAR);
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
	public static class Alogico_statContext extends ParserRuleContext {
		public TerminalNode TKN_OPENING_PAR() { return getToken(LatinoGrammarParser.TKN_OPENING_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(LatinoGrammarParser.TKN_CLOSING_PAR, 0); }
		public Alogico_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alogico_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterAlogico_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitAlogico_stat(this);
		}
	}

	public final Alogico_statContext alogico_stat() throws RecognitionException {
		Alogico_statContext _localctx = new Alogico_statContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_alogico_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__4);
			setState(248);
			match(TKN_OPENING_PAR);
			setState(249);
			expr();
			setState(250);
			match(TKN_CLOSING_PAR);
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
	public static class Anumero_statContext extends ParserRuleContext {
		public TerminalNode TKN_OPENING_PAR() { return getToken(LatinoGrammarParser.TKN_OPENING_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(LatinoGrammarParser.TKN_CLOSING_PAR, 0); }
		public Anumero_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anumero_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterAnumero_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitAnumero_stat(this);
		}
	}

	public final Anumero_statContext anumero_stat() throws RecognitionException {
		Anumero_statContext _localctx = new Anumero_statContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_anumero_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__5);
			setState(253);
			match(TKN_OPENING_PAR);
			setState(254);
			expr();
			setState(255);
			match(TKN_CLOSING_PAR);
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
		enterRule(_localctx, 26, RULE_print_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			print_operations();
			setState(258);
			match(TKN_OPENING_PAR);
			setState(259);
			print_stat_cont();
			setState(260);
			match(TKN_CLOSING_PAR);
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
		public Array_printingContext array_printing() {
			return getRuleContext(Array_printingContext.class,0);
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
		enterRule(_localctx, 28, RULE_print_stat_cont);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				array_printing();
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
		enterRule(_localctx, 30, RULE_print_operations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) ) {
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
	public static class Array_printingContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LatinoGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LatinoGrammarParser.ID, i);
		}
		public TerminalNode TKN_OPENING_BRA() { return getToken(LatinoGrammarParser.TKN_OPENING_BRA, 0); }
		public TerminalNode TKN_CLOSING_BRA() { return getToken(LatinoGrammarParser.TKN_CLOSING_BRA, 0); }
		public Array_printingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_printing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterArray_printing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitArray_printing(this);
		}
	}

	public final Array_printingContext array_printing() throws RecognitionException {
		Array_printingContext _localctx = new Array_printingContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_array_printing);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(ID);
				setState(269);
				match(TKN_OPENING_BRA);
				setState(270);
				match(ID);
				setState(271);
				match(TKN_CLOSING_BRA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class Function_statContext extends ParserRuleContext {
		public Function_opContext function_op() {
			return getRuleContext(Function_opContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_parsContext function_pars() {
			return getRuleContext(Function_parsContext.class,0);
		}
		public Function_contentContext function_content() {
			return getRuleContext(Function_contentContext.class,0);
		}
		public Function_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterFunction_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitFunction_stat(this);
		}
	}

	public final Function_statContext function_stat() throws RecognitionException {
		Function_statContext _localctx = new Function_statContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			function_op();
			setState(276);
			function_name();
			setState(277);
			function_pars();
			setState(278);
			function_content();
			setState(279);
			match(T__9);
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
	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LatinoGrammarParser.ID, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_name);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(ID);
				}
				break;
			case TKN_OPENING_PAR:
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
	public static class Function_opContext extends ParserRuleContext {
		public Function_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterFunction_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitFunction_op(this);
		}
	}

	public final Function_opContext function_op() throws RecognitionException {
		Function_opContext _localctx = new Function_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
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
	public static class Function_parsContext extends ParserRuleContext {
		public TerminalNode TKN_OPENING_PAR() { return getToken(LatinoGrammarParser.TKN_OPENING_PAR, 0); }
		public Function_argsContext function_args() {
			return getRuleContext(Function_argsContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(LatinoGrammarParser.TKN_CLOSING_PAR, 0); }
		public Function_parsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_pars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterFunction_pars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitFunction_pars(this);
		}
	}

	public final Function_parsContext function_pars() throws RecognitionException {
		Function_parsContext _localctx = new Function_parsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function_pars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(TKN_OPENING_PAR);
			setState(288);
			function_args();
			setState(289);
			match(TKN_CLOSING_PAR);
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
	public static class Function_argsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Function_args_auxContext function_args_aux() {
			return getRuleContext(Function_args_auxContext.class,0);
		}
		public Function_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterFunction_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitFunction_args(this);
		}
	}

	public final Function_argsContext function_args() throws RecognitionException {
		Function_argsContext _localctx = new Function_argsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_args);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__4:
			case T__5:
			case T__10:
			case T__11:
			case T__28:
			case STRING:
			case TKN_OPENING_BRA:
			case TKN_OPENING_PAR:
			case TKN_PLUS:
			case TKN_MINUS:
			case TKN_NOT:
			case NUM:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				expr();
				setState(292);
				function_args_aux();
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
	public static class Function_args_auxContext extends ParserRuleContext {
		public TerminalNode TKN_COMMA() { return getToken(LatinoGrammarParser.TKN_COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Function_args_auxContext function_args_aux() {
			return getRuleContext(Function_args_auxContext.class,0);
		}
		public Function_args_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_args_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterFunction_args_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitFunction_args_aux(this);
		}
	}

	public final Function_args_auxContext function_args_aux() throws RecognitionException {
		Function_args_auxContext _localctx = new Function_args_auxContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_args_aux);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(TKN_COMMA);
				setState(298);
				expr();
				setState(299);
				function_args_aux();
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
	public static class Function_retContext extends ParserRuleContext {
		public Function_ret_opContext function_ret_op() {
			return getRuleContext(Function_ret_opContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Function_retContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterFunction_ret(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitFunction_ret(this);
		}
	}

	public final Function_retContext function_ret() throws RecognitionException {
		Function_retContext _localctx = new Function_retContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			function_ret_op();
			setState(305);
			expr();
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
	public static class Function_ret_opContext extends ParserRuleContext {
		public Function_ret_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_ret_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterFunction_ret_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitFunction_ret_op(this);
		}
	}

	public final Function_ret_opContext function_ret_op() throws RecognitionException {
		Function_ret_opContext _localctx = new Function_ret_opContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function_ret_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
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
	public static class Function_contentContext extends ParserRuleContext {
		public SubstatementContext substatement() {
			return getRuleContext(SubstatementContext.class,0);
		}
		public Function_retContext function_ret() {
			return getRuleContext(Function_retContext.class,0);
		}
		public Function_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterFunction_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitFunction_content(this);
		}
	}

	public final Function_contentContext function_content() throws RecognitionException {
		Function_contentContext _localctx = new Function_contentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_function_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			substatement();
			setState(310);
			function_ret();
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
	public static class Special_methodsContext extends ParserRuleContext {
		public Longitud_methodContext longitud_method() {
			return getRuleContext(Longitud_methodContext.class,0);
		}
		public SubstatementContext substatement() {
			return getRuleContext(SubstatementContext.class,0);
		}
		public BraketsContext brakets() {
			return getRuleContext(BraketsContext.class,0);
		}
		public Special_methodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_methods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterSpecial_methods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitSpecial_methods(this);
		}
	}

	public final Special_methodsContext special_methods() throws RecognitionException {
		Special_methodsContext _localctx = new Special_methodsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_special_methods);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				longitud_method();
				setState(313);
				substatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				brakets();
				setState(316);
				substatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
	public static class Longitud_methodContext extends ParserRuleContext {
		public TerminalNode TKN_PERIOD() { return getToken(LatinoGrammarParser.TKN_PERIOD, 0); }
		public TerminalNode TKN_OPENING_PAR() { return getToken(LatinoGrammarParser.TKN_OPENING_PAR, 0); }
		public TerminalNode ID() { return getToken(LatinoGrammarParser.ID, 0); }
		public TerminalNode TKN_CLOSING_PAR() { return getToken(LatinoGrammarParser.TKN_CLOSING_PAR, 0); }
		public Longitud_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longitud_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLongitud_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLongitud_method(this);
		}
	}

	public final Longitud_methodContext longitud_method() throws RecognitionException {
		Longitud_methodContext _localctx = new Longitud_methodContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_longitud_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(321);
			match(T__15);
			}
			{
			setState(322);
			match(TKN_PERIOD);
			}
			{
			setState(323);
			match(T__16);
			}
			{
			setState(324);
			match(TKN_OPENING_PAR);
			}
			{
			setState(325);
			match(ID);
			}
			{
			setState(326);
			match(TKN_CLOSING_PAR);
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
	public static class BraketsContext extends ParserRuleContext {
		public TerminalNode TKN_OPENING_BRA() { return getToken(LatinoGrammarParser.TKN_OPENING_BRA, 0); }
		public TerminalNode ID() { return getToken(LatinoGrammarParser.ID, 0); }
		public TerminalNode TKN_CLOSING_BRA() { return getToken(LatinoGrammarParser.TKN_CLOSING_BRA, 0); }
		public BraketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brakets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterBrakets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitBrakets(this);
		}
	}

	public final BraketsContext brakets() throws RecognitionException {
		BraketsContext _localctx = new BraketsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_brakets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(TKN_OPENING_BRA);
			setState(329);
			match(ID);
			setState(330);
			match(TKN_CLOSING_BRA);
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
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LatinoGrammarParser.ID, 0); }
		public TerminalNode TKN_OPENING_PAR() { return getToken(LatinoGrammarParser.TKN_OPENING_PAR, 0); }
		public Function_argsContext function_args() {
			return getRuleContext(Function_argsContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(LatinoGrammarParser.TKN_CLOSING_PAR, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(ID);
			setState(333);
			match(TKN_OPENING_PAR);
			setState(334);
			function_args();
			setState(335);
			match(TKN_CLOSING_PAR);
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
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode TKN_OPENING_BRA() { return getToken(LatinoGrammarParser.TKN_OPENING_BRA, 0); }
		public Array_contentContext array_content() {
			return getRuleContext(Array_contentContext.class,0);
		}
		public TerminalNode TKN_CLOSING_BRA() { return getToken(LatinoGrammarParser.TKN_CLOSING_BRA, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(TKN_OPENING_BRA);
			setState(338);
			array_content();
			setState(339);
			match(TKN_CLOSING_BRA);
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
	public static class Array_contentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Array_content_auxContext array_content_aux() {
			return getRuleContext(Array_content_auxContext.class,0);
		}
		public Array_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterArray_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitArray_content(this);
		}
	}

	public final Array_contentContext array_content() throws RecognitionException {
		Array_contentContext _localctx = new Array_contentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_array_content);
		try {
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__4:
			case T__5:
			case T__10:
			case T__11:
			case T__28:
			case STRING:
			case TKN_OPENING_BRA:
			case TKN_OPENING_PAR:
			case TKN_PLUS:
			case TKN_MINUS:
			case TKN_NOT:
			case NUM:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				expr();
				setState(342);
				array_content_aux();
				}
				break;
			case TKN_CLOSING_BRA:
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
	public static class Array_content_auxContext extends ParserRuleContext {
		public TerminalNode TKN_COMMA() { return getToken(LatinoGrammarParser.TKN_COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Array_content_auxContext array_content_aux() {
			return getRuleContext(Array_content_auxContext.class,0);
		}
		public Array_content_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_content_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterArray_content_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitArray_content_aux(this);
		}
	}

	public final Array_content_auxContext array_content_aux() throws RecognitionException {
		Array_content_auxContext _localctx = new Array_content_auxContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_array_content_aux);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				match(TKN_COMMA);
				setState(348);
				expr();
				setState(349);
				array_content_aux();
				}
				break;
			case TKN_CLOSING_BRA:
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
	public static class ConditionalsContext extends ParserRuleContext {
		public If_conditionalContext if_conditional() {
			return getRuleContext(If_conditionalContext.class,0);
		}
		public Swicth_conditionContext swicth_condition() {
			return getRuleContext(Swicth_conditionContext.class,0);
		}
		public ConditionalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterConditionals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitConditionals(this);
		}
	}

	public final ConditionalsContext conditionals() throws RecognitionException {
		ConditionalsContext _localctx = new ConditionalsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_conditionals);
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				if_conditional();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				swicth_condition();
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
	public static class LoopsContext extends ParserRuleContext {
		public Desde_loopContext desde_loop() {
			return getRuleContext(Desde_loopContext.class,0);
		}
		public Mientras_loopContext mientras_loop() {
			return getRuleContext(Mientras_loopContext.class,0);
		}
		public LoopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLoops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLoops(this);
		}
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_loops);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				desde_loop();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				mientras_loop();
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
	public static class If_conditionalContext extends ParserRuleContext {
		public Conditional_exprContext conditional_expr() {
			return getRuleContext(Conditional_exprContext.class,0);
		}
		public Conditional_substatementContext conditional_substatement() {
			return getRuleContext(Conditional_substatementContext.class,0);
		}
		public If_conditional_auxContext if_conditional_aux() {
			return getRuleContext(If_conditional_auxContext.class,0);
		}
		public If_conditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterIf_conditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitIf_conditional(this);
		}
	}

	public final If_conditionalContext if_conditional() throws RecognitionException {
		If_conditionalContext _localctx = new If_conditionalContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_if_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(T__17);
			setState(363);
			conditional_expr();
			setState(364);
			conditional_substatement();
			setState(365);
			if_conditional_aux();
			setState(366);
			match(T__9);
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
	public static class Conditional_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Conditional_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterConditional_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitConditional_expr(this);
		}
	}

	public final Conditional_exprContext conditional_expr() throws RecognitionException {
		Conditional_exprContext _localctx = new Conditional_exprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_conditional_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			expr();
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
	public static class Conditional_substatementContext extends ParserRuleContext {
		public SubstatementContext substatement() {
			return getRuleContext(SubstatementContext.class,0);
		}
		public Conditional_substatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_substatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterConditional_substatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitConditional_substatement(this);
		}
	}

	public final Conditional_substatementContext conditional_substatement() throws RecognitionException {
		Conditional_substatementContext _localctx = new Conditional_substatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_conditional_substatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
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
	public static class If_conditional_auxContext extends ParserRuleContext {
		public Conditional_exprContext conditional_expr() {
			return getRuleContext(Conditional_exprContext.class,0);
		}
		public Conditional_substatementContext conditional_substatement() {
			return getRuleContext(Conditional_substatementContext.class,0);
		}
		public If_conditional_auxContext if_conditional_aux() {
			return getRuleContext(If_conditional_auxContext.class,0);
		}
		public If_conditional_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_conditional_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterIf_conditional_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitIf_conditional_aux(this);
		}
	}

	public final If_conditional_auxContext if_conditional_aux() throws RecognitionException {
		If_conditional_auxContext _localctx = new If_conditional_auxContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_if_conditional_aux);
		try {
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(T__18);
				setState(373);
				conditional_expr();
				setState(374);
				conditional_substatement();
				setState(375);
				if_conditional_aux();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(T__19);
				setState(378);
				conditional_substatement();
				}
				break;
			case T__9:
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
	public static class Swicth_conditionContext extends ParserRuleContext {
		public TerminalNode TKN_OPENING_PAR() { return getToken(LatinoGrammarParser.TKN_OPENING_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(LatinoGrammarParser.TKN_CLOSING_PAR, 0); }
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public Swicth_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_swicth_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterSwicth_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitSwicth_condition(this);
		}
	}

	public final Swicth_conditionContext swicth_condition() throws RecognitionException {
		Swicth_conditionContext _localctx = new Swicth_conditionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_swicth_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(T__20);
			setState(383);
			match(TKN_OPENING_PAR);
			setState(384);
			expr();
			setState(385);
			match(TKN_CLOSING_PAR);
			setState(386);
			caseBlock();
			setState(387);
			match(T__9);
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
	public static class CaseBlockContext extends ParserRuleContext {
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public DefaultClauseContext defaultClause() {
			return getRuleContext(DefaultClauseContext.class,0);
		}
		public OtherClauseContext otherClause() {
			return getRuleContext(OtherClauseContext.class,0);
		}
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterCaseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitCaseBlock(this);
		}
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_caseBlock);
		try {
			int _alt;
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(390); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(389);
						caseClause();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(392); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(394);
				caseBlock();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				defaultClause();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				otherClause();
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
	public static class CaseClauseContext extends ParserRuleContext {
		public CaseClauseExprContext caseClauseExpr() {
			return getRuleContext(CaseClauseExprContext.class,0);
		}
		public TerminalNode TKN_COLON() { return getToken(LatinoGrammarParser.TKN_COLON, 0); }
		public Conditional_substatementContext conditional_substatement() {
			return getRuleContext(Conditional_substatementContext.class,0);
		}
		public RomperOpContext romperOp() {
			return getRuleContext(RomperOpContext.class,0);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitCaseClause(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_caseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(T__21);
			setState(401);
			caseClauseExpr();
			setState(402);
			match(TKN_COLON);
			setState(403);
			conditional_substatement();
			setState(404);
			romperOp();
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
	public static class CaseClauseExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CaseClauseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClauseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterCaseClauseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitCaseClauseExpr(this);
		}
	}

	public final CaseClauseExprContext caseClauseExpr() throws RecognitionException {
		CaseClauseExprContext _localctx = new CaseClauseExprContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_caseClauseExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			expr();
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
	public static class DefaultClauseContext extends ParserRuleContext {
		public TerminalNode TKN_COLON() { return getToken(LatinoGrammarParser.TKN_COLON, 0); }
		public Conditional_substatementContext conditional_substatement() {
			return getRuleContext(Conditional_substatementContext.class,0);
		}
		public RomperOpContext romperOp() {
			return getRuleContext(RomperOpContext.class,0);
		}
		public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterDefaultClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitDefaultClause(this);
		}
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_defaultClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(T__22);
			setState(409);
			match(TKN_COLON);
			setState(410);
			conditional_substatement();
			setState(411);
			romperOp();
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
	public static class OtherClauseContext extends ParserRuleContext {
		public TerminalNode TKN_COLON() { return getToken(LatinoGrammarParser.TKN_COLON, 0); }
		public Conditional_substatementContext conditional_substatement() {
			return getRuleContext(Conditional_substatementContext.class,0);
		}
		public RomperOpContext romperOp() {
			return getRuleContext(RomperOpContext.class,0);
		}
		public OtherClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterOtherClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitOtherClause(this);
		}
	}

	public final OtherClauseContext otherClause() throws RecognitionException {
		OtherClauseContext _localctx = new OtherClauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_otherClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(T__23);
			setState(414);
			match(TKN_COLON);
			setState(415);
			conditional_substatement();
			setState(416);
			romperOp();
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
	public static class RomperOpContext extends ParserRuleContext {
		public RomperOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_romperOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterRomperOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitRomperOp(this);
		}
	}

	public final RomperOpContext romperOp() throws RecognitionException {
		RomperOpContext _localctx = new RomperOpContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_romperOp);
		try {
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				match(T__24);
				}
				break;
			case T__9:
			case T__21:
			case T__22:
			case T__23:
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
	public static class Mientras_loopContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Loop_substatementContext loop_substatement() {
			return getRuleContext(Loop_substatementContext.class,0);
		}
		public Mientras_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterMientras_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitMientras_loop(this);
		}
	}

	public final Mientras_loopContext mientras_loop() throws RecognitionException {
		Mientras_loopContext _localctx = new Mientras_loopContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_mientras_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(T__25);
			setState(423);
			expr();
			setState(424);
			loop_substatement();
			setState(425);
			match(T__9);
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
	public static class Desde_loopContext extends ParserRuleContext {
		public TerminalNode TKN_OPENING_PAR() { return getToken(LatinoGrammarParser.TKN_OPENING_PAR, 0); }
		public Triple_exprContext triple_expr() {
			return getRuleContext(Triple_exprContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(LatinoGrammarParser.TKN_CLOSING_PAR, 0); }
		public Loop_substatementContext loop_substatement() {
			return getRuleContext(Loop_substatementContext.class,0);
		}
		public Desde_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desde_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterDesde_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitDesde_loop(this);
		}
	}

	public final Desde_loopContext desde_loop() throws RecognitionException {
		Desde_loopContext _localctx = new Desde_loopContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_desde_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(T__26);
			setState(428);
			match(TKN_OPENING_PAR);
			setState(429);
			triple_expr();
			setState(430);
			match(TKN_CLOSING_PAR);
			setState(431);
			loop_substatement();
			setState(432);
			match(T__9);
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
	public static class Loop_substatementContext extends ParserRuleContext {
		public SubstatementContext substatement() {
			return getRuleContext(SubstatementContext.class,0);
		}
		public Loop_substatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_substatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLoop_substatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLoop_substatement(this);
		}
	}

	public final Loop_substatementContext loop_substatement() throws RecognitionException {
		Loop_substatementContext _localctx = new Loop_substatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_loop_substatement);
		try {
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				substatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class Triple_exprContext extends ParserRuleContext {
		public List<Loop_assignContext> loop_assign() {
			return getRuleContexts(Loop_assignContext.class);
		}
		public Loop_assignContext loop_assign(int i) {
			return getRuleContext(Loop_assignContext.class,i);
		}
		public List<TerminalNode> TKN_SEMICOLON() { return getTokens(LatinoGrammarParser.TKN_SEMICOLON); }
		public TerminalNode TKN_SEMICOLON(int i) {
			return getToken(LatinoGrammarParser.TKN_SEMICOLON, i);
		}
		public Loop_exprContext loop_expr() {
			return getRuleContext(Loop_exprContext.class,0);
		}
		public Loop_assignIncrDecrContext loop_assignIncrDecr() {
			return getRuleContext(Loop_assignIncrDecrContext.class,0);
		}
		public Triple_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triple_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterTriple_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitTriple_expr(this);
		}
	}

	public final Triple_exprContext triple_expr() throws RecognitionException {
		Triple_exprContext _localctx = new Triple_exprContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_triple_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			loop_assign();
			setState(439);
			match(TKN_SEMICOLON);
			setState(440);
			loop_expr();
			setState(441);
			match(TKN_SEMICOLON);
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(442);
				loop_assign();
				}
				break;
			case 2:
				{
				setState(443);
				loop_assignIncrDecr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_assignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LatinoGrammarParser.ID, 0); }
		public Loop_assignmentOperatorContext loop_assignmentOperator() {
			return getRuleContext(Loop_assignmentOperatorContext.class,0);
		}
		public Loop_exprContext loop_expr() {
			return getRuleContext(Loop_exprContext.class,0);
		}
		public Loop_assignAuxContext loop_assignAux() {
			return getRuleContext(Loop_assignAuxContext.class,0);
		}
		public Loop_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLoop_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLoop_assign(this);
		}
	}

	public final Loop_assignContext loop_assign() throws RecognitionException {
		Loop_assignContext _localctx = new Loop_assignContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_loop_assign);
		try {
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(ID);
				setState(447);
				loop_assignmentOperator();
				setState(448);
				loop_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(ID);
				setState(451);
				loop_assignAux();
				setState(452);
				loop_expr();
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
	public static class Loop_assignAuxContext extends ParserRuleContext {
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
		public Loop_assignAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_assignAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLoop_assignAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLoop_assignAux(this);
		}
	}

	public final Loop_assignAuxContext loop_assignAux() throws RecognitionException {
		Loop_assignAuxContext _localctx = new Loop_assignAuxContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_loop_assignAux);
		try {
			setState(463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(456);
				match(TKN_COMMA);
				}
				{
				setState(457);
				match(ID);
				}
				{
				setState(458);
				assignAux();
				}
				{
				setState(459);
				expr();
				}
				{
				setState(460);
				match(TKN_COMMA);
				}
				}
				break;
			case TKN_ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
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
	public static class Loop_assignmentOperatorContext extends ParserRuleContext {
		public TerminalNode TKN_DIV_ASSIGN() { return getToken(LatinoGrammarParser.TKN_DIV_ASSIGN, 0); }
		public TerminalNode TKN_MOD_ASSIGN() { return getToken(LatinoGrammarParser.TKN_MOD_ASSIGN, 0); }
		public TerminalNode TKN_PLUS_ASSIGN() { return getToken(LatinoGrammarParser.TKN_PLUS_ASSIGN, 0); }
		public TerminalNode TKN_MINUS_ASSIGN() { return getToken(LatinoGrammarParser.TKN_MINUS_ASSIGN, 0); }
		public TerminalNode TKN_TIMES_ASSIGN() { return getToken(LatinoGrammarParser.TKN_TIMES_ASSIGN, 0); }
		public Loop_assignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLoop_assignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLoop_assignmentOperator(this);
		}
	}

	public final Loop_assignmentOperatorContext loop_assignmentOperator() throws RecognitionException {
		Loop_assignmentOperatorContext _localctx = new Loop_assignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_loop_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2181431069507584L) != 0)) ) {
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
	public static class Loop_assignIncrDecrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LatinoGrammarParser.ID, 0); }
		public TerminalNode TKN_INCREMENT() { return getToken(LatinoGrammarParser.TKN_INCREMENT, 0); }
		public TerminalNode TKN_DECREMENT() { return getToken(LatinoGrammarParser.TKN_DECREMENT, 0); }
		public Loop_assignIncrDecrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_assignIncrDecr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLoop_assignIncrDecr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLoop_assignIncrDecr(this);
		}
	}

	public final Loop_assignIncrDecrContext loop_assignIncrDecr() throws RecognitionException {
		Loop_assignIncrDecrContext _localctx = new Loop_assignIncrDecrContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_loop_assignIncrDecr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(ID);
			setState(468);
			_la = _input.LA(1);
			if ( !(_la==TKN_INCREMENT || _la==TKN_DECREMENT) ) {
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
	public static class Loop_exprContext extends ParserRuleContext {
		public Loop_expBoolContext loop_expBool() {
			return getRuleContext(Loop_expBoolContext.class,0);
		}
		public Loop_exprRestContext loop_exprRest() {
			return getRuleContext(Loop_exprRestContext.class,0);
		}
		public Loop_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLoop_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLoop_expr(this);
		}
	}

	public final Loop_exprContext loop_expr() throws RecognitionException {
		Loop_exprContext _localctx = new Loop_exprContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_loop_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			loop_expBool();
			setState(471);
			loop_exprRest();
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
	public static class Loop_exprRestContext extends ParserRuleContext {
		public TerminalNode TKN_OR() { return getToken(LatinoGrammarParser.TKN_OR, 0); }
		public Loop_expBoolContext loop_expBool() {
			return getRuleContext(Loop_expBoolContext.class,0);
		}
		public Loop_exprRestContext loop_exprRest() {
			return getRuleContext(Loop_exprRestContext.class,0);
		}
		public Loop_exprRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_exprRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLoop_exprRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLoop_exprRest(this);
		}
	}

	public final Loop_exprRestContext loop_exprRest() throws RecognitionException {
		Loop_exprRestContext _localctx = new Loop_exprRestContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_loop_exprRest);
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				match(TKN_OR);
				setState(474);
				loop_expBool();
				setState(475);
				loop_exprRest();
				}
				break;
			case TKN_SEMICOLON:
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
	public static class Loop_expBoolContext extends ParserRuleContext {
		public Loop_expRelContext loop_expRel() {
			return getRuleContext(Loop_expRelContext.class,0);
		}
		public Loop_expBoolRestContext loop_expBoolRest() {
			return getRuleContext(Loop_expBoolRestContext.class,0);
		}
		public Loop_expBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_expBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLoop_expBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLoop_expBool(this);
		}
	}

	public final Loop_expBoolContext loop_expBool() throws RecognitionException {
		Loop_expBoolContext _localctx = new Loop_expBoolContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_loop_expBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			loop_expRel();
			setState(481);
			loop_expBoolRest();
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
	public static class Loop_expBoolRestContext extends ParserRuleContext {
		public TerminalNode TKN_AND() { return getToken(LatinoGrammarParser.TKN_AND, 0); }
		public Loop_expRelContext loop_expRel() {
			return getRuleContext(Loop_expRelContext.class,0);
		}
		public Loop_expBoolRestContext loop_expBoolRest() {
			return getRuleContext(Loop_expBoolRestContext.class,0);
		}
		public Loop_expBoolRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_expBoolRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLoop_expBoolRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLoop_expBoolRest(this);
		}
	}

	public final Loop_expBoolRestContext loop_expBoolRest() throws RecognitionException {
		Loop_expBoolRestContext _localctx = new Loop_expBoolRestContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_loop_expBoolRest);
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				match(TKN_AND);
				setState(484);
				loop_expRel();
				setState(485);
				loop_expBoolRest();
				}
				break;
			case TKN_OR:
			case TKN_SEMICOLON:
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
	public static class Loop_opRelContext extends ParserRuleContext {
		public TerminalNode TKN_EQUAL() { return getToken(LatinoGrammarParser.TKN_EQUAL, 0); }
		public TerminalNode TKN_GEQ() { return getToken(LatinoGrammarParser.TKN_GEQ, 0); }
		public TerminalNode TKN_GREATER() { return getToken(LatinoGrammarParser.TKN_GREATER, 0); }
		public TerminalNode TKN_LEQ() { return getToken(LatinoGrammarParser.TKN_LEQ, 0); }
		public TerminalNode TKN_LESS() { return getToken(LatinoGrammarParser.TKN_LESS, 0); }
		public TerminalNode TKN_NEQ() { return getToken(LatinoGrammarParser.TKN_NEQ, 0); }
		public Loop_opRelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_opRel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLoop_opRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLoop_opRel(this);
		}
	}

	public final Loop_opRelContext loop_opRel() throws RecognitionException {
		Loop_opRelContext _localctx = new Loop_opRelContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_loop_opRel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 9079256848778919936L) != 0)) ) {
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
	public static class Loop_expRelContext extends ParserRuleContext {
		public Loop_exprConcatContext loop_exprConcat() {
			return getRuleContext(Loop_exprConcatContext.class,0);
		}
		public Loop_opRelContext loop_opRel() {
			return getRuleContext(Loop_opRelContext.class,0);
		}
		public TerminalNode NUM() { return getToken(LatinoGrammarParser.NUM, 0); }
		public TerminalNode ID() { return getToken(LatinoGrammarParser.ID, 0); }
		public Special_methodsContext special_methods() {
			return getRuleContext(Special_methodsContext.class,0);
		}
		public Loop_expRelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_expRel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLoop_expRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLoop_expRel(this);
		}
	}

	public final Loop_expRelContext loop_expRel() throws RecognitionException {
		Loop_expRelContext _localctx = new Loop_expRelContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_loop_expRel);
		try {
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(492);
				loop_exprConcat();
				}
				{
				setState(493);
				loop_opRel();
				}
				setState(497);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUM:
					{
					setState(494);
					match(NUM);
					}
					break;
				case ID:
					{
					setState(495);
					match(ID);
					}
					break;
				case T__15:
				case TKN_AND:
				case TKN_OR:
				case TKN_SEMICOLON:
				case TKN_OPENING_BRA:
				case TKN_CLOSING_PAR:
					{
					setState(496);
					special_methods();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(499);
				loop_exprConcat();
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
	public static class Loop_exprConcatContext extends ParserRuleContext {
		public List<Loop_expAritContext> loop_expArit() {
			return getRuleContexts(Loop_expAritContext.class);
		}
		public Loop_expAritContext loop_expArit(int i) {
			return getRuleContext(Loop_expAritContext.class,i);
		}
		public List<Loop_exprConcatOpContext> loop_exprConcatOp() {
			return getRuleContexts(Loop_exprConcatOpContext.class);
		}
		public Loop_exprConcatOpContext loop_exprConcatOp(int i) {
			return getRuleContext(Loop_exprConcatOpContext.class,i);
		}
		public Loop_exprConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_exprConcat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLoop_exprConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLoop_exprConcat(this);
		}
	}

	public final Loop_exprConcatContext loop_exprConcat() throws RecognitionException {
		Loop_exprConcatContext _localctx = new Loop_exprConcatContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_loop_exprConcat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			loop_expArit();
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_CONCAT) {
				{
				{
				setState(503);
				loop_exprConcatOp();
				setState(504);
				loop_expArit();
				}
				}
				setState(510);
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
	public static class Loop_exprConcatOpContext extends ParserRuleContext {
		public TerminalNode TKN_CONCAT() { return getToken(LatinoGrammarParser.TKN_CONCAT, 0); }
		public Loop_exprConcatOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_exprConcatOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLoop_exprConcatOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLoop_exprConcatOp(this);
		}
	}

	public final Loop_exprConcatOpContext loop_exprConcatOp() throws RecognitionException {
		Loop_exprConcatOpContext _localctx = new Loop_exprConcatOpContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_loop_exprConcatOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(TKN_CONCAT);
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
	public static class Loop_expAritContext extends ParserRuleContext {
		public List<Loop_termContext> loop_term() {
			return getRuleContexts(Loop_termContext.class);
		}
		public Loop_termContext loop_term(int i) {
			return getRuleContext(Loop_termContext.class,i);
		}
		public List<Loop_expAritOpContext> loop_expAritOp() {
			return getRuleContexts(Loop_expAritOpContext.class);
		}
		public Loop_expAritOpContext loop_expAritOp(int i) {
			return getRuleContext(Loop_expAritOpContext.class,i);
		}
		public Loop_expAritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_expArit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLoop_expArit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLoop_expArit(this);
		}
	}

	public final Loop_expAritContext loop_expArit() throws RecognitionException {
		Loop_expAritContext _localctx = new Loop_expAritContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_loop_expArit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			loop_term();
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_PLUS || _la==TKN_MINUS) {
				{
				{
				setState(514);
				loop_expAritOp();
				setState(515);
				loop_term();
				}
				}
				setState(521);
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
	public static class Loop_expAritOpContext extends ParserRuleContext {
		public TerminalNode TKN_PLUS() { return getToken(LatinoGrammarParser.TKN_PLUS, 0); }
		public TerminalNode TKN_MINUS() { return getToken(LatinoGrammarParser.TKN_MINUS, 0); }
		public Loop_expAritOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_expAritOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLoop_expAritOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLoop_expAritOp(this);
		}
	}

	public final Loop_expAritOpContext loop_expAritOp() throws RecognitionException {
		Loop_expAritOpContext _localctx = new Loop_expAritOpContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_loop_expAritOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
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
	public static class Loop_termContext extends ParserRuleContext {
		public List<Loop_factorContext> loop_factor() {
			return getRuleContexts(Loop_factorContext.class);
		}
		public Loop_factorContext loop_factor(int i) {
			return getRuleContext(Loop_factorContext.class,i);
		}
		public List<Loop_termOpContext> loop_termOp() {
			return getRuleContexts(Loop_termOpContext.class);
		}
		public Loop_termOpContext loop_termOp(int i) {
			return getRuleContext(Loop_termOpContext.class,i);
		}
		public Loop_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLoop_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLoop_term(this);
		}
	}

	public final Loop_termContext loop_term() throws RecognitionException {
		Loop_termContext _localctx = new Loop_termContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_loop_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			loop_factor();
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 99079191802150912L) != 0)) {
				{
				{
				setState(525);
				loop_termOp();
				setState(526);
				loop_factor();
				}
				}
				setState(532);
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
	public static class Loop_termOpContext extends ParserRuleContext {
		public TerminalNode TKN_TIMES() { return getToken(LatinoGrammarParser.TKN_TIMES, 0); }
		public TerminalNode TKN_DIV() { return getToken(LatinoGrammarParser.TKN_DIV, 0); }
		public TerminalNode TKN_MOD() { return getToken(LatinoGrammarParser.TKN_MOD, 0); }
		public Loop_termOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_termOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLoop_termOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLoop_termOp(this);
		}
	}

	public final Loop_termOpContext loop_termOp() throws RecognitionException {
		Loop_termOpContext _localctx = new Loop_termOpContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_loop_termOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 99079191802150912L) != 0)) ) {
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
	public static class Loop_factorContext extends ParserRuleContext {
		public List<Loop_t_factorContext> loop_t_factor() {
			return getRuleContexts(Loop_t_factorContext.class);
		}
		public Loop_t_factorContext loop_t_factor(int i) {
			return getRuleContext(Loop_t_factorContext.class,i);
		}
		public List<Loop_factorOpContext> loop_factorOp() {
			return getRuleContexts(Loop_factorOpContext.class);
		}
		public Loop_factorOpContext loop_factorOp(int i) {
			return getRuleContext(Loop_factorOpContext.class,i);
		}
		public Loop_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLoop_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLoop_factor(this);
		}
	}

	public final Loop_factorContext loop_factor() throws RecognitionException {
		Loop_factorContext _localctx = new Loop_factorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_loop_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			loop_t_factor();
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_POWER) {
				{
				{
				setState(536);
				loop_factorOp();
				setState(537);
				loop_t_factor();
				}
				}
				setState(543);
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
	public static class Loop_factorOpContext extends ParserRuleContext {
		public TerminalNode TKN_POWER() { return getToken(LatinoGrammarParser.TKN_POWER, 0); }
		public Loop_factorOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_factorOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLoop_factorOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLoop_factorOp(this);
		}
	}

	public final Loop_factorOpContext loop_factorOp() throws RecognitionException {
		Loop_factorOpContext _localctx = new Loop_factorOpContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_loop_factorOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
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
	public static class Loop_t_factorContext extends ParserRuleContext {
		public Expr_factorContext expr_factor() {
			return getRuleContext(Expr_factorContext.class,0);
		}
		public Loop_expr_terminalsContext loop_expr_terminals() {
			return getRuleContext(Loop_expr_terminalsContext.class,0);
		}
		public Loop_t_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_t_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLoop_t_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLoop_t_factor(this);
		}
	}

	public final Loop_t_factorContext loop_t_factor() throws RecognitionException {
		Loop_t_factorContext _localctx = new Loop_t_factorContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_loop_t_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(546);
			expr_factor();
			}
			{
			setState(547);
			loop_expr_terminals();
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
	public static class Loop_expr_terminalsContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(LatinoGrammarParser.NUM, 0); }
		public List<BraketsContext> brakets() {
			return getRuleContexts(BraketsContext.class);
		}
		public BraketsContext brakets(int i) {
			return getRuleContext(BraketsContext.class,i);
		}
		public TerminalNode ID() { return getToken(LatinoGrammarParser.ID, 0); }
		public TerminalNode TKN_OPENING_PAR() { return getToken(LatinoGrammarParser.TKN_OPENING_PAR, 0); }
		public Loop_exprContext loop_expr() {
			return getRuleContext(Loop_exprContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(LatinoGrammarParser.TKN_CLOSING_PAR, 0); }
		public TerminalNode STRING() { return getToken(LatinoGrammarParser.STRING, 0); }
		public Loop_expr_terminalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_expr_terminals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterLoop_expr_terminals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitLoop_expr_terminals(this);
		}
	}

	public final Loop_expr_terminalsContext loop_expr_terminals() throws RecognitionException {
		Loop_expr_terminalsContext _localctx = new Loop_expr_terminalsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_loop_expr_terminals);
		int _la;
		try {
			setState(569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				match(NUM);
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TKN_OPENING_BRA) {
					{
					{
					setState(550);
					brakets();
					}
					}
					setState(555);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				match(ID);
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TKN_OPENING_BRA) {
					{
					{
					setState(557);
					brakets();
					}
					}
					setState(562);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case TKN_OPENING_PAR:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(563);
				match(TKN_OPENING_PAR);
				}
				{
				setState(564);
				loop_expr();
				}
				{
				setState(565);
				match(TKN_CLOSING_PAR);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(567);
				match(STRING);
				}
				break;
			case TKN_AND:
			case TKN_OR:
			case TKN_CONCAT:
			case TKN_SEMICOLON:
			case TKN_CLOSING_PAR:
			case TKN_PLUS:
			case TKN_MINUS:
			case TKN_TIMES:
			case TKN_DIV:
			case TKN_POWER:
			case TKN_MOD:
			case TKN_EQUAL:
			case TKN_NEQ:
			case TKN_LEQ:
			case TKN_GEQ:
			case TKN_GREATER:
			case TKN_LESS:
				enterOuterAlt(_localctx, 5);
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
		enterRule(_localctx, 140, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			expBool();
			setState(572);
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
		enterRule(_localctx, 142, RULE_exprRest);
		try {
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				match(TKN_OR);
				setState(575);
				expBool();
				setState(576);
				exprRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
		enterRule(_localctx, 144, RULE_expBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			expRel();
			setState(582);
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
		enterRule(_localctx, 146, RULE_expBoolRest);
		try {
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				match(TKN_AND);
				setState(585);
				expRel();
				setState(586);
				expBoolRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
		enterRule(_localctx, 148, RULE_opRel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 9079256848778919936L) != 0)) ) {
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
		public List<ExprConcatContext> exprConcat() {
			return getRuleContexts(ExprConcatContext.class);
		}
		public ExprConcatContext exprConcat(int i) {
			return getRuleContext(ExprConcatContext.class,i);
		}
		public OpRelContext opRel() {
			return getRuleContext(OpRelContext.class,0);
		}
		public Special_methodsContext special_methods() {
			return getRuleContext(Special_methodsContext.class,0);
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
		enterRule(_localctx, 150, RULE_expRel);
		try {
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(593);
				exprConcat();
				}
				{
				setState(594);
				opRel();
				}
				setState(597);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(595);
					exprConcat();
					}
					break;
				case 2:
					{
					setState(596);
					special_methods();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(599);
				exprConcat();
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
	public static class ExprConcatContext extends ParserRuleContext {
		public List<ExpAritContext> expArit() {
			return getRuleContexts(ExpAritContext.class);
		}
		public ExpAritContext expArit(int i) {
			return getRuleContext(ExpAritContext.class,i);
		}
		public List<ExprConcatOpContext> exprConcatOp() {
			return getRuleContexts(ExprConcatOpContext.class);
		}
		public ExprConcatOpContext exprConcatOp(int i) {
			return getRuleContext(ExprConcatOpContext.class,i);
		}
		public ExprConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprConcat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterExprConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitExprConcat(this);
		}
	}

	public final ExprConcatContext exprConcat() throws RecognitionException {
		ExprConcatContext _localctx = new ExprConcatContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_exprConcat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			expArit();
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_CONCAT) {
				{
				{
				setState(603);
				exprConcatOp();
				setState(604);
				expArit();
				}
				}
				setState(610);
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
	public static class ExprConcatOpContext extends ParserRuleContext {
		public TerminalNode TKN_CONCAT() { return getToken(LatinoGrammarParser.TKN_CONCAT, 0); }
		public ExprConcatOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprConcatOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterExprConcatOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitExprConcatOp(this);
		}
	}

	public final ExprConcatOpContext exprConcatOp() throws RecognitionException {
		ExprConcatOpContext _localctx = new ExprConcatOpContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_exprConcatOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(TKN_CONCAT);
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
		enterRule(_localctx, 156, RULE_expArit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			term();
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_PLUS || _la==TKN_MINUS) {
				{
				{
				setState(614);
				expAritOp();
				setState(615);
				term();
				}
				}
				setState(621);
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
		enterRule(_localctx, 158, RULE_expAritOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
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
		enterRule(_localctx, 160, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			factor();
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 99079191802150912L) != 0)) {
				{
				{
				setState(625);
				termOp();
				setState(626);
				factor();
				}
				}
				setState(632);
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
		enterRule(_localctx, 162, RULE_termOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 99079191802150912L) != 0)) ) {
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
		enterRule(_localctx, 164, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			t_factor();
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_POWER) {
				{
				{
				setState(636);
				factorOp();
				setState(637);
				t_factor();
				}
				}
				setState(643);
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
		enterRule(_localctx, 166, RULE_factorOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
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
		enterRule(_localctx, 168, RULE_t_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(646);
			expr_factor();
			}
			{
			setState(647);
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
		public List<BraketsContext> brakets() {
			return getRuleContexts(BraketsContext.class);
		}
		public BraketsContext brakets(int i) {
			return getRuleContext(BraketsContext.class,i);
		}
		public TerminalNode ID() { return getToken(LatinoGrammarParser.ID, 0); }
		public TerminalNode TKN_OPENING_PAR() { return getToken(LatinoGrammarParser.TKN_OPENING_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(LatinoGrammarParser.TKN_CLOSING_PAR, 0); }
		public TerminalNode STRING() { return getToken(LatinoGrammarParser.STRING, 0); }
		public Anumero_statContext anumero_stat() {
			return getRuleContext(Anumero_statContext.class,0);
		}
		public Alogico_statContext alogico_stat() {
			return getRuleContext(Alogico_statContext.class,0);
		}
		public Acadena_statContext acadena_stat() {
			return getRuleContext(Acadena_statContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Function_statContext function_stat() {
			return getRuleContext(Function_statContext.class,0);
		}
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
		enterRule(_localctx, 170, RULE_expr_terminals);
		try {
			int _alt;
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				match(NUM);
				setState(653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(650);
						brakets();
						}
						} 
					}
					setState(655);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				match(ID);
				setState(660);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(657);
						brakets();
						}
						} 
					}
					setState(662);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(663);
				match(TKN_OPENING_PAR);
				}
				{
				setState(664);
				expr();
				}
				{
				setState(665);
				match(TKN_CLOSING_PAR);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(667);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(668);
				anumero_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(669);
				alogico_stat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(670);
				acadena_stat();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(671);
				array();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(672);
				function_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(673);
				function_stat();
				setState(674);
				match(T__27);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(676);
				match(T__28);
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
		enterRule(_localctx, 172, RULE_expr_factor);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(679);
					_la = _input.LA(1);
					if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 16387L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(684);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		"\u0004\u0001F\u02ae\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u00c5\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u00d3\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00dc\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00e5\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0109\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0112\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u011c\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0128\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u012f\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u0140\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u015a\b\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0161\b \u0001!\u0001!\u0003"+
		"!\u0165\b!\u0001\"\u0001\"\u0003\"\u0169\b\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0003&\u017d\b&\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0004(\u0187\b(\u000b(\f(\u0188"+
		"\u0001(\u0001(\u0001(\u0001(\u0003(\u018f\b(\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0003-\u01a5\b-\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u00010\u00010\u00030\u01b5\b0\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00031\u01bd\b1\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00032\u01c7\b2\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0003"+
		"3\u01d0\b3\u00014\u00014\u00015\u00015\u00015\u00016\u00016\u00016\u0001"+
		"7\u00017\u00017\u00017\u00017\u00037\u01df\b7\u00018\u00018\u00018\u0001"+
		"9\u00019\u00019\u00019\u00019\u00039\u01e9\b9\u0001:\u0001:\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0003;\u01f2\b;\u0001;\u0003;\u01f5\b;\u0001<\u0001"+
		"<\u0001<\u0001<\u0005<\u01fb\b<\n<\f<\u01fe\t<\u0001=\u0001=\u0001>\u0001"+
		">\u0001>\u0001>\u0005>\u0206\b>\n>\f>\u0209\t>\u0001?\u0001?\u0001@\u0001"+
		"@\u0001@\u0001@\u0005@\u0211\b@\n@\f@\u0214\t@\u0001A\u0001A\u0001B\u0001"+
		"B\u0001B\u0001B\u0005B\u021c\bB\nB\fB\u021f\tB\u0001C\u0001C\u0001D\u0001"+
		"D\u0001D\u0001E\u0001E\u0005E\u0228\bE\nE\fE\u022b\tE\u0001E\u0001E\u0005"+
		"E\u022f\bE\nE\fE\u0232\tE\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0003"+
		"E\u023a\bE\u0001F\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001G\u0003"+
		"G\u0244\bG\u0001H\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001I\u0003"+
		"I\u024e\bI\u0001J\u0001J\u0001K\u0001K\u0001K\u0001K\u0003K\u0256\bK\u0001"+
		"K\u0003K\u0259\bK\u0001L\u0001L\u0001L\u0001L\u0005L\u025f\bL\nL\fL\u0262"+
		"\tL\u0001M\u0001M\u0001N\u0001N\u0001N\u0001N\u0005N\u026a\bN\nN\fN\u026d"+
		"\tN\u0001O\u0001O\u0001P\u0001P\u0001P\u0001P\u0005P\u0275\bP\nP\fP\u0278"+
		"\tP\u0001Q\u0001Q\u0001R\u0001R\u0001R\u0001R\u0005R\u0280\bR\nR\fR\u0283"+
		"\tR\u0001S\u0001S\u0001T\u0001T\u0001T\u0001U\u0001U\u0005U\u028c\bU\n"+
		"U\fU\u028f\tU\u0001U\u0001U\u0005U\u0293\bU\nU\fU\u0296\tU\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0003U\u02a6\bU\u0001V\u0005V\u02a9\bV\nV\fV\u02ac\tV"+
		"\u0001V\u0000\u0000W\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh"+
		"jlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u0000\t\u0001\u0000.2\u0001\u0000,-\u0001\u0000\u0007\t\u0001\u0000"+
		"\u000b\f\u0001\u0000\r\u000f\u0001\u00009>\u0001\u000034\u0002\u00005"+
		"688\u0002\u000034AA\u029c\u0000\u00ae\u0001\u0000\u0000\u0000\u0002\u00c4"+
		"\u0001\u0000\u0000\u0000\u0004\u00d2\u0001\u0000\u0000\u0000\u0006\u00db"+
		"\u0001\u0000\u0000\u0000\b\u00dd\u0001\u0000\u0000\u0000\n\u00df\u0001"+
		"\u0000\u0000\u0000\f\u00e4\u0001\u0000\u0000\u0000\u000e\u00e6\u0001\u0000"+
		"\u0000\u0000\u0010\u00eb\u0001\u0000\u0000\u0000\u0012\u00ef\u0001\u0000"+
		"\u0000\u0000\u0014\u00f3\u0001\u0000\u0000\u0000\u0016\u00f7\u0001\u0000"+
		"\u0000\u0000\u0018\u00fc\u0001\u0000\u0000\u0000\u001a\u0101\u0001\u0000"+
		"\u0000\u0000\u001c\u0108\u0001\u0000\u0000\u0000\u001e\u010a\u0001\u0000"+
		"\u0000\u0000 \u0111\u0001\u0000\u0000\u0000\"\u0113\u0001\u0000\u0000"+
		"\u0000$\u011b\u0001\u0000\u0000\u0000&\u011d\u0001\u0000\u0000\u0000("+
		"\u011f\u0001\u0000\u0000\u0000*\u0127\u0001\u0000\u0000\u0000,\u012e\u0001"+
		"\u0000\u0000\u0000.\u0130\u0001\u0000\u0000\u00000\u0133\u0001\u0000\u0000"+
		"\u00002\u0135\u0001\u0000\u0000\u00004\u013f\u0001\u0000\u0000\u00006"+
		"\u0141\u0001\u0000\u0000\u00008\u0148\u0001\u0000\u0000\u0000:\u014c\u0001"+
		"\u0000\u0000\u0000<\u0151\u0001\u0000\u0000\u0000>\u0159\u0001\u0000\u0000"+
		"\u0000@\u0160\u0001\u0000\u0000\u0000B\u0164\u0001\u0000\u0000\u0000D"+
		"\u0168\u0001\u0000\u0000\u0000F\u016a\u0001\u0000\u0000\u0000H\u0170\u0001"+
		"\u0000\u0000\u0000J\u0172\u0001\u0000\u0000\u0000L\u017c\u0001\u0000\u0000"+
		"\u0000N\u017e\u0001\u0000\u0000\u0000P\u018e\u0001\u0000\u0000\u0000R"+
		"\u0190\u0001\u0000\u0000\u0000T\u0196\u0001\u0000\u0000\u0000V\u0198\u0001"+
		"\u0000\u0000\u0000X\u019d\u0001\u0000\u0000\u0000Z\u01a4\u0001\u0000\u0000"+
		"\u0000\\\u01a6\u0001\u0000\u0000\u0000^\u01ab\u0001\u0000\u0000\u0000"+
		"`\u01b4\u0001\u0000\u0000\u0000b\u01b6\u0001\u0000\u0000\u0000d\u01c6"+
		"\u0001\u0000\u0000\u0000f\u01cf\u0001\u0000\u0000\u0000h\u01d1\u0001\u0000"+
		"\u0000\u0000j\u01d3\u0001\u0000\u0000\u0000l\u01d6\u0001\u0000\u0000\u0000"+
		"n\u01de\u0001\u0000\u0000\u0000p\u01e0\u0001\u0000\u0000\u0000r\u01e8"+
		"\u0001\u0000\u0000\u0000t\u01ea\u0001\u0000\u0000\u0000v\u01f4\u0001\u0000"+
		"\u0000\u0000x\u01f6\u0001\u0000\u0000\u0000z\u01ff\u0001\u0000\u0000\u0000"+
		"|\u0201\u0001\u0000\u0000\u0000~\u020a\u0001\u0000\u0000\u0000\u0080\u020c"+
		"\u0001\u0000\u0000\u0000\u0082\u0215\u0001\u0000\u0000\u0000\u0084\u0217"+
		"\u0001\u0000\u0000\u0000\u0086\u0220\u0001\u0000\u0000\u0000\u0088\u0222"+
		"\u0001\u0000\u0000\u0000\u008a\u0239\u0001\u0000\u0000\u0000\u008c\u023b"+
		"\u0001\u0000\u0000\u0000\u008e\u0243\u0001\u0000\u0000\u0000\u0090\u0245"+
		"\u0001\u0000\u0000\u0000\u0092\u024d\u0001\u0000\u0000\u0000\u0094\u024f"+
		"\u0001\u0000\u0000\u0000\u0096\u0258\u0001\u0000\u0000\u0000\u0098\u025a"+
		"\u0001\u0000\u0000\u0000\u009a\u0263\u0001\u0000\u0000\u0000\u009c\u0265"+
		"\u0001\u0000\u0000\u0000\u009e\u026e\u0001\u0000\u0000\u0000\u00a0\u0270"+
		"\u0001\u0000\u0000\u0000\u00a2\u0279\u0001\u0000\u0000\u0000\u00a4\u027b"+
		"\u0001\u0000\u0000\u0000\u00a6\u0284\u0001\u0000\u0000\u0000\u00a8\u0286"+
		"\u0001\u0000\u0000\u0000\u00aa\u02a5\u0001\u0000\u0000\u0000\u00ac\u02aa"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0003\u0002\u0001\u0000\u00af\u0001"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0003\u001a\r\u0000\u00b1\u00b2\u0003"+
		"\u0002\u0001\u0000\u00b2\u00c5\u0001\u0000\u0000\u0000\u00b3\u00b4\u0003"+
		"\u0004\u0002\u0000\u00b4\u00b5\u0003\u0002\u0001\u0000\u00b5\u00c5\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0003\f\u0006\u0000\u00b7\u00b8\u0003\u0002"+
		"\u0001\u0000\u00b8\u00c5\u0001\u0000\u0000\u0000\u00b9\u00ba\u0003\"\u0011"+
		"\u0000\u00ba\u00bb\u0003\u0002\u0001\u0000\u00bb\u00c5\u0001\u0000\u0000"+
		"\u0000\u00bc\u00c5\u00034\u001a\u0000\u00bd\u00be\u0003B!\u0000\u00be"+
		"\u00bf\u0003\u0002\u0001\u0000\u00bf\u00c5\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0003D\"\u0000\u00c1\u00c2\u0003\u0002\u0001\u0000\u00c2\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00b0"+
		"\u0001\u0000\u0000\u0000\u00c4\u00b3\u0001\u0000\u0000\u0000\u00c4\u00b6"+
		"\u0001\u0000\u0000\u0000\u00c4\u00b9\u0001\u0000\u0000\u0000\u00c4\u00bc"+
		"\u0001\u0000\u0000\u0000\u00c4\u00bd\u0001\u0000\u0000\u0000\u00c4\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u0003"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005C\u0000\u0000\u00c7\u00c8\u0003"+
		"\b\u0004\u0000\u00c8\u00c9\u0003\u008cF\u0000\u00c9\u00d3\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0005C\u0000\u0000\u00cb\u00cc\u0003\u0006\u0003"+
		"\u0000\u00cc\u00cd\u0003\u008cF\u0000\u00cd\u00d3\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0005C\u0000\u0000\u00cf\u00d3\u0003\n\u0005\u0000\u00d0"+
		"\u00d1\u0005C\u0000\u0000\u00d1\u00d3\u0003 \u0010\u0000\u00d2\u00c6\u0001"+
		"\u0000\u0000\u0000\u00d2\u00ca\u0001\u0000\u0000\u0000\u00d2\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u0005\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0005#\u0000\u0000\u00d5\u00d6\u0005C\u0000"+
		"\u0000\u00d6\u00d7\u0003\u0006\u0003\u0000\u00d7\u00d8\u0003\u008cF\u0000"+
		"\u00d8\u00d9\u0005#\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da"+
		"\u00dc\u0005@\u0000\u0000\u00db\u00d4\u0001\u0000\u0000\u0000\u00db\u00da"+
		"\u0001\u0000\u0000\u0000\u00dc\u0007\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0007\u0000\u0000\u0000\u00de\t\u0001\u0000\u0000\u0000\u00df\u00e0\u0007"+
		"\u0001\u0000\u0000\u00e0\u000b\u0001\u0000\u0000\u0000\u00e1\u00e5\u0003"+
		"\u0010\b\u0000\u00e2\u00e5\u0003\u0012\t\u0000\u00e3\u00e5\u0003\u0014"+
		"\n\u0000\u00e4\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5\r\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0005\u0001\u0000\u0000\u00e7\u00e8\u0005*\u0000\u0000\u00e8"+
		"\u00e9\u0003\u009cN\u0000\u00e9\u00ea\u0005+\u0000\u0000\u00ea\u000f\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0005\u0002\u0000\u0000\u00ec\u00ed\u0005"+
		"*\u0000\u0000\u00ed\u00ee\u0005+\u0000\u0000\u00ee\u0011\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0005\u0003\u0000\u0000\u00f0\u00f1\u0005*\u0000\u0000"+
		"\u00f1\u00f2\u0005+\u0000\u0000\u00f2\u0013\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0005\u0004\u0000\u0000\u00f4\u00f5\u0005*\u0000\u0000\u00f5\u00f6"+
		"\u0005+\u0000\u0000\u00f6\u0015\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005"+
		"\u0005\u0000\u0000\u00f8\u00f9\u0005*\u0000\u0000\u00f9\u00fa\u0003\u008c"+
		"F\u0000\u00fa\u00fb\u0005+\u0000\u0000\u00fb\u0017\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0005\u0006\u0000\u0000\u00fd\u00fe\u0005*\u0000\u0000\u00fe"+
		"\u00ff\u0003\u008cF\u0000\u00ff\u0100\u0005+\u0000\u0000\u0100\u0019\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0003\u001e\u000f\u0000\u0102\u0103\u0005"+
		"*\u0000\u0000\u0103\u0104\u0003\u001c\u000e\u0000\u0104\u0105\u0005+\u0000"+
		"\u0000\u0105\u001b\u0001\u0000\u0000\u0000\u0106\u0109\u0003\u008cF\u0000"+
		"\u0107\u0109\u0003 \u0010\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108"+
		"\u0107\u0001\u0000\u0000\u0000\u0109\u001d\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0007\u0002\u0000\u0000\u010b\u001f\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0005C\u0000\u0000\u010d\u010e\u0005(\u0000\u0000\u010e\u010f\u0005"+
		"C\u0000\u0000\u010f\u0112\u0005)\u0000\u0000\u0110\u0112\u0001\u0000\u0000"+
		"\u0000\u0111\u010c\u0001\u0000\u0000\u0000\u0111\u0110\u0001\u0000\u0000"+
		"\u0000\u0112!\u0001\u0000\u0000\u0000\u0113\u0114\u0003&\u0013\u0000\u0114"+
		"\u0115\u0003$\u0012\u0000\u0115\u0116\u0003(\u0014\u0000\u0116\u0117\u0003"+
		"2\u0019\u0000\u0117\u0118\u0005\n\u0000\u0000\u0118#\u0001\u0000\u0000"+
		"\u0000\u0119\u011c\u0005C\u0000\u0000\u011a\u011c\u0001\u0000\u0000\u0000"+
		"\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011a\u0001\u0000\u0000\u0000"+
		"\u011c%\u0001\u0000\u0000\u0000\u011d\u011e\u0007\u0003\u0000\u0000\u011e"+
		"\'\u0001\u0000\u0000\u0000\u011f\u0120\u0005*\u0000\u0000\u0120\u0121"+
		"\u0003*\u0015\u0000\u0121\u0122\u0005+\u0000\u0000\u0122)\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0003\u008cF\u0000\u0124\u0125\u0003,\u0016\u0000"+
		"\u0125\u0128\u0001\u0000\u0000\u0000\u0126\u0128\u0001\u0000\u0000\u0000"+
		"\u0127\u0123\u0001\u0000\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000"+
		"\u0128+\u0001\u0000\u0000\u0000\u0129\u012a\u0005#\u0000\u0000\u012a\u012b"+
		"\u0003\u008cF\u0000\u012b\u012c\u0003,\u0016\u0000\u012c\u012f\u0001\u0000"+
		"\u0000\u0000\u012d\u012f\u0001\u0000\u0000\u0000\u012e\u0129\u0001\u0000"+
		"\u0000\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012f-\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u00030\u0018\u0000\u0131\u0132\u0003\u008cF\u0000\u0132"+
		"/\u0001\u0000\u0000\u0000\u0133\u0134\u0007\u0004\u0000\u0000\u01341\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0003\u0002\u0001\u0000\u0136\u0137\u0003"+
		".\u0017\u0000\u01373\u0001\u0000\u0000\u0000\u0138\u0139\u00036\u001b"+
		"\u0000\u0139\u013a\u0003\u0002\u0001\u0000\u013a\u0140\u0001\u0000\u0000"+
		"\u0000\u013b\u013c\u00038\u001c\u0000\u013c\u013d\u0003\u0002\u0001\u0000"+
		"\u013d\u0140\u0001\u0000\u0000\u0000\u013e\u0140\u0001\u0000\u0000\u0000"+
		"\u013f\u0138\u0001\u0000\u0000\u0000\u013f\u013b\u0001\u0000\u0000\u0000"+
		"\u013f\u013e\u0001\u0000\u0000\u0000\u01405\u0001\u0000\u0000\u0000\u0141"+
		"\u0142\u0005\u0010\u0000\u0000\u0142\u0143\u0005\"\u0000\u0000\u0143\u0144"+
		"\u0005\u0011\u0000\u0000\u0144\u0145\u0005*\u0000\u0000\u0145\u0146\u0005"+
		"C\u0000\u0000\u0146\u0147\u0005+\u0000\u0000\u01477\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0005(\u0000\u0000\u0149\u014a\u0005C\u0000\u0000\u014a"+
		"\u014b\u0005)\u0000\u0000\u014b9\u0001\u0000\u0000\u0000\u014c\u014d\u0005"+
		"C\u0000\u0000\u014d\u014e\u0005*\u0000\u0000\u014e\u014f\u0003*\u0015"+
		"\u0000\u014f\u0150\u0005+\u0000\u0000\u0150;\u0001\u0000\u0000\u0000\u0151"+
		"\u0152\u0005(\u0000\u0000\u0152\u0153\u0003>\u001f\u0000\u0153\u0154\u0005"+
		")\u0000\u0000\u0154=\u0001\u0000\u0000\u0000\u0155\u0156\u0003\u008cF"+
		"\u0000\u0156\u0157\u0003@ \u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158"+
		"\u015a\u0001\u0000\u0000\u0000\u0159\u0155\u0001\u0000\u0000\u0000\u0159"+
		"\u0158\u0001\u0000\u0000\u0000\u015a?\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0005#\u0000\u0000\u015c\u015d\u0003\u008cF\u0000\u015d\u015e\u0003@"+
		" \u0000\u015e\u0161\u0001\u0000\u0000\u0000\u015f\u0161\u0001\u0000\u0000"+
		"\u0000\u0160\u015b\u0001\u0000\u0000\u0000\u0160\u015f\u0001\u0000\u0000"+
		"\u0000\u0161A\u0001\u0000\u0000\u0000\u0162\u0165\u0003F#\u0000\u0163"+
		"\u0165\u0003N\'\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0163"+
		"\u0001\u0000\u0000\u0000\u0165C\u0001\u0000\u0000\u0000\u0166\u0169\u0003"+
		"^/\u0000\u0167\u0169\u0003\\.\u0000\u0168\u0166\u0001\u0000\u0000\u0000"+
		"\u0168\u0167\u0001\u0000\u0000\u0000\u0169E\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0005\u0012\u0000\u0000\u016b\u016c\u0003H$\u0000\u016c\u016d\u0003"+
		"J%\u0000\u016d\u016e\u0003L&\u0000\u016e\u016f\u0005\n\u0000\u0000\u016f"+
		"G\u0001\u0000\u0000\u0000\u0170\u0171\u0003\u008cF\u0000\u0171I\u0001"+
		"\u0000\u0000\u0000\u0172\u0173\u0003\u0002\u0001\u0000\u0173K\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0005\u0013\u0000\u0000\u0175\u0176\u0003H$\u0000"+
		"\u0176\u0177\u0003J%\u0000\u0177\u0178\u0003L&\u0000\u0178\u017d\u0001"+
		"\u0000\u0000\u0000\u0179\u017a\u0005\u0014\u0000\u0000\u017a\u017d\u0003"+
		"J%\u0000\u017b\u017d\u0001\u0000\u0000\u0000\u017c\u0174\u0001\u0000\u0000"+
		"\u0000\u017c\u0179\u0001\u0000\u0000\u0000\u017c\u017b\u0001\u0000\u0000"+
		"\u0000\u017dM\u0001\u0000\u0000\u0000\u017e\u017f\u0005\u0015\u0000\u0000"+
		"\u017f\u0180\u0005*\u0000\u0000\u0180\u0181\u0003\u008cF\u0000\u0181\u0182"+
		"\u0005+\u0000\u0000\u0182\u0183\u0003P(\u0000\u0183\u0184\u0005\n\u0000"+
		"\u0000\u0184O\u0001\u0000\u0000\u0000\u0185\u0187\u0003R)\u0000\u0186"+
		"\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188"+
		"\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189"+
		"\u018a\u0001\u0000\u0000\u0000\u018a\u018b\u0003P(\u0000\u018b\u018f\u0001"+
		"\u0000\u0000\u0000\u018c\u018f\u0003V+\u0000\u018d\u018f\u0003X,\u0000"+
		"\u018e\u0186\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000"+
		"\u018e\u018d\u0001\u0000\u0000\u0000\u018fQ\u0001\u0000\u0000\u0000\u0190"+
		"\u0191\u0005\u0016\u0000\u0000\u0191\u0192\u0003T*\u0000\u0192\u0193\u0005"+
		"%\u0000\u0000\u0193\u0194\u0003J%\u0000\u0194\u0195\u0003Z-\u0000\u0195"+
		"S\u0001\u0000\u0000\u0000\u0196\u0197\u0003\u008cF\u0000\u0197U\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u0005\u0017\u0000\u0000\u0199\u019a\u0005"+
		"%\u0000\u0000\u019a\u019b\u0003J%\u0000\u019b\u019c\u0003Z-\u0000\u019c"+
		"W\u0001\u0000\u0000\u0000\u019d\u019e\u0005\u0018\u0000\u0000\u019e\u019f"+
		"\u0005%\u0000\u0000\u019f\u01a0\u0003J%\u0000\u01a0\u01a1\u0003Z-\u0000"+
		"\u01a1Y\u0001\u0000\u0000\u0000\u01a2\u01a5\u0005\u0019\u0000\u0000\u01a3"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a5[\u0001\u0000\u0000\u0000\u01a6\u01a7"+
		"\u0005\u001a\u0000\u0000\u01a7\u01a8\u0003\u008cF\u0000\u01a8\u01a9\u0003"+
		"`0\u0000\u01a9\u01aa\u0005\n\u0000\u0000\u01aa]\u0001\u0000\u0000\u0000"+
		"\u01ab\u01ac\u0005\u001b\u0000\u0000\u01ac\u01ad\u0005*\u0000\u0000\u01ad"+
		"\u01ae\u0003b1\u0000\u01ae\u01af\u0005+\u0000\u0000\u01af\u01b0\u0003"+
		"`0\u0000\u01b0\u01b1\u0005\n\u0000\u0000\u01b1_\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b5\u0003\u0002\u0001\u0000\u01b3\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b5a\u0001\u0000\u0000\u0000\u01b6\u01b7\u0003d2\u0000\u01b7\u01b8"+
		"\u0005$\u0000\u0000\u01b8\u01b9\u0003l6\u0000\u01b9\u01bc\u0005$\u0000"+
		"\u0000\u01ba\u01bd\u0003d2\u0000\u01bb\u01bd\u0003j5\u0000\u01bc\u01ba"+
		"\u0001\u0000\u0000\u0000\u01bc\u01bb\u0001\u0000\u0000\u0000\u01bdc\u0001"+
		"\u0000\u0000\u0000\u01be\u01bf\u0005C\u0000\u0000\u01bf\u01c0\u0003h4"+
		"\u0000\u01c0\u01c1\u0003l6\u0000\u01c1\u01c7\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c3\u0005C\u0000\u0000\u01c3\u01c4\u0003f3\u0000\u01c4\u01c5\u0003"+
		"l6\u0000\u01c5\u01c7\u0001\u0000\u0000\u0000\u01c6\u01be\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c2\u0001\u0000\u0000\u0000\u01c7e\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c9\u0005#\u0000\u0000\u01c9\u01ca\u0005C\u0000\u0000\u01ca\u01cb"+
		"\u0003\u0006\u0003\u0000\u01cb\u01cc\u0003\u008cF\u0000\u01cc\u01cd\u0005"+
		"#\u0000\u0000\u01cd\u01d0\u0001\u0000\u0000\u0000\u01ce\u01d0\u0005@\u0000"+
		"\u0000\u01cf\u01c8\u0001\u0000\u0000\u0000\u01cf\u01ce\u0001\u0000\u0000"+
		"\u0000\u01d0g\u0001\u0000\u0000\u0000\u01d1\u01d2\u0007\u0000\u0000\u0000"+
		"\u01d2i\u0001\u0000\u0000\u0000\u01d3\u01d4\u0005C\u0000\u0000\u01d4\u01d5"+
		"\u0007\u0001\u0000\u0000\u01d5k\u0001\u0000\u0000\u0000\u01d6\u01d7\u0003"+
		"p8\u0000\u01d7\u01d8\u0003n7\u0000\u01d8m\u0001\u0000\u0000\u0000\u01d9"+
		"\u01da\u0005 \u0000\u0000\u01da\u01db\u0003p8\u0000\u01db\u01dc\u0003"+
		"n7\u0000\u01dc\u01df\u0001\u0000\u0000\u0000\u01dd\u01df\u0001\u0000\u0000"+
		"\u0000\u01de\u01d9\u0001\u0000\u0000\u0000\u01de\u01dd\u0001\u0000\u0000"+
		"\u0000\u01dfo\u0001\u0000\u0000\u0000\u01e0\u01e1\u0003v;\u0000\u01e1"+
		"\u01e2\u0003r9\u0000\u01e2q\u0001\u0000\u0000\u0000\u01e3\u01e4\u0005"+
		"\u001f\u0000\u0000\u01e4\u01e5\u0003v;\u0000\u01e5\u01e6\u0003r9\u0000"+
		"\u01e6\u01e9\u0001\u0000\u0000\u0000\u01e7\u01e9\u0001\u0000\u0000\u0000"+
		"\u01e8\u01e3\u0001\u0000\u0000\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000"+
		"\u01e9s\u0001\u0000\u0000\u0000\u01ea\u01eb\u0007\u0005\u0000\u0000\u01eb"+
		"u\u0001\u0000\u0000\u0000\u01ec\u01ed\u0003x<\u0000\u01ed\u01f1\u0003"+
		"t:\u0000\u01ee\u01f2\u0005B\u0000\u0000\u01ef\u01f2\u0005C\u0000\u0000"+
		"\u01f0\u01f2\u00034\u001a\u0000\u01f1\u01ee\u0001\u0000\u0000\u0000\u01f1"+
		"\u01ef\u0001\u0000\u0000\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f2"+
		"\u01f5\u0001\u0000\u0000\u0000\u01f3\u01f5\u0003x<\u0000\u01f4\u01ec\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f5w\u0001\u0000"+
		"\u0000\u0000\u01f6\u01fc\u0003|>\u0000\u01f7\u01f8\u0003z=\u0000\u01f8"+
		"\u01f9\u0003|>\u0000\u01f9\u01fb\u0001\u0000\u0000\u0000\u01fa\u01f7\u0001"+
		"\u0000\u0000\u0000\u01fb\u01fe\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001"+
		"\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fdy\u0001\u0000"+
		"\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01ff\u0200\u0005!\u0000"+
		"\u0000\u0200{\u0001\u0000\u0000\u0000\u0201\u0207\u0003\u0080@\u0000\u0202"+
		"\u0203\u0003~?\u0000\u0203\u0204\u0003\u0080@\u0000\u0204\u0206\u0001"+
		"\u0000\u0000\u0000\u0205\u0202\u0001\u0000\u0000\u0000\u0206\u0209\u0001"+
		"\u0000\u0000\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0207\u0208\u0001"+
		"\u0000\u0000\u0000\u0208}\u0001\u0000\u0000\u0000\u0209\u0207\u0001\u0000"+
		"\u0000\u0000\u020a\u020b\u0007\u0006\u0000\u0000\u020b\u007f\u0001\u0000"+
		"\u0000\u0000\u020c\u0212\u0003\u0084B\u0000\u020d\u020e\u0003\u0082A\u0000"+
		"\u020e\u020f\u0003\u0084B\u0000\u020f\u0211\u0001\u0000\u0000\u0000\u0210"+
		"\u020d\u0001\u0000\u0000\u0000\u0211\u0214\u0001\u0000\u0000\u0000\u0212"+
		"\u0210\u0001\u0000\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213"+
		"\u0081\u0001\u0000\u0000\u0000\u0214\u0212\u0001\u0000\u0000\u0000\u0215"+
		"\u0216\u0007\u0007\u0000\u0000\u0216\u0083\u0001\u0000\u0000\u0000\u0217"+
		"\u021d\u0003\u0088D\u0000\u0218\u0219\u0003\u0086C\u0000\u0219\u021a\u0003"+
		"\u0088D\u0000\u021a\u021c\u0001\u0000\u0000\u0000\u021b\u0218\u0001\u0000"+
		"\u0000\u0000\u021c\u021f\u0001\u0000\u0000\u0000\u021d\u021b\u0001\u0000"+
		"\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e\u0085\u0001\u0000"+
		"\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u0220\u0221\u00057\u0000"+
		"\u0000\u0221\u0087\u0001\u0000\u0000\u0000\u0222\u0223\u0003\u00acV\u0000"+
		"\u0223\u0224\u0003\u008aE\u0000\u0224\u0089\u0001\u0000\u0000\u0000\u0225"+
		"\u0229\u0005B\u0000\u0000\u0226\u0228\u00038\u001c\u0000\u0227\u0226\u0001"+
		"\u0000\u0000\u0000\u0228\u022b\u0001\u0000\u0000\u0000\u0229\u0227\u0001"+
		"\u0000\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a\u023a\u0001"+
		"\u0000\u0000\u0000\u022b\u0229\u0001\u0000\u0000\u0000\u022c\u0230\u0005"+
		"C\u0000\u0000\u022d\u022f\u00038\u001c\u0000\u022e\u022d\u0001\u0000\u0000"+
		"\u0000\u022f\u0232\u0001\u0000\u0000\u0000\u0230\u022e\u0001\u0000\u0000"+
		"\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u023a\u0001\u0000\u0000"+
		"\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0233\u0234\u0005*\u0000\u0000"+
		"\u0234\u0235\u0003l6\u0000\u0235\u0236\u0005+\u0000\u0000\u0236\u023a"+
		"\u0001\u0000\u0000\u0000\u0237\u023a\u0005\u001e\u0000\u0000\u0238\u023a"+
		"\u0001\u0000\u0000\u0000\u0239\u0225\u0001\u0000\u0000\u0000\u0239\u022c"+
		"\u0001\u0000\u0000\u0000\u0239\u0233\u0001\u0000\u0000\u0000\u0239\u0237"+
		"\u0001\u0000\u0000\u0000\u0239\u0238\u0001\u0000\u0000\u0000\u023a\u008b"+
		"\u0001\u0000\u0000\u0000\u023b\u023c\u0003\u0090H\u0000\u023c\u023d\u0003"+
		"\u008eG\u0000\u023d\u008d\u0001\u0000\u0000\u0000\u023e\u023f\u0005 \u0000"+
		"\u0000\u023f\u0240\u0003\u0090H\u0000\u0240\u0241\u0003\u008eG\u0000\u0241"+
		"\u0244\u0001\u0000\u0000\u0000\u0242\u0244\u0001\u0000\u0000\u0000\u0243"+
		"\u023e\u0001\u0000\u0000\u0000\u0243\u0242\u0001\u0000\u0000\u0000\u0244"+
		"\u008f\u0001\u0000\u0000\u0000\u0245\u0246\u0003\u0096K\u0000\u0246\u0247"+
		"\u0003\u0092I\u0000\u0247\u0091\u0001\u0000\u0000\u0000\u0248\u0249\u0005"+
		"\u001f\u0000\u0000\u0249\u024a\u0003\u0096K\u0000\u024a\u024b\u0003\u0092"+
		"I\u0000\u024b\u024e\u0001\u0000\u0000\u0000\u024c\u024e\u0001\u0000\u0000"+
		"\u0000\u024d\u0248\u0001\u0000\u0000\u0000\u024d\u024c\u0001\u0000\u0000"+
		"\u0000\u024e\u0093\u0001\u0000\u0000\u0000\u024f\u0250\u0007\u0005\u0000"+
		"\u0000\u0250\u0095\u0001\u0000\u0000\u0000\u0251\u0252\u0003\u0098L\u0000"+
		"\u0252\u0255\u0003\u0094J\u0000\u0253\u0256\u0003\u0098L\u0000\u0254\u0256"+
		"\u00034\u001a\u0000\u0255\u0253\u0001\u0000\u0000\u0000\u0255\u0254\u0001"+
		"\u0000\u0000\u0000\u0256\u0259\u0001\u0000\u0000\u0000\u0257\u0259\u0003"+
		"\u0098L\u0000\u0258\u0251\u0001\u0000\u0000\u0000\u0258\u0257\u0001\u0000"+
		"\u0000\u0000\u0259\u0097\u0001\u0000\u0000\u0000\u025a\u0260\u0003\u009c"+
		"N\u0000\u025b\u025c\u0003\u009aM\u0000\u025c\u025d\u0003\u009cN\u0000"+
		"\u025d\u025f\u0001\u0000\u0000\u0000\u025e\u025b\u0001\u0000\u0000\u0000"+
		"\u025f\u0262\u0001\u0000\u0000\u0000\u0260\u025e\u0001\u0000\u0000\u0000"+
		"\u0260\u0261\u0001\u0000\u0000\u0000\u0261\u0099\u0001\u0000\u0000\u0000"+
		"\u0262\u0260\u0001\u0000\u0000\u0000\u0263\u0264\u0005!\u0000\u0000\u0264"+
		"\u009b\u0001\u0000\u0000\u0000\u0265\u026b\u0003\u00a0P\u0000\u0266\u0267"+
		"\u0003\u009eO\u0000\u0267\u0268\u0003\u00a0P\u0000\u0268\u026a\u0001\u0000"+
		"\u0000\u0000\u0269\u0266\u0001\u0000\u0000\u0000\u026a\u026d\u0001\u0000"+
		"\u0000\u0000\u026b\u0269\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000"+
		"\u0000\u0000\u026c\u009d\u0001\u0000\u0000\u0000\u026d\u026b\u0001\u0000"+
		"\u0000\u0000\u026e\u026f\u0007\u0006\u0000\u0000\u026f\u009f\u0001\u0000"+
		"\u0000\u0000\u0270\u0276\u0003\u00a4R\u0000\u0271\u0272\u0003\u00a2Q\u0000"+
		"\u0272\u0273\u0003\u00a4R\u0000\u0273\u0275\u0001\u0000\u0000\u0000\u0274"+
		"\u0271\u0001\u0000\u0000\u0000\u0275\u0278\u0001\u0000\u0000\u0000\u0276"+
		"\u0274\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277"+
		"\u00a1\u0001\u0000\u0000\u0000\u0278\u0276\u0001\u0000\u0000\u0000\u0279"+
		"\u027a\u0007\u0007\u0000\u0000\u027a\u00a3\u0001\u0000\u0000\u0000\u027b"+
		"\u0281\u0003\u00a8T\u0000\u027c\u027d\u0003\u00a6S\u0000\u027d\u027e\u0003"+
		"\u00a8T\u0000\u027e\u0280\u0001\u0000\u0000\u0000\u027f\u027c\u0001\u0000"+
		"\u0000\u0000\u0280\u0283\u0001\u0000\u0000\u0000\u0281\u027f\u0001\u0000"+
		"\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282\u00a5\u0001\u0000"+
		"\u0000\u0000\u0283\u0281\u0001\u0000\u0000\u0000\u0284\u0285\u00057\u0000"+
		"\u0000\u0285\u00a7\u0001\u0000\u0000\u0000\u0286\u0287\u0003\u00acV\u0000"+
		"\u0287\u0288\u0003\u00aaU\u0000\u0288\u00a9\u0001\u0000\u0000\u0000\u0289"+
		"\u028d\u0005B\u0000\u0000\u028a\u028c\u00038\u001c\u0000\u028b\u028a\u0001"+
		"\u0000\u0000\u0000\u028c\u028f\u0001\u0000\u0000\u0000\u028d\u028b\u0001"+
		"\u0000\u0000\u0000\u028d\u028e\u0001\u0000\u0000\u0000\u028e\u02a6\u0001"+
		"\u0000\u0000\u0000\u028f\u028d\u0001\u0000\u0000\u0000\u0290\u0294\u0005"+
		"C\u0000\u0000\u0291\u0293\u00038\u001c\u0000\u0292\u0291\u0001\u0000\u0000"+
		"\u0000\u0293\u0296\u0001\u0000\u0000\u0000\u0294\u0292\u0001\u0000\u0000"+
		"\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295\u02a6\u0001\u0000\u0000"+
		"\u0000\u0296\u0294\u0001\u0000\u0000\u0000\u0297\u0298\u0005*\u0000\u0000"+
		"\u0298\u0299\u0003\u008cF\u0000\u0299\u029a\u0005+\u0000\u0000\u029a\u02a6"+
		"\u0001\u0000\u0000\u0000\u029b\u02a6\u0005\u001e\u0000\u0000\u029c\u02a6"+
		"\u0003\u0018\f\u0000\u029d\u02a6\u0003\u0016\u000b\u0000\u029e\u02a6\u0003"+
		"\u000e\u0007\u0000\u029f\u02a6\u0003<\u001e\u0000\u02a0\u02a6\u0003:\u001d"+
		"\u0000\u02a1\u02a2\u0003\"\u0011\u0000\u02a2\u02a3\u0005\u001c\u0000\u0000"+
		"\u02a3\u02a6\u0001\u0000\u0000\u0000\u02a4\u02a6\u0005\u001d\u0000\u0000"+
		"\u02a5\u0289\u0001\u0000\u0000\u0000\u02a5\u0290\u0001\u0000\u0000\u0000"+
		"\u02a5\u0297\u0001\u0000\u0000\u0000\u02a5\u029b\u0001\u0000\u0000\u0000"+
		"\u02a5\u029c\u0001\u0000\u0000\u0000\u02a5\u029d\u0001\u0000\u0000\u0000"+
		"\u02a5\u029e\u0001\u0000\u0000\u0000\u02a5\u029f\u0001\u0000\u0000\u0000"+
		"\u02a5\u02a0\u0001\u0000\u0000\u0000\u02a5\u02a1\u0001\u0000\u0000\u0000"+
		"\u02a5\u02a4\u0001\u0000\u0000\u0000\u02a6\u00ab\u0001\u0000\u0000\u0000"+
		"\u02a7\u02a9\u0007\b\u0000\u0000\u02a8\u02a7\u0001\u0000\u0000\u0000\u02a9"+
		"\u02ac\u0001\u0000\u0000\u0000\u02aa\u02a8\u0001\u0000\u0000\u0000\u02aa"+
		"\u02ab\u0001\u0000\u0000\u0000\u02ab\u00ad\u0001\u0000\u0000\u0000\u02ac"+
		"\u02aa\u0001\u0000\u0000\u0000-\u00c4\u00d2\u00db\u00e4\u0108\u0111\u011b"+
		"\u0127\u012e\u013f\u0159\u0160\u0164\u0168\u017c\u0188\u018e\u01a4\u01b4"+
		"\u01bc\u01c6\u01cf\u01de\u01e8\u01f1\u01f4\u01fc\u0207\u0212\u021d\u0229"+
		"\u0230\u0239\u0243\u024d\u0255\u0258\u0260\u026b\u0276\u0281\u028d\u0294"+
		"\u02a5\u02aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}