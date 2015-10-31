package runner;

import infrastructure.errorlisteners.SemanticErrorListener;
import infrastructure.errorlisteners.SyntaticErrorListener;
import infrastructure.errorlisteners.LexicalErrorListener;
import gerador.*;
import infrastructure.CompilationResultWriter;
import infrastructure.messagebag.MessageBag;
import java.io.FileInputStream;
import laparser.*;
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

        MessageBag  firstBag = new MessageBag();
        MessageBag secondBag = new MessageBag();

        LaLexer lexer   = new LaLexer(in);
        LaParser parser = new LaParser(new CommonTokenStream(lexer));

        lexer.removeErrorListeners();
        parser.removeErrorListeners();

        LexicalErrorListener   lexical = new  LexicalErrorListener(firstBag);
        SyntaticErrorListener syntatic = new SyntaticErrorListener(firstBag);
        SemanticErrorListener.DefineMessageBag(secondBag);

        parser.addErrorListener(syntatic);
        lexer .addErrorListener(lexical);
        
        try {
            parser.programa();
        } catch (Exception e) {
            // In this point, it's impossible to say if the input program
            // is corect or not. The program should execute under a try catch. 
        }

        CompilationResultWriter writer = new CompilationResultWriter(outputFile);

        // put the first lexic/sintatic error in the writer's buffer
        if (firstBag.all().size() > 0) {
            writer
                .put(firstBag.first())
                .put("Fim da compilacao")
                .close();
        }
        
        // or, case there none lexic/sintatic error, put all semantic errors
        // in the writer's buffer
        else if (secondBag.all().size() > 0) {
            for (String message : secondBag.all()) {
                writer.put(message);
            }
            writer
                .put("Fim da compilacao")
                .close();
        }
        
        // Reached this point. The code does not have any errors.
        // Translate it into C.
        else {
            LaGeradorLexer lexerGerador = new LaGeradorLexer(in);
            LaGeradorParser parserGerador = new LaGeradorParser(new CommonTokenStream(lexerGerador));
            lexerGerador.removeErrorListeners();
            parserGerador.removeErrorListeners();

            parserGerador.programa();

            writer.put(Gerador.getText());
            writer.close();
        }
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
