package runner;

import infrastructure.SaidaParser;
import infrastructure.ErrorListener;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import laparser.LaLexer;
import laparser.LaParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * Runs the LaParser on a inputFile and outputs the result in an outputFile.
 * 
 * This is the main class of the LaParser project. Therefore, the method
 * Runner.main(String[] args) will be called by the evaluator.
 * 
 * @author Lucas
 */
public class Runner {

    /**
     * Runs the LaParser on a file that contains a LA source-code.
     * 
     * @param inputFile name of the LA source-code file
     * @param outputFile name of the analysis result file
     * @throws Exception
     */
    public void start(String inputFile, String outputFile) throws Exception {

        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(inputFile));
        LaLexer lexer = new LaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        LaParser parser = new LaParser(tokens);

        parser.removeErrorListeners();
        lexer.removeErrorListeners();

        SaidaParser out = new SaidaParser();
        ErrorListener listener = new ErrorListener(out);

        parser.addErrorListener(listener);
        lexer.addErrorListener(listener);

        parser.programa();

        out.println("Fim da compilacao");

        PrintWriter saida = new PrintWriter(new FileWriter(outputFile));
        saida.print(out);
        saida.flush();
        saida.close();
    }

    /**
     * Executes Runner.start() method with the arguments given.
     * 
     * @param args array that contains the names of the input and output files
     */
    public static void main(String[] args) throws Exception {
        new Runner().start(args[0], args[1]);
    }
}
