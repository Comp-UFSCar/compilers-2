package infrastructure;

import infrastructure.json.JsonElement;
import infrastructure.json.JsonStructure;
import infrastructure.messagebag.MessageBag;
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
public class SemanticListener extends BaseListener {

    protected JsonStructure root;
    protected boolean validate;

    public SemanticListener(JsonStructure root, MessageBag bag) {
        super(bag);
        this.root = root;
        validate  = false;
    }
    
    @Override
    public boolean hasErrors() {
        return !Validate().isEmpty();
    }
    
    @Override
    public List<String> errors() {
        return Validate().all();
    }

    /**
     * Validate @root using the rules defined below.
     * 
     * @return the bag of messages containing all errors found.
     */
    public MessageBag Validate() {
        if (!validate) {
            validate = true;

            // does validation over root node
            RuleOnlyOneFieldOfEachType();
            RuleProductsPricesAndTaxesMatchTotal();
            
            // seller has given their address
            if (root.getStructure("seller").get("address") != null) {
                RuleZipCode(root.getStructure("seller").getStructure("address"));
            }

            // buyer has given their address
            if (root.getStructure("buyer").get("address") != null) {
                RuleZipCode(root.getStructure("buyer").getStructure("address"));
            }

            RuleDate();
        }

        return bag;
    }

    protected boolean RuleOnlyOneFieldOfEachType() {
        return RuleOnlyOneFieldOfEachType(root);
    }

    /**
     * Asserts that JsonStructure @node only contains one field of each
     * type.
     * 
     * Valid example:   { id, date, tax, total          }
     * Invalid example: { id, id, date, tax, tax, total }
     * 
     * @param node that will be verified.
     * @return true, if node contains only one field of each type.
     * False, otherwise.
     */
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
                    bag.add("The field \"" + pivot.name + "\" has already been declared.");
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

    /**
     * Asserts that sum(products.cost * products.quantity) + tax = total.
     * 
     * @param node JsonStructure which contains the
     * fields @products, @tax and @total.
     * @return true, if the equation is correct. False, otherwise.
     */
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

        // total differs from individual values + taxes
        if (totalExpected != actualTotal + tax) {
            hasErrors = true;
            bag.add("Total cost of receipt differs from the sum of each item's cost multiplied its quantity, adding taxes. Expected: "
                    + totalExpected + ". Actual: " + (actualTotal + tax));
        }

        return !hasErrors;
    }

    protected boolean RuleZipCode() {
        return RuleZipCode(root);
    }

    /**
     * Assert that the zip-code field contains valid data.
     * @param node the JsonStructure which contains the field @zipcode
     * @return true, if @zipcode is correct. False, otherwise.
     */
    protected boolean RuleZipCode(JsonStructure node) {

        String zipcode = node
                .get("zipcode").value;

        // if zipcode contains only zeros
        if (zipcode.replace("0", "").isEmpty()) {
            bag.add("The zipcode inserted is invalid: " + zipcode);
            return false;
        }

        return true;
    }

    protected boolean RuleDate() {
        return RuleDate(root);
    }

    /**
     * Asserts that the date field in @node is correct.
     * 
     * @param node the JsonStructure which contains the field @date
     * @return true, if date is correct. False, otherwise.
     */
    protected boolean RuleDate(JsonStructure node) {
        
        DateFormat format;
        Date date;

        String token = node
                .get("date")
                .value;
        
        try {
            format = new SimpleDateFormat("MM/dd/yyyy");
            date = format.parse(token);
        } catch (ParseException e) {
            try {
                format = new SimpleDateFormat("dd/MM/yyyy");
                date = format.parse(token);
                
            } catch (ParseException secondE) {
                bag.add("Actual date is in an unknown format or is invalid: " + token + ".");
                return false;
            }
        }
        
        Calendar current = Calendar.getInstance();
        Calendar actual  = Calendar.getInstance();
        actual.setTime(date);
        
        // current date is before date in receipt
        if (current.compareTo(actual) < 0) {
            bag.add("Actual date is after current date. Actual date: " + date
                    + ". Current date: " + new Date());
            return false;
        }
        
        // year differs from more than a 100 years.
        if (current.get(Calendar.YEAR) - actual.get(Calendar.YEAR) >= 100) {
            bag.add("Actual date is way before current date. Actual date's year: " + actual.get(Calendar.YEAR)
                    + ". Current date's year: " + current.get(Calendar.YEAR));
            return false;
        }
        
        // Ok
        return true;
    }
}
