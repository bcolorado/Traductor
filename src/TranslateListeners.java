import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.List;
import javax.print.DocFlavor;


public class TranslateListeners extends LatinoGrammarBaseListener {
    private static final String OUTPUT_FILE_PATH = "output/output.txt";
    int identationLevel = 0;
    private boolean isFirstCaseClause = true;
    private String switchExpression = null;
    private boolean pastCaseEmpty = false;
    private int loop_aux_num = 0;
    private int loop_aux_num2 = 15;
    private int loop_aux_num3 = 0;
    private boolean desde_loop_flag = false;
    private boolean hasLoopAssignIncrDecr = false;
    private int loop_assign_number = 0;
    private boolean desde_loop_flag_2 = true;
    private boolean longitud_flag = false;
    private String id_longitud = "";

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

    @Override public void enterArray_printing(LatinoGrammarParser.Array_printingContext ctx) {
        StringBuilder sb = new StringBuilder();

        // Iterar sobre los hijos del contexto ctx
        for (ParseTree child : ctx.children) {
            // Obtener el texto del nodo hijo y concatenarlo a la cadena acumuladora
            sb.append(child.getText());
        }

        // Convertir StringBuilder a String
        String concatenatedString = sb.toString();
        FileUtils.writeToFile(concatenatedString, OUTPUT_FILE_PATH);
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


    // BUCLES --------------------------------------------------------------


    //DESDE
    @Override public void enterLoop_substatement(LatinoGrammarParser.Loop_substatementContext ctx) {
        if(ctx.getParent() instanceof LatinoGrammarParser.Mientras_loopContext){
            FileUtils.writeToFile(": \n", OUTPUT_FILE_PATH);
        }
        identationLevel++;
    }

    @Override public void exitLoop_substatement(LatinoGrammarParser.Loop_substatementContext ctx) {
        identationLevel--;
    }
    @Override public void enterDesde_loop(LatinoGrammarParser.Desde_loopContext ctx) {
        FileUtils.writeToFile("\t".repeat(identationLevel), OUTPUT_FILE_PATH);
        FileUtils.writeToFile("for ", OUTPUT_FILE_PATH);
    }

    @Override public void enterLongitud_method(LatinoGrammarParser.Longitud_methodContext ctx) {
        if(!desde_loop_flag){
            FileUtils.writeToFile("len( "+ctx.ID()+")", OUTPUT_FILE_PATH);
        }

    }

    @Override public void exitDesde_loop(LatinoGrammarParser.Desde_loopContext ctx) { }

    @Override public void enterLoop_assign(LatinoGrammarParser.Loop_assignContext ctx) {

//        this.loop_aux_num = Integer.parseInt(ctx.getChild(2).getText());
        if(!desde_loop_flag){ //falso si es la primera signacion del desde
            FileUtils.writeToFile(ctx.ID().getText(), OUTPUT_FILE_PATH);
            FileUtils.writeToFile(" in range(", OUTPUT_FILE_PATH);
            Integer numValue = findNumNode(ctx);
            if (numValue != null) {
                this.loop_aux_num2 = numValue;
            }
            FileUtils.writeToFile(this.loop_aux_num2+"", OUTPUT_FILE_PATH);
            FileUtils.writeToFile(", ", OUTPUT_FILE_PATH);
            this.loop_aux_num3 = loop_aux_num2;

        }

    }

    @Override public void enterSpecial_methods(LatinoGrammarParser.Special_methodsContext ctx) { }



    @Override public void exitLoop_assign(LatinoGrammarParser.Loop_assignContext ctx) {
    }

    @Override public void enterLoop_expRel(LatinoGrammarParser.Loop_expRelContext ctx) {
        /*this.loop_aux_num2 = Integer.parseInt(ctx.getChild(4).getChild(1).getChild(0).getText());
        FileUtils.writeToFile("aquiiii "+this.loop_aux_num2, OUTPUT_FILE_PATH);
        String str = "";*/

        // Buscamos el nodo NUM dentro de los hijos de loop_expRel
        Integer numValue = findNumNode(ctx);
//        System.out.println(numValue);
        String comparator_tkn = "";
        if(ctx.getChild(2) instanceof LatinoGrammarParser.Special_methodsContext){
            this.loop_aux_num2 = 9999;
            this.longitud_flag = true;
            this.id_longitud = ctx.special_methods().longitud_method().ID().getText();
            System.out.println(this.id_longitud);

        }else{
            this.loop_aux_num2 = numValue;
        }

        if(!desde_loop_flag){
            this.loop_aux_num = this.loop_aux_num2;
        }

        if (ctx.getChild(1) != null && ctx.getChild(1) instanceof LatinoGrammarParser.Loop_opRelContext){
            comparator_tkn = ctx.getChild(1).getChild(0).getText();
        }

        if(comparator_tkn.equals("<=")) {
            numValue = Integer.parseInt(ctx.getChild(2).getText()) + 1;
            this.loop_aux_num = numValue;
        }else if(comparator_tkn.equals(">=")){
            numValue = Integer.parseInt(ctx.getChild(2).getText()) - 1;
            this.loop_aux_num = numValue;
        } else{

        }
        if(desde_loop_flag && hasLoopAssignIncrDecr){
            if(this.longitud_flag){
                FileUtils.writeToFile("len("+this.id_longitud+")"+"", OUTPUT_FILE_PATH);
            }else{
                FileUtils.writeToFile(numValue+"", OUTPUT_FILE_PATH);
            }

            if(loop_aux_num2 > loop_aux_num3){
                FileUtils.writeToFile(", 1", OUTPUT_FILE_PATH);
            }else{
                FileUtils.writeToFile(", -1", OUTPUT_FILE_PATH);
            }
            FileUtils.writeToFile(")", OUTPUT_FILE_PATH);
            FileUtils.writeToFile(": \n", OUTPUT_FILE_PATH);
        }else if(desde_loop_flag && !hasLoopAssignIncrDecr && this.desde_loop_flag_2){

            if(loop_aux_num2 > loop_aux_num3){
                if(this.longitud_flag){
                    FileUtils.writeToFile("len("+this.id_longitud+")"+", "+ this.loop_assign_number+"): \n", OUTPUT_FILE_PATH);
                    this.desde_loop_flag_2 = false;
                }else{
                    FileUtils.writeToFile(numValue+", "+ this.loop_assign_number+"): \n", OUTPUT_FILE_PATH);
                    this.desde_loop_flag_2 = false;
                }

            }else{
                FileUtils.writeToFile(numValue+", -"+ this.loop_assign_number+"): \n", OUTPUT_FILE_PATH);
                this.desde_loop_flag_2 = false;
            }

        }

        this.desde_loop_flag = true;
    }

    @Override public void enterTriple_expr(LatinoGrammarParser.Triple_exprContext ctx) {
        this.hasLoopAssignIncrDecr = false;

        // Iterar sobre todos los hijos del contexto actual
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            // Verificar si el hijo es de tipo loop_assignIncrDecrContext
            if (child instanceof LatinoGrammarParser.Loop_assignIncrDecrContext) {
                this.hasLoopAssignIncrDecr = true;
                break; // Salir del bucle ya que hemos encontrado el nodo
            }else{
                Integer num = findNumNode(child);
                if(num != null){

                    this.loop_assign_number = num;
                }
            }
        }
    }

    @Override public void exitTriple_expr(LatinoGrammarParser.Triple_exprContext ctx) {
        this.desde_loop_flag = false;
        this.longitud_flag = false;
    }

    //MIENTRAS

    @Override public void enterMientras_loop(LatinoGrammarParser.Mientras_loopContext ctx) {
        FileUtils.writeToFile("while ", OUTPUT_FILE_PATH);
    }
    @Override public void exitMientras_loop(LatinoGrammarParser.Mientras_loopContext ctx) {
    }


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
                FileUtils.writeToFile(" or " + switchExpression + " == " , OUTPUT_FILE_PATH);
                pastCaseEmpty = false;
            } else {
                FileUtils.writeToFile("elif ", OUTPUT_FILE_PATH);
                FileUtils.writeToFile(switchExpression, OUTPUT_FILE_PATH);
                FileUtils.writeToFile(" == ", OUTPUT_FILE_PATH);
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
                FileUtils.writeToFile(" or " + switchExpression + " == " , OUTPUT_FILE_PATH);

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

    @Override public void enterLoop_assignIncrDecr(LatinoGrammarParser.Loop_assignIncrDecrContext ctx) {}

    @Override public void enterAssignIncrDecr(LatinoGrammarParser.AssignIncrDecrContext ctx) {
        if(ctx.TKN_DECREMENT() != null){
            FileUtils.writeToFile(" -= 1", OUTPUT_FILE_PATH);
        }else if (ctx.TKN_INCREMENT() != null){
            FileUtils.writeToFile(" += 1", OUTPUT_FILE_PATH);
        }
    }

    @Override public void enterBrakets(LatinoGrammarParser.BraketsContext ctx) {
//        FileUtils.writeToFile("["+ctx.ID().getText()+"]", OUTPUT_FILE_PATH);
    }


    // Método para encontrar el valor de NUM recursivamente en los hijos
    private Integer findNumNode(ParseTree node) {
        // Verificar si el nodo es un TerminalNode y su tipo es NUM
        if (node instanceof TerminalNode) {
            TerminalNode terminalNode = (TerminalNode) node;
            if (terminalNode.getSymbol().getType() == LatinoGrammarParser.NUM) {
                return Integer.parseInt(terminalNode.getText());
            }
        }

        // Recorrer los hijos recursivamente si no es un TerminalNode
        for (int i = 0; i < node.getChildCount(); i++) {
            Integer result = findNumNode(node.getChild(i));
            if (result != null) {
                return result;
            }
        }

        return null;  // Retorna null si no se encuentra el nodo NUM
    }
}

