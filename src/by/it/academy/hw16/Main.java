package by.it.academy.hw16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String login;
        String password;
        LocalDateTime dateStart;
        LocalDateTime dateEnd;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
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
                    LocalDateTime registrationDate = LocalDateTime.now();
                    userRepositoryValidation.createUser(login, password, registrationDate, registrationDate);
                }
                case 3 -> {
                    System.out.println("Enter time period");
                    System.out.println("Format like: yyyy-MM-dd HH:mm\nStart period");
                    dateStart = LocalDateTime.parse(input(), format);
                    System.out.println("End period");
                    dateEnd = LocalDateTime.parse(input(), format);
                    List<User> userList = userRepositoryValidation.findUserForACertainPeriod(dateStart, dateEnd);
                    System.out.println(userList);
                }
                case 4 -> {
                    System.out.println("Goodbye");
                    System.exit(0);
                }
            }
        }
    }

    public static void printMenu() {
        System.out.println("Menu");
        System.out.println("Press 1 to Login;\nPress 2 to Register;\nPress 3 to print to the console all users registered during a specified period.\nPress 4 to exit system");
    }

    public static String input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
