package infrastructure;

import infrastructure.json.JsonElement;
import infrastructure.json.JsonStructure;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class SemanticListener {

    protected JsonStructure root;
    protected List<String> errors;
    protected boolean validate;

    public SemanticListener(JsonStructure _root) {
        root = _root;
        errors = new LinkedList<>();
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
            if (root.getStructure("seller").get("address") != null) {
                RuleZipCode(root.getStructure("seller").getStructure("address"));
            }

            if (root.getStructure("buyer").get("address") != null) {
                RuleZipCode(root.getStructure("buyer").getStructure("address"));
            }

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

        while (!innerElements.isEmpty()) {
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

        float actualTotal = 0;
        boolean hasErrors = false;
        JsonStructure products = (JsonStructure) node.get("products");

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
            float cost = Float.parseFloat(product
                    .get("cost").value
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

    protected boolean RuleZipCode(JsonStructure node) {

        String zipCode = node
                .get("zipcode").value;

        // semantic validation for zipcode
        return true;
    }

    protected boolean RuleDate() {
        return RuleDate(root);
    }

    protected boolean RuleDate(JsonStructure node) {
        
        DateFormat format;
        Date date;

        String token = node
                .get("date")
                .value;
        
        try {
            format = new SimpleDateFormat("mm/dd/yyyy");
            date = format.parse(token);
        } catch (ParseException e) {
            try {
                format = new SimpleDateFormat("dd/mm/yyyy");
                date = format.parse(token);
                
            } catch (ParseException secondE) {
                errors.add("Actual date is in an unknown format or is invalid: " + token + ".");
                return false;
            }
        }
        
        if (new Date().compareTo(date) < 0) {
            errors.add("Actual date is after current date. Actual date: " + date
                    + ". Current date: " + new Date());
            return false;
        }
        
        if (Calendar.YEAR - date.getYear() >= 100) {
            errors.add("Actual date is way before current date. Actual date's year: " + date.getYear()
                    + ". Current date's year: " + Calendar.YEAR);
            return false;
        }
        
        return true;
    }
}
