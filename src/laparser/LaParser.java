// Generated from C:\Users\Usuario\Documents\GitHub\Compilers-2-assignment-1\src\grammar\La.g4 by ANTLR 4.1
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
		T__59=1, T__58=2, T__57=3, T__56=4, T__55=5, T__54=6, T__53=7, T__52=8, 
		T__51=9, T__50=10, T__49=11, T__48=12, T__47=13, T__46=14, T__45=15, T__44=16, 
		T__43=17, T__42=18, T__41=19, T__40=20, T__39=21, T__38=22, T__37=23, 
		T__36=24, T__35=25, T__34=26, T__33=27, T__32=28, T__31=29, T__30=30, 
		T__29=31, T__28=32, T__27=33, T__26=34, T__25=35, T__24=36, T__23=37, 
		T__22=38, T__21=39, T__20=40, T__19=41, T__18=42, T__17=43, T__16=44, 
		T__15=45, T__14=46, T__13=47, T__12=48, T__11=49, T__10=50, T__9=51, T__8=52, 
		T__7=53, T__6=54, T__5=55, T__4=56, T__3=57, T__2=58, T__1=59, T__0=60, 
		IDENT=61, CADEIA=62, NUM_INT=63, NUM_REAL=64, COMENTARIO=65, WS=66;
	public static final String[] tokenNames = {
		"<INVALID>", "'retorne'", "'algoritmo'", "'constante'", "'..'", "'='", 
		"'faca'", "'^'", "'literal'", "'nao'", "'ou'", "'fim_algoritmo'", "'seja'", 
		"'('", "'para'", "'fim_caso'", "'entao'", "'declare'", "','", "'verdadeiro'", 
		"'<-'", "'var'", "'logico'", "'senao'", "'registro'", "'fim_procedimento'", 
		"'>='", "'<'", "']'", "'<>'", "'caso'", "'e'", "'enquanto'", "'+'", "'fim_para'", 
		"'/'", "'fim_registro'", "'fim_se'", "'ate'", "'<='", "'procedimento'", 
		"'falso'", "'&'", "'*'", "'.'", "'se'", "'):'", "'fim_enquanto'", "'fim_funcao'", 
		"'inteiro'", "':'", "'['", "'>'", "'escreva'", "'tipo'", "'%'", "')'", 
		"'funcao'", "'-'", "'leia'", "'real'", "IDENT", "CADEIA", "NUM_INT", "NUM_REAL", 
		"COMENTARIO", "WS"
	};
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_declaracao_local = 3, 
		RULE_variavel = 4, RULE_mais_var = 5, RULE_identificador = 6, RULE_ponteiros_opcionais = 7, 
		RULE_outros_ident = 8, RULE_dimensao = 9, RULE_tipo = 10, RULE_mais_ident = 11, 
		RULE_mais_variaveis = 12, RULE_tipo_basico = 13, RULE_tipo_basico_ident = 14, 
		RULE_tipo_estendido = 15, RULE_valor_constante = 16, RULE_registro = 17, 
		RULE_declaracao_global = 18, RULE_parametros_opcional = 19, RULE_parametro = 20, 
		RULE_var_opcional = 21, RULE_declaracoes_locais = 22, RULE_corpo = 23, 
		RULE_comandos = 24, RULE_cmd = 25, RULE_mais_expressao = 26, RULE_senao_opcional = 27, 
		RULE_chamada_atribuicao = 28, RULE_argumentos_opcional = 29, RULE_selecao = 30, 
		RULE_mais_selecao = 31, RULE_constantes = 32, RULE_mais_constantes = 33, 
		RULE_numero_intervalo = 34, RULE_intervalo_opcional = 35, RULE_op_unario = 36, 
		RULE_exp_aritmetica = 37, RULE_op_multiplicacao = 38, RULE_op_adicao = 39, 
		RULE_termo = 40, RULE_outros_termos = 41, RULE_fator = 42, RULE_outros_fatores = 43, 
		RULE_parcela = 44, RULE_parcela_unario = 45, RULE_parcela_nao_unario = 46, 
		RULE_outras_parcelas = 47, RULE_exp_relacional = 48, RULE_op_opcional = 49, 
		RULE_op_relacional = 50, RULE_expressao = 51, RULE_op_nao = 52, RULE_termo_logico = 53, 
		RULE_outros_termos_logicos = 54, RULE_outros_fatores_logicos = 55, RULE_fator_logico = 56, 
		RULE_parcela_logica = 57;
	public static final String[] ruleNames = {
		"programa", "declaracoes", "decl_local_global", "declaracao_local", "variavel", 
		"mais_var", "identificador", "ponteiros_opcionais", "outros_ident", "dimensao", 
		"tipo", "mais_ident", "mais_variaveis", "tipo_basico", "tipo_basico_ident", 
		"tipo_estendido", "valor_constante", "registro", "declaracao_global", 
		"parametros_opcional", "parametro", "var_opcional", "declaracoes_locais", 
		"corpo", "comandos", "cmd", "mais_expressao", "senao_opcional", "chamada_atribuicao", 
		"argumentos_opcional", "selecao", "mais_selecao", "constantes", "mais_constantes", 
		"numero_intervalo", "intervalo_opcional", "op_unario", "exp_aritmetica", 
		"op_multiplicacao", "op_adicao", "termo", "outros_termos", "fator", "outros_fatores", 
		"parcela", "parcela_unario", "parcela_nao_unario", "outras_parcelas", 
		"exp_relacional", "op_opcional", "op_relacional", "expressao", "op_nao", 
		"termo_logico", "outros_termos_logicos", "outros_fatores_logicos", "fator_logico", 
		"parcela_logica"
	};

	@Override
	public String getGrammarFileName() { return "La.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	 //Cria um objeto pilhaDeTabelas 
	infrastructure.PilhaDeTabelas pilhaDeTabelas = new infrastructure.PilhaDeTabelas();

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
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); declaracoes();
			setState(117); match(2);
			setState(118); corpo();
			setState(119); match(11);
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
		public List<Decl_local_globalContext> decl_local_global() {
			return getRuleContexts(Decl_local_globalContext.class);
		}
		public Decl_local_globalContext decl_local_global(int i) {
			return getRuleContext(Decl_local_globalContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 17) | (1L << 40) | (1L << 54) | (1L << 57))) != 0)) {
				{
				{
				setState(121); decl_local_global();
				}
				}
				setState(126);
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
	}

	public final Decl_local_globalContext decl_local_global() throws RecognitionException {
		Decl_local_globalContext _localctx = new Decl_local_globalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_local_global);
		try {
			setState(129);
			switch (_input.LA(1)) {
			case 3:
			case 17:
			case 54:
				enterOuterAlt(_localctx, 1);
				{
				setState(127); declaracao_local();
				}
				break;
			case 40:
			case 57:
				enterOuterAlt(_localctx, 2);
				{
				setState(128); declaracao_global();
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
		public VariavelContext variavel;
		public Token IDENT;
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_local);
		try {
			setState(147);
			switch (_input.LA(1)) {
			case 17:
				enterOuterAlt(_localctx, 1);
				{
				setState(131); match(17);
				setState(132); ((Declaracao_localContext)_localctx).variavel = variavel();

				          pilhaDeTabelas.topo().adicionarSimbolo(((Declaracao_localContext)_localctx).variavel.nome, "variavel");
				      
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 2);
				{
				setState(135); match(3);
				setState(136); ((Declaracao_localContext)_localctx).IDENT = match(IDENT);

				          pilhaDeTabelas.topo().adicionarSimbolo(((Declaracao_localContext)_localctx).IDENT.getText(), "constante");
				      
				setState(138); match(50);
				setState(139); tipo_basico();
				setState(140); match(5);
				setState(141); valor_constante();
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 3);
				{
				setState(143); match(54);
				setState(144); match(IDENT);
				setState(145); match(50);
				setState(146); tipo();
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
		public String nome;
		public int linha;
		public int coluna;
		public Token IDENT;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Mais_varContext mais_var() {
			return getRuleContext(Mais_varContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); ((VariavelContext)_localctx).IDENT = match(IDENT);
			 ((VariavelContext)_localctx).nome =  ((VariavelContext)_localctx).IDENT.getText(); ((VariavelContext)_localctx).linha =  (((VariavelContext)_localctx).IDENT!=null?((VariavelContext)_localctx).IDENT.getLine():0); ((VariavelContext)_localctx).coluna =  (((VariavelContext)_localctx).IDENT!=null?((VariavelContext)_localctx).IDENT.getCharPositionInLine():0); 
			setState(151); dimensao();
			setState(152); mais_var();
			setState(153); match(50);
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
		public Token IDENT;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Mais_varContext mais_var() {
			return getRuleContext(Mais_varContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public Mais_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var; }
	}

	public final Mais_varContext mais_var() throws RecognitionException {
		Mais_varContext _localctx = new Mais_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mais_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if (_la==18) {
				{
				setState(156); match(18);
				setState(157); ((Mais_varContext)_localctx).IDENT = match(IDENT);
				setState(158); dimensao();

				          pilhaDeTabelas.topo().adicionarSimbolo(((Mais_varContext)_localctx).IDENT.getText(), "variavel");
				      
				setState(160); mais_var();
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

	public static class IdentificadorContext extends ParserRuleContext {
		public String nome;
		public int linha;
		public int coluna;
		public Token IDENT;
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
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); ponteiros_opcionais();
			setState(165); ((IdentificadorContext)_localctx).IDENT = match(IDENT);
			 ((IdentificadorContext)_localctx).nome =  ((IdentificadorContext)_localctx).IDENT.getText(); ((IdentificadorContext)_localctx).linha =  (((IdentificadorContext)_localctx).IDENT!=null?((IdentificadorContext)_localctx).IDENT.getLine():0); ((IdentificadorContext)_localctx).coluna =  (((IdentificadorContext)_localctx).IDENT!=null?((IdentificadorContext)_localctx).IDENT.getCharPositionInLine():0); 
			setState(167); dimensao();
			setState(168); outros_ident();
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
	}

	public final Ponteiros_opcionaisContext ponteiros_opcionais() throws RecognitionException {
		Ponteiros_opcionaisContext _localctx = new Ponteiros_opcionaisContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ponteiros_opcionais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(170); match(7);
				setState(171); ponteiros_opcionais();
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

	public static class Outros_identContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Outros_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_ident; }
	}

	public final Outros_identContext outros_ident() throws RecognitionException {
		Outros_identContext _localctx = new Outros_identContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_outros_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if (_la==44) {
				{
				setState(174); match(44);
				setState(175); identificador();
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
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dimensao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(178); match(51);
				setState(179); exp_aritmetica();
				setState(180); match(28);
				setState(181); dimensao();
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

	public static class TipoContext extends ParserRuleContext {
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo);
		try {
			setState(187);
			switch (_input.LA(1)) {
			case 24:
				enterOuterAlt(_localctx, 1);
				{
				setState(185); registro();
				}
				break;
			case 7:
			case 8:
			case 22:
			case 49:
			case 60:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(186); tipo_estendido();
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
	}

	public final Mais_identContext mais_ident() throws RecognitionException {
		Mais_identContext _localctx = new Mais_identContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mais_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if (_la==18) {
				{
				setState(189); match(18);
				setState(190); identificador();
				setState(191); mais_ident();
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

	public static class Mais_variaveisContext extends ParserRuleContext {
		public VariavelContext variavel;
		public Mais_variaveisContext mais_variaveis() {
			return getRuleContext(Mais_variaveisContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Mais_variaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_variaveis; }
	}

	public final Mais_variaveisContext mais_variaveis() throws RecognitionException {
		Mais_variaveisContext _localctx = new Mais_variaveisContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mais_variaveis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(195); ((Mais_variaveisContext)_localctx).variavel = variavel();

				           if (!pilhaDeTabelas.existeSimbolo(((Mais_variaveisContext)_localctx).variavel.nome)) {
				                infrastructure.Mensagens.erroVariavelNaoExiste(((Mais_variaveisContext)_localctx).variavel.linha,((Mais_variaveisContext)_localctx).variavel.coluna,((Mais_variaveisContext)_localctx).variavel.nome);
				           }
				       
				setState(197); mais_variaveis();
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

	public static class Tipo_basicoContext extends ParserRuleContext {
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo_basico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 22) | (1L << 49) | (1L << 60))) != 0)) ) {
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
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
	}

	public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
		Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo_basico_ident);
		try {
			setState(205);
			switch (_input.LA(1)) {
			case 8:
			case 22:
			case 49:
			case 60:
				enterOuterAlt(_localctx, 1);
				{
				setState(203); tipo_basico();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(204); match(IDENT);
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
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tipo_estendido);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); ponteiros_opcionais();
			setState(208); tipo_basico_ident();
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
		public TerminalNode NUM_REAL() { return getToken(LaParser.NUM_REAL, 0); }
		public TerminalNode CADEIA() { return getToken(LaParser.CADEIA, 0); }
		public TerminalNode NUM_INT() { return getToken(LaParser.NUM_INT, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !(((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (19 - 19)) | (1L << (41 - 19)) | (1L << (CADEIA - 19)) | (1L << (NUM_INT - 19)) | (1L << (NUM_REAL - 19)))) != 0)) ) {
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
		public VariavelContext variavel;
		public Mais_variaveisContext mais_variaveis() {
			return getRuleContext(Mais_variaveisContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_registro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); match(24);
			setState(213); ((RegistroContext)_localctx).variavel = variavel();

			          //pilhaDeTabelas.topo().adicionarSimbolo(((RegistroContext)_localctx).variavel.nome, "registro");
			      
			setState(215); mais_variaveis();
			setState(216); match(36);
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
		public Token IDENT;
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public Parametros_opcionalContext parametros_opcional() {
			return getRuleContext(Parametros_opcionalContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaracao_global);
		try {
			setState(243);
			switch (_input.LA(1)) {
			case 40:
				enterOuterAlt(_localctx, 1);
				{
				 pilhaDeTabelas.empilhar(new infrastructure.TabelaDeSimbolos("global")); 
				setState(219); match(40);
				setState(220); ((Declaracao_globalContext)_localctx).IDENT = match(IDENT);

				          pilhaDeTabelas.topo().adicionarSimbolo(((Declaracao_globalContext)_localctx).IDENT.getText(), "procedimento");
				      
				setState(222); match(13);
				setState(223); parametros_opcional();
				setState(224); match(56);
				setState(225); declaracoes_locais();
				setState(226); comandos();
				setState(227); match(25);
				 pilhaDeTabelas.desempilhar(); 
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 2);
				{
				 pilhaDeTabelas.empilhar(new infrastructure.TabelaDeSimbolos("global")); 
				setState(231); match(57);
				setState(232); ((Declaracao_globalContext)_localctx).IDENT = match(IDENT);

				          pilhaDeTabelas.topo().adicionarSimbolo(((Declaracao_globalContext)_localctx).IDENT.getText(), "funcao");
				      
				setState(234); match(13);
				setState(235); parametros_opcional();
				setState(236); match(46);
				setState(237); tipo_estendido();
				setState(238); declaracoes_locais();
				setState(239); comandos();
				setState(240); match(48);
				 pilhaDeTabelas.desempilhar(); 
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
	}

	public final Parametros_opcionalContext parametros_opcional() throws RecognitionException {
		Parametros_opcionalContext _localctx = new Parametros_opcionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parametros_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 21) | (1L << IDENT))) != 0)) {
				{
				setState(245); parametro();
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

	public static class ParametroContext extends ParserRuleContext {
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Var_opcionalContext var_opcional() {
			return getRuleContext(Var_opcionalContext.class,0);
		}
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); var_opcional();
			setState(249); identificador();
			setState(250); mais_ident();
			setState(251); match(50);
			setState(252); tipo_estendido();
			setState(255);
			_la = _input.LA(1);
			if (_la==18) {
				{
				setState(253); match(18);
				setState(254); parametro();
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
	}

	public final Var_opcionalContext var_opcional() throws RecognitionException {
		Var_opcionalContext _localctx = new Var_opcionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if (_la==21) {
				{
				setState(257); match(21);
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
	}

	public final Declaracoes_locaisContext declaracoes_locais() throws RecognitionException {
		Declaracoes_locaisContext _localctx = new Declaracoes_locaisContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declaracoes_locais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 17) | (1L << 54))) != 0)) {
				{
				setState(260); declaracao_local();
				setState(261); declaracoes_locais();
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
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); declaracoes_locais();
			setState(266); comandos();
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
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 7) | (1L << 14) | (1L << 30) | (1L << 32) | (1L << 45) | (1L << 53) | (1L << 59) | (1L << IDENT))) != 0)) {
				{
				setState(268); cmd();
				setState(269); comandos();
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

	public static class CmdContext extends ParserRuleContext {
		public IdentificadorContext identificador;
		public Token IDENT;
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public Senao_opcionalContext senao_opcional() {
			return getRuleContext(Senao_opcionalContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public Chamada_atribuicaoContext chamada_atribuicao() {
			return getRuleContext(Chamada_atribuicaoContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cmd);
		try {
			setState(335);
			switch (_input.LA(1)) {
			case 59:
				enterOuterAlt(_localctx, 1);
				{
				setState(273); match(59);
				setState(274); match(13);
				setState(275); ((CmdContext)_localctx).identificador = identificador();
				setState(276); mais_ident();
				   //Lanca um erro quando nao encontra a variavel na pilha de tabelas
				           if (!pilhaDeTabelas.existeSimbolo(((CmdContext)_localctx).identificador.nome)) {
				                infrastructure.Mensagens.erroVariavelNaoExiste(((CmdContext)_localctx).identificador.linha,((CmdContext)_localctx).identificador.coluna,((CmdContext)_localctx).identificador.nome);
				           }
				      
				setState(278); match(56);
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 2);
				{
				setState(280); match(53);
				setState(281); match(13);
				setState(282); expressao();
				setState(283); mais_expressao();
				setState(284); match(56);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 3);
				{
				setState(286); match(45);
				setState(287); expressao();
				setState(288); match(16);
				setState(289); comandos();
				setState(290); senao_opcional();
				setState(291); match(37);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 4);
				{
				setState(293); match(30);
				setState(294); exp_aritmetica();
				setState(295); match(12);
				setState(296); selecao();
				setState(297); senao_opcional();
				setState(298); match(15);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 5);
				{
				setState(300); match(14);
				   //Empilha (Cria) um novo escopo para o FOR
				          pilhaDeTabelas.empilhar(new infrastructure.TabelaDeSimbolos("para"));
				      
				setState(302); ((CmdContext)_localctx).IDENT = match(IDENT);

				          pilhaDeTabelas.topo().adicionarSimbolo(((CmdContext)_localctx).IDENT.getText(), "variavel");
				      
				setState(304); match(20);
				setState(305); exp_aritmetica();
				setState(306); match(38);
				setState(307); exp_aritmetica();
				setState(308); match(6);
				setState(309); comandos();
				setState(310); match(34);
				   //Desempilha o escopo do FOR
				          pilhaDeTabelas.desempilhar();
				      
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 6);
				{
				setState(313); match(32);
				setState(314); expressao();
				setState(315); match(6);
				setState(316); comandos();
				setState(317); match(47);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 7);
				{
				setState(319); match(6);
				setState(320); comandos();
				setState(321); match(38);
				setState(322); expressao();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 8);
				{
				setState(324); match(7);
				setState(325); match(IDENT);
				setState(326); outros_ident();
				setState(327); dimensao();
				setState(328); match(20);
				setState(329); expressao();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(331); match(IDENT);
				setState(332); chamada_atribuicao();
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 10);
				{
				setState(333); match(1);
				setState(334); expressao();
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
	}

	public final Mais_expressaoContext mais_expressao() throws RecognitionException {
		Mais_expressaoContext _localctx = new Mais_expressaoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_mais_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if (_la==18) {
				{
				setState(337); match(18);
				setState(338); expressao();
				setState(339); mais_expressao();
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

	public static class Senao_opcionalContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Senao_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao_opcional; }
	}

	public final Senao_opcionalContext senao_opcional() throws RecognitionException {
		Senao_opcionalContext _localctx = new Senao_opcionalContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_senao_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_la = _input.LA(1);
			if (_la==23) {
				{
				setState(343); match(23);
				setState(344); comandos();
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
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Argumentos_opcionalContext argumentos_opcional() {
			return getRuleContext(Argumentos_opcionalContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public Chamada_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_atribuicao; }
	}

	public final Chamada_atribuicaoContext chamada_atribuicao() throws RecognitionException {
		Chamada_atribuicaoContext _localctx = new Chamada_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_chamada_atribuicao);
		try {
			setState(356);
			switch (_input.LA(1)) {
			case 13:
				enterOuterAlt(_localctx, 1);
				{
				setState(347); match(13);
				setState(348); argumentos_opcional();
				setState(349); match(56);
				}
				break;
			case 20:
			case 44:
			case 51:
				enterOuterAlt(_localctx, 2);
				{
				setState(351); outros_ident();
				setState(352); dimensao();
				setState(353); match(20);
				setState(354); expressao();
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
	}

	public final Argumentos_opcionalContext argumentos_opcional() throws RecognitionException {
		Argumentos_opcionalContext _localctx = new Argumentos_opcionalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_argumentos_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (7 - 7)) | (1L << (9 - 7)) | (1L << (13 - 7)) | (1L << (19 - 7)) | (1L << (41 - 7)) | (1L << (42 - 7)) | (1L << (58 - 7)) | (1L << (IDENT - 7)) | (1L << (CADEIA - 7)) | (1L << (NUM_INT - 7)) | (1L << (NUM_REAL - 7)))) != 0)) {
				{
				setState(358); expressao();
				setState(359); mais_expressao();
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

	public static class SelecaoContext extends ParserRuleContext {
		public Mais_selecaoContext mais_selecao() {
			return getRuleContext(Mais_selecaoContext.class,0);
		}
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_selecao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363); constantes();
			setState(364); match(50);
			setState(365); comandos();
			setState(366); mais_selecao();
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
	}

	public final Mais_selecaoContext mais_selecao() throws RecognitionException {
		Mais_selecaoContext _localctx = new Mais_selecaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_mais_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_la = _input.LA(1);
			if (_la==58 || _la==NUM_INT) {
				{
				setState(368); selecao();
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

	public static class ConstantesContext extends ParserRuleContext {
		public Numero_intervaloContext numero_intervalo() {
			return getRuleContext(Numero_intervaloContext.class,0);
		}
		public Mais_constantesContext mais_constantes() {
			return getRuleContext(Mais_constantesContext.class,0);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_constantes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371); numero_intervalo();
			setState(372); mais_constantes();
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
	}

	public final Mais_constantesContext mais_constantes() throws RecognitionException {
		Mais_constantesContext _localctx = new Mais_constantesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mais_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_la = _input.LA(1);
			if (_la==18) {
				{
				setState(374); match(18);
				setState(375); constantes();
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

	public static class Numero_intervaloContext extends ParserRuleContext {
		public Intervalo_opcionalContext intervalo_opcional() {
			return getRuleContext(Intervalo_opcionalContext.class,0);
		}
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LaParser.NUM_INT, 0); }
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_numero_intervalo);
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
	}

	public final Intervalo_opcionalContext intervalo_opcional() throws RecognitionException {
		Intervalo_opcionalContext _localctx = new Intervalo_opcionalContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_intervalo_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_la = _input.LA(1);
			if (_la==4) {
				{
				setState(382); match(4);
				setState(383); op_unario();
				setState(384); match(NUM_INT);
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
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_op_unario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_la = _input.LA(1);
			if (_la==58) {
				{
				setState(388); match(58);
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
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_exp_aritmetica);
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
	}

	public final Op_multiplicacaoContext op_multiplicacao() throws RecognitionException {
		Op_multiplicacaoContext _localctx = new Op_multiplicacaoContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_op_multiplicacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_la = _input.LA(1);
			if ( !(_la==35 || _la==43) ) {
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
	}

	public final Op_adicaoContext op_adicao() throws RecognitionException {
		Op_adicaoContext _localctx = new Op_adicaoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_op_adicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_la = _input.LA(1);
			if ( !(_la==33 || _la==58) ) {
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
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_termo);
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
	}

	public final Outros_termosContext outros_termos() throws RecognitionException {
		Outros_termosContext _localctx = new Outros_termosContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_outros_termos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(401); op_adicao();
				setState(402); termo();
				setState(403); outros_termos();
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
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_fator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407); parcela();
			setState(408); outras_parcelas();
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
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Op_multiplicacaoContext op_multiplicacao() {
			return getRuleContext(Op_multiplicacaoContext.class,0);
		}
		public Outros_fatoresContext outros_fatores() {
			return getRuleContext(Outros_fatoresContext.class,0);
		}
		public Outros_fatoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_fatores; }
	}

	public final Outros_fatoresContext outros_fatores() throws RecognitionException {
		Outros_fatoresContext _localctx = new Outros_fatoresContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_outros_fatores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_la = _input.LA(1);
			if (_la==35 || _la==43) {
				{
				setState(410); op_multiplicacao();
				setState(411); fator();
				setState(412); outros_fatores();
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
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_parcela);
		try {
			setState(420);
			switch (_input.LA(1)) {
			case 7:
			case 13:
			case 58:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(416); op_unario();
				setState(417); parcela_unario();
				}
				break;
			case 42:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(419); parcela_nao_unario();
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
		public TerminalNode NUM_REAL() { return getToken(LaParser.NUM_REAL, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LaParser.NUM_INT, 0); }
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_parcela_unario);
		try {
			setState(443);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422); match(7);
				setState(423); match(IDENT);
				setState(424); outros_ident();
				setState(425); dimensao();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427); match(IDENT);
				setState(428); outros_ident();
				setState(429); dimensao();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(431); match(IDENT);
				setState(432); match(13);
				setState(433); expressao();
				setState(434); mais_expressao();
				setState(435); match(56);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(437); match(NUM_INT);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(438); match(NUM_REAL);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(439); match(13);
				setState(440); expressao();
				setState(441); match(56);
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
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(LaParser.CADEIA, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_parcela_nao_unario);
		try {
			setState(451);
			switch (_input.LA(1)) {
			case 42:
				enterOuterAlt(_localctx, 1);
				{
				setState(445); match(42);
				setState(446); match(IDENT);
				setState(447); outros_ident();
				setState(448); dimensao();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(450); match(CADEIA);
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
	}

	public final Outras_parcelasContext outras_parcelas() throws RecognitionException {
		Outras_parcelasContext _localctx = new Outras_parcelasContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_outras_parcelas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_la = _input.LA(1);
			if (_la==55) {
				{
				setState(453); match(55);
				setState(454); parcela();
				setState(455); outras_parcelas();
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
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_exp_relacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459); exp_aritmetica();
			setState(460); op_opcional();
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
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public Op_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_opcional; }
	}

	public final Op_opcionalContext op_opcional() throws RecognitionException {
		Op_opcionalContext _localctx = new Op_opcionalContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_op_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 39) | (1L << 52))) != 0)) {
				{
				setState(462); op_relacional();
				setState(463); exp_aritmetica();
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

	public static class Op_relacionalContext extends ParserRuleContext {
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 39) | (1L << 52))) != 0)) ) {
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
		public Outros_termos_logicosContext outros_termos_logicos() {
			return getRuleContext(Outros_termos_logicosContext.class,0);
		}
		public Termo_logicoContext termo_logico() {
			return getRuleContext(Termo_logicoContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469); termo_logico();
			setState(470); outros_termos_logicos();
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
	}

	public final Op_naoContext op_nao() throws RecognitionException {
		Op_naoContext _localctx = new Op_naoContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_op_nao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_la = _input.LA(1);
			if (_la==9) {
				{
				setState(472); match(9);
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

	public static class Termo_logicoContext extends ParserRuleContext {
		public Fator_logicoContext fator_logico() {
			return getRuleContext(Fator_logicoContext.class,0);
		}
		public Outros_fatores_logicosContext outros_fatores_logicos() {
			return getRuleContext(Outros_fatores_logicosContext.class,0);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_termo_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475); fator_logico();
			setState(476); outros_fatores_logicos();
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
		public Outros_termos_logicosContext outros_termos_logicos() {
			return getRuleContext(Outros_termos_logicosContext.class,0);
		}
		public Termo_logicoContext termo_logico() {
			return getRuleContext(Termo_logicoContext.class,0);
		}
		public Outros_termos_logicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos_logicos; }
	}

	public final Outros_termos_logicosContext outros_termos_logicos() throws RecognitionException {
		Outros_termos_logicosContext _localctx = new Outros_termos_logicosContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_outros_termos_logicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_la = _input.LA(1);
			if (_la==10) {
				{
				setState(478); match(10);
				setState(479); termo_logico();
				setState(480); outros_termos_logicos();
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

	public static class Outros_fatores_logicosContext extends ParserRuleContext {
		public Fator_logicoContext fator_logico() {
			return getRuleContext(Fator_logicoContext.class,0);
		}
		public Outros_fatores_logicosContext outros_fatores_logicos() {
			return getRuleContext(Outros_fatores_logicosContext.class,0);
		}
		public Outros_fatores_logicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_fatores_logicos; }
	}

	public final Outros_fatores_logicosContext outros_fatores_logicos() throws RecognitionException {
		Outros_fatores_logicosContext _localctx = new Outros_fatores_logicosContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_outros_fatores_logicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			_la = _input.LA(1);
			if (_la==31) {
				{
				setState(484); match(31);
				setState(485); fator_logico();
				setState(486); outros_fatores_logicos();
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
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_fator_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490); op_nao();
			setState(491); parcela_logica();
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
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_parcela_logica);
		try {
			setState(496);
			switch (_input.LA(1)) {
			case 19:
				enterOuterAlt(_localctx, 1);
				{
				setState(493); match(19);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 2);
				{
				setState(494); match(41);
				}
				break;
			case 7:
			case 13:
			case 42:
			case 58:
			case IDENT:
			case CADEIA:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(495); exp_relacional();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3D\u01f5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\7\3}\n\3\f\3\16\3\u0080\13\3\3\4\3\4\5\4\u0084\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0096\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a5\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u00af\n\t\3\n\3\n\5\n\u00b3\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00ba\n\13\3\f\3\f\5\f\u00be\n\f\3\r\3\r\3\r"+
		"\3\r\5\r\u00c4\n\r\3\16\3\16\3\16\3\16\5\16\u00ca\n\16\3\17\3\17\3\20"+
		"\3\20\5\20\u00d0\n\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f6"+
		"\n\24\3\25\5\25\u00f9\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0102"+
		"\n\26\3\27\5\27\u0105\n\27\3\30\3\30\3\30\5\30\u010a\n\30\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\5\32\u0112\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u0152\n\33\3\34\3\34\3\34\3\34\5\34\u0158\n\34\3\35\3\35\5\35\u015c\n"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0167\n\36\3\37"+
		"\3\37\3\37\5\37\u016c\n\37\3 \3 \3 \3 \3 \3!\5!\u0174\n!\3\"\3\"\3\"\3"+
		"#\3#\5#\u017b\n#\3$\3$\3$\3$\3%\3%\3%\3%\5%\u0185\n%\3&\5&\u0188\n&\3"+
		"\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3+\5+\u0198\n+\3,\3,\3,\3-\3"+
		"-\3-\3-\5-\u01a1\n-\3.\3.\3.\3.\5.\u01a7\n.\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u01be\n/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\5\60\u01c6\n\60\3\61\3\61\3\61\3\61\5\61\u01cc\n\61\3\62\3"+
		"\62\3\62\3\63\3\63\3\63\5\63\u01d4\n\63\3\64\3\64\3\65\3\65\3\65\3\66"+
		"\5\66\u01dc\n\66\3\67\3\67\3\67\38\38\38\38\58\u01e5\n8\39\39\39\39\5"+
		"9\u01eb\n9\3:\3:\3:\3;\3;\3;\5;\u01f3\n;\3;\2<\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\2"+
		"\7\6\2\n\n\30\30\63\63>>\5\2\25\25++@B\4\2%%--\4\2##<<\7\2\7\7\34\35\37"+
		"\37))\66\66\u01ed\2v\3\2\2\2\4~\3\2\2\2\6\u0083\3\2\2\2\b\u0095\3\2\2"+
		"\2\n\u0097\3\2\2\2\f\u00a4\3\2\2\2\16\u00a6\3\2\2\2\20\u00ae\3\2\2\2\22"+
		"\u00b2\3\2\2\2\24\u00b9\3\2\2\2\26\u00bd\3\2\2\2\30\u00c3\3\2\2\2\32\u00c9"+
		"\3\2\2\2\34\u00cb\3\2\2\2\36\u00cf\3\2\2\2 \u00d1\3\2\2\2\"\u00d4\3\2"+
		"\2\2$\u00d6\3\2\2\2&\u00f5\3\2\2\2(\u00f8\3\2\2\2*\u00fa\3\2\2\2,\u0104"+
		"\3\2\2\2.\u0109\3\2\2\2\60\u010b\3\2\2\2\62\u0111\3\2\2\2\64\u0151\3\2"+
		"\2\2\66\u0157\3\2\2\28\u015b\3\2\2\2:\u0166\3\2\2\2<\u016b\3\2\2\2>\u016d"+
		"\3\2\2\2@\u0173\3\2\2\2B\u0175\3\2\2\2D\u017a\3\2\2\2F\u017c\3\2\2\2H"+
		"\u0184\3\2\2\2J\u0187\3\2\2\2L\u0189\3\2\2\2N\u018c\3\2\2\2P\u018e\3\2"+
		"\2\2R\u0190\3\2\2\2T\u0197\3\2\2\2V\u0199\3\2\2\2X\u01a0\3\2\2\2Z\u01a6"+
		"\3\2\2\2\\\u01bd\3\2\2\2^\u01c5\3\2\2\2`\u01cb\3\2\2\2b\u01cd\3\2\2\2"+
		"d\u01d3\3\2\2\2f\u01d5\3\2\2\2h\u01d7\3\2\2\2j\u01db\3\2\2\2l\u01dd\3"+
		"\2\2\2n\u01e4\3\2\2\2p\u01ea\3\2\2\2r\u01ec\3\2\2\2t\u01f2\3\2\2\2vw\5"+
		"\4\3\2wx\7\4\2\2xy\5\60\31\2yz\7\r\2\2z\3\3\2\2\2{}\5\6\4\2|{\3\2\2\2"+
		"}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\5\3\2\2\2\u0080~\3\2\2\2\u0081"+
		"\u0084\5\b\5\2\u0082\u0084\5&\24\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2"+
		"\2\2\u0084\7\3\2\2\2\u0085\u0086\7\23\2\2\u0086\u0087\5\n\6\2\u0087\u0088"+
		"\b\5\1\2\u0088\u0096\3\2\2\2\u0089\u008a\7\5\2\2\u008a\u008b\7?\2\2\u008b"+
		"\u008c\b\5\1\2\u008c\u008d\7\64\2\2\u008d\u008e\5\34\17\2\u008e\u008f"+
		"\7\7\2\2\u008f\u0090\5\"\22\2\u0090\u0096\3\2\2\2\u0091\u0092\78\2\2\u0092"+
		"\u0093\7?\2\2\u0093\u0094\7\64\2\2\u0094\u0096\5\26\f\2\u0095\u0085\3"+
		"\2\2\2\u0095\u0089\3\2\2\2\u0095\u0091\3\2\2\2\u0096\t\3\2\2\2\u0097\u0098"+
		"\7?\2\2\u0098\u0099\b\6\1\2\u0099\u009a\5\24\13\2\u009a\u009b\5\f\7\2"+
		"\u009b\u009c\7\64\2\2\u009c\u009d\5\26\f\2\u009d\13\3\2\2\2\u009e\u009f"+
		"\7\24\2\2\u009f\u00a0\7?\2\2\u00a0\u00a1\5\24\13\2\u00a1\u00a2\b\7\1\2"+
		"\u00a2\u00a3\5\f\7\2\u00a3\u00a5\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\r\3\2\2\2\u00a6\u00a7\5\20\t\2\u00a7\u00a8\7?\2\2\u00a8"+
		"\u00a9\b\b\1\2\u00a9\u00aa\5\24\13\2\u00aa\u00ab\5\22\n\2\u00ab\17\3\2"+
		"\2\2\u00ac\u00ad\7\t\2\2\u00ad\u00af\5\20\t\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\21\3\2\2\2\u00b0\u00b1\7.\2\2\u00b1\u00b3\5\16\b"+
		"\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\23\3\2\2\2\u00b4\u00b5"+
		"\7\65\2\2\u00b5\u00b6\5L\'\2\u00b6\u00b7\7\36\2\2\u00b7\u00b8\5\24\13"+
		"\2\u00b8\u00ba\3\2\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\25"+
		"\3\2\2\2\u00bb\u00be\5$\23\2\u00bc\u00be\5 \21\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\27\3\2\2\2\u00bf\u00c0\7\24\2\2\u00c0\u00c1\5\16"+
		"\b\2\u00c1\u00c2\5\30\r\2\u00c2\u00c4\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\31\3\2\2\2\u00c5\u00c6\5\n\6\2\u00c6\u00c7\b\16\1"+
		"\2\u00c7\u00c8\5\32\16\2\u00c8\u00ca\3\2\2\2\u00c9\u00c5\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\33\3\2\2\2\u00cb\u00cc\t\2\2\2\u00cc\35\3\2\2\2\u00cd"+
		"\u00d0\5\34\17\2\u00ce\u00d0\7?\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3"+
		"\2\2\2\u00d0\37\3\2\2\2\u00d1\u00d2\5\20\t\2\u00d2\u00d3\5\36\20\2\u00d3"+
		"!\3\2\2\2\u00d4\u00d5\t\3\2\2\u00d5#\3\2\2\2\u00d6\u00d7\7\32\2\2\u00d7"+
		"\u00d8\5\n\6\2\u00d8\u00d9\b\23\1\2\u00d9\u00da\5\32\16\2\u00da\u00db"+
		"\7&\2\2\u00db%\3\2\2\2\u00dc\u00dd\b\24\1\2\u00dd\u00de\7*\2\2\u00de\u00df"+
		"\7?\2\2\u00df\u00e0\b\24\1\2\u00e0\u00e1\7\17\2\2\u00e1\u00e2\5(\25\2"+
		"\u00e2\u00e3\7:\2\2\u00e3\u00e4\5.\30\2\u00e4\u00e5\5\62\32\2\u00e5\u00e6"+
		"\7\33\2\2\u00e6\u00e7\b\24\1\2\u00e7\u00f6\3\2\2\2\u00e8\u00e9\b\24\1"+
		"\2\u00e9\u00ea\7;\2\2\u00ea\u00eb\7?\2\2\u00eb\u00ec\b\24\1\2\u00ec\u00ed"+
		"\7\17\2\2\u00ed\u00ee\5(\25\2\u00ee\u00ef\7\60\2\2\u00ef\u00f0\5 \21\2"+
		"\u00f0\u00f1\5.\30\2\u00f1\u00f2\5\62\32\2\u00f2\u00f3\7\62\2\2\u00f3"+
		"\u00f4\b\24\1\2\u00f4\u00f6\3\2\2\2\u00f5\u00dc\3\2\2\2\u00f5\u00e8\3"+
		"\2\2\2\u00f6\'\3\2\2\2\u00f7\u00f9\5*\26\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9)\3\2\2\2\u00fa\u00fb\5,\27\2\u00fb\u00fc\5\16\b\2\u00fc"+
		"\u00fd\5\30\r\2\u00fd\u00fe\7\64\2\2\u00fe\u0101\5 \21\2\u00ff\u0100\7"+
		"\24\2\2\u0100\u0102\5*\26\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"+\3\2\2\2\u0103\u0105\7\27\2\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2"+
		"\u0105-\3\2\2\2\u0106\u0107\5\b\5\2\u0107\u0108\5.\30\2\u0108\u010a\3"+
		"\2\2\2\u0109\u0106\3\2\2\2\u0109\u010a\3\2\2\2\u010a/\3\2\2\2\u010b\u010c"+
		"\5.\30\2\u010c\u010d\5\62\32\2\u010d\61\3\2\2\2\u010e\u010f\5\64\33\2"+
		"\u010f\u0110\5\62\32\2\u0110\u0112\3\2\2\2\u0111\u010e\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\63\3\2\2\2\u0113\u0114\7=\2\2\u0114\u0115\7\17\2\2\u0115"+
		"\u0116\5\16\b\2\u0116\u0117\5\30\r\2\u0117\u0118\b\33\1\2\u0118\u0119"+
		"\7:\2\2\u0119\u0152\3\2\2\2\u011a\u011b\7\67\2\2\u011b\u011c\7\17\2\2"+
		"\u011c\u011d\5h\65\2\u011d\u011e\5\66\34\2\u011e\u011f\7:\2\2\u011f\u0152"+
		"\3\2\2\2\u0120\u0121\7/\2\2\u0121\u0122\5h\65\2\u0122\u0123\7\22\2\2\u0123"+
		"\u0124\5\62\32\2\u0124\u0125\58\35\2\u0125\u0126\7\'\2\2\u0126\u0152\3"+
		"\2\2\2\u0127\u0128\7 \2\2\u0128\u0129\5L\'\2\u0129\u012a\7\16\2\2\u012a"+
		"\u012b\5> \2\u012b\u012c\58\35\2\u012c\u012d\7\21\2\2\u012d\u0152\3\2"+
		"\2\2\u012e\u012f\7\20\2\2\u012f\u0130\b\33\1\2\u0130\u0131\7?\2\2\u0131"+
		"\u0132\b\33\1\2\u0132\u0133\7\26\2\2\u0133\u0134\5L\'\2\u0134\u0135\7"+
		"(\2\2\u0135\u0136\5L\'\2\u0136\u0137\7\b\2\2\u0137\u0138\5\62\32\2\u0138"+
		"\u0139\7$\2\2\u0139\u013a\b\33\1\2\u013a\u0152\3\2\2\2\u013b\u013c\7\""+
		"\2\2\u013c\u013d\5h\65\2\u013d\u013e\7\b\2\2\u013e\u013f\5\62\32\2\u013f"+
		"\u0140\7\61\2\2\u0140\u0152\3\2\2\2\u0141\u0142\7\b\2\2\u0142\u0143\5"+
		"\62\32\2\u0143\u0144\7(\2\2\u0144\u0145\5h\65\2\u0145\u0152\3\2\2\2\u0146"+
		"\u0147\7\t\2\2\u0147\u0148\7?\2\2\u0148\u0149\5\22\n\2\u0149\u014a\5\24"+
		"\13\2\u014a\u014b\7\26\2\2\u014b\u014c\5h\65\2\u014c\u0152\3\2\2\2\u014d"+
		"\u014e\7?\2\2\u014e\u0152\5:\36\2\u014f\u0150\7\3\2\2\u0150\u0152\5h\65"+
		"\2\u0151\u0113\3\2\2\2\u0151\u011a\3\2\2\2\u0151\u0120\3\2\2\2\u0151\u0127"+
		"\3\2\2\2\u0151\u012e\3\2\2\2\u0151\u013b\3\2\2\2\u0151\u0141\3\2\2\2\u0151"+
		"\u0146\3\2\2\2\u0151\u014d\3\2\2\2\u0151\u014f\3\2\2\2\u0152\65\3\2\2"+
		"\2\u0153\u0154\7\24\2\2\u0154\u0155\5h\65\2\u0155\u0156\5\66\34\2\u0156"+
		"\u0158\3\2\2\2\u0157\u0153\3\2\2\2\u0157\u0158\3\2\2\2\u0158\67\3\2\2"+
		"\2\u0159\u015a\7\31\2\2\u015a\u015c\5\62\32\2\u015b\u0159\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c9\3\2\2\2\u015d\u015e\7\17\2\2\u015e\u015f\5<\37\2"+
		"\u015f\u0160\7:\2\2\u0160\u0167\3\2\2\2\u0161\u0162\5\22\n\2\u0162\u0163"+
		"\5\24\13\2\u0163\u0164\7\26\2\2\u0164\u0165\5h\65\2\u0165\u0167\3\2\2"+
		"\2\u0166\u015d\3\2\2\2\u0166\u0161\3\2\2\2\u0167;\3\2\2\2\u0168\u0169"+
		"\5h\65\2\u0169\u016a\5\66\34\2\u016a\u016c\3\2\2\2\u016b\u0168\3\2\2\2"+
		"\u016b\u016c\3\2\2\2\u016c=\3\2\2\2\u016d\u016e\5B\"\2\u016e\u016f\7\64"+
		"\2\2\u016f\u0170\5\62\32\2\u0170\u0171\5@!\2\u0171?\3\2\2\2\u0172\u0174"+
		"\5> \2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174A\3\2\2\2\u0175\u0176"+
		"\5F$\2\u0176\u0177\5D#\2\u0177C\3\2\2\2\u0178\u0179\7\24\2\2\u0179\u017b"+
		"\5B\"\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017bE\3\2\2\2\u017c\u017d"+
		"\5J&\2\u017d\u017e\7A\2\2\u017e\u017f\5H%\2\u017fG\3\2\2\2\u0180\u0181"+
		"\7\6\2\2\u0181\u0182\5J&\2\u0182\u0183\7A\2\2\u0183\u0185\3\2\2\2\u0184"+
		"\u0180\3\2\2\2\u0184\u0185\3\2\2\2\u0185I\3\2\2\2\u0186\u0188\7<\2\2\u0187"+
		"\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188K\3\2\2\2\u0189\u018a\5R*\2\u018a"+
		"\u018b\5T+\2\u018bM\3\2\2\2\u018c\u018d\t\4\2\2\u018dO\3\2\2\2\u018e\u018f"+
		"\t\5\2\2\u018fQ\3\2\2\2\u0190\u0191\5V,\2\u0191\u0192\5X-\2\u0192S\3\2"+
		"\2\2\u0193\u0194\5P)\2\u0194\u0195\5R*\2\u0195\u0196\5T+\2\u0196\u0198"+
		"\3\2\2\2\u0197\u0193\3\2\2\2\u0197\u0198\3\2\2\2\u0198U\3\2\2\2\u0199"+
		"\u019a\5Z.\2\u019a\u019b\5`\61\2\u019bW\3\2\2\2\u019c\u019d\5N(\2\u019d"+
		"\u019e\5V,\2\u019e\u019f\5X-\2\u019f\u01a1\3\2\2\2\u01a0\u019c\3\2\2\2"+
		"\u01a0\u01a1\3\2\2\2\u01a1Y\3\2\2\2\u01a2\u01a3\5J&\2\u01a3\u01a4\5\\"+
		"/\2\u01a4\u01a7\3\2\2\2\u01a5\u01a7\5^\60\2\u01a6\u01a2\3\2\2\2\u01a6"+
		"\u01a5\3\2\2\2\u01a7[\3\2\2\2\u01a8\u01a9\7\t\2\2\u01a9\u01aa\7?\2\2\u01aa"+
		"\u01ab\5\22\n\2\u01ab\u01ac\5\24\13\2\u01ac\u01be\3\2\2\2\u01ad\u01ae"+
		"\7?\2\2\u01ae\u01af\5\22\n\2\u01af\u01b0\5\24\13\2\u01b0\u01be\3\2\2\2"+
		"\u01b1\u01b2\7?\2\2\u01b2\u01b3\7\17\2\2\u01b3\u01b4\5h\65\2\u01b4\u01b5"+
		"\5\66\34\2\u01b5\u01b6\7:\2\2\u01b6\u01be\3\2\2\2\u01b7\u01be\7A\2\2\u01b8"+
		"\u01be\7B\2\2\u01b9\u01ba\7\17\2\2\u01ba\u01bb\5h\65\2\u01bb\u01bc\7:"+
		"\2\2\u01bc\u01be\3\2\2\2\u01bd\u01a8\3\2\2\2\u01bd\u01ad\3\2\2\2\u01bd"+
		"\u01b1\3\2\2\2\u01bd\u01b7\3\2\2\2\u01bd\u01b8\3\2\2\2\u01bd\u01b9\3\2"+
		"\2\2\u01be]\3\2\2\2\u01bf\u01c0\7,\2\2\u01c0\u01c1\7?\2\2\u01c1\u01c2"+
		"\5\22\n\2\u01c2\u01c3\5\24\13\2\u01c3\u01c6\3\2\2\2\u01c4\u01c6\7@\2\2"+
		"\u01c5\u01bf\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6_\3\2\2\2\u01c7\u01c8\7"+
		"9\2\2\u01c8\u01c9\5Z.\2\u01c9\u01ca\5`\61\2\u01ca\u01cc\3\2\2\2\u01cb"+
		"\u01c7\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cca\3\2\2\2\u01cd\u01ce\5L\'\2\u01ce"+
		"\u01cf\5d\63\2\u01cfc\3\2\2\2\u01d0\u01d1\5f\64\2\u01d1\u01d2\5L\'\2\u01d2"+
		"\u01d4\3\2\2\2\u01d3\u01d0\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4e\3\2\2\2"+
		"\u01d5\u01d6\t\6\2\2\u01d6g\3\2\2\2\u01d7\u01d8\5l\67\2\u01d8\u01d9\5"+
		"n8\2\u01d9i\3\2\2\2\u01da\u01dc\7\13\2\2\u01db\u01da\3\2\2\2\u01db\u01dc"+
		"\3\2\2\2\u01dck\3\2\2\2\u01dd\u01de\5r:\2\u01de\u01df\5p9\2\u01dfm\3\2"+
		"\2\2\u01e0\u01e1\7\f\2\2\u01e1\u01e2\5l\67\2\u01e2\u01e3\5n8\2\u01e3\u01e5"+
		"\3\2\2\2\u01e4\u01e0\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5o\3\2\2\2\u01e6"+
		"\u01e7\7!\2\2\u01e7\u01e8\5r:\2\u01e8\u01e9\5p9\2\u01e9\u01eb\3\2\2\2"+
		"\u01ea\u01e6\3\2\2\2\u01ea\u01eb\3\2\2\2\u01ebq\3\2\2\2\u01ec\u01ed\5"+
		"j\66\2\u01ed\u01ee\5t;\2\u01ees\3\2\2\2\u01ef\u01f3\7\25\2\2\u01f0\u01f3"+
		"\7+\2\2\u01f1\u01f3\5b\62\2\u01f2\u01ef\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2"+
		"\u01f1\3\2\2\2\u01f3u\3\2\2\2\'~\u0083\u0095\u00a4\u00ae\u00b2\u00b9\u00bd"+
		"\u00c3\u00c9\u00cf\u00f5\u00f8\u0101\u0104\u0109\u0111\u0151\u0157\u015b"+
		"\u0166\u016b\u0173\u017a\u0184\u0187\u0197\u01a0\u01a6\u01bd\u01c5\u01cb"+
		"\u01d3\u01db\u01e4\u01ea\u01f2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}