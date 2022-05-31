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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T_NULL=7, T_BOOL=8, T_TRUE=9, 
		T_FALSE=10, IDENTIFIER=11, INTEGER=12, FLOAT=13, STRING=14, TREE_ACCESS_LEFT=15, 
		TREE_ACCESS_RIGHT=16, TREE_ACCESS_PARENT=17, TREE_ACCESS_VALUE=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T_NULL", "T_BOOL", "T_TRUE", 
			"T_FALSE", "IDENTIFIER", "INTEGER", "FLOAT", "STRING", "TREE_ACCESS_LEFT", 
			"TREE_ACCESS_RIGHT", "TREE_ACCESS_PARENT", "TREE_ACCESS_VALUE", "DIGIT", 
			"ALPHA", "ALPHANUM", "ANY", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "':'", "'<'", "','", "'>'", "'Null'", null, "'True'", 
			"'False'", null, null, null, null, "'/'", "'\\'", "'^'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "T_NULL", "T_BOOL", "T_TRUE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u008b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\5\tE\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\6\fU\n\f\r\f\16\fV\3\r\6\rZ\n\r\r\r\16\r[\3\16\6\16_\n\16\r\16\16"+
		"\16`\3\16\3\16\6\16e\n\16\r\16\16\16f\3\17\3\17\7\17k\n\17\f\17\16\17"+
		"n\13\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\27\5\27\u0083\n\27\3\30\6\30\u0086\n\30"+
		"\r\30\16\30\u0087\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\2+\2-\2/\25"+
		"\3\2\7\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17))\5\2\13\f\17\17\""+
		"\"\2\u008f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2"+
		"\2\2\t\67\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21D\3\2\2\2\23F\3"+
		"\2\2\2\25K\3\2\2\2\27Q\3\2\2\2\31Y\3\2\2\2\33^\3\2\2\2\35h\3\2\2\2\37"+
		"q\3\2\2\2!s\3\2\2\2#u\3\2\2\2%w\3\2\2\2\'y\3\2\2\2){\3\2\2\2+}\3\2\2\2"+
		"-\u0082\3\2\2\2/\u0085\3\2\2\2\61\62\7]\2\2\62\4\3\2\2\2\63\64\7_\2\2"+
		"\64\6\3\2\2\2\65\66\7<\2\2\66\b\3\2\2\2\678\7>\2\28\n\3\2\2\29:\7.\2\2"+
		":\f\3\2\2\2;<\7@\2\2<\16\3\2\2\2=>\7P\2\2>?\7w\2\2?@\7n\2\2@A\7n\2\2A"+
		"\20\3\2\2\2BE\5\23\n\2CE\5\25\13\2DB\3\2\2\2DC\3\2\2\2E\22\3\2\2\2FG\7"+
		"V\2\2GH\7t\2\2HI\7w\2\2IJ\7g\2\2J\24\3\2\2\2KL\7H\2\2LM\7c\2\2MN\7n\2"+
		"\2NO\7u\2\2OP\7g\2\2P\26\3\2\2\2QT\5)\25\2RU\7a\2\2SU\5+\26\2TR\3\2\2"+
		"\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\30\3\2\2\2XZ\5\'\24\2YX\3"+
		"\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\32\3\2\2\2]_\5\'\24\2^]\3\2\2"+
		"\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bd\7\60\2\2ce\5\'\24\2dc\3\2"+
		"\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\34\3\2\2\2hl\7)\2\2ik\5-\27\2ji\3"+
		"\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7)\2\2p\36"+
		"\3\2\2\2qr\7\61\2\2r \3\2\2\2st\7^\2\2t\"\3\2\2\2uv\7`\2\2v$\3\2\2\2w"+
		"x\7&\2\2x&\3\2\2\2yz\t\2\2\2z(\3\2\2\2{|\t\3\2\2|*\3\2\2\2}~\t\4\2\2~"+
		",\3\2\2\2\177\u0080\7^\2\2\u0080\u0083\13\2\2\2\u0081\u0083\n\5\2\2\u0082"+
		"\177\3\2\2\2\u0082\u0081\3\2\2\2\u0083.\3\2\2\2\u0084\u0086\t\6\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\30\2\2\u008a\60\3\2\2\2\f\2DTV"+
		"[`fl\u0082\u0087\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}