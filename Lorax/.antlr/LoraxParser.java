// Generated from d:\Programming\GithubRepos\CsLorax\Lorax\Lorax.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LoraxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, INTEGER=4;
	public static final int
		RULE_treeLiteral = 0, RULE_treeChild = 1, RULE_nodeValue = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"treeLiteral", "treeChild", "nodeValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "','", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "INTEGER"
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
	public String getGrammarFileName() { return "Lorax.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LoraxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TreeLiteralContext extends ParserRuleContext {
		public NodeValueContext nodeValue() {
			return getRuleContext(NodeValueContext.class,0);
		}
		public List<TreeChildContext> treeChild() {
			return getRuleContexts(TreeChildContext.class);
		}
		public TreeChildContext treeChild(int i) {
			return getRuleContext(TreeChildContext.class,i);
		}
		public TreeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treeLiteral; }
	}

	public final TreeLiteralContext treeLiteral() throws RecognitionException {
		TreeLiteralContext _localctx = new TreeLiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_treeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			nodeValue();
			setState(7);
			match(T__0);
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==INTEGER) {
				{
				setState(9);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(8);
					treeChild();
					}
				}

				setState(11);
				match(T__1);
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(12);
					treeChild();
					}
				}

				}
			}

			setState(17);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TreeChildContext extends ParserRuleContext {
		public NodeValueContext nodeValue() {
			return getRuleContext(NodeValueContext.class,0);
		}
		public TreeLiteralContext treeLiteral() {
			return getRuleContext(TreeLiteralContext.class,0);
		}
		public TreeChildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treeChild; }
	}

	public final TreeChildContext treeChild() throws RecognitionException {
		TreeChildContext _localctx = new TreeChildContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_treeChild);
		try {
			setState(21);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				nodeValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				treeLiteral();
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

	public static class NodeValueContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(LoraxParser.INTEGER, 0); }
		public NodeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeValue; }
	}

	public final NodeValueContext nodeValue() throws RecognitionException {
		NodeValueContext _localctx = new NodeValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nodeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6\34\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\5\2\f\n\2\3\2\3\2\5\2\20\n\2\5\2\22\n\2\3\2\3"+
		"\2\3\3\3\3\5\3\30\n\3\3\4\3\4\3\4\2\2\5\2\4\6\2\2\2\34\2\b\3\2\2\2\4\27"+
		"\3\2\2\2\6\31\3\2\2\2\b\t\5\6\4\2\t\21\7\3\2\2\n\f\5\4\3\2\13\n\3\2\2"+
		"\2\13\f\3\2\2\2\f\r\3\2\2\2\r\17\7\4\2\2\16\20\5\4\3\2\17\16\3\2\2\2\17"+
		"\20\3\2\2\2\20\22\3\2\2\2\21\13\3\2\2\2\21\22\3\2\2\2\22\23\3\2\2\2\23"+
		"\24\7\5\2\2\24\3\3\2\2\2\25\30\5\6\4\2\26\30\5\2\2\2\27\25\3\2\2\2\27"+
		"\26\3\2\2\2\30\5\3\2\2\2\31\32\7\6\2\2\32\7\3\2\2\2\6\13\17\21\27";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}