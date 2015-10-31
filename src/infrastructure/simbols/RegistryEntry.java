package infrastructure.simbols;

import java.util.List;

/**
 *
 * @author lucas
 */
public class RegistryEntry extends Entry {

    SimbolTable inner;

    public RegistryEntry(String name, SimbolTable innerTable) {
        super(name, "tipo", "registro");
        inner = innerTable;
    }
}
