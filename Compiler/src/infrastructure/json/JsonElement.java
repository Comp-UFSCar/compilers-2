package infrastructure.json;

import java.util.Objects;

/**
 *
 * @author Lucas
 */
public class JsonElement {

    public String name;
    public String value;

    protected JsonElement() {
        //
    }

    public JsonElement(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            JsonElement jEl = (JsonElement) obj;
            return super.equals(obj) || this.name.equals(jEl.name) && this.value.equals((jEl.value));
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.value);
        return hash;
    }

    @Override
    public String toString() {
        return name + ": " + value.toString();
    }
}
