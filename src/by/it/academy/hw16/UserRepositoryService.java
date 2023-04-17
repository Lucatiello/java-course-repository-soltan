package by.it.academy.hw16;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
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

    public void checkUserNotExist(String login) throws UserNotExistException {
        if (userRepository.existUserByLogin(login)) {
            throw new UserNotExistException("User not exist with login: " + login);
        }
    }

    public void loginAndPasswordExist(String login, String password) throws UserNotExistException {
        if (userRepository.existUserByLoginAndPassword(login, password)) {
            LocalDateTime lastAuthorizationDate = LocalDateTime.now();
            User user = userRepository.getUser(login, password);
            user.setLastAuthorizationDate(lastAuthorizationDate);
        } else {
            throw new UserNotExistException("User not found with login: " + login);
        }
    }


    public void createUser(String login, String password, LocalDateTime registrationDate, LocalDateTime lastAuthorizationDate) throws Exception {
        validLogin(login);
        checkUserNotExist(login);
        validPassword(password);
        User user = new User(login, password, registrationDate, lastAuthorizationDate);
        userRepository.addUser(user);
    }

    public List<User> findUserForACertainPeriod(LocalDateTime dateStart, LocalDateTime dateEnd) {
        List<User> applyUsers = new ArrayList<>();
        List<User> users = userRepository.userList();
        for (User user : users) {
            if (user.getRegistrationDate().isAfter(dateStart) && user.getRegistrationDate().isBefore(dateEnd)) {
                applyUsers.add(user);
            }
        }
        return applyUsers;
    }
}
