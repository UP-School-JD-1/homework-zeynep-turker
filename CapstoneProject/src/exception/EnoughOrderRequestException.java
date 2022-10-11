package exception;

public class EnoughOrderRequestException extends Exception {
    public EnoughOrderRequestException(String message) {
        super(message);
    }
}
