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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T_NULL=8, T_BOOL=9, 
		T_TRUE=10, T_FALSE=11, IDENTIFIER=12, INTEGER=13, FLOAT=14, STRING=15, 
		TREE_ACCESS_LEFT=16, TREE_ACCESS_RIGHT=17, TREE_ACCESS_PARENT=18, TREE_ACCESS_VALUE=19, 
		WS=20;
	public static final int
		RULE_treeAccess = 0, RULE_treeLiteral = 1, RULE_treeChildren = 2, RULE_treeChild = 3, 
		RULE_nodeValue = 4, RULE_tupleAccess = 5, RULE_treeAccessOps = 6, RULE_treeAccessTraversor = 7, 
		RULE_tupleAccessOp = 8, RULE_tuple = 9, RULE_primitive = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"treeAccess", "treeLiteral", "treeChildren", "treeChild", "nodeValue", 
			"tupleAccess", "treeAccessOps", "treeAccessTraversor", "tupleAccessOp", 
			"tuple", "primitive"
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
			setState(22);
			treeLiteral();
			}
			setState(23);
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
			setState(25);
			nodeValue();
			setState(26);
			match(T__0);
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T_NULL) | (1L << T_BOOL) | (1L << INTEGER) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(27);
				treeChildren();
				}
			}

			setState(30);
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T_NULL) | (1L << T_BOOL) | (1L << INTEGER) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(32);
				treeChild();
				}
			}

			setState(35);
			match(T__2);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T_NULL) | (1L << T_BOOL) | (1L << INTEGER) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(36);
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
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				nodeValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
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
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
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
				setState(44);
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

	public static class TupleAccessContext extends ParserRuleContext {
		public TupleAccessOpContext tupleAccessOp() {
			return getRuleContext(TupleAccessOpContext.class,0);
		}
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public TupleAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleAccess; }
	}

	public final TupleAccessContext tupleAccess() throws RecognitionException {
		TupleAccessContext _localctx = new TupleAccessContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tupleAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(47);
			tuple();
			}
			setState(48);
			tupleAccessOp();
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
		public TreeAccessTraversorContext treeAccessTraversor() {
			return getRuleContext(TreeAccessTraversorContext.class,0);
		}
		public TerminalNode TREE_ACCESS_VALUE() { return getToken(LoraxParser.TREE_ACCESS_VALUE, 0); }
		public TreeAccessOpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treeAccessOps; }
	}

	public final TreeAccessOpsContext treeAccessOps() throws RecognitionException {
		TreeAccessOpsContext _localctx = new TreeAccessOpsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_treeAccessOps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			treeAccessTraversor();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TREE_ACCESS_VALUE) {
				{
				setState(51);
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
		enterRule(_localctx, 14, RULE_treeAccessTraversor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
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

	public static class TupleAccessOpContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(LoraxParser.INTEGER, 0); }
		public TupleAccessOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleAccessOp; }
	}

	public final TupleAccessOpContext tupleAccessOp() throws RecognitionException {
		TupleAccessOpContext _localctx = new TupleAccessOpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tupleAccessOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__3);
			setState(57);
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
		enterRule(_localctx, 18, RULE_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__4);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_NULL) | (1L << T_BOOL) | (1L << INTEGER) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(60);
				primitive();
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(61);
					match(T__5);
					setState(62);
					primitive();
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(70);
			match(T__6);
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
		enterRule(_localctx, 20, RULE_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26M\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\3\3\3\3\3\5\3\37\n\3\3\3\3\3\3\4\5\4$\n\4\3\4\3\4"+
		"\5\4(\n\4\3\5\3\5\5\5,\n\5\3\6\3\6\5\6\60\n\6\3\7\3\7\3\7\3\b\3\b\5\b"+
		"\67\n\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13B\n\13\f\13\16\13"+
		"E\13\13\5\13G\n\13\3\13\3\13\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24"+
		"\26\2\4\3\2\22\24\4\2\n\13\17\21\2I\2\30\3\2\2\2\4\33\3\2\2\2\6#\3\2\2"+
		"\2\b+\3\2\2\2\n/\3\2\2\2\f\61\3\2\2\2\16\64\3\2\2\2\208\3\2\2\2\22:\3"+
		"\2\2\2\24=\3\2\2\2\26J\3\2\2\2\30\31\5\4\3\2\31\32\5\16\b\2\32\3\3\2\2"+
		"\2\33\34\5\n\6\2\34\36\7\3\2\2\35\37\5\6\4\2\36\35\3\2\2\2\36\37\3\2\2"+
		"\2\37 \3\2\2\2 !\7\4\2\2!\5\3\2\2\2\"$\5\b\5\2#\"\3\2\2\2#$\3\2\2\2$%"+
		"\3\2\2\2%\'\7\5\2\2&(\5\b\5\2\'&\3\2\2\2\'(\3\2\2\2(\7\3\2\2\2),\5\n\6"+
		"\2*,\5\4\3\2+)\3\2\2\2+*\3\2\2\2,\t\3\2\2\2-\60\5\24\13\2.\60\5\26\f\2"+
		"/-\3\2\2\2/.\3\2\2\2\60\13\3\2\2\2\61\62\5\24\13\2\62\63\5\22\n\2\63\r"+
		"\3\2\2\2\64\66\5\20\t\2\65\67\7\25\2\2\66\65\3\2\2\2\66\67\3\2\2\2\67"+
		"\17\3\2\2\289\t\2\2\29\21\3\2\2\2:;\7\6\2\2;<\7\17\2\2<\23\3\2\2\2=F\7"+
		"\7\2\2>C\5\26\f\2?@\7\b\2\2@B\5\26\f\2A?\3\2\2\2BE\3\2\2\2CA\3\2\2\2C"+
		"D\3\2\2\2DG\3\2\2\2EC\3\2\2\2F>\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\t\2\2"+
		"I\25\3\2\2\2JK\t\3\2\2K\27\3\2\2\2\n\36#\'+/\66CF";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}