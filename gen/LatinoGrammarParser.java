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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, STRING=35, TKN_AND=36, TKN_OR=37, TKN_CONCAT=38, 
		TKN_PERIOD=39, TKN_COMMA=40, TKN_SEMICOLON=41, TKN_COLON=42, TKN_OPENING_KEY=43, 
		TKN_CLOSING_KEY=44, TKN_OPENING_BRA=45, TKN_CLOSING_BRA=46, TKN_OPENING_PAR=47, 
		TKN_CLOSING_PAR=48, TKN_INCREMENT=49, TKN_DECREMENT=50, TKN_MOD_ASSIGN=51, 
		TKN_DIV_ASSIGN=52, TKN_TIMES_ASSIGN=53, TKN_MINUS_ASSIGN=54, TKN_PLUS_ASSIGN=55, 
		TKN_PLUS=56, TKN_MINUS=57, TKN_TIMES=58, TKN_DIV=59, TKN_POWER=60, TKN_MOD=61, 
		TKN_EQUAL=62, TKN_NEQ=63, TKN_LEQ=64, TKN_GEQ=65, TKN_GREATER=66, TKN_LESS=67, 
		TKN_REGEX=68, TKN_ASSIGN=69, TKN_NOT=70, NUM=71, ID=72, ESPACIO=73, COMMENT_LINE=74, 
		COMMENT_BLOCK=75;
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
		RULE_otherClause = 44, RULE_romperOp = 45, RULE_repetir_loop = 46, RULE_repetir_aux = 47, 
		RULE_repetir_aux2 = 48, RULE_rango_loop = 49, RULE_inicio_value = 50, 
		RULE_fin_value = 51, RULE_salto_value = 52, RULE_final_arguments = 53, 
		RULE_mientras_loop = 54, RULE_desde_loop = 55, RULE_loop_substatement = 56, 
		RULE_triple_expr = 57, RULE_loop_assign = 58, RULE_loop_assignAux = 59, 
		RULE_loop_assignmentOperator = 60, RULE_loop_assignIncrDecr = 61, RULE_loop_expr = 62, 
		RULE_loop_exprRest = 63, RULE_loop_expBool = 64, RULE_loop_expBoolRest = 65, 
		RULE_loop_opRel = 66, RULE_loop_expRel = 67, RULE_loop_exprConcat = 68, 
		RULE_loop_exprConcatOp = 69, RULE_loop_expArit = 70, RULE_loop_expAritOp = 71, 
		RULE_loop_term = 72, RULE_loop_termOp = 73, RULE_loop_factor = 74, RULE_loop_factorOp = 75, 
		RULE_loop_t_factor = 76, RULE_loop_expr_terminals = 77, RULE_expr = 78, 
		RULE_exprRest = 79, RULE_expBool = 80, RULE_expBoolRest = 81, RULE_opRel = 82, 
		RULE_expRel = 83, RULE_exprConcat = 84, RULE_exprConcatOp = 85, RULE_expArit = 86, 
		RULE_expAritOp = 87, RULE_term = 88, RULE_termOp = 89, RULE_factor = 90, 
		RULE_factorOp = 91, RULE_t_factor = 92, RULE_expr_terminals = 93, RULE_expr_factor = 94;
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
			"romperOp", "repetir_loop", "repetir_aux", "repetir_aux2", "rango_loop", 
			"inicio_value", "fin_value", "salto_value", "final_arguments", "mientras_loop", 
			"desde_loop", "loop_substatement", "triple_expr", "loop_assign", "loop_assignAux", 
			"loop_assignmentOperator", "loop_assignIncrDecr", "loop_expr", "loop_exprRest", 
			"loop_expBool", "loop_expBoolRest", "loop_opRel", "loop_expRel", "loop_exprConcat", 
			"loop_exprConcatOp", "loop_expArit", "loop_expAritOp", "loop_term", "loop_termOp", 
			"loop_factor", "loop_factorOp", "loop_t_factor", "loop_expr_terminals", 
			"expr", "exprRest", "expBool", "expBoolRest", "opRel", "expRel", "exprConcat", 
			"exprConcatOp", "expArit", "expAritOp", "term", "termOp", "factor", "factorOp", 
			"t_factor", "expr_terminals", "expr_factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'acadena'", "'incluir'", "'leer'", "'limpiar'", "'alogico'", "'anumero'", 
			"'escribir'", "'imprimir'", "'poner'", "'fin'", "'funcion'", "'fun'", 
			"'retornar'", "'regresar'", "'ret'", "'lista'", "'longitud'", "'si'", 
			"'osi'", "'sino'", "'elegir'", "'caso'", "'defecto'", "'otro'", "'romper'", 
			"'repetir'", "'hasta'", "'para'", "'en rango'", "', '", "'mientras'", 
			"'desde'", "'verdadero'", "'falso'", null, "'&&'", "'||'", "'..'", "'.'", 
			"','", "';'", "':'", "'{'", "'}'", "'['", "']'", "'('", "')'", "'++'", 
			"'--'", "'%='", "'/='", "'*='", "'-='", "'+='", "'+'", "'-'", "'*'", 
			"'/'", "'^'", "'%'", "'=='", "'!='", "'<='", "'>='", "'>'", "'<'", "'~='", 
			"'='", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "STRING", 
			"TKN_AND", "TKN_OR", "TKN_CONCAT", "TKN_PERIOD", "TKN_COMMA", "TKN_SEMICOLON", 
			"TKN_COLON", "TKN_OPENING_KEY", "TKN_CLOSING_KEY", "TKN_OPENING_BRA", 
			"TKN_CLOSING_BRA", "TKN_OPENING_PAR", "TKN_CLOSING_PAR", "TKN_INCREMENT", 
			"TKN_DECREMENT", "TKN_MOD_ASSIGN", "TKN_DIV_ASSIGN", "TKN_TIMES_ASSIGN", 
			"TKN_MINUS_ASSIGN", "TKN_PLUS_ASSIGN", "TKN_PLUS", "TKN_MINUS", "TKN_TIMES", 
			"TKN_DIV", "TKN_POWER", "TKN_MOD", "TKN_EQUAL", "TKN_NEQ", "TKN_LEQ", 
			"TKN_GEQ", "TKN_GREATER", "TKN_LESS", "TKN_REGEX", "TKN_ASSIGN", "TKN_NOT", 
			"NUM", "ID", "ESPACIO", "COMMENT_LINE", "COMMENT_BLOCK"
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
			setState(190);
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
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				print_stat();
				setState(193);
				substatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				assign();
				setState(196);
				substatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				built_in_functions();
				setState(199);
				substatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				function_stat();
				setState(202);
				substatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				special_methods();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				conditionals();
				setState(206);
				substatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(208);
				loops();
				setState(209);
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
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(ID);
				setState(215);
				assignmentOperator();
				setState(216);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(ID);
				setState(219);
				assignAux();
				setState(220);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				match(ID);
				setState(223);
				assignIncrDecr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				match(ID);
				setState(225);
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
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(228);
				match(TKN_COMMA);
				}
				{
				setState(229);
				match(ID);
				}
				{
				setState(230);
				assignAux();
				}
				{
				setState(231);
				expr();
				}
				{
				setState(232);
				match(TKN_COMMA);
				}
				}
				break;
			case TKN_ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
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
			setState(237);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 69805794224242688L) != 0)) ) {
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
			setState(239);
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
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				incluir_stat();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				leer_stat();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
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
			setState(246);
			match(T__0);
			setState(247);
			match(TKN_OPENING_PAR);
			setState(248);
			expArit();
			setState(249);
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
			setState(251);
			match(T__1);
			setState(252);
			match(TKN_OPENING_PAR);
			setState(253);
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
			setState(255);
			match(T__2);
			setState(256);
			match(TKN_OPENING_PAR);
			setState(257);
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
			setState(259);
			match(T__3);
			setState(260);
			match(TKN_OPENING_PAR);
			setState(261);
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
			setState(263);
			match(T__4);
			setState(264);
			match(TKN_OPENING_PAR);
			setState(265);
			expr();
			setState(266);
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
			setState(268);
			match(T__5);
			setState(269);
			match(TKN_OPENING_PAR);
			setState(270);
			expr();
			setState(271);
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
			setState(273);
			print_operations();
			setState(274);
			match(TKN_OPENING_PAR);
			setState(275);
			print_stat_cont();
			setState(276);
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
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
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
			setState(282);
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
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(ID);
				setState(285);
				match(TKN_OPENING_BRA);
				setState(286);
				match(ID);
				setState(287);
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
			setState(291);
			function_op();
			setState(292);
			function_name();
			setState(293);
			function_pars();
			setState(294);
			function_content();
			setState(295);
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
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
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
			setState(301);
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
			setState(303);
			match(TKN_OPENING_PAR);
			setState(304);
			function_args();
			setState(305);
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
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__4:
			case T__5:
			case T__10:
			case T__11:
			case T__33:
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
				setState(307);
				expr();
				setState(308);
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
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(TKN_COMMA);
				setState(314);
				expr();
				setState(315);
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
			setState(320);
			function_ret_op();
			setState(321);
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
			setState(323);
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
			setState(325);
			substatement();
			setState(326);
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
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				longitud_method();
				setState(329);
				substatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				brakets();
				setState(332);
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
			setState(337);
			match(T__15);
			}
			{
			setState(338);
			match(TKN_PERIOD);
			}
			{
			setState(339);
			match(T__16);
			}
			{
			setState(340);
			match(TKN_OPENING_PAR);
			}
			{
			setState(341);
			match(ID);
			}
			{
			setState(342);
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
			setState(344);
			match(TKN_OPENING_BRA);
			setState(345);
			match(ID);
			setState(346);
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
			setState(348);
			match(ID);
			setState(349);
			match(TKN_OPENING_PAR);
			setState(350);
			function_args();
			setState(351);
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
			setState(353);
			match(TKN_OPENING_BRA);
			setState(354);
			array_content();
			setState(355);
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
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__4:
			case T__5:
			case T__10:
			case T__11:
			case T__33:
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
				setState(357);
				expr();
				setState(358);
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
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(TKN_COMMA);
				setState(364);
				expr();
				setState(365);
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
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				if_conditional();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
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
		public Repetir_loopContext repetir_loop() {
			return getRuleContext(Repetir_loopContext.class,0);
		}
		public Rango_loopContext rango_loop() {
			return getRuleContext(Rango_loopContext.class,0);
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
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				desde_loop();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				mientras_loop();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				repetir_loop();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 4);
				{
				setState(377);
				rango_loop();
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
			setState(380);
			match(T__17);
			setState(381);
			conditional_expr();
			setState(382);
			conditional_substatement();
			setState(383);
			if_conditional_aux();
			setState(384);
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
			setState(386);
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
			setState(388);
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
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				match(T__18);
				setState(391);
				conditional_expr();
				setState(392);
				conditional_substatement();
				setState(393);
				if_conditional_aux();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(T__19);
				setState(396);
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
			setState(400);
			match(T__20);
			setState(401);
			match(TKN_OPENING_PAR);
			setState(402);
			expr();
			setState(403);
			match(TKN_CLOSING_PAR);
			setState(404);
			caseBlock();
			setState(405);
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
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(408); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(407);
						caseClause();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(410); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(412);
				caseBlock();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				defaultClause();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
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
			setState(418);
			match(T__21);
			setState(419);
			caseClauseExpr();
			setState(420);
			match(TKN_COLON);
			setState(421);
			conditional_substatement();
			setState(422);
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
			setState(424);
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
			setState(426);
			match(T__22);
			setState(427);
			match(TKN_COLON);
			setState(428);
			conditional_substatement();
			setState(429);
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
			setState(431);
			match(T__23);
			setState(432);
			match(TKN_COLON);
			setState(433);
			conditional_substatement();
			setState(434);
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
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
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
	public static class Repetir_loopContext extends ParserRuleContext {
		public Loop_substatementContext loop_substatement() {
			return getRuleContext(Loop_substatementContext.class,0);
		}
		public Repetir_auxContext repetir_aux() {
			return getRuleContext(Repetir_auxContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Repetir_aux2Context repetir_aux2() {
			return getRuleContext(Repetir_aux2Context.class,0);
		}
		public Repetir_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetir_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterRepetir_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitRepetir_loop(this);
		}
	}

	public final Repetir_loopContext repetir_loop() throws RecognitionException {
		Repetir_loopContext _localctx = new Repetir_loopContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_repetir_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(T__25);
			setState(441);
			loop_substatement();
			setState(442);
			repetir_aux();
			setState(443);
			match(T__26);
			setState(444);
			expr();
			setState(445);
			repetir_aux2();
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
	public static class Repetir_auxContext extends ParserRuleContext {
		public Repetir_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetir_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterRepetir_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitRepetir_aux(this);
		}
	}

	public final Repetir_auxContext repetir_aux() throws RecognitionException {
		Repetir_auxContext _localctx = new Repetir_auxContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_repetir_aux);
		try {
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
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
	public static class Repetir_aux2Context extends ParserRuleContext {
		public Repetir_aux2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetir_aux2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterRepetir_aux2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitRepetir_aux2(this);
		}
	}

	public final Repetir_aux2Context repetir_aux2() throws RecognitionException {
		Repetir_aux2Context _localctx = new Repetir_aux2Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_repetir_aux2);
		try {
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
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
	public static class Rango_loopContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LatinoGrammarParser.ID, 0); }
		public TerminalNode TKN_OPENING_PAR() { return getToken(LatinoGrammarParser.TKN_OPENING_PAR, 0); }
		public Inicio_valueContext inicio_value() {
			return getRuleContext(Inicio_valueContext.class,0);
		}
		public Fin_valueContext fin_value() {
			return getRuleContext(Fin_valueContext.class,0);
		}
		public Salto_valueContext salto_value() {
			return getRuleContext(Salto_valueContext.class,0);
		}
		public Final_argumentsContext final_arguments() {
			return getRuleContext(Final_argumentsContext.class,0);
		}
		public Loop_substatementContext loop_substatement() {
			return getRuleContext(Loop_substatementContext.class,0);
		}
		public Rango_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rango_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterRango_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitRango_loop(this);
		}
	}

	public final Rango_loopContext rango_loop() throws RecognitionException {
		Rango_loopContext _localctx = new Rango_loopContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_rango_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(T__27);
			setState(456);
			match(ID);
			setState(457);
			match(T__28);
			setState(458);
			match(TKN_OPENING_PAR);
			setState(459);
			inicio_value();
			setState(460);
			fin_value();
			setState(461);
			salto_value();
			setState(462);
			final_arguments();
			setState(463);
			loop_substatement();
			setState(464);
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
	public static class Inicio_valueContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(LatinoGrammarParser.NUM, 0); }
		public TerminalNode TKN_MINUS() { return getToken(LatinoGrammarParser.TKN_MINUS, 0); }
		public Inicio_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterInicio_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitInicio_value(this);
		}
	}

	public final Inicio_valueContext inicio_value() throws RecognitionException {
		Inicio_valueContext _localctx = new Inicio_valueContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_inicio_value);
		try {
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				match(NUM);
				}
				break;
			case TKN_MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				match(TKN_MINUS);
				setState(468);
				match(NUM);
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
	public static class Fin_valueContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(LatinoGrammarParser.NUM, 0); }
		public TerminalNode TKN_MINUS() { return getToken(LatinoGrammarParser.TKN_MINUS, 0); }
		public Fin_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fin_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterFin_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitFin_value(this);
		}
	}

	public final Fin_valueContext fin_value() throws RecognitionException {
		Fin_valueContext _localctx = new Fin_valueContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_fin_value);
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				match(T__29);
				setState(472);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(T__29);
				setState(474);
				match(TKN_MINUS);
				setState(475);
				match(NUM);
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
	public static class Salto_valueContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(LatinoGrammarParser.NUM, 0); }
		public TerminalNode TKN_MINUS() { return getToken(LatinoGrammarParser.TKN_MINUS, 0); }
		public Salto_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salto_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterSalto_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitSalto_value(this);
		}
	}

	public final Salto_valueContext salto_value() throws RecognitionException {
		Salto_valueContext _localctx = new Salto_valueContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_salto_value);
		try {
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				match(T__29);
				setState(480);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				match(T__29);
				setState(482);
				match(TKN_MINUS);
				setState(483);
				match(NUM);
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
	public static class Final_argumentsContext extends ParserRuleContext {
		public TerminalNode TKN_CLOSING_PAR() { return getToken(LatinoGrammarParser.TKN_CLOSING_PAR, 0); }
		public Final_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_final_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterFinal_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitFinal_arguments(this);
		}
	}

	public final Final_argumentsContext final_arguments() throws RecognitionException {
		Final_argumentsContext _localctx = new Final_argumentsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_final_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
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
		enterRule(_localctx, 108, RULE_mientras_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(T__30);
			setState(490);
			expr();
			setState(491);
			loop_substatement();
			setState(492);
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
		enterRule(_localctx, 110, RULE_desde_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(T__31);
			setState(495);
			match(TKN_OPENING_PAR);
			setState(496);
			triple_expr();
			setState(497);
			match(TKN_CLOSING_PAR);
			setState(498);
			loop_substatement();
			setState(499);
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
		enterRule(_localctx, 112, RULE_loop_substatement);
		try {
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
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
		enterRule(_localctx, 114, RULE_triple_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			loop_assign();
			setState(506);
			match(TKN_SEMICOLON);
			setState(507);
			loop_expr();
			setState(508);
			match(TKN_SEMICOLON);
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(509);
				loop_assign();
				}
				break;
			case 2:
				{
				setState(510);
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
		enterRule(_localctx, 116, RULE_loop_assign);
		try {
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				match(ID);
				setState(514);
				loop_assignmentOperator();
				setState(515);
				loop_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				match(ID);
				setState(518);
				loop_assignAux();
				setState(519);
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
		enterRule(_localctx, 118, RULE_loop_assignAux);
		try {
			setState(530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(523);
				match(TKN_COMMA);
				}
				{
				setState(524);
				match(ID);
				}
				{
				setState(525);
				assignAux();
				}
				{
				setState(526);
				expr();
				}
				{
				setState(527);
				match(TKN_COMMA);
				}
				}
				break;
			case TKN_ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
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
		enterRule(_localctx, 120, RULE_loop_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 69805794224242688L) != 0)) ) {
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
		enterRule(_localctx, 122, RULE_loop_assignIncrDecr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(ID);
			setState(535);
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
		enterRule(_localctx, 124, RULE_loop_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			loop_expBool();
			setState(538);
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
		enterRule(_localctx, 126, RULE_loop_exprRest);
		try {
			setState(545);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(TKN_OR);
				setState(541);
				loop_expBool();
				setState(542);
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
		enterRule(_localctx, 128, RULE_loop_expBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			loop_expRel();
			setState(548);
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
		enterRule(_localctx, 130, RULE_loop_expBoolRest);
		try {
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				match(TKN_AND);
				setState(551);
				loop_expRel();
				setState(552);
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
		enterRule(_localctx, 132, RULE_loop_opRel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 63L) != 0)) ) {
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
		enterRule(_localctx, 134, RULE_loop_expRel);
		try {
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(559);
				loop_exprConcat();
				}
				{
				setState(560);
				loop_opRel();
				}
				setState(564);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUM:
					{
					setState(561);
					match(NUM);
					}
					break;
				case ID:
					{
					setState(562);
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
					setState(563);
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
				setState(566);
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
		enterRule(_localctx, 136, RULE_loop_exprConcat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			loop_expArit();
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_CONCAT) {
				{
				{
				setState(570);
				loop_exprConcatOp();
				setState(571);
				loop_expArit();
				}
				}
				setState(577);
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
		enterRule(_localctx, 138, RULE_loop_exprConcatOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
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
		enterRule(_localctx, 140, RULE_loop_expArit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			loop_term();
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_PLUS || _la==TKN_MINUS) {
				{
				{
				setState(581);
				loop_expAritOp();
				setState(582);
				loop_term();
				}
				}
				setState(588);
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
		enterRule(_localctx, 142, RULE_loop_expAritOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
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
		enterRule(_localctx, 144, RULE_loop_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			loop_factor();
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3170534137668829184L) != 0)) {
				{
				{
				setState(592);
				loop_termOp();
				setState(593);
				loop_factor();
				}
				}
				setState(599);
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
		enterRule(_localctx, 146, RULE_loop_termOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3170534137668829184L) != 0)) ) {
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
		enterRule(_localctx, 148, RULE_loop_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			loop_t_factor();
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_POWER) {
				{
				{
				setState(603);
				loop_factorOp();
				setState(604);
				loop_t_factor();
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
		enterRule(_localctx, 150, RULE_loop_factorOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
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
		enterRule(_localctx, 152, RULE_loop_t_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(613);
			expr_factor();
			}
			{
			setState(614);
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
		enterRule(_localctx, 154, RULE_loop_expr_terminals);
		int _la;
		try {
			setState(636);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
				match(NUM);
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TKN_OPENING_BRA) {
					{
					{
					setState(617);
					brakets();
					}
					}
					setState(622);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				match(ID);
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TKN_OPENING_BRA) {
					{
					{
					setState(624);
					brakets();
					}
					}
					setState(629);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case TKN_OPENING_PAR:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(630);
				match(TKN_OPENING_PAR);
				}
				{
				setState(631);
				loop_expr();
				}
				{
				setState(632);
				match(TKN_CLOSING_PAR);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(634);
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
		enterRule(_localctx, 156, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			expBool();
			setState(639);
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
		enterRule(_localctx, 158, RULE_exprRest);
		try {
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(641);
				match(TKN_OR);
				setState(642);
				expBool();
				setState(643);
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
		enterRule(_localctx, 160, RULE_expBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			expRel();
			setState(649);
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
		enterRule(_localctx, 162, RULE_expBoolRest);
		try {
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				match(TKN_AND);
				setState(652);
				expRel();
				setState(653);
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
		enterRule(_localctx, 164, RULE_opRel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 63L) != 0)) ) {
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
		enterRule(_localctx, 166, RULE_expRel);
		try {
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(660);
				exprConcat();
				}
				{
				setState(661);
				opRel();
				}
				setState(664);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(662);
					exprConcat();
					}
					break;
				case 2:
					{
					setState(663);
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
				setState(666);
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
		enterRule(_localctx, 168, RULE_exprConcat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			expArit();
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_CONCAT) {
				{
				{
				setState(670);
				exprConcatOp();
				setState(671);
				expArit();
				}
				}
				setState(677);
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
		enterRule(_localctx, 170, RULE_exprConcatOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
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
		enterRule(_localctx, 172, RULE_expArit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			term();
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_PLUS || _la==TKN_MINUS) {
				{
				{
				setState(681);
				expAritOp();
				setState(682);
				term();
				}
				}
				setState(688);
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
		enterRule(_localctx, 174, RULE_expAritOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
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
		enterRule(_localctx, 176, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			factor();
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3170534137668829184L) != 0)) {
				{
				{
				setState(692);
				termOp();
				setState(693);
				factor();
				}
				}
				setState(699);
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
		enterRule(_localctx, 178, RULE_termOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3170534137668829184L) != 0)) ) {
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
		enterRule(_localctx, 180, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			t_factor();
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_POWER) {
				{
				{
				setState(703);
				factorOp();
				setState(704);
				t_factor();
				}
				}
				setState(710);
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
		enterRule(_localctx, 182, RULE_factorOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
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
		enterRule(_localctx, 184, RULE_t_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(713);
			expr_factor();
			}
			{
			setState(714);
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
		enterRule(_localctx, 186, RULE_expr_terminals);
		try {
			int _alt;
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				match(NUM);
				setState(720);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(717);
						brakets();
						}
						} 
					}
					setState(722);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				match(ID);
				setState(727);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(724);
						brakets();
						}
						} 
					}
					setState(729);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(730);
				match(TKN_OPENING_PAR);
				}
				{
				setState(731);
				expr();
				}
				{
				setState(732);
				match(TKN_CLOSING_PAR);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(734);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(735);
				anumero_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(736);
				alogico_stat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(737);
				acadena_stat();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(738);
				array();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(739);
				function_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(740);
				function_stat();
				setState(741);
				match(T__32);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(743);
				match(T__33);
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
		enterRule(_localctx, 188, RULE_expr_factor);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(746);
					_la = _input.LA(1);
					if ( !(((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 16387L) != 0)) ) {
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
				setState(751);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		"\u0004\u0001K\u02f1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00d5\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u00e3\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00ec\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00f5\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e\u0119\b"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0122\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u012c\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0138\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u013f\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u0150\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u016a\b\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u0171\b \u0001!\u0001!\u0003!\u0175\b!\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0003\"\u017b\b\"\u0001#\u0001#\u0001#\u0001#\u0001#"+
		"\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u018f\b&\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001(\u0004(\u0199\b(\u000b(\f(\u019a\u0001"+
		"(\u0001(\u0001(\u0001(\u0003(\u01a1\b(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001-\u0001-\u0003-\u01b7\b-\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0003/\u01c2\b/\u00010\u0001"+
		"0\u00030\u01c6\b0\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00012\u00012\u00012\u00032\u01d6\b2\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00033\u01de\b3\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00034\u01e6\b4\u00015\u00015\u00016\u00016\u00016\u0001"+
		"6\u00016\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00018\u0001"+
		"8\u00038\u01f8\b8\u00019\u00019\u00019\u00019\u00019\u00019\u00039\u0200"+
		"\b9\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0003:\u020a"+
		"\b:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u0213\b;\u0001"+
		"<\u0001<\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0003?\u0222\b?\u0001@\u0001@\u0001@\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0003A\u022c\bA\u0001B\u0001B\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0003C\u0235\bC\u0001C\u0003C\u0238\bC\u0001D\u0001D\u0001D\u0001"+
		"D\u0005D\u023e\bD\nD\fD\u0241\tD\u0001E\u0001E\u0001F\u0001F\u0001F\u0001"+
		"F\u0005F\u0249\bF\nF\fF\u024c\tF\u0001G\u0001G\u0001H\u0001H\u0001H\u0001"+
		"H\u0005H\u0254\bH\nH\fH\u0257\tH\u0001I\u0001I\u0001J\u0001J\u0001J\u0001"+
		"J\u0005J\u025f\bJ\nJ\fJ\u0262\tJ\u0001K\u0001K\u0001L\u0001L\u0001L\u0001"+
		"M\u0001M\u0005M\u026b\bM\nM\fM\u026e\tM\u0001M\u0001M\u0005M\u0272\bM"+
		"\nM\fM\u0275\tM\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0003M\u027d"+
		"\bM\u0001N\u0001N\u0001N\u0001O\u0001O\u0001O\u0001O\u0001O\u0003O\u0287"+
		"\bO\u0001P\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u0291"+
		"\bQ\u0001R\u0001R\u0001S\u0001S\u0001S\u0001S\u0003S\u0299\bS\u0001S\u0003"+
		"S\u029c\bS\u0001T\u0001T\u0001T\u0001T\u0005T\u02a2\bT\nT\fT\u02a5\tT"+
		"\u0001U\u0001U\u0001V\u0001V\u0001V\u0001V\u0005V\u02ad\bV\nV\fV\u02b0"+
		"\tV\u0001W\u0001W\u0001X\u0001X\u0001X\u0001X\u0005X\u02b8\bX\nX\fX\u02bb"+
		"\tX\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0001Z\u0005Z\u02c3\bZ\nZ\fZ\u02c6"+
		"\tZ\u0001[\u0001[\u0001\\\u0001\\\u0001\\\u0001]\u0001]\u0005]\u02cf\b"+
		"]\n]\f]\u02d2\t]\u0001]\u0001]\u0005]\u02d6\b]\n]\f]\u02d9\t]\u0001]\u0001"+
		"]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0001]\u0003]\u02e9\b]\u0001^\u0005^\u02ec\b^\n^\f^\u02ef\t^"+
		"\u0001^\u0000\u0000_\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh"+
		"jlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u0000\t\u0001\u0000"+
		"37\u0001\u000012\u0001\u0000\u0007\t\u0001\u0000\u000b\f\u0001\u0000\r"+
		"\u000f\u0001\u0000>C\u0001\u000089\u0002\u0000:;==\u0002\u000089FF\u02e0"+
		"\u0000\u00be\u0001\u0000\u0000\u0000\u0002\u00d4\u0001\u0000\u0000\u0000"+
		"\u0004\u00e2\u0001\u0000\u0000\u0000\u0006\u00eb\u0001\u0000\u0000\u0000"+
		"\b\u00ed\u0001\u0000\u0000\u0000\n\u00ef\u0001\u0000\u0000\u0000\f\u00f4"+
		"\u0001\u0000\u0000\u0000\u000e\u00f6\u0001\u0000\u0000\u0000\u0010\u00fb"+
		"\u0001\u0000\u0000\u0000\u0012\u00ff\u0001\u0000\u0000\u0000\u0014\u0103"+
		"\u0001\u0000\u0000\u0000\u0016\u0107\u0001\u0000\u0000\u0000\u0018\u010c"+
		"\u0001\u0000\u0000\u0000\u001a\u0111\u0001\u0000\u0000\u0000\u001c\u0118"+
		"\u0001\u0000\u0000\u0000\u001e\u011a\u0001\u0000\u0000\u0000 \u0121\u0001"+
		"\u0000\u0000\u0000\"\u0123\u0001\u0000\u0000\u0000$\u012b\u0001\u0000"+
		"\u0000\u0000&\u012d\u0001\u0000\u0000\u0000(\u012f\u0001\u0000\u0000\u0000"+
		"*\u0137\u0001\u0000\u0000\u0000,\u013e\u0001\u0000\u0000\u0000.\u0140"+
		"\u0001\u0000\u0000\u00000\u0143\u0001\u0000\u0000\u00002\u0145\u0001\u0000"+
		"\u0000\u00004\u014f\u0001\u0000\u0000\u00006\u0151\u0001\u0000\u0000\u0000"+
		"8\u0158\u0001\u0000\u0000\u0000:\u015c\u0001\u0000\u0000\u0000<\u0161"+
		"\u0001\u0000\u0000\u0000>\u0169\u0001\u0000\u0000\u0000@\u0170\u0001\u0000"+
		"\u0000\u0000B\u0174\u0001\u0000\u0000\u0000D\u017a\u0001\u0000\u0000\u0000"+
		"F\u017c\u0001\u0000\u0000\u0000H\u0182\u0001\u0000\u0000\u0000J\u0184"+
		"\u0001\u0000\u0000\u0000L\u018e\u0001\u0000\u0000\u0000N\u0190\u0001\u0000"+
		"\u0000\u0000P\u01a0\u0001\u0000\u0000\u0000R\u01a2\u0001\u0000\u0000\u0000"+
		"T\u01a8\u0001\u0000\u0000\u0000V\u01aa\u0001\u0000\u0000\u0000X\u01af"+
		"\u0001\u0000\u0000\u0000Z\u01b6\u0001\u0000\u0000\u0000\\\u01b8\u0001"+
		"\u0000\u0000\u0000^\u01c1\u0001\u0000\u0000\u0000`\u01c5\u0001\u0000\u0000"+
		"\u0000b\u01c7\u0001\u0000\u0000\u0000d\u01d5\u0001\u0000\u0000\u0000f"+
		"\u01dd\u0001\u0000\u0000\u0000h\u01e5\u0001\u0000\u0000\u0000j\u01e7\u0001"+
		"\u0000\u0000\u0000l\u01e9\u0001\u0000\u0000\u0000n\u01ee\u0001\u0000\u0000"+
		"\u0000p\u01f7\u0001\u0000\u0000\u0000r\u01f9\u0001\u0000\u0000\u0000t"+
		"\u0209\u0001\u0000\u0000\u0000v\u0212\u0001\u0000\u0000\u0000x\u0214\u0001"+
		"\u0000\u0000\u0000z\u0216\u0001\u0000\u0000\u0000|\u0219\u0001\u0000\u0000"+
		"\u0000~\u0221\u0001\u0000\u0000\u0000\u0080\u0223\u0001\u0000\u0000\u0000"+
		"\u0082\u022b\u0001\u0000\u0000\u0000\u0084\u022d\u0001\u0000\u0000\u0000"+
		"\u0086\u0237\u0001\u0000\u0000\u0000\u0088\u0239\u0001\u0000\u0000\u0000"+
		"\u008a\u0242\u0001\u0000\u0000\u0000\u008c\u0244\u0001\u0000\u0000\u0000"+
		"\u008e\u024d\u0001\u0000\u0000\u0000\u0090\u024f\u0001\u0000\u0000\u0000"+
		"\u0092\u0258\u0001\u0000\u0000\u0000\u0094\u025a\u0001\u0000\u0000\u0000"+
		"\u0096\u0263\u0001\u0000\u0000\u0000\u0098\u0265\u0001\u0000\u0000\u0000"+
		"\u009a\u027c\u0001\u0000\u0000\u0000\u009c\u027e\u0001\u0000\u0000\u0000"+
		"\u009e\u0286\u0001\u0000\u0000\u0000\u00a0\u0288\u0001\u0000\u0000\u0000"+
		"\u00a2\u0290\u0001\u0000\u0000\u0000\u00a4\u0292\u0001\u0000\u0000\u0000"+
		"\u00a6\u029b\u0001\u0000\u0000\u0000\u00a8\u029d\u0001\u0000\u0000\u0000"+
		"\u00aa\u02a6\u0001\u0000\u0000\u0000\u00ac\u02a8\u0001\u0000\u0000\u0000"+
		"\u00ae\u02b1\u0001\u0000\u0000\u0000\u00b0\u02b3\u0001\u0000\u0000\u0000"+
		"\u00b2\u02bc\u0001\u0000\u0000\u0000\u00b4\u02be\u0001\u0000\u0000\u0000"+
		"\u00b6\u02c7\u0001\u0000\u0000\u0000\u00b8\u02c9\u0001\u0000\u0000\u0000"+
		"\u00ba\u02e8\u0001\u0000\u0000\u0000\u00bc\u02ed\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0003\u0002\u0001\u0000\u00bf\u0001\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0003\u001a\r\u0000\u00c1\u00c2\u0003\u0002\u0001\u0000\u00c2"+
		"\u00d5\u0001\u0000\u0000\u0000\u00c3\u00c4\u0003\u0004\u0002\u0000\u00c4"+
		"\u00c5\u0003\u0002\u0001\u0000\u00c5\u00d5\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0003\f\u0006\u0000\u00c7\u00c8\u0003\u0002\u0001\u0000\u00c8\u00d5"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003\"\u0011\u0000\u00ca\u00cb\u0003"+
		"\u0002\u0001\u0000\u00cb\u00d5\u0001\u0000\u0000\u0000\u00cc\u00d5\u0003"+
		"4\u001a\u0000\u00cd\u00ce\u0003B!\u0000\u00ce\u00cf\u0003\u0002\u0001"+
		"\u0000\u00cf\u00d5\u0001\u0000\u0000\u0000\u00d0\u00d1\u0003D\"\u0000"+
		"\u00d1\u00d2\u0003\u0002\u0001\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00c0\u0001\u0000\u0000\u0000"+
		"\u00d4\u00c3\u0001\u0000\u0000\u0000\u00d4\u00c6\u0001\u0000\u0000\u0000"+
		"\u00d4\u00c9\u0001\u0000\u0000\u0000\u00d4\u00cc\u0001\u0000\u0000\u0000"+
		"\u00d4\u00cd\u0001\u0000\u0000\u0000\u00d4\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u0003\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0005H\u0000\u0000\u00d7\u00d8\u0003\b\u0004\u0000\u00d8"+
		"\u00d9\u0003\u009cN\u0000\u00d9\u00e3\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0005H\u0000\u0000\u00db\u00dc\u0003\u0006\u0003\u0000\u00dc\u00dd\u0003"+
		"\u009cN\u0000\u00dd\u00e3\u0001\u0000\u0000\u0000\u00de\u00df\u0005H\u0000"+
		"\u0000\u00df\u00e3\u0003\n\u0005\u0000\u00e0\u00e1\u0005H\u0000\u0000"+
		"\u00e1\u00e3\u0003 \u0010\u0000\u00e2\u00d6\u0001\u0000\u0000\u0000\u00e2"+
		"\u00da\u0001\u0000\u0000\u0000\u00e2\u00de\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e3\u0005\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0005(\u0000\u0000\u00e5\u00e6\u0005H\u0000\u0000\u00e6\u00e7\u0003"+
		"\u0006\u0003\u0000\u00e7\u00e8\u0003\u009cN\u0000\u00e8\u00e9\u0005(\u0000"+
		"\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00ec\u0005E\u0000\u0000"+
		"\u00eb\u00e4\u0001\u0000\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ec\u0007\u0001\u0000\u0000\u0000\u00ed\u00ee\u0007\u0000\u0000\u0000"+
		"\u00ee\t\u0001\u0000\u0000\u0000\u00ef\u00f0\u0007\u0001\u0000\u0000\u00f0"+
		"\u000b\u0001\u0000\u0000\u0000\u00f1\u00f5\u0003\u0010\b\u0000\u00f2\u00f5"+
		"\u0003\u0012\t\u0000\u00f3\u00f5\u0003\u0014\n\u0000\u00f4\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f5\r\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005\u0001"+
		"\u0000\u0000\u00f7\u00f8\u0005/\u0000\u0000\u00f8\u00f9\u0003\u00acV\u0000"+
		"\u00f9\u00fa\u00050\u0000\u0000\u00fa\u000f\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0005\u0002\u0000\u0000\u00fc\u00fd\u0005/\u0000\u0000\u00fd\u00fe"+
		"\u00050\u0000\u0000\u00fe\u0011\u0001\u0000\u0000\u0000\u00ff\u0100\u0005"+
		"\u0003\u0000\u0000\u0100\u0101\u0005/\u0000\u0000\u0101\u0102\u00050\u0000"+
		"\u0000\u0102\u0013\u0001\u0000\u0000\u0000\u0103\u0104\u0005\u0004\u0000"+
		"\u0000\u0104\u0105\u0005/\u0000\u0000\u0105\u0106\u00050\u0000\u0000\u0106"+
		"\u0015\u0001\u0000\u0000\u0000\u0107\u0108\u0005\u0005\u0000\u0000\u0108"+
		"\u0109\u0005/\u0000\u0000\u0109\u010a\u0003\u009cN\u0000\u010a\u010b\u0005"+
		"0\u0000\u0000\u010b\u0017\u0001\u0000\u0000\u0000\u010c\u010d\u0005\u0006"+
		"\u0000\u0000\u010d\u010e\u0005/\u0000\u0000\u010e\u010f\u0003\u009cN\u0000"+
		"\u010f\u0110\u00050\u0000\u0000\u0110\u0019\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0003\u001e\u000f\u0000\u0112\u0113\u0005/\u0000\u0000\u0113\u0114"+
		"\u0003\u001c\u000e\u0000\u0114\u0115\u00050\u0000\u0000\u0115\u001b\u0001"+
		"\u0000\u0000\u0000\u0116\u0119\u0003\u009cN\u0000\u0117\u0119\u0003 \u0010"+
		"\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0117\u0001\u0000\u0000"+
		"\u0000\u0119\u001d\u0001\u0000\u0000\u0000\u011a\u011b\u0007\u0002\u0000"+
		"\u0000\u011b\u001f\u0001\u0000\u0000\u0000\u011c\u011d\u0005H\u0000\u0000"+
		"\u011d\u011e\u0005-\u0000\u0000\u011e\u011f\u0005H\u0000\u0000\u011f\u0122"+
		"\u0005.\u0000\u0000\u0120\u0122\u0001\u0000\u0000\u0000\u0121\u011c\u0001"+
		"\u0000\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0122!\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0003&\u0013\u0000\u0124\u0125\u0003$\u0012\u0000"+
		"\u0125\u0126\u0003(\u0014\u0000\u0126\u0127\u00032\u0019\u0000\u0127\u0128"+
		"\u0005\n\u0000\u0000\u0128#\u0001\u0000\u0000\u0000\u0129\u012c\u0005"+
		"H\u0000\u0000\u012a\u012c\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000"+
		"\u0000\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c%\u0001\u0000\u0000"+
		"\u0000\u012d\u012e\u0007\u0003\u0000\u0000\u012e\'\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0005/\u0000\u0000\u0130\u0131\u0003*\u0015\u0000\u0131\u0132"+
		"\u00050\u0000\u0000\u0132)\u0001\u0000\u0000\u0000\u0133\u0134\u0003\u009c"+
		"N\u0000\u0134\u0135\u0003,\u0016\u0000\u0135\u0138\u0001\u0000\u0000\u0000"+
		"\u0136\u0138\u0001\u0000\u0000\u0000\u0137\u0133\u0001\u0000\u0000\u0000"+
		"\u0137\u0136\u0001\u0000\u0000\u0000\u0138+\u0001\u0000\u0000\u0000\u0139"+
		"\u013a\u0005(\u0000\u0000\u013a\u013b\u0003\u009cN\u0000\u013b\u013c\u0003"+
		",\u0016\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013f\u0001\u0000"+
		"\u0000\u0000\u013e\u0139\u0001\u0000\u0000\u0000\u013e\u013d\u0001\u0000"+
		"\u0000\u0000\u013f-\u0001\u0000\u0000\u0000\u0140\u0141\u00030\u0018\u0000"+
		"\u0141\u0142\u0003\u009cN\u0000\u0142/\u0001\u0000\u0000\u0000\u0143\u0144"+
		"\u0007\u0004\u0000\u0000\u01441\u0001\u0000\u0000\u0000\u0145\u0146\u0003"+
		"\u0002\u0001\u0000\u0146\u0147\u0003.\u0017\u0000\u01473\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u00036\u001b\u0000\u0149\u014a\u0003\u0002\u0001\u0000"+
		"\u014a\u0150\u0001\u0000\u0000\u0000\u014b\u014c\u00038\u001c\u0000\u014c"+
		"\u014d\u0003\u0002\u0001\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e"+
		"\u0150\u0001\u0000\u0000\u0000\u014f\u0148\u0001\u0000\u0000\u0000\u014f"+
		"\u014b\u0001\u0000\u0000\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u0150"+
		"5\u0001\u0000\u0000\u0000\u0151\u0152\u0005\u0010\u0000\u0000\u0152\u0153"+
		"\u0005\'\u0000\u0000\u0153\u0154\u0005\u0011\u0000\u0000\u0154\u0155\u0005"+
		"/\u0000\u0000\u0155\u0156\u0005H\u0000\u0000\u0156\u0157\u00050\u0000"+
		"\u0000\u01577\u0001\u0000\u0000\u0000\u0158\u0159\u0005-\u0000\u0000\u0159"+
		"\u015a\u0005H\u0000\u0000\u015a\u015b\u0005.\u0000\u0000\u015b9\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0005H\u0000\u0000\u015d\u015e\u0005/\u0000"+
		"\u0000\u015e\u015f\u0003*\u0015\u0000\u015f\u0160\u00050\u0000\u0000\u0160"+
		";\u0001\u0000\u0000\u0000\u0161\u0162\u0005-\u0000\u0000\u0162\u0163\u0003"+
		">\u001f\u0000\u0163\u0164\u0005.\u0000\u0000\u0164=\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0003\u009cN\u0000\u0166\u0167\u0003@ \u0000\u0167"+
		"\u016a\u0001\u0000\u0000\u0000\u0168\u016a\u0001\u0000\u0000\u0000\u0169"+
		"\u0165\u0001\u0000\u0000\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u016a"+
		"?\u0001\u0000\u0000\u0000\u016b\u016c\u0005(\u0000\u0000\u016c\u016d\u0003"+
		"\u009cN\u0000\u016d\u016e\u0003@ \u0000\u016e\u0171\u0001\u0000\u0000"+
		"\u0000\u016f\u0171\u0001\u0000\u0000\u0000\u0170\u016b\u0001\u0000\u0000"+
		"\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0171A\u0001\u0000\u0000\u0000"+
		"\u0172\u0175\u0003F#\u0000\u0173\u0175\u0003N\'\u0000\u0174\u0172\u0001"+
		"\u0000\u0000\u0000\u0174\u0173\u0001\u0000\u0000\u0000\u0175C\u0001\u0000"+
		"\u0000\u0000\u0176\u017b\u0003n7\u0000\u0177\u017b\u0003l6\u0000\u0178"+
		"\u017b\u0003\\.\u0000\u0179\u017b\u0003b1\u0000\u017a\u0176\u0001\u0000"+
		"\u0000\u0000\u017a\u0177\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000"+
		"\u0000\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017bE\u0001\u0000\u0000"+
		"\u0000\u017c\u017d\u0005\u0012\u0000\u0000\u017d\u017e\u0003H$\u0000\u017e"+
		"\u017f\u0003J%\u0000\u017f\u0180\u0003L&\u0000\u0180\u0181\u0005\n\u0000"+
		"\u0000\u0181G\u0001\u0000\u0000\u0000\u0182\u0183\u0003\u009cN\u0000\u0183"+
		"I\u0001\u0000\u0000\u0000\u0184\u0185\u0003\u0002\u0001\u0000\u0185K\u0001"+
		"\u0000\u0000\u0000\u0186\u0187\u0005\u0013\u0000\u0000\u0187\u0188\u0003"+
		"H$\u0000\u0188\u0189\u0003J%\u0000\u0189\u018a\u0003L&\u0000\u018a\u018f"+
		"\u0001\u0000\u0000\u0000\u018b\u018c\u0005\u0014\u0000\u0000\u018c\u018f"+
		"\u0003J%\u0000\u018d\u018f\u0001\u0000\u0000\u0000\u018e\u0186\u0001\u0000"+
		"\u0000\u0000\u018e\u018b\u0001\u0000\u0000\u0000\u018e\u018d\u0001\u0000"+
		"\u0000\u0000\u018fM\u0001\u0000\u0000\u0000\u0190\u0191\u0005\u0015\u0000"+
		"\u0000\u0191\u0192\u0005/\u0000\u0000\u0192\u0193\u0003\u009cN\u0000\u0193"+
		"\u0194\u00050\u0000\u0000\u0194\u0195\u0003P(\u0000\u0195\u0196\u0005"+
		"\n\u0000\u0000\u0196O\u0001\u0000\u0000\u0000\u0197\u0199\u0003R)\u0000"+
		"\u0198\u0197\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000"+
		"\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000"+
		"\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019d\u0003P(\u0000\u019d\u01a1"+
		"\u0001\u0000\u0000\u0000\u019e\u01a1\u0003V+\u0000\u019f\u01a1\u0003X"+
		",\u0000\u01a0\u0198\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000"+
		"\u0000\u01a0\u019f\u0001\u0000\u0000\u0000\u01a1Q\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a3\u0005\u0016\u0000\u0000\u01a3\u01a4\u0003T*\u0000\u01a4\u01a5"+
		"\u0005*\u0000\u0000\u01a5\u01a6\u0003J%\u0000\u01a6\u01a7\u0003Z-\u0000"+
		"\u01a7S\u0001\u0000\u0000\u0000\u01a8\u01a9\u0003\u009cN\u0000\u01a9U"+
		"\u0001\u0000\u0000\u0000\u01aa\u01ab\u0005\u0017\u0000\u0000\u01ab\u01ac"+
		"\u0005*\u0000\u0000\u01ac\u01ad\u0003J%\u0000\u01ad\u01ae\u0003Z-\u0000"+
		"\u01aeW\u0001\u0000\u0000\u0000\u01af\u01b0\u0005\u0018\u0000\u0000\u01b0"+
		"\u01b1\u0005*\u0000\u0000\u01b1\u01b2\u0003J%\u0000\u01b2\u01b3\u0003"+
		"Z-\u0000\u01b3Y\u0001\u0000\u0000\u0000\u01b4\u01b7\u0005\u0019\u0000"+
		"\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b7[\u0001\u0000\u0000\u0000"+
		"\u01b8\u01b9\u0005\u001a\u0000\u0000\u01b9\u01ba\u0003p8\u0000\u01ba\u01bb"+
		"\u0003^/\u0000\u01bb\u01bc\u0005\u001b\u0000\u0000\u01bc\u01bd\u0003\u009c"+
		"N\u0000\u01bd\u01be\u0003`0\u0000\u01be]\u0001\u0000\u0000\u0000\u01bf"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c0\u01c2\u0001\u0000\u0000\u0000\u01c1"+
		"\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c2"+
		"_\u0001\u0000\u0000\u0000\u01c3\u01c6\u0001\u0000\u0000\u0000\u01c4\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c4"+
		"\u0001\u0000\u0000\u0000\u01c6a\u0001\u0000\u0000\u0000\u01c7\u01c8\u0005"+
		"\u001c\u0000\u0000\u01c8\u01c9\u0005H\u0000\u0000\u01c9\u01ca\u0005\u001d"+
		"\u0000\u0000\u01ca\u01cb\u0005/\u0000\u0000\u01cb\u01cc\u0003d2\u0000"+
		"\u01cc\u01cd\u0003f3\u0000\u01cd\u01ce\u0003h4\u0000\u01ce\u01cf\u0003"+
		"j5\u0000\u01cf\u01d0\u0003p8\u0000\u01d0\u01d1\u0005\n\u0000\u0000\u01d1"+
		"c\u0001\u0000\u0000\u0000\u01d2\u01d6\u0005G\u0000\u0000\u01d3\u01d4\u0005"+
		"9\u0000\u0000\u01d4\u01d6\u0005G\u0000\u0000\u01d5\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d6e\u0001\u0000\u0000\u0000"+
		"\u01d7\u01d8\u0005\u001e\u0000\u0000\u01d8\u01de\u0005G\u0000\u0000\u01d9"+
		"\u01da\u0005\u001e\u0000\u0000\u01da\u01db\u00059\u0000\u0000\u01db\u01de"+
		"\u0005G\u0000\u0000\u01dc\u01de\u0001\u0000\u0000\u0000\u01dd\u01d7\u0001"+
		"\u0000\u0000\u0000\u01dd\u01d9\u0001\u0000\u0000\u0000\u01dd\u01dc\u0001"+
		"\u0000\u0000\u0000\u01deg\u0001\u0000\u0000\u0000\u01df\u01e0\u0005\u001e"+
		"\u0000\u0000\u01e0\u01e6\u0005G\u0000\u0000\u01e1\u01e2\u0005\u001e\u0000"+
		"\u0000\u01e2\u01e3\u00059\u0000\u0000\u01e3\u01e6\u0005G\u0000\u0000\u01e4"+
		"\u01e6\u0001\u0000\u0000\u0000\u01e5\u01df\u0001\u0000\u0000\u0000\u01e5"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e6"+
		"i\u0001\u0000\u0000\u0000\u01e7\u01e8\u00050\u0000\u0000\u01e8k\u0001"+
		"\u0000\u0000\u0000\u01e9\u01ea\u0005\u001f\u0000\u0000\u01ea\u01eb\u0003"+
		"\u009cN\u0000\u01eb\u01ec\u0003p8\u0000\u01ec\u01ed\u0005\n\u0000\u0000"+
		"\u01edm\u0001\u0000\u0000\u0000\u01ee\u01ef\u0005 \u0000\u0000\u01ef\u01f0"+
		"\u0005/\u0000\u0000\u01f0\u01f1\u0003r9\u0000\u01f1\u01f2\u00050\u0000"+
		"\u0000\u01f2\u01f3\u0003p8\u0000\u01f3\u01f4\u0005\n\u0000\u0000\u01f4"+
		"o\u0001\u0000\u0000\u0000\u01f5\u01f8\u0003\u0002\u0001\u0000\u01f6\u01f8"+
		"\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f7\u01f6"+
		"\u0001\u0000\u0000\u0000\u01f8q\u0001\u0000\u0000\u0000\u01f9\u01fa\u0003"+
		"t:\u0000\u01fa\u01fb\u0005)\u0000\u0000\u01fb\u01fc\u0003|>\u0000\u01fc"+
		"\u01ff\u0005)\u0000\u0000\u01fd\u0200\u0003t:\u0000\u01fe\u0200\u0003"+
		"z=\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff\u01fe\u0001\u0000\u0000"+
		"\u0000\u0200s\u0001\u0000\u0000\u0000\u0201\u0202\u0005H\u0000\u0000\u0202"+
		"\u0203\u0003x<\u0000\u0203\u0204\u0003|>\u0000\u0204\u020a\u0001\u0000"+
		"\u0000\u0000\u0205\u0206\u0005H\u0000\u0000\u0206\u0207\u0003v;\u0000"+
		"\u0207\u0208\u0003|>\u0000\u0208\u020a\u0001\u0000\u0000\u0000\u0209\u0201"+
		"\u0001\u0000\u0000\u0000\u0209\u0205\u0001\u0000\u0000\u0000\u020au\u0001"+
		"\u0000\u0000\u0000\u020b\u020c\u0005(\u0000\u0000\u020c\u020d\u0005H\u0000"+
		"\u0000\u020d\u020e\u0003\u0006\u0003\u0000\u020e\u020f\u0003\u009cN\u0000"+
		"\u020f\u0210\u0005(\u0000\u0000\u0210\u0213\u0001\u0000\u0000\u0000\u0211"+
		"\u0213\u0005E\u0000\u0000\u0212\u020b\u0001\u0000\u0000\u0000\u0212\u0211"+
		"\u0001\u0000\u0000\u0000\u0213w\u0001\u0000\u0000\u0000\u0214\u0215\u0007"+
		"\u0000\u0000\u0000\u0215y\u0001\u0000\u0000\u0000\u0216\u0217\u0005H\u0000"+
		"\u0000\u0217\u0218\u0007\u0001\u0000\u0000\u0218{\u0001\u0000\u0000\u0000"+
		"\u0219\u021a\u0003\u0080@\u0000\u021a\u021b\u0003~?\u0000\u021b}\u0001"+
		"\u0000\u0000\u0000\u021c\u021d\u0005%\u0000\u0000\u021d\u021e\u0003\u0080"+
		"@\u0000\u021e\u021f\u0003~?\u0000\u021f\u0222\u0001\u0000\u0000\u0000"+
		"\u0220\u0222\u0001\u0000\u0000\u0000\u0221\u021c\u0001\u0000\u0000\u0000"+
		"\u0221\u0220\u0001\u0000\u0000\u0000\u0222\u007f\u0001\u0000\u0000\u0000"+
		"\u0223\u0224\u0003\u0086C\u0000\u0224\u0225\u0003\u0082A\u0000\u0225\u0081"+
		"\u0001\u0000\u0000\u0000\u0226\u0227\u0005$\u0000\u0000\u0227\u0228\u0003"+
		"\u0086C\u0000\u0228\u0229\u0003\u0082A\u0000\u0229\u022c\u0001\u0000\u0000"+
		"\u0000\u022a\u022c\u0001\u0000\u0000\u0000\u022b\u0226\u0001\u0000\u0000"+
		"\u0000\u022b\u022a\u0001\u0000\u0000\u0000\u022c\u0083\u0001\u0000\u0000"+
		"\u0000\u022d\u022e\u0007\u0005\u0000\u0000\u022e\u0085\u0001\u0000\u0000"+
		"\u0000\u022f\u0230\u0003\u0088D\u0000\u0230\u0234\u0003\u0084B\u0000\u0231"+
		"\u0235\u0005G\u0000\u0000\u0232\u0235\u0005H\u0000\u0000\u0233\u0235\u0003"+
		"4\u001a\u0000\u0234\u0231\u0001\u0000\u0000\u0000\u0234\u0232\u0001\u0000"+
		"\u0000\u0000\u0234\u0233\u0001\u0000\u0000\u0000\u0235\u0238\u0001\u0000"+
		"\u0000\u0000\u0236\u0238\u0003\u0088D\u0000\u0237\u022f\u0001\u0000\u0000"+
		"\u0000\u0237\u0236\u0001\u0000\u0000\u0000\u0238\u0087\u0001\u0000\u0000"+
		"\u0000\u0239\u023f\u0003\u008cF\u0000\u023a\u023b\u0003\u008aE\u0000\u023b"+
		"\u023c\u0003\u008cF\u0000\u023c\u023e\u0001\u0000\u0000\u0000\u023d\u023a"+
		"\u0001\u0000\u0000\u0000\u023e\u0241\u0001\u0000\u0000\u0000\u023f\u023d"+
		"\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000\u0240\u0089"+
		"\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0242\u0243"+
		"\u0005&\u0000\u0000\u0243\u008b\u0001\u0000\u0000\u0000\u0244\u024a\u0003"+
		"\u0090H\u0000\u0245\u0246\u0003\u008eG\u0000\u0246\u0247\u0003\u0090H"+
		"\u0000\u0247\u0249\u0001\u0000\u0000\u0000\u0248\u0245\u0001\u0000\u0000"+
		"\u0000\u0249\u024c\u0001\u0000\u0000\u0000\u024a\u0248\u0001\u0000\u0000"+
		"\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u008d\u0001\u0000\u0000"+
		"\u0000\u024c\u024a\u0001\u0000\u0000\u0000\u024d\u024e\u0007\u0006\u0000"+
		"\u0000\u024e\u008f\u0001\u0000\u0000\u0000\u024f\u0255\u0003\u0094J\u0000"+
		"\u0250\u0251\u0003\u0092I\u0000\u0251\u0252\u0003\u0094J\u0000\u0252\u0254"+
		"\u0001\u0000\u0000\u0000\u0253\u0250\u0001\u0000\u0000\u0000\u0254\u0257"+
		"\u0001\u0000\u0000\u0000\u0255\u0253\u0001\u0000\u0000\u0000\u0255\u0256"+
		"\u0001\u0000\u0000\u0000\u0256\u0091\u0001\u0000\u0000\u0000\u0257\u0255"+
		"\u0001\u0000\u0000\u0000\u0258\u0259\u0007\u0007\u0000\u0000\u0259\u0093"+
		"\u0001\u0000\u0000\u0000\u025a\u0260\u0003\u0098L\u0000\u025b\u025c\u0003"+
		"\u0096K\u0000\u025c\u025d\u0003\u0098L\u0000\u025d\u025f\u0001\u0000\u0000"+
		"\u0000\u025e\u025b\u0001\u0000\u0000\u0000\u025f\u0262\u0001\u0000\u0000"+
		"\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000"+
		"\u0000\u0261\u0095\u0001\u0000\u0000\u0000\u0262\u0260\u0001\u0000\u0000"+
		"\u0000\u0263\u0264\u0005<\u0000\u0000\u0264\u0097\u0001\u0000\u0000\u0000"+
		"\u0265\u0266\u0003\u00bc^\u0000\u0266\u0267\u0003\u009aM\u0000\u0267\u0099"+
		"\u0001\u0000\u0000\u0000\u0268\u026c\u0005G\u0000\u0000\u0269\u026b\u0003"+
		"8\u001c\u0000\u026a\u0269\u0001\u0000\u0000\u0000\u026b\u026e\u0001\u0000"+
		"\u0000\u0000\u026c\u026a\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000"+
		"\u0000\u0000\u026d\u027d\u0001\u0000\u0000\u0000\u026e\u026c\u0001\u0000"+
		"\u0000\u0000\u026f\u0273\u0005H\u0000\u0000\u0270\u0272\u00038\u001c\u0000"+
		"\u0271\u0270\u0001\u0000\u0000\u0000\u0272\u0275\u0001\u0000\u0000\u0000"+
		"\u0273\u0271\u0001\u0000\u0000\u0000\u0273\u0274\u0001\u0000\u0000\u0000"+
		"\u0274\u027d\u0001\u0000\u0000\u0000\u0275\u0273\u0001\u0000\u0000\u0000"+
		"\u0276\u0277\u0005/\u0000\u0000\u0277\u0278\u0003|>\u0000\u0278\u0279"+
		"\u00050\u0000\u0000\u0279\u027d\u0001\u0000\u0000\u0000\u027a\u027d\u0005"+
		"#\u0000\u0000\u027b\u027d\u0001\u0000\u0000\u0000\u027c\u0268\u0001\u0000"+
		"\u0000\u0000\u027c\u026f\u0001\u0000\u0000\u0000\u027c\u0276\u0001\u0000"+
		"\u0000\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027c\u027b\u0001\u0000"+
		"\u0000\u0000\u027d\u009b\u0001\u0000\u0000\u0000\u027e\u027f\u0003\u00a0"+
		"P\u0000\u027f\u0280\u0003\u009eO\u0000\u0280\u009d\u0001\u0000\u0000\u0000"+
		"\u0281\u0282\u0005%\u0000\u0000\u0282\u0283\u0003\u00a0P\u0000\u0283\u0284"+
		"\u0003\u009eO\u0000\u0284\u0287\u0001\u0000\u0000\u0000\u0285\u0287\u0001"+
		"\u0000\u0000\u0000\u0286\u0281\u0001\u0000\u0000\u0000\u0286\u0285\u0001"+
		"\u0000\u0000\u0000\u0287\u009f\u0001\u0000\u0000\u0000\u0288\u0289\u0003"+
		"\u00a6S\u0000\u0289\u028a\u0003\u00a2Q\u0000\u028a\u00a1\u0001\u0000\u0000"+
		"\u0000\u028b\u028c\u0005$\u0000\u0000\u028c\u028d\u0003\u00a6S\u0000\u028d"+
		"\u028e\u0003\u00a2Q\u0000\u028e\u0291\u0001\u0000\u0000\u0000\u028f\u0291"+
		"\u0001\u0000\u0000\u0000\u0290\u028b\u0001\u0000\u0000\u0000\u0290\u028f"+
		"\u0001\u0000\u0000\u0000\u0291\u00a3\u0001\u0000\u0000\u0000\u0292\u0293"+
		"\u0007\u0005\u0000\u0000\u0293\u00a5\u0001\u0000\u0000\u0000\u0294\u0295"+
		"\u0003\u00a8T\u0000\u0295\u0298\u0003\u00a4R\u0000\u0296\u0299\u0003\u00a8"+
		"T\u0000\u0297\u0299\u00034\u001a\u0000\u0298\u0296\u0001\u0000\u0000\u0000"+
		"\u0298\u0297\u0001\u0000\u0000\u0000\u0299\u029c\u0001\u0000\u0000\u0000"+
		"\u029a\u029c\u0003\u00a8T\u0000\u029b\u0294\u0001\u0000\u0000\u0000\u029b"+
		"\u029a\u0001\u0000\u0000\u0000\u029c\u00a7\u0001\u0000\u0000\u0000\u029d"+
		"\u02a3\u0003\u00acV\u0000\u029e\u029f\u0003\u00aaU\u0000\u029f\u02a0\u0003"+
		"\u00acV\u0000\u02a0\u02a2\u0001\u0000\u0000\u0000\u02a1\u029e\u0001\u0000"+
		"\u0000\u0000\u02a2\u02a5\u0001\u0000\u0000\u0000\u02a3\u02a1\u0001\u0000"+
		"\u0000\u0000\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4\u00a9\u0001\u0000"+
		"\u0000\u0000\u02a5\u02a3\u0001\u0000\u0000\u0000\u02a6\u02a7\u0005&\u0000"+
		"\u0000\u02a7\u00ab\u0001\u0000\u0000\u0000\u02a8\u02ae\u0003\u00b0X\u0000"+
		"\u02a9\u02aa\u0003\u00aeW\u0000\u02aa\u02ab\u0003\u00b0X\u0000\u02ab\u02ad"+
		"\u0001\u0000\u0000\u0000\u02ac\u02a9\u0001\u0000\u0000\u0000\u02ad\u02b0"+
		"\u0001\u0000\u0000\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000\u02ae\u02af"+
		"\u0001\u0000\u0000\u0000\u02af\u00ad\u0001\u0000\u0000\u0000\u02b0\u02ae"+
		"\u0001\u0000\u0000\u0000\u02b1\u02b2\u0007\u0006\u0000\u0000\u02b2\u00af"+
		"\u0001\u0000\u0000\u0000\u02b3\u02b9\u0003\u00b4Z\u0000\u02b4\u02b5\u0003"+
		"\u00b2Y\u0000\u02b5\u02b6\u0003\u00b4Z\u0000\u02b6\u02b8\u0001\u0000\u0000"+
		"\u0000\u02b7\u02b4\u0001\u0000\u0000\u0000\u02b8\u02bb\u0001\u0000\u0000"+
		"\u0000\u02b9\u02b7\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000"+
		"\u0000\u02ba\u00b1\u0001\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000\u0000"+
		"\u0000\u02bc\u02bd\u0007\u0007\u0000\u0000\u02bd\u00b3\u0001\u0000\u0000"+
		"\u0000\u02be\u02c4\u0003\u00b8\\\u0000\u02bf\u02c0\u0003\u00b6[\u0000"+
		"\u02c0\u02c1\u0003\u00b8\\\u0000\u02c1\u02c3\u0001\u0000\u0000\u0000\u02c2"+
		"\u02bf\u0001\u0000\u0000\u0000\u02c3\u02c6\u0001\u0000\u0000\u0000\u02c4"+
		"\u02c2\u0001\u0000\u0000\u0000\u02c4\u02c5\u0001\u0000\u0000\u0000\u02c5"+
		"\u00b5\u0001\u0000\u0000\u0000\u02c6\u02c4\u0001\u0000\u0000\u0000\u02c7"+
		"\u02c8\u0005<\u0000\u0000\u02c8\u00b7\u0001\u0000\u0000\u0000\u02c9\u02ca"+
		"\u0003\u00bc^\u0000\u02ca\u02cb\u0003\u00ba]\u0000\u02cb\u00b9\u0001\u0000"+
		"\u0000\u0000\u02cc\u02d0\u0005G\u0000\u0000\u02cd\u02cf\u00038\u001c\u0000"+
		"\u02ce\u02cd\u0001\u0000\u0000\u0000\u02cf\u02d2\u0001\u0000\u0000\u0000"+
		"\u02d0\u02ce\u0001\u0000\u0000\u0000\u02d0\u02d1\u0001\u0000\u0000\u0000"+
		"\u02d1\u02e9\u0001\u0000\u0000\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000"+
		"\u02d3\u02d7\u0005H\u0000\u0000\u02d4\u02d6\u00038\u001c\u0000\u02d5\u02d4"+
		"\u0001\u0000\u0000\u0000\u02d6\u02d9\u0001\u0000\u0000\u0000\u02d7\u02d5"+
		"\u0001\u0000\u0000\u0000\u02d7\u02d8\u0001\u0000\u0000\u0000\u02d8\u02e9"+
		"\u0001\u0000\u0000\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000\u02da\u02db"+
		"\u0005/\u0000\u0000\u02db\u02dc\u0003\u009cN\u0000\u02dc\u02dd\u00050"+
		"\u0000\u0000\u02dd\u02e9\u0001\u0000\u0000\u0000\u02de\u02e9\u0005#\u0000"+
		"\u0000\u02df\u02e9\u0003\u0018\f\u0000\u02e0\u02e9\u0003\u0016\u000b\u0000"+
		"\u02e1\u02e9\u0003\u000e\u0007\u0000\u02e2\u02e9\u0003<\u001e\u0000\u02e3"+
		"\u02e9\u0003:\u001d\u0000\u02e4\u02e5\u0003\"\u0011\u0000\u02e5\u02e6"+
		"\u0005!\u0000\u0000\u02e6\u02e9\u0001\u0000\u0000\u0000\u02e7\u02e9\u0005"+
		"\"\u0000\u0000\u02e8\u02cc\u0001\u0000\u0000\u0000\u02e8\u02d3\u0001\u0000"+
		"\u0000\u0000\u02e8\u02da\u0001\u0000\u0000\u0000\u02e8\u02de\u0001\u0000"+
		"\u0000\u0000\u02e8\u02df\u0001\u0000\u0000\u0000\u02e8\u02e0\u0001\u0000"+
		"\u0000\u0000\u02e8\u02e1\u0001\u0000\u0000\u0000\u02e8\u02e2\u0001\u0000"+
		"\u0000\u0000\u02e8\u02e3\u0001\u0000\u0000\u0000\u02e8\u02e4\u0001\u0000"+
		"\u0000\u0000\u02e8\u02e7\u0001\u0000\u0000\u0000\u02e9\u00bb\u0001\u0000"+
		"\u0000\u0000\u02ea\u02ec\u0007\b\u0000\u0000\u02eb\u02ea\u0001\u0000\u0000"+
		"\u0000\u02ec\u02ef\u0001\u0000\u0000\u0000\u02ed\u02eb\u0001\u0000\u0000"+
		"\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee\u00bd\u0001\u0000\u0000"+
		"\u0000\u02ef\u02ed\u0001\u0000\u0000\u00002\u00d4\u00e2\u00eb\u00f4\u0118"+
		"\u0121\u012b\u0137\u013e\u014f\u0169\u0170\u0174\u017a\u018e\u019a\u01a0"+
		"\u01b6\u01c1\u01c5\u01d5\u01dd\u01e5\u01f7\u01ff\u0209\u0212\u0221\u022b"+
		"\u0234\u0237\u023f\u024a\u0255\u0260\u026c\u0273\u027c\u0286\u0290\u0298"+
		"\u029b\u02a3\u02ae\u02b9\u02c4\u02d0\u02d7\u02e8\u02ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}