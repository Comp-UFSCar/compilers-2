/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure;

import infrastructure.Simbols.Entry;
import infrastructure.Simbols.SimbolTable;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class PilhaDeTabelas {

    private LinkedList<SimbolTable> pilha;

    public PilhaDeTabelas() {
        pilha = new LinkedList<>();
    }

    public void empilhar(SimbolTable ts) {
        pilha.push(ts);
    }

    public SimbolTable topo() {
        return pilha.peek();
    }
    
    public SimbolTable subtopo() {
        return pilha.get(1);
    }

    public boolean existeSimbolo(String nome) {
        for (SimbolTable ts : pilha) {
            if (ts.existeSimbolo(nome)) {
                return true;
            }
        }
        return false;
    }

    public String retornaTipo(String nome) {
        try {
            for (SimbolTable ts : pilha) {
                String tipo = ts.retornaTipo(nome);
                if (tipo != null) {
                    return tipo;
                }
            }
        } catch (NullPointerException e) {
            // returns null
        }
        return null;
    }

    /**
     * Gets simbol defined in the nearest (latest) scope.
     *
     * @param name of the simbol
     * @return simbol with the a name as defined in
     * @name
     */
    public Entry getSimbol(String name) {

        for (SimbolTable current : pilha) {
            Entry entry = current.getSimbol(name);

            if (entry != null) {
                return entry;
            }
        }

        return null;
    }
    
    public List<String> getParametersOf(String name) {
        
        for (SimbolTable table : pilha) {
            List<String> parameters = table.getParametersOf(name);
            
            if (parameters != null) {
                return parameters;
            }
        }
        
        return null;
    }

    public void desempilhar() {
        SimbolTable ret = pilha.pop();
    }

    public List getTodasTabelas() {
        return pilha;
    }
}
