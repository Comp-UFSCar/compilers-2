/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class PilhaDeTabelas {

    private LinkedList<TabelaDeSimbolos> pilha;

    public PilhaDeTabelas() {
        pilha = new LinkedList<>();
    }

    public void empilhar(TabelaDeSimbolos ts) {
        pilha.push(ts);
    }

    public TabelaDeSimbolos topo() {
        return pilha.peek();
    }

    public boolean existeSimbolo(String nome) {
        for (TabelaDeSimbolos ts : pilha) {
            if (ts.existeSimbolo(nome)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Gets simbol defined in the nearest (latest) scope.
     * 
     * @param name of the simbol
     * @return simbol with the a name as defined in @name
     */
    public EntradaTabelaDeSimbolos getSimbol(String name) {

        for (TabelaDeSimbolos current : pilha) {
            EntradaTabelaDeSimbolos entry = current.getSimbol(name);

            if (entry != null) {
                return entry;
            }
        }

        return null;
    }

    public void desempilhar() {
        TabelaDeSimbolos ret = pilha.pop();
    }

    public List getTodasTabelas() {
        return pilha;
    }
}
