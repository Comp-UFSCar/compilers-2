package infrastructure.exceptions;

/**
 *
 * @author Lucas
 */
public class LexicalException extends RuntimeException {

    public LexicalException() {
        super();
    }

    public LexicalException(String message) {
        super(message);
    }

    public LexicalException(String message, Throwable cause) {
        super(message, cause);
    }
}
