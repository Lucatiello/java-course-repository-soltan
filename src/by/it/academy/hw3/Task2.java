package by.it.academy.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an odd positive or even negative number");
        int number = sc.nextInt();
        if (number < 0 && number % 2 == 0) {
            System.out.println("Even negative number");
        } else if (number > 0 && number % 2 != 0) {
            System.out.println("Odd positive number");
        }
    }
}
