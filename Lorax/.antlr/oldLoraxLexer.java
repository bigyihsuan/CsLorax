// Generated from d:\Programming\GithubRepos\CsLorax\Lorax\oldLorax.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class oldLoraxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, NULL=2, LITERAL_INTEGER=3, LITERAL_FLOAT=4, LITERAL_STRING=5, 
		LITERAL_BOOLEAN=6, IDENTIFIER=7, PERIOD=8, LEFT_CHILD=9, RIGHT_CHILD=10, 
		PARENT=11, VALUE=12, LEFT_BRACKET=13, RIGHT_BRACKET=14, COMMA=15, SINGLE_QUOTE=16, 
		DOUBLE_QUOTE=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHITESPACE", "NULL", "LITERAL_INTEGER", "LITERAL_FLOAT", "LITERAL_STRING", 
			"LITERAL_BOOLEAN", "IDENTIFIER", "PERIOD", "LEFT_CHILD", "RIGHT_CHILD", 
			"PARENT", "VALUE", "LEFT_BRACKET", "RIGHT_BRACKET", "COMMA", "SINGLE_QUOTE", 
			"DOUBLE_QUOTE", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'NULL'", null, null, null, null, null, "'.'", "'/'", "'\\'", 
			"'^'", "'$'", "'['", "']'", "','", "'''", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITESPACE", "NULL", "LITERAL_INTEGER", "LITERAL_FLOAT", "LITERAL_STRING", 
			"LITERAL_BOOLEAN", "IDENTIFIER", "PERIOD", "LEFT_CHILD", "RIGHT_CHILD", 
			"PARENT", "VALUE", "LEFT_BRACKET", "RIGHT_BRACKET", "COMMA", "SINGLE_QUOTE", 
			"DOUBLE_QUOTE"
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


	public oldLoraxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "oldLorax.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23h\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\6\4\62\n\4\r\4\16\4"+
		"\63\3\5\3\5\3\5\3\5\3\6\3\6\7\6<\n\6\f\6\16\6?\13\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7L\n\7\3\b\6\bO\n\b\r\b\16\bP\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3=\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\2\3\2\5\5\2\13\f\17\17\"\""+
		"\4\2C\\c|\3\2\62;\2j\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\3\'\3\2\2\2\5+\3\2\2\2\7\61\3\2\2\2\t\65\3\2"+
		"\2\2\139\3\2\2\2\rK\3\2\2\2\17N\3\2\2\2\21R\3\2\2\2\23T\3\2\2\2\25V\3"+
		"\2\2\2\27X\3\2\2\2\31Z\3\2\2\2\33\\\3\2\2\2\35^\3\2\2\2\37`\3\2\2\2!b"+
		"\3\2\2\2#d\3\2\2\2%f\3\2\2\2\'(\t\2\2\2()\3\2\2\2)*\b\2\2\2*\4\3\2\2\2"+
		"+,\7P\2\2,-\7W\2\2-.\7N\2\2./\7N\2\2/\6\3\2\2\2\60\62\5%\23\2\61\60\3"+
		"\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\b\3\2\2\2\65\66\5"+
		"\7\4\2\66\67\5\21\t\2\678\5\7\4\28\n\3\2\2\29=\5#\22\2:<\13\2\2\2;:\3"+
		"\2\2\2<?\3\2\2\2=>\3\2\2\2=;\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\5#\22\2A\f"+
		"\3\2\2\2BC\7v\2\2CD\7t\2\2DE\7w\2\2EL\7g\2\2FG\7h\2\2GH\7c\2\2HI\7n\2"+
		"\2IJ\7u\2\2JL\7g\2\2KB\3\2\2\2KF\3\2\2\2L\16\3\2\2\2MO\t\3\2\2NM\3\2\2"+
		"\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\20\3\2\2\2RS\7\60\2\2S\22\3\2\2\2TU"+
		"\7\61\2\2U\24\3\2\2\2VW\7^\2\2W\26\3\2\2\2XY\7`\2\2Y\30\3\2\2\2Z[\7&\2"+
		"\2[\32\3\2\2\2\\]\7]\2\2]\34\3\2\2\2^_\7_\2\2_\36\3\2\2\2`a\7.\2\2a \3"+
		"\2\2\2bc\7)\2\2c\"\3\2\2\2de\7$\2\2e$\3\2\2\2fg\t\4\2\2g&\3\2\2\2\7\2"+
		"\63=KP\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}