// Generated from C:\Users\Usuario\Documents\GitHub\Compilers-2-assignment-1\src\grammar\La.g4 by ANTLR 4.1
package laparser;

    import infrastructure.*;
    import infrastructure.ErrorListeners.*;
    import infrastructure.Simbols.*;

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
		RULE_dimensao = 7, RULE_outros_ident = 8, RULE_tipo = 9, RULE_tipo_estendido = 10, 
		RULE_mais_ident = 11, RULE_tipo_basico_ident = 12, RULE_tipo_basico = 13, 
		RULE_valor_constante = 14, RULE_registro = 15, RULE_declaracao_global = 16, 
		RULE_parametros_opcional = 17, RULE_parametro = 18, RULE_declaracoes_locais = 19, 
		RULE_corpo = 20, RULE_comandos = 21, RULE_cmd = 22, RULE_mais_expressao = 23, 
		RULE_senao_opcional = 24, RULE_argumentos_opcional = 25, RULE_selecao = 26, 
		RULE_constantes = 27, RULE_numero_intervalo = 28, RULE_intervalo_opcional = 29, 
		RULE_op_unario = 30, RULE_exp_aritmetica = 31, RULE_termo = 32, RULE_fator = 33, 
		RULE_parcela = 34, RULE_parcela_unario = 35, RULE_op_relacional = 36, 
		RULE_expressao = 37, RULE_termo_logico = 38, RULE_fator_logico = 39, RULE_op_nao = 40, 
		RULE_parcela_logica = 41, RULE_exp_relacional = 42;
	public static final String[] ruleNames = {
		"programa", "declaracoes", "decl_local_global", "declaracao_local", "variavel", 
		"identificador", "ponteiros_opcionais", "dimensao", "outros_ident", "tipo", 
		"tipo_estendido", "mais_ident", "tipo_basico_ident", "tipo_basico", "valor_constante", 
		"registro", "declaracao_global", "parametros_opcional", "parametro", "declaracoes_locais", 
		"corpo", "comandos", "cmd", "mais_expressao", "senao_opcional", "argumentos_opcional", 
		"selecao", "constantes", "numero_intervalo", "intervalo_opcional", "op_unario", 
		"exp_aritmetica", "termo", "fator", "parcela", "parcela_unario", "op_relacional", 
		"expressao", "termo_logico", "fator_logico", "op_nao", "parcela_logica", 
		"exp_relacional"
	};

	@Override
	public String getGrammarFileName() { return "La.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	 PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas(); 
	public LaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public List<Decl_local_globalContext> decl_local_global() {
			return getRuleContexts(Decl_local_globalContext.class);
		}
		public Decl_local_globalContext decl_local_global(int i) {
			return getRuleContext(Decl_local_globalContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 pilhaDeTabelas.empilhar(new SimbolTable("global")); 
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 16) | (1L << 39) | (1L << 53) | (1L << 56))) != 0)) {
				{
				{
				setState(87); decl_local_global();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93); match(1);
			setState(94); corpo();
			setState(95); match(10);
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
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 16) | (1L << 39) | (1L << 53) | (1L << 56))) != 0)) {
				{
				{
				setState(98); decl_local_global();
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
			setState(106);
			switch (_input.LA(1)) {
			case 2:
			case 16:
			case 53:
				enterOuterAlt(_localctx, 1);
				{
				setState(104); declaracao_local();
				}
				break;
			case 39:
			case 56:
				enterOuterAlt(_localctx, 2);
				{
				setState(105); declaracao_global();
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
		public Token IDENT;
		public Tipo_basicoContext tipo_basico;
		public TipoContext tipo;
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
			setState(124);
			switch (_input.LA(1)) {
			case 16:
				enterOuterAlt(_localctx, 1);
				{
				setState(108); match(16);
				setState(109); variavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110); match(2);
				setState(111); ((Declaracao_localContext)_localctx).IDENT = match(IDENT);
				setState(112); match(49);
				setState(113); ((Declaracao_localContext)_localctx).tipo_basico = tipo_basico();

				        // A constant has been consumed:
				        // if it has been declared before, logs semantic error.
				        // Otherwise, add it to the current simbol table.
				        if(pilhaDeTabelas.existeSimbolo(((Declaracao_localContext)_localctx).IDENT.getText().toLowerCase())) {
				            SemanticErrorListener.VariableAlreadyExists(((Declaracao_localContext)_localctx).IDENT.getLine(), ((Declaracao_localContext)_localctx).IDENT.getText());
					} else {
				            pilhaDeTabelas.topo().adicionarSimbolo(((Declaracao_localContext)_localctx).IDENT.getText(), "constante", ((Declaracao_localContext)_localctx).tipo_basico.type);
				        }
				    
				setState(115); match(4);
				setState(116); valor_constante();
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 3);
				{
				setState(118); match(53);
				setState(119); ((Declaracao_localContext)_localctx).IDENT = match(IDENT);
				setState(120); match(49);
				setState(121); ((Declaracao_localContext)_localctx).tipo = tipo();

				        // A type has been consumed:
				        // if it has been declared before, logs semantic error.
				        // Otherwise, add it to the current simbol table.
				        if (pilhaDeTabelas.existeSimbolo(((Declaracao_localContext)_localctx).tipo.type.toLowerCase())) {
				            SemanticErrorListener.TypeDoesntExist(((Declaracao_localContext)_localctx).IDENT.getLine(), ((Declaracao_localContext)_localctx).tipo.type);
				        } else {
				            pilhaDeTabelas.topo().adicionarSimbolo(((Declaracao_localContext)_localctx).tipo.type.toLowerCase(), "tipo", ((Declaracao_localContext)_localctx).tipo.type.toLowerCase());
				        }
				    
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
			return getToken(LaParser.IDENT, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(LaParser.IDENT); }
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
			setState(126); ((VariavelContext)_localctx).IDENT = match(IDENT);

			        // Stores a list of consumed identifiers
			        List<String> declared = new ArrayList<>();

			        if(pilhaDeTabelas.topo().existeSimbolo(((VariavelContext)_localctx).IDENT.getText().toLowerCase())) {
			            SemanticErrorListener.VariableAlreadyExists(((VariavelContext)_localctx).IDENT.getLine(), ((VariavelContext)_localctx).IDENT.getText());
			        } else {
			           declared.add(((VariavelContext)_localctx).IDENT.getText().toLowerCase());
			        }
			    
			setState(128); dimensao();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==17) {
				{
				{
				setState(129); match(17);
				setState(130); ((VariavelContext)_localctx).IDENT = match(IDENT);

				        // if any of these were declared already, logs a semantic error.
				        if(pilhaDeTabelas.topo().existeSimbolo(((VariavelContext)_localctx).IDENT.getText().toLowerCase())
				           || declared.contains(((VariavelContext)_localctx).IDENT.getText().toLowerCase())) {
				            SemanticErrorListener.VariableAlreadyExists(((VariavelContext)_localctx).IDENT.getLine(), ((VariavelContext)_localctx).IDENT.getText());
				        } else {
				            declared.add(((VariavelContext)_localctx).IDENT.getText().toLowerCase());
				        }
				    
				setState(132); dimensao();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138); match(49);
			setState(139); ((VariavelContext)_localctx).tipo = tipo();

			       // Add all variables to the nearest simbol table
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
			return getToken(LaParser.IDENT, i);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(LaParser.IDENT); }
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
			setState(142); ponteiros_opcionais();
			setState(143); ((IdentificadorContext)_localctx).IDENT = match(IDENT);
			 ((IdentificadorContext)_localctx).name =  ((IdentificadorContext)_localctx).IDENT.getText(); ((IdentificadorContext)_localctx).line =  ((IdentificadorContext)_localctx).IDENT.getLine(); 
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(145); match(43);
					setState(146); ((IdentificadorContext)_localctx).IDENT = match(IDENT);
					 ((IdentificadorContext)_localctx).name =  "." + ((IdentificadorContext)_localctx).IDENT.getText(); 
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(153); dimensao();
			setState(154); outros_ident();
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
		public String pointers;
		public Ponteiros_opcionaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponteiros_opcionais; }
	}

	public final Ponteiros_opcionaisContext ponteiros_opcionais() throws RecognitionException {
		Ponteiros_opcionaisContext _localctx = new Ponteiros_opcionaisContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ponteiros_opcionais);
		 ((Ponteiros_opcionaisContext)_localctx).pointers =  ""; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==6) {
				{
				{
				setState(156); match(6);
				 _localctx.pointers += "^"; 
				}
				}
				setState(162);
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

	public static class DimensaoContext extends ParserRuleContext {
		public String index;
		public Exp_aritmeticaContext exp_aritmetica;
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dimensao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(163); match(50);
					setState(164); ((DimensaoContext)_localctx).exp_aritmetica = exp_aritmetica();
					setState(165); match(27);
					 ((DimensaoContext)_localctx).index =  ((DimensaoContext)_localctx).exp_aritmetica.index; 
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public String name;
		public IdentificadorContext identificador;
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
		 ((Outros_identContext)_localctx).name =  ""; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if (_la==43) {
				{
				setState(173); match(43);
				setState(174); ((Outros_identContext)_localctx).identificador = identificador();
				 _localctx.name += ((Outros_identContext)_localctx).identificador.name; 
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
			setState(185);
			switch (_input.LA(1)) {
			case 23:
				enterOuterAlt(_localctx, 1);
				{
				setState(179); registro();
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
				setState(182); ((TipoContext)_localctx).tipo_estendido = tipo_estendido();
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
		public Ponteiros_opcionaisContext ponteiros_opcionais;
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
		 ((Tipo_estendidoContext)_localctx).type =  ""; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); ((Tipo_estendidoContext)_localctx).ponteiros_opcionais = ponteiros_opcionais();
			 _localctx.type += ((Tipo_estendidoContext)_localctx).ponteiros_opcionais.pointers; 
			setState(189); ((Tipo_estendidoContext)_localctx).tipo_basico_ident = tipo_basico_ident();
			 _localctx.type += ((Tipo_estendidoContext)_localctx).tipo_basico_ident.type;         
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
		 ((Mais_identContext)_localctx).identifiers =  new ArrayList<>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==17) {
				{
				{
				setState(192); match(17);
				setState(193); ((Mais_identContext)_localctx).identificador = identificador();
				 _localctx.identifiers.add(((Mais_identContext)_localctx).identificador.name); 
				}
				}
				setState(200);
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

	public static class Tipo_basico_identContext extends ParserRuleContext {
		public String type;
		public Tipo_basicoContext tipo_basico;
		public Token IDENT;
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
		enterRule(_localctx, 24, RULE_tipo_basico_ident);
		try {
			setState(206);
			switch (_input.LA(1)) {
			case 7:
			case 21:
			case 48:
			case 59:
				enterOuterAlt(_localctx, 1);
				{
				setState(201); ((Tipo_basico_identContext)_localctx).tipo_basico = tipo_basico();
				 ((Tipo_basico_identContext)_localctx).type =  ((Tipo_basico_identContext)_localctx).tipo_basico.type; 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(204); ((Tipo_basico_identContext)_localctx).IDENT = match(IDENT);
				 //Verificao para ver se existe o tipo especificado
				      ((Tipo_basico_identContext)_localctx).type =  ((Tipo_basico_identContext)_localctx).IDENT.getText();
				      if (!pilhaDeTabelas.existeSimbolo(((Tipo_basico_identContext)_localctx).IDENT.getText().toLowerCase())) {
				          SemanticErrorListener.TypeDoesntExist(((Tipo_basico_identContext)_localctx).IDENT.getLine(), ((Tipo_basico_identContext)_localctx).IDENT.getText());
				      }
				    
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
		public String type;
		public int linha;
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo_basico);
		try {
			setState(216);
			switch (_input.LA(1)) {
			case 7:
				enterOuterAlt(_localctx, 1);
				{
				setState(208); match(7);
				 ((Tipo_basicoContext)_localctx).type =  "literal"; 
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 2);
				{
				setState(210); match(48);
				 ((Tipo_basicoContext)_localctx).type =  "inteiro"; 
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 3);
				{
				setState(212); match(59);
				 ((Tipo_basicoContext)_localctx).type =  "real";    
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 4);
				{
				setState(214); match(21);
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
		enterRule(_localctx, 28, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
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
		public SimbolTable tabela;
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
			setState(220); match(23);
			 pilhaDeTabelas.empilhar(new SimbolTable("registro")); 
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
			 ((RegistroContext)_localctx).tabela =  pilhaDeTabelas.topo(); pilhaDeTabelas.desempilhar(); 
			setState(228); match(35);
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
		public Parametros_opcionalContext parametros_opcional;
		public Tipo_estendidoContext tipo_estendido;
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
		enterRule(_localctx, 32, RULE_declaracao_global);
		try {
			setState(255);
			switch (_input.LA(1)) {
			case 39:
				enterOuterAlt(_localctx, 1);
				{
				setState(230); match(39);
				setState(231); ((Declaracao_globalContext)_localctx).IDENT = match(IDENT);

				        pilhaDeTabelas.empilhar(new SimbolTable("procedimento"));
				    
				setState(233); match(12);
				setState(234); ((Declaracao_globalContext)_localctx).parametros_opcional = parametros_opcional();
				setState(235); match(55);

				        pilhaDeTabelas.subtopo().addProcedure(((Declaracao_globalContext)_localctx).IDENT.getText().toLowerCase(), ((Declaracao_globalContext)_localctx).parametros_opcional.types);
				    
				setState(237); declaracoes_locais();
				setState(238); comandos();
				 pilhaDeTabelas.desempilhar(); 
				setState(240); match(24);
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 2);
				{
				setState(242); match(56);
				setState(243); ((Declaracao_globalContext)_localctx).IDENT = match(IDENT);
				 pilhaDeTabelas.empilhar(new SimbolTable("funcao")); 
				setState(245); match(12);
				setState(246); ((Declaracao_globalContext)_localctx).parametros_opcional = parametros_opcional();
				setState(247); match(45);
				setState(248); ((Declaracao_globalContext)_localctx).tipo_estendido = tipo_estendido();

				        // add to the second scope, considering the first one is the function itself
				        pilhaDeTabelas.subtopo().addFunction(((Declaracao_globalContext)_localctx).IDENT.getText().toLowerCase(), ((Declaracao_globalContext)_localctx).parametros_opcional.types, ((Declaracao_globalContext)_localctx).tipo_estendido.type);
				    
				setState(250); declaracoes_locais();
				setState(251); comandos();
				 pilhaDeTabelas.desempilhar(); 
				setState(253); match(47);
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
		public List<String> types;
		public ParametroContext parametro;
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
			setState(260);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 20) | (1L << IDENT))) != 0)) {
				{
				setState(257); ((Parametros_opcionalContext)_localctx).parametro = parametro();
				 ((Parametros_opcionalContext)_localctx).types =  ((Parametros_opcionalContext)_localctx).parametro.types; 
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
		public List<String> types;
		public IdentificadorContext identificador;
		public Mais_identContext mais_ident;
		public Tipo_estendidoContext tipo_estendido;
		public ParametroContext parametro;
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
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

		        ((ParametroContext)_localctx).types =  new ArrayList<>();
		        List<String> parameters = new ArrayList<>();
		    
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

			setState(265); ((ParametroContext)_localctx).identificador = identificador();
			setState(266); ((ParametroContext)_localctx).mais_ident = mais_ident();
			setState(267); match(49);
			setState(268); ((ParametroContext)_localctx).tipo_estendido = tipo_estendido();

			        parameters.add(((ParametroContext)_localctx).identificador.name);
			        parameters.addAll(((ParametroContext)_localctx).mais_ident.identifiers);
			      
			        for (String parameter : parameters) {
			            if(pilhaDeTabelas.topo().existeSimbolo(parameter.toLowerCase())) {
			                SemanticErrorListener.VariableAlreadyExists(((ParametroContext)_localctx).identificador.line, ((ParametroContext)_localctx).identificador.name);
			            } else {
			                pilhaDeTabelas.topo().adicionarSimbolo(parameter, "parametro", ((ParametroContext)_localctx).tipo_estendido.type);
			                _localctx.types.add(((ParametroContext)_localctx).tipo_estendido.type);
			            }
			        }
			    
			setState(274);
			_la = _input.LA(1);
			if (_la==17) {
				{
				setState(270); match(17);
				setState(271); ((ParametroContext)_localctx).parametro = parametro();
				 _localctx.types.addAll(_localctx.types); 
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
		enterRule(_localctx, 38, RULE_declaracoes_locais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 16) | (1L << 53))) != 0)) {
				{
				setState(276); declaracao_local();
				setState(277); declaracoes_locais();
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
		enterRule(_localctx, 40, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); declaracoes_locais();
			setState(282); comandos();
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
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 6) | (1L << 13) | (1L << 29) | (1L << 31) | (1L << 44) | (1L << 52) | (1L << 58) | (1L << RETORNAR) | (1L << IDENT))) != 0)) {
				{
				{
				setState(284); cmd();
				}
				}
				setState(289);
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

	public static class CmdContext extends ParserRuleContext {
		public IdentificadorContext identificador;
		public Mais_identContext mais_ident;
		public Token IDENT;
		public ExpressaoContext expressao;
		public DimensaoContext dimensao;
		public Token RETORNAR;
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
		public Argumentos_opcionalContext argumentos_opcional() {
			return getRuleContext(Argumentos_opcionalContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public TerminalNode RETORNAR() { return getToken(LaParser.RETORNAR, 0); }
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
		enterRule(_localctx, 44, RULE_cmd);
		try {
			setState(368);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290); match(58);
				setState(291); match(12);
				setState(292); ((CmdContext)_localctx).identificador = identificador();
				   //Caso o identificador nao exista na tabela, mostra o erro
				        if (!pilhaDeTabelas.existeSimbolo(((CmdContext)_localctx).identificador.name.toLowerCase())) {
				            SemanticErrorListener.VariableDoesntExist(((CmdContext)_localctx).identificador.line, ((CmdContext)_localctx).identificador.name);
				        }
				    
				setState(294); ((CmdContext)_localctx).mais_ident = mais_ident();
				   //Caso os identificadores nao existam na tabela, mostra o erro
				        for (String ident : ((CmdContext)_localctx).mais_ident.identifiers) {
				            if (!pilhaDeTabelas.existeSimbolo(ident.toLowerCase())) {
				                SemanticErrorListener.VariableDoesntExist(((CmdContext)_localctx).identificador.line, ident);
				            }
				        }
				    
				setState(296); match(55);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298); match(52);
				setState(299); match(12);
				setState(300); expressao();
				setState(301); mais_expressao();
				setState(302); match(55);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(304); match(44);
				setState(305); expressao();
				setState(306); match(15);
				setState(307); comandos();
				setState(308); senao_opcional();
				setState(309); match(36);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(311); match(29);
				setState(312); exp_aritmetica();
				setState(313); match(11);
				setState(314); selecao();
				setState(315); senao_opcional();
				setState(316); match(14);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(318); match(13);
				   //Empilha (Cria) um novo escopo para o FOR
				          pilhaDeTabelas.empilhar(new SimbolTable("para"));
				      
				setState(320); ((CmdContext)_localctx).IDENT = match(IDENT);
				   // Logs semantic error if variable wasnt found in any of the simbol tables
				          if (!pilhaDeTabelas.existeSimbolo(((CmdContext)_localctx).IDENT.getText().toLowerCase())) {
				               SemanticErrorListener.VariableDoesntExist(((CmdContext)_localctx).IDENT.getLine(),((CmdContext)_localctx).IDENT.getText());
				          }
				      
				setState(322); match(19);
				setState(323); exp_aritmetica();
				setState(324); match(37);
				setState(325); exp_aritmetica();
				setState(326); match(5);
				setState(327); comandos();
				setState(328); match(33);
				   //Desempilha o escopo do FOR
				          pilhaDeTabelas.desempilhar();
				      
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(331); match(31);
				setState(332); expressao();
				setState(333); match(5);
				setState(334); comandos();
				setState(335); match(46);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(337); match(5);
				setState(338); comandos();
				setState(339); match(37);
				setState(340); expressao();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(342); match(6);
				setState(343); ((CmdContext)_localctx).IDENT = match(IDENT);
				   // Logs semantic error if variable wasnt found in any of the simbol tables
				        if (!pilhaDeTabelas.existeSimbolo(((CmdContext)_localctx).IDENT.getText().toLowerCase())) {
				            SemanticErrorListener.VariableDoesntExist(((CmdContext)_localctx).IDENT.getLine(),((CmdContext)_localctx).IDENT.getText());
				        }

				        // Logs semantic error if variable wasnt declared as a pointer
				        String type = pilhaDeTabelas.retornaTipo(((CmdContext)_localctx).IDENT.getText());
				        if (!type.substring(0, 1).equals("^")) {
				            SemanticErrorListener.MisuseOfCaretOperator(((CmdContext)_localctx).IDENT.getLine(), ((CmdContext)_localctx).IDENT.getText());
				        }
				        type = type.substring(1, type.length());
				    
				setState(345); outros_ident();
				setState(346); dimensao();
				setState(347); match(19);
				setState(348); ((CmdContext)_localctx).expressao = expressao();

				        if (!RelationalMap.CanAttribute(type, ((CmdContext)_localctx).expressao.type)) {
				            SemanticErrorListener.AttributionNotAllowed(((CmdContext)_localctx).IDENT.getLine(), "^" + ((CmdContext)_localctx).IDENT.getText());
				        }
				      
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(351); ((CmdContext)_localctx).IDENT = match(IDENT);
				 // Logs semantic error if variable wasnt found in any of the simbol tables
				        if (!pilhaDeTabelas.existeSimbolo(((CmdContext)_localctx).IDENT.getText().toLowerCase())) {
				            SemanticErrorListener.VariableDoesntExist(((CmdContext)_localctx).IDENT.getLine(),((CmdContext)_localctx).IDENT.getText());
				        }
				      
				setState(353); match(12);
				setState(354); argumentos_opcional();
				setState(355); match(55);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(357); ((CmdContext)_localctx).IDENT = match(IDENT);
				setState(358); outros_ident();
				setState(359); ((CmdContext)_localctx).dimensao = dimensao();
				setState(360); match(19);
				setState(361); ((CmdContext)_localctx).expressao = expressao();
				 // Logs semantic error if variable wasnt found in any of the simbol tables
				        if (!pilhaDeTabelas.existeSimbolo(((CmdContext)_localctx).IDENT.getText().toLowerCase())) {
				            SemanticErrorListener.VariableDoesntExist(((CmdContext)_localctx).IDENT.getLine(),((CmdContext)_localctx).IDENT.getText());
				        } else if (!RelationalMap.CanAttribute(pilhaDeTabelas.retornaTipo(((CmdContext)_localctx).IDENT.getText()), ((CmdContext)_localctx).expressao.type)) {
				            
				            String fullName = ((CmdContext)_localctx).IDENT.getText();
				            if (((CmdContext)_localctx).dimensao.index != null) {
				                fullName += "[" + ((CmdContext)_localctx).dimensao.index + "]";
				            }
				            
				            SemanticErrorListener.AttributionNotAllowed(((CmdContext)_localctx).IDENT.getLine(), fullName);
				        }
				      
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(364); ((CmdContext)_localctx).RETORNAR = match(RETORNAR);
				setState(365); expressao();
				  //A palavra retorne so eh possivel com funcao
				         String escopo = pilhaDeTabelas.topo().getEscopo();
				         if (!escopo.equals("funcao")) {
				            SemanticErrorListener.ScopeNotAllowed((((CmdContext)_localctx).RETORNAR!=null?((CmdContext)_localctx).RETORNAR.getLine():0));
				         }
				      
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

	public static class Mais_expressaoContext extends ParserRuleContext {
		public List<String> types;
		public ExpressaoContext expressao;
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public Mais_expressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_expressao; }
	}

	public final Mais_expressaoContext mais_expressao() throws RecognitionException {
		Mais_expressaoContext _localctx = new Mais_expressaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mais_expressao);
		 ((Mais_expressaoContext)_localctx).types =  new ArrayList<>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==17) {
				{
				{
				setState(370); match(17);
				setState(371); ((Mais_expressaoContext)_localctx).expressao = expressao();
				 _localctx.types.add(((Mais_expressaoContext)_localctx).expressao.type); 
				}
				}
				setState(378);
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
		enterRule(_localctx, 48, RULE_senao_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_la = _input.LA(1);
			if (_la==22) {
				{
				setState(379); match(22);
				setState(380); comandos();
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
		enterRule(_localctx, 50, RULE_argumentos_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (6 - 6)) | (1L << (8 - 6)) | (1L << (12 - 6)) | (1L << (18 - 6)) | (1L << (40 - 6)) | (1L << (41 - 6)) | (1L << (57 - 6)) | (1L << (IDENT - 6)) | (1L << (CADEIA - 6)) | (1L << (NUM_INT - 6)) | (1L << (NUM_REAL - 6)))) != 0)) {
				{
				setState(383); expressao();
				setState(384); mais_expressao();
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
		public ConstantesContext constantes(int i) {
			return getRuleContext(ConstantesContext.class,i);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<ConstantesContext> constantes() {
			return getRuleContexts(ConstantesContext.class);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(388); constantes();
				setState(389); match(49);
				setState(390); comandos();
				}
				}
				setState(394); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==57 || _la==NUM_INT );
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
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public Numero_intervaloContext numero_intervalo() {
			return getRuleContext(Numero_intervaloContext.class,0);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396); numero_intervalo();
			setState(399);
			_la = _input.LA(1);
			if (_la==17) {
				{
				setState(397); match(17);
				setState(398); constantes();
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
		enterRule(_localctx, 56, RULE_numero_intervalo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401); op_unario();
			setState(402); match(NUM_INT);
			setState(403); intervalo_opcional();
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
		enterRule(_localctx, 58, RULE_intervalo_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_la = _input.LA(1);
			if (_la==3) {
				{
				setState(405); match(3);
				setState(406); op_unario();
				setState(407); match(NUM_INT);
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
		enterRule(_localctx, 60, RULE_op_unario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_la = _input.LA(1);
			if (_la==57) {
				{
				setState(411); match(57);
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
		public String type;
		public String index;
		public TermoContext termo;
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_exp_aritmetica);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(414); ((Exp_aritmeticaContext)_localctx).termo = termo();

			        ((Exp_aritmeticaContext)_localctx).type =  ((Exp_aritmeticaContext)_localctx).termo.type;
			        ((Exp_aritmeticaContext)_localctx).index =  ((Exp_aritmeticaContext)_localctx).termo.index;
			    
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(416);
					_la = _input.LA(1);
					if ( !(_la==32 || _la==57) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(417); ((Exp_aritmeticaContext)_localctx).termo = termo();

					        if (!RelationalMap.CanAdd(_localctx.type, ((Exp_aritmeticaContext)_localctx).termo.type)) {
					            ((Exp_aritmeticaContext)_localctx).type =  null;
					        } else if (((Exp_aritmeticaContext)_localctx).termo.type.toLowerCase().equals("real")) {
					            ((Exp_aritmeticaContext)_localctx).type =  "real";
					        }
					        
					        ((Exp_aritmeticaContext)_localctx).index =  null;
					    
					}
					} 
				}
				setState(424);
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

	public static class TermoContext extends ParserRuleContext {
		public String type;
		public String index;
		public FatorContext fator;
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425); ((TermoContext)_localctx).fator = fator();
			 ((TermoContext)_localctx).type =  ((TermoContext)_localctx).fator.type; ((TermoContext)_localctx).index =  ((TermoContext)_localctx).fator.index; 
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==34 || _la==42) {
				{
				{
				setState(427);
				_la = _input.LA(1);
				if ( !(_la==34 || _la==42) ) {
				_errHandler.recoverInline(this);
				}
				consume();

				        if (!RelationalMap.CanMultiply(_localctx.type, _localctx.type)) {
				            ((TermoContext)_localctx).type =  null;
				        } else if (_localctx.type.toLowerCase().equals("real")) {
				            ((TermoContext)_localctx).type =  "real";
				        }
				        ((TermoContext)_localctx).index =  null;
				    
				setState(429); ((TermoContext)_localctx).fator = fator();
				}
				}
				setState(434);
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
		public String type;
		public String index;
		public ParcelaContext parcela;
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
		enterRule(_localctx, 66, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); ((FatorContext)_localctx).parcela = parcela();
			 ((FatorContext)_localctx).type =  ((FatorContext)_localctx).parcela.type; ((FatorContext)_localctx).index =  ((FatorContext)_localctx).parcela.index; 
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==54) {
				{
				{
				setState(437); match(54);
				setState(438); ((FatorContext)_localctx).parcela = parcela();

				        if (!RelationalMap.CanMod(_localctx.type, ((FatorContext)_localctx).parcela.type)) {
				            ((FatorContext)_localctx).type =  null;
				        } else {
				            ((FatorContext)_localctx).type =  "inteiro";
				        }

				        ((FatorContext)_localctx).index =  null;
				    
				}
				}
				setState(445);
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
		public String type;
		public String index;
		public Parcela_unarioContext parcela_unario;
		public Token IDENT;
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(LaParser.CADEIA, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LaParser.IDENT, 0); }
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_parcela);
		try {
			setState(458);
			switch (_input.LA(1)) {
			case 6:
			case 12:
			case 57:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(446); op_unario();
				setState(447); ((ParcelaContext)_localctx).parcela_unario = parcela_unario();
				 ((ParcelaContext)_localctx).type =  ((ParcelaContext)_localctx).parcela_unario.type; ((ParcelaContext)_localctx).index =  ((ParcelaContext)_localctx).parcela_unario.index; 
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 2);
				{
				setState(450); match(41);
				setState(451); ((ParcelaContext)_localctx).IDENT = match(IDENT);

				         if (!pilhaDeTabelas.existeSimbolo(((ParcelaContext)_localctx).IDENT.getText().toLowerCase())) {
				            SemanticErrorListener.VariableDoesntExist(((ParcelaContext)_localctx).IDENT.getLine(),((ParcelaContext)_localctx).IDENT.getText());
				         }
				         
				         ((ParcelaContext)_localctx).type =  '^' + pilhaDeTabelas.retornaTipo(((ParcelaContext)_localctx).IDENT.getText().toLowerCase());
				      
				setState(453); outros_ident();
				setState(454); dimensao();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(456); match(CADEIA);
				 ((ParcelaContext)_localctx).type =  "literal"; 
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
		public String type;
		public String index;
		public Token IDENT;
		public ExpressaoContext expressao;
		public Mais_expressaoContext mais_expressao;
		public Token NUM_INT;
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
		enterRule(_localctx, 70, RULE_parcela_unario);
		try {
			setState(488);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460); match(6);
				setState(461); ((Parcela_unarioContext)_localctx).IDENT = match(IDENT);

				         if (!pilhaDeTabelas.existeSimbolo(((Parcela_unarioContext)_localctx).IDENT.getText().toLowerCase())) {
				            SemanticErrorListener.VariableDoesntExist(((Parcela_unarioContext)_localctx).IDENT.getLine(),((Parcela_unarioContext)_localctx).IDENT.getText());
				         }
				         ((Parcela_unarioContext)_localctx).type =  pilhaDeTabelas.retornaTipo(((Parcela_unarioContext)_localctx).IDENT.getText().toLowerCase());
				         ((Parcela_unarioContext)_localctx).type =  _localctx.type.substring(1, _localctx.type.length());
				      
				setState(463); outros_ident();
				setState(464); dimensao();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466); ((Parcela_unarioContext)_localctx).IDENT = match(IDENT);

				        if (!pilhaDeTabelas.existeSimbolo(((Parcela_unarioContext)_localctx).IDENT.getText().toLowerCase())) {
				           SemanticErrorListener.VariableDoesntExist(((Parcela_unarioContext)_localctx).IDENT.getLine(),((Parcela_unarioContext)_localctx).IDENT.getText());
				        }
				        ((Parcela_unarioContext)_localctx).type =  pilhaDeTabelas.retornaTipo(((Parcela_unarioContext)_localctx).IDENT.getText().toLowerCase());
				    
				setState(468); outros_ident();
				setState(469); dimensao();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(471); ((Parcela_unarioContext)_localctx).IDENT = match(IDENT);

				         if (!pilhaDeTabelas.existeSimbolo(((Parcela_unarioContext)_localctx).IDENT.getText().toLowerCase())) {
				            SemanticErrorListener.VariableDoesntExist(((Parcela_unarioContext)_localctx).IDENT.getLine(),((Parcela_unarioContext)_localctx).IDENT.getText());
				         }
				         ((Parcela_unarioContext)_localctx).type =  pilhaDeTabelas.retornaTipo(((Parcela_unarioContext)_localctx).IDENT.getText().toLowerCase());
				      
				setState(473); match(12);
				setState(474); ((Parcela_unarioContext)_localctx).expressao = expressao();
				setState(475); ((Parcela_unarioContext)_localctx).mais_expressao = mais_expressao();
				setState(476); match(55);

				          List<String> parameters = pilhaDeTabelas.getParametersOf(((Parcela_unarioContext)_localctx).IDENT.getText());
				          List<String> arguments  = ((Parcela_unarioContext)_localctx).mais_expressao.types;
				          arguments.add(0, ((Parcela_unarioContext)_localctx).expressao.type);
				          
				          if (!RelationalMap.CanBeUsedAsArgument(parameters, arguments)) {
				              SemanticErrorListener.ArgumentIncompatibility(((Parcela_unarioContext)_localctx).IDENT.getLine(), ((Parcela_unarioContext)_localctx).IDENT.getText());
				          }
				      
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(479); ((Parcela_unarioContext)_localctx).NUM_INT = match(NUM_INT);
				 ((Parcela_unarioContext)_localctx).type =  "inteiro"; ((Parcela_unarioContext)_localctx).index =  ((Parcela_unarioContext)_localctx).NUM_INT.getText();  
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(481); match(NUM_REAL);
				 ((Parcela_unarioContext)_localctx).type =  "real";          
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(483); match(12);
				setState(484); ((Parcela_unarioContext)_localctx).expressao = expressao();
				setState(485); match(55);
				 ((Parcela_unarioContext)_localctx).type =  ((Parcela_unarioContext)_localctx).expressao.type; 
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

	public static class Op_relacionalContext extends ParserRuleContext {
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
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
		public String type;
		public Termo_logicoContext termo_logico;
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
		enterRule(_localctx, 74, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492); ((ExpressaoContext)_localctx).termo_logico = termo_logico();
			 ((ExpressaoContext)_localctx).type =  ((ExpressaoContext)_localctx).termo_logico.type; 
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==9) {
				{
				{
				setState(494); match(9);
				setState(495); ((ExpressaoContext)_localctx).termo_logico = termo_logico();

				        ((ExpressaoContext)_localctx).type =  RelationalMap.CanLogic(_localctx.type, ((ExpressaoContext)_localctx).termo_logico.type)
				            ? "logico"
				            : null
				            ;
				    
				}
				}
				setState(502);
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
		public String type;
		public Fator_logicoContext fator_logico;
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
		enterRule(_localctx, 76, RULE_termo_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503); ((Termo_logicoContext)_localctx).fator_logico = fator_logico();
			 ((Termo_logicoContext)_localctx).type =  ((Termo_logicoContext)_localctx).fator_logico.type; 
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==30) {
				{
				{
				setState(505); match(30);
				setState(506); ((Termo_logicoContext)_localctx).fator_logico = fator_logico();

				        ((Termo_logicoContext)_localctx).type =  RelationalMap.CanLogic(_localctx.type, ((Termo_logicoContext)_localctx).fator_logico.type)
				            ? "logico"
				            : null
				            ;
				    
				}
				}
				setState(513);
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
		public String type;
		public Op_naoContext op_nao;
		public Parcela_logicaContext parcela_logica;
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
		enterRule(_localctx, 78, RULE_fator_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514); ((Fator_logicoContext)_localctx).op_nao = op_nao();
			setState(515); ((Fator_logicoContext)_localctx).parcela_logica = parcela_logica();

			        if (!((Fator_logicoContext)_localctx).op_nao.happens || (((Fator_logicoContext)_localctx).parcela_logica.type != null && ((Fator_logicoContext)_localctx).parcela_logica.type.equals("logico"))) {
			            ((Fator_logicoContext)_localctx).type =  ((Fator_logicoContext)_localctx).parcela_logica.type;
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

	public static class Op_naoContext extends ParserRuleContext {
		public boolean happens;
		public Op_naoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_nao; }
	}

	public final Op_naoContext op_nao() throws RecognitionException {
		Op_naoContext _localctx = new Op_naoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_op_nao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_la = _input.LA(1);
			if (_la==8) {
				{
				setState(518); match(8);
				 ((Op_naoContext)_localctx).happens =  true; 
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
		public String type;
		public Exp_relacionalContext exp_relacional;
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
		enterRule(_localctx, 82, RULE_parcela_logica);
		try {
			setState(529);
			switch (_input.LA(1)) {
			case 18:
				enterOuterAlt(_localctx, 1);
				{
				setState(522); match(18);
				 ((Parcela_logicaContext)_localctx).type =  "logico"; 
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 2);
				{
				setState(524); match(40);
				 ((Parcela_logicaContext)_localctx).type =  "logico"; 
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
				setState(526); ((Parcela_logicaContext)_localctx).exp_relacional = exp_relacional();
				 ((Parcela_logicaContext)_localctx).type =  ((Parcela_logicaContext)_localctx).exp_relacional.type; 
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
		public String type;
		public Exp_aritmeticaContext exp_aritmetica;
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_exp_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531); ((Exp_relacionalContext)_localctx).exp_aritmetica = exp_aritmetica();
			 ((Exp_relacionalContext)_localctx).type =  ((Exp_relacionalContext)_localctx).exp_aritmetica.type; 
			setState(537);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 25) | (1L << 26) | (1L << 28) | (1L << 38) | (1L << 51))) != 0)) {
				{
				setState(533); op_relacional();
				setState(534); ((Exp_relacionalContext)_localctx).exp_aritmetica = exp_aritmetica();

				        ((Exp_relacionalContext)_localctx).type =  RelationalMap.CanBeArithmeticallyCompared(_localctx.type, ((Exp_relacionalContext)_localctx).exp_aritmetica.type)
				              ? "logico"
				              : null
				              ;
				    
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3D\u021e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\7\2[\n\2\f\2\16\2^\13\2\3\2\3\2\3\2\3\2\3\2\3\3\7\3f\n\3"+
		"\f\3\16\3i\13\3\3\4\3\4\5\4m\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\177\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6"+
		"\u0088\n\6\f\6\16\6\u008b\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\7\7\u0097\n\7\f\7\16\7\u009a\13\7\3\7\3\7\3\7\3\b\3\b\7\b\u00a1\n\b\f"+
		"\b\16\b\u00a4\13\b\3\t\3\t\3\t\3\t\3\t\7\t\u00ab\n\t\f\t\16\t\u00ae\13"+
		"\t\3\n\3\n\3\n\3\n\5\n\u00b4\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00bc"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u00c7\n\r\f\r\16\r\u00ca"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\5\16\u00d1\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00db\n\17\3\20\3\20\3\21\3\21\3\21\6\21\u00e2\n"+
		"\21\r\21\16\21\u00e3\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u0102\n\22\3\23\3\23\3\23\5\23\u0107\n\23\3"+
		"\24\5\24\u010a\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0115\n\24\3\25\3\25\3\25\5\25\u011a\n\25\3\26\3\26\3\26\3\27\7\27\u0120"+
		"\n\27\f\27\16\27\u0123\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5"+
		"\30\u0173\n\30\3\31\3\31\3\31\3\31\7\31\u0179\n\31\f\31\16\31\u017c\13"+
		"\31\3\32\3\32\5\32\u0180\n\32\3\33\3\33\3\33\5\33\u0185\n\33\3\34\3\34"+
		"\3\34\3\34\6\34\u018b\n\34\r\34\16\34\u018c\3\35\3\35\3\35\5\35\u0192"+
		"\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u019c\n\37\3 \5 \u019f"+
		"\n \3!\3!\3!\3!\3!\3!\7!\u01a7\n!\f!\16!\u01aa\13!\3\"\3\"\3\"\3\"\3\""+
		"\7\"\u01b1\n\"\f\"\16\"\u01b4\13\"\3#\3#\3#\3#\3#\3#\7#\u01bc\n#\f#\16"+
		"#\u01bf\13#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01cd\n$\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\5%\u01eb\n%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u01f5\n\'\f\'\16\'"+
		"\u01f8\13\'\3(\3(\3(\3(\3(\3(\7(\u0200\n(\f(\16(\u0203\13(\3)\3)\3)\3"+
		")\3*\3*\5*\u020b\n*\3+\3+\3+\3+\3+\3+\3+\5+\u0214\n+\3,\3,\3,\3,\3,\3"+
		",\5,\u021c\n,\3,\2-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTV\2\6\5\2\24\24**@B\4\2\"\";;\4\2$$,,\7\2\6\6"+
		"\33\34\36\36((\65\65\u022a\2X\3\2\2\2\4g\3\2\2\2\6l\3\2\2\2\b~\3\2\2\2"+
		"\n\u0080\3\2\2\2\f\u0090\3\2\2\2\16\u00a2\3\2\2\2\20\u00ac\3\2\2\2\22"+
		"\u00b3\3\2\2\2\24\u00bb\3\2\2\2\26\u00bd\3\2\2\2\30\u00c8\3\2\2\2\32\u00d0"+
		"\3\2\2\2\34\u00da\3\2\2\2\36\u00dc\3\2\2\2 \u00de\3\2\2\2\"\u0101\3\2"+
		"\2\2$\u0106\3\2\2\2&\u0109\3\2\2\2(\u0119\3\2\2\2*\u011b\3\2\2\2,\u0121"+
		"\3\2\2\2.\u0172\3\2\2\2\60\u017a\3\2\2\2\62\u017f\3\2\2\2\64\u0184\3\2"+
		"\2\2\66\u018a\3\2\2\28\u018e\3\2\2\2:\u0193\3\2\2\2<\u019b\3\2\2\2>\u019e"+
		"\3\2\2\2@\u01a0\3\2\2\2B\u01ab\3\2\2\2D\u01b5\3\2\2\2F\u01cc\3\2\2\2H"+
		"\u01ea\3\2\2\2J\u01ec\3\2\2\2L\u01ee\3\2\2\2N\u01f9\3\2\2\2P\u0204\3\2"+
		"\2\2R\u020a\3\2\2\2T\u0213\3\2\2\2V\u0215\3\2\2\2X\\\b\2\1\2Y[\5\6\4\2"+
		"ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\3"+
		"\2\2`a\5*\26\2ab\7\f\2\2bc\b\2\1\2c\3\3\2\2\2df\5\6\4\2ed\3\2\2\2fi\3"+
		"\2\2\2ge\3\2\2\2gh\3\2\2\2h\5\3\2\2\2ig\3\2\2\2jm\5\b\5\2km\5\"\22\2l"+
		"j\3\2\2\2lk\3\2\2\2m\7\3\2\2\2no\7\22\2\2o\177\5\n\6\2pq\7\4\2\2qr\7?"+
		"\2\2rs\7\63\2\2st\5\34\17\2tu\b\5\1\2uv\7\6\2\2vw\5\36\20\2w\177\3\2\2"+
		"\2xy\7\67\2\2yz\7?\2\2z{\7\63\2\2{|\5\24\13\2|}\b\5\1\2}\177\3\2\2\2~"+
		"n\3\2\2\2~p\3\2\2\2~x\3\2\2\2\177\t\3\2\2\2\u0080\u0081\7?\2\2\u0081\u0082"+
		"\b\6\1\2\u0082\u0089\5\20\t\2\u0083\u0084\7\23\2\2\u0084\u0085\7?\2\2"+
		"\u0085\u0086\b\6\1\2\u0086\u0088\5\20\t\2\u0087\u0083\3\2\2\2\u0088\u008b"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008d\7\63\2\2\u008d\u008e\5\24\13\2\u008e\u008f"+
		"\b\6\1\2\u008f\13\3\2\2\2\u0090\u0091\5\16\b\2\u0091\u0092\7?\2\2\u0092"+
		"\u0098\b\7\1\2\u0093\u0094\7-\2\2\u0094\u0095\7?\2\2\u0095\u0097\b\7\1"+
		"\2\u0096\u0093\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\5\20\t\2"+
		"\u009c\u009d\5\22\n\2\u009d\r\3\2\2\2\u009e\u009f\7\b\2\2\u009f\u00a1"+
		"\b\b\1\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\17\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\64\2"+
		"\2\u00a6\u00a7\5@!\2\u00a7\u00a8\7\35\2\2\u00a8\u00a9\b\t\1\2\u00a9\u00ab"+
		"\3\2\2\2\u00aa\u00a5\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\21\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7-\2\2"+
		"\u00b0\u00b1\5\f\7\2\u00b1\u00b2\b\n\1\2\u00b2\u00b4\3\2\2\2\u00b3\u00af"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\23\3\2\2\2\u00b5\u00b6\5 \21\2\u00b6"+
		"\u00b7\b\13\1\2\u00b7\u00bc\3\2\2\2\u00b8\u00b9\5\26\f\2\u00b9\u00ba\b"+
		"\13\1\2\u00ba\u00bc\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bc"+
		"\25\3\2\2\2\u00bd\u00be\5\16\b\2\u00be\u00bf\b\f\1\2\u00bf\u00c0\5\32"+
		"\16\2\u00c0\u00c1\b\f\1\2\u00c1\27\3\2\2\2\u00c2\u00c3\7\23\2\2\u00c3"+
		"\u00c4\5\f\7\2\u00c4\u00c5\b\r\1\2\u00c5\u00c7\3\2\2\2\u00c6\u00c2\3\2"+
		"\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\31\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\5\34\17\2\u00cc\u00cd\b\16"+
		"\1\2\u00cd\u00d1\3\2\2\2\u00ce\u00cf\7?\2\2\u00cf\u00d1\b\16\1\2\u00d0"+
		"\u00cb\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\33\3\2\2\2\u00d2\u00d3\7\t\2"+
		"\2\u00d3\u00db\b\17\1\2\u00d4\u00d5\7\62\2\2\u00d5\u00db\b\17\1\2\u00d6"+
		"\u00d7\7=\2\2\u00d7\u00db\b\17\1\2\u00d8\u00d9\7\27\2\2\u00d9\u00db\b"+
		"\17\1\2\u00da\u00d2\3\2\2\2\u00da\u00d4\3\2\2\2\u00da\u00d6\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00db\35\3\2\2\2\u00dc\u00dd\t\2\2\2\u00dd\37\3\2\2\2\u00de"+
		"\u00df\7\31\2\2\u00df\u00e1\b\21\1\2\u00e0\u00e2\5\n\6\2\u00e1\u00e0\3"+
		"\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\b\21\1\2\u00e6\u00e7\7%\2\2\u00e7!\3\2\2\2"+
		"\u00e8\u00e9\7)\2\2\u00e9\u00ea\7?\2\2\u00ea\u00eb\b\22\1\2\u00eb\u00ec"+
		"\7\16\2\2\u00ec\u00ed\5$\23\2\u00ed\u00ee\79\2\2\u00ee\u00ef\b\22\1\2"+
		"\u00ef\u00f0\5(\25\2\u00f0\u00f1\5,\27\2\u00f1\u00f2\b\22\1\2\u00f2\u00f3"+
		"\7\32\2\2\u00f3\u0102\3\2\2\2\u00f4\u00f5\7:\2\2\u00f5\u00f6\7?\2\2\u00f6"+
		"\u00f7\b\22\1\2\u00f7\u00f8\7\16\2\2\u00f8\u00f9\5$\23\2\u00f9\u00fa\7"+
		"/\2\2\u00fa\u00fb\5\26\f\2\u00fb\u00fc\b\22\1\2\u00fc\u00fd\5(\25\2\u00fd"+
		"\u00fe\5,\27\2\u00fe\u00ff\b\22\1\2\u00ff\u0100\7\61\2\2\u0100\u0102\3"+
		"\2\2\2\u0101\u00e8\3\2\2\2\u0101\u00f4\3\2\2\2\u0102#\3\2\2\2\u0103\u0104"+
		"\5&\24\2\u0104\u0105\b\23\1\2\u0105\u0107\3\2\2\2\u0106\u0103\3\2\2\2"+
		"\u0106\u0107\3\2\2\2\u0107%\3\2\2\2\u0108\u010a\7\26\2\2\u0109\u0108\3"+
		"\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\5\f\7\2\u010c"+
		"\u010d\5\30\r\2\u010d\u010e\7\63\2\2\u010e\u010f\5\26\f\2\u010f\u0114"+
		"\b\24\1\2\u0110\u0111\7\23\2\2\u0111\u0112\5&\24\2\u0112\u0113\b\24\1"+
		"\2\u0113\u0115\3\2\2\2\u0114\u0110\3\2\2\2\u0114\u0115\3\2\2\2\u0115\'"+
		"\3\2\2\2\u0116\u0117\5\b\5\2\u0117\u0118\5(\25\2\u0118\u011a\3\2\2\2\u0119"+
		"\u0116\3\2\2\2\u0119\u011a\3\2\2\2\u011a)\3\2\2\2\u011b\u011c\5(\25\2"+
		"\u011c\u011d\5,\27\2\u011d+\3\2\2\2\u011e\u0120\5.\30\2\u011f\u011e\3"+
		"\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"-\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7<\2\2\u0125\u0126\7\16\2\2"+
		"\u0126\u0127\5\f\7\2\u0127\u0128\b\30\1\2\u0128\u0129\5\30\r\2\u0129\u012a"+
		"\b\30\1\2\u012a\u012b\79\2\2\u012b\u0173\3\2\2\2\u012c\u012d\7\66\2\2"+
		"\u012d\u012e\7\16\2\2\u012e\u012f\5L\'\2\u012f\u0130\5\60\31\2\u0130\u0131"+
		"\79\2\2\u0131\u0173\3\2\2\2\u0132\u0133\7.\2\2\u0133\u0134\5L\'\2\u0134"+
		"\u0135\7\21\2\2\u0135\u0136\5,\27\2\u0136\u0137\5\62\32\2\u0137\u0138"+
		"\7&\2\2\u0138\u0173\3\2\2\2\u0139\u013a\7\37\2\2\u013a\u013b\5@!\2\u013b"+
		"\u013c\7\r\2\2\u013c\u013d\5\66\34\2\u013d\u013e\5\62\32\2\u013e\u013f"+
		"\7\20\2\2\u013f\u0173\3\2\2\2\u0140\u0141\7\17\2\2\u0141\u0142\b\30\1"+
		"\2\u0142\u0143\7?\2\2\u0143\u0144\b\30\1\2\u0144\u0145\7\25\2\2\u0145"+
		"\u0146\5@!\2\u0146\u0147\7\'\2\2\u0147\u0148\5@!\2\u0148\u0149\7\7\2\2"+
		"\u0149\u014a\5,\27\2\u014a\u014b\7#\2\2\u014b\u014c\b\30\1\2\u014c\u0173"+
		"\3\2\2\2\u014d\u014e\7!\2\2\u014e\u014f\5L\'\2\u014f\u0150\7\7\2\2\u0150"+
		"\u0151\5,\27\2\u0151\u0152\7\60\2\2\u0152\u0173\3\2\2\2\u0153\u0154\7"+
		"\7\2\2\u0154\u0155\5,\27\2\u0155\u0156\7\'\2\2\u0156\u0157\5L\'\2\u0157"+
		"\u0173\3\2\2\2\u0158\u0159\7\b\2\2\u0159\u015a\7?\2\2\u015a\u015b\b\30"+
		"\1\2\u015b\u015c\5\22\n\2\u015c\u015d\5\20\t\2\u015d\u015e\7\25\2\2\u015e"+
		"\u015f\5L\'\2\u015f\u0160\b\30\1\2\u0160\u0173\3\2\2\2\u0161\u0162\7?"+
		"\2\2\u0162\u0163\b\30\1\2\u0163\u0164\7\16\2\2\u0164\u0165\5\64\33\2\u0165"+
		"\u0166\79\2\2\u0166\u0173\3\2\2\2\u0167\u0168\7?\2\2\u0168\u0169\5\22"+
		"\n\2\u0169\u016a\5\20\t\2\u016a\u016b\7\25\2\2\u016b\u016c\5L\'\2\u016c"+
		"\u016d\b\30\1\2\u016d\u0173\3\2\2\2\u016e\u016f\7>\2\2\u016f\u0170\5L"+
		"\'\2\u0170\u0171\b\30\1\2\u0171\u0173\3\2\2\2\u0172\u0124\3\2\2\2\u0172"+
		"\u012c\3\2\2\2\u0172\u0132\3\2\2\2\u0172\u0139\3\2\2\2\u0172\u0140\3\2"+
		"\2\2\u0172\u014d\3\2\2\2\u0172\u0153\3\2\2\2\u0172\u0158\3\2\2\2\u0172"+
		"\u0161\3\2\2\2\u0172\u0167\3\2\2\2\u0172\u016e\3\2\2\2\u0173/\3\2\2\2"+
		"\u0174\u0175\7\23\2\2\u0175\u0176\5L\'\2\u0176\u0177\b\31\1\2\u0177\u0179"+
		"\3\2\2\2\u0178\u0174\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\61\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\7\30\2"+
		"\2\u017e\u0180\5,\27\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\63"+
		"\3\2\2\2\u0181\u0182\5L\'\2\u0182\u0183\5\60\31\2\u0183\u0185\3\2\2\2"+
		"\u0184\u0181\3\2\2\2\u0184\u0185\3\2\2\2\u0185\65\3\2\2\2\u0186\u0187"+
		"\58\35\2\u0187\u0188\7\63\2\2\u0188\u0189\5,\27\2\u0189\u018b\3\2\2\2"+
		"\u018a\u0186\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d"+
		"\3\2\2\2\u018d\67\3\2\2\2\u018e\u0191\5:\36\2\u018f\u0190\7\23\2\2\u0190"+
		"\u0192\58\35\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u01929\3\2\2\2"+
		"\u0193\u0194\5> \2\u0194\u0195\7A\2\2\u0195\u0196\5<\37\2\u0196;\3\2\2"+
		"\2\u0197\u0198\7\5\2\2\u0198\u0199\5> \2\u0199\u019a\7A\2\2\u019a\u019c"+
		"\3\2\2\2\u019b\u0197\3\2\2\2\u019b\u019c\3\2\2\2\u019c=\3\2\2\2\u019d"+
		"\u019f\7;\2\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f?\3\2\2\2\u01a0"+
		"\u01a1\5B\"\2\u01a1\u01a8\b!\1\2\u01a2\u01a3\t\3\2\2\u01a3\u01a4\5B\""+
		"\2\u01a4\u01a5\b!\1\2\u01a5\u01a7\3\2\2\2\u01a6\u01a2\3\2\2\2\u01a7\u01aa"+
		"\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9A\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01ab\u01ac\5D#\2\u01ac\u01b2\b\"\1\2\u01ad\u01ae\t\4\2"+
		"\2\u01ae\u01af\b\"\1\2\u01af\u01b1\5D#\2\u01b0\u01ad\3\2\2\2\u01b1\u01b4"+
		"\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3C\3\2\2\2\u01b4"+
		"\u01b2\3\2\2\2\u01b5\u01b6\5F$\2\u01b6\u01bd\b#\1\2\u01b7\u01b8\78\2\2"+
		"\u01b8\u01b9\5F$\2\u01b9\u01ba\b#\1\2\u01ba\u01bc\3\2\2\2\u01bb\u01b7"+
		"\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"E\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c1\5> \2\u01c1\u01c2\5H%\2\u01c2"+
		"\u01c3\b$\1\2\u01c3\u01cd\3\2\2\2\u01c4\u01c5\7+\2\2\u01c5\u01c6\7?\2"+
		"\2\u01c6\u01c7\b$\1\2\u01c7\u01c8\5\22\n\2\u01c8\u01c9\5\20\t\2\u01c9"+
		"\u01cd\3\2\2\2\u01ca\u01cb\7@\2\2\u01cb\u01cd\b$\1\2\u01cc\u01c0\3\2\2"+
		"\2\u01cc\u01c4\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cdG\3\2\2\2\u01ce\u01cf"+
		"\7\b\2\2\u01cf\u01d0\7?\2\2\u01d0\u01d1\b%\1\2\u01d1\u01d2\5\22\n\2\u01d2"+
		"\u01d3\5\20\t\2\u01d3\u01eb\3\2\2\2\u01d4\u01d5\7?\2\2\u01d5\u01d6\b%"+
		"\1\2\u01d6\u01d7\5\22\n\2\u01d7\u01d8\5\20\t\2\u01d8\u01eb\3\2\2\2\u01d9"+
		"\u01da\7?\2\2\u01da\u01db\b%\1\2\u01db\u01dc\7\16\2\2\u01dc\u01dd\5L\'"+
		"\2\u01dd\u01de\5\60\31\2\u01de\u01df\79\2\2\u01df\u01e0\b%\1\2\u01e0\u01eb"+
		"\3\2\2\2\u01e1\u01e2\7A\2\2\u01e2\u01eb\b%\1\2\u01e3\u01e4\7B\2\2\u01e4"+
		"\u01eb\b%\1\2\u01e5\u01e6\7\16\2\2\u01e6\u01e7\5L\'\2\u01e7\u01e8\79\2"+
		"\2\u01e8\u01e9\b%\1\2\u01e9\u01eb\3\2\2\2\u01ea\u01ce\3\2\2\2\u01ea\u01d4"+
		"\3\2\2\2\u01ea\u01d9\3\2\2\2\u01ea\u01e1\3\2\2\2\u01ea\u01e3\3\2\2\2\u01ea"+
		"\u01e5\3\2\2\2\u01ebI\3\2\2\2\u01ec\u01ed\t\5\2\2\u01edK\3\2\2\2\u01ee"+
		"\u01ef\5N(\2\u01ef\u01f6\b\'\1\2\u01f0\u01f1\7\13\2\2\u01f1\u01f2\5N("+
		"\2\u01f2\u01f3\b\'\1\2\u01f3\u01f5\3\2\2\2\u01f4\u01f0\3\2\2\2\u01f5\u01f8"+
		"\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7M\3\2\2\2\u01f8"+
		"\u01f6\3\2\2\2\u01f9\u01fa\5P)\2\u01fa\u0201\b(\1\2\u01fb\u01fc\7 \2\2"+
		"\u01fc\u01fd\5P)\2\u01fd\u01fe\b(\1\2\u01fe\u0200\3\2\2\2\u01ff\u01fb"+
		"\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202"+
		"O\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0205\5R*\2\u0205\u0206\5T+\2\u0206"+
		"\u0207\b)\1\2\u0207Q\3\2\2\2\u0208\u0209\7\n\2\2\u0209\u020b\b*\1\2\u020a"+
		"\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020bS\3\2\2\2\u020c\u020d\7\24\2\2"+
		"\u020d\u0214\b+\1\2\u020e\u020f\7*\2\2\u020f\u0214\b+\1\2\u0210\u0211"+
		"\5V,\2\u0211\u0212\b+\1\2\u0212\u0214\3\2\2\2\u0213\u020c\3\2\2\2\u0213"+
		"\u020e\3\2\2\2\u0213\u0210\3\2\2\2\u0214U\3\2\2\2\u0215\u0216\5@!\2\u0216"+
		"\u021b\b,\1\2\u0217\u0218\5J&\2\u0218\u0219\5@!\2\u0219\u021a\b,\1\2\u021a"+
		"\u021c\3\2\2\2\u021b\u0217\3\2\2\2\u021b\u021c\3\2\2\2\u021cW\3\2\2\2"+
		"(\\gl~\u0089\u0098\u00a2\u00ac\u00b3\u00bb\u00c8\u00d0\u00da\u00e3\u0101"+
		"\u0106\u0109\u0114\u0119\u0121\u0172\u017a\u017f\u0184\u018c\u0191\u019b"+
		"\u019e\u01a8\u01b2\u01bd\u01cc\u01ea\u01f6\u0201\u020a\u0213\u021b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}