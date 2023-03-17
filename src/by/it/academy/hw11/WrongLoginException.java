package by.it.academy.hw11;

public class WrongLoginException extends Exception {
    private final String message;

    public WrongLoginException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
