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
		VAR=1, FUNC=2, RETURN=3, MAIN=4, IF=5, ELSE=6, FOR=7, WHILE=8, DO=9, INT=10, 
		STRING=11, CHAR=12, BOOLEAN=13, DOUBLE=14, DOT=15, ASSIGNMENT=16, EQUALS=17, 
		NOT_EQUALS=18, LOWER=19, GREATER=20, LOWER_OR_EQUAL=21, GREATER_OR_EQUAL=22, 
		PLUS=23, MINUS=24, DIVIDE=25, MULTIPLY=26, SEMICOLON=27, COLON=28, ARROW=29, 
		COMMA=30, OPEN_BRACKET=31, CLOSE_BRACKET=32, OPEN_PARENTHESIS=33, CLOSE_PARENTHESIS=34, 
		INCREMENT=35, DECREMENT=36, IDENTIFIER=37, STRING_VALUE=38, CHAR_VALUE=39, 
		INT_VALUE=40, DOUBLE_VALUE=41, BOOLEAN_VALUE=42, Whitespace=43, Newline=44, 
		BlockComment=45, LineComment=46;
	public static final int
		RULE_start = 0, RULE_functionDeclaration = 1, RULE_functionMain = 2, RULE_functionIdentifier = 3, 
		RULE_functionCall = 4, RULE_parameters = 5, RULE_parameterList = 6, RULE_body = 7, 
		RULE_variable = 8, RULE_variableDef = 9, RULE_selectionStatement = 10, 
		RULE_iterationStatement = 11, RULE_forCondition = 12, RULE_unaryExpression = 13, 
		RULE_type = 14, RULE_value = 15, RULE_expression = 16, RULE_operation = 17, 
		RULE_logical_operation = 18, RULE_math_operation = 19, RULE_math_operator = 20, 
		RULE_logical_operator = 21;
	public static final String[] ruleNames = {
		"start", "functionDeclaration", "functionMain", "functionIdentifier", 
		"functionCall", "parameters", "parameterList", "body", "variable", "variableDef", 
		"selectionStatement", "iterationStatement", "forCondition", "unaryExpression", 
		"type", "value", "expression", "operation", "logical_operation", "math_operation", 
		"math_operator", "logical_operator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "'func'", "'return'", "'main'", "'if'", "'else'", "'for'", 
		"'while'", "'do'", "'Int'", "'String'", "'Char'", "'Bool'", "'Double'", 
		"'.'", "'='", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", 
		"'/'", "'*'", "';'", "':'", "'=>'", "','", "'{'", "'}'", "'('", "')'", 
		"'++'", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VAR", "FUNC", "RETURN", "MAIN", "IF", "ELSE", "FOR", "WHILE", "DO", 
		"INT", "STRING", "CHAR", "BOOLEAN", "DOUBLE", "DOT", "ASSIGNMENT", "EQUALS", 
		"NOT_EQUALS", "LOWER", "GREATER", "LOWER_OR_EQUAL", "GREATER_OR_EQUAL", 
		"PLUS", "MINUS", "DIVIDE", "MULTIPLY", "SEMICOLON", "COLON", "ARROW", 
		"COMMA", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", 
		"INCREMENT", "DECREMENT", "IDENTIFIER", "STRING_VALUE", "CHAR_VALUE", 
		"INT_VALUE", "DOUBLE_VALUE", "BOOLEAN_VALUE", "Whitespace", "Newline", 
		"BlockComment", "LineComment"
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
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(44);
					functionDeclaration();
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(50);
			functionMain();
			setState(51);
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
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
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
			setState(53);
			match(FUNC);
			setState(54);
			functionIdentifier();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(55);
				match(ARROW);
				setState(56);
				type();
				}
			}

			setState(59);
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
			setState(61);
			match(FUNC);
			setState(62);
			match(MAIN);
			setState(63);
			match(OPEN_PARENTHESIS);
			setState(64);
			match(CLOSE_PARENTHESIS);
			setState(65);
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
			setState(67);
			match(IDENTIFIER);
			setState(68);
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
			setState(70);
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
			setState(72);
			match(OPEN_PARENTHESIS);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << STRING_VALUE) | (1L << CHAR_VALUE) | (1L << INT_VALUE) | (1L << DOUBLE_VALUE) | (1L << BOOLEAN_VALUE))) != 0)) {
				{
				setState(73);
				parameterList();
				}
			}

			setState(76);
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
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				variableDef();
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(79);
					match(COMMA);
					setState(80);
					variableDef();
					}
					}
					setState(85);
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
				setState(86);
				value();
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(87);
					match(COMMA);
					setState(88);
					value();
					}
					}
					setState(93);
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
		enterRule(_localctx, 14, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(OPEN_BRACKET);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << IDENTIFIER) | (1L << STRING_VALUE) | (1L << CHAR_VALUE) | (1L << INT_VALUE) | (1L << DOUBLE_VALUE) | (1L << BOOLEAN_VALUE))) != 0)) {
				{
				{
				setState(97);
				expression();
				setState(98);
				match(SEMICOLON);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
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
		enterRule(_localctx, 16, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(VAR);
			setState(108);
			variableDef();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(109);
				match(ASSIGNMENT);
				setState(110);
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
		enterRule(_localctx, 18, RULE_variableDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(IDENTIFIER);
			setState(114);
			match(COLON);
			setState(115);
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
		public Logical_operationContext logical_operation() {
			return getRuleContext(Logical_operationContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(GnocchiParser.CLOSE_PARENTHESIS, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
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
		enterRule(_localctx, 20, RULE_selectionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(IF);
			setState(118);
			match(OPEN_PARENTHESIS);
			setState(119);
			logical_operation();
			setState(120);
			match(CLOSE_PARENTHESIS);
			setState(121);
			body();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(122);
				match(ELSE);
				setState(123);
				body();
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

	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GnocchiParser.WHILE, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(GnocchiParser.OPEN_PARENTHESIS, 0); }
		public Logical_operationContext logical_operation() {
			return getRuleContext(Logical_operationContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(GnocchiParser.CLOSE_PARENTHESIS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode DO() { return getToken(GnocchiParser.DO, 0); }
		public TerminalNode FOR() { return getToken(GnocchiParser.FOR, 0); }
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
		enterRule(_localctx, 22, RULE_iterationStatement);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(WHILE);
				setState(127);
				match(OPEN_PARENTHESIS);
				setState(128);
				logical_operation();
				setState(129);
				match(CLOSE_PARENTHESIS);
				setState(130);
				body();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(DO);
				setState(133);
				body();
				setState(134);
				match(WHILE);
				setState(135);
				match(OPEN_PARENTHESIS);
				setState(136);
				logical_operation();
				setState(137);
				match(CLOSE_PARENTHESIS);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(FOR);
				setState(140);
				match(OPEN_PARENTHESIS);
				setState(141);
				forCondition();
				setState(142);
				match(CLOSE_PARENTHESIS);
				setState(143);
				body();
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

	public static class ForConditionContext extends ParserRuleContext {
		public List<TerminalNode> SEMICOLON() { return getTokens(GnocchiParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GnocchiParser.SEMICOLON, i);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GnocchiParser.IDENTIFIER, 0); }
		public Logical_operationContext logical_operation() {
			return getRuleContext(Logical_operationContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
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
		enterRule(_localctx, 24, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(147);
				variable();
				}
				break;
			case IDENTIFIER:
				{
				setState(148);
				match(IDENTIFIER);
				}
				break;
			case SEMICOLON:
				break;
			default:
				break;
			}
			setState(151);
			match(SEMICOLON);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << STRING_VALUE) | (1L << CHAR_VALUE) | (1L << INT_VALUE) | (1L << DOUBLE_VALUE) | (1L << BOOLEAN_VALUE))) != 0)) {
				{
				setState(152);
				logical_operation();
				}
			}

			setState(155);
			match(SEMICOLON);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(156);
				unaryExpression();
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GnocchiParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 26, RULE_unaryExpression);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(IDENTIFIER);
				setState(160);
				match(INCREMENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(IDENTIFIER);
				setState(162);
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
		enterRule(_localctx, 28, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
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
		enterRule(_localctx, 30, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
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
		enterRule(_localctx, 32, RULE_expression);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				operation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				selectionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				iterationStatement();
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
		public Logical_operationContext logical_operation() {
			return getRuleContext(Logical_operationContext.class,0);
		}
		public Math_operationContext math_operation() {
			return getRuleContext(Math_operationContext.class,0);
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
		enterRule(_localctx, 34, RULE_operation);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				logical_operation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				math_operation();
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

	public static class Logical_operationContext extends ParserRuleContext {
		public Logical_operatorContext logical_operator() {
			return getRuleContext(Logical_operatorContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(GnocchiParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GnocchiParser.IDENTIFIER, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Logical_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterLogical_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitLogical_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitLogical_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_operationContext logical_operation() throws RecognitionException {
		Logical_operationContext _localctx = new Logical_operationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logical_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(180);
				match(IDENTIFIER);
				}
				break;
			case STRING_VALUE:
			case CHAR_VALUE:
			case INT_VALUE:
			case DOUBLE_VALUE:
			case BOOLEAN_VALUE:
				{
				setState(181);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(184);
			logical_operator();
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(185);
				match(IDENTIFIER);
				}
				break;
			case STRING_VALUE:
			case CHAR_VALUE:
			case INT_VALUE:
			case DOUBLE_VALUE:
			case BOOLEAN_VALUE:
				{
				setState(186);
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

	public static class Math_operationContext extends ParserRuleContext {
		public Math_operatorContext math_operator() {
			return getRuleContext(Math_operatorContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(GnocchiParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GnocchiParser.IDENTIFIER, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Math_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).enterMath_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GnocchiListener ) ((GnocchiListener)listener).exitMath_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GnocchiVisitor ) return ((GnocchiVisitor<? extends T>)visitor).visitMath_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_operationContext math_operation() throws RecognitionException {
		Math_operationContext _localctx = new Math_operationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_math_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(189);
				match(IDENTIFIER);
				}
				break;
			case STRING_VALUE:
			case CHAR_VALUE:
			case INT_VALUE:
			case DOUBLE_VALUE:
			case BOOLEAN_VALUE:
				{
				setState(190);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(193);
			math_operator();
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(194);
				match(IDENTIFIER);
				}
				break;
			case STRING_VALUE:
			case CHAR_VALUE:
			case INT_VALUE:
			case DOUBLE_VALUE:
			case BOOLEAN_VALUE:
				{
				setState(195);
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
		enterRule(_localctx, 40, RULE_math_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
		enterRule(_localctx, 42, RULE_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u00cd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3<\n\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\5\7M\n\7\3\7\3\7\3\b\3\b\3\b"+
		"\7\bT\n\b\f\b\16\bW\13\b\3\b\3\b\3\b\7\b\\\n\b\f\b\16\b_\13\b\5\ba\n\b"+
		"\3\t\3\t\3\t\3\t\7\tg\n\t\f\t\16\tj\13\t\3\t\3\t\3\n\3\n\3\n\3\n\5\nr"+
		"\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\177\n\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u0094\n\r\3\16\3\16\5\16\u0098\n\16\3\16\3\16\5\16\u009c\n\16\3\16"+
		"\3\16\5\16\u00a0\n\16\3\17\3\17\3\17\3\17\5\17\u00a6\n\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00b1\n\22\3\23\3\23\5\23\u00b5"+
		"\n\23\3\24\3\24\5\24\u00b9\n\24\3\24\3\24\3\24\5\24\u00be\n\24\3\25\3"+
		"\25\5\25\u00c2\n\25\3\25\3\25\3\25\5\25\u00c7\n\25\3\26\3\26\3\27\3\27"+
		"\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\6\3\2\f"+
		"\20\3\2(,\3\2\31\34\3\2\23\30\2\u00cf\2\61\3\2\2\2\4\67\3\2\2\2\6?\3\2"+
		"\2\2\bE\3\2\2\2\nH\3\2\2\2\fJ\3\2\2\2\16`\3\2\2\2\20b\3\2\2\2\22m\3\2"+
		"\2\2\24s\3\2\2\2\26w\3\2\2\2\30\u0093\3\2\2\2\32\u0097\3\2\2\2\34\u00a5"+
		"\3\2\2\2\36\u00a7\3\2\2\2 \u00a9\3\2\2\2\"\u00b0\3\2\2\2$\u00b4\3\2\2"+
		"\2&\u00b8\3\2\2\2(\u00c1\3\2\2\2*\u00c8\3\2\2\2,\u00ca\3\2\2\2.\60\5\4"+
		"\3\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63"+
		"\61\3\2\2\2\64\65\5\6\4\2\65\66\7\2\2\3\66\3\3\2\2\2\678\7\4\2\28;\5\b"+
		"\5\29:\7\37\2\2:<\5\36\20\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\5\20\t\2>"+
		"\5\3\2\2\2?@\7\4\2\2@A\7\6\2\2AB\7#\2\2BC\7$\2\2CD\5\20\t\2D\7\3\2\2\2"+
		"EF\7\'\2\2FG\5\f\7\2G\t\3\2\2\2HI\5\b\5\2I\13\3\2\2\2JL\7#\2\2KM\5\16"+
		"\b\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7$\2\2O\r\3\2\2\2PU\5\24\13\2QR\7"+
		" \2\2RT\5\24\13\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2Va\3\2\2\2WU"+
		"\3\2\2\2X]\5 \21\2YZ\7 \2\2Z\\\5 \21\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2"+
		"]^\3\2\2\2^a\3\2\2\2_]\3\2\2\2`P\3\2\2\2`X\3\2\2\2a\17\3\2\2\2bh\7!\2"+
		"\2cd\5\"\22\2de\7\35\2\2eg\3\2\2\2fc\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2"+
		"\2\2ik\3\2\2\2jh\3\2\2\2kl\7\"\2\2l\21\3\2\2\2mn\7\3\2\2nq\5\24\13\2o"+
		"p\7\22\2\2pr\5 \21\2qo\3\2\2\2qr\3\2\2\2r\23\3\2\2\2st\7\'\2\2tu\7\36"+
		"\2\2uv\5\36\20\2v\25\3\2\2\2wx\7\7\2\2xy\7#\2\2yz\5&\24\2z{\7$\2\2{~\5"+
		"\20\t\2|}\7\b\2\2}\177\5\20\t\2~|\3\2\2\2~\177\3\2\2\2\177\27\3\2\2\2"+
		"\u0080\u0081\7\n\2\2\u0081\u0082\7#\2\2\u0082\u0083\5&\24\2\u0083\u0084"+
		"\7$\2\2\u0084\u0085\5\20\t\2\u0085\u0094\3\2\2\2\u0086\u0087\7\13\2\2"+
		"\u0087\u0088\5\20\t\2\u0088\u0089\7\n\2\2\u0089\u008a\7#\2\2\u008a\u008b"+
		"\5&\24\2\u008b\u008c\7$\2\2\u008c\u0094\3\2\2\2\u008d\u008e\7\t\2\2\u008e"+
		"\u008f\7#\2\2\u008f\u0090\5\32\16\2\u0090\u0091\7$\2\2\u0091\u0092\5\20"+
		"\t\2\u0092\u0094\3\2\2\2\u0093\u0080\3\2\2\2\u0093\u0086\3\2\2\2\u0093"+
		"\u008d\3\2\2\2\u0094\31\3\2\2\2\u0095\u0098\5\22\n\2\u0096\u0098\7\'\2"+
		"\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u009b\7\35\2\2\u009a\u009c\5&\24\2\u009b\u009a\3\2\2\2"+
		"\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\7\35\2\2\u009e\u00a0"+
		"\5\34\17\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\33\3\2\2\2\u00a1"+
		"\u00a2\7\'\2\2\u00a2\u00a6\7%\2\2\u00a3\u00a4\7\'\2\2\u00a4\u00a6\7&\2"+
		"\2\u00a5\u00a1\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\35\3\2\2\2\u00a7\u00a8"+
		"\t\2\2\2\u00a8\37\3\2\2\2\u00a9\u00aa\t\3\2\2\u00aa!\3\2\2\2\u00ab\u00b1"+
		"\5\22\n\2\u00ac\u00b1\5$\23\2\u00ad\u00b1\5\n\6\2\u00ae\u00b1\5\26\f\2"+
		"\u00af\u00b1\5\30\r\2\u00b0\u00ab\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00ad"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1#\3\2\2\2\u00b2"+
		"\u00b5\5&\24\2\u00b3\u00b5\5(\25\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2"+
		"\2\2\u00b5%\3\2\2\2\u00b6\u00b9\7\'\2\2\u00b7\u00b9\5 \21\2\u00b8\u00b6"+
		"\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\5,\27\2\u00bb"+
		"\u00be\7\'\2\2\u00bc\u00be\5 \21\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2"+
		"\2\2\u00be\'\3\2\2\2\u00bf\u00c2\7\'\2\2\u00c0\u00c2\5 \21\2\u00c1\u00bf"+
		"\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c6\5*\26\2\u00c4"+
		"\u00c7\7\'\2\2\u00c5\u00c7\5 \21\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2"+
		"\2\2\u00c7)\3\2\2\2\u00c8\u00c9\t\4\2\2\u00c9+\3\2\2\2\u00ca\u00cb\t\5"+
		"\2\2\u00cb-\3\2\2\2\26\61;LU]`hq~\u0093\u0097\u009b\u009f\u00a5\u00b0"+
		"\u00b4\u00b8\u00bd\u00c1\u00c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}