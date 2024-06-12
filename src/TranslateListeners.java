import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;



public class TranslateListeners extends LatinoGrammarBaseListener {
    private static final String OUTPUT_FILE_PATH = "output/output.txt";

    @Override public void enterAssign(LatinoGrammarParser.AssignContext ctx) {
        FileUtils.writeToFile(ctx.ID().getText(), OUTPUT_FILE_PATH);
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

    @Override public void enterPrint_stat(LatinoGrammarParser.Print_statContext ctx) {
        FileUtils.writeToFile("print(", OUTPUT_FILE_PATH);
        FileUtils.writeToFile(String.valueOf(ctx.expr().getText()), OUTPUT_FILE_PATH);
    }

    @Override public void exitPrint_stat(LatinoGrammarParser.Print_statContext ctx) {
        FileUtils.writeToFile(")", OUTPUT_FILE_PATH);
    }

    @Override public void enterExpRel(LatinoGrammarParser.ExpRelContext ctx) {
        FileUtils.writeToFile(ctx.getText(), OUTPUT_FILE_PATH);
    }


    @Override public void enterExprRest(LatinoGrammarParser.ExprRestContext ctx) {
        if (ctx.expBool() != null) {
            FileUtils.writeToFile("or", OUTPUT_FILE_PATH);
        }
    }

    @Override public void enterExpBoolRest(LatinoGrammarParser.ExpBoolRestContext ctx) {
        if(ctx.expRel() != null){
            FileUtils.writeToFile("and", OUTPUT_FILE_PATH);
        }
    }
}

