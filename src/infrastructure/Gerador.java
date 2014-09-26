/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure;

import java.util.LinkedList;

/**
 *
 * @author daniel
 */

public class Gerador {
    private static LinkedList<String> nomes = new LinkedList<>();
    private static LinkedList<String> tipos = new LinkedList<>();
    private static String texto = new String();
    
    public static void addText(String str){
        texto += str;
    }
    
    public static String getText(){
        return texto;
    }
    
    public static void addNome(String str){
        nomes.add(str);
    }
    
    public static String getNome(){
        try {
            String strTemp = nomes.peek();
            nomes.pop();
            return strTemp;
        } catch (Exception e) {
        }
        return "vazio";
    }
    
    public static void addTipo(String str){
        tipos.add(str);
    }
    
    public static String getTipo(){
        try {
            String strTemp = tipos.peek();
            tipos.pop();
            return strTemp;
        } catch (Exception e) {
        }
        return "vazio";
    }
}
