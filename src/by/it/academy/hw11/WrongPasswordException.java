package by.it.academy.hw11;

public class WrongPasswordException extends Exception {
    private final String passwordError;

    public WrongPasswordException(String message) {
        super(message);
        passwordError = message;
    }

    @Override
    public String toString() {
        return "WrongPasswordException: " + passwordError;
    }
}
