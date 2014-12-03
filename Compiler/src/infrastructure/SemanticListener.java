package infrastructure;

import infrastructure.json.JsonElement;
import infrastructure.json.JsonStructure;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class SemanticListener {
    
    protected JsonStructure root;
    protected List<String>  errors;
    protected boolean       validate;

    public SemanticListener(JsonStructure _root) {
        root     = _root;
        errors   = new LinkedList<>();
        validate = false;
    }

    public boolean hasErrors() {
        return !Validate().isEmpty();
    }
    
    public List<String> errors() {
        return Validate();
    }
    
    public List<String> Validate() {
        if (!validate) {
            validate = true;
        
            // does validation over root
            RuleOnlyOneFieldOfEachType();
        }
        
        return new LinkedList<>(errors);
    }

    
    protected boolean RuleOnlyOneFieldOfEachType() {
        return RuleOnlyOneFieldOfEachType(root);
    }
    
    protected boolean RuleOnlyOneFieldOfEachType(JsonStructure node) {

        boolean hasErrors = false;
        List<JsonElement> innerElements = new LinkedList<>(node.values);
        
        while(!innerElements.isEmpty()) {
            JsonElement pivot = innerElements.get(0);
            
            int i = 1;
            while (i < innerElements.size()) {
                JsonElement current = innerElements.get(i);
                
                if (pivot.name.toLowerCase().equals(current.name.toLowerCase())) {
                    hasErrors = true;
                    errors.add("The field \"" + pivot.name + "\" has already been declared.");
                    innerElements.remove(i);
                } else {
                    i++;
                }
            }
            
            innerElements.remove(0);
        }

        return !hasErrors;
    }
    
    protected boolean RuleProductsPricesAndTaxesMatchTotal(JsonStructure node) {
        return false;
    }
}
