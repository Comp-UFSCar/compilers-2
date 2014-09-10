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
	 * Enter a parse tree produced by {@link LaParser#optional_pointers}.
	 * @param ctx the parse tree
	 */
	void enterOptional_pointers(@NotNull LaParser.Optional_pointersContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#optional_pointers}.
	 * @param ctx the parse tree
	 */
	void exitOptional_pointers(@NotNull LaParser.Optional_pointersContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#add_op}.
	 * @param ctx the parse tree
	 */
	void enterAdd_op(@NotNull LaParser.Add_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#add_op}.
	 * @param ctx the parse tree
	 */
	void exitAdd_op(@NotNull LaParser.Add_opContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull LaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull LaParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#local_declarations}.
	 * @param ctx the parse tree
	 */
	void enterLocal_declarations(@NotNull LaParser.Local_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#local_declarations}.
	 * @param ctx the parse tree
	 */
	void exitLocal_declarations(@NotNull LaParser.Local_declarationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull LaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull LaParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(@NotNull LaParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(@NotNull LaParser.BodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#mais_constants}.
	 * @param ctx the parse tree
	 */
	void enterMais_constants(@NotNull LaParser.Mais_constantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#mais_constants}.
	 * @param ctx the parse tree
	 */
	void exitMais_constants(@NotNull LaParser.Mais_constantsContext ctx);

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
	 * Enter a parse tree produced by {@link LaParser#other_identifiers}.
	 * @param ctx the parse tree
	 */
	void enterOther_identifiers(@NotNull LaParser.Other_identifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#other_identifiers}.
	 * @param ctx the parse tree
	 */
	void exitOther_identifiers(@NotNull LaParser.Other_identifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#optional_else}.
	 * @param ctx the parse tree
	 */
	void enterOptional_else(@NotNull LaParser.Optional_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#optional_else}.
	 * @param ctx the parse tree
	 */
	void exitOptional_else(@NotNull LaParser.Optional_elseContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#other_terms}.
	 * @param ctx the parse tree
	 */
	void enterOther_terms(@NotNull LaParser.Other_termsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#other_terms}.
	 * @param ctx the parse tree
	 */
	void exitOther_terms(@NotNull LaParser.Other_termsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#outros_factores}.
	 * @param ctx the parse tree
	 */
	void enterOutros_factores(@NotNull LaParser.Outros_factoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#outros_factores}.
	 * @param ctx the parse tree
	 */
	void exitOutros_factores(@NotNull LaParser.Outros_factoresContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull LaParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull LaParser.ParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#extended_type}.
	 * @param ctx the parse tree
	 */
	void enterExtended_type(@NotNull LaParser.Extended_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#extended_type}.
	 * @param ctx the parse tree
	 */
	void exitExtended_type(@NotNull LaParser.Extended_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull LaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull LaParser.TermContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#constants}.
	 * @param ctx the parse tree
	 */
	void enterConstants(@NotNull LaParser.ConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#constants}.
	 * @param ctx the parse tree
	 */
	void exitConstants(@NotNull LaParser.ConstantsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull LaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull LaParser.FactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#comands}.
	 * @param ctx the parse tree
	 */
	void enterComands(@NotNull LaParser.ComandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#comands}.
	 * @param ctx the parse tree
	 */
	void exitComands(@NotNull LaParser.ComandsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#more_expression}.
	 * @param ctx the parse tree
	 */
	void enterMore_expression(@NotNull LaParser.More_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#more_expression}.
	 * @param ctx the parse tree
	 */
	void exitMore_expression(@NotNull LaParser.More_expressionContext ctx);

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
	 * Enter a parse tree produced by {@link LaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull LaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull LaParser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#optional_params}.
	 * @param ctx the parse tree
	 */
	void enterOptional_params(@NotNull LaParser.Optional_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#optional_params}.
	 * @param ctx the parse tree
	 */
	void exitOptional_params(@NotNull LaParser.Optional_paramsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull LaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull LaParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#interval_number}.
	 * @param ctx the parse tree
	 */
	void enterInterval_number(@NotNull LaParser.Interval_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#interval_number}.
	 * @param ctx the parse tree
	 */
	void exitInterval_number(@NotNull LaParser.Interval_numberContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#logical_term}.
	 * @param ctx the parse tree
	 */
	void enterLogical_term(@NotNull LaParser.Logical_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#logical_term}.
	 * @param ctx the parse tree
	 */
	void exitLogical_term(@NotNull LaParser.Logical_termContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#const_value}.
	 * @param ctx the parse tree
	 */
	void enterConst_value(@NotNull LaParser.Const_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#const_value}.
	 * @param ctx the parse tree
	 */
	void exitConst_value(@NotNull LaParser.Const_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#basic_type}.
	 * @param ctx the parse tree
	 */
	void enterBasic_type(@NotNull LaParser.Basic_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#basic_type}.
	 * @param ctx the parse tree
	 */
	void exitBasic_type(@NotNull LaParser.Basic_typeContext ctx);

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
	 * Enter a parse tree produced by {@link LaParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operator(@NotNull LaParser.Relational_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operator(@NotNull LaParser.Relational_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(@NotNull LaParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(@NotNull LaParser.DeclarationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#optional_arguments}.
	 * @param ctx the parse tree
	 */
	void enterOptional_arguments(@NotNull LaParser.Optional_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#optional_arguments}.
	 * @param ctx the parse tree
	 */
	void exitOptional_arguments(@NotNull LaParser.Optional_argumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#local_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLocal_declaration(@NotNull LaParser.Local_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#local_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLocal_declaration(@NotNull LaParser.Local_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#global_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_declaration(@NotNull LaParser.Global_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#global_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_declaration(@NotNull LaParser.Global_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(@NotNull LaParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(@NotNull LaParser.SizeContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#selection}.
	 * @param ctx the parse tree
	 */
	void enterSelection(@NotNull LaParser.SelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#selection}.
	 * @param ctx the parse tree
	 */
	void exitSelection(@NotNull LaParser.SelectionContext ctx);

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
	 * Enter a parse tree produced by {@link LaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull LaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull LaParser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#logical_factor}.
	 * @param ctx the parse tree
	 */
	void enterLogical_factor(@NotNull LaParser.Logical_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#logical_factor}.
	 * @param ctx the parse tree
	 */
	void exitLogical_factor(@NotNull LaParser.Logical_factorContext ctx);

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
	 * Enter a parse tree produced by {@link LaParser#register}.
	 * @param ctx the parse tree
	 */
	void enterRegister(@NotNull LaParser.RegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#register}.
	 * @param ctx the parse tree
	 */
	void exitRegister(@NotNull LaParser.RegisterContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaParser#more_identifier}.
	 * @param ctx the parse tree
	 */
	void enterMore_identifier(@NotNull LaParser.More_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#more_identifier}.
	 * @param ctx the parse tree
	 */
	void exitMore_identifier(@NotNull LaParser.More_identifierContext ctx);
}