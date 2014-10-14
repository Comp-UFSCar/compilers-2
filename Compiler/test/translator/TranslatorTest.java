package translator;

import java.util.HashSet;
import org.junit.Test;
import static org.junit.Assert.*;
import translator.infrastructure.JsonElement;
import translator.infrastructure.JsonList;
import translator.infrastructure.exception.TranslationException;

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

        JsonList element = new JsonList("receipt", set);

        Translator translator = new Translator(element);

        translator.run();

        String result = translator.export();
        String expected = "receipt: {\n\tname: 'John Hall',\n}\n";

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
        set.add(new JsonElement("id", 1));
        set.add(new JsonElement("name", "John Hall"));
        set.add(new JsonList("address", address));

        JsonList element = new JsonList("receipt", set);

        Translator translator = new Translator(element);

        translator.run();

        String result = translator.export();
        String expected = "receipt: {\n"
                + "\tid: '1',\n"
                + "\tname: 'John Hall',\n"
                + "\taddress: {\n"
                + "\t\tCountry: 'USA',\n"
                + "\t\tCity: 'Philadelphia',\n"
                + "\t\tState: 'Pennsylvania',\n"
                + "\t\tStreet: '3200 Race St. 19104',\n"
                + "\t}\n"
                + "}\n";
        
        assertTrue(result.equals(expected));
    }
}
