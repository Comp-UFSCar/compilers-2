// Generated from D:\Repositories\Compilers-2-assignment-2\Compiler\src\grammar\Receipt.g4 by ANTLR 4.1
package grammar;

import infrastructure.json.*;

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
    public static final int IDNUMBER = 1, SSN = 2, CPF = 3, CNPJ = 4, DECIMAL = 5, DOLLAR = 6, INT = 7, HIFEN = 8,
            DOT = 9, SLASH = 10, KEYWORD_BUYER = 11, KEYWORD_SELLER = 12, KEYWORD_ADDRESS = 13,
            KEYWORD_TAX = 14, KEYWORD_TOTAL = 15, KEYWORD_DATE = 16, KEYWORD_PRODUCTS = 17,
            COLON = 18, NAME = 19, LETTER = 20, CAPITAL_LETTER = 21, DIGIT = 22, WHITESPACE = 23,
            OTHERWISE = 24;
    public static final String[] tokenNames = {
        "<INVALID>", "IDNUMBER", "SSN", "CPF", "CNPJ", "DECIMAL", "'$'", "INT",
        "'-'", "'.'", "'/'", "KEYWORD_BUYER", "KEYWORD_SELLER", "KEYWORD_ADDRESS",
        "KEYWORD_TAX", "'total'", "KEYWORD_DATE", "KEYWORD_PRODUCTS", "':'", "NAME",
        "LETTER", "CAPITAL_LETTER", "DIGIT", "WHITESPACE", "OTHERWISE"
    };
    public static final int RULE_receipt = 0, RULE_basic = 1, RULE_id = 2, RULE_seller = 3, RULE_buyer = 4,
            RULE_date = 5, RULE_products = 6, RULE_tax = 7, RULE_total = 8, RULE_entityBuyer = 9,
            RULE_entitySeller = 10, RULE_address = 11, RULE_zipcode = 12, RULE_city = 13,
            RULE_state = 14;
    public static final String[] ruleNames = {
        "receipt", "basic", "id", "seller", "buyer", "date", "products", "tax",
        "total", "entityBuyer", "entitySeller", "address", "zipcode", "city",
        "state"
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

        public JsonStructure e;
        public BasicContext basic;

        public List<BasicContext> basic() {
            return getRuleContexts(BasicContext.class);
        }

        public BasicContext basic(int i) {
            return getRuleContext(BasicContext.class, i);
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
        ((ReceiptContext) _localctx).e = new JsonStructure("receipt");
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(33);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(30);
                            ((ReceiptContext) _localctx).basic = basic();
                            _localctx.e.add(((ReceiptContext) _localctx).basic.e);
                        }
                    }
                    setState(35);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << KEYWORD_BUYER) | (1L << KEYWORD_SELLER) | (1L << KEYWORD_TAX) | (1L << KEYWORD_TOTAL) | (1L << KEYWORD_DATE) | (1L << KEYWORD_PRODUCTS))) != 0));
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

    public static class BasicContext extends ParserRuleContext {

        public JsonElement e;
        public IdContext id;
        public SellerContext seller;
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

        public SellerContext seller() {
            return getRuleContext(SellerContext.class, 0);
        }

        public TaxContext tax() {
            return getRuleContext(TaxContext.class, 0);
        }

        public ProductsContext products() {
            return getRuleContext(ProductsContext.class, 0);
        }

        public BasicContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_basic;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).enterBasic(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).exitBasic(this);
            }
        }
    }

    public final BasicContext basic() throws RecognitionException {
        BasicContext _localctx = new BasicContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_basic);
        try {
            setState(58);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                     {
                        setState(37);
                        ((BasicContext) _localctx).id = id();
                        ((BasicContext) _localctx).e = ((BasicContext) _localctx).id.e;
                    }
                    break;

                case 2:
                    enterOuterAlt(_localctx, 2);
                     {
                        setState(40);
                        ((BasicContext) _localctx).seller = seller();
                        ((BasicContext) _localctx).e = ((BasicContext) _localctx).seller.e;
                    }
                    break;

                case 3:
                    enterOuterAlt(_localctx, 3);
                     {
                        setState(43);
                        ((BasicContext) _localctx).buyer = buyer();
                        ((BasicContext) _localctx).e = ((BasicContext) _localctx).buyer.e;
                    }
                    break;

                case 4:
                    enterOuterAlt(_localctx, 4);
                     {
                        setState(46);
                        ((BasicContext) _localctx).date = date();
                        ((BasicContext) _localctx).e = ((BasicContext) _localctx).date.e;
                    }
                    break;

                case 5:
                    enterOuterAlt(_localctx, 5);
                     {
                        setState(49);
                        ((BasicContext) _localctx).products = products();
                        ((BasicContext) _localctx).e = ((BasicContext) _localctx).products.e;
                    }
                    break;

                case 6:
                    enterOuterAlt(_localctx, 6);
                     {
                        setState(52);
                        ((BasicContext) _localctx).tax = tax();
                        ((BasicContext) _localctx).e = ((BasicContext) _localctx).tax.e;
                    }
                    break;

                case 7:
                    enterOuterAlt(_localctx, 7);
                     {
                        setState(55);
                        ((BasicContext) _localctx).total = total();
                        ((BasicContext) _localctx).e = ((BasicContext) _localctx).total.e;
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
        enterRule(_localctx, 4, RULE_id);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(60);
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

    public static class SellerContext extends ParserRuleContext {

        public JsonStructure e;
        public EntitySellerContext entitySeller;
        public AddressContext address;

        public EntitySellerContext entitySeller() {
            return getRuleContext(EntitySellerContext.class, 0);
        }

        public AddressContext address() {
            return getRuleContext(AddressContext.class, 0);
        }

        public SellerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_seller;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).enterSeller(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).exitSeller(this);
            }
        }
    }

    public final SellerContext seller() throws RecognitionException {
        SellerContext _localctx = new SellerContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_seller);
        ((SellerContext) _localctx).e = new JsonStructure("seller");
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(63);
                ((SellerContext) _localctx).entitySeller = entitySeller();
                _localctx.e.add(((SellerContext) _localctx).entitySeller.e);
                setState(68);
                _la = _input.LA(1);
                if (_la == KEYWORD_ADDRESS) {
                    {
                        setState(65);
                        ((SellerContext) _localctx).address = address();
                        _localctx.e.add(((SellerContext) _localctx).address.e);
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

    public static class BuyerContext extends ParserRuleContext {

        public JsonStructure e;
        public EntityBuyerContext entityBuyer;
        public AddressContext address;

        public EntityBuyerContext entityBuyer() {
            return getRuleContext(EntityBuyerContext.class, 0);
        }

        public AddressContext address() {
            return getRuleContext(AddressContext.class, 0);
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
        ((BuyerContext) _localctx).e = new JsonStructure("buyer");
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(70);
                ((BuyerContext) _localctx).entityBuyer = entityBuyer();
                _localctx.e.add(((BuyerContext) _localctx).entityBuyer.e);
                setState(75);
                _la = _input.LA(1);
                if (_la == KEYWORD_ADDRESS) {
                    {
                        setState(72);
                        ((BuyerContext) _localctx).address = address();
                        _localctx.e.add(((BuyerContext) _localctx).address.e);
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

    public static class DateContext extends ParserRuleContext {

        public JsonElement e;
        public Token INT;

        public TerminalNode INT(int i) {
            return getToken(ReceiptParser.INT, i);
        }

        public List<TerminalNode> HIFEN() {
            return getTokens(ReceiptParser.HIFEN);
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

        public TerminalNode HIFEN(int i) {
            return getToken(ReceiptParser.HIFEN, i);
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
        enterRule(_localctx, 10, RULE_date);
        String t;
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(81);
                _la = _input.LA(1);
                if (_la == KEYWORD_DATE) {
                    {
                        setState(77);
                        match(KEYWORD_DATE);
                        setState(79);
                        _la = _input.LA(1);
                        if (_la == COLON) {
                            {
                                setState(78);
                                match(COLON);
                            }
                        }

                    }
                }

                setState(83);
                ((DateContext) _localctx).INT = match(INT);
                t = ((DateContext) _localctx).INT.getText();
                setState(89);
                switch (_input.LA(1)) {
                    case SLASH: {
                        setState(85);
                        match(SLASH);
                        t += '/';
                    }
                    break;
                    case HIFEN: {
                        setState(87);
                        match(HIFEN);
                        t += '-';
                    }
                    break;
                    case INT:
                        break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(91);
                ((DateContext) _localctx).INT = match(INT);
                t += ((DateContext) _localctx).INT.getText();
                setState(97);
                switch (_input.LA(1)) {
                    case SLASH: {
                        setState(93);
                        match(SLASH);
                        t += '/';
                    }
                    break;
                    case HIFEN: {
                        setState(95);
                        match(HIFEN);
                        t += '-';
                    }
                    break;
                    case INT:
                        break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(99);
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

        public JsonStructure e;
        public Token NAME;
        public Token INT;
        public Token DECIMAL;

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

        public TerminalNode COLON() {
            return getToken(ReceiptParser.COLON, 0);
        }

        public TerminalNode KEYWORD_PRODUCTS() {
            return getToken(ReceiptParser.KEYWORD_PRODUCTS, 0);
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
        enterRule(_localctx, 12, RULE_products);

        ((ProductsContext) _localctx).e = new JsonStructure("products");
        int quantity = -1;

        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(102);
                match(KEYWORD_PRODUCTS);
                setState(104);
                _la = _input.LA(1);
                if (_la == COLON) {
                    {
                        setState(103);
                        match(COLON);
                    }
                }

                setState(113);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(106);
                            ((ProductsContext) _localctx).NAME = match(NAME);
                            setState(109);
                            _la = _input.LA(1);
                            if (_la == INT) {
                                {
                                    setState(107);
                                    ((ProductsContext) _localctx).INT = match(INT);
                                    quantity = Integer.parseInt(((ProductsContext) _localctx).INT.getText());
                                }
                            }

                            setState(111);
                            ((ProductsContext) _localctx).DECIMAL = match(DECIMAL);

                            JsonStructure current = new JsonStructure(((ProductsContext) _localctx).NAME.getText());

                            if (quantity != -1) {
                                current.add(new JsonElement("quantity", ((ProductsContext) _localctx).INT.getText()));
                            }

                            current.add(new JsonElement("cost", ((ProductsContext) _localctx).DECIMAL.getText()));
                            _localctx.e.add(current);
                            quantity = -1;
                        }
                    }
                    setState(115);
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
        enterRule(_localctx, 14, RULE_tax);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(117);
                match(KEYWORD_TAX);
                setState(119);
                _la = _input.LA(1);
                if (_la == COLON) {
                    {
                        setState(118);
                        match(COLON);
                    }
                }

                setState(121);
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
        enterRule(_localctx, 16, RULE_total);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(124);
                match(KEYWORD_TOTAL);
                setState(126);
                _la = _input.LA(1);
                if (_la == COLON) {
                    {
                        setState(125);
                        match(COLON);
                    }
                }

                setState(128);
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

    public static class EntityBuyerContext extends ParserRuleContext {

        public JsonStructure e;
        public Token NAME;
        public Token IDNUMBER;

        public TerminalNode NAME() {
            return getToken(ReceiptParser.NAME, 0);
        }

        public TerminalNode KEYWORD_BUYER() {
            return getToken(ReceiptParser.KEYWORD_BUYER, 0);
        }

        public TerminalNode IDNUMBER() {
            return getToken(ReceiptParser.IDNUMBER, 0);
        }

        public EntityBuyerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_entityBuyer;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).enterEntityBuyer(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).exitEntityBuyer(this);
            }
        }
    }

    public final EntityBuyerContext entityBuyer() throws RecognitionException {
        EntityBuyerContext _localctx = new EntityBuyerContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_entityBuyer);
        ((EntityBuyerContext) _localctx).e = new JsonStructure("entity");
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(131);
                match(KEYWORD_BUYER);
                setState(136);
                switch (_input.LA(1)) {
                    case NAME: {
                        setState(132);
                        ((EntityBuyerContext) _localctx).NAME = match(NAME);
                        setState(133);
                        ((EntityBuyerContext) _localctx).IDNUMBER = match(IDNUMBER);
                    }
                    break;
                    case IDNUMBER: {
                        setState(134);
                        ((EntityBuyerContext) _localctx).IDNUMBER = match(IDNUMBER);
                        setState(135);
                        ((EntityBuyerContext) _localctx).NAME = match(NAME);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }

                _localctx.e
                        .add(new JsonElement("id", ((EntityBuyerContext) _localctx).IDNUMBER.getText()))
                        .add(new JsonElement("name", ((EntityBuyerContext) _localctx).NAME.getText()));

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

    public static class EntitySellerContext extends ParserRuleContext {

        public JsonStructure e;
        public Token NAME;
        public Token IDNUMBER;

        public TerminalNode NAME() {
            return getToken(ReceiptParser.NAME, 0);
        }

        public TerminalNode KEYWORD_SELLER() {
            return getToken(ReceiptParser.KEYWORD_SELLER, 0);
        }

        public TerminalNode IDNUMBER() {
            return getToken(ReceiptParser.IDNUMBER, 0);
        }

        public EntitySellerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_entitySeller;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).enterEntitySeller(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ReceiptListener) {
                ((ReceiptListener) listener).exitEntitySeller(this);
            }
        }
    }

    public final EntitySellerContext entitySeller() throws RecognitionException {
        EntitySellerContext _localctx = new EntitySellerContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_entitySeller);
        ((EntitySellerContext) _localctx).e = new JsonStructure("entity");
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(140);
                match(KEYWORD_SELLER);
                setState(149);
                switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                    case 1: {
                        setState(141);
                        ((EntitySellerContext) _localctx).NAME = match(NAME);
                        setState(143);
                        _la = _input.LA(1);
                        if (_la == IDNUMBER) {
                            {
                                setState(142);
                                ((EntitySellerContext) _localctx).IDNUMBER = match(IDNUMBER);
                            }
                        }

                    }
                    break;

                    case 2: {
                        setState(146);
                        _la = _input.LA(1);
                        if (_la == IDNUMBER) {
                            {
                                setState(145);
                                ((EntitySellerContext) _localctx).IDNUMBER = match(IDNUMBER);
                            }
                        }

                        setState(148);
                        ((EntitySellerContext) _localctx).NAME = match(NAME);
                    }
                    break;
                }

                _localctx.e
                        .add(new JsonElement("id", ((EntitySellerContext) _localctx).IDNUMBER.getText()))
                        .add(new JsonElement("name", ((EntitySellerContext) _localctx).NAME.getText()));

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

        public JsonStructure e;
        public Token NAME;
        public ZipcodeContext zipcode;
        public CityContext city;
        public StateContext state;

        public CityContext city() {
            return getRuleContext(CityContext.class, 0);
        }

        public TerminalNode NAME() {
            return getToken(ReceiptParser.NAME, 0);
        }

        public TerminalNode COLON() {
            return getToken(ReceiptParser.COLON, 0);
        }

        public TerminalNode KEYWORD_ADDRESS() {
            return getToken(ReceiptParser.KEYWORD_ADDRESS, 0);
        }

        public ZipcodeContext zipcode() {
            return getRuleContext(ZipcodeContext.class, 0);
        }

        public StateContext state() {
            return getRuleContext(StateContext.class, 0);
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
        enterRule(_localctx, 22, RULE_address);
        ((AddressContext) _localctx).e = new JsonStructure("address");
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(153);
                match(KEYWORD_ADDRESS);
                setState(155);
                _la = _input.LA(1);
                if (_la == COLON) {
                    {
                        setState(154);
                        match(COLON);
                    }
                }

                setState(157);
                ((AddressContext) _localctx).NAME = match(NAME);
                _localctx.e.add(new JsonElement("main", ((AddressContext) _localctx).NAME.getText()));
                setState(162);
                switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                    case 1: {
                        setState(159);
                        ((AddressContext) _localctx).zipcode = zipcode();
                        _localctx.e.add(((AddressContext) _localctx).zipcode.e);
                    }
                    break;
                }
                setState(171);
                _la = _input.LA(1);
                if (_la == NAME) {
                    {
                        setState(164);
                        ((AddressContext) _localctx).city = city();
                        _localctx.e.add(((AddressContext) _localctx).city.e);
                        setState(169);
                        _la = _input.LA(1);
                        if (_la == NAME) {
                            {
                                setState(166);
                                ((AddressContext) _localctx).state = state();
                                _localctx.e.add(((AddressContext) _localctx).state.e);
                            }
                        }

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

    public static class ZipcodeContext extends ParserRuleContext {

        public JsonElement e;
        public Token INT;

        public TerminalNode INT(int i) {
            return getToken(ReceiptParser.INT, i);
        }

        public TerminalNode HIFEN() {
            return getToken(ReceiptParser.HIFEN, 0);
        }

        public List<TerminalNode> INT() {
            return getTokens(ReceiptParser.INT);
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
        enterRule(_localctx, 24, RULE_zipcode);
        String t = "";
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(173);
                ((ZipcodeContext) _localctx).INT = match(INT);
                t += ((ZipcodeContext) _localctx).INT.getText();
                setState(176);
                _la = _input.LA(1);
                if (_la == HIFEN) {
                    {
                        setState(175);
                        match(HIFEN);
                    }
                }

                setState(178);
                ((ZipcodeContext) _localctx).INT = match(INT);
                t += ((ZipcodeContext) _localctx).INT.getText();
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
        enterRule(_localctx, 26, RULE_city);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(182);
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
        public Token NAME;

        public TerminalNode NAME() {
            return getToken(ReceiptParser.NAME, 0);
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
        enterRule(_localctx, 28, RULE_state);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(185);
                ((StateContext) _localctx).NAME = match(NAME);
                ((StateContext) _localctx).e = new JsonElement("state", ((StateContext) _localctx).NAME.getText());
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
            = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\32\u00bf\4\2\t\2"
            + "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"
            + "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\6\2$\n"
            + "\2\r\2\16\2%\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"
            + "\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5"
            + "\5G\n\5\3\6\3\6\3\6\3\6\3\6\5\6N\n\6\3\7\3\7\5\7R\n\7\5\7T\n\7\3\7\3\7"
            + "\3\7\3\7\3\7\3\7\5\7\\\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7d\n\7\3\7\3\7\3"
            + "\7\3\b\3\b\5\bk\n\b\3\b\3\b\3\b\5\bp\n\b\3\b\3\b\6\bt\n\b\r\b\16\bu\3"
            + "\t\3\t\5\tz\n\t\3\t\3\t\3\t\3\n\3\n\5\n\u0081\n\n\3\n\3\n\3\n\3\13\3\13"
            + "\3\13\3\13\3\13\5\13\u008b\n\13\3\13\3\13\3\f\3\f\3\f\5\f\u0092\n\f\3"
            + "\f\5\f\u0095\n\f\3\f\5\f\u0098\n\f\3\f\3\f\3\r\3\r\5\r\u009e\n\r\3\r\3"
            + "\r\3\r\3\r\3\r\5\r\u00a5\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ac\n\r\5\r\u00ae"
            + "\n\r\3\16\3\16\3\16\5\16\u00b3\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"
            + "\3\20\3\20\3\20\3\20\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\u00cc"
            + "\2#\3\2\2\2\4<\3\2\2\2\6>\3\2\2\2\bA\3\2\2\2\nH\3\2\2\2\fS\3\2\2\2\16"
            + "h\3\2\2\2\20w\3\2\2\2\22~\3\2\2\2\24\u0085\3\2\2\2\26\u008e\3\2\2\2\30"
            + "\u009b\3\2\2\2\32\u00af\3\2\2\2\34\u00b8\3\2\2\2\36\u00bb\3\2\2\2 !\5"
            + "\4\3\2!\"\b\2\1\2\"$\3\2\2\2# \3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&"
            + "\3\3\2\2\2\'(\5\6\4\2()\b\3\1\2)=\3\2\2\2*+\5\b\5\2+,\b\3\1\2,=\3\2\2"
            + "\2-.\5\n\6\2./\b\3\1\2/=\3\2\2\2\60\61\5\f\7\2\61\62\b\3\1\2\62=\3\2\2"
            + "\2\63\64\5\16\b\2\64\65\b\3\1\2\65=\3\2\2\2\66\67\5\20\t\2\678\b\3\1\2"
            + "8=\3\2\2\29:\5\22\n\2:;\b\3\1\2;=\3\2\2\2<\'\3\2\2\2<*\3\2\2\2<-\3\2\2"
            + "\2<\60\3\2\2\2<\63\3\2\2\2<\66\3\2\2\2<9\3\2\2\2=\5\3\2\2\2>?\7\t\2\2"
            + "?@\b\4\1\2@\7\3\2\2\2AB\5\26\f\2BF\b\5\1\2CD\5\30\r\2DE\b\5\1\2EG\3\2"
            + "\2\2FC\3\2\2\2FG\3\2\2\2G\t\3\2\2\2HI\5\24\13\2IM\b\6\1\2JK\5\30\r\2K"
            + "L\b\6\1\2LN\3\2\2\2MJ\3\2\2\2MN\3\2\2\2N\13\3\2\2\2OQ\7\22\2\2PR\7\24"
            + "\2\2QP\3\2\2\2QR\3\2\2\2RT\3\2\2\2SO\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\t"
            + "\2\2V[\b\7\1\2WX\7\f\2\2X\\\b\7\1\2YZ\7\n\2\2Z\\\b\7\1\2[W\3\2\2\2[Y\3"
            + "\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\t\2\2^c\b\7\1\2_`\7\f\2\2`d\b\7\1\2a"
            + "b\7\n\2\2bd\b\7\1\2c_\3\2\2\2ca\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\t\2\2"
            + "fg\b\7\1\2g\r\3\2\2\2hj\7\23\2\2ik\7\24\2\2ji\3\2\2\2jk\3\2\2\2ks\3\2"
            + "\2\2lo\7\25\2\2mn\7\t\2\2np\b\b\1\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7"
            + "\7\2\2rt\b\b\1\2sl\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v\17\3\2\2\2w"
            + "y\7\20\2\2xz\7\24\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\7\2\2|}\b\t\1"
            + "\2}\21\3\2\2\2~\u0080\7\21\2\2\177\u0081\7\24\2\2\u0080\177\3\2\2\2\u0080"
            + "\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\7\2\2\u0083\u0084\b\n"
            + "\1\2\u0084\23\3\2\2\2\u0085\u008a\7\r\2\2\u0086\u0087\7\25\2\2\u0087\u008b"
            + "\7\3\2\2\u0088\u0089\7\3\2\2\u0089\u008b\7\25\2\2\u008a\u0086\3\2\2\2"
            + "\u008a\u0088\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\13\1\2\u008d\25"
            + "\3\2\2\2\u008e\u0097\7\16\2\2\u008f\u0091\7\25\2\2\u0090\u0092\7\3\2\2"
            + "\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0098\3\2\2\2\u0093\u0095"
            + "\7\3\2\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096"
            + "\u0098\7\25\2\2\u0097\u008f\3\2\2\2\u0097\u0094\3\2\2\2\u0098\u0099\3"
            + "\2\2\2\u0099\u009a\b\f\1\2\u009a\27\3\2\2\2\u009b\u009d\7\17\2\2\u009c"
            + "\u009e\7\24\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3"
            + "\2\2\2\u009f\u00a0\7\25\2\2\u00a0\u00a4\b\r\1\2\u00a1\u00a2\5\32\16\2"
            + "\u00a2\u00a3\b\r\1\2\u00a3\u00a5\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a5"
            + "\3\2\2\2\u00a5\u00ad\3\2\2\2\u00a6\u00a7\5\34\17\2\u00a7\u00ab\b\r\1\2"
            + "\u00a8\u00a9\5\36\20\2\u00a9\u00aa\b\r\1\2\u00aa\u00ac\3\2\2\2\u00ab\u00a8"
            + "\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00a6\3\2\2\2\u00ad"
            + "\u00ae\3\2\2\2\u00ae\31\3\2\2\2\u00af\u00b0\7\t\2\2\u00b0\u00b2\b\16\1"
            + "\2\u00b1\u00b3\7\n\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4"
            + "\3\2\2\2\u00b4\u00b5\7\t\2\2\u00b5\u00b6\b\16\1\2\u00b6\u00b7\b\16\1\2"
            + "\u00b7\33\3\2\2\2\u00b8\u00b9\7\25\2\2\u00b9\u00ba\b\17\1\2\u00ba\35\3"
            + "\2\2\2\u00bb\u00bc\7\25\2\2\u00bc\u00bd\b\20\1\2\u00bd\37\3\2\2\2\30%"
            + "<FMQS[cjouy\u0080\u008a\u0091\u0094\u0097\u009d\u00a4\u00ab\u00ad\u00b2";
    public static final ATN _ATN
            = ATNSimulator.deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
