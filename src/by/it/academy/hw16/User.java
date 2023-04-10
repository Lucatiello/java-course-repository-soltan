package by.it.academy.hw16;

import java.time.LocalDateTime;

public class User {
    private final String login;
    private final String password;
    private final LocalDateTime registrationDate;
    private LocalDateTime lastAuthorizationDate;

    public User(String login, String password, LocalDateTime registrationDate, LocalDateTime lastAuthorizationDate) {
        this.login = login;
        this.password = password;
        this.registrationDate = registrationDate;
        this.lastAuthorizationDate = lastAuthorizationDate;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
    public LocalDateTime getRegistrationDate(){
        return registrationDate;
    }
    public void setLastAuthorizationDate(LocalDateTime lastAuthorizationDate){
        this.lastAuthorizationDate = lastAuthorizationDate;
    }

    @Override
    public String toString() {
        return "User {" +
                "login = '" + login + '\'' +
                ", password = '" + password + '\'' +
                ", registrationDate = " + registrationDate +
                ", lastAuthorizationDate = " + lastAuthorizationDate +
                '}';
    }
}