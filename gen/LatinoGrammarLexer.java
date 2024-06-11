// Generated from /home/carlos/languages/Traductor/grammar/LatinoGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LatinoGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, TKN_AND=4, TKN_OR=5, TKN_CONCAT=6, TKN_PERIOD=7, 
		TKN_COMMA=8, TKN_SEMICOLON=9, TKN_COLON=10, TKN_OPENING_KEY=11, TKN_CLOSING_KEY=12, 
		TKN_OPENING_BRA=13, TKN_CLOSING_BRA=14, TKN_OPENING_PAR=15, TKN_CLOSING_PAR=16, 
		TKN_INCREMENT=17, TKN_DECREMENT=18, TKN_MOD_ASSIGN=19, TKN_DIV_ASSIGN=20, 
		TKN_TIMES_ASSIGN=21, TKN_MINUS_ASSIGN=22, TKN_PLUS_ASSIGN=23, TKN_PLUS=24, 
		TKN_MINUS=25, TKN_TIMES=26, TKN_DIV=27, TKN_POWER=28, TKN_MOD=29, TKN_EQUAL=30, 
		TKN_NEQ=31, TKN_LEQ=32, TKN_GEQ=33, TKN_GREATER=34, TKN_LESS=35, TKN_REGEX=36, 
		TKN_ASSIGN=37, TKN_NOT=38, NUM=39, ID=40, ESPACIO=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "TKN_AND", "TKN_OR", "TKN_CONCAT", "TKN_PERIOD", 
			"TKN_COMMA", "TKN_SEMICOLON", "TKN_COLON", "TKN_OPENING_KEY", "TKN_CLOSING_KEY", 
			"TKN_OPENING_BRA", "TKN_CLOSING_BRA", "TKN_OPENING_PAR", "TKN_CLOSING_PAR", 
			"TKN_INCREMENT", "TKN_DECREMENT", "TKN_MOD_ASSIGN", "TKN_DIV_ASSIGN", 
			"TKN_TIMES_ASSIGN", "TKN_MINUS_ASSIGN", "TKN_PLUS_ASSIGN", "TKN_PLUS", 
			"TKN_MINUS", "TKN_TIMES", "TKN_DIV", "TKN_POWER", "TKN_MOD", "TKN_EQUAL", 
			"TKN_NEQ", "TKN_LEQ", "TKN_GEQ", "TKN_GREATER", "TKN_LESS", "TKN_REGEX", 
			"TKN_ASSIGN", "TKN_NOT", "NUM", "ID", "DIGIT", "ESPACIO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'escribir'", "'imprimir'", "'poner'", "'&&'", "'||'", "'..'", 
			"'.'", "','", "';'", "':'", "'{'", "'}'", "'['", "']'", "'('", "')'", 
			"'++'", "'--'", "'%='", "'/='", "'*='", "'-='", "'+='", "'+'", "'-'", 
			"'*'", "'/'", "'^'", "'%'", "'=='", "'!='", "'<='", "'>='", "'>'", "'<'", 
			"'~='", "'='", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "TKN_AND", "TKN_OR", "TKN_CONCAT", "TKN_PERIOD", 
			"TKN_COMMA", "TKN_SEMICOLON", "TKN_COLON", "TKN_OPENING_KEY", "TKN_CLOSING_KEY", 
			"TKN_OPENING_BRA", "TKN_CLOSING_BRA", "TKN_OPENING_PAR", "TKN_CLOSING_PAR", 
			"TKN_INCREMENT", "TKN_DECREMENT", "TKN_MOD_ASSIGN", "TKN_DIV_ASSIGN", 
			"TKN_TIMES_ASSIGN", "TKN_MINUS_ASSIGN", "TKN_PLUS_ASSIGN", "TKN_PLUS", 
			"TKN_MINUS", "TKN_TIMES", "TKN_DIV", "TKN_POWER", "TKN_MOD", "TKN_EQUAL", 
			"TKN_NEQ", "TKN_LEQ", "TKN_GEQ", "TKN_GREATER", "TKN_LESS", "TKN_REGEX", 
			"TKN_ASSIGN", "TKN_NOT", "NUM", "ID", "ESPACIO"
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


	public LatinoGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LatinoGrammar.g4"; }

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
		"\u0004\u0000)\u00df\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001%\u0001%\u0001&\u0004&\u00c4\b&\u000b&\f&\u00c5\u0001&\u0001"+
		"&\u0004&\u00ca\b&\u000b&\f&\u00cb\u0003&\u00ce\b&\u0001\'\u0001\'\u0005"+
		"\'\u00d2\b\'\n\'\f\'\u00d5\t\'\u0001(\u0001(\u0001)\u0004)\u00da\b)\u000b"+
		")\f)\u00db\u0001)\u0001)\u0000\u0000*\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c"+
		"9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q\u0000S)\u0001\u0000\u0004\u0003"+
		"\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\t\n\r\r  \u00e2"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K"+
		"\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000"+
		"\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0001U\u0001\u0000\u0000\u0000"+
		"\u0003^\u0001\u0000\u0000\u0000\u0005g\u0001\u0000\u0000\u0000\u0007m"+
		"\u0001\u0000\u0000\u0000\tp\u0001\u0000\u0000\u0000\u000bs\u0001\u0000"+
		"\u0000\u0000\rv\u0001\u0000\u0000\u0000\u000fx\u0001\u0000\u0000\u0000"+
		"\u0011z\u0001\u0000\u0000\u0000\u0013|\u0001\u0000\u0000\u0000\u0015~"+
		"\u0001\u0000\u0000\u0000\u0017\u0080\u0001\u0000\u0000\u0000\u0019\u0082"+
		"\u0001\u0000\u0000\u0000\u001b\u0084\u0001\u0000\u0000\u0000\u001d\u0086"+
		"\u0001\u0000\u0000\u0000\u001f\u0088\u0001\u0000\u0000\u0000!\u008a\u0001"+
		"\u0000\u0000\u0000#\u008d\u0001\u0000\u0000\u0000%\u0090\u0001\u0000\u0000"+
		"\u0000\'\u0093\u0001\u0000\u0000\u0000)\u0096\u0001\u0000\u0000\u0000"+
		"+\u0099\u0001\u0000\u0000\u0000-\u009c\u0001\u0000\u0000\u0000/\u009f"+
		"\u0001\u0000\u0000\u00001\u00a1\u0001\u0000\u0000\u00003\u00a3\u0001\u0000"+
		"\u0000\u00005\u00a5\u0001\u0000\u0000\u00007\u00a7\u0001\u0000\u0000\u0000"+
		"9\u00a9\u0001\u0000\u0000\u0000;\u00ab\u0001\u0000\u0000\u0000=\u00ae"+
		"\u0001\u0000\u0000\u0000?\u00b1\u0001\u0000\u0000\u0000A\u00b4\u0001\u0000"+
		"\u0000\u0000C\u00b7\u0001\u0000\u0000\u0000E\u00b9\u0001\u0000\u0000\u0000"+
		"G\u00bb\u0001\u0000\u0000\u0000I\u00be\u0001\u0000\u0000\u0000K\u00c0"+
		"\u0001\u0000\u0000\u0000M\u00c3\u0001\u0000\u0000\u0000O\u00cf\u0001\u0000"+
		"\u0000\u0000Q\u00d6\u0001\u0000\u0000\u0000S\u00d9\u0001\u0000\u0000\u0000"+
		"UV\u0005e\u0000\u0000VW\u0005s\u0000\u0000WX\u0005c\u0000\u0000XY\u0005"+
		"r\u0000\u0000YZ\u0005i\u0000\u0000Z[\u0005b\u0000\u0000[\\\u0005i\u0000"+
		"\u0000\\]\u0005r\u0000\u0000]\u0002\u0001\u0000\u0000\u0000^_\u0005i\u0000"+
		"\u0000_`\u0005m\u0000\u0000`a\u0005p\u0000\u0000ab\u0005r\u0000\u0000"+
		"bc\u0005i\u0000\u0000cd\u0005m\u0000\u0000de\u0005i\u0000\u0000ef\u0005"+
		"r\u0000\u0000f\u0004\u0001\u0000\u0000\u0000gh\u0005p\u0000\u0000hi\u0005"+
		"o\u0000\u0000ij\u0005n\u0000\u0000jk\u0005e\u0000\u0000kl\u0005r\u0000"+
		"\u0000l\u0006\u0001\u0000\u0000\u0000mn\u0005&\u0000\u0000no\u0005&\u0000"+
		"\u0000o\b\u0001\u0000\u0000\u0000pq\u0005|\u0000\u0000qr\u0005|\u0000"+
		"\u0000r\n\u0001\u0000\u0000\u0000st\u0005.\u0000\u0000tu\u0005.\u0000"+
		"\u0000u\f\u0001\u0000\u0000\u0000vw\u0005.\u0000\u0000w\u000e\u0001\u0000"+
		"\u0000\u0000xy\u0005,\u0000\u0000y\u0010\u0001\u0000\u0000\u0000z{\u0005"+
		";\u0000\u0000{\u0012\u0001\u0000\u0000\u0000|}\u0005:\u0000\u0000}\u0014"+
		"\u0001\u0000\u0000\u0000~\u007f\u0005{\u0000\u0000\u007f\u0016\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005}\u0000\u0000\u0081\u0018\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0005[\u0000\u0000\u0083\u001a\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005]\u0000\u0000\u0085\u001c\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005(\u0000\u0000\u0087\u001e\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0005)\u0000\u0000\u0089 \u0001\u0000\u0000\u0000\u008a\u008b\u0005+"+
		"\u0000\u0000\u008b\u008c\u0005+\u0000\u0000\u008c\"\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0005-\u0000\u0000\u008e\u008f\u0005-\u0000\u0000\u008f"+
		"$\u0001\u0000\u0000\u0000\u0090\u0091\u0005%\u0000\u0000\u0091\u0092\u0005"+
		"=\u0000\u0000\u0092&\u0001\u0000\u0000\u0000\u0093\u0094\u0005/\u0000"+
		"\u0000\u0094\u0095\u0005=\u0000\u0000\u0095(\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0005*\u0000\u0000\u0097\u0098\u0005=\u0000\u0000\u0098*\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0005-\u0000\u0000\u009a\u009b\u0005=\u0000"+
		"\u0000\u009b,\u0001\u0000\u0000\u0000\u009c\u009d\u0005+\u0000\u0000\u009d"+
		"\u009e\u0005=\u0000\u0000\u009e.\u0001\u0000\u0000\u0000\u009f\u00a0\u0005"+
		"+\u0000\u0000\u00a00\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005-\u0000"+
		"\u0000\u00a22\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005*\u0000\u0000\u00a4"+
		"4\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005/\u0000\u0000\u00a66\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0005^\u0000\u0000\u00a88\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0005%\u0000\u0000\u00aa:\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0005=\u0000\u0000\u00ac\u00ad\u0005=\u0000\u0000\u00ad<\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0005!\u0000\u0000\u00af\u00b0\u0005=\u0000"+
		"\u0000\u00b0>\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005<\u0000\u0000\u00b2"+
		"\u00b3\u0005=\u0000\u0000\u00b3@\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005"+
		">\u0000\u0000\u00b5\u00b6\u0005=\u0000\u0000\u00b6B\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0005>\u0000\u0000\u00b8D\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0005<\u0000\u0000\u00baF\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005"+
		"~\u0000\u0000\u00bc\u00bd\u0005=\u0000\u0000\u00bdH\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0005=\u0000\u0000\u00bfJ\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0005!\u0000\u0000\u00c1L\u0001\u0000\u0000\u0000\u00c2\u00c4\u0003"+
		"Q(\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c6\u00cd\u0001\u0000\u0000\u0000\u00c7\u00c9\u0005.\u0000\u0000"+
		"\u00c8\u00ca\u0003Q(\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd\u00c7"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ceN\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d3\u0007\u0000\u0000\u0000\u00d0\u00d2\u0007"+
		"\u0001\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d4P\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0007\u0002\u0000\u0000\u00d7R\u0001\u0000\u0000"+
		"\u0000\u00d8\u00da\u0007\u0003\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0006)\u0000\u0000\u00deT\u0001\u0000\u0000\u0000\u0006"+
		"\u0000\u00c5\u00cb\u00cd\u00d3\u00db\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}