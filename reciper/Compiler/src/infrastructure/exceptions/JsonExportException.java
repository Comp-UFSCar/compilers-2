package infrastructure.exceptions;

/**
 *
 * @author Lucas
 */
public class JsonExportException extends RuntimeException {

    public JsonExportException() {
        super();
    }

    public JsonExportException(String message) {
        super(message);
    }

    public JsonExportException(String message, Throwable cause) {
        super(message, cause);
    }
}
