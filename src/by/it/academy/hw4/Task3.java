package by.it.academy.hw4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter an integer natural number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        long num2 = 1;
        for (int i = num1; i > 0; i--) {
            num2 *= i;
        }
        System.out.println("Factorial of a number " + num1 + " is " + num2);
    }
}

