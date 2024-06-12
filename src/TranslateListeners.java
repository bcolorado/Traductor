import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;



public class TranslateListeners extends LatinoGrammarBaseListener {
    private static final String OUTPUT_FILE_PATH = "output/output.txt";

    @Override public void enterAssign(LatinoGrammarParser.AssignContext ctx) {
        FileUtils.writeToFile(ctx.ID().getText(), OUTPUT_FILE_PATH);
        FileUtils.writeToFile(ctx.assignAux().getText(), OUTPUT_FILE_PATH);
    }


    @Override public void enterPrint_stat(LatinoGrammarParser.Print_statContext ctx) {
        FileUtils.writeToFile("print(", OUTPUT_FILE_PATH);
        FileUtils.writeToFile(String.valueOf(ctx.expr().getText()), OUTPUT_FILE_PATH);
    }

    @Override public void exitPrint_stat(LatinoGrammarParser.Print_statContext ctx) {
        FileUtils.writeToFile(")", OUTPUT_FILE_PATH);
    }

    @Override public void enterExpr(LatinoGrammarParser.ExprContext ctx) {
        FileUtils.writeToFile(ctx.expBool().getText(), OUTPUT_FILE_PATH);
    }


    @Override public void enterExprRest(LatinoGrammarParser.ExprRestContext ctx) {
        if (ctx.expBool() != null) {
            FileUtils.writeToFile("or", OUTPUT_FILE_PATH);
            FileUtils.writeToFile(ctx.expBool().getText(), OUTPUT_FILE_PATH);
        }
    }

    @Override public void enterExpBoolRest(LatinoGrammarParser.ExpBoolRestContext ctx) {
        if(ctx.expRel() != null){
            FileUtils.writeToFile("and", OUTPUT_FILE_PATH);
            FileUtils.writeToFile(ctx.expRel().getText(), OUTPUT_FILE_PATH);
        }
    }


}

