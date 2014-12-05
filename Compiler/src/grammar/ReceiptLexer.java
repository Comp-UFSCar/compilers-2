// Generated from D:\Repositories\Compilers-2-assignment-2\Compiler\src\grammar\Receipt.g4 by ANTLR 4.1
package grammar;

    import infrastructure.json.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ReceiptLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDNUMBER=1, SSN=2, CPF=3, CNPJ=4, DECIMAL=5, DOLLAR=6, INT=7, HIFEN=8, 
		DOT=9, SLASH=10, KEYWORD_BUYER=11, KEYWORD_SELLER=12, KEYWORD_ADDRESS=13, 
		KEYWORD_TAX=14, KEYWORD_TOTAL=15, KEYWORD_DATE=16, KEYWORD_PRODUCTS=17, 
		COLON=18, NAME=19, LETTER=20, CAPITAL_LETTER=21, DIGIT=22, WHITESPACE=23, 
		OTHERWISE=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"IDNUMBER", "SSN", "CPF", "CNPJ", "DECIMAL", "'$'", "INT", "'-'", "'.'", 
		"'/'", "KEYWORD_BUYER", "KEYWORD_SELLER", "KEYWORD_ADDRESS", "KEYWORD_TAX", 
		"'total'", "KEYWORD_DATE", "KEYWORD_PRODUCTS", "':'", "NAME", "LETTER", 
		"CAPITAL_LETTER", "DIGIT", "WHITESPACE", "OTHERWISE"
	};
	public static final String[] ruleNames = {
		"IDNUMBER", "SSN", "CPF", "CNPJ", "DECIMAL", "DOLLAR", "INT", "HIFEN", 
		"DOT", "SLASH", "KEYWORD_BUYER", "KEYWORD_SELLER", "KEYWORD_ADDRESS", 
		"KEYWORD_TAX", "KEYWORD_TOTAL", "KEYWORD_DATE", "KEYWORD_PRODUCTS", "COLON", 
		"UNDERSCORE", "NAME", "LETTER", "CAPITAL_LETTER", "DIGIT", "WHITESPACE", 
		"OTHERWISE"
	};


	public ReceiptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Receipt.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 23: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\32\u0115\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\5\29\n\2\3\3\6\3<\n\3\r\3\16\3=\3\3\3\3\6"+
		"\3B\n\3\r\3\16\3C\3\3\3\3\6\3H\n\3\r\3\16\3I\3\4\6\4M\n\4\r\4\16\4N\3"+
		"\4\3\4\6\4S\n\4\r\4\16\4T\3\4\3\4\6\4Y\n\4\r\4\16\4Z\3\4\3\4\6\4_\n\4"+
		"\r\4\16\4`\3\5\6\5d\n\5\r\5\16\5e\3\5\3\5\6\5j\n\5\r\5\16\5k\3\5\3\5\6"+
		"\5p\n\5\r\5\16\5q\3\5\3\5\6\5v\n\5\r\5\16\5w\3\5\3\5\6\5|\n\5\r\5\16\5"+
		"}\3\6\5\6\u0081\n\6\3\6\3\6\6\6\u0085\n\6\r\6\16\6\u0086\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\b\6\b\u0090\n\b\r\b\16\b\u0091\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a8\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b8\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00c9\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d3"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00e3\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f5\n\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\6\25\u00fe\n\25\r\25\16\25\u00ff\3\25\3\25\3\25\3\25\7\25\u0106"+
		"\n\25\f\25\16\25\u0109\13\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\31\3\32\3\32\2\33\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1"+
		"\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24"+
		"\1\'\2\1)\25\1+\26\1-\27\1/\30\1\61\31\2\63\32\1\3\2\3\5\2\13\f\17\17"+
		"\"\"\u0131\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\38\3\2\2\2\5;\3\2\2\2\7L\3\2\2\2\tc\3\2\2\2\13"+
		"\u0080\3\2\2\2\r\u008c\3\2\2\2\17\u008f\3\2\2\2\21\u0093\3\2\2\2\23\u0095"+
		"\3\2\2\2\25\u0097\3\2\2\2\27\u00a7\3\2\2\2\31\u00b7\3\2\2\2\33\u00c8\3"+
		"\2\2\2\35\u00d2\3\2\2\2\37\u00d4\3\2\2\2!\u00e2\3\2\2\2#\u00f4\3\2\2\2"+
		"%\u00f6\3\2\2\2\'\u00f8\3\2\2\2)\u00fd\3\2\2\2+\u010a\3\2\2\2-\u010c\3"+
		"\2\2\2/\u010e\3\2\2\2\61\u0110\3\2\2\2\63\u0113\3\2\2\2\659\5\5\3\2\66"+
		"9\5\7\4\2\679\5\t\5\28\65\3\2\2\28\66\3\2\2\28\67\3\2\2\29\4\3\2\2\2:"+
		"<\5/\30\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2\2?A\5\21\t\2"+
		"@B\5/\30\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2EG\5\21\t"+
		"\2FH\5/\30\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\6\3\2\2\2KM\5/\30"+
		"\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PR\5\23\n\2QS\5/\30"+
		"\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VX\5\23\n\2WY\5/\30"+
		"\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\^\5\21\t\2]_\5"+
		"/\30\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\b\3\2\2\2bd\5/\30\2cb"+
		"\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gi\5\23\n\2hj\5/\30\2"+
		"ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mo\5\23\n\2np\5/\30"+
		"\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2su\5\25\13\2tv\5/"+
		"\30\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2y{\5\21\t\2z|\5"+
		"/\30\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\n\3\2\2\2\177\u0081\5"+
		"-\27\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0084\5\r\7\2\u0083\u0085\5/\30\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\5\23\n\2\u0089\u008a\5/\30\2\u008a\u008b\5/\30\2\u008b\f\3\2\2"+
		"\2\u008c\u008d\7&\2\2\u008d\16\3\2\2\2\u008e\u0090\5/\30\2\u008f\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\20\3\2\2\2\u0093\u0094\7/\2\2\u0094\22\3\2\2\2\u0095\u0096\7\60\2\2\u0096"+
		"\24\3\2\2\2\u0097\u0098\7\61\2\2\u0098\26\3\2\2\2\u0099\u009a\7d\2\2\u009a"+
		"\u009b\7w\2\2\u009b\u009c\7{\2\2\u009c\u009d\7g\2\2\u009d\u00a8\7t\2\2"+
		"\u009e\u009f\7e\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7o\2\2\u00a1\u00a2"+
		"\7r\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7f\2\2\u00a5"+
		"\u00a6\7q\2\2\u00a6\u00a8\7t\2\2\u00a7\u0099\3\2\2\2\u00a7\u009e\3\2\2"+
		"\2\u00a8\30\3\2\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac"+
		"\7n\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7g\2\2\u00ae\u00b8\7t\2\2\u00af"+
		"\u00b0\7x\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7f\2\2"+
		"\u00b3\u00b4\7g\2\2\u00b4\u00b5\7f\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b8"+
		"\7t\2\2\u00b7\u00a9\3\2\2\2\u00b7\u00af\3\2\2\2\u00b8\32\3\2\2\2\u00b9"+
		"\u00ba\7c\2\2\u00ba\u00bb\7f\2\2\u00bb\u00bc\7f\2\2\u00bc\u00bd\7t\2\2"+
		"\u00bd\u00be\7g\2\2\u00be\u00bf\7u\2\2\u00bf\u00c9\7u\2\2\u00c0\u00c1"+
		"\7g\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7f\2\2\u00c3\u00c4\7g\2\2\u00c4"+
		"\u00c5\7t\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c9\7q\2\2"+
		"\u00c8\u00b9\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c9\34\3\2\2\2\u00ca\u00cb"+
		"\7v\2\2\u00cb\u00cc\7c\2\2\u00cc\u00d3\7z\2\2\u00cd\u00ce\7l\2\2\u00ce"+
		"\u00cf\7w\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d3\7u\2\2"+
		"\u00d2\u00ca\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d3\36\3\2\2\2\u00d4\u00d5"+
		"\7v\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7c\2\2\u00d8"+
		"\u00d9\7n\2\2\u00d9 \3\2\2\2\u00da\u00db\7f\2\2\u00db\u00dc\7c\2\2\u00dc"+
		"\u00dd\7v\2\2\u00dd\u00e3\7g\2\2\u00de\u00df\7f\2\2\u00df\u00e0\7c\2\2"+
		"\u00e0\u00e1\7v\2\2\u00e1\u00e3\7c\2\2\u00e2\u00da\3\2\2\2\u00e2\u00de"+
		"\3\2\2\2\u00e3\"\3\2\2\2\u00e4\u00e5\7r\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7"+
		"\7q\2\2\u00e7\u00e8\7f\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ea\7e\2\2\u00ea"+
		"\u00eb\7v\2\2\u00eb\u00f5\7u\2\2\u00ec\u00ed\7r\2\2\u00ed\u00ee\7t\2\2"+
		"\u00ee\u00ef\7q\2\2\u00ef\u00f0\7f\2\2\u00f0\u00f1\7w\2\2\u00f1\u00f2"+
		"\7v\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f5\7u\2\2\u00f4\u00e4\3\2\2\2\u00f4"+
		"\u00ec\3\2\2\2\u00f5$\3\2\2\2\u00f6\u00f7\7<\2\2\u00f7&\3\2\2\2\u00f8"+
		"\u00f9\7a\2\2\u00f9(\3\2\2\2\u00fa\u00fe\5+\26\2\u00fb\u00fe\5-\27\2\u00fc"+
		"\u00fe\5\'\24\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3"+
		"\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0107\3\2\2\2\u0101\u0106\5+\26\2\u0102\u0106\5-\27\2\u0103\u0106\5/"+
		"\30\2\u0104\u0106\5\'\24\2\u0105\u0101\3\2\2\2\u0105\u0102\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108*\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b"+
		"\4c|\2\u010b,\3\2\2\2\u010c\u010d\4C\\\2\u010d.\3\2\2\2\u010e\u010f\4"+
		"\62;\2\u010f\60\3\2\2\2\u0110\u0111\t\2\2\2\u0111\u0112\b\31\2\2\u0112"+
		"\62\3\2\2\2\u0113\u0114\13\2\2\2\u0114\64\3\2\2\2\35\28=CINTZ`ekqw}\u0080"+
		"\u0086\u0091\u00a7\u00b7\u00c8\u00d2\u00e2\u00f4\u00fd\u00ff\u0105\u0107";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}