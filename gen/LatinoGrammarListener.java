// Generated from /home/carlos/languages/Traductor/grammar/LatinoGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LatinoGrammarParser}.
 */
public interface LatinoGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#main_program}.
	 * @param ctx the parse tree
	 */
	void enterMain_program(LatinoGrammarParser.Main_programContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#main_program}.
	 * @param ctx the parse tree
	 */
	void exitMain_program(LatinoGrammarParser.Main_programContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#substatement}.
	 * @param ctx the parse tree
	 */
	void enterSubstatement(LatinoGrammarParser.SubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#substatement}.
	 * @param ctx the parse tree
	 */
	void exitSubstatement(LatinoGrammarParser.SubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LatinoGrammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LatinoGrammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#assignAux}.
	 * @param ctx the parse tree
	 */
	void enterAssignAux(LatinoGrammarParser.AssignAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#assignAux}.
	 * @param ctx the parse tree
	 */
	void exitAssignAux(LatinoGrammarParser.AssignAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(LatinoGrammarParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(LatinoGrammarParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#assignIncrDecr}.
	 * @param ctx the parse tree
	 */
	void enterAssignIncrDecr(LatinoGrammarParser.AssignIncrDecrContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#assignIncrDecr}.
	 * @param ctx the parse tree
	 */
	void exitAssignIncrDecr(LatinoGrammarParser.AssignIncrDecrContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterBuilt_in_functions(LatinoGrammarParser.Built_in_functionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitBuilt_in_functions(LatinoGrammarParser.Built_in_functionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#acadena_stat}.
	 * @param ctx the parse tree
	 */
	void enterAcadena_stat(LatinoGrammarParser.Acadena_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#acadena_stat}.
	 * @param ctx the parse tree
	 */
	void exitAcadena_stat(LatinoGrammarParser.Acadena_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#incluir_stat}.
	 * @param ctx the parse tree
	 */
	void enterIncluir_stat(LatinoGrammarParser.Incluir_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#incluir_stat}.
	 * @param ctx the parse tree
	 */
	void exitIncluir_stat(LatinoGrammarParser.Incluir_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#leer_stat}.
	 * @param ctx the parse tree
	 */
	void enterLeer_stat(LatinoGrammarParser.Leer_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#leer_stat}.
	 * @param ctx the parse tree
	 */
	void exitLeer_stat(LatinoGrammarParser.Leer_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#limpiar_stat}.
	 * @param ctx the parse tree
	 */
	void enterLimpiar_stat(LatinoGrammarParser.Limpiar_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#limpiar_stat}.
	 * @param ctx the parse tree
	 */
	void exitLimpiar_stat(LatinoGrammarParser.Limpiar_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#alogico_stat}.
	 * @param ctx the parse tree
	 */
	void enterAlogico_stat(LatinoGrammarParser.Alogico_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#alogico_stat}.
	 * @param ctx the parse tree
	 */
	void exitAlogico_stat(LatinoGrammarParser.Alogico_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#anumero_stat}.
	 * @param ctx the parse tree
	 */
	void enterAnumero_stat(LatinoGrammarParser.Anumero_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#anumero_stat}.
	 * @param ctx the parse tree
	 */
	void exitAnumero_stat(LatinoGrammarParser.Anumero_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#print_stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stat(LatinoGrammarParser.Print_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#print_stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stat(LatinoGrammarParser.Print_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#print_stat_cont}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stat_cont(LatinoGrammarParser.Print_stat_contContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#print_stat_cont}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stat_cont(LatinoGrammarParser.Print_stat_contContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#print_operations}.
	 * @param ctx the parse tree
	 */
	void enterPrint_operations(LatinoGrammarParser.Print_operationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#print_operations}.
	 * @param ctx the parse tree
	 */
	void exitPrint_operations(LatinoGrammarParser.Print_operationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LatinoGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LatinoGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#exprRest}.
	 * @param ctx the parse tree
	 */
	void enterExprRest(LatinoGrammarParser.ExprRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#exprRest}.
	 * @param ctx the parse tree
	 */
	void exitExprRest(LatinoGrammarParser.ExprRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#expBool}.
	 * @param ctx the parse tree
	 */
	void enterExpBool(LatinoGrammarParser.ExpBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#expBool}.
	 * @param ctx the parse tree
	 */
	void exitExpBool(LatinoGrammarParser.ExpBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#expBoolRest}.
	 * @param ctx the parse tree
	 */
	void enterExpBoolRest(LatinoGrammarParser.ExpBoolRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#expBoolRest}.
	 * @param ctx the parse tree
	 */
	void exitExpBoolRest(LatinoGrammarParser.ExpBoolRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#opRel}.
	 * @param ctx the parse tree
	 */
	void enterOpRel(LatinoGrammarParser.OpRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#opRel}.
	 * @param ctx the parse tree
	 */
	void exitOpRel(LatinoGrammarParser.OpRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#expRel}.
	 * @param ctx the parse tree
	 */
	void enterExpRel(LatinoGrammarParser.ExpRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#expRel}.
	 * @param ctx the parse tree
	 */
	void exitExpRel(LatinoGrammarParser.ExpRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#exprConcat}.
	 * @param ctx the parse tree
	 */
	void enterExprConcat(LatinoGrammarParser.ExprConcatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#exprConcat}.
	 * @param ctx the parse tree
	 */
	void exitExprConcat(LatinoGrammarParser.ExprConcatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#exprConcatOp}.
	 * @param ctx the parse tree
	 */
	void enterExprConcatOp(LatinoGrammarParser.ExprConcatOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#exprConcatOp}.
	 * @param ctx the parse tree
	 */
	void exitExprConcatOp(LatinoGrammarParser.ExprConcatOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#expArit}.
	 * @param ctx the parse tree
	 */
	void enterExpArit(LatinoGrammarParser.ExpAritContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#expArit}.
	 * @param ctx the parse tree
	 */
	void exitExpArit(LatinoGrammarParser.ExpAritContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#expAritOp}.
	 * @param ctx the parse tree
	 */
	void enterExpAritOp(LatinoGrammarParser.ExpAritOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#expAritOp}.
	 * @param ctx the parse tree
	 */
	void exitExpAritOp(LatinoGrammarParser.ExpAritOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(LatinoGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(LatinoGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#termOp}.
	 * @param ctx the parse tree
	 */
	void enterTermOp(LatinoGrammarParser.TermOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#termOp}.
	 * @param ctx the parse tree
	 */
	void exitTermOp(LatinoGrammarParser.TermOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(LatinoGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(LatinoGrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#factorOp}.
	 * @param ctx the parse tree
	 */
	void enterFactorOp(LatinoGrammarParser.FactorOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#factorOp}.
	 * @param ctx the parse tree
	 */
	void exitFactorOp(LatinoGrammarParser.FactorOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#t_factor}.
	 * @param ctx the parse tree
	 */
	void enterT_factor(LatinoGrammarParser.T_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#t_factor}.
	 * @param ctx the parse tree
	 */
	void exitT_factor(LatinoGrammarParser.T_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#expr_terminals}.
	 * @param ctx the parse tree
	 */
	void enterExpr_terminals(LatinoGrammarParser.Expr_terminalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#expr_terminals}.
	 * @param ctx the parse tree
	 */
	void exitExpr_terminals(LatinoGrammarParser.Expr_terminalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#expr_factor}.
	 * @param ctx the parse tree
	 */
	void enterExpr_factor(LatinoGrammarParser.Expr_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#expr_factor}.
	 * @param ctx the parse tree
	 */
	void exitExpr_factor(LatinoGrammarParser.Expr_factorContext ctx);
}