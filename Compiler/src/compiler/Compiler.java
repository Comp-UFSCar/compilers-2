package compiler;

import filehandler.JsonWriter;
import grammar.ReceiptLexer;
import grammar.ReceiptParser;
import infrastructure.SemanticListener;
import infrastructure.SyntacticalListener;
import infrastructure.exceptions.*;
import infrastructure.json.JsonStructure;
import infrastructure.messagebag.MessageBag;
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
    
    private static int Id;

    Compiler(String in) {
        try {
            if (in.isEmpty()) {
                throw new IllegalArgumentException("Parameter in cannot be an empty String");
            }

            this.in = in;
            
            String parent = new File(in).getParentFile().getName();
            out = in.substring(0, in.indexOf("input")) + "output\\";
            
            if (!parent.equals("input")) {
                out += parent + "\\";
            }
            
            out += (++Id) + ".json";
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
                System.err.println("Recognition error on file \"" + file + "\": "
                + e.getMessage());

            } catch (LexicalException | SyntacticalException | SemanticException e) {
                System.err.println("The compilation of this specific file cannot continue.");

            } catch (TranslationException e) {
                System.err.println("Translation error on file \"" + file + "\": "
                    + e.getMessage());
                
            } catch (JsonExportException e) {
                System.err.println("Json exportation error on file \"" + file + "\": "
                    + e.getMessage());
            } catch (Exception e) {
                System.err.println("An error has occured while compiling file \"" + file +
                    (e.getMessage() != null ? "\": " + e.getMessage() : ""));
            }
        }
    }

    private void start() throws Exception {
        System.out.println("\nInput file: " + in);

        System.out.print("Parsing has started... ");

        ANTLRInputStream inputStream = new ANTLRInputStream(new FileInputStream(in));

        // instantiating error bag and listeners
        MessageBag lexicalBag     = new MessageBag();
        MessageBag syntacticalBag = new MessageBag();
        MessageBag semanticBag    = new MessageBag();

        SyntacticalListener lexics     = new SyntacticalListener(lexicalBag);
        SyntacticalListener syntactics = new SyntacticalListener(syntacticalBag);
        
        // injecting listeners
        ReceiptLexer lexer   = new ReceiptLexer(inputStream);
        lexer.addErrorListener(lexics);
        ReceiptParser parser = new ReceiptParser(new CommonTokenStream(lexer));
        parser.addErrorListener(syntactics);

        // parse input file and retrieve its JsonStructure
        JsonStructure tree = parser.receipt().e;

        // stops compilation proccess if errors were found
        if (lexics.hasErrors()) {
            throw new LexicalException();
        }

        if (syntactics.hasErrors()) {
            throw new SyntacticalException();
        }
        
        System.out.println("Done!");
        
        SemanticListener semantics = new SemanticListener(tree, semanticBag);
        
        if(semantics.hasErrors()) {
            for (String error : semantics.errors()) {
                System.err.println(error);
            }
            
            throw new SemanticException();
        }

        System.out.print("Translation has started... ");
        // print JsonStructure to the String result
        String result = new Translator(tree)
                .run()
                .export();
        
        System.out.println("Done!");

        System.out.print("Exporting .json file... ");

        // export file with printed JsonStructure
        new JsonWriter(out, result)
                .export();

        System.out.println("Done!");
    }
}
