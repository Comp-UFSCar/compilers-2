// Generated from D:\Repositories\Compilers-2-assignment-2\Compiler\src\grammar\Receipt.g4 by ANTLR 4.1
package grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ReceiptLexer extends Lexer {

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache
            = new PredictionContextCache();
    public static final int IDNUMBER = 1, SSN = 2, CPF = 3, CNPJ = 4, DECIMAL = 5, DOLLAR = 6, INT = 7, HIFEN = 8,
            DOT = 9, SLASH = 10, KEYWORD_BUYER = 11, KEYWORD_SELLER = 12, KEYWORD_ADDRESS = 13,
            KEYWORD_TAX = 14, KEYWORD_TOTAL = 15, KEYWORD_DATE = 16, KEYWORD_PRODUCTS = 17,
            COLON = 18, NAME = 19, LETTER = 20, CAPITAL_LETTER = 21, DIGIT = 22, WHITESPACE = 23,
            OTHERWISE = 24;
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
        "NAME", "LETTER", "CAPITAL_LETTER", "DIGIT", "WHITESPACE", "OTHERWISE"
    };

    public ReceiptLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "Receipt.g4";
    }

    @Override
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    @Override
    public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
        switch (ruleIndex) {
            case 22:
                WHITESPACE_action((RuleContext) _localctx, actionIndex);
                break;
        }
    }

    private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
        switch (actionIndex) {
            case 0:
                skip();
                break;
        }
    }

    public static final String _serializedATN
            = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\32\u0107\b\1\4\2"
            + "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"
            + "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"
            + "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"
            + "\t\31\3\2\3\2\3\2\5\2\67\n\2\3\3\6\3:\n\3\r\3\16\3;\3\3\3\3\6\3@\n\3\r"
            + "\3\16\3A\3\3\3\3\6\3F\n\3\r\3\16\3G\3\4\6\4K\n\4\r\4\16\4L\3\4\3\4\6\4"
            + "Q\n\4\r\4\16\4R\3\4\3\4\6\4W\n\4\r\4\16\4X\3\4\3\4\6\4]\n\4\r\4\16\4^"
            + "\3\5\6\5b\n\5\r\5\16\5c\3\5\3\5\6\5h\n\5\r\5\16\5i\3\5\3\5\6\5n\n\5\r"
            + "\5\16\5o\3\5\3\5\6\5t\n\5\r\5\16\5u\3\5\3\5\6\5z\n\5\r\5\16\5{\3\6\5\6"
            + "\177\n\6\3\6\3\6\6\6\u0083\n\6\r\6\16\6\u0084\3\6\3\6\3\6\3\6\3\7\3\7"
            + "\3\b\6\b\u008e\n\b\r\b\16\b\u008f\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"
            + "\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a6\n\f\3\r\3\r\3"
            + "\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b6\n\r\3\16\3\16"
            + "\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"
            + "\u00c7\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d1\n\17\3"
            + "\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5"
            + "\21\u00e1\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"
            + "\3\22\3\22\3\22\3\22\3\22\5\22\u00f3\n\22\3\23\3\23\3\24\3\24\6\24\u00f9"
            + "\n\24\r\24\16\24\u00fa\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3"
            + "\31\3\31\2\32\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13"
            + "\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25"
            + "\1)\26\1+\27\1-\30\1/\31\2\61\32\1\3\2\3\5\2\13\f\17\17\"\"\u011f\2\3"
            + "\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"
            + "\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"
            + "\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"
            + "\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"
            + "\61\3\2\2\2\3\66\3\2\2\2\59\3\2\2\2\7J\3\2\2\2\ta\3\2\2\2\13~\3\2\2\2"
            + "\r\u008a\3\2\2\2\17\u008d\3\2\2\2\21\u0091\3\2\2\2\23\u0093\3\2\2\2\25"
            + "\u0095\3\2\2\2\27\u00a5\3\2\2\2\31\u00b5\3\2\2\2\33\u00c6\3\2\2\2\35\u00d0"
            + "\3\2\2\2\37\u00d2\3\2\2\2!\u00e0\3\2\2\2#\u00f2\3\2\2\2%\u00f4\3\2\2\2"
            + "\'\u00f8\3\2\2\2)\u00fc\3\2\2\2+\u00fe\3\2\2\2-\u0100\3\2\2\2/\u0102\3"
            + "\2\2\2\61\u0105\3\2\2\2\63\67\5\5\3\2\64\67\5\7\4\2\65\67\5\t\5\2\66\63"
            + "\3\2\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67\4\3\2\2\28:\5-\27\298\3\2\2\2"
            + ":;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=?\5\21\t\2>@\5-\27\2?>\3\2\2"
            + "\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CE\5\21\t\2DF\5-\27\2ED\3\2"
            + "\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\6\3\2\2\2IK\5-\27\2JI\3\2\2\2KL\3"
            + "\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NP\5\23\n\2OQ\5-\27\2PO\3\2\2\2QR"
            + "\3\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2TV\5\23\n\2UW\5-\27\2VU\3\2\2\2"
            + "WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z\\\5\21\t\2[]\5-\27\2\\[\3\2"
            + "\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\b\3\2\2\2`b\5-\27\2a`\3\2\2\2bc\3"
            + "\2\2\2ca\3\2\2\2cd\3\2\2\2de\3\2\2\2eg\5\23\n\2fh\5-\27\2gf\3\2\2\2hi"
            + "\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2km\5\23\n\2ln\5-\27\2ml\3\2\2\2"
            + "no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qs\5\25\13\2rt\5-\27\2sr\3\2\2"
            + "\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wy\5\21\t\2xz\5-\27\2yx\3\2"
            + "\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\n\3\2\2\2}\177\5+\26\2~}\3\2\2\2~"
            + "\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\5\r\7\2\u0081\u0083\5-\27\2"
            + "\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085"
            + "\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\5\23\n\2\u0087\u0088\5-\27\2"
            + "\u0088\u0089\5-\27\2\u0089\f\3\2\2\2\u008a\u008b\7&\2\2\u008b\16\3\2\2"
            + "\2\u008c\u008e\5-\27\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d"
            + "\3\2\2\2\u008f\u0090\3\2\2\2\u0090\20\3\2\2\2\u0091\u0092\7/\2\2\u0092"
            + "\22\3\2\2\2\u0093\u0094\7\60\2\2\u0094\24\3\2\2\2\u0095\u0096\7\61\2\2"
            + "\u0096\26\3\2\2\2\u0097\u0098\7d\2\2\u0098\u0099\7w\2\2\u0099\u009a\7"
            + "{\2\2\u009a\u009b\7g\2\2\u009b\u00a6\7t\2\2\u009c\u009d\7e\2\2\u009d\u009e"
            + "\7q\2\2\u009e\u009f\7o\2\2\u009f\u00a0\7r\2\2\u00a0\u00a1\7t\2\2\u00a1"
            + "\u00a2\7c\2\2\u00a2\u00a3\7f\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a6\7t\2\2"
            + "\u00a5\u0097\3\2\2\2\u00a5\u009c\3\2\2\2\u00a6\30\3\2\2\2\u00a7\u00a8"
            + "\7u\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7n\2\2\u00ab"
            + "\u00ac\7g\2\2\u00ac\u00b6\7t\2\2\u00ad\u00ae\7x\2\2\u00ae\u00af\7g\2\2"
            + "\u00af\u00b0\7p\2\2\u00b0\u00b1\7f\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3"
            + "\7f\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b6\7t\2\2\u00b5\u00a7\3\2\2\2\u00b5"
            + "\u00ad\3\2\2\2\u00b6\32\3\2\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7f\2\2"
            + "\u00b9\u00ba\7f\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd"
            + "\7u\2\2\u00bd\u00c7\7u\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7p\2\2\u00c0"
            + "\u00c1\7f\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7g\2\2"
            + "\u00c4\u00c5\7e\2\2\u00c5\u00c7\7q\2\2\u00c6\u00b7\3\2\2\2\u00c6\u00be"
            + "\3\2\2\2\u00c7\34\3\2\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7c\2\2\u00ca"
            + "\u00d1\7z\2\2\u00cb\u00cc\7l\2\2\u00cc\u00cd\7w\2\2\u00cd\u00ce\7t\2\2"
            + "\u00ce\u00cf\7q\2\2\u00cf\u00d1\7u\2\2\u00d0\u00c8\3\2\2\2\u00d0\u00cb"
            + "\3\2\2\2\u00d1\36\3\2\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7q\2\2\u00d4"
            + "\u00d5\7v\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7n\2\2\u00d7 \3\2\2\2\u00d8"
            + "\u00d9\7f\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7v\2\2\u00db\u00e1\7g\2\2"
            + "\u00dc\u00dd\7f\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7v\2\2\u00df\u00e1"
            + "\7c\2\2\u00e0\u00d8\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e1\"\3\2\2\2\u00e2"
            + "\u00e3\7r\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7f\2\2"
            + "\u00e6\u00e7\7w\2\2\u00e7\u00e8\7e\2\2\u00e8\u00e9\7v\2\2\u00e9\u00f3"
            + "\7u\2\2\u00ea\u00eb\7r\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7q\2\2\u00ed"
            + "\u00ee\7f\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7q\2\2"
            + "\u00f1\u00f3\7u\2\2\u00f2\u00e2\3\2\2\2\u00f2\u00ea\3\2\2\2\u00f3$\3\2"
            + "\2\2\u00f4\u00f5\7<\2\2\u00f5&\3\2\2\2\u00f6\u00f9\5)\25\2\u00f7\u00f9"
            + "\5+\26\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"
            + "\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb(\3\2\2\2\u00fc\u00fd\4c|\2\u00fd"
            + "*\3\2\2\2\u00fe\u00ff\4C\\\2\u00ff,\3\2\2\2\u0100\u0101\4\62;\2\u0101"
            + ".\3\2\2\2\u0102\u0103\t\2\2\2\u0103\u0104\b\30\2\2\u0104\60\3\2\2\2\u0105"
            + "\u0106\13\2\2\2\u0106\62\3\2\2\2\33\2\66;AGLRX^ciou{~\u0084\u008f\u00a5"
            + "\u00b5\u00c6\u00d0\u00e0\u00f2\u00f8\u00fa";
    public static final ATN _ATN
            = ATNSimulator.deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
