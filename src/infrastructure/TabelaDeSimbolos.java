/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class TabelaDeSimbolos {

    private String escopo;
    private List<EntradaTabelaDeSimbolos> simbolos;

    public TabelaDeSimbolos(String escopo) {
        simbolos = new ArrayList<EntradaTabelaDeSimbolos>();
        this.escopo = escopo;
    }

    public void adicionarSimbolo(String nome, String tipo1, String tipo2) {
        //System.out.println(nome);
        simbolos.add(new EntradaTabelaDeSimbolos(nome, tipo1, tipo2));
    }

    public void adicionarSimbolos(List<String> nomes, String tipo1, String tipo2) {
        for (String s : nomes) {
            simbolos.add(new EntradaTabelaDeSimbolos(s, tipo1, tipo2));
        }
    }

    public boolean existeSimbolo(String nome) {
        for (EntradaTabelaDeSimbolos etds : simbolos) {
            if (etds.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public String getEscopo() {
        return escopo;
    }

    public EntradaTabelaDeSimbolos getSimbol(String name) {
        for (EntradaTabelaDeSimbolos current : simbolos) {
            if (current.getNome().equals(name)) {
                return current;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        String ret = "Escopo: " + escopo;
        for (EntradaTabelaDeSimbolos etds : simbolos) {
            ret += "\n   " + etds;
        }
        return ret;
    }

    public String retornaTipo(String nome) {
        nome = nome.toLowerCase();

        for (EntradaTabelaDeSimbolos current : simbolos) {
            if (current.getNome().equals(nome)) {
                return current.getTipo2();
            }
        }

        return null;
    }
}
