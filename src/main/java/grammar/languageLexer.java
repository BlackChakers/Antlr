// Generated from C:/Users/thetr/Desktop/Antlr/src/main/java/grammar\language.g4 by ANTLR 4.9.2
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class languageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GREATHER=1, LESSER=2, EQUAL=3, GREATHEROREQUAL=4, LESSEROREQUAL=5, ISNOTEQUAL=6, 
		IF=7, ELSE=8, PLUS=9, MINUS=10, MULTIPLIKATION=11, DIVISION=12, POWER_OF=13, 
		OR=14, STOP=15, FOR=16, WHILE=17, FOREVER=18, START=19, COMMA=20, AT_SIGN=21, 
		VOID=22, LPAR=23, RPAR=24, LCBRAC=25, RCBRAC=26, INT_TYPE=27, DOUBLE_TYPE=28, 
		TXT_TYPE=29, BOOL_TYPE=30, ASSIGN=31, INT=32, DOT=33, DOUBLE=34, TXT=35, 
		BOOL=36, TRUE=37, FALSE=38, ID=39, WS=40, COMMENT=41, LINE_COMMENT=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"GREATHER", "LESSER", "EQUAL", "GREATHEROREQUAL", "LESSEROREQUAL", "ISNOTEQUAL", 
			"IF", "ELSE", "PLUS", "MINUS", "MULTIPLIKATION", "DIVISION", "POWER_OF", 
			"OR", "STOP", "FOR", "WHILE", "FOREVER", "START", "COMMA", "AT_SIGN", 
			"VOID", "LPAR", "RPAR", "LCBRAC", "RCBRAC", "INT_TYPE", "DOUBLE_TYPE", 
			"TXT_TYPE", "BOOL_TYPE", "ASSIGN", "INT", "DOT", "DOUBLE", "TXT", "BOOL", 
			"TRUE", "FALSE", "ID", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'if'", "'else'", "'+'", "'-'", 
			"'*'", "'/'", "'^'", "'||'", "'stop'", "'for'", "'while'", "'forever'", 
			"'start'", "','", "'@'", "'void'", "'('", "')'", "'{'", "'}'", "'int'", 
			"'double'", "'txt'", "'bool'", "'='", null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GREATHER", "LESSER", "EQUAL", "GREATHEROREQUAL", "LESSEROREQUAL", 
			"ISNOTEQUAL", "IF", "ELSE", "PLUS", "MINUS", "MULTIPLIKATION", "DIVISION", 
			"POWER_OF", "OR", "STOP", "FOR", "WHILE", "FOREVER", "START", "COMMA", 
			"AT_SIGN", "VOID", "LPAR", "RPAR", "LCBRAC", "RCBRAC", "INT_TYPE", "DOUBLE_TYPE", 
			"TXT_TYPE", "BOOL_TYPE", "ASSIGN", "INT", "DOT", "DOUBLE", "TXT", "BOOL", 
			"TRUE", "FALSE", "ID", "WS", "COMMENT", "LINE_COMMENT"
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


	public languageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "language.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0158\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2a\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3j\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4s\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0088\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u009b\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u00ab\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3!\6!\u0107\n!\r!\16!\u0108\3\"\3\"\3#\6#\u010e\n#\r"+
		"#\16#\u010f\3#\3#\6#\u0114\n#\r#\16#\u0115\3$\3$\6$\u011a\n$\r$\16$\u011b"+
		"\3%\3%\5%\u0120\n%\3&\3&\3&\3&\3&\5&\u0127\n&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\5\'\u012f\n\'\3(\5(\u0132\n(\3(\6(\u0135\n(\r(\16(\u0136\3)\6)\u013a"+
		"\n)\r)\16)\u013b\3)\3)\3*\3*\3*\3*\7*\u0144\n*\f*\16*\u0147\13*\3*\3*"+
		"\3*\3*\3*\3+\3+\3+\3+\7+\u0152\n+\f+\16+\u0155\13+\3+\3+\3\u0145\2,\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3\2\t\3\2\62;\3\2c|\3\2C\\\4\2aac|\6\2\62"+
		";C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u0169\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3`\3\2\2\2\5"+
		"i\3\2\2\2\7r\3\2\2\2\t\u0087\3\2\2\2\13\u009a\3\2\2\2\r\u00aa\3\2\2\2"+
		"\17\u00ac\3\2\2\2\21\u00af\3\2\2\2\23\u00b4\3\2\2\2\25\u00b6\3\2\2\2\27"+
		"\u00b8\3\2\2\2\31\u00ba\3\2\2\2\33\u00bc\3\2\2\2\35\u00be\3\2\2\2\37\u00c1"+
		"\3\2\2\2!\u00c6\3\2\2\2#\u00ca\3\2\2\2%\u00d0\3\2\2\2\'\u00d8\3\2\2\2"+
		")\u00de\3\2\2\2+\u00e0\3\2\2\2-\u00e2\3\2\2\2/\u00e7\3\2\2\2\61\u00e9"+
		"\3\2\2\2\63\u00eb\3\2\2\2\65\u00ed\3\2\2\2\67\u00ef\3\2\2\29\u00f3\3\2"+
		"\2\2;\u00fa\3\2\2\2=\u00fe\3\2\2\2?\u0103\3\2\2\2A\u0106\3\2\2\2C\u010a"+
		"\3\2\2\2E\u010d\3\2\2\2G\u0117\3\2\2\2I\u011f\3\2\2\2K\u0126\3\2\2\2M"+
		"\u012e\3\2\2\2O\u0131\3\2\2\2Q\u0139\3\2\2\2S\u013f\3\2\2\2U\u014d\3\2"+
		"\2\2Wa\7@\2\2XY\7I\2\2YZ\7t\2\2Z[\7g\2\2[\\\7c\2\2\\]\7v\2\2]^\7j\2\2"+
		"^_\7g\2\2_a\7t\2\2`W\3\2\2\2`X\3\2\2\2a\4\3\2\2\2bj\7>\2\2cd\7N\2\2de"+
		"\7g\2\2ef\7u\2\2fg\7u\2\2gh\7g\2\2hj\7t\2\2ib\3\2\2\2ic\3\2\2\2j\6\3\2"+
		"\2\2kl\7?\2\2ls\7?\2\2mn\7G\2\2no\7s\2\2op\7w\2\2pq\7c\2\2qs\7n\2\2rk"+
		"\3\2\2\2rm\3\2\2\2s\b\3\2\2\2tu\7@\2\2u\u0088\7?\2\2vw\7I\2\2wx\7t\2\2"+
		"xy\7g\2\2yz\7c\2\2z{\7v\2\2{|\7j\2\2|}\7g\2\2}~\7t\2\2~\177\7a\2\2\177"+
		"\u0080\7q\2\2\u0080\u0081\7t\2\2\u0081\u0082\7a\2\2\u0082\u0083\7g\2\2"+
		"\u0083\u0084\7s\2\2\u0084\u0085\7w\2\2\u0085\u0086\7c\2\2\u0086\u0088"+
		"\7n\2\2\u0087t\3\2\2\2\u0087v\3\2\2\2\u0088\n\3\2\2\2\u0089\u008a\7>\2"+
		"\2\u008a\u009b\7?\2\2\u008b\u008c\7N\2\2\u008c\u008d\7g\2\2\u008d\u008e"+
		"\7u\2\2\u008e\u008f\7u\2\2\u008f\u0090\7g\2\2\u0090\u0091\7t\2\2\u0091"+
		"\u0092\7a\2\2\u0092\u0093\7q\2\2\u0093\u0094\7t\2\2\u0094\u0095\7a\2\2"+
		"\u0095\u0096\7g\2\2\u0096\u0097\7s\2\2\u0097\u0098\7w\2\2\u0098\u0099"+
		"\7c\2\2\u0099\u009b\7n\2\2\u009a\u0089\3\2\2\2\u009a\u008b\3\2\2\2\u009b"+
		"\f\3\2\2\2\u009c\u009d\7#\2\2\u009d\u00ab\7?\2\2\u009e\u009f\7K\2\2\u009f"+
		"\u00a0\7u\2\2\u00a0\u00a1\7a\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7q\2\2"+
		"\u00a3\u00a4\7v\2\2\u00a4\u00a5\7a\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7"+
		"\7s\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7c\2\2\u00a9\u00ab\7n\2\2\u00aa"+
		"\u009c\3\2\2\2\u00aa\u009e\3\2\2\2\u00ab\16\3\2\2\2\u00ac\u00ad\7k\2\2"+
		"\u00ad\u00ae\7h\2\2\u00ae\20\3\2\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7"+
		"n\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7g\2\2\u00b3\22\3\2\2\2\u00b4\u00b5"+
		"\7-\2\2\u00b5\24\3\2\2\2\u00b6\u00b7\7/\2\2\u00b7\26\3\2\2\2\u00b8\u00b9"+
		"\7,\2\2\u00b9\30\3\2\2\2\u00ba\u00bb\7\61\2\2\u00bb\32\3\2\2\2\u00bc\u00bd"+
		"\7`\2\2\u00bd\34\3\2\2\2\u00be\u00bf\7~\2\2\u00bf\u00c0\7~\2\2\u00c0\36"+
		"\3\2\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7q\2\2\u00c4"+
		"\u00c5\7r\2\2\u00c5 \3\2\2\2\u00c6\u00c7\7h\2\2\u00c7\u00c8\7q\2\2\u00c8"+
		"\u00c9\7t\2\2\u00c9\"\3\2\2\2\u00ca\u00cb\7y\2\2\u00cb\u00cc\7j\2\2\u00cc"+
		"\u00cd\7k\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7g\2\2\u00cf$\3\2\2\2\u00d0"+
		"\u00d1\7h\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7g\2\2"+
		"\u00d4\u00d5\7x\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7t\2\2\u00d7&\3\2\2"+
		"\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7c\2\2\u00db\u00dc"+
		"\7t\2\2\u00dc\u00dd\7v\2\2\u00dd(\3\2\2\2\u00de\u00df\7.\2\2\u00df*\3"+
		"\2\2\2\u00e0\u00e1\7B\2\2\u00e1,\3\2\2\2\u00e2\u00e3\7x\2\2\u00e3\u00e4"+
		"\7q\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7f\2\2\u00e6.\3\2\2\2\u00e7\u00e8"+
		"\7*\2\2\u00e8\60\3\2\2\2\u00e9\u00ea\7+\2\2\u00ea\62\3\2\2\2\u00eb\u00ec"+
		"\7}\2\2\u00ec\64\3\2\2\2\u00ed\u00ee\7\177\2\2\u00ee\66\3\2\2\2\u00ef"+
		"\u00f0\7k\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7v\2\2\u00f28\3\2\2\2\u00f3"+
		"\u00f4\7f\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7w\2\2\u00f6\u00f7\7d\2\2"+
		"\u00f7\u00f8\7n\2\2\u00f8\u00f9\7g\2\2\u00f9:\3\2\2\2\u00fa\u00fb\7v\2"+
		"\2\u00fb\u00fc\7z\2\2\u00fc\u00fd\7v\2\2\u00fd<\3\2\2\2\u00fe\u00ff\7"+
		"d\2\2\u00ff\u0100\7q\2\2\u0100\u0101\7q\2\2\u0101\u0102\7n\2\2\u0102>"+
		"\3\2\2\2\u0103\u0104\7?\2\2\u0104@\3\2\2\2\u0105\u0107\t\2\2\2\u0106\u0105"+
		"\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"B\3\2\2\2\u010a\u010b\7\60\2\2\u010bD\3\2\2\2\u010c\u010e\t\2\2\2\u010d"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0113\5C\"\2\u0112\u0114\t\2\2\2\u0113"+
		"\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116F\3\2\2\2\u0117\u0119\t\3\2\2\u0118\u011a\t\4\2\2\u0119\u0118"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"H\3\2\2\2\u011d\u0120\5K&\2\u011e\u0120\5M\'\2\u011f\u011d\3\2\2\2\u011f"+
		"\u011e\3\2\2\2\u0120J\3\2\2\2\u0121\u0127\7\63\2\2\u0122\u0123\7v\2\2"+
		"\u0123\u0124\7t\2\2\u0124\u0125\7w\2\2\u0125\u0127\7g\2\2\u0126\u0121"+
		"\3\2\2\2\u0126\u0122\3\2\2\2\u0127L\3\2\2\2\u0128\u012f\7\62\2\2\u0129"+
		"\u012a\7h\2\2\u012a\u012b\7c\2\2\u012b\u012c\7n\2\2\u012c\u012d\7u\2\2"+
		"\u012d\u012f\7g\2\2\u012e\u0128\3\2\2\2\u012e\u0129\3\2\2\2\u012fN\3\2"+
		"\2\2\u0130\u0132\t\5\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0134\3\2\2\2\u0133\u0135\t\6\2\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137P\3\2\2\2\u0138\u013a"+
		"\t\7\2\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\b)\2\2\u013eR\3\2\2\2\u013f"+
		"\u0140\7\61\2\2\u0140\u0141\7,\2\2\u0141\u0145\3\2\2\2\u0142\u0144\13"+
		"\2\2\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0146\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\7,"+
		"\2\2\u0149\u014a\7\61\2\2\u014a\u014b\3\2\2\2\u014b\u014c\b*\2\2\u014c"+
		"T\3\2\2\2\u014d\u014e\7\61\2\2\u014e\u014f\7\61\2\2\u014f\u0153\3\2\2"+
		"\2\u0150\u0152\n\b\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151"+
		"\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156"+
		"\u0157\b+\2\2\u0157V\3\2\2\2\25\2`ir\u0087\u009a\u00aa\u0108\u010f\u0115"+
		"\u011b\u011f\u0126\u012e\u0131\u0136\u013b\u0145\u0153\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}