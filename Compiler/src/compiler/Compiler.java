package compiler;

import filehandler.JsonWriter;
import grammar.ReceiptLexer;
import grammar.ReceiptParser;
import java.io.FileInputStream;
import java.io.IOException;
import json.infrastructure.JsonStructure;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import translator.Translator;

/**
 *
 * @author Lucas
 */
public class Compiler {

    private String in;
    private String out;
    
    Compiler(String in, String out) {
        try {
            if (in.isEmpty() || out.isEmpty()) {
                throw new IllegalArgumentException("Parameters in and/or out cannot be an empty String");
            }

            this.in = in;
            this.out = out;
        } catch (NullPointerException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        Compiler compiler;

        if (args.length == 2) {
            compiler = new Compiler(args[0], args[1]);
        } else {
            compiler = new Compiler("src/input/test.txt", "src/output/test.json");
        }

        compiler.start();
    }

    private void start() throws IOException {
        System.out.println("Compilation proccess has started. File being compiled: " + in);
        
        ANTLRInputStream inputStream = new ANTLRInputStream(new FileInputStream(in));
        
        ReceiptLexer   lexer = new ReceiptLexer(inputStream);
        ReceiptParser parser = new ReceiptParser(new CommonTokenStream(lexer));
        
        JsonStructure tree = parser.receipt().e;
        System.out.println("Parsing completed.");
        
        String result = new Translator(tree)
            .run()
            .export();
        
        new JsonWriter(out, result)
            .export();

        System.out.println("Finished!");
    }
}
