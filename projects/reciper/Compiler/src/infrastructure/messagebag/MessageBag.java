package infrastructure.messagebag;

import java.util.LinkedList;
import java.util.List;

/**
 * Holds all messages during a program's execution.
 *
 * @author lucasdavid
 *
 */
public class MessageBag {
    
    LinkedList<String> messages;

    public MessageBag() {
        messages = new LinkedList<>();
    }

    /**
     * Add message to message bag.
     *
     * @param message
     * @return this
     */
    public MessageBag add(String message) {
        messages.add(message);
        return this;
    }

    /**
     * Return [index] message in the list.
     * 
     * @param index
     * @return message String
     */
    public String get(int index) {
        return messages.get(index);
    }

    /**
     * Returns the first message inserted in the bag.
     * 
     * @return message String
     */
    public String first() throws IndexOutOfBoundsException {
        return messages.get(0);
    }
    
    public List<String> all() {
        return messages;
    }
    
    public boolean isEmpty() {
        return messages.isEmpty();
    }
}
