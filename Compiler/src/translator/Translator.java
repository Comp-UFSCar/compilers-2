package translator;

import json.infrastructure.JsonElement;
import json.infrastructure.JsonStructure;
import translator.infrastructure.exception.TranslationException;

/**
 *
 * @author Lucas
 */
public class Translator {

    protected JsonStructure base;
    protected String exported;

    public Translator() {
        reset(null);
    }

    public Translator(JsonStructure base) {
        reset(base);
    }

    public final Translator reset(JsonStructure base) {
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
        describeBase(base);
        return this;
    }

    public String export() {
        if (exported == null) {
            throw new TranslationException("Cannot export unrunned translator. Try to execute the method Translator.run() first.");
        }

        return exported;
    }

    protected Translator describe(JsonElement node, int scope) {
        if (node != null) {
            tabScope(scope);

            try {
                JsonStructure structure = (JsonStructure) node;

                exported += '"' + node.name + "\":";
                enterScope();

                for (JsonElement child : structure.values) {
                    describe(child, scope + 1);
                    exported += ",\n";
                }
                exitScope(scope);
            } catch (ClassCastException e) {
                exported += '"' + node.name + "\": " + '"' + node.value + "\"";
            }
        }
        return this;
    }

    protected Translator describeBase(JsonStructure node) {
        exported = "";

        enterScope();

        for (JsonElement el : node.values) {
            describe(el, 1);
            exported += ",\n";
        }

        exported += "}\n";
        return this;
    }

    protected Translator enterScope() {
        exported += "{\n";

        return this;
    }

    protected Translator exitScope(int scope) {
        tabScope(scope);
        exported += "}";

        return this;
    }

    protected Translator tabScope(int scope) {
        for (int i = 0; i < scope; i++) {
            exported += '\t';
        }

        return this;
    }
}
