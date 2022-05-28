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
		T__0=1, T__1=2, T__2=3, IDENTIFIER=4, INTEGER=5, TREE_ACCESS_LEFT=6, TREE_ACCESS_RIGHT=7, 
		TREE_ACCESS_PARENT=8, TREE_ACCESS_VALUE=9;
	public static final int
		RULE_treeAccess = 0, RULE_treeLiteral = 1, RULE_treeChild = 2, RULE_nodeValue = 3, 
		RULE_treeAccessOps = 4, RULE_treeAccessTraversor = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"treeAccess", "treeLiteral", "treeChild", "nodeValue", "treeAccessOps", 
			"treeAccessTraversor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "','", "']'", null, null, "'/'", "'\\'", "'^'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "IDENTIFIER", "INTEGER", "TREE_ACCESS_LEFT", 
			"TREE_ACCESS_RIGHT", "TREE_ACCESS_PARENT", "TREE_ACCESS_VALUE"
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

	public static class TreeAccessContext extends ParserRuleContext {
		public TreeAccessOpsContext treeAccessOps() {
			return getRuleContext(TreeAccessOpsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(LoraxParser.IDENTIFIER, 0); }
		public TreeLiteralContext treeLiteral() {
			return getRuleContext(TreeLiteralContext.class,0);
		}
		public TreeAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treeAccess; }
	}

	public final TreeAccessContext treeAccess() throws RecognitionException {
		TreeAccessContext _localctx = new TreeAccessContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_treeAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(12);
				match(IDENTIFIER);
				}
				break;
			case INTEGER:
				{
				setState(13);
				treeLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(16);
			treeAccessOps();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
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
		enterRule(_localctx, 2, RULE_treeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			nodeValue();
			setState(19);
			match(T__0);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==INTEGER) {
				{
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(20);
					treeChild();
					}
				}

				setState(23);
				match(T__1);
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(24);
					treeChild();
					}
				}

				}
			}

			setState(29);
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
		enterRule(_localctx, 4, RULE_treeChild);
		try {
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				nodeValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
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
		enterRule(_localctx, 6, RULE_nodeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
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

	public static class TreeAccessOpsContext extends ParserRuleContext {
		public List<TreeAccessTraversorContext> treeAccessTraversor() {
			return getRuleContexts(TreeAccessTraversorContext.class);
		}
		public TreeAccessTraversorContext treeAccessTraversor(int i) {
			return getRuleContext(TreeAccessTraversorContext.class,i);
		}
		public TerminalNode TREE_ACCESS_VALUE() { return getToken(LoraxParser.TREE_ACCESS_VALUE, 0); }
		public TreeAccessOpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treeAccessOps; }
	}

	public final TreeAccessOpsContext treeAccessOps() throws RecognitionException {
		TreeAccessOpsContext _localctx = new TreeAccessOpsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_treeAccessOps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TREE_ACCESS_LEFT) | (1L << TREE_ACCESS_RIGHT) | (1L << TREE_ACCESS_PARENT))) != 0)) {
				{
				{
				setState(37);
				treeAccessTraversor();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TREE_ACCESS_VALUE) {
				{
				setState(43);
				match(TREE_ACCESS_VALUE);
				}
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

	public static class TreeAccessTraversorContext extends ParserRuleContext {
		public TerminalNode TREE_ACCESS_LEFT() { return getToken(LoraxParser.TREE_ACCESS_LEFT, 0); }
		public TerminalNode TREE_ACCESS_RIGHT() { return getToken(LoraxParser.TREE_ACCESS_RIGHT, 0); }
		public TerminalNode TREE_ACCESS_PARENT() { return getToken(LoraxParser.TREE_ACCESS_PARENT, 0); }
		public TreeAccessTraversorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treeAccessTraversor; }
	}

	public final TreeAccessTraversorContext treeAccessTraversor() throws RecognitionException {
		TreeAccessTraversorContext _localctx = new TreeAccessTraversorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_treeAccessTraversor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TREE_ACCESS_LEFT) | (1L << TREE_ACCESS_RIGHT) | (1L << TREE_ACCESS_PARENT))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\63\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\5\2\21\n\2\3\2\3\2\3\3\3"+
		"\3\3\3\5\3\30\n\3\3\3\3\3\5\3\34\n\3\5\3\36\n\3\3\3\3\3\3\4\3\4\5\4$\n"+
		"\4\3\5\3\5\3\6\7\6)\n\6\f\6\16\6,\13\6\3\6\5\6/\n\6\3\7\3\7\3\7\2\2\b"+
		"\2\4\6\b\n\f\2\3\3\2\b\n\2\63\2\20\3\2\2\2\4\24\3\2\2\2\6#\3\2\2\2\b%"+
		"\3\2\2\2\n*\3\2\2\2\f\60\3\2\2\2\16\21\7\6\2\2\17\21\5\4\3\2\20\16\3\2"+
		"\2\2\20\17\3\2\2\2\21\22\3\2\2\2\22\23\5\n\6\2\23\3\3\2\2\2\24\25\5\b"+
		"\5\2\25\35\7\3\2\2\26\30\5\6\4\2\27\26\3\2\2\2\27\30\3\2\2\2\30\31\3\2"+
		"\2\2\31\33\7\4\2\2\32\34\5\6\4\2\33\32\3\2\2\2\33\34\3\2\2\2\34\36\3\2"+
		"\2\2\35\27\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37 \7\5\2\2 \5\3\2\2\2"+
		"!$\5\b\5\2\"$\5\4\3\2#!\3\2\2\2#\"\3\2\2\2$\7\3\2\2\2%&\7\7\2\2&\t\3\2"+
		"\2\2\')\5\f\7\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+.\3\2\2\2,*\3"+
		"\2\2\2-/\7\13\2\2.-\3\2\2\2./\3\2\2\2/\13\3\2\2\2\60\61\t\2\2\2\61\r\3"+
		"\2\2\2\t\20\27\33\35#*.";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}