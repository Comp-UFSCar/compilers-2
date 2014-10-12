// Generated from D:\Repositories\Compilers-2-assignment-2\Compiler\src\grammar\Receipt.g4 by ANTLR 4.1
package grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ReceiptParser extends Parser {

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache
            = new PredictionContextCache();
    public static final int DECIMAL = 1, DOLLAR = 2, INT = 3, HIFEN = 4, DOT = 5, SLASH = 6, KEYWORD_TAX = 7, KEYWORD_TOTAL = 8,
            COLON = 9, LETTER = 10, CAPITAL_LETTER = 11, DIGIT = 12, WHITESPACE = 13, OTHERWISE = 14;
    public static final String[] tokenNames = {
        "<INVALID>", "DECIMAL", "'$'", "INT", "'-'", "'.'", "'/'", "'tax'", "'total'",
        "':'", "LETTER", "CAPITAL_LETTER", "DIGIT", "WHITESPACE", "OTHERWISE"
    };
    public static final int RULE_receipt = 0, RULE_id = 1, RULE_entity = 2, RULE_company = 3, RULE_buyer = 4,
            RULE_address = 5, RULE_zipcode = 6, RULE_city = 7, RULE_identification = 8,
            RULE_ssn = 9, RULE_cpf = 10, RULE_cnpj = 11, RULE_state = 12, RULE_name = 13,
            RULE_date = 14, RULE_products = 15, RULE_tax = 16, RULE_total = 17;
    public static final String[] ruleNames = {
        "receipt", "id", "entity", "company", "buyer", "address", "zipcode", "city",
        "identification", "ssn", "cpf", "cnpj", "state", "name", "date", "products",
        "tax", "total"
    };

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
    public ATN getATN() {
        return _ATN;
    }

    public ReceiptParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class ReceiptContext extends ParserRuleContext {

        public TotalContext total() {
            return getRuleContext(TotalContext.class, 0);
        }

        public BuyerContext buyer() {
            return getRuleContext(BuyerContext.class, 0);
        }

        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public DateContext date() {
            return getRuleContext(DateContext.class, 0);
        }

        public CompanyContext company() {
            return getRuleContext(CompanyContext.class, 0);
        }

        public TaxContext tax() {
            return getRuleContext(TaxContext.class, 0);
        }

        public ProductsContext products() {
            return getRuleContext(ProductsContext.class, 0);
        }

        public ReceiptContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_receipt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).enterReceipt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).exitReceipt(this);
            }
        }
    }

    public final ReceiptContext receipt() throws RecognitionException {
        ReceiptContext _localctx = new ReceiptContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_receipt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(36);
                id();
                setState(37);
                company();
                setState(39);
                switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                    case 1: {
                        setState(38);
                        buyer();
                    }
                    break;
                }
                setState(41);
                date();
                setState(42);
                products();
                setState(44);
                _la = _input.LA(1);
                if (_la == KEYWORD_TAX) {
                    {
                        setState(43);
                        tax();
                    }
                }

                setState(47);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL) | (1L << KEYWORD_TOTAL) | (1L << COLON))) != 0)) {
                    {
                        setState(46);
                        total();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IdContext extends ParserRuleContext {

        public TerminalNode INT() {
            return getToken(ReceiptParser.INT, 0);
        }

        public IdContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_id;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).enterId(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).exitId(this);
            }
        }
    }

    public final IdContext id() throws RecognitionException {
        IdContext _localctx = new IdContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_id);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(49);
                match(INT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class EntityContext extends ParserRuleContext {

        public NameContext name() {
            return getRuleContext(NameContext.class, 0);
        }

        public IdentificationContext identification() {
            return getRuleContext(IdentificationContext.class, 0);
        }

        public EntityContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_entity;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).enterEntity(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).exitEntity(this);
            }
        }
    }

    public final EntityContext entity() throws RecognitionException {
        EntityContext _localctx = new EntityContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_entity);
        try {
            setState(57);
            switch (_input.LA(1)) {
                case LETTER:
                case CAPITAL_LETTER:
                    enterOuterAlt(_localctx, 1);
                     {
                        setState(51);
                        name();
                        setState(52);
                        identification();
                    }
                    break;
                case DIGIT:
                    enterOuterAlt(_localctx, 2);
                     {
                        setState(54);
                        identification();
                        setState(55);
                        name();
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CompanyContext extends ParserRuleContext {

        public CityContext city() {
            return getRuleContext(CityContext.class, 0);
        }

        public TerminalNode HIFEN() {
            return getToken(ReceiptParser.HIFEN, 0);
        }

        public EntityContext entity() {
            return getRuleContext(EntityContext.class, 0);
        }

        public AddressContext address() {
            return getRuleContext(AddressContext.class, 0);
        }

        public ZipcodeContext zipcode() {
            return getRuleContext(ZipcodeContext.class, 0);
        }

        public StateContext state() {
            return getRuleContext(StateContext.class, 0);
        }

        public CompanyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_company;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).enterCompany(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).exitCompany(this);
            }
        }
    }

    public final CompanyContext company() throws RecognitionException {
        CompanyContext _localctx = new CompanyContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_company);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(59);
                entity();
                setState(60);
                address();
                setState(61);
                match(HIFEN);
                setState(62);
                zipcode();
                setState(63);
                city();
                setState(64);
                state();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BuyerContext extends ParserRuleContext {

        public EntityContext entity() {
            return getRuleContext(EntityContext.class, 0);
        }

        public AddressContext address() {
            return getRuleContext(AddressContext.class, 0);
        }

        public StateContext state() {
            return getRuleContext(StateContext.class, 0);
        }

        public BuyerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_buyer;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).enterBuyer(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).exitBuyer(this);
            }
        }
    }

    public final BuyerContext buyer() throws RecognitionException {
        BuyerContext _localctx = new BuyerContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_buyer);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(66);
                entity();
                setState(67);
                address();
                setState(68);
                state();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AddressContext extends ParserRuleContext {

        public NameContext name() {
            return getRuleContext(NameContext.class, 0);
        }

        public AddressContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_address;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).enterAddress(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).exitAddress(this);
            }
        }
    }

    public final AddressContext address() throws RecognitionException {
        AddressContext _localctx = new AddressContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_address);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(70);
                name();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ZipcodeContext extends ParserRuleContext {

        public TerminalNode HIFEN() {
            return getToken(ReceiptParser.HIFEN, 0);
        }

        public TerminalNode DIGIT(int i) {
            return getToken(ReceiptParser.DIGIT, i);
        }

        public List<TerminalNode> DIGIT() {
            return getTokens(ReceiptParser.DIGIT);
        }

        public ZipcodeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_zipcode;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).enterZipcode(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).exitZipcode(this);
            }
        }
    }

    public final ZipcodeContext zipcode() throws RecognitionException {
        ZipcodeContext _localctx = new ZipcodeContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_zipcode);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(73);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(72);
                            match(DIGIT);
                        }
                    }
                    setState(75);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == DIGIT);
                setState(77);
                match(HIFEN);
                setState(79);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(78);
                            match(DIGIT);
                        }
                    }
                    setState(81);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == DIGIT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CityContext extends ParserRuleContext {

        public NameContext name() {
            return getRuleContext(NameContext.class, 0);
        }

        public CityContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_city;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).enterCity(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).exitCity(this);
            }
        }
    }

    public final CityContext city() throws RecognitionException {
        CityContext _localctx = new CityContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_city);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(83);
                name();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IdentificationContext extends ParserRuleContext {

        public SsnContext ssn() {
            return getRuleContext(SsnContext.class, 0);
        }

        public CpfContext cpf() {
            return getRuleContext(CpfContext.class, 0);
        }

        public CnpjContext cnpj() {
            return getRuleContext(CnpjContext.class, 0);
        }

        public IdentificationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_identification;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).enterIdentification(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).exitIdentification(this);
            }
        }
    }

    public final IdentificationContext identification() throws RecognitionException {
        IdentificationContext _localctx = new IdentificationContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_identification);
        try {
            setState(88);
            switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                     {
                        setState(85);
                        ssn();
                    }
                    break;

                case 2:
                    enterOuterAlt(_localctx, 2);
                     {
                        setState(86);
                        cpf();
                    }
                    break;

                case 3:
                    enterOuterAlt(_localctx, 3);
                     {
                        setState(87);
                        cnpj();
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SsnContext extends ParserRuleContext {

        public List<TerminalNode> HIFEN() {
            return getTokens(ReceiptParser.HIFEN);
        }

        public TerminalNode DIGIT(int i) {
            return getToken(ReceiptParser.DIGIT, i);
        }

        public List<TerminalNode> DIGIT() {
            return getTokens(ReceiptParser.DIGIT);
        }

        public TerminalNode HIFEN(int i) {
            return getToken(ReceiptParser.HIFEN, i);
        }

        public SsnContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ssn;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).enterSsn(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).exitSsn(this);
            }
        }
    }

    public final SsnContext ssn() throws RecognitionException {
        SsnContext _localctx = new SsnContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_ssn);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(91);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(90);
                            match(DIGIT);
                        }
                    }
                    setState(93);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == DIGIT);
                setState(95);
                match(HIFEN);
                setState(97);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(96);
                            match(DIGIT);
                        }
                    }
                    setState(99);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == DIGIT);
                setState(101);
                match(HIFEN);
                setState(103);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(102);
                            match(DIGIT);
                        }
                    }
                    setState(105);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == DIGIT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CpfContext extends ParserRuleContext {

        public List<TerminalNode> DOT() {
            return getTokens(ReceiptParser.DOT);
        }

        public TerminalNode HIFEN() {
            return getToken(ReceiptParser.HIFEN, 0);
        }

        public TerminalNode DIGIT(int i) {
            return getToken(ReceiptParser.DIGIT, i);
        }

        public List<TerminalNode> DIGIT() {
            return getTokens(ReceiptParser.DIGIT);
        }

        public TerminalNode DOT(int i) {
            return getToken(ReceiptParser.DOT, i);
        }

        public CpfContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cpf;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).enterCpf(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).exitCpf(this);
            }
        }
    }

    public final CpfContext cpf() throws RecognitionException {
        CpfContext _localctx = new CpfContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_cpf);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(108);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(107);
                            match(DIGIT);
                        }
                    }
                    setState(110);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == DIGIT);
                setState(112);
                match(DOT);
                setState(114);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(113);
                            match(DIGIT);
                        }
                    }
                    setState(116);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == DIGIT);
                setState(118);
                match(DOT);
                setState(120);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(119);
                            match(DIGIT);
                        }
                    }
                    setState(122);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == DIGIT);
                setState(124);
                match(HIFEN);
                setState(126);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(125);
                            match(DIGIT);
                        }
                    }
                    setState(128);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == DIGIT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CnpjContext extends ParserRuleContext {

        public List<TerminalNode> DOT() {
            return getTokens(ReceiptParser.DOT);
        }

        public TerminalNode HIFEN() {
            return getToken(ReceiptParser.HIFEN, 0);
        }

        public TerminalNode SLASH() {
            return getToken(ReceiptParser.SLASH, 0);
        }

        public TerminalNode DIGIT(int i) {
            return getToken(ReceiptParser.DIGIT, i);
        }

        public List<TerminalNode> DIGIT() {
            return getTokens(ReceiptParser.DIGIT);
        }

        public TerminalNode DOT(int i) {
            return getToken(ReceiptParser.DOT, i);
        }

        public CnpjContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cnpj;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).enterCnpj(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).exitCnpj(this);
            }
        }
    }

    public final CnpjContext cnpj() throws RecognitionException {
        CnpjContext _localctx = new CnpjContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_cnpj);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(131);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(130);
                            match(DIGIT);
                        }
                    }
                    setState(133);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == DIGIT);
                setState(135);
                match(DOT);
                setState(137);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(136);
                            match(DIGIT);
                        }
                    }
                    setState(139);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == DIGIT);
                setState(141);
                match(DOT);
                setState(143);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(142);
                            match(DIGIT);
                        }
                    }
                    setState(145);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == DIGIT);
                setState(147);
                match(SLASH);
                setState(149);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(148);
                            match(DIGIT);
                        }
                    }
                    setState(151);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == DIGIT);
                setState(153);
                match(HIFEN);
                setState(155);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(154);
                            match(DIGIT);
                        }
                    }
                    setState(157);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == DIGIT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class StateContext extends ParserRuleContext {

        public List<TerminalNode> CAPITAL_LETTER() {
            return getTokens(ReceiptParser.CAPITAL_LETTER);
        }

        public TerminalNode CAPITAL_LETTER(int i) {
            return getToken(ReceiptParser.CAPITAL_LETTER, i);
        }

        public StateContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_state;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).enterState(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).exitState(this);
            }
        }
    }

    public final StateContext state() throws RecognitionException {
        StateContext _localctx = new StateContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_state);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(159);
                match(CAPITAL_LETTER);
                setState(160);
                match(CAPITAL_LETTER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class NameContext extends ParserRuleContext {

        public List<TerminalNode> LETTER() {
            return getTokens(ReceiptParser.LETTER);
        }

        public TerminalNode LETTER(int i) {
            return getToken(ReceiptParser.LETTER, i);
        }

        public List<TerminalNode> CAPITAL_LETTER() {
            return getTokens(ReceiptParser.CAPITAL_LETTER);
        }

        public TerminalNode CAPITAL_LETTER(int i) {
            return getToken(ReceiptParser.CAPITAL_LETTER, i);
        }

        public NameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).enterName(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).exitName(this);
            }
        }
    }

    public final NameContext name() throws RecognitionException {
        NameContext _localctx = new NameContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_name);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(163);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 19, _ctx);
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(162);
                                _la = _input.LA(1);
                                if (!(_la == LETTER || _la == CAPITAL_LETTER)) {
                                    _errHandler.recoverInline(this);
                                }
                                consume();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(165);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 19, _ctx);
                } while (_alt != 2 && _alt != -1);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DateContext extends ParserRuleContext {

        public TerminalNode DIGIT(int i) {
            return getToken(ReceiptParser.DIGIT, i);
        }

        public List<TerminalNode> SLASH() {
            return getTokens(ReceiptParser.SLASH);
        }

        public List<TerminalNode> DIGIT() {
            return getTokens(ReceiptParser.DIGIT);
        }

        public TerminalNode SLASH(int i) {
            return getToken(ReceiptParser.SLASH, i);
        }

        public DateContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_date;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).enterDate(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).exitDate(this);
            }
        }
    }

    public final DateContext date() throws RecognitionException {
        DateContext _localctx = new DateContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_date);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(167);
                match(DIGIT);
                setState(168);
                match(DIGIT);
                setState(169);
                match(SLASH);
                setState(170);
                match(DIGIT);
                setState(171);
                match(DIGIT);
                setState(172);
                match(SLASH);
                setState(173);
                match(DIGIT);
                setState(174);
                match(DIGIT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ProductsContext extends ParserRuleContext {

        public TerminalNode DECIMAL() {
            return getToken(ReceiptParser.DECIMAL, 0);
        }

        public NameContext name() {
            return getRuleContext(NameContext.class, 0);
        }

        public TerminalNode INT() {
            return getToken(ReceiptParser.INT, 0);
        }

        public ProductsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_products;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).enterProducts(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).exitProducts(this);
            }
        }
    }

    public final ProductsContext products() throws RecognitionException {
        ProductsContext _localctx = new ProductsContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_products);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(176);
                    name();
                    setState(178);
                    _la = _input.LA(1);
                    if (_la == INT) {
                        {
                            setState(177);
                            match(INT);
                        }
                    }

                    setState(180);
                    match(DECIMAL);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TaxContext extends ParserRuleContext {

        public TerminalNode DECIMAL() {
            return getToken(ReceiptParser.DECIMAL, 0);
        }

        public TerminalNode KEYWORD_TAX() {
            return getToken(ReceiptParser.KEYWORD_TAX, 0);
        }

        public TerminalNode COLON() {
            return getToken(ReceiptParser.COLON, 0);
        }

        public TaxContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tax;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).enterTax(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).exitTax(this);
            }
        }
    }

    public final TaxContext tax() throws RecognitionException {
        TaxContext _localctx = new TaxContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_tax);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(182);
                match(KEYWORD_TAX);
                setState(184);
                _la = _input.LA(1);
                if (_la == COLON) {
                    {
                        setState(183);
                        match(COLON);
                    }
                }

                setState(186);
                match(DECIMAL);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TotalContext extends ParserRuleContext {

        public TerminalNode DECIMAL() {
            return getToken(ReceiptParser.DECIMAL, 0);
        }

        public TerminalNode COLON() {
            return getToken(ReceiptParser.COLON, 0);
        }

        public TerminalNode KEYWORD_TOTAL() {
            return getToken(ReceiptParser.KEYWORD_TOTAL, 0);
        }

        public TotalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_total;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).enterTotal(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).exitTotal(this);
            }
        }
    }

    public final TotalContext total() throws RecognitionException {
        TotalContext _localctx = new TotalContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_total);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(189);
                _la = _input.LA(1);
                if (_la == KEYWORD_TOTAL) {
                    {
                        setState(188);
                        match(KEYWORD_TOTAL);
                    }
                }

                setState(192);
                _la = _input.LA(1);
                if (_la == COLON) {
                    {
                        setState(191);
                        match(COLON);
                    }
                }

                setState(194);
                match(DECIMAL);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN
            = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\20\u00c7\4\2\t\2"
            + "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"
            + "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
            + "\4\23\t\23\3\2\3\2\3\2\5\2*\n\2\3\2\3\2\3\2\5\2/\n\2\3\2\5\2\62\n\2\3"
            + "\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"
            + "\6\3\6\3\6\3\6\3\7\3\7\3\b\6\bL\n\b\r\b\16\bM\3\b\3\b\6\bR\n\b\r\b\16"
            + "\bS\3\t\3\t\3\n\3\n\3\n\5\n[\n\n\3\13\6\13^\n\13\r\13\16\13_\3\13\3\13"
            + "\6\13d\n\13\r\13\16\13e\3\13\3\13\6\13j\n\13\r\13\16\13k\3\f\6\fo\n\f"
            + "\r\f\16\fp\3\f\3\f\6\fu\n\f\r\f\16\fv\3\f\3\f\6\f{\n\f\r\f\16\f|\3\f\3"
            + "\f\6\f\u0081\n\f\r\f\16\f\u0082\3\r\6\r\u0086\n\r\r\r\16\r\u0087\3\r\3"
            + "\r\6\r\u008c\n\r\r\r\16\r\u008d\3\r\3\r\6\r\u0092\n\r\r\r\16\r\u0093\3"
            + "\r\3\r\6\r\u0098\n\r\r\r\16\r\u0099\3\r\3\r\6\r\u009e\n\r\r\r\16\r\u009f"
            + "\3\16\3\16\3\16\3\17\6\17\u00a6\n\17\r\17\16\17\u00a7\3\20\3\20\3\20\3"
            + "\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u00b5\n\21\3\21\3\21\3\22"
            + "\3\22\5\22\u00bb\n\22\3\22\3\22\3\23\5\23\u00c0\n\23\3\23\5\23\u00c3\n"
            + "\23\3\23\3\23\3\23\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\3"
            + "\3\2\f\r\u00cd\2&\3\2\2\2\4\63\3\2\2\2\6;\3\2\2\2\b=\3\2\2\2\nD\3\2\2"
            + "\2\fH\3\2\2\2\16K\3\2\2\2\20U\3\2\2\2\22Z\3\2\2\2\24]\3\2\2\2\26n\3\2"
            + "\2\2\30\u0085\3\2\2\2\32\u00a1\3\2\2\2\34\u00a5\3\2\2\2\36\u00a9\3\2\2"
            + "\2 \u00b2\3\2\2\2\"\u00b8\3\2\2\2$\u00bf\3\2\2\2&\'\5\4\3\2\')\5\b\5\2"
            + "(*\5\n\6\2)(\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\5\36\20\2,.\5 \21\2-/\5\"\22"
            + "\2.-\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60\62\5$\23\2\61\60\3\2\2\2\61\62\3"
            + "\2\2\2\62\3\3\2\2\2\63\64\7\5\2\2\64\5\3\2\2\2\65\66\5\34\17\2\66\67\5"
            + "\22\n\2\67<\3\2\2\289\5\22\n\29:\5\34\17\2:<\3\2\2\2;\65\3\2\2\2;8\3\2"
            + "\2\2<\7\3\2\2\2=>\5\6\4\2>?\5\f\7\2?@\7\6\2\2@A\5\16\b\2AB\5\20\t\2BC"
            + "\5\32\16\2C\t\3\2\2\2DE\5\6\4\2EF\5\f\7\2FG\5\32\16\2G\13\3\2\2\2HI\5"
            + "\34\17\2I\r\3\2\2\2JL\7\16\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2"
            + "NO\3\2\2\2OQ\7\6\2\2PR\7\16\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2"
            + "\2T\17\3\2\2\2UV\5\34\17\2V\21\3\2\2\2W[\5\24\13\2X[\5\26\f\2Y[\5\30\r"
            + "\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\23\3\2\2\2\\^\7\16\2\2]\\\3\2\2\2^_"
            + "\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ac\7\6\2\2bd\7\16\2\2cb\3\2\2\2"
            + "de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gi\7\6\2\2hj\7\16\2\2ih\3\2\2"
            + "\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\25\3\2\2\2mo\7\16\2\2nm\3\2\2\2op\3"
            + "\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rt\7\7\2\2su\7\16\2\2ts\3\2\2\2uv"
            + "\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xz\7\7\2\2y{\7\16\2\2zy\3\2\2\2"
            + "{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u0080\7\6\2\2\177\u0081\7\16"
            + "\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"
            + "\3\2\2\2\u0083\27\3\2\2\2\u0084\u0086\7\16\2\2\u0085\u0084\3\2\2\2\u0086"
            + "\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2"
            + "\2\2\u0089\u008b\7\7\2\2\u008a\u008c\7\16\2\2\u008b\u008a\3\2\2\2\u008c"
            + "\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2"
            + "\2\2\u008f\u0091\7\7\2\2\u0090\u0092\7\16\2\2\u0091\u0090\3\2\2\2\u0092"
            + "\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2"
            + "\2\2\u0095\u0097\7\b\2\2\u0096\u0098\7\16\2\2\u0097\u0096\3\2\2\2\u0098"
            + "\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2"
            + "\2\2\u009b\u009d\7\6\2\2\u009c\u009e\7\16\2\2\u009d\u009c\3\2\2\2\u009e"
            + "\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\31\3\2\2"
            + "\2\u00a1\u00a2\7\r\2\2\u00a2\u00a3\7\r\2\2\u00a3\33\3\2\2\2\u00a4\u00a6"
            + "\t\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"
            + "\u00a8\3\2\2\2\u00a8\35\3\2\2\2\u00a9\u00aa\7\16\2\2\u00aa\u00ab\7\16"
            + "\2\2\u00ab\u00ac\7\b\2\2\u00ac\u00ad\7\16\2\2\u00ad\u00ae\7\16\2\2\u00ae"
            + "\u00af\7\b\2\2\u00af\u00b0\7\16\2\2\u00b0\u00b1\7\16\2\2\u00b1\37\3\2"
            + "\2\2\u00b2\u00b4\5\34\17\2\u00b3\u00b5\7\5\2\2\u00b4\u00b3\3\2\2\2\u00b4"
            + "\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\3\2\2\u00b7!\3\2\2\2"
            + "\u00b8\u00ba\7\t\2\2\u00b9\u00bb\7\13\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb"
            + "\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7\3\2\2\u00bd#\3\2\2\2\u00be"
            + "\u00c0\7\n\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2"
            + "\2\2\u00c1\u00c3\7\13\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"
            + "\u00c4\3\2\2\2\u00c4\u00c5\7\3\2\2\u00c5%\3\2\2\2\32).\61;MSZ_ekpv|\u0082"
            + "\u0087\u008d\u0093\u0099\u009f\u00a7\u00b4\u00ba\u00bf\u00c2";
    public static final ATN _ATN
            = ATNSimulator.deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
