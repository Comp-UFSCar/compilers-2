package infrastructure;

import infrastructure.messagebag.MessageBag;
import java.util.List;

/**
 *
 * @author Lucas
 */
public abstract class BaseListener {
    
    MessageBag bag;

    public BaseListener(MessageBag bag) {
        this.bag = bag;
    }
    
    public boolean hasErrors() {
        return !bag.isEmpty();
    }
    
    public List<String> errors() {
        return bag.all();
    }
}
