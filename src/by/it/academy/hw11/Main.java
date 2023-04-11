package by.it.academy.hw11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String login;
        String password;
        UserRepository userRepository = new UserRepository();
        UserRepositoryService userRepositoryValidation = new UserRepositoryService(userRepository);
        while (true) {
            printMenu();
            int selectNumberMenu = Integer.parseInt(input());
            switch (selectNumberMenu) {
                case 1 -> {
                    System.out.println("Enter login");
                    login = input();
                    System.out.println("Enter password");
                    password = input();
                    userRepositoryValidation.loginAndPasswordExist(login, password);
                }
                case 2 -> {
                    System.out.println("Login to create a new account");
                    login = input();
                    System.out.println("Enter password");
                    password = input();
                    userRepositoryValidation.createUser(login, password);
                }
                case 3 -> {
                    System.out.println("Goodbye");
                    System.exit(0);
                }
            }
        }
    }

    public static void printMenu() {
        System.out.println("Menu");
        System.out.println("Press 1 to Login;\nPress 2 to Register;\nPress 3 to exit system");
    }

    public static String input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}