/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package translator.infrastructure;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas
 */
public class JsonElementTest {
    
    @Test
    public void methodToString() {
        JsonElement el = new JsonElement("id", "2034");
        
        assertEquals("id: 2034", el.toString());
    }
    
    @Test
    public void methodEqualsForEqualJsonElements() {
        JsonElement el1 = new JsonElement("id", 10);
        JsonElement el2 = new JsonElement("id", 10);
        
        assertEquals(el1, el2);
    }
    
    @Test
    public void methodEqualsForDifferentJsonElements() {
        JsonElement el1 = new JsonElement("id", 10);
        JsonElement el2 = new JsonElement("id", "a nice random value");
        
        assertFalse(el1.equals(el2));
    }
}
