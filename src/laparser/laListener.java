// Generated from D:\Repositories\Compilers-2-assignment-1\src\grammar\La.g4 by ANTLR 4.1
package laparser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LaParser}.
 */
public interface LaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull LaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull LaParser.TipoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#var_opcional}.
	 * @param ctx the parse tree
	 */
	void enterVar_opcional(@NotNull LaParser.Var_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#var_opcional}.
	 * @param ctx the parse tree
	 */
	void exitVar_opcional(@NotNull LaParser.Var_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(@NotNull LaParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(@NotNull LaParser.Fator_logicoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(@NotNull LaParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(@NotNull LaParser.Parcela_logicaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#declaracoes_locais}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes_locais(@NotNull LaParser.Declaracoes_locaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#declaracoes_locais}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes_locais(@NotNull LaParser.Declaracoes_locaisContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull LaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull LaParser.ProgramaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(@NotNull LaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(@NotNull LaParser.ExpressaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#op_multiplicacao}.
	 * @param ctx the parse tree
	 */
	void enterOp_multiplicacao(@NotNull LaParser.Op_multiplicacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#op_multiplicacao}.
	 * @param ctx the parse tree
	 */
	void exitOp_multiplicacao(@NotNull LaParser.Op_multiplicacaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(@NotNull LaParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(@NotNull LaParser.DeclaracoesContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#ponteiros_opcionais}.
	 * @param ctx the parse tree
	 */
	void enterPonteiros_opcionais(@NotNull LaParser.Ponteiros_opcionaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#ponteiros_opcionais}.
	 * @param ctx the parse tree
	 */
	void exitPonteiros_opcionais(@NotNull LaParser.Ponteiros_opcionaisContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(@NotNull LaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(@NotNull LaParser.TermoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#outros_fatores}.
	 * @param ctx the parse tree
	 */
	void enterOutros_fatores(@NotNull LaParser.Outros_fatoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#outros_fatores}.
	 * @param ctx the parse tree
	 */
	void exitOutros_fatores(@NotNull LaParser.Outros_fatoresContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(@NotNull LaParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(@NotNull LaParser.Tipo_basico_identContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#op_opcional}.
	 * @param ctx the parse tree
	 */
	void enterOp_opcional(@NotNull LaParser.Op_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#op_opcional}.
	 * @param ctx the parse tree
	 */
	void exitOp_opcional(@NotNull LaParser.Op_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#mais_ident}.
	 * @param ctx the parse tree
	 */
	void enterMais_ident(@NotNull LaParser.Mais_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#mais_ident}.
	 * @param ctx the parse tree
	 */
	void exitMais_ident(@NotNull LaParser.Mais_identContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(@NotNull LaParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(@NotNull LaParser.CorpoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(@NotNull LaParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(@NotNull LaParser.Declaracao_localContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(@NotNull LaParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(@NotNull LaParser.Exp_relacionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#senao_opcional}.
	 * @param ctx the parse tree
	 */
	void enterSenao_opcional(@NotNull LaParser.Senao_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#senao_opcional}.
	 * @param ctx the parse tree
	 */
	void exitSenao_opcional(@NotNull LaParser.Senao_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(@NotNull LaParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(@NotNull LaParser.Termo_logicoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(@NotNull LaParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(@NotNull LaParser.DimensaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#mais_selecao}.
	 * @param ctx the parse tree
	 */
	void enterMais_selecao(@NotNull LaParser.Mais_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#mais_selecao}.
	 * @param ctx the parse tree
	 */
	void exitMais_selecao(@NotNull LaParser.Mais_selecaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(@NotNull LaParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(@NotNull LaParser.VariavelContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(@NotNull LaParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(@NotNull LaParser.CmdContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(@NotNull LaParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(@NotNull LaParser.Declaracao_globalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(@NotNull LaParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(@NotNull LaParser.Parcela_nao_unarioContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(@NotNull LaParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(@NotNull LaParser.SelecaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(@NotNull LaParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(@NotNull LaParser.Tipo_estendidoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(@NotNull LaParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(@NotNull LaParser.ParametroContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(@NotNull LaParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(@NotNull LaParser.Op_unarioContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#mais_parametros}.
	 * @param ctx the parse tree
	 */
	void enterMais_parametros(@NotNull LaParser.Mais_parametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#mais_parametros}.
	 * @param ctx the parse tree
	 */
	void exitMais_parametros(@NotNull LaParser.Mais_parametrosContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(@NotNull LaParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(@NotNull LaParser.ParcelaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#op_adicao}.
	 * @param ctx the parse tree
	 */
	void enterOp_adicao(@NotNull LaParser.Op_adicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#op_adicao}.
	 * @param ctx the parse tree
	 */
	void exitOp_adicao(@NotNull LaParser.Op_adicaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#intervalo_opcional}.
	 * @param ctx the parse tree
	 */
	void enterIntervalo_opcional(@NotNull LaParser.Intervalo_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#intervalo_opcional}.
	 * @param ctx the parse tree
	 */
	void exitIntervalo_opcional(@NotNull LaParser.Intervalo_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(@NotNull LaParser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(@NotNull LaParser.Decl_local_globalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#outros_ident}.
	 * @param ctx the parse tree
	 */
	void enterOutros_ident(@NotNull LaParser.Outros_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#outros_ident}.
	 * @param ctx the parse tree
	 */
	void exitOutros_ident(@NotNull LaParser.Outros_identContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#mais_variaveis}.
	 * @param ctx the parse tree
	 */
	void enterMais_variaveis(@NotNull LaParser.Mais_variaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#mais_variaveis}.
	 * @param ctx the parse tree
	 */
	void exitMais_variaveis(@NotNull LaParser.Mais_variaveisContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#outros_fatores_logicos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_fatores_logicos(@NotNull LaParser.Outros_fatores_logicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#outros_fatores_logicos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_fatores_logicos(@NotNull LaParser.Outros_fatores_logicosContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#mais_expressao}.
	 * @param ctx the parse tree
	 */
	void enterMais_expressao(@NotNull LaParser.Mais_expressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#mais_expressao}.
	 * @param ctx the parse tree
	 */
	void exitMais_expressao(@NotNull LaParser.Mais_expressaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(@NotNull LaParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(@NotNull LaParser.Valor_constanteContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(@NotNull LaParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(@NotNull LaParser.Parcela_unarioContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#parametros_opcional}.
	 * @param ctx the parse tree
	 */
	void enterParametros_opcional(@NotNull LaParser.Parametros_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#parametros_opcional}.
	 * @param ctx the parse tree
	 */
	void exitParametros_opcional(@NotNull LaParser.Parametros_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#outros_termos_logicos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos_logicos(@NotNull LaParser.Outros_termos_logicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#outros_termos_logicos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos_logicos(@NotNull LaParser.Outros_termos_logicosContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(@NotNull LaParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(@NotNull LaParser.Tipo_basicoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(@NotNull LaParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(@NotNull LaParser.ComandosContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos(@NotNull LaParser.Outros_termosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos(@NotNull LaParser.Outros_termosContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(@NotNull LaParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(@NotNull LaParser.Exp_aritmeticaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void enterMais_var(@NotNull LaParser.Mais_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void exitMais_var(@NotNull LaParser.Mais_varContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(@NotNull LaParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(@NotNull LaParser.RegistroContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(@NotNull LaParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(@NotNull LaParser.ConstantesContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#mais_constantes}.
	 * @param ctx the parse tree
	 */
	void enterMais_constantes(@NotNull LaParser.Mais_constantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#mais_constantes}.
	 * @param ctx the parse tree
	 */
	void exitMais_constantes(@NotNull LaParser.Mais_constantesContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#outras_parcelas}.
	 * @param ctx the parse tree
	 */
	void enterOutras_parcelas(@NotNull LaParser.Outras_parcelasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#outras_parcelas}.
	 * @param ctx the parse tree
	 */
	void exitOutras_parcelas(@NotNull LaParser.Outras_parcelasContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(@NotNull LaParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(@NotNull LaParser.FatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(@NotNull LaParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(@NotNull LaParser.Op_relacionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#argumentos_opcional}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos_opcional(@NotNull LaParser.Argumentos_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#argumentos_opcional}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos_opcional(@NotNull LaParser.Argumentos_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#chamada_atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterChamada_atribuicao(@NotNull LaParser.Chamada_atribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#chamada_atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitChamada_atribuicao(@NotNull LaParser.Chamada_atribuicaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(@NotNull LaParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(@NotNull LaParser.IdentificadorContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(@NotNull LaParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(@NotNull LaParser.Numero_intervaloContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#op_nao}.
	 * @param ctx the parse tree
	 */
	void enterOp_nao(@NotNull LaParser.Op_naoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#op_nao}.
	 * @param ctx the parse tree
	 */
	void exitOp_nao(@NotNull LaParser.Op_naoContext ctx);
}