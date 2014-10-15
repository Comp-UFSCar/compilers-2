package translator;

import infrastructure.JsonElement;
import infrastructure.JsonList;
import translator.infrastructure.exception.TranslationException;

/**
 *
 * @author Lucas
 */
public class Translator {

    protected JsonList base;
    protected String exported;

    public Translator() {
        reset(null);
    }

    public Translator(JsonList base) {
        reset(base);
    }
    
    public final Translator reset(JsonList base) {
        this.base = base;
        exported = null;
        
        return this;
    }

    public Translator run() {
        if (base == null) {
            throw new TranslationException("Cannot export unitialized translator. Try to set the property base first.");
        }
        if (exported != null) {
            throw new TranslationException("The current translator has already been executed. Export the code using Translator.export().");
        }

        exported = "";
        describeJsonList(base);

        return this;
    }

    public String export() {
        if (exported == null) {
            throw new TranslationException("Cannot export unrunned translator. Try to execute the method Translator.run() first.");
        }

        return exported;
    }

    protected Translator describeJsonItem(JsonElement node, int scope) {
        tabScope(scope);
        
        exported += node.name + ": " + "'" + node.value + "',\n";
        return this;
    }
    
    protected Translator describeJsonList(JsonList node) {
        return describeJsonList(node, 0);
    }

    protected Translator describeJsonList(JsonList node, int scope) {
        tabScope(scope);
        exported += node.name + ": ";
        enterScope();

        for (JsonElement el : node.values) {
            if (el instanceof JsonList) {
                describeJsonList((JsonList) el, scope + 1);
            } else {
                describeJsonItem(el, scope + 1);
            }
        }

        exitScope(scope);
        return this;
    }

    protected Translator enterScope() {
        exported += "{\n";

        return this;
    }

    protected Translator exitScope(int scope) {
        tabScope(scope);
        exported += "}\n";

        return this;
    }
    
    protected Translator tabScope(int scope) {
        for (int i = 0; i < scope; i++) {
            exported += '\t';
        }
        
        return this;
    }
}
