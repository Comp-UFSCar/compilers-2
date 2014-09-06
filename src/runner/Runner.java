package runner;

import infrastructure.SaidaParser;
import infrastructure.T1ErrorListener;
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
        T1ErrorListener listener = new T1ErrorListener(out);

        parser.addErrorListener(listener);
        lexer.addErrorListener(listener);
        
        parser.programa();

        if (!out.isModificado()) {
            out.println("Fim da analise. Sem erros sintaticos.");
//            TabelaDeSimbolos.imprimirTabela(out);
            System.out.print(out);
        } else {
            out.println("Fim da analise. Com erros sintaticos.");
        }

        PrintWriter saida = new PrintWriter(new FileWriter(args[1]));
        saida.println(out);
        saida.flush();
        saida.close();
    }
}
