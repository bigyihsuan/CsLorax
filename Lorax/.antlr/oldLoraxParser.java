// Generated from d:\Programming\GithubRepos\CsLorax\Lorax\oldLorax.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class oldLoraxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, NULL=2, LITERAL_INTEGER=3, LITERAL_FLOAT=4, LITERAL_STRING=5, 
		LITERAL_BOOLEAN=6, IDENTIFIER=7, PERIOD=8, LEFT_CHILD=9, RIGHT_CHILD=10, 
		PARENT=11, VALUE=12, LEFT_BRACKET=13, RIGHT_BRACKET=14, COMMA=15, SINGLE_QUOTE=16, 
		DOUBLE_QUOTE=17;
	public static final int
		RULE_value = 0, RULE_simple_value = 1, RULE_tree_literal = 2, RULE_tree_children = 3, 
		RULE_tree_child = 4, RULE_tree_access = 5, RULE_tree_child_selector = 6, 
		RULE_primitive = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"value", "simple_value", "tree_literal", "tree_children", "tree_child", 
			"tree_access", "tree_child_selector", "primitive"
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

	@Override
	public String getGrammarFileName() { return "oldLorax.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public oldLoraxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ValueContext extends ParserRuleContext {
		public Simple_valueContext simple_value() {
			return getRuleContext(Simple_valueContext.class,0);
		}
		public Tree_literalContext tree_literal() {
			return getRuleContext(Tree_literalContext.class,0);
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
			setState(18);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				simple_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				tree_literal();
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

	public static class Simple_valueContext extends ParserRuleContext {
		public Simple_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_value; }
	 
		public Simple_valueContext() { }
		public void copyFrom(Simple_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierValueContext extends Simple_valueContext {
		public TerminalNode IDENTIFIER() { return getToken(oldLoraxParser.IDENTIFIER, 0); }
		public IdentifierValueContext(Simple_valueContext ctx) { copyFrom(ctx); }
	}
	public static class PrimitiveValueContext extends Simple_valueContext {
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public PrimitiveValueContext(Simple_valueContext ctx) { copyFrom(ctx); }
	}

	public final Simple_valueContext simple_value() throws RecognitionException {
		Simple_valueContext _localctx = new Simple_valueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_simple_value);
		try {
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdentifierValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				match(IDENTIFIER);
				}
				break;
			case NULL:
			case LITERAL_INTEGER:
			case LITERAL_FLOAT:
			case LITERAL_STRING:
			case LITERAL_BOOLEAN:
				_localctx = new PrimitiveValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
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

	public static class Tree_literalContext extends ParserRuleContext {
		public Simple_valueContext simple_value() {
			return getRuleContext(Simple_valueContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(oldLoraxParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(oldLoraxParser.RIGHT_BRACKET, 0); }
		public Tree_childrenContext tree_children() {
			return getRuleContext(Tree_childrenContext.class,0);
		}
		public Tree_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tree_literal; }
	}

	public final Tree_literalContext tree_literal() throws RecognitionException {
		Tree_literalContext _localctx = new Tree_literalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tree_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			simple_value();
			setState(25);
			match(LEFT_BRACKET);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << LITERAL_INTEGER) | (1L << LITERAL_FLOAT) | (1L << LITERAL_STRING) | (1L << LITERAL_BOOLEAN) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(26);
				tree_children();
				}
			}

			setState(29);
			match(RIGHT_BRACKET);
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

	public static class Tree_childrenContext extends ParserRuleContext {
		public List<Tree_childContext> tree_child() {
			return getRuleContexts(Tree_childContext.class);
		}
		public Tree_childContext tree_child(int i) {
			return getRuleContext(Tree_childContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(oldLoraxParser.COMMA, 0); }
		public Tree_childrenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tree_children; }
	}

	public final Tree_childrenContext tree_children() throws RecognitionException {
		Tree_childrenContext _localctx = new Tree_childrenContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tree_children);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			tree_child();
			setState(32);
			match(COMMA);
			setState(33);
			tree_child();
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

	public static class Tree_childContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(oldLoraxParser.NULL, 0); }
		public Tree_literalContext tree_literal() {
			return getRuleContext(Tree_literalContext.class,0);
		}
		public Tree_childContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tree_child; }
	}

	public final Tree_childContext tree_child() throws RecognitionException {
		Tree_childContext _localctx = new Tree_childContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tree_child);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				tree_literal();
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

	public static class Tree_accessContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(oldLoraxParser.IDENTIFIER, 0); }
		public Tree_literalContext tree_literal() {
			return getRuleContext(Tree_literalContext.class,0);
		}
		public Tree_child_selectorContext tree_child_selector() {
			return getRuleContext(Tree_child_selectorContext.class,0);
		}
		public TerminalNode VALUE() { return getToken(oldLoraxParser.VALUE, 0); }
		public Tree_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tree_access; }
	}

	public final Tree_accessContext tree_access() throws RecognitionException {
		Tree_accessContext _localctx = new Tree_accessContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tree_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(39);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(40);
				tree_literal();
				}
				break;
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_CHILD) | (1L << RIGHT_CHILD) | (1L << PARENT))) != 0)) {
				{
				setState(43);
				tree_child_selector();
				}
			}

			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUE) {
				{
				setState(46);
				match(VALUE);
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

	public static class Tree_child_selectorContext extends ParserRuleContext {
		public List<TerminalNode> LEFT_CHILD() { return getTokens(oldLoraxParser.LEFT_CHILD); }
		public TerminalNode LEFT_CHILD(int i) {
			return getToken(oldLoraxParser.LEFT_CHILD, i);
		}
		public List<TerminalNode> RIGHT_CHILD() { return getTokens(oldLoraxParser.RIGHT_CHILD); }
		public TerminalNode RIGHT_CHILD(int i) {
			return getToken(oldLoraxParser.RIGHT_CHILD, i);
		}
		public List<TerminalNode> PARENT() { return getTokens(oldLoraxParser.PARENT); }
		public TerminalNode PARENT(int i) {
			return getToken(oldLoraxParser.PARENT, i);
		}
		public Tree_child_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tree_child_selector; }
	}

	public final Tree_child_selectorContext tree_child_selector() throws RecognitionException {
		Tree_child_selectorContext _localctx = new Tree_child_selectorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tree_child_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_CHILD) | (1L << RIGHT_CHILD) | (1L << PARENT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_CHILD) | (1L << RIGHT_CHILD) | (1L << PARENT))) != 0) );
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
		public TerminalNode NULL() { return getToken(oldLoraxParser.NULL, 0); }
		public TerminalNode LITERAL_FLOAT() { return getToken(oldLoraxParser.LITERAL_FLOAT, 0); }
		public TerminalNode LITERAL_INTEGER() { return getToken(oldLoraxParser.LITERAL_INTEGER, 0); }
		public TerminalNode LITERAL_STRING() { return getToken(oldLoraxParser.LITERAL_STRING, 0); }
		public TerminalNode LITERAL_BOOLEAN() { return getToken(oldLoraxParser.LITERAL_BOOLEAN, 0); }
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << LITERAL_INTEGER) | (1L << LITERAL_FLOAT) | (1L << LITERAL_STRING) | (1L << LITERAL_BOOLEAN))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23;\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\5\2\25\n\2"+
		"\3\3\3\3\5\3\31\n\3\3\4\3\4\3\4\5\4\36\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\5\6(\n\6\3\7\3\7\5\7,\n\7\3\7\5\7/\n\7\3\7\5\7\62\n\7\3\b\6\b\65"+
		"\n\b\r\b\16\b\66\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\4\3\2\13\r\3\2"+
		"\4\b\2:\2\24\3\2\2\2\4\30\3\2\2\2\6\32\3\2\2\2\b!\3\2\2\2\n\'\3\2\2\2"+
		"\f+\3\2\2\2\16\64\3\2\2\2\208\3\2\2\2\22\25\5\4\3\2\23\25\5\6\4\2\24\22"+
		"\3\2\2\2\24\23\3\2\2\2\25\3\3\2\2\2\26\31\7\t\2\2\27\31\5\20\t\2\30\26"+
		"\3\2\2\2\30\27\3\2\2\2\31\5\3\2\2\2\32\33\5\4\3\2\33\35\7\17\2\2\34\36"+
		"\5\b\5\2\35\34\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37 \7\20\2\2 \7\3\2"+
		"\2\2!\"\5\n\6\2\"#\7\21\2\2#$\5\n\6\2$\t\3\2\2\2%(\7\4\2\2&(\5\6\4\2\'"+
		"%\3\2\2\2\'&\3\2\2\2(\13\3\2\2\2),\7\t\2\2*,\5\6\4\2+)\3\2\2\2+*\3\2\2"+
		"\2,.\3\2\2\2-/\5\16\b\2.-\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60\62\7\16\2\2"+
		"\61\60\3\2\2\2\61\62\3\2\2\2\62\r\3\2\2\2\63\65\t\2\2\2\64\63\3\2\2\2"+
		"\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\17\3\2\2\289\t\3\2\29\21"+
		"\3\2\2\2\n\24\30\35\'+.\61\66";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}