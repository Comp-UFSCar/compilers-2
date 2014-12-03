package infrastructure.exceptions;

/**
 *
 * @author Lucas
 */
public class SemanticException extends RuntimeException {

    public SemanticException() {
        super();
    }

    public SemanticException(String message) {
        super(message);
    }

    public SemanticException(String message, Throwable cause) {
        super(message, cause);
    }
}
