/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package translator.infrastructure;

import infrastructure.JsonElement;
import infrastructure.JsonList;
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
        list1.add(new JsonElement("id", 1));
        list1.add(new JsonElement("name", "What a nice name you have"));
        list1.add(new JsonElement("age", 24));
        
        HashSet<JsonElement> list2 = new HashSet<>();
        list2.add(new JsonElement("id", 1));
        list2.add(new JsonElement("name", "What a nice name you have"));
        list2.add(new JsonElement("age", 24));
        
        JsonList jList1 = new JsonList("person", list1);
        JsonList jList2 = new JsonList("person", list2);
        
        assertEquals(jList1, jList2);
    }
    
    @Test
    public void methodEqualsForDifferentObjects() {
        HashSet<JsonElement> list1 = new HashSet<>();
        list1.add(new JsonElement("id", 2));
        list1.add(new JsonElement("name", "What a nice name you have"));
        list1.add(new JsonElement("age", 14));
        
        HashSet<JsonElement> list2 = new HashSet<>();
        list2.add(new JsonElement("id", 1));
        list2.add(new JsonElement("mame", "A totally different person"));
        list2.add(new JsonElement("age", 24));
        
        JsonList jList1 = new JsonList("person", list1);
        JsonList jList2 = new JsonList("person", list2);
        
        assertFalse(jList1.equals(jList2));
    }
}
