package infrastructure.json;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Lucas
 */
public class JsonStructure extends JsonElement {

    public List<JsonElement> values;

    public JsonStructure(String name) {
        this(name, null);
    }

    public JsonStructure(String name, Collection<JsonElement> values) {
        this.values
            = values == null || values.isEmpty()
            ? new ArrayList<>()
            : new ArrayList<>(values)
            ;

        this.name = name;
    }

    public JsonStructure add(JsonElement el) {
        values.add(el);
        return this;
    }

    public JsonStructure remove(JsonElement el) {
        values.remove(el);
        return this;
    }
    
    public JsonElement get(String name) {
        for (JsonElement element : values) {
            if (element.name.toLowerCase().equals(name)) {
                return element;
            }
        }
        
        return null;
    }
    
    public JsonStructure getStructure(String name) {
        for (JsonElement element : values) {
            if (element.name.toLowerCase().equals(name)) {
                try {
                    return (JsonStructure)element;
                } catch (ClassCastException e) {
                    return null;
                }
            }
        }
        
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            JsonStructure jEl = (JsonStructure) obj;
            return super.equals(obj) || this.name.equals(jEl.name) && this.values.equals((jEl.values));
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.values);
        return hash;
    }
}
