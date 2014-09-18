package runner;

import infrastructure.ErrorListeners.LexicalErrorListener;
import infrastructure.CompilationResultWriter;
import infrastructure.ErrorListeners.SemanticErrorListener;
import infrastructure.MessageBag;
import infrastructure.ErrorListeners.SyntaticErrorListener;
import java.io.FileInputStream;
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

        ANTLRInputStream in = new ANTLRInputStream(new FileInputStream(inputFile));
        MessageBag bag = new MessageBag();

        LaLexer lexer = new LaLexer(in);
        LaParser parser = new LaParser(new CommonTokenStream(lexer));

        parser.removeErrorListeners();
        lexer.removeErrorListeners();

        LexicalErrorListener lexical = new LexicalErrorListener(bag);
        SyntaticErrorListener syntatic = new SyntaticErrorListener(bag);
        SemanticErrorListener.DefineMessageBag(bag);

        parser.addErrorListener(syntatic);
        lexer .addErrorListener(lexical);

        parser.programa();

        CompilationResultWriter writer = new CompilationResultWriter(outputFile);
        
        try {
            writer.put(bag.first());
        } catch(IndexOutOfBoundsException e) {
            // does nothing
        }
        
        writer
            .put("Fim da compilacao")
            .close();
    }

    /**
     * Executes Runner.start() method with the arguments given.
     *
     * @param args array that contains the names of the input and bag files
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        new Runner().start(args[0], args[1]);
    }
}
