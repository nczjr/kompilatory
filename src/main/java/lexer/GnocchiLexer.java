package lexer;// Generated from Gnocchi.G4 by ANTLR 4.7.1
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
		VAR=1, PRINT=2, FUNC=3, RETURN=4, MAIN=5, IF=6, ELSE=7, FOR=8, WHILE=9, 
		DO=10, INT=11, STRING=12, CHAR=13, BOOLEAN=14, DOUBLE=15, DOT=16, ASSIGNMENT=17, 
		EQUALS=18, NOT_EQUALS=19, LOWER=20, GREATER=21, LOWER_OR_EQUAL=22, GREATER_OR_EQUAL=23, 
		PLUS=24, MINUS=25, DIVIDE=26, MULTIPLY=27, SEMICOLON=28, COLON=29, ARROW=30, 
		COMMA=31, OPEN_BRACKET=32, CLOSE_BRACKET=33, OPEN_PARENTHESIS=34, CLOSE_PARENTHESIS=35, 
		OPEN_SQAURE_BRACKET=36, CLOSE_SQARE_BRACKET=37, INCREMENT=38, DECREMENT=39, 
		IDENT=40, STRING_VALUE=41, CHAR_VALUE=42, INT_VALUE=43, DOUBLE_VALUE=44, 
		BOOLEAN_VALUE=45, Whitespace=46, Newline=47, BlockComment=48, LineComment=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"VAR", "PRINT", "FUNC", "RETURN", "MAIN", "IF", "ELSE", "FOR", "WHILE", 
		"DO", "INT", "STRING", "CHAR", "BOOLEAN", "DOUBLE", "DOT", "ASSIGNMENT", 
		"EQUALS", "NOT_EQUALS", "LOWER", "GREATER", "LOWER_OR_EQUAL", "GREATER_OR_EQUAL", 
		"PLUS", "MINUS", "DIVIDE", "MULTIPLY", "SEMICOLON", "COLON", "ARROW", 
		"COMMA", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", 
		"OPEN_SQAURE_BRACKET", "CLOSE_SQARE_BRACKET", "INCREMENT", "DECREMENT", 
		"IDENT", "STRING_VALUE", "CHAR_VALUE", "DIGIT", "INT_VALUE", "DOUBLE_VALUE", 
		"BOOLEAN_VALUE", "Whitespace", "Newline", "BlockComment", "LineComment"
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


	public GnocchiLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gnocchi.G4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0142\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3"+
		"(\3)\3)\7)\u00ed\n)\f)\16)\u00f0\13)\3*\3*\7*\u00f4\n*\f*\16*\u00f7\13"+
		"*\3*\3*\3+\3+\3,\3,\3-\6-\u0100\n-\r-\16-\u0101\3.\6.\u0105\n.\r.\16."+
		"\u0106\3.\3.\6.\u010b\n.\r.\16.\u010c\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0118"+
		"\n/\3\60\6\60\u011b\n\60\r\60\16\60\u011c\3\60\3\60\3\61\3\61\5\61\u0123"+
		"\n\61\3\61\5\61\u0126\n\61\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u012e\n"+
		"\62\f\62\16\62\u0131\13\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\7\63\u013c\n\63\f\63\16\63\u013f\13\63\3\63\3\63\3\u012f\2\64\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W\2Y-[.]/_\60a\61c\62e\63\3\2\b\5\2C\\aac|\6\2\62"+
		";C\\aac|\3\2$$\4\2C\\c|\4\2\13\13\"\"\4\2\f\f\17\17\2\u014b\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\3g\3\2\2\2\5k\3\2\2\2\7q\3\2\2\2\tv\3\2\2\2\13}\3\2\2\2\r\u0082"+
		"\3\2\2\2\17\u0085\3\2\2\2\21\u008a\3\2\2\2\23\u008e\3\2\2\2\25\u0094\3"+
		"\2\2\2\27\u0097\3\2\2\2\31\u009b\3\2\2\2\33\u00a2\3\2\2\2\35\u00a7\3\2"+
		"\2\2\37\u00ac\3\2\2\2!\u00b3\3\2\2\2#\u00b5\3\2\2\2%\u00b7\3\2\2\2\'\u00ba"+
		"\3\2\2\2)\u00bd\3\2\2\2+\u00bf\3\2\2\2-\u00c1\3\2\2\2/\u00c4\3\2\2\2\61"+
		"\u00c7\3\2\2\2\63\u00c9\3\2\2\2\65\u00cb\3\2\2\2\67\u00cd\3\2\2\29\u00cf"+
		"\3\2\2\2;\u00d1\3\2\2\2=\u00d3\3\2\2\2?\u00d6\3\2\2\2A\u00d8\3\2\2\2C"+
		"\u00da\3\2\2\2E\u00dc\3\2\2\2G\u00de\3\2\2\2I\u00e0\3\2\2\2K\u00e2\3\2"+
		"\2\2M\u00e4\3\2\2\2O\u00e7\3\2\2\2Q\u00ea\3\2\2\2S\u00f1\3\2\2\2U\u00fa"+
		"\3\2\2\2W\u00fc\3\2\2\2Y\u00ff\3\2\2\2[\u0104\3\2\2\2]\u0117\3\2\2\2_"+
		"\u011a\3\2\2\2a\u0125\3\2\2\2c\u0129\3\2\2\2e\u0137\3\2\2\2gh\7x\2\2h"+
		"i\7c\2\2ij\7t\2\2j\4\3\2\2\2kl\7r\2\2lm\7t\2\2mn\7k\2\2no\7p\2\2op\7v"+
		"\2\2p\6\3\2\2\2qr\7h\2\2rs\7w\2\2st\7p\2\2tu\7e\2\2u\b\3\2\2\2vw\7t\2"+
		"\2wx\7g\2\2xy\7v\2\2yz\7w\2\2z{\7t\2\2{|\7p\2\2|\n\3\2\2\2}~\7o\2\2~\177"+
		"\7c\2\2\177\u0080\7k\2\2\u0080\u0081\7p\2\2\u0081\f\3\2\2\2\u0082\u0083"+
		"\7k\2\2\u0083\u0084\7h\2\2\u0084\16\3\2\2\2\u0085\u0086\7g\2\2\u0086\u0087"+
		"\7n\2\2\u0087\u0088\7u\2\2\u0088\u0089\7g\2\2\u0089\20\3\2\2\2\u008a\u008b"+
		"\7h\2\2\u008b\u008c\7q\2\2\u008c\u008d\7t\2\2\u008d\22\3\2\2\2\u008e\u008f"+
		"\7y\2\2\u008f\u0090\7j\2\2\u0090\u0091\7k\2\2\u0091\u0092\7n\2\2\u0092"+
		"\u0093\7g\2\2\u0093\24\3\2\2\2\u0094\u0095\7f\2\2\u0095\u0096\7q\2\2\u0096"+
		"\26\3\2\2\2\u0097\u0098\7K\2\2\u0098\u0099\7p\2\2\u0099\u009a\7v\2\2\u009a"+
		"\30\3\2\2\2\u009b\u009c\7U\2\2\u009c\u009d\7v\2\2\u009d\u009e\7t\2\2\u009e"+
		"\u009f\7k\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7i\2\2\u00a1\32\3\2\2\2\u00a2"+
		"\u00a3\7E\2\2\u00a3\u00a4\7j\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7t\2\2"+
		"\u00a6\34\3\2\2\2\u00a7\u00a8\7D\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7"+
		"q\2\2\u00aa\u00ab\7n\2\2\u00ab\36\3\2\2\2\u00ac\u00ad\7F\2\2\u00ad\u00ae"+
		"\7q\2\2\u00ae\u00af\7w\2\2\u00af\u00b0\7d\2\2\u00b0\u00b1\7n\2\2\u00b1"+
		"\u00b2\7g\2\2\u00b2 \3\2\2\2\u00b3\u00b4\7\60\2\2\u00b4\"\3\2\2\2\u00b5"+
		"\u00b6\7?\2\2\u00b6$\3\2\2\2\u00b7\u00b8\7?\2\2\u00b8\u00b9\7?\2\2\u00b9"+
		"&\3\2\2\2\u00ba\u00bb\7#\2\2\u00bb\u00bc\7?\2\2\u00bc(\3\2\2\2\u00bd\u00be"+
		"\7>\2\2\u00be*\3\2\2\2\u00bf\u00c0\7@\2\2\u00c0,\3\2\2\2\u00c1\u00c2\7"+
		">\2\2\u00c2\u00c3\7?\2\2\u00c3.\3\2\2\2\u00c4\u00c5\7@\2\2\u00c5\u00c6"+
		"\7?\2\2\u00c6\60\3\2\2\2\u00c7\u00c8\7-\2\2\u00c8\62\3\2\2\2\u00c9\u00ca"+
		"\7/\2\2\u00ca\64\3\2\2\2\u00cb\u00cc\7\61\2\2\u00cc\66\3\2\2\2\u00cd\u00ce"+
		"\7,\2\2\u00ce8\3\2\2\2\u00cf\u00d0\7=\2\2\u00d0:\3\2\2\2\u00d1\u00d2\7"+
		"<\2\2\u00d2<\3\2\2\2\u00d3\u00d4\7?\2\2\u00d4\u00d5\7@\2\2\u00d5>\3\2"+
		"\2\2\u00d6\u00d7\7.\2\2\u00d7@\3\2\2\2\u00d8\u00d9\7}\2\2\u00d9B\3\2\2"+
		"\2\u00da\u00db\7\177\2\2\u00dbD\3\2\2\2\u00dc\u00dd\7*\2\2\u00ddF\3\2"+
		"\2\2\u00de\u00df\7+\2\2\u00dfH\3\2\2\2\u00e0\u00e1\7]\2\2\u00e1J\3\2\2"+
		"\2\u00e2\u00e3\7_\2\2\u00e3L\3\2\2\2\u00e4\u00e5\7-\2\2\u00e5\u00e6\7"+
		"-\2\2\u00e6N\3\2\2\2\u00e7\u00e8\7/\2\2\u00e8\u00e9\7/\2\2\u00e9P\3\2"+
		"\2\2\u00ea\u00ee\t\2\2\2\u00eb\u00ed\t\3\2\2\u00ec\u00eb\3\2\2\2\u00ed"+
		"\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00efR\3\2\2\2"+
		"\u00f0\u00ee\3\2\2\2\u00f1\u00f5\7$\2\2\u00f2\u00f4\n\4\2\2\u00f3\u00f2"+
		"\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\7$\2\2\u00f9T\3\2\2\2\u00fa"+
		"\u00fb\t\5\2\2\u00fbV\3\2\2\2\u00fc\u00fd\4\62;\2\u00fdX\3\2\2\2\u00fe"+
		"\u0100\5W,\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2"+
		"\2\u0101\u0102\3\2\2\2\u0102Z\3\2\2\2\u0103\u0105\5W,\2\u0104\u0103\3"+
		"\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010a\5!\21\2\u0109\u010b\5W,\2\u010a\u0109\3\2\2"+
		"\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\\"+
		"\3\2\2\2\u010e\u010f\7v\2\2\u010f\u0110\7t\2\2\u0110\u0111\7w\2\2\u0111"+
		"\u0118\7g\2\2\u0112\u0113\7h\2\2\u0113\u0114\7c\2\2\u0114\u0115\7n\2\2"+
		"\u0115\u0116\7u\2\2\u0116\u0118\7g\2\2\u0117\u010e\3\2\2\2\u0117\u0112"+
		"\3\2\2\2\u0118^\3\2\2\2\u0119\u011b\t\6\2\2\u011a\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\u011f\b\60\2\2\u011f`\3\2\2\2\u0120\u0122\7\17\2\2\u0121\u0123"+
		"\7\f\2\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0126\3\2\2\2\u0124"+
		"\u0126\7\f\2\2\u0125\u0120\3\2\2\2\u0125\u0124\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u0128\b\61\2\2\u0128b\3\2\2\2\u0129\u012a\7\61\2\2\u012a\u012b"+
		"\7,\2\2\u012b\u012f\3\2\2\2\u012c\u012e\13\2\2\2\u012d\u012c\3\2\2\2\u012e"+
		"\u0131\3\2\2\2\u012f\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0132\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0132\u0133\7,\2\2\u0133\u0134\7\61\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0136\b\62\2\2\u0136d\3\2\2\2\u0137\u0138\7\61\2"+
		"\2\u0138\u0139\7\61\2\2\u0139\u013d\3\2\2\2\u013a\u013c\n\7\2\2\u013b"+
		"\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\b\63\2\2\u0141"+
		"f\3\2\2\2\16\2\u00ee\u00f5\u0101\u0106\u010c\u0117\u011c\u0122\u0125\u012f"+
		"\u013d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}