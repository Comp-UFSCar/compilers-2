package infrastructure.exceptions;

/**
 *
 * @author Lucas
 */
public class SyntacticalException extends RuntimeException {

    public SyntacticalException() {
        super();
    }

    public SyntacticalException(String message) {
        super(message);
    }

    public SyntacticalException(String message, Throwable cause) {
        super(message, cause);
    }
}
