// Generated from Gnocchi.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GnocchiLexer extends Lexer {
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
		OPEN_SQAURE_BRACKET=35, CLOSE_SQARE_BRACKET=36, INCREMENT=37, DECREMENT=38, 
		IDENT=39, STRING_VALUE=40, CHAR_VALUE=41, INT_VALUE=42, DOUBLE_VALUE=43, 
		BOOLEAN_VALUE=44, Whitespace=45, Newline=46, BlockComment=47, LineComment=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"VAR", "FUNC", "RETURN", "MAIN", "IF", "ELSE", "FOR", "WHILE", "DO", "INT", 
		"STRING", "CHAR", "BOOLEAN", "DOUBLE", "DOT", "ASSIGNMENT", "EQUALS", 
		"NOT_EQUALS", "LOWER", "GREATER", "LOWER_OR_EQUAL", "GREATER_OR_EQUAL", 
		"PLUS", "MINUS", "DIVIDE", "MULTIPLY", "SEMICOLON", "COLON", "ARROW", 
		"COMMA", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", 
		"OPEN_SQAURE_BRACKET", "CLOSE_SQARE_BRACKET", "INCREMENT", "DECREMENT", 
		"IDENT", "STRING_VALUE", "CHAR_VALUE", "DIGIT", "INT_VALUE", "DOUBLE_VALUE", 
		"BOOLEAN_VALUE", "Whitespace", "Newline", "BlockComment", "LineComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "'func'", "'return'", "'main'", "'if'", "'else'", "'for'", 
		"'while'", "'do'", "'Int'", "'String'", "'Char'", "'Bool'", "'Double'", 
		"'.'", "'='", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", 
		"'/'", "'*'", "';'", "':'", "'=>'", "','", "'{'", "'}'", "'('", "')'", 
		"'['", "']'", "'++'", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VAR", "FUNC", "RETURN", "MAIN", "IF", "ELSE", "FOR", "WHILE", "DO", 
		"INT", "STRING", "CHAR", "BOOLEAN", "DOUBLE", "DOT", "ASSIGNMENT", "EQUALS", 
		"NOT_EQUALS", "LOWER", "GREATER", "LOWER_OR_EQUAL", "GREATER_OR_EQUAL", 
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


	public GnocchiLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gnocchi.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u013a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3"+
		"#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\7(\u00e5\n(\f(\16(\u00e8\13"+
		"(\3)\3)\7)\u00ec\n)\f)\16)\u00ef\13)\3)\3)\3*\3*\3+\3+\3,\6,\u00f8\n,"+
		"\r,\16,\u00f9\3-\6-\u00fd\n-\r-\16-\u00fe\3-\3-\6-\u0103\n-\r-\16-\u0104"+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0110\n.\3/\6/\u0113\n/\r/\16/\u0114\3"+
		"/\3/\3\60\3\60\5\60\u011b\n\60\3\60\5\60\u011e\n\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\7\61\u0126\n\61\f\61\16\61\u0129\13\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\7\62\u0134\n\62\f\62\16\62\u0137\13\62\3\62"+
		"\3\62\3\u0127\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U\2W,Y-[.]/_\60a\61c\62"+
		"\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\3\2$$\4\2C\\c|\4\2\13\13\"\"\4\2\f\f"+
		"\17\17\2\u0143\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2"+
		"a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5i\3\2\2\2\7n\3\2\2\2\tu\3\2\2\2\13z\3"+
		"\2\2\2\r}\3\2\2\2\17\u0082\3\2\2\2\21\u0086\3\2\2\2\23\u008c\3\2\2\2\25"+
		"\u008f\3\2\2\2\27\u0093\3\2\2\2\31\u009a\3\2\2\2\33\u009f\3\2\2\2\35\u00a4"+
		"\3\2\2\2\37\u00ab\3\2\2\2!\u00ad\3\2\2\2#\u00af\3\2\2\2%\u00b2\3\2\2\2"+
		"\'\u00b5\3\2\2\2)\u00b7\3\2\2\2+\u00b9\3\2\2\2-\u00bc\3\2\2\2/\u00bf\3"+
		"\2\2\2\61\u00c1\3\2\2\2\63\u00c3\3\2\2\2\65\u00c5\3\2\2\2\67\u00c7\3\2"+
		"\2\29\u00c9\3\2\2\2;\u00cb\3\2\2\2=\u00ce\3\2\2\2?\u00d0\3\2\2\2A\u00d2"+
		"\3\2\2\2C\u00d4\3\2\2\2E\u00d6\3\2\2\2G\u00d8\3\2\2\2I\u00da\3\2\2\2K"+
		"\u00dc\3\2\2\2M\u00df\3\2\2\2O\u00e2\3\2\2\2Q\u00e9\3\2\2\2S\u00f2\3\2"+
		"\2\2U\u00f4\3\2\2\2W\u00f7\3\2\2\2Y\u00fc\3\2\2\2[\u010f\3\2\2\2]\u0112"+
		"\3\2\2\2_\u011d\3\2\2\2a\u0121\3\2\2\2c\u012f\3\2\2\2ef\7x\2\2fg\7c\2"+
		"\2gh\7t\2\2h\4\3\2\2\2ij\7h\2\2jk\7w\2\2kl\7p\2\2lm\7e\2\2m\6\3\2\2\2"+
		"no\7t\2\2op\7g\2\2pq\7v\2\2qr\7w\2\2rs\7t\2\2st\7p\2\2t\b\3\2\2\2uv\7"+
		"o\2\2vw\7c\2\2wx\7k\2\2xy\7p\2\2y\n\3\2\2\2z{\7k\2\2{|\7h\2\2|\f\3\2\2"+
		"\2}~\7g\2\2~\177\7n\2\2\177\u0080\7u\2\2\u0080\u0081\7g\2\2\u0081\16\3"+
		"\2\2\2\u0082\u0083\7h\2\2\u0083\u0084\7q\2\2\u0084\u0085\7t\2\2\u0085"+
		"\20\3\2\2\2\u0086\u0087\7y\2\2\u0087\u0088\7j\2\2\u0088\u0089\7k\2\2\u0089"+
		"\u008a\7n\2\2\u008a\u008b\7g\2\2\u008b\22\3\2\2\2\u008c\u008d\7f\2\2\u008d"+
		"\u008e\7q\2\2\u008e\24\3\2\2\2\u008f\u0090\7K\2\2\u0090\u0091\7p\2\2\u0091"+
		"\u0092\7v\2\2\u0092\26\3\2\2\2\u0093\u0094\7U\2\2\u0094\u0095\7v\2\2\u0095"+
		"\u0096\7t\2\2\u0096\u0097\7k\2\2\u0097\u0098\7p\2\2\u0098\u0099\7i\2\2"+
		"\u0099\30\3\2\2\2\u009a\u009b\7E\2\2\u009b\u009c\7j\2\2\u009c\u009d\7"+
		"c\2\2\u009d\u009e\7t\2\2\u009e\32\3\2\2\2\u009f\u00a0\7D\2\2\u00a0\u00a1"+
		"\7q\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7n\2\2\u00a3\34\3\2\2\2\u00a4\u00a5"+
		"\7F\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a8\7d\2\2\u00a8"+
		"\u00a9\7n\2\2\u00a9\u00aa\7g\2\2\u00aa\36\3\2\2\2\u00ab\u00ac\7\60\2\2"+
		"\u00ac \3\2\2\2\u00ad\u00ae\7?\2\2\u00ae\"\3\2\2\2\u00af\u00b0\7?\2\2"+
		"\u00b0\u00b1\7?\2\2\u00b1$\3\2\2\2\u00b2\u00b3\7#\2\2\u00b3\u00b4\7?\2"+
		"\2\u00b4&\3\2\2\2\u00b5\u00b6\7>\2\2\u00b6(\3\2\2\2\u00b7\u00b8\7@\2\2"+
		"\u00b8*\3\2\2\2\u00b9\u00ba\7>\2\2\u00ba\u00bb\7?\2\2\u00bb,\3\2\2\2\u00bc"+
		"\u00bd\7@\2\2\u00bd\u00be\7?\2\2\u00be.\3\2\2\2\u00bf\u00c0\7-\2\2\u00c0"+
		"\60\3\2\2\2\u00c1\u00c2\7/\2\2\u00c2\62\3\2\2\2\u00c3\u00c4\7\61\2\2\u00c4"+
		"\64\3\2\2\2\u00c5\u00c6\7,\2\2\u00c6\66\3\2\2\2\u00c7\u00c8\7=\2\2\u00c8"+
		"8\3\2\2\2\u00c9\u00ca\7<\2\2\u00ca:\3\2\2\2\u00cb\u00cc\7?\2\2\u00cc\u00cd"+
		"\7@\2\2\u00cd<\3\2\2\2\u00ce\u00cf\7.\2\2\u00cf>\3\2\2\2\u00d0\u00d1\7"+
		"}\2\2\u00d1@\3\2\2\2\u00d2\u00d3\7\177\2\2\u00d3B\3\2\2\2\u00d4\u00d5"+
		"\7*\2\2\u00d5D\3\2\2\2\u00d6\u00d7\7+\2\2\u00d7F\3\2\2\2\u00d8\u00d9\7"+
		"]\2\2\u00d9H\3\2\2\2\u00da\u00db\7_\2\2\u00dbJ\3\2\2\2\u00dc\u00dd\7-"+
		"\2\2\u00dd\u00de\7-\2\2\u00deL\3\2\2\2\u00df\u00e0\7/\2\2\u00e0\u00e1"+
		"\7/\2\2\u00e1N\3\2\2\2\u00e2\u00e6\t\2\2\2\u00e3\u00e5\t\3\2\2\u00e4\u00e3"+
		"\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"P\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ed\7$\2\2\u00ea\u00ec\n\4\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7$\2\2\u00f1"+
		"R\3\2\2\2\u00f2\u00f3\t\5\2\2\u00f3T\3\2\2\2\u00f4\u00f5\4\62;\2\u00f5"+
		"V\3\2\2\2\u00f6\u00f8\5U+\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00faX\3\2\2\2\u00fb\u00fd\5U+\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\5\37\20\2\u0101\u0103\5U+\2\u0102"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105Z\3\2\2\2\u0106\u0107\7v\2\2\u0107\u0108\7t\2\2\u0108\u0109"+
		"\7w\2\2\u0109\u0110\7g\2\2\u010a\u010b\7h\2\2\u010b\u010c\7c\2\2\u010c"+
		"\u010d\7n\2\2\u010d\u010e\7u\2\2\u010e\u0110\7g\2\2\u010f\u0106\3\2\2"+
		"\2\u010f\u010a\3\2\2\2\u0110\\\3\2\2\2\u0111\u0113\t\6\2\2\u0112\u0111"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0117\b/\2\2\u0117^\3\2\2\2\u0118\u011a\7\17\2\2"+
		"\u0119\u011b\7\f\2\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011e"+
		"\3\2\2\2\u011c\u011e\7\f\2\2\u011d\u0118\3\2\2\2\u011d\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0120\b\60\2\2\u0120`\3\2\2\2\u0121\u0122\7\61\2"+
		"\2\u0122\u0123\7,\2\2\u0123\u0127\3\2\2\2\u0124\u0126\13\2\2\2\u0125\u0124"+
		"\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128"+
		"\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7,\2\2\u012b\u012c\7\61"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\u012e\b\61\2\2\u012eb\3\2\2\2\u012f\u0130"+
		"\7\61\2\2\u0130\u0131\7\61\2\2\u0131\u0135\3\2\2\2\u0132\u0134\n\7\2\2"+
		"\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\b\62\2\2"+
		"\u0139d\3\2\2\2\16\2\u00e6\u00ed\u00f9\u00fe\u0104\u010f\u0114\u011a\u011d"+
		"\u0127\u0135\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}