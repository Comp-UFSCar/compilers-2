/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure;

/**
 *
 * @author daniel
 */

public class Mensagens {
    
    private static String texto = new String();
    
    public static void addText(String str){
        texto += str;
    }
    
    public static String getText(){
        return texto;
    }
}
