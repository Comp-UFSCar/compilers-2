package infrastructure.simbols;

import java.util.List;

/**
 *
 * @author lucas
 */
public class FunctionEntry extends Entry {
    
    List<String> parameters;
    
    public FunctionEntry(String name, List<String> params, String type) {
        super(name, "function", type);
        
        parameters = params;
    }
}
