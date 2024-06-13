import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.List;
import javax.print.DocFlavor;


public class TranslateListeners extends LatinoGrammarBaseListener {
    private static final String OUTPUT_FILE_PATH = "output/output.txt";
    int identationLevel = 0;
    private boolean isFirstCaseClause = true;
    private String switchExpression = null;
    private boolean pastCaseEmpty = false;

    // ASIGNACIÓN --------------------------------------------------------------
    @Override public void enterAssign(LatinoGrammarParser.AssignContext ctx) {
        FileUtils.writeToFile("\t".repeat(identationLevel), OUTPUT_FILE_PATH);
        FileUtils.writeToFile(ctx.ID().getText(), OUTPUT_FILE_PATH);
    }

    @Override public void exitAssign(LatinoGrammarParser.AssignContext ctx) {
        FileUtils.writeToFile("\n", OUTPUT_FILE_PATH);
    }

    @Override public void enterAssignAux(LatinoGrammarParser.AssignAuxContext ctx) {
        if (ctx.TKN_ASSIGN() == null) {
            FileUtils.writeToFile(",",OUTPUT_FILE_PATH);
            FileUtils.writeToFile(ctx.ID().getText(),OUTPUT_FILE_PATH);
        } else {
            FileUtils.writeToFile(ctx.TKN_ASSIGN().getText(), OUTPUT_FILE_PATH);
        }
    }


    @Override public void exitAssignAux(LatinoGrammarParser.AssignAuxContext ctx) {
        if (ctx.TKN_ASSIGN() == null) {
            FileUtils.writeToFile(",", OUTPUT_FILE_PATH);
        }

    }

    @Override public void enterAssignmentOperator(LatinoGrammarParser.AssignmentOperatorContext ctx) {
        FileUtils.writeToFile(ctx.getText(), OUTPUT_FILE_PATH);
    }


    // FUNCIONES BUILT-IN ------------------------------------------------------------------------
    // ACADENA

    @Override public void enterAcadena_stat(LatinoGrammarParser.Acadena_statContext ctx) {
        FileUtils.writeToFile("\t".repeat(identationLevel), OUTPUT_FILE_PATH);
        FileUtils.writeToFile("str(", OUTPUT_FILE_PATH);
    }

    @Override public void exitAcadena_stat(LatinoGrammarParser.Acadena_statContext ctx) {
        FileUtils.writeToFile(")", OUTPUT_FILE_PATH);
    }

    // ALOGICO

    @Override public void enterAlogico_stat(LatinoGrammarParser.Alogico_statContext ctx) {
        FileUtils.writeToFile("\t".repeat(identationLevel), OUTPUT_FILE_PATH);
        FileUtils.writeToFile("bool(", OUTPUT_FILE_PATH);
    }
    @Override public void exitAlogico_stat(LatinoGrammarParser.Alogico_statContext ctx) {
        FileUtils.writeToFile(")", OUTPUT_FILE_PATH);
    }


    // ANUMERO

    @Override public void enterAnumero_stat(LatinoGrammarParser.Anumero_statContext ctx) {
        FileUtils.writeToFile("\t".repeat(identationLevel), OUTPUT_FILE_PATH);
        FileUtils.writeToFile("int(", OUTPUT_FILE_PATH);
    }

    @Override public void exitAnumero_stat(LatinoGrammarParser.Anumero_statContext ctx) {
        FileUtils.writeToFile(")", OUTPUT_FILE_PATH);
    }

    // IMPRESIÓN --------------------------------------------------------------

    @Override public void enterPrint_stat(LatinoGrammarParser.Print_statContext ctx) {
        FileUtils.writeToFile("\t".repeat(identationLevel), OUTPUT_FILE_PATH);
        FileUtils.writeToFile("print(", OUTPUT_FILE_PATH);
    }


    @Override public void exitPrint_stat_cont(LatinoGrammarParser.Print_stat_contContext ctx) {
        FileUtils.writeToFile(")\n", OUTPUT_FILE_PATH);
    }

    @Override public void enterExprConcatOp(LatinoGrammarParser.ExprConcatOpContext ctx) {
        FileUtils.writeToFile(" + ", OUTPUT_FILE_PATH);
    }

    // FUNCIONES

    @Override public void enterFunction_stat(LatinoGrammarParser.Function_statContext ctx) {
        FileUtils.writeToFile("def ", OUTPUT_FILE_PATH);
        FileUtils.writeToFile(ctx.function_name().getText(), OUTPUT_FILE_PATH);
    }

    @Override public void enterFunction_pars(LatinoGrammarParser.Function_parsContext ctx) {
        FileUtils.writeToFile("(", OUTPUT_FILE_PATH);
    }

    @Override public void exitFunction_pars(LatinoGrammarParser.Function_parsContext ctx) {
        FileUtils.writeToFile("):\n", OUTPUT_FILE_PATH);
    }



    @Override public void enterFunction_args_aux(LatinoGrammarParser.Function_args_auxContext ctx) {
        if(ctx.TKN_COMMA() != null) {
            FileUtils.writeToFile(",", OUTPUT_FILE_PATH);
        }

    }

    @Override public void enterFunction_content(LatinoGrammarParser.Function_contentContext ctx) {
        FileUtils.writeToFile("\t", OUTPUT_FILE_PATH);
        FileUtils.writeToFile(ctx.substatement().getText(), OUTPUT_FILE_PATH);
    }

    @Override public void enterFunction_ret(LatinoGrammarParser.Function_retContext ctx) {
        FileUtils.writeToFile("return ", OUTPUT_FILE_PATH);
    }

    @Override public void exitFunction_ret(LatinoGrammarParser.Function_retContext ctx) {
        FileUtils.writeToFile("\n", OUTPUT_FILE_PATH);
    }

    // ARRAY


    // CONDICIONAL

    @Override public void enterIf_conditional(LatinoGrammarParser.If_conditionalContext ctx) {
        FileUtils.writeToFile("\t".repeat(identationLevel), OUTPUT_FILE_PATH);
        FileUtils.writeToFile("if ", OUTPUT_FILE_PATH);

    }

    @Override public void exitConditional_expr(LatinoGrammarParser.Conditional_exprContext ctx) {
        FileUtils.writeToFile(":\n", OUTPUT_FILE_PATH);
    }

    @Override public void enterConditional_substatement(LatinoGrammarParser.Conditional_substatementContext ctx) {
        identationLevel++;
    }
    @Override public void exitConditional_substatement(LatinoGrammarParser.Conditional_substatementContext ctx) {
        identationLevel--;
    }

    @Override public void enterIf_conditional_aux(LatinoGrammarParser.If_conditional_auxContext ctx) {
        if (ctx.getChild(0) != null) {
            if (ctx.getChild(0).getText().equals("osi")) {
                FileUtils.writeToFile("\t".repeat(identationLevel), OUTPUT_FILE_PATH);
                FileUtils.writeToFile("elif ", OUTPUT_FILE_PATH);
            } else if (ctx.getChild(0).getText().equals("sino")) {
                FileUtils.writeToFile("\t".repeat(identationLevel), OUTPUT_FILE_PATH);
                FileUtils.writeToFile("else:\n", OUTPUT_FILE_PATH);
            }
        }
    }

    // SWICTH
    @Override public void enterSwicth_condition(LatinoGrammarParser.Swicth_conditionContext ctx) {
        FileUtils.writeToFile("if ", OUTPUT_FILE_PATH);
        switchExpression = ctx.expr().getText();

    }

    @Override public void exitSwicth_condition(LatinoGrammarParser.Swicth_conditionContext ctx) {
        identationLevel--;
        switchExpression = null;
        isFirstCaseClause = true;
    }


    @Override public void enterCaseClause(LatinoGrammarParser.CaseClauseContext ctx) {

        if (ctx.conditional_substatement().substatement().getText() != "") {
            if(isFirstCaseClause) {
                FileUtils.writeToFile("== ", OUTPUT_FILE_PATH);
                isFirstCaseClause = false;

            } else if (pastCaseEmpty) {
                FileUtils.writeToFile(" or ", OUTPUT_FILE_PATH);
                pastCaseEmpty = false;
            } else {
                FileUtils.writeToFile("elif ", OUTPUT_FILE_PATH);
                FileUtils.writeToFile(switchExpression, OUTPUT_FILE_PATH);
                FileUtils.writeToFile("== ", OUTPUT_FILE_PATH);
            }
        } else {
            if(pastCaseEmpty == false) {
                pastCaseEmpty = true;
                if(isFirstCaseClause) {
                    FileUtils.writeToFile("== ", OUTPUT_FILE_PATH);
                    isFirstCaseClause = false;
                } else{
                    FileUtils.writeToFile("elif ", OUTPUT_FILE_PATH);
                    FileUtils.writeToFile(switchExpression, OUTPUT_FILE_PATH);
                    FileUtils.writeToFile("== ", OUTPUT_FILE_PATH);
                }

            } else{
                FileUtils.writeToFile(" or ", OUTPUT_FILE_PATH);

            }

        }
    }

    @Override public void exitCaseClauseExpr(LatinoGrammarParser.CaseClauseExprContext ctx) {
        if(!pastCaseEmpty){
            FileUtils.writeToFile(":\n", OUTPUT_FILE_PATH);
        }

    }
    @Override public void enterDefaultClause(LatinoGrammarParser.DefaultClauseContext ctx) {
        FileUtils.writeToFile("else:\n", OUTPUT_FILE_PATH);
    }


    @Override public void enterOtherClause(LatinoGrammarParser.OtherClauseContext ctx) {
        FileUtils.writeToFile("else:\n", OUTPUT_FILE_PATH);
    }



    // EXPRESIONES --------------------------------------------------------------

    @Override public void enterExpr_factor(LatinoGrammarParser.Expr_factorContext ctx) {
        if(ctx.getText() != null) {
            FileUtils.writeToFile(ctx.getText(), OUTPUT_FILE_PATH);
        }
    }
    @Override public void enterExpr_terminals(LatinoGrammarParser.Expr_terminalsContext ctx) {
        if(ctx.TKN_OPENING_PAR() != null) { // existe un parentesis
            FileUtils.writeToFile("(", OUTPUT_FILE_PATH);
        } else if (ctx.acadena_stat() != null || ctx.anumero_stat() != null || ctx.alogico_stat() != null) {
            // Que no haga nada, ya esas funciones se escriben solas
        } else {
            FileUtils.writeToFile(ctx.getText(), OUTPUT_FILE_PATH);
        }
    }
    @Override public void enterOpRel(LatinoGrammarParser.OpRelContext ctx) {
        FileUtils.writeToFile(" " + ctx.getText() + " ", OUTPUT_FILE_PATH);
    }

    @Override public void enterExpArit(LatinoGrammarParser.ExpAritContext ctx) {
        List<LatinoGrammarParser.TermContext> terms = ctx.term();

    }
    @Override public void enterExpAritOp(LatinoGrammarParser.ExpAritOpContext ctx) {
        FileUtils.writeToFile(ctx.getText(), OUTPUT_FILE_PATH);
    }

    @Override public void enterTermOp(LatinoGrammarParser.TermOpContext ctx) {
        FileUtils.writeToFile(ctx.getText(), OUTPUT_FILE_PATH);
    }

    @Override public void enterFactorOp(LatinoGrammarParser.FactorOpContext ctx) {
        FileUtils.writeToFile(ctx.getText(), OUTPUT_FILE_PATH);
    }

    @Override public void exitExpr_terminals(LatinoGrammarParser.Expr_terminalsContext ctx) {
        if(ctx.TKN_OPENING_PAR() != null) { // existe un parentesis
            FileUtils.writeToFile(")", OUTPUT_FILE_PATH);
        }
    }


    @Override public void enterExprRest(LatinoGrammarParser.ExprRestContext ctx) {
        if (ctx.expBool() != null) {
            FileUtils.writeToFile(" or ", OUTPUT_FILE_PATH);
        }
    }

    @Override public void enterExpBoolRest(LatinoGrammarParser.ExpBoolRestContext ctx) {
        if(ctx.expRel() != null){
            FileUtils.writeToFile(" and ", OUTPUT_FILE_PATH);
        }
    }
}

