// Generated from Gnocchi.G4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GnocchiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, PRINT=2, FUNC=3, RETURN=4, MAIN=5, IF=6, ELSE=7, FOR=8, WHILE=9, 
		DO=10, INT=11, STRING=12, CHAR=13, BOOLEAN=14, DOUBLE=15, DOT=16, ASSIGNMENT=17, 
		EQUALS=18, NOT_EQUALS=19, LOWER=20, GREATER=21, LOWER_OR_EQUAL=22, GREATER_OR_EQUAL=23, 
		PLUS=24, MINUS=25, DIVIDE=26, MULTIPLY=27, SEMICOLON=28, COLON=29, ARROW=30, 
		COMMA=31, OPEN_BRACKET=32, CLOSE_BRACKET=33, OPEN_PARENTHESIS=34, CLOSE_PARENTHESIS=35, 
		OPEN_SQAURE_BRACKET=36, CLOSE_SQARE_BRACKET=37, INCREMENT=38, DECREMENT=39, 
		IDENT=40, STRING_VALUE=41, CHAR_VALUE=42, INT_VALUE=43, DOUBLE_VALUE=44, 
		BOOLEAN_VALUE=45, Whitespace=46, Newline=47, BlockComment=48, LineComment=49;
	public static final int
		RULE_start = 0, RULE_identifier = 1, RULE_functionMain = 2, RULE_voidFunctionDeclaration = 3, 
		RULE_returningFunctionDeclaration = 4, RULE_functionCall = 5, RULE_parameterList = 6, 
		RULE_functionBody = 7, RULE_body = 8, RULE_variableOperations = 9, RULE_variableDeclaration = 10, 
		RULE_variableAssigment = 11, RULE_values = 12, RULE_printFunction = 13, 
		RULE_printExpression = 14, RULE_ifStatement = 15, RULE_elsePattern = 16, 
		RULE_iterationStatement = 17, RULE_whileCondition = 18, RULE_doCondition = 19, 
		RULE_forCondition = 20, RULE_unaryExpression = 21, RULE_type = 22, RULE_basicType = 23, 
		RULE_arrayType = 24, RULE_value = 25, RULE_expression = 26, RULE_operation = 27, 
		RULE_logicalOperation = 28, RULE_mathOperation = 29, RULE_op = 30, RULE_mathOperator = 31, 
		RULE_logicalOperator = 32;
	public static final String[] ruleNames = {
		"start", "identifier", "functionMain", "voidFunctionDeclaration", "returningFunctionDeclaration", 
		"functionCall", "parameterList", "functionBody", "body", "variableOperations", 
		"variableDeclaration", "variableAssigment", "values", "printFunction", 
		"printExpression", "ifStatement", "elsePattern", "iterationStatement", 
		"whileCondition", "doCondition", "forCondition", "unaryExpression", "type", 
		"basicType", "arrayType", "value", "expression", "operation", "logicalOperation", 
		"mathOperation", "op", "mathOperator", "logicalOperator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "'print'", "'func'", "'return'", "'main'", "'if'", "'else'", 
		"'for'", "'while'", "'do'", "'Int'", "'String'", "'Char'", "'Bool'", "'Double'", 
		"'.'", "'='", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", 
		"'/'", "'*'", "';'", "':'", "'=>'", "','", "'{'", "'}'", "'('", "')'", 
		"'['", "']'", "'++'", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VAR", "PRINT", "FUNC", "RETURN", "MAIN", "IF", "ELSE", "FOR", "WHILE", 
		"DO", "INT", "STRING", "CHAR", "BOOLEAN", "DOUBLE", "DOT", "ASSIGNMENT", 
		"EQUALS", "NOT_EQUALS", "LOWER", "GREATER", "LOWER_OR_EQUAL", "GREATER_OR_EQUAL", 
		"PLUS", "MINUS", "DIVIDE", "MULTIPLY", "SEMICOLON", "COLON", "ARROW", 
		"COMMA", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", 
		"OPEN_SQAURE_BRACKET", "CLOSE_SQARE_BRACKET", "INCREMENT", "DECREMENT", 
		"IDENT", "STRING_VALUE", "CHAR_VALUE", "INT_VALUE", "DOUBLE_VALUE", "BOOLEAN_VALUE", 
		"Whitespace", "Newline", "BlockComment", "LineComment"
	};
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
	public String getGrammarFileName() { return "Gnocchi.G4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GnocchiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public FunctionMainContext functionMain() {
			return getRuleContext(FunctionMainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GnocchiParser.EOF, 0); }
		public List<VoidFunctionDeclarationContext> voidFunctionDeclaration() {
			return getRuleContexts(VoidFunctionDeclarationContext.class);
		}
		public VoidFunctionDeclarationContext voidFunctionDeclaration(int i) {
			return getRuleContext(VoidFunctionDeclarationContext.class,i);
		}
		public List<ReturningFunctionDeclarationContext> returningFunctionDeclaration() {
			return getRuleContexts(ReturningFunctionDeclarationContext.class);
		}
		public ReturningFunctionDeclarationContext returningFunctionDeclaration(int i) {
			return getRuleContext(ReturningFunctionDeclarationContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			functionMain();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(67);
					voidFunctionDeclaration();
					}
					break;
				case 2:
					{
					setState(68);
					returningFunctionDeclaration();
					}
					break;
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(EOF);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GnocchiParser.IDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(IDENT);
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

	public static class FunctionMainContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GnocchiParser.FUNC, 0); }
		public TerminalNode MAIN() { return getToken(GnocchiParser.MAIN, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(GnocchiParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(GnocchiParser.CLOSE_PARENTHESIS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public FunctionMainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionMain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterFunctionMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitFunctionMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitFunctionMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionMainContext functionMain() throws RecognitionException {
		FunctionMainContext _localctx = new FunctionMainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionMain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(FUNC);
			setState(79);
			match(MAIN);
			setState(80);
			match(OPEN_PARENTHESIS);
			setState(81);
			match(CLOSE_PARENTHESIS);
			setState(82);
			body();
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

	public static class VoidFunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GnocchiParser.FUNC, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENTHESIS() { return getToken(GnocchiParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(GnocchiParser.CLOSE_PARENTHESIS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public VoidFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterVoidFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitVoidFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitVoidFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidFunctionDeclarationContext voidFunctionDeclaration() throws RecognitionException {
		VoidFunctionDeclarationContext _localctx = new VoidFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_voidFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(FUNC);
			setState(85);
			identifier();
			setState(86);
			match(OPEN_PARENTHESIS);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(87);
				parameterList();
				}
			}

			setState(90);
			match(CLOSE_PARENTHESIS);
			setState(91);
			body();
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

	public static class ReturningFunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GnocchiParser.FUNC, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENTHESIS() { return getToken(GnocchiParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(GnocchiParser.CLOSE_PARENTHESIS, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ReturningFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returningFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterReturningFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitReturningFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitReturningFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturningFunctionDeclarationContext returningFunctionDeclaration() throws RecognitionException {
		ReturningFunctionDeclarationContext _localctx = new ReturningFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returningFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(FUNC);
			setState(94);
			identifier();
			setState(95);
			match(OPEN_PARENTHESIS);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(96);
				parameterList();
				}
			}

			setState(99);
			match(CLOSE_PARENTHESIS);
			setState(100);
			functionBody();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GnocchiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GnocchiParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			identifier();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_VALUE) | (1L << INT_VALUE) | (1L << DOUBLE_VALUE))) != 0)) {
				{
				setState(103);
				value();
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(104);
					match(COMMA);
					setState(105);
					value();
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GnocchiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GnocchiParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			identifier();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(114);
				match(COMMA);
				setState(115);
				identifier();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(GnocchiParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GnocchiParser.CLOSE_BRACKET, 0); }
		public TerminalNode RETURN() { return getToken(GnocchiParser.RETURN, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GnocchiParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GnocchiParser.SEMICOLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(OPEN_BRACKET);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << IDENT) | (1L << STRING_VALUE) | (1L << INT_VALUE) | (1L << DOUBLE_VALUE))) != 0)) {
				{
				{
				setState(122);
				expression();
				setState(123);
				match(SEMICOLON);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(130);
			match(RETURN);
			setState(131);
			values();
			setState(132);
			match(SEMICOLON);
			}
			setState(134);
			match(CLOSE_BRACKET);
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(GnocchiParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GnocchiParser.CLOSE_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GnocchiParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GnocchiParser.SEMICOLON, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(OPEN_BRACKET);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << IDENT) | (1L << STRING_VALUE) | (1L << INT_VALUE) | (1L << DOUBLE_VALUE))) != 0)) {
				{
				{
				setState(137);
				expression();
				setState(138);
				match(SEMICOLON);
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(CLOSE_BRACKET);
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

	public static class VariableOperationsContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableAssigmentContext variableAssigment() {
			return getRuleContext(VariableAssigmentContext.class,0);
		}
		public VariableOperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableOperations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterVariableOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitVariableOperations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitVariableOperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableOperationsContext variableOperations() throws RecognitionException {
		VariableOperationsContext _localctx = new VariableOperationsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableOperations);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				variableAssigment();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(GnocchiParser.ASSIGNMENT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			identifier();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(152);
				match(ASSIGNMENT);
				setState(153);
				value();
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

	public static class VariableAssigmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(GnocchiParser.ASSIGNMENT, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public VariableAssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssigment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterVariableAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitVariableAssigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitVariableAssigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssigmentContext variableAssigment() throws RecognitionException {
		VariableAssigmentContext _localctx = new VariableAssigmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableAssigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			identifier();
			setState(157);
			match(ASSIGNMENT);
			setState(158);
			values();
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

	public static class ValuesContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public MathOperationContext mathOperation() {
			return getRuleContext(MathOperationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_values);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				mathOperation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				identifier();
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

	public static class PrintFunctionContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(GnocchiParser.PRINT, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(GnocchiParser.OPEN_PARENTHESIS, 0); }
		public PrintExpressionContext printExpression() {
			return getRuleContext(PrintExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(GnocchiParser.CLOSE_PARENTHESIS, 0); }
		public PrintFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterPrintFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitPrintFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitPrintFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintFunctionContext printFunction() throws RecognitionException {
		PrintFunctionContext _localctx = new PrintFunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_printFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(PRINT);
			setState(166);
			match(OPEN_PARENTHESIS);
			setState(167);
			printExpression();
			setState(168);
			match(CLOSE_PARENTHESIS);
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

	public static class PrintExpressionContext extends ParserRuleContext {
		public TerminalNode STRING_VALUE() { return getToken(GnocchiParser.STRING_VALUE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MathOperationContext mathOperation() {
			return getRuleContext(MathOperationContext.class,0);
		}
		public PrintExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterPrintExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitPrintExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitPrintExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintExpressionContext printExpression() throws RecognitionException {
		PrintExpressionContext _localctx = new PrintExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_printExpression);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(STRING_VALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				mathOperation();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GnocchiParser.IF, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(GnocchiParser.OPEN_PARENTHESIS, 0); }
		public LogicalOperationContext logicalOperation() {
			return getRuleContext(LogicalOperationContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(GnocchiParser.CLOSE_PARENTHESIS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElsePatternContext elsePattern() {
			return getRuleContext(ElsePatternContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(IF);
			setState(176);
			match(OPEN_PARENTHESIS);
			setState(177);
			logicalOperation();
			setState(178);
			match(CLOSE_PARENTHESIS);
			setState(179);
			body();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(180);
				elsePattern();
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

	public static class ElsePatternContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(GnocchiParser.ELSE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElsePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterElsePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitElsePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitElsePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsePatternContext elsePattern() throws RecognitionException {
		ElsePatternContext _localctx = new ElsePatternContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elsePattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(ELSE);
			setState(184);
			body();
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

	public static class IterationStatementContext extends ParserRuleContext {
		public WhileConditionContext whileCondition() {
			return getRuleContext(WhileConditionContext.class,0);
		}
		public DoConditionContext doCondition() {
			return getRuleContext(DoConditionContext.class,0);
		}
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_iterationStatement);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				whileCondition();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				doCondition();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				forCondition();
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

	public static class WhileConditionContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GnocchiParser.WHILE, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(GnocchiParser.OPEN_PARENTHESIS, 0); }
		public LogicalOperationContext logicalOperation() {
			return getRuleContext(LogicalOperationContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(GnocchiParser.CLOSE_PARENTHESIS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public WhileConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterWhileCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitWhileCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitWhileCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileConditionContext whileCondition() throws RecognitionException {
		WhileConditionContext _localctx = new WhileConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whileCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(WHILE);
			setState(192);
			match(OPEN_PARENTHESIS);
			setState(193);
			logicalOperation();
			setState(194);
			match(CLOSE_PARENTHESIS);
			setState(195);
			body();
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

	public static class DoConditionContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(GnocchiParser.DO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(GnocchiParser.WHILE, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(GnocchiParser.OPEN_PARENTHESIS, 0); }
		public LogicalOperationContext logicalOperation() {
			return getRuleContext(LogicalOperationContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(GnocchiParser.CLOSE_PARENTHESIS, 0); }
		public DoConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterDoCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitDoCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitDoCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoConditionContext doCondition() throws RecognitionException {
		DoConditionContext _localctx = new DoConditionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_doCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(DO);
			setState(198);
			body();
			setState(199);
			match(WHILE);
			setState(200);
			match(OPEN_PARENTHESIS);
			setState(201);
			logicalOperation();
			setState(202);
			match(CLOSE_PARENTHESIS);
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

	public static class ForConditionContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GnocchiParser.FOR, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(GnocchiParser.OPEN_PARENTHESIS, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GnocchiParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GnocchiParser.SEMICOLON, i);
		}
		public LogicalOperationContext logicalOperation() {
			return getRuleContext(LogicalOperationContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(GnocchiParser.CLOSE_PARENTHESIS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitForCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(FOR);
			setState(205);
			match(OPEN_PARENTHESIS);
			setState(206);
			variableDeclaration();
			setState(207);
			match(SEMICOLON);
			setState(208);
			logicalOperation();
			setState(209);
			match(SEMICOLON);
			setState(210);
			unaryExpression();
			setState(211);
			match(CLOSE_PARENTHESIS);
			setState(212);
			body();
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(GnocchiParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(GnocchiParser.DECREMENT, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unaryExpression);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				identifier();
				setState(215);
				match(INCREMENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				identifier();
				setState(218);
				match(DECREMENT);
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

	public static class TypeContext extends ParserRuleContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_type);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				basicType();
				}
				break;
			case OPEN_SQAURE_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				arrayType();
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

	public static class BasicTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GnocchiParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(GnocchiParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(GnocchiParser.STRING, 0); }
		public BasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterBasicType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitBasicType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitBasicType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_basicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << DOUBLE))) != 0)) ) {
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode OPEN_SQAURE_BRACKET() { return getToken(GnocchiParser.OPEN_SQAURE_BRACKET, 0); }
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TerminalNode CLOSE_SQARE_BRACKET() { return getToken(GnocchiParser.CLOSE_SQARE_BRACKET, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(OPEN_SQAURE_BRACKET);
			setState(229);
			basicType();
			setState(230);
			match(CLOSE_SQARE_BRACKET);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT_VALUE() { return getToken(GnocchiParser.INT_VALUE, 0); }
		public TerminalNode DOUBLE_VALUE() { return getToken(GnocchiParser.DOUBLE_VALUE, 0); }
		public TerminalNode STRING_VALUE() { return getToken(GnocchiParser.STRING_VALUE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_VALUE) | (1L << INT_VALUE) | (1L << DOUBLE_VALUE))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public VariableOperationsContext variableOperations() {
			return getRuleContext(VariableOperationsContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public PrintFunctionContext printFunction() {
			return getRuleContext(PrintFunctionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expression);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				variableOperations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				operation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(239);
				printFunction();
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

	public static class OperationContext extends ParserRuleContext {
		public LogicalOperationContext logicalOperation() {
			return getRuleContext(LogicalOperationContext.class,0);
		}
		public MathOperationContext mathOperation() {
			return getRuleContext(MathOperationContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_operation);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				logicalOperation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				mathOperation();
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

	public static class LogicalOperationContext extends ParserRuleContext {
		public List<OpContext> op() {
			return getRuleContexts(OpContext.class);
		}
		public OpContext op(int i) {
			return getRuleContext(OpContext.class,i);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public LogicalOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterLogicalOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitLogicalOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitLogicalOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperationContext logicalOperation() throws RecognitionException {
		LogicalOperationContext _localctx = new LogicalOperationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_logicalOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			op();
			setState(247);
			logicalOperator();
			setState(248);
			op();
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

	public static class MathOperationContext extends ParserRuleContext {
		public List<OpContext> op() {
			return getRuleContexts(OpContext.class);
		}
		public OpContext op(int i) {
			return getRuleContext(OpContext.class,i);
		}
		public List<MathOperatorContext> mathOperator() {
			return getRuleContexts(MathOperatorContext.class);
		}
		public MathOperatorContext mathOperator(int i) {
			return getRuleContext(MathOperatorContext.class,i);
		}
		public MathOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterMathOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitMathOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitMathOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathOperationContext mathOperation() throws RecognitionException {
		MathOperationContext _localctx = new MathOperationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mathOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			op();
			setState(251);
			mathOperator();
			setState(252);
			op();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << DIVIDE) | (1L << MULTIPLY))) != 0)) {
				{
				{
				setState(253);
				mathOperator();
				setState(254);
				op();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class OpContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(261);
				identifier();
				}
				break;
			case STRING_VALUE:
			case INT_VALUE:
			case DOUBLE_VALUE:
				{
				setState(262);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MathOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(GnocchiParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GnocchiParser.MINUS, 0); }
		public TerminalNode DIVIDE() { return getToken(GnocchiParser.DIVIDE, 0); }
		public TerminalNode MULTIPLY() { return getToken(GnocchiParser.MULTIPLY, 0); }
		public MathOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterMathOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitMathOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitMathOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathOperatorContext mathOperator() throws RecognitionException {
		MathOperatorContext _localctx = new MathOperatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_mathOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << DIVIDE) | (1L << MULTIPLY))) != 0)) ) {
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

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(GnocchiParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(GnocchiParser.NOT_EQUALS, 0); }
		public TerminalNode LOWER() { return getToken(GnocchiParser.LOWER, 0); }
		public TerminalNode GREATER() { return getToken(GnocchiParser.GREATER, 0); }
		public TerminalNode LOWER_OR_EQUAL() { return getToken(GnocchiParser.LOWER_OR_EQUAL, 0); }
		public TerminalNode GREATER_OR_EQUAL() { return getToken(GnocchiParser.GREATER_OR_EQUAL, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LOWER) | (1L << GREATER) | (1L << LOWER_OR_EQUAL) | (1L << GREATER_OR_EQUAL))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0110\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5[\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\5\6d\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7m\n\7\f\7\16\7p\13\7\5\7r\n"+
		"\7\3\b\3\b\3\b\7\bw\n\b\f\b\16\bz\13\b\3\t\3\t\3\t\3\t\7\t\u0080\n\t\f"+
		"\t\16\t\u0083\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u008f\n"+
		"\n\f\n\16\n\u0092\13\n\3\n\3\n\3\13\3\13\5\13\u0098\n\13\3\f\3\f\3\f\5"+
		"\f\u009d\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00a6\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u00b0\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00b8\n\21\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u00c0\n\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\5\27\u00df\n\27\3\30\3\30\5\30\u00e3\n\30\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00f3\n\34\3\35\3\35"+
		"\5\35\u00f7\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37"+
		"\u0103\n\37\f\37\16\37\u0106\13\37\3 \3 \5 \u010a\n \3!\3!\3\"\3\"\3\""+
		"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@B\2\6\4\2\r\16\21\21\4\2++-.\3\2\32\35\3\2\24\31\2\u010a\2D\3\2\2\2\4"+
		"N\3\2\2\2\6P\3\2\2\2\bV\3\2\2\2\n_\3\2\2\2\fh\3\2\2\2\16s\3\2\2\2\20{"+
		"\3\2\2\2\22\u008a\3\2\2\2\24\u0097\3\2\2\2\26\u0099\3\2\2\2\30\u009e\3"+
		"\2\2\2\32\u00a5\3\2\2\2\34\u00a7\3\2\2\2\36\u00af\3\2\2\2 \u00b1\3\2\2"+
		"\2\"\u00b9\3\2\2\2$\u00bf\3\2\2\2&\u00c1\3\2\2\2(\u00c7\3\2\2\2*\u00ce"+
		"\3\2\2\2,\u00de\3\2\2\2.\u00e2\3\2\2\2\60\u00e4\3\2\2\2\62\u00e6\3\2\2"+
		"\2\64\u00ea\3\2\2\2\66\u00f2\3\2\2\28\u00f6\3\2\2\2:\u00f8\3\2\2\2<\u00fc"+
		"\3\2\2\2>\u0109\3\2\2\2@\u010b\3\2\2\2B\u010d\3\2\2\2DI\5\6\4\2EH\5\b"+
		"\5\2FH\5\n\6\2GE\3\2\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2"+
		"\2\2KI\3\2\2\2LM\7\2\2\3M\3\3\2\2\2NO\7*\2\2O\5\3\2\2\2PQ\7\5\2\2QR\7"+
		"\7\2\2RS\7$\2\2ST\7%\2\2TU\5\22\n\2U\7\3\2\2\2VW\7\5\2\2WX\5\4\3\2XZ\7"+
		"$\2\2Y[\5\16\b\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7%\2\2]^\5\22\n\2^"+
		"\t\3\2\2\2_`\7\5\2\2`a\5\4\3\2ac\7$\2\2bd\5\16\b\2cb\3\2\2\2cd\3\2\2\2"+
		"de\3\2\2\2ef\7%\2\2fg\5\20\t\2g\13\3\2\2\2hq\5\4\3\2in\5\64\33\2jk\7!"+
		"\2\2km\5\64\33\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2or\3\2\2\2pn\3"+
		"\2\2\2qi\3\2\2\2qr\3\2\2\2r\r\3\2\2\2sx\5\4\3\2tu\7!\2\2uw\5\4\3\2vt\3"+
		"\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\17\3\2\2\2zx\3\2\2\2{\u0081\7\""+
		"\2\2|}\5\66\34\2}~\7\36\2\2~\u0080\3\2\2\2\177|\3\2\2\2\u0080\u0083\3"+
		"\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0085\7\6\2\2\u0085\u0086\5\32\16\2\u0086\u0087\7"+
		"\36\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7#\2\2\u0089\21\3\2\2\2\u008a"+
		"\u0090\7\"\2\2\u008b\u008c\5\66\34\2\u008c\u008d\7\36\2\2\u008d\u008f"+
		"\3\2\2\2\u008e\u008b\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7#"+
		"\2\2\u0094\23\3\2\2\2\u0095\u0098\5\26\f\2\u0096\u0098\5\30\r\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\25\3\2\2\2\u0099\u009c\5\4\3"+
		"\2\u009a\u009b\7\23\2\2\u009b\u009d\5\64\33\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\27\3\2\2\2\u009e\u009f\5\4\3\2\u009f\u00a0\7\23\2"+
		"\2\u00a0\u00a1\5\32\16\2\u00a1\31\3\2\2\2\u00a2\u00a6\5\64\33\2\u00a3"+
		"\u00a6\5<\37\2\u00a4\u00a6\5\4\3\2\u00a5\u00a2\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a4\3\2\2\2\u00a6\33\3\2\2\2\u00a7\u00a8\7\4\2\2\u00a8\u00a9"+
		"\7$\2\2\u00a9\u00aa\5\36\20\2\u00aa\u00ab\7%\2\2\u00ab\35\3\2\2\2\u00ac"+
		"\u00b0\7+\2\2\u00ad\u00b0\5\4\3\2\u00ae\u00b0\5<\37\2\u00af\u00ac\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\37\3\2\2\2\u00b1\u00b2"+
		"\7\b\2\2\u00b2\u00b3\7$\2\2\u00b3\u00b4\5:\36\2\u00b4\u00b5\7%\2\2\u00b5"+
		"\u00b7\5\22\n\2\u00b6\u00b8\5\"\22\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3"+
		"\2\2\2\u00b8!\3\2\2\2\u00b9\u00ba\7\t\2\2\u00ba\u00bb\5\22\n\2\u00bb#"+
		"\3\2\2\2\u00bc\u00c0\5&\24\2\u00bd\u00c0\5(\25\2\u00be\u00c0\5*\26\2\u00bf"+
		"\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0%\3\2\2\2"+
		"\u00c1\u00c2\7\13\2\2\u00c2\u00c3\7$\2\2\u00c3\u00c4\5:\36\2\u00c4\u00c5"+
		"\7%\2\2\u00c5\u00c6\5\22\n\2\u00c6\'\3\2\2\2\u00c7\u00c8\7\f\2\2\u00c8"+
		"\u00c9\5\22\n\2\u00c9\u00ca\7\13\2\2\u00ca\u00cb\7$\2\2\u00cb\u00cc\5"+
		":\36\2\u00cc\u00cd\7%\2\2\u00cd)\3\2\2\2\u00ce\u00cf\7\n\2\2\u00cf\u00d0"+
		"\7$\2\2\u00d0\u00d1\5\26\f\2\u00d1\u00d2\7\36\2\2\u00d2\u00d3\5:\36\2"+
		"\u00d3\u00d4\7\36\2\2\u00d4\u00d5\5,\27\2\u00d5\u00d6\7%\2\2\u00d6\u00d7"+
		"\5\22\n\2\u00d7+\3\2\2\2\u00d8\u00d9\5\4\3\2\u00d9\u00da\7(\2\2\u00da"+
		"\u00df\3\2\2\2\u00db\u00dc\5\4\3\2\u00dc\u00dd\7)\2\2\u00dd\u00df\3\2"+
		"\2\2\u00de\u00d8\3\2\2\2\u00de\u00db\3\2\2\2\u00df-\3\2\2\2\u00e0\u00e3"+
		"\5\60\31\2\u00e1\u00e3\5\62\32\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2"+
		"\2\u00e3/\3\2\2\2\u00e4\u00e5\t\2\2\2\u00e5\61\3\2\2\2\u00e6\u00e7\7&"+
		"\2\2\u00e7\u00e8\5\60\31\2\u00e8\u00e9\7\'\2\2\u00e9\63\3\2\2\2\u00ea"+
		"\u00eb\t\3\2\2\u00eb\65\3\2\2\2\u00ec\u00f3\5\24\13\2\u00ed\u00f3\58\35"+
		"\2\u00ee\u00f3\5\f\7\2\u00ef\u00f3\5 \21\2\u00f0\u00f3\5$\23\2\u00f1\u00f3"+
		"\5\34\17\2\u00f2\u00ec\3\2\2\2\u00f2\u00ed\3\2\2\2\u00f2\u00ee\3\2\2\2"+
		"\u00f2\u00ef\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\67"+
		"\3\2\2\2\u00f4\u00f7\5:\36\2\u00f5\u00f7\5<\37\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f79\3\2\2\2\u00f8\u00f9\5> \2\u00f9\u00fa\5B\"\2\u00fa"+
		"\u00fb\5> \2\u00fb;\3\2\2\2\u00fc\u00fd\5> \2\u00fd\u00fe\5@!\2\u00fe"+
		"\u0104\5> \2\u00ff\u0100\5@!\2\u0100\u0101\5> \2\u0101\u0103\3\2\2\2\u0102"+
		"\u00ff\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105=\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u010a\5\4\3\2\u0108\u010a"+
		"\5\64\33\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a?\3\2\2\2\u010b"+
		"\u010c\t\4\2\2\u010cA\3\2\2\2\u010d\u010e\t\5\2\2\u010eC\3\2\2\2\27GI"+
		"Zcnqx\u0081\u0090\u0097\u009c\u00a5\u00af\u00b7\u00bf\u00de\u00e2\u00f2"+
		"\u00f6\u0104\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}