package translator.infrastructure;

import infrastructure.json.JsonElement;
import infrastructure.json.JsonStructure;
import java.util.HashSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas
 */
public class JsonListTest {
    
    @Test
    public void methodEqualsForEqualObjects() {
        HashSet<JsonElement> list1 = new HashSet<>();
        list1.add(new JsonElement("id", "1"));
        list1.add(new JsonElement("name", "What a nice name you have"));
        list1.add(new JsonElement("age", "24"));
        
        HashSet<JsonElement> list2 = new HashSet<>();
        list2.add(new JsonElement("id", "1"));
        list2.add(new JsonElement("name", "What a nice name you have"));
        list2.add(new JsonElement("age", "24"));
        
        JsonStructure jList1 = new JsonStructure("person", list1);
        JsonStructure jList2 = new JsonStructure("person", list2);
        
        assertEquals(jList1, jList2);
    }
    
    @Test
    public void methodEqualsForDifferentObjects() {
        HashSet<JsonElement> list1 = new HashSet<>();
        list1.add(new JsonElement("id", "2"));
        list1.add(new JsonElement("name", "What a nice name you have"));
        list1.add(new JsonElement("age", "14"));
        
        HashSet<JsonElement> list2 = new HashSet<>();
        list2.add(new JsonElement("id", "1"));
        list2.add(new JsonElement("mame", "A totally different person"));
        list2.add(new JsonElement("age", "24"));
        
        JsonStructure jList1 = new JsonStructure("person", list1);
        JsonStructure jList2 = new JsonStructure("person", list2);
        
        assertFalse(jList1.equals(jList2));
    }
}
