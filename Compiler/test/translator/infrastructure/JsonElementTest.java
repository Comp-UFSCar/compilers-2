package translator.infrastructure;

import infrastructure.json.JsonElement;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas
 */
public class JsonElementTest {
    
    @Test
    public void testToString() {
        JsonElement el = new JsonElement("id", "2034");
        
        assertEquals("id: 2034", el.toString());
    }
    
    @Test
    public void testEqualsForEqualJsonElements() {
        JsonElement el1 = new JsonElement("id", 10);
        JsonElement el2 = new JsonElement("id", 10);
        
        assertEquals(el1, el2);
    }
    
    @Test
    public void testEqualsForDifferentJsonElements() {
        JsonElement el1 = new JsonElement("id", 10);
        JsonElement el2 = new JsonElement("id", "a nice random value");
        
        assertFalse(el1.equals(el2));
    }
}
