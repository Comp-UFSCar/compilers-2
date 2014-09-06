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

public class Runner {

    public static void main(String[] args) throws Exception {

        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[0]));
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

        PrintWriter saida = new PrintWriter(new FileWriter(args[1]));
        saida.print(out);
        saida.flush();
        saida.close();
    }
}
