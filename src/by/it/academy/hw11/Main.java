package by.it.academy.hw11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("""
                Hello, choose one of the three options!
                1. SignIn
                2. Login
                3. Exit""");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        List<User> userList = new ArrayList<>();
        userList.add(new User("Richie", "asd260773"));
        userList.add(new User("Graham", "__123__22"));
        UserRepository userRepository = new UserRepository(userList);
        UserRepositoryValidation userRepositoryValidation = new UserRepositoryValidation();

        regAuthorize(choice, userList, userRepository,
                userRepositoryValidation);
    }

    public static void regAuthorize(int choice, List<User> userList, UserRepository userRepository,
                                    UserRepositoryValidation userRepositoryValidation) {
        switch (choice) {
            case 1 -> {
                System.out.println("Enter login:\n");
                Scanner scanner1 = new Scanner(System.in);
                String login = scanner1.next();
                try {
                    userRepositoryValidation.validLogin(login);
                } catch (WrongLoginException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Try again");
                    break;
                }
                System.out.println("Enter password:\n");
                Scanner scanner2 = new Scanner(System.in);
                String password = scanner2.next();
                try {
                    userRepositoryValidation.validPassword(password);
                } catch (WrongPasswordException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Try again");
                    break;
                }
                User user = new User(login, password);
                userList.add(user);
                System.out.println("Registration complete.\n" + "Login: " + user.getLogin() + "\nPassword: "
                        + user.getPassword());
            }
            case 2 -> {
                System.out.println("Enter login:");
                Scanner scanner3 = new Scanner(System.in);
                String login2 = scanner3.next();
                try {
                    userRepositoryValidation.loginExist(userRepository, login2);
                } catch (UserNotExistException ex) {
                    System.out.println(ex.getMessage());
                    System.out.println("Try again");
                    break;
                }
                System.out.println("Enter password:");
                Scanner scanner4 = new Scanner(System.in);
                String password2 = scanner4.next();
                try {
                    userRepositoryValidation.passwordExist(userRepository, password2);
                } catch (WrongPasswordException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Try again");
                    break;
                }
                System.out.println("Authorization complete.\n");
            }
            case 3 -> System.out.println("See you again :)");
        }
    }
}
