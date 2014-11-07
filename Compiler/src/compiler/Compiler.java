package compiler;

import filehandler.JsonWriter;
import grammar.ReceiptLexer;
import grammar.ReceiptParser;
import infrastructure.exceptions.TranslationException;
import infrastructure.json.JsonStructure;
import infrastructure.translator.Translator;
import java.io.File;
import java.io.FileInputStream;
import java.util.LinkedList;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

/**
 *
 * @author Lucas
 */
public class Compiler {

    private static LinkedList<String> filesToCompile;

    private String in;
    private String out;

    Compiler(String in) {
        try {
            if (in.isEmpty()) {
                throw new IllegalArgumentException("Parameter in cannot be an empty String");
            }

            this.in = in;
            
            out = in.substring(0, in.indexOf("input"))
                + "output/"
                + in.substring(in.indexOf("input") + 6, in.indexOf('.'))
                + ".json"
                ;
        } catch (NullPointerException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
    
    Compiler(String in, String out) {
        this(in);
        this.out = out;
    }

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        filesToCompile = new LinkedList<>();

        if (args.length > 0) {
            File file = new File(args[0]);
            
            if (file.isDirectory()) {
                
                for (File child : file.listFiles()) {
                    filesToCompile.add(child.getPath());
                }
            } else {
                filesToCompile.add(file.getPath());
            }
        } else {
            filesToCompile.add("src/input/test.txt");
        }
        
        for (String file : filesToCompile) {
            try {
                new Compiler(file).start();
            
            } catch (IllegalArgumentException e) {
                System.err.println("The input file name is invalid: \"" + file + "\"");
            
            } catch (RecognitionException e) {
                System.err.println("Recognition error on file \"" + file + "\"");

            } catch (TranslationException e) {
                System.err.println("Translation error on file \"" + file + "\"");

            } catch (Exception e) {
                System.err.println("An error has occured while compiling file \"" + file + "\"");
            }
        }
    }

    private void start() throws Exception {
        File input = new File(in);

        System.out.println("\nCompilation proccess has started. File being compiled: " + in);

        ANTLRInputStream inputStream = new ANTLRInputStream(new FileInputStream(in));

        ReceiptLexer lexer = new ReceiptLexer(inputStream);
        ReceiptParser parser = new ReceiptParser(new CommonTokenStream(lexer));

        // parse input file and retrieve its JsonStructure
        JsonStructure tree = parser.receipt().e;

        System.out.println("Parsing completed.");

        // print JsonStructure to the String result
        String result = new Translator(tree)
                .run()
                .export();

        // export file with printed JsonStructure
        new JsonWriter(out, result)
                .export();

        System.out.println("Finished!");
    }
}
