package parser;// Generated from Gnocchi.G4 by ANTLR 4.7.1
import listener.GnocchiListener;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import visitor.GnocchiVisitor;

import java.util.List;

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
		RULE_start = 0, RULE_block = 1, RULE_identifier = 2, RULE_functionMain = 3, 
		RULE_voidFunctionDeclaration = 4, RULE_returningFunctionDeclaration = 5, 
		RULE_functionCall = 6, RULE_parameterList = 7, RULE_functionBody = 8, 
		RULE_body = 9, RULE_variableOperations = 10, RULE_variableDeclaration = 11, 
		RULE_variableFunctionAssigment = 12, RULE_variableAssigment = 13, RULE_values = 14, 
		RULE_printFunction = 15, RULE_printExpression = 16, RULE_ifStatement = 17, 
		RULE_elsePattern = 18, RULE_iterationStatement = 19, RULE_whileCondition = 20, 
		RULE_doCondition = 21, RULE_forCondition = 22, RULE_unaryExpression = 23, 
		RULE_type = 24, RULE_basicType = 25, RULE_arrayType = 26, RULE_value = 27, 
		RULE_expression = 28, RULE_operation = 29, RULE_logicalOperation = 30, 
		RULE_mathOperation = 31, RULE_op = 32, RULE_mathOperator = 33, RULE_logicalOperator = 34;
	public static final String[] ruleNames = {
		"start", "block", "identifier", "functionMain", "voidFunctionDeclaration", 
		"returningFunctionDeclaration", "functionCall", "parameterList", "functionBody", 
		"body", "variableOperations", "variableDeclaration", "variableFunctionAssigment", 
		"variableAssigment", "values", "printFunction", "printExpression", "ifStatement", 
		"elsePattern", "iterationStatement", "whileCondition", "doCondition", 
		"forCondition", "unaryExpression", "type", "basicType", "arrayType", "value", 
		"expression", "operation", "logicalOperation", "mathOperation", "op", 
		"mathOperator", "logicalOperator"
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GnocchiParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			block();
			setState(71);
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

	public static class BlockContext extends ParserRuleContext {
		public FunctionMainContext functionMain() {
			return getRuleContext(FunctionMainContext.class,0);
		}
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
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			functionMain();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				setState(76);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(74);
					voidFunctionDeclaration();
					}
					break;
				case 2:
					{
					setState(75);
					returningFunctionDeclaration();
					}
					break;
				}
				}
				setState(80);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GnocchiParser.IDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterFunctionMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitFunctionMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitFunctionMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionMainContext functionMain() throws RecognitionException {
		FunctionMainContext _localctx = new FunctionMainContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionMain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(FUNC);
			setState(84);
			match(MAIN);
			setState(85);
			match(OPEN_PARENTHESIS);
			setState(86);
			match(CLOSE_PARENTHESIS);
			setState(87);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterVoidFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitVoidFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitVoidFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidFunctionDeclarationContext voidFunctionDeclaration() throws RecognitionException {
		VoidFunctionDeclarationContext _localctx = new VoidFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_voidFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(FUNC);
			setState(90);
			identifier();
			setState(91);
			match(OPEN_PARENTHESIS);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(92);
				parameterList();
				}
			}

			setState(95);
			match(CLOSE_PARENTHESIS);
			setState(96);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterReturningFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitReturningFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitReturningFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturningFunctionDeclarationContext returningFunctionDeclaration() throws RecognitionException {
		ReturningFunctionDeclarationContext _localctx = new ReturningFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returningFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(FUNC);
			setState(99);
			identifier();
			setState(100);
			match(OPEN_PARENTHESIS);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(101);
				parameterList();
				}
			}

			setState(104);
			match(CLOSE_PARENTHESIS);
			setState(105);
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
		public TerminalNode OPEN_PARENTHESIS() { return getToken(GnocchiParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(GnocchiParser.CLOSE_PARENTHESIS, 0); }
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			identifier();
			setState(108);
			match(OPEN_PARENTHESIS);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENT) | (1L << STRING_VALUE) | (1L << INT_VALUE) | (1L << DOUBLE_VALUE))) != 0)) {
				{
				setState(109);
				values();
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(110);
					match(COMMA);
					setState(111);
					values();
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(119);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			identifier();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(122);
				match(COMMA);
				setState(123);
				identifier();
				}
				}
				setState(128);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(OPEN_BRACKET);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << IDENT) | (1L << STRING_VALUE) | (1L << INT_VALUE) | (1L << DOUBLE_VALUE))) != 0)) {
				{
				{
				setState(130);
				expression();
				setState(131);
				match(SEMICOLON);
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(138);
			match(RETURN);
			setState(139);
			values();
			setState(140);
			match(SEMICOLON);
			}
			setState(142);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(OPEN_BRACKET);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << IDENT) | (1L << STRING_VALUE) | (1L << INT_VALUE) | (1L << DOUBLE_VALUE))) != 0)) {
				{
				{
				setState(145);
				expression();
				setState(146);
				match(SEMICOLON);
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterVariableOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitVariableOperations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitVariableOperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableOperationsContext variableOperations() throws RecognitionException {
		VariableOperationsContext _localctx = new VariableOperationsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableOperations);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
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
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			identifier();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(160);
				match(ASSIGNMENT);
				setState(161);
				values();
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

	public static class VariableFunctionAssigmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(GnocchiParser.ASSIGNMENT, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public VariableFunctionAssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableFunctionAssigment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterVariableFunctionAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitVariableFunctionAssigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitVariableFunctionAssigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableFunctionAssigmentContext variableFunctionAssigment() throws RecognitionException {
		VariableFunctionAssigmentContext _localctx = new VariableFunctionAssigmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableFunctionAssigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			identifier();
			setState(165);
			match(ASSIGNMENT);
			setState(166);
			functionCall();
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterVariableAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitVariableAssigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitVariableAssigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssigmentContext variableAssigment() throws RecognitionException {
		VariableAssigmentContext _localctx = new VariableAssigmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableAssigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			identifier();
			setState(169);
			match(ASSIGNMENT);
			setState(170);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_values);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				mathOperation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterPrintFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitPrintFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitPrintFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintFunctionContext printFunction() throws RecognitionException {
		PrintFunctionContext _localctx = new PrintFunctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_printFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(PRINT);
			setState(178);
			match(OPEN_PARENTHESIS);
			setState(179);
			printExpression();
			setState(180);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MathOperationContext mathOperation() {
			return getRuleContext(MathOperationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public PrintExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterPrintExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitPrintExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitPrintExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintExpressionContext printExpression() throws RecognitionException {
		PrintExpressionContext _localctx = new PrintExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_printExpression);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				mathOperation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				functionCall();
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(IF);
			setState(189);
			match(OPEN_PARENTHESIS);
			setState(190);
			logicalOperation();
			setState(191);
			match(CLOSE_PARENTHESIS);
			setState(192);
			body();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(193);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterElsePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitElsePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitElsePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsePatternContext elsePattern() throws RecognitionException {
		ElsePatternContext _localctx = new ElsePatternContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elsePattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(ELSE);
			setState(197);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_iterationStatement);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				whileCondition();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				doCondition();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterWhileCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitWhileCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitWhileCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileConditionContext whileCondition() throws RecognitionException {
		WhileConditionContext _localctx = new WhileConditionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_whileCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(WHILE);
			setState(205);
			match(OPEN_PARENTHESIS);
			setState(206);
			logicalOperation();
			setState(207);
			match(CLOSE_PARENTHESIS);
			setState(208);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterDoCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitDoCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitDoCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoConditionContext doCondition() throws RecognitionException {
		DoConditionContext _localctx = new DoConditionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_doCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(DO);
			setState(211);
			body();
			setState(212);
			match(WHILE);
			setState(213);
			match(OPEN_PARENTHESIS);
			setState(214);
			logicalOperation();
			setState(215);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitForCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(FOR);
			setState(218);
			match(OPEN_PARENTHESIS);
			setState(219);
			variableDeclaration();
			setState(220);
			match(SEMICOLON);
			setState(221);
			logicalOperation();
			setState(222);
			match(SEMICOLON);
			setState(223);
			unaryExpression();
			setState(224);
			match(CLOSE_PARENTHESIS);
			setState(225);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unaryExpression);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				identifier();
				setState(228);
				match(INCREMENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				identifier();
				setState(231);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_type);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				basicType();
				}
				break;
			case OPEN_SQAURE_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterBasicType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitBasicType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitBasicType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_basicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(OPEN_SQAURE_BRACKET);
			setState(242);
			basicType();
			setState(243);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public VariableFunctionAssigmentContext variableFunctionAssigment() {
			return getRuleContext(VariableFunctionAssigmentContext.class,0);
		}
		public VariableOperationsContext variableOperations() {
			return getRuleContext(VariableOperationsContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expression);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				variableFunctionAssigment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				variableOperations();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				operation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				iterationStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(253);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_operation);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				logicalOperation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterLogicalOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitLogicalOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitLogicalOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperationContext logicalOperation() throws RecognitionException {
		LogicalOperationContext _localctx = new LogicalOperationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_logicalOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			op();
			setState(261);
			logicalOperator();
			setState(262);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterMathOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitMathOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitMathOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathOperationContext mathOperation() throws RecognitionException {
		MathOperationContext _localctx = new MathOperationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_mathOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			op();
			setState(265);
			mathOperator();
			setState(266);
			op();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << DIVIDE) | (1L << MULTIPLY))) != 0)) {
				{
				{
				setState(267);
				mathOperator();
				setState(268);
				op();
				}
				}
				setState(274);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(275);
				identifier();
				}
				break;
			case STRING_VALUE:
			case INT_VALUE:
			case DOUBLE_VALUE:
				{
				setState(276);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterMathOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitMathOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitMathOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathOperatorContext mathOperator() throws RecognitionException {
		MathOperatorContext _localctx = new MathOperatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mathOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
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
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener) ((GnocchiListener)listener).exitLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor) return ((GnocchiVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u011e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\3\3\3\3\3\7\3O\n\3\f\3\16\3R\13"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6`\n\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\5\7i\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\bs\n\b\f"+
		"\b\16\bv\13\b\5\bx\n\b\3\b\3\b\3\t\3\t\3\t\7\t\177\n\t\f\t\16\t\u0082"+
		"\13\t\3\n\3\n\3\n\3\n\7\n\u0088\n\n\f\n\16\n\u008b\13\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u0097\n\13\f\13\16\13\u009a\13\13"+
		"\3\13\3\13\3\f\3\f\5\f\u00a0\n\f\3\r\3\r\3\r\5\r\u00a5\n\r\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u00b2\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u00bd\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00c5\n\23\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u00cd\n"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\5\31\u00ec\n\31\3\32\3\32\5\32\u00f0\n\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0101\n\36"+
		"\3\37\3\37\5\37\u0105\n\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\7!\u0111\n!\f"+
		"!\16!\u0114\13!\3\"\3\"\5\"\u0118\n\"\3#\3#\3$\3$\3$\2\2%\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\6\4\2\r\16"+
		"\21\21\4\2++-.\3\2\32\35\3\2\24\31\2\u0118\2H\3\2\2\2\4K\3\2\2\2\6S\3"+
		"\2\2\2\bU\3\2\2\2\n[\3\2\2\2\fd\3\2\2\2\16m\3\2\2\2\20{\3\2\2\2\22\u0083"+
		"\3\2\2\2\24\u0092\3\2\2\2\26\u009f\3\2\2\2\30\u00a1\3\2\2\2\32\u00a6\3"+
		"\2\2\2\34\u00aa\3\2\2\2\36\u00b1\3\2\2\2 \u00b3\3\2\2\2\"\u00bc\3\2\2"+
		"\2$\u00be\3\2\2\2&\u00c6\3\2\2\2(\u00cc\3\2\2\2*\u00ce\3\2\2\2,\u00d4"+
		"\3\2\2\2.\u00db\3\2\2\2\60\u00eb\3\2\2\2\62\u00ef\3\2\2\2\64\u00f1\3\2"+
		"\2\2\66\u00f3\3\2\2\28\u00f7\3\2\2\2:\u0100\3\2\2\2<\u0104\3\2\2\2>\u0106"+
		"\3\2\2\2@\u010a\3\2\2\2B\u0117\3\2\2\2D\u0119\3\2\2\2F\u011b\3\2\2\2H"+
		"I\5\4\3\2IJ\7\2\2\3J\3\3\2\2\2KP\5\b\5\2LO\5\n\6\2MO\5\f\7\2NL\3\2\2\2"+
		"NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\5\3\2\2\2RP\3\2\2\2ST\7*\2\2"+
		"T\7\3\2\2\2UV\7\5\2\2VW\7\7\2\2WX\7$\2\2XY\7%\2\2YZ\5\24\13\2Z\t\3\2\2"+
		"\2[\\\7\5\2\2\\]\5\6\4\2]_\7$\2\2^`\5\20\t\2_^\3\2\2\2_`\3\2\2\2`a\3\2"+
		"\2\2ab\7%\2\2bc\5\24\13\2c\13\3\2\2\2de\7\5\2\2ef\5\6\4\2fh\7$\2\2gi\5"+
		"\20\t\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7%\2\2kl\5\22\n\2l\r\3\2\2\2m"+
		"n\5\6\4\2nw\7$\2\2ot\5\36\20\2pq\7!\2\2qs\5\36\20\2rp\3\2\2\2sv\3\2\2"+
		"\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2wo\3\2\2\2wx\3\2\2\2xy\3\2\2"+
		"\2yz\7%\2\2z\17\3\2\2\2{\u0080\5\6\4\2|}\7!\2\2}\177\5\6\4\2~|\3\2\2\2"+
		"\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\21\3\2\2\2"+
		"\u0082\u0080\3\2\2\2\u0083\u0089\7\"\2\2\u0084\u0085\5:\36\2\u0085\u0086"+
		"\7\36\2\2\u0086\u0088\3\2\2\2\u0087\u0084\3\2\2\2\u0088\u008b\3\2\2\2"+
		"\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008c\u008d\7\6\2\2\u008d\u008e\5\36\20\2\u008e\u008f\7\36\2"+
		"\2\u008f\u0090\3\2\2\2\u0090\u0091\7#\2\2\u0091\23\3\2\2\2\u0092\u0098"+
		"\7\"\2\2\u0093\u0094\5:\36\2\u0094\u0095\7\36\2\2\u0095\u0097\3\2\2\2"+
		"\u0096\u0093\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7#\2\2\u009c"+
		"\25\3\2\2\2\u009d\u00a0\5\30\r\2\u009e\u00a0\5\34\17\2\u009f\u009d\3\2"+
		"\2\2\u009f\u009e\3\2\2\2\u00a0\27\3\2\2\2\u00a1\u00a4\5\6\4\2\u00a2\u00a3"+
		"\7\23\2\2\u00a3\u00a5\5\36\20\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2"+
		"\2\u00a5\31\3\2\2\2\u00a6\u00a7\5\6\4\2\u00a7\u00a8\7\23\2\2\u00a8\u00a9"+
		"\5\16\b\2\u00a9\33\3\2\2\2\u00aa\u00ab\5\6\4\2\u00ab\u00ac\7\23\2\2\u00ac"+
		"\u00ad\5\36\20\2\u00ad\35\3\2\2\2\u00ae\u00b2\58\35\2\u00af\u00b2\5@!"+
		"\2\u00b0\u00b2\5\6\4\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0"+
		"\3\2\2\2\u00b2\37\3\2\2\2\u00b3\u00b4\7\4\2\2\u00b4\u00b5\7$\2\2\u00b5"+
		"\u00b6\5\"\22\2\u00b6\u00b7\7%\2\2\u00b7!\3\2\2\2\u00b8\u00bd\58\35\2"+
		"\u00b9\u00bd\5\6\4\2\u00ba\u00bd\5@!\2\u00bb\u00bd\5\16\b\2\u00bc\u00b8"+
		"\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"#\3\2\2\2\u00be\u00bf\7\b\2\2\u00bf\u00c0\7$\2\2\u00c0\u00c1\5> \2\u00c1"+
		"\u00c2\7%\2\2\u00c2\u00c4\5\24\13\2\u00c3\u00c5\5&\24\2\u00c4\u00c3\3"+
		"\2\2\2\u00c4\u00c5\3\2\2\2\u00c5%\3\2\2\2\u00c6\u00c7\7\t\2\2\u00c7\u00c8"+
		"\5\24\13\2\u00c8\'\3\2\2\2\u00c9\u00cd\5*\26\2\u00ca\u00cd\5,\27\2\u00cb"+
		"\u00cd\5.\30\2\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2"+
		"\2\2\u00cd)\3\2\2\2\u00ce\u00cf\7\13\2\2\u00cf\u00d0\7$\2\2\u00d0\u00d1"+
		"\5> \2\u00d1\u00d2\7%\2\2\u00d2\u00d3\5\24\13\2\u00d3+\3\2\2\2\u00d4\u00d5"+
		"\7\f\2\2\u00d5\u00d6\5\24\13\2\u00d6\u00d7\7\13\2\2\u00d7\u00d8\7$\2\2"+
		"\u00d8\u00d9\5> \2\u00d9\u00da\7%\2\2\u00da-\3\2\2\2\u00db\u00dc\7\n\2"+
		"\2\u00dc\u00dd\7$\2\2\u00dd\u00de\5\30\r\2\u00de\u00df\7\36\2\2\u00df"+
		"\u00e0\5> \2\u00e0\u00e1\7\36\2\2\u00e1\u00e2\5\60\31\2\u00e2\u00e3\7"+
		"%\2\2\u00e3\u00e4\5\24\13\2\u00e4/\3\2\2\2\u00e5\u00e6\5\6\4\2\u00e6\u00e7"+
		"\7(\2\2\u00e7\u00ec\3\2\2\2\u00e8\u00e9\5\6\4\2\u00e9\u00ea\7)\2\2\u00ea"+
		"\u00ec\3\2\2\2\u00eb\u00e5\3\2\2\2\u00eb\u00e8\3\2\2\2\u00ec\61\3\2\2"+
		"\2\u00ed\u00f0\5\64\33\2\u00ee\u00f0\5\66\34\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\63\3\2\2\2\u00f1\u00f2\t\2\2\2\u00f2\65\3\2\2\2\u00f3"+
		"\u00f4\7&\2\2\u00f4\u00f5\5\64\33\2\u00f5\u00f6\7\'\2\2\u00f6\67\3\2\2"+
		"\2\u00f7\u00f8\t\3\2\2\u00f89\3\2\2\2\u00f9\u0101\5\16\b\2\u00fa\u0101"+
		"\5\32\16\2\u00fb\u0101\5\26\f\2\u00fc\u0101\5<\37\2\u00fd\u0101\5$\23"+
		"\2\u00fe\u0101\5(\25\2\u00ff\u0101\5 \21\2\u0100\u00f9\3\2\2\2\u0100\u00fa"+
		"\3\2\2\2\u0100\u00fb\3\2\2\2\u0100\u00fc\3\2\2\2\u0100\u00fd\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101;\3\2\2\2\u0102\u0105\5> \2\u0103"+
		"\u0105\5@!\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105=\3\2\2\2\u0106"+
		"\u0107\5B\"\2\u0107\u0108\5F$\2\u0108\u0109\5B\"\2\u0109?\3\2\2\2\u010a"+
		"\u010b\5B\"\2\u010b\u010c\5D#\2\u010c\u0112\5B\"\2\u010d\u010e\5D#\2\u010e"+
		"\u010f\5B\"\2\u010f\u0111\3\2\2\2\u0110\u010d\3\2\2\2\u0111\u0114\3\2"+
		"\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113A\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0115\u0118\5\6\4\2\u0116\u0118\58\35\2\u0117\u0115\3\2\2\2\u0117"+
		"\u0116\3\2\2\2\u0118C\3\2\2\2\u0119\u011a\t\4\2\2\u011aE\3\2\2\2\u011b"+
		"\u011c\t\5\2\2\u011cG\3\2\2\2\27NP_htw\u0080\u0089\u0098\u009f\u00a4\u00b1"+
		"\u00bc\u00c4\u00cc\u00eb\u00ef\u0100\u0104\u0112\u0117";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}