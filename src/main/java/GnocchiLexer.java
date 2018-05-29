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
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, FUNC=2, RETURN=3, MAIN=4, ASSIGNMENT=5, EQUALS=6, NOT_EQUALS=7, 
		LOWER=8, GREATER=9, LOWER_OR_EQUAL=10, GREATER_OR_EQUAL=11, PLUS=12, MINUS=13, 
		DIVIDE=14, MULTIPLY=15, SEMICOLON=16, COLON=17, ARROW=18, COMMA=19, OPEN_BRACKET=20, 
		CLOSE_BRACKET=21, OPEN_PARENTHESIS=22, CLOSE_PARENTHESIS=23, IDENTIFIER=24, 
		INT=25, STRING=26, CHAR=27, BOOLEAN=28, DOUBLE=29, DOT=30, Whitespace=31, 
		Newline=32, BlockComment=33, LineComment=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"VAR", "FUNC", "RETURN", "MAIN", "ASSIGNMENT", "EQUALS", "NOT_EQUALS", 
		"LOWER", "GREATER", "LOWER_OR_EQUAL", "GREATER_OR_EQUAL", "PLUS", "MINUS", 
		"DIVIDE", "MULTIPLY", "SEMICOLON", "COLON", "ARROW", "COMMA", "OPEN_BRACKET", 
		"CLOSE_BRACKET", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", "IDENTIFIER", 
		"INT", "STRING", "CHAR", "BOOLEAN", "DOUBLE", "DOT", "STRING_VALUE", "CHARACTER_VALUE", 
		"DIGIT", "INT_VALUE", "DOUBLE_VALUE", "BOOLEAN_VALUE", "Whitespace", "Newline", 
		"BlockComment", "LineComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "'func'", "'return'", "'main'", "'='", "'=='", "'!='", 
		"'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'/'", "'*'", "';'", "':'", 
		"'=>'", "','", "'{'", "'}'", "'('", "')'", null, "'Int'", "'String'", 
		"'Char'", "'Bool'", "'Double'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VAR", "FUNC", "RETURN", "MAIN", "ASSIGNMENT", "EQUALS", "NOT_EQUALS", 
		"LOWER", "GREATER", "LOWER_OR_EQUAL", "GREATER_OR_EQUAL", "PLUS", "MINUS", 
		"DIVIDE", "MULTIPLY", "SEMICOLON", "COLON", "ARROW", "COMMA", "OPEN_BRACKET", 
		"CLOSE_BRACKET", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", "IDENTIFIER", 
		"INT", "STRING", "CHAR", "BOOLEAN", "DOUBLE", "DOT", "Whitespace", "Newline", 
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
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u0105\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\7\31\u0096\n\31\f\31\16\31\u0099\13\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \6 \u00ba\n \r \16"+
		" \u00bb\3!\3!\3\"\3\"\3#\6#\u00c3\n#\r#\16#\u00c4\3$\6$\u00c8\n$\r$\16"+
		"$\u00c9\3$\3$\6$\u00ce\n$\r$\16$\u00cf\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u00db"+
		"\n%\3&\6&\u00de\n&\r&\16&\u00df\3&\3&\3\'\3\'\5\'\u00e6\n\'\3\'\5\'\u00e9"+
		"\n\'\3\'\3\'\3(\3(\3(\3(\7(\u00f1\n(\f(\16(\u00f4\13(\3(\3(\3(\3(\3(\3"+
		")\3)\3)\3)\7)\u00ff\n)\f)\16)\u0102\13)\3)\3)\3\u00f2\2*\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?\2A\2C\2E"+
		"\2G\2I\2K!M\"O#Q$\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\4\2C\\c|\4\2\13\13\""+
		"\"\4\2\f\f\17\17\u0109\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2"+
		"\2\2Q\3\2\2\2\3S\3\2\2\2\5W\3\2\2\2\7\\\3\2\2\2\tc\3\2\2\2\13h\3\2\2\2"+
		"\rj\3\2\2\2\17m\3\2\2\2\21p\3\2\2\2\23r\3\2\2\2\25t\3\2\2\2\27w\3\2\2"+
		"\2\31z\3\2\2\2\33|\3\2\2\2\35~\3\2\2\2\37\u0080\3\2\2\2!\u0082\3\2\2\2"+
		"#\u0084\3\2\2\2%\u0086\3\2\2\2\'\u0089\3\2\2\2)\u008b\3\2\2\2+\u008d\3"+
		"\2\2\2-\u008f\3\2\2\2/\u0091\3\2\2\2\61\u0093\3\2\2\2\63\u009a\3\2\2\2"+
		"\65\u009e\3\2\2\2\67\u00a5\3\2\2\29\u00aa\3\2\2\2;\u00af\3\2\2\2=\u00b6"+
		"\3\2\2\2?\u00b9\3\2\2\2A\u00bd\3\2\2\2C\u00bf\3\2\2\2E\u00c2\3\2\2\2G"+
		"\u00c7\3\2\2\2I\u00da\3\2\2\2K\u00dd\3\2\2\2M\u00e8\3\2\2\2O\u00ec\3\2"+
		"\2\2Q\u00fa\3\2\2\2ST\7x\2\2TU\7c\2\2UV\7t\2\2V\4\3\2\2\2WX\7h\2\2XY\7"+
		"w\2\2YZ\7p\2\2Z[\7e\2\2[\6\3\2\2\2\\]\7t\2\2]^\7g\2\2^_\7v\2\2_`\7w\2"+
		"\2`a\7t\2\2ab\7p\2\2b\b\3\2\2\2cd\7o\2\2de\7c\2\2ef\7k\2\2fg\7p\2\2g\n"+
		"\3\2\2\2hi\7?\2\2i\f\3\2\2\2jk\7?\2\2kl\7?\2\2l\16\3\2\2\2mn\7#\2\2no"+
		"\7?\2\2o\20\3\2\2\2pq\7>\2\2q\22\3\2\2\2rs\7@\2\2s\24\3\2\2\2tu\7>\2\2"+
		"uv\7?\2\2v\26\3\2\2\2wx\7@\2\2xy\7?\2\2y\30\3\2\2\2z{\7-\2\2{\32\3\2\2"+
		"\2|}\7/\2\2}\34\3\2\2\2~\177\7\61\2\2\177\36\3\2\2\2\u0080\u0081\7,\2"+
		"\2\u0081 \3\2\2\2\u0082\u0083\7=\2\2\u0083\"\3\2\2\2\u0084\u0085\7<\2"+
		"\2\u0085$\3\2\2\2\u0086\u0087\7?\2\2\u0087\u0088\7@\2\2\u0088&\3\2\2\2"+
		"\u0089\u008a\7.\2\2\u008a(\3\2\2\2\u008b\u008c\7}\2\2\u008c*\3\2\2\2\u008d"+
		"\u008e\7\177\2\2\u008e,\3\2\2\2\u008f\u0090\7*\2\2\u0090.\3\2\2\2\u0091"+
		"\u0092\7+\2\2\u0092\60\3\2\2\2\u0093\u0097\t\2\2\2\u0094\u0096\t\3\2\2"+
		"\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\62\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7K\2\2\u009b"+
		"\u009c\7p\2\2\u009c\u009d\7v\2\2\u009d\64\3\2\2\2\u009e\u009f\7U\2\2\u009f"+
		"\u00a0\7v\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7p\2\2"+
		"\u00a3\u00a4\7i\2\2\u00a4\66\3\2\2\2\u00a5\u00a6\7E\2\2\u00a6\u00a7\7"+
		"j\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7t\2\2\u00a98\3\2\2\2\u00aa\u00ab"+
		"\7D\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7n\2\2\u00ae"+
		":\3\2\2\2\u00af\u00b0\7F\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7w\2\2\u00b2"+
		"\u00b3\7d\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7g\2\2\u00b5<\3\2\2\2\u00b6"+
		"\u00b7\7\60\2\2\u00b7>\3\2\2\2\u00b8\u00ba\5A!\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc@\3\2\2\2"+
		"\u00bd\u00be\t\4\2\2\u00beB\3\2\2\2\u00bf\u00c0\4\62;\2\u00c0D\3\2\2\2"+
		"\u00c1\u00c3\5C\"\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5F\3\2\2\2\u00c6\u00c8\5C\"\2\u00c7\u00c6"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cd\5=\37\2\u00cc\u00ce\5C\"\2\u00cd\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"H\3\2\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7w\2\2\u00d4"+
		"\u00db\7g\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7n\2\2"+
		"\u00d8\u00d9\7u\2\2\u00d9\u00db\7g\2\2\u00da\u00d1\3\2\2\2\u00da\u00d5"+
		"\3\2\2\2\u00dbJ\3\2\2\2\u00dc\u00de\t\5\2\2\u00dd\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e2\b&\2\2\u00e2L\3\2\2\2\u00e3\u00e5\7\17\2\2\u00e4\u00e6"+
		"\7\f\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e9\7\f\2\2\u00e8\u00e3\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00eb\b\'\2\2\u00ebN\3\2\2\2\u00ec\u00ed\7\61\2\2\u00ed\u00ee"+
		"\7,\2\2\u00ee\u00f2\3\2\2\2\u00ef\u00f1\13\2\2\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"\u00f4\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f5\3\2"+
		"\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7,\2\2\u00f6\u00f7\7\61\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\b(\2\2\u00f9P\3\2\2\2\u00fa\u00fb\7\61\2\2"+
		"\u00fb\u00fc\7\61\2\2\u00fc\u0100\3\2\2\2\u00fd\u00ff\n\6\2\2\u00fe\u00fd"+
		"\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\b)\2\2\u0104R\3\2\2\2\16"+
		"\2\u0097\u00bb\u00c4\u00c9\u00cf\u00da\u00df\u00e5\u00e8\u00f2\u0100\3"+
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