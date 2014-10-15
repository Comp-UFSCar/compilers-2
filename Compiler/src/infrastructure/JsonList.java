package infrastructure;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author Lucas
 */
public class JsonList extends JsonElement {

    public HashSet<JsonElement> values;

    public JsonList(String name) {
        this(name, null);
    }

    public JsonList(String name, Collection<JsonElement> values) {
        this.values
            = values == null || values.isEmpty()
            ? new HashSet<>()
            : new HashSet<>(values)
            ;

        this.name = name;
    }

    public JsonList add(JsonElement el) {
        values.add(el);
        return this;
    }

    public JsonList remove(JsonElement el) {
        values.remove(el);
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            JsonList jEl = (JsonList) obj;
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
