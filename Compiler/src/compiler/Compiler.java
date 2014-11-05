package compiler;

import filehandler.JsonWriter;
import grammar.ReceiptLexer;
import grammar.ReceiptParser;
import java.io.File;
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
            if (in.isEmpty()) {
                throw new IllegalArgumentException("Parameter in cannot be an empty String");
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
            compiler = new Compiler("src/input", "");
        }

        compiler.start();
    }

    private void start() throws IOException {
        File input = new File(in);
        if (input.isDirectory()) {
            for (File child : input.listFiles()) {
                System.out.println("Compilation proccess has started. File being compiled: " + child.toString());

                ANTLRInputStream inputStream = new ANTLRInputStream(new FileInputStream(child));

                ReceiptLexer lexer = new ReceiptLexer(inputStream);
                ReceiptParser parser = new ReceiptParser(new CommonTokenStream(lexer));

                JsonStructure tree = parser.receipt().e;
                System.out.println("Parsing completed.");

                String result = new Translator(tree)
                        .run()
                        .export();
                
                String inputStr = child.toString();

                out = inputStr.substring(0, inputStr.indexOf("input"));
                out += "output/";
                out += inputStr.substring(inputStr.indexOf("input") + 6, inputStr.indexOf('.'));
                out += ".json";

                new JsonWriter(out, result)
                        .export();
            }
        } else {
            System.out.println("Compilation proccess has started. File being compiled: " + in);

            ANTLRInputStream inputStream = new ANTLRInputStream(new FileInputStream(in));

            ReceiptLexer lexer = new ReceiptLexer(inputStream);
            ReceiptParser parser = new ReceiptParser(new CommonTokenStream(lexer));

            JsonStructure tree = parser.receipt().e;
            System.out.println("Parsing completed.");

            String result = new Translator(tree)
                    .run()
                    .export();

            out = in.substring(0, in.indexOf("input"));
            out += "output/";
            out += in.substring(in.indexOf("input") + 6, in.indexOf('.'));
            out += ".json";

            new JsonWriter(out, result)
                    .export();
        }
        System.out.println("Finished!");
    }
}
