package by.it.academy.hw11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRepositoryService {
    private final UserRepository userRepository;

    public UserRepositoryService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

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
    public void checkUserNotExist(String login) throws UserNotExistException{
        if (userRepository.existUserByLogin(login)){
            throw new UserNotExistException("User not exist with login: " + login);
        }
    }

    public void loginAndPasswordExist(String login, String password) throws UserNotExistException {
        if (!(userRepository.existUserByLoginAndPassword(login, password))) {
            throw new UserNotExistException("User not found");
        }
    }
    public void createUser(String login, String password) throws Exception{
        validLogin(login);
        checkUserNotExist(login);
        validPassword(password);

        User user = new User(login, password);
        userRepository.addUser(user);
    }
}

