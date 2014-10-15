// Generated from D:\Repositories\Compilers-2-assignment-2\Compiler\src\grammar\Receipt.g4 by ANTLR 4.1
package grammar;

    import json.infrastructure.*;

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
		IDNUMBER=1, SSN=2, CPF=3, CNPJ=4, NAME=5, DECIMAL=6, DOLLAR=7, INT=8, 
		HIFEN=9, DOT=10, SLASH=11, KEYWORD_TAX=12, KEYWORD_TOTAL=13, KEYWORD_DATE=14, 
		KEYWORD_PRODUCTS=15, COLON=16, LETTER=17, CAPITAL_LETTER=18, DIGIT=19, 
		WHITESPACE=20, OTHERWISE=21;
	public static final String[] tokenNames = {
		"<INVALID>", "IDNUMBER", "SSN", "CPF", "CNPJ", "NAME", "DECIMAL", "'$'", 
		"INT", "'-'", "'.'", "'/'", "KEYWORD_TAX", "'total'", "KEYWORD_DATE", 
		"KEYWORD_PRODUCTS", "':'", "LETTER", "CAPITAL_LETTER", "DIGIT", "WHITESPACE", 
		"OTHERWISE"
	};
	public static final int
		RULE_receipt = 0, RULE_basic = 1, RULE_id = 2, RULE_company = 3, RULE_buyer = 4, 
		RULE_date = 5, RULE_products = 6, RULE_tax = 7, RULE_total = 8, RULE_entity = 9, 
		RULE_address = 10, RULE_zipcode = 11, RULE_city = 12, RULE_state = 13;
	public static final String[] ruleNames = {
		"receipt", "basic", "id", "company", "buyer", "date", "products", "tax", 
		"total", "entity", "address", "zipcode", "city", "state"
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
		public JsonStructure e;
		public BasicContext basic;
		public List<BasicContext> basic() {
			return getRuleContexts(BasicContext.class);
		}
		public BasicContext basic(int i) {
			return getRuleContext(BasicContext.class,i);
		}
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
		 ((ReceiptContext)_localctx).e =  new JsonStructure("receipt"); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28); ((ReceiptContext)_localctx).basic = basic();
				 _localctx.e.add(((ReceiptContext)_localctx).basic.e); 
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDNUMBER) | (1L << NAME) | (1L << DECIMAL) | (1L << INT) | (1L << KEYWORD_TOTAL) | (1L << KEYWORD_DATE) | (1L << KEYWORD_PRODUCTS))) != 0) );
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

	public static class BasicContext extends ParserRuleContext {
		public JsonElement e;
		public IdContext id;
		public CompanyContext company;
		public BuyerContext buyer;
		public DateContext date;
		public ProductsContext products;
		public TaxContext tax;
		public TotalContext total;
		public TotalContext total() {
			return getRuleContext(TotalContext.class,0);
		}
		public BuyerContext buyer() {
			return getRuleContext(BuyerContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public CompanyContext company() {
			return getRuleContext(CompanyContext.class,0);
		}
		public TaxContext tax() {
			return getRuleContext(TaxContext.class,0);
		}
		public ProductsContext products() {
			return getRuleContext(ProductsContext.class,0);
		}
		public BasicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterBasic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitBasic(this);
		}
	}

	public final BasicContext basic() throws RecognitionException {
		BasicContext _localctx = new BasicContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_basic);
		try {
			setState(56);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35); ((BasicContext)_localctx).id = id();
				 ((BasicContext)_localctx).e =  ((BasicContext)_localctx).id.e;       
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38); ((BasicContext)_localctx).company = company();
				 ((BasicContext)_localctx).e =  ((BasicContext)_localctx).company.e;  
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41); ((BasicContext)_localctx).buyer = buyer();
				 ((BasicContext)_localctx).e =  ((BasicContext)_localctx).buyer.e;    
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44); ((BasicContext)_localctx).date = date();
				 ((BasicContext)_localctx).e =  ((BasicContext)_localctx).date.e;     
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(47); ((BasicContext)_localctx).products = products();
				 ((BasicContext)_localctx).e =  ((BasicContext)_localctx).products.e; 
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(50); ((BasicContext)_localctx).tax = tax();
				 ((BasicContext)_localctx).e =  ((BasicContext)_localctx).tax.e;      
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(53); ((BasicContext)_localctx).total = total();
				 ((BasicContext)_localctx).e =  ((BasicContext)_localctx).total.e;    
				}
				break;
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

	public static class IdContext extends ParserRuleContext {
		public JsonElement e;
		public Token INT;
		public TerminalNode INT() { return getToken(ReceiptParser.INT, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); ((IdContext)_localctx).INT = match(INT);
			 ((IdContext)_localctx).e =  new JsonElement("id", ((IdContext)_localctx).INT.getText()); 
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

	public static class CompanyContext extends ParserRuleContext {
		public JsonStructure e;
		public EntityContext entity;
		public AddressContext address;
		public ZipcodeContext zipcode;
		public CityContext city;
		public StateContext state;
		public CityContext city() {
			return getRuleContext(CityContext.class,0);
		}
		public TerminalNode HIFEN() { return getToken(ReceiptParser.HIFEN, 0); }
		public EntityContext entity() {
			return getRuleContext(EntityContext.class,0);
		}
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public ZipcodeContext zipcode() {
			return getRuleContext(ZipcodeContext.class,0);
		}
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public CompanyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_company; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterCompany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitCompany(this);
		}
	}

	public final CompanyContext company() throws RecognitionException {
		CompanyContext _localctx = new CompanyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_company);
		 ((CompanyContext)_localctx).e =  new JsonStructure("company"); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); ((CompanyContext)_localctx).entity = entity();
			 _localctx.e.add(((CompanyContext)_localctx).entity.e);  
			setState(75);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(63); ((CompanyContext)_localctx).address = address();
				 _localctx.e.add(((CompanyContext)_localctx).address.e); 
				setState(66);
				_la = _input.LA(1);
				if (_la==HIFEN) {
					{
					setState(65); match(HIFEN);
					}
				}

				setState(68); ((CompanyContext)_localctx).zipcode = zipcode();
				 _localctx.e.add(((CompanyContext)_localctx).zipcode.e); 
				setState(70); ((CompanyContext)_localctx).city = city();
				 _localctx.e.add(((CompanyContext)_localctx).city.e);    
				setState(72); ((CompanyContext)_localctx).state = state();
				 _localctx.e.add(((CompanyContext)_localctx).state.e);   
				}
				break;
			}
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

	public static class BuyerContext extends ParserRuleContext {
		public JsonStructure e;
		public EntityContext entity;
		public AddressContext address;
		public StateContext state;
		public EntityContext entity() {
			return getRuleContext(EntityContext.class,0);
		}
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public BuyerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buyer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterBuyer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitBuyer(this);
		}
	}

	public final BuyerContext buyer() throws RecognitionException {
		BuyerContext _localctx = new BuyerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_buyer);
		 ((BuyerContext)_localctx).e =  new JsonStructure("buyer"); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); ((BuyerContext)_localctx).entity = entity();
			 _localctx.e.add(((BuyerContext)_localctx).entity.e);  
			setState(79); ((BuyerContext)_localctx).address = address();
			 _localctx.e.add(((BuyerContext)_localctx).address.e); 
			setState(81); ((BuyerContext)_localctx).state = state();
			 _localctx.e.add(((BuyerContext)_localctx).state.e);   
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

	public static class DateContext extends ParserRuleContext {
		public JsonElement e;
		public Token INT;
		public TerminalNode INT(int i) {
			return getToken(ReceiptParser.INT, i);
		}
		public TerminalNode KEYWORD_DATE() { return getToken(ReceiptParser.KEYWORD_DATE, 0); }
		public List<TerminalNode> SLASH() { return getTokens(ReceiptParser.SLASH); }
		public TerminalNode COLON() { return getToken(ReceiptParser.COLON, 0); }
		public TerminalNode SLASH(int i) {
			return getToken(ReceiptParser.SLASH, i);
		}
		public List<TerminalNode> INT() { return getTokens(ReceiptParser.INT); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitDate(this);
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
			setState(88);
			_la = _input.LA(1);
			if (_la==KEYWORD_DATE) {
				{
				setState(84); match(KEYWORD_DATE);
				setState(86);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(85); match(COLON);
					}
				}

				}
			}

			setState(90); ((DateContext)_localctx).INT = match(INT);
			 t = ((DateContext)_localctx).INT.getText(); 
			setState(94);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(92); match(SLASH);
				 t += '/'; 
				}
			}

			setState(96); ((DateContext)_localctx).INT = match(INT);
			 t += ((DateContext)_localctx).INT.getText(); 
			setState(100);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(98); match(SLASH);
				 t += '/'; 
				}
			}

			setState(102); ((DateContext)_localctx).INT = match(INT);

			        t += ((DateContext)_localctx).INT.getText();
			        ((DateContext)_localctx).e =  new JsonElement("date", t);
			    
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

	public static class ProductsContext extends ParserRuleContext {
		public JsonStructure e;
		public TerminalNode NAME(int i) {
			return getToken(ReceiptParser.NAME, i);
		}
		public TerminalNode INT(int i) {
			return getToken(ReceiptParser.INT, i);
		}
		public List<TerminalNode> DECIMAL() { return getTokens(ReceiptParser.DECIMAL); }
		public List<TerminalNode> NAME() { return getTokens(ReceiptParser.NAME); }
		public TerminalNode DECIMAL(int i) {
			return getToken(ReceiptParser.DECIMAL, i);
		}
		public TerminalNode COLON() { return getToken(ReceiptParser.COLON, 0); }
		public TerminalNode KEYWORD_PRODUCTS() { return getToken(ReceiptParser.KEYWORD_PRODUCTS, 0); }
		public List<TerminalNode> INT() { return getTokens(ReceiptParser.INT); }
		public ProductsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_products; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterProducts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitProducts(this);
		}
	}

	public final ProductsContext products() throws RecognitionException {
		ProductsContext _localctx = new ProductsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_products);
		 ((ProductsContext)_localctx).e =  new JsonStructure("products"); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if (_la==KEYWORD_PRODUCTS) {
				{
				setState(105); match(KEYWORD_PRODUCTS);
				setState(107);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(106); match(COLON);
					}
				}

				}
			}

			setState(116); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(111); match(NAME);
					setState(113);
					_la = _input.LA(1);
					if (_la==INT) {
						{
						setState(112); match(INT);
						}
					}

					setState(115); match(DECIMAL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(118); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class TaxContext extends ParserRuleContext {
		public JsonElement e;
		public Token DECIMAL;
		public TerminalNode DECIMAL() { return getToken(ReceiptParser.DECIMAL, 0); }
		public TerminalNode COLON() { return getToken(ReceiptParser.COLON, 0); }
		public TerminalNode KEYWORD_TOTAL() { return getToken(ReceiptParser.KEYWORD_TOTAL, 0); }
		public TaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterTax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitTax(this);
		}
	}

	public final TaxContext tax() throws RecognitionException {
		TaxContext _localctx = new TaxContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if (_la==KEYWORD_TOTAL) {
				{
				setState(120); match(KEYWORD_TOTAL);
				setState(122);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(121); match(COLON);
					}
				}

				}
			}

			setState(126); ((TaxContext)_localctx).DECIMAL = match(DECIMAL);
			 ((TaxContext)_localctx).e =  new JsonElement("tax", ((TaxContext)_localctx).DECIMAL.getText()); 
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

	public static class TotalContext extends ParserRuleContext {
		public JsonElement e;
		public Token DECIMAL;
		public TerminalNode DECIMAL() { return getToken(ReceiptParser.DECIMAL, 0); }
		public TerminalNode COLON() { return getToken(ReceiptParser.COLON, 0); }
		public TerminalNode KEYWORD_TOTAL() { return getToken(ReceiptParser.KEYWORD_TOTAL, 0); }
		public TotalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_total; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterTotal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitTotal(this);
		}
	}

	public final TotalContext total() throws RecognitionException {
		TotalContext _localctx = new TotalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_total);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if (_la==KEYWORD_TOTAL) {
				{
				setState(129); match(KEYWORD_TOTAL);
				setState(131);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(130); match(COLON);
					}
				}

				}
			}

			setState(135); ((TotalContext)_localctx).DECIMAL = match(DECIMAL);
			 ((TotalContext)_localctx).e =  new JsonElement("total", ((TotalContext)_localctx).DECIMAL.getText()); 
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

	public static class EntityContext extends ParserRuleContext {
		public JsonStructure e;
		public Token NAME;
		public Token IDNUMBER;
		public TerminalNode NAME() { return getToken(ReceiptParser.NAME, 0); }
		public TerminalNode IDNUMBER() { return getToken(ReceiptParser.IDNUMBER, 0); }
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitEntity(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_entity);
		 ((EntityContext)_localctx).e =  new JsonStructure("entity"); 
		try {
			setState(144);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(138); ((EntityContext)_localctx).NAME = match(NAME);
				setState(139); ((EntityContext)_localctx).IDNUMBER = match(IDNUMBER);

				        _localctx.e
				            .add(new JsonElement("id", ((EntityContext)_localctx).IDNUMBER.getText()))
				            .add(new JsonElement("name", ((EntityContext)_localctx).NAME.getText()));
				    
				}
				break;
			case IDNUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(141); ((EntityContext)_localctx).IDNUMBER = match(IDNUMBER);
				setState(142); ((EntityContext)_localctx).NAME = match(NAME);

				        _localctx.e
				            .add(new JsonElement("id", ((EntityContext)_localctx).IDNUMBER.getText()))
				            .add(new JsonElement("name", ((EntityContext)_localctx).NAME.getText()));
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AddressContext extends ParserRuleContext {
		public JsonElement e;
		public Token NAME;
		public TerminalNode NAME() { return getToken(ReceiptParser.NAME, 0); }
		public AddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitAddress(this);
		}
	}

	public final AddressContext address() throws RecognitionException {
		AddressContext _localctx = new AddressContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); ((AddressContext)_localctx).NAME = match(NAME);
			 ((AddressContext)_localctx).e =  new JsonElement("address", ((AddressContext)_localctx).NAME.getText()); 
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

	public static class ZipcodeContext extends ParserRuleContext {
		public JsonElement e;
		public Token DIGIT;
		public TerminalNode HIFEN() { return getToken(ReceiptParser.HIFEN, 0); }
		public TerminalNode DIGIT(int i) {
			return getToken(ReceiptParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ReceiptParser.DIGIT); }
		public ZipcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zipcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterZipcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitZipcode(this);
		}
	}

	public final ZipcodeContext zipcode() throws RecognitionException {
		ZipcodeContext _localctx = new ZipcodeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_zipcode);
		 String t = ""; 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(149); ((ZipcodeContext)_localctx).DIGIT = match(DIGIT);
					 t += ((ZipcodeContext)_localctx).DIGIT.getText(); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(153); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(156);
			_la = _input.LA(1);
			if (_la==HIFEN) {
				{
				setState(155); match(HIFEN);
				}
			}

			setState(160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(158); ((ZipcodeContext)_localctx).DIGIT = match(DIGIT);
				 t += ((ZipcodeContext)_localctx).DIGIT.getText(); 
				}
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			 ((ZipcodeContext)_localctx).e =  new JsonElement("zipcode", t); 
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

	public static class CityContext extends ParserRuleContext {
		public JsonElement e;
		public Token NAME;
		public TerminalNode NAME() { return getToken(ReceiptParser.NAME, 0); }
		public CityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_city; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterCity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitCity(this);
		}
	}

	public final CityContext city() throws RecognitionException {
		CityContext _localctx = new CityContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_city);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); ((CityContext)_localctx).NAME = match(NAME);
			 ((CityContext)_localctx).e =  new JsonElement("city", ((CityContext)_localctx).NAME.getText()); 
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

	public static class StateContext extends ParserRuleContext {
		public JsonElement e;
		public Token CAPITAL_LETTER;
		public List<TerminalNode> CAPITAL_LETTER() { return getTokens(ReceiptParser.CAPITAL_LETTER); }
		public TerminalNode CAPITAL_LETTER(int i) {
			return getToken(ReceiptParser.CAPITAL_LETTER, i);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceiptListener ) ((ReceiptListener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_state);
		 String t; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); ((StateContext)_localctx).CAPITAL_LETTER = match(CAPITAL_LETTER);
			 t = ((StateContext)_localctx).CAPITAL_LETTER.getText(); 
			setState(171); ((StateContext)_localctx).CAPITAL_LETTER = match(CAPITAL_LETTER);

			        t += ((StateContext)_localctx).CAPITAL_LETTER.getText();
			        ((StateContext)_localctx).e =  new JsonElement("state", t);
			    
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\27\u00b1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\6\2\"\n\2\r\2\16"+
		"\2#\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5E\n\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5N\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\5\7Y\n\7\5\7[\n\7\3\7\3\7\3\7\3\7\5\7a\n\7\3\7\3\7\3\7\3\7\5\7g\n\7"+
		"\3\7\3\7\3\7\3\b\3\b\5\bn\n\b\5\bp\n\b\3\b\3\b\5\bt\n\b\3\b\6\bw\n\b\r"+
		"\b\16\bx\3\t\3\t\5\t}\n\t\5\t\177\n\t\3\t\3\t\3\t\3\n\3\n\5\n\u0086\n"+
		"\n\5\n\u0088\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0093"+
		"\n\13\3\f\3\f\3\f\3\r\3\r\6\r\u009a\n\r\r\r\16\r\u009b\3\r\5\r\u009f\n"+
		"\r\3\r\3\r\6\r\u00a3\n\r\r\r\16\r\u00a4\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\u00bb"+
		"\2!\3\2\2\2\4:\3\2\2\2\6<\3\2\2\2\b?\3\2\2\2\nO\3\2\2\2\fZ\3\2\2\2\16"+
		"o\3\2\2\2\20~\3\2\2\2\22\u0087\3\2\2\2\24\u0092\3\2\2\2\26\u0094\3\2\2"+
		"\2\30\u0099\3\2\2\2\32\u00a8\3\2\2\2\34\u00ab\3\2\2\2\36\37\5\4\3\2\37"+
		" \b\2\1\2 \"\3\2\2\2!\36\3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2"+
		"\2\2%&\5\6\4\2&\'\b\3\1\2\';\3\2\2\2()\5\b\5\2)*\b\3\1\2*;\3\2\2\2+,\5"+
		"\n\6\2,-\b\3\1\2-;\3\2\2\2./\5\f\7\2/\60\b\3\1\2\60;\3\2\2\2\61\62\5\16"+
		"\b\2\62\63\b\3\1\2\63;\3\2\2\2\64\65\5\20\t\2\65\66\b\3\1\2\66;\3\2\2"+
		"\2\678\5\22\n\289\b\3\1\29;\3\2\2\2:%\3\2\2\2:(\3\2\2\2:+\3\2\2\2:.\3"+
		"\2\2\2:\61\3\2\2\2:\64\3\2\2\2:\67\3\2\2\2;\5\3\2\2\2<=\7\n\2\2=>\b\4"+
		"\1\2>\7\3\2\2\2?@\5\24\13\2@M\b\5\1\2AB\5\26\f\2BD\b\5\1\2CE\7\13\2\2"+
		"DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\5\30\r\2GH\b\5\1\2HI\5\32\16\2IJ\b\5"+
		"\1\2JK\5\34\17\2KL\b\5\1\2LN\3\2\2\2MA\3\2\2\2MN\3\2\2\2N\t\3\2\2\2OP"+
		"\5\24\13\2PQ\b\6\1\2QR\5\26\f\2RS\b\6\1\2ST\5\34\17\2TU\b\6\1\2U\13\3"+
		"\2\2\2VX\7\20\2\2WY\7\22\2\2XW\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZV\3\2\2\2Z"+
		"[\3\2\2\2[\\\3\2\2\2\\]\7\n\2\2]`\b\7\1\2^_\7\r\2\2_a\b\7\1\2`^\3\2\2"+
		"\2`a\3\2\2\2ab\3\2\2\2bc\7\n\2\2cf\b\7\1\2de\7\r\2\2eg\b\7\1\2fd\3\2\2"+
		"\2fg\3\2\2\2gh\3\2\2\2hi\7\n\2\2ij\b\7\1\2j\r\3\2\2\2km\7\21\2\2ln\7\22"+
		"\2\2ml\3\2\2\2mn\3\2\2\2np\3\2\2\2ok\3\2\2\2op\3\2\2\2pv\3\2\2\2qs\7\7"+
		"\2\2rt\7\n\2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uw\7\b\2\2vq\3\2\2\2wx\3\2"+
		"\2\2xv\3\2\2\2xy\3\2\2\2y\17\3\2\2\2z|\7\17\2\2{}\7\22\2\2|{\3\2\2\2|"+
		"}\3\2\2\2}\177\3\2\2\2~z\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\7\b\2\2\u0081\u0082\b\t\1\2\u0082\21\3\2\2\2\u0083\u0085\7\17\2"+
		"\2\u0084\u0086\7\22\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0088\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008a\7\b\2\2\u008a\u008b\b\n\1\2\u008b\23\3\2\2\2\u008c\u008d"+
		"\7\7\2\2\u008d\u008e\7\3\2\2\u008e\u0093\b\13\1\2\u008f\u0090\7\3\2\2"+
		"\u0090\u0091\7\7\2\2\u0091\u0093\b\13\1\2\u0092\u008c\3\2\2\2\u0092\u008f"+
		"\3\2\2\2\u0093\25\3\2\2\2\u0094\u0095\7\7\2\2\u0095\u0096\b\f\1\2\u0096"+
		"\27\3\2\2\2\u0097\u0098\7\25\2\2\u0098\u009a\b\r\1\2\u0099\u0097\3\2\2"+
		"\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e"+
		"\3\2\2\2\u009d\u009f\7\13\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2"+
		"\u009f\u00a2\3\2\2\2\u00a0\u00a1\7\25\2\2\u00a1\u00a3\b\r\1\2\u00a2\u00a0"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\b\r\1\2\u00a7\31\3\2\2\2\u00a8\u00a9\7\7\2"+
		"\2\u00a9\u00aa\b\16\1\2\u00aa\33\3\2\2\2\u00ab\u00ac\7\24\2\2\u00ac\u00ad"+
		"\b\17\1\2\u00ad\u00ae\7\24\2\2\u00ae\u00af\b\17\1\2\u00af\35\3\2\2\2\26"+
		"#:DMXZ`fmosx|~\u0085\u0087\u0092\u009b\u009e\u00a4";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}