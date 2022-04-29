package ro.unibuc.pao.exceptions.types;

/**
 * It is a good implementation practice that any class that extends any exception type, calls, as part of its constructor(s),
 * the parent constructor with the message argument for new exceptions or the one with the message and cause for exceptions
 * that wrap other exception (eg: throw a custom exception if a database query cannot be executed and throws an SQL exception)
 */
public class CustomRuntimeException extends RuntimeException {

    public CustomRuntimeException(String message) {
        super(message);
    }

    public CustomRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
