// Generated from /Users/marcinwloczko/IdeaProjects/kompilatory/src/main/java/Gnocchi.g4 by ANTLR 4.7.1
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
		VAR=1, FUNC=2, RETURN=3, MAIN=4, IF=5, ELSE=6, INT=7, STRING=8, CHAR=9, 
		BOOLEAN=10, DOUBLE=11, DOT=12, ASSIGNMENT=13, EQUALS=14, NOT_EQUALS=15, 
		LOWER=16, GREATER=17, LOWER_OR_EQUAL=18, GREATER_OR_EQUAL=19, PLUS=20, 
		MINUS=21, DIVIDE=22, MULTIPLY=23, SEMICOLON=24, COLON=25, ARROW=26, COMMA=27, 
		OPEN_BRACKET=28, CLOSE_BRACKET=29, OPEN_PARENTHESIS=30, CLOSE_PARENTHESIS=31, 
		IDENTIFIER=32, STRING_VALUE=33, CHAR_VALUE=34, DIGIT=35, INT_VALUE=36, 
		DOUBLE_VALUE=37, BOOLEAN_VALUE=38, Whitespace=39, Newline=40, BlockComment=41, 
		LineComment=42;
	public static final int
		RULE_start = 0, RULE_functionDeclaration = 1, RULE_functionMain = 2, RULE_functionIdentifier = 3, 
		RULE_functionCall = 4, RULE_parameters = 5, RULE_parameterList = 6, RULE_functionBody = 7, 
		RULE_body = 8, RULE_variable = 9, RULE_variableDef = 10, RULE_selectionStatement = 11, 
		RULE_type = 12, RULE_value = 13, RULE_expression = 14, RULE_operation = 15, 
		RULE_operator = 16, RULE_math_operator = 17, RULE_logical_operator = 18;
	public static final String[] ruleNames = {
		"start", "functionDeclaration", "functionMain", "functionIdentifier", 
		"functionCall", "parameters", "parameterList", "functionBody", "body", 
		"variable", "variableDef", "selectionStatement", "type", "value", "expression", 
		"operation", "operator", "math_operator", "logical_operator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "'func'", "'return'", "'main'", "'if'", "'else'", "'Int'", 
		"'String'", "'Char'", "'Bool'", "'Double'", "'.'", "'='", "'=='", "'!='", 
		"'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'/'", "'*'", "';'", "':'", 
		"'=>'", "','", "'{'", "'}'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VAR", "FUNC", "RETURN", "MAIN", "IF", "ELSE", "INT", "STRING", 
		"CHAR", "BOOLEAN", "DOUBLE", "DOT", "ASSIGNMENT", "EQUALS", "NOT_EQUALS", 
		"LOWER", "GREATER", "LOWER_OR_EQUAL", "GREATER_OR_EQUAL", "PLUS", "MINUS", 
		"DIVIDE", "MULTIPLY", "SEMICOLON", "COLON", "ARROW", "COMMA", "OPEN_BRACKET", 
		"CLOSE_BRACKET", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", "IDENTIFIER", 
		"STRING_VALUE", "CHAR_VALUE", "DIGIT", "INT_VALUE", "DOUBLE_VALUE", "BOOLEAN_VALUE", 
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
	public String getGrammarFileName() { return "Gnocchi.g4"; }

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
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(38);
					functionDeclaration();
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(44);
			functionMain();
			setState(45);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GnocchiParser.FUNC, 0); }
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(GnocchiParser.ARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(FUNC);
			setState(48);
			functionIdentifier();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(49);
				match(ARROW);
				setState(50);
				type();
				}
			}

			setState(53);
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

	public static class FunctionMainContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GnocchiParser.FUNC, 0); }
		public TerminalNode MAIN() { return getToken(GnocchiParser.MAIN, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(GnocchiParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(GnocchiParser.CLOSE_PARENTHESIS, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
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
			setState(55);
			match(FUNC);
			setState(56);
			match(MAIN);
			setState(57);
			match(OPEN_PARENTHESIS);
			setState(58);
			match(CLOSE_PARENTHESIS);
			setState(59);
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

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GnocchiParser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(IDENTIFIER);
			setState(62);
			parameters();
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
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
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
		enterRule(_localctx, 8, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			functionIdentifier();
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

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESIS() { return getToken(GnocchiParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(GnocchiParser.CLOSE_PARENTHESIS, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(OPEN_PARENTHESIS);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << STRING_VALUE) | (1L << CHAR_VALUE) | (1L << INT_VALUE) | (1L << DOUBLE_VALUE) | (1L << BOOLEAN_VALUE))) != 0)) {
				{
				setState(67);
				parameterList();
				}
			}

			setState(70);
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
		public List<VariableDefContext> variableDef() {
			return getRuleContexts(VariableDefContext.class);
		}
		public VariableDefContext variableDef(int i) {
			return getRuleContext(VariableDefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GnocchiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GnocchiParser.COMMA, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
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
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				variableDef();
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(73);
					match(COMMA);
					setState(74);
					variableDef();
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING_VALUE:
			case CHAR_VALUE:
			case INT_VALUE:
			case DOUBLE_VALUE:
			case BOOLEAN_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				value();
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(81);
					match(COMMA);
					setState(82);
					value();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(GnocchiParser.OPEN_BRACKET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(GnocchiParser.CLOSE_BRACKET, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(OPEN_BRACKET);
			setState(91);
			body();
			setState(92);
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
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==IDENTIFIER) {
				{
				{
				setState(94);
				expression();
				setState(95);
				match(SEMICOLON);
				}
				}
				setState(101);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GnocchiParser.VAR, 0); }
		public VariableDefContext variableDef() {
			return getRuleContext(VariableDefContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(GnocchiParser.ASSIGNMENT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(VAR);
			setState(103);
			variableDef();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(104);
				match(ASSIGNMENT);
				setState(105);
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

	public static class VariableDefContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GnocchiParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(GnocchiParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterVariableDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitVariableDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitVariableDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefContext variableDef() throws RecognitionException {
		VariableDefContext _localctx = new VariableDefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(IDENTIFIER);
			setState(109);
			match(COLON);
			setState(110);
			type();
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

	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GnocchiParser.IF, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(GnocchiParser.OPEN_PARENTHESIS, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(GnocchiParser.CLOSE_PARENTHESIS, 0); }
		public List<FunctionBodyContext> functionBody() {
			return getRuleContexts(FunctionBodyContext.class);
		}
		public FunctionBodyContext functionBody(int i) {
			return getRuleContext(FunctionBodyContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(GnocchiParser.ELSE, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_selectionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(IF);
			setState(113);
			match(OPEN_PARENTHESIS);
			setState(114);
			operation();
			setState(115);
			match(CLOSE_PARENTHESIS);
			setState(116);
			functionBody();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(117);
				match(ELSE);
				setState(118);
				functionBody();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GnocchiParser.INT, 0); }
		public TerminalNode STRING() { return getToken(GnocchiParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(GnocchiParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(GnocchiParser.BOOLEAN, 0); }
		public TerminalNode DOUBLE() { return getToken(GnocchiParser.DOUBLE, 0); }
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
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << DOUBLE))) != 0)) ) {
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING_VALUE() { return getToken(GnocchiParser.STRING_VALUE, 0); }
		public TerminalNode INT_VALUE() { return getToken(GnocchiParser.INT_VALUE, 0); }
		public TerminalNode CHAR_VALUE() { return getToken(GnocchiParser.CHAR_VALUE, 0); }
		public TerminalNode BOOLEAN_VALUE() { return getToken(GnocchiParser.BOOLEAN_VALUE, 0); }
		public TerminalNode DOUBLE_VALUE() { return getToken(GnocchiParser.DOUBLE_VALUE, 0); }
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
		enterRule(_localctx, 26, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_VALUE) | (1L << CHAR_VALUE) | (1L << INT_VALUE) | (1L << DOUBLE_VALUE) | (1L << BOOLEAN_VALUE))) != 0)) ) {
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
		enterRule(_localctx, 28, RULE_expression);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				operation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
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

	public static class OperationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(GnocchiParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GnocchiParser.IDENTIFIER, i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
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
		enterRule(_localctx, 30, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(IDENTIFIER);
			setState(131);
			operator();
			setState(132);
			match(IDENTIFIER);
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

	public static class OperatorContext extends ParserRuleContext {
		public Math_operatorContext math_operator() {
			return getRuleContext(Math_operatorContext.class,0);
		}
		public Logical_operatorContext logical_operator() {
			return getRuleContext(Logical_operatorContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operator);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case DIVIDE:
			case MULTIPLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				math_operator();
				}
				break;
			case EQUALS:
			case NOT_EQUALS:
			case LOWER:
			case GREATER:
			case LOWER_OR_EQUAL:
			case GREATER_OR_EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				logical_operator();
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

	public static class Math_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(GnocchiParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GnocchiParser.MINUS, 0); }
		public TerminalNode DIVIDE() { return getToken(GnocchiParser.DIVIDE, 0); }
		public TerminalNode MULTIPLY() { return getToken(GnocchiParser.MULTIPLY, 0); }
		public Math_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterMath_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitMath_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitMath_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_operatorContext math_operator() throws RecognitionException {
		Math_operatorContext _localctx = new Math_operatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_math_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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

	public static class Logical_operatorContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(GnocchiParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(GnocchiParser.NOT_EQUALS, 0); }
		public TerminalNode LOWER() { return getToken(GnocchiParser.LOWER, 0); }
		public TerminalNode GREATER() { return getToken(GnocchiParser.GREATER, 0); }
		public TerminalNode LOWER_OR_EQUAL() { return getToken(GnocchiParser.LOWER_OR_EQUAL, 0); }
		public TerminalNode GREATER_OR_EQUAL() { return getToken(GnocchiParser.GREATER_OR_EQUAL, 0); }
		public Logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterLogical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitLogical_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitLogical_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_operatorContext logical_operator() throws RecognitionException {
		Logical_operatorContext _localctx = new Logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0091\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\5\3\66\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\5\7G\n\7\3\7\3\7\3\b\3\b\3\b\7\bN\n\b\f\b\16\bQ\13\b\3\b\3\b"+
		"\3\b\7\bV\n\b\f\b\16\bY\13\b\5\b[\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n"+
		"d\n\n\f\n\16\ng\13\n\3\13\3\13\3\13\3\13\5\13m\n\13\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rz\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20"+
		"\5\20\u0083\n\20\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u008b\n\22\3\23\3"+
		"\23\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"\2\6\3\2\t\r\4\2#$&(\3\2\26\31\3\2\20\25\2\u0089\2+\3\2\2\2\4\61\3\2\2"+
		"\2\69\3\2\2\2\b?\3\2\2\2\nB\3\2\2\2\fD\3\2\2\2\16Z\3\2\2\2\20\\\3\2\2"+
		"\2\22e\3\2\2\2\24h\3\2\2\2\26n\3\2\2\2\30r\3\2\2\2\32{\3\2\2\2\34}\3\2"+
		"\2\2\36\u0082\3\2\2\2 \u0084\3\2\2\2\"\u008a\3\2\2\2$\u008c\3\2\2\2&\u008e"+
		"\3\2\2\2(*\5\4\3\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-"+
		"+\3\2\2\2./\5\6\4\2/\60\7\2\2\3\60\3\3\2\2\2\61\62\7\4\2\2\62\65\5\b\5"+
		"\2\63\64\7\34\2\2\64\66\5\32\16\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3"+
		"\2\2\2\678\5\20\t\28\5\3\2\2\29:\7\4\2\2:;\7\6\2\2;<\7 \2\2<=\7!\2\2="+
		">\5\20\t\2>\7\3\2\2\2?@\7\"\2\2@A\5\f\7\2A\t\3\2\2\2BC\5\b\5\2C\13\3\2"+
		"\2\2DF\7 \2\2EG\5\16\b\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7!\2\2I\r\3\2"+
		"\2\2JO\5\26\f\2KL\7\35\2\2LN\5\26\f\2MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP"+
		"\3\2\2\2P[\3\2\2\2QO\3\2\2\2RW\5\34\17\2ST\7\35\2\2TV\5\34\17\2US\3\2"+
		"\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X[\3\2\2\2YW\3\2\2\2ZJ\3\2\2\2ZR\3\2"+
		"\2\2[\17\3\2\2\2\\]\7\36\2\2]^\5\22\n\2^_\7\37\2\2_\21\3\2\2\2`a\5\36"+
		"\20\2ab\7\32\2\2bd\3\2\2\2c`\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\23"+
		"\3\2\2\2ge\3\2\2\2hi\7\3\2\2il\5\26\f\2jk\7\17\2\2km\5\34\17\2lj\3\2\2"+
		"\2lm\3\2\2\2m\25\3\2\2\2no\7\"\2\2op\7\33\2\2pq\5\32\16\2q\27\3\2\2\2"+
		"rs\7\7\2\2st\7 \2\2tu\5 \21\2uv\7!\2\2vy\5\20\t\2wx\7\b\2\2xz\5\20\t\2"+
		"yw\3\2\2\2yz\3\2\2\2z\31\3\2\2\2{|\t\2\2\2|\33\3\2\2\2}~\t\3\2\2~\35\3"+
		"\2\2\2\177\u0083\5\24\13\2\u0080\u0083\5 \21\2\u0081\u0083\5\n\6\2\u0082"+
		"\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\37\3\2\2\2"+
		"\u0084\u0085\7\"\2\2\u0085\u0086\5\"\22\2\u0086\u0087\7\"\2\2\u0087!\3"+
		"\2\2\2\u0088\u008b\5$\23\2\u0089\u008b\5&\24\2\u008a\u0088\3\2\2\2\u008a"+
		"\u0089\3\2\2\2\u008b#\3\2\2\2\u008c\u008d\t\4\2\2\u008d%\3\2\2\2\u008e"+
		"\u008f\t\5\2\2\u008f\'\3\2\2\2\r+\65FOWZely\u0082\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}