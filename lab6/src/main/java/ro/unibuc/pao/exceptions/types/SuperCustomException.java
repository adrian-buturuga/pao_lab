package ro.unibuc.pao.exceptions.types;

public class SuperCustomException extends CustomException {

    public SuperCustomException(String message) {
        super(message);
    }

    public SuperCustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
