// Generated from D:\Repositories\Compilers-2-assignment-2\Compiler\src\grammar\Receipt.g4 by ANTLR 4.1
package grammar;

    import json.infrastructure.*;

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
		KEYWORD_PRODUCTS=15, COLON=16, LETTER=17, CAPITAL_LETTER=18, DIGIT=19, 
		WHITESPACE=20, OTHERWISE=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"IDNUMBER", "SSN", "CPF", "CNPJ", "NAME", "DECIMAL", "'$'", "INT", "'-'", 
		"'.'", "'/'", "KEYWORD_TAX", "'total'", "KEYWORD_DATE", "KEYWORD_PRODUCTS", 
		"':'", "LETTER", "CAPITAL_LETTER", "DIGIT", "WHITESPACE", "OTHERWISE"
	};
	public static final String[] ruleNames = {
		"IDNUMBER", "SSN", "CPF", "CNPJ", "NAME", "DECIMAL", "DOLLAR", "INT", 
		"HIFEN", "DOT", "SLASH", "KEYWORD_TAX", "KEYWORD_TOTAL", "KEYWORD_DATE", 
		"KEYWORD_PRODUCTS", "COLON", "LETTER", "CAPITAL_LETTER", "DIGIT", "WHITESPACE", 
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
		case 19: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\27\u00d0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\5\2\61\n\2\3"+
		"\3\6\3\64\n\3\r\3\16\3\65\3\3\3\3\6\3:\n\3\r\3\16\3;\3\3\3\3\6\3@\n\3"+
		"\r\3\16\3A\3\4\6\4E\n\4\r\4\16\4F\3\4\3\4\6\4K\n\4\r\4\16\4L\3\4\3\4\6"+
		"\4Q\n\4\r\4\16\4R\3\4\3\4\6\4W\n\4\r\4\16\4X\3\5\6\5\\\n\5\r\5\16\5]\3"+
		"\5\3\5\6\5b\n\5\r\5\16\5c\3\5\3\5\6\5h\n\5\r\5\16\5i\3\5\3\5\6\5n\n\5"+
		"\r\5\16\5o\3\5\3\5\6\5t\n\5\r\5\16\5u\3\6\3\6\6\6z\n\6\r\6\16\6{\3\7\5"+
		"\7\177\n\7\3\7\3\7\6\7\u0083\n\7\r\7\16\7\u0084\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\t\6\t\u008e\n\t\r\t\16\t\u008f\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a0\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b0\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00c2\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\2\27\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1"+
		"\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25"+
		"\1)\26\2+\27\1\3\2\3\5\2\13\f\17\17\"\"\u00e5\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\3\60\3\2\2\2\5\63\3\2\2\2\7D\3\2\2\2\t[\3\2"+
		"\2\2\13y\3\2\2\2\r~\3\2\2\2\17\u008a\3\2\2\2\21\u008d\3\2\2\2\23\u0091"+
		"\3\2\2\2\25\u0093\3\2\2\2\27\u0095\3\2\2\2\31\u009f\3\2\2\2\33\u00a1\3"+
		"\2\2\2\35\u00af\3\2\2\2\37\u00c1\3\2\2\2!\u00c3\3\2\2\2#\u00c5\3\2\2\2"+
		"%\u00c7\3\2\2\2\'\u00c9\3\2\2\2)\u00cb\3\2\2\2+\u00ce\3\2\2\2-\61\5\5"+
		"\3\2.\61\5\7\4\2/\61\5\t\5\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\4"+
		"\3\2\2\2\62\64\5\'\24\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66"+
		"\3\2\2\2\66\67\3\2\2\2\679\5\23\n\28:\5\'\24\298\3\2\2\2:;\3\2\2\2;9\3"+
		"\2\2\2;<\3\2\2\2<=\3\2\2\2=?\5\23\n\2>@\5\'\24\2?>\3\2\2\2@A\3\2\2\2A"+
		"?\3\2\2\2AB\3\2\2\2B\6\3\2\2\2CE\5\'\24\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2"+
		"\2FG\3\2\2\2GH\3\2\2\2HJ\5\25\13\2IK\5\'\24\2JI\3\2\2\2KL\3\2\2\2LJ\3"+
		"\2\2\2LM\3\2\2\2MN\3\2\2\2NP\5\25\13\2OQ\5\'\24\2PO\3\2\2\2QR\3\2\2\2"+
		"RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2TV\5\23\n\2UW\5\'\24\2VU\3\2\2\2WX\3\2\2"+
		"\2XV\3\2\2\2XY\3\2\2\2Y\b\3\2\2\2Z\\\5\'\24\2[Z\3\2\2\2\\]\3\2\2\2][\3"+
		"\2\2\2]^\3\2\2\2^_\3\2\2\2_a\5\25\13\2`b\5\'\24\2a`\3\2\2\2bc\3\2\2\2"+
		"ca\3\2\2\2cd\3\2\2\2de\3\2\2\2eg\5\25\13\2fh\5\'\24\2gf\3\2\2\2hi\3\2"+
		"\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2km\5\27\f\2ln\5\'\24\2ml\3\2\2\2no\3"+
		"\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qs\5\23\n\2rt\5\'\24\2sr\3\2\2\2t"+
		"u\3\2\2\2us\3\2\2\2uv\3\2\2\2v\n\3\2\2\2wz\5#\22\2xz\5%\23\2yw\3\2\2\2"+
		"yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\f\3\2\2\2}\177\5%\23\2~}\3\2"+
		"\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\5\17\b\2\u0081\u0083\5"+
		"\'\24\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\5\25\13\2\u0087\u0088\5"+
		"\'\24\2\u0088\u0089\5\'\24\2\u0089\16\3\2\2\2\u008a\u008b\7&\2\2\u008b"+
		"\20\3\2\2\2\u008c\u008e\5\'\24\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2"+
		"\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\22\3\2\2\2\u0091\u0092"+
		"\7/\2\2\u0092\24\3\2\2\2\u0093\u0094\7\60\2\2\u0094\26\3\2\2\2\u0095\u0096"+
		"\7\61\2\2\u0096\30\3\2\2\2\u0097\u0098\7v\2\2\u0098\u0099\7c\2\2\u0099"+
		"\u00a0\7z\2\2\u009a\u009b\7l\2\2\u009b\u009c\7w\2\2\u009c\u009d\7t\2\2"+
		"\u009d\u009e\7q\2\2\u009e\u00a0\7u\2\2\u009f\u0097\3\2\2\2\u009f\u009a"+
		"\3\2\2\2\u00a0\32\3\2\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7q\2\2\u00a3"+
		"\u00a4\7v\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7n\2\2\u00a6\34\3\2\2\2\u00a7"+
		"\u00a8\7f\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7v\2\2\u00aa\u00b0\7g\2\2"+
		"\u00ab\u00ac\7f\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7v\2\2\u00ae\u00b0"+
		"\7c\2\2\u00af\u00a7\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0\36\3\2\2\2\u00b1"+
		"\u00b2\7r\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7f\2\2"+
		"\u00b5\u00b6\7w\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8\7v\2\2\u00b8\u00c2"+
		"\7u\2\2\u00b9\u00ba\7r\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7q\2\2\u00bc"+
		"\u00bd\7f\2\2\u00bd\u00be\7w\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7q\2\2"+
		"\u00c0\u00c2\7u\2\2\u00c1\u00b1\3\2\2\2\u00c1\u00b9\3\2\2\2\u00c2 \3\2"+
		"\2\2\u00c3\u00c4\7<\2\2\u00c4\"\3\2\2\2\u00c5\u00c6\4c|\2\u00c6$\3\2\2"+
		"\2\u00c7\u00c8\4C\\\2\u00c8&\3\2\2\2\u00c9\u00ca\4\62;\2\u00ca(\3\2\2"+
		"\2\u00cb\u00cc\t\2\2\2\u00cc\u00cd\b\25\2\2\u00cd*\3\2\2\2\u00ce\u00cf"+
		"\13\2\2\2\u00cf,\3\2\2\2\30\2\60\65;AFLRX]ciouy{~\u0084\u008f\u009f\u00af"+
		"\u00c1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}