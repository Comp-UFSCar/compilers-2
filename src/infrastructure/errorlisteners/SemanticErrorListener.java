package infrastructure.errorlisteners;

import infrastructure.messagebag.MessageBag;

/**
 *
 * @author Lucas
 */
public class SemanticErrorListener {

    static MessageBag bag;

    public static void DefineMessageBag(MessageBag bag) {
        SemanticErrorListener.bag = bag;
    }

    public static void VariableDoesntExist(int line, String variable) {
        bag.add("Linha " + line + ": identificador " + variable + " nao declarado");
    }

    public static void VariableAlreadyExists(int line, String variable) {
        bag.add("Linha " + line + ": identificador " + variable + " ja declarado anteriormente");
    }

    public static void TypeDoesntExist(int line, String type) {
        bag.add("Linha " + line + ": tipo " + type + " nao declarado");
    }
    
    public static void TypeAlreadyExists(int line, String type) {
        bag.add("Linha " + line + ": tipo " + type + " ja declarado anteriormente");
    }

    public static void ScopeNotAllowed(int line) {
        bag.add("Linha " + line + ": comando retorne nao permitido nesse escopo");
    }

    public static void AttributionNotAllowed(int line, String variable) {
        bag.add("Linha " + line + ": atribuicao nao compativel para " + variable);
    }

    public static void MisuseOfCaretOperator(int line, String variable) {
        bag.add("Linha " + line + ": uso indevido do ^ em " + variable);
    }

    public static void ArgumentIncompatibility(int line, String function) {
        bag.add("Linha " + line + ": incompatibilidade de parametros na chamada de " + function);
    }
}
