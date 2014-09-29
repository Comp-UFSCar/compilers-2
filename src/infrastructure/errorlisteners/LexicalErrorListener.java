package infrastructure.errorlisteners;

import infrastructure.messagebag.MessageBag;
import infrastructure.messagebag.StringConversionMap;
import java.util.BitSet;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class LexicalErrorListener implements ANTLRErrorListener {

    MessageBag bag;
    StringConversionMap tokens;

    public LexicalErrorListener(MessageBag bag) {
        this.bag = bag;
        tokens = new StringConversionMap();
    }

    @Override
    public void syntaxError(Recognizer<?, ?> rcgnzr, Object o, int i, int i1, String string, RecognitionException re) {
        // extracting undentified token from message
        String token = string.substring(string.indexOf('\'')+1, string.lastIndexOf('\''));
        
        token
            = tokens.containsKey(token)
            ? tokens.value(token)
            : token.substring(0,1)
            ;
        
        if(token.equals("{")) {
            bag.add("Linha " + (i+1) + ": comentario nao fechado");
        }
        else {
            bag.add("Linha " + i + ": " + token + " - simbolo nao identificado");
        }
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
