// Generated from d:\Programming\GithubRepos\CsLorax\Lorax\Lorax.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LoraxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T_NULL=8, T_BOOL=9, 
		T_TRUE=10, T_FALSE=11, IDENTIFIER=12, INTEGER=13, FLOAT=14, STRING=15, 
		TREE_ACCESS_LEFT=16, TREE_ACCESS_RIGHT=17, TREE_ACCESS_PARENT=18, TREE_ACCESS_VALUE=19, 
		WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T_NULL", "T_BOOL", 
			"T_TRUE", "T_FALSE", "IDENTIFIER", "INTEGER", "FLOAT", "STRING", "TREE_ACCESS_LEFT", 
			"TREE_ACCESS_RIGHT", "TREE_ACCESS_PARENT", "TREE_ACCESS_VALUE", "DIGIT", 
			"ALPHA", "ALPHANUM", "ANY", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "':'", "'@'", "'<'", "','", "'>'", "'Null'", null, 
			"'True'", "'False'", null, null, null, null, "'/'", "'\\'", "'^'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "T_NULL", "T_BOOL", "T_TRUE", 
			"T_FALSE", "IDENTIFIER", "INTEGER", "FLOAT", "STRING", "TREE_ACCESS_LEFT", 
			"TREE_ACCESS_RIGHT", "TREE_ACCESS_PARENT", "TREE_ACCESS_VALUE", "WS"
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


	public LoraxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lorax.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0095\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\5\nI\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\6\rY\n\r\r\r\16\rZ\3\16\5\16^\n\16\3\16\6\16a\n\16"+
		"\r\16\16\16b\3\17\5\17f\n\17\3\17\6\17i\n\17\r\17\16\17j\3\17\3\17\6\17"+
		"o\n\17\r\17\16\17p\3\20\3\20\7\20u\n\20\f\20\16\20x\13\20\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\30\5\30\u008d\n\30\3\31\6\31\u0090\n\31\r\31\16\31\u0091\3"+
		"\31\3\31\3v\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\2+\2-\2/\2\61\26\3\2\7\3\2\62"+
		";\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17))\5\2\13\f\17\17\"\"\2\u009b\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67"+
		"\3\2\2\2\t9\3\2\2\2\13;\3\2\2\2\r=\3\2\2\2\17?\3\2\2\2\21A\3\2\2\2\23"+
		"H\3\2\2\2\25J\3\2\2\2\27O\3\2\2\2\31U\3\2\2\2\33]\3\2\2\2\35e\3\2\2\2"+
		"\37r\3\2\2\2!{\3\2\2\2#}\3\2\2\2%\177\3\2\2\2\'\u0081\3\2\2\2)\u0083\3"+
		"\2\2\2+\u0085\3\2\2\2-\u0087\3\2\2\2/\u008c\3\2\2\2\61\u008f\3\2\2\2\63"+
		"\64\7]\2\2\64\4\3\2\2\2\65\66\7_\2\2\66\6\3\2\2\2\678\7<\2\28\b\3\2\2"+
		"\29:\7B\2\2:\n\3\2\2\2;<\7>\2\2<\f\3\2\2\2=>\7.\2\2>\16\3\2\2\2?@\7@\2"+
		"\2@\20\3\2\2\2AB\7P\2\2BC\7w\2\2CD\7n\2\2DE\7n\2\2E\22\3\2\2\2FI\5\25"+
		"\13\2GI\5\27\f\2HF\3\2\2\2HG\3\2\2\2I\24\3\2\2\2JK\7V\2\2KL\7t\2\2LM\7"+
		"w\2\2MN\7g\2\2N\26\3\2\2\2OP\7H\2\2PQ\7c\2\2QR\7n\2\2RS\7u\2\2ST\7g\2"+
		"\2T\30\3\2\2\2UX\5+\26\2VY\7a\2\2WY\5-\27\2XV\3\2\2\2XW\3\2\2\2YZ\3\2"+
		"\2\2ZX\3\2\2\2Z[\3\2\2\2[\32\3\2\2\2\\^\7/\2\2]\\\3\2\2\2]^\3\2\2\2^`"+
		"\3\2\2\2_a\5)\25\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\34\3\2\2\2"+
		"df\7/\2\2ed\3\2\2\2ef\3\2\2\2fh\3\2\2\2gi\5)\25\2hg\3\2\2\2ij\3\2\2\2"+
		"jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2ln\7\60\2\2mo\5)\25\2nm\3\2\2\2op\3\2\2"+
		"\2pn\3\2\2\2pq\3\2\2\2q\36\3\2\2\2rv\7)\2\2su\5/\30\2ts\3\2\2\2ux\3\2"+
		"\2\2vw\3\2\2\2vt\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7)\2\2z \3\2\2\2{|\7\61"+
		"\2\2|\"\3\2\2\2}~\7^\2\2~$\3\2\2\2\177\u0080\7`\2\2\u0080&\3\2\2\2\u0081"+
		"\u0082\7&\2\2\u0082(\3\2\2\2\u0083\u0084\t\2\2\2\u0084*\3\2\2\2\u0085"+
		"\u0086\t\3\2\2\u0086,\3\2\2\2\u0087\u0088\t\4\2\2\u0088.\3\2\2\2\u0089"+
		"\u008a\7^\2\2\u008a\u008d\13\2\2\2\u008b\u008d\n\5\2\2\u008c\u0089\3\2"+
		"\2\2\u008c\u008b\3\2\2\2\u008d\60\3\2\2\2\u008e\u0090\t\6\2\2\u008f\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0094\b\31\2\2\u0094\62\3\2\2\2\16\2HXZ]bejpv\u008c"+
		"\u0091\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}