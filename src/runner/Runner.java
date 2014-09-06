package runner;

import infrastructure.SaidaParser;
import infrastructure.ErrorListener;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import laparser.LaLexer;
import laparser.LaParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Runner {
    
    public static void main(String[] args) throws Exception {
        
        String inputFile = "D:/Repositories/Compilers-2-assignment-1/src/testcases/1.arquivos_com_erros_sintaticos/entrada/1-algoritmo_2-2_apostila_LA_1_erro_linha_3_acusado_linha_10.txt",
               outputFile = "D:/Repositories/Compilers-2-assignment-1/src/reports/" + System.nanoTime() + ".txt";
        
        if (args.length > 0) {
            inputFile = args[0];
            
            if (args.length > 1) {
                outputFile = args[1];
            }
        }

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
}
