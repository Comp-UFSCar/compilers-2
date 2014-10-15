// Generated from D:\Repositories\Compilers-2-assignment-2\Compiler\src\grammar\Receipt.g4 by ANTLR 4.1
package grammar;

import infrastructure.JsonElement;
import infrastructure.JsonList;
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
    public static final int IDNUMBER = 1, SSN = 2, CPF = 3, CNPJ = 4, NAME = 5, DECIMAL = 6, DOLLAR = 7, INT = 8,
            HIFEN = 9, DOT = 10, SLASH = 11, KEYWORD_TAX = 12, KEYWORD_TOTAL = 13, KEYWORD_DATE = 14,
            COLON = 15, LETTER = 16, CAPITAL_LETTER = 17, DIGIT = 18, WHITESPACE = 19, OTHERWISE = 20;
    public static final String[] tokenNames = {
        "<INVALID>", "IDNUMBER", "SSN", "CPF", "CNPJ", "NAME", "DECIMAL", "'$'",
        "INT", "'-'", "'.'", "'/'", "'tax'", "'total'", "'date'", "':'", "LETTER",
        "CAPITAL_LETTER", "DIGIT", "WHITESPACE", "OTHERWISE"
    };
    public static final int RULE_receipt = 0, RULE_id = 1, RULE_company = 2, RULE_buyer = 3, RULE_date = 4,
            RULE_products = 5, RULE_tax = 6, RULE_total = 7, RULE_entity = 8, RULE_address = 9,
            RULE_zipcode = 10, RULE_city = 11, RULE_state = 12;
    public static final String[] ruleNames = {
        "receipt", "id", "company", "buyer", "date", "products", "tax", "total",
        "entity", "address", "zipcode", "city", "state"
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

        public JsonList e;
        public IdContext id;
        public CompanyContext company;
        public BuyerContext buyer;
        public DateContext date;
        public ProductsContext products;
        public TaxContext tax;
        public TotalContext total;

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
        ((ReceiptContext) _localctx).e = new JsonList("receipt");
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(26);
                ((ReceiptContext) _localctx).id = id();
                _localctx.e.add(((ReceiptContext) _localctx).id.e);
                setState(28);
                ((ReceiptContext) _localctx).company = company();
                _localctx.e.add(((ReceiptContext) _localctx).company.e);
                setState(33);
                _la = _input.LA(1);
                if (_la == IDNUMBER || _la == NAME) {
                    {
                        setState(30);
                        ((ReceiptContext) _localctx).buyer = buyer();
                        _localctx.e.add(((ReceiptContext) _localctx).buyer.e);
                    }
                }

                setState(35);
                ((ReceiptContext) _localctx).date = date();
                _localctx.e.add(((ReceiptContext) _localctx).date.e);
                setState(40);
                _la = _input.LA(1);
                if (_la == NAME) {
                    {
                        setState(37);
                        ((ReceiptContext) _localctx).products = products();
                        _localctx.e.add(((ReceiptContext) _localctx).products.e);
                    }
                }

                setState(45);
                _la = _input.LA(1);
                if (_la == KEYWORD_TAX) {
                    {
                        setState(42);
                        ((ReceiptContext) _localctx).tax = tax();
                        _localctx.e.add(((ReceiptContext) _localctx).tax.e);
                    }
                }

                setState(47);
                ((ReceiptContext) _localctx).total = total();
                _localctx.e.add(((ReceiptContext) _localctx).total.e);
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

        public JsonElement e;
        public Token INT;

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
                setState(50);
                ((IdContext) _localctx).INT = match(INT);
                ((IdContext) _localctx).e = new JsonElement("id", ((IdContext) _localctx).INT.getText());
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

        public JsonList e;
        public EntityContext entity;
        public AddressContext address;
        public ZipcodeContext zipcode;
        public CityContext city;
        public StateContext state;

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
        enterRule(_localctx, 4, RULE_company);
        ((CompanyContext) _localctx).e = new JsonList("company");
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(53);
                ((CompanyContext) _localctx).entity = entity();
                _localctx.e.add(((CompanyContext) _localctx).entity.e);
                setState(67);
                switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                    case 1: {
                        setState(55);
                        ((CompanyContext) _localctx).address = address();
                        _localctx.e.add(((CompanyContext) _localctx).address.e);
                        setState(58);
                        _la = _input.LA(1);
                        if (_la == HIFEN) {
                            {
                                setState(57);
                                match(HIFEN);
                            }
                        }

                        setState(60);
                        ((CompanyContext) _localctx).zipcode = zipcode();
                        _localctx.e.add(((CompanyContext) _localctx).zipcode.e);
                        setState(62);
                        ((CompanyContext) _localctx).city = city();
                        _localctx.e.add(((CompanyContext) _localctx).city.e);
                        setState(64);
                        ((CompanyContext) _localctx).state = state();
                        _localctx.e.add(((CompanyContext) _localctx).state.e);
                    }
                    break;
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

    public static class BuyerContext extends ParserRuleContext {

        public JsonList e;
        public EntityContext entity;
        public AddressContext address;
        public StateContext state;

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
        enterRule(_localctx, 6, RULE_buyer);
        ((BuyerContext) _localctx).e = new JsonList("buyer");
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(69);
                ((BuyerContext) _localctx).entity = entity();
                _localctx.e.add(((BuyerContext) _localctx).entity.e);
                setState(71);
                ((BuyerContext) _localctx).address = address();
                _localctx.e.add(((BuyerContext) _localctx).address.e);
                setState(73);
                ((BuyerContext) _localctx).state = state();
                _localctx.e.add(((BuyerContext) _localctx).state.e);
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

        public JsonElement e;
        public Token INT;

        public TerminalNode INT(int i) {
            return getToken(ReceiptParser.INT, i);
        }

        public TerminalNode KEYWORD_DATE() {
            return getToken(ReceiptParser.KEYWORD_DATE, 0);
        }

        public List<TerminalNode> SLASH() {
            return getTokens(ReceiptParser.SLASH);
        }

        public TerminalNode COLON() {
            return getToken(ReceiptParser.COLON, 0);
        }

        public TerminalNode SLASH(int i) {
            return getToken(ReceiptParser.SLASH, i);
        }

        public List<TerminalNode> INT() {
            return getTokens(ReceiptParser.INT);
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
        enterRule(_localctx, 8, RULE_date);
        String t;
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(77);
                _la = _input.LA(1);
                if (_la == KEYWORD_DATE) {
                    {
                        setState(76);
                        match(KEYWORD_DATE);
                    }
                }

                setState(80);
                _la = _input.LA(1);
                if (_la == COLON) {
                    {
                        setState(79);
                        match(COLON);
                    }
                }

                setState(82);
                ((DateContext) _localctx).INT = match(INT);
                t = ((DateContext) _localctx).INT.getText();
                setState(86);
                _la = _input.LA(1);
                if (_la == SLASH) {
                    {
                        setState(84);
                        match(SLASH);
                        t += '/';
                    }
                }

                setState(88);
                ((DateContext) _localctx).INT = match(INT);
                t += ((DateContext) _localctx).INT.getText();
                setState(92);
                _la = _input.LA(1);
                if (_la == SLASH) {
                    {
                        setState(90);
                        match(SLASH);
                        t += '/';
                    }
                }

                setState(94);
                ((DateContext) _localctx).INT = match(INT);

                t += ((DateContext) _localctx).INT.getText();
                ((DateContext) _localctx).e = new JsonElement("date", t);

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

        public JsonList e;

        public TerminalNode NAME(int i) {
            return getToken(ReceiptParser.NAME, i);
        }

        public TerminalNode INT(int i) {
            return getToken(ReceiptParser.INT, i);
        }

        public List<TerminalNode> DECIMAL() {
            return getTokens(ReceiptParser.DECIMAL);
        }

        public List<TerminalNode> NAME() {
            return getTokens(ReceiptParser.NAME);
        }

        public TerminalNode DECIMAL(int i) {
            return getToken(ReceiptParser.DECIMAL, i);
        }

        public List<TerminalNode> INT() {
            return getTokens(ReceiptParser.INT);
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
        enterRule(_localctx, 10, RULE_products);
        ((ProductsContext) _localctx).e = new JsonList("products");
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(102);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(97);
                            match(NAME);
                            setState(99);
                            _la = _input.LA(1);
                            if (_la == INT) {
                                {
                                    setState(98);
                                    match(INT);
                                }
                            }

                            setState(101);
                            match(DECIMAL);
                        }
                    }
                    setState(104);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == NAME);
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

        public JsonElement e;
        public Token DECIMAL;

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
        enterRule(_localctx, 12, RULE_tax);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(106);
                match(KEYWORD_TAX);
                setState(108);
                _la = _input.LA(1);
                if (_la == COLON) {
                    {
                        setState(107);
                        match(COLON);
                    }
                }

                setState(110);
                ((TaxContext) _localctx).DECIMAL = match(DECIMAL);
                ((TaxContext) _localctx).e = new JsonElement("tax", ((TaxContext) _localctx).DECIMAL.getText());
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

        public JsonElement e;
        public Token DECIMAL;

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
        enterRule(_localctx, 14, RULE_total);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(114);
                _la = _input.LA(1);
                if (_la == KEYWORD_TOTAL) {
                    {
                        setState(113);
                        match(KEYWORD_TOTAL);
                    }
                }

                setState(117);
                _la = _input.LA(1);
                if (_la == COLON) {
                    {
                        setState(116);
                        match(COLON);
                    }
                }

                setState(119);
                ((TotalContext) _localctx).DECIMAL = match(DECIMAL);
                ((TotalContext) _localctx).e = new JsonElement("total", ((TotalContext) _localctx).DECIMAL.getText());
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

        public JsonList e;
        public Token NAME;
        public Token IDNUMBER;

        public TerminalNode NAME() {
            return getToken(ReceiptParser.NAME, 0);
        }

        public TerminalNode IDNUMBER() {
            return getToken(ReceiptParser.IDNUMBER, 0);
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
        enterRule(_localctx, 16, RULE_entity);
        ((EntityContext) _localctx).e = new JsonList("entity");
        try {
            setState(128);
            switch (_input.LA(1)) {
                case NAME:
                    enterOuterAlt(_localctx, 1);
                     {
                        setState(122);
                        ((EntityContext) _localctx).NAME = match(NAME);
                        setState(123);
                        ((EntityContext) _localctx).IDNUMBER = match(IDNUMBER);

                        _localctx.e
                                .add(new JsonElement("id", ((EntityContext) _localctx).IDNUMBER.getText()))
                                .add(new JsonElement("name", ((EntityContext) _localctx).NAME.getText()));

                    }
                    break;
                case IDNUMBER:
                    enterOuterAlt(_localctx, 2);
                     {
                        setState(125);
                        ((EntityContext) _localctx).IDNUMBER = match(IDNUMBER);
                        setState(126);
                        ((EntityContext) _localctx).NAME = match(NAME);

                        _localctx.e
                                .add(new JsonElement("id", ((EntityContext) _localctx).IDNUMBER.getText()))
                                .add(new JsonElement("name", ((EntityContext) _localctx).NAME.getText()));

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

    public static class AddressContext extends ParserRuleContext {

        public JsonElement e;
        public Token NAME;

        public TerminalNode NAME() {
            return getToken(ReceiptParser.NAME, 0);
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
        enterRule(_localctx, 18, RULE_address);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(130);
                ((AddressContext) _localctx).NAME = match(NAME);
                ((AddressContext) _localctx).e = new JsonElement("address", ((AddressContext) _localctx).NAME.getText());
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

        public JsonElement e;
        public Token DIGIT;

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
        enterRule(_localctx, 20, RULE_zipcode);
        String t = "";
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(135);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(133);
                                ((ZipcodeContext) _localctx).DIGIT = match(DIGIT);
                                t += ((ZipcodeContext) _localctx).DIGIT.getText();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(137);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
                } while (_alt != 2 && _alt != -1);
                setState(140);
                _la = _input.LA(1);
                if (_la == HIFEN) {
                    {
                        setState(139);
                        match(HIFEN);
                    }
                }

                setState(144);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(142);
                            ((ZipcodeContext) _localctx).DIGIT = match(DIGIT);
                            t += ((ZipcodeContext) _localctx).DIGIT.getText();
                        }
                    }
                    setState(146);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == DIGIT);
                ((ZipcodeContext) _localctx).e = new JsonElement("zipcode", t);
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

        public JsonElement e;
        public Token NAME;

        public TerminalNode NAME() {
            return getToken(ReceiptParser.NAME, 0);
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
        enterRule(_localctx, 22, RULE_city);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(150);
                ((CityContext) _localctx).NAME = match(NAME);
                ((CityContext) _localctx).e = new JsonElement("city", ((CityContext) _localctx).NAME.getText());
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

        public JsonElement e;
        public Token CAPITAL_LETTER;

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
        String t;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(153);
                ((StateContext) _localctx).CAPITAL_LETTER = match(CAPITAL_LETTER);
                t = ((StateContext) _localctx).CAPITAL_LETTER.getText();
                setState(155);
                ((StateContext) _localctx).CAPITAL_LETTER = match(CAPITAL_LETTER);

                t += ((StateContext) _localctx).CAPITAL_LETTER.getText();
                ((StateContext) _localctx).e = new JsonElement("state", t);

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
            = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\26\u00a1\4\2\t\2"
            + "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"
            + "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2$\n\2\3"
            + "\2\3\2\3\2\3\2\3\2\5\2+\n\2\3\2\3\2\3\2\5\2\60\n\2\3\2\3\2\3\2\3\3\3\3"
            + "\3\3\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4F\n\4"
            + "\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\5\6P\n\6\3\6\5\6S\n\6\3\6\3\6\3\6\3\6"
            + "\5\6Y\n\6\3\6\3\6\3\6\3\6\5\6_\n\6\3\6\3\6\3\6\3\7\3\7\5\7f\n\7\3\7\6"
            + "\7i\n\7\r\7\16\7j\3\b\3\b\5\bo\n\b\3\b\3\b\3\b\3\t\5\tu\n\t\3\t\5\tx\n"
            + "\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0083\n\n\3\13\3\13\3\13\3"
            + "\f\3\f\6\f\u008a\n\f\r\f\16\f\u008b\3\f\5\f\u008f\n\f\3\f\3\f\6\f\u0093"
            + "\n\f\r\f\16\f\u0094\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"
            + "\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2\u00a5\2\34\3\2\2\2\4\64\3\2"
            + "\2\2\6\67\3\2\2\2\bG\3\2\2\2\nO\3\2\2\2\fh\3\2\2\2\16l\3\2\2\2\20t\3\2"
            + "\2\2\22\u0082\3\2\2\2\24\u0084\3\2\2\2\26\u0089\3\2\2\2\30\u0098\3\2\2"
            + "\2\32\u009b\3\2\2\2\34\35\5\4\3\2\35\36\b\2\1\2\36\37\5\6\4\2\37#\b\2"
            + "\1\2 !\5\b\5\2!\"\b\2\1\2\"$\3\2\2\2# \3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\5"
            + "\n\6\2&*\b\2\1\2\'(\5\f\7\2()\b\2\1\2)+\3\2\2\2*\'\3\2\2\2*+\3\2\2\2+"
            + "/\3\2\2\2,-\5\16\b\2-.\b\2\1\2.\60\3\2\2\2/,\3\2\2\2/\60\3\2\2\2\60\61"
            + "\3\2\2\2\61\62\5\20\t\2\62\63\b\2\1\2\63\3\3\2\2\2\64\65\7\n\2\2\65\66"
            + "\b\3\1\2\66\5\3\2\2\2\678\5\22\n\28E\b\4\1\29:\5\24\13\2:<\b\4\1\2;=\7"
            + "\13\2\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\5\26\f\2?@\b\4\1\2@A\5\30\r\2"
            + "AB\b\4\1\2BC\5\32\16\2CD\b\4\1\2DF\3\2\2\2E9\3\2\2\2EF\3\2\2\2F\7\3\2"
            + "\2\2GH\5\22\n\2HI\b\5\1\2IJ\5\24\13\2JK\b\5\1\2KL\5\32\16\2LM\b\5\1\2"
            + "M\t\3\2\2\2NP\7\20\2\2ON\3\2\2\2OP\3\2\2\2PR\3\2\2\2QS\7\21\2\2RQ\3\2"
            + "\2\2RS\3\2\2\2ST\3\2\2\2TU\7\n\2\2UX\b\6\1\2VW\7\r\2\2WY\b\6\1\2XV\3\2"
            + "\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7\n\2\2[^\b\6\1\2\\]\7\r\2\2]_\b\6\1\2^\\\3"
            + "\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\n\2\2ab\b\6\1\2b\13\3\2\2\2ce\7\7\2\2d"
            + "f\7\n\2\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gi\7\b\2\2hc\3\2\2\2ij\3\2\2\2"
            + "jh\3\2\2\2jk\3\2\2\2k\r\3\2\2\2ln\7\16\2\2mo\7\21\2\2nm\3\2\2\2no\3\2"
            + "\2\2op\3\2\2\2pq\7\b\2\2qr\b\b\1\2r\17\3\2\2\2su\7\17\2\2ts\3\2\2\2tu"
            + "\3\2\2\2uw\3\2\2\2vx\7\21\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\b\2\2"
            + "z{\b\t\1\2{\21\3\2\2\2|}\7\7\2\2}~\7\3\2\2~\u0083\b\n\1\2\177\u0080\7"
            + "\3\2\2\u0080\u0081\7\7\2\2\u0081\u0083\b\n\1\2\u0082|\3\2\2\2\u0082\177"
            + "\3\2\2\2\u0083\23\3\2\2\2\u0084\u0085\7\7\2\2\u0085\u0086\b\13\1\2\u0086"
            + "\25\3\2\2\2\u0087\u0088\7\24\2\2\u0088\u008a\b\f\1\2\u0089\u0087\3\2\2"
            + "\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e"
            + "\3\2\2\2\u008d\u008f\7\13\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2"
            + "\u008f\u0092\3\2\2\2\u0090\u0091\7\24\2\2\u0091\u0093\b\f\1\2\u0092\u0090"
            + "\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"
            + "\u0096\3\2\2\2\u0096\u0097\b\f\1\2\u0097\27\3\2\2\2\u0098\u0099\7\7\2"
            + "\2\u0099\u009a\b\r\1\2\u009a\31\3\2\2\2\u009b\u009c\7\23\2\2\u009c\u009d"
            + "\b\16\1\2\u009d\u009e\7\23\2\2\u009e\u009f\b\16\1\2\u009f\33\3\2\2\2\24"
            + "#*/<EORX^ejntw\u0082\u008b\u008e\u0094";
    public static final ATN _ATN
            = ATNSimulator.deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
