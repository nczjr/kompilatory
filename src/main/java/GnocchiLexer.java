// Generated from /Users/marcinwloczko/Desktop/Gramatyka/Gnocchi.g4 by ANTLR 4.7.1
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
		CIUL=1, VAR=2, FUNC=3, RETURN=4, MAIN=5, INT=6, STRING=7, CHAR=8, BOOLEAN=9, 
		DOUBLE=10, DOT=11, ASSIGNMENT=12, EQUALS=13, NOT_EQUALS=14, LOWER=15, 
		GREATER=16, LOWER_OR_EQUAL=17, GREATER_OR_EQUAL=18, PLUS=19, MINUS=20, 
		DIVIDE=21, MULTIPLY=22, SEMICOLON=23, COLON=24, ARROW=25, COMMA=26, OPEN_BRACKET=27, 
		CLOSE_BRACKET=28, OPEN_PARENTHESIS=29, CLOSE_PARENTHESIS=30, IDENTIFIER=31, 
		STRING_VALUE=32, CHAR_VALUE=33, DIGIT=34, INT_VALUE=35, DOUBLE_VALUE=36, 
		BOOLEAN_VALUE=37, Whitespace=38, Newline=39, BlockComment=40, LineComment=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CIUL", "VAR", "FUNC", "RETURN", "MAIN", "INT", "STRING", "CHAR", "BOOLEAN", 
		"DOUBLE", "DOT", "ASSIGNMENT", "EQUALS", "NOT_EQUALS", "LOWER", "GREATER", 
		"LOWER_OR_EQUAL", "GREATER_OR_EQUAL", "PLUS", "MINUS", "DIVIDE", "MULTIPLY", 
		"SEMICOLON", "COLON", "ARROW", "COMMA", "OPEN_BRACKET", "CLOSE_BRACKET", 
		"OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", "IDENTIFIER", "STRING_VALUE", 
		"CHAR_VALUE", "DIGIT", "INT_VALUE", "DOUBLE_VALUE", "BOOLEAN_VALUE", "Whitespace", 
		"Newline", "BlockComment", "LineComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'ciul'", "'var'", "'func'", "'return'", "'main'", "'Int'", "'String'", 
		"'Char'", "'Bool'", "'Double'", "'.'", "'='", "'=='", "'!='", "'<'", "'>'", 
		"'<='", "'>='", "'+'", "'-'", "'/'", "'*'", "';'", "':'", "'=>'", "','", 
		"'{'", "'}'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CIUL", "VAR", "FUNC", "RETURN", "MAIN", "INT", "STRING", "CHAR", 
		"BOOLEAN", "DOUBLE", "DOT", "ASSIGNMENT", "EQUALS", "NOT_EQUALS", "LOWER", 
		"GREATER", "LOWER_OR_EQUAL", "GREATER_OR_EQUAL", "PLUS", "MINUS", "DIVIDE", 
		"MULTIPLY", "SEMICOLON", "COLON", "ARROW", "COMMA", "OPEN_BRACKET", "CLOSE_BRACKET", 
		"OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", "IDENTIFIER", "STRING_VALUE", 
		"CHAR_VALUE", "DIGIT", "INT_VALUE", "DOUBLE_VALUE", "BOOLEAN_VALUE", "Whitespace", 
		"Newline", "BlockComment", "LineComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u010c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \7 \u00bb\n \f \16 \u00be\13 \3!\6!\u00c1\n!\r!\16"+
		"!\u00c2\3\"\3\"\3#\3#\3$\6$\u00ca\n$\r$\16$\u00cb\3%\6%\u00cf\n%\r%\16"+
		"%\u00d0\3%\3%\6%\u00d5\n%\r%\16%\u00d6\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u00e2"+
		"\n&\3\'\6\'\u00e5\n\'\r\'\16\'\u00e6\3\'\3\'\3(\3(\5(\u00ed\n(\3(\5(\u00f0"+
		"\n(\3(\3(\3)\3)\3)\3)\7)\u00f8\n)\f)\16)\u00fb\13)\3)\3)\3)\3)\3)\3*\3"+
		"*\3*\3*\7*\u0106\n*\f*\16*\u0109\13*\3*\3*\3\u00f9\2+\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\4\2C\\c|\4\2\13\13\"\"\4\2"+
		"\f\f\17\17\2\u0116\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\3U\3\2\2\2\5Z\3\2\2\2\7^\3\2\2\2\tc\3\2\2\2\13j\3\2\2"+
		"\2\ro\3\2\2\2\17s\3\2\2\2\21z\3\2\2\2\23\177\3\2\2\2\25\u0084\3\2\2\2"+
		"\27\u008b\3\2\2\2\31\u008d\3\2\2\2\33\u008f\3\2\2\2\35\u0092\3\2\2\2\37"+
		"\u0095\3\2\2\2!\u0097\3\2\2\2#\u0099\3\2\2\2%\u009c\3\2\2\2\'\u009f\3"+
		"\2\2\2)\u00a1\3\2\2\2+\u00a3\3\2\2\2-\u00a5\3\2\2\2/\u00a7\3\2\2\2\61"+
		"\u00a9\3\2\2\2\63\u00ab\3\2\2\2\65\u00ae\3\2\2\2\67\u00b0\3\2\2\29\u00b2"+
		"\3\2\2\2;\u00b4\3\2\2\2=\u00b6\3\2\2\2?\u00b8\3\2\2\2A\u00c0\3\2\2\2C"+
		"\u00c4\3\2\2\2E\u00c6\3\2\2\2G\u00c9\3\2\2\2I\u00ce\3\2\2\2K\u00e1\3\2"+
		"\2\2M\u00e4\3\2\2\2O\u00ef\3\2\2\2Q\u00f3\3\2\2\2S\u0101\3\2\2\2UV\7e"+
		"\2\2VW\7k\2\2WX\7w\2\2XY\7n\2\2Y\4\3\2\2\2Z[\7x\2\2[\\\7c\2\2\\]\7t\2"+
		"\2]\6\3\2\2\2^_\7h\2\2_`\7w\2\2`a\7p\2\2ab\7e\2\2b\b\3\2\2\2cd\7t\2\2"+
		"de\7g\2\2ef\7v\2\2fg\7w\2\2gh\7t\2\2hi\7p\2\2i\n\3\2\2\2jk\7o\2\2kl\7"+
		"c\2\2lm\7k\2\2mn\7p\2\2n\f\3\2\2\2op\7K\2\2pq\7p\2\2qr\7v\2\2r\16\3\2"+
		"\2\2st\7U\2\2tu\7v\2\2uv\7t\2\2vw\7k\2\2wx\7p\2\2xy\7i\2\2y\20\3\2\2\2"+
		"z{\7E\2\2{|\7j\2\2|}\7c\2\2}~\7t\2\2~\22\3\2\2\2\177\u0080\7D\2\2\u0080"+
		"\u0081\7q\2\2\u0081\u0082\7q\2\2\u0082\u0083\7n\2\2\u0083\24\3\2\2\2\u0084"+
		"\u0085\7F\2\2\u0085\u0086\7q\2\2\u0086\u0087\7w\2\2\u0087\u0088\7d\2\2"+
		"\u0088\u0089\7n\2\2\u0089\u008a\7g\2\2\u008a\26\3\2\2\2\u008b\u008c\7"+
		"\60\2\2\u008c\30\3\2\2\2\u008d\u008e\7?\2\2\u008e\32\3\2\2\2\u008f\u0090"+
		"\7?\2\2\u0090\u0091\7?\2\2\u0091\34\3\2\2\2\u0092\u0093\7#\2\2\u0093\u0094"+
		"\7?\2\2\u0094\36\3\2\2\2\u0095\u0096\7>\2\2\u0096 \3\2\2\2\u0097\u0098"+
		"\7@\2\2\u0098\"\3\2\2\2\u0099\u009a\7>\2\2\u009a\u009b\7?\2\2\u009b$\3"+
		"\2\2\2\u009c\u009d\7@\2\2\u009d\u009e\7?\2\2\u009e&\3\2\2\2\u009f\u00a0"+
		"\7-\2\2\u00a0(\3\2\2\2\u00a1\u00a2\7/\2\2\u00a2*\3\2\2\2\u00a3\u00a4\7"+
		"\61\2\2\u00a4,\3\2\2\2\u00a5\u00a6\7,\2\2\u00a6.\3\2\2\2\u00a7\u00a8\7"+
		"=\2\2\u00a8\60\3\2\2\2\u00a9\u00aa\7<\2\2\u00aa\62\3\2\2\2\u00ab\u00ac"+
		"\7?\2\2\u00ac\u00ad\7@\2\2\u00ad\64\3\2\2\2\u00ae\u00af\7.\2\2\u00af\66"+
		"\3\2\2\2\u00b0\u00b1\7}\2\2\u00b18\3\2\2\2\u00b2\u00b3\7\177\2\2\u00b3"+
		":\3\2\2\2\u00b4\u00b5\7*\2\2\u00b5<\3\2\2\2\u00b6\u00b7\7+\2\2\u00b7>"+
		"\3\2\2\2\u00b8\u00bc\t\2\2\2\u00b9\u00bb\t\3\2\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd@\3\2\2\2"+
		"\u00be\u00bc\3\2\2\2\u00bf\u00c1\5C\"\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3B\3\2\2\2\u00c4"+
		"\u00c5\t\4\2\2\u00c5D\3\2\2\2\u00c6\u00c7\4\62;\2\u00c7F\3\2\2\2\u00c8"+
		"\u00ca\5E#\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2"+
		"\2\u00cb\u00cc\3\2\2\2\u00ccH\3\2\2\2\u00cd\u00cf\5E#\2\u00ce\u00cd\3"+
		"\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d4\5\27\f\2\u00d3\u00d5\5E#\2\u00d4\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"J\3\2\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7w\2\2\u00db"+
		"\u00e2\7g\2\2\u00dc\u00dd\7h\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7n\2\2"+
		"\u00df\u00e0\7u\2\2\u00e0\u00e2\7g\2\2\u00e1\u00d8\3\2\2\2\u00e1\u00dc"+
		"\3\2\2\2\u00e2L\3\2\2\2\u00e3\u00e5\t\5\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00e9\b\'\2\2\u00e9N\3\2\2\2\u00ea\u00ec\7\17\2\2\u00eb\u00ed"+
		"\7\f\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00f0\7\f\2\2\u00ef\u00ea\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00f2\b(\2\2\u00f2P\3\2\2\2\u00f3\u00f4\7\61\2\2\u00f4\u00f5"+
		"\7,\2\2\u00f5\u00f9\3\2\2\2\u00f6\u00f8\13\2\2\2\u00f7\u00f6\3\2\2\2\u00f8"+
		"\u00fb\3\2\2\2\u00f9\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7,\2\2\u00fd\u00fe\7\61\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\b)\2\2\u0100R\3\2\2\2\u0101\u0102\7\61\2\2"+
		"\u0102\u0103\7\61\2\2\u0103\u0107\3\2\2\2\u0104\u0106\n\6\2\2\u0105\u0104"+
		"\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\b*\2\2\u010bT\3\2\2\2\16"+
		"\2\u00bc\u00c2\u00cb\u00d0\u00d6\u00e1\u00e6\u00ec\u00ef\u00f9\u0107\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}