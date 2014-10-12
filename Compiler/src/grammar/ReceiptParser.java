// Generated from D:\Repositories\Compilers-2-assignment-2\Compiler\src\grammar\Receipt.g4 by ANTLR 4.1
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ReceiptParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COST=1, WHITESPACE=2;
	public static final String[] tokenNames = {
		"<INVALID>", "COST", "WHITESPACE"
	};
	public static final int
		RULE_receipt = 0;
	public static final String[] ruleNames = {
		"receipt"
	};

	@Override
	public String getGrammarFileName() { return "Receipt.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReceiptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ReceiptContext extends ParserRuleContext {
		public TerminalNode COST() { return getToken(ReceiptParser.COST, 0); }
		public ReceiptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receipt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterReceipt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitReceipt(this);
		}
	}

	public final ReceiptContext receipt() throws RecognitionException {
		ReceiptContext _localctx = new ReceiptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_receipt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			matchWildcard();
			setState(3); match(COST);
			setState(4);
			matchWildcard();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\4\t\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\3\2\2\3\2\2\2\7\2\4\3\2\2\2\4\5\13\2\2\2\5\6\7\3\2\2\6\7\13"+
		"\2\2\2\7\3\3\2\2\2\2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}