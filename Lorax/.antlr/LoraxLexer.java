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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, IDENTIFIER=8, 
		T_NULL=9, T_BOOL=10, T_TRUE=11, T_FALSE=12, INTEGER=13, FLOAT=14, STRING=15, 
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
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "IDENTIFIER", 
			"T_NULL", "T_BOOL", "T_TRUE", "T_FALSE", "INTEGER", "FLOAT", "STRING", 
			"TREE_ACCESS_LEFT", "TREE_ACCESS_RIGHT", "TREE_ACCESS_PARENT", "TREE_ACCESS_VALUE", 
			"DIGIT", "ALPHA", "ALPHANUM", "ANY", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "':'", "'@'", "'<'", "','", "'>'", null, "'Null'", 
			null, "'True'", "'False'", null, null, null, "'/'", "'\\'", "'^'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "IDENTIFIER", "T_NULL", 
			"T_BOOL", "T_TRUE", "T_FALSE", "INTEGER", "FLOAT", "STRING", "TREE_ACCESS_LEFT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0098\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\5\tD\n\t\3\t\3\t\6\tH\n\t\r\t\16\tI\3\n\3\n\3\n\3\n\3\n\3\13\3\13\5\13"+
		"S\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\5\16a\n\16\3\16"+
		"\6\16d\n\16\r\16\16\16e\3\17\5\17i\n\17\3\17\6\17l\n\17\r\17\16\17m\3"+
		"\17\3\17\6\17r\n\17\r\17\16\17s\3\20\3\20\7\20x\n\20\f\20\16\20{\13\20"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\5\30\u0090\n\30\3\31\6\31\u0093\n\31\r\31\16"+
		"\31\u0094\3\31\3\31\3y\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\2+\2-\2/\2\61\26\3\2"+
		"\7\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17))\5\2\13\f\17\17\"\"\2"+
		"\u009f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2"+
		"\2\2\7\67\3\2\2\2\t9\3\2\2\2\13;\3\2\2\2\r=\3\2\2\2\17?\3\2\2\2\21C\3"+
		"\2\2\2\23K\3\2\2\2\25R\3\2\2\2\27T\3\2\2\2\31Y\3\2\2\2\33`\3\2\2\2\35"+
		"h\3\2\2\2\37u\3\2\2\2!~\3\2\2\2#\u0080\3\2\2\2%\u0082\3\2\2\2\'\u0084"+
		"\3\2\2\2)\u0086\3\2\2\2+\u0088\3\2\2\2-\u008a\3\2\2\2/\u008f\3\2\2\2\61"+
		"\u0092\3\2\2\2\63\64\7]\2\2\64\4\3\2\2\2\65\66\7_\2\2\66\6\3\2\2\2\67"+
		"8\7<\2\28\b\3\2\2\29:\7B\2\2:\n\3\2\2\2;<\7>\2\2<\f\3\2\2\2=>\7.\2\2>"+
		"\16\3\2\2\2?@\7@\2\2@\20\3\2\2\2AD\7a\2\2BD\5+\26\2CA\3\2\2\2CB\3\2\2"+
		"\2DG\3\2\2\2EH\7a\2\2FH\5-\27\2GE\3\2\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2"+
		"\2IJ\3\2\2\2J\22\3\2\2\2KL\7P\2\2LM\7w\2\2MN\7n\2\2NO\7n\2\2O\24\3\2\2"+
		"\2PS\5\27\f\2QS\5\31\r\2RP\3\2\2\2RQ\3\2\2\2S\26\3\2\2\2TU\7V\2\2UV\7"+
		"t\2\2VW\7w\2\2WX\7g\2\2X\30\3\2\2\2YZ\7H\2\2Z[\7c\2\2[\\\7n\2\2\\]\7u"+
		"\2\2]^\7g\2\2^\32\3\2\2\2_a\7/\2\2`_\3\2\2\2`a\3\2\2\2ac\3\2\2\2bd\5)"+
		"\25\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\34\3\2\2\2gi\7/\2\2hg\3"+
		"\2\2\2hi\3\2\2\2ik\3\2\2\2jl\5)\25\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3"+
		"\2\2\2no\3\2\2\2oq\7\60\2\2pr\5)\25\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st"+
		"\3\2\2\2t\36\3\2\2\2uy\7)\2\2vx\5/\30\2wv\3\2\2\2x{\3\2\2\2yz\3\2\2\2"+
		"yw\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7)\2\2} \3\2\2\2~\177\7\61\2\2\177\""+
		"\3\2\2\2\u0080\u0081\7^\2\2\u0081$\3\2\2\2\u0082\u0083\7`\2\2\u0083&\3"+
		"\2\2\2\u0084\u0085\7&\2\2\u0085(\3\2\2\2\u0086\u0087\t\2\2\2\u0087*\3"+
		"\2\2\2\u0088\u0089\t\3\2\2\u0089,\3\2\2\2\u008a\u008b\t\4\2\2\u008b.\3"+
		"\2\2\2\u008c\u008d\7^\2\2\u008d\u0090\13\2\2\2\u008e\u0090\n\5\2\2\u008f"+
		"\u008c\3\2\2\2\u008f\u008e\3\2\2\2\u0090\60\3\2\2\2\u0091\u0093\t\6\2"+
		"\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\b\31\2\2\u0097\62\3\2\2\2\17"+
		"\2CGIR`ehmsy\u008f\u0094\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}