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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, IDENTIFIER=8, 
		T_NULL=9, T_BOOL=10, T_TRUE=11, T_FALSE=12, INTEGER=13, FLOAT=14, STRING=15, 
		TREE_ACCESS_LEFT=16, TREE_ACCESS_RIGHT=17, TREE_ACCESS_PARENT=18, TREE_ACCESS_VALUE=19, 
		WS=20;
	public static final int
		RULE_value = 0, RULE_treeAccess = 1, RULE_treeLiteral = 2, RULE_treeChildren = 3, 
		RULE_treeChild = 4, RULE_nodeValue = 5, RULE_tupleAccess = 6, RULE_treeAccessOps = 7, 
		RULE_treeAccessTraversor = 8, RULE_tupleAccessOp = 9, RULE_tuple = 10, 
		RULE_primitive = 11, RULE_literal = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"value", "treeAccess", "treeLiteral", "treeChildren", "treeChild", "nodeValue", 
			"tupleAccess", "treeAccessOps", "treeAccessTraversor", "tupleAccessOp", 
			"tuple", "primitive", "literal"
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LoraxParser.IDENTIFIER, 0); }
		public TreeLiteralContext treeLiteral() {
			return getRuleContext(TreeLiteralContext.class,0);
		}
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_value);
		try {
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				treeLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				tuple();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				primitive();
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

	public static class TreeAccessContext extends ParserRuleContext {
		public TreeLiteralContext treeLiteral() {
			return getRuleContext(TreeLiteralContext.class,0);
		}
		public TreeAccessOpsContext treeAccessOps() {
			return getRuleContext(TreeAccessOpsContext.class,0);
		}
		public TreeAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treeAccess; }
	}

	public final TreeAccessContext treeAccess() throws RecognitionException {
		TreeAccessContext _localctx = new TreeAccessContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_treeAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			treeLiteral();
			setState(33);
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
		enterRule(_localctx, 4, RULE_treeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			nodeValue();
			setState(36);
			match(T__0);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << IDENTIFIER) | (1L << T_NULL) | (1L << T_BOOL) | (1L << INTEGER) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(37);
				treeChildren();
				}
			}

			setState(40);
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
		enterRule(_localctx, 6, RULE_treeChildren);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << IDENTIFIER) | (1L << T_NULL) | (1L << T_BOOL) | (1L << INTEGER) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(42);
				treeChild();
				}
			}

			setState(45);
			match(T__2);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << IDENTIFIER) | (1L << T_NULL) | (1L << T_BOOL) | (1L << INTEGER) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(46);
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
		enterRule(_localctx, 8, RULE_treeChild);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				nodeValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
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
		public TerminalNode IDENTIFIER() { return getToken(LoraxParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 10, RULE_nodeValue);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				tuple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				primitive();
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

	public static class TupleAccessContext extends ParserRuleContext {
		public TupleAccessOpContext tupleAccessOp() {
			return getRuleContext(TupleAccessOpContext.class,0);
		}
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(LoraxParser.IDENTIFIER, 0); }
		public TupleAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleAccess; }
	}

	public final TupleAccessContext tupleAccess() throws RecognitionException {
		TupleAccessContext _localctx = new TupleAccessContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tupleAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(58);
				tuple();
				}
				break;
			case IDENTIFIER:
				{
				setState(59);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(62);
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
		enterRule(_localctx, 14, RULE_treeAccessOps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			treeAccessTraversor();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TREE_ACCESS_VALUE) {
				{
				setState(65);
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
		enterRule(_localctx, 16, RULE_treeAccessTraversor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
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
		enterRule(_localctx, 18, RULE_tupleAccessOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__3);
			setState(71);
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
		enterRule(_localctx, 20, RULE_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__4);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << T_NULL) | (1L << T_BOOL) | (1L << INTEGER) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(74);
				primitive();
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(75);
					match(T__5);
					setState(76);
					primitive();
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(84);
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
		public TerminalNode IDENTIFIER() { return getToken(LoraxParser.IDENTIFIER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_primitive);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(IDENTIFIER);
				}
				break;
			case T_NULL:
			case T_BOOL:
			case INTEGER:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				literal();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(LoraxParser.T_NULL, 0); }
		public TerminalNode T_BOOL() { return getToken(LoraxParser.T_BOOL, 0); }
		public TerminalNode STRING() { return getToken(LoraxParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(LoraxParser.FLOAT, 0); }
		public TerminalNode INTEGER() { return getToken(LoraxParser.INTEGER, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26_\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\5\2!\n\2\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\5\4)\n\4\3\4\3\4\3\5\5\5.\n\5\3\5\3\5\5\5\62\n\5\3\6\3\6\5\6\66\n"+
		"\6\3\7\3\7\3\7\5\7;\n\7\3\b\3\b\5\b?\n\b\3\b\3\b\3\t\3\t\5\tE\n\t\3\n"+
		"\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\fP\n\f\f\f\16\fS\13\f\5\fU\n\f\3"+
		"\f\3\f\3\r\3\r\5\r[\n\r\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\2\4\3\2\22\24\4\2\13\f\17\21\2_\2 \3\2\2\2\4\"\3\2\2\2\6%\3"+
		"\2\2\2\b-\3\2\2\2\n\65\3\2\2\2\f:\3\2\2\2\16>\3\2\2\2\20B\3\2\2\2\22F"+
		"\3\2\2\2\24H\3\2\2\2\26K\3\2\2\2\30Z\3\2\2\2\32\\\3\2\2\2\34!\7\n\2\2"+
		"\35!\5\6\4\2\36!\5\26\f\2\37!\5\30\r\2 \34\3\2\2\2 \35\3\2\2\2 \36\3\2"+
		"\2\2 \37\3\2\2\2!\3\3\2\2\2\"#\5\6\4\2#$\5\20\t\2$\5\3\2\2\2%&\5\f\7\2"+
		"&(\7\3\2\2\')\5\b\5\2(\'\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\7\4\2\2+\7\3\2"+
		"\2\2,.\5\n\6\2-,\3\2\2\2-.\3\2\2\2./\3\2\2\2/\61\7\5\2\2\60\62\5\n\6\2"+
		"\61\60\3\2\2\2\61\62\3\2\2\2\62\t\3\2\2\2\63\66\5\f\7\2\64\66\5\6\4\2"+
		"\65\63\3\2\2\2\65\64\3\2\2\2\66\13\3\2\2\2\67;\7\n\2\28;\5\26\f\29;\5"+
		"\30\r\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;\r\3\2\2\2<?\5\26\f\2=?\7\n\2"+
		"\2><\3\2\2\2>=\3\2\2\2?@\3\2\2\2@A\5\24\13\2A\17\3\2\2\2BD\5\22\n\2CE"+
		"\7\25\2\2DC\3\2\2\2DE\3\2\2\2E\21\3\2\2\2FG\t\2\2\2G\23\3\2\2\2HI\7\6"+
		"\2\2IJ\7\17\2\2J\25\3\2\2\2KT\7\7\2\2LQ\5\30\r\2MN\7\b\2\2NP\5\30\r\2"+
		"OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2SQ\3\2\2\2TL\3\2\2\2"+
		"TU\3\2\2\2UV\3\2\2\2VW\7\t\2\2W\27\3\2\2\2X[\7\n\2\2Y[\5\32\16\2ZX\3\2"+
		"\2\2ZY\3\2\2\2[\31\3\2\2\2\\]\t\3\2\2]\33\3\2\2\2\r (-\61\65:>DQTZ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}