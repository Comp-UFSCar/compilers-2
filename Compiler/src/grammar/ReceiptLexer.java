// Generated from D:\Repositories\Compilers-2-assignment-2\Compiler\src\grammar\Receipt.g4 by ANTLR 4.1
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
public class ReceiptLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDNUMBER=1, SSN=2, CPF=3, CNPJ=4, NAME=5, DECIMAL=6, DOLLAR=7, INT=8, 
		HIFEN=9, DOT=10, SLASH=11, KEYWORD_TAX=12, KEYWORD_TOTAL=13, KEYWORD_DATE=14, 
		COLON=15, LETTER=16, CAPITAL_LETTER=17, DIGIT=18, WHITESPACE=19, OTHERWISE=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"IDNUMBER", "SSN", "CPF", "CNPJ", "NAME", "DECIMAL", "'$'", "INT", "'-'", 
		"'.'", "'/'", "'tax'", "'total'", "'date'", "':'", "LETTER", "CAPITAL_LETTER", 
		"DIGIT", "WHITESPACE", "OTHERWISE"
	};
	public static final String[] ruleNames = {
		"IDNUMBER", "SSN", "CPF", "CNPJ", "NAME", "DECIMAL", "DOLLAR", "INT", 
		"HIFEN", "DOT", "SLASH", "KEYWORD_TAX", "KEYWORD_TOTAL", "KEYWORD_DATE", 
		"COLON", "LETTER", "CAPITAL_LETTER", "DIGIT", "WHITESPACE", "OTHERWISE"
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
		case 18: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\26\u00b1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\5\2/\n\2\3\3\6\3\62\n"+
		"\3\r\3\16\3\63\3\3\3\3\6\38\n\3\r\3\16\39\3\3\3\3\6\3>\n\3\r\3\16\3?\3"+
		"\4\6\4C\n\4\r\4\16\4D\3\4\3\4\6\4I\n\4\r\4\16\4J\3\4\3\4\6\4O\n\4\r\4"+
		"\16\4P\3\4\3\4\6\4U\n\4\r\4\16\4V\3\5\6\5Z\n\5\r\5\16\5[\3\5\3\5\6\5`"+
		"\n\5\r\5\16\5a\3\5\3\5\6\5f\n\5\r\5\16\5g\3\5\3\5\6\5l\n\5\r\5\16\5m\3"+
		"\5\3\5\6\5r\n\5\r\5\16\5s\3\6\3\6\6\6x\n\6\r\6\16\6y\3\7\5\7}\n\7\3\7"+
		"\3\7\6\7\u0081\n\7\r\7\16\7\u0082\3\7\3\7\3\7\3\7\3\b\3\b\3\t\6\t\u008c"+
		"\n\t\r\t\16\t\u008d\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\2\26\3\3\1\5\4\1\7\5\1\t\6\1"+
		"\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20"+
		"\1\37\21\1!\22\1#\23\1%\24\1\'\25\2)\26\1\3\2\3\5\2\13\f\17\17\"\"\u00c3"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3.\3\2\2\2\5\61\3\2\2\2\7B\3\2"+
		"\2\2\tY\3\2\2\2\13w\3\2\2\2\r|\3\2\2\2\17\u0088\3\2\2\2\21\u008b\3\2\2"+
		"\2\23\u008f\3\2\2\2\25\u0091\3\2\2\2\27\u0093\3\2\2\2\31\u0095\3\2\2\2"+
		"\33\u0099\3\2\2\2\35\u009f\3\2\2\2\37\u00a4\3\2\2\2!\u00a6\3\2\2\2#\u00a8"+
		"\3\2\2\2%\u00aa\3\2\2\2\'\u00ac\3\2\2\2)\u00af\3\2\2\2+/\5\5\3\2,/\5\7"+
		"\4\2-/\5\t\5\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\4\3\2\2\2\60\62\5%\23\2"+
		"\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2"+
		"\65\67\5\23\n\2\668\5%\23\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2"+
		"\2\2:;\3\2\2\2;=\5\23\n\2<>\5%\23\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3"+
		"\2\2\2@\6\3\2\2\2AC\5%\23\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EF"+
		"\3\2\2\2FH\5\25\13\2GI\5%\23\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2"+
		"KL\3\2\2\2LN\5\25\13\2MO\5%\23\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2"+
		"\2QR\3\2\2\2RT\5\23\n\2SU\5%\23\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2"+
		"\2\2W\b\3\2\2\2XZ\5%\23\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]"+
		"\3\2\2\2]_\5\25\13\2^`\5%\23\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2"+
		"bc\3\2\2\2ce\5\25\13\2df\5%\23\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2"+
		"\2hi\3\2\2\2ik\5\27\f\2jl\5%\23\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2"+
		"\2\2no\3\2\2\2oq\5\23\n\2pr\5%\23\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3"+
		"\2\2\2t\n\3\2\2\2ux\5!\21\2vx\5#\22\2wu\3\2\2\2wv\3\2\2\2xy\3\2\2\2yw"+
		"\3\2\2\2yz\3\2\2\2z\f\3\2\2\2{}\5#\22\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2"+
		"~\u0080\5\17\b\2\177\u0081\5%\23\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2"+
		"\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085"+
		"\5\25\13\2\u0085\u0086\5%\23\2\u0086\u0087\5%\23\2\u0087\16\3\2\2\2\u0088"+
		"\u0089\7&\2\2\u0089\20\3\2\2\2\u008a\u008c\5%\23\2\u008b\u008a\3\2\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\22"+
		"\3\2\2\2\u008f\u0090\7/\2\2\u0090\24\3\2\2\2\u0091\u0092\7\60\2\2\u0092"+
		"\26\3\2\2\2\u0093\u0094\7\61\2\2\u0094\30\3\2\2\2\u0095\u0096\7v\2\2\u0096"+
		"\u0097\7c\2\2\u0097\u0098\7z\2\2\u0098\32\3\2\2\2\u0099\u009a\7v\2\2\u009a"+
		"\u009b\7q\2\2\u009b\u009c\7v\2\2\u009c\u009d\7c\2\2\u009d\u009e\7n\2\2"+
		"\u009e\34\3\2\2\2\u009f\u00a0\7f\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7"+
		"v\2\2\u00a2\u00a3\7g\2\2\u00a3\36\3\2\2\2\u00a4\u00a5\7<\2\2\u00a5 \3"+
		"\2\2\2\u00a6\u00a7\4c|\2\u00a7\"\3\2\2\2\u00a8\u00a9\4C\\\2\u00a9$\3\2"+
		"\2\2\u00aa\u00ab\4\62;\2\u00ab&\3\2\2\2\u00ac\u00ad\t\2\2\2\u00ad\u00ae"+
		"\b\24\2\2\u00ae(\3\2\2\2\u00af\u00b0\13\2\2\2\u00b0*\3\2\2\2\25\2.\63"+
		"9?DJPV[agmswy|\u0082\u008d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}