package json.infrastructure;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author Lucas
 */
public class JsonStructure extends JsonElement {

    public HashSet<JsonElement> values;

    public JsonStructure(String name) {
        this(name, null);
    }

    public JsonStructure(String name, Collection<JsonElement> values) {
        this.values
            = values == null || values.isEmpty()
            ? new HashSet<>()
            : new HashSet<>(values)
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
