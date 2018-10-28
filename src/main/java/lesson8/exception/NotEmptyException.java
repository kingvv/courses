package lesson8.exception;

public class NotEmptyException extends RuntimeException {

    private String message;

    public NotEmptyException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}


