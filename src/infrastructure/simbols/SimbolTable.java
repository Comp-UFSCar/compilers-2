/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure.simbols;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class SimbolTable {

    private String scope;
    private List<Entry> simbols;

    public SimbolTable(String escopo) {
        this.scope = escopo;
        simbols = new ArrayList<>();
    }

    public void add(String nome, String tipo1, String tipo2) {
        simbols.add(new Entry(nome.toLowerCase(), tipo1.toLowerCase(), tipo2.toLowerCase()));
    }

    public void addFunction(String name, List<String> params, String type) {
        simbols.add(new FunctionEntry(name.toLowerCase(), params, type.toLowerCase()));
    }

    public void addProcedure(String name, List<String> params) {
        simbols.add(new FunctionEntry(name.toLowerCase(), params, null));
    }

    public List<String> parametersOf(String name) {
        for (Entry entry : simbols) {
            if (entry.getNome().equals(name.toLowerCase())) {

                FunctionEntry asFunctionEntry = (FunctionEntry) entry;
                if (asFunctionEntry != null) {
                    return asFunctionEntry.parameters;
                }
            }
        }

        return null;
    }

    public void addRegistry(String name, SimbolTable innerTable) {
        simbols.add(new RegistryEntry(name.toLowerCase(), innerTable));
    }

    public void addType(String name, String extendedType) {
    }
    
    public void addAll(List<String> nomes, String tipo1, String tipo2) {
        for (String s : nomes) {
            simbols.add(new Entry(s.toLowerCase(), tipo1, tipo2));
        }
    }

    public String typeOf(String name) {

        String[] translated = translate(name);

        List<Entry> table = simbols;
        // for each name, e.g.: name.subname.subname
        for (int i = 0; i < translated.length; i++) {
            // compares if current is the searched name
            for (Entry entry : table) {
                if (entry.getNome().equals(translated[i])) {
                    // if it is the last element, the entiry name is valid
                    if (i == translated.length - 1) {
                        return entry.getTipo2();
                    }

                    // it is not the last name, but this table does not
                    // contain a registry with the searched name,
                    // returns false so further tables can be looked at.
                    if (!entry.getTipo2().equals("registro")) {
                        // the entry exists in the table but it is not an
                        // registry and it doesnt have any attributes
                        // returns null so further tables can be searched by.
                        return null;
                    }

                    table = ((RegistryEntry) entry).inner.simbols;
                    break;
                }
            }
        }

        return null;
    }

    public boolean has(String name) {

        String[] translated = translate(name);

        // translated.length > 1 => it is a registry
        List<Entry> table = simbols;

        // for each name, e.g.: name.subname.subname
        for (int i = 0; i < translated.length; i++) {
            // search in the current table for the item
            for (Entry entry : table) {
                if (entry.getNome().equals(translated[i])) {
                    // if it is the last element, the entiry name is valid
                    if (i == translated.length - 1) {
                        return true;
                    }

                    // it is not the last name, but this table does not
                    // contain a registry with the searched name,
                    // returns false so further tables can be looked at.
                    if (!entry.getTipo2().equals("registro")) {
                        return false;
                    }

                    table = ((RegistryEntry) entry).inner.simbols;
                    break;
                }
            }
        }
        return false;
    }

    public String scope() {
        return scope;
    }

    public Entry get(String name) {
        for (Entry current : simbols) {
            if (current.getNome().equals(name.toLowerCase())) {
                return current;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        String ret = "Escopo: " + scope;
        for (Entry etds : simbols) {
            ret += "\n   " + etds;
        }
        return ret;
    }

    private String[] translate(String name) {
        return name.toLowerCase().split("\\.");
    }
}
