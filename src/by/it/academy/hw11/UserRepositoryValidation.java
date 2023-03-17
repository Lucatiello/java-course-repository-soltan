package by.it.academy.hw11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRepositoryValidation {

    public void validLogin(String login) throws WrongLoginException {
        Pattern pattern = Pattern.compile("\\w{5,20}");
        Matcher matcher = pattern.matcher(login);
        if (!matcher.matches()) {
            throw new WrongLoginException("Login does not meet requirements");
        }
    }

    public void validPassword(String password) throws WrongPasswordException {
        Pattern pattern = Pattern.compile("\\w{8,}");
        Matcher matcher = pattern.matcher(password);
        if (!matcher.matches()) {
            throw new WrongPasswordException("Password does not meet requirements");
        }
    }

    public void loginExist(UserRepository userRepository, String login) throws UserNotExistException {
        for (User userTest : userRepository.getUserList()) {

            if (!userTest.getLogin().contains(login)) {
                throw new UserNotExistException("User with this login does not exist");
            }
        }
    }

    public void passwordExist(UserRepository userRepository, String password) throws WrongPasswordException {
        for (User userTest : userRepository.getUserList()) {
            if (!userTest.getPassword().contains(password)) {
                throw new WrongPasswordException("Password entered incorrectly");
            }
        }
    }
}
