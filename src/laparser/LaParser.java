// Generated from D:\Repositories\Compilers-2-assignment-1\src\grammar\La.g4 by ANTLR 4.1
package laparser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LaParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__60=1, T__59=2, T__58=3, T__57=4, T__56=5, T__55=6, T__54=7, T__53=8, 
		T__52=9, T__51=10, T__50=11, T__49=12, T__48=13, T__47=14, T__46=15, T__45=16, 
		T__44=17, T__43=18, T__42=19, T__41=20, T__40=21, T__39=22, T__38=23, 
		T__37=24, T__36=25, T__35=26, T__34=27, T__33=28, T__32=29, T__31=30, 
		T__30=31, T__29=32, T__28=33, T__27=34, T__26=35, T__25=36, T__24=37, 
		T__23=38, T__22=39, T__21=40, T__20=41, T__19=42, T__18=43, T__17=44, 
		T__16=45, T__15=46, T__14=47, T__13=48, T__12=49, T__11=50, T__10=51, 
		T__9=52, T__8=53, T__7=54, T__6=55, T__5=56, T__4=57, T__3=58, T__2=59, 
		T__1=60, T__0=61, IDENT=62, STRING=63, INTEGER=64, REAL=65, COMMENT=66, 
		WS=67;
	public static final String[] tokenNames = {
		"<INVALID>", "'retorne'", "'algoritmo'", "'constante'", "'..'", "'='", 
		"'faca'", "'^'", "'literal'", "'nao'", "'ou'", "'fim_algoritmo'", "'seja'", 
		"'('", "'para'", "'fim_caso'", "'entao'", "'declare'", "','", "'verdadeiro'", 
		"'<-'", "'var'", "'logico'", "'senao'", "'fim_procedimento'", "'>='", 
		"'<'", "']'", "'type'", "'<>'", "'caso'", "'e'", "'enquanto'", "'register'", 
		"'+'", "'fim_para'", "'/'", "', '", "'fim_se'", "'ate'", "'<='", "'procedimento'", 
		"'falso'", "'&'", "'*'", "'.'", "'se'", "'):'", "'fim_enquanto'", "'fim_funcao'", 
		"'inteiro'", "':'", "'['", "'>'", "'escreva'", "'fim_register'", "'%'", 
		"')'", "'funcao'", "'-'", "'leia'", "'real'", "IDENT", "STRING", "INTEGER", 
		"REAL", "COMMENT", "WS"
	};
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_local_declaration = 2, RULE_global_declaration = 3, 
		RULE_type = 4, RULE_variable = 5, RULE_identifier = 6, RULE_extended_type = 7, 
		RULE_optional_pointers = 8, RULE_other_identifiers = 9, RULE_size = 10, 
		RULE_basic_type = 11, RULE_const_value = 12, RULE_register = 13, RULE_optional_params = 14, 
		RULE_parameter = 15, RULE_var_opcional = 16, RULE_more_identifier = 17, 
		RULE_local_declarations = 18, RULE_body = 19, RULE_comands = 20, RULE_cmd = 21, 
		RULE_more_expression = 22, RULE_optional_else = 23, RULE_chamada_atribuicao = 24, 
		RULE_optional_arguments = 25, RULE_selection = 26, RULE_constants = 27, 
		RULE_mais_constants = 28, RULE_interval_number = 29, RULE_op_unario = 30, 
		RULE_exp_aritmetica = 31, RULE_op_multiplicacao = 32, RULE_add_op = 33, 
		RULE_term = 34, RULE_other_terms = 35, RULE_factor = 36, RULE_outros_factores = 37, 
		RULE_parcela = 38, RULE_parcela_unario = 39, RULE_parcela_nao_unario = 40, 
		RULE_outras_parcelas = 41, RULE_relational_operator = 42, RULE_expression = 43, 
		RULE_logical_term = 44, RULE_logical_factor = 45;
	public static final String[] ruleNames = {
		"program", "declarations", "local_declaration", "global_declaration", 
		"type", "variable", "identifier", "extended_type", "optional_pointers", 
		"other_identifiers", "size", "basic_type", "const_value", "register", 
		"optional_params", "parameter", "var_opcional", "more_identifier", "local_declarations", 
		"body", "comands", "cmd", "more_expression", "optional_else", "chamada_atribuicao", 
		"optional_arguments", "selection", "constants", "mais_constants", "interval_number", 
		"op_unario", "exp_aritmetica", "op_multiplicacao", "add_op", "term", "other_terms", 
		"factor", "outros_factores", "parcela", "parcela_unario", "parcela_nao_unario", 
		"outras_parcelas", "relational_operator", "expression", "logical_term", 
		"logical_factor"
	};

	@Override
	public String getGrammarFileName() { return "La.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public LaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); declarations();
			setState(93); match(2);
			setState(94); body();
			setState(95); match(11);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public List<Global_declarationContext> global_declaration() {
			return getRuleContexts(Global_declarationContext.class);
		}
		public List<Local_declarationContext> local_declaration() {
			return getRuleContexts(Local_declarationContext.class);
		}
		public Local_declarationContext local_declaration(int i) {
			return getRuleContext(Local_declarationContext.class,i);
		}
		public Global_declarationContext global_declaration(int i) {
			return getRuleContext(Global_declarationContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 17) | (1L << 28) | (1L << 41) | (1L << 58))) != 0)) {
				{
				setState(99);
				switch (_input.LA(1)) {
				case 3:
				case 17:
				case 28:
					{
					setState(97); local_declaration();
					}
					break;
				case 41:
				case 58:
					{
					setState(98); global_declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Local_declarationContext extends ParserRuleContext {
		public Const_valueContext const_value() {
			return getRuleContext(Const_valueContext.class,0);
		}
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public Local_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterLocal_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitLocal_declaration(this);
		}
	}

	public final Local_declarationContext local_declaration() throws RecognitionException {
		Local_declarationContext _localctx = new Local_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_local_declaration);
		try {
			setState(117);
			switch (_input.LA(1)) {
			case 17:
				enterOuterAlt(_localctx, 1);
				{
				setState(104); match(17);
				setState(105); variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 2);
				{
				setState(106); match(3);
				setState(107); match(IDENT);
				setState(108); match(51);
				setState(109); basic_type();
				setState(110); match(5);
				setState(111); const_value();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 3);
				{
				setState(113); match(28);
				setState(114); match(IDENT);
				setState(115); match(51);
				setState(116); type();
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

	public static class Global_declarationContext extends ParserRuleContext {
		public Extended_typeContext extended_type() {
			return getRuleContext(Extended_typeContext.class,0);
		}
		public Optional_paramsContext optional_params() {
			return getRuleContext(Optional_paramsContext.class,0);
		}
		public ComandsContext comands() {
			return getRuleContext(ComandsContext.class,0);
		}
		public Local_declarationsContext local_declarations() {
			return getRuleContext(Local_declarationsContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public Global_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterGlobal_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitGlobal_declaration(this);
		}
	}

	public final Global_declarationContext global_declaration() throws RecognitionException {
		Global_declarationContext _localctx = new Global_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_global_declaration);
		try {
			setState(138);
			switch (_input.LA(1)) {
			case 41:
				enterOuterAlt(_localctx, 1);
				{
				setState(119); match(41);
				setState(120); match(IDENT);
				setState(121); match(13);
				setState(122); optional_params();
				setState(123); match(57);
				setState(124); local_declarations();
				setState(125); comands();
				setState(126); match(24);
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 2);
				{
				setState(128); match(58);
				setState(129); match(IDENT);
				setState(130); match(13);
				setState(131); optional_params();
				setState(132); match(47);
				setState(133); extended_type();
				setState(134); local_declarations();
				setState(135); comands();
				setState(136); match(49);
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

	public static class TypeContext extends ParserRuleContext {
		public Extended_typeContext extended_type() {
			return getRuleContext(Extended_typeContext.class,0);
		}
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(142);
			switch (_input.LA(1)) {
			case 33:
				enterOuterAlt(_localctx, 1);
				{
				setState(140); register();
				}
				break;
			case 7:
			case 8:
			case 22:
			case 50:
			case 61:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(141); extended_type();
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

	public static class VariableContext extends ParserRuleContext {
		public List<SizeContext> size() {
			return getRuleContexts(SizeContext.class);
		}
		public TerminalNode IDENT(int i) {
			return getToken(LaParser.IDENT, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SizeContext size(int i) {
			return getRuleContext(SizeContext.class,i);
		}
		public List<TerminalNode> IDENT() { return getTokens(LaParser.IDENT); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(IDENT);
			setState(145); size();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==18) {
				{
				{
				setState(146); match(18);
				setState(147); match(IDENT);
				setState(148); size();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154); match(51);
			setState(155); type();
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

	public static class IdentifierContext extends ParserRuleContext {
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public TerminalNode IDENT(int i) {
			return getToken(LaParser.IDENT, i);
		}
		public Optional_pointersContext optional_pointers() {
			return getRuleContext(Optional_pointersContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(LaParser.IDENT); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); optional_pointers();
			setState(158); match(IDENT);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==45) {
				{
				{
				setState(159); match(45);
				setState(160); match(IDENT);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166); size();
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

	public static class Extended_typeContext extends ParserRuleContext {
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public Optional_pointersContext optional_pointers() {
			return getRuleContext(Optional_pointersContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public Extended_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extended_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterExtended_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitExtended_type(this);
		}
	}

	public final Extended_typeContext extended_type() throws RecognitionException {
		Extended_typeContext _localctx = new Extended_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_extended_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); optional_pointers();
			setState(171);
			switch (_input.LA(1)) {
			case 8:
			case 22:
			case 50:
			case 61:
				{
				setState(169); basic_type();
				}
				break;
			case IDENT:
				{
				setState(170); match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Optional_pointersContext extends ParserRuleContext {
		public Optional_pointersContext optional_pointers() {
			return getRuleContext(Optional_pointersContext.class,0);
		}
		public Optional_pointersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_pointers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterOptional_pointers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitOptional_pointers(this);
		}
	}

	public final Optional_pointersContext optional_pointers() throws RecognitionException {
		Optional_pointersContext _localctx = new Optional_pointersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_optional_pointers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(173); match(7);
				setState(174); optional_pointers();
				}
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

	public static class Other_identifiersContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Other_identifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_identifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterOther_identifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitOther_identifiers(this);
		}
	}

	public final Other_identifiersContext other_identifiers() throws RecognitionException {
		Other_identifiersContext _localctx = new Other_identifiersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_other_identifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if (_la==45) {
				{
				setState(177); match(45);
				setState(178); identifier();
				}
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

	public static class SizeContext extends ParserRuleContext {
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitSize(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_size);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(181); match(52);
					setState(182); exp_aritmetica();
					setState(183); match(27);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(187); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Basic_typeContext extends ParserRuleContext {
		public Basic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterBasic_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitBasic_type(this);
		}
	}

	public final Basic_typeContext basic_type() throws RecognitionException {
		Basic_typeContext _localctx = new Basic_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_basic_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 22) | (1L << 50) | (1L << 61))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Const_valueContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(LaParser.REAL, 0); }
		public TerminalNode INTEGER() { return getToken(LaParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(LaParser.STRING, 0); }
		public Const_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterConst_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitConst_value(this);
		}
	}

	public final Const_valueContext const_value() throws RecognitionException {
		Const_valueContext _localctx = new Const_valueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_const_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_la = _input.LA(1);
			if ( !(((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (19 - 19)) | (1L << (42 - 19)) | (1L << (STRING - 19)) | (1L << (INTEGER - 19)) | (1L << (REAL - 19)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class RegisterContext extends ParserRuleContext {
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public RegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitRegister(this);
		}
	}

	public final RegisterContext register() throws RecognitionException {
		RegisterContext _localctx = new RegisterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_register);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); match(33);
			setState(195); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(194); variable();
				}
				}
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			setState(199); match(55);
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

	public static class Optional_paramsContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public Optional_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterOptional_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitOptional_params(this);
		}
	}

	public final Optional_paramsContext optional_params() throws RecognitionException {
		Optional_paramsContext _localctx = new Optional_paramsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_optional_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 21) | (1L << IDENT))) != 0)) {
				{
				setState(201); parameter();
				}
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

	public static class ParameterContext extends ParserRuleContext {
		public More_identifierContext more_identifier() {
			return getRuleContext(More_identifierContext.class,0);
		}
		public Extended_typeContext extended_type() {
			return getRuleContext(Extended_typeContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public Var_opcionalContext var_opcional() {
			return getRuleContext(Var_opcionalContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); var_opcional();
			setState(205); identifier();
			setState(206); more_identifier();
			setState(207); match(51);
			setState(208); extended_type();
			setState(211);
			_la = _input.LA(1);
			if (_la==37) {
				{
				setState(209); match(37);
				setState(210); parameter();
				}
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

	public static class Var_opcionalContext extends ParserRuleContext {
		public Var_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterVar_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitVar_opcional(this);
		}
	}

	public final Var_opcionalContext var_opcional() throws RecognitionException {
		Var_opcionalContext _localctx = new Var_opcionalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_var_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if (_la==21) {
				{
				setState(213); match(21);
				}
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

	public static class More_identifierContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public More_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterMore_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitMore_identifier(this);
		}
	}

	public final More_identifierContext more_identifier() throws RecognitionException {
		More_identifierContext _localctx = new More_identifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_more_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==18) {
				{
				{
				setState(216); match(18);
				setState(217); identifier();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Local_declarationsContext extends ParserRuleContext {
		public List<Local_declarationContext> local_declaration() {
			return getRuleContexts(Local_declarationContext.class);
		}
		public Local_declarationContext local_declaration(int i) {
			return getRuleContext(Local_declarationContext.class,i);
		}
		public Local_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterLocal_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitLocal_declarations(this);
		}
	}

	public final Local_declarationsContext local_declarations() throws RecognitionException {
		Local_declarationsContext _localctx = new Local_declarationsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_local_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(223); local_declaration();
				}
				}
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 17) | (1L << 28))) != 0) );
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

	public static class BodyContext extends ParserRuleContext {
		public ComandsContext comands() {
			return getRuleContext(ComandsContext.class,0);
		}
		public Local_declarationsContext local_declarations() {
			return getRuleContext(Local_declarationsContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); local_declarations();
			setState(229); comands();
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

	public static class ComandsContext extends ParserRuleContext {
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public ComandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterComands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitComands(this);
		}
	}

	public final ComandsContext comands() throws RecognitionException {
		ComandsContext _localctx = new ComandsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_comands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(231); cmd();
				}
				}
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 7) | (1L << 14) | (1L << 30) | (1L << 32) | (1L << 46) | (1L << 54) | (1L << 60) | (1L << IDENT))) != 0) );
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

	public static class CmdContext extends ParserRuleContext {
		public More_identifierContext more_identifier() {
			return getRuleContext(More_identifierContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public ComandsContext comands() {
			return getRuleContext(ComandsContext.class,0);
		}
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class,0);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public Chamada_atribuicaoContext chamada_atribuicao() {
			return getRuleContext(Chamada_atribuicaoContext.class,0);
		}
		public More_expressionContext more_expression() {
			return getRuleContext(More_expressionContext.class,0);
		}
		public Other_identifiersContext other_identifiers() {
			return getRuleContext(Other_identifiersContext.class,0);
		}
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Optional_elseContext optional_else() {
			return getRuleContext(Optional_elseContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmd);
		try {
			setState(294);
			switch (_input.LA(1)) {
			case 60:
				enterOuterAlt(_localctx, 1);
				{
				setState(236); match(60);
				setState(237); match(13);
				setState(238); identifier();
				setState(239); more_identifier();
				setState(240); match(57);
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 2);
				{
				setState(242); match(54);
				setState(243); match(13);
				setState(244); expression();
				setState(245); more_expression();
				setState(246); match(57);
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 3);
				{
				setState(248); match(46);
				setState(249); expression();
				setState(250); match(16);
				setState(251); comands();
				setState(252); optional_else();
				setState(253); match(38);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 4);
				{
				setState(255); match(30);
				setState(256); exp_aritmetica();
				setState(257); match(12);
				setState(258); selection();
				setState(259); optional_else();
				setState(260); match(15);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 5);
				{
				setState(262); match(14);
				setState(263); match(IDENT);
				setState(264); match(20);
				setState(265); exp_aritmetica();
				setState(266); match(39);
				setState(267); exp_aritmetica();
				setState(268); match(6);
				setState(269); comands();
				setState(270); match(35);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 6);
				{
				setState(272); match(32);
				setState(273); expression();
				setState(274); match(6);
				setState(275); comands();
				setState(276); match(48);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 7);
				{
				setState(278); match(6);
				setState(279); comands();
				setState(280); match(39);
				setState(281); expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 8);
				{
				setState(283); match(7);
				setState(284); match(IDENT);
				setState(285); other_identifiers();
				setState(286); size();
				setState(287); match(20);
				setState(288); expression();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(290); match(IDENT);
				setState(291); chamada_atribuicao();
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 10);
				{
				setState(292); match(1);
				setState(293); expression();
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

	public static class More_expressionContext extends ParserRuleContext {
		public More_expressionContext more_expression() {
			return getRuleContext(More_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public More_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterMore_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitMore_expression(this);
		}
	}

	public final More_expressionContext more_expression() throws RecognitionException {
		More_expressionContext _localctx = new More_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_more_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_la = _input.LA(1);
			if (_la==18) {
				{
				setState(296); match(18);
				setState(297); expression();
				setState(298); more_expression();
				}
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

	public static class Optional_elseContext extends ParserRuleContext {
		public ComandsContext comands() {
			return getRuleContext(ComandsContext.class,0);
		}
		public Optional_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterOptional_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitOptional_else(this);
		}
	}

	public final Optional_elseContext optional_else() throws RecognitionException {
		Optional_elseContext _localctx = new Optional_elseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_optional_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_la = _input.LA(1);
			if (_la==23) {
				{
				setState(302); match(23);
				setState(303); comands();
				}
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

	public static class Chamada_atribuicaoContext extends ParserRuleContext {
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public Optional_argumentsContext optional_arguments() {
			return getRuleContext(Optional_argumentsContext.class,0);
		}
		public Other_identifiersContext other_identifiers() {
			return getRuleContext(Other_identifiersContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Chamada_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterChamada_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitChamada_atribuicao(this);
		}
	}

	public final Chamada_atribuicaoContext chamada_atribuicao() throws RecognitionException {
		Chamada_atribuicaoContext _localctx = new Chamada_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_chamada_atribuicao);
		try {
			setState(315);
			switch (_input.LA(1)) {
			case 13:
				enterOuterAlt(_localctx, 1);
				{
				setState(306); match(13);
				setState(307); optional_arguments();
				setState(308); match(57);
				}
				break;
			case 45:
			case 52:
				enterOuterAlt(_localctx, 2);
				{
				setState(310); other_identifiers();
				setState(311); size();
				setState(312); match(20);
				setState(313); expression();
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

	public static class Optional_argumentsContext extends ParserRuleContext {
		public More_expressionContext more_expression() {
			return getRuleContext(More_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Optional_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterOptional_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitOptional_arguments(this);
		}
	}

	public final Optional_argumentsContext optional_arguments() throws RecognitionException {
		Optional_argumentsContext _localctx = new Optional_argumentsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_optional_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (7 - 7)) | (1L << (9 - 7)) | (1L << (13 - 7)) | (1L << (19 - 7)) | (1L << (42 - 7)) | (1L << (43 - 7)) | (1L << (59 - 7)) | (1L << (IDENT - 7)) | (1L << (STRING - 7)) | (1L << (INTEGER - 7)) | (1L << (REAL - 7)))) != 0)) {
				{
				setState(317); expression();
				setState(318); more_expression();
				}
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

	public static class SelectionContext extends ParserRuleContext {
		public ConstantsContext constants(int i) {
			return getRuleContext(ConstantsContext.class,i);
		}
		public List<ComandsContext> comands() {
			return getRuleContexts(ComandsContext.class);
		}
		public ComandsContext comands(int i) {
			return getRuleContext(ComandsContext.class,i);
		}
		public List<ConstantsContext> constants() {
			return getRuleContexts(ConstantsContext.class);
		}
		public SelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitSelection(this);
		}
	}

	public final SelectionContext selection() throws RecognitionException {
		SelectionContext _localctx = new SelectionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_selection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(322); constants();
				setState(323); match(51);
				setState(324); comands();
				}
				}
				setState(328); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==59 || _la==INTEGER );
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

	public static class ConstantsContext extends ParserRuleContext {
		public Mais_constantsContext mais_constants() {
			return getRuleContext(Mais_constantsContext.class,0);
		}
		public Interval_numberContext interval_number() {
			return getRuleContext(Interval_numberContext.class,0);
		}
		public ConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitConstants(this);
		}
	}

	public final ConstantsContext constants() throws RecognitionException {
		ConstantsContext _localctx = new ConstantsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constants);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330); interval_number();
			setState(331); mais_constants();
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

	public static class Mais_constantsContext extends ParserRuleContext {
		public ConstantsContext constants() {
			return getRuleContext(ConstantsContext.class,0);
		}
		public Mais_constantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_constants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterMais_constants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitMais_constants(this);
		}
	}

	public final Mais_constantsContext mais_constants() throws RecognitionException {
		Mais_constantsContext _localctx = new Mais_constantsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_mais_constants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_la = _input.LA(1);
			if (_la==18) {
				{
				setState(333); match(18);
				setState(334); constants();
				}
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

	public static class Interval_numberContext extends ParserRuleContext {
		public List<TerminalNode> INTEGER() { return getTokens(LaParser.INTEGER); }
		public Op_unarioContext op_unario(int i) {
			return getRuleContext(Op_unarioContext.class,i);
		}
		public List<Op_unarioContext> op_unario() {
			return getRuleContexts(Op_unarioContext.class);
		}
		public TerminalNode INTEGER(int i) {
			return getToken(LaParser.INTEGER, i);
		}
		public Interval_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterInterval_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitInterval_number(this);
		}
	}

	public final Interval_numberContext interval_number() throws RecognitionException {
		Interval_numberContext _localctx = new Interval_numberContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_interval_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337); op_unario();
			setState(338); match(INTEGER);
			setState(343);
			_la = _input.LA(1);
			if (_la==4) {
				{
				setState(339); match(4);
				setState(340); op_unario();
				setState(341); match(INTEGER);
				}
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

	public static class Op_unarioContext extends ParserRuleContext {
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitOp_unario(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_op_unario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_la = _input.LA(1);
			if (_la==59) {
				{
				setState(345); match(59);
				}
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

	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Other_termsContext other_terms() {
			return getRuleContext(Other_termsContext.class,0);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterExp_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitExp_aritmetica(this);
		}
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_exp_aritmetica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348); term();
			setState(349); other_terms();
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

	public static class Op_multiplicacaoContext extends ParserRuleContext {
		public Op_multiplicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_multiplicacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterOp_multiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitOp_multiplicacao(this);
		}
	}

	public final Op_multiplicacaoContext op_multiplicacao() throws RecognitionException {
		Op_multiplicacaoContext _localctx = new Op_multiplicacaoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_op_multiplicacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_la = _input.LA(1);
			if ( !(_la==36 || _la==44) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Add_opContext extends ParserRuleContext {
		public Add_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterAdd_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitAdd_op(this);
		}
	}

	public final Add_opContext add_op() throws RecognitionException {
		Add_opContext _localctx = new Add_opContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_add_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_la = _input.LA(1);
			if ( !(_la==34 || _la==59) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Outros_factoresContext outros_factores() {
			return getRuleContext(Outros_factoresContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355); factor();
			setState(356); outros_factores();
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

	public static class Other_termsContext extends ParserRuleContext {
		public Add_opContext add_op() {
			return getRuleContext(Add_opContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Other_termsContext other_terms() {
			return getRuleContext(Other_termsContext.class,0);
		}
		public Other_termsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterOther_terms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitOther_terms(this);
		}
	}

	public final Other_termsContext other_terms() throws RecognitionException {
		Other_termsContext _localctx = new Other_termsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_other_terms);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(358); add_op();
				setState(359); term();
				setState(360); other_terms();
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

	public static class FactorContext extends ParserRuleContext {
		public ParcelaContext parcela() {
			return getRuleContext(ParcelaContext.class,0);
		}
		public Outras_parcelasContext outras_parcelas() {
			return getRuleContext(Outras_parcelasContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364); parcela();
			setState(365); outras_parcelas();
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

	public static class Outros_factoresContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Outros_factoresContext outros_factores() {
			return getRuleContext(Outros_factoresContext.class,0);
		}
		public Op_multiplicacaoContext op_multiplicacao() {
			return getRuleContext(Op_multiplicacaoContext.class,0);
		}
		public Outros_factoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_factores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterOutros_factores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitOutros_factores(this);
		}
	}

	public final Outros_factoresContext outros_factores() throws RecognitionException {
		Outros_factoresContext _localctx = new Outros_factoresContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_outros_factores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_la = _input.LA(1);
			if (_la==36 || _la==44) {
				{
				setState(367); op_multiplicacao();
				setState(368); factor();
				setState(369); outros_factores();
				}
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

	public static class ParcelaContext extends ParserRuleContext {
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitParcela(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_parcela);
		try {
			setState(377);
			switch (_input.LA(1)) {
			case 7:
			case 13:
			case 59:
			case IDENT:
			case INTEGER:
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(373); op_unario();
				setState(374); parcela_unario();
				}
				break;
			case 43:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(376); parcela_nao_unario();
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

	public static class Parcela_unarioContext extends ParserRuleContext {
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public TerminalNode REAL() { return getToken(LaParser.REAL, 0); }
		public TerminalNode INTEGER() { return getToken(LaParser.INTEGER, 0); }
		public More_expressionContext more_expression() {
			return getRuleContext(More_expressionContext.class,0);
		}
		public Other_identifiersContext other_identifiers() {
			return getRuleContext(Other_identifiersContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitParcela_unario(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parcela_unario);
		try {
			setState(400);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379); match(7);
				setState(380); match(IDENT);
				setState(381); other_identifiers();
				setState(382); size();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384); match(IDENT);
				setState(385); other_identifiers();
				setState(386); size();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(388); match(IDENT);
				setState(389); match(13);
				setState(390); expression();
				setState(391); more_expression();
				setState(392); match(57);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(394); match(INTEGER);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(395); match(REAL);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(396); match(13);
				setState(397); expression();
				setState(398); match(57);
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

	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public Other_identifiersContext other_identifiers() {
			return getRuleContext(Other_identifiersContext.class,0);
		}
		public TerminalNode STRING() { return getToken(LaParser.STRING, 0); }
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitParcela_nao_unario(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_parcela_nao_unario);
		try {
			setState(408);
			switch (_input.LA(1)) {
			case 43:
				enterOuterAlt(_localctx, 1);
				{
				setState(402); match(43);
				setState(403); match(IDENT);
				setState(404); other_identifiers();
				setState(405); size();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(407); match(STRING);
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

	public static class Outras_parcelasContext extends ParserRuleContext {
		public ParcelaContext parcela() {
			return getRuleContext(ParcelaContext.class,0);
		}
		public Outras_parcelasContext outras_parcelas() {
			return getRuleContext(Outras_parcelasContext.class,0);
		}
		public Outras_parcelasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outras_parcelas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterOutras_parcelas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitOutras_parcelas(this);
		}
	}

	public final Outras_parcelasContext outras_parcelas() throws RecognitionException {
		Outras_parcelasContext _localctx = new Outras_parcelasContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_outras_parcelas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_la = _input.LA(1);
			if (_la==56) {
				{
				setState(410); match(56);
				setState(411); parcela();
				setState(412); outras_parcelas();
				}
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

	public static class Relational_operatorContext extends ParserRuleContext {
		public Relational_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterRelational_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitRelational_operator(this);
		}
	}

	public final Relational_operatorContext relational_operator() throws RecognitionException {
		Relational_operatorContext _localctx = new Relational_operatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 25) | (1L << 26) | (1L << 29) | (1L << 40) | (1L << 53))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<Logical_termContext> logical_term() {
			return getRuleContexts(Logical_termContext.class);
		}
		public Logical_termContext logical_term(int i) {
			return getRuleContext(Logical_termContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418); logical_term();
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==10) {
				{
				{
				setState(419); match(10);
				setState(420); logical_term();
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Logical_termContext extends ParserRuleContext {
		public List<Logical_factorContext> logical_factor() {
			return getRuleContexts(Logical_factorContext.class);
		}
		public Logical_factorContext logical_factor(int i) {
			return getRuleContext(Logical_factorContext.class,i);
		}
		public Logical_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterLogical_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitLogical_term(this);
		}
	}

	public final Logical_termContext logical_term() throws RecognitionException {
		Logical_termContext _localctx = new Logical_termContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_logical_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426); logical_factor();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==31) {
				{
				{
				setState(427); match(31);
				setState(428); logical_factor();
				}
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Logical_factorContext extends ParserRuleContext {
		public Relational_operatorContext relational_operator() {
			return getRuleContext(Relational_operatorContext.class,0);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Logical_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).enterLogical_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaListener ) ((LaListener)listener).exitLogical_factor(this);
		}
	}

	public final Logical_factorContext logical_factor() throws RecognitionException {
		Logical_factorContext _localctx = new Logical_factorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_logical_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_la = _input.LA(1);
			if (_la==9) {
				{
				setState(434); match(9);
				}
			}

			setState(445);
			switch (_input.LA(1)) {
			case 19:
				{
				setState(437); match(19);
				}
				break;
			case 42:
				{
				setState(438); match(42);
				}
				break;
			case 7:
			case 13:
			case 43:
			case 59:
			case IDENT:
			case STRING:
			case INTEGER:
			case REAL:
				{
				setState(439); exp_aritmetica();
				setState(443);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 25) | (1L << 26) | (1L << 29) | (1L << 40) | (1L << 53))) != 0)) {
					{
					setState(440); relational_operator();
					setState(441); exp_aritmetica();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3E\u01c2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\3\3\3\7\3f\n\3\f\3\16\3i"+
		"\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4x\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u008d\n\5\3\6\3\6\5\6\u0091\n\6\3\7\3\7\3\7\3\7\3\7\7\7\u0098\n"+
		"\7\f\7\16\7\u009b\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u00a4\n\b\f\b\16"+
		"\b\u00a7\13\b\3\b\3\b\3\t\3\t\3\t\5\t\u00ae\n\t\3\n\3\n\5\n\u00b2\n\n"+
		"\3\13\3\13\5\13\u00b6\n\13\3\f\3\f\3\f\3\f\6\f\u00bc\n\f\r\f\16\f\u00bd"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\6\17\u00c6\n\17\r\17\16\17\u00c7\3\17\3\17"+
		"\3\20\5\20\u00cd\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00d6\n"+
		"\21\3\22\5\22\u00d9\n\22\3\23\3\23\7\23\u00dd\n\23\f\23\16\23\u00e0\13"+
		"\23\3\24\6\24\u00e3\n\24\r\24\16\24\u00e4\3\25\3\25\3\25\3\26\6\26\u00eb"+
		"\n\26\r\26\16\26\u00ec\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0129\n\27\3\30\3\30\3\30\3\30"+
		"\5\30\u012f\n\30\3\31\3\31\5\31\u0133\n\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\5\32\u013e\n\32\3\33\3\33\3\33\5\33\u0143\n\33\3\34"+
		"\3\34\3\34\3\34\6\34\u0149\n\34\r\34\16\34\u014a\3\35\3\35\3\35\3\36\3"+
		"\36\5\36\u0152\n\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u015a\n\37\3 \5"+
		" \u015d\n \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3%\5%\u016d\n%\3&"+
		"\3&\3&\3\'\3\'\3\'\3\'\5\'\u0176\n\'\3(\3(\3(\3(\5(\u017c\n(\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0193\n)\3*"+
		"\3*\3*\3*\3*\3*\5*\u019b\n*\3+\3+\3+\3+\5+\u01a1\n+\3,\3,\3-\3-\3-\7-"+
		"\u01a8\n-\f-\16-\u01ab\13-\3.\3.\3.\7.\u01b0\n.\f.\16.\u01b3\13.\3/\5"+
		"/\u01b6\n/\3/\3/\3/\3/\3/\3/\5/\u01be\n/\5/\u01c0\n/\3/\2\60\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"\2\7\6\2\n\n\30\30\64\64??\5\2\25\25,,AC\4\2&&..\4\2$$==\7\2\7\7\33\34"+
		"\37\37**\67\67\u01c7\2^\3\2\2\2\4g\3\2\2\2\6w\3\2\2\2\b\u008c\3\2\2\2"+
		"\n\u0090\3\2\2\2\f\u0092\3\2\2\2\16\u009f\3\2\2\2\20\u00aa\3\2\2\2\22"+
		"\u00b1\3\2\2\2\24\u00b5\3\2\2\2\26\u00bb\3\2\2\2\30\u00bf\3\2\2\2\32\u00c1"+
		"\3\2\2\2\34\u00c3\3\2\2\2\36\u00cc\3\2\2\2 \u00ce\3\2\2\2\"\u00d8\3\2"+
		"\2\2$\u00de\3\2\2\2&\u00e2\3\2\2\2(\u00e6\3\2\2\2*\u00ea\3\2\2\2,\u0128"+
		"\3\2\2\2.\u012e\3\2\2\2\60\u0132\3\2\2\2\62\u013d\3\2\2\2\64\u0142\3\2"+
		"\2\2\66\u0148\3\2\2\28\u014c\3\2\2\2:\u0151\3\2\2\2<\u0153\3\2\2\2>\u015c"+
		"\3\2\2\2@\u015e\3\2\2\2B\u0161\3\2\2\2D\u0163\3\2\2\2F\u0165\3\2\2\2H"+
		"\u016c\3\2\2\2J\u016e\3\2\2\2L\u0175\3\2\2\2N\u017b\3\2\2\2P\u0192\3\2"+
		"\2\2R\u019a\3\2\2\2T\u01a0\3\2\2\2V\u01a2\3\2\2\2X\u01a4\3\2\2\2Z\u01ac"+
		"\3\2\2\2\\\u01b5\3\2\2\2^_\5\4\3\2_`\7\4\2\2`a\5(\25\2ab\7\r\2\2b\3\3"+
		"\2\2\2cf\5\6\4\2df\5\b\5\2ec\3\2\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3"+
		"\2\2\2h\5\3\2\2\2ig\3\2\2\2jk\7\23\2\2kx\5\f\7\2lm\7\5\2\2mn\7@\2\2no"+
		"\7\65\2\2op\5\30\r\2pq\7\7\2\2qr\5\32\16\2rx\3\2\2\2st\7\36\2\2tu\7@\2"+
		"\2uv\7\65\2\2vx\5\n\6\2wj\3\2\2\2wl\3\2\2\2ws\3\2\2\2x\7\3\2\2\2yz\7+"+
		"\2\2z{\7@\2\2{|\7\17\2\2|}\5\36\20\2}~\7;\2\2~\177\5&\24\2\177\u0080\5"+
		"*\26\2\u0080\u0081\7\32\2\2\u0081\u008d\3\2\2\2\u0082\u0083\7<\2\2\u0083"+
		"\u0084\7@\2\2\u0084\u0085\7\17\2\2\u0085\u0086\5\36\20\2\u0086\u0087\7"+
		"\61\2\2\u0087\u0088\5\20\t\2\u0088\u0089\5&\24\2\u0089\u008a\5*\26\2\u008a"+
		"\u008b\7\63\2\2\u008b\u008d\3\2\2\2\u008cy\3\2\2\2\u008c\u0082\3\2\2\2"+
		"\u008d\t\3\2\2\2\u008e\u0091\5\34\17\2\u008f\u0091\5\20\t\2\u0090\u008e"+
		"\3\2\2\2\u0090\u008f\3\2\2\2\u0091\13\3\2\2\2\u0092\u0093\7@\2\2\u0093"+
		"\u0099\5\26\f\2\u0094\u0095\7\24\2\2\u0095\u0096\7@\2\2\u0096\u0098\5"+
		"\26\f\2\u0097\u0094\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\65"+
		"\2\2\u009d\u009e\5\n\6\2\u009e\r\3\2\2\2\u009f\u00a0\5\22\n\2\u00a0\u00a5"+
		"\7@\2\2\u00a1\u00a2\7/\2\2\u00a2\u00a4\7@\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\5\26\f\2\u00a9\17\3\2\2\2\u00aa\u00ad"+
		"\5\22\n\2\u00ab\u00ae\5\30\r\2\u00ac\u00ae\7@\2\2\u00ad\u00ab\3\2\2\2"+
		"\u00ad\u00ac\3\2\2\2\u00ae\21\3\2\2\2\u00af\u00b0\7\t\2\2\u00b0\u00b2"+
		"\5\22\n\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\23\3\2\2\2\u00b3"+
		"\u00b4\7/\2\2\u00b4\u00b6\5\16\b\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\25\3\2\2\2\u00b7\u00b8\7\66\2\2\u00b8\u00b9\5@!\2\u00b9\u00ba"+
		"\7\35\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bc\u00bd\3\2\2\2"+
		"\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\27\3\2\2\2\u00bf\u00c0"+
		"\t\2\2\2\u00c0\31\3\2\2\2\u00c1\u00c2\t\3\2\2\u00c2\33\3\2\2\2\u00c3\u00c5"+
		"\7#\2\2\u00c4\u00c6\5\f\7\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\79"+
		"\2\2\u00ca\35\3\2\2\2\u00cb\u00cd\5 \21\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\37\3\2\2\2\u00ce\u00cf\5\"\22\2\u00cf\u00d0\5\16\b\2\u00d0"+
		"\u00d1\5$\23\2\u00d1\u00d2\7\65\2\2\u00d2\u00d5\5\20\t\2\u00d3\u00d4\7"+
		"\'\2\2\u00d4\u00d6\5 \21\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"!\3\2\2\2\u00d7\u00d9\7\27\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2"+
		"\u00d9#\3\2\2\2\u00da\u00db\7\24\2\2\u00db\u00dd\5\16\b\2\u00dc\u00da"+
		"\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"%\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e3\5\6\4\2\u00e2\u00e1\3\2\2\2"+
		"\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\'\3"+
		"\2\2\2\u00e6\u00e7\5&\24\2\u00e7\u00e8\5*\26\2\u00e8)\3\2\2\2\u00e9\u00eb"+
		"\5,\27\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed+\3\2\2\2\u00ee\u00ef\7>\2\2\u00ef\u00f0\7\17\2\2"+
		"\u00f0\u00f1\5\16\b\2\u00f1\u00f2\5$\23\2\u00f2\u00f3\7;\2\2\u00f3\u0129"+
		"\3\2\2\2\u00f4\u00f5\78\2\2\u00f5\u00f6\7\17\2\2\u00f6\u00f7\5X-\2\u00f7"+
		"\u00f8\5.\30\2\u00f8\u00f9\7;\2\2\u00f9\u0129\3\2\2\2\u00fa\u00fb\7\60"+
		"\2\2\u00fb\u00fc\5X-\2\u00fc\u00fd\7\22\2\2\u00fd\u00fe\5*\26\2\u00fe"+
		"\u00ff\5\60\31\2\u00ff\u0100\7(\2\2\u0100\u0129\3\2\2\2\u0101\u0102\7"+
		" \2\2\u0102\u0103\5@!\2\u0103\u0104\7\16\2\2\u0104\u0105\5\66\34\2\u0105"+
		"\u0106\5\60\31\2\u0106\u0107\7\21\2\2\u0107\u0129\3\2\2\2\u0108\u0109"+
		"\7\20\2\2\u0109\u010a\7@\2\2\u010a\u010b\7\26\2\2\u010b\u010c\5@!\2\u010c"+
		"\u010d\7)\2\2\u010d\u010e\5@!\2\u010e\u010f\7\b\2\2\u010f\u0110\5*\26"+
		"\2\u0110\u0111\7%\2\2\u0111\u0129\3\2\2\2\u0112\u0113\7\"\2\2\u0113\u0114"+
		"\5X-\2\u0114\u0115\7\b\2\2\u0115\u0116\5*\26\2\u0116\u0117\7\62\2\2\u0117"+
		"\u0129\3\2\2\2\u0118\u0119\7\b\2\2\u0119\u011a\5*\26\2\u011a\u011b\7)"+
		"\2\2\u011b\u011c\5X-\2\u011c\u0129\3\2\2\2\u011d\u011e\7\t\2\2\u011e\u011f"+
		"\7@\2\2\u011f\u0120\5\24\13\2\u0120\u0121\5\26\f\2\u0121\u0122\7\26\2"+
		"\2\u0122\u0123\5X-\2\u0123\u0129\3\2\2\2\u0124\u0125\7@\2\2\u0125\u0129"+
		"\5\62\32\2\u0126\u0127\7\3\2\2\u0127\u0129\5X-\2\u0128\u00ee\3\2\2\2\u0128"+
		"\u00f4\3\2\2\2\u0128\u00fa\3\2\2\2\u0128\u0101\3\2\2\2\u0128\u0108\3\2"+
		"\2\2\u0128\u0112\3\2\2\2\u0128\u0118\3\2\2\2\u0128\u011d\3\2\2\2\u0128"+
		"\u0124\3\2\2\2\u0128\u0126\3\2\2\2\u0129-\3\2\2\2\u012a\u012b\7\24\2\2"+
		"\u012b\u012c\5X-\2\u012c\u012d\5.\30\2\u012d\u012f\3\2\2\2\u012e\u012a"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012f/\3\2\2\2\u0130\u0131\7\31\2\2\u0131"+
		"\u0133\5*\26\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\61\3\2\2"+
		"\2\u0134\u0135\7\17\2\2\u0135\u0136\5\64\33\2\u0136\u0137\7;\2\2\u0137"+
		"\u013e\3\2\2\2\u0138\u0139\5\24\13\2\u0139\u013a\5\26\f\2\u013a\u013b"+
		"\7\26\2\2\u013b\u013c\5X-\2\u013c\u013e\3\2\2\2\u013d\u0134\3\2\2\2\u013d"+
		"\u0138\3\2\2\2\u013e\63\3\2\2\2\u013f\u0140\5X-\2\u0140\u0141\5.\30\2"+
		"\u0141\u0143\3\2\2\2\u0142\u013f\3\2\2\2\u0142\u0143\3\2\2\2\u0143\65"+
		"\3\2\2\2\u0144\u0145\58\35\2\u0145\u0146\7\65\2\2\u0146\u0147\5*\26\2"+
		"\u0147\u0149\3\2\2\2\u0148\u0144\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\67\3\2\2\2\u014c\u014d\5<\37\2\u014d"+
		"\u014e\5:\36\2\u014e9\3\2\2\2\u014f\u0150\7\24\2\2\u0150\u0152\58\35\2"+
		"\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152;\3\2\2\2\u0153\u0154\5"+
		"> \2\u0154\u0159\7B\2\2\u0155\u0156\7\6\2\2\u0156\u0157\5> \2\u0157\u0158"+
		"\7B\2\2\u0158\u015a\3\2\2\2\u0159\u0155\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"=\3\2\2\2\u015b\u015d\7=\2\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"?\3\2\2\2\u015e\u015f\5F$\2\u015f\u0160\5H%\2\u0160A\3\2\2\2\u0161\u0162"+
		"\t\4\2\2\u0162C\3\2\2\2\u0163\u0164\t\5\2\2\u0164E\3\2\2\2\u0165\u0166"+
		"\5J&\2\u0166\u0167\5L\'\2\u0167G\3\2\2\2\u0168\u0169\5D#\2\u0169\u016a"+
		"\5F$\2\u016a\u016b\5H%\2\u016b\u016d\3\2\2\2\u016c\u0168\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016dI\3\2\2\2\u016e\u016f\5N(\2\u016f\u0170\5T+\2\u0170"+
		"K\3\2\2\2\u0171\u0172\5B\"\2\u0172\u0173\5J&\2\u0173\u0174\5L\'\2\u0174"+
		"\u0176\3\2\2\2\u0175\u0171\3\2\2\2\u0175\u0176\3\2\2\2\u0176M\3\2\2\2"+
		"\u0177\u0178\5> \2\u0178\u0179\5P)\2\u0179\u017c\3\2\2\2\u017a\u017c\5"+
		"R*\2\u017b\u0177\3\2\2\2\u017b\u017a\3\2\2\2\u017cO\3\2\2\2\u017d\u017e"+
		"\7\t\2\2\u017e\u017f\7@\2\2\u017f\u0180\5\24\13\2\u0180\u0181\5\26\f\2"+
		"\u0181\u0193\3\2\2\2\u0182\u0183\7@\2\2\u0183\u0184\5\24\13\2\u0184\u0185"+
		"\5\26\f\2\u0185\u0193\3\2\2\2\u0186\u0187\7@\2\2\u0187\u0188\7\17\2\2"+
		"\u0188\u0189\5X-\2\u0189\u018a\5.\30\2\u018a\u018b\7;\2\2\u018b\u0193"+
		"\3\2\2\2\u018c\u0193\7B\2\2\u018d\u0193\7C\2\2\u018e\u018f\7\17\2\2\u018f"+
		"\u0190\5X-\2\u0190\u0191\7;\2\2\u0191\u0193\3\2\2\2\u0192\u017d\3\2\2"+
		"\2\u0192\u0182\3\2\2\2\u0192\u0186\3\2\2\2\u0192\u018c\3\2\2\2\u0192\u018d"+
		"\3\2\2\2\u0192\u018e\3\2\2\2\u0193Q\3\2\2\2\u0194\u0195\7-\2\2\u0195\u0196"+
		"\7@\2\2\u0196\u0197\5\24\13\2\u0197\u0198\5\26\f\2\u0198\u019b\3\2\2\2"+
		"\u0199\u019b\7A\2\2\u019a\u0194\3\2\2\2\u019a\u0199\3\2\2\2\u019bS\3\2"+
		"\2\2\u019c\u019d\7:\2\2\u019d\u019e\5N(\2\u019e\u019f\5T+\2\u019f\u01a1"+
		"\3\2\2\2\u01a0\u019c\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1U\3\2\2\2\u01a2"+
		"\u01a3\t\6\2\2\u01a3W\3\2\2\2\u01a4\u01a9\5Z.\2\u01a5\u01a6\7\f\2\2\u01a6"+
		"\u01a8\5Z.\2\u01a7\u01a5\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2"+
		"\2\u01a9\u01aa\3\2\2\2\u01aaY\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01b1"+
		"\5\\/\2\u01ad\u01ae\7!\2\2\u01ae\u01b0\5\\/\2\u01af\u01ad\3\2\2\2\u01b0"+
		"\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2[\3\2\2\2"+
		"\u01b3\u01b1\3\2\2\2\u01b4\u01b6\7\13\2\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6"+
		"\3\2\2\2\u01b6\u01bf\3\2\2\2\u01b7\u01c0\7\25\2\2\u01b8\u01c0\7,\2\2\u01b9"+
		"\u01bd\5@!\2\u01ba\u01bb\5V,\2\u01bb\u01bc\5@!\2\u01bc\u01be\3\2\2\2\u01bd"+
		"\u01ba\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01b7\3\2"+
		"\2\2\u01bf\u01b8\3\2\2\2\u01bf\u01b9\3\2\2\2\u01c0]\3\2\2\2(egw\u008c"+
		"\u0090\u0099\u00a5\u00ad\u00b1\u00b5\u00bd\u00c7\u00cc\u00d5\u00d8\u00de"+
		"\u00e4\u00ec\u0128\u012e\u0132\u013d\u0142\u014a\u0151\u0159\u015c\u016c"+
		"\u0175\u017b\u0192\u019a\u01a0\u01a9\u01b1\u01b5\u01bd\u01bf";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}