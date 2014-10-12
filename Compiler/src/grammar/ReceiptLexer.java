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
		DECIMAL=1, DOLLAR=2, INT=3, HIFEN=4, DOT=5, SLASH=6, KEYWORD_TAX=7, KEYWORD_TOTAL=8, 
		COLON=9, LETTER=10, CAPITAL_LETTER=11, DIGIT=12, WHITESPACE=13, OTHERWISE=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"DECIMAL", "'$'", "INT", "'-'", "'.'", "'/'", "'tax'", "'total'", "':'", 
		"LETTER", "CAPITAL_LETTER", "DIGIT", "WHITESPACE", "OTHERWISE"
	};
	public static final String[] ruleNames = {
		"DECIMAL", "DOLLAR", "INT", "HIFEN", "DOT", "SLASH", "KEYWORD_TAX", "KEYWORD_TOTAL", 
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
		case 12: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\20P\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\5\2!\n\2\3\2\3\2\6\2%\n\2"+
		"\r\2\16\2&\3\2\3\2\3\2\3\2\3\3\3\3\3\4\6\4\60\n\4\r\4\16\4\61\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\2\20\3\3\1\5\4\1\7\5\1"+
		"\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17"+
		"\2\35\20\1\3\2\4\3\2\62;\5\2\13\f\17\17\"\"R\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\3 \3\2\2\2\5,\3\2\2\2\7/\3\2\2\2\t\63\3\2\2\2\13\65\3\2"+
		"\2\2\r\67\3\2\2\2\179\3\2\2\2\21=\3\2\2\2\23C\3\2\2\2\25E\3\2\2\2\27G"+
		"\3\2\2\2\31I\3\2\2\2\33K\3\2\2\2\35N\3\2\2\2\37!\5\27\f\2 \37\3\2\2\2"+
		" !\3\2\2\2!\"\3\2\2\2\"$\5\5\3\2#%\5\31\r\2$#\3\2\2\2%&\3\2\2\2&$\3\2"+
		"\2\2&\'\3\2\2\2\'(\3\2\2\2()\5\13\6\2)*\5\31\r\2*+\5\31\r\2+\4\3\2\2\2"+
		",-\7&\2\2-\6\3\2\2\2.\60\5\31\r\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2"+
		"\61\62\3\2\2\2\62\b\3\2\2\2\63\64\7/\2\2\64\n\3\2\2\2\65\66\7\60\2\2\66"+
		"\f\3\2\2\2\678\7\61\2\28\16\3\2\2\29:\7v\2\2:;\7c\2\2;<\7z\2\2<\20\3\2"+
		"\2\2=>\7v\2\2>?\7q\2\2?@\7v\2\2@A\7c\2\2AB\7n\2\2B\22\3\2\2\2CD\7<\2\2"+
		"D\24\3\2\2\2EF\4c|\2F\26\3\2\2\2GH\4C\\\2H\30\3\2\2\2IJ\t\2\2\2J\32\3"+
		"\2\2\2KL\t\3\2\2LM\b\16\2\2M\34\3\2\2\2NO\13\2\2\2O\36\3\2\2\2\6\2 &\61";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}