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
        
            // does validation over root node
            RuleOnlyOneFieldOfEachType();
            RuleProductsPricesAndTaxesMatchTotal();
            RuleZipCode();
            RuleDate();
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
    
    protected boolean RuleProductsPricesAndTaxesMatchTotal() {
        return RuleProductsPricesAndTaxesMatchTotal(root);
    }
    
    protected boolean RuleProductsPricesAndTaxesMatchTotal(JsonStructure node) {
        
        float         actualTotal = 0;
        boolean       hasErrors   = false;
        JsonStructure products    = (JsonStructure)node.get("products");

        float tax = Float
            .parseFloat(node.get("tax").value.substring(1));
        float totalExpected = Float
            .parseFloat(node.get("total").value.substring(1));

        for (JsonElement element : products.values) {
                JsonStructure product = (JsonStructure) element;
                int quantity;
                
                try {
                    quantity = Integer.parseInt(product.get("quantity").value);
                } catch (NullPointerException e) {
                    quantity = 1;
                }
                float cost     = Float.parseFloat(product
                        .get("cost")
                        .value
                        .substring(1));

                actualTotal += cost * quantity;
        }

        if (totalExpected != actualTotal + tax) {
            hasErrors = true;
            errors.add("Total cost of receipt differs from sum of individual values of items plus taxes. Expected: "
                    + totalExpected + ". Actual: " + (actualTotal + tax));
        }
        
        return !hasErrors;
    }
    
    protected boolean RuleZipCode() {
        return RuleZipCode(root);
    }
    
    public boolean RuleZipCode(JsonStructure node){
        boolean       hasErrors = false;
        String zipCode = node.get("zipcode").value.substring(1);
        if (zipCode.length()==9){
            if (zipCode.charAt(5)!='-'){
                errors.add("Zipcode should be in the following format: XXXXX-XX or XXXXXXXX");
                return false;
            }
        }
        if (zipCode.length() != 8 && zipCode.length() != 9){
            errors.add("Zipcode should be in the following format: XXXXX-XX or XXXXXXXX");
            return false;
        }
        return true;
    }
    
    protected boolean RuleDate() {
        return RuleDate(root);
    }
    
    public boolean RuleDate(JsonStructure node){
        String date = node.get("date").value.substring(1);
        if (date.length() == 8 || date.length() == 10){
            if ((date.charAt(2) == '-' && date.charAt(5) == '-') || (date.charAt(2) == '/' && date.charAt(5) == '/')) {
                return true;
            }
        }
        errors.add("Date should be in one of the following formats:\nDD/MM/AAAA or DD/MM/AA\nDD-MM-AAAA or DD-MM-AA");
        return false;
    }
}
