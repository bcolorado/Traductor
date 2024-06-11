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