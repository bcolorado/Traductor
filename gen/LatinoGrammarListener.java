// Generated from C:/Users/Usuario/Desktop/Lenguajes/Traductor/Traductor/grammar/LatinoGrammar.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link LatinoGrammarParser#array_printing}.
	 * @param ctx the parse tree
	 */
	void enterArray_printing(LatinoGrammarParser.Array_printingContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#array_printing}.
	 * @param ctx the parse tree
	 */
	void exitArray_printing(LatinoGrammarParser.Array_printingContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#function_stat}.
	 * @param ctx the parse tree
	 */
	void enterFunction_stat(LatinoGrammarParser.Function_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#function_stat}.
	 * @param ctx the parse tree
	 */
	void exitFunction_stat(LatinoGrammarParser.Function_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(LatinoGrammarParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(LatinoGrammarParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#function_op}.
	 * @param ctx the parse tree
	 */
	void enterFunction_op(LatinoGrammarParser.Function_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#function_op}.
	 * @param ctx the parse tree
	 */
	void exitFunction_op(LatinoGrammarParser.Function_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#function_pars}.
	 * @param ctx the parse tree
	 */
	void enterFunction_pars(LatinoGrammarParser.Function_parsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#function_pars}.
	 * @param ctx the parse tree
	 */
	void exitFunction_pars(LatinoGrammarParser.Function_parsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#function_args}.
	 * @param ctx the parse tree
	 */
	void enterFunction_args(LatinoGrammarParser.Function_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#function_args}.
	 * @param ctx the parse tree
	 */
	void exitFunction_args(LatinoGrammarParser.Function_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#function_args_aux}.
	 * @param ctx the parse tree
	 */
	void enterFunction_args_aux(LatinoGrammarParser.Function_args_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#function_args_aux}.
	 * @param ctx the parse tree
	 */
	void exitFunction_args_aux(LatinoGrammarParser.Function_args_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#function_ret}.
	 * @param ctx the parse tree
	 */
	void enterFunction_ret(LatinoGrammarParser.Function_retContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#function_ret}.
	 * @param ctx the parse tree
	 */
	void exitFunction_ret(LatinoGrammarParser.Function_retContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#function_ret_op}.
	 * @param ctx the parse tree
	 */
	void enterFunction_ret_op(LatinoGrammarParser.Function_ret_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#function_ret_op}.
	 * @param ctx the parse tree
	 */
	void exitFunction_ret_op(LatinoGrammarParser.Function_ret_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#function_content}.
	 * @param ctx the parse tree
	 */
	void enterFunction_content(LatinoGrammarParser.Function_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#function_content}.
	 * @param ctx the parse tree
	 */
	void exitFunction_content(LatinoGrammarParser.Function_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#special_methods}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_methods(LatinoGrammarParser.Special_methodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#special_methods}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_methods(LatinoGrammarParser.Special_methodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#longitud_method}.
	 * @param ctx the parse tree
	 */
	void enterLongitud_method(LatinoGrammarParser.Longitud_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#longitud_method}.
	 * @param ctx the parse tree
	 */
	void exitLongitud_method(LatinoGrammarParser.Longitud_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#brakets}.
	 * @param ctx the parse tree
	 */
	void enterBrakets(LatinoGrammarParser.BraketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#brakets}.
	 * @param ctx the parse tree
	 */
	void exitBrakets(LatinoGrammarParser.BraketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(LatinoGrammarParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(LatinoGrammarParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(LatinoGrammarParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(LatinoGrammarParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#array_content}.
	 * @param ctx the parse tree
	 */
	void enterArray_content(LatinoGrammarParser.Array_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#array_content}.
	 * @param ctx the parse tree
	 */
	void exitArray_content(LatinoGrammarParser.Array_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#array_content_aux}.
	 * @param ctx the parse tree
	 */
	void enterArray_content_aux(LatinoGrammarParser.Array_content_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#array_content_aux}.
	 * @param ctx the parse tree
	 */
	void exitArray_content_aux(LatinoGrammarParser.Array_content_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#conditionals}.
	 * @param ctx the parse tree
	 */
	void enterConditionals(LatinoGrammarParser.ConditionalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#conditionals}.
	 * @param ctx the parse tree
	 */
	void exitConditionals(LatinoGrammarParser.ConditionalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#loops}.
	 * @param ctx the parse tree
	 */
	void enterLoops(LatinoGrammarParser.LoopsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#loops}.
	 * @param ctx the parse tree
	 */
	void exitLoops(LatinoGrammarParser.LoopsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#if_conditional}.
	 * @param ctx the parse tree
	 */
	void enterIf_conditional(LatinoGrammarParser.If_conditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#if_conditional}.
	 * @param ctx the parse tree
	 */
	void exitIf_conditional(LatinoGrammarParser.If_conditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#conditional_expr}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expr(LatinoGrammarParser.Conditional_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#conditional_expr}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expr(LatinoGrammarParser.Conditional_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#conditional_substatement}.
	 * @param ctx the parse tree
	 */
	void enterConditional_substatement(LatinoGrammarParser.Conditional_substatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#conditional_substatement}.
	 * @param ctx the parse tree
	 */
	void exitConditional_substatement(LatinoGrammarParser.Conditional_substatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#if_conditional_aux}.
	 * @param ctx the parse tree
	 */
	void enterIf_conditional_aux(LatinoGrammarParser.If_conditional_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#if_conditional_aux}.
	 * @param ctx the parse tree
	 */
	void exitIf_conditional_aux(LatinoGrammarParser.If_conditional_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#swicth_condition}.
	 * @param ctx the parse tree
	 */
	void enterSwicth_condition(LatinoGrammarParser.Swicth_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#swicth_condition}.
	 * @param ctx the parse tree
	 */
	void exitSwicth_condition(LatinoGrammarParser.Swicth_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(LatinoGrammarParser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(LatinoGrammarParser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(LatinoGrammarParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(LatinoGrammarParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#caseClauseExpr}.
	 * @param ctx the parse tree
	 */
	void enterCaseClauseExpr(LatinoGrammarParser.CaseClauseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#caseClauseExpr}.
	 * @param ctx the parse tree
	 */
	void exitCaseClauseExpr(LatinoGrammarParser.CaseClauseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClause(LatinoGrammarParser.DefaultClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClause(LatinoGrammarParser.DefaultClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#otherClause}.
	 * @param ctx the parse tree
	 */
	void enterOtherClause(LatinoGrammarParser.OtherClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#otherClause}.
	 * @param ctx the parse tree
	 */
	void exitOtherClause(LatinoGrammarParser.OtherClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#romperOp}.
	 * @param ctx the parse tree
	 */
	void enterRomperOp(LatinoGrammarParser.RomperOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#romperOp}.
	 * @param ctx the parse tree
	 */
	void exitRomperOp(LatinoGrammarParser.RomperOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#mientras_loop}.
	 * @param ctx the parse tree
	 */
	void enterMientras_loop(LatinoGrammarParser.Mientras_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#mientras_loop}.
	 * @param ctx the parse tree
	 */
	void exitMientras_loop(LatinoGrammarParser.Mientras_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#desde_loop}.
	 * @param ctx the parse tree
	 */
	void enterDesde_loop(LatinoGrammarParser.Desde_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#desde_loop}.
	 * @param ctx the parse tree
	 */
	void exitDesde_loop(LatinoGrammarParser.Desde_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#loop_substatement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_substatement(LatinoGrammarParser.Loop_substatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#loop_substatement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_substatement(LatinoGrammarParser.Loop_substatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#triple_expr}.
	 * @param ctx the parse tree
	 */
	void enterTriple_expr(LatinoGrammarParser.Triple_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#triple_expr}.
	 * @param ctx the parse tree
	 */
	void exitTriple_expr(LatinoGrammarParser.Triple_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#loop_assign}.
	 * @param ctx the parse tree
	 */
	void enterLoop_assign(LatinoGrammarParser.Loop_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#loop_assign}.
	 * @param ctx the parse tree
	 */
	void exitLoop_assign(LatinoGrammarParser.Loop_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#loop_assignAux}.
	 * @param ctx the parse tree
	 */
	void enterLoop_assignAux(LatinoGrammarParser.Loop_assignAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#loop_assignAux}.
	 * @param ctx the parse tree
	 */
	void exitLoop_assignAux(LatinoGrammarParser.Loop_assignAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#loop_assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterLoop_assignmentOperator(LatinoGrammarParser.Loop_assignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#loop_assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitLoop_assignmentOperator(LatinoGrammarParser.Loop_assignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#loop_assignIncrDecr}.
	 * @param ctx the parse tree
	 */
	void enterLoop_assignIncrDecr(LatinoGrammarParser.Loop_assignIncrDecrContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#loop_assignIncrDecr}.
	 * @param ctx the parse tree
	 */
	void exitLoop_assignIncrDecr(LatinoGrammarParser.Loop_assignIncrDecrContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#loop_expr}.
	 * @param ctx the parse tree
	 */
	void enterLoop_expr(LatinoGrammarParser.Loop_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#loop_expr}.
	 * @param ctx the parse tree
	 */
	void exitLoop_expr(LatinoGrammarParser.Loop_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#loop_exprRest}.
	 * @param ctx the parse tree
	 */
	void enterLoop_exprRest(LatinoGrammarParser.Loop_exprRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#loop_exprRest}.
	 * @param ctx the parse tree
	 */
	void exitLoop_exprRest(LatinoGrammarParser.Loop_exprRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#loop_expBool}.
	 * @param ctx the parse tree
	 */
	void enterLoop_expBool(LatinoGrammarParser.Loop_expBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#loop_expBool}.
	 * @param ctx the parse tree
	 */
	void exitLoop_expBool(LatinoGrammarParser.Loop_expBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#loop_expBoolRest}.
	 * @param ctx the parse tree
	 */
	void enterLoop_expBoolRest(LatinoGrammarParser.Loop_expBoolRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#loop_expBoolRest}.
	 * @param ctx the parse tree
	 */
	void exitLoop_expBoolRest(LatinoGrammarParser.Loop_expBoolRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#loop_opRel}.
	 * @param ctx the parse tree
	 */
	void enterLoop_opRel(LatinoGrammarParser.Loop_opRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#loop_opRel}.
	 * @param ctx the parse tree
	 */
	void exitLoop_opRel(LatinoGrammarParser.Loop_opRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#loop_expRel}.
	 * @param ctx the parse tree
	 */
	void enterLoop_expRel(LatinoGrammarParser.Loop_expRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#loop_expRel}.
	 * @param ctx the parse tree
	 */
	void exitLoop_expRel(LatinoGrammarParser.Loop_expRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#loop_exprConcat}.
	 * @param ctx the parse tree
	 */
	void enterLoop_exprConcat(LatinoGrammarParser.Loop_exprConcatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#loop_exprConcat}.
	 * @param ctx the parse tree
	 */
	void exitLoop_exprConcat(LatinoGrammarParser.Loop_exprConcatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#loop_exprConcatOp}.
	 * @param ctx the parse tree
	 */
	void enterLoop_exprConcatOp(LatinoGrammarParser.Loop_exprConcatOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#loop_exprConcatOp}.
	 * @param ctx the parse tree
	 */
	void exitLoop_exprConcatOp(LatinoGrammarParser.Loop_exprConcatOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#loop_expArit}.
	 * @param ctx the parse tree
	 */
	void enterLoop_expArit(LatinoGrammarParser.Loop_expAritContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#loop_expArit}.
	 * @param ctx the parse tree
	 */
	void exitLoop_expArit(LatinoGrammarParser.Loop_expAritContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#loop_expAritOp}.
	 * @param ctx the parse tree
	 */
	void enterLoop_expAritOp(LatinoGrammarParser.Loop_expAritOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#loop_expAritOp}.
	 * @param ctx the parse tree
	 */
	void exitLoop_expAritOp(LatinoGrammarParser.Loop_expAritOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#loop_term}.
	 * @param ctx the parse tree
	 */
	void enterLoop_term(LatinoGrammarParser.Loop_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#loop_term}.
	 * @param ctx the parse tree
	 */
	void exitLoop_term(LatinoGrammarParser.Loop_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#loop_termOp}.
	 * @param ctx the parse tree
	 */
	void enterLoop_termOp(LatinoGrammarParser.Loop_termOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#loop_termOp}.
	 * @param ctx the parse tree
	 */
	void exitLoop_termOp(LatinoGrammarParser.Loop_termOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#loop_factor}.
	 * @param ctx the parse tree
	 */
	void enterLoop_factor(LatinoGrammarParser.Loop_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#loop_factor}.
	 * @param ctx the parse tree
	 */
	void exitLoop_factor(LatinoGrammarParser.Loop_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#loop_factorOp}.
	 * @param ctx the parse tree
	 */
	void enterLoop_factorOp(LatinoGrammarParser.Loop_factorOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#loop_factorOp}.
	 * @param ctx the parse tree
	 */
	void exitLoop_factorOp(LatinoGrammarParser.Loop_factorOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#loop_t_factor}.
	 * @param ctx the parse tree
	 */
	void enterLoop_t_factor(LatinoGrammarParser.Loop_t_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#loop_t_factor}.
	 * @param ctx the parse tree
	 */
	void exitLoop_t_factor(LatinoGrammarParser.Loop_t_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinoGrammarParser#loop_expr_terminals}.
	 * @param ctx the parse tree
	 */
	void enterLoop_expr_terminals(LatinoGrammarParser.Loop_expr_terminalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinoGrammarParser#loop_expr_terminals}.
	 * @param ctx the parse tree
	 */
	void exitLoop_expr_terminals(LatinoGrammarParser.Loop_expr_terminalsContext ctx);
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