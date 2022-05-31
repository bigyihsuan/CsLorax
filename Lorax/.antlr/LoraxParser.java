// Generated from d:\Programming\GithubRepos\CsLorax\Lorax\Lorax.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T_NULL=7, T_BOOL=8, T_TRUE=9, 
		T_FALSE=10, IDENTIFIER=11, INTEGER=12, FLOAT=13, STRING=14, TREE_ACCESS_LEFT=15, 
		TREE_ACCESS_RIGHT=16, TREE_ACCESS_PARENT=17, TREE_ACCESS_VALUE=18, WS=19;
	public static final int
		RULE_treeAccess = 0, RULE_treeLiteral = 1, RULE_treeChildren = 2, RULE_treeChild = 3, 
		RULE_nodeValue = 4, RULE_treeAccessOps = 5, RULE_treeAccessTraversor = 6, 
		RULE_tuple = 7, RULE_primitive = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"treeAccess", "treeLiteral", "treeChildren", "treeChild", "nodeValue", 
			"treeAccessOps", "treeAccessTraversor", "tuple", "primitive"
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
			{
			setState(18);
			treeLiteral();
			}
			setState(19);
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
		public TreeChildrenContext treeChildren() {
			return getRuleContext(TreeChildrenContext.class,0);
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
			setState(21);
			nodeValue();
			setState(22);
			match(T__0);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T_NULL) | (1L << T_BOOL) | (1L << INTEGER) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(23);
				treeChildren();
				}
			}

			setState(26);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TreeChildrenContext extends ParserRuleContext {
		public List<TreeChildContext> treeChild() {
			return getRuleContexts(TreeChildContext.class);
		}
		public TreeChildContext treeChild(int i) {
			return getRuleContext(TreeChildContext.class,i);
		}
		public TreeChildrenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treeChildren; }
	}

	public final TreeChildrenContext treeChildren() throws RecognitionException {
		TreeChildrenContext _localctx = new TreeChildrenContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_treeChildren);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T_NULL) | (1L << T_BOOL) | (1L << INTEGER) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(28);
				treeChild();
				}
			}

			setState(31);
			match(T__2);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T_NULL) | (1L << T_BOOL) | (1L << INTEGER) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(32);
				treeChild();
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
		enterRule(_localctx, 6, RULE_treeChild);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				nodeValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
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
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public NodeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeValue; }
	}

	public final NodeValueContext nodeValue() throws RecognitionException {
		NodeValueContext _localctx = new NodeValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nodeValue);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				tuple();
				}
				break;
			case T_NULL:
			case T_BOOL:
			case INTEGER:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				primitive();
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
		enterRule(_localctx, 10, RULE_treeAccessOps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TREE_ACCESS_LEFT) | (1L << TREE_ACCESS_RIGHT) | (1L << TREE_ACCESS_PARENT))) != 0)) {
				{
				{
				setState(43);
				treeAccessTraversor();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TREE_ACCESS_VALUE) {
				{
				setState(49);
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
		enterRule(_localctx, 12, RULE_treeAccessTraversor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
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

	public static class TupleContext extends ParserRuleContext {
		public List<PrimitiveContext> primitive() {
			return getRuleContexts(PrimitiveContext.class);
		}
		public PrimitiveContext primitive(int i) {
			return getRuleContext(PrimitiveContext.class,i);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__3);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_NULL) | (1L << T_BOOL) | (1L << INTEGER) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(55);
				primitive();
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(56);
					match(T__4);
					setState(57);
					primitive();
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(65);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(LoraxParser.T_NULL, 0); }
		public TerminalNode T_BOOL() { return getToken(LoraxParser.T_BOOL, 0); }
		public TerminalNode STRING() { return getToken(LoraxParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(LoraxParser.FLOAT, 0); }
		public TerminalNode INTEGER() { return getToken(LoraxParser.INTEGER, 0); }
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_NULL) | (1L << T_BOOL) | (1L << INTEGER) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25H\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\5\3\33\n\3\3\3\3\3\3\4\5\4 \n\4\3\4\3\4\5\4$\n\4\3\5\3\5"+
		"\5\5(\n\5\3\6\3\6\5\6,\n\6\3\7\7\7/\n\7\f\7\16\7\62\13\7\3\7\5\7\65\n"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\t\7\t=\n\t\f\t\16\t@\13\t\5\tB\n\t\3\t\3\t\3"+
		"\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\4\3\2\21\23\4\2\t\n\16\20\2G"+
		"\2\24\3\2\2\2\4\27\3\2\2\2\6\37\3\2\2\2\b\'\3\2\2\2\n+\3\2\2\2\f\60\3"+
		"\2\2\2\16\66\3\2\2\2\208\3\2\2\2\22E\3\2\2\2\24\25\5\4\3\2\25\26\5\f\7"+
		"\2\26\3\3\2\2\2\27\30\5\n\6\2\30\32\7\3\2\2\31\33\5\6\4\2\32\31\3\2\2"+
		"\2\32\33\3\2\2\2\33\34\3\2\2\2\34\35\7\4\2\2\35\5\3\2\2\2\36 \5\b\5\2"+
		"\37\36\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!#\7\5\2\2\"$\5\b\5\2#\"\3\2\2\2#"+
		"$\3\2\2\2$\7\3\2\2\2%(\5\n\6\2&(\5\4\3\2\'%\3\2\2\2\'&\3\2\2\2(\t\3\2"+
		"\2\2),\5\20\t\2*,\5\22\n\2+)\3\2\2\2+*\3\2\2\2,\13\3\2\2\2-/\5\16\b\2"+
		".-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\64\3\2\2\2\62\60\3"+
		"\2\2\2\63\65\7\24\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65\r\3\2\2\2\66\67\t"+
		"\2\2\2\67\17\3\2\2\28A\7\6\2\29>\5\22\n\2:;\7\7\2\2;=\5\22\n\2<:\3\2\2"+
		"\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?B\3\2\2\2@>\3\2\2\2A9\3\2\2\2AB\3\2\2"+
		"\2BC\3\2\2\2CD\7\b\2\2D\21\3\2\2\2EF\t\3\2\2F\23\3\2\2\2\13\32\37#\'+"+
		"\60\64>A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}