/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure.Simbols;

/**
 *
 * @author daniel
 */
public class Entry {
    private String nome, tipo1, tipo2;
    
    public Entry(String nome, String tipo1, String tipo2) {
        this.nome = nome;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getTipo1() {
        return tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }
    
    @Override
    public String toString() {
        return nome+"("+tipo1+")"+" ("+tipo2+")";
    }
}
