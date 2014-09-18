package infrastructure.ErrorListeners;

import infrastructure.MessageBag;

/**
 *
 * @author Lucas
 */
public class SemanticErrorListener {
    
    static MessageBag bag;

    public static void DefineMessageBag(MessageBag bag) {
        SemanticErrorListener.bag = bag;
    }
    
    public static void VariableDoesntExist(int numLinha, String variavel) {
        bag.add("Linha "+numLinha+": identificador "+variavel+" nao declarado");
    }
    
    public static void VariableAlreadyExists(int numLinha, String variavel) {
        bag.add("Linha "+numLinha+": identificador "+variavel+" ja declarado anteriormente");
    }
}
