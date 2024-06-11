// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        // Clear output.txt
        String filePath = "output/output.txt";
        FileUtils.clearFileContent(filePath);
        // create a CharStream that reads from standard input / file

    // create a lexer that feeds off of input CharStream
        LatinoGrammarLexer lexer;

        if (args.length>0)
            lexer = new LatinoGrammarLexer(CharStreams.fromFileName(args[0]));
        else
            lexer = new LatinoGrammarLexer(CharStreams.fromStream(System.in));
// create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
// create a parser that feeds off the tokens buffer
        LatinoGrammarParser parser = new LatinoGrammarParser(tokens);
        ParseTree tree = parser.main_program(); // begin parsing at init rule

        // Create a generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();
        // Walk the tree created during the parse, trigger callbacks
        walker.walk(new TranslateListeners(), tree);
        System.out.println(); // print a \n after translation
    }
}