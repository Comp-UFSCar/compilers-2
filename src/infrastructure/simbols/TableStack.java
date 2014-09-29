/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure.simbols;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class TableStack {

    private LinkedList<SimbolTable> stack;

    public TableStack() {
        stack = new LinkedList<>();
    }

    public void push(SimbolTable ts) {
        stack.push(ts);
    }

    public SimbolTable top() {
        return stack.peek();
    }
    
    public SimbolTable subtop() {
        return stack.get(1);
    }

    public boolean has(String nome) {        
        for (SimbolTable ts : stack) {
            if (ts.has(nome)) {
                return true;
            }
        }
        return false;
    }

    public String typeOf(String name) {
        try {
            for (SimbolTable ts : stack) {
                String tipo = ts.typeOf(name);
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
    public Entry get(String name) {

        for (SimbolTable current : stack) {
            Entry entry = current.get(name);

            if (entry != null) {
                return entry;
            }
        }

        return null;
    }
    
    public List<String> parametersOf(String name) {
        
        for (SimbolTable table : stack) {
            List<String> parameters = table.parametersOf(name);
            
            if (parameters != null) {
                return parameters;
            }
        }
        
        return null;
    }

    public void pop() {
        SimbolTable ret = stack.pop();
    }
}
