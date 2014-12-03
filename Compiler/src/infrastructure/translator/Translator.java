package infrastructure.translator;

import infrastructure.json.JsonElement;
import infrastructure.json.JsonStructure;
import infrastructure.exceptions.TranslationException;

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

    public Translator run() throws TranslationException {
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

                exported += '"' + node.name + "\": ";
                enterScope();
                
                int last = structure.values.size() -1;
                
                for (int i = 0; i < last; i++) {
                    if (structure.values.get(i) != null) {
                        describe(structure.values.get(i), scope + 1);
                        exported += ",\n";
                    }
                }
                
                // describes last item without a comma
                if (structure.values.get(last) != null) {
                    describe(structure.values.get(last), scope + 1);
                    exported += "\n";
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

        int last = node.values.size() -1;
        for (int i = 0; i < node.values.size() -1; i++) {
            if (node.values.get(i) != null) {
                describe(node.values.get(i), 1);
                exported += ",\n";
            }
        }

        // describes last item without a comma
        if (node.values.get(last) != null) {
            describe(node.values.get(last), 1);
            exported += "\n";
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
