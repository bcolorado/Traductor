import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;



public class TranslateListeners extends LatinoGrammarBaseListener {
    private static final String OUTPUT_FILE_PATH = "output/output.txt";

    // ASIGNACIÓN --------------------------------------------------------------
    @Override public void enterAssign(LatinoGrammarParser.AssignContext ctx) {
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
        FileUtils.writeToFile("str(", OUTPUT_FILE_PATH);
    }

    @Override public void exitAcadena_stat(LatinoGrammarParser.Acadena_statContext ctx) {
        FileUtils.writeToFile(")", OUTPUT_FILE_PATH);
    }

    // ALOGICO

    @Override public void enterAlogico_stat(LatinoGrammarParser.Alogico_statContext ctx) {
        FileUtils.writeToFile("bool(", OUTPUT_FILE_PATH);
    }
    @Override public void exitAlogico_stat(LatinoGrammarParser.Alogico_statContext ctx) {
        FileUtils.writeToFile(")", OUTPUT_FILE_PATH);
    }


    // ANUMERO

    @Override public void enterAnumero_stat(LatinoGrammarParser.Anumero_statContext ctx) {
        FileUtils.writeToFile("int(", OUTPUT_FILE_PATH);
    }

    @Override public void exitAnumero_stat(LatinoGrammarParser.Anumero_statContext ctx) {
        FileUtils.writeToFile(")", OUTPUT_FILE_PATH);
    }

    // IMPRESIÓN --------------------------------------------------------------

    @Override public void enterPrint_stat(LatinoGrammarParser.Print_statContext ctx) {
        FileUtils.writeToFile("print(", OUTPUT_FILE_PATH);
    }


    @Override public void exitPrint_stat_cont(LatinoGrammarParser.Print_stat_contContext ctx) {
        FileUtils.writeToFile(")\n", OUTPUT_FILE_PATH);
    }

    @Override public void enterExprConcatOp(LatinoGrammarParser.ExprConcatOpContext ctx) {
        FileUtils.writeToFile("+", OUTPUT_FILE_PATH);
    }



    // EXPRESIONES --------------------------------------------------------------

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
        FileUtils.writeToFile(ctx.getText(), OUTPUT_FILE_PATH);
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

