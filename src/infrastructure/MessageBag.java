package infrastructure;

import java.util.LinkedList;

/**
 * Holds all messages during the program execution.
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
}
