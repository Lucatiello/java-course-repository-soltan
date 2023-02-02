package by.it.academy;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println(SumPlusMultiplication(a, b));
    }

    static int SumPlusMultiplication(int a, int b) {
        return (a + b) + (a * b);
    }
}

