package translator.infrastructure.exception;

/**
 *
 * @author Lucas
 */
public class TranslationException extends RuntimeException {

    public TranslationException() {
        super();
    }

    public TranslationException(String message) {
        super(message);
    }

    public TranslationException(String message, Throwable cause) {
        super(message, cause);
    }
}
