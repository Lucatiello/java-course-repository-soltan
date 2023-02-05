package by.it.academy;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of seconds");
        int input = sc.nextInt();
        int weeks = input / (3600 * 24 * 7);
        int days = input / (3600 * 24) % 7;
        int hours = (input - weeks * 3600 * 24 * 7 - days * 3600 * 24) / 3600;
        int minutes = (input - weeks * 3600 * 24 * 7 - days * 3600 * 24 - hours * 3600) / 60;
        int seconds = input % 60;
        System.out.println("Wow seconds converted to time!" + "\nWeeks = " + weeks + "\nDays = " + days + "\nHours = " + hours + "\nMinutes = " + minutes + "\nSeconds = " + seconds);
    }
}

