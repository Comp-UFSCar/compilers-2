// Generated from /home/lucas/ldavid/Compilers-2-assignment-1/src/grammar/La.g4 by ANTLR 4.1
package laparser;

import infrastructure.ErrorListeners.SemanticErrorListener;
import infrastructure.PilhaDeTabelas;
import infrastructure.RelationalMap;
import infrastructure.TabelaDeSimbolos;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LaParser extends Parser {

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int T__58 = 1, T__57 = 2, T__56 = 3, T__55 = 4, T__54 = 5, T__53 = 6, T__52 = 7, T__51 = 8,
            T__50 = 9, T__49 = 10, T__48 = 11, T__47 = 12, T__46 = 13, T__45 = 14, T__44 = 15, T__43 = 16,
            T__42 = 17, T__41 = 18, T__40 = 19, T__39 = 20, T__38 = 21, T__37 = 22, T__36 = 23,
            T__35 = 24, T__34 = 25, T__33 = 26, T__32 = 27, T__31 = 28, T__30 = 29, T__29 = 30,
            T__28 = 31, T__27 = 32, T__26 = 33, T__25 = 34, T__24 = 35, T__23 = 36, T__22 = 37,
            T__21 = 38, T__20 = 39, T__19 = 40, T__18 = 41, T__17 = 42, T__16 = 43, T__15 = 44,
            T__14 = 45, T__13 = 46, T__12 = 47, T__11 = 48, T__10 = 49, T__9 = 50, T__8 = 51, T__7 = 52,
            T__6 = 53, T__5 = 54, T__4 = 55, T__3 = 56, T__2 = 57, T__1 = 58, T__0 = 59, RETORNAR = 60,
            IDENT = 61, CADEIA = 62, NUM_INT = 63, NUM_REAL = 64, COMENTARIO = 65, WS = 66;
    public static final String[] tokenNames = {
        "<INVALID>", "'&'", "'constante'", "'nao'", "'faca'", "'*'", "'['", "'tipo'",
        "'<'", "'fim_procedimento'", "'<='", "'fim_enquanto'", "'ate'", "'inteiro'",
        "'fim_registro'", "'para'", "'%'", "'enquanto'", "')'", "'senao'", "'='",
        "'leia'", "'caso'", "'literal'", "'funcao'", "'fim_se'", "'escreva'",
        "'..'", "'fim_caso'", "'real'", "'fim_funcao'", "']'", "'fim_para'", "'verdadeiro'",
        "','", "'-'", "'entao'", "':'", "'('", "'):'", "'var'", "'se'", "'logico'",
        "'algoritmo'", "'<-'", "'fim_algoritmo'", "'falso'", "'^'", "'.'", "'+'",
        "'ou'", "'<>'", "'e'", "'>'", "'registro'", "'seja'", "'declare'", "'/'",
        "'>='", "'procedimento'", "'retorne'", "IDENT", "CADEIA", "NUM_INT", "NUM_REAL",
        "COMENTARIO", "WS"
    };
    public static final int RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_declaracao_local = 3,
            RULE_variavel = 4, RULE_identificador = 5, RULE_ponteiros_opcionais = 6,
            RULE_dimensao = 7, RULE_outros_ident = 8, RULE_tipo = 9, RULE_tipo_estendido = 10,
            RULE_mais_ident = 11, RULE_tipo_basico_ident = 12, RULE_tipo_basico = 13,
            RULE_valor_constante = 14, RULE_registro = 15, RULE_declaracao_global = 16,
            RULE_parametros_opcional = 17, RULE_parametro = 18, RULE_declaracoes_locais = 19,
            RULE_corpo = 20, RULE_comandos = 21, RULE_cmd = 22, RULE_mais_expressao = 23,
            RULE_senao_opcional = 24, RULE_chamada_atribuicao = 25, RULE_argumentos_opcional = 26,
            RULE_selecao = 27, RULE_constantes = 28, RULE_mais_constantes = 29, RULE_numero_intervalo = 30,
            RULE_intervalo_opcional = 31, RULE_op_unario = 32, RULE_exp_aritmetica = 33,
            RULE_termo = 34, RULE_fator = 35, RULE_parcela = 36, RULE_parcela_unario = 37,
            RULE_op_relacional = 38, RULE_expressao = 39, RULE_termo_logico = 40,
            RULE_fator_logico = 41, RULE_op_nao = 42, RULE_parcela_logica = 43, RULE_exp_relacional = 44;
    public static final String[] ruleNames = {
        "programa", "declaracoes", "decl_local_global", "declaracao_local", "variavel",
        "identificador", "ponteiros_opcionais", "dimensao", "outros_ident", "tipo",
        "tipo_estendido", "mais_ident", "tipo_basico_ident", "tipo_basico", "valor_constante",
        "registro", "declaracao_global", "parametros_opcional", "parametro", "declaracoes_locais",
        "corpo", "comandos", "cmd", "mais_expressao", "senao_opcional", "chamada_atribuicao",
        "argumentos_opcional", "selecao", "constantes", "mais_constantes", "numero_intervalo",
        "intervalo_opcional", "op_unario", "exp_aritmetica", "termo", "fator",
        "parcela", "parcela_unario", "op_relacional", "expressao", "termo_logico",
        "fator_logico", "op_nao", "parcela_logica", "exp_relacional"
    };

    @Override
    public String getGrammarFileName() {
        return "La.g4";
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
    PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();

    public LaParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class ProgramaContext extends ParserRuleContext {

        public CorpoContext corpo() {
            return getRuleContext(CorpoContext.class, 0);
        }

        public List<Decl_local_globalContext> decl_local_global() {
            return getRuleContexts(Decl_local_globalContext.class);
        }

        public Decl_local_globalContext decl_local_global(int i) {
            return getRuleContext(Decl_local_globalContext.class, i);
        }

        public ProgramaContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_programa;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterPrograma(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitPrograma(this);
            }
        }
    }

    public final ProgramaContext programa() throws RecognitionException {
        ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_programa);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global"));
                setState(94);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 7) | (1L << 24) | (1L << 56) | (1L << 59))) != 0)) {
                    {
                        {
                            setState(91);
                            decl_local_global();
                        }
                    }
                    setState(96);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(97);
                match(43);
                setState(98);
                corpo();
                setState(99);
                match(45);
                pilhaDeTabelas.desempilhar();
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

    public static class DeclaracoesContext extends ParserRuleContext {

        public List<Decl_local_globalContext> decl_local_global() {
            return getRuleContexts(Decl_local_globalContext.class);
        }

        public Decl_local_globalContext decl_local_global(int i) {
            return getRuleContext(Decl_local_globalContext.class, i);
        }

        public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declaracoes;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterDeclaracoes(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitDeclaracoes(this);
            }
        }
    }

    public final DeclaracoesContext declaracoes() throws RecognitionException {
        DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_declaracoes);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(105);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 7) | (1L << 24) | (1L << 56) | (1L << 59))) != 0)) {
                    {
                        {
                            setState(102);
                            decl_local_global();
                        }
                    }
                    setState(107);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
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

    public static class Decl_local_globalContext extends ParserRuleContext {

        public Declaracao_globalContext declaracao_global() {
            return getRuleContext(Declaracao_globalContext.class, 0);
        }

        public Declaracao_localContext declaracao_local() {
            return getRuleContext(Declaracao_localContext.class, 0);
        }

        public Decl_local_globalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_decl_local_global;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterDecl_local_global(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitDecl_local_global(this);
            }
        }
    }

    public final Decl_local_globalContext decl_local_global() throws RecognitionException {
        Decl_local_globalContext _localctx = new Decl_local_globalContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_decl_local_global);
        try {
            setState(110);
            switch (_input.LA(1)) {
                case 2:
                case 7:
                case 56:
                    enterOuterAlt(_localctx, 1); {
                    setState(108);
                    declaracao_local();
                }
                break;
                case 24:
                case 59:
                    enterOuterAlt(_localctx, 2); {
                    setState(109);
                    declaracao_global();
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

    public static class Declaracao_localContext extends ParserRuleContext {

        public Token IDENT;
        public Tipo_basicoContext tipo_basico;
        public TipoContext tipo;

        public Tipo_basicoContext tipo_basico() {
            return getRuleContext(Tipo_basicoContext.class, 0);
        }

        public TipoContext tipo() {
            return getRuleContext(TipoContext.class, 0);
        }

        public Valor_constanteContext valor_constante() {
            return getRuleContext(Valor_constanteContext.class, 0);
        }

        public VariavelContext variavel() {
            return getRuleContext(VariavelContext.class, 0);
        }

        public TerminalNode IDENT() {
            return getToken(LaParser.IDENT, 0);
        }

        public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declaracao_local;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterDeclaracao_local(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitDeclaracao_local(this);
            }
        }
    }

    public final Declaracao_localContext declaracao_local() throws RecognitionException {
        Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_declaracao_local);
        try {
            setState(128);
            switch (_input.LA(1)) {
                case 56:
                    enterOuterAlt(_localctx, 1); {
                    setState(112);
                    match(56);
                    setState(113);
                    variavel();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2); {
                    setState(114);
                    match(2);
                    setState(115);
                    ((Declaracao_localContext) _localctx).IDENT = match(IDENT);
                    setState(116);
                    match(37);
                    setState(117);
                    ((Declaracao_localContext) _localctx).tipo_basico = tipo_basico();

                    // A constant has been consumed:
                    // if it has been declared before, logs semantic error.
                    // Otherwise, add it to the current simbol table.
                    if (pilhaDeTabelas.existeSimbolo(((Declaracao_localContext) _localctx).IDENT.getText().toLowerCase())) {
                        SemanticErrorListener.VariableAlreadyExists((((Declaracao_localContext) _localctx).IDENT != null ? ((Declaracao_localContext) _localctx).IDENT.getLine() : 0), ((Declaracao_localContext) _localctx).IDENT.getText());
                    } else {
                        pilhaDeTabelas.topo().adicionarSimbolo(((Declaracao_localContext) _localctx).IDENT.getText(), "constante", ((Declaracao_localContext) _localctx).tipo_basico.type);
                    }

                    setState(119);
                    match(20);
                    setState(120);
                    valor_constante();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 3); {
                    setState(122);
                    match(7);
                    setState(123);
                    ((Declaracao_localContext) _localctx).IDENT = match(IDENT);
                    setState(124);
                    match(37);
                    setState(125);
                    ((Declaracao_localContext) _localctx).tipo = tipo();

                    // A type has been consumed:
                    // if it has been declared before, logs semantic error.
                    // Otherwise, add it to the current simbol table.
                    if (pilhaDeTabelas.existeSimbolo(((Declaracao_localContext) _localctx).tipo.type.toLowerCase())) {
                        SemanticErrorListener.TypeDoesntExist(((Declaracao_localContext) _localctx).IDENT.getLine(), ((Declaracao_localContext) _localctx).tipo.type);
                    } else {
                        pilhaDeTabelas.topo().adicionarSimbolo(((Declaracao_localContext) _localctx).tipo.type.toLowerCase(), "tipo", ((Declaracao_localContext) _localctx).tipo.type.toLowerCase());
                    }

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

    public static class VariavelContext extends ParserRuleContext {

        public Token IDENT;
        public TipoContext tipo;

        public DimensaoContext dimensao(int i) {
            return getRuleContext(DimensaoContext.class, i);
        }

        public List<DimensaoContext> dimensao() {
            return getRuleContexts(DimensaoContext.class);
        }

        public TipoContext tipo() {
            return getRuleContext(TipoContext.class, 0);
        }

        public List<TerminalNode> IDENT() {
            return getTokens(LaParser.IDENT);
        }

        public TerminalNode IDENT(int i) {
            return getToken(LaParser.IDENT, i);
        }

        public VariavelContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variavel;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterVariavel(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitVariavel(this);
            }
        }
    }

    public final VariavelContext variavel() throws RecognitionException {
        VariavelContext _localctx = new VariavelContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_variavel);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(130);
                ((VariavelContext) _localctx).IDENT = match(IDENT);

                // Stores a list of consumed identifiers
                List<String> declared = new ArrayList<>();

                if (pilhaDeTabelas.topo().existeSimbolo(((VariavelContext) _localctx).IDENT.getText().toLowerCase())) {
                    SemanticErrorListener.VariableAlreadyExists((((VariavelContext) _localctx).IDENT != null ? ((VariavelContext) _localctx).IDENT.getLine() : 0), ((VariavelContext) _localctx).IDENT.getText());
                } else {
                    declared.add(((VariavelContext) _localctx).IDENT.getText().toLowerCase());
                }

                setState(132);
                dimensao();
                setState(139);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == 34) {
                    {
                        {
                            setState(133);
                            match(34);
                            setState(134);
                            ((VariavelContext) _localctx).IDENT = match(IDENT);

                            // if any of these were declared already, logs a semantic error.
                            if (pilhaDeTabelas.topo().existeSimbolo(((VariavelContext) _localctx).IDENT.getText().toLowerCase())
                                    || declared.contains(((VariavelContext) _localctx).IDENT.getText().toLowerCase())) {
                                SemanticErrorListener.VariableAlreadyExists((((VariavelContext) _localctx).IDENT != null ? ((VariavelContext) _localctx).IDENT.getLine() : 0), ((VariavelContext) _localctx).IDENT.getText());
                            } else {
                                declared.add(((VariavelContext) _localctx).IDENT.getText().toLowerCase());
                            }

                            setState(136);
                            dimensao();
                        }
                    }
                    setState(141);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(142);
                match(37);
                setState(143);
                ((VariavelContext) _localctx).tipo = tipo();

                // Add all variables to the nearest simbol table
                for (String current : declared) {
                    pilhaDeTabelas.topo().adicionarSimbolo(current, "variavel", ((VariavelContext) _localctx).tipo.type);
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

    public static class IdentificadorContext extends ParserRuleContext {

        public String name;
        public int line;
        public Token IDENT;

        public DimensaoContext dimensao() {
            return getRuleContext(DimensaoContext.class, 0);
        }

        public Ponteiros_opcionaisContext ponteiros_opcionais() {
            return getRuleContext(Ponteiros_opcionaisContext.class, 0);
        }

        public Outros_identContext outros_ident() {
            return getRuleContext(Outros_identContext.class, 0);
        }

        public List<TerminalNode> IDENT() {
            return getTokens(LaParser.IDENT);
        }

        public TerminalNode IDENT(int i) {
            return getToken(LaParser.IDENT, i);
        }

        public IdentificadorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_identificador;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterIdentificador(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitIdentificador(this);
            }
        }
    }

    public final IdentificadorContext identificador() throws RecognitionException {
        IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_identificador);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(146);
                ponteiros_opcionais();
                setState(147);
                ((IdentificadorContext) _localctx).IDENT = match(IDENT);
                ((IdentificadorContext) _localctx).name = ((IdentificadorContext) _localctx).IDENT.getText();
                ((IdentificadorContext) _localctx).line = ((IdentificadorContext) _localctx).IDENT.getLine();
                setState(153);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                while (_alt != 2 && _alt != -1) {
                    if (_alt == 1) {
                        {
                            {
                                setState(149);
                                match(48);
                                setState(150);
                                ((IdentificadorContext) _localctx).IDENT = match(IDENT);
                            }
                        }
                    }
                    setState(155);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                }
                setState(156);
                dimensao();
                setState(157);
                outros_ident();
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

    public static class Ponteiros_opcionaisContext extends ParserRuleContext {

        public String pointers;

        public Ponteiros_opcionaisContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ponteiros_opcionais;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterPonteiros_opcionais(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitPonteiros_opcionais(this);
            }
        }
    }

    public final Ponteiros_opcionaisContext ponteiros_opcionais() throws RecognitionException {
        Ponteiros_opcionaisContext _localctx = new Ponteiros_opcionaisContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_ponteiros_opcionais);
        ((Ponteiros_opcionaisContext) _localctx).pointers = "";
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(163);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == 47) {
                    {
                        {
                            setState(159);
                            match(47);
                            _localctx.pointers += "^";
                        }
                    }
                    setState(165);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
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

    public static class DimensaoContext extends ParserRuleContext {

        public DimensaoContext dimensao() {
            return getRuleContext(DimensaoContext.class, 0);
        }

        public Exp_aritmeticaContext exp_aritmetica() {
            return getRuleContext(Exp_aritmeticaContext.class, 0);
        }

        public DimensaoContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dimensao;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterDimensao(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitDimensao(this);
            }
        }
    }

    public final DimensaoContext dimensao() throws RecognitionException {
        DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_dimensao);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(171);
                switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                    case 1: {
                        setState(166);
                        match(6);
                        setState(167);
                        exp_aritmetica();
                        setState(168);
                        match(31);
                        setState(169);
                        dimensao();
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

    public static class Outros_identContext extends ParserRuleContext {

        public IdentificadorContext identificador() {
            return getRuleContext(IdentificadorContext.class, 0);
        }

        public Outros_identContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_outros_ident;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterOutros_ident(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitOutros_ident(this);
            }
        }
    }

    public final Outros_identContext outros_ident() throws RecognitionException {
        Outros_identContext _localctx = new Outros_identContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_outros_ident);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(175);
                _la = _input.LA(1);
                if (_la == 48) {
                    {
                        setState(173);
                        match(48);
                        setState(174);
                        identificador();
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

    public static class TipoContext extends ParserRuleContext {

        public String type;
        public Tipo_estendidoContext tipo_estendido;

        public RegistroContext registro() {
            return getRuleContext(RegistroContext.class, 0);
        }

        public Tipo_estendidoContext tipo_estendido() {
            return getRuleContext(Tipo_estendidoContext.class, 0);
        }

        public TipoContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tipo;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterTipo(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitTipo(this);
            }
        }
    }

    public final TipoContext tipo() throws RecognitionException {
        TipoContext _localctx = new TipoContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_tipo);
        try {
            setState(183);
            switch (_input.LA(1)) {
                case 54:
                    enterOuterAlt(_localctx, 1); {
                    setState(177);
                    registro();
                    ((TipoContext) _localctx).type = "registro";
                }
                break;
                case 13:
                case 23:
                case 29:
                case 42:
                case 47:
                case IDENT:
                    enterOuterAlt(_localctx, 2); {
                    setState(180);
                    ((TipoContext) _localctx).tipo_estendido = tipo_estendido();
                    ((TipoContext) _localctx).type = ((TipoContext) _localctx).tipo_estendido.type;
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

    public static class Tipo_estendidoContext extends ParserRuleContext {

        public String type;
        public Ponteiros_opcionaisContext ponteiros_opcionais;
        public Tipo_basico_identContext tipo_basico_ident;

        public Tipo_basico_identContext tipo_basico_ident() {
            return getRuleContext(Tipo_basico_identContext.class, 0);
        }

        public Ponteiros_opcionaisContext ponteiros_opcionais() {
            return getRuleContext(Ponteiros_opcionaisContext.class, 0);
        }

        public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tipo_estendido;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterTipo_estendido(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitTipo_estendido(this);
            }
        }
    }

    public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
        Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_tipo_estendido);
        ((Tipo_estendidoContext) _localctx).type = "";
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(185);
                ((Tipo_estendidoContext) _localctx).ponteiros_opcionais = ponteiros_opcionais();
                _localctx.type += ((Tipo_estendidoContext) _localctx).ponteiros_opcionais.pointers;
                setState(187);
                ((Tipo_estendidoContext) _localctx).tipo_basico_ident = tipo_basico_ident();
                _localctx.type += ((Tipo_estendidoContext) _localctx).tipo_basico_ident.type;
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

    public static class Mais_identContext extends ParserRuleContext {

        public List<String> identifiers;
        public IdentificadorContext identificador;

        public IdentificadorContext identificador(int i) {
            return getRuleContext(IdentificadorContext.class, i);
        }

        public List<IdentificadorContext> identificador() {
            return getRuleContexts(IdentificadorContext.class);
        }

        public Mais_identContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mais_ident;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterMais_ident(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitMais_ident(this);
            }
        }
    }

    public final Mais_identContext mais_ident() throws RecognitionException {
        Mais_identContext _localctx = new Mais_identContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_mais_ident);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                ((Mais_identContext) _localctx).identifiers = new ArrayList<>();
                setState(197);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == 34) {
                    {
                        {
                            setState(191);
                            match(34);
                            setState(192);
                            ((Mais_identContext) _localctx).identificador = identificador();
                            _localctx.identifiers.add(((Mais_identContext) _localctx).identificador.name);
                        }
                    }
                    setState(199);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
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

    public static class Tipo_basico_identContext extends ParserRuleContext {

        public String type;
        public Tipo_basicoContext tipo_basico;
        public Token IDENT;

        public Tipo_basicoContext tipo_basico() {
            return getRuleContext(Tipo_basicoContext.class, 0);
        }

        public TerminalNode IDENT() {
            return getToken(LaParser.IDENT, 0);
        }

        public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tipo_basico_ident;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterTipo_basico_ident(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitTipo_basico_ident(this);
            }
        }
    }

    public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
        Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_tipo_basico_ident);
        try {
            setState(205);
            switch (_input.LA(1)) {
                case 13:
                case 23:
                case 29:
                case 42:
                    enterOuterAlt(_localctx, 1); {
                    setState(200);
                    ((Tipo_basico_identContext) _localctx).tipo_basico = tipo_basico();
                    ((Tipo_basico_identContext) _localctx).type = ((Tipo_basico_identContext) _localctx).tipo_basico.type;
                }
                break;
                case IDENT:
                    enterOuterAlt(_localctx, 2); {
                    setState(203);
                    ((Tipo_basico_identContext) _localctx).IDENT = match(IDENT);
                    //Verificao para ver se existe o tipo especificado
                    ((Tipo_basico_identContext) _localctx).type = ((Tipo_basico_identContext) _localctx).IDENT.getText();
                    if (!pilhaDeTabelas.existeSimbolo(((Tipo_basico_identContext) _localctx).IDENT.getText().toLowerCase())) {
                        SemanticErrorListener.TypeDoesntExist((((Tipo_basico_identContext) _localctx).IDENT != null ? ((Tipo_basico_identContext) _localctx).IDENT.getLine() : 0), ((Tipo_basico_identContext) _localctx).IDENT.getText());
                    }

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

    public static class Tipo_basicoContext extends ParserRuleContext {

        public String type;
        public int linha;

        public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tipo_basico;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterTipo_basico(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitTipo_basico(this);
            }
        }
    }

    public final Tipo_basicoContext tipo_basico() throws RecognitionException {
        Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_tipo_basico);
        try {
            setState(215);
            switch (_input.LA(1)) {
                case 23:
                    enterOuterAlt(_localctx, 1); {
                    setState(207);
                    match(23);
                    ((Tipo_basicoContext) _localctx).type = "literal";
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 2); {
                    setState(209);
                    match(13);
                    ((Tipo_basicoContext) _localctx).type = "inteiro";
                }
                break;
                case 29:
                    enterOuterAlt(_localctx, 3); {
                    setState(211);
                    match(29);
                    ((Tipo_basicoContext) _localctx).type = "real";
                }
                break;
                case 42:
                    enterOuterAlt(_localctx, 4); {
                    setState(213);
                    match(42);
                    ((Tipo_basicoContext) _localctx).type = "logico";
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

    public static class Valor_constanteContext extends ParserRuleContext {

        public TerminalNode NUM_INT() {
            return getToken(LaParser.NUM_INT, 0);
        }

        public TerminalNode NUM_REAL() {
            return getToken(LaParser.NUM_REAL, 0);
        }

        public TerminalNode CADEIA() {
            return getToken(LaParser.CADEIA, 0);
        }

        public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_valor_constante;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterValor_constante(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitValor_constante(this);
            }
        }
    }

    public final Valor_constanteContext valor_constante() throws RecognitionException {
        Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_valor_constante);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(217);
                _la = _input.LA(1);
                if (!(((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (33 - 33)) | (1L << (46 - 33)) | (1L << (CADEIA - 33)) | (1L << (NUM_INT - 33)) | (1L << (NUM_REAL - 33)))) != 0))) {
                    _errHandler.recoverInline(this);
                }
                consume();
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

    public static class RegistroContext extends ParserRuleContext {

        public TabelaDeSimbolos tabela;

        public List<VariavelContext> variavel() {
            return getRuleContexts(VariavelContext.class);
        }

        public VariavelContext variavel(int i) {
            return getRuleContext(VariavelContext.class, i);
        }

        public RegistroContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_registro;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterRegistro(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitRegistro(this);
            }
        }
    }

    public final RegistroContext registro() throws RecognitionException {
        RegistroContext _localctx = new RegistroContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_registro);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(219);
                match(54);
                pilhaDeTabelas.empilhar(new TabelaDeSimbolos("registro"));
                setState(222);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(221);
                            variavel();
                        }
                    }
                    setState(224);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == IDENT);
                ((RegistroContext) _localctx).tabela = pilhaDeTabelas.topo();
                pilhaDeTabelas.desempilhar();
                setState(227);
                match(14);
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

    public static class Declaracao_globalContext extends ParserRuleContext {

        public Declaracoes_locaisContext declaracoes_locais() {
            return getRuleContext(Declaracoes_locaisContext.class, 0);
        }

        public Tipo_estendidoContext tipo_estendido() {
            return getRuleContext(Tipo_estendidoContext.class, 0);
        }

        public ComandosContext comandos() {
            return getRuleContext(ComandosContext.class, 0);
        }

        public Parametros_opcionalContext parametros_opcional() {
            return getRuleContext(Parametros_opcionalContext.class, 0);
        }

        public TerminalNode IDENT() {
            return getToken(LaParser.IDENT, 0);
        }

        public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declaracao_global;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterDeclaracao_global(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitDeclaracao_global(this);
            }
        }
    }

    public final Declaracao_globalContext declaracao_global() throws RecognitionException {
        Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_declaracao_global);
        try {
            setState(252);
            switch (_input.LA(1)) {
                case 59:
                    enterOuterAlt(_localctx, 1); {
                    pilhaDeTabelas.empilhar(new TabelaDeSimbolos("procedimento"));
                    setState(230);
                    match(59);
                    setState(231);
                    match(IDENT);
                    setState(232);
                    match(38);
                    setState(233);
                    parametros_opcional();
                    setState(234);
                    match(18);
                    setState(235);
                    declaracoes_locais();
                    setState(236);
                    comandos();
                    setState(237);
                    match(9);
                    pilhaDeTabelas.desempilhar();
                }
                break;
                case 24:
                    enterOuterAlt(_localctx, 2); {
                    pilhaDeTabelas.empilhar(new TabelaDeSimbolos("funcao"));
                    setState(241);
                    match(24);
                    setState(242);
                    match(IDENT);
                    setState(243);
                    match(38);
                    setState(244);
                    parametros_opcional();
                    setState(245);
                    match(39);
                    setState(246);
                    tipo_estendido();
                    setState(247);
                    declaracoes_locais();
                    setState(248);
                    comandos();
                    setState(249);
                    match(30);
                    pilhaDeTabelas.desempilhar();
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

    public static class Parametros_opcionalContext extends ParserRuleContext {

        public ParametroContext parametro() {
            return getRuleContext(ParametroContext.class, 0);
        }

        public Parametros_opcionalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parametros_opcional;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterParametros_opcional(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitParametros_opcional(this);
            }
        }
    }

    public final Parametros_opcionalContext parametros_opcional() throws RecognitionException {
        Parametros_opcionalContext _localctx = new Parametros_opcionalContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_parametros_opcional);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(255);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 40) | (1L << 47) | (1L << IDENT))) != 0)) {
                    {
                        setState(254);
                        parametro();
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

    public static class ParametroContext extends ParserRuleContext {

        public IdentificadorContext identificador() {
            return getRuleContext(IdentificadorContext.class, 0);
        }

        public ParametroContext parametro() {
            return getRuleContext(ParametroContext.class, 0);
        }

        public Mais_identContext mais_ident() {
            return getRuleContext(Mais_identContext.class, 0);
        }

        public Tipo_estendidoContext tipo_estendido() {
            return getRuleContext(Tipo_estendidoContext.class, 0);
        }

        public ParametroContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parametro;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterParametro(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitParametro(this);
            }
        }
    }

    public final ParametroContext parametro() throws RecognitionException {
        ParametroContext _localctx = new ParametroContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_parametro);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(258);
                _la = _input.LA(1);
                if (_la == 40) {
                    {
                        setState(257);
                        match(40);
                    }
                }

                setState(260);
                identificador();
                setState(261);
                mais_ident();
                setState(262);
                match(37);
                setState(263);
                tipo_estendido();
                setState(266);
                _la = _input.LA(1);
                if (_la == 34) {
                    {
                        setState(264);
                        match(34);
                        setState(265);
                        parametro();
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

    public static class Declaracoes_locaisContext extends ParserRuleContext {

        public Declaracoes_locaisContext declaracoes_locais() {
            return getRuleContext(Declaracoes_locaisContext.class, 0);
        }

        public Declaracao_localContext declaracao_local() {
            return getRuleContext(Declaracao_localContext.class, 0);
        }

        public Declaracoes_locaisContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declaracoes_locais;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterDeclaracoes_locais(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitDeclaracoes_locais(this);
            }
        }
    }

    public final Declaracoes_locaisContext declaracoes_locais() throws RecognitionException {
        Declaracoes_locaisContext _localctx = new Declaracoes_locaisContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_declaracoes_locais);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(271);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 7) | (1L << 56))) != 0)) {
                    {
                        setState(268);
                        declaracao_local();
                        setState(269);
                        declaracoes_locais();
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

    public static class CorpoContext extends ParserRuleContext {

        public Declaracoes_locaisContext declaracoes_locais() {
            return getRuleContext(Declaracoes_locaisContext.class, 0);
        }

        public ComandosContext comandos() {
            return getRuleContext(ComandosContext.class, 0);
        }

        public CorpoContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_corpo;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterCorpo(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitCorpo(this);
            }
        }
    }

    public final CorpoContext corpo() throws RecognitionException {
        CorpoContext _localctx = new CorpoContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_corpo);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(273);
                declaracoes_locais();
                setState(274);
                comandos();
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

    public static class ComandosContext extends ParserRuleContext {

        public CmdContext cmd(int i) {
            return getRuleContext(CmdContext.class, i);
        }

        public List<CmdContext> cmd() {
            return getRuleContexts(CmdContext.class);
        }

        public ComandosContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_comandos;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterComandos(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitComandos(this);
            }
        }
    }

    public final ComandosContext comandos() throws RecognitionException {
        ComandosContext _localctx = new ComandosContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_comandos);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(279);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 15) | (1L << 17) | (1L << 21) | (1L << 22) | (1L << 26) | (1L << 41) | (1L << 47) | (1L << RETORNAR) | (1L << IDENT))) != 0)) {
                    {
                        {
                            setState(276);
                            cmd();
                        }
                    }
                    setState(281);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
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

    public static class CmdContext extends ParserRuleContext {

        public IdentificadorContext identificador;
        public Mais_identContext mais_ident;
        public Token IDENT;
        public ExpressaoContext expressao;
        public Token RETORNAR;

        public SelecaoContext selecao() {
            return getRuleContext(SelecaoContext.class, 0);
        }

        public IdentificadorContext identificador() {
            return getRuleContext(IdentificadorContext.class, 0);
        }

        public ExpressaoContext expressao() {
            return getRuleContext(ExpressaoContext.class, 0);
        }

        public Outros_identContext outros_ident() {
            return getRuleContext(Outros_identContext.class, 0);
        }

        public Mais_identContext mais_ident() {
            return getRuleContext(Mais_identContext.class, 0);
        }

        public Mais_expressaoContext mais_expressao() {
            return getRuleContext(Mais_expressaoContext.class, 0);
        }

        public Exp_aritmeticaContext exp_aritmetica(int i) {
            return getRuleContext(Exp_aritmeticaContext.class, i);
        }

        public TerminalNode RETORNAR() {
            return getToken(LaParser.RETORNAR, 0);
        }

        public DimensaoContext dimensao() {
            return getRuleContext(DimensaoContext.class, 0);
        }

        public List<Exp_aritmeticaContext> exp_aritmetica() {
            return getRuleContexts(Exp_aritmeticaContext.class);
        }

        public Argumentos_opcionalContext argumentos_opcional() {
            return getRuleContext(Argumentos_opcionalContext.class, 0);
        }

        public Senao_opcionalContext senao_opcional() {
            return getRuleContext(Senao_opcionalContext.class, 0);
        }

        public ComandosContext comandos() {
            return getRuleContext(ComandosContext.class, 0);
        }

        public TerminalNode IDENT() {
            return getToken(LaParser.IDENT, 0);
        }

        public CmdContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cmd;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterCmd(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitCmd(this);
            }
        }
    }

    public final CmdContext cmd() throws RecognitionException {
        CmdContext _localctx = new CmdContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_cmd);
        try {
            setState(360);
            switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1); {
                    setState(282);
                    match(21);
                    setState(283);
                    match(38);
                    setState(284);
                    ((CmdContext) _localctx).identificador = identificador();
                    //Caso o identificador nao exista na tabela, mostra o erro
                    if (!pilhaDeTabelas.existeSimbolo(((CmdContext) _localctx).identificador.name.toLowerCase())) {
                        SemanticErrorListener.VariableDoesntExist(((CmdContext) _localctx).identificador.line, ((CmdContext) _localctx).identificador.name);
                    }

                    setState(286);
                    ((CmdContext) _localctx).mais_ident = mais_ident();
                    //Caso os identificadores nao existam na tabela, mostra o erro
                    for (String ident : ((CmdContext) _localctx).mais_ident.identifiers) {
                        if (!pilhaDeTabelas.existeSimbolo(ident.toLowerCase())) {
                            SemanticErrorListener.VariableDoesntExist(((CmdContext) _localctx).identificador.line, ident);
                        }
                    }

                    setState(288);
                    match(18);
                }
                break;

                case 2:
                    enterOuterAlt(_localctx, 2); {
                    setState(290);
                    match(26);
                    setState(291);
                    match(38);
                    setState(292);
                    expressao();
                    setState(293);
                    mais_expressao();
                    setState(294);
                    match(18);
                }
                break;

                case 3:
                    enterOuterAlt(_localctx, 3); {
                    setState(296);
                    match(41);
                    setState(297);
                    expressao();
                    setState(298);
                    match(36);
                    setState(299);
                    comandos();
                    setState(300);
                    senao_opcional();
                    setState(301);
                    match(25);
                }
                break;

                case 4:
                    enterOuterAlt(_localctx, 4); {
                    setState(303);
                    match(22);
                    setState(304);
                    exp_aritmetica();
                    setState(305);
                    match(55);
                    setState(306);
                    selecao();
                    setState(307);
                    senao_opcional();
                    setState(308);
                    match(28);
                }
                break;

                case 5:
                    enterOuterAlt(_localctx, 5); {
                    setState(310);
                    match(15);
                    //Empilha (Cria) um novo escopo para o FOR
                    pilhaDeTabelas.empilhar(new TabelaDeSimbolos("para"));

                    setState(312);
                    ((CmdContext) _localctx).IDENT = match(IDENT);
                    // Logs semantic error if variable wasnt found in any of the simbol tables
                    if (!pilhaDeTabelas.existeSimbolo(((CmdContext) _localctx).IDENT.getText().toLowerCase())) {
                        SemanticErrorListener.VariableDoesntExist((((CmdContext) _localctx).IDENT != null ? ((CmdContext) _localctx).IDENT.getLine() : 0), ((CmdContext) _localctx).IDENT.getText());
                    }

                    setState(314);
                    match(44);
                    setState(315);
                    exp_aritmetica();
                    setState(316);
                    match(12);
                    setState(317);
                    exp_aritmetica();
                    setState(318);
                    match(4);
                    setState(319);
                    comandos();
                    setState(320);
                    match(32);
                    //Desempilha o escopo do FOR
                    pilhaDeTabelas.desempilhar();

                }
                break;

                case 6:
                    enterOuterAlt(_localctx, 6); {
                    setState(323);
                    match(17);
                    setState(324);
                    expressao();
                    setState(325);
                    match(4);
                    setState(326);
                    comandos();
                    setState(327);
                    match(11);
                }
                break;

                case 7:
                    enterOuterAlt(_localctx, 7); {
                    setState(329);
                    match(4);
                    setState(330);
                    comandos();
                    setState(331);
                    match(12);
                    setState(332);
                    expressao();
                }
                break;

                case 8:
                    enterOuterAlt(_localctx, 8); {
                    setState(334);
                    match(47);
                    setState(335);
                    ((CmdContext) _localctx).IDENT = match(IDENT);
                    // Logs semantic error if variable wasnt found in any of the simbol tables
                    if (!pilhaDeTabelas.existeSimbolo(((CmdContext) _localctx).IDENT.getText().toLowerCase())) {
                        SemanticErrorListener.VariableDoesntExist((((CmdContext) _localctx).IDENT != null ? ((CmdContext) _localctx).IDENT.getLine() : 0), ((CmdContext) _localctx).IDENT.getText());
                    }

                    // Logs semantic error if variable wasnt declared as a pointer
                    String type = pilhaDeTabelas.retornaTipo(((CmdContext) _localctx).IDENT.getText());
                    if (!type.substring(0, 1).equals("^")) {
                        SemanticErrorListener.MisuseOfCaretOperator((((CmdContext) _localctx).IDENT != null ? ((CmdContext) _localctx).IDENT.getLine() : 0), ((CmdContext) _localctx).IDENT.getText());
                    }
                    type = type.substring(1, type.length());

                    setState(337);
                    outros_ident();
                    setState(338);
                    dimensao();
                    setState(339);
                    match(44);
                    setState(340);
                    ((CmdContext) _localctx).expressao = expressao();

                    if (!RelationalMap.CanAttribute(type, ((CmdContext) _localctx).expressao.type)) {
                        SemanticErrorListener.AttributionNotAllowed(((CmdContext) _localctx).IDENT.getLine(), "^" + ((CmdContext) _localctx).IDENT.getText());
                    }

                }
                break;

                case 9:
                    enterOuterAlt(_localctx, 9); {
                    setState(343);
                    ((CmdContext) _localctx).IDENT = match(IDENT);
                    // Logs semantic error if variable wasnt found in any of the simbol tables
                    if (!pilhaDeTabelas.existeSimbolo(((CmdContext) _localctx).IDENT.getText().toLowerCase())) {
                        SemanticErrorListener.VariableDoesntExist((((CmdContext) _localctx).IDENT != null ? ((CmdContext) _localctx).IDENT.getLine() : 0), ((CmdContext) _localctx).IDENT.getText());
                    }

                    setState(345);
                    match(38);
                    setState(346);
                    argumentos_opcional();
                    setState(347);
                    match(18);
                }
                break;

                case 10:
                    enterOuterAlt(_localctx, 10); {
                    setState(349);
                    ((CmdContext) _localctx).IDENT = match(IDENT);
                    setState(350);
                    outros_ident();
                    setState(351);
                    dimensao();
                    setState(352);
                    match(44);
                    setState(353);
                    ((CmdContext) _localctx).expressao = expressao();

                    if (!RelationalMap.CanAttribute(pilhaDeTabelas.retornaTipo(((CmdContext) _localctx).IDENT.getText()), ((CmdContext) _localctx).expressao.type)) {
                        SemanticErrorListener.AttributionNotAllowed(((CmdContext) _localctx).IDENT.getLine(), ((CmdContext) _localctx).IDENT.getText());
                    }

                }
                break;

                case 11:
                    enterOuterAlt(_localctx, 11); {
                    setState(356);
                    ((CmdContext) _localctx).RETORNAR = match(RETORNAR);
                    setState(357);
                    expressao();
                    //A palavra retorne so eh possivel com funcao
                    String escopo = pilhaDeTabelas.topo().getEscopo();
                    if (!escopo.equals("funcao")) {
                        SemanticErrorListener.ScopeNotAllowed((((CmdContext) _localctx).RETORNAR != null ? ((CmdContext) _localctx).RETORNAR.getLine() : 0));
                    }

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

    public static class Mais_expressaoContext extends ParserRuleContext {

        public ExpressaoContext expressao() {
            return getRuleContext(ExpressaoContext.class, 0);
        }

        public Mais_expressaoContext mais_expressao() {
            return getRuleContext(Mais_expressaoContext.class, 0);
        }

        public Mais_expressaoContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mais_expressao;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterMais_expressao(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitMais_expressao(this);
            }
        }
    }

    public final Mais_expressaoContext mais_expressao() throws RecognitionException {
        Mais_expressaoContext _localctx = new Mais_expressaoContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_mais_expressao);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(366);
                _la = _input.LA(1);
                if (_la == 34) {
                    {
                        setState(362);
                        match(34);
                        setState(363);
                        expressao();
                        setState(364);
                        mais_expressao();
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

    public static class Senao_opcionalContext extends ParserRuleContext {

        public ComandosContext comandos() {
            return getRuleContext(ComandosContext.class, 0);
        }

        public Senao_opcionalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_senao_opcional;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterSenao_opcional(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitSenao_opcional(this);
            }
        }
    }

    public final Senao_opcionalContext senao_opcional() throws RecognitionException {
        Senao_opcionalContext _localctx = new Senao_opcionalContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_senao_opcional);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(370);
                _la = _input.LA(1);
                if (_la == 19) {
                    {
                        setState(368);
                        match(19);
                        setState(369);
                        comandos();
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

    public static class Chamada_atribuicaoContext extends ParserRuleContext {

        public String $type;

        public Chamada_atribuicaoContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_chamada_atribuicao;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterChamada_atribuicao(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitChamada_atribuicao(this);
            }
        }
    }

    public final Chamada_atribuicaoContext chamada_atribuicao() throws RecognitionException {
        Chamada_atribuicaoContext _localctx = new Chamada_atribuicaoContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_chamada_atribuicao);
        try {
            enterOuterAlt(_localctx, 1);
            {
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

    public static class Argumentos_opcionalContext extends ParserRuleContext {

        public ExpressaoContext expressao() {
            return getRuleContext(ExpressaoContext.class, 0);
        }

        public Mais_expressaoContext mais_expressao() {
            return getRuleContext(Mais_expressaoContext.class, 0);
        }

        public Argumentos_opcionalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_argumentos_opcional;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterArgumentos_opcional(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitArgumentos_opcional(this);
            }
        }
    }

    public final Argumentos_opcionalContext argumentos_opcional() throws RecognitionException {
        Argumentos_opcionalContext _localctx = new Argumentos_opcionalContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_argumentos_opcional);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(377);
                _la = _input.LA(1);
                if (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (1 - 1)) | (1L << (3 - 1)) | (1L << (33 - 1)) | (1L << (35 - 1)) | (1L << (38 - 1)) | (1L << (46 - 1)) | (1L << (47 - 1)) | (1L << (IDENT - 1)) | (1L << (CADEIA - 1)) | (1L << (NUM_INT - 1)) | (1L << (NUM_REAL - 1)))) != 0)) {
                    {
                        setState(374);
                        expressao();
                        setState(375);
                        mais_expressao();
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

    public static class SelecaoContext extends ParserRuleContext {

        public ComandosContext comandos(int i) {
            return getRuleContext(ComandosContext.class, i);
        }

        public List<ComandosContext> comandos() {
            return getRuleContexts(ComandosContext.class);
        }

        public ConstantesContext constantes(int i) {
            return getRuleContext(ConstantesContext.class, i);
        }

        public List<ConstantesContext> constantes() {
            return getRuleContexts(ConstantesContext.class);
        }

        public SelecaoContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_selecao;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterSelecao(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitSelecao(this);
            }
        }
    }

    public final SelecaoContext selecao() throws RecognitionException {
        SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_selecao);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(383);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(379);
                            constantes();
                            setState(380);
                            match(37);
                            setState(381);
                            comandos();
                        }
                    }
                    setState(385);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == 35 || _la == NUM_INT);
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

    public static class ConstantesContext extends ParserRuleContext {

        public Mais_constantesContext mais_constantes() {
            return getRuleContext(Mais_constantesContext.class, 0);
        }

        public Numero_intervaloContext numero_intervalo() {
            return getRuleContext(Numero_intervaloContext.class, 0);
        }

        public ConstantesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constantes;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterConstantes(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitConstantes(this);
            }
        }
    }

    public final ConstantesContext constantes() throws RecognitionException {
        ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_constantes);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(387);
                numero_intervalo();
                setState(388);
                mais_constantes();
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

    public static class Mais_constantesContext extends ParserRuleContext {

        public ConstantesContext constantes() {
            return getRuleContext(ConstantesContext.class, 0);
        }

        public Mais_constantesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mais_constantes;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterMais_constantes(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitMais_constantes(this);
            }
        }
    }

    public final Mais_constantesContext mais_constantes() throws RecognitionException {
        Mais_constantesContext _localctx = new Mais_constantesContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_mais_constantes);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(392);
                _la = _input.LA(1);
                if (_la == 34) {
                    {
                        setState(390);
                        match(34);
                        setState(391);
                        constantes();
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

    public static class Numero_intervaloContext extends ParserRuleContext {

        public Op_unarioContext op_unario() {
            return getRuleContext(Op_unarioContext.class, 0);
        }

        public TerminalNode NUM_INT() {
            return getToken(LaParser.NUM_INT, 0);
        }

        public Intervalo_opcionalContext intervalo_opcional() {
            return getRuleContext(Intervalo_opcionalContext.class, 0);
        }

        public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_numero_intervalo;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterNumero_intervalo(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitNumero_intervalo(this);
            }
        }
    }

    public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
        Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_numero_intervalo);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(394);
                op_unario();
                setState(395);
                match(NUM_INT);
                setState(396);
                intervalo_opcional();
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

    public static class Intervalo_opcionalContext extends ParserRuleContext {

        public Op_unarioContext op_unario() {
            return getRuleContext(Op_unarioContext.class, 0);
        }

        public TerminalNode NUM_INT() {
            return getToken(LaParser.NUM_INT, 0);
        }

        public Intervalo_opcionalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_intervalo_opcional;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterIntervalo_opcional(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitIntervalo_opcional(this);
            }
        }
    }

    public final Intervalo_opcionalContext intervalo_opcional() throws RecognitionException {
        Intervalo_opcionalContext _localctx = new Intervalo_opcionalContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_intervalo_opcional);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(402);
                _la = _input.LA(1);
                if (_la == 27) {
                    {
                        setState(398);
                        match(27);
                        setState(399);
                        op_unario();
                        setState(400);
                        match(NUM_INT);
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

    public static class Op_unarioContext extends ParserRuleContext {

        public Op_unarioContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_op_unario;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterOp_unario(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitOp_unario(this);
            }
        }
    }

    public final Op_unarioContext op_unario() throws RecognitionException {
        Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_op_unario);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(405);
                _la = _input.LA(1);
                if (_la == 35) {
                    {
                        setState(404);
                        match(35);
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

    public static class Exp_aritmeticaContext extends ParserRuleContext {

        public String type;
        public TermoContext termo;

        public List<TermoContext> termo() {
            return getRuleContexts(TermoContext.class);
        }

        public TermoContext termo(int i) {
            return getRuleContext(TermoContext.class, i);
        }

        public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exp_aritmetica;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterExp_aritmetica(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitExp_aritmetica(this);
            }
        }
    }

    public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
        Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_exp_aritmetica);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(407);
                ((Exp_aritmeticaContext) _localctx).termo = termo();
                ((Exp_aritmeticaContext) _localctx).type = ((Exp_aritmeticaContext) _localctx).termo.type;
                setState(415);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
                while (_alt != 2 && _alt != -1) {
                    if (_alt == 1) {
                        {
                            {
                                setState(409);
                                _la = _input.LA(1);
                                if (!(_la == 35 || _la == 49)) {
                                    _errHandler.recoverInline(this);
                                }
                                consume();
                                setState(410);
                                ((Exp_aritmeticaContext) _localctx).termo = termo();

                                if (!RelationalMap.CanAdd(_localctx.type, ((Exp_aritmeticaContext) _localctx).termo.type)) {
                                    ((Exp_aritmeticaContext) _localctx).type = null;
                                } else if (((Exp_aritmeticaContext) _localctx).termo.type.toLowerCase().equals("real")) {
                                    ((Exp_aritmeticaContext) _localctx).type = "real";
                                }

                            }
                        }
                    }
                    setState(417);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
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

    public static class TermoContext extends ParserRuleContext {

        public String type;
        public FatorContext fator;

        public FatorContext fator(int i) {
            return getRuleContext(FatorContext.class, i);
        }

        public List<FatorContext> fator() {
            return getRuleContexts(FatorContext.class);
        }

        public TermoContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_termo;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterTermo(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitTermo(this);
            }
        }
    }

    public final TermoContext termo() throws RecognitionException {
        TermoContext _localctx = new TermoContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_termo);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(418);
                ((TermoContext) _localctx).fator = fator();
                ((TermoContext) _localctx).type = ((TermoContext) _localctx).fator.type;
                setState(425);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == 5 || _la == 57) {
                    {
                        {
                            setState(420);
                            _la = _input.LA(1);
                            if (!(_la == 5 || _la == 57)) {
                                _errHandler.recoverInline(this);
                            }
                            consume();

                            if (!RelationalMap.CanMultiply(_localctx.type, _localctx.type)) {
                                ((TermoContext) _localctx).type = null;
                            } else if (_localctx.type.toLowerCase().equals("real")) {
                                ((TermoContext) _localctx).type = "real";
                            }

                            setState(422);
                            ((TermoContext) _localctx).fator = fator();
                        }
                    }
                    setState(427);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
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

    public static class FatorContext extends ParserRuleContext {

        public String type;
        public ParcelaContext parcela;

        public ParcelaContext parcela(int i) {
            return getRuleContext(ParcelaContext.class, i);
        }

        public List<ParcelaContext> parcela() {
            return getRuleContexts(ParcelaContext.class);
        }

        public FatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterFator(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitFator(this);
            }
        }
    }

    public final FatorContext fator() throws RecognitionException {
        FatorContext _localctx = new FatorContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_fator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(428);
                ((FatorContext) _localctx).parcela = parcela();
                ((FatorContext) _localctx).type = ((FatorContext) _localctx).parcela.type;
                setState(436);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == 16) {
                    {
                        {
                            setState(430);
                            match(16);
                            setState(431);
                            ((FatorContext) _localctx).parcela = parcela();

                            if (!RelationalMap.CanMod(_localctx.type, ((FatorContext) _localctx).parcela.type)) {
                                ((FatorContext) _localctx).type = null;
                            } else {
                                ((FatorContext) _localctx).type = "inteiro";
                            }

                        }
                    }
                    setState(438);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
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

    public static class ParcelaContext extends ParserRuleContext {

        public String type;
        public Parcela_unarioContext parcela_unario;
        public Token IDENT;

        public Parcela_unarioContext parcela_unario() {
            return getRuleContext(Parcela_unarioContext.class, 0);
        }

        public DimensaoContext dimensao() {
            return getRuleContext(DimensaoContext.class, 0);
        }

        public Op_unarioContext op_unario() {
            return getRuleContext(Op_unarioContext.class, 0);
        }

        public Outros_identContext outros_ident() {
            return getRuleContext(Outros_identContext.class, 0);
        }

        public TerminalNode CADEIA() {
            return getToken(LaParser.CADEIA, 0);
        }

        public TerminalNode IDENT() {
            return getToken(LaParser.IDENT, 0);
        }

        public ParcelaContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parcela;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterParcela(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitParcela(this);
            }
        }
    }

    public final ParcelaContext parcela() throws RecognitionException {
        ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_parcela);
        try {
            setState(451);
            switch (_input.LA(1)) {
                case 35:
                case 38:
                case 47:
                case IDENT:
                case NUM_INT:
                case NUM_REAL:
                    enterOuterAlt(_localctx, 1); {
                    setState(439);
                    op_unario();
                    setState(440);
                    ((ParcelaContext) _localctx).parcela_unario = parcela_unario();
                    ((ParcelaContext) _localctx).type = ((ParcelaContext) _localctx).parcela_unario.type;
                }
                break;
                case 1:
                    enterOuterAlt(_localctx, 2); {
                    setState(443);
                    match(1);
                    setState(444);
                    ((ParcelaContext) _localctx).IDENT = match(IDENT);

                    if (!pilhaDeTabelas.existeSimbolo(((ParcelaContext) _localctx).IDENT.getText().toLowerCase())) {
                        SemanticErrorListener.VariableDoesntExist((((ParcelaContext) _localctx).IDENT != null ? ((ParcelaContext) _localctx).IDENT.getLine() : 0), ((ParcelaContext) _localctx).IDENT.getText());
                    }

                    ((ParcelaContext) _localctx).type = '^' + pilhaDeTabelas.retornaTipo(((ParcelaContext) _localctx).IDENT.getText().toLowerCase());

                    setState(446);
                    outros_ident();
                    setState(447);
                    dimensao();
                }
                break;
                case CADEIA:
                    enterOuterAlt(_localctx, 3); {
                    setState(449);
                    match(CADEIA);
                    ((ParcelaContext) _localctx).type = "literal";
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

    public static class Parcela_unarioContext extends ParserRuleContext {

        public String type;
        public Token IDENT;
        public ExpressaoContext expressao;

        public DimensaoContext dimensao() {
            return getRuleContext(DimensaoContext.class, 0);
        }

        public TerminalNode NUM_INT() {
            return getToken(LaParser.NUM_INT, 0);
        }

        public ExpressaoContext expressao() {
            return getRuleContext(ExpressaoContext.class, 0);
        }

        public Outros_identContext outros_ident() {
            return getRuleContext(Outros_identContext.class, 0);
        }

        public Mais_expressaoContext mais_expressao() {
            return getRuleContext(Mais_expressaoContext.class, 0);
        }

        public TerminalNode NUM_REAL() {
            return getToken(LaParser.NUM_REAL, 0);
        }

        public TerminalNode IDENT() {
            return getToken(LaParser.IDENT, 0);
        }

        public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parcela_unario;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterParcela_unario(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitParcela_unario(this);
            }
        }
    }

    public final Parcela_unarioContext parcela_unario() throws RecognitionException {
        Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_parcela_unario);
        try {
            setState(480);
            switch (getInterpreter().adaptivePredict(_input, 32, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1); {
                    setState(453);
                    match(47);
                    setState(454);
                    ((Parcela_unarioContext) _localctx).IDENT = match(IDENT);

                    if (!pilhaDeTabelas.existeSimbolo(((Parcela_unarioContext) _localctx).IDENT.getText().toLowerCase())) {
                        SemanticErrorListener.VariableDoesntExist((((Parcela_unarioContext) _localctx).IDENT != null ? ((Parcela_unarioContext) _localctx).IDENT.getLine() : 0), ((Parcela_unarioContext) _localctx).IDENT.getText());
                    }
                    ((Parcela_unarioContext) _localctx).type = pilhaDeTabelas.retornaTipo(((Parcela_unarioContext) _localctx).IDENT.getText().toLowerCase());
                    ((Parcela_unarioContext) _localctx).type = _localctx.type.substring(1, _localctx.type.length());

                    setState(456);
                    outros_ident();
                    setState(457);
                    dimensao();
                }
                break;

                case 2:
                    enterOuterAlt(_localctx, 2); {
                    setState(459);
                    ((Parcela_unarioContext) _localctx).IDENT = match(IDENT);

                    if (!pilhaDeTabelas.existeSimbolo(((Parcela_unarioContext) _localctx).IDENT.getText().toLowerCase())) {
                        SemanticErrorListener.VariableDoesntExist((((Parcela_unarioContext) _localctx).IDENT != null ? ((Parcela_unarioContext) _localctx).IDENT.getLine() : 0), ((Parcela_unarioContext) _localctx).IDENT.getText());
                    }
                    ((Parcela_unarioContext) _localctx).type = pilhaDeTabelas.retornaTipo(((Parcela_unarioContext) _localctx).IDENT.getText().toLowerCase());

                    setState(461);
                    outros_ident();
                    setState(462);
                    dimensao();
                }
                break;

                case 3:
                    enterOuterAlt(_localctx, 3); {
                    setState(464);
                    ((Parcela_unarioContext) _localctx).IDENT = match(IDENT);

                    if (!pilhaDeTabelas.existeSimbolo(((Parcela_unarioContext) _localctx).IDENT.getText().toLowerCase())) {
                        SemanticErrorListener.VariableDoesntExist((((Parcela_unarioContext) _localctx).IDENT != null ? ((Parcela_unarioContext) _localctx).IDENT.getLine() : 0), ((Parcela_unarioContext) _localctx).IDENT.getText());
                    }
                    ((Parcela_unarioContext) _localctx).type = pilhaDeTabelas.retornaTipo(((Parcela_unarioContext) _localctx).IDENT.getText().toLowerCase());

                    setState(466);
                    match(38);
                    setState(467);
                    expressao();
                    setState(468);
                    mais_expressao();
                    setState(469);
                    match(18);
                }
                break;

                case 4:
                    enterOuterAlt(_localctx, 4); {
                    setState(471);
                    match(NUM_INT);
                    ((Parcela_unarioContext) _localctx).type = "inteiro";
                }
                break;

                case 5:
                    enterOuterAlt(_localctx, 5); {
                    setState(473);
                    match(NUM_REAL);
                    ((Parcela_unarioContext) _localctx).type = "real";
                }
                break;

                case 6:
                    enterOuterAlt(_localctx, 6); {
                    setState(475);
                    match(38);
                    setState(476);
                    ((Parcela_unarioContext) _localctx).expressao = expressao();
                    setState(477);
                    match(18);
                    ((Parcela_unarioContext) _localctx).type = ((Parcela_unarioContext) _localctx).expressao.type;
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

    public static class Op_relacionalContext extends ParserRuleContext {

        public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_op_relacional;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterOp_relacional(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitOp_relacional(this);
            }
        }
    }

    public final Op_relacionalContext op_relacional() throws RecognitionException {
        Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_op_relacional);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(482);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 10) | (1L << 20) | (1L << 51) | (1L << 53) | (1L << 58))) != 0))) {
                    _errHandler.recoverInline(this);
                }
                consume();
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

    public static class ExpressaoContext extends ParserRuleContext {

        public String type;
        public Termo_logicoContext termo_logico;

        public Termo_logicoContext termo_logico(int i) {
            return getRuleContext(Termo_logicoContext.class, i);
        }

        public List<Termo_logicoContext> termo_logico() {
            return getRuleContexts(Termo_logicoContext.class);
        }

        public ExpressaoContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expressao;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterExpressao(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitExpressao(this);
            }
        }
    }

    public final ExpressaoContext expressao() throws RecognitionException {
        ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_expressao);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(484);
                ((ExpressaoContext) _localctx).termo_logico = termo_logico();
                ((ExpressaoContext) _localctx).type = ((ExpressaoContext) _localctx).termo_logico.type;
                setState(492);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == 50) {
                    {
                        {
                            setState(486);
                            match(50);
                            setState(487);
                            ((ExpressaoContext) _localctx).termo_logico = termo_logico();

                            ((ExpressaoContext) _localctx).type = RelationalMap.CanLogic(_localctx.type, ((ExpressaoContext) _localctx).termo_logico.type)
                                    ? "logico"
                                    : null;

                        }
                    }
                    setState(494);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
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

    public static class Termo_logicoContext extends ParserRuleContext {

        public String type;
        public Fator_logicoContext fator_logico;

        public Fator_logicoContext fator_logico(int i) {
            return getRuleContext(Fator_logicoContext.class, i);
        }

        public List<Fator_logicoContext> fator_logico() {
            return getRuleContexts(Fator_logicoContext.class);
        }

        public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_termo_logico;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterTermo_logico(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitTermo_logico(this);
            }
        }
    }

    public final Termo_logicoContext termo_logico() throws RecognitionException {
        Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
        enterRule(_localctx, 80, RULE_termo_logico);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(495);
                ((Termo_logicoContext) _localctx).fator_logico = fator_logico();
                ((Termo_logicoContext) _localctx).type = ((Termo_logicoContext) _localctx).fator_logico.type;
                setState(503);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == 52) {
                    {
                        {
                            setState(497);
                            match(52);
                            setState(498);
                            ((Termo_logicoContext) _localctx).fator_logico = fator_logico();

                            ((Termo_logicoContext) _localctx).type = RelationalMap.CanLogic(_localctx.type, ((Termo_logicoContext) _localctx).fator_logico.type)
                                    ? "logico"
                                    : null;

                        }
                    }
                    setState(505);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
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

    public static class Fator_logicoContext extends ParserRuleContext {

        public String type;
        public Op_naoContext op_nao;
        public Parcela_logicaContext parcela_logica;

        public Op_naoContext op_nao() {
            return getRuleContext(Op_naoContext.class, 0);
        }

        public Parcela_logicaContext parcela_logica() {
            return getRuleContext(Parcela_logicaContext.class, 0);
        }

        public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fator_logico;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterFator_logico(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitFator_logico(this);
            }
        }
    }

    public final Fator_logicoContext fator_logico() throws RecognitionException {
        Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
        enterRule(_localctx, 82, RULE_fator_logico);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(506);
                ((Fator_logicoContext) _localctx).op_nao = op_nao();
                setState(507);
                ((Fator_logicoContext) _localctx).parcela_logica = parcela_logica();

                if (!((Fator_logicoContext) _localctx).op_nao.happens || (((Fator_logicoContext) _localctx).parcela_logica.type != null && ((Fator_logicoContext) _localctx).parcela_logica.type.equals("logico"))) {
                    ((Fator_logicoContext) _localctx).type = ((Fator_logicoContext) _localctx).parcela_logica.type;
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

    public static class Op_naoContext extends ParserRuleContext {

        public boolean happens;

        public Op_naoContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_op_nao;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterOp_nao(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitOp_nao(this);
            }
        }
    }

    public final Op_naoContext op_nao() throws RecognitionException {
        Op_naoContext _localctx = new Op_naoContext(_ctx, getState());
        enterRule(_localctx, 84, RULE_op_nao);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(512);
                _la = _input.LA(1);
                if (_la == 3) {
                    {
                        setState(510);
                        match(3);
                        ((Op_naoContext) _localctx).happens = true;
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

    public static class Parcela_logicaContext extends ParserRuleContext {

        public String type;
        public Exp_relacionalContext exp_relacional;

        public Exp_relacionalContext exp_relacional() {
            return getRuleContext(Exp_relacionalContext.class, 0);
        }

        public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parcela_logica;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterParcela_logica(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitParcela_logica(this);
            }
        }
    }

    public final Parcela_logicaContext parcela_logica() throws RecognitionException {
        Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
        enterRule(_localctx, 86, RULE_parcela_logica);
        try {
            setState(521);
            switch (_input.LA(1)) {
                case 33:
                    enterOuterAlt(_localctx, 1); {
                    setState(514);
                    match(33);
                    ((Parcela_logicaContext) _localctx).type = "logico";
                }
                break;
                case 46:
                    enterOuterAlt(_localctx, 2); {
                    setState(516);
                    match(46);
                    ((Parcela_logicaContext) _localctx).type = "logico";
                }
                break;
                case 1:
                case 35:
                case 38:
                case 47:
                case IDENT:
                case CADEIA:
                case NUM_INT:
                case NUM_REAL:
                    enterOuterAlt(_localctx, 3); {
                    setState(518);
                    ((Parcela_logicaContext) _localctx).exp_relacional = exp_relacional();
                    ((Parcela_logicaContext) _localctx).type = ((Parcela_logicaContext) _localctx).exp_relacional.type;
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

    public static class Exp_relacionalContext extends ParserRuleContext {

        public String type;
        public Exp_aritmeticaContext exp_aritmetica;

        public Op_relacionalContext op_relacional() {
            return getRuleContext(Op_relacionalContext.class, 0);
        }

        public List<Exp_aritmeticaContext> exp_aritmetica() {
            return getRuleContexts(Exp_aritmeticaContext.class);
        }

        public Exp_aritmeticaContext exp_aritmetica(int i) {
            return getRuleContext(Exp_aritmeticaContext.class, i);
        }

        public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exp_relacional;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).enterExp_relacional(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LaListener) {
                ((LaListener) listener).exitExp_relacional(this);
            }
        }
    }

    public final Exp_relacionalContext exp_relacional() throws RecognitionException {
        Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
        enterRule(_localctx, 88, RULE_exp_relacional);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(523);
                ((Exp_relacionalContext) _localctx).exp_aritmetica = exp_aritmetica();
                ((Exp_relacionalContext) _localctx).type = ((Exp_relacionalContext) _localctx).exp_aritmetica.type;
                setState(529);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 10) | (1L << 20) | (1L << 51) | (1L << 53) | (1L << 58))) != 0)) {
                    {
                        setState(525);
                        op_relacional();
                        setState(526);
                        ((Exp_relacionalContext) _localctx).exp_aritmetica = exp_aritmetica();

                        ((Exp_relacionalContext) _localctx).type = RelationalMap.CanBeArithmeticallyCompared(_localctx.type, ((Exp_relacionalContext) _localctx).exp_aritmetica.type)
                                ? "logico"
                                : null;

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
    public static final String _serializedATN =
            "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3D\u0216\4\2\t\2\4"
            + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
            + "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
            + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
            + "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
            + "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"
            + ",\t,\4-\t-\4.\t.\3\2\3\2\7\2_\n\2\f\2\16\2b\13\2\3\2\3\2\3\2\3\2\3\2\3"
            + "\3\7\3j\n\3\f\3\16\3m\13\3\3\4\3\4\5\4q\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"
            + "\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0083\n\5\3\6\3\6\3\6\3\6\3"
            + "\6\3\6\3\6\7\6\u008c\n\6\f\6\16\6\u008f\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3"
            + "\7\3\7\3\7\7\7\u009a\n\7\f\7\16\7\u009d\13\7\3\7\3\7\3\7\3\b\3\b\7\b\u00a4"
            + "\n\b\f\b\16\b\u00a7\13\b\3\t\3\t\3\t\3\t\3\t\5\t\u00ae\n\t\3\n\3\n\5\n"
            + "\u00b2\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ba\n\13\3\f\3\f\3\f\3"
            + "\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r\u00c6\n\r\f\r\16\r\u00c9\13\r\3\16\3\16"
            + "\3\16\3\16\3\16\5\16\u00d0\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"
            + "\5\17\u00da\n\17\3\20\3\20\3\21\3\21\3\21\6\21\u00e1\n\21\r\21\16\21\u00e2"
            + "\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"
            + "\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ff"
            + "\n\22\3\23\5\23\u0102\n\23\3\24\5\24\u0105\n\24\3\24\3\24\3\24\3\24\3"
            + "\24\3\24\5\24\u010d\n\24\3\25\3\25\3\25\5\25\u0112\n\25\3\26\3\26\3\26"
            + "\3\27\7\27\u0118\n\27\f\27\16\27\u011b\13\27\3\30\3\30\3\30\3\30\3\30"
            + "\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"
            + "\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"
            + "\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"
            + "\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"
            + "\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"
            + "\3\30\3\30\3\30\5\30\u016b\n\30\3\31\3\31\3\31\3\31\5\31\u0171\n\31\3"
            + "\32\3\32\5\32\u0175\n\32\3\33\3\33\3\34\3\34\3\34\5\34\u017c\n\34\3\35"
            + "\3\35\3\35\3\35\6\35\u0182\n\35\r\35\16\35\u0183\3\36\3\36\3\36\3\37\3"
            + "\37\5\37\u018b\n\37\3 \3 \3 \3 \3!\3!\3!\3!\5!\u0195\n!\3\"\5\"\u0198"
            + "\n\"\3#\3#\3#\3#\3#\3#\7#\u01a0\n#\f#\16#\u01a3\13#\3$\3$\3$\3$\3$\7$"
            + "\u01aa\n$\f$\16$\u01ad\13$\3%\3%\3%\3%\3%\3%\7%\u01b5\n%\f%\16%\u01b8"
            + "\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01c6\n&\3\'\3\'\3\'\3\'\3"
            + "\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"
            + "\3\'\3\'\3\'\3\'\3\'\5\'\u01e3\n\'\3(\3(\3)\3)\3)\3)\3)\3)\7)\u01ed\n"
            + ")\f)\16)\u01f0\13)\3*\3*\3*\3*\3*\3*\7*\u01f8\n*\f*\16*\u01fb\13*\3+\3"
            + "+\3+\3+\3,\3,\5,\u0203\n,\3-\3-\3-\3-\3-\3-\3-\5-\u020c\n-\3.\3.\3.\3"
            + ".\3.\3.\5.\u0214\n.\3.\2/\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"
            + "(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\6\5\2##\60\60@B\4\2%%\63\63\4\2\7"
            + "\7;;\b\2\n\n\f\f\26\26\65\65\67\67<<\u0220\2\\\3\2\2\2\4k\3\2\2\2\6p\3"
            + "\2\2\2\b\u0082\3\2\2\2\n\u0084\3\2\2\2\f\u0094\3\2\2\2\16\u00a5\3\2\2"
            + "\2\20\u00ad\3\2\2\2\22\u00b1\3\2\2\2\24\u00b9\3\2\2\2\26\u00bb\3\2\2\2"
            + "\30\u00c0\3\2\2\2\32\u00cf\3\2\2\2\34\u00d9\3\2\2\2\36\u00db\3\2\2\2 "
            + "\u00dd\3\2\2\2\"\u00fe\3\2\2\2$\u0101\3\2\2\2&\u0104\3\2\2\2(\u0111\3"
            + "\2\2\2*\u0113\3\2\2\2,\u0119\3\2\2\2.\u016a\3\2\2\2\60\u0170\3\2\2\2\62"
            + "\u0174\3\2\2\2\64\u0176\3\2\2\2\66\u017b\3\2\2\28\u0181\3\2\2\2:\u0185"
            + "\3\2\2\2<\u018a\3\2\2\2>\u018c\3\2\2\2@\u0194\3\2\2\2B\u0197\3\2\2\2D"
            + "\u0199\3\2\2\2F\u01a4\3\2\2\2H\u01ae\3\2\2\2J\u01c5\3\2\2\2L\u01e2\3\2"
            + "\2\2N\u01e4\3\2\2\2P\u01e6\3\2\2\2R\u01f1\3\2\2\2T\u01fc\3\2\2\2V\u0202"
            + "\3\2\2\2X\u020b\3\2\2\2Z\u020d\3\2\2\2\\`\b\2\1\2]_\5\6\4\2^]\3\2\2\2"
            + "_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7-\2\2de\5*\26\2"
            + "ef\7/\2\2fg\b\2\1\2g\3\3\2\2\2hj\5\6\4\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2"
            + "kl\3\2\2\2l\5\3\2\2\2mk\3\2\2\2nq\5\b\5\2oq\5\"\22\2pn\3\2\2\2po\3\2\2"
            + "\2q\7\3\2\2\2rs\7:\2\2s\u0083\5\n\6\2tu\7\4\2\2uv\7?\2\2vw\7\'\2\2wx\5"
            + "\34\17\2xy\b\5\1\2yz\7\26\2\2z{\5\36\20\2{\u0083\3\2\2\2|}\7\t\2\2}~\7"
            + "?\2\2~\177\7\'\2\2\177\u0080\5\24\13\2\u0080\u0081\b\5\1\2\u0081\u0083"
            + "\3\2\2\2\u0082r\3\2\2\2\u0082t\3\2\2\2\u0082|\3\2\2\2\u0083\t\3\2\2\2"
            + "\u0084\u0085\7?\2\2\u0085\u0086\b\6\1\2\u0086\u008d\5\20\t\2\u0087\u0088"
            + "\7$\2\2\u0088\u0089\7?\2\2\u0089\u008a\b\6\1\2\u008a\u008c\5\20\t\2\u008b"
            + "\u0087\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"
            + "\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\'\2\2\u0091"
            + "\u0092\5\24\13\2\u0092\u0093\b\6\1\2\u0093\13\3\2\2\2\u0094\u0095\5\16"
            + "\b\2\u0095\u0096\7?\2\2\u0096\u009b\b\7\1\2\u0097\u0098\7\62\2\2\u0098"
            + "\u009a\7?\2\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2"
            + "\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e"
            + "\u009f\5\20\t\2\u009f\u00a0\5\22\n\2\u00a0\r\3\2\2\2\u00a1\u00a2\7\61"
            + "\2\2\u00a2\u00a4\b\b\1\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"
            + "\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\17\3\2\2\2\u00a7\u00a5\3\2\2"
            + "\2\u00a8\u00a9\7\b\2\2\u00a9\u00aa\5D#\2\u00aa\u00ab\7!\2\2\u00ab\u00ac"
            + "\5\20\t\2\u00ac\u00ae\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00ae\3\2\2\2"
            + "\u00ae\21\3\2\2\2\u00af\u00b0\7\62\2\2\u00b0\u00b2\5\f\7\2\u00b1\u00af"
            + "\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\23\3\2\2\2\u00b3\u00b4\5 \21\2\u00b4"
            + "\u00b5\b\13\1\2\u00b5\u00ba\3\2\2\2\u00b6\u00b7\5\26\f\2\u00b7\u00b8\b"
            + "\13\1\2\u00b8\u00ba\3\2\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba"
            + "\25\3\2\2\2\u00bb\u00bc\5\16\b\2\u00bc\u00bd\b\f\1\2\u00bd\u00be\5\32"
            + "\16\2\u00be\u00bf\b\f\1\2\u00bf\27\3\2\2\2\u00c0\u00c7\b\r\1\2\u00c1\u00c2"
            + "\7$\2\2\u00c2\u00c3\5\f\7\2\u00c3\u00c4\b\r\1\2\u00c4\u00c6\3\2\2\2\u00c5"
            + "\u00c1\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2"
            + "\2\2\u00c8\31\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\5\34\17\2\u00cb"
            + "\u00cc\b\16\1\2\u00cc\u00d0\3\2\2\2\u00cd\u00ce\7?\2\2\u00ce\u00d0\b\16"
            + "\1\2\u00cf\u00ca\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\33\3\2\2\2\u00d1\u00d2"
            + "\7\31\2\2\u00d2\u00da\b\17\1\2\u00d3\u00d4\7\17\2\2\u00d4\u00da\b\17\1"
            + "\2\u00d5\u00d6\7\37\2\2\u00d6\u00da\b\17\1\2\u00d7\u00d8\7,\2\2\u00d8"
            + "\u00da\b\17\1\2\u00d9\u00d1\3\2\2\2\u00d9\u00d3\3\2\2\2\u00d9\u00d5\3"
            + "\2\2\2\u00d9\u00d7\3\2\2\2\u00da\35\3\2\2\2\u00db\u00dc\t\2\2\2\u00dc"
            + "\37\3\2\2\2\u00dd\u00de\78\2\2\u00de\u00e0\b\21\1\2\u00df\u00e1\5\n\6"
            + "\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3"
            + "\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\b\21\1\2\u00e5\u00e6\7\20\2\2"
            + "\u00e6!\3\2\2\2\u00e7\u00e8\b\22\1\2\u00e8\u00e9\7=\2\2\u00e9\u00ea\7"
            + "?\2\2\u00ea\u00eb\7(\2\2\u00eb\u00ec\5$\23\2\u00ec\u00ed\7\24\2\2\u00ed"
            + "\u00ee\5(\25\2\u00ee\u00ef\5,\27\2\u00ef\u00f0\7\13\2\2\u00f0\u00f1\b"
            + "\22\1\2\u00f1\u00ff\3\2\2\2\u00f2\u00f3\b\22\1\2\u00f3\u00f4\7\32\2\2"
            + "\u00f4\u00f5\7?\2\2\u00f5\u00f6\7(\2\2\u00f6\u00f7\5$\23\2\u00f7\u00f8"
            + "\7)\2\2\u00f8\u00f9\5\26\f\2\u00f9\u00fa\5(\25\2\u00fa\u00fb\5,\27\2\u00fb"
            + "\u00fc\7 \2\2\u00fc\u00fd\b\22\1\2\u00fd\u00ff\3\2\2\2\u00fe\u00e7\3\2"
            + "\2\2\u00fe\u00f2\3\2\2\2\u00ff#\3\2\2\2\u0100\u0102\5&\24\2\u0101\u0100"
            + "\3\2\2\2\u0101\u0102\3\2\2\2\u0102%\3\2\2\2\u0103\u0105\7*\2\2\u0104\u0103"
            + "\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\5\f\7\2\u0107"
            + "\u0108\5\30\r\2\u0108\u0109\7\'\2\2\u0109\u010c\5\26\f\2\u010a\u010b\7"
            + "$\2\2\u010b\u010d\5&\24\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"
            + "\'\3\2\2\2\u010e\u010f\5\b\5\2\u010f\u0110\5(\25\2\u0110\u0112\3\2\2\2"
            + "\u0111\u010e\3\2\2\2\u0111\u0112\3\2\2\2\u0112)\3\2\2\2\u0113\u0114\5"
            + "(\25\2\u0114\u0115\5,\27\2\u0115+\3\2\2\2\u0116\u0118\5.\30\2\u0117\u0116"
            + "\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"
            + "-\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7\27\2\2\u011d\u011e\7(\2\2"
            + "\u011e\u011f\5\f\7\2\u011f\u0120\b\30\1\2\u0120\u0121\5\30\r\2\u0121\u0122"
            + "\b\30\1\2\u0122\u0123\7\24\2\2\u0123\u016b\3\2\2\2\u0124\u0125\7\34\2"
            + "\2\u0125\u0126\7(\2\2\u0126\u0127\5P)\2\u0127\u0128\5\60\31\2\u0128\u0129"
            + "\7\24\2\2\u0129\u016b\3\2\2\2\u012a\u012b\7+\2\2\u012b\u012c\5P)\2\u012c"
            + "\u012d\7&\2\2\u012d\u012e\5,\27\2\u012e\u012f\5\62\32\2\u012f\u0130\7"
            + "\33\2\2\u0130\u016b\3\2\2\2\u0131\u0132\7\30\2\2\u0132\u0133\5D#\2\u0133"
            + "\u0134\79\2\2\u0134\u0135\58\35\2\u0135\u0136\5\62\32\2\u0136\u0137\7"
            + "\36\2\2\u0137\u016b\3\2\2\2\u0138\u0139\7\21\2\2\u0139\u013a\b\30\1\2"
            + "\u013a\u013b\7?\2\2\u013b\u013c\b\30\1\2\u013c\u013d\7.\2\2\u013d\u013e"
            + "\5D#\2\u013e\u013f\7\16\2\2\u013f\u0140\5D#\2\u0140\u0141\7\6\2\2\u0141"
            + "\u0142\5,\27\2\u0142\u0143\7\"\2\2\u0143\u0144\b\30\1\2\u0144\u016b\3"
            + "\2\2\2\u0145\u0146\7\23\2\2\u0146\u0147\5P)\2\u0147\u0148\7\6\2\2\u0148"
            + "\u0149\5,\27\2\u0149\u014a\7\r\2\2\u014a\u016b\3\2\2\2\u014b\u014c\7\6"
            + "\2\2\u014c\u014d\5,\27\2\u014d\u014e\7\16\2\2\u014e\u014f\5P)\2\u014f"
            + "\u016b\3\2\2\2\u0150\u0151\7\61\2\2\u0151\u0152\7?\2\2\u0152\u0153\b\30"
            + "\1\2\u0153\u0154\5\22\n\2\u0154\u0155\5\20\t\2\u0155\u0156\7.\2\2\u0156"
            + "\u0157\5P)\2\u0157\u0158\b\30\1\2\u0158\u016b\3\2\2\2\u0159\u015a\7?\2"
            + "\2\u015a\u015b\b\30\1\2\u015b\u015c\7(\2\2\u015c\u015d\5\66\34\2\u015d"
            + "\u015e\7\24\2\2\u015e\u016b\3\2\2\2\u015f\u0160\7?\2\2\u0160\u0161\5\22"
            + "\n\2\u0161\u0162\5\20\t\2\u0162\u0163\7.\2\2\u0163\u0164\5P)\2\u0164\u0165"
            + "\b\30\1\2\u0165\u016b\3\2\2\2\u0166\u0167\7>\2\2\u0167\u0168\5P)\2\u0168"
            + "\u0169\b\30\1\2\u0169\u016b\3\2\2\2\u016a\u011c\3\2\2\2\u016a\u0124\3"
            + "\2\2\2\u016a\u012a\3\2\2\2\u016a\u0131\3\2\2\2\u016a\u0138\3\2\2\2\u016a"
            + "\u0145\3\2\2\2\u016a\u014b\3\2\2\2\u016a\u0150\3\2\2\2\u016a\u0159\3\2"
            + "\2\2\u016a\u015f\3\2\2\2\u016a\u0166\3\2\2\2\u016b/\3\2\2\2\u016c\u016d"
            + "\7$\2\2\u016d\u016e\5P)\2\u016e\u016f\5\60\31\2\u016f\u0171\3\2\2\2\u0170"
            + "\u016c\3\2\2\2\u0170\u0171\3\2\2\2\u0171\61\3\2\2\2\u0172\u0173\7\25\2"
            + "\2\u0173\u0175\5,\27\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\63"
            + "\3\2\2\2\u0176\u0177\3\2\2\2\u0177\65\3\2\2\2\u0178\u0179\5P)\2\u0179"
            + "\u017a\5\60\31\2\u017a\u017c\3\2\2\2\u017b\u0178\3\2\2\2\u017b\u017c\3"
            + "\2\2\2\u017c\67\3\2\2\2\u017d\u017e\5:\36\2\u017e\u017f\7\'\2\2\u017f"
            + "\u0180\5,\27\2\u0180\u0182\3\2\2\2\u0181\u017d\3\2\2\2\u0182\u0183\3\2"
            + "\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u01849\3\2\2\2\u0185\u0186"
            + "\5> \2\u0186\u0187\5<\37\2\u0187;\3\2\2\2\u0188\u0189\7$\2\2\u0189\u018b"
            + "\5:\36\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b=\3\2\2\2\u018c"
            + "\u018d\5B\"\2\u018d\u018e\7A\2\2\u018e\u018f\5@!\2\u018f?\3\2\2\2\u0190"
            + "\u0191\7\35\2\2\u0191\u0192\5B\"\2\u0192\u0193\7A\2\2\u0193\u0195\3\2"
            + "\2\2\u0194\u0190\3\2\2\2\u0194\u0195\3\2\2\2\u0195A\3\2\2\2\u0196\u0198"
            + "\7%\2\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198C\3\2\2\2\u0199\u019a"
            + "\5F$\2\u019a\u01a1\b#\1\2\u019b\u019c\t\3\2\2\u019c\u019d\5F$\2\u019d"
            + "\u019e\b#\1\2\u019e\u01a0\3\2\2\2\u019f\u019b\3\2\2\2\u01a0\u01a3\3\2"
            + "\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2E\3\2\2\2\u01a3\u01a1"
            + "\3\2\2\2\u01a4\u01a5\5H%\2\u01a5\u01ab\b$\1\2\u01a6\u01a7\t\4\2\2\u01a7"
            + "\u01a8\b$\1\2\u01a8\u01aa\5H%\2\u01a9\u01a6\3\2\2\2\u01aa\u01ad\3\2\2"
            + "\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01acG\3\2\2\2\u01ad\u01ab"
            + "\3\2\2\2\u01ae\u01af\5J&\2\u01af\u01b6\b%\1\2\u01b0\u01b1\7\22\2\2\u01b1"
            + "\u01b2\5J&\2\u01b2\u01b3\b%\1\2\u01b3\u01b5\3\2\2\2\u01b4\u01b0\3\2\2"
            + "\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7I"
            + "\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01ba\5B\"\2\u01ba\u01bb\5L\'\2\u01bb"
            + "\u01bc\b&\1\2\u01bc\u01c6\3\2\2\2\u01bd\u01be\7\3\2\2\u01be\u01bf\7?\2"
            + "\2\u01bf\u01c0\b&\1\2\u01c0\u01c1\5\22\n\2\u01c1\u01c2\5\20\t\2\u01c2"
            + "\u01c6\3\2\2\2\u01c3\u01c4\7@\2\2\u01c4\u01c6\b&\1\2\u01c5\u01b9\3\2\2"
            + "\2\u01c5\u01bd\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6K\3\2\2\2\u01c7\u01c8"
            + "\7\61\2\2\u01c8\u01c9\7?\2\2\u01c9\u01ca\b\'\1\2\u01ca\u01cb\5\22\n\2"
            + "\u01cb\u01cc\5\20\t\2\u01cc\u01e3\3\2\2\2\u01cd\u01ce\7?\2\2\u01ce\u01cf"
            + "\b\'\1\2\u01cf\u01d0\5\22\n\2\u01d0\u01d1\5\20\t\2\u01d1\u01e3\3\2\2\2"
            + "\u01d2\u01d3\7?\2\2\u01d3\u01d4\b\'\1\2\u01d4\u01d5\7(\2\2\u01d5\u01d6"
            + "\5P)\2\u01d6\u01d7\5\60\31\2\u01d7\u01d8\7\24\2\2\u01d8\u01e3\3\2\2\2"
            + "\u01d9\u01da\7A\2\2\u01da\u01e3\b\'\1\2\u01db\u01dc\7B\2\2\u01dc\u01e3"
            + "\b\'\1\2\u01dd\u01de\7(\2\2\u01de\u01df\5P)\2\u01df\u01e0\7\24\2\2\u01e0"
            + "\u01e1\b\'\1\2\u01e1\u01e3\3\2\2\2\u01e2\u01c7\3\2\2\2\u01e2\u01cd\3\2"
            + "\2\2\u01e2\u01d2\3\2\2\2\u01e2\u01d9\3\2\2\2\u01e2\u01db\3\2\2\2\u01e2"
            + "\u01dd\3\2\2\2\u01e3M\3\2\2\2\u01e4\u01e5\t\5\2\2\u01e5O\3\2\2\2\u01e6"
            + "\u01e7\5R*\2\u01e7\u01ee\b)\1\2\u01e8\u01e9\7\64\2\2\u01e9\u01ea\5R*\2"
            + "\u01ea\u01eb\b)\1\2\u01eb\u01ed\3\2\2\2\u01ec\u01e8\3\2\2\2\u01ed\u01f0"
            + "\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01efQ\3\2\2\2\u01f0"
            + "\u01ee\3\2\2\2\u01f1\u01f2\5T+\2\u01f2\u01f9\b*\1\2\u01f3\u01f4\7\66\2"
            + "\2\u01f4\u01f5\5T+\2\u01f5\u01f6\b*\1\2\u01f6\u01f8\3\2\2\2\u01f7\u01f3"
            + "\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"
            + "S\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01fd\5V,\2\u01fd\u01fe\5X-\2\u01fe"
            + "\u01ff\b+\1\2\u01ffU\3\2\2\2\u0200\u0201\7\5\2\2\u0201\u0203\b,\1\2\u0202"
            + "\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203W\3\2\2\2\u0204\u0205\7#\2\2\u0205"
            + "\u020c\b-\1\2\u0206\u0207\7\60\2\2\u0207\u020c\b-\1\2\u0208\u0209\5Z."
            + "\2\u0209\u020a\b-\1\2\u020a\u020c\3\2\2\2\u020b\u0204\3\2\2\2\u020b\u0206"
            + "\3\2\2\2\u020b\u0208\3\2\2\2\u020cY\3\2\2\2\u020d\u020e\5D#\2\u020e\u0213"
            + "\b.\1\2\u020f\u0210\5N(\2\u0210\u0211\5D#\2\u0211\u0212\b.\1\2\u0212\u0214"
            + "\3\2\2\2\u0213\u020f\3\2\2\2\u0213\u0214\3\2\2\2\u0214[\3\2\2\2(`kp\u0082"
            + "\u008d\u009b\u00a5\u00ad\u00b1\u00b9\u00c7\u00cf\u00d9\u00e2\u00fe\u0101"
            + "\u0104\u010c\u0111\u0119\u016a\u0170\u0174\u017b\u0183\u018a\u0194\u0197"
            + "\u01a1\u01ab\u01b6\u01c5\u01e2\u01ee\u01f9\u0202\u020b\u0213";
    public static final ATN _ATN =
            ATNSimulator.deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}