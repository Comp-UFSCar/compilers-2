// Generated from /mnt/hdd/NetBeansProjects/LaParser/src/grammar/la.g4 by ANTLR 4.1
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
		T__1=60, T__0=61, IDENT=62, CADEIA=63, NUM_INT=64, NUM_REAL=65;
	public static final String[] tokenNames = {
		"<INVALID>", "'&'", "'constante'", "'nao'", "'faca'", "'['", "'*'", "'tipo'", 
		"'<'", "'fim_procedimento'", "'<='", "'fim_enquanto'", "'ate'", "'inteiro'", 
		"'fim_registro'", "'para'", "'%'", "'enquanto'", "')'", "'senao'", "'='", 
		"'leia'", "'caso'", "'literal'", "'funcao'", "'fim_se'", "'escreva'", 
		"'..'", "'retorne'", "'fim_caso'", "'real'", "'fim_funcao'", "']'", "'fim_para'", 
		"'verdadeiro'", "','", "'-'", "'entao'", "':'", "'('", "'ε'", "'):'", 
		"'var'", "'se'", "'logico'", "'algoritmo'", "'<-'", "'fim_algoritmo'", 
		"'falso'", "'^'", "'.'", "'+'", "'ou'", "'<>'", "'e'", "'>'", "'registro'", 
		"'seja'", "'declare'", "'/'", "'>='", "'procedimento'", "IDENT", "CADEIA", 
		"NUM_INT", "NUM_REAL"
	};
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_declaracao_local = 3, 
		RULE_variavel = 4, RULE_mais_var = 5, RULE_identificador = 6, RULE_ponteiros_opcionais = 7, 
		RULE_outros_ident = 8, RULE_dimensao = 9, RULE_tipo = 10, RULE_mais_ident = 11, 
		RULE_mais_variaveis = 12, RULE_tipo_basico = 13, RULE_tipo_basico_ident = 14, 
		RULE_tipo_estendido = 15, RULE_valor_constante = 16, RULE_registro = 17, 
		RULE_declaracao_global = 18, RULE_parametros_opcional = 19, RULE_parametro = 20, 
		RULE_var_opcional = 21, RULE_mais_parametros = 22, RULE_declaracoes_locais = 23, 
		RULE_corpo = 24, RULE_comandos = 25, RULE_cmd = 26, RULE_mais_expressao = 27, 
		RULE_senao_opcional = 28, RULE_chamada_atribuicao = 29, RULE_argumentos_opcional = 30, 
		RULE_selecao = 31, RULE_mais_selecao = 32, RULE_constantes = 33, RULE_mais_constantes = 34, 
		RULE_numero_intervalo = 35, RULE_intervalo_opcional = 36, RULE_op_unario = 37, 
		RULE_exp_aritmetica = 38, RULE_op_multiplicacao = 39, RULE_op_adicao = 40, 
		RULE_termo = 41, RULE_outros_termos = 42, RULE_fator = 43, RULE_outros_fatores = 44, 
		RULE_parcela = 45, RULE_parcela_unario = 46, RULE_parcela_nao_unario = 47, 
		RULE_outras_parcelas = 48, RULE_chamada_partes = 49, RULE_exp_relacional = 50, 
		RULE_op_opcional = 51, RULE_op_relacional = 52, RULE_expressao = 53, RULE_op_nao = 54, 
		RULE_termo_logico = 55, RULE_outros_termos_logicos = 56, RULE_outros_fatores_logicos = 57, 
		RULE_fator_logico = 58, RULE_parcela_logica = 59;
	public static final String[] ruleNames = {
		"programa", "declaracoes", "decl_local_global", "declaracao_local", "variavel", 
		"mais_var", "identificador", "ponteiros_opcionais", "outros_ident", "dimensao", 
		"tipo", "mais_ident", "mais_variaveis", "tipo_basico", "tipo_basico_ident", 
		"tipo_estendido", "valor_constante", "registro", "declaracao_global", 
		"parametros_opcional", "parametro", "var_opcional", "mais_parametros", 
		"declaracoes_locais", "corpo", "comandos", "cmd", "mais_expressao", "senao_opcional", 
		"chamada_atribuicao", "argumentos_opcional", "selecao", "mais_selecao", 
		"constantes", "mais_constantes", "numero_intervalo", "intervalo_opcional", 
		"op_unario", "exp_aritmetica", "op_multiplicacao", "op_adicao", "termo", 
		"outros_termos", "fator", "outros_fatores", "parcela", "parcela_unario", 
		"parcela_nao_unario", "outras_parcelas", "chamada_partes", "exp_relacional", 
		"op_opcional", "op_relacional", "expressao", "op_nao", "termo_logico", 
		"outros_termos_logicos", "outros_fatores_logicos", "fator_logico", "parcela_logica"
	};

	@Override
	public String getGrammarFileName() { return "la.g4"; }

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
	public static class ProgramaContext extends ParserRuleContext {
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); declaracoes();
			setState(121); match(45);
			setState(122); corpo();
			setState(123); match(47);
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

	public static class DeclaracoesContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public Decl_local_globalContext decl_local_global() {
			return getRuleContext(Decl_local_globalContext.class,0);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitDeclaracoes(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		try {
			setState(129);
			switch (_input.LA(1)) {
			case 2:
			case 7:
			case 24:
			case 58:
			case 61:
				enterOuterAlt(_localctx, 1);
				{
				setState(125); decl_local_global();
				setState(126); declaracoes();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 2);
				{
				setState(128); match(40);
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

	public static class Decl_local_globalContext extends ParserRuleContext {
		public Declaracao_globalContext declaracao_global() {
			return getRuleContext(Declaracao_globalContext.class,0);
		}
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public Decl_local_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_local_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterDecl_local_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitDecl_local_global(this);
		}
	}

	public final Decl_local_globalContext decl_local_global() throws RecognitionException {
		Decl_local_globalContext _localctx = new Decl_local_globalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_local_global);
		try {
			setState(133);
			switch (_input.LA(1)) {
			case 2:
			case 7:
			case 58:
				enterOuterAlt(_localctx, 1);
				{
				setState(131); declaracao_local();
				}
				break;
			case 24:
			case 61:
				enterOuterAlt(_localctx, 2);
				{
				setState(132); declaracao_global();
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

	public static class Declaracao_localContext extends ParserRuleContext {
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterDeclaracao_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitDeclaracao_local(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_local);
		try {
			setState(148);
			switch (_input.LA(1)) {
			case 58:
				enterOuterAlt(_localctx, 1);
				{
				setState(135); match(58);
				setState(136); variavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137); match(2);
				setState(138); match(IDENT);
				setState(139); match(38);
				setState(140); tipo_basico();
				setState(141); match(20);
				setState(142); valor_constante();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 3);
				{
				setState(144); match(7);
				setState(145); match(IDENT);
				setState(146); match(38);
				setState(147); tipo();
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

	public static class VariavelContext extends ParserRuleContext {
		public Mais_varContext mais_var() {
			return getRuleContext(Mais_varContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); match(IDENT);
			setState(151); dimensao();
			setState(152); mais_var();
			setState(153); match(38);
			setState(154); tipo();
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

	public static class Mais_varContext extends ParserRuleContext {
		public Mais_varContext mais_var() {
			return getRuleContext(Mais_varContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public Mais_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterMais_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitMais_var(this);
		}
	}

	public final Mais_varContext mais_var() throws RecognitionException {
		Mais_varContext _localctx = new Mais_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mais_var);
		try {
			setState(162);
			switch (_input.LA(1)) {
			case 35:
				enterOuterAlt(_localctx, 1);
				{
				setState(156); match(35);
				setState(157); match(IDENT);
				setState(158); dimensao();
				setState(159); mais_var();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 2);
				{
				setState(161); match(40);
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

	public static class IdentificadorContext extends ParserRuleContext {
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitIdentificador(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); ponteiros_opcionais();
			setState(165); match(IDENT);
			setState(166); dimensao();
			setState(167); outros_ident();
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

	public static class Ponteiros_opcionaisContext extends ParserRuleContext {
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public Ponteiros_opcionaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponteiros_opcionais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterPonteiros_opcionais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitPonteiros_opcionais(this);
		}
	}

	public final Ponteiros_opcionaisContext ponteiros_opcionais() throws RecognitionException {
		Ponteiros_opcionaisContext _localctx = new Ponteiros_opcionaisContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ponteiros_opcionais);
		try {
			setState(172);
			switch (_input.LA(1)) {
			case 49:
				enterOuterAlt(_localctx, 1);
				{
				setState(169); match(49);
				setState(170); ponteiros_opcionais();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 2);
				{
				setState(171); match(40);
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

	public static class Outros_identContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Outros_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterOutros_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitOutros_ident(this);
		}
	}

	public final Outros_identContext outros_ident() throws RecognitionException {
		Outros_identContext _localctx = new Outros_identContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_outros_ident);
		try {
			setState(177);
			switch (_input.LA(1)) {
			case 50:
				enterOuterAlt(_localctx, 1);
				{
				setState(174); match(50);
				setState(175); identificador();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 2);
				{
				setState(176); match(40);
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

	public static class DimensaoContext extends ParserRuleContext {
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitDimensao(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dimensao);
		try {
			setState(185);
			switch (_input.LA(1)) {
			case 5:
				enterOuterAlt(_localctx, 1);
				{
				setState(179); match(5);
				setState(180); exp_aritmetica();
				setState(181); match(32);
				setState(182); dimensao();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 2);
				{
				setState(184); match(40);
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

	public static class TipoContext extends ParserRuleContext {
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo);
		try {
			setState(189);
			switch (_input.LA(1)) {
			case 56:
				enterOuterAlt(_localctx, 1);
				{
				setState(187); registro();
				}
				break;
			case 40:
			case 49:
				enterOuterAlt(_localctx, 2);
				{
				setState(188); tipo_estendido();
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

	public static class Mais_identContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public Mais_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterMais_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitMais_ident(this);
		}
	}

	public final Mais_identContext mais_ident() throws RecognitionException {
		Mais_identContext _localctx = new Mais_identContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mais_ident);
		try {
			setState(196);
			switch (_input.LA(1)) {
			case 35:
				enterOuterAlt(_localctx, 1);
				{
				setState(191); match(35);
				setState(192); identificador();
				setState(193); mais_ident();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 2);
				{
				setState(195); match(40);
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

	public static class Mais_variaveisContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Mais_variaveisContext mais_variaveis() {
			return getRuleContext(Mais_variaveisContext.class,0);
		}
		public Mais_variaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_variaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterMais_variaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitMais_variaveis(this);
		}
	}

	public final Mais_variaveisContext mais_variaveis() throws RecognitionException {
		Mais_variaveisContext _localctx = new Mais_variaveisContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mais_variaveis);
		try {
			setState(202);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(198); variavel();
				setState(199); mais_variaveis();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 2);
				{
				setState(201); match(40);
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

	public static class Tipo_basicoContext extends ParserRuleContext {
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitTipo_basico(this);
		}
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo_basico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 13) | (1L << 23) | (1L << 30) | (1L << 44))) != 0)) ) {
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

	public static class Tipo_basico_identContext extends ParserRuleContext {
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterTipo_basico_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitTipo_basico_ident(this);
		}
	}

	public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
		Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo_basico_ident);
		try {
			setState(208);
			switch (_input.LA(1)) {
			case 13:
			case 23:
			case 30:
			case 44:
				enterOuterAlt(_localctx, 1);
				{
				setState(206); tipo_basico();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(207); match(IDENT);
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

	public static class Tipo_estendidoContext extends ParserRuleContext {
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitTipo_estendido(this);
		}
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tipo_estendido);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); ponteiros_opcionais();
			setState(211); tipo_basico_ident();
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

	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(LaParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LaParser.NUM_REAL, 0); }
		public TerminalNode CADEIA() { return getToken(LaParser.CADEIA, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitValor_constante(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !(((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (34 - 34)) | (1L << (48 - 34)) | (1L << (CADEIA - 34)) | (1L << (NUM_INT - 34)) | (1L << (NUM_REAL - 34)))) != 0)) ) {
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

	public static class RegistroContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Mais_variaveisContext mais_variaveis() {
			return getRuleContext(Mais_variaveisContext.class,0);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitRegistro(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_registro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); match(56);
			setState(216); variavel();
			setState(217); mais_variaveis();
			setState(218); match(14);
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

	public static class Declaracao_globalContext extends ParserRuleContext {
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Parametros_opcionalContext parametros_opcional() {
			return getRuleContext(Parametros_opcionalContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterDeclaracao_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitDeclaracao_global(this);
		}
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaracao_global);
		try {
			setState(239);
			switch (_input.LA(1)) {
			case 61:
				enterOuterAlt(_localctx, 1);
				{
				setState(220); match(61);
				setState(221); match(IDENT);
				setState(222); match(39);
				setState(223); parametros_opcional();
				setState(224); match(18);
				setState(225); declaracoes_locais();
				setState(226); comandos();
				setState(227); match(9);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 2);
				{
				setState(229); match(24);
				setState(230); match(IDENT);
				setState(231); match(39);
				setState(232); parametros_opcional();
				setState(233); match(41);
				setState(234); tipo_estendido();
				setState(235); declaracoes_locais();
				setState(236); comandos();
				setState(237); match(31);
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

	public static class Parametros_opcionalContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Parametros_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterParametros_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitParametros_opcional(this);
		}
	}

	public final Parametros_opcionalContext parametros_opcional() throws RecognitionException {
		Parametros_opcionalContext _localctx = new Parametros_opcionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parametros_opcional);
		try {
			setState(243);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241); parametro();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242); match(40);
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

	public static class ParametroContext extends ParserRuleContext {
		public Var_opcionalContext var_opcional() {
			return getRuleContext(Var_opcionalContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Mais_parametrosContext mais_parametros() {
			return getRuleContext(Mais_parametrosContext.class,0);
		}
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); var_opcional();
			setState(246); identificador();
			setState(247); mais_ident();
			setState(248); match(38);
			setState(249); tipo_estendido();
			setState(250); mais_parametros();
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
			if ( listener instanceof laListener ) ((laListener)listener).enterVar_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitVar_opcional(this);
		}
	}

	public final Var_opcionalContext var_opcional() throws RecognitionException {
		Var_opcionalContext _localctx = new Var_opcionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !(_la==40 || _la==42) ) {
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

	public static class Mais_parametrosContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Mais_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterMais_parametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitMais_parametros(this);
		}
	}

	public final Mais_parametrosContext mais_parametros() throws RecognitionException {
		Mais_parametrosContext _localctx = new Mais_parametrosContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mais_parametros);
		try {
			setState(256);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254); parametro();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255); match(40);
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

	public static class Declaracoes_locaisContext extends ParserRuleContext {
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public Declaracoes_locaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes_locais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterDeclaracoes_locais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitDeclaracoes_locais(this);
		}
	}

	public final Declaracoes_locaisContext declaracoes_locais() throws RecognitionException {
		Declaracoes_locaisContext _localctx = new Declaracoes_locaisContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declaracoes_locais);
		try {
			setState(262);
			switch (_input.LA(1)) {
			case 2:
			case 7:
			case 58:
				enterOuterAlt(_localctx, 1);
				{
				setState(258); declaracao_local();
				setState(259); declaracoes_locais();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 2);
				{
				setState(261); match(40);
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

	public static class CorpoContext extends ParserRuleContext {
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitCorpo(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); declaracoes_locais();
			setState(265); comandos();
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

	public static class ComandosContext extends ParserRuleContext {
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comandos);
		try {
			setState(271);
			switch (_input.LA(1)) {
			case 4:
			case 15:
			case 17:
			case 21:
			case 22:
			case 26:
			case 28:
			case 43:
			case 49:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(267); cmd();
				setState(268); comandos();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 2);
				{
				setState(270); match(40);
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

	public static class CmdContext extends ParserRuleContext {
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public Chamada_atribuicaoContext chamada_atribuicao() {
			return getRuleContext(Chamada_atribuicaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public Senao_opcionalContext senao_opcional() {
			return getRuleContext(Senao_opcionalContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cmd);
		try {
			setState(331);
			switch (_input.LA(1)) {
			case 21:
				enterOuterAlt(_localctx, 1);
				{
				setState(273); match(21);
				setState(274); match(39);
				setState(275); identificador();
				setState(276); mais_ident();
				setState(277); match(18);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 2);
				{
				setState(279); match(26);
				setState(280); match(39);
				setState(281); expressao();
				setState(282); mais_expressao();
				setState(283); match(18);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 3);
				{
				setState(285); match(43);
				setState(286); expressao();
				setState(287); match(37);
				setState(288); comandos();
				setState(289); senao_opcional();
				setState(290); match(25);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 4);
				{
				setState(292); match(22);
				setState(293); exp_aritmetica();
				setState(294); match(57);
				setState(295); selecao();
				setState(296); senao_opcional();
				setState(297); match(29);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 5);
				{
				setState(299); match(15);
				setState(300); match(IDENT);
				setState(301); match(46);
				setState(302); exp_aritmetica();
				setState(303); match(12);
				setState(304); exp_aritmetica();
				setState(305); match(4);
				setState(306); comandos();
				setState(307); match(33);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 6);
				{
				setState(309); match(17);
				setState(310); expressao();
				setState(311); match(4);
				setState(312); comandos();
				setState(313); match(11);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 7);
				{
				setState(315); match(4);
				setState(316); comandos();
				setState(317); match(12);
				setState(318); expressao();
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 8);
				{
				setState(320); match(49);
				setState(321); match(IDENT);
				setState(322); outros_ident();
				setState(323); dimensao();
				setState(324); match(46);
				setState(325); expressao();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(327); match(IDENT);
				setState(328); chamada_atribuicao();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 10);
				{
				setState(329); match(28);
				setState(330); expressao();
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

	public static class Mais_expressaoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public Mais_expressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterMais_expressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitMais_expressao(this);
		}
	}

	public final Mais_expressaoContext mais_expressao() throws RecognitionException {
		Mais_expressaoContext _localctx = new Mais_expressaoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mais_expressao);
		try {
			setState(338);
			switch (_input.LA(1)) {
			case 35:
				enterOuterAlt(_localctx, 1);
				{
				setState(333); match(35);
				setState(334); expressao();
				setState(335); mais_expressao();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 2);
				{
				setState(337); match(40);
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

	public static class Senao_opcionalContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Senao_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterSenao_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitSenao_opcional(this);
		}
	}

	public final Senao_opcionalContext senao_opcional() throws RecognitionException {
		Senao_opcionalContext _localctx = new Senao_opcionalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_senao_opcional);
		try {
			setState(343);
			switch (_input.LA(1)) {
			case 19:
				enterOuterAlt(_localctx, 1);
				{
				setState(340); match(19);
				setState(341); comandos();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 2);
				{
				setState(342); match(40);
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

	public static class Chamada_atribuicaoContext extends ParserRuleContext {
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public Argumentos_opcionalContext argumentos_opcional() {
			return getRuleContext(Argumentos_opcionalContext.class,0);
		}
		public Chamada_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterChamada_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitChamada_atribuicao(this);
		}
	}

	public final Chamada_atribuicaoContext chamada_atribuicao() throws RecognitionException {
		Chamada_atribuicaoContext _localctx = new Chamada_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_chamada_atribuicao);
		try {
			setState(353);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345); argumentos_opcional();
				setState(346); match(18);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348); outros_ident();
				setState(349); dimensao();
				setState(350); match(46);
				setState(351); expressao();
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

	public static class Argumentos_opcionalContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public Argumentos_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterArgumentos_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitArgumentos_opcional(this);
		}
	}

	public final Argumentos_opcionalContext argumentos_opcional() throws RecognitionException {
		Argumentos_opcionalContext _localctx = new Argumentos_opcionalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_argumentos_opcional);
		try {
			setState(359);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355); expressao();
				setState(356); mais_expressao();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358); match(40);
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

	public static class SelecaoContext extends ParserRuleContext {
		public Mais_selecaoContext mais_selecao() {
			return getRuleContext(Mais_selecaoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitSelecao(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_selecao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361); constantes();
			setState(362); match(38);
			setState(363); comandos();
			setState(364); mais_selecao();
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

	public static class Mais_selecaoContext extends ParserRuleContext {
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public Mais_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterMais_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitMais_selecao(this);
		}
	}

	public final Mais_selecaoContext mais_selecao() throws RecognitionException {
		Mais_selecaoContext _localctx = new Mais_selecaoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mais_selecao);
		try {
			setState(368);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366); selecao();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367); match(40);
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

	public static class ConstantesContext extends ParserRuleContext {
		public Mais_constantesContext mais_constantes() {
			return getRuleContext(Mais_constantesContext.class,0);
		}
		public Numero_intervaloContext numero_intervalo() {
			return getRuleContext(Numero_intervaloContext.class,0);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitConstantes(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constantes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370); numero_intervalo();
			setState(371); mais_constantes();
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

	public static class Mais_constantesContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public Mais_constantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterMais_constantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitMais_constantes(this);
		}
	}

	public final Mais_constantesContext mais_constantes() throws RecognitionException {
		Mais_constantesContext _localctx = new Mais_constantesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mais_constantes);
		try {
			setState(376);
			switch (_input.LA(1)) {
			case 35:
				enterOuterAlt(_localctx, 1);
				{
				setState(373); match(35);
				setState(374); constantes();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 2);
				{
				setState(375); match(40);
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

	public static class Numero_intervaloContext extends ParserRuleContext {
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LaParser.NUM_INT, 0); }
		public Intervalo_opcionalContext intervalo_opcional() {
			return getRuleContext(Intervalo_opcionalContext.class,0);
		}
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitNumero_intervalo(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_numero_intervalo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378); op_unario();
			setState(379); match(NUM_INT);
			setState(380); intervalo_opcional();
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

	public static class Intervalo_opcionalContext extends ParserRuleContext {
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LaParser.NUM_INT, 0); }
		public Intervalo_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalo_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterIntervalo_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitIntervalo_opcional(this);
		}
	}

	public final Intervalo_opcionalContext intervalo_opcional() throws RecognitionException {
		Intervalo_opcionalContext _localctx = new Intervalo_opcionalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_intervalo_opcional);
		try {
			setState(387);
			switch (_input.LA(1)) {
			case 27:
				enterOuterAlt(_localctx, 1);
				{
				setState(382); match(27);
				setState(383); op_unario();
				setState(384); match(NUM_INT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 2);
				{
				setState(386); match(40);
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

	public static class Op_unarioContext extends ParserRuleContext {
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitOp_unario(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_op_unario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_la = _input.LA(1);
			if ( !(_la==36 || _la==40) ) {
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

	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Outros_termosContext outros_termos() {
			return getRuleContext(Outros_termosContext.class,0);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterExp_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitExp_aritmetica(this);
		}
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exp_aritmetica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391); termo();
			setState(392); outros_termos();
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
			if ( listener instanceof laListener ) ((laListener)listener).enterOp_multiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitOp_multiplicacao(this);
		}
	}

	public final Op_multiplicacaoContext op_multiplicacao() throws RecognitionException {
		Op_multiplicacaoContext _localctx = new Op_multiplicacaoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_op_multiplicacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_la = _input.LA(1);
			if ( !(_la==6 || _la==59) ) {
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

	public static class Op_adicaoContext extends ParserRuleContext {
		public Op_adicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_adicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterOp_adicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitOp_adicao(this);
		}
	}

	public final Op_adicaoContext op_adicao() throws RecognitionException {
		Op_adicaoContext _localctx = new Op_adicaoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_op_adicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_la = _input.LA(1);
			if ( !(_la==36 || _la==51) ) {
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

	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Outros_fatoresContext outros_fatores() {
			return getRuleContext(Outros_fatoresContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_termo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398); fator();
			setState(399); outros_fatores();
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

	public static class Outros_termosContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Op_adicaoContext op_adicao() {
			return getRuleContext(Op_adicaoContext.class,0);
		}
		public Outros_termosContext outros_termos() {
			return getRuleContext(Outros_termosContext.class,0);
		}
		public Outros_termosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterOutros_termos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitOutros_termos(this);
		}
	}

	public final Outros_termosContext outros_termos() throws RecognitionException {
		Outros_termosContext _localctx = new Outros_termosContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_outros_termos);
		try {
			setState(406);
			switch (_input.LA(1)) {
			case 36:
			case 51:
				enterOuterAlt(_localctx, 1);
				{
				setState(401); op_adicao();
				setState(402); termo();
				setState(403); outros_termos();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 2);
				{
				setState(405); match(40);
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

	public static class FatorContext extends ParserRuleContext {
		public ParcelaContext parcela() {
			return getRuleContext(ParcelaContext.class,0);
		}
		public Outras_parcelasContext outras_parcelas() {
			return getRuleContext(Outras_parcelasContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408); parcela();
			setState(409); outras_parcelas();
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

	public static class Outros_fatoresContext extends ParserRuleContext {
		public Op_multiplicacaoContext op_multiplicacao() {
			return getRuleContext(Op_multiplicacaoContext.class,0);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Outros_fatoresContext outros_fatores() {
			return getRuleContext(Outros_fatoresContext.class,0);
		}
		public Outros_fatoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_fatores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterOutros_fatores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitOutros_fatores(this);
		}
	}

	public final Outros_fatoresContext outros_fatores() throws RecognitionException {
		Outros_fatoresContext _localctx = new Outros_fatoresContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_outros_fatores);
		try {
			setState(416);
			switch (_input.LA(1)) {
			case 6:
			case 59:
				enterOuterAlt(_localctx, 1);
				{
				setState(411); op_multiplicacao();
				setState(412); fator();
				setState(413); outros_fatores();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 2);
				{
				setState(415); match(40);
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

	public static class ParcelaContext extends ParserRuleContext {
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitParcela(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_parcela);
		try {
			setState(422);
			switch (_input.LA(1)) {
			case 36:
			case 40:
				enterOuterAlt(_localctx, 1);
				{
				setState(418); op_unario();
				setState(419); parcela_unario();
				}
				break;
			case 1:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(421); parcela_nao_unario();
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
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LaParser.NUM_INT, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public Chamada_partesContext chamada_partes() {
			return getRuleContext(Chamada_partesContext.class,0);
		}
		public TerminalNode NUM_REAL() { return getToken(LaParser.NUM_REAL, 0); }
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitParcela_unario(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_parcela_unario);
		try {
			setState(437);
			switch (_input.LA(1)) {
			case 49:
				enterOuterAlt(_localctx, 1);
				{
				setState(424); match(49);
				setState(425); match(IDENT);
				setState(426); outros_ident();
				setState(427); dimensao();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(429); match(IDENT);
				setState(430); chamada_partes();
				}
				break;
			case NUM_INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(431); match(NUM_INT);
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(432); match(NUM_REAL);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 5);
				{
				setState(433); match(39);
				setState(434); expressao();
				setState(435); match(18);
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

	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(LaParser.CADEIA, 0); }
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitParcela_nao_unario(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parcela_nao_unario);
		try {
			setState(445);
			switch (_input.LA(1)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439); match(1);
				setState(440); match(IDENT);
				setState(441); outros_ident();
				setState(442); dimensao();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(444); match(CADEIA);
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
			if ( listener instanceof laListener ) ((laListener)listener).enterOutras_parcelas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitOutras_parcelas(this);
		}
	}

	public final Outras_parcelasContext outras_parcelas() throws RecognitionException {
		Outras_parcelasContext _localctx = new Outras_parcelasContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_outras_parcelas);
		try {
			setState(452);
			switch (_input.LA(1)) {
			case 16:
				enterOuterAlt(_localctx, 1);
				{
				setState(447); match(16);
				setState(448); parcela();
				setState(449); outras_parcelas();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 2);
				{
				setState(451); match(40);
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

	public static class Chamada_partesContext extends ParserRuleContext {
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public Chamada_partesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_partes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterChamada_partes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitChamada_partes(this);
		}
	}

	public final Chamada_partesContext chamada_partes() throws RecognitionException {
		Chamada_partesContext _localctx = new Chamada_partesContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_chamada_partes);
		try {
			setState(463);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454); match(39);
				setState(455); expressao();
				setState(456); mais_expressao();
				setState(457); match(18);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459); outros_ident();
				setState(460); dimensao();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(462); match(40);
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

	public static class Exp_relacionalContext extends ParserRuleContext {
		public Op_opcionalContext op_opcional() {
			return getRuleContext(Op_opcionalContext.class,0);
		}
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterExp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitExp_relacional(this);
		}
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_exp_relacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465); exp_aritmetica();
			setState(466); op_opcional();
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

	public static class Op_opcionalContext extends ParserRuleContext {
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Op_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterOp_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitOp_opcional(this);
		}
	}

	public final Op_opcionalContext op_opcional() throws RecognitionException {
		Op_opcionalContext _localctx = new Op_opcionalContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_op_opcional);
		try {
			setState(472);
			switch (_input.LA(1)) {
			case 8:
			case 10:
			case 20:
			case 53:
			case 55:
			case 60:
				enterOuterAlt(_localctx, 1);
				{
				setState(468); op_relacional();
				setState(469); exp_aritmetica();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 2);
				{
				setState(471); match(40);
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

	public static class Op_relacionalContext extends ParserRuleContext {
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitOp_relacional(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 10) | (1L << 20) | (1L << 53) | (1L << 55) | (1L << 60))) != 0)) ) {
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

	public static class ExpressaoContext extends ParserRuleContext {
		public Termo_logicoContext termo_logico() {
			return getRuleContext(Termo_logicoContext.class,0);
		}
		public Outros_termos_logicosContext outros_termos_logicos() {
			return getRuleContext(Outros_termos_logicosContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476); termo_logico();
			setState(477); outros_termos_logicos();
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

	public static class Op_naoContext extends ParserRuleContext {
		public Op_naoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_nao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterOp_nao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitOp_nao(this);
		}
	}

	public final Op_naoContext op_nao() throws RecognitionException {
		Op_naoContext _localctx = new Op_naoContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_op_nao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_la = _input.LA(1);
			if ( !(_la==3 || _la==40) ) {
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

	public static class Termo_logicoContext extends ParserRuleContext {
		public Outros_fatores_logicosContext outros_fatores_logicos() {
			return getRuleContext(Outros_fatores_logicosContext.class,0);
		}
		public Fator_logicoContext fator_logico() {
			return getRuleContext(Fator_logicoContext.class,0);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitTermo_logico(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_termo_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481); fator_logico();
			setState(482); outros_fatores_logicos();
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

	public static class Outros_termos_logicosContext extends ParserRuleContext {
		public Termo_logicoContext termo_logico() {
			return getRuleContext(Termo_logicoContext.class,0);
		}
		public Outros_termos_logicosContext outros_termos_logicos() {
			return getRuleContext(Outros_termos_logicosContext.class,0);
		}
		public Outros_termos_logicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos_logicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterOutros_termos_logicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitOutros_termos_logicos(this);
		}
	}

	public final Outros_termos_logicosContext outros_termos_logicos() throws RecognitionException {
		Outros_termos_logicosContext _localctx = new Outros_termos_logicosContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_outros_termos_logicos);
		try {
			setState(489);
			switch (_input.LA(1)) {
			case 52:
				enterOuterAlt(_localctx, 1);
				{
				setState(484); match(52);
				setState(485); termo_logico();
				setState(486); outros_termos_logicos();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 2);
				{
				setState(488); match(40);
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

	public static class Outros_fatores_logicosContext extends ParserRuleContext {
		public Outros_fatores_logicosContext outros_fatores_logicos() {
			return getRuleContext(Outros_fatores_logicosContext.class,0);
		}
		public Fator_logicoContext fator_logico() {
			return getRuleContext(Fator_logicoContext.class,0);
		}
		public Outros_fatores_logicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_fatores_logicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterOutros_fatores_logicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitOutros_fatores_logicos(this);
		}
	}

	public final Outros_fatores_logicosContext outros_fatores_logicos() throws RecognitionException {
		Outros_fatores_logicosContext _localctx = new Outros_fatores_logicosContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_outros_fatores_logicos);
		try {
			setState(496);
			switch (_input.LA(1)) {
			case 54:
				enterOuterAlt(_localctx, 1);
				{
				setState(491); match(54);
				setState(492); fator_logico();
				setState(493); outros_fatores_logicos();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 2);
				{
				setState(495); match(40);
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

	public static class Fator_logicoContext extends ParserRuleContext {
		public Op_naoContext op_nao() {
			return getRuleContext(Op_naoContext.class,0);
		}
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitFator_logico(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_fator_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498); op_nao();
			setState(499); parcela_logica();
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

	public static class Parcela_logicaContext extends ParserRuleContext {
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof laListener ) ((laListener)listener).exitParcela_logica(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_parcela_logica);
		try {
			setState(504);
			switch (_input.LA(1)) {
			case 34:
				enterOuterAlt(_localctx, 1);
				{
				setState(501); match(34);
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 2);
				{
				setState(502); match(48);
				}
				break;
			case 1:
			case 36:
			case 40:
			case CADEIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(503); exp_relacional();
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3C\u01fd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u0084\n\3\3\4\3\4\5\4\u0088\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0097\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a5\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\5\t\u00af\n\t\3\n\3\n\3\n\5\n\u00b4\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u00bc\n\13\3\f\3\f\5\f\u00c0\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u00c7\n\r\3\16\3\16\3\16\3\16\5\16\u00cd\n\16\3\17\3"+
		"\17\3\20\3\20\5\20\u00d3\n\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f2\n\24\3\25\3\25\5\25\u00f6"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\5\30\u0103"+
		"\n\30\3\31\3\31\3\31\3\31\5\31\u0109\n\31\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\5\33\u0112\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u014e\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u0155\n\35\3\36\3\36\3\36\5\36\u015a\n\36\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\5\37\u0164\n\37\3 \3 \3 \3 \5 \u016a\n \3!\3!\3!\3"+
		"!\3!\3\"\3\"\5\"\u0173\n\"\3#\3#\3#\3$\3$\3$\5$\u017b\n$\3%\3%\3%\3%\3"+
		"&\3&\3&\3&\3&\5&\u0186\n&\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,"+
		"\3,\3,\3,\5,\u0199\n,\3-\3-\3-\3.\3.\3.\3.\3.\5.\u01a3\n.\3/\3/\3/\3/"+
		"\5/\u01a9\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\5\60\u01b8\n\60\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u01c0\n\61"+
		"\3\62\3\62\3\62\3\62\3\62\5\62\u01c7\n\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\5\63\u01d2\n\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\5\65"+
		"\u01db\n\65\3\66\3\66\3\67\3\67\3\67\38\38\39\39\39\3:\3:\3:\3:\3:\5:"+
		"\u01ec\n:\3;\3;\3;\3;\3;\5;\u01f3\n;\3<\3<\3<\3=\3=\3=\5=\u01fb\n=\3="+
		"\2>\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\n\6\2\17\17\31\31  ..\5\2$$\62\62AC\4\2"+
		"**,,\4\2&&**\4\2\b\b==\4\2&&\65\65\b\2\n\n\f\f\26\26\67\6799>>\4\2\5\5"+
		"**\u01f1\2z\3\2\2\2\4\u0083\3\2\2\2\6\u0087\3\2\2\2\b\u0096\3\2\2\2\n"+
		"\u0098\3\2\2\2\f\u00a4\3\2\2\2\16\u00a6\3\2\2\2\20\u00ae\3\2\2\2\22\u00b3"+
		"\3\2\2\2\24\u00bb\3\2\2\2\26\u00bf\3\2\2\2\30\u00c6\3\2\2\2\32\u00cc\3"+
		"\2\2\2\34\u00ce\3\2\2\2\36\u00d2\3\2\2\2 \u00d4\3\2\2\2\"\u00d7\3\2\2"+
		"\2$\u00d9\3\2\2\2&\u00f1\3\2\2\2(\u00f5\3\2\2\2*\u00f7\3\2\2\2,\u00fe"+
		"\3\2\2\2.\u0102\3\2\2\2\60\u0108\3\2\2\2\62\u010a\3\2\2\2\64\u0111\3\2"+
		"\2\2\66\u014d\3\2\2\28\u0154\3\2\2\2:\u0159\3\2\2\2<\u0163\3\2\2\2>\u0169"+
		"\3\2\2\2@\u016b\3\2\2\2B\u0172\3\2\2\2D\u0174\3\2\2\2F\u017a\3\2\2\2H"+
		"\u017c\3\2\2\2J\u0185\3\2\2\2L\u0187\3\2\2\2N\u0189\3\2\2\2P\u018c\3\2"+
		"\2\2R\u018e\3\2\2\2T\u0190\3\2\2\2V\u0198\3\2\2\2X\u019a\3\2\2\2Z\u01a2"+
		"\3\2\2\2\\\u01a8\3\2\2\2^\u01b7\3\2\2\2`\u01bf\3\2\2\2b\u01c6\3\2\2\2"+
		"d\u01d1\3\2\2\2f\u01d3\3\2\2\2h\u01da\3\2\2\2j\u01dc\3\2\2\2l\u01de\3"+
		"\2\2\2n\u01e1\3\2\2\2p\u01e3\3\2\2\2r\u01eb\3\2\2\2t\u01f2\3\2\2\2v\u01f4"+
		"\3\2\2\2x\u01fa\3\2\2\2z{\5\4\3\2{|\7/\2\2|}\5\62\32\2}~\7\61\2\2~\3\3"+
		"\2\2\2\177\u0080\5\6\4\2\u0080\u0081\5\4\3\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0084\7*\2\2\u0083\177\3\2\2\2\u0083\u0082\3\2\2\2\u0084\5\3\2\2\2\u0085"+
		"\u0088\5\b\5\2\u0086\u0088\5&\24\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2"+
		"\2\2\u0088\7\3\2\2\2\u0089\u008a\7<\2\2\u008a\u0097\5\n\6\2\u008b\u008c"+
		"\7\4\2\2\u008c\u008d\7@\2\2\u008d\u008e\7(\2\2\u008e\u008f\5\34\17\2\u008f"+
		"\u0090\7\26\2\2\u0090\u0091\5\"\22\2\u0091\u0097\3\2\2\2\u0092\u0093\7"+
		"\t\2\2\u0093\u0094\7@\2\2\u0094\u0095\7(\2\2\u0095\u0097\5\26\f\2\u0096"+
		"\u0089\3\2\2\2\u0096\u008b\3\2\2\2\u0096\u0092\3\2\2\2\u0097\t\3\2\2\2"+
		"\u0098\u0099\7@\2\2\u0099\u009a\5\24\13\2\u009a\u009b\5\f\7\2\u009b\u009c"+
		"\7(\2\2\u009c\u009d\5\26\f\2\u009d\13\3\2\2\2\u009e\u009f\7%\2\2\u009f"+
		"\u00a0\7@\2\2\u00a0\u00a1\5\24\13\2\u00a1\u00a2\5\f\7\2\u00a2\u00a5\3"+
		"\2\2\2\u00a3\u00a5\7*\2\2\u00a4\u009e\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\r\3\2\2\2\u00a6\u00a7\5\20\t\2\u00a7\u00a8\7@\2\2\u00a8\u00a9\5\24\13"+
		"\2\u00a9\u00aa\5\22\n\2\u00aa\17\3\2\2\2\u00ab\u00ac\7\63\2\2\u00ac\u00af"+
		"\5\20\t\2\u00ad\u00af\7*\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\21\3\2\2\2\u00b0\u00b1\7\64\2\2\u00b1\u00b4\5\16\b\2\u00b2\u00b4\7*\2"+
		"\2\u00b3\u00b0\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\23\3\2\2\2\u00b5\u00b6"+
		"\7\7\2\2\u00b6\u00b7\5N(\2\u00b7\u00b8\7\"\2\2\u00b8\u00b9\5\24\13\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00bc\7*\2\2\u00bb\u00b5\3\2\2\2\u00bb\u00ba\3\2"+
		"\2\2\u00bc\25\3\2\2\2\u00bd\u00c0\5$\23\2\u00be\u00c0\5 \21\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\27\3\2\2\2\u00c1\u00c2\7%\2\2\u00c2"+
		"\u00c3\5\16\b\2\u00c3\u00c4\5\30\r\2\u00c4\u00c7\3\2\2\2\u00c5\u00c7\7"+
		"*\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\31\3\2\2\2\u00c8\u00c9"+
		"\5\n\6\2\u00c9\u00ca\5\32\16\2\u00ca\u00cd\3\2\2\2\u00cb\u00cd\7*\2\2"+
		"\u00cc\u00c8\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\33\3\2\2\2\u00ce\u00cf"+
		"\t\2\2\2\u00cf\35\3\2\2\2\u00d0\u00d3\5\34\17\2\u00d1\u00d3\7@\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\37\3\2\2\2\u00d4\u00d5\5\20\t"+
		"\2\u00d5\u00d6\5\36\20\2\u00d6!\3\2\2\2\u00d7\u00d8\t\3\2\2\u00d8#\3\2"+
		"\2\2\u00d9\u00da\7:\2\2\u00da\u00db\5\n\6\2\u00db\u00dc\5\32\16\2\u00dc"+
		"\u00dd\7\20\2\2\u00dd%\3\2\2\2\u00de\u00df\7?\2\2\u00df\u00e0\7@\2\2\u00e0"+
		"\u00e1\7)\2\2\u00e1\u00e2\5(\25\2\u00e2\u00e3\7\24\2\2\u00e3\u00e4\5\60"+
		"\31\2\u00e4\u00e5\5\64\33\2\u00e5\u00e6\7\13\2\2\u00e6\u00f2\3\2\2\2\u00e7"+
		"\u00e8\7\32\2\2\u00e8\u00e9\7@\2\2\u00e9\u00ea\7)\2\2\u00ea\u00eb\5(\25"+
		"\2\u00eb\u00ec\7+\2\2\u00ec\u00ed\5 \21\2\u00ed\u00ee\5\60\31\2\u00ee"+
		"\u00ef\5\64\33\2\u00ef\u00f0\7!\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00de\3"+
		"\2\2\2\u00f1\u00e7\3\2\2\2\u00f2\'\3\2\2\2\u00f3\u00f6\5*\26\2\u00f4\u00f6"+
		"\7*\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6)\3\2\2\2\u00f7\u00f8"+
		"\5,\27\2\u00f8\u00f9\5\16\b\2\u00f9\u00fa\5\30\r\2\u00fa\u00fb\7(\2\2"+
		"\u00fb\u00fc\5 \21\2\u00fc\u00fd\5.\30\2\u00fd+\3\2\2\2\u00fe\u00ff\t"+
		"\4\2\2\u00ff-\3\2\2\2\u0100\u0103\5*\26\2\u0101\u0103\7*\2\2\u0102\u0100"+
		"\3\2\2\2\u0102\u0101\3\2\2\2\u0103/\3\2\2\2\u0104\u0105\5\b\5\2\u0105"+
		"\u0106\5\60\31\2\u0106\u0109\3\2\2\2\u0107\u0109\7*\2\2\u0108\u0104\3"+
		"\2\2\2\u0108\u0107\3\2\2\2\u0109\61\3\2\2\2\u010a\u010b\5\60\31\2\u010b"+
		"\u010c\5\64\33\2\u010c\63\3\2\2\2\u010d\u010e\5\66\34\2\u010e\u010f\5"+
		"\64\33\2\u010f\u0112\3\2\2\2\u0110\u0112\7*\2\2\u0111\u010d\3\2\2\2\u0111"+
		"\u0110\3\2\2\2\u0112\65\3\2\2\2\u0113\u0114\7\27\2\2\u0114\u0115\7)\2"+
		"\2\u0115\u0116\5\16\b\2\u0116\u0117\5\30\r\2\u0117\u0118\7\24\2\2\u0118"+
		"\u014e\3\2\2\2\u0119\u011a\7\34\2\2\u011a\u011b\7)\2\2\u011b\u011c\5l"+
		"\67\2\u011c\u011d\58\35\2\u011d\u011e\7\24\2\2\u011e\u014e\3\2\2\2\u011f"+
		"\u0120\7-\2\2\u0120\u0121\5l\67\2\u0121\u0122\7\'\2\2\u0122\u0123\5\64"+
		"\33\2\u0123\u0124\5:\36\2\u0124\u0125\7\33\2\2\u0125\u014e\3\2\2\2\u0126"+
		"\u0127\7\30\2\2\u0127\u0128\5N(\2\u0128\u0129\7;\2\2\u0129\u012a\5@!\2"+
		"\u012a\u012b\5:\36\2\u012b\u012c\7\37\2\2\u012c\u014e\3\2\2\2\u012d\u012e"+
		"\7\21\2\2\u012e\u012f\7@\2\2\u012f\u0130\7\60\2\2\u0130\u0131\5N(\2\u0131"+
		"\u0132\7\16\2\2\u0132\u0133\5N(\2\u0133\u0134\7\6\2\2\u0134\u0135\5\64"+
		"\33\2\u0135\u0136\7#\2\2\u0136\u014e\3\2\2\2\u0137\u0138\7\23\2\2\u0138"+
		"\u0139\5l\67\2\u0139\u013a\7\6\2\2\u013a\u013b\5\64\33\2\u013b\u013c\7"+
		"\r\2\2\u013c\u014e\3\2\2\2\u013d\u013e\7\6\2\2\u013e\u013f\5\64\33\2\u013f"+
		"\u0140\7\16\2\2\u0140\u0141\5l\67\2\u0141\u014e\3\2\2\2\u0142\u0143\7"+
		"\63\2\2\u0143\u0144\7@\2\2\u0144\u0145\5\22\n\2\u0145\u0146\5\24\13\2"+
		"\u0146\u0147\7\60\2\2\u0147\u0148\5l\67\2\u0148\u014e\3\2\2\2\u0149\u014a"+
		"\7@\2\2\u014a\u014e\5<\37\2\u014b\u014c\7\36\2\2\u014c\u014e\5l\67\2\u014d"+
		"\u0113\3\2\2\2\u014d\u0119\3\2\2\2\u014d\u011f\3\2\2\2\u014d\u0126\3\2"+
		"\2\2\u014d\u012d\3\2\2\2\u014d\u0137\3\2\2\2\u014d\u013d\3\2\2\2\u014d"+
		"\u0142\3\2\2\2\u014d\u0149\3\2\2\2\u014d\u014b\3\2\2\2\u014e\67\3\2\2"+
		"\2\u014f\u0150\7%\2\2\u0150\u0151\5l\67\2\u0151\u0152\58\35\2\u0152\u0155"+
		"\3\2\2\2\u0153\u0155\7*\2\2\u0154\u014f\3\2\2\2\u0154\u0153\3\2\2\2\u0155"+
		"9\3\2\2\2\u0156\u0157\7\25\2\2\u0157\u015a\5\64\33\2\u0158\u015a\7*\2"+
		"\2\u0159\u0156\3\2\2\2\u0159\u0158\3\2\2\2\u015a;\3\2\2\2\u015b\u015c"+
		"\5> \2\u015c\u015d\7\24\2\2\u015d\u0164\3\2\2\2\u015e\u015f\5\22\n\2\u015f"+
		"\u0160\5\24\13\2\u0160\u0161\7\60\2\2\u0161\u0162\5l\67\2\u0162\u0164"+
		"\3\2\2\2\u0163\u015b\3\2\2\2\u0163\u015e\3\2\2\2\u0164=\3\2\2\2\u0165"+
		"\u0166\5l\67\2\u0166\u0167\58\35\2\u0167\u016a\3\2\2\2\u0168\u016a\7*"+
		"\2\2\u0169\u0165\3\2\2\2\u0169\u0168\3\2\2\2\u016a?\3\2\2\2\u016b\u016c"+
		"\5D#\2\u016c\u016d\7(\2\2\u016d\u016e\5\64\33\2\u016e\u016f\5B\"\2\u016f"+
		"A\3\2\2\2\u0170\u0173\5@!\2\u0171\u0173\7*\2\2\u0172\u0170\3\2\2\2\u0172"+
		"\u0171\3\2\2\2\u0173C\3\2\2\2\u0174\u0175\5H%\2\u0175\u0176\5F$\2\u0176"+
		"E\3\2\2\2\u0177\u0178\7%\2\2\u0178\u017b\5D#\2\u0179\u017b\7*\2\2\u017a"+
		"\u0177\3\2\2\2\u017a\u0179\3\2\2\2\u017bG\3\2\2\2\u017c\u017d\5L\'\2\u017d"+
		"\u017e\7B\2\2\u017e\u017f\5J&\2\u017fI\3\2\2\2\u0180\u0181\7\35\2\2\u0181"+
		"\u0182\5L\'\2\u0182\u0183\7B\2\2\u0183\u0186\3\2\2\2\u0184\u0186\7*\2"+
		"\2\u0185\u0180\3\2\2\2\u0185\u0184\3\2\2\2\u0186K\3\2\2\2\u0187\u0188"+
		"\t\5\2\2\u0188M\3\2\2\2\u0189\u018a\5T+\2\u018a\u018b\5V,\2\u018bO\3\2"+
		"\2\2\u018c\u018d\t\6\2\2\u018dQ\3\2\2\2\u018e\u018f\t\7\2\2\u018fS\3\2"+
		"\2\2\u0190\u0191\5X-\2\u0191\u0192\5Z.\2\u0192U\3\2\2\2\u0193\u0194\5"+
		"R*\2\u0194\u0195\5T+\2\u0195\u0196\5V,\2\u0196\u0199\3\2\2\2\u0197\u0199"+
		"\7*\2\2\u0198\u0193\3\2\2\2\u0198\u0197\3\2\2\2\u0199W\3\2\2\2\u019a\u019b"+
		"\5\\/\2\u019b\u019c\5b\62\2\u019cY\3\2\2\2\u019d\u019e\5P)\2\u019e\u019f"+
		"\5X-\2\u019f\u01a0\5Z.\2\u01a0\u01a3\3\2\2\2\u01a1\u01a3\7*\2\2\u01a2"+
		"\u019d\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3[\3\2\2\2\u01a4\u01a5\5L\'\2\u01a5"+
		"\u01a6\5^\60\2\u01a6\u01a9\3\2\2\2\u01a7\u01a9\5`\61\2\u01a8\u01a4\3\2"+
		"\2\2\u01a8\u01a7\3\2\2\2\u01a9]\3\2\2\2\u01aa\u01ab\7\63\2\2\u01ab\u01ac"+
		"\7@\2\2\u01ac\u01ad\5\22\n\2\u01ad\u01ae\5\24\13\2\u01ae\u01b8\3\2\2\2"+
		"\u01af\u01b0\7@\2\2\u01b0\u01b8\5d\63\2\u01b1\u01b8\7B\2\2\u01b2\u01b8"+
		"\7C\2\2\u01b3\u01b4\7)\2\2\u01b4\u01b5\5l\67\2\u01b5\u01b6\7\24\2\2\u01b6"+
		"\u01b8\3\2\2\2\u01b7\u01aa\3\2\2\2\u01b7\u01af\3\2\2\2\u01b7\u01b1\3\2"+
		"\2\2\u01b7\u01b2\3\2\2\2\u01b7\u01b3\3\2\2\2\u01b8_\3\2\2\2\u01b9\u01ba"+
		"\7\3\2\2\u01ba\u01bb\7@\2\2\u01bb\u01bc\5\22\n\2\u01bc\u01bd\5\24\13\2"+
		"\u01bd\u01c0\3\2\2\2\u01be\u01c0\7A\2\2\u01bf\u01b9\3\2\2\2\u01bf\u01be"+
		"\3\2\2\2\u01c0a\3\2\2\2\u01c1\u01c2\7\22\2\2\u01c2\u01c3\5\\/\2\u01c3"+
		"\u01c4\5b\62\2\u01c4\u01c7\3\2\2\2\u01c5\u01c7\7*\2\2\u01c6\u01c1\3\2"+
		"\2\2\u01c6\u01c5\3\2\2\2\u01c7c\3\2\2\2\u01c8\u01c9\7)\2\2\u01c9\u01ca"+
		"\5l\67\2\u01ca\u01cb\58\35\2\u01cb\u01cc\7\24\2\2\u01cc\u01d2\3\2\2\2"+
		"\u01cd\u01ce\5\22\n\2\u01ce\u01cf\5\24\13\2\u01cf\u01d2\3\2\2\2\u01d0"+
		"\u01d2\7*\2\2\u01d1\u01c8\3\2\2\2\u01d1\u01cd\3\2\2\2\u01d1\u01d0\3\2"+
		"\2\2\u01d2e\3\2\2\2\u01d3\u01d4\5N(\2\u01d4\u01d5\5h\65\2\u01d5g\3\2\2"+
		"\2\u01d6\u01d7\5j\66\2\u01d7\u01d8\5N(\2\u01d8\u01db\3\2\2\2\u01d9\u01db"+
		"\7*\2\2\u01da\u01d6\3\2\2\2\u01da\u01d9\3\2\2\2\u01dbi\3\2\2\2\u01dc\u01dd"+
		"\t\b\2\2\u01ddk\3\2\2\2\u01de\u01df\5p9\2\u01df\u01e0\5r:\2\u01e0m\3\2"+
		"\2\2\u01e1\u01e2\t\t\2\2\u01e2o\3\2\2\2\u01e3\u01e4\5v<\2\u01e4\u01e5"+
		"\5t;\2\u01e5q\3\2\2\2\u01e6\u01e7\7\66\2\2\u01e7\u01e8\5p9\2\u01e8\u01e9"+
		"\5r:\2\u01e9\u01ec\3\2\2\2\u01ea\u01ec\7*\2\2\u01eb\u01e6\3\2\2\2\u01eb"+
		"\u01ea\3\2\2\2\u01ecs\3\2\2\2\u01ed\u01ee\78\2\2\u01ee\u01ef\5v<\2\u01ef"+
		"\u01f0\5t;\2\u01f0\u01f3\3\2\2\2\u01f1\u01f3\7*\2\2\u01f2\u01ed\3\2\2"+
		"\2\u01f2\u01f1\3\2\2\2\u01f3u\3\2\2\2\u01f4\u01f5\5n8\2\u01f5\u01f6\5"+
		"x=\2\u01f6w\3\2\2\2\u01f7\u01fb\7$\2\2\u01f8\u01fb\7\62\2\2\u01f9\u01fb"+
		"\5f\64\2\u01fa\u01f7\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01f9\3\2\2\2\u01fb"+
		"y\3\2\2\2%\u0083\u0087\u0096\u00a4\u00ae\u00b3\u00bb\u00bf\u00c6\u00cc"+
		"\u00d2\u00f1\u00f5\u0102\u0108\u0111\u014d\u0154\u0159\u0163\u0169\u0172"+
		"\u017a\u0185\u0198\u01a2\u01a8\u01b7\u01bf\u01c6\u01d1\u01da\u01eb\u01f2"+
		"\u01fa";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}