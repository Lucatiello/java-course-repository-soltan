package by.it.academy.hw3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = sc.nextInt();
        System.out.println("Enter second number");
        int number2 = sc.nextInt();
        int multiplication = number1 * number2;
        System.out.println("Answer the question: What will be the multiplication of numbers");
        int userNum = sc.nextInt();
        if (userNum == multiplication) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! Correct answer is " + multiplication);
        }
    }
}
