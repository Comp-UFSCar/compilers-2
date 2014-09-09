package infrastructure;

import java.util.BitSet;
import java.util.HashMap;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ErrorListener implements ANTLRErrorListener {

    SaidaParser sp;
    HashMap<String, String> tokens;

    public ErrorListener(SaidaParser sp) {
        this.sp = sp;
        tokens = new HashMap<>();
        
        tokens.put("<EOF>", "EOF");
    }

    @Override
    public void syntaxError(Recognizer<?, ?> rcgnzr, Object o, int i, int i1, String string, RecognitionException re) {
        String token = ((CommonToken) o).getText();
        
        if (tokens.containsKey(token)) {
            token = tokens.get(token);
        }
        
//        lexics
//        if (string.contains("extraneous input")) {
//            sp.println("Linha " + i + ": " + token.getText() + " - simbolo nao identificado");
//            
//        // syntatics
//        } else {
        sp.println("Linha " + i + ": erro sintatico proximo a " + token);
//        }
    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean bln, BitSet bitset, ATNConfigSet atncs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitset, ATNConfigSet atncs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atncs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
