// Generated from C:\Users\Usuario\Documents\GitHub\Compilers-2-assignment-1\src\grammar\LaGerador.g4 by ANTLR 4.1
package gerador;

    import infrastructure.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LaGeradorParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__58=1, T__57=2, T__56=3, T__55=4, T__54=5, T__53=6, T__52=7, T__51=8, 
		T__50=9, T__49=10, T__48=11, T__47=12, T__46=13, T__45=14, T__44=15, T__43=16, 
		T__42=17, T__41=18, T__40=19, T__39=20, T__38=21, T__37=22, T__36=23, 
		T__35=24, T__34=25, T__33=26, T__32=27, T__31=28, T__30=29, T__29=30, 
		T__28=31, T__27=32, T__26=33, T__25=34, T__24=35, T__23=36, T__22=37, 
		T__21=38, T__20=39, T__19=40, T__18=41, T__17=42, T__16=43, T__15=44, 
		T__14=45, T__13=46, T__12=47, T__11=48, T__10=49, T__9=50, T__8=51, T__7=52, 
		T__6=53, T__5=54, T__4=55, T__3=56, T__2=57, T__1=58, T__0=59, RETORNAR=60, 
		IDENT=61, CADEIA=62, NUM_INT=63, NUM_REAL=64, COMENTARIO=65, WS=66;
	public static final String[] tokenNames = {
		"<INVALID>", "'algoritmo'", "'constante'", "'..'", "'='", "'faca'", "'^'", 
		"'literal'", "'nao'", "'ou'", "'fim_algoritmo'", "'seja'", "'('", "'para'", 
		"'fim_caso'", "'entao'", "'declare'", "','", "'verdadeiro'", "'<-'", "'var'", 
		"'logico'", "'senao'", "'registro'", "'fim_procedimento'", "'>='", "'<'", 
		"']'", "'<>'", "'caso'", "'e'", "'enquanto'", "'+'", "'fim_para'", "'/'", 
		"'fim_registro'", "'fim_se'", "'ate'", "'<='", "'procedimento'", "'falso'", 
		"'&'", "'*'", "'.'", "'se'", "'):'", "'fim_enquanto'", "'fim_funcao'", 
		"'inteiro'", "':'", "'['", "'>'", "'escreva'", "'tipo'", "'%'", "')'", 
		"'funcao'", "'-'", "'leia'", "'real'", "'retorne'", "IDENT", "CADEIA", 
		"NUM_INT", "NUM_REAL", "COMENTARIO", "WS"
	};
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_declaracao_local = 3, 
		RULE_variavel = 4, RULE_identificador = 5, RULE_ponteiros_opcionais = 6, 
		RULE_outros_ident = 7, RULE_dimensao = 8, RULE_tipo = 9, RULE_tipo_estendido = 10, 
		RULE_mais_ident = 11, RULE_tipo_basico = 12, RULE_tipo_basico_ident = 13, 
		RULE_valor_constante = 14, RULE_registro = 15, RULE_declaracao_global = 16, 
		RULE_parametros_opcional = 17, RULE_parametro = 18, RULE_var_opcional = 19, 
		RULE_declaracoes_locais = 20, RULE_corpo = 21, RULE_comandos = 22, RULE_cmd = 23, 
		RULE_mais_expressao = 24, RULE_senao_opcional = 25, RULE_chamada_atribuicao = 26, 
		RULE_argumentos_opcional = 27, RULE_selecao = 28, RULE_mais_selecao = 29, 
		RULE_constantes = 30, RULE_mais_constantes = 31, RULE_numero_intervalo = 32, 
		RULE_intervalo_opcional = 33, RULE_op_unario = 34, RULE_exp_aritmetica = 35, 
		RULE_op_multiplicacao = 36, RULE_op_adicao = 37, RULE_termo = 38, RULE_fator = 39, 
		RULE_parcela = 40, RULE_parcela_unario = 41, RULE_parcela_nao_unario = 42, 
		RULE_op_opcional = 43, RULE_op_relacional = 44, RULE_expressao = 45, RULE_termo_logico = 46, 
		RULE_fator_logico = 47, RULE_op_nao = 48, RULE_parcela_logica = 49, RULE_exp_relacional = 50;
	public static final String[] ruleNames = {
		"programa", "declaracoes", "decl_local_global", "declaracao_local", "variavel", 
		"identificador", "ponteiros_opcionais", "outros_ident", "dimensao", "tipo", 
		"tipo_estendido", "mais_ident", "tipo_basico", "tipo_basico_ident", "valor_constante", 
		"registro", "declaracao_global", "parametros_opcional", "parametro", "var_opcional", 
		"declaracoes_locais", "corpo", "comandos", "cmd", "mais_expressao", "senao_opcional", 
		"chamada_atribuicao", "argumentos_opcional", "selecao", "mais_selecao", 
		"constantes", "mais_constantes", "numero_intervalo", "intervalo_opcional", 
		"op_unario", "exp_aritmetica", "op_multiplicacao", "op_adicao", "termo", 
		"fator", "parcela", "parcela_unario", "parcela_nao_unario", "op_opcional", 
		"op_relacional", "expressao", "termo_logico", "fator_logico", "op_nao", 
		"parcela_logica", "exp_relacional"
	};

	@Override
	public String getGrammarFileName() { return "LaGerador.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	    PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();

	public LaGeradorParser(TokenStream input) {
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
			 pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global")); 
			setState(103); declaracoes();

			         Gerador.addText("#include <stdio.h>\n#include <stdlib.h>\n\nint main {\n");
			      
			setState(105); match(1);
			setState(106); corpo();
			setState(107); match(10);
			 
			         Gerador.addText("return 0;\n}");
			         pilhaDeTabelas.desempilhar();
			      
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
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 16) | (1L << 39) | (1L << 53) | (1L << 56))) != 0)) {
				{
				{
				setState(110); decl_local_global();
				}
				}
				setState(115);
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
			setState(118);
			switch (_input.LA(1)) {
			case 2:
			case 16:
			case 53:
				enterOuterAlt(_localctx, 1);
				{
				setState(116); declaracao_local();
				}
				break;
			case 39:
			case 56:
				enterOuterAlt(_localctx, 2);
				{
				setState(117); declaracao_global();
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
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaGeradorParser.IDENT, 0); }
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
			setState(133);
			switch (_input.LA(1)) {
			case 16:
				enterOuterAlt(_localctx, 1);
				{
				setState(120); match(16);
				setState(121); variavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122); match(2);
				setState(123); match(IDENT);
				setState(124); match(49);
				setState(125); tipo_basico();
				setState(126); match(4);
				setState(127); valor_constante();
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 3);
				{
				setState(129); match(53);
				setState(130); match(IDENT);
				setState(131); match(49);
				setState(132); tipo();
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
		public Token IDENT;
		public TipoContext tipo;
		public DimensaoContext dimensao(int i) {
			return getRuleContext(DimensaoContext.class,i);
		}
		public List<DimensaoContext> dimensao() {
			return getRuleContexts(DimensaoContext.class);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT(int i) {
			return getToken(LaGeradorParser.IDENT, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(LaGeradorParser.IDENT); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); ((VariavelContext)_localctx).IDENT = match(IDENT);
			   // Stores a list of consumed identifiers
			       List<String> declared = new ArrayList<>();
			       declared.add(((VariavelContext)_localctx).IDENT.getText().toLowerCase());
			    
			setState(137); dimensao();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==17) {
				{
				{
				setState(138); match(17);
				setState(139); ((VariavelContext)_localctx).IDENT = match(IDENT);
				 declared.add(((VariavelContext)_localctx).IDENT.getText().toLowerCase()); 
				setState(141); dimensao();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147); match(49);
			setState(148); ((VariavelContext)_localctx).tipo = tipo();

			       for (String current : declared) {
			          if (((VariavelContext)_localctx).tipo.type == null) {
			             continue;
			          } else if (((VariavelContext)_localctx).tipo.type.equals("inteiro"))
			             Gerador.addText("int " + current + ";\n");
			          else if (((VariavelContext)_localctx).tipo.type.equals("real"))
			             Gerador.addText("float " + current + ";\n");
			          else if (((VariavelContext)_localctx).tipo.type.equals("literal"))
			             Gerador.addText("char " + current + ";\n");
			          else if (((VariavelContext)_localctx).tipo.type.equals("logico"))
			             Gerador.addText("int " + current + ";\n");
			       }
			       for (String current : declared) {
			          pilhaDeTabelas.topo().adicionarSimbolo(current, "variavel", ((VariavelContext)_localctx).tipo.type);
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
		public String name;
		public int line;
		public Token IDENT;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public TerminalNode IDENT(int i) {
			return getToken(LaGeradorParser.IDENT, i);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(LaGeradorParser.IDENT); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identificador);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151); ponteiros_opcionais();
			setState(152); ((IdentificadorContext)_localctx).IDENT = match(IDENT);
			 ((IdentificadorContext)_localctx).name =  ((IdentificadorContext)_localctx).IDENT.getText(); ((IdentificadorContext)_localctx).line =  ((IdentificadorContext)_localctx).IDENT.getLine(); 
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(154); match(43);
					setState(155); ((IdentificadorContext)_localctx).IDENT = match(IDENT);
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(161); dimensao();
			setState(162); outros_ident();
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
		public Ponteiros_opcionaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponteiros_opcionais; }
	}

	public final Ponteiros_opcionaisContext ponteiros_opcionais() throws RecognitionException {
		Ponteiros_opcionaisContext _localctx = new Ponteiros_opcionaisContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ponteiros_opcionais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==6) {
				{
				{
				setState(164); match(6);
				}
				}
				setState(169);
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
		enterRule(_localctx, 14, RULE_outros_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if (_la==43) {
				{
				setState(170); match(43);
				setState(171); identificador();
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
		enterRule(_localctx, 16, RULE_dimensao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(174); match(50);
				setState(175); exp_aritmetica();
				setState(176); match(27);
				setState(177); dimensao();
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
		public String type;
		public Tipo_estendidoContext tipo_estendido;
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
		enterRule(_localctx, 18, RULE_tipo);
		try {
			setState(187);
			switch (_input.LA(1)) {
			case 23:
				enterOuterAlt(_localctx, 1);
				{
				setState(181); registro();
				 ((TipoContext)_localctx).type =  "registro";               
				}
				break;
			case 6:
			case 7:
			case 21:
			case 48:
			case 59:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(184); ((TipoContext)_localctx).tipo_estendido = tipo_estendido();
				 ((TipoContext)_localctx).type =  ((TipoContext)_localctx).tipo_estendido.type; 
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
		public String type;
		public Tipo_basico_identContext tipo_basico_ident;
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
		enterRule(_localctx, 20, RULE_tipo_estendido);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); ponteiros_opcionais();
			setState(190); ((Tipo_estendidoContext)_localctx).tipo_basico_ident = tipo_basico_ident();
			 ((Tipo_estendidoContext)_localctx).type =  ((Tipo_estendidoContext)_localctx).tipo_basico_ident.type; 
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
		public List<String> identifiers;
		public IdentificadorContext identificador;
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
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
			 ((Mais_identContext)_localctx).identifiers =  new ArrayList<>(); 
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==17) {
				{
				{
				setState(194); match(17);
				setState(195); ((Mais_identContext)_localctx).identificador = identificador();
				 _localctx.identifiers.add(((Mais_identContext)_localctx).identificador.name); 
				}
				}
				setState(202);
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

	public static class Tipo_basicoContext extends ParserRuleContext {
		public String type;
		public int linha;
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipo_basico);
		try {
			setState(211);
			switch (_input.LA(1)) {
			case 7:
				enterOuterAlt(_localctx, 1);
				{
				setState(203); match(7);
				 ((Tipo_basicoContext)_localctx).type =  "literal"; 
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 2);
				{
				setState(205); match(48);
				 ((Tipo_basicoContext)_localctx).type =  "inteiro"; 
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 3);
				{
				setState(207); match(59);
				 ((Tipo_basicoContext)_localctx).type =  "real";    
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 4);
				{
				setState(209); match(21);
				 ((Tipo_basicoContext)_localctx).type =  "logico";  
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

	public static class Tipo_basico_identContext extends ParserRuleContext {
		public String type;
		public Tipo_basicoContext tipo_basico;
		public TerminalNode IDENT() { return getToken(LaGeradorParser.IDENT, 0); }
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
		enterRule(_localctx, 26, RULE_tipo_basico_ident);
		try {
			setState(217);
			switch (_input.LA(1)) {
			case 7:
			case 21:
			case 48:
			case 59:
				enterOuterAlt(_localctx, 1);
				{
				setState(213); ((Tipo_basico_identContext)_localctx).tipo_basico = tipo_basico();
				 ((Tipo_basico_identContext)_localctx).type =  ((Tipo_basico_identContext)_localctx).tipo_basico.type; 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(216); match(IDENT);
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

	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode NUM_REAL() { return getToken(LaGeradorParser.NUM_REAL, 0); }
		public TerminalNode CADEIA() { return getToken(LaGeradorParser.CADEIA, 0); }
		public TerminalNode NUM_INT() { return getToken(LaGeradorParser.NUM_INT, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !(((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (18 - 18)) | (1L << (40 - 18)) | (1L << (CADEIA - 18)) | (1L << (NUM_INT - 18)) | (1L << (NUM_REAL - 18)))) != 0)) ) {
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
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); match(23);
			setState(223); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(222); variavel();
				}
				}
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			setState(227); match(35);
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
		public TerminalNode IDENT() { return getToken(LaGeradorParser.IDENT, 0); }
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declaracao_global);
		try {
			setState(248);
			switch (_input.LA(1)) {
			case 39:
				enterOuterAlt(_localctx, 1);
				{
				setState(229); match(39);
				setState(230); match(IDENT);
				setState(231); match(12);
				setState(232); parametros_opcional();
				setState(233); match(55);
				setState(234); declaracoes_locais();
				setState(235); comandos();
				setState(236); match(24);
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 2);
				{
				setState(238); match(56);
				setState(239); match(IDENT);
				setState(240); match(12);
				setState(241); parametros_opcional();
				setState(242); match(45);
				setState(243); tipo_estendido();
				setState(244); declaracoes_locais();
				setState(245); comandos();
				setState(246); match(47);
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
		enterRule(_localctx, 34, RULE_parametros_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 20) | (1L << IDENT))) != 0)) {
				{
				setState(250); parametro();
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
		enterRule(_localctx, 36, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); var_opcional();
			setState(254); identificador();
			setState(255); mais_ident();
			setState(256); match(49);
			setState(257); tipo_estendido();
			setState(260);
			_la = _input.LA(1);
			if (_la==17) {
				{
				setState(258); match(17);
				setState(259); parametro();
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
		enterRule(_localctx, 38, RULE_var_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if (_la==20) {
				{
				setState(262); match(20);
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
		enterRule(_localctx, 40, RULE_declaracoes_locais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 16) | (1L << 53))) != 0)) {
				{
				setState(265); declaracao_local();
				setState(266); declaracoes_locais();
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
		enterRule(_localctx, 42, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); declaracoes_locais();
			setState(271); comandos();
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
		enterRule(_localctx, 44, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 6) | (1L << 13) | (1L << 29) | (1L << 31) | (1L << 44) | (1L << 52) | (1L << 58) | (1L << RETORNAR) | (1L << IDENT))) != 0)) {
				{
				setState(273); cmd();
				setState(274); comandos();
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
		public TerminalNode IDENT() { return getToken(LaGeradorParser.IDENT, 0); }
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
		public TerminalNode RETORNAR() { return getToken(LaGeradorParser.RETORNAR, 0); }
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
		enterRule(_localctx, 46, RULE_cmd);
		try {
			setState(338);
			switch (_input.LA(1)) {
			case 58:
				enterOuterAlt(_localctx, 1);
				{
				setState(278); match(58);
				setState(279); match(12);
				setState(280); ((CmdContext)_localctx).identificador = identificador();
				setState(281); mais_ident();

				        String variavel = ((CmdContext)_localctx).identificador.name;
				        String tipo2 = pilhaDeTabelas.retornaTipo(variavel);
				        if (tipo2.equals("inteiro"))
				           Gerador.addText("scanf(\"%d\",&"+variavel+");\n");
				        else if (tipo2.equals("real"))
				           Gerador.addText("scanf(\"%f\",&"+variavel+");\n");
				        else if (tipo2.equals("literal"))
				           Gerador.addText("scanf(\"%s\",&"+variavel+");\n");
				        else if (tipo2.equals("logico"))
				           Gerador.addText("scanf(\"%d\",&"+variavel+");\n");
				    
				setState(283); match(55);
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 2);
				{
				setState(285); match(52);
				setState(286); match(12);
				setState(287); expressao();
				setState(288); mais_expressao();
				setState(289); match(55);

				         String nome = Gerador.getNome();
				         String tipo = Gerador.getTipo();
				         if (nome != null && tipo != null)
				           if (tipo.equals("inteiro"))
				             Gerador.addText("printf(\"%d\"," + nome + ");\n");
				           else if (tipo.equals("real"))
				             Gerador.addText("printf(\"%f\"," + nome + ");\n");
				           else if (tipo.equals("literal"))
				             Gerador.addText("printf(\"%s\"," + nome + ");\n");
				           else 
				             Gerador.addText("vazio;\n");
				      
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 3);
				{
				setState(292); match(44);
				setState(293); expressao();
				setState(294); match(15);
				setState(295); comandos();
				setState(296); senao_opcional();
				setState(297); match(36);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 4);
				{
				setState(299); match(29);
				setState(300); exp_aritmetica();
				setState(301); match(11);
				setState(302); selecao();
				setState(303); senao_opcional();
				setState(304); match(14);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 5);
				{
				setState(306); match(13);
				setState(307); match(IDENT);
				setState(308); match(19);
				setState(309); exp_aritmetica();
				setState(310); match(37);
				setState(311); exp_aritmetica();
				setState(312); match(5);
				setState(313); comandos();
				setState(314); match(33);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 6);
				{
				setState(316); match(31);
				setState(317); expressao();
				setState(318); match(5);
				setState(319); comandos();
				setState(320); match(46);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 7);
				{
				setState(322); match(5);
				setState(323); comandos();
				setState(324); match(37);
				setState(325); expressao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 8);
				{
				setState(327); match(6);
				setState(328); match(IDENT);
				setState(329); outros_ident();
				setState(330); dimensao();
				setState(331); match(19);
				setState(332); expressao();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(334); match(IDENT);
				setState(335); chamada_atribuicao();
				}
				break;
			case RETORNAR:
				enterOuterAlt(_localctx, 10);
				{
				setState(336); match(RETORNAR);
				setState(337); expressao();
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
		enterRule(_localctx, 48, RULE_mais_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_la = _input.LA(1);
			if (_la==17) {
				{
				setState(340); match(17);
				setState(341); expressao();
				setState(342); mais_expressao();
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
		enterRule(_localctx, 50, RULE_senao_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_la = _input.LA(1);
			if (_la==22) {
				{
				setState(346); match(22);
				setState(347); comandos();
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
		enterRule(_localctx, 52, RULE_chamada_atribuicao);
		try {
			setState(359);
			switch (_input.LA(1)) {
			case 12:
				enterOuterAlt(_localctx, 1);
				{
				setState(350); match(12);
				setState(351); argumentos_opcional();
				setState(352); match(55);
				}
				break;
			case 19:
			case 43:
			case 50:
				enterOuterAlt(_localctx, 2);
				{
				setState(354); outros_ident();
				setState(355); dimensao();
				setState(356); match(19);
				setState(357); expressao();
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
		enterRule(_localctx, 54, RULE_argumentos_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (6 - 6)) | (1L << (8 - 6)) | (1L << (12 - 6)) | (1L << (18 - 6)) | (1L << (40 - 6)) | (1L << (41 - 6)) | (1L << (57 - 6)) | (1L << (IDENT - 6)) | (1L << (CADEIA - 6)) | (1L << (NUM_INT - 6)) | (1L << (NUM_REAL - 6)))) != 0)) {
				{
				setState(361); expressao();
				setState(362); mais_expressao();
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
		enterRule(_localctx, 56, RULE_selecao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366); constantes();
			setState(367); match(49);
			setState(368); comandos();
			setState(369); mais_selecao();
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
		enterRule(_localctx, 58, RULE_mais_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_la = _input.LA(1);
			if (_la==57 || _la==NUM_INT) {
				{
				setState(371); selecao();
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
		enterRule(_localctx, 60, RULE_constantes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374); numero_intervalo();
			setState(375); mais_constantes();
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
		enterRule(_localctx, 62, RULE_mais_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_la = _input.LA(1);
			if (_la==17) {
				{
				setState(377); match(17);
				setState(378); constantes();
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
		public TerminalNode NUM_INT() { return getToken(LaGeradorParser.NUM_INT, 0); }
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_numero_intervalo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381); op_unario();
			setState(382); match(NUM_INT);
			setState(383); intervalo_opcional();
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
		public TerminalNode NUM_INT() { return getToken(LaGeradorParser.NUM_INT, 0); }
		public Intervalo_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalo_opcional; }
	}

	public final Intervalo_opcionalContext intervalo_opcional() throws RecognitionException {
		Intervalo_opcionalContext _localctx = new Intervalo_opcionalContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_intervalo_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_la = _input.LA(1);
			if (_la==3) {
				{
				setState(385); match(3);
				setState(386); op_unario();
				setState(387); match(NUM_INT);
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
		enterRule(_localctx, 68, RULE_op_unario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_la = _input.LA(1);
			if (_la==57) {
				{
				setState(391); match(57);
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
		public Op_adicaoContext op_adicao(int i) {
			return getRuleContext(Op_adicaoContext.class,i);
		}
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Op_adicaoContext> op_adicao() {
			return getRuleContexts(Op_adicaoContext.class);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_exp_aritmetica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(394); termo();
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(395); op_adicao();
					setState(396); termo();
					}
					} 
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class Op_multiplicacaoContext extends ParserRuleContext {
		public Op_multiplicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_multiplicacao; }
	}

	public final Op_multiplicacaoContext op_multiplicacao() throws RecognitionException {
		Op_multiplicacaoContext _localctx = new Op_multiplicacaoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_op_multiplicacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_la = _input.LA(1);
			if ( !(_la==34 || _la==42) ) {
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
		enterRule(_localctx, 74, RULE_op_adicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_la = _input.LA(1);
			if ( !(_la==32 || _la==57) ) {
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
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public List<Op_multiplicacaoContext> op_multiplicacao() {
			return getRuleContexts(Op_multiplicacaoContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public Op_multiplicacaoContext op_multiplicacao(int i) {
			return getRuleContext(Op_multiplicacaoContext.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407); fator();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==34 || _la==42) {
				{
				{
				setState(408); op_multiplicacao();
				setState(409); fator();
				}
				}
				setState(415);
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

	public static class FatorContext extends ParserRuleContext {
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416); parcela();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==54) {
				{
				{
				setState(417); match(54);
				setState(418); parcela();
				}
				}
				setState(423);
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
		enterRule(_localctx, 80, RULE_parcela);
		try {
			setState(428);
			switch (_input.LA(1)) {
			case 6:
			case 12:
			case 57:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(424); op_unario();
				setState(425); parcela_unario();
				}
				break;
			case 41:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(427); parcela_nao_unario();
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
		public Token IDENT;
		public TerminalNode NUM_REAL() { return getToken(LaGeradorParser.NUM_REAL, 0); }
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
		public TerminalNode NUM_INT() { return getToken(LaGeradorParser.NUM_INT, 0); }
		public TerminalNode IDENT() { return getToken(LaGeradorParser.IDENT, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parcela_unario);
		try {
			setState(452);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430); match(6);
				setState(431); match(IDENT);
				setState(432); outros_ident();
				setState(433); dimensao();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435); ((Parcela_unarioContext)_localctx).IDENT = match(IDENT);

				         Gerador.addTipo(pilhaDeTabelas.retornaTipo(((Parcela_unarioContext)_localctx).IDENT.getText()));
				         Gerador.addNome(((Parcela_unarioContext)_localctx).IDENT.getText());
				      
				setState(437); outros_ident();
				setState(438); dimensao();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(440); match(IDENT);
				setState(441); match(12);
				setState(442); expressao();
				setState(443); mais_expressao();
				setState(444); match(55);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(446); match(NUM_INT);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(447); match(NUM_REAL);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(448); match(12);
				setState(449); expressao();
				setState(450); match(55);
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
		public TerminalNode CADEIA() { return getToken(LaGeradorParser.CADEIA, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaGeradorParser.IDENT, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_parcela_nao_unario);
		try {
			setState(460);
			switch (_input.LA(1)) {
			case 41:
				enterOuterAlt(_localctx, 1);
				{
				setState(454); match(41);
				setState(455); match(IDENT);
				setState(456); outros_ident();
				setState(457); dimensao();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(459); match(CADEIA);
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
		enterRule(_localctx, 86, RULE_op_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 25) | (1L << 26) | (1L << 28) | (1L << 38) | (1L << 51))) != 0)) {
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
		enterRule(_localctx, 88, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 25) | (1L << 26) | (1L << 28) | (1L << 38) | (1L << 51))) != 0)) ) {
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
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469); termo_logico();
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==9) {
				{
				{
				setState(470); match(9);
				setState(471); termo_logico();
				}
				}
				setState(476);
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

	public static class Termo_logicoContext extends ParserRuleContext {
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_termo_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477); fator_logico();
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==30) {
				{
				{
				setState(478); match(30);
				setState(479); fator_logico();
				}
				}
				setState(484);
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
		enterRule(_localctx, 94, RULE_fator_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485); op_nao();
			setState(486); parcela_logica();
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
		enterRule(_localctx, 96, RULE_op_nao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			_la = _input.LA(1);
			if (_la==8) {
				{
				setState(488); match(8);
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
		enterRule(_localctx, 98, RULE_parcela_logica);
		try {
			setState(494);
			switch (_input.LA(1)) {
			case 18:
				enterOuterAlt(_localctx, 1);
				{
				setState(491); match(18);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 2);
				{
				setState(492); match(40);
				}
				break;
			case 6:
			case 12:
			case 41:
			case 57:
			case IDENT:
			case CADEIA:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(493); exp_relacional();
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
		enterRule(_localctx, 100, RULE_exp_relacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496); exp_aritmetica();
			setState(497); op_opcional();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3D\u01f6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7\3r\n\3\f\3\16\3u\13\3\3\4\3"+
		"\4\5\4y\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0088"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0091\n\6\f\6\16\6\u0094\13\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7\u009f\n\7\f\7\16\7\u00a2\13\7\3\7"+
		"\3\7\3\7\3\b\7\b\u00a8\n\b\f\b\16\b\u00ab\13\b\3\t\3\t\5\t\u00af\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u00b6\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00be"+
		"\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r\u00c9\n\r\f\r\16\r\u00cc"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00d6\n\16\3\17\3\17"+
		"\3\17\3\17\5\17\u00dc\n\17\3\20\3\20\3\21\3\21\6\21\u00e2\n\21\r\21\16"+
		"\21\u00e3\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00fb\n\22\3\23\5\23"+
		"\u00fe\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0107\n\24\3\25\5"+
		"\25\u010a\n\25\3\26\3\26\3\26\5\26\u010f\n\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\5\30\u0117\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0155\n\31\3\32\3\32\3\32"+
		"\3\32\5\32\u015b\n\32\3\33\3\33\5\33\u015f\n\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\5\34\u016a\n\34\3\35\3\35\3\35\5\35\u016f\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\5\37\u0177\n\37\3 \3 \3 \3!\3!\5!\u017e"+
		"\n!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\5#\u0188\n#\3$\5$\u018b\n$\3%\3%\3%\3"+
		"%\7%\u0191\n%\f%\16%\u0194\13%\3&\3&\3\'\3\'\3(\3(\3(\3(\7(\u019e\n(\f"+
		"(\16(\u01a1\13(\3)\3)\3)\7)\u01a6\n)\f)\16)\u01a9\13)\3*\3*\3*\3*\5*\u01af"+
		"\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\5+\u01c7\n+\3,\3,\3,\3,\3,\3,\5,\u01cf\n,\3-\3-\3-\5-\u01d4\n-\3.\3."+
		"\3/\3/\3/\7/\u01db\n/\f/\16/\u01de\13/\3\60\3\60\3\60\7\60\u01e3\n\60"+
		"\f\60\16\60\u01e6\13\60\3\61\3\61\3\61\3\62\5\62\u01ec\n\62\3\63\3\63"+
		"\3\63\5\63\u01f1\n\63\3\64\3\64\3\64\3\64\2\65\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdf\2\6\5\2"+
		"\24\24**@B\4\2$$,,\4\2\"\";;\7\2\6\6\33\34\36\36((\65\65\u01f9\2h\3\2"+
		"\2\2\4s\3\2\2\2\6x\3\2\2\2\b\u0087\3\2\2\2\n\u0089\3\2\2\2\f\u0099\3\2"+
		"\2\2\16\u00a9\3\2\2\2\20\u00ae\3\2\2\2\22\u00b5\3\2\2\2\24\u00bd\3\2\2"+
		"\2\26\u00bf\3\2\2\2\30\u00c3\3\2\2\2\32\u00d5\3\2\2\2\34\u00db\3\2\2\2"+
		"\36\u00dd\3\2\2\2 \u00df\3\2\2\2\"\u00fa\3\2\2\2$\u00fd\3\2\2\2&\u00ff"+
		"\3\2\2\2(\u0109\3\2\2\2*\u010e\3\2\2\2,\u0110\3\2\2\2.\u0116\3\2\2\2\60"+
		"\u0154\3\2\2\2\62\u015a\3\2\2\2\64\u015e\3\2\2\2\66\u0169\3\2\2\28\u016e"+
		"\3\2\2\2:\u0170\3\2\2\2<\u0176\3\2\2\2>\u0178\3\2\2\2@\u017d\3\2\2\2B"+
		"\u017f\3\2\2\2D\u0187\3\2\2\2F\u018a\3\2\2\2H\u018c\3\2\2\2J\u0195\3\2"+
		"\2\2L\u0197\3\2\2\2N\u0199\3\2\2\2P\u01a2\3\2\2\2R\u01ae\3\2\2\2T\u01c6"+
		"\3\2\2\2V\u01ce\3\2\2\2X\u01d3\3\2\2\2Z\u01d5\3\2\2\2\\\u01d7\3\2\2\2"+
		"^\u01df\3\2\2\2`\u01e7\3\2\2\2b\u01eb\3\2\2\2d\u01f0\3\2\2\2f\u01f2\3"+
		"\2\2\2hi\b\2\1\2ij\5\4\3\2jk\b\2\1\2kl\7\3\2\2lm\5,\27\2mn\7\f\2\2no\b"+
		"\2\1\2o\3\3\2\2\2pr\5\6\4\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\5"+
		"\3\2\2\2us\3\2\2\2vy\5\b\5\2wy\5\"\22\2xv\3\2\2\2xw\3\2\2\2y\7\3\2\2\2"+
		"z{\7\22\2\2{\u0088\5\n\6\2|}\7\4\2\2}~\7?\2\2~\177\7\63\2\2\177\u0080"+
		"\5\32\16\2\u0080\u0081\7\6\2\2\u0081\u0082\5\36\20\2\u0082\u0088\3\2\2"+
		"\2\u0083\u0084\7\67\2\2\u0084\u0085\7?\2\2\u0085\u0086\7\63\2\2\u0086"+
		"\u0088\5\24\13\2\u0087z\3\2\2\2\u0087|\3\2\2\2\u0087\u0083\3\2\2\2\u0088"+
		"\t\3\2\2\2\u0089\u008a\7?\2\2\u008a\u008b\b\6\1\2\u008b\u0092\5\22\n\2"+
		"\u008c\u008d\7\23\2\2\u008d\u008e\7?\2\2\u008e\u008f\b\6\1\2\u008f\u0091"+
		"\5\22\n\2\u0090\u008c\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2"+
		"\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096"+
		"\7\63\2\2\u0096\u0097\5\24\13\2\u0097\u0098\b\6\1\2\u0098\13\3\2\2\2\u0099"+
		"\u009a\5\16\b\2\u009a\u009b\7?\2\2\u009b\u00a0\b\7\1\2\u009c\u009d\7-"+
		"\2\2\u009d\u009f\7?\2\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a4\5\22\n\2\u00a4\u00a5\5\20\t\2\u00a5\r\3\2\2\2\u00a6\u00a8"+
		"\7\b\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\17\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7-\2\2"+
		"\u00ad\u00af\5\f\7\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\21"+
		"\3\2\2\2\u00b0\u00b1\7\64\2\2\u00b1\u00b2\5H%\2\u00b2\u00b3\7\35\2\2\u00b3"+
		"\u00b4\5\22\n\2\u00b4\u00b6\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b6\3"+
		"\2\2\2\u00b6\23\3\2\2\2\u00b7\u00b8\5 \21\2\u00b8\u00b9\b\13\1\2\u00b9"+
		"\u00be\3\2\2\2\u00ba\u00bb\5\26\f\2\u00bb\u00bc\b\13\1\2\u00bc\u00be\3"+
		"\2\2\2\u00bd\u00b7\3\2\2\2\u00bd\u00ba\3\2\2\2\u00be\25\3\2\2\2\u00bf"+
		"\u00c0\5\16\b\2\u00c0\u00c1\5\34\17\2\u00c1\u00c2\b\f\1\2\u00c2\27\3\2"+
		"\2\2\u00c3\u00ca\b\r\1\2\u00c4\u00c5\7\23\2\2\u00c5\u00c6\5\f\7\2\u00c6"+
		"\u00c7\b\r\1\2\u00c7\u00c9\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9\u00cc\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\31\3\2\2\2\u00cc\u00ca"+
		"\3\2\2\2\u00cd\u00ce\7\t\2\2\u00ce\u00d6\b\16\1\2\u00cf\u00d0\7\62\2\2"+
		"\u00d0\u00d6\b\16\1\2\u00d1\u00d2\7=\2\2\u00d2\u00d6\b\16\1\2\u00d3\u00d4"+
		"\7\27\2\2\u00d4\u00d6\b\16\1\2\u00d5\u00cd\3\2\2\2\u00d5\u00cf\3\2\2\2"+
		"\u00d5\u00d1\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\33\3\2\2\2\u00d7\u00d8"+
		"\5\32\16\2\u00d8\u00d9\b\17\1\2\u00d9\u00dc\3\2\2\2\u00da\u00dc\7?\2\2"+
		"\u00db\u00d7\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\35\3\2\2\2\u00dd\u00de"+
		"\t\2\2\2\u00de\37\3\2\2\2\u00df\u00e1\7\31\2\2\u00e0\u00e2\5\n\6\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7%\2\2\u00e6!\3\2\2\2\u00e7\u00e8"+
		"\7)\2\2\u00e8\u00e9\7?\2\2\u00e9\u00ea\7\16\2\2\u00ea\u00eb\5$\23\2\u00eb"+
		"\u00ec\79\2\2\u00ec\u00ed\5*\26\2\u00ed\u00ee\5.\30\2\u00ee\u00ef\7\32"+
		"\2\2\u00ef\u00fb\3\2\2\2\u00f0\u00f1\7:\2\2\u00f1\u00f2\7?\2\2\u00f2\u00f3"+
		"\7\16\2\2\u00f3\u00f4\5$\23\2\u00f4\u00f5\7/\2\2\u00f5\u00f6\5\26\f\2"+
		"\u00f6\u00f7\5*\26\2\u00f7\u00f8\5.\30\2\u00f8\u00f9\7\61\2\2\u00f9\u00fb"+
		"\3\2\2\2\u00fa\u00e7\3\2\2\2\u00fa\u00f0\3\2\2\2\u00fb#\3\2\2\2\u00fc"+
		"\u00fe\5&\24\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe%\3\2\2\2"+
		"\u00ff\u0100\5(\25\2\u0100\u0101\5\f\7\2\u0101\u0102\5\30\r\2\u0102\u0103"+
		"\7\63\2\2\u0103\u0106\5\26\f\2\u0104\u0105\7\23\2\2\u0105\u0107\5&\24"+
		"\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\'\3\2\2\2\u0108\u010a"+
		"\7\26\2\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a)\3\2\2\2\u010b"+
		"\u010c\5\b\5\2\u010c\u010d\5*\26\2\u010d\u010f\3\2\2\2\u010e\u010b\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f+\3\2\2\2\u0110\u0111\5*\26\2\u0111\u0112"+
		"\5.\30\2\u0112-\3\2\2\2\u0113\u0114\5\60\31\2\u0114\u0115\5.\30\2\u0115"+
		"\u0117\3\2\2\2\u0116\u0113\3\2\2\2\u0116\u0117\3\2\2\2\u0117/\3\2\2\2"+
		"\u0118\u0119\7<\2\2\u0119\u011a\7\16\2\2\u011a\u011b\5\f\7\2\u011b\u011c"+
		"\5\30\r\2\u011c\u011d\b\31\1\2\u011d\u011e\79\2\2\u011e\u0155\3\2\2\2"+
		"\u011f\u0120\7\66\2\2\u0120\u0121\7\16\2\2\u0121\u0122\5\\/\2\u0122\u0123"+
		"\5\62\32\2\u0123\u0124\79\2\2\u0124\u0125\b\31\1\2\u0125\u0155\3\2\2\2"+
		"\u0126\u0127\7.\2\2\u0127\u0128\5\\/\2\u0128\u0129\7\21\2\2\u0129\u012a"+
		"\5.\30\2\u012a\u012b\5\64\33\2\u012b\u012c\7&\2\2\u012c\u0155\3\2\2\2"+
		"\u012d\u012e\7\37\2\2\u012e\u012f\5H%\2\u012f\u0130\7\r\2\2\u0130\u0131"+
		"\5:\36\2\u0131\u0132\5\64\33\2\u0132\u0133\7\20\2\2\u0133\u0155\3\2\2"+
		"\2\u0134\u0135\7\17\2\2\u0135\u0136\7?\2\2\u0136\u0137\7\25\2\2\u0137"+
		"\u0138\5H%\2\u0138\u0139\7\'\2\2\u0139\u013a\5H%\2\u013a\u013b\7\7\2\2"+
		"\u013b\u013c\5.\30\2\u013c\u013d\7#\2\2\u013d\u0155\3\2\2\2\u013e\u013f"+
		"\7!\2\2\u013f\u0140\5\\/\2\u0140\u0141\7\7\2\2\u0141\u0142\5.\30\2\u0142"+
		"\u0143\7\60\2\2\u0143\u0155\3\2\2\2\u0144\u0145\7\7\2\2\u0145\u0146\5"+
		".\30\2\u0146\u0147\7\'\2\2\u0147\u0148\5\\/\2\u0148\u0155\3\2\2\2\u0149"+
		"\u014a\7\b\2\2\u014a\u014b\7?\2\2\u014b\u014c\5\20\t\2\u014c\u014d\5\22"+
		"\n\2\u014d\u014e\7\25\2\2\u014e\u014f\5\\/\2\u014f\u0155\3\2\2\2\u0150"+
		"\u0151\7?\2\2\u0151\u0155\5\66\34\2\u0152\u0153\7>\2\2\u0153\u0155\5\\"+
		"/\2\u0154\u0118\3\2\2\2\u0154\u011f\3\2\2\2\u0154\u0126\3\2\2\2\u0154"+
		"\u012d\3\2\2\2\u0154\u0134\3\2\2\2\u0154\u013e\3\2\2\2\u0154\u0144\3\2"+
		"\2\2\u0154\u0149\3\2\2\2\u0154\u0150\3\2\2\2\u0154\u0152\3\2\2\2\u0155"+
		"\61\3\2\2\2\u0156\u0157\7\23\2\2\u0157\u0158\5\\/\2\u0158\u0159\5\62\32"+
		"\2\u0159\u015b\3\2\2\2\u015a\u0156\3\2\2\2\u015a\u015b\3\2\2\2\u015b\63"+
		"\3\2\2\2\u015c\u015d\7\30\2\2\u015d\u015f\5.\30\2\u015e\u015c\3\2\2\2"+
		"\u015e\u015f\3\2\2\2\u015f\65\3\2\2\2\u0160\u0161\7\16\2\2\u0161\u0162"+
		"\58\35\2\u0162\u0163\79\2\2\u0163\u016a\3\2\2\2\u0164\u0165\5\20\t\2\u0165"+
		"\u0166\5\22\n\2\u0166\u0167\7\25\2\2\u0167\u0168\5\\/\2\u0168\u016a\3"+
		"\2\2\2\u0169\u0160\3\2\2\2\u0169\u0164\3\2\2\2\u016a\67\3\2\2\2\u016b"+
		"\u016c\5\\/\2\u016c\u016d\5\62\32\2\u016d\u016f\3\2\2\2\u016e\u016b\3"+
		"\2\2\2\u016e\u016f\3\2\2\2\u016f9\3\2\2\2\u0170\u0171\5> \2\u0171\u0172"+
		"\7\63\2\2\u0172\u0173\5.\30\2\u0173\u0174\5<\37\2\u0174;\3\2\2\2\u0175"+
		"\u0177\5:\36\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177=\3\2\2\2"+
		"\u0178\u0179\5B\"\2\u0179\u017a\5@!\2\u017a?\3\2\2\2\u017b\u017c\7\23"+
		"\2\2\u017c\u017e\5> \2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017eA"+
		"\3\2\2\2\u017f\u0180\5F$\2\u0180\u0181\7A\2\2\u0181\u0182\5D#\2\u0182"+
		"C\3\2\2\2\u0183\u0184\7\5\2\2\u0184\u0185\5F$\2\u0185\u0186\7A\2\2\u0186"+
		"\u0188\3\2\2\2\u0187\u0183\3\2\2\2\u0187\u0188\3\2\2\2\u0188E\3\2\2\2"+
		"\u0189\u018b\7;\2\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018bG\3\2"+
		"\2\2\u018c\u0192\5N(\2\u018d\u018e\5L\'\2\u018e\u018f\5N(\2\u018f\u0191"+
		"\3\2\2\2\u0190\u018d\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193I\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196\t\3\2\2"+
		"\u0196K\3\2\2\2\u0197\u0198\t\4\2\2\u0198M\3\2\2\2\u0199\u019f\5P)\2\u019a"+
		"\u019b\5J&\2\u019b\u019c\5P)\2\u019c\u019e\3\2\2\2\u019d\u019a\3\2\2\2"+
		"\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0O\3"+
		"\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a7\5R*\2\u01a3\u01a4\78\2\2\u01a4"+
		"\u01a6\5R*\2\u01a5\u01a3\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2"+
		"\2\u01a7\u01a8\3\2\2\2\u01a8Q\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab"+
		"\5F$\2\u01ab\u01ac\5T+\2\u01ac\u01af\3\2\2\2\u01ad\u01af\5V,\2\u01ae\u01aa"+
		"\3\2\2\2\u01ae\u01ad\3\2\2\2\u01afS\3\2\2\2\u01b0\u01b1\7\b\2\2\u01b1"+
		"\u01b2\7?\2\2\u01b2\u01b3\5\20\t\2\u01b3\u01b4\5\22\n\2\u01b4\u01c7\3"+
		"\2\2\2\u01b5\u01b6\7?\2\2\u01b6\u01b7\b+\1\2\u01b7\u01b8\5\20\t\2\u01b8"+
		"\u01b9\5\22\n\2\u01b9\u01c7\3\2\2\2\u01ba\u01bb\7?\2\2\u01bb\u01bc\7\16"+
		"\2\2\u01bc\u01bd\5\\/\2\u01bd\u01be\5\62\32\2\u01be\u01bf\79\2\2\u01bf"+
		"\u01c7\3\2\2\2\u01c0\u01c7\7A\2\2\u01c1\u01c7\7B\2\2\u01c2\u01c3\7\16"+
		"\2\2\u01c3\u01c4\5\\/\2\u01c4\u01c5\79\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01b0"+
		"\3\2\2\2\u01c6\u01b5\3\2\2\2\u01c6\u01ba\3\2\2\2\u01c6\u01c0\3\2\2\2\u01c6"+
		"\u01c1\3\2\2\2\u01c6\u01c2\3\2\2\2\u01c7U\3\2\2\2\u01c8\u01c9\7+\2\2\u01c9"+
		"\u01ca\7?\2\2\u01ca\u01cb\5\20\t\2\u01cb\u01cc\5\22\n\2\u01cc\u01cf\3"+
		"\2\2\2\u01cd\u01cf\7@\2\2\u01ce\u01c8\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cf"+
		"W\3\2\2\2\u01d0\u01d1\5Z.\2\u01d1\u01d2\5H%\2\u01d2\u01d4\3\2\2\2\u01d3"+
		"\u01d0\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4Y\3\2\2\2\u01d5\u01d6\t\5\2\2"+
		"\u01d6[\3\2\2\2\u01d7\u01dc\5^\60\2\u01d8\u01d9\7\13\2\2\u01d9\u01db\5"+
		"^\60\2\u01da\u01d8\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd]\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e4\5`\61\2"+
		"\u01e0\u01e1\7 \2\2\u01e1\u01e3\5`\61\2\u01e2\u01e0\3\2\2\2\u01e3\u01e6"+
		"\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5_\3\2\2\2\u01e6"+
		"\u01e4\3\2\2\2\u01e7\u01e8\5b\62\2\u01e8\u01e9\5d\63\2\u01e9a\3\2\2\2"+
		"\u01ea\u01ec\7\n\2\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ecc\3"+
		"\2\2\2\u01ed\u01f1\7\24\2\2\u01ee\u01f1\7*\2\2\u01ef\u01f1\5f\64\2\u01f0"+
		"\u01ed\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01ef\3\2\2\2\u01f1e\3\2\2\2"+
		"\u01f2\u01f3\5H%\2\u01f3\u01f4\5X-\2\u01f4g\3\2\2\2)sx\u0087\u0092\u00a0"+
		"\u00a9\u00ae\u00b5\u00bd\u00ca\u00d5\u00db\u00e3\u00fa\u00fd\u0106\u0109"+
		"\u010e\u0116\u0154\u015a\u015e\u0169\u016e\u0176\u017d\u0187\u018a\u0192"+
		"\u019f\u01a7\u01ae\u01c6\u01ce\u01d3\u01dc\u01e4\u01eb\u01f0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}