package by.it.academy.hw11;

public class UserNotExistException extends Exception {
    private final String loginError;

    public UserNotExistException(String message) {
        super(message);
        loginError = message;
    }

    @Override
    public String toString() {
        return "UserNotExistException: " + loginError;
    }
}
