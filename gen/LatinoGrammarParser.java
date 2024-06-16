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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		STRING=39, TKN_AND=40, TKN_OR=41, TKN_CONCAT=42, TKN_PERIOD=43, TKN_COMMA=44, 
		TKN_SEMICOLON=45, TKN_COLON=46, TKN_OPENING_KEY=47, TKN_CLOSING_KEY=48, 
		TKN_OPENING_BRA=49, TKN_CLOSING_BRA=50, TKN_OPENING_PAR=51, TKN_CLOSING_PAR=52, 
		TKN_INCREMENT=53, TKN_DECREMENT=54, TKN_MOD_ASSIGN=55, TKN_DIV_ASSIGN=56, 
		TKN_TIMES_ASSIGN=57, TKN_MINUS_ASSIGN=58, TKN_PLUS_ASSIGN=59, TKN_PLUS=60, 
		TKN_MINUS=61, TKN_TIMES=62, TKN_DIV=63, TKN_POWER=64, TKN_MOD=65, TKN_EQUAL=66, 
		TKN_NEQ=67, TKN_LEQ=68, TKN_GEQ=69, TKN_GREATER=70, TKN_LESS=71, TKN_REGEX=72, 
		TKN_ASSIGN=73, TKN_NOT=74, NUM=75, ID=76, ESPACIO=77, COMMENT_LINE=78, 
		COMMENT_LINE_NUMERAL=79, COMMENT_BLOCK=80;
	public static final int
		RULE_main_program = 0, RULE_substatement = 1, RULE_accessMember = 2, RULE_assign = 3, 
		RULE_assignOp = 4, RULE_assignAux = 5, RULE_assignmentOperator = 6, RULE_assignIncrDecr = 7, 
		RULE_mate_library = 8, RULE_mate_abs = 9, RULE_mate_cos = 10, RULE_mate_sin = 11, 
		RULE_mate_args = 12, RULE_mate_aux = 13, RULE_built_in_functions = 14, 
		RULE_acadena_stat = 15, RULE_incluir_stat = 16, RULE_leer_stat = 17, RULE_limpiar_stat = 18, 
		RULE_alogico_stat = 19, RULE_anumero_stat = 20, RULE_tipo_stat = 21, RULE_print_stat = 22, 
		RULE_print_stat_cont = 23, RULE_print_operations = 24, RULE_array_printing = 25, 
		RULE_function_stat = 26, RULE_function_name = 27, RULE_function_op = 28, 
		RULE_function_pars = 29, RULE_function_args = 30, RULE_function_args_aux = 31, 
		RULE_function_ret = 32, RULE_function_ret_op = 33, RULE_function_content = 34, 
		RULE_special_methods = 35, RULE_longitud_method = 36, RULE_brakets = 37, 
		RULE_function_call = 38, RULE_function_call_op = 39, RULE_array = 40, 
		RULE_array_expr = 41, RULE_array_content = 42, RULE_array_content_aux = 43, 
		RULE_dictionary = 44, RULE_dictionary_content = 45, RULE_dictionary_expr_key = 46, 
		RULE_dictionary_expr_value = 47, RULE_dictionary_content_aux = 48, RULE_conditionals = 49, 
		RULE_loops = 50, RULE_if_conditional = 51, RULE_conditional_expr = 52, 
		RULE_conditional_substatement = 53, RULE_if_conditional_aux = 54, RULE_swicth_condition = 55, 
		RULE_caseBlock = 56, RULE_caseClause = 57, RULE_caseClauseExpr = 58, RULE_defaultClause = 59, 
		RULE_otherClause = 60, RULE_romperOp = 61, RULE_repetir_loop = 62, RULE_repetir_aux = 63, 
		RULE_repetir_aux2 = 64, RULE_rango_loop = 65, RULE_inicio_value = 66, 
		RULE_fin_value = 67, RULE_salto_value = 68, RULE_final_arguments = 69, 
		RULE_mientras_loop = 70, RULE_desde_loop = 71, RULE_loop_substatement = 72, 
		RULE_triple_expr = 73, RULE_loop_assign = 74, RULE_loop_assignAux = 75, 
		RULE_loop_assignmentOperator = 76, RULE_loop_assignIncrDecr = 77, RULE_loop_expr = 78, 
		RULE_loop_exprRest = 79, RULE_loop_expBool = 80, RULE_loop_expBoolRest = 81, 
		RULE_loop_opRel = 82, RULE_loop_expRel = 83, RULE_loop_exprConcat = 84, 
		RULE_loop_exprConcatOp = 85, RULE_loop_expArit = 86, RULE_loop_expAritOp = 87, 
		RULE_loop_term = 88, RULE_loop_termOp = 89, RULE_loop_factor = 90, RULE_loop_factorOp = 91, 
		RULE_loop_t_factor = 92, RULE_loop_expr_terminals = 93, RULE_expr = 94, 
		RULE_exprRest = 95, RULE_expBool = 96, RULE_expBoolRest = 97, RULE_opRel = 98, 
		RULE_expRel = 99, RULE_exprConcat = 100, RULE_exprConcatOp = 101, RULE_expArit = 102, 
		RULE_expAritOp = 103, RULE_term = 104, RULE_termOp = 105, RULE_factor = 106, 
		RULE_factorOp = 107, RULE_t_factor = 108, RULE_expr_terminals = 109, RULE_expr_factor = 110, 
		RULE_expr_factor_not = 111, RULE_expr_factor_minus = 112, RULE_expr_factor_plus = 113;
	private static String[] makeRuleNames() {
		return new String[] {
			"main_program", "substatement", "accessMember", "assign", "assignOp", 
			"assignAux", "assignmentOperator", "assignIncrDecr", "mate_library", 
			"mate_abs", "mate_cos", "mate_sin", "mate_args", "mate_aux", "built_in_functions", 
			"acadena_stat", "incluir_stat", "leer_stat", "limpiar_stat", "alogico_stat", 
			"anumero_stat", "tipo_stat", "print_stat", "print_stat_cont", "print_operations", 
			"array_printing", "function_stat", "function_name", "function_op", "function_pars", 
			"function_args", "function_args_aux", "function_ret", "function_ret_op", 
			"function_content", "special_methods", "longitud_method", "brakets", 
			"function_call", "function_call_op", "array", "array_expr", "array_content", 
			"array_content_aux", "dictionary", "dictionary_content", "dictionary_expr_key", 
			"dictionary_expr_value", "dictionary_content_aux", "conditionals", "loops", 
			"if_conditional", "conditional_expr", "conditional_substatement", "if_conditional_aux", 
			"swicth_condition", "caseBlock", "caseClause", "caseClauseExpr", "defaultClause", 
			"otherClause", "romperOp", "repetir_loop", "repetir_aux", "repetir_aux2", 
			"rango_loop", "inicio_value", "fin_value", "salto_value", "final_arguments", 
			"mientras_loop", "desde_loop", "loop_substatement", "triple_expr", "loop_assign", 
			"loop_assignAux", "loop_assignmentOperator", "loop_assignIncrDecr", "loop_expr", 
			"loop_exprRest", "loop_expBool", "loop_expBoolRest", "loop_opRel", "loop_expRel", 
			"loop_exprConcat", "loop_exprConcatOp", "loop_expArit", "loop_expAritOp", 
			"loop_term", "loop_termOp", "loop_factor", "loop_factorOp", "loop_t_factor", 
			"loop_expr_terminals", "expr", "exprRest", "expBool", "expBoolRest", 
			"opRel", "expRel", "exprConcat", "exprConcatOp", "expArit", "expAritOp", 
			"term", "termOp", "factor", "factorOp", "t_factor", "expr_terminals", 
			"expr_factor", "expr_factor_not", "expr_factor_minus", "expr_factor_plus"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'mate.abs('", "'mate.cos('", "'mate.sen('", "'acadena'", "'incluir'", 
			"'leer'", "'limpiar'", "'alogico'", "'anumero'", "'tipo'", "'escribir'", 
			"'imprimir'", "'poner'", "'fin'", "'funcion'", "'fun'", "'retornar'", 
			"'regresar'", "'ret'", "'retorno'", "'lista'", "'longitud'", "'si'", 
			"'osi'", "'sino'", "'elegir'", "'caso'", "'defecto'", "'otro'", "'romper'", 
			"'repetir'", "'hasta'", "'para'", "'en rango'", "'mientras'", "'desde'", 
			"'verdadero'", "'falso'", null, "'&&'", "'||'", "'..'", "'.'", "','", 
			"';'", "':'", "'{'", "'}'", "'['", "']'", "'('", "')'", "'++'", "'--'", 
			"'%='", "'/='", "'*='", "'-='", "'+='", "'+'", "'-'", "'*'", "'/'", "'^'", 
			"'%'", "'=='", "'!='", "'<='", "'>='", "'>'", "'<'", "'~='", "'='", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "STRING", "TKN_AND", "TKN_OR", "TKN_CONCAT", "TKN_PERIOD", 
			"TKN_COMMA", "TKN_SEMICOLON", "TKN_COLON", "TKN_OPENING_KEY", "TKN_CLOSING_KEY", 
			"TKN_OPENING_BRA", "TKN_CLOSING_BRA", "TKN_OPENING_PAR", "TKN_CLOSING_PAR", 
			"TKN_INCREMENT", "TKN_DECREMENT", "TKN_MOD_ASSIGN", "TKN_DIV_ASSIGN", 
			"TKN_TIMES_ASSIGN", "TKN_MINUS_ASSIGN", "TKN_PLUS_ASSIGN", "TKN_PLUS", 
			"TKN_MINUS", "TKN_TIMES", "TKN_DIV", "TKN_POWER", "TKN_MOD", "TKN_EQUAL", 
			"TKN_NEQ", "TKN_LEQ", "TKN_GEQ", "TKN_GREATER", "TKN_LESS", "TKN_REGEX", 
			"TKN_ASSIGN", "TKN_NOT", "NUM", "ID", "ESPACIO", "COMMENT_LINE", "COMMENT_LINE_NUMERAL", 
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
			setState(228);
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
		public AccessMemberContext accessMember() {
			return getRuleContext(AccessMemberContext.class,0);
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
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				print_stat();
				setState(231);
				substatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				assign();
				setState(234);
				substatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				built_in_functions();
				setState(237);
				substatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				function_stat();
				setState(240);
				substatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				special_methods();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
				conditionals();
				setState(244);
				substatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(246);
				loops();
				setState(247);
				substatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(249);
				accessMember();
				setState(250);
				substatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
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
	public static class AccessMemberContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LatinoGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LatinoGrammarParser.ID, i);
		}
		public TerminalNode TKN_PERIOD() { return getToken(LatinoGrammarParser.TKN_PERIOD, 0); }
		public Longitud_methodContext longitud_method() {
			return getRuleContext(Longitud_methodContext.class,0);
		}
		public AccessMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterAccessMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitAccessMember(this);
		}
	}

	public final AccessMemberContext accessMember() throws RecognitionException {
		AccessMemberContext _localctx = new AccessMemberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_accessMember);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(ID);
				setState(256);
				match(TKN_PERIOD);
				setState(257);
				match(ID);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				longitud_method();
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
		public AssignOpContext assignOp() {
			return getRuleContext(AssignOpContext.class,0);
		}
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
		public Mate_libraryContext mate_library() {
			return getRuleContext(Mate_libraryContext.class,0);
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
		enterRule(_localctx, 6, RULE_assign);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				assignOp();
				setState(262);
				assignmentOperator();
				setState(263);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				assignOp();
				setState(266);
				assignAux();
				setState(267);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				assignOp();
				setState(270);
				assignIncrDecr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				assignOp();
				setState(273);
				array_printing();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(275);
				assignOp();
				setState(276);
				assignAux();
				setState(277);
				mate_library();
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
	public static class AssignOpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LatinoGrammarParser.ID, 0); }
		public AccessMemberContext accessMember() {
			return getRuleContext(AccessMemberContext.class,0);
		}
		public AssignOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterAssignOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitAssignOp(this);
		}
	}

	public final AssignOpContext assignOp() throws RecognitionException {
		AssignOpContext _localctx = new AssignOpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignOp);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				accessMember();
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
		enterRule(_localctx, 10, RULE_assignAux);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(285);
				match(TKN_COMMA);
				}
				{
				setState(286);
				match(ID);
				}
				{
				setState(287);
				assignAux();
				}
				{
				setState(288);
				expr();
				}
				{
				setState(289);
				match(TKN_COMMA);
				}
				}
				break;
			case TKN_ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
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
		enterRule(_localctx, 12, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1116892707587883008L) != 0)) ) {
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
		enterRule(_localctx, 14, RULE_assignIncrDecr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
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
	public static class Mate_libraryContext extends ParserRuleContext {
		public Mate_absContext mate_abs() {
			return getRuleContext(Mate_absContext.class,0);
		}
		public Mate_cosContext mate_cos() {
			return getRuleContext(Mate_cosContext.class,0);
		}
		public Mate_sinContext mate_sin() {
			return getRuleContext(Mate_sinContext.class,0);
		}
		public Mate_libraryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mate_library; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterMate_library(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitMate_library(this);
		}
	}

	public final Mate_libraryContext mate_library() throws RecognitionException {
		Mate_libraryContext _localctx = new Mate_libraryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mate_library);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				mate_abs();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				mate_cos();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				mate_sin();
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
	public static class Mate_absContext extends ParserRuleContext {
		public Mate_argsContext mate_args() {
			return getRuleContext(Mate_argsContext.class,0);
		}
		public Mate_auxContext mate_aux() {
			return getRuleContext(Mate_auxContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(LatinoGrammarParser.TKN_CLOSING_PAR, 0); }
		public Mate_absContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mate_abs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterMate_abs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitMate_abs(this);
		}
	}

	public final Mate_absContext mate_abs() throws RecognitionException {
		Mate_absContext _localctx = new Mate_absContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mate_abs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__0);
			setState(304);
			mate_args();
			setState(305);
			mate_aux();
			setState(306);
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
	public static class Mate_cosContext extends ParserRuleContext {
		public Mate_argsContext mate_args() {
			return getRuleContext(Mate_argsContext.class,0);
		}
		public Mate_auxContext mate_aux() {
			return getRuleContext(Mate_auxContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(LatinoGrammarParser.TKN_CLOSING_PAR, 0); }
		public Mate_cosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mate_cos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterMate_cos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitMate_cos(this);
		}
	}

	public final Mate_cosContext mate_cos() throws RecognitionException {
		Mate_cosContext _localctx = new Mate_cosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mate_cos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(T__1);
			setState(309);
			mate_args();
			setState(310);
			mate_aux();
			setState(311);
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
	public static class Mate_sinContext extends ParserRuleContext {
		public Mate_argsContext mate_args() {
			return getRuleContext(Mate_argsContext.class,0);
		}
		public Mate_auxContext mate_aux() {
			return getRuleContext(Mate_auxContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(LatinoGrammarParser.TKN_CLOSING_PAR, 0); }
		public Mate_sinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mate_sin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterMate_sin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitMate_sin(this);
		}
	}

	public final Mate_sinContext mate_sin() throws RecognitionException {
		Mate_sinContext _localctx = new Mate_sinContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mate_sin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(T__2);
			setState(314);
			mate_args();
			setState(315);
			mate_aux();
			setState(316);
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
	public static class Mate_argsContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(LatinoGrammarParser.NUM, 0); }
		public TerminalNode TKN_MINUS() { return getToken(LatinoGrammarParser.TKN_MINUS, 0); }
		public TerminalNode ID() { return getToken(LatinoGrammarParser.ID, 0); }
		public Mate_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mate_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterMate_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitMate_args(this);
		}
	}

	public final Mate_argsContext mate_args() throws RecognitionException {
		Mate_argsContext _localctx = new Mate_argsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mate_args);
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(NUM);
				}
				break;
			case TKN_MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(TKN_MINUS);
				setState(320);
				match(NUM);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				match(ID);
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
	public static class Mate_auxContext extends ParserRuleContext {
		public Mate_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mate_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterMate_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitMate_aux(this);
		}
	}

	public final Mate_auxContext mate_aux() throws RecognitionException {
		Mate_auxContext _localctx = new Mate_auxContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mate_aux);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
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
		enterRule(_localctx, 28, RULE_built_in_functions);
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				incluir_stat();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				leer_stat();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
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
		enterRule(_localctx, 30, RULE_acadena_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(T__3);
			setState(334);
			match(TKN_OPENING_PAR);
			setState(335);
			expArit();
			setState(336);
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
		enterRule(_localctx, 32, RULE_incluir_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(T__4);
			setState(339);
			match(TKN_OPENING_PAR);
			setState(340);
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
		enterRule(_localctx, 34, RULE_leer_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(T__5);
			setState(343);
			match(TKN_OPENING_PAR);
			setState(344);
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
		enterRule(_localctx, 36, RULE_limpiar_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(T__6);
			setState(347);
			match(TKN_OPENING_PAR);
			setState(348);
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
		enterRule(_localctx, 38, RULE_alogico_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(T__7);
			setState(351);
			match(TKN_OPENING_PAR);
			setState(352);
			expr();
			setState(353);
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
		enterRule(_localctx, 40, RULE_anumero_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(T__8);
			setState(356);
			match(TKN_OPENING_PAR);
			setState(357);
			expr();
			setState(358);
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
	public static class Tipo_statContext extends ParserRuleContext {
		public TerminalNode TKN_OPENING_PAR() { return getToken(LatinoGrammarParser.TKN_OPENING_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(LatinoGrammarParser.TKN_CLOSING_PAR, 0); }
		public Tipo_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterTipo_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitTipo_stat(this);
		}
	}

	public final Tipo_statContext tipo_stat() throws RecognitionException {
		Tipo_statContext _localctx = new Tipo_statContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tipo_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(T__9);
			setState(361);
			match(TKN_OPENING_PAR);
			setState(362);
			expr();
			setState(363);
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
		enterRule(_localctx, 44, RULE_print_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			print_operations();
			setState(366);
			match(TKN_OPENING_PAR);
			setState(367);
			print_stat_cont();
			setState(368);
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
		public AccessMemberContext accessMember() {
			return getRuleContext(AccessMemberContext.class,0);
		}
		public Mate_libraryContext mate_library() {
			return getRuleContext(Mate_libraryContext.class,0);
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
		enterRule(_localctx, 46, RULE_print_stat_cont);
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				array_printing();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				accessMember();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(373);
				mate_library();
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
		enterRule(_localctx, 48, RULE_print_operations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0)) ) {
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
		public TerminalNode NUM() { return getToken(LatinoGrammarParser.NUM, 0); }
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
		enterRule(_localctx, 50, RULE_array_printing);
		int _la;
		try {
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(ID);
				setState(379);
				match(TKN_OPENING_BRA);
				setState(380);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(381);
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
		enterRule(_localctx, 52, RULE_function_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			function_op();
			setState(386);
			function_name();
			setState(387);
			function_pars();
			setState(388);
			function_content();
			setState(389);
			match(T__13);
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
		enterRule(_localctx, 54, RULE_function_name);
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
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
		enterRule(_localctx, 56, RULE_function_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
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
		enterRule(_localctx, 58, RULE_function_pars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(TKN_OPENING_PAR);
			setState(398);
			function_args();
			setState(399);
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
		enterRule(_localctx, 60, RULE_function_args);
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__7:
			case T__8:
			case T__9:
			case T__14:
			case T__15:
			case T__20:
			case T__36:
			case T__37:
			case STRING:
			case TKN_OPENING_KEY:
			case TKN_OPENING_BRA:
			case TKN_OPENING_PAR:
			case TKN_PLUS:
			case TKN_MINUS:
			case TKN_NOT:
			case NUM:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				expr();
				setState(402);
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
		enterRule(_localctx, 62, RULE_function_args_aux);
		try {
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				match(TKN_COMMA);
				setState(408);
				expr();
				setState(409);
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
		enterRule(_localctx, 64, RULE_function_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			function_ret_op();
			setState(415);
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
		enterRule(_localctx, 66, RULE_function_ret_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) ) {
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
		enterRule(_localctx, 68, RULE_function_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			substatement();
			setState(420);
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
		enterRule(_localctx, 70, RULE_special_methods);
		try {
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				longitud_method();
				setState(423);
				substatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				brakets();
				setState(426);
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
		enterRule(_localctx, 72, RULE_longitud_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(431);
			match(T__20);
			}
			{
			setState(432);
			match(TKN_PERIOD);
			}
			{
			setState(433);
			match(T__21);
			}
			{
			setState(434);
			match(TKN_OPENING_PAR);
			}
			{
			setState(435);
			match(ID);
			}
			{
			setState(436);
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
		enterRule(_localctx, 74, RULE_brakets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(TKN_OPENING_BRA);
			setState(439);
			match(ID);
			setState(440);
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
		public Function_call_opContext function_call_op() {
			return getRuleContext(Function_call_opContext.class,0);
		}
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
		enterRule(_localctx, 76, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			function_call_op();
			setState(443);
			match(TKN_OPENING_PAR);
			setState(444);
			function_args();
			setState(445);
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
	public static class Function_call_opContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LatinoGrammarParser.ID, 0); }
		public AccessMemberContext accessMember() {
			return getRuleContext(AccessMemberContext.class,0);
		}
		public Function_call_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterFunction_call_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitFunction_call_op(this);
		}
	}

	public final Function_call_opContext function_call_op() throws RecognitionException {
		Function_call_opContext _localctx = new Function_call_opContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_function_call_op);
		try {
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				accessMember();
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
		enterRule(_localctx, 80, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(TKN_OPENING_BRA);
			setState(452);
			array_content();
			setState(453);
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
	public static class Array_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Array_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterArray_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitArray_expr(this);
		}
	}

	public final Array_exprContext array_expr() throws RecognitionException {
		Array_exprContext _localctx = new Array_exprContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_array_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
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
	public static class Array_contentContext extends ParserRuleContext {
		public Array_exprContext array_expr() {
			return getRuleContext(Array_exprContext.class,0);
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
		enterRule(_localctx, 84, RULE_array_content);
		try {
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__7:
			case T__8:
			case T__9:
			case T__14:
			case T__15:
			case T__20:
			case T__36:
			case T__37:
			case STRING:
			case TKN_OPENING_KEY:
			case TKN_OPENING_BRA:
			case TKN_OPENING_PAR:
			case TKN_PLUS:
			case TKN_MINUS:
			case TKN_NOT:
			case NUM:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				array_expr();
				setState(458);
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
		public Array_exprContext array_expr() {
			return getRuleContext(Array_exprContext.class,0);
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
		enterRule(_localctx, 86, RULE_array_content_aux);
		try {
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				match(TKN_COMMA);
				setState(464);
				array_expr();
				setState(465);
				array_content_aux();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				match(TKN_COMMA);
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
	public static class DictionaryContext extends ParserRuleContext {
		public TerminalNode TKN_OPENING_KEY() { return getToken(LatinoGrammarParser.TKN_OPENING_KEY, 0); }
		public Dictionary_contentContext dictionary_content() {
			return getRuleContext(Dictionary_contentContext.class,0);
		}
		public TerminalNode TKN_CLOSING_KEY() { return getToken(LatinoGrammarParser.TKN_CLOSING_KEY, 0); }
		public DictionaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterDictionary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitDictionary(this);
		}
	}

	public final DictionaryContext dictionary() throws RecognitionException {
		DictionaryContext _localctx = new DictionaryContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_dictionary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(TKN_OPENING_KEY);
			setState(472);
			dictionary_content();
			setState(473);
			match(TKN_CLOSING_KEY);
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
	public static class Dictionary_contentContext extends ParserRuleContext {
		public Dictionary_expr_keyContext dictionary_expr_key() {
			return getRuleContext(Dictionary_expr_keyContext.class,0);
		}
		public TerminalNode TKN_COLON() { return getToken(LatinoGrammarParser.TKN_COLON, 0); }
		public Dictionary_expr_valueContext dictionary_expr_value() {
			return getRuleContext(Dictionary_expr_valueContext.class,0);
		}
		public Dictionary_content_auxContext dictionary_content_aux() {
			return getRuleContext(Dictionary_content_auxContext.class,0);
		}
		public Dictionary_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterDictionary_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitDictionary_content(this);
		}
	}

	public final Dictionary_contentContext dictionary_content() throws RecognitionException {
		Dictionary_contentContext _localctx = new Dictionary_contentContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_dictionary_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			dictionary_expr_key();
			setState(476);
			match(TKN_COLON);
			setState(477);
			dictionary_expr_value();
			setState(478);
			dictionary_content_aux();
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
	public static class Dictionary_expr_keyContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Dictionary_expr_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_expr_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterDictionary_expr_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitDictionary_expr_key(this);
		}
	}

	public final Dictionary_expr_keyContext dictionary_expr_key() throws RecognitionException {
		Dictionary_expr_keyContext _localctx = new Dictionary_expr_keyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_dictionary_expr_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
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
	public static class Dictionary_expr_valueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Dictionary_expr_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_expr_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterDictionary_expr_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitDictionary_expr_value(this);
		}
	}

	public final Dictionary_expr_valueContext dictionary_expr_value() throws RecognitionException {
		Dictionary_expr_valueContext _localctx = new Dictionary_expr_valueContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_dictionary_expr_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
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
	public static class Dictionary_content_auxContext extends ParserRuleContext {
		public TerminalNode TKN_COMMA() { return getToken(LatinoGrammarParser.TKN_COMMA, 0); }
		public Dictionary_expr_keyContext dictionary_expr_key() {
			return getRuleContext(Dictionary_expr_keyContext.class,0);
		}
		public TerminalNode TKN_COLON() { return getToken(LatinoGrammarParser.TKN_COLON, 0); }
		public Dictionary_expr_valueContext dictionary_expr_value() {
			return getRuleContext(Dictionary_expr_valueContext.class,0);
		}
		public Dictionary_content_auxContext dictionary_content_aux() {
			return getRuleContext(Dictionary_content_auxContext.class,0);
		}
		public Dictionary_content_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_content_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterDictionary_content_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitDictionary_content_aux(this);
		}
	}

	public final Dictionary_content_auxContext dictionary_content_aux() throws RecognitionException {
		Dictionary_content_auxContext _localctx = new Dictionary_content_auxContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_dictionary_content_aux);
		try {
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(TKN_COMMA);
				setState(485);
				dictionary_expr_key();
				setState(486);
				match(TKN_COLON);
				setState(487);
				dictionary_expr_value();
				setState(488);
				dictionary_content_aux();
				}
				break;
			case TKN_CLOSING_KEY:
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
		enterRule(_localctx, 98, RULE_conditionals);
		try {
			setState(495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				if_conditional();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
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
		enterRule(_localctx, 100, RULE_loops);
		try {
			setState(501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				desde_loop();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				mientras_loop();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(499);
				repetir_loop();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 4);
				{
				setState(500);
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
		enterRule(_localctx, 102, RULE_if_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(T__22);
			setState(504);
			conditional_expr();
			setState(505);
			conditional_substatement();
			setState(506);
			if_conditional_aux();
			setState(507);
			match(T__13);
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
		enterRule(_localctx, 104, RULE_conditional_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
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
		enterRule(_localctx, 106, RULE_conditional_substatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
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
		enterRule(_localctx, 108, RULE_if_conditional_aux);
		try {
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				match(T__23);
				setState(514);
				conditional_expr();
				setState(515);
				conditional_substatement();
				setState(516);
				if_conditional_aux();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				match(T__24);
				setState(519);
				conditional_substatement();
				}
				break;
			case T__13:
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
		enterRule(_localctx, 110, RULE_swicth_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(T__25);
			setState(524);
			match(TKN_OPENING_PAR);
			setState(525);
			expr();
			setState(526);
			match(TKN_CLOSING_PAR);
			setState(527);
			caseBlock();
			setState(528);
			match(T__13);
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
		enterRule(_localctx, 112, RULE_caseBlock);
		try {
			int _alt;
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(531); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(530);
						caseClause();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(533); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(535);
				caseBlock();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				defaultClause();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(538);
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
		enterRule(_localctx, 114, RULE_caseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(T__26);
			setState(542);
			caseClauseExpr();
			setState(543);
			match(TKN_COLON);
			setState(544);
			conditional_substatement();
			setState(545);
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
		enterRule(_localctx, 116, RULE_caseClauseExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
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
		enterRule(_localctx, 118, RULE_defaultClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(T__27);
			setState(550);
			match(TKN_COLON);
			setState(551);
			conditional_substatement();
			setState(552);
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
		enterRule(_localctx, 120, RULE_otherClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(T__28);
			setState(555);
			match(TKN_COLON);
			setState(556);
			conditional_substatement();
			setState(557);
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
		enterRule(_localctx, 122, RULE_romperOp);
		try {
			setState(561);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				match(T__29);
				}
				break;
			case T__13:
			case T__26:
			case T__27:
			case T__28:
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
		enterRule(_localctx, 124, RULE_repetir_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(T__30);
			setState(564);
			loop_substatement();
			setState(565);
			repetir_aux();
			setState(566);
			match(T__31);
			setState(567);
			expr();
			setState(568);
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
		enterRule(_localctx, 126, RULE_repetir_aux);
		try {
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
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
		enterRule(_localctx, 128, RULE_repetir_aux2);
		try {
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
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
		enterRule(_localctx, 130, RULE_rango_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(T__32);
			setState(579);
			match(ID);
			setState(580);
			match(T__33);
			setState(581);
			match(TKN_OPENING_PAR);
			setState(582);
			inicio_value();
			setState(583);
			fin_value();
			setState(584);
			salto_value();
			setState(585);
			final_arguments();
			setState(586);
			loop_substatement();
			setState(587);
			match(T__13);
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
		enterRule(_localctx, 132, RULE_inicio_value);
		try {
			setState(592);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				match(NUM);
				}
				break;
			case TKN_MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				match(TKN_MINUS);
				setState(591);
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
		public TerminalNode TKN_COMMA() { return getToken(LatinoGrammarParser.TKN_COMMA, 0); }
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
		enterRule(_localctx, 134, RULE_fin_value);
		try {
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(594);
				match(TKN_COMMA);
				setState(595);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
				match(TKN_COMMA);
				setState(597);
				match(TKN_MINUS);
				setState(598);
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
		public TerminalNode TKN_COMMA() { return getToken(LatinoGrammarParser.TKN_COMMA, 0); }
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
		enterRule(_localctx, 136, RULE_salto_value);
		try {
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				match(TKN_COMMA);
				setState(603);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				match(TKN_COMMA);
				setState(605);
				match(TKN_MINUS);
				setState(606);
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
		enterRule(_localctx, 138, RULE_final_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
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
		enterRule(_localctx, 140, RULE_mientras_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(T__34);
			setState(613);
			expr();
			setState(614);
			loop_substatement();
			setState(615);
			match(T__13);
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
		enterRule(_localctx, 142, RULE_desde_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(T__35);
			setState(618);
			match(TKN_OPENING_PAR);
			setState(619);
			triple_expr();
			setState(620);
			match(TKN_CLOSING_PAR);
			setState(621);
			loop_substatement();
			setState(622);
			match(T__13);
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
		enterRule(_localctx, 144, RULE_loop_substatement);
		try {
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
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
		enterRule(_localctx, 146, RULE_triple_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			loop_assign();
			setState(629);
			match(TKN_SEMICOLON);
			setState(630);
			loop_expr();
			setState(631);
			match(TKN_SEMICOLON);
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(632);
				loop_assign();
				}
				break;
			case 2:
				{
				setState(633);
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
		enterRule(_localctx, 148, RULE_loop_assign);
		try {
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				match(ID);
				setState(637);
				loop_assignmentOperator();
				setState(638);
				loop_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				match(ID);
				setState(641);
				loop_assignAux();
				setState(642);
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
		enterRule(_localctx, 150, RULE_loop_assignAux);
		try {
			setState(653);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(646);
				match(TKN_COMMA);
				}
				{
				setState(647);
				match(ID);
				}
				{
				setState(648);
				assignAux();
				}
				{
				setState(649);
				expr();
				}
				{
				setState(650);
				match(TKN_COMMA);
				}
				}
				break;
			case TKN_ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
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
		enterRule(_localctx, 152, RULE_loop_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1116892707587883008L) != 0)) ) {
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
		enterRule(_localctx, 154, RULE_loop_assignIncrDecr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			match(ID);
			setState(658);
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
		enterRule(_localctx, 156, RULE_loop_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			loop_expBool();
			setState(661);
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
		enterRule(_localctx, 158, RULE_loop_exprRest);
		try {
			setState(668);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				match(TKN_OR);
				setState(664);
				loop_expBool();
				setState(665);
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
		enterRule(_localctx, 160, RULE_loop_expBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			loop_expRel();
			setState(671);
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
		enterRule(_localctx, 162, RULE_loop_expBoolRest);
		try {
			setState(678);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				match(TKN_AND);
				setState(674);
				loop_expRel();
				setState(675);
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
		enterRule(_localctx, 164, RULE_loop_opRel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 63L) != 0)) ) {
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
		enterRule(_localctx, 166, RULE_loop_expRel);
		try {
			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(682);
				loop_exprConcat();
				}
				{
				setState(683);
				loop_opRel();
				}
				setState(687);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUM:
					{
					setState(684);
					match(NUM);
					}
					break;
				case ID:
					{
					setState(685);
					match(ID);
					}
					break;
				case T__20:
				case TKN_AND:
				case TKN_OR:
				case TKN_SEMICOLON:
				case TKN_OPENING_BRA:
				case TKN_CLOSING_PAR:
					{
					setState(686);
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
				setState(689);
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
		enterRule(_localctx, 168, RULE_loop_exprConcat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			loop_expArit();
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_CONCAT) {
				{
				{
				setState(693);
				loop_exprConcatOp();
				setState(694);
				loop_expArit();
				}
				}
				setState(700);
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
		enterRule(_localctx, 170, RULE_loop_exprConcatOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
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
		enterRule(_localctx, 172, RULE_loop_expArit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			loop_term();
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_PLUS || _la==TKN_MINUS) {
				{
				{
				setState(704);
				loop_expAritOp();
				setState(705);
				loop_term();
				}
				}
				setState(711);
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
		enterRule(_localctx, 174, RULE_loop_expAritOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
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
		enterRule(_localctx, 176, RULE_loop_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			loop_factor();
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 11L) != 0)) {
				{
				{
				setState(715);
				loop_termOp();
				setState(716);
				loop_factor();
				}
				}
				setState(722);
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
		enterRule(_localctx, 178, RULE_loop_termOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 11L) != 0)) ) {
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
		enterRule(_localctx, 180, RULE_loop_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			loop_t_factor();
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_POWER) {
				{
				{
				setState(726);
				loop_factorOp();
				setState(727);
				loop_t_factor();
				}
				}
				setState(733);
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
		enterRule(_localctx, 182, RULE_loop_factorOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
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
		enterRule(_localctx, 184, RULE_loop_t_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(736);
			expr_factor();
			}
			{
			setState(737);
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
		enterRule(_localctx, 186, RULE_loop_expr_terminals);
		int _la;
		try {
			setState(759);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				match(NUM);
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TKN_OPENING_BRA) {
					{
					{
					setState(740);
					brakets();
					}
					}
					setState(745);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(746);
				match(ID);
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TKN_OPENING_BRA) {
					{
					{
					setState(747);
					brakets();
					}
					}
					setState(752);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case TKN_OPENING_PAR:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(753);
				match(TKN_OPENING_PAR);
				}
				{
				setState(754);
				loop_expr();
				}
				{
				setState(755);
				match(TKN_CLOSING_PAR);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(757);
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
		enterRule(_localctx, 188, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			expBool();
			setState(762);
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
		enterRule(_localctx, 190, RULE_exprRest);
		try {
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				match(TKN_OR);
				setState(765);
				expBool();
				setState(766);
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
		enterRule(_localctx, 192, RULE_expBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			expRel();
			setState(772);
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
		enterRule(_localctx, 194, RULE_expBoolRest);
		try {
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(774);
				match(TKN_AND);
				setState(775);
				expRel();
				setState(776);
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
		public TerminalNode TKN_REGEX() { return getToken(LatinoGrammarParser.TKN_REGEX, 0); }
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
		enterRule(_localctx, 196, RULE_opRel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 127L) != 0)) ) {
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
		enterRule(_localctx, 198, RULE_expRel);
		try {
			setState(790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(783);
				exprConcat();
				}
				{
				setState(784);
				opRel();
				}
				setState(787);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(785);
					exprConcat();
					}
					break;
				case 2:
					{
					setState(786);
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
				setState(789);
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
		enterRule(_localctx, 200, RULE_exprConcat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			expArit();
			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_CONCAT) {
				{
				{
				setState(793);
				exprConcatOp();
				setState(794);
				expArit();
				}
				}
				setState(800);
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
		enterRule(_localctx, 202, RULE_exprConcatOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
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
		enterRule(_localctx, 204, RULE_expArit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			term();
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_PLUS || _la==TKN_MINUS) {
				{
				{
				setState(804);
				expAritOp();
				setState(805);
				term();
				}
				}
				setState(811);
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
		enterRule(_localctx, 206, RULE_expAritOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
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
		enterRule(_localctx, 208, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			factor();
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 11L) != 0)) {
				{
				{
				setState(815);
				termOp();
				setState(816);
				factor();
				}
				}
				setState(822);
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
		enterRule(_localctx, 210, RULE_termOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 11L) != 0)) ) {
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
		enterRule(_localctx, 212, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			t_factor();
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_POWER) {
				{
				{
				setState(826);
				factorOp();
				setState(827);
				t_factor();
				}
				}
				setState(833);
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
		enterRule(_localctx, 214, RULE_factorOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
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
		enterRule(_localctx, 216, RULE_t_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(836);
			expr_factor();
			}
			{
			setState(837);
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
		public Tipo_statContext tipo_stat() {
			return getRuleContext(Tipo_statContext.class,0);
		}
		public DictionaryContext dictionary() {
			return getRuleContext(DictionaryContext.class,0);
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
		enterRule(_localctx, 218, RULE_expr_terminals);
		try {
			int _alt;
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				match(NUM);
				setState(843);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(840);
						brakets();
						}
						} 
					}
					setState(845);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(846);
				match(ID);
				setState(850);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(847);
						brakets();
						}
						} 
					}
					setState(852);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(853);
				match(TKN_OPENING_PAR);
				}
				{
				setState(854);
				expr();
				}
				{
				setState(855);
				match(TKN_CLOSING_PAR);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(857);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(858);
				anumero_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(859);
				alogico_stat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(860);
				acadena_stat();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(861);
				array();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(862);
				function_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(863);
				function_stat();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(864);
				tipo_stat();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(865);
				match(T__36);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(866);
				match(T__37);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(867);
				dictionary();
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
		public List<Expr_factor_minusContext> expr_factor_minus() {
			return getRuleContexts(Expr_factor_minusContext.class);
		}
		public Expr_factor_minusContext expr_factor_minus(int i) {
			return getRuleContext(Expr_factor_minusContext.class,i);
		}
		public List<Expr_factor_plusContext> expr_factor_plus() {
			return getRuleContexts(Expr_factor_plusContext.class);
		}
		public Expr_factor_plusContext expr_factor_plus(int i) {
			return getRuleContext(Expr_factor_plusContext.class,i);
		}
		public List<Expr_factor_notContext> expr_factor_not() {
			return getRuleContexts(Expr_factor_notContext.class);
		}
		public Expr_factor_notContext expr_factor_not(int i) {
			return getRuleContext(Expr_factor_notContext.class,i);
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
		enterRule(_localctx, 220, RULE_expr_factor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(873);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TKN_MINUS:
						{
						setState(870);
						expr_factor_minus();
						}
						break;
					case TKN_PLUS:
						{
						setState(871);
						expr_factor_plus();
						}
						break;
					case TKN_NOT:
						{
						setState(872);
						expr_factor_not();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(877);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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
	public static class Expr_factor_notContext extends ParserRuleContext {
		public TerminalNode TKN_NOT() { return getToken(LatinoGrammarParser.TKN_NOT, 0); }
		public Expr_factor_notContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_factor_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterExpr_factor_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitExpr_factor_not(this);
		}
	}

	public final Expr_factor_notContext expr_factor_not() throws RecognitionException {
		Expr_factor_notContext _localctx = new Expr_factor_notContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_expr_factor_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(TKN_NOT);
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
	public static class Expr_factor_minusContext extends ParserRuleContext {
		public TerminalNode TKN_MINUS() { return getToken(LatinoGrammarParser.TKN_MINUS, 0); }
		public Expr_factor_minusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_factor_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterExpr_factor_minus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitExpr_factor_minus(this);
		}
	}

	public final Expr_factor_minusContext expr_factor_minus() throws RecognitionException {
		Expr_factor_minusContext _localctx = new Expr_factor_minusContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_expr_factor_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			match(TKN_MINUS);
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
	public static class Expr_factor_plusContext extends ParserRuleContext {
		public TerminalNode TKN_PLUS() { return getToken(LatinoGrammarParser.TKN_PLUS, 0); }
		public Expr_factor_plusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_factor_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).enterExpr_factor_plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinoGrammarListener ) ((LatinoGrammarListener)listener).exitExpr_factor_plus(this);
		}
	}

	public final Expr_factor_plusContext expr_factor_plus() throws RecognitionException {
		Expr_factor_plusContext _localctx = new Expr_factor_plusContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_expr_factor_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			match(TKN_PLUS);
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
		"\u0004\u0001P\u0375\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007h\u0002"+
		"i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007m\u0002"+
		"n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u00fe\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u0104\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u0118\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u011c\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0125\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u012e\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u0143\b\f\u0001\r\u0001\r\u0003\r\u0147"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u014c\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0177"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0180\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u018a\b\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u0196\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u019d\b\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u01ae\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0003"+
		"\'\u01c2\b\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001"+
		"*\u0001*\u0003*\u01ce\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003"+
		"+\u01d6\b+\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00030\u01ec\b0\u00011\u00011\u00031\u01f0\b1\u00012\u00012\u0001"+
		"2\u00012\u00032\u01f6\b2\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"4\u00014\u00015\u00015\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00036\u020a\b6\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00018\u00048\u0214\b8\u000b8\f8\u0215\u00018\u00018\u00018\u00018\u0003"+
		"8\u021c\b8\u00019\u00019\u00019\u00019\u00019\u00019\u0001:\u0001:\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"=\u0001=\u0003=\u0232\b=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001?\u0001?\u0003?\u023d\b?\u0001@\u0001@\u0003@\u0241\b@\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"B\u0001B\u0001B\u0003B\u0251\bB\u0001C\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0003C\u0259\bC\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u0261"+
		"\bD\u0001E\u0001E\u0001F\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001H\u0001H\u0003H\u0273\bH\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0003I\u027b\bI\u0001J\u0001J\u0001J\u0001"+
		"J\u0001J\u0001J\u0001J\u0001J\u0003J\u0285\bJ\u0001K\u0001K\u0001K\u0001"+
		"K\u0001K\u0001K\u0001K\u0003K\u028e\bK\u0001L\u0001L\u0001M\u0001M\u0001"+
		"M\u0001N\u0001N\u0001N\u0001O\u0001O\u0001O\u0001O\u0001O\u0003O\u029d"+
		"\bO\u0001P\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u02a7"+
		"\bQ\u0001R\u0001R\u0001S\u0001S\u0001S\u0001S\u0001S\u0003S\u02b0\bS\u0001"+
		"S\u0003S\u02b3\bS\u0001T\u0001T\u0001T\u0001T\u0005T\u02b9\bT\nT\fT\u02bc"+
		"\tT\u0001U\u0001U\u0001V\u0001V\u0001V\u0001V\u0005V\u02c4\bV\nV\fV\u02c7"+
		"\tV\u0001W\u0001W\u0001X\u0001X\u0001X\u0001X\u0005X\u02cf\bX\nX\fX\u02d2"+
		"\tX\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0001Z\u0005Z\u02da\bZ\nZ\fZ\u02dd"+
		"\tZ\u0001[\u0001[\u0001\\\u0001\\\u0001\\\u0001]\u0001]\u0005]\u02e6\b"+
		"]\n]\f]\u02e9\t]\u0001]\u0001]\u0005]\u02ed\b]\n]\f]\u02f0\t]\u0001]\u0001"+
		"]\u0001]\u0001]\u0001]\u0001]\u0003]\u02f8\b]\u0001^\u0001^\u0001^\u0001"+
		"_\u0001_\u0001_\u0001_\u0001_\u0003_\u0302\b_\u0001`\u0001`\u0001`\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0003a\u030c\ba\u0001b\u0001b\u0001c\u0001"+
		"c\u0001c\u0001c\u0003c\u0314\bc\u0001c\u0003c\u0317\bc\u0001d\u0001d\u0001"+
		"d\u0001d\u0005d\u031d\bd\nd\fd\u0320\td\u0001e\u0001e\u0001f\u0001f\u0001"+
		"f\u0001f\u0005f\u0328\bf\nf\ff\u032b\tf\u0001g\u0001g\u0001h\u0001h\u0001"+
		"h\u0001h\u0005h\u0333\bh\nh\fh\u0336\th\u0001i\u0001i\u0001j\u0001j\u0001"+
		"j\u0001j\u0005j\u033e\bj\nj\fj\u0341\tj\u0001k\u0001k\u0001l\u0001l\u0001"+
		"l\u0001m\u0001m\u0005m\u034a\bm\nm\fm\u034d\tm\u0001m\u0001m\u0005m\u0351"+
		"\bm\nm\fm\u0354\tm\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001"+
		"m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0003m\u0365\bm\u0001"+
		"n\u0001n\u0001n\u0005n\u036a\bn\nn\fn\u036d\tn\u0001o\u0001o\u0001p\u0001"+
		"p\u0001q\u0001q\u0001q\u0000\u0000r\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u0000\n\u0001\u00007;\u0001"+
		"\u000056\u0001\u0000\u000b\r\u0001\u0000KL\u0001\u0000\u000f\u0010\u0001"+
		"\u0000\u0011\u0014\u0001\u0000BG\u0001\u0000<=\u0002\u0000>?AA\u0001\u0000"+
		"BH\u0364\u0000\u00e4\u0001\u0000\u0000\u0000\u0002\u00fd\u0001\u0000\u0000"+
		"\u0000\u0004\u0103\u0001\u0000\u0000\u0000\u0006\u0117\u0001\u0000\u0000"+
		"\u0000\b\u011b\u0001\u0000\u0000\u0000\n\u0124\u0001\u0000\u0000\u0000"+
		"\f\u0126\u0001\u0000\u0000\u0000\u000e\u0128\u0001\u0000\u0000\u0000\u0010"+
		"\u012d\u0001\u0000\u0000\u0000\u0012\u012f\u0001\u0000\u0000\u0000\u0014"+
		"\u0134\u0001\u0000\u0000\u0000\u0016\u0139\u0001\u0000\u0000\u0000\u0018"+
		"\u0142\u0001\u0000\u0000\u0000\u001a\u0146\u0001\u0000\u0000\u0000\u001c"+
		"\u014b\u0001\u0000\u0000\u0000\u001e\u014d\u0001\u0000\u0000\u0000 \u0152"+
		"\u0001\u0000\u0000\u0000\"\u0156\u0001\u0000\u0000\u0000$\u015a\u0001"+
		"\u0000\u0000\u0000&\u015e\u0001\u0000\u0000\u0000(\u0163\u0001\u0000\u0000"+
		"\u0000*\u0168\u0001\u0000\u0000\u0000,\u016d\u0001\u0000\u0000\u0000."+
		"\u0176\u0001\u0000\u0000\u00000\u0178\u0001\u0000\u0000\u00002\u017f\u0001"+
		"\u0000\u0000\u00004\u0181\u0001\u0000\u0000\u00006\u0189\u0001\u0000\u0000"+
		"\u00008\u018b\u0001\u0000\u0000\u0000:\u018d\u0001\u0000\u0000\u0000<"+
		"\u0195\u0001\u0000\u0000\u0000>\u019c\u0001\u0000\u0000\u0000@\u019e\u0001"+
		"\u0000\u0000\u0000B\u01a1\u0001\u0000\u0000\u0000D\u01a3\u0001\u0000\u0000"+
		"\u0000F\u01ad\u0001\u0000\u0000\u0000H\u01af\u0001\u0000\u0000\u0000J"+
		"\u01b6\u0001\u0000\u0000\u0000L\u01ba\u0001\u0000\u0000\u0000N\u01c1\u0001"+
		"\u0000\u0000\u0000P\u01c3\u0001\u0000\u0000\u0000R\u01c7\u0001\u0000\u0000"+
		"\u0000T\u01cd\u0001\u0000\u0000\u0000V\u01d5\u0001\u0000\u0000\u0000X"+
		"\u01d7\u0001\u0000\u0000\u0000Z\u01db\u0001\u0000\u0000\u0000\\\u01e0"+
		"\u0001\u0000\u0000\u0000^\u01e2\u0001\u0000\u0000\u0000`\u01eb\u0001\u0000"+
		"\u0000\u0000b\u01ef\u0001\u0000\u0000\u0000d\u01f5\u0001\u0000\u0000\u0000"+
		"f\u01f7\u0001\u0000\u0000\u0000h\u01fd\u0001\u0000\u0000\u0000j\u01ff"+
		"\u0001\u0000\u0000\u0000l\u0209\u0001\u0000\u0000\u0000n\u020b\u0001\u0000"+
		"\u0000\u0000p\u021b\u0001\u0000\u0000\u0000r\u021d\u0001\u0000\u0000\u0000"+
		"t\u0223\u0001\u0000\u0000\u0000v\u0225\u0001\u0000\u0000\u0000x\u022a"+
		"\u0001\u0000\u0000\u0000z\u0231\u0001\u0000\u0000\u0000|\u0233\u0001\u0000"+
		"\u0000\u0000~\u023c\u0001\u0000\u0000\u0000\u0080\u0240\u0001\u0000\u0000"+
		"\u0000\u0082\u0242\u0001\u0000\u0000\u0000\u0084\u0250\u0001\u0000\u0000"+
		"\u0000\u0086\u0258\u0001\u0000\u0000\u0000\u0088\u0260\u0001\u0000\u0000"+
		"\u0000\u008a\u0262\u0001\u0000\u0000\u0000\u008c\u0264\u0001\u0000\u0000"+
		"\u0000\u008e\u0269\u0001\u0000\u0000\u0000\u0090\u0272\u0001\u0000\u0000"+
		"\u0000\u0092\u0274\u0001\u0000\u0000\u0000\u0094\u0284\u0001\u0000\u0000"+
		"\u0000\u0096\u028d\u0001\u0000\u0000\u0000\u0098\u028f\u0001\u0000\u0000"+
		"\u0000\u009a\u0291\u0001\u0000\u0000\u0000\u009c\u0294\u0001\u0000\u0000"+
		"\u0000\u009e\u029c\u0001\u0000\u0000\u0000\u00a0\u029e\u0001\u0000\u0000"+
		"\u0000\u00a2\u02a6\u0001\u0000\u0000\u0000\u00a4\u02a8\u0001\u0000\u0000"+
		"\u0000\u00a6\u02b2\u0001\u0000\u0000\u0000\u00a8\u02b4\u0001\u0000\u0000"+
		"\u0000\u00aa\u02bd\u0001\u0000\u0000\u0000\u00ac\u02bf\u0001\u0000\u0000"+
		"\u0000\u00ae\u02c8\u0001\u0000\u0000\u0000\u00b0\u02ca\u0001\u0000\u0000"+
		"\u0000\u00b2\u02d3\u0001\u0000\u0000\u0000\u00b4\u02d5\u0001\u0000\u0000"+
		"\u0000\u00b6\u02de\u0001\u0000\u0000\u0000\u00b8\u02e0\u0001\u0000\u0000"+
		"\u0000\u00ba\u02f7\u0001\u0000\u0000\u0000\u00bc\u02f9\u0001\u0000\u0000"+
		"\u0000\u00be\u0301\u0001\u0000\u0000\u0000\u00c0\u0303\u0001\u0000\u0000"+
		"\u0000\u00c2\u030b\u0001\u0000\u0000\u0000\u00c4\u030d\u0001\u0000\u0000"+
		"\u0000\u00c6\u0316\u0001\u0000\u0000\u0000\u00c8\u0318\u0001\u0000\u0000"+
		"\u0000\u00ca\u0321\u0001\u0000\u0000\u0000\u00cc\u0323\u0001\u0000\u0000"+
		"\u0000\u00ce\u032c\u0001\u0000\u0000\u0000\u00d0\u032e\u0001\u0000\u0000"+
		"\u0000\u00d2\u0337\u0001\u0000\u0000\u0000\u00d4\u0339\u0001\u0000\u0000"+
		"\u0000\u00d6\u0342\u0001\u0000\u0000\u0000\u00d8\u0344\u0001\u0000\u0000"+
		"\u0000\u00da\u0364\u0001\u0000\u0000\u0000\u00dc\u036b\u0001\u0000\u0000"+
		"\u0000\u00de\u036e\u0001\u0000\u0000\u0000\u00e0\u0370\u0001\u0000\u0000"+
		"\u0000\u00e2\u0372\u0001\u0000\u0000\u0000\u00e4\u00e5\u0003\u0002\u0001"+
		"\u0000\u00e5\u0001\u0001\u0000\u0000\u0000\u00e6\u00e7\u0003,\u0016\u0000"+
		"\u00e7\u00e8\u0003\u0002\u0001\u0000\u00e8\u00fe\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0003\u0006\u0003\u0000\u00ea\u00eb\u0003\u0002\u0001\u0000"+
		"\u00eb\u00fe\u0001\u0000\u0000\u0000\u00ec\u00ed\u0003\u001c\u000e\u0000"+
		"\u00ed\u00ee\u0003\u0002\u0001\u0000\u00ee\u00fe\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u00034\u001a\u0000\u00f0\u00f1\u0003\u0002\u0001\u0000\u00f1"+
		"\u00fe\u0001\u0000\u0000\u0000\u00f2\u00fe\u0003F#\u0000\u00f3\u00f4\u0003"+
		"b1\u0000\u00f4\u00f5\u0003\u0002\u0001\u0000\u00f5\u00fe\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0003d2\u0000\u00f7\u00f8\u0003\u0002\u0001\u0000\u00f8"+
		"\u00fe\u0001\u0000\u0000\u0000\u00f9\u00fa\u0003\u0004\u0002\u0000\u00fa"+
		"\u00fb\u0003\u0002\u0001\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fd\u00e6\u0001\u0000\u0000\u0000\u00fd"+
		"\u00e9\u0001\u0000\u0000\u0000\u00fd\u00ec\u0001\u0000\u0000\u0000\u00fd"+
		"\u00ef\u0001\u0000\u0000\u0000\u00fd\u00f2\u0001\u0000\u0000\u0000\u00fd"+
		"\u00f3\u0001\u0000\u0000\u0000\u00fd\u00f6\u0001\u0000\u0000\u0000\u00fd"+
		"\u00f9\u0001\u0000\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe"+
		"\u0003\u0001\u0000\u0000\u0000\u00ff\u0100\u0005L\u0000\u0000\u0100\u0101"+
		"\u0005+\u0000\u0000\u0101\u0104\u0005L\u0000\u0000\u0102\u0104\u0003H"+
		"$\u0000\u0103\u00ff\u0001\u0000\u0000\u0000\u0103\u0102\u0001\u0000\u0000"+
		"\u0000\u0104\u0005\u0001\u0000\u0000\u0000\u0105\u0106\u0003\b\u0004\u0000"+
		"\u0106\u0107\u0003\f\u0006\u0000\u0107\u0108\u0003\u00bc^\u0000\u0108"+
		"\u0118\u0001\u0000\u0000\u0000\u0109\u010a\u0003\b\u0004\u0000\u010a\u010b"+
		"\u0003\n\u0005\u0000\u010b\u010c\u0003\u00bc^\u0000\u010c\u0118\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0003\b\u0004\u0000\u010e\u010f\u0003\u000e"+
		"\u0007\u0000\u010f\u0118\u0001\u0000\u0000\u0000\u0110\u0111\u0003\b\u0004"+
		"\u0000\u0111\u0112\u00032\u0019\u0000\u0112\u0118\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0003\b\u0004\u0000\u0114\u0115\u0003\n\u0005\u0000\u0115"+
		"\u0116\u0003\u0010\b\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117\u0105"+
		"\u0001\u0000\u0000\u0000\u0117\u0109\u0001\u0000\u0000\u0000\u0117\u010d"+
		"\u0001\u0000\u0000\u0000\u0117\u0110\u0001\u0000\u0000\u0000\u0117\u0113"+
		"\u0001\u0000\u0000\u0000\u0118\u0007\u0001\u0000\u0000\u0000\u0119\u011c"+
		"\u0005L\u0000\u0000\u011a\u011c\u0003\u0004\u0002\u0000\u011b\u0119\u0001"+
		"\u0000\u0000\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c\t\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0005,\u0000\u0000\u011e\u011f\u0005L\u0000\u0000"+
		"\u011f\u0120\u0003\n\u0005\u0000\u0120\u0121\u0003\u00bc^\u0000\u0121"+
		"\u0122\u0005,\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0125"+
		"\u0005I\u0000\u0000\u0124\u011d\u0001\u0000\u0000\u0000\u0124\u0123\u0001"+
		"\u0000\u0000\u0000\u0125\u000b\u0001\u0000\u0000\u0000\u0126\u0127\u0007"+
		"\u0000\u0000\u0000\u0127\r\u0001\u0000\u0000\u0000\u0128\u0129\u0007\u0001"+
		"\u0000\u0000\u0129\u000f\u0001\u0000\u0000\u0000\u012a\u012e\u0003\u0012"+
		"\t\u0000\u012b\u012e\u0003\u0014\n\u0000\u012c\u012e\u0003\u0016\u000b"+
		"\u0000\u012d\u012a\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000"+
		"\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012e\u0011\u0001\u0000\u0000"+
		"\u0000\u012f\u0130\u0005\u0001\u0000\u0000\u0130\u0131\u0003\u0018\f\u0000"+
		"\u0131\u0132\u0003\u001a\r\u0000\u0132\u0133\u00054\u0000\u0000\u0133"+
		"\u0013\u0001\u0000\u0000\u0000\u0134\u0135\u0005\u0002\u0000\u0000\u0135"+
		"\u0136\u0003\u0018\f\u0000\u0136\u0137\u0003\u001a\r\u0000\u0137\u0138"+
		"\u00054\u0000\u0000\u0138\u0015\u0001\u0000\u0000\u0000\u0139\u013a\u0005"+
		"\u0003\u0000\u0000\u013a\u013b\u0003\u0018\f\u0000\u013b\u013c\u0003\u001a"+
		"\r\u0000\u013c\u013d\u00054\u0000\u0000\u013d\u0017\u0001\u0000\u0000"+
		"\u0000\u013e\u0143\u0005K\u0000\u0000\u013f\u0140\u0005=\u0000\u0000\u0140"+
		"\u0143\u0005K\u0000\u0000\u0141\u0143\u0005L\u0000\u0000\u0142\u013e\u0001"+
		"\u0000\u0000\u0000\u0142\u013f\u0001\u0000\u0000\u0000\u0142\u0141\u0001"+
		"\u0000\u0000\u0000\u0143\u0019\u0001\u0000\u0000\u0000\u0144\u0147\u0001"+
		"\u0000\u0000\u0000\u0145\u0147\u0001\u0000\u0000\u0000\u0146\u0144\u0001"+
		"\u0000\u0000\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0147\u001b\u0001"+
		"\u0000\u0000\u0000\u0148\u014c\u0003 \u0010\u0000\u0149\u014c\u0003\""+
		"\u0011\u0000\u014a\u014c\u0003$\u0012\u0000\u014b\u0148\u0001\u0000\u0000"+
		"\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014a\u0001\u0000\u0000"+
		"\u0000\u014c\u001d\u0001\u0000\u0000\u0000\u014d\u014e\u0005\u0004\u0000"+
		"\u0000\u014e\u014f\u00053\u0000\u0000\u014f\u0150\u0003\u00ccf\u0000\u0150"+
		"\u0151\u00054\u0000\u0000\u0151\u001f\u0001\u0000\u0000\u0000\u0152\u0153"+
		"\u0005\u0005\u0000\u0000\u0153\u0154\u00053\u0000\u0000\u0154\u0155\u0005"+
		"4\u0000\u0000\u0155!\u0001\u0000\u0000\u0000\u0156\u0157\u0005\u0006\u0000"+
		"\u0000\u0157\u0158\u00053\u0000\u0000\u0158\u0159\u00054\u0000\u0000\u0159"+
		"#\u0001\u0000\u0000\u0000\u015a\u015b\u0005\u0007\u0000\u0000\u015b\u015c"+
		"\u00053\u0000\u0000\u015c\u015d\u00054\u0000\u0000\u015d%\u0001\u0000"+
		"\u0000\u0000\u015e\u015f\u0005\b\u0000\u0000\u015f\u0160\u00053\u0000"+
		"\u0000\u0160\u0161\u0003\u00bc^\u0000\u0161\u0162\u00054\u0000\u0000\u0162"+
		"\'\u0001\u0000\u0000\u0000\u0163\u0164\u0005\t\u0000\u0000\u0164\u0165"+
		"\u00053\u0000\u0000\u0165\u0166\u0003\u00bc^\u0000\u0166\u0167\u00054"+
		"\u0000\u0000\u0167)\u0001\u0000\u0000\u0000\u0168\u0169\u0005\n\u0000"+
		"\u0000\u0169\u016a\u00053\u0000\u0000\u016a\u016b\u0003\u00bc^\u0000\u016b"+
		"\u016c\u00054\u0000\u0000\u016c+\u0001\u0000\u0000\u0000\u016d\u016e\u0003"+
		"0\u0018\u0000\u016e\u016f\u00053\u0000\u0000\u016f\u0170\u0003.\u0017"+
		"\u0000\u0170\u0171\u00054\u0000\u0000\u0171-\u0001\u0000\u0000\u0000\u0172"+
		"\u0177\u0003\u00bc^\u0000\u0173\u0177\u00032\u0019\u0000\u0174\u0177\u0003"+
		"\u0004\u0002\u0000\u0175\u0177\u0003\u0010\b\u0000\u0176\u0172\u0001\u0000"+
		"\u0000\u0000\u0176\u0173\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000"+
		"\u0000\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0177/\u0001\u0000\u0000"+
		"\u0000\u0178\u0179\u0007\u0002\u0000\u0000\u01791\u0001\u0000\u0000\u0000"+
		"\u017a\u017b\u0005L\u0000\u0000\u017b\u017c\u00051\u0000\u0000\u017c\u017d"+
		"\u0007\u0003\u0000\u0000\u017d\u0180\u00052\u0000\u0000\u017e\u0180\u0001"+
		"\u0000\u0000\u0000\u017f\u017a\u0001\u0000\u0000\u0000\u017f\u017e\u0001"+
		"\u0000\u0000\u0000\u01803\u0001\u0000\u0000\u0000\u0181\u0182\u00038\u001c"+
		"\u0000\u0182\u0183\u00036\u001b\u0000\u0183\u0184\u0003:\u001d\u0000\u0184"+
		"\u0185\u0003D\"\u0000\u0185\u0186\u0005\u000e\u0000\u0000\u01865\u0001"+
		"\u0000\u0000\u0000\u0187\u018a\u0005L\u0000\u0000\u0188\u018a\u0001\u0000"+
		"\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u0188\u0001\u0000"+
		"\u0000\u0000\u018a7\u0001\u0000\u0000\u0000\u018b\u018c\u0007\u0004\u0000"+
		"\u0000\u018c9\u0001\u0000\u0000\u0000\u018d\u018e\u00053\u0000\u0000\u018e"+
		"\u018f\u0003<\u001e\u0000\u018f\u0190\u00054\u0000\u0000\u0190;\u0001"+
		"\u0000\u0000\u0000\u0191\u0192\u0003\u00bc^\u0000\u0192\u0193\u0003>\u001f"+
		"\u0000\u0193\u0196\u0001\u0000\u0000\u0000\u0194\u0196\u0001\u0000\u0000"+
		"\u0000\u0195\u0191\u0001\u0000\u0000\u0000\u0195\u0194\u0001\u0000\u0000"+
		"\u0000\u0196=\u0001\u0000\u0000\u0000\u0197\u0198\u0005,\u0000\u0000\u0198"+
		"\u0199\u0003\u00bc^\u0000\u0199\u019a\u0003>\u001f\u0000\u019a\u019d\u0001"+
		"\u0000\u0000\u0000\u019b\u019d\u0001\u0000\u0000\u0000\u019c\u0197\u0001"+
		"\u0000\u0000\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019d?\u0001\u0000"+
		"\u0000\u0000\u019e\u019f\u0003B!\u0000\u019f\u01a0\u0003\u00bc^\u0000"+
		"\u01a0A\u0001\u0000\u0000\u0000\u01a1\u01a2\u0007\u0005\u0000\u0000\u01a2"+
		"C\u0001\u0000\u0000\u0000\u01a3\u01a4\u0003\u0002\u0001\u0000\u01a4\u01a5"+
		"\u0003@ \u0000\u01a5E\u0001\u0000\u0000\u0000\u01a6\u01a7\u0003H$\u0000"+
		"\u01a7\u01a8\u0003\u0002\u0001\u0000\u01a8\u01ae\u0001\u0000\u0000\u0000"+
		"\u01a9\u01aa\u0003J%\u0000\u01aa\u01ab\u0003\u0002\u0001\u0000\u01ab\u01ae"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ae\u0001\u0000\u0000\u0000\u01ad\u01a6"+
		"\u0001\u0000\u0000\u0000\u01ad\u01a9\u0001\u0000\u0000\u0000\u01ad\u01ac"+
		"\u0001\u0000\u0000\u0000\u01aeG\u0001\u0000\u0000\u0000\u01af\u01b0\u0005"+
		"\u0015\u0000\u0000\u01b0\u01b1\u0005+\u0000\u0000\u01b1\u01b2\u0005\u0016"+
		"\u0000\u0000\u01b2\u01b3\u00053\u0000\u0000\u01b3\u01b4\u0005L\u0000\u0000"+
		"\u01b4\u01b5\u00054\u0000\u0000\u01b5I\u0001\u0000\u0000\u0000\u01b6\u01b7"+
		"\u00051\u0000\u0000\u01b7\u01b8\u0005L\u0000\u0000\u01b8\u01b9\u00052"+
		"\u0000\u0000\u01b9K\u0001\u0000\u0000\u0000\u01ba\u01bb\u0003N\'\u0000"+
		"\u01bb\u01bc\u00053\u0000\u0000\u01bc\u01bd\u0003<\u001e\u0000\u01bd\u01be"+
		"\u00054\u0000\u0000\u01beM\u0001\u0000\u0000\u0000\u01bf\u01c2\u0005L"+
		"\u0000\u0000\u01c0\u01c2\u0003\u0004\u0002\u0000\u01c1\u01bf\u0001\u0000"+
		"\u0000\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c2O\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c4\u00051\u0000\u0000\u01c4\u01c5\u0003T*\u0000\u01c5"+
		"\u01c6\u00052\u0000\u0000\u01c6Q\u0001\u0000\u0000\u0000\u01c7\u01c8\u0003"+
		"\u00bc^\u0000\u01c8S\u0001\u0000\u0000\u0000\u01c9\u01ca\u0003R)\u0000"+
		"\u01ca\u01cb\u0003V+\u0000\u01cb\u01ce\u0001\u0000\u0000\u0000\u01cc\u01ce"+
		"\u0001\u0000\u0000\u0000\u01cd\u01c9\u0001\u0000\u0000\u0000\u01cd\u01cc"+
		"\u0001\u0000\u0000\u0000\u01ceU\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005"+
		",\u0000\u0000\u01d0\u01d1\u0003R)\u0000\u01d1\u01d2\u0003V+\u0000\u01d2"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d3\u01d6\u0005,\u0000\u0000\u01d4\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d5\u01cf\u0001\u0000\u0000\u0000\u01d5\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d6W\u0001"+
		"\u0000\u0000\u0000\u01d7\u01d8\u0005/\u0000\u0000\u01d8\u01d9\u0003Z-"+
		"\u0000\u01d9\u01da\u00050\u0000\u0000\u01daY\u0001\u0000\u0000\u0000\u01db"+
		"\u01dc\u0003\\.\u0000\u01dc\u01dd\u0005.\u0000\u0000\u01dd\u01de\u0003"+
		"^/\u0000\u01de\u01df\u0003`0\u0000\u01df[\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e1\u0003\u00bc^\u0000\u01e1]\u0001\u0000\u0000\u0000\u01e2\u01e3\u0003"+
		"\u00bc^\u0000\u01e3_\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005,\u0000"+
		"\u0000\u01e5\u01e6\u0003\\.\u0000\u01e6\u01e7\u0005.\u0000\u0000\u01e7"+
		"\u01e8\u0003^/\u0000\u01e8\u01e9\u0003`0\u0000\u01e9\u01ec\u0001\u0000"+
		"\u0000\u0000\u01ea\u01ec\u0001\u0000\u0000\u0000\u01eb\u01e4\u0001\u0000"+
		"\u0000\u0000\u01eb\u01ea\u0001\u0000\u0000\u0000\u01eca\u0001\u0000\u0000"+
		"\u0000\u01ed\u01f0\u0003f3\u0000\u01ee\u01f0\u0003n7\u0000\u01ef\u01ed"+
		"\u0001\u0000\u0000\u0000\u01ef\u01ee\u0001\u0000\u0000\u0000\u01f0c\u0001"+
		"\u0000\u0000\u0000\u01f1\u01f6\u0003\u008eG\u0000\u01f2\u01f6\u0003\u008c"+
		"F\u0000\u01f3\u01f6\u0003|>\u0000\u01f4\u01f6\u0003\u0082A\u0000\u01f5"+
		"\u01f1\u0001\u0000\u0000\u0000\u01f5\u01f2\u0001\u0000\u0000\u0000\u01f5"+
		"\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000\u01f6"+
		"e\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005\u0017\u0000\u0000\u01f8\u01f9"+
		"\u0003h4\u0000\u01f9\u01fa\u0003j5\u0000\u01fa\u01fb\u0003l6\u0000\u01fb"+
		"\u01fc\u0005\u000e\u0000\u0000\u01fcg\u0001\u0000\u0000\u0000\u01fd\u01fe"+
		"\u0003\u00bc^\u0000\u01fei\u0001\u0000\u0000\u0000\u01ff\u0200\u0003\u0002"+
		"\u0001\u0000\u0200k\u0001\u0000\u0000\u0000\u0201\u0202\u0005\u0018\u0000"+
		"\u0000\u0202\u0203\u0003h4\u0000\u0203\u0204\u0003j5\u0000\u0204\u0205"+
		"\u0003l6\u0000\u0205\u020a\u0001\u0000\u0000\u0000\u0206\u0207\u0005\u0019"+
		"\u0000\u0000\u0207\u020a\u0003j5\u0000\u0208\u020a\u0001\u0000\u0000\u0000"+
		"\u0209\u0201\u0001\u0000\u0000\u0000\u0209\u0206\u0001\u0000\u0000\u0000"+
		"\u0209\u0208\u0001\u0000\u0000\u0000\u020am\u0001\u0000\u0000\u0000\u020b"+
		"\u020c\u0005\u001a\u0000\u0000\u020c\u020d\u00053\u0000\u0000\u020d\u020e"+
		"\u0003\u00bc^\u0000\u020e\u020f\u00054\u0000\u0000\u020f\u0210\u0003p"+
		"8\u0000\u0210\u0211\u0005\u000e\u0000\u0000\u0211o\u0001\u0000\u0000\u0000"+
		"\u0212\u0214\u0003r9\u0000\u0213\u0212\u0001\u0000\u0000\u0000\u0214\u0215"+
		"\u0001\u0000\u0000\u0000\u0215\u0213\u0001\u0000\u0000\u0000\u0215\u0216"+
		"\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0218"+
		"\u0003p8\u0000\u0218\u021c\u0001\u0000\u0000\u0000\u0219\u021c\u0003v"+
		";\u0000\u021a\u021c\u0003x<\u0000\u021b\u0213\u0001\u0000\u0000\u0000"+
		"\u021b\u0219\u0001\u0000\u0000\u0000\u021b\u021a\u0001\u0000\u0000\u0000"+
		"\u021cq\u0001\u0000\u0000\u0000\u021d\u021e\u0005\u001b\u0000\u0000\u021e"+
		"\u021f\u0003t:\u0000\u021f\u0220\u0005.\u0000\u0000\u0220\u0221\u0003"+
		"j5\u0000\u0221\u0222\u0003z=\u0000\u0222s\u0001\u0000\u0000\u0000\u0223"+
		"\u0224\u0003\u00bc^\u0000\u0224u\u0001\u0000\u0000\u0000\u0225\u0226\u0005"+
		"\u001c\u0000\u0000\u0226\u0227\u0005.\u0000\u0000\u0227\u0228\u0003j5"+
		"\u0000\u0228\u0229\u0003z=\u0000\u0229w\u0001\u0000\u0000\u0000\u022a"+
		"\u022b\u0005\u001d\u0000\u0000\u022b\u022c\u0005.\u0000\u0000\u022c\u022d"+
		"\u0003j5\u0000\u022d\u022e\u0003z=\u0000\u022ey\u0001\u0000\u0000\u0000"+
		"\u022f\u0232\u0005\u001e\u0000\u0000\u0230\u0232\u0001\u0000\u0000\u0000"+
		"\u0231\u022f\u0001\u0000\u0000\u0000\u0231\u0230\u0001\u0000\u0000\u0000"+
		"\u0232{\u0001\u0000\u0000\u0000\u0233\u0234\u0005\u001f\u0000\u0000\u0234"+
		"\u0235\u0003\u0090H\u0000\u0235\u0236\u0003~?\u0000\u0236\u0237\u0005"+
		" \u0000\u0000\u0237\u0238\u0003\u00bc^\u0000\u0238\u0239\u0003\u0080@"+
		"\u0000\u0239}\u0001\u0000\u0000\u0000\u023a\u023d\u0001\u0000\u0000\u0000"+
		"\u023b\u023d\u0001\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000\u0000"+
		"\u023c\u023b\u0001\u0000\u0000\u0000\u023d\u007f\u0001\u0000\u0000\u0000"+
		"\u023e\u0241\u0001\u0000\u0000\u0000\u023f\u0241\u0001\u0000\u0000\u0000"+
		"\u0240\u023e\u0001\u0000\u0000\u0000\u0240\u023f\u0001\u0000\u0000\u0000"+
		"\u0241\u0081\u0001\u0000\u0000\u0000\u0242\u0243\u0005!\u0000\u0000\u0243"+
		"\u0244\u0005L\u0000\u0000\u0244\u0245\u0005\"\u0000\u0000\u0245\u0246"+
		"\u00053\u0000\u0000\u0246\u0247\u0003\u0084B\u0000\u0247\u0248\u0003\u0086"+
		"C\u0000\u0248\u0249\u0003\u0088D\u0000\u0249\u024a\u0003\u008aE\u0000"+
		"\u024a\u024b\u0003\u0090H\u0000\u024b\u024c\u0005\u000e\u0000\u0000\u024c"+
		"\u0083\u0001\u0000\u0000\u0000\u024d\u0251\u0005K\u0000\u0000\u024e\u024f"+
		"\u0005=\u0000\u0000\u024f\u0251\u0005K\u0000\u0000\u0250\u024d\u0001\u0000"+
		"\u0000\u0000\u0250\u024e\u0001\u0000\u0000\u0000\u0251\u0085\u0001\u0000"+
		"\u0000\u0000\u0252\u0253\u0005,\u0000\u0000\u0253\u0259\u0005K\u0000\u0000"+
		"\u0254\u0255\u0005,\u0000\u0000\u0255\u0256\u0005=\u0000\u0000\u0256\u0259"+
		"\u0005K\u0000\u0000\u0257\u0259\u0001\u0000\u0000\u0000\u0258\u0252\u0001"+
		"\u0000\u0000\u0000\u0258\u0254\u0001\u0000\u0000\u0000\u0258\u0257\u0001"+
		"\u0000\u0000\u0000\u0259\u0087\u0001\u0000\u0000\u0000\u025a\u025b\u0005"+
		",\u0000\u0000\u025b\u0261\u0005K\u0000\u0000\u025c\u025d\u0005,\u0000"+
		"\u0000\u025d\u025e\u0005=\u0000\u0000\u025e\u0261\u0005K\u0000\u0000\u025f"+
		"\u0261\u0001\u0000\u0000\u0000\u0260\u025a\u0001\u0000\u0000\u0000\u0260"+
		"\u025c\u0001\u0000\u0000\u0000\u0260\u025f\u0001\u0000\u0000\u0000\u0261"+
		"\u0089\u0001\u0000\u0000\u0000\u0262\u0263\u00054\u0000\u0000\u0263\u008b"+
		"\u0001\u0000\u0000\u0000\u0264\u0265\u0005#\u0000\u0000\u0265\u0266\u0003"+
		"\u00bc^\u0000\u0266\u0267\u0003\u0090H\u0000\u0267\u0268\u0005\u000e\u0000"+
		"\u0000\u0268\u008d\u0001\u0000\u0000\u0000\u0269\u026a\u0005$\u0000\u0000"+
		"\u026a\u026b\u00053\u0000\u0000\u026b\u026c\u0003\u0092I\u0000\u026c\u026d"+
		"\u00054\u0000\u0000\u026d\u026e\u0003\u0090H\u0000\u026e\u026f\u0005\u000e"+
		"\u0000\u0000\u026f\u008f\u0001\u0000\u0000\u0000\u0270\u0273\u0003\u0002"+
		"\u0001\u0000\u0271\u0273\u0001\u0000\u0000\u0000\u0272\u0270\u0001\u0000"+
		"\u0000\u0000\u0272\u0271\u0001\u0000\u0000\u0000\u0273\u0091\u0001\u0000"+
		"\u0000\u0000\u0274\u0275\u0003\u0094J\u0000\u0275\u0276\u0005-\u0000\u0000"+
		"\u0276\u0277\u0003\u009cN\u0000\u0277\u027a\u0005-\u0000\u0000\u0278\u027b"+
		"\u0003\u0094J\u0000\u0279\u027b\u0003\u009aM\u0000\u027a\u0278\u0001\u0000"+
		"\u0000\u0000\u027a\u0279\u0001\u0000\u0000\u0000\u027b\u0093\u0001\u0000"+
		"\u0000\u0000\u027c\u027d\u0005L\u0000\u0000\u027d\u027e\u0003\u0098L\u0000"+
		"\u027e\u027f\u0003\u009cN\u0000\u027f\u0285\u0001\u0000\u0000\u0000\u0280"+
		"\u0281\u0005L\u0000\u0000\u0281\u0282\u0003\u0096K\u0000\u0282\u0283\u0003"+
		"\u009cN\u0000\u0283\u0285\u0001\u0000\u0000\u0000\u0284\u027c\u0001\u0000"+
		"\u0000\u0000\u0284\u0280\u0001\u0000\u0000\u0000\u0285\u0095\u0001\u0000"+
		"\u0000\u0000\u0286\u0287\u0005,\u0000\u0000\u0287\u0288\u0005L\u0000\u0000"+
		"\u0288\u0289\u0003\n\u0005\u0000\u0289\u028a\u0003\u00bc^\u0000\u028a"+
		"\u028b\u0005,\u0000\u0000\u028b\u028e\u0001\u0000\u0000\u0000\u028c\u028e"+
		"\u0005I\u0000\u0000\u028d\u0286\u0001\u0000\u0000\u0000\u028d\u028c\u0001"+
		"\u0000\u0000\u0000\u028e\u0097\u0001\u0000\u0000\u0000\u028f\u0290\u0007"+
		"\u0000\u0000\u0000\u0290\u0099\u0001\u0000\u0000\u0000\u0291\u0292\u0005"+
		"L\u0000\u0000\u0292\u0293\u0007\u0001\u0000\u0000\u0293\u009b\u0001\u0000"+
		"\u0000\u0000\u0294\u0295\u0003\u00a0P\u0000\u0295\u0296\u0003\u009eO\u0000"+
		"\u0296\u009d\u0001\u0000\u0000\u0000\u0297\u0298\u0005)\u0000\u0000\u0298"+
		"\u0299\u0003\u00a0P\u0000\u0299\u029a\u0003\u009eO\u0000\u029a\u029d\u0001"+
		"\u0000\u0000\u0000\u029b\u029d\u0001\u0000\u0000\u0000\u029c\u0297\u0001"+
		"\u0000\u0000\u0000\u029c\u029b\u0001\u0000\u0000\u0000\u029d\u009f\u0001"+
		"\u0000\u0000\u0000\u029e\u029f\u0003\u00a6S\u0000\u029f\u02a0\u0003\u00a2"+
		"Q\u0000\u02a0\u00a1\u0001\u0000\u0000\u0000\u02a1\u02a2\u0005(\u0000\u0000"+
		"\u02a2\u02a3\u0003\u00a6S\u0000\u02a3\u02a4\u0003\u00a2Q\u0000\u02a4\u02a7"+
		"\u0001\u0000\u0000\u0000\u02a5\u02a7\u0001\u0000\u0000\u0000\u02a6\u02a1"+
		"\u0001\u0000\u0000\u0000\u02a6\u02a5\u0001\u0000\u0000\u0000\u02a7\u00a3"+
		"\u0001\u0000\u0000\u0000\u02a8\u02a9\u0007\u0006\u0000\u0000\u02a9\u00a5"+
		"\u0001\u0000\u0000\u0000\u02aa\u02ab\u0003\u00a8T\u0000\u02ab\u02af\u0003"+
		"\u00a4R\u0000\u02ac\u02b0\u0005K\u0000\u0000\u02ad\u02b0\u0005L\u0000"+
		"\u0000\u02ae\u02b0\u0003F#\u0000\u02af\u02ac\u0001\u0000\u0000\u0000\u02af"+
		"\u02ad\u0001\u0000\u0000\u0000\u02af\u02ae\u0001\u0000\u0000\u0000\u02b0"+
		"\u02b3\u0001\u0000\u0000\u0000\u02b1\u02b3\u0003\u00a8T\u0000\u02b2\u02aa"+
		"\u0001\u0000\u0000\u0000\u02b2\u02b1\u0001\u0000\u0000\u0000\u02b3\u00a7"+
		"\u0001\u0000\u0000\u0000\u02b4\u02ba\u0003\u00acV\u0000\u02b5\u02b6\u0003"+
		"\u00aaU\u0000\u02b6\u02b7\u0003\u00acV\u0000\u02b7\u02b9\u0001\u0000\u0000"+
		"\u0000\u02b8\u02b5\u0001\u0000\u0000\u0000\u02b9\u02bc\u0001\u0000\u0000"+
		"\u0000\u02ba\u02b8\u0001\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000"+
		"\u0000\u02bb\u00a9\u0001\u0000\u0000\u0000\u02bc\u02ba\u0001\u0000\u0000"+
		"\u0000\u02bd\u02be\u0005*\u0000\u0000\u02be\u00ab\u0001\u0000\u0000\u0000"+
		"\u02bf\u02c5\u0003\u00b0X\u0000\u02c0\u02c1\u0003\u00aeW\u0000\u02c1\u02c2"+
		"\u0003\u00b0X\u0000\u02c2\u02c4\u0001\u0000\u0000\u0000\u02c3\u02c0\u0001"+
		"\u0000\u0000\u0000\u02c4\u02c7\u0001\u0000\u0000\u0000\u02c5\u02c3\u0001"+
		"\u0000\u0000\u0000\u02c5\u02c6\u0001\u0000\u0000\u0000\u02c6\u00ad\u0001"+
		"\u0000\u0000\u0000\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c8\u02c9\u0007"+
		"\u0007\u0000\u0000\u02c9\u00af\u0001\u0000\u0000\u0000\u02ca\u02d0\u0003"+
		"\u00b4Z\u0000\u02cb\u02cc\u0003\u00b2Y\u0000\u02cc\u02cd\u0003\u00b4Z"+
		"\u0000\u02cd\u02cf\u0001\u0000\u0000\u0000\u02ce\u02cb\u0001\u0000\u0000"+
		"\u0000\u02cf\u02d2\u0001\u0000\u0000\u0000\u02d0\u02ce\u0001\u0000\u0000"+
		"\u0000\u02d0\u02d1\u0001\u0000\u0000\u0000\u02d1\u00b1\u0001\u0000\u0000"+
		"\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d3\u02d4\u0007\b\u0000\u0000"+
		"\u02d4\u00b3\u0001\u0000\u0000\u0000\u02d5\u02db\u0003\u00b8\\\u0000\u02d6"+
		"\u02d7\u0003\u00b6[\u0000\u02d7\u02d8\u0003\u00b8\\\u0000\u02d8\u02da"+
		"\u0001\u0000\u0000\u0000\u02d9\u02d6\u0001\u0000\u0000\u0000\u02da\u02dd"+
		"\u0001\u0000\u0000\u0000\u02db\u02d9\u0001\u0000\u0000\u0000\u02db\u02dc"+
		"\u0001\u0000\u0000\u0000\u02dc\u00b5\u0001\u0000\u0000\u0000\u02dd\u02db"+
		"\u0001\u0000\u0000\u0000\u02de\u02df\u0005@\u0000\u0000\u02df\u00b7\u0001"+
		"\u0000\u0000\u0000\u02e0\u02e1\u0003\u00dcn\u0000\u02e1\u02e2\u0003\u00ba"+
		"]\u0000\u02e2\u00b9\u0001\u0000\u0000\u0000\u02e3\u02e7\u0005K\u0000\u0000"+
		"\u02e4\u02e6\u0003J%\u0000\u02e5\u02e4\u0001\u0000\u0000\u0000\u02e6\u02e9"+
		"\u0001\u0000\u0000\u0000\u02e7\u02e5\u0001\u0000\u0000\u0000\u02e7\u02e8"+
		"\u0001\u0000\u0000\u0000\u02e8\u02f8\u0001\u0000\u0000\u0000\u02e9\u02e7"+
		"\u0001\u0000\u0000\u0000\u02ea\u02ee\u0005L\u0000\u0000\u02eb\u02ed\u0003"+
		"J%\u0000\u02ec\u02eb\u0001\u0000\u0000\u0000\u02ed\u02f0\u0001\u0000\u0000"+
		"\u0000\u02ee\u02ec\u0001\u0000\u0000\u0000\u02ee\u02ef\u0001\u0000\u0000"+
		"\u0000\u02ef\u02f8\u0001\u0000\u0000\u0000\u02f0\u02ee\u0001\u0000\u0000"+
		"\u0000\u02f1\u02f2\u00053\u0000\u0000\u02f2\u02f3\u0003\u009cN\u0000\u02f3"+
		"\u02f4\u00054\u0000\u0000\u02f4\u02f8\u0001\u0000\u0000\u0000\u02f5\u02f8"+
		"\u0005\'\u0000\u0000\u02f6\u02f8\u0001\u0000\u0000\u0000\u02f7\u02e3\u0001"+
		"\u0000\u0000\u0000\u02f7\u02ea\u0001\u0000\u0000\u0000\u02f7\u02f1\u0001"+
		"\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000\u0000\u0000\u02f7\u02f6\u0001"+
		"\u0000\u0000\u0000\u02f8\u00bb\u0001\u0000\u0000\u0000\u02f9\u02fa\u0003"+
		"\u00c0`\u0000\u02fa\u02fb\u0003\u00be_\u0000\u02fb\u00bd\u0001\u0000\u0000"+
		"\u0000\u02fc\u02fd\u0005)\u0000\u0000\u02fd\u02fe\u0003\u00c0`\u0000\u02fe"+
		"\u02ff\u0003\u00be_\u0000\u02ff\u0302\u0001\u0000\u0000\u0000\u0300\u0302"+
		"\u0001\u0000\u0000\u0000\u0301\u02fc\u0001\u0000\u0000\u0000\u0301\u0300"+
		"\u0001\u0000\u0000\u0000\u0302\u00bf\u0001\u0000\u0000\u0000\u0303\u0304"+
		"\u0003\u00c6c\u0000\u0304\u0305\u0003\u00c2a\u0000\u0305\u00c1\u0001\u0000"+
		"\u0000\u0000\u0306\u0307\u0005(\u0000\u0000\u0307\u0308\u0003\u00c6c\u0000"+
		"\u0308\u0309\u0003\u00c2a\u0000\u0309\u030c\u0001\u0000\u0000\u0000\u030a"+
		"\u030c\u0001\u0000\u0000\u0000\u030b\u0306\u0001\u0000\u0000\u0000\u030b"+
		"\u030a\u0001\u0000\u0000\u0000\u030c\u00c3\u0001\u0000\u0000\u0000\u030d"+
		"\u030e\u0007\t\u0000\u0000\u030e\u00c5\u0001\u0000\u0000\u0000\u030f\u0310"+
		"\u0003\u00c8d\u0000\u0310\u0313\u0003\u00c4b\u0000\u0311\u0314\u0003\u00c8"+
		"d\u0000\u0312\u0314\u0003F#\u0000\u0313\u0311\u0001\u0000\u0000\u0000"+
		"\u0313\u0312\u0001\u0000\u0000\u0000\u0314\u0317\u0001\u0000\u0000\u0000"+
		"\u0315\u0317\u0003\u00c8d\u0000\u0316\u030f\u0001\u0000\u0000\u0000\u0316"+
		"\u0315\u0001\u0000\u0000\u0000\u0317\u00c7\u0001\u0000\u0000\u0000\u0318"+
		"\u031e\u0003\u00ccf\u0000\u0319\u031a\u0003\u00cae\u0000\u031a\u031b\u0003"+
		"\u00ccf\u0000\u031b\u031d\u0001\u0000\u0000\u0000\u031c\u0319\u0001\u0000"+
		"\u0000\u0000\u031d\u0320\u0001\u0000\u0000\u0000\u031e\u031c\u0001\u0000"+
		"\u0000\u0000\u031e\u031f\u0001\u0000\u0000\u0000\u031f\u00c9\u0001\u0000"+
		"\u0000\u0000\u0320\u031e\u0001\u0000\u0000\u0000\u0321\u0322\u0005*\u0000"+
		"\u0000\u0322\u00cb\u0001\u0000\u0000\u0000\u0323\u0329\u0003\u00d0h\u0000"+
		"\u0324\u0325\u0003\u00ceg\u0000\u0325\u0326\u0003\u00d0h\u0000\u0326\u0328"+
		"\u0001\u0000\u0000\u0000\u0327\u0324\u0001\u0000\u0000\u0000\u0328\u032b"+
		"\u0001\u0000\u0000\u0000\u0329\u0327\u0001\u0000\u0000\u0000\u0329\u032a"+
		"\u0001\u0000\u0000\u0000\u032a\u00cd\u0001\u0000\u0000\u0000\u032b\u0329"+
		"\u0001\u0000\u0000\u0000\u032c\u032d\u0007\u0007\u0000\u0000\u032d\u00cf"+
		"\u0001\u0000\u0000\u0000\u032e\u0334\u0003\u00d4j\u0000\u032f\u0330\u0003"+
		"\u00d2i\u0000\u0330\u0331\u0003\u00d4j\u0000\u0331\u0333\u0001\u0000\u0000"+
		"\u0000\u0332\u032f\u0001\u0000\u0000\u0000\u0333\u0336\u0001\u0000\u0000"+
		"\u0000\u0334\u0332\u0001\u0000\u0000\u0000\u0334\u0335\u0001\u0000\u0000"+
		"\u0000\u0335\u00d1\u0001\u0000\u0000\u0000\u0336\u0334\u0001\u0000\u0000"+
		"\u0000\u0337\u0338\u0007\b\u0000\u0000\u0338\u00d3\u0001\u0000\u0000\u0000"+
		"\u0339\u033f\u0003\u00d8l\u0000\u033a\u033b\u0003\u00d6k\u0000\u033b\u033c"+
		"\u0003\u00d8l\u0000\u033c\u033e\u0001\u0000\u0000\u0000\u033d\u033a\u0001"+
		"\u0000\u0000\u0000\u033e\u0341\u0001\u0000\u0000\u0000\u033f\u033d\u0001"+
		"\u0000\u0000\u0000\u033f\u0340\u0001\u0000\u0000\u0000\u0340\u00d5\u0001"+
		"\u0000\u0000\u0000\u0341\u033f\u0001\u0000\u0000\u0000\u0342\u0343\u0005"+
		"@\u0000\u0000\u0343\u00d7\u0001\u0000\u0000\u0000\u0344\u0345\u0003\u00dc"+
		"n\u0000\u0345\u0346\u0003\u00dam\u0000\u0346\u00d9\u0001\u0000\u0000\u0000"+
		"\u0347\u034b\u0005K\u0000\u0000\u0348\u034a\u0003J%\u0000\u0349\u0348"+
		"\u0001\u0000\u0000\u0000\u034a\u034d\u0001\u0000\u0000\u0000\u034b\u0349"+
		"\u0001\u0000\u0000\u0000\u034b\u034c\u0001\u0000\u0000\u0000\u034c\u0365"+
		"\u0001\u0000\u0000\u0000\u034d\u034b\u0001\u0000\u0000\u0000\u034e\u0352"+
		"\u0005L\u0000\u0000\u034f\u0351\u0003J%\u0000\u0350\u034f\u0001\u0000"+
		"\u0000\u0000\u0351\u0354\u0001\u0000\u0000\u0000\u0352\u0350\u0001\u0000"+
		"\u0000\u0000\u0352\u0353\u0001\u0000\u0000\u0000\u0353\u0365\u0001\u0000"+
		"\u0000\u0000\u0354\u0352\u0001\u0000\u0000\u0000\u0355\u0356\u00053\u0000"+
		"\u0000\u0356\u0357\u0003\u00bc^\u0000\u0357\u0358\u00054\u0000\u0000\u0358"+
		"\u0365\u0001\u0000\u0000\u0000\u0359\u0365\u0005\'\u0000\u0000\u035a\u0365"+
		"\u0003(\u0014\u0000\u035b\u0365\u0003&\u0013\u0000\u035c\u0365\u0003\u001e"+
		"\u000f\u0000\u035d\u0365\u0003P(\u0000\u035e\u0365\u0003L&\u0000\u035f"+
		"\u0365\u00034\u001a\u0000\u0360\u0365\u0003*\u0015\u0000\u0361\u0365\u0005"+
		"%\u0000\u0000\u0362\u0365\u0005&\u0000\u0000\u0363\u0365\u0003X,\u0000"+
		"\u0364\u0347\u0001\u0000\u0000\u0000\u0364\u034e\u0001\u0000\u0000\u0000"+
		"\u0364\u0355\u0001\u0000\u0000\u0000\u0364\u0359\u0001\u0000\u0000\u0000"+
		"\u0364\u035a\u0001\u0000\u0000\u0000\u0364\u035b\u0001\u0000\u0000\u0000"+
		"\u0364\u035c\u0001\u0000\u0000\u0000\u0364\u035d\u0001\u0000\u0000\u0000"+
		"\u0364\u035e\u0001\u0000\u0000\u0000\u0364\u035f\u0001\u0000\u0000\u0000"+
		"\u0364\u0360\u0001\u0000\u0000\u0000\u0364\u0361\u0001\u0000\u0000\u0000"+
		"\u0364\u0362\u0001\u0000\u0000\u0000\u0364\u0363\u0001\u0000\u0000\u0000"+
		"\u0365\u00db\u0001\u0000\u0000\u0000\u0366\u036a\u0003\u00e0p\u0000\u0367"+
		"\u036a\u0003\u00e2q\u0000\u0368\u036a\u0003\u00deo\u0000\u0369\u0366\u0001"+
		"\u0000\u0000\u0000\u0369\u0367\u0001\u0000\u0000\u0000\u0369\u0368\u0001"+
		"\u0000\u0000\u0000\u036a\u036d\u0001\u0000\u0000\u0000\u036b\u0369\u0001"+
		"\u0000\u0000\u0000\u036b\u036c\u0001\u0000\u0000\u0000\u036c\u00dd\u0001"+
		"\u0000\u0000\u0000\u036d\u036b\u0001\u0000\u0000\u0000\u036e\u036f\u0005"+
		"J\u0000\u0000\u036f\u00df\u0001\u0000\u0000\u0000\u0370\u0371\u0005=\u0000"+
		"\u0000\u0371\u00e1\u0001\u0000\u0000\u0000\u0372\u0373\u0005<\u0000\u0000"+
		"\u0373\u00e3\u0001\u0000\u0000\u0000:\u00fd\u0103\u0117\u011b\u0124\u012d"+
		"\u0142\u0146\u014b\u0176\u017f\u0189\u0195\u019c\u01ad\u01c1\u01cd\u01d5"+
		"\u01eb\u01ef\u01f5\u0209\u0215\u021b\u0231\u023c\u0240\u0250\u0258\u0260"+
		"\u0272\u027a\u0284\u028d\u029c\u02a6\u02af\u02b2\u02ba\u02c5\u02d0\u02db"+
		"\u02e7\u02ee\u02f7\u0301\u030b\u0313\u0316\u031e\u0329\u0334\u033f\u034b"+
		"\u0352\u0364\u0369\u036b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}