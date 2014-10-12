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
		COST=1, WHITESPACE=2;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"COST", "WHITESPACE"
	};
	public static final String[] ruleNames = {
		"COST", "CAPITAL_LETTER", "DIGIT", "WHITESPACE"
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
		case 3: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\4\37\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\3\2\5\2\r\n\2\3\2\3\2\6\2\21\n\2\r\2\16\2\22"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\2\6\3\3\1\5\2\1\7\2\1\t\4"+
		"\2\3\2\3\5\2\13\f\17\17\"\"\36\2\3\3\2\2\2\2\t\3\2\2\2\3\f\3\2\2\2\5\30"+
		"\3\2\2\2\7\32\3\2\2\2\t\34\3\2\2\2\13\r\5\5\3\2\f\13\3\2\2\2\f\r\3\2\2"+
		"\2\r\16\3\2\2\2\16\20\7&\2\2\17\21\5\7\4\2\20\17\3\2\2\2\21\22\3\2\2\2"+
		"\22\20\3\2\2\2\22\23\3\2\2\2\23\24\3\2\2\2\24\25\7\60\2\2\25\26\5\7\4"+
		"\2\26\27\5\7\4\2\27\4\3\2\2\2\30\31\4C\\\2\31\6\3\2\2\2\32\33\4\62;\2"+
		"\33\b\3\2\2\2\34\35\t\2\2\2\35\36\b\5\2\2\36\n\3\2\2\2\5\2\f\22";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}