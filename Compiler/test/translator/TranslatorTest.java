package translator;

import infrastructure.exceptions.TranslationException;
import infrastructure.json.JsonElement;
import infrastructure.json.JsonStructure;
import infrastructure.translator.Translator;
import java.util.HashSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas
 */
public class TranslatorTest {

    @Test(expected = TranslationException.class)
    public void methodRunWithInvalidBase() {
        Translator translator = new Translator();

        translator.run();
    }

    @Test
    public void methodRunWithValidBase() {

        HashSet<JsonElement> set = new HashSet<>();
        set.add(new JsonElement("name", "John Hall"));

        JsonStructure element = new JsonStructure("receipt", set);

        Translator translator = new Translator(element)
            .run();

        String result   = translator.export();
        String expected = "{\n\t\"name\": \"John Hall\",\n}\n";
        
        assertTrue(result.equals(expected));
    }

    @Test
    public void methodRunWithValidComplexBase() {

        HashSet<JsonElement> address = new HashSet<>();
        address.add(new JsonElement("Street", "3200 Race St. 19104"));
        address.add(new JsonElement("City", "Philadelphia"));
        address.add(new JsonElement("State", "Pennsylvania"));
        address.add(new JsonElement("Country", "USA"));

        HashSet<JsonElement> set = new HashSet<>();
        set.add(new JsonElement("id", "1"));
        set.add(new JsonElement("name", "John Hall"));
        set.add(new JsonStructure("address", address));

        JsonStructure element = new JsonStructure("receipt", set);

        Translator translator = new Translator(element)
            .run();

        String result = translator.export();
        String expected = "{\n"
                        + "\t\"id\": \"1\",\n"
                        + "\t\"name\": \"John Hall\",\n"
                        + "\t\"address\": {\n"
                        + "\t\t\"Country\": \"USA\",\n"
                        + "\t\t\"City\": \"Philadelphia\",\n"
                        + "\t\t\"State\": \"Pennsylvania\",\n"
                        + "\t\t\"Street\": \"3200 Race St. 19104\",\n"
                        + "\t},\n"
                        + "}\n"
                        ;
        
        assertTrue(result.equals(expected));
    }
}
