/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure.Simbols;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class SimbolTable {

    private String escopo;
    private List<Entry> simbolos;

    public SimbolTable(String escopo) {
        simbolos = new ArrayList<Entry>();
        this.escopo = escopo;
    }

    public void adicionarSimbolo(String nome, String tipo1, String tipo2) {
        //System.out.println(nome);
        simbolos.add(new Entry(nome.toLowerCase(), tipo1, tipo2));
    }

    public void addFunction(String name, List<String> params, String type) {
        simbolos.add(new FunctionEntry(name, params, type));
    }
    
    public void addProcedure(String name, List<String> params) {
        simbolos.add(new FunctionEntry(name, params, null));
    }

    public List<String> getParametersOf(String name) {
        for (Entry entry : simbolos) {
            if (entry.getNome().equals(name.toLowerCase())) {

                FunctionEntry asFunctionEntry = (FunctionEntry) entry;
                if (asFunctionEntry != null) {
                    return asFunctionEntry.parameters;
                }
            }
        }
        return null;
    }

    public void adicionarSimbolos(List<String> nomes, String tipo1, String tipo2) {
        for (String s : nomes) {
            simbolos.add(new Entry(s.toLowerCase(), tipo1, tipo2));
        }
    }

    public boolean existeSimbolo(String nome) {
        for (Entry etds : simbolos) {
            if (etds.getNome().equals(nome.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public String getEscopo() {
        return escopo;
    }

    public Entry getSimbol(String name) {
        for (Entry current : simbolos) {
            if (current.getNome().equals(name.toLowerCase())) {
                return current;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        String ret = "Escopo: " + escopo;
        for (Entry etds : simbolos) {
            ret += "\n   " + etds;
        }
        return ret;
    }

    public String retornaTipo(String nome) {
        nome = nome.toLowerCase();

        for (Entry current : simbolos) {
            if (current.getNome().equals(nome)) {
                return current.getTipo2();
            }
        }

        return null;
    }
}
