package by.it.academy.hw8;

public class User {
    private final String login;
    private final String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public class Query {
        public void printToLog() {
            System.out.println("User with login " + login + " and password " + password + " sent request");
        }
    }
}




